package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t09 {
    public String a;
    public final ArrayList b;

    public t09(String str, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t09)) {
            return false;
        }
        t09 t09Var = (t09) obj;
        return Intrinsics.c(this.a, t09Var.a) && this.b.equals(t09Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GoalInfoHolder(playerName=" + this.a + ", minuteAndDesc=" + this.b + ")";
    }
}
