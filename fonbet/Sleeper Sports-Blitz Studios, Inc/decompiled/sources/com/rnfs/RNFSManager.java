package com.rnfs;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.SparseArray;
import androidx.work.Data;
import com.facebook.GraphRequest;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.rnfs.DownloadParams;
import com.rnfs.UploadParams;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

@ReactModule(name = RNFSManager.MODULE_NAME)
/* loaded from: classes8.dex */
public class RNFSManager extends ReactContextBaseJavaModule {
    static final String MODULE_NAME = "RNFSManager";
    private static final String RNFSCachesDirectoryPath = "RNFSCachesDirectoryPath";
    private static final String RNFSDocumentDirectory = "RNFSDocumentDirectory";
    private static final String RNFSDocumentDirectoryPath = "RNFSDocumentDirectoryPath";
    private static final String RNFSDownloadDirectoryPath = "RNFSDownloadDirectoryPath";
    private static final String RNFSExternalCachesDirectoryPath = "RNFSExternalCachesDirectoryPath";
    private static final String RNFSExternalDirectoryPath = "RNFSExternalDirectoryPath";
    private static final String RNFSExternalStorageDirectoryPath = "RNFSExternalStorageDirectoryPath";
    private static final String RNFSFileTypeDirectory = "RNFSFileTypeDirectory";
    private static final String RNFSFileTypeRegular = "RNFSFileTypeRegular";
    private static final String RNFSPicturesDirectoryPath = "RNFSPicturesDirectoryPath";
    private static final String RNFSTemporaryDirectoryPath = "RNFSTemporaryDirectoryPath";
    private SparseArray<Downloader> downloaders;
    private ReactApplicationContext reactContext;
    private SparseArray<Uploader> uploaders;

    @ReactMethod
    public void pathForBundle(String str, Promise promise) {
    }

    @ReactMethod
    public void pathForGroup(String str, Promise promise) {
    }

