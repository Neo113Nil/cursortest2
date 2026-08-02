package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴒ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0798 extends AbstractRunnableC0606 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0558 f2545;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0631 f2546;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ List f2547;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2548;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f2549;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2550;

    public C0798(C0558 c0558, String str, Context context, String str2, List list, C0631 c0631) {
        this.f2545 = c0558;
        this.f2550 = str;
        this.f2549 = context;
        this.f2548 = str2;
        this.f2547 = list;
        this.f2546 = c0631;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        AbstractC0420.m250(StringFog.decrypt("REB0pqsz5W91Ynumrzf0cg==\n", "By8ayM5QkQA=\n"), StringFog.decrypt("Ac9FtJgBFjsyyEKn0QMVPCbET7SeElo=\n", "SKEswPFgelI=\n") + this.f2550);
        try {
            C0558 c0558 = this.f2545;
            Context context = this.f2549;
            String str = this.f2548;
            String str2 = this.f2550;
            List list = this.f2547;
            C0631 c0631 = this.f2546;
            c0558.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c0558.m370(context, str, str2, (AbstractC0706) it.next(), c0631);
            }
        } catch (Throwable th) {
            C0527 c0527 = this.f2545.f1833;
            if (c0527 != null) {
                AbstractC1008.m610(new C0539(c0527, this.f2550, EnumC0552.f1816));
            }
            HashMap m356 = C0558.m356(this.f2545);
            String str3 = this.f2548;
            Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            m356.put(str3, th2.toString());
            AbstractC0356.m205(StringFog.decrypt("HkCGIHWSvfcvYokgcZas6g==\n", "XS/oThDxyZg=\n"), StringFog.decrypt("nEGBzQPrmy+8UofLH6zYPrZdnccSv5cv+Q==\n", "2TPzonHL+F0=\n") + this.f2550, th, true, true, false);
        }
    }
}
