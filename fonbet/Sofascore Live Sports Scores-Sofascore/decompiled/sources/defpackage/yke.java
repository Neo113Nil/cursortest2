package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yke {
    public final Object a;
    public final int b;
    public final h6c c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        wt3.s(0, 1, 2, 3, 4);
        nik.N(5);
        nik.N(6);
    }

    public yke(Object obj, int i, h6c h6cVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        z1a.s(i >= 0);
        z1a.s(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = h6cVar;
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
        if (obj != null && yke.class == obj.getClass()) {
            yke ykeVar = (yke) obj;
            if (this.b == ykeVar.b && this.e == ykeVar.e && this.f == ykeVar.f && this.g == ykeVar.g && this.h == ykeVar.h && this.i == ykeVar.i && Objects.equals(this.c, ykeVar.c) && Objects.equals(this.a, ykeVar.a) && Objects.equals(this.d, ykeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        StringBuilder r = mz1.r(str, ", contentPos=");
        r.append(this.g);
        r.append(", adGroup=");
        r.append(i);
        r.append(", ad=");
        r.append(this.i);
        return r.toString();
    }
}
