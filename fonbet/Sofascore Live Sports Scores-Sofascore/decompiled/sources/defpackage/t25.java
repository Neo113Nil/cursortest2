package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t25 implements a35 {
    public final int a;

    public /* synthetic */ t25(int i) {
        this.a = i;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        a70.p("px must be > 0.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t25) {
            return this.a == ((t25) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lnb.k(this.a, "Pixels(px=", ")");
    }
}
