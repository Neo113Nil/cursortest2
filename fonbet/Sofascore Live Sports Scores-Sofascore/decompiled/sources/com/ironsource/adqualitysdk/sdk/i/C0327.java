package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˎ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0327 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C3963a f804;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f805;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f806;

    public C0327(C3963a c3963a, Activity activity, View view) {
        this.f804 = c3963a;
        this.f806 = activity;
        this.f805 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        this.f804.f119.clear();
        C3963a c3963a = this.f804;
        Activity activity = this.f806;
        View view = this.f805;
        Class cls = c3963a.f121;
        C0323 c0323 = c3963a.f120;
        boolean z = c0323.f788;
        List list = c0323.f784;
        List list2 = c0323.f782;
        ArrayList arrayList = c3963a.f119;
        if (view != null) {
            AbstractC3964b.m88(view, cls, null, false, z, list, list2, arrayList);
        } else {
            AbstractC3964b.m91(activity, cls, -1, null, false, z, list, list2, arrayList);
        }
        View view2 = this.f805;
        C3963a c3963a2 = this.f804;
        Class cls2 = c3963a2.f121;
        C0323 c03232 = c3963a2.f120;
        if (AbstractC3964b.m93(view2, cls2, null, c03232.f784, c03232.f782)) {
            this.f804.f119.add(this.f805);
        }
        ArrayList arrayList2 = new ArrayList(this.f804.f119);
        C3963a c3963a3 = this.f804;
        if (c3963a3.f120.f785) {
            AbstractC1008.m612(new C0328(this, arrayList2));
        } else {
            C3963a.m77(c3963a3, arrayList2);
        }
    }
}
