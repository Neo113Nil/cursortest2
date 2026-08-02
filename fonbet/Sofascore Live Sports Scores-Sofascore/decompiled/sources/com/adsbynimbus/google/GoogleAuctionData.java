package com.adsbynimbus.google;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.controller.a;
import defpackage.wcd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/adsbynimbus/google/GoogleAuctionData;", "Lcom/google/android/gms/ads/OnPaidEventListener;", "Lwcd;", "ad", "<init>", "(Lwcd;)V", "Lcom/google/android/gms/ads/AdValue;", "p0", "", "onPaidEvent", "(Lcom/google/android/gms/ads/AdValue;)V", "a", "Lwcd;", "getAd", "()Lwcd;", "", "b", "Ljava/lang/String;", "getPrice", "()Ljava/lang/String;", "setPrice", "(Ljava/lang/String;)V", "price", "", a.q, "Z", "getNimbusWin", "()Z", "setNimbusWin", "(Z)V", "nimbusWin", "google_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GoogleAuctionData implements OnPaidEventListener {

    /* renamed from: a, reason: from kotlin metadata */
    public final wcd ad;

    /* renamed from: b, reason: from kotlin metadata */
    public String price;

    /* renamed from: c, reason: from kotlin metadata */
    public boolean nimbusWin;

    public GoogleAuctionData(@NotNull wcd wcdVar) {
        wcdVar.getClass();
        this.ad = wcdVar;
        this.price = Y1.f;
    }

    @NotNull
    public final wcd getAd() {
        return this.ad;
    }

    public final boolean getNimbusWin() {
        return this.nimbusWin;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(@NotNull AdValue p0) {
        p0.getClass();
        this.price = String.valueOf(p0.getValueMicros() / 1000.0f);
    }

    public final void setNimbusWin(boolean z) {
        this.nimbusWin = z;
    }

    public final void setPrice(@NotNull String str) {
        str.getClass();
        this.price = str;
    }
}
