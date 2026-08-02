package io.agora.rtc2.internal;

import io.agora.rtc2.IVideoEffectObject;
import io.agora.utils2.internal.Logging;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class VideoEffectObjectImpl implements IVideoEffectObject {
    private static final String TAG = "VideoEffectObjectImpl";
    private final String mBundlePath;
    private WeakReference<RtcEngineImpl> mEngineReference;

    public enum VALUE_TYPE {
        BOOL_VALUE,
        INT_VALUE,
        FLOAT_VALUE;

        private final int ordinal = ordinal();

        VALUE_TYPE() {
        }

        public int getValue() {
            return this.ordinal;
        }
    }

    public VideoEffectObjectImpl(RtcEngineImpl rtcEngineImpl, String str) {
        this.mEngineReference = new WeakReference<>(rtcEngineImpl);
        this.mBundlePath = str;
    }

    @Override // io.agora.rtc2.IVideoEffectObject
    public int addOrUpdateVideoEffect(int i10, String str) {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.addOrUpdateVideoEffect(i10, str);
        }
        Logging.e(TAG, "RtcEngine has been destroyed");
        return -7;
    }

    @Override // io.agora.rtc2.IVideoEffectObject
    public boolean getVideoEffectBoolParam(String str, String str2) {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.getVideoEffectBoolParam(str, str2);
        }
        Logging.e(TAG, "RtcEngine has been destroyed");
        return false;
    }

    @Override // io.agora.rtc2.IVideoEffectObject
    public float getVideoEffectFloatParam(String str, String str2) {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.getVideoEffectFloatParam(str, str2);
        }
        Logging.e(TAG, "RtcEngine has been destroyed");
        return 0.0f;
    }

    @Override // io.agora.rtc2.IVideoEffectObject
    public int getVideoEffectIntParam(String str, String str2) {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.getVideoEffectIntParam(str, str2);
        }
        Logging.e(TAG, "RtcEngine has been destroyed");
        return 0;
    }

    @Override // io.agora.rtc2.IVideoEffectObject
    public int performVideoEffectAction(int i10, IVideoEffectObject.VIDEO_EFFECT_ACTION video_effect_action) {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.performVideoEffectAction(i10, video_effect_action.getValue());
        }
        Logging.e(TAG, "RtcEngine has been destroyed");
        return -7;
    }

    @Override // io.agora.rtc2.IVideoEffectObject
    public int removeVideoEffect(int i10) {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.removeVideoEffect(i10);
        }
        Logging.e(TAG, "RtcEngine has been destroyed");
        return -7;
    }

    @Override // io.agora.rtc2.IVideoEffectObject
    public int setVideoEffectBoolParam(String str, String str2, boolean z10) {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.setVideoEffectBoolParam(str, str2, z10);
        }
        Logging.e(TAG, "RtcEngine has been destroyed");
        return -7;
    }

    @Override // io.agora.rtc2.IVideoEffectObject
    public int setVideoEffectFloatParam(String str, String str2, float f10) {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.setVideoEffectFloatParam(str, str2, f10);
        }
        Logging.e(TAG, "RtcEngine has been destroyed");
        return -7;
    }

    @Override // io.agora.rtc2.IVideoEffectObject
    public int setVideoEffectIntParam(String str, String str2, int i10) {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.setVideoEffectIntParam(str, str2, i10);
        }
        Logging.e(TAG, "RtcEngine has been destroyed");
        return -7;
    }
}
