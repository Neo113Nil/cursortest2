package defpackage;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.internal.ads.zzeem;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l3o extends AdListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ BaseAdView b;
    public final /* synthetic */ zzeem c;

    public l3o(zzeem zzeemVar, String str, BaseAdView baseAdView) {
        this.a = str;
        this.b = baseAdView;
        Objects.requireNonNull(zzeemVar);
        this.c = zzeemVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.c.F4(zzeem.I4(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        String str = this.a;
        this.c.E4(this.b, str);
    }
}
