package defpackage;

import com.blaze.blazesdk.ads.ima.BlazeIMAHandlerEventType;
import com.blaze.blazesdk.ads.ima.models.BlazeImaAdEvent;
import com.blaze.blazesdk.ads.ima.models.BlazeImaAdInfo;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsAd;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsReferring;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ozl extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ x8m s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozl(x8m x8mVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = x8mVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        ozl ozlVar = new ozl(this.s, rq3Var);
        ozlVar.r = obj;
        return ozlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ozl ozlVar = new ozl(this.s, (rq3) obj2);
        ozlVar.r = (BlazeImaAdEvent) obj;
        return ozlVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        EventActionName eventActionName;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        BlazeImaAdEvent blazeImaAdEvent = (BlazeImaAdEvent) this.r;
        x8m x8mVar = this.s;
        x8mVar.getClass();
        blazeImaAdEvent.getClass();
        BlazeImaAdInfo adInfo = blazeImaAdEvent.getAdInfo();
        String adId = adInfo != null ? adInfo.getAdId() : null;
        BlazeImaAdInfo adInfo2 = blazeImaAdEvent.getAdInfo();
        String adTitle = adInfo2 != null ? adInfo2.getAdTitle() : null;
        BlazeImaAdInfo adInfo3 = blazeImaAdEvent.getAdInfo();
        String adDescription = adInfo3 != null ? adInfo3.getAdDescription() : null;
        BlazeImaAdInfo adInfo4 = blazeImaAdEvent.getAdInfo();
        String adSystem = adInfo4 != null ? adInfo4.getAdSystem() : null;
        BlazeImaAdInfo adInfo5 = blazeImaAdEvent.getAdInfo();
        Double adDuration = adInfo5 != null ? adInfo5.getAdDuration() : null;
        BlazeImaAdInfo adInfo6 = blazeImaAdEvent.getAdInfo();
        Boolean isSkippable = adInfo6 != null ? adInfo6.isSkippable() : null;
        BlazeImaAdInfo adInfo7 = blazeImaAdEvent.getAdInfo();
        Double skipTimeOffset = adInfo7 != null ? adInfo7.getSkipTimeOffset() : null;
        BlazeImaAdInfo adInfo8 = blazeImaAdEvent.getAdInfo();
        AnalyticsPropsAd a = ccm.a(x8mVar, adId, adTitle, adDescription, adSystem, adDuration, isSkippable, skipTimeOffset, adInfo8 != null ? adInfo8.getAdvertiserName() : null);
        BlazeIMAHandlerEventType type = blazeImaAdEvent.getType();
        type.getClass();
        cwm cwmVar = cwm.a;
        type.getClass();
        switch (drl.a[type.ordinal()]) {
            case 1:
                eventActionName = EventActionName.IMA_ALL_ADS_COMPLETED;
                break;
            case 2:
                eventActionName = EventActionName.IMA_AD_CLICKED;
                break;
            case 3:
                eventActionName = EventActionName.IMA_AD_COMPLETED;
                break;
            case 4:
                eventActionName = EventActionName.IMA_AD_LOADED;
                break;
            case 5:
                eventActionName = EventActionName.IMA_AD_PAUSED;
                break;
            case 6:
                eventActionName = EventActionName.IMA_AD_RESUMED;
                break;
            case 7:
                eventActionName = EventActionName.IMA_AD_SKIPPED;
                break;
            case 8:
                eventActionName = EventActionName.IMA_AD_STARTED;
                break;
            case 9:
                eventActionName = EventActionName.IMA_AD_TAPPED;
                break;
            case 10:
                eventActionName = EventActionName.IMA_AD_FIRST_QUARTILE;
                break;
            case 11:
                eventActionName = EventActionName.IMA_AD_MIDPOINT;
                break;
            case 12:
                eventActionName = EventActionName.IMA_AD_THIRD_QUARTILE;
                break;
            case 13:
                eventActionName = EventActionName.IMA_AD_REQUESTED;
                break;
            default:
                zzl.b();
                return null;
        }
        EventActionName eventActionName2 = eventActionName;
        EventCategoryType eventCategoryType = EventCategoryType.AD;
        WidgetType widgetType = x8mVar.g;
        spm.postEvent$default(cwmVar, eventActionName2, eventCategoryType, new AnalyticsPropsReferring(x8mVar.d, widgetType != null ? widgetType.getValue() : null, x8mVar.e), null, null, null, null, a, null, 376, null);
        return Unit.a;
    }
}
