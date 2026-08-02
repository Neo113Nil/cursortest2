package com.swmansion.worklets;

import android.content.res.AssetManager;
import android.os.Build;
import com.facebook.jni.HybridData;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* loaded from: classes8.dex */
public class ScriptBufferWrapper {
    private final HybridData mHybridData;

    private native HybridData initHybridFromAssets(AssetManager assetManager, String str);

    private native HybridData initHybridFromFile(String str);

    private native HybridData initHybridFromString(String str, String str2);

    public ScriptBufferWrapper(String str, AssetManager assetManager) {
        if (str.startsWith("file://")) {
            this.mHybridData = initHybridFromFile(str.substring(7));
        } else {
            if (str.startsWith(CodePushConstants.ASSETS_BUNDLE_PREFIX)) {
                this.mHybridData = initHybridFromAssets(assetManager, str.substring(9));
                return;
            }
            try {
                this.mHybridData = initHybridFromString(downloadScript(str), str);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static String downloadScript(String str) throws IOException {
        byte[] readBytes;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                readBytes = httpURLConnection.getInputStream().readAllBytes();
            } else {
                readBytes = readBytes(httpURLConnection.getInputStream());
            }
            return new String(readBytes, StandardCharsets.UTF_8);
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    private static byte[] readBytes(InputStream inputStream) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
