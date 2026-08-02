package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class raj {
    public final q5b a;
    public final tbj b;
    public final wcj c;
    public final boolean d;
    public final boolean e;
    public final oej f;
    public final nnd g;
    public final aak h;
    public final gl4 i;
    public final Function1 j;
    public final int k;

    public raj(q5b q5bVar, tbj tbjVar, wcj wcjVar, boolean z, boolean z2, oej oejVar, nnd nndVar, aak aakVar, gl4 gl4Var, Function1 function1, int i) {
        this.a = q5bVar;
        this.b = tbjVar;
        this.c = wcjVar;
        this.d = z;
        this.e = z2;
        this.f = oejVar;
        this.g = nndVar;
        this.h = aakVar;
        this.i = gl4Var;
        this.j = function1;
        this.k = i;
    }

    public final void a(List list) {
        fp4 fp4Var = this.a.d;
        ArrayList U0 = CollectionsKt.U0(list);
        U0.add(0, new i38());
        this.j.invoke(fp4Var.f(U0));
    }
}
