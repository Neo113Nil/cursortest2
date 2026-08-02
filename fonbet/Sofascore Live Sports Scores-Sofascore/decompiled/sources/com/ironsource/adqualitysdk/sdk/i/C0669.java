package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒲ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0669 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0666 f2277;

    public C0669(C0666 c0666) {
        this.f2277 = c0666;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ironsource.adqualitysdk.sdk.i.ᒯ] */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0666 c0666 = this.f2277;
        C0558 c0558 = c0666.f2270;
        Context context = c0666.f2274;
        ArrayList arrayList = c0666.f2273;
        ArrayList arrayList2 = c0666.f2272;
        C0674 c0674 = c0666.f2271;
        String str = C0558.f1828;
        c0558.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC0706 abstractC0706 = (AbstractC0706) arrayList.remove(0);
        String str2 = (String) arrayList2.remove(0);
        if (!arrayList.isEmpty()) {
            c0674 = new C0666(c0558, context, arrayList, arrayList2, c0674);
        }
        AbstractC1008.m610(new C0664(c0558, str2, context, abstractC0706, c0674));
    }
}
