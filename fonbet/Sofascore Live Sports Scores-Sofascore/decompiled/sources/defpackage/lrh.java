package defpackage;

import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class lrh {
    public final Function2 a;
    public final Function2 b;
    public final Function2 c;
    public final Function2 d;
    public final Function2 e;
    public final Function2 f;
    public final Function2 g;
    public final Function2 h;
    public final Function2 i;
    public final Function2 j;
    public final Function2 k;
    public final float l;

    public lrh(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, int i) {
        Function2 function29 = grh.h;
        xph xphVar = xph.y;
        function25 = (i & 16) != 0 ? xph.l : function25;
        xph xphVar2 = xph.m;
        function29 = (i & 64) != 0 ? xph.n : function29;
        function28 = (i & 512) != 0 ? xph.o : function28;
        xphVar = (i & 1024) != 0 ? xph.p : xphVar;
        float f = (i & a.o) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 2.0f;
        this.a = function2;
        this.b = function22;
        this.c = function23;
        this.d = function24;
        this.e = function25;
        this.f = xphVar2;
        this.g = function29;
        this.h = function26;
        this.i = function27;
        this.j = function28;
        this.k = xphVar;
        this.l = f;
    }

    public final long a(boolean z, av8 av8Var) {
        Function2 function2;
        if (z) {
            av8Var.d0(-125829201);
            function2 = this.g;
        } else {
            av8Var.d0(-125828345);
            function2 = this.f;
        }
        long j = ((r13) function2.invoke(av8Var, 0)).a;
        av8Var.s(false);
        return j;
    }

    public final long b(boolean z, av8 av8Var) {
        Function2 function2;
        if (z) {
            av8Var.d0(935067799);
            function2 = this.b;
        } else {
            av8Var.d0(935068751);
            function2 = this.a;
        }
        long j = ((r13) function2.invoke(av8Var, 0)).a;
        av8Var.s(false);
        return j;
    }

    public final long c(boolean z, boolean z2, av8 av8Var) {
        if (z) {
            av8Var.d0(-2100548610);
            long j = ((r13) this.i.invoke(av8Var, 0)).a;
            av8Var.s(false);
            return j;
        }
        if (z2) {
            av8Var.d0(-2100545866);
            long j2 = ((r13) this.h.invoke(av8Var, 0)).a;
            av8Var.s(false);
            return j2;
        }
        av8Var.d0(-2100547138);
        long j3 = ((r13) this.j.invoke(av8Var, 0)).a;
        av8Var.s(false);
        return j3;
    }
}
