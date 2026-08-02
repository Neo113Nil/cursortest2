package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.sofascore.model.firebase.AdType;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d4d implements NativeAd.OnNativeAdLoadedListener {
    public final /* synthetic */ h4d a;
    public final /* synthetic */ lj2 b;
    public final /* synthetic */ f4d c;
    public final /* synthetic */ fsf d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ String f;
    public final /* synthetic */ AdType.Native g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;

    public d4d(h4d h4dVar, lj2 lj2Var, f4d f4dVar, fsf fsfVar, Context context, String str, AdType.Native r7, String str2, int i) {
        this.a = h4dVar;
        this.b = lj2Var;
        this.c = f4dVar;
        this.d = fsfVar;
        this.e = context;
        this.f = str;
        this.g = r7;
        this.h = str2;
        this.i = i;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        Bundle responseExtras;
        String string;
        nativeAd.getClass();
        int compareTo = this.a.a.getLifecycle().b().compareTo(e6b.d);
        Long l = null;
        f4d f4dVar = this.c;
        lj2 lj2Var = this.b;
        if (compareTo < 0) {
            nativeAd.destroy();
            if (lj2Var.r() instanceof oed) {
                f4dVar.invoke(null);
                return;
            }
            return;
        }
        if (!(lj2Var.r() instanceof oed)) {
            nativeAd.destroy();
            return;
        }
        nativeAd.setOnPaidEventListener(new c4d(this.e, this.f, this.g, this.h, this.i));
        ResponseInfo responseInfo = nativeAd.getResponseInfo();
        if (responseInfo != null && (responseExtras = responseInfo.getResponseExtras()) != null && (string = responseExtras.getString("line_item_id")) != null) {
            l = StringsKt.k0(string);
        }
        this.d.a = l;
        f4dVar.invoke(nativeAd);
    }
}
