package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bq0 {
    public final int a;

    public /* synthetic */ bq0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bq0) {
            return this.a == ((bq0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lnb.n("AutoClearFocusBehavior(value=", this.a, ')');
    }
}
