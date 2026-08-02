package io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import io.branch.indexing.ContentDiscoverer;
import io.branch.referral.Branch;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
class BranchActivityLifecycleObserver implements Application.ActivityLifecycleCallbacks {
    private int activityCnt_ = 0;
    private boolean isActivityCreatedAndLaunched_ = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    BranchActivityLifecycleObserver() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Branch branch = Branch.getInstance();
        if (branch == null) {
            return;
        }
        branch.setIntentState(Branch.INTENT_STATE.PENDING);
        this.isActivityCreatedAndLaunched_ = true;
        if (BranchViewHandler.getInstance().isInstallOrOpenBranchViewPending(activity.getApplicationContext())) {
            BranchViewHandler.getInstance().showPendingBranchView(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Branch branch = Branch.getInstance();
        if (branch == null) {
            return;
        }
        branch.setIntentState(Branch.INTENT_STATE.PENDING);
        if (branch.getInitState() == Branch.SESSION_STATE.INITIALISED) {
            try {
                ContentDiscoverer.getInstance().discoverContent(activity, branch.getSessionReferredLink());
            } catch (Exception unused) {
            }
        }
        this.activityCnt_++;
        this.isActivityCreatedAndLaunched_ = false;
        maybeRefreshAdvertisingID(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Branch branch = Branch.getInstance();
        if (branch == null) {
            return;
        }
        branch.currentActivityReference_ = new WeakReference<>(activity);
        if (!Branch.bypassCurrentActivityIntentState()) {
            branch.setIntentState(Branch.INTENT_STATE.READY);
            branch.onIntentReady(activity, (activity.getIntent() == null || branch.getInitState() == Branch.SESSION_STATE.INITIALISED) ? false : true);
        }
        if (branch.getInitState() == Branch.SESSION_STATE.UNINITIALISED) {
            if (BranchUtil.getPluginType() == null) {
                PrefHelper.Debug("initializing session on user's behalf (onActivityResumed called but SESSION_STATE = UNINITIALISED)");
                branch.initSession(activity);
            } else {
                PrefHelper.Debug("onActivityResumed called and SESSION_STATE = UNINITIALISED, however this is a " + BranchUtil.getPluginType() + " plugin, so we are NOT initializing session on user's behalf");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Branch branch = Branch.getInstance();
        if (branch == null || branch.getShareLinkManager() == null) {
            return;
        }
        branch.getShareLinkManager().cancelShareLinkDialog(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Branch branch = Branch.getInstance();
        if (branch == null) {
            return;
        }
        ContentDiscoverer.getInstance().onActivityStopped(activity);
        int i = this.activityCnt_ - 1;
        this.activityCnt_ = i;
        if (i < 1) {
            branch.setInstantDeepLinkPossible(false);
            branch.closeSessionInternal();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Branch branch = Branch.getInstance();
        if (branch == null) {
            return;
        }
        if (branch.currentActivityReference_ != null && branch.currentActivityReference_.get() == activity) {
            branch.currentActivityReference_.clear();
        }
        BranchViewHandler.getInstance().onCurrentActivityDestroyed(activity);
    }

    private void maybeRefreshAdvertisingID(Context context) {
        Branch branch = Branch.getInstance();
        if (branch == null || branch.getTrackingController() == null || branch.getDeviceInfo() == null || branch.getDeviceInfo().getSystemObserver() == null || branch.getPrefHelper() == null || branch.getPrefHelper().getSessionID() == null) {
            return;
        }
        if (branch.getPrefHelper().getSessionID().equals(branch.getDeviceInfo().getSystemObserver().getAIDInitializationSessionID()) || branch.isGAParamsFetchInProgress() || branch.getTrackingController().isTrackingDisabled()) {
            return;
        }
        branch.setGAParamsFetchInProgress(branch.getDeviceInfo().getSystemObserver().prefetchAdsParams(context, branch));
    }

    boolean isActivityCreatedAndLaunched() {
        return this.isActivityCreatedAndLaunched_;
    }
}
