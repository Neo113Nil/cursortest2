package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.fc6;
import defpackage.iol;
import defpackage.lm5;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Z {
    public final C3665p1 a;
    public final X b;
    public final C3691q1 c;
    public final AdConfig d;
    public final C3730rf e;
    public final Ok f;
    public final boolean g;

    public Z(C3665p1 c3665p1, Ac ac) {
        c3665p1.getClass();
        ac.getClass();
        this.a = c3665p1;
        this.b = new X(c3665p1.d, c3665p1.f);
        C3691q1 c3691q1 = c3665p1.a;
        this.c = c3691q1;
        AdConfig adConfig = c3691q1.b;
        this.d = adConfig;
        this.e = new C3782tf(c3665p1.b, c3665p1.c).a();
        Integer num = ac.d;
        long intValue = num != null ? num.intValue() : 15000;
        Integer num2 = ac.d;
        this.f = new Ok(intValue, num2 != null ? num2.intValue() : 15000, ac.d != null ? r9.intValue() : 15000);
        this.g = adConfig.getApplyGzipReq();
    }

    public final Object a(X6 x6) {
        C3906y9 c3906y9 = this.a.c;
        if (c3906y9 != null) {
            c3906y9.a("AdFetchManager", "fetchAd Called");
        }
        String C = fc6.C();
        C3293ah c3293ah = this.c.a;
        Map map = c3293ah.d;
        long j = c3293ah.a;
        Context context = this.a.b;
        context.getClass();
        String str = context instanceof Activity ? "activity" : "others";
        this.c.getClass();
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return new C3921yo(new C3664p0(this.d.getUrl(), new Zk(this.d.getIncludeIds()), new C3612n0(C, map, j, str, IronSourceConstants.EVENTS_NATIVE, lm5Var, this.c.a.c, this.d.getRendering().getEnablePubMuteControl() && AbstractC3424fj.f), this.f, this.e, this.a.c, this.g).a(), this.a.c).a(new iol(this, 0), x6);
    }

    public static final Unit a(Z z, W w) {
        w.getClass();
        C3906y9 c3906y9 = z.a.c;
        if (c3906y9 != null) {
            c3906y9.a("AdFetchManager", "adFetchEvent " + w);
        }
        z.b.a(w);
        return Unit.a;
    }
}
