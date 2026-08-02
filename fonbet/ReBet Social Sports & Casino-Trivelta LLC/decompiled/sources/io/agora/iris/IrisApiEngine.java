package io.agora.iris;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class IrisApiEngine {
    private IrisEventHandler eventHandler;
    private long nativeHandle = CreateIrisApiEngine();

    static {
        System.loadLibrary("AgoraRtcWrapper");
    }

    public IrisApiEngine(Context context) {
    }

    private native String CallIrisApi(long j10, String str, String str2, Object obj);

    private native String CallIrisApi(long j10, String str, String str2, byte[][] bArr);

    public static native byte[] CopyAsByteArrayByAddress(long j10, int i10);

    public static native String CopyAsStringByAddress(long j10, int i10);

    private native long CreateIrisApiEngine();

    private native void DestroyIrisApiEngine(long j10);

    private static native void EnableUseJsonArray(boolean z10);

    public static native void FreeJObjectByAddress(long j10);

    public static native long GetJObjectAddress(Object obj);

    public static void enableUseJsonArray(boolean z10) {
        EnableUseJsonArray(z10);
    }

    private static String getAppPrivateStorageDir(Context context) {
        File externalFilesDir;
        return (!"mounted".equals(Environment.getExternalStorageState()) || (externalFilesDir = context.getExternalFilesDir(null)) == null) ? context.getFilesDir().getAbsolutePath() : externalFilesDir.getAbsolutePath();
    }

    public void OnEvent(String str, String str2, byte[][] bArr) {
        synchronized (this) {
            try {
                IrisEventHandler irisEventHandler = this.eventHandler;
                if (irisEventHandler != null) {
                    irisEventHandler.OnEvent(str, str2, bArr == null ? null : Arrays.asList(bArr));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String callIrisApi(String str, String str2, List<byte[]> list) {
        return CallIrisApi(this.nativeHandle, str, str2, list != null ? (byte[][]) list.toArray(new byte[0][]) : null);
    }

    public void destroy() {
        DestroyIrisApiEngine(this.nativeHandle);
        this.nativeHandle = 0L;
    }

    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public void setEventHandler(IrisEventHandler irisEventHandler) {
        synchronized (this) {
            this.eventHandler = irisEventHandler;
        }
    }

    public String callIrisApi(String str, String str2, Object obj) {
        return CallIrisApi(this.nativeHandle, str, str2, obj);
    }
}
