package com.yandex.runtime;

import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class ByteBufferUtils {
    private ByteBufferUtils() {
    }

    public static ByteBuffer fromAsset(AssetManager assetManager, String str) throws IOException {
        return fromInputStream(assetManager.open(str));
    }

    public static ByteBuffer fromByteArray(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return allocateDirect;
    }

    public static ByteBuffer fromFile(String str) throws IOException {
        File file = new File(str);
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        try {
            byte[] bArr = new byte[(int) file.length()];
            dataInputStream.readFully(bArr);
            return fromByteArray(bArr);
        } finally {
            fileInputStream.close();
        }
    }

    public static ByteBuffer fromInputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr, 0, 16384);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    ByteBuffer fromByteArray = fromByteArray(byteArrayOutputStream.toByteArray());
                    inputStream.close();
                    return fromByteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    public static ByteBuffer fromResource(Resources resources, int i11) throws IOException {
        return fromInputStream(resources.openRawResource(i11));
    }
}
