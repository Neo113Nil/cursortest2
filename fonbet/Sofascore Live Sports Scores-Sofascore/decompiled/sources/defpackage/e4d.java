package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e4d extends AdListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AdType.Native c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ lj2 f;
    public final /* synthetic */ f4d g;
    public final /* synthetic */ fsf h;

    public e4d(Context context, String str, AdType.Native r3, String str2, int i, lj2 lj2Var, f4d f4dVar, fsf fsfVar) {
        this.a = context;
        this.b = str;
        this.c = r3;
        this.d = str2;
        this.e = i;
        this.f = lj2Var;
        this.g = f4dVar;
        this.h = fsfVar;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        nv.i(this.a, this.b, this.c, ru.GOOGLE, this.d, null, Integer.valueOf(this.e), 32);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        loadAdError.getClass();
        ru ruVar = ru.GOOGLE;
        int code = loadAdError.getCode();
        String message = loadAdError.getMessage();
        message.getClass();
        nv.j(this.a, this.b, this.c, ruVar, this.d, code, message, qu.LOAD, null, Integer.valueOf(this.e), NotificationCompat.FLAG_LOCAL_ONLY);
        if (this.f.r() instanceof oed) {
            this.g.invoke(null);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        nv.k(this.a, this.b, this.c, ru.GOOGLE, this.d, null, (Long) this.h.a, Integer.valueOf(this.e));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        nv.e(this.a, this.b, this.c, ru.GOOGLE, this.d, null, null, Integer.valueOf(this.e), 96);
    }
}
