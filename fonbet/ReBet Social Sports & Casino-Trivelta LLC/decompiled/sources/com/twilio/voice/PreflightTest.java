package com.twilio.voice;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.twilio.voice.Call;
import com.twilio.voice.ThreadUtils;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PreflightTest {
    private static final Logger logger = Logger.getLogger(PreflightTest.class);
    private final long nativeHandle;
    private final PreflightListenerProxy proxyObserver;
    final String tempCallSid;
    private final ThreadUtils.ThreadChecker threadChecker;

    public interface Listener {
        void onPreflightCompleted(@NonNull PreflightTest preflightTest, @NonNull JSONObject jSONObject);

        void onPreflightConnected(@NonNull PreflightTest preflightTest);

        void onPreflightFailed(@NonNull PreflightTest preflightTest, @NonNull CallException callException);

        void onPreflightSample(@NonNull PreflightTest preflightTest, @NonNull JSONObject jSONObject);

        void onPreflightWarning(@NonNull PreflightTest preflightTest, @NonNull Set<Call.CallQualityWarning> set, @NonNull Set<Call.CallQualityWarning> set2);
    }

    public enum State {
        CONNECTING,
        CONNECTED,
        COMPLETED,
        FAILED
    }

    public PreflightTest(@NonNull Context context, @NonNull PreflightOptions preflightOptions, @NonNull Listener listener) {
        String str = "TSID" + UUID.randomUUID();
        this.tempCallSid = str;
        Handler createHandler = Utils.createHandler();
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(preflightOptions, "preflightOptions must not be null");
        Preconditions.checkNotNull(listener, "PreflightTest.Listener must not be null");
        this.threadChecker = new ThreadUtils.ThreadChecker(Thread.currentThread());
        PreflightListenerProxy preflightListenerProxy = new PreflightListenerProxy(context.getApplicationContext(), this, listener, createHandler);
        this.proxyObserver = preflightListenerProxy;
        EventListenerProxy eventListenerProxy = new EventListenerProxy(str, true, preflightOptions.getEventListener(), createHandler, new EventPublisher(context, Constants.getClientSdkProductName(), preflightOptions.getAccessToken()));
        eventListenerProxy.publishLoggerEvent();
        this.nativeHandle = nativeConstruct(preflightOptions.getAccessToken(), preflightListenerProxy.getMediaFactory().getNativeMediaFactoryHandle(), preflightOptions.getIceOptions(), preflightOptions.getAudioCodecsArray(), preflightListenerProxy, eventListenerProxy);
    }

    private static native long nativeConstruct(@NonNull String str, long j10, IceOptions iceOptions, @NonNull AudioCodec[] audioCodecArr, @NonNull PreflightListenerProxy preflightListenerProxy, @NonNull EventListenerProxy eventListenerProxy);

    private static native String nativeGetCallSid(long j10);

    private static native long nativeGetEndTime(long j10);

    private static native String nativeGetLatestSample(long j10);

    private static native String nativeGetReport(long j10);

    private static native long nativeGetStartTime(long j10);

    private static native int nativeGetState(long j10);

    private static native void nativeRelease(long j10);

    private static native void nativeStop(long j10);

    public void finalize() {
        nativeRelease(this.nativeHandle);
        super.finalize();
    }

    public String getCallSid() {
        this.threadChecker.checkIsOnValidThread();
        return nativeGetCallSid(this.nativeHandle);
    }

    public long getEndTime() {
        this.threadChecker.checkIsOnValidThread();
        return nativeGetEndTime(this.nativeHandle);
    }

    public JSONObject getLatestSample() {
        this.threadChecker.checkIsOnValidThread();
        try {
            return new JSONObject(nativeGetLatestSample(this.nativeHandle));
        } catch (JSONException e10) {
            logger.e(e10 + " " + e10.getMessage());
            return new JSONObject();
        }
    }

    public JSONObject getReport() {
        this.threadChecker.checkIsOnValidThread();
        try {
            return new JSONObject(nativeGetReport(this.nativeHandle));
        } catch (JSONException e10) {
            logger.e(e10 + " " + e10.getMessage());
            return new JSONObject();
        }
    }

    public long getStartTime() {
        this.threadChecker.checkIsOnValidThread();
        return nativeGetStartTime(this.nativeHandle);
    }

    public State getState() {
        this.threadChecker.checkIsOnValidThread();
        return State.values()[nativeGetState(this.nativeHandle)];
    }

    public void stop() {
        this.threadChecker.checkIsOnValidThread();
        nativeStop(this.nativeHandle);
    }
}
