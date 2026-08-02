package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.tub;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class W0 {
    public static void a(AdResponse adResponse, C3906y9 c3906y9, Function1 function1) {
        MetaInfo metaInfo;
        adResponse.getClass();
        function1.getClass();
        Objects.toString(adResponse);
        AdSet adSet = (AdSet) CollectionsKt.a0(0, adResponse.getAdSets());
        if (StringsKt.l0(adResponse.getRequestId()).toString().length() == 0) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3527jj(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2208))));
        }
        if (adResponse.getAdSets().isEmpty()) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C3579lj((short) 54));
        }
        if (adSet == null) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3579lj((short) 2364));
        }
        if (adSet.getAds().isEmpty()) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C3579lj((short) 54));
        }
        com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.a0(0, adSet.getAds());
        String creativeType = (ad == null || (metaInfo = ad.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        LinkedHashMap i = tub.i(new Pair("isRewarded", Boolean.valueOf(adSet.getIsRewarded())));
        if (creativeType != null) {
            i.put("creativeType", creativeType);
        }
        function1.invoke(new C3553kj(i));
        a(adSet.getAdSetId(), adSet.getIsRewarded());
        a(adSet, c3906y9);
    }

    public static void a(String str, boolean z) {
        if (str.length() != 0) {
            return;
        }
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3527jj(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2231), new Pair("isRewarded", Boolean.valueOf(z)))));
    }

    public static void a(AdSet adSet, C3906y9 c3906y9) {
        Objects.toString(adSet);
        if (adSet.getAds().peekFirst() != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            for (Object obj : adSet.getAds()) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) obj;
                if (i == 0) {
                    a(ad);
                } else {
                    try {
                        a(ad);
                        Unit unit = Unit.a;
                    } catch (Y e) {
                        if (c3906y9 != null) {
                            c3906y9.b("AdResponseValidator", "validateAdObjects Exception: (Index: " + i + ") - " + e);
                        }
                        linkedHashSet.add(ad);
                    }
                }
                i = i2;
            }
            adSet.getAds().removeAll(linkedHashSet);
            return;
        }
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3527jj(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2116), new Pair("isRewarded", Boolean.valueOf(adSet.getIsRewarded())))));
    }

    public static void a(com.inmobi.media.ads.network.common.model.Ad ad) {
        Objects.toString(ad);
        if (ad.getImpressionId().length() != 0) {
            String markupType = ad.getMarkupType();
            markupType.getClass();
            if ((markupType.equals("html") || markupType.equals("inmobiJson") || markupType.equals("htmlUrl")) && !Intrinsics.c(ad.getMarkupType(), "unknown")) {
                try {
                    ad.getPubContent().a();
                    return;
                } catch (IllegalArgumentException unused) {
                    throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3527jj(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2163))));
                }
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3527jj(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2163))));
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2230);
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3527jj(hashMap));
    }
}
