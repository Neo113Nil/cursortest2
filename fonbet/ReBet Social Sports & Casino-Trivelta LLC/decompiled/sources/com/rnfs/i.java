package com.rnfs;

import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.rnfs.g;
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

/* loaded from: classes4.dex */
public class i extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public g f41475a;

    /* renamed from: b, reason: collision with root package name */
    public h f41476b;

    /* renamed from: c, reason: collision with root package name */
    public AtomicBoolean f41477c = new AtomicBoolean(false);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                i iVar = i.this;
                iVar.g(iVar.f41475a, i.this.f41476b);
                i.this.f41475a.f41468g.a(i.this.f41476b);
            } catch (Exception e10) {
                i.this.f41476b.f41473c = e10;
                i.this.f41475a.f41468g.a(i.this.f41476b);
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h doInBackground(g... gVarArr) {
        this.f41475a = gVarArr[0];
        this.f41476b = new h();
        new Thread(new a()).start();
        return this.f41476b;
    }

    public String e(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase()) : null;
        return mimeTypeFromExtension == null ? "*/*" : mimeTypeFromExtension;
    }

    public void f() {
        this.f41477c.set(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(g gVar, h hVar) {
        DataOutputStream dataOutputStream;
        BufferedInputStream bufferedInputStream;
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection;
        Object[] array;
        HttpURLConnection httpURLConnection2;
        String str;
        boolean z10;
        String[] strArr;
        Iterator it;
        String str2;
        int i10;
        String str3;
        long j10;
        long j11;
        HttpURLConnection httpURLConnection3;
        int i11;
        long j12;
        String string;
        String string2;
        String e10;
        String str4 = "filename";
        String str5 = "name";
        String str6 = "\r\n--*****--\r\n";
        try {
            array = gVar.f41463b.toArray();
            boolean z11 = gVar.f41464c;
            httpURLConnection2 = (HttpURLConnection) gVar.f41462a.openConnection();
            boolean z12 = true;
            try {
                httpURLConnection2.setDoOutput(true);
                ReadableMapKeySetIterator keySetIterator = gVar.f41465d.keySetIterator();
                httpURLConnection2.setRequestMethod(gVar.f41467f);
                if (!z11) {
                    httpURLConnection2.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
                }
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    httpURLConnection2.setRequestProperty(nextKey, gVar.f41465d.getString(nextKey));
                }
                ReadableMapKeySetIterator keySetIterator2 = gVar.f41466e.keySetIterator();
                String str7 = "";
                while (true) {
                    boolean z13 = z12;
                    ReadableMapKeySetIterator readableMapKeySetIterator = keySetIterator2;
                    if (!keySetIterator2.hasNextKey()) {
                        break;
                    }
                    String nextKey2 = readableMapKeySetIterator.nextKey();
                    boolean z14 = z11;
                    str7 = str7 + "--*****\r\nContent-Disposition: form-data; name=\"" + nextKey2 + "\"\r\n\r\n" + gVar.f41466e.getString(nextKey2) + "\r\n";
                    z12 = z13;
                    keySetIterator2 = readableMapKeySetIterator;
                    z11 = z14;
                    str6 = str6;
                }
                str = str6;
                z10 = z11;
                strArr = new String[array.length];
                it = gVar.f41463b.iterator();
                str2 = "" + str7;
                i10 = 0;
                str3 = str7;
                j10 = 0;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
            bufferedInputStream = null;
            bufferedReader = null;
            httpURLConnection = null;
        }
        while (true) {
            j11 = j10;
            if (!it.hasNext()) {
                break;
            }
            try {
                ReadableMap readableMap = (ReadableMap) it.next();
                try {
                    string = readableMap.getString(str5);
                    string2 = readableMap.getString(str4);
                    e10 = readableMap.getString("filetype");
                } catch (NoSuchKeyException unused) {
                    string = readableMap.getString(str5);
                    string2 = readableMap.getString(str4);
                    e10 = e(readableMap.getString("filepath"));
                }
                String str8 = string;
                String str9 = str4;
                String str10 = string2;
                String str11 = str5;
                httpURLConnection3 = httpURLConnection2;
                try {
                    long length = new File(readableMap.getString("filepath")).length();
                    long j13 = j11 + length;
                    if (!z10) {
                        String str12 = "--*****\r\nContent-Disposition: form-data; name=\"" + str8 + "\"; filename=\"" + str10 + "\"\r\nContent-Type: " + e10 + "\r\n";
                        if (array.length - 1 == i10) {
                            j13 += str.length();
                        }
                        String str13 = "Content-length: " + length + "\r\n";
                        strArr[i10] = str12 + str13 + "\r\n";
                        str2 = str2 + str12 + str13 + "\r\n";
                    }
                    j10 = j13;
                    i10++;
                    str4 = str9;
                    str5 = str11;
                    httpURLConnection2 = httpURLConnection3;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection3 = httpURLConnection2;
            }
            th = th4;
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
            g.a aVar = this.f41475a.f41470i;
            if (aVar != null) {
                aVar.a();
            }
            if (z10) {
                httpURLConnection2 = httpURLConnection3;
            } else {
                long length2 = j11 + str2.length() + (array.length * 2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                int i12 = (int) length2;
                sb2.append(i12);
                httpURLConnection2 = httpURLConnection3;
                httpURLConnection2.setRequestProperty("Content-length", sb2.toString());
                httpURLConnection2.setFixedLengthStreamingMode(i12);
            }
            httpURLConnection2.connect();
            dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
            try {
                WritableByteChannel newChannel = Channels.newChannel(dataOutputStream);
                if (!z10) {
                    dataOutputStream.writeBytes(str3);
                }
                Iterator it2 = gVar.f41463b.iterator();
                int i13 = 0;
                int i14 = 0;
                while (it2.hasNext()) {
                    ReadableMap readableMap2 = (ReadableMap) it2.next();
                    if (!z10) {
                        dataOutputStream.writeBytes(strArr[i13]);
                    }
                    File file = new File(readableMap2.getString("filepath"));
                    long length3 = file.length();
                    long ceil = (long) Math.ceil(length3 / 100.0f);
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileChannel channel = fileInputStream.getChannel();
                    long j14 = 0;
                    while (j14 < length3) {
                        long j15 = ceil;
                        long transferTo = channel.transferTo(j14, j15, newChannel);
                        j14 += transferTo;
                        g.c cVar = this.f41475a.f41469h;
                        if (cVar != null) {
                            i11 = i13;
                            int i15 = (int) (i14 + transferTo);
                            j12 = j11;
                            cVar.a((int) j12, i15);
                            i14 = i15;
                        } else {
                            i11 = i13;
                            j12 = j11;
                        }
                        i13 = i11;
                        j11 = j12;
                        ceil = j15;
                    }
                    int i16 = i13;
                    long j16 = j11;
                    if (!z10) {
                        dataOutputStream.writeBytes("\r\n");
                    }
                    i13 = i16 + 1;
                    fileInputStream.close();
                    j11 = j16;
                }
                if (!z10) {
                    dataOutputStream.writeBytes(str);
                }
                dataOutputStream.flush();
                dataOutputStream.close();
                bufferedInputStream = new BufferedInputStream(httpURLConnection2.getInputStream());
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
                    try {
                        WritableMap createMap = Arguments.createMap();
                        for (Map.Entry<String, List<String>> entry : httpURLConnection2.getHeaderFields().entrySet()) {
                            createMap.putString(entry.getKey(), entry.getValue().get(0));
                        }
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                String sb4 = sb3.toString();
                                int responseCode = httpURLConnection2.getResponseCode();
                                h hVar2 = this.f41476b;
                                hVar2.f41472b = createMap;
                                hVar2.f41474d = sb4;
                                hVar2.f41471a = responseCode;
                                httpURLConnection2.disconnect();
                                dataOutputStream.close();
                                bufferedInputStream.close();
                                bufferedReader.close();
                                return;
                            }
                            sb3.append(readLine);
                            sb3.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
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
                httpURLConnection = httpURLConnection2;
            }
        } catch (Throwable th9) {
            th = th9;
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
}
