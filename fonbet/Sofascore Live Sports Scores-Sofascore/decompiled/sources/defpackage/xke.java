package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xke implements i72 {
    public final Object a;
    public final int b;
    public final f6c c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    public xke(Object obj, int i, f6c f6cVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = f6cVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xke.class == obj.getClass()) {
            xke xkeVar = (xke) obj;
            if (this.b == xkeVar.b && this.e == xkeVar.e && this.f == xkeVar.f && this.g == xkeVar.g && this.h == xkeVar.h && this.i == xkeVar.i && sha.r(this.a, xkeVar.a) && sha.r(this.d, xkeVar.d) && sha.r(this.c, xkeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}
