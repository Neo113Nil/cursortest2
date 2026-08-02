package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0799 implements InterfaceC0878 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f2551;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2552;

    public C0799(C1102 c1102, ArrayList arrayList) {
        this.f2551 = c1102;
        this.f2552 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0878
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void mo455(Activity activity) {
        String decrypt = StringFog.decrypt("4xn+ZJr87H3pBMxki+z7\n", "jHe4C/mJny8=\n");
        if (C1102.m649(this.f2551, activity, this.f2552)) {
            String e = ceo.e("HWAXdaITvrwQeRRHqB6uvXI=\n", "XBBnM81wy88=\n", decrypt);
            C1102.m648(this.f2551, e, true, false, Collections.singletonList(activity));
            AbstractC1008.m611(new C0811(this, e, activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0878
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo456(Activity activity) {
        String decrypt = StringFog.decrypt("SV2pzuTqAWpJQJs=\n", "JjPvoYefciY=\n");
        if (C1102.m649(this.f2551, activity, this.f2552)) {
            String e = ceo.e("HWAXdaITvrwQeRRHqB6uvXI=\n", "XBBnM81wy88=\n", decrypt);
            C1102.m648(this.f2551, e, true, false, Collections.singletonList(activity));
            AbstractC1008.m611(new C0811(this, e, activity));
        }
    }
}
