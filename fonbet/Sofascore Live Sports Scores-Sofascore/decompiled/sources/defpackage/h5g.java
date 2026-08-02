package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h5g {
    public final long a = r13.i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5g)) {
            return false;
        }
        long j = ((h5g) obj).a;
        int i = r13.j;
        return e8k.a(this.a, j);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) r13.i(this.a)) + ", rippleAlpha=null)";
    }
}
