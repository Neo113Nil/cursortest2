package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tq6 implements uq6 {
    public final fo1 a;

    public tq6(fo1 fo1Var) {
        this.a = fo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tq6) && this.a.equals(((tq6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnTeamOfTheRoundChangeRound(round=" + this.a + ")";
    }
}
