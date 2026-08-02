package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import defpackage.e1d;
import defpackage.o55;
import defpackage.q50;
import defpackage.u6b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6b b;
    public final /* synthetic */ q50 c;
    public final /* synthetic */ e1d d;

    public /* synthetic */ b(u6b u6bVar, q50 q50Var, e1d e1dVar, int i) {
        this.a = i;
        this.b = u6bVar;
        this.c = q50Var;
        this.d = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        e1d e1dVar = this.d;
        q50 q50Var = this.c;
        u6b u6bVar = this.b;
        o55 o55Var = (o55) obj;
        switch (i) {
            case 0:
                o55Var.getClass();
                e eVar = new e(0, q50Var, e1dVar);
                u6bVar.getLifecycle().a(eVar);
                return new g(u6bVar, eVar, 0);
            default:
                o55Var.getClass();
                e eVar2 = new e(1, q50Var, e1dVar);
                u6bVar.getLifecycle().a(eVar2);
                return new g(u6bVar, eVar2, 1);
        }
    }
}
