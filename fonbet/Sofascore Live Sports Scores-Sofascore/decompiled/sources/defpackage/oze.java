package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oze {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public oze(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oze)) {
            return false;
        }
        oze ozeVar = (oze) obj;
        return ufa.o(this.a, ozeVar.a) && this.b == ozeVar.b && dnd.c(this.c, ozeVar.c) && dnd.c(this.d, ozeVar.d) && this.e == ozeVar.e && Float.compare(this.f, ozeVar.f) == 0 && this.g == ozeVar.g && this.h == ozeVar.h && this.i.equals(ozeVar.i) && dnd.c(this.j, ozeVar.j) && Float.compare(this.k, ozeVar.k) == 0 && dnd.c(this.l, ozeVar.l) && dnd.c(this.m, ozeVar.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + ljg.c(fc6.a(this.k, ljg.c(vxd.d(this.i, dmi.e(wv8.a(this.g, fc6.a(this.f, dmi.e(ljg.c(ljg.c(ljg.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31), 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) ufa.H(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) dnd.k(this.c)) + ", position=" + ((Object) dnd.k(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) vze.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) dnd.k(this.j)) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + ((Object) dnd.k(this.l)) + ", originalEventPosition=" + ((Object) dnd.k(this.m)) + ')';
    }
}
