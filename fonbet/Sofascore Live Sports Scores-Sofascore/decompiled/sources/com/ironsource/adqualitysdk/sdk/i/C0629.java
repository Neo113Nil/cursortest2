package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐩ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0629 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0620 f2064;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ EnumC0623 f2065;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2066;

    public C0629(C0620 c0620, String str, EnumC0623 enumC0623) {
        this.f2064 = c0620;
        this.f2066 = str;
        this.f2065 = enumC0623;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        synchronized (this.f2064) {
            this.f2064.f2050.put(this.f2066, this.f2065);
        }
    }
}
