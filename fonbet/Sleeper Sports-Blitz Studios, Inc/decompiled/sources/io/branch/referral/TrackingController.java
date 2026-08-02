package io.branch.referral;

import android.content.Context;

/* loaded from: classes9.dex */
class TrackingController {
    private boolean trackingDisabled = true;

    TrackingController(Context context) {
        updateTrackingState(context);
    }

    void disableTracking(Context context, boolean z) {
        if (this.trackingDisabled != z) {
            this.trackingDisabled = z;
            if (z) {
                onTrackingDisabled(context);
            } else {
                onTrackingEnabled();
            }
            PrefHelper.getInstance(context).setBool("bnc_tracking_state", Boolean.valueOf(z));
        }
    }

    boolean isTrackingDisabled() {
        return this.trackingDisabled;
    }

    void updateTrackingState(Context context) {
        this.trackingDisabled = PrefHelper.getInstance(context).getBool("bnc_tracking_state");
    }

    private void onTrackingDisabled(Context context) {
        Branch.getInstance().clearPendingRequests();
        PrefHelper prefHelper = PrefHelper.getInstance(context);
        prefHelper.clearBranchAnalyticsData();
        prefHelper.setSessionID(PrefHelper.NO_STRING_VALUE);
        prefHelper.setLinkClickID(PrefHelper.NO_STRING_VALUE);
        prefHelper.setLinkClickIdentifier(PrefHelper.NO_STRING_VALUE);
        prefHelper.setAppLink(PrefHelper.NO_STRING_VALUE);
        prefHelper.setInstallReferrerParams(PrefHelper.NO_STRING_VALUE);
        prefHelper.setGooglePlayReferrer(PrefHelper.NO_STRING_VALUE);
        prefHelper.setGoogleSearchInstallIdentifier(PrefHelper.NO_STRING_VALUE);
        prefHelper.setExternalIntentUri(PrefHelper.NO_STRING_VALUE);
        prefHelper.setExternalIntentExtra(PrefHelper.NO_STRING_VALUE);
        prefHelper.setSessionParams(PrefHelper.NO_STRING_VALUE);
        prefHelper.saveLastStrongMatchTime(0L);
    }

    private void onTrackingEnabled() {
        if (Branch.getInstance() != null) {
            Branch.getInstance().registerAppInitWithoutIntent();
        }
    }
}
