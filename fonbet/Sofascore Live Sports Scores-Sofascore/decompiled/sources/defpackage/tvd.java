package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tvd {
    public final Context a;
    public final kjh b;
    public final jrg c;
    public final e3f d;
    public final String e;
    public final s18 f;
    public final ze2 g;
    public final ze2 h;
    public final ze2 i;
    public final tl6 j;

    public tvd(Context context, kjh kjhVar, jrg jrgVar, e3f e3fVar, String str, s18 s18Var, ze2 ze2Var, ze2 ze2Var2, ze2 ze2Var3, tl6 tl6Var) {
        this.a = context;
        this.b = kjhVar;
        this.c = jrgVar;
        this.d = e3fVar;
        this.e = str;
        this.f = s18Var;
        this.g = ze2Var;
        this.h = ze2Var2;
        this.i = ze2Var3;
        this.j = tl6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvd)) {
            return false;
        }
        tvd tvdVar = (tvd) obj;
        return Intrinsics.c(this.a, tvdVar.a) && Intrinsics.c(this.b, tvdVar.b) && this.c == tvdVar.c && this.d == tvdVar.d && Intrinsics.c(this.e, tvdVar.e) && Intrinsics.c(this.f, tvdVar.f) && this.g == tvdVar.g && this.h == tvdVar.h && this.i == tvdVar.i && Intrinsics.c(this.j, tvdVar.j);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ")";
    }
}
