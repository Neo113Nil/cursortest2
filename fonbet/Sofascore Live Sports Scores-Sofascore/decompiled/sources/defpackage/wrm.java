package defpackage;

import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.models.AnalyticsEvent;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsAd;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsInteraction;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsMoments;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsReferring;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsStory;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsVideos;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wrm extends hoi implements Function1 {
    public final /* synthetic */ AnalyticsPropsInteraction A;
    public int r;
    public final /* synthetic */ EventActionName s;
    public final /* synthetic */ EventCategoryType t;
    public final /* synthetic */ AnalyticsPropsReferring u;
    public final /* synthetic */ AnalyticsPropsStory v;
    public final /* synthetic */ AnalyticsPropsMoments w;
    public final /* synthetic */ AnalyticsPropsVideos x;
    public final /* synthetic */ AnalyticsPropsWidget y;
    public final /* synthetic */ AnalyticsPropsAd z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrm(EventActionName eventActionName, EventCategoryType eventCategoryType, AnalyticsPropsReferring analyticsPropsReferring, AnalyticsPropsStory analyticsPropsStory, AnalyticsPropsMoments analyticsPropsMoments, AnalyticsPropsVideos analyticsPropsVideos, AnalyticsPropsWidget analyticsPropsWidget, AnalyticsPropsAd analyticsPropsAd, AnalyticsPropsInteraction analyticsPropsInteraction, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = eventActionName;
        this.t = eventCategoryType;
        this.u = analyticsPropsReferring;
        this.v = analyticsPropsStory;
        this.w = analyticsPropsMoments;
        this.x = analyticsPropsVideos;
        this.y = analyticsPropsWidget;
        this.z = analyticsPropsAd;
        this.A = analyticsPropsInteraction;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new wrm(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((wrm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (defpackage.cwm.a((com.blaze.blazesdk.analytics.models.AnalyticsEvent) r15, r13) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r15 == r0) goto L15;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wrm wrmVar;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            AnalyticsEvent.Companion companion = AnalyticsEvent.INSTANCE;
            this.r = 1;
            wrmVar = this;
            obj = companion.a(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, wrmVar);
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            wrmVar = this;
        }
        wrmVar.r = 2;
    }
}
