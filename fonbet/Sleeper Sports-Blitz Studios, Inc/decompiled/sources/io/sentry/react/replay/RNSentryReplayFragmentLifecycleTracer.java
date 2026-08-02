package io.sentry.react.replay;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import io.sentry.ILogger;
import io.sentry.ReplayController;
import io.sentry.ScopesAdapter;
import io.sentry.SentryLevel;
import io.sentry.android.replay.ReplayIntegration;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public class RNSentryReplayFragmentLifecycleTracer extends FragmentManager.FragmentLifecycleCallbacks {
    private ViewTreeObserver.OnGlobalLayoutListener currentListener;
    private WeakReference<View> currentViewRef;
    private final ILogger logger;
    private ReplayIntegration replayIntegration;
    private int lastWidth = -1;
    private int lastHeight = -1;

    public RNSentryReplayFragmentLifecycleTracer(ILogger iLogger) {
        this.logger = iLogger;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        detachLayoutChangeListener();
        attachLayoutChangeListener(view);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        detachLayoutChangeListener();
    }

    private void attachLayoutChangeListener(View view) {
        final WeakReference weakReference = new WeakReference(view);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.react.replay.RNSentryReplayFragmentLifecycleTracer.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    RNSentryReplayFragmentLifecycleTracer.this.checkAndNotifyWindowSizeChange(view2);
                }
            }
        };
        this.currentViewRef = new WeakReference<>(view);
        this.currentListener = onGlobalLayoutListener;
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    private void detachLayoutChangeListener() {
        WeakReference<View> weakReference = this.currentViewRef;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null && this.currentListener != null) {
            try {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this.currentListener);
                }
            } catch (Exception e) {
                this.logger.log(SentryLevel.DEBUG, "Failed to remove layout change listener", e);
            }
        }
        this.currentViewRef = null;
        this.currentListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndNotifyWindowSizeChange(View view) {
        try {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (this.lastWidth == i && this.lastHeight == i2) {
                return;
            }
            this.lastWidth = i;
            this.lastHeight = i2;
            notifyReplayIntegrationOfSizeChange(i, i2);
        } catch (Exception e) {
            this.logger.log(SentryLevel.DEBUG, "Failed to check window size", e);
        }
    }

    private void notifyReplayIntegrationOfSizeChange(int i, int i2) {
        if (this.replayIntegration == null) {
            this.replayIntegration = getReplayIntegration();
        }
        ReplayIntegration replayIntegration = this.replayIntegration;
        if (replayIntegration == null) {
            return;
        }
        try {
            replayIntegration.onWindowSizeChanged(i, i2);
        } catch (Exception e) {
            this.logger.log(SentryLevel.DEBUG, "Failed to notify replay integration of size change", e);
        }
    }

    private ReplayIntegration getReplayIntegration() {
        try {
            ReplayController replayController = ScopesAdapter.getInstance().getOptions().getReplayController();
            if (!(replayController instanceof ReplayIntegration)) {
                this.logger.log(SentryLevel.DEBUG, "Error getting replay integration", new Object[0]);
                return null;
            }
            return (ReplayIntegration) replayController;
        } catch (Exception e) {
            this.logger.log(SentryLevel.DEBUG, "Error getting replay integration", e);
            return null;
        }
    }
}
