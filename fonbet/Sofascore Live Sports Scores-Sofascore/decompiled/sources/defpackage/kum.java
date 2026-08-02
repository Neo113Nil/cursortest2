package defpackage;

import com.blaze.blazesdk.analytics.models.AnalyticsEvent;
import com.blaze.blazesdk.analytics.models.BlazeAnalyticsEvent;
import com.blaze.blazesdk.delegates.BlazeSDKDelegate;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kum extends hoi implements Function2 {
    public final /* synthetic */ AnalyticsEvent r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kum(AnalyticsEvent analyticsEvent, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = analyticsEvent;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new kum(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new kum(this.r, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        BlazeSDKDelegate sdkDelegate$blazesdk_release = BlazeSDK.INSTANCE.getSdkDelegate$blazesdk_release();
        if (sdkDelegate$blazesdk_release == null) {
            return null;
        }
        AnalyticsEvent analyticsEvent = this.r;
        analyticsEvent.getClass();
        sdkDelegate$blazesdk_release.onEventTriggered(new BlazeAnalyticsEvent(analyticsEvent.getTimestamp_utc(), analyticsEvent.getTimestamp_user_tz(), analyticsEvent.getSdk_version(), analyticsEvent.getSdk_type(), analyticsEvent.getEvent_category(), analyticsEvent.getEvent_action(), analyticsEvent.getTech(), analyticsEvent.getUser(), analyticsEvent.getReferring(), analyticsEvent.getStory(), analyticsEvent.getWidget(), analyticsEvent.getMoment(), analyticsEvent.getVideo(), analyticsEvent.getAd(), analyticsEvent.getInteraction()));
        return Unit.a;
    }
}
