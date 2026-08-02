package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jm0 {
    public final ArrayList a;
    public final int b;

    public jm0(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm0)) {
            return false;
        }
        jm0 jm0Var = (jm0) obj;
        return this.a.equals(jm0Var.a) && this.b == jm0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Period(minuteValues=" + this.a + ", maxMinuteValues=" + this.b + ")";
    }
}
