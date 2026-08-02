package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ht9 {
    public final Context a;
    public jt9 b;
    public Object c;
    public tti d;
    public lt9 e;
    public String f;
    public boolean g;
    public Map h;
    public String i;
    public CoroutineContext j;
    public CoroutineContext k;
    public CoroutineContext l;
    public nec m;
    public Function1 n;
    public Function1 o;
    public gkh p;
    public jrg q;
    public e3f r;
    public Object s;

    public ht9(nt9 nt9Var, Context context) {
        this.a = context;
        this.b = nt9Var.x;
        this.c = nt9Var.b;
        this.d = nt9Var.c;
        this.e = nt9Var.d;
        this.f = nt9Var.e;
        this.h = nt9Var.f;
        this.i = nt9Var.g;
        kt9 kt9Var = nt9Var.w;
        this.j = kt9Var.a;
        this.k = kt9Var.b;
        this.l = kt9Var.c;
        this.m = nt9Var.o;
        this.n = kt9Var.d;
        this.o = kt9Var.e;
        this.p = kt9Var.f;
        this.q = kt9Var.g;
        this.r = kt9Var.h;
        this.s = nt9Var.v;
    }

    public final nt9 a() {
        Map map;
        tl6 tl6Var;
        Object obj = this.c;
        if (obj == null) {
            obj = oid.a;
        }
        Object obj2 = obj;
        tti ttiVar = this.d;
        lt9 lt9Var = this.e;
        String str = this.f;
        Map map2 = this.h;
        if (Intrinsics.c(map2, Boolean.valueOf(this.g))) {
            map2.getClass();
            map = fcp.o0(i5k.c(map2));
        } else {
            if (!(map2 instanceof Map)) {
                ogj.b();
                return null;
            }
            map = map2;
        }
        Map map3 = map;
        map3.getClass();
        String str2 = this.i;
        jt9 jt9Var = this.b;
        s18 s18Var = jt9Var.a;
        ze2 ze2Var = jt9Var.e;
        ze2 ze2Var2 = jt9Var.f;
        ze2 ze2Var3 = jt9Var.g;
        CoroutineContext coroutineContext = this.j;
        if (coroutineContext == null) {
            coroutineContext = jt9Var.b;
        }
        CoroutineContext coroutineContext2 = this.k;
        if (coroutineContext2 == null) {
            coroutineContext2 = jt9Var.c;
        }
        CoroutineContext coroutineContext3 = this.l;
        if (coroutineContext3 == null) {
            coroutineContext3 = jt9Var.d;
        }
        nec necVar = this.m;
        Function1 function1 = this.n;
        Function1 function12 = this.o;
        mfk mfkVar = mfk.c;
        gkh gkhVar = this.p;
        if (gkhVar == null) {
            gkhVar = jt9Var.k;
        }
        gkh gkhVar2 = gkhVar;
        jrg jrgVar = this.q;
        if (jrgVar == null) {
            jrgVar = jt9Var.l;
        }
        jrg jrgVar2 = jrgVar;
        e3f e3fVar = this.r;
        if (e3fVar == null) {
            e3fVar = jt9Var.m;
        }
        e3f e3fVar2 = e3fVar;
        Object obj3 = this.s;
        if (obj3 instanceof rl6) {
            tl6Var = new tl6(fcp.o0(((rl6) obj3).a));
        } else {
            if (!(obj3 instanceof tl6)) {
                ogj.b();
                return null;
            }
            tl6Var = (tl6) obj3;
        }
        return new nt9(this.a, obj2, ttiVar, lt9Var, str, map3, str2, s18Var, coroutineContext, coroutineContext2, coroutineContext3, ze2Var, ze2Var2, ze2Var3, necVar, function1, function12, mfkVar, gkhVar2, jrgVar2, e3fVar2, tl6Var, new kt9(this.j, this.k, this.l, this.n, this.o, this.p, this.q, this.r), this.b);
    }

    public final rl6 b() {
        Object obj = this.s;
        if (obj instanceof rl6) {
            return (rl6) obj;
        }
        if (!(obj instanceof tl6)) {
            ogj.b();
            return null;
        }
        rl6 rl6Var = new rl6((tl6) obj);
        this.s = rl6Var;
        return rl6Var;
    }

    public final void c(String str) {
        nec necVar;
        if (str != null) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            necVar = new nec(str, lm5Var);
        } else {
            necVar = null;
        }
        this.m = necVar;
    }

    public ht9(Context context) {
        this.a = context;
        this.b = jt9.o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.h = lm5Var;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        mfk mfkVar = mfk.c;
        this.n = mfkVar;
        this.o = mfkVar;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = tl6.b;
    }
}
