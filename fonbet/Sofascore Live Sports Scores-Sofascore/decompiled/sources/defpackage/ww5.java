package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ww5 {
    public final e9b a;
    public final boolean b;

    public ww5(e9b e9bVar, boolean z) {
        this.a = e9bVar;
        this.b = z;
    }

    public static ww5 a(ww5 ww5Var, e9b e9bVar, boolean z, int i) {
        if ((i & 1) != 0) {
            e9bVar = ww5Var.a;
        }
        if ((i & 2) != 0) {
            z = ww5Var.b;
        }
        return new ww5(e9bVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww5)) {
            return false;
        }
        ww5 ww5Var = (ww5) obj;
        return this.a.equals(ww5Var.a) && this.b == ww5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EventCricketLineupsState(lineupsListData=" + this.a + ", isPullToRefreshing=" + this.b + ")";
    }
}
