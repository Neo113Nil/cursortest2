package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ofb extends qfb {
    public static final ofb b = new ofb(false);

    public final boolean equals(Object obj) {
        if (obj instanceof ofb) {
            return this.a == ((ofb) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return lnb.r(new StringBuilder("Loading(endOfPaginationReached="), this.a, ')');
    }
}
