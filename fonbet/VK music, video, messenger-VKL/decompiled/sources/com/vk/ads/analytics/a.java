package com.vk.ads.analytics;

import com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsAdsStat$TypeFeedSdkAdClick;
import com.vk.stat.scheme.MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo;
import com.vk.stat.scheme.MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest;
import com.vk.stat.scheme.MobileOfficialAppsAdsStat$TypeFeedSdkAdView;
import com.vk.stat.scheme.MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.av50;
import xsna.fv50;
import xsna.iid0;
import xsna.nsd0;
import xsna.und0;

/* compiled from: NativeAdUserLevelAnalyticsSenderImpl.kt */
/* loaded from: classes14.dex */
public final class a implements NativeAdUserLevelAnalyticsSender {
    public static final a a = new a();

    /* compiled from: NativeAdUserLevelAnalyticsSenderImpl.kt */
    /* renamed from: com.vk.ads.analytics.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0372a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NativeAdUserLevelAnalyticsSender.ShowAttributionCondition.values().length];
            try {
                iArr[NativeAdUserLevelAnalyticsSender.ShowAttributionCondition.PAYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeAdUserLevelAnalyticsSender.ShowAttributionCondition.PLATFORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeAdType.values().length];
            try {
                iArr2[NativeAdType.APPLOVIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NativeAdType.YANDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo.RequestDestination d(NativeAdType nativeAdType) {
        int i = C0372a.$EnumSwitchMapping$1[nativeAdType.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo.RequestDestination.APPLOVIN_NATIVE;
        }
        if (i == 2) {
            return MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo.RequestDestination.YANDEX_NATIVE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo e(av50 av50Var, int i) {
        MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.EcpmDefinition ecpmDefinition;
        String str = av50Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -623607748) {
                if (hashCode != 96946943) {
                    if (hashCode == 655944390 && str.equals("publisher_defined")) {
                        ecpmDefinition = MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.EcpmDefinition.PUBLISHER_DEFINED;
                    }
                } else if (str.equals("exact")) {
                    ecpmDefinition = MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.EcpmDefinition.EXACT;
                }
            } else if (str.equals("estimated")) {
                ecpmDefinition = MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.EcpmDefinition.ESTIMATED;
            }
            return new MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo((float) av50Var.b, ecpmDefinition, i, av50Var.c, av50Var.d);
        }
        ecpmDefinition = MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.EcpmDefinition.UNDEFINED;
        return new MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo((float) av50Var.b, ecpmDefinition, i, av50Var.c, av50Var.d);
    }

    @Override // com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender
    public final void a(fv50 fv50Var, av50 av50Var, boolean z, long j) {
        MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo = new MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo(d(fv50Var.a), fv50Var.b);
        List singletonList = av50Var != null ? Collections.singletonList(e(av50Var, fv50Var.d)) : null;
        if (singletonList == null) {
            singletonList = EmptyList.b;
        }
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.FEED_ITEM, null, null, null, fv50Var.c, null, 46, null), null, new MobileOfficialAppsAdsStat$TypeFeedSdkAdRequest(mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo, j, 1, z ? 1 : 0, singletonList), 2);
        iid0 iid0Var = new iid0();
        UiTracker uiTracker = UiTracker.a;
        iid0Var.f = UiTracker.c();
        iid0Var.g = b;
        iid0Var.q();
    }

    @Override // com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender
    public final void b(fv50 fv50Var, av50 av50Var, NativeAdUserLevelAnalyticsSender.ShowAttributionCondition showAttributionCondition) {
        MobileOfficialAppsAdsStat$TypeFeedSdkAdView.ShowAttributionCondition showAttributionCondition2;
        MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo = new MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo(d(fv50Var.a), fv50Var.b);
        MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo e = e(av50Var, fv50Var.d);
        int i = C0372a.$EnumSwitchMapping$0[showAttributionCondition.ordinal()];
        if (i == 1) {
            showAttributionCondition2 = MobileOfficialAppsAdsStat$TypeFeedSdkAdView.ShowAttributionCondition.PAYED;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            showAttributionCondition2 = MobileOfficialAppsAdsStat$TypeFeedSdkAdView.ShowAttributionCondition.PLATFORM;
        }
        SchemeStat$TypeView b = SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.FEED_ITEM, null, null, null, fv50Var.c, null, 46, null), "0", "0", null, new MobileOfficialAppsAdsStat$TypeFeedSdkAdView(mobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo, e, showAttributionCondition2), 8);
        nsd0 nsd0Var = new nsd0();
        UiTracker uiTracker = UiTracker.a;
        nsd0Var.f = UiTracker.c();
        nsd0Var.g = b;
        nsd0Var.q();
    }

    @Override // com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender
    public final void c(fv50 fv50Var, av50 av50Var) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.FEED_ITEM, null, null, null, fv50Var.c, null, 46, null), new MobileOfficialAppsAdsStat$TypeFeedSdkAdClick(new MobileOfficialAppsAdsStat$TypeFeedSdkRequestInfo(d(fv50Var.a), fv50Var.b), e(av50Var, fv50Var.d)), 2);
        und0 und0Var = new und0();
        UiTracker uiTracker = UiTracker.a;
        und0Var.f = UiTracker.c();
        und0Var.g = b;
        und0Var.q();
    }
}
