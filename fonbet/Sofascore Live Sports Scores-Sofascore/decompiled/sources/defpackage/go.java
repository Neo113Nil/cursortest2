package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class go {
    public final int a;

    public /* synthetic */ go(int i) {
        this.a = i;
    }

    public static final /* synthetic */ go a(int i) {
        return new go(i);
    }

    public static String b(int i) {
        return lnb.n("Vertical(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof go) {
            return this.a == ((go) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
