package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jt9 {
    public static final jt9 o;
    public final s18 a;
    public final CoroutineContext b;
    public final CoroutineContext c;
    public final CoroutineContext d;
    public final ze2 e;
    public final ze2 f;
    public final ze2 g;
    public final Function1 h;
    public final Function1 i;
    public final Function1 j;
    public final gkh k;
    public final jrg l;
    public final e3f m;
    public final tl6 n;

    static {
        mfk mfkVar = mfk.c;
        uha uhaVar = s18.a;
        g gVar = g.a;
        hs4 hs4Var = z45.a;
        hq4 hq4Var = hq4.c;
        ze2 ze2Var = ze2.ENABLED;
        o = new jt9(uhaVar, gVar, hq4Var, hq4Var, ze2Var, ze2Var, ze2Var, mfkVar, mfkVar, mfkVar, gkh.y7, jrg.b, e3f.a, tl6.b);
    }

    public jt9(s18 s18Var, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, ze2 ze2Var, ze2 ze2Var2, ze2 ze2Var3, Function1 function1, Function1 function12, Function1 function13, gkh gkhVar, jrg jrgVar, e3f e3fVar, tl6 tl6Var) {
        this.a = s18Var;
        this.b = coroutineContext;
        this.c = coroutineContext2;
        this.d = coroutineContext3;
        this.e = ze2Var;
        this.f = ze2Var2;
        this.g = ze2Var3;
        this.h = function1;
        this.i = function12;
        this.j = function13;
        this.k = gkhVar;
        this.l = jrgVar;
        this.m = e3fVar;
        this.n = tl6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt9)) {
            return false;
        }
        jt9 jt9Var = (jt9) obj;
        return Intrinsics.c(this.a, jt9Var.a) && Intrinsics.c(this.b, jt9Var.b) && Intrinsics.c(this.c, jt9Var.c) && Intrinsics.c(this.d, jt9Var.d) && this.e == jt9Var.e && this.f == jt9Var.f && this.g == jt9Var.g && Intrinsics.c(this.h, jt9Var.h) && Intrinsics.c(this.i, jt9Var.i) && Intrinsics.c(this.j, jt9Var.j) && Intrinsics.c(this.k, jt9Var.k) && this.l == jt9Var.l && this.m == jt9Var.m && Intrinsics.c(this.n, jt9Var.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ")";
    }
}
