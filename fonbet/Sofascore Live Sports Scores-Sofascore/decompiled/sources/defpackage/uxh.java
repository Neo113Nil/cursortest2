package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class uxh {
    public final Function2 a;
    public final Function2 b;
    public final Function2 c;
    public final Function2 d;
    public final Function2 e;
    public final Function2 f;
    public final Function2 g;
    public final Function2 h;

    public uxh(Function2 function2, Function2 function22, Function2 function23, int i) {
        Function2 function24 = qxh.j;
        Function2 function25 = qxh.b;
        Function2 function26 = qxh.m;
        Function2 function27 = qxh.d;
        Function2 function28 = qxh.e;
        function24 = (i & 2) != 0 ? grh.y : function24;
        function25 = (i & 8) != 0 ? grh.z : function25;
        function26 = (i & 32) != 0 ? grh.A : function26;
        function27 = (i & 64) != 0 ? grh.B : function27;
        function28 = (i & 128) != 0 ? grh.C : function28;
        this.a = function2;
        this.b = function24;
        this.c = function22;
        this.d = function25;
        this.e = function23;
        this.f = function26;
        this.g = function27;
        this.h = function28;
    }

    public final long a(boolean z, of3 of3Var) {
        if (z) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(889862830);
            long j = ((r13) this.e.invoke(av8Var, 0)).a;
            av8Var.s(false);
            return j;
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(889905734);
        long j2 = ((r13) this.f.invoke(av8Var2, 0)).a;
        av8Var2.s(false);
        return j2;
    }

    public final long b(boolean z, of3 of3Var) {
        if (z) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(-594887674);
            long j = ((r13) this.a.invoke(av8Var, 0)).a;
            av8Var.s(false);
            return j;
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(-594841794);
        long j2 = ((r13) this.b.invoke(av8Var2, 0)).a;
        av8Var2.s(false);
        return j2;
    }
}
