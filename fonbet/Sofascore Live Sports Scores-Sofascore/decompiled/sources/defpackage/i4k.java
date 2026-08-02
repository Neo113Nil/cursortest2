package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i4k implements yd5 {
    public final int a;
    public final int b;
    public final ig5 c;

    public i4k(int i, ig5 ig5Var, int i2) {
        this(i, 0, (i2 & 4) != 0 ? jg5.a : ig5Var);
    }

    @Override // defpackage.c80
    public final nmk a(q4k q4kVar) {
        return new und(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i4k) {
            i4k i4kVar = (i4k) obj;
            if (i4kVar.a == this.a && i4kVar.b == this.b && Intrinsics.c(i4kVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    public i4k(int i, int i2, ig5 ig5Var) {
        this.a = i;
        this.b = i2;
        this.c = ig5Var;
    }

    @Override // defpackage.yd5, defpackage.c80
    public final pmk a(q4k q4kVar) {
        return new und(this.a, this.b, this.c);
    }
}
