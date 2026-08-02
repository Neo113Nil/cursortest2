package defpackage;

import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.analytics.enums.AudioState;
import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.enums.EventExitTrigger;
import com.blaze.blazesdk.analytics.enums.EventNavigationDirection;
import com.blaze.blazesdk.analytics.enums.EventNavigationType;
import com.blaze.blazesdk.analytics.enums.EventStartTrigger;
import com.blaze.blazesdk.analytics.enums.PlaybackActionMethod;
import com.blaze.blazesdk.analytics.enums.PlaybackSpeedType;
import com.blaze.blazesdk.analytics.enums.SeekDirection;
import com.blaze.blazesdk.analytics.enums.SeekType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsAd;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsInteraction;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsMoments;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsReferring;
import com.blaze.blazesdk.delegates.models.BlazePlayerEvent;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.OnMomentStartParams;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.follow.models.BlazeFollowEntityType;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.players.models.k;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFollowEntityStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.ironsource.Ua;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.gim;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ysm {
    public static final AnalyticsPropsInteraction a(sqm sqmVar, gim.b bVar, PlaybackActionMethod playbackActionMethod) {
        sqmVar.getClass();
        bVar.getClass();
        MomentModel momentModel = bVar.a;
        AudioState audioState = Intrinsics.c(sqmVar.H.d(), Boolean.TRUE) ? AudioState.MUTE : AudioState.UNMUTE;
        Map map = momentModel.p;
        InteractionModel interactionModel = momentModel.n;
        Map map2 = x5m.f() ? map : null;
        String str = (String) sqmVar.g.getValue();
        String str2 = null;
        ContentType contentType = ContentType.MOMENT;
        String str3 = momentModel.id;
        String str4 = momentModel.title;
        String id = interactionModel != null ? interactionModel.getId() : null;
        String type = interactionModel != null ? interactionModel.getType() : null;
        String userAnswer = interactionModel != null ? interactionModel.getUserAnswer() : null;
        String initData = interactionModel != null ? interactionModel.getInitData() : null;
        if (interactionModel != null) {
            str2 = interactionModel.getClientEnrichmentUrl();
        }
        return new AnalyticsPropsInteraction(str, contentType, str3, null, str4, id, type, initData, userAnswer, playbackActionMethod, audioState, map2, null, str2, 4104, null);
    }

    public static final void b(sqm sqmVar, EventActionName eventActionName, AnalyticsPropsAd analyticsPropsAd) {
        sqmVar.getClass();
        eventActionName.getClass();
        analyticsPropsAd.getClass();
        spm.postEvent$default(cwm.a, eventActionName, EventCategoryType.AD, i(sqmVar), null, null, null, null, analyticsPropsAd, null, 376, null);
    }

    public static final void c(sqm sqmVar, EventActionName eventActionName, AnalyticsPropsInteraction analyticsPropsInteraction) {
        sqmVar.getClass();
        eventActionName.getClass();
        analyticsPropsInteraction.getClass();
        spm.postEvent$default(cwm.a, eventActionName, EventCategoryType.INTERACTION, null, null, null, null, null, null, analyticsPropsInteraction, 252, null);
    }

    public static /* synthetic */ AnalyticsPropsInteraction createMomentPlayerInteractionProps$default(sqm sqmVar, gim.b bVar, PlaybackActionMethod playbackActionMethod, int i, Object obj) {
        if ((i & 2) != 0) {
            playbackActionMethod = null;
        }
        return a(sqmVar, bVar, playbackActionMethod);
    }

    public static AnalyticsPropsAd createMomentsPlayerAdProps$default(sqm sqmVar, gim.a aVar, EventExitTrigger eventExitTrigger, PlaybackActionMethod playbackActionMethod, boolean z, boolean z2, int i, Object obj) {
        BlazeAdInfoModel blazeAdInfoModel;
        String str = null;
        EventExitTrigger eventExitTrigger2 = (i & 2) != 0 ? null : eventExitTrigger;
        PlaybackActionMethod playbackActionMethod2 = (i & 4) != 0 ? null : playbackActionMethod;
        boolean z3 = (i & 8) != 0 ? false : z;
        boolean z4 = (i & 16) == 0 ? z2 : false;
        sqmVar.getClass();
        aVar.getClass();
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel = aVar.a;
        AudioState audioState = Intrinsics.c(sqmVar.H.d(), Boolean.TRUE) ? AudioState.MUTE : AudioState.UNMUTE;
        Integer valueOf = z4 ? Integer.valueOf(sqmVar.F()) : null;
        Double valueOf2 = z3 ? Double.valueOf(sqmVar.E() / 1000.0d) : null;
        n4m D = sqmVar.D();
        gim gimVar = D != null ? D.b : null;
        MomentModel momentModel = gimVar instanceof gim.b ? ((gim.b) gimVar).a : null;
        Map map = x5m.f() ? momentModel != null ? momentModel.p : null : null;
        String str2 = (String) sqmVar.g.getValue();
        String str3 = momentModel != null ? momentModel.id : null;
        String str4 = momentModel != null ? momentModel.title : null;
        BlazeGoogleCustomNativeAdModel.AnalyticsData analyticsData = blazeGoogleCustomNativeAdModel.getAnalyticsData();
        String advertiserId = analyticsData != null ? analyticsData.getAdvertiserId() : null;
        BlazeGoogleCustomNativeAdModel.AnalyticsData analyticsData2 = blazeGoogleCustomNativeAdModel.getAnalyticsData();
        String advertiserName = analyticsData2 != null ? analyticsData2.getAdvertiserName() : null;
        BlazeGoogleCustomNativeAdModel.AnalyticsData analyticsData3 = blazeGoogleCustomNativeAdModel.getAnalyticsData();
        String campaignId = analyticsData3 != null ? analyticsData3.getCampaignId() : null;
        BlazeGoogleCustomNativeAdModel.AnalyticsData analyticsData4 = blazeGoogleCustomNativeAdModel.getAnalyticsData();
        String campaignName = analyticsData4 != null ? analyticsData4.getCampaignName() : null;
        BlazeGoogleCustomNativeAdModel.AnalyticsData analyticsData5 = blazeGoogleCustomNativeAdModel.getAnalyticsData();
        String adServer = analyticsData5 != null ? analyticsData5.getAdServer() : null;
        String adInsertionLogicForAnalytics = blazeGoogleCustomNativeAdModel.getAdInsertionLogicForAnalytics();
        Integer adIndex = blazeGoogleCustomNativeAdModel.getAdIndex();
        ContentType contentType = ContentType.MOMENT;
        if (momentModel != null && (blazeAdInfoModel = momentModel.q) != null) {
            str = blazeAdInfoModel.e;
        }
        return new AnalyticsPropsAd(str2, null, null, str3, str4, valueOf2, advertiserName, contentType, map, null, str, eventExitTrigger2, valueOf, playbackActionMethod2, audioState, advertiserId, campaignId, campaignName, adServer, adInsertionLogicForAnalytics, adIndex, null, null, null, null, null, null, null, null, null, null, null, -2096640, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AnalyticsPropsMoments createMomentsPlayerProps$default(sqm sqmVar, gim.b bVar, Integer num, EventNavigationType eventNavigationType, EventNavigationDirection eventNavigationDirection, B.b bVar2, H h, PlaybackActionMethod playbackActionMethod, boolean z, String str, boolean z2, SeekType seekType, SeekDirection seekDirection, Long l, Long l2, Long l3, Double d, PlaybackSpeedType playbackSpeedType, Long l4, Long l5, Long l6, int i, Object obj) {
        int i2;
        Integer num2;
        Map map;
        Map map2;
        String str2;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        BlazeMomentsPlayerFollowEntityStyle followEntity;
        BlazeFollowEntityType entityType;
        List list;
        glm a;
        String str3;
        Integer num3 = (i & 2) != 0 ? null : num;
        EventNavigationType eventNavigationType2 = (i & 4) != 0 ? null : eventNavigationType;
        EventNavigationDirection eventNavigationDirection2 = (i & 8) != 0 ? null : eventNavigationDirection;
        B.b bVar3 = (i & 16) != 0 ? null : bVar2;
        H h2 = (i & 32) != 0 ? null : h;
        PlaybackActionMethod playbackActionMethod2 = (i & 64) != 0 ? null : playbackActionMethod;
        boolean z3 = (i & 128) != 0 ? false : z;
        String str4 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str;
        boolean z4 = (i & 512) == 0 ? z2 : false;
        SeekType seekType2 = (i & 1024) != 0 ? null : seekType;
        SeekDirection seekDirection2 = (i & a.o) != 0 ? null : seekDirection;
        Long l7 = (i & 4096) != 0 ? null : l;
        Long l8 = (i & 8192) != 0 ? null : l2;
        Long l9 = (i & 16384) != 0 ? null : l3;
        Double d7 = (32768 & i) != 0 ? null : d;
        PlaybackSpeedType playbackSpeedType2 = (65536 & i) != 0 ? null : playbackSpeedType;
        Long l10 = (131072 & i) != 0 ? null : l4;
        Long l11 = (262144 & i) != 0 ? null : l5;
        Long l12 = (i & 524288) != 0 ? null : l6;
        sqmVar.getClass();
        bVar.getClass();
        MomentModel momentModel = bVar.a;
        Long l13 = l12;
        AudioState audioState = Intrinsics.c(sqmVar.H.d(), Boolean.TRUE) ? AudioState.MUTE : AudioState.UNMUTE;
        B.b bVar4 = bVar3;
        double d8 = momentModel.c;
        Integer valueOf = z3 ? Integer.valueOf(sqmVar.F()) : null;
        n4m D = sqmVar.D();
        String g = D != null ? fgm.g(D) : null;
        Map map3 = x5m.f() ? momentModel.p : null;
        Map map4 = z4 ? momentModel.t : null;
        String str5 = (String) sqmVar.g.getValue();
        String str6 = momentModel.id;
        Long l14 = l7;
        String str7 = momentModel.title;
        int g0 = sqmVar.g0();
        EventStartTrigger b = bVar4 != null ? k.b(bVar4) : null;
        EventExitTrigger a2 = h2 != null ? k.a(h2) : null;
        int i3 = sqmVar.q0;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = sqmVar.u0;
        if (blazeMomentsPlayerStyle == null || (followEntity = blazeMomentsPlayerStyle.getFollowEntity()) == null || (entityType = followEntity.getEntityType()) == null) {
            i2 = i3;
        } else {
            i2 = i3;
            n4m D2 = sqmVar.D();
            if (D2 != null && (list = D2.t) != null && BlazeSDK.INSTANCE.getFollowEntitiesInternal$blazesdk_release() != null && (a = jsl.a(list, entityType)) != null) {
                int ordinal = a.b.ordinal();
                if (ordinal != 0) {
                    num2 = valueOf;
                    if (ordinal == 1) {
                        str3 = "player_id";
                    } else {
                        if (ordinal != 2) {
                            zzl.b();
                            return null;
                        }
                        str3 = "property_id";
                    }
                } else {
                    num2 = valueOf;
                    str3 = "team_id";
                }
                map = wv8.o(str3, a.c);
                String str8 = momentModel.s;
                if (l14 == null) {
                    map2 = map;
                    str2 = str8;
                    d2 = Double.valueOf(l14.longValue() / 1000.0d);
                } else {
                    map2 = map;
                    str2 = str8;
                    d2 = null;
                }
                if (l8 == null) {
                    d3 = d2;
                    d4 = Double.valueOf(l8.longValue() / 1000.0d);
                } else {
                    d3 = d2;
                    d4 = null;
                }
                if (l9 == null) {
                    d5 = d4;
                    d6 = Double.valueOf(l9.longValue() / 1000.0d);
                } else {
                    d5 = d4;
                    d6 = null;
                }
                return new AnalyticsPropsMoments(str5, str6, str7, Integer.valueOf(g0), num3, eventNavigationType2, eventNavigationDirection2, b, a2, Double.valueOf(d8), num2, playbackActionMethod2, audioState, Integer.valueOf(i2), map3, g, str4, str2, map2, map4, seekType2, d3, d5, d6, seekDirection2, d7, playbackSpeedType2, Float.valueOf(sqmVar.x0), l10 == null ? Double.valueOf(l10.longValue() / 1000.0d) : null, l11 == null ? Double.valueOf(l11.longValue() / 1000.0d) : null, l13 == null ? Double.valueOf(l13.longValue() / 1000.0d) : null);
            }
        }
        num2 = valueOf;
        map = null;
        String str82 = momentModel.s;
        if (l14 == null) {
        }
        if (l8 == null) {
        }
        if (l9 == null) {
        }
        return new AnalyticsPropsMoments(str5, str6, str7, Integer.valueOf(g0), num3, eventNavigationType2, eventNavigationDirection2, b, a2, Double.valueOf(d8), num2, playbackActionMethod2, audioState, Integer.valueOf(i2), map3, g, str4, str2, map2, map4, seekType2, d3, d5, d6, seekDirection2, d7, playbackSpeedType2, Float.valueOf(sqmVar.x0), l10 == null ? Double.valueOf(l10.longValue() / 1000.0d) : null, l11 == null ? Double.valueOf(l11.longValue() / 1000.0d) : null, l13 == null ? Double.valueOf(l13.longValue() / 1000.0d) : null);
    }

    public static final void d(sqm sqmVar, EventActionName eventActionName, AnalyticsPropsMoments analyticsPropsMoments) {
        sqmVar.getClass();
        eventActionName.getClass();
        analyticsPropsMoments.getClass();
        spm.postEvent$default(cwm.a, eventActionName, EventCategoryType.MOMENT, i(sqmVar), null, analyticsPropsMoments, null, null, null, null, 488, null);
    }

    public static final void e(sqm sqmVar, EventNavigationDirection eventNavigationDirection) {
        sqmVar.getClass();
        eventNavigationDirection.getClass();
        n4m D = sqmVar.D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.b) {
            d(sqmVar, EventActionName.MOMENT_EXIT, createMomentsPlayerProps$default(sqmVar, (gim.b) gimVar, null, EventNavigationType.MANUAL, eventNavigationDirection, null, null, null, true, null, false, null, null, null, null, null, null, null, null, null, null, 1048434, null));
        } else if (gimVar instanceof gim.a) {
            b(sqmVar, EventActionName.AD_EXIT, createMomentsPlayerAdProps$default(sqmVar, (gim.a) gimVar, null, null, true, true, 6, null));
        }
    }

    public static final void f(sqm sqmVar, SeekType seekType, SeekDirection seekDirection, long j, long j2) {
        seekType.getClass();
        seekDirection.getClass();
        n4m D = sqmVar.D();
        Double d = null;
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.b) {
            int i = rrm.a[seekType.ordinal()];
            if (i == 1 || i == 2) {
                d = Double.valueOf(10.0d);
            } else if (i != 3) {
                zzl.b();
                return;
            }
            d(sqmVar, EventActionName.SEEK, createMomentsPlayerProps$default(sqmVar, (gim.b) gimVar, null, null, null, null, null, null, false, null, false, seekType, seekDirection, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(Ua.s), d, null, null, null, null, 984062, null));
        }
    }

    public static final void g(sqm sqmVar, H h) {
        sqmVar.getClass();
        h.getClass();
        n4m D = sqmVar.D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.b) {
            d(sqmVar, EventActionName.MOMENTS_PLAYLIST_EXIT, createMomentsPlayerProps$default(sqmVar, (gim.b) gimVar, null, null, null, null, h, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048542, null));
        }
    }

    public static final void h(sqm sqmVar) {
        String str;
        sqmVar.getClass();
        n4m D = sqmVar.D();
        gim gimVar = D != null ? D.b : null;
        if (!(gimVar instanceof gim.b)) {
            if ((gimVar instanceof gim.a) && sqmVar.q0 == 0) {
                gim.a aVar = (gim.a) gimVar;
                sqmVar.s0.d(aVar.a);
                b(sqmVar, EventActionName.AD_VIEW, createMomentsPlayerAdProps$default(sqmVar, aVar, null, null, false, false, 30, null));
                return;
            }
            return;
        }
        List list = sqmVar.p0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((n4m) obj).b instanceof gim.b) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        gim.b bVar = (gim.b) gimVar;
        Integer valueOf = Integer.valueOf(size);
        B b = sqmVar.r0;
        d(sqmVar, EventActionName.MOMENT_START, createMomentsPlayerProps$default(sqmVar, bVar, valueOf, null, null, b != null ? b.b : null, null, null, false, null, true, null, null, null, null, null, null, null, null, null, null, 1048044, null));
        n4m D2 = sqmVar.D();
        if (D2 == null || (str = D2.a) == null) {
            return;
        }
        gzk gzkVar = gzk.a;
        gzk.e(sqmVar.C(), BlazePlayerType.MOMENTS, new BlazePlayerEvent.OnMomentStart(new OnMomentStartParams(str, sqmVar.g0(), size)), sqmVar.j);
    }

    public static final AnalyticsPropsReferring i(sqm sqmVar) {
        sqmVar.getClass();
        WidgetType widgetType = sqmVar.h;
        return new AnalyticsPropsReferring(sqmVar.H(), widgetType != null ? widgetType.getValue() : null, sqmVar.k);
    }
}
