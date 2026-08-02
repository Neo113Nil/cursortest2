package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hz4 implements oz4 {
    public final mi6 a;

    public hz4(mi6 mi6Var) {
        this.a = mi6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz4) && this.a.equals(((hz4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetExperiment(experiment=" + this.a + ")";
    }
}
