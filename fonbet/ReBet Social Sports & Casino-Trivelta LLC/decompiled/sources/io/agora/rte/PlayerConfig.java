package io.agora.rte;

import io.agora.rte.Constants;
import io.agora.rte.exception.RteException;

/* loaded from: classes3.dex */
public class PlayerConfig {
    private long mNativeHandle;

    public PlayerConfig() {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreatePlayerConfig();
    }

    private native long nativeCreatePlayerConfig();

    private native int nativeGetAbrFallbackLayer(long j10);

    private native int nativeGetAbrSubscriptionLayer(long j10);

    private native int nativeGetAudioDualMonoMode(long j10);

    private native int nativeGetAudioPitch(long j10);

    private native int nativeGetAudioPlaybackDelay(long j10);

    private native int nativeGetAudioTrackIdx(long j10);

    private native boolean nativeGetAutoPlay(long j10);

    private native int nativeGetExternalSubtitleTrackIdx(long j10);

    private native String nativeGetJsonParameter(long j10);

    private native int nativeGetLoopCount(long j10);

    private native int nativeGetPlaybackSpeed(long j10);

    private native int nativeGetPlayoutAudioTrackIdx(long j10);

    private native int nativeGetPlayoutVolume(long j10);

    private native int nativeGetPublishAudioTrackIdx(long j10);

    private native int nativeGetPublishVolume(long j10);

    private native int nativeGetSubtitleTrackIdx(long j10);

    private native void nativeReleasePlayerConfig(long j10);

    private native void nativeSetAbrFallbackLayer(long j10, int i10);

    private native void nativeSetAbrSubscriptionLayer(long j10, int i10);

    private native void nativeSetAudioDualMonoMode(long j10, int i10);

    private native void nativeSetAudioPitch(long j10, int i10);

    private native void nativeSetAudioPlaybackDelay(long j10, int i10);

    private native void nativeSetAudioTrackIdx(long j10, int i10);

    private native void nativeSetAutoPlay(long j10, boolean z10);

    private native void nativeSetExternalSubtitleTrackIdx(long j10, int i10);

    private native void nativeSetJsonParameter(long j10, String str);

    private native void nativeSetLoopCount(long j10, int i10);

    private native void nativeSetPlaybackSpeed(long j10, int i10);

    private native void nativeSetPlayoutAudioTrackIdx(long j10, int i10);

    private native void nativeSetPlayoutVolume(long j10, int i10);

    private native void nativeSetPublishAudioTrackIdx(long j10, int i10);

    private native void nativeSetPublishVolume(long j10, int i10);

    private native void nativeSetSubtitleTrackIdx(long j10, int i10);

    public void finalize() {
        nativeReleasePlayerConfig(this.mNativeHandle);
    }

    public Constants.AbrFallbackLayer getAbrFallbackLayer() {
        return Constants.AbrFallbackLayer.fromInt(nativeGetAbrFallbackLayer(this.mNativeHandle));
    }

    public Constants.AbrSubscriptionLayer getAbrSubscriptionLayer() {
        return Constants.AbrSubscriptionLayer.fromInt(nativeGetAbrSubscriptionLayer(this.mNativeHandle));
    }

    public int getAudioDualMonoMode() {
        return nativeGetAudioDualMonoMode(this.mNativeHandle);
    }

    public int getAudioPitch() {
        return nativeGetAudioPitch(this.mNativeHandle);
    }

    public int getAudioPlaybackDelay() {
        return nativeGetAudioPlaybackDelay(this.mNativeHandle);
    }

    public int getAudioTrackIdx() {
        return nativeGetAudioTrackIdx(this.mNativeHandle);
    }

    public boolean getAutoPlay() {
        return nativeGetAutoPlay(this.mNativeHandle);
    }

    public int getExternalSubtitleTrackIdx() {
        return nativeGetExternalSubtitleTrackIdx(this.mNativeHandle);
    }

    public String getJsonParameter() {
        return nativeGetJsonParameter(this.mNativeHandle);
    }

    public int getLoopCount() {
        return nativeGetLoopCount(this.mNativeHandle);
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public int getPlaybackSpeed() {
        return nativeGetPlaybackSpeed(this.mNativeHandle);
    }

    public int getPlayoutAudioTrackIdx() {
        return nativeGetPlayoutAudioTrackIdx(this.mNativeHandle);
    }

    public int getPlayoutVolume() {
        return nativeGetPlayoutVolume(this.mNativeHandle);
    }

    public int getPublishAudioTrackIdx() {
        return nativeGetPublishAudioTrackIdx(this.mNativeHandle);
    }

    public int getPublishVolume() {
        return nativeGetPublishVolume(this.mNativeHandle);
    }

    public int getSubtitleTrackIdx() {
        return nativeGetSubtitleTrackIdx(this.mNativeHandle);
    }

    public void setAbrFallbackLayer(Constants.AbrFallbackLayer abrFallbackLayer) {
        if (abrFallbackLayer == null) {
            throw new RteException("fallbackLayer is null", Constants.ErrorCode.getValue(Constants.ErrorCode.INVALID_ARGUMENT));
        }
        nativeSetAbrFallbackLayer(this.mNativeHandle, Constants.AbrFallbackLayer.getValue(abrFallbackLayer));
    }

    public void setAbrSubscriptionLayer(Constants.AbrSubscriptionLayer abrSubscriptionLayer) {
        if (abrSubscriptionLayer == null) {
            throw new RteException("subscriptionLayer is null", Constants.ErrorCode.getValue(Constants.ErrorCode.INVALID_ARGUMENT));
        }
        nativeSetAbrSubscriptionLayer(this.mNativeHandle, Constants.AbrSubscriptionLayer.getValue(abrSubscriptionLayer));
    }

    public void setAudioDualMonoMode(int i10) {
        nativeSetAudioDualMonoMode(this.mNativeHandle, i10);
    }

    public void setAudioPitch(int i10) {
        nativeSetAudioPitch(this.mNativeHandle, i10);
    }

    public void setAudioPlaybackDelay(int i10) {
        nativeSetAudioPlaybackDelay(this.mNativeHandle, i10);
    }

    public void setAudioTrackIdx(int i10) {
        nativeSetAudioTrackIdx(this.mNativeHandle, i10);
    }

    public void setAutoPlay(boolean z10) {
        nativeSetAutoPlay(this.mNativeHandle, z10);
    }

    public void setExternalSubtitleTrackIdx(int i10) {
        nativeSetExternalSubtitleTrackIdx(this.mNativeHandle, i10);
    }

    public void setJsonParameter(String str) {
        nativeSetJsonParameter(this.mNativeHandle, str);
    }

    public void setLoopCount(int i10) {
        nativeSetLoopCount(this.mNativeHandle, i10);
    }

    public void setPlaybackSpeed(int i10) {
        nativeSetPlaybackSpeed(this.mNativeHandle, i10);
    }

    public void setPlayoutAudioTrackIdx(int i10) {
        nativeSetPlayoutAudioTrackIdx(this.mNativeHandle, i10);
    }

    public void setPlayoutVolume(int i10) {
        nativeSetPlayoutVolume(this.mNativeHandle, i10);
    }

    public void setPublishAudioTrackIdx(int i10) {
        nativeSetPublishAudioTrackIdx(this.mNativeHandle, i10);
    }

    public void setPublishVolume(int i10) {
        nativeSetPublishVolume(this.mNativeHandle, i10);
    }

    public void setSubtitleTrackIdx(int i10) {
        nativeSetSubtitleTrackIdx(this.mNativeHandle, i10);
    }
}
