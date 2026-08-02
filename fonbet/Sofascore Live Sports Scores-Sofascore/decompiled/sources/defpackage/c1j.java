package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c1j {
    public final q2h a;
    public final q2h b;

    public c1j(q2h q2hVar, q2h q2hVar2) {
        this.a = q2hVar;
        this.b = q2hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1j)) {
            return false;
        }
        c1j c1jVar = (c1j) obj;
        return this.a.equals(c1jVar.a) && this.b.equals(c1jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamSelectorUiModel(homeTeamData=" + this.a + ", awayTeamData=" + this.b + ")";
    }
}
