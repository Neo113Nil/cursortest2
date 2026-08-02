package com.twilio.voice;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.W6;
import com.twilio.voice.Call;
import com.twilio.voice.PreflightTest;
import org.json.JSONException;
import org.json.JSONObject;
import tvo.webrtc.CalledByNative;

/* loaded from: classes4.dex */
class PreflightListenerProxy {
    private static final Logger logger = Logger.getLogger(PreflightListenerProxy.class);
    private final Handler handler;
    private MediaFactory mediaFactory;
    private final long nativeHandle = nativeConstruct();
    private final PreflightTest.Listener observer;
    private final PreflightTest preflightTest;

    public PreflightListenerProxy(Context context, PreflightTest preflightTest, PreflightTest.Listener listener, Handler handler) {
        this.preflightTest = preflightTest;
        this.mediaFactory = MediaFactory.instance(this, context);
        this.observer = listener;
        this.handler = handler;
    }

    private native long nativeConstruct();

    private native void nativeRelease(long j10);

    private void releaseMediaFactory() {
        MediaFactory mediaFactory = this.mediaFactory;
        if (mediaFactory != null) {
            mediaFactory.release(this);
            this.mediaFactory = null;
        }
    }

    public void finalize() {
        releaseMediaFactory();
        nativeRelease(this.nativeHandle);
        super.finalize();
    }

    public MediaFactory getMediaFactory() {
        return this.mediaFactory;
    }

    @CalledByNative
    public void preflightCompleted(@NonNull String str) {
        releaseMediaFactory();
        try {
            final JSONObject jSONObject = new JSONObject(str);
            this.handler.post(new Runnable() { // from class: com.twilio.voice.b0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.observer.onPreflightCompleted(PreflightListenerProxy.this.preflightTest, jSONObject);
                }
            });
        } catch (JSONException e10) {
            logger.e(e10 + " " + e10.getMessage());
            this.handler.post(new Runnable() { // from class: com.twilio.voice.c0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.observer.onPreflightSample(PreflightListenerProxy.this.preflightTest, new JSONObject());
                }
            });
        }
    }

    @CalledByNative
    public void preflightConnected() {
        this.handler.post(new Runnable() { // from class: com.twilio.voice.d0
            @Override // java.lang.Runnable
            public final void run() {
                r0.observer.onPreflightConnected(PreflightListenerProxy.this.preflightTest);
            }
        });
    }

    @CalledByNative
    public void preflightFailed(@NonNull final CallException callException) {
        releaseMediaFactory();
        this.handler.post(new Runnable() { // from class: com.twilio.voice.X
            @Override // java.lang.Runnable
            public final void run() {
                r0.observer.onPreflightFailed(PreflightListenerProxy.this.preflightTest, callException);
            }
        });
    }

    @CalledByNative
    public void preflightSample(@NonNull String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            this.handler.post(new Runnable() { // from class: com.twilio.voice.Y
                @Override // java.lang.Runnable
                public final void run() {
                    r0.observer.onPreflightSample(PreflightListenerProxy.this.preflightTest, jSONObject);
                }
            });
        } catch (JSONException e10) {
            logger.e(e10 + " " + e10.getMessage());
            this.handler.post(new Runnable() { // from class: com.twilio.voice.Z
                @Override // java.lang.Runnable
                public final void run() {
                    r0.observer.onPreflightSample(PreflightListenerProxy.this.preflightTest, new JSONObject());
                }
            });
        }
    }

    @CalledByNative
    public void preflightWarning(@NonNull final Call.CallQualityWarning[] callQualityWarningArr, @NonNull final Call.CallQualityWarning[] callQualityWarningArr2) {
        this.handler.post(new Runnable() { // from class: com.twilio.voice.a0
            @Override // java.lang.Runnable
            public final void run() {
                r0.observer.onPreflightWarning(PreflightListenerProxy.this.preflightTest, W6.a(callQualityWarningArr), W6.a(callQualityWarningArr2));
            }
        });
    }
}
