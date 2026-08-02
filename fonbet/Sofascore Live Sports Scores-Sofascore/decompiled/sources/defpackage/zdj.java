package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zdj {
    public final q80 a;
    public final dfj b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final kx4 g;
    public final ema h;
    public final sf8 i;
    public final long j;

    public zdj(q80 q80Var, dfj dfjVar, List list, int i, boolean z, int i2, kx4 kx4Var, ema emaVar, sf8 sf8Var, long j) {
        this.a = q80Var;
        this.b = dfjVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = kx4Var;
        this.h = emaVar;
        this.i = sf8Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdj)) {
            return false;
        }
        zdj zdjVar = (zdj) obj;
        return Intrinsics.c(this.a, zdjVar.a) && Intrinsics.c(this.b, zdjVar.b) && Intrinsics.c(this.c, zdjVar.c) && this.d == zdjVar.d && this.e == zdjVar.e && this.f == zdjVar.f && Intrinsics.c(this.g, zdjVar.g) && this.h == zdjVar.h && Intrinsics.c(this.i, zdjVar.i) && an3.b(this.j, zdjVar.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + wv8.a(this.f, dmi.e((dmi.d(dmi.f(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) b6a.C(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) an3.l(this.j)) + ')';
    }
}
