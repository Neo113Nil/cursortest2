package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐹ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0637 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0558 f2168;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f2169;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Context f2170;

    public C0637(C0558 c0558, Context context, LinkedHashMap linkedHashMap) {
        this.f2168 = c0558;
        this.f2170 = context;
        this.f2169 = linkedHashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f2168.f1834 = AbstractC0274.m142().mo152();
        this.f2168.m371(this.f2170, this.f2169, new C0649(this));
        AbstractC0274 m142 = AbstractC0274.m142();
        C0647 c0647 = new C0647(this);
        C0346 c0346 = (C0346) m142;
        Handler handler = c0346.f860;
        if (handler != null) {
            handler.post(new C0382(c0346, c0647));
        }
    }
}
