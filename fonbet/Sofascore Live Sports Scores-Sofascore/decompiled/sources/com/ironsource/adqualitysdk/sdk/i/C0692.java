package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓛ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0692 extends AbstractRunnableC0606 {

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final /* synthetic */ C0558 f2340;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0433 f2341;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ String f2342;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0606 f2343;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2344;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2345;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0706 f2346;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0845 f2347;

    public C0692(C0558 c0558, C0845 c0845, AbstractC0706 abstractC0706, String str, boolean z, AbstractRunnableC0606 abstractRunnableC0606, String str2, AbstractC0433 abstractC0433, Context context) {
        this.f2340 = c0558;
        this.f2347 = c0845;
        this.f2346 = abstractC0706;
        this.f2345 = str;
        this.f2344 = z;
        this.f2343 = abstractRunnableC0606;
        this.f2342 = str2;
        this.f2341 = abstractC0433;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0527 c0527;
        boolean mo216;
        String str;
        String str2;
        AbstractRunnableC0606 abstractRunnableC0606;
        AbstractRunnableC0606 abstractRunnableC06062;
        if (this.f2340.f1842.get() || this.f2347 == null || C0558.m357(this.f2340).contains(this.f2346) || (c0527 = this.f2340.f1833) == null) {
            return;
        }
        AbstractC1008.m610(new C0534(c0527, this.f2345, this.f2347, this.f2344));
        C0845 c0845 = this.f2347;
        synchronized (c0845) {
            mo216 = c0845.f2789.mo216();
        }
        if (!mo216 && (abstractRunnableC06062 = this.f2343) != null) {
            AbstractC1008.m614(abstractRunnableC06062);
        }
        C0558 c0558 = this.f2340;
        C0845 c08452 = this.f2347;
        c0558.getClass();
        String m513 = c08452.m513();
        if (m513 != null && AbstractC1067.m635(IronSourceAdQuality.getSDKVersion(), m513) < 0) {
            AbstractC1008.m610(new C0731(this));
            return;
        }
        String decrypt = StringFog.decrypt("7jGUuMiWGB7fE5u4zJIJAw==\n", "rV761q31bHE=\n");
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("i6KrpykpSNG4pay0YA==\n", "wszC00BIJLg=\n"));
        ceo.g(this.f2342, "++PVPEfVCBi4/t4/TcIZV6mx\n", sb, "25GwUSihbTg=\n");
        if (this.f2344) {
            str = "zzkA+pRqgro=\n";
            str2 = "51phmfwP5pM=\n";
        } else {
            str = "+Wto7WLd7Fr4\n";
            str2 = "0Q0NmQG1iT4=\n";
        }
        sb.append(StringFog.decrypt(str, str2));
        String sb2 = sb.toString();
        int i = AbstractC0962.f3182;
        String m255 = AbstractC0424.m255("inWsaA==\n", "2SfgSOtdcKs=\n", new StringBuilder(), decrypt);
        AbstractC0420.m253(m255, m255, sb2, false);
        AbstractC0433 abstractC0433 = this.f2341;
        HashMap mo116 = abstractC0433.mo116();
        abstractC0433.f1243 = mo116;
        mo116.put(AbstractC0433.f1239, new C0459(abstractC0433));
        abstractC0433.f1243.put(AbstractC0433.f1238, new C0438(abstractC0433));
        abstractC0433.f1243.put(AbstractC0433.f1237, new C0436(abstractC0433));
        if (this.f2347.m512() && (abstractRunnableC0606 = this.f2343) != null) {
            AbstractC1008.m614(abstractRunnableC0606);
        }
        if (C0808.m476().m485()) {
            return;
        }
        C0558 c05582 = this.f2340;
        C0845 c08453 = this.f2347;
        String str3 = this.f2342;
        if (!c05582.f1842.get()) {
            String str4 = c08453.f2792.f3076;
            C0527 c05272 = c05582.f1833;
            if (c05272 != null) {
                AbstractC1008.m610(new C0536(c05272, str4, EnumC0546.f1807));
                AbstractC1008.m610(new C0788(c05582, c08453, str4, str3));
            }
        }
        if (this.f2340.m374(this.f2347.f2792.f3076)) {
            return;
        }
        C0558.m357(this.f2340).add(this.f2346);
    }
}
