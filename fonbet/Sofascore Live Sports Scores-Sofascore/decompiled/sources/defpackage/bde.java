package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bde {
    public final String a;
    public final tce b;

    public bde(String str, tce tceVar) {
        this.a = str;
        this.b = tceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bde)) {
            return false;
        }
        bde bdeVar = (bde) obj;
        return this.a.equals(bdeVar.a) && this.b == bdeVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PenaltyPlayerWithOutcomeWrapper(playerName=" + this.a + ", outcome=" + this.b + ")";
    }
}
