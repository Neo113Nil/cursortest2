package io.agora.rte;

/* loaded from: classes3.dex */
public class Config {
    private long mNativeHandle;

    public Config() {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreateConfig();
    }

    private native long nativeCreateConfig();

    private native String nativeGetAppId(long j10);

    private native int nativeGetAreaCode(long j10);

    private native String nativeGetCloudProxy(long j10);

    private native String nativeGetJsonParameter(long j10);

    private native int nativeGetLogFileSize(long j10);

    private native String nativeGetLogFolder(long j10);

    private native void nativeReleaseConfig(long j10);

    private native void nativeSetAppId(long j10, String str);

    private native void nativeSetAreaCode(long j10, int i10);

    private native void nativeSetCloudProxy(long j10, String str);

    private native void nativeSetJsonParameter(long j10, String str);

    private native void nativeSetLogFileSize(long j10, int i10);

    private native void nativeSetLogFolder(long j10, String str);

    public void finalize() {
        nativeReleaseConfig(this.mNativeHandle);
    }

    public String getAppId() {
        return nativeGetAppId(this.mNativeHandle);
    }

    public int getAreaCode() {
        return nativeGetAreaCode(this.mNativeHandle);
    }

    public String getCloudProxy() {
        return nativeGetCloudProxy(this.mNativeHandle);
    }

    public String getJsonParameter() {
        return nativeGetJsonParameter(this.mNativeHandle);
    }

    public int getLogFileSize() {
        return nativeGetLogFileSize(this.mNativeHandle);
    }

    public String getLogFolder() {
        return nativeGetLogFolder(this.mNativeHandle);
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public void setAppId(String str) {
        nativeSetAppId(this.mNativeHandle, str);
    }

    public void setAreaCode(int i10) {
        nativeSetAreaCode(this.mNativeHandle, i10);
    }

    public void setCloudProxy(String str) {
        nativeSetCloudProxy(this.mNativeHandle, str);
    }

    public void setJsonParameter(String str) {
        nativeSetJsonParameter(this.mNativeHandle, str);
    }

    public void setLogFileSize(int i10) {
        nativeSetLogFileSize(this.mNativeHandle, i10);
    }

    public void setLogFolder(String str) {
        nativeSetLogFolder(this.mNativeHandle, str);
    }
}
