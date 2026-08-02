package com.adsbynimbus.google;

import com.google.android.gms.ads.ResponseInfo;
import defpackage.ad2;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.kda;
import defpackage.o0g;
import defpackage.oc3;
import defpackage.tm0;
import defpackage.xw3;
import defpackage.z45;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo0g;", "T", "Lcom/adsbynimbus/google/GoogleAuctionData;", "auctionData", "", "notifyNoFill", "(Lo0g;Lcom/adsbynimbus/google/GoogleAuctionData;)V", "Lcom/google/android/gms/ads/ResponseInfo;", "responseInfo", "notifyImpression", "(Lo0g;Lcom/adsbynimbus/google/GoogleAuctionData;Lcom/google/android/gms/ads/ResponseInfo;)V", "google_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DynamicPriceWinLossKt {
    public static final <T extends o0g> void notifyImpression(@NotNull T t, @NotNull GoogleAuctionData googleAuctionData, @Nullable ResponseInfo responseInfo) {
        t.getClass();
        googleAuctionData.getClass();
        ad2 ad2Var = oc3.a;
        hs4 hs4Var = z45.a;
        xw3.L(ad2Var, hq4.c, null, new DynamicPriceWinLossKt$notifyImpression$1(googleAuctionData, t, responseInfo, null), 2);
    }

    public static final <T extends o0g> void notifyNoFill(@NotNull T t, @NotNull GoogleAuctionData googleAuctionData) {
        t.getClass();
        googleAuctionData.getClass();
        kda.I(t, googleAuctionData.getAd(), new tm0(googleAuctionData.getPrice(), null, 6));
    }
}
