package io.intercom.android.sdk.carousel;

import android.view.View;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.intercom.android.sdk.models.carousel.ScreenAction;

/* loaded from: classes9.dex */
class ActionOnClickListener implements View.OnClickListener {
    private final CarouselListener listener;
    private final ScreenAction screenAction;

    ActionOnClickListener(ScreenAction screenAction, CarouselListener carouselListener) {
        this.screenAction = screenAction;
        this.listener = carouselListener;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.screenAction.isPermissionAction()) {
            this.listener.requestPermissions(this.screenAction);
            return;
        }
        String type = this.screenAction.getType();
        switch (type.hashCode()) {
            case -1573653227:
                if (type.equals(ActionType.START_CHAT)) {
                    this.listener.trackActionButtonTappedStats();
                    this.listener.startChat();
                    return;
                }
                break;
            case -567202649:
                type.equals(ActionType.CONTINUE);
                break;
            case 3321850:
                if (type.equals("link")) {
                    this.listener.trackActionButtonTappedStats();
                    this.listener.openLink(this.screenAction.getUri());
                    return;
                }
                break;
            case 3532159:
                if (type.equals("skip")) {
                    this.listener.skipPermissionScreen();
                    return;
                }
                break;
            case 1671672458:
                if (type.equals(ActionType.DISMISS)) {
                    this.listener.trackActionButtonTappedStats();
                    this.listener.dismissCarousel(MetricTracker.Context.FROM_CTA);
                    return;
                }
                break;
        }
        this.listener.selectNextScreen(MetricTracker.Context.FROM_CTA);
    }
}
