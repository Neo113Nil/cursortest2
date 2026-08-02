package org.chromium.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.nimbusds.jose.jwk.JWKParameterNames;
import internal.org.jni_zero.JNINamespace;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.function.Function;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public class FileUtils {
    public static Function<String, Boolean> DELETE_ALL = new Function() { // from class: org.chromium.base.FileUtils$$ExternalSyntheticLambda0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return FileUtils.lambda$static$0((String) obj);
        }
    };
    private static final String TAG = "FileUtils";

    public interface Natives {
        String getAbsoluteFilePath(String filePath);
    }

    static /* synthetic */ Boolean lambda$static$0(String str) {
        return true;
    }

    public static boolean recursivelyDeleteFile(File currentFile, Function<String, Boolean> canDelete) {
        File[] listFiles;
        if (!currentFile.exists()) {
            currentFile.delete();
            return true;
        }
        if (canDelete != null && !canDelete.apply(currentFile.getPath()).booleanValue()) {
            return true;
        }
        if (currentFile.isDirectory() && (listFiles = currentFile.listFiles()) != null) {
            for (File file : listFiles) {
                recursivelyDeleteFile(file, canDelete);
            }
        }
        boolean delete = currentFile.delete();
        if (!delete) {
            Log.e(TAG, "Failed to delete: %s", currentFile);
        }
        return delete;
    }

    public static long getFileSizeBytes(File file) {
        long j = 0;
        if (file == null) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file2 : listFiles) {
                j += getFileSizeBytes(file2);
            }
            return j;
        }
        return file.length();
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void copyStreamToFile(InputStream is, File outFile) throws IOException {
        File file = new File(outFile.getPath() + DefaultDiskStorage.FileType.TEMP);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            Log.i(TAG, "Writing to %s", outFile);
            copyStream(is, fileOutputStream);
            fileOutputStream.close();
            if (!file.renameTo(outFile)) {
                throw new IOException();
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] readStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Uri getUriForFile(File file) {
        Uri uri;
        try {
            uri = FileProviderUtils.getContentUriFromFile(file);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Could not create content uri: " + String.valueOf(e));
            uri = null;
        }
        return uri == null ? Uri.fromFile(file) : uri;
    }

    public static String getExtension(String file) {
        int lastIndexOf = file.lastIndexOf(47);
        int lastIndexOf2 = file.lastIndexOf(46);
        if (lastIndexOf >= lastIndexOf2) {
            return "";
        }
        return file.substring(lastIndexOf2 + 1).toLowerCase(Locale.US);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r6 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap queryBitmapFromContentProvider(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
            try {
                if (openFileDescriptor == null) {
                    Log.w(TAG, "Null ParcelFileDescriptor from uri " + String.valueOf(uri));
                } else {
                    FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                    if (fileDescriptor == null) {
                        Log.w(TAG, "Null FileDescriptor from uri " + String.valueOf(uri));
                        if (openFileDescriptor == null) {
                            return null;
                        }
                    } else {
                        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                        if (decodeFileDescriptor != null) {
                            if (openFileDescriptor != null) {
                                openFileDescriptor.close();
                            }
                            return decodeFileDescriptor;
                        }
                        Log.w(TAG, "Failed to decode image from uri " + String.valueOf(uri));
                        if (openFileDescriptor == null) {
                            return null;
                        }
                    }
                }
                openFileDescriptor.close();
                return null;
            } finally {
            }
        } catch (IOException unused) {
            Log.w(TAG, "IO exception when reading uri " + String.valueOf(uri));
            return null;
        }
    }

    public static String getAbsoluteFilePath(String filePath) {
        return FileUtilsJni.get().getAbsoluteFilePath(filePath);
    }
}
