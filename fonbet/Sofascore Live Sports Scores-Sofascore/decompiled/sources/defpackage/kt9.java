package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kt9 {
    public final CoroutineContext a;
    public final CoroutineContext b;
    public final CoroutineContext c;
    public final Function1 d;
    public final Function1 e;
    public final gkh f;
    public final jrg g;
    public final e3f h;

    public kt9(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, Function1 function1, Function1 function12, gkh gkhVar, jrg jrgVar, e3f e3fVar) {
        this.a = coroutineContext;
        this.b = coroutineContext2;
        this.c = coroutineContext3;
        this.d = function1;
        this.e = function12;
        this.f = gkhVar;
        this.g = jrgVar;
        this.h = e3fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt9)) {
            return false;
        }
        kt9 kt9Var = (kt9) obj;
        return Intrinsics.c(this.a, kt9Var.a) && Intrinsics.c(this.b, kt9Var.b) && Intrinsics.c(this.c, kt9Var.c) && this.d.equals(kt9Var.d) && this.e.equals(kt9Var.e) && Intrinsics.c(this.f, kt9Var.f) && this.g == kt9Var.g && this.h == kt9Var.h;
    }

    public final int hashCode() {
        CoroutineContext coroutineContext = this.a;
        int hashCode = (coroutineContext == null ? 0 : coroutineContext.hashCode()) * 31;
        CoroutineContext coroutineContext2 = this.b;
        int hashCode2 = (hashCode + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
        CoroutineContext coroutineContext3 = this.c;
        int hashCode3 = (mfk.c.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 923521)) * 31)) * 31)) * 31;
        gkh gkhVar = this.f;
        int hashCode4 = (hashCode3 + (gkhVar == null ? 0 : gkhVar.hashCode())) * 31;
        jrg jrgVar = this.g;
        int hashCode5 = (hashCode4 + (jrgVar == null ? 0 : jrgVar.hashCode())) * 31;
        e3f e3fVar = this.h;
        return hashCode5 + (e3fVar != null ? e3fVar.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.d + ", errorFactory=" + this.e + ", fallbackFactory=" + mfk.c + ", sizeResolver=" + this.f + ", scale=" + this.g + ", precision=" + this.h + ")";
    }
}
