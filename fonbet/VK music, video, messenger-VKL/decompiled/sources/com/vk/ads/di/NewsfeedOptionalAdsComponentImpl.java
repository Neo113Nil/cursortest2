package com.vk.ads.di;

import com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender;
import com.vk.ads.dto.VkOptionalNativeAdType;
import com.vk.ads.optional.api.di.OptionalAdsFeatureComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.navigation.NavigationDelegateActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aav0;
import xsna.b7m;
import xsna.bav0;
import xsna.c5g;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.fr20;
import xsna.l73;
import xsna.lt80;
import xsna.mq2;
import xsna.nwy;
import xsna.qcy;
import xsna.v100;
import xsna.y9v0;

/* compiled from: NewsfeedOptionalAdsComponentImpl.kt */
/* loaded from: classes14.dex */
public final class NewsfeedOptionalAdsComponentImpl implements NewsfeedOptionalAdsComponent {
    public static final /* synthetic */ qcy<Object>[] d = {new PropertyReference1Impl(NewsfeedOptionalAdsComponentImpl.class, "optionalAdsFeature", "getOptionalAdsFeature()Lcom/vk/ads/optional/api/OptionalAdsFeature;", 0), fp.c(0, NewsfeedOptionalAdsComponentImpl.class, "factoriesProvider", "getFactoriesProvider()Lcom/vk/ads/di/VkOptionalNativeAdFactoriesProvider;", fpf0.a)};
    public final OptionalAdsFeatureComponent a;
    public final nwy b = new nwy(new v100(this, 11));
    public final nwy c = new nwy(new fr20(this, 7));

    /* compiled from: NewsfeedOptionalAdsComponentImpl.kt */
    public static final class a implements b7m<NewsfeedOptionalAdsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new NewsfeedOptionalAdsComponentImpl((OptionalAdsFeatureComponent) e7mVar.a(fpf0.a(OptionalAdsFeatureComponent.class)));
        }
    }

    /* compiled from: NewsfeedOptionalAdsComponentImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkOptionalNativeAdType.values().length];
            try {
                iArr[VkOptionalNativeAdType.APPLOVIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NewsfeedOptionalAdsComponentImpl(OptionalAdsFeatureComponent optionalAdsFeatureComponent) {
        this.a = optionalAdsFeatureComponent;
    }

    public final lt80 Df() {
        qcy<Object> qcyVar = d[0];
        return (lt80) this.b.c();
    }

    @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
    public final void Sc() {
        Df().getClass();
    }

    @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
    public final boolean T1(VkOptionalNativeAdType vkOptionalNativeAdType) {
        if (b.$EnumSwitchMapping$0[vkOptionalNativeAdType.ordinal()] == 1) {
            return Df().isInitialized();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
    public final void Wa(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof l73) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((l73) it.next()).getClass();
            arrayList3.add(null);
        }
        Df().getClass();
    }

    @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
    public final NativeAdUserLevelAnalyticsSender d5() {
        return com.vk.ads.analytics.a.a;
    }

    @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
    public final void la() {
        Df().getClass();
    }

    @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
    public final aav0.a m5(VkOptionalNativeAdType vkOptionalNativeAdType) {
        qcy<Object> qcyVar = d[1];
        ((y9v0) this.c.c()).a();
        return null;
    }

    @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
    public final bav0 q4(VkOptionalNativeAdType vkOptionalNativeAdType) {
        qcy<Object> qcyVar = d[1];
        ((y9v0) this.c.c()).b();
        return null;
    }

    @Override // com.vk.ads.di.NewsfeedOptionalAdsComponent
    public final void sa(NavigationDelegateActivity navigationDelegateActivity) {
        Df().a(navigationDelegateActivity, new mq2(9));
    }
}