    public RNFSManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.downloaders = new SparseArray<>();
        this.uploaders = new SparseArray<>();
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    private Uri getFileUri(String str, boolean z) throws IORejectionException {
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null) {
            return parse;
        }
        File file = new File(str);
        if (!z && file.isDirectory()) {
            throw new IORejectionException("EISDIR", "EISDIR: illegal operation on a directory, read '" + str + "'");
        }
        return Uri.parse("file://" + str);
    }

    private String getOriginalFilepath(String str, boolean z) throws IORejectionException {
        Uri fileUri = getFileUri(str, z);
        if (fileUri.getScheme().equals("content")) {
            try {
                Cursor query = this.reactContext.getContentResolver().query(fileUri, null, null, null, null);
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
                query.close();
            } catch (IllegalArgumentException unused) {
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream getInputStream(String str) throws IORejectionException {
        try {
            InputStream openInputStream = this.reactContext.getContentResolver().openInputStream(getFileUri(str, false));
            if (openInputStream != null) {
                return openInputStream;
            }
            throw new IORejectionException("ENOENT", "ENOENT: could not open an input stream for '" + str + "'");
        } catch (FileNotFoundException e) {
            throw new IORejectionException("ENOENT", "ENOENT: " + e.getMessage() + ", open '" + str + "'");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OutputStream getOutputStream(String str, boolean z) throws IORejectionException {
        try {
            OutputStream openOutputStream = this.reactContext.getContentResolver().openOutputStream(getFileUri(str, false), z ? "wa" : "w");
            if (openOutputStream != null) {
                return openOutputStream;
            }
            throw new IORejectionException("ENOENT", "ENOENT: could not open an output stream for '" + str + "'");
        } catch (FileNotFoundException e) {
            throw new IORejectionException("ENOENT", "ENOENT: " + e.getMessage() + ", open '" + str + "'");
        }
    }

    private static byte[] getInputStreamBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @ReactMethod
    public void writeFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, false);
            outputStream.write(decode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void appendFile(String str, String str2, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, true);
            outputStream.write(decode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void write(String str, String str2, int i, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            if (i < 0) {
                OutputStream outputStream = getOutputStream(str, true);
                outputStream.write(decode);
                outputStream.close();
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                randomAccessFile.seek(i);
                randomAccessFile.write(decode);
                randomAccessFile.close();
            }
            promise.resolve(null);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void exists(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).exists()));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void readFile(String str, Promise promise) {
        try {
            promise.resolve(Base64.encodeToString(getInputStreamBytes(getInputStream(str)), 2));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void read(String str, int i, int i2, Promise promise) {
        try {
            InputStream inputStream = getInputStream(str);
            byte[] bArr = new byte[i];
            inputStream.skip(i2);
            promise.resolve(Base64.encodeToString(bArr, 0, inputStream.read(bArr, 0, i), 2));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void readFileAssets(String str, Promise promise) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = getReactApplicationContext().getAssets().open(str, 0);
                    if (inputStream == null) {
                        reject(promise, str, new Exception("Failed to open file"));
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                    } else {
                        byte[] bArr = new byte[inputStream.available()];
                        inputStream.read(bArr);
                        promise.resolve(Base64.encodeToString(bArr, 2));
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    reject(promise, str, e);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    @ReactMethod
    public void readFileRes(String str, Promise promise) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = getReactApplicationContext().getResources().openRawResource(getResIdentifier(str));
                    if (inputStream == null) {
                        reject(promise, str, new Exception("Failed to open file"));
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                    } else {
                        byte[] bArr = new byte[inputStream.available()];
                        inputStream.read(bArr);
                        promise.resolve(Base64.encodeToString(bArr, 2));
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    reject(promise, str, e);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    private int getResIdentifier(String str) {
        boolean z = true;
        String substring = str.substring(str.lastIndexOf(".") + 1);
        String substring2 = str.substring(0, str.lastIndexOf("."));
        if (!substring.equals("png") && !substring.equals("jpg") && !substring.equals("jpeg") && !substring.equals("bmp") && !substring.equals("gif") && !substring.equals("webp") && !substring.equals("psd") && !substring.equals("svg") && !substring.equals("tiff")) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        Resources resources = getReactApplicationContext().getResources();
        valueOf.getClass();
        return resources.getIdentifier(substring2, z ? "drawable" : "raw", getReactApplicationContext().getPackageName());
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        int i;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("md5", MessageDigestAlgorithms.MD5);
            hashMap.put("sha1", MessageDigestAlgorithms.SHA_1);
            hashMap.put("sha224", MessageDigestAlgorithms.SHA_224);
            hashMap.put("sha256", MessageDigestAlgorithms.SHA_256);
            hashMap.put("sha384", MessageDigestAlgorithms.SHA_384);
            hashMap.put("sha512", MessageDigestAlgorithms.SHA_512);
            if (!hashMap.containsKey(str2)) {
                throw new Exception("Invalid hash algorithm");
            }
            File file = new File(str);
            if (file.isDirectory()) {
                rejectFileIsDirectory(promise);
                return;
            }
            if (!file.exists()) {
                rejectFileNotFound(promise, str);
                return;
            }
            MessageDigest messageDigest = MessageDigest.getInstance((String) hashMap.get(str2));
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[Data.MAX_DATA_BYTES];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    messageDigest.update(bArr, 0, read);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest.digest()) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            promise.resolve(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.rnfs.RNFSManager$1] */
    @ReactMethod
    public void moveFile(final String str, String str2, ReadableMap readableMap, final Promise promise) {
        try {
            final File file = new File(str);
            if (!file.renameTo(new File(str2))) {
                new CopyFileTask() { // from class: com.rnfs.RNFSManager.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    public void onPostExecute(Exception exc) {
                        if (exc == null) {
                            file.delete();
                            promise.resolve(true);
                        } else {
                            exc.printStackTrace();
                            RNFSManager.this.reject(promise, str, exc);
                        }
                    }
                }.execute(new String[]{str, str2});
            } else {
                promise.resolve(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.rnfs.RNFSManager$2] */
    @ReactMethod
    public void copyFile(final String str, String str2, ReadableMap readableMap, final Promise promise) {
        new CopyFileTask() { // from class: com.rnfs.RNFSManager.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(Exception exc) {
                if (exc == null) {
                    promise.resolve(null);
                } else {
                    exc.printStackTrace();
                    RNFSManager.this.reject(promise, str, exc);
                }
            }
        }.execute(new String[]{str, str2});
    }

    private class CopyFileTask extends AsyncTask<String, Void, Exception> {
        private CopyFileTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Exception doInBackground(String... strArr) {
            try {
                String str = strArr[0];
                String str2 = strArr[1];
                InputStream inputStream = RNFSManager.this.getInputStream(str);
                OutputStream outputStream = RNFSManager.this.getOutputStream(str2, false);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        Thread.yield();
                    } else {
                        inputStream.close();
                        outputStream.close();
                        return null;
                    }
                }
            } catch (Exception e) {
                return e;
            }
        }
    }

    @ReactMethod
    public void readDir(String str, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("Folder does not exist");
            }
            File[] listFiles = file.listFiles();
            WritableArray createArray = Arguments.createArray();
            for (File file2 : listFiles) {
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble("mtime", file2.lastModified() / 1000.0d);
                createMap.putString("name", file2.getName());
                createMap.putString("path", file2.getAbsolutePath());
                createMap.putDouble(RRWebVideoEvent.JsonKeys.SIZE, file2.length());
                createMap.putInt("type", file2.isDirectory() ? 1 : 0);
                createArray.pushMap(createMap);
            }
            promise.resolve(createArray);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void readDirAssets(String str, Promise promise) {
        int i;
        try {
            AssetManager assets = getReactApplicationContext().getAssets();
            String[] list = assets.list(str);
            WritableArray createArray = Arguments.createArray();
            for (String str2 : list) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("name", str2);
                if (!str.isEmpty()) {
                    str2 = String.format("%s/%s", str, str2);
                }
                createMap.putString("path", str2);
                int i2 = 1;
                try {
                    AssetFileDescriptor openFd = assets.openFd(str2);
                    if (openFd != null) {
                        i = (int) openFd.getLength();
                        try {
                            openFd.close();
                            i2 = 0;
                        } catch (IOException e) {
                            e = e;
                            i2 = 1 ^ (e.getMessage().contains("compressed") ? 1 : 0);
                            createMap.putInt(RRWebVideoEvent.JsonKeys.SIZE, i);
                            createMap.putInt("type", i2);
                            createArray.pushMap(createMap);
                        }
                    } else {
                        i = 0;
                    }
                } catch (IOException e2) {
                    e = e2;
                    i = 0;
                }
                createMap.putInt(RRWebVideoEvent.JsonKeys.SIZE, i);
                createMap.putInt("type", i2);
                createArray.pushMap(createMap);
            }
            promise.resolve(createArray);
        } catch (IOException e3) {
            reject(promise, str, e3);
        }
    }

    @ReactMethod
    public void copyFileAssets(String str, String str2, Promise promise) {
        try {
            copyInputStream(getReactApplicationContext().getAssets().open(str), str, str2, promise);
        } catch (IOException unused) {
            reject(promise, str, new Exception(String.format("Asset '%s' could not be opened", str)));
        }
    }

    @ReactMethod
    public void copyFileRes(String str, String str2, Promise promise) {
        try {
            copyInputStream(getReactApplicationContext().getResources().openRawResource(getResIdentifier(str)), str, str2, promise);
        } catch (Exception unused) {
            reject(promise, str, new Exception(String.format("Res '%s' could not be opened", str)));
        }
    }

    @ReactMethod
    public void existsAssets(String str, Promise promise) {
        try {
            AssetManager assets = getReactApplicationContext().getAssets();
            try {
                String[] list = assets.list(str);
                if (list != null && list.length > 0) {
                    promise.resolve(true);
                    return;
                }
            } catch (Exception unused) {
            }
            InputStream inputStream = null;
            try {
                try {
                    inputStream = assets.open(str);
                    promise.resolve(true);
                    if (inputStream == null) {
                        return;
                    }
                } catch (Exception unused2) {
                    promise.resolve(false);
                    if (inputStream == null) {
                        return;
                    }
                }
                try {
                    inputStream.close();
                } catch (Exception unused3) {
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void existsRes(String str, Promise promise) {
        try {
            if (getResIdentifier(str) > 0) {
                promise.resolve(true);
            } else {
                promise.resolve(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    private void copyInputStream(InputStream inputStream, String str, String str2, Promise promise) {
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        try {
            try {
                try {
                    outputStream = getOutputStream(str2, false);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[Data.MAX_DATA_BYTES];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, read);
                    }
                }
                promise.resolve(null);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Exception e2) {
                e = e2;
                outputStream2 = outputStream;
                reject(promise, str, new Exception(String.format("Failed to copy '%s' to %s (%s)", str, str2, e.getLocalizedMessage())));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                outputStream2 = outputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
                throw th;
            }
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (IOException unused5) {
        }
    }

    @ReactMethod
    public void setReadable(String str, Boolean bool, Boolean bool2, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            file.setReadable(bool.booleanValue(), bool2.booleanValue());
            promise.resolve(true);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void stat(String str, Promise promise) {
        try {
            String originalFilepath = getOriginalFilepath(str, true);
            File file = new File(originalFilepath);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("ctime", (int) (file.lastModified() / 1000));
            createMap.putInt("mtime", (int) (file.lastModified() / 1000));
            createMap.putDouble(RRWebVideoEvent.JsonKeys.SIZE, file.length());
            createMap.putInt("type", file.isDirectory() ? 1 : 0);
            createMap.putString("originalFilepath", originalFilepath);
            promise.resolve(createMap);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void unlink(String str, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            DeleteRecursive(file);
            promise.resolve(null);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    private void DeleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                DeleteRecursive(file2);
            }
        }
        file.delete();
    }

    @ReactMethod
    public void mkdir(String str, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            file.mkdirs();
            if (!file.exists()) {
                throw new Exception("Directory could not be created");
            }
            promise.resolve(null);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void downloadFile(final ReadableMap readableMap, final Promise promise) {
        try {
            File file = new File(readableMap.getString("toFile"));
            URL url = new URL(readableMap.getString("fromUrl"));
            final int i = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            int i2 = readableMap.getInt("progressInterval");
            int i3 = readableMap.getInt("progressDivider");
            int i4 = readableMap.getInt("readTimeout");
            int i5 = readableMap.getInt("connectionTimeout");
            boolean z = readableMap.getBoolean("hasBeginCallback");
            boolean z2 = readableMap.getBoolean("hasProgressCallback");
            DownloadParams downloadParams = new DownloadParams();
            downloadParams.src = url;
            downloadParams.dest = file;
            downloadParams.headers = map;
            downloadParams.progressInterval = i2;
            downloadParams.progressDivider = i3;
            downloadParams.readTimeout = i4;
            downloadParams.connectionTimeout = i5;
            downloadParams.onTaskCompleted = new DownloadParams.OnTaskCompleted() { // from class: com.rnfs.RNFSManager.3
                @Override // com.rnfs.DownloadParams.OnTaskCompleted
                public void onTaskCompleted(DownloadResult downloadResult) {
                    if (downloadResult.exception == null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt("jobId", i);
                        createMap.putInt("statusCode", downloadResult.statusCode);
                        createMap.putDouble("bytesWritten", downloadResult.bytesWritten);
                        promise.resolve(createMap);
                        return;
                    }
                    RNFSManager.this.reject(promise, readableMap.getString("toFile"), downloadResult.exception);
                }
            };
            if (z) {
                downloadParams.onDownloadBegin = new DownloadParams.OnDownloadBegin() { // from class: com.rnfs.RNFSManager.4
                    @Override // com.rnfs.DownloadParams.OnDownloadBegin
                    public void onDownloadBegin(int i6, long j, Map<String, String> map2) {
                        WritableMap createMap = Arguments.createMap();
                        for (Map.Entry<String, String> entry : map2.entrySet()) {
                            createMap.putString(entry.getKey(), entry.getValue());
                        }
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putInt("jobId", i);
                        createMap2.putInt("statusCode", i6);
                        createMap2.putDouble("contentLength", j);
                        createMap2.putMap("headers", createMap);
                        RNFSManager rNFSManager = RNFSManager.this;
                        rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadBegin", createMap2);
                    }
                };
            }
            if (z2) {
                downloadParams.onDownloadProgress = new DownloadParams.OnDownloadProgress() { // from class: com.rnfs.RNFSManager.5
                    @Override // com.rnfs.DownloadParams.OnDownloadProgress
                    public void onDownloadProgress(long j, long j2) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt("jobId", i);
                        createMap.putDouble("contentLength", j);
                        createMap.putDouble("bytesWritten", j2);
                        RNFSManager rNFSManager = RNFSManager.this;
                        rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadProgress", createMap);
                    }
                };
            }
            Downloader downloader = new Downloader();
            downloader.execute(downloadParams);
            this.downloaders.put(i, downloader);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, readableMap.getString("toFile"), e);
        }
    }

    @ReactMethod
    public void stopDownload(int i) {
        Downloader downloader = this.downloaders.get(i);
        if (downloader != null) {
            downloader.stop();
        }
    }

    @ReactMethod
    public void uploadFiles(final ReadableMap readableMap, final Promise promise) {
        try {
            ReadableArray array = readableMap.getArray("files");
            URL url = new URL(readableMap.getString("toUrl"));
            final int i = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            ReadableMap map2 = readableMap.getMap(GraphRequest.FIELDS_PARAM);
            String string = readableMap.getString("method");
            boolean z = readableMap.getBoolean("binaryStreamOnly");
            boolean z2 = readableMap.getBoolean("hasBeginCallback");
            boolean z3 = readableMap.getBoolean("hasProgressCallback");
            ArrayList<ReadableMap> arrayList = new ArrayList<>();
            UploadParams uploadParams = new UploadParams();
            for (int i2 = 0; i2 < array.size(); i2++) {
                arrayList.add(array.getMap(i2));
            }
            uploadParams.src = url;
            uploadParams.files = arrayList;
            uploadParams.headers = map;
            uploadParams.method = string;
            uploadParams.fields = map2;
            uploadParams.binaryStreamOnly = z;
            uploadParams.onUploadComplete = new UploadParams.onUploadComplete() { // from class: com.rnfs.RNFSManager.6
                @Override // com.rnfs.UploadParams.onUploadComplete
                public void onUploadComplete(UploadResult uploadResult) {
                    if (uploadResult.exception == null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt("jobId", i);
                        createMap.putInt("statusCode", uploadResult.statusCode);
                        createMap.putMap("headers", uploadResult.headers);
                        createMap.putString("body", uploadResult.body);
                        promise.resolve(createMap);
                        return;
                    }
                    RNFSManager.this.reject(promise, readableMap.getString("toUrl"), uploadResult.exception);
                }
            };
            if (z2) {
                uploadParams.onUploadBegin = new UploadParams.onUploadBegin() { // from class: com.rnfs.RNFSManager.7
                    @Override // com.rnfs.UploadParams.onUploadBegin
                    public void onUploadBegin() {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt("jobId", i);
                        RNFSManager rNFSManager = RNFSManager.this;
                        rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadBegin", createMap);
                    }
                };
            }
            if (z3) {
                uploadParams.onUploadProgress = new UploadParams.onUploadProgress() { // from class: com.rnfs.RNFSManager.8
                    @Override // com.rnfs.UploadParams.onUploadProgress
                    public void onUploadProgress(int i3, int i4) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt("jobId", i);
                        createMap.putInt("totalBytesExpectedToSend", i3);
                        createMap.putInt("totalBytesSent", i4);
                        RNFSManager rNFSManager = RNFSManager.this;
                        rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadProgress", createMap);
                    }
                };
            }
            Uploader uploader = new Uploader();
            uploader.execute(uploadParams);
            this.uploaders.put(i, uploader);
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, readableMap.getString("toUrl"), e);
        }
    }

    @ReactMethod
    public void stopUpload(int i) {
        Uploader uploader = this.uploaders.get(i);
        if (uploader != null) {
            uploader.stop();
        }
    }

    @ReactMethod
    public void getFSInfo(Promise promise) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long totalBytes = statFs.getTotalBytes();
        long freeBytes = statFs.getFreeBytes();
        long totalBytes2 = statFs2.getTotalBytes();
        long freeBytes2 = statFs2.getFreeBytes();
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("totalSpace", totalBytes);
        createMap.putDouble("freeSpace", freeBytes);
        createMap.putDouble("totalSpaceEx", totalBytes2);
        createMap.putDouble("freeSpaceEx", freeBytes2);
        promise.resolve(createMap);
    }

    @ReactMethod
    public void touch(String str, double d, double d2, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).setLastModified((long) d)));
        } catch (Exception e) {
            e.printStackTrace();
            reject(promise, str, e);
        }
    }

    @ReactMethod
    public void getAllExternalFilesDirs(Promise promise) {
        File[] externalFilesDirs = getReactApplicationContext().getExternalFilesDirs(null);
        WritableArray createArray = Arguments.createArray();
        for (File file : externalFilesDirs) {
            if (file != null) {
                createArray.pushString(file.getAbsolutePath());
            }
        }
        promise.resolve(createArray);
    }

    @ReactMethod
    public void scanFile(String str, final Promise promise) {
        MediaScannerConnection.scanFile(getReactApplicationContext(), new String[]{str}, null, new MediaScannerConnection.MediaScannerConnectionClient() { // from class: com.rnfs.RNFSManager.9
            @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
            public void onMediaScannerConnected() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str2, Uri uri) {
                promise.resolve(str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reject(Promise promise, String str, Exception exc) {
        if (exc instanceof FileNotFoundException) {
            rejectFileNotFound(promise, str);
        } else if (exc instanceof IORejectionException) {
            IORejectionException iORejectionException = (IORejectionException) exc;
            promise.reject(iORejectionException.getCode(), iORejectionException.getMessage());
        } else {
            promise.reject("EUNKNOWN", exc);
        }
    }

    private void rejectFileNotFound(Promise promise, String str) {
        promise.reject("ENOENT", "ENOENT: no such file or directory, open '" + str + "'");
    }

    private void rejectFileIsDirectory(Promise promise) {
        promise.reject("EISDIR", "EISDIR: illegal operation on a directory, read");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(RNFSDocumentDirectory, 0);
        hashMap.put(RNFSDocumentDirectoryPath, getReactApplicationContext().getFilesDir().getAbsolutePath());
        hashMap.put(RNFSTemporaryDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        hashMap.put(RNFSPicturesDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put(RNFSCachesDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        hashMap.put(RNFSDownloadDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        hashMap.put(RNFSFileTypeRegular, 0);
        hashMap.put(RNFSFileTypeDirectory, 1);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            hashMap.put(RNFSExternalStorageDirectoryPath, externalStorageDirectory.getAbsolutePath());
        } else {
            hashMap.put(RNFSExternalStorageDirectoryPath, null);
        }
        File externalFilesDir = getReactApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            hashMap.put(RNFSExternalDirectoryPath, externalFilesDir.getAbsolutePath());
        } else {
            hashMap.put(RNFSExternalDirectoryPath, null);
        }
        File externalCacheDir = getReactApplicationContext().getExternalCacheDir();
        if (externalCacheDir != null) {
            hashMap.put(RNFSExternalCachesDirectoryPath, externalCacheDir.getAbsolutePath());
            return hashMap;
        }
        hashMap.put(RNFSExternalCachesDirectoryPath, null);
        return hashMap;
    }
}
