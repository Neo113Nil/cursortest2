package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.х, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0395 implements InterfaceC0795 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0393 f1149;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0451 f1150;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0778 f1151;

    public C0395(C0393 c0393, InterfaceC0778 interfaceC0778, C0451 c0451) {
        this.f1149 = c0393;
        this.f1151 = interfaceC0778;
        this.f1150 = c0451;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0795
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo230() {
        C0331 c0331 = this.f1149.f1143.f1142;
        synchronized (c0331) {
            c0331.f812.remove(this);
        }
        C0392 c0392 = this.f1149.f1143;
        InterfaceC0778 interfaceC0778 = this.f1151;
        C0451 c0451 = this.f1150;
        if (c0392.f1141) {
            AbstractC0420.m243(C0392.f1140, StringFog.decrypt("2wX+DWXTyzz8GPoNbp3ac6gD/R5l1stO7RvmDXnJjmvgD/1IRNjaa+cY+CVr08977RizH2vOjm/g\nH+cMZcrA\n", "iGqTaAq9rhw=\n"));
            return;
        }
        C0393 c0393 = new C0393(c0392, interfaceC0778, c0451);
        String str = AbstractC0370.f1112;
        try {
            Executors.newSingleThreadExecutor().execute(c0393);
        } catch (Throwable th) {
            AbstractC0356.m204(AbstractC0370.f1112, StringFog.decrypt("624OELRd4FDLfwkLrxPiCM9vBRGlXfFJ3Xc=\n", "rhx8f8Z9hSg=\n"), th, false);
        }
    }
}
