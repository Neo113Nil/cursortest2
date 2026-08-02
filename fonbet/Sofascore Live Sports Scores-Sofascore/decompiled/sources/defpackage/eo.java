package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eo {
    public final int a;

    public /* synthetic */ eo(int i) {
        this.a = i;
    }

    public static final /* synthetic */ eo a(int i) {
        return new eo(i);
    }

    public static String b(int i) {
        return lnb.n("Horizontal(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eo) {
            return this.a == ((eo) obj).a;
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
