package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.々, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0969 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0963 f3194;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3195;

    public C0969(C0963 c0963, Activity activity) {
        this.f3194 = c0963;
        this.f3195 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C1000 c1000 = this.f3194.f3183.f3090;
        String decrypt = StringFog.decrypt("c0/elkZ9cTdmVNKRUEY=\n", "FSC94zUiA1I=\n");
        c1000.getClass();
        AbstractC1008.m611(new C1002(c1000, decrypt));
        this.f3194.f3183.m556(StringFog.decrypt("03f4Rm0qf13GbPRBexE=\n", "tRibMx51DTg=\n"), C0963.m596(this.f3194, this.f3195));
    }
}
