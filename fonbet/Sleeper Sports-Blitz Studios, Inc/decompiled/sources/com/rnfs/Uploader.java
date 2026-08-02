package com.rnfs;

import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.io.IOUtils;

/* loaded from: classes8.dex */
public class Uploader extends AsyncTask<UploadParams, int[], UploadResult> {
    private AtomicBoolean mAbort = new AtomicBoolean(false);
    private UploadParams mParams;
    private UploadResult res;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public UploadResult doInBackground(UploadParams... uploadParamsArr) {
        this.mParams = uploadParamsArr[0];
        this.res = new UploadResult();
        new Thread(new Runnable() { // from class: com.rnfs.Uploader.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Uploader uploader = Uploader.this;
                    uploader.upload(uploader.mParams, Uploader.this.res);
                    Uploader.this.mParams.onUploadComplete.onUploadComplete(Uploader.this.res);
                } catch (Exception e) {
                    Uploader.this.res.exception = e;
                    Uploader.this.mParams.onUploadComplete.onUploadComplete(Uploader.this.res);
                }
            }
        }).start();
        return this.res;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0332  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void upload(UploadParams uploadParams, UploadResult uploadResult) throws Exception {
        DataOutputStream dataOutputStream;
        BufferedInputStream bufferedInputStream;
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Object[] array;
        HttpURLConnection httpURLConnection2;
        boolean z;
        String[] strArr;
        Iterator<ReadableMap> it;
        String str;
        int i;
        String str2;
        long j;
        long j2;
        HttpURLConnection httpURLConnection3;
        int i2;
        long j3;
        String string;
        String string2;
        String mimeType;
        String str3 = "filename";
        String str4 = "name";
        try {
            array = uploadParams.files.toArray();
            boolean z2 = uploadParams.binaryStreamOnly;
            httpURLConnection2 = (HttpURLConnection) uploadParams.src.openConnection();
            boolean z3 = true;
            try {
                httpURLConnection2.setDoOutput(true);
                ReadableMapKeySetIterator keySetIterator = uploadParams.headers.keySetIterator();
                httpURLConnection2.setRequestMethod(uploadParams.method);
                if (!z2) {
                    httpURLConnection2.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
                }
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    httpURLConnection2.setRequestProperty(nextKey, uploadParams.headers.getString(nextKey));
                }
                ReadableMapKeySetIterator keySetIterator2 = uploadParams.fields.keySetIterator();
                String str5 = "";
                while (true) {
                    boolean z4 = z3;
                    if (!keySetIterator2.hasNextKey()) {
                        break;
                    }
                    String nextKey2 = keySetIterator2.nextKey();
                    boolean z5 = z2;
                    str5 = str5 + "--*****" + IOUtils.LINE_SEPARATOR_WINDOWS + "Content-Disposition: form-data; name=\"" + nextKey2 + "\"" + IOUtils.LINE_SEPARATOR_WINDOWS + IOUtils.LINE_SEPARATOR_WINDOWS + uploadParams.fields.getString(nextKey2) + IOUtils.LINE_SEPARATOR_WINDOWS;
                    z3 = z4;
                    z2 = z5;
                    keySetIterator2 = keySetIterator2;
                }
                z = z2;
                strArr = new String[array.length];
                it = uploadParams.files.iterator();
                str = "" + str5;
                i = 0;
                str2 = str5;
                j = 0;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
            bufferedInputStream = null;
            httpURLConnection = null;
        }
        while (true) {
            j2 = j;
            if (!it.hasNext()) {
                break;
            }
            try {
                ReadableMap next = it.next();
                try {
                    string = next.getString(str4);
                    string2 = next.getString(str3);
                    mimeType = next.getString("filetype");
                } catch (NoSuchKeyException unused) {
                    string = next.getString(str4);
                    string2 = next.getString(str3);
                    mimeType = getMimeType(next.getString("filepath"));
                }
                String str6 = string;
                String str7 = str3;
                String str8 = string2;
                String str9 = str4;
                httpURLConnection3 = httpURLConnection2;
                try {
                    long length = new File(next.getString("filepath")).length();
                    long j4 = j2 + length;
                    if (!z) {
                        String str10 = "--*****" + IOUtils.LINE_SEPARATOR_WINDOWS + "Content-Disposition: form-data; name=\"" + str6 + "\"; filename=\"" + str8 + "\"" + IOUtils.LINE_SEPARATOR_WINDOWS + "Content-Type: " + mimeType + IOUtils.LINE_SEPARATOR_WINDOWS;
                        if (array.length - 1 == i) {
                            j4 += "\r\n--*****--\r\n".length();
                        }
                        String str11 = "Content-length: " + length + IOUtils.LINE_SEPARATOR_WINDOWS;
                        strArr[i] = str10 + str11 + IOUtils.LINE_SEPARATOR_WINDOWS;
                        str = str + str10 + str11 + IOUtils.LINE_SEPARATOR_WINDOWS;
                    }
                    j = j4;
                    i++;
                    str3 = str7;
                    str4 = str9;
                    httpURLConnection2 = httpURLConnection3;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection3 = httpURLConnection2;
            }
            th = th3;
            httpURLConnection = httpURLConnection3;
            dataOutputStream = null;
            bufferedInputStream = null;
            bufferedReader = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
        httpURLConnection3 = httpURLConnection2;
        try {
            if (this.mParams.onUploadBegin != null) {
                this.mParams.onUploadBegin.onUploadBegin();
            }
            if (z) {
                httpURLConnection2 = httpURLConnection3;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                int length2 = (int) (j2 + str.length() + (array.length * 2));
                sb.append(length2);
                httpURLConnection2 = httpURLConnection3;
                httpURLConnection2.setRequestProperty("Content-length", sb.toString());
                httpURLConnection2.setFixedLengthStreamingMode(length2);
            }
            httpURLConnection2.connect();
            dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
            try {
                WritableByteChannel newChannel = Channels.newChannel(dataOutputStream);
                if (!z) {
                    dataOutputStream.writeBytes(str2);
                }
                Iterator<ReadableMap> it2 = uploadParams.files.iterator();
                int i3 = 0;
                int i4 = 0;
                while (it2.hasNext()) {
                    ReadableMap next2 = it2.next();
                    if (!z) {
                        dataOutputStream.writeBytes(strArr[i3]);
                    }
                    File file = new File(next2.getString("filepath"));
                    long length3 = file.length();
                    long ceil = (long) Math.ceil(length3 / 100.0f);
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileChannel channel = fileInputStream.getChannel();
                    long j5 = 0;
                    while (j5 < length3) {
                        long j6 = ceil;
                        long transferTo = channel.transferTo(j5, j6, newChannel);
                        j5 += transferTo;
                        if (this.mParams.onUploadProgress != null) {
                            i2 = i3;
                            int i5 = (int) (i4 + transferTo);
                            j3 = j2;
                            this.mParams.onUploadProgress.onUploadProgress((int) j3, i5);
                            i4 = i5;
                        } else {
                            i2 = i3;
                            j3 = j2;
                        }
                        i3 = i2;
                        j2 = j3;
                        ceil = j6;
                    }
                    int i6 = i3;
                    long j7 = j2;
                    if (!z) {
                        dataOutputStream.writeBytes(IOUtils.LINE_SEPARATOR_WINDOWS);
                    }
                    i3 = i6 + 1;
                    fileInputStream.close();
                    j2 = j7;
                }
                if (!z) {
                    dataOutputStream.writeBytes("\r\n--*****--\r\n");
                }
                dataOutputStream.flush();
                dataOutputStream.close();
                bufferedInputStream = new BufferedInputStream(httpURLConnection2.getInputStream());
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(bufferedInputStream));
                    try {
                        WritableMap createMap = Arguments.createMap();
                        for (Map.Entry<String, List<String>> entry : httpURLConnection2.getHeaderFields().entrySet()) {
                            createMap.putString(entry.getKey(), entry.getValue().get(0));
                        }
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                            sb2.append("\n");
                        }
                        String sb3 = sb2.toString();
                        int responseCode = httpURLConnection2.getResponseCode();
                        this.res.headers = createMap;
                        this.res.body = sb3;
                        this.res.statusCode = responseCode;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        dataOutputStream.close();
                        bufferedInputStream.close();
                        bufferedReader2.close();
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedReader = bufferedReader2;
                        httpURLConnection = httpURLConnection2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    httpURLConnection = httpURLConnection2;
                }
            } catch (Throwable th7) {
                th = th7;
                httpURLConnection = httpURLConnection2;
            }
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection2 = httpURLConnection3;
            httpURLConnection = httpURLConnection2;
            dataOutputStream = null;
            bufferedInputStream = null;
            bufferedReader = null;
            if (httpURLConnection != null) {
            }
            if (dataOutputStream != null) {
            }
            if (bufferedInputStream != null) {
            }
            if (bufferedReader != null) {
            }
            throw th;
        }
    }

    protected String getMimeType(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase()) : null;
        return mimeTypeFromExtension == null ? ApiConstant.ALL_MEDIA_TYPE : mimeTypeFromExtension;
    }

    protected void stop() {
        this.mAbort.set(true);
    }
}
