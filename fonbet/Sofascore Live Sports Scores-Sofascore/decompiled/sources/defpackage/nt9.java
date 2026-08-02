package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nt9 {
    public final Context a;
    public final Object b;
    public final tti c;
    public final lt9 d;
    public final String e;
    public final Map f;
    public final String g;
    public final s18 h;
    public final CoroutineContext i;
    public final CoroutineContext j;
    public final CoroutineContext k;
    public final ze2 l;
    public final ze2 m;
    public final ze2 n;
    public final nec o;
    public final Function1 p;
    public final Function1 q;
    public final Function1 r;
    public final gkh s;
    public final jrg t;
    public final e3f u;
    public final tl6 v;
    public final kt9 w;
    public final jt9 x;

    public nt9(Context context, Object obj, tti ttiVar, lt9 lt9Var, String str, Map map, String str2, s18 s18Var, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, ze2 ze2Var, ze2 ze2Var2, ze2 ze2Var3, nec necVar, Function1 function1, Function1 function12, Function1 function13, gkh gkhVar, jrg jrgVar, e3f e3fVar, tl6 tl6Var, kt9 kt9Var, jt9 jt9Var) {
        this.a = context;
        this.b = obj;
        this.c = ttiVar;
        this.d = lt9Var;
        this.e = str;
        this.f = map;
        this.g = str2;
        this.h = s18Var;
        this.i = coroutineContext;
        this.j = coroutineContext2;
        this.k = coroutineContext3;
        this.l = ze2Var;
        this.m = ze2Var2;
        this.n = ze2Var3;
        this.o = necVar;
        this.p = function1;
        this.q = function12;
        this.r = function13;
        this.s = gkhVar;
        this.t = jrgVar;
        this.u = e3fVar;
        this.v = tl6Var;
        this.w = kt9Var;
        this.x = jt9Var;
    }

    public static ht9 a(nt9 nt9Var) {
        Context context = nt9Var.a;
        nt9Var.getClass();
        return new ht9(nt9Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt9)) {
            return false;
        }
        nt9 nt9Var = (nt9) obj;
        return Intrinsics.c(this.a, nt9Var.a) && this.b.equals(nt9Var.b) && Intrinsics.c(this.c, nt9Var.c) && Intrinsics.c(this.d, nt9Var.d) && Intrinsics.c(this.e, nt9Var.e) && this.f.equals(nt9Var.f) && Intrinsics.c(this.g, nt9Var.g) && Intrinsics.c(this.h, nt9Var.h) && Intrinsics.c(this.i, nt9Var.i) && Intrinsics.c(this.j, nt9Var.j) && Intrinsics.c(this.k, nt9Var.k) && this.l == nt9Var.l && this.m == nt9Var.m && this.n == nt9Var.n && Intrinsics.c(this.o, nt9Var.o) && Intrinsics.c(this.p, nt9Var.p) && Intrinsics.c(this.q, nt9Var.q) && Intrinsics.c(this.r, nt9Var.r) && Intrinsics.c(this.s, nt9Var.s) && this.t == nt9Var.t && this.u == nt9Var.u && this.v.equals(nt9Var.v) && this.w.equals(nt9Var.w) && Intrinsics.c(this.x, nt9Var.x);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        tti ttiVar = this.c;
        int hashCode2 = (hashCode + (ttiVar == null ? 0 : ttiVar.hashCode())) * 31;
        lt9 lt9Var = this.d;
        int hashCode3 = (hashCode2 + (lt9Var == null ? 0 : lt9Var.hashCode())) * 31;
        String str = this.e;
        int g = dmi.g(this.f, (hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.g;
        int hashCode4 = (this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((g + (str2 == null ? 0 : str2.hashCode())) * 31)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        nec necVar = this.o;
        return this.x.hashCode() + ((this.w.hashCode() + dmi.g(this.v.a, (this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((hashCode4 + (necVar != null ? necVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=" + this.d + ", memoryCacheKey=" + this.e + ", memoryCacheKeyExtras=" + this.f + ", diskCacheKey=" + this.g + ", fileSystem=" + this.h + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.i + ", fetcherCoroutineContext=" + this.j + ", decoderCoroutineContext=" + this.k + ", memoryCachePolicy=" + this.l + ", diskCachePolicy=" + this.m + ", networkCachePolicy=" + this.n + ", placeholderMemoryCacheKey=" + this.o + ", placeholderFactory=" + this.p + ", errorFactory=" + this.q + ", fallbackFactory=" + this.r + ", sizeResolver=" + this.s + ", scale=" + this.t + ", precision=" + this.u + ", extras=" + this.v + ", defined=" + this.w + ", defaults=" + this.x + ")";
    }
}
