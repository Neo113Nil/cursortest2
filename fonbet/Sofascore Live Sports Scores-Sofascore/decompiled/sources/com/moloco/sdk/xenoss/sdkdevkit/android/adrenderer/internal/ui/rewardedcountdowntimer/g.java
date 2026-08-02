package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import defpackage.n55;
import defpackage.p6b;
import defpackage.u6b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g implements n55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6b b;
    public final /* synthetic */ p6b c;

    public /* synthetic */ g(u6b u6bVar, p6b p6bVar, int i) {
        this.a = i;
        this.b = u6bVar;
        this.c = p6bVar;
    }

    @Override // defpackage.n55
    public final void d() {
        int i = this.a;
        p6b p6bVar = this.c;
        u6b u6bVar = this.b;
        switch (i) {
            case 0:
                u6bVar.getLifecycle().d((e) p6bVar);
                break;
            default:
                u6bVar.getLifecycle().d((e) p6bVar);
                break;
        }
    }
}
