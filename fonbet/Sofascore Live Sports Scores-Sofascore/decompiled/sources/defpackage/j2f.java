package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j2f implements Serializable {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public j2f(String str, String str2, int i, int i2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2f)) {
            return false;
        }
        j2f j2fVar = (j2f) obj;
        return this.a.equals(j2fVar.a) && Intrinsics.c(this.b, j2fVar.b) && this.c == j2fVar.c && this.d == j2fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + wv8.a(this.d, wv8.a(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        return me4.i(mz1.s("Position(shortName=", this.a, ", name=", this.b, ", gridPosition="), this.c, ", color=", this.d, ", main=false)");
    }
}
