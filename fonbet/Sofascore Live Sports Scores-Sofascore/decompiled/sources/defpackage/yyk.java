package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.vungle.ads.AdConfig;
import com.vungle.ads.RewardedAd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yyk implements nyk {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AdConfig c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ zyk f;

    public yyk(zyk zykVar, Context context, String str, AdConfig adConfig, String str2, String str3) {
        this.f = zykVar;
        this.a = context;
        this.b = str;
        this.c = adConfig;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.nyk
    public final void a(AdError adError) {
        adError.toString();
        this.f.a.onFailure(adError);
    }

    @Override // defpackage.nyk
    public final void b() {
        zyk zykVar = this.f;
        zykVar.d.getClass();
        Context context = this.a;
        context.getClass();
        String str = this.b;
        str.getClass();
        RewardedAd rewardedAd = new RewardedAd(context, str, this.c);
        zykVar.c = rewardedAd;
        rewardedAd.setAdListener(zykVar);
        zykVar.c.setAdapterAdFormat("VungleRtbRewardedAd");
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            zykVar.c.setUserId(str2);
        }
        zykVar.c.load(this.e);
    }
}
