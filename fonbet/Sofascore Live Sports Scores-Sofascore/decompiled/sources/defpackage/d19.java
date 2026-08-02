package defpackage;

import android.content.Context;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.sofascore.model.firebase.AdType;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d19 extends RewardedAdLoadCallback {
    public final Context a;
    public final String b;
    public final wcd c;
    public final boolean d;
    public final String e;
    public final AdType.RewardedInterstitial f;
    public final d4a g;

    public d19(Context context, String str, wcd wcdVar, boolean z, String str2, AdType.RewardedInterstitial rewardedInterstitial, x09 x09Var) {
        rewardedInterstitial.getClass();
        this.a = context;
        this.b = str;
        this.c = wcdVar;
        this.d = z;
        this.e = str2;
        this.f = rewardedInterstitial;
        this.g = new d4a(x09Var);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        loadAdError.getClass();
        ru ruVar = ru.GOOGLE;
        int code = loadAdError.getCode();
        String message = loadAdError.getMessage();
        message.getClass();
        nv.j(this.a, this.e, this.f, ruVar, this.b, code, message, qu.LOAD, null, null, 768);
        d4a d4aVar = this.g;
        Function1 function1 = (Function1) d4aVar.b;
        d4aVar.b = null;
        Function1 function12 = function1;
        if (function12 != null) {
            p2g p2gVar = w2g.b;
            String message2 = loadAdError.getMessage();
            loadAdError.getCode();
            this.b.getClass();
            function12.invoke(new w2g(new u2g(new n4g(message2))));
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        RewardedAd rewardedAd2 = rewardedAd;
        rewardedAd2.getClass();
        if (this.d) {
            ServerSideVerificationOptions.Builder builder = new ServerSideVerificationOptions.Builder();
            ia0 ia0Var = ia0.q;
            ServerSideVerificationOptions build = builder.setUserId(ok3.p().e().getId()).build();
            build.getClass();
            rewardedAd2.setServerSideVerificationOptions(build);
        }
        nv.e(this.a, this.e, this.f, ru.GOOGLE, this.b, null, null, null, 224);
        d4a d4aVar = this.g;
        Function1 function1 = (Function1) d4aVar.b;
        d4aVar.b = null;
        Function1 function12 = function1;
        if (function12 != null) {
            p2g p2gVar = w2g.b;
            function12.invoke(new w2g(new g19(rewardedAd2, this.c, this.e, this.f)));
        }
    }
}
