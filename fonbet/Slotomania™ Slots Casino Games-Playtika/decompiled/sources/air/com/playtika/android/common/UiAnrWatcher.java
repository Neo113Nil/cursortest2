package air.com.playtika.android.common;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.sentry.Sentry;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class UiAnrWatcher {
    private Handler anrHandler;
    private final int maxSentryEventsCount;
    private Handler uiHandler;
    private final String TAG = "UiAnrWatcher";
    private final AtomicBoolean isHandled = new AtomicBoolean();
    private final AtomicBoolean sentrySendAllowed = new AtomicBoolean(true);
    private final AtomicInteger sentryEventsCounter = new AtomicInteger(0);
    private final Runnable checkIsHandled = new Runnable() { // from class: air.com.playtika.android.common.UiAnrWatcher$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            UiAnrWatcher.this.lambda$new$1();
        }
    };
    private final Runnable uiMessage = new Runnable() { // from class: air.com.playtika.android.common.UiAnrWatcher$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            UiAnrWatcher.this.lambda$new$2();
        }
    };
    private final long delayCheckMillis = 5000;

    public UiAnrWatcher(Context context) {
        this.maxSentryEventsCount = new Random().nextDouble() < 0.01d ? 10 : 0;
        new Thread(new Runnable() { // from class: air.com.playtika.android.common.UiAnrWatcher$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                UiAnrWatcher.this.lambda$new$0();
            }
        }, "UiAnrWatcher").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        Log.i("UiAnrWatcher", String.format("Init, UiAnrWatcher thread: %s", Thread.currentThread().getName()));
        Looper.prepare();
        this.anrHandler = new Handler(Looper.myLooper());
        Looper.loop();
    }

    public void start() {
        Log.i("UiAnrWatcher", String.format("Start, check interval: %s ms, UI thread: %s", Long.valueOf(this.delayCheckMillis), Thread.currentThread().getName()));
        if (this.uiHandler == null) {
            this.uiHandler = new Handler(Looper.myLooper());
        }
        removeCheckCallback();
        this.sentryEventsCounter.set(0);
        this.uiHandler.post(this.uiMessage);
        postCheckMessage();
    }

    public void stop() {
        removeCheckCallback();
        Log.i("UiAnrWatcher", "Stop, check callback removed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        if (this.isHandled.compareAndSet(true, false)) {
            this.sentrySendAllowed.set(true);
            this.uiHandler.post(this.uiMessage);
        } else {
            handleUiAnr();
        }
        postCheckMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        this.isHandled.set(true);
    }

    private void postCheckMessage() {
        Handler handler = this.anrHandler;
        if (handler != null) {
            handler.postDelayed(this.checkIsHandled, this.delayCheckMillis);
        }
    }

    private void removeCheckCallback() {
        Handler handler = this.anrHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void handleUiAnr() {
        String m = UiAnrWatcher$$ExternalSyntheticBackport0.m("\n", new CharSequence[]{"ANR in UI thread is detected", Arrays.toString(this.uiHandler.getLooper().getThread().getStackTrace())});
        Log.w("UiAnrWatcher", m);
        int andIncrement = this.sentryEventsCounter.getAndIncrement();
        if (this.sentrySendAllowed.getAndSet(false) && andIncrement < this.maxSentryEventsCount) {
            Sentry.captureMessage(UiAnrWatcher$$ExternalSyntheticBackport0.m(": ", new CharSequence[]{"UiAnrWatcher", m}));
        } else if (andIncrement >= this.maxSentryEventsCount) {
            Log.w("UiAnrWatcher", "The limit of sending messages to Sentry was reached");
        }
    }

    private int getDebugDelayMillis(Context context) {
        return context.getSharedPreferences("UiAnrWatcher", 0).getInt("delay_check_millis", 5000);
    }

    public void shutdown() {
        this.anrHandler.getLooper().quit();
        Log.i("UiAnrWatcher", "Shutdown, UiAnrWatcher");
    }
}
