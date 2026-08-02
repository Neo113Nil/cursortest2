package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pv {
    public final long a;
    public final lij b;
    public final int c;
    public final rcc d;
    public final long e;
    public final lij f;
    public final int g;
    public final rcc h;
    public final long i;
    public final long j;

    public pv(long j, lij lijVar, int i, rcc rccVar, long j2, lij lijVar2, int i2, rcc rccVar2, long j3, long j4) {
        this.a = j;
        this.b = lijVar;
        this.c = i;
        this.d = rccVar;
        this.e = j2;
        this.f = lijVar2;
        this.g = i2;
        this.h = rccVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pv.class != obj.getClass()) {
            return false;
        }
        pv pvVar = (pv) obj;
        return this.a == pvVar.a && this.c == pvVar.c && this.e == pvVar.e && this.g == pvVar.g && this.i == pvVar.i && this.j == pvVar.j && sha.r(this.b, pvVar.b) && sha.r(this.d, pvVar.d) && sha.r(this.f, pvVar.f) && sha.r(this.h, pvVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
