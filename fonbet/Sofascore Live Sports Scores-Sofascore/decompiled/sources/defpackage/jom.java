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
import com.blaze.blazesdk.analytics.enums.GestureType;
import com.blaze.blazesdk.analytics.enums.PlaybackActionMethod;
import com.blaze.blazesdk.analytics.enums.StoryLocalizationType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsAd;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsInteraction;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsReferring;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsStory;
import com.blaze.blazesdk.delegates.models.BlazePlayerEvent;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.OnStoryStartParams;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.players.models.k;
import defpackage.gim;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class jom {
    public static final AnalyticsPropsInteraction a(ilm ilmVar, gim.d dVar, PlaybackActionMethod playbackActionMethod) {
        ilmVar.getClass();
        dVar.getClass();
        StoryModel storyModel = dVar.a;
        srl srlVar = dVar.b;
        AudioState audioState = Intrinsics.c(ilmVar.H.d(), Boolean.TRUE) ? AudioState.MUTE : AudioState.UNMUTE;
        Map map = x5m.f() ? storyModel.l : null;
        Map map2 = srlVar.p;
        InteractionModel interactionModel = srlVar.l;
        Map map3 = x5m.f() ? map2 : null;
        return new AnalyticsPropsInteraction((String) ilmVar.g.getValue(), ContentType.STORY, storyModel.id, srlVar.a, storyModel.title, interactionModel != null ? interactionModel.getId() : null, interactionModel != null ? interactionModel.getType() : null, interactionModel != null ? interactionModel.getInitData() : null, interactionModel != null ? interactionModel.getUserAnswer() : null, playbackActionMethod, audioState, map, map3, interactionModel != null ? interactionModel.getClientEnrichmentUrl() : null);
    }

    public static final void b(ilm ilmVar) {
        n4m D = ilmVar.D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.d) {
            gim.d dVar = (gim.d) gimVar;
            B b = ilmVar.w0;
            e(ilmVar, EventActionName.STORY_PAGE_START, createStoryPlayerProps$default(ilmVar, dVar, null, null, b != null ? b.b : null, null, null, false, null, null, StoryLocalizationType.PAGE, 502, null));
        } else if (gimVar instanceof gim.a) {
            gim.a aVar = (gim.a) gimVar;
            ilmVar.x0.d(aVar.a);
            c(ilmVar, EventActionName.AD_VIEW, createStoryPlayerAdProps$default(ilmVar, aVar, null, null, false, false, null, 62, null));
        }
    }

    public static final void c(ilm ilmVar, EventActionName eventActionName, AnalyticsPropsAd analyticsPropsAd) {
        eventActionName.getClass();
        analyticsPropsAd.getClass();
        spm.postEvent$default(cwm.a, eventActionName, EventCategoryType.AD, i(ilmVar), null, null, null, null, analyticsPropsAd, null, 376, null);
    }

    public static AnalyticsPropsAd createStoryPlayerAdProps$default(ilm ilmVar, gim.a aVar, EventExitTrigger eventExitTrigger, PlaybackActionMethod playbackActionMethod, boolean z, boolean z2, GestureType gestureType, int i, Object obj) {
        gim.d dVar;
        BlazeAdInfoModel blazeAdInfoModel;
        List list;
        String str = null;
        EventExitTrigger eventExitTrigger2 = (i & 2) != 0 ? null : eventExitTrigger;
        PlaybackActionMethod playbackActionMethod2 = (i & 4) != 0 ? null : playbackActionMethod;
        boolean z3 = (i & 8) != 0 ? false : z;
        boolean z4 = (i & 16) == 0 ? z2 : false;
        GestureType gestureType2 = (i & 32) != 0 ? null : gestureType;
        ilmVar.getClass();
        aVar.getClass();
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel = aVar.a;
        AudioState audioState = Intrinsics.c(ilmVar.H.d(), Boolean.TRUE) ? AudioState.MUTE : AudioState.UNMUTE;
        Integer valueOf = z4 ? Integer.valueOf(ilmVar.F()) : null;
        Double valueOf2 = z3 ? Double.valueOf(ilmVar.E() / 1000.0d) : null;
        xlm i0 = ilmVar.i0();
        if (i0 != null && (list = i0.b) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gim gimVar = ((n4m) it.next()).b;
                dVar = gimVar instanceof gim.d ? (gim.d) gimVar : null;
                if (dVar != null) {
                    break;
                }
            }
        }
        dVar = null;
        StoryModel storyModel = dVar != null ? dVar.a : null;
        srl srlVar = dVar != null ? dVar.b : null;
        Map map = x5m.f() ? storyModel != null ? storyModel.l : null : null;
        Map map2 = x5m.f() ? srlVar != null ? srlVar.p : null : null;
        String str2 = (String) ilmVar.g.getValue();
        String str3 = storyModel != null ? storyModel.id : null;
        String str4 = storyModel != null ? storyModel.title : null;
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
        ContentType contentType = ContentType.STORY;
        if (storyModel != null && (blazeAdInfoModel = storyModel.h) != null) {
            str = blazeAdInfoModel.e;
        }
        return new AnalyticsPropsAd(str2, str3, str4, null, null, valueOf2, advertiserName, contentType, map, map2, str, eventExitTrigger2, valueOf, playbackActionMethod2, audioState, advertiserId, campaignId, campaignName, adServer, adInsertionLogicForAnalytics, adIndex, gestureType2, null, null, null, null, null, null, null, null, null, null, -4194304, null);
    }

    public static /* synthetic */ AnalyticsPropsInteraction createStoryPlayerInteractionProps$default(ilm ilmVar, gim.d dVar, PlaybackActionMethod playbackActionMethod, int i, Object obj) {
        if ((i & 2) != 0) {
            playbackActionMethod = null;
        }
        return a(ilmVar, dVar, playbackActionMethod);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AnalyticsPropsStory createStoryPlayerProps$default(ilm ilmVar, gim.d dVar, EventNavigationType eventNavigationType, EventNavigationDirection eventNavigationDirection, B.b bVar, H h, PlaybackActionMethod playbackActionMethod, boolean z, GestureType gestureType, String str, StoryLocalizationType storyLocalizationType, int i, Object obj) {
        Map map;
        Map map2;
        EventNavigationType eventNavigationType2 = (i & 2) != 0 ? null : eventNavigationType;
        EventNavigationDirection eventNavigationDirection2 = (i & 4) != 0 ? null : eventNavigationDirection;
        B.b bVar2 = (i & 8) != 0 ? null : bVar;
        H h2 = (i & 16) != 0 ? null : h;
        PlaybackActionMethod playbackActionMethod2 = (i & 32) != 0 ? null : playbackActionMethod;
        boolean z2 = (i & 64) != 0 ? false : z;
        GestureType gestureType2 = (i & 128) != 0 ? null : gestureType;
        String str2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str;
        StoryLocalizationType storyLocalizationType2 = (i & 512) != 0 ? StoryLocalizationType.NONE : storyLocalizationType;
        ilmVar.getClass();
        dVar.getClass();
        storyLocalizationType2.getClass();
        StoryModel storyModel = dVar.a;
        srl srlVar = dVar.b;
        AudioState audioState = Intrinsics.c(ilmVar.H.d(), Boolean.TRUE) ? AudioState.MUTE : AudioState.UNMUTE;
        int indexOf = storyModel.g.indexOf(srlVar);
        Integer valueOf = z2 ? Integer.valueOf(ilmVar.F()) : null;
        double d = srlVar.b;
        n4m D = ilmVar.D();
        String g = D != null ? fgm.g(D) : null;
        Map map3 = x5m.f() ? storyModel.l : null;
        Map map4 = x5m.f() ? srlVar.p : null;
        int i2 = wmm.a[storyLocalizationType2.ordinal()];
        if (i2 == 1) {
            map = storyModel.m;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzl.b();
                    return null;
                }
                map2 = null;
                H h3 = h2;
                return new AnalyticsPropsStory((String) ilmVar.g.getValue(), storyModel.id, storyModel.title, srlVar.a, srlVar.o, Integer.valueOf(indexOf), Integer.valueOf(storyModel.g.size()), eventNavigationType2, eventNavigationDirection2, bVar2 == null ? k.b(bVar2) : null, h3 != null ? k.a(h3) : null, Double.valueOf(d), valueOf, playbackActionMethod2, audioState, map3, map4, gestureType2, g, str2, map2);
            }
            map = srlVar.r;
        }
        map2 = map;
        H h32 = h2;
        if (bVar2 == null) {
        }
        return new AnalyticsPropsStory((String) ilmVar.g.getValue(), storyModel.id, storyModel.title, srlVar.a, srlVar.o, Integer.valueOf(indexOf), Integer.valueOf(storyModel.g.size()), eventNavigationType2, eventNavigationDirection2, bVar2 == null ? k.b(bVar2) : null, h32 != null ? k.a(h32) : null, Double.valueOf(d), valueOf, playbackActionMethod2, audioState, map3, map4, gestureType2, g, str2, map2);
    }

    public static final void d(ilm ilmVar, EventActionName eventActionName, AnalyticsPropsInteraction analyticsPropsInteraction) {
        ilmVar.getClass();
        eventActionName.getClass();
        analyticsPropsInteraction.getClass();
        spm.postEvent$default(cwm.a, eventActionName, EventCategoryType.INTERACTION, null, null, null, null, null, null, analyticsPropsInteraction, 252, null);
    }

    public static final void e(ilm ilmVar, EventActionName eventActionName, AnalyticsPropsStory analyticsPropsStory) {
        ilmVar.getClass();
        eventActionName.getClass();
        analyticsPropsStory.getClass();
        spm.postEvent$default(cwm.a, eventActionName, EventCategoryType.STORY, i(ilmVar), analyticsPropsStory, null, null, null, null, null, 496, null);
    }

    public static final void f(ilm ilmVar, EventNavigationDirection eventNavigationDirection) {
        eventNavigationDirection.getClass();
        n4m D = ilmVar.D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.d) {
            e(ilmVar, EventActionName.STORY_PAGE_EXIT, createStoryPlayerProps$default(ilmVar, (gim.d) gimVar, ilmVar.F() == 100 ? EventNavigationType.AUTOMATIC : EventNavigationType.MANUAL, eventNavigationDirection, null, null, null, true, null, null, null, 952, null));
        } else if (gimVar instanceof gim.a) {
            c(ilmVar, EventActionName.AD_EXIT, createStoryPlayerAdProps$default(ilmVar, (gim.a) gimVar, null, null, true, true, null, 38, null));
        }
    }

    public static final void g(ilm ilmVar, H h) {
        h.getClass();
        n4m D = ilmVar.D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.d) {
            e(ilmVar, EventActionName.STORY_EXIT, createStoryPlayerProps$default(ilmVar, (gim.d) gimVar, null, null, null, h, null, false, null, null, null, 1006, null));
        }
    }

    public static final void h(ilm ilmVar) {
        n4m D = ilmVar.D();
        gim gimVar = D != null ? D.b : null;
        if (gimVar instanceof gim.d) {
            gim.d dVar = (gim.d) gimVar;
            B b = ilmVar.w0;
            e(ilmVar, EventActionName.STORY_START, createStoryPlayerProps$default(ilmVar, dVar, null, null, b != null ? b.b : null, null, null, false, null, null, StoryLocalizationType.STORY, 502, null));
            gzk gzkVar = gzk.a;
            gzk.e(ilmVar.C(), BlazePlayerType.STORIES, new BlazePlayerEvent.OnStoryStart(new OnStoryStartParams(dVar.a.id)), ilmVar.j);
        }
    }

    public static final AnalyticsPropsReferring i(ilm ilmVar) {
        ilmVar.getClass();
        WidgetType widgetType = ilmVar.h;
        return new AnalyticsPropsReferring(ilmVar.H(), widgetType != null ? widgetType.getValue() : null, ilmVar.k);
    }
}
