package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pfb extends qfb {
    public static final pfb b = new pfb(true);
    public static final pfb c = new pfb(false);

    public final boolean equals(Object obj) {
        if (obj instanceof pfb) {
            return this.a == ((pfb) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return lnb.r(new StringBuilder("NotLoading(endOfPaginationReached="), this.a, ')');
    }
}
