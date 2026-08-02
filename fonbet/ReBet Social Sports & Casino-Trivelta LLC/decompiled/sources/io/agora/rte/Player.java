package io.agora.rte;

import io.agora.rte.callback.AsyncCallback;
import io.agora.rte.callback.PlayerGetStatsCallback;

/* loaded from: classes3.dex */
public class Player {
    private long mNativeHandle;

    public Player(Rte rte, PlayerInitialConfig playerInitialConfig) {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreatePlayer(rte != null ? rte.getNativeHandle() : 0L, playerInitialConfig != null ? playerInitialConfig.getNativeHandle() : 0L);
    }

    private void destroy() {
        nativeReleasePlayer(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    private native long nativeCreatePlayer(long j10, long j11);

    private native void nativeGetConfigs(long j10, long j11);

    private native void nativeGetInfo(long j10, long j11);

    private native long nativeGetPosition(long j10);

    private native void nativeGetStats(long j10, PlayerGetStatsCallback playerGetStatsCallback);

    private native void nativeMuteAudio(long j10, boolean z10);

    private native void nativeMuteVideo(long j10, boolean z10);

    private native void nativeOpenWithCustomSourceProvider(long j10, long j11, long j12, AsyncCallback asyncCallback);

    private native void nativeOpenWithStream(long j10, long j11, AsyncCallback asyncCallback);

    private native void nativeOpenWithUrl(long j10, String str, long j11, AsyncCallback asyncCallback);

    private native void nativePause(long j10);

    private native void nativePlay(long j10);

    private static native void nativePreloadWithUrl(String str);

    private native void nativeRegisterObserver(long j10, long j11);

    private native void nativeReleasePlayer(long j10);

    private native void nativeSeek(long j10, long j11);

    private native void nativeSetCanvas(long j10, long j11);

    private native void nativeSetConfigs(long j10, long j11);

    private native void nativeStop(long j10);

    private native void nativeSwitchWithUrl(long j10, String str, boolean z10, AsyncCallback asyncCallback);

    private native void nativeUnregisterObserver(long j10, long j11);

    public static void preloadWithUrl(String str) {
        nativePreloadWithUrl(str);
    }

    public void finalize() {
        destroy();
    }

    public void getConfigs(PlayerConfig playerConfig) {
        nativeGetConfigs(this.mNativeHandle, playerConfig != null ? playerConfig.getNativeHandle() : 0L);
    }

    public void getInfo(PlayerInfo playerInfo) {
        nativeGetInfo(this.mNativeHandle, playerInfo != null ? playerInfo.getNativeHandle() : 0L);
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public long getPosition() {
        return nativeGetPosition(this.mNativeHandle);
    }

    public void getStats(PlayerGetStatsCallback playerGetStatsCallback) {
        nativeGetStats(this.mNativeHandle, playerGetStatsCallback);
    }

    public void muteAudio(boolean z10) {
        nativeMuteAudio(this.mNativeHandle, z10);
    }

    public void muteVideo(boolean z10) {
        nativeMuteVideo(this.mNativeHandle, z10);
    }

    public void openWithCustomSourceProvider(PlayerCustomSourceProvider playerCustomSourceProvider, long j10, AsyncCallback asyncCallback) {
        nativeOpenWithCustomSourceProvider(this.mNativeHandle, playerCustomSourceProvider != null ? playerCustomSourceProvider.getNativeHandle() : 0L, j10, asyncCallback);
    }

    public void openWithStream(Stream stream, AsyncCallback asyncCallback) {
        nativeOpenWithStream(this.mNativeHandle, stream != null ? stream.getNativeHandle() : 0L, asyncCallback);
    }

    public void openWithUrl(String str, long j10, AsyncCallback asyncCallback) {
        long j11 = this.mNativeHandle;
        if (str == null) {
            str = "";
        }
        nativeOpenWithUrl(j11, str, j10, asyncCallback);
    }

    public void pause() {
        nativePause(this.mNativeHandle);
    }

    public void play() {
        nativePlay(this.mNativeHandle);
    }

    public void registerObserver(PlayerObserver playerObserver) {
        nativeRegisterObserver(this.mNativeHandle, playerObserver != null ? playerObserver.getNativeHandle() : 0L);
    }

    public void seek(long j10) {
        nativeSeek(this.mNativeHandle, j10);
    }

    public void setCanvas(Canvas canvas) {
        nativeSetCanvas(this.mNativeHandle, canvas != null ? canvas.getNativeHandle() : 0L);
    }

    public void setConfigs(PlayerConfig playerConfig) {
        nativeSetConfigs(this.mNativeHandle, playerConfig != null ? playerConfig.getNativeHandle() : 0L);
    }

    public void stop() {
        nativeStop(this.mNativeHandle);
    }

    public void switchWithUrl(String str, boolean z10, AsyncCallback asyncCallback) {
        long j10 = this.mNativeHandle;
        if (str == null) {
            str = "";
        }
        nativeSwitchWithUrl(j10, str, z10, asyncCallback);
    }

    public void unregisterObserver(PlayerObserver playerObserver) {
        nativeUnregisterObserver(this.mNativeHandle, playerObserver != null ? playerObserver.getNativeHandle() : 0L);
    }
}
