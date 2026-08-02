package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r9p extends m9p {
    public final gcp a = new gcp(gcp.i, false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof r9p) && ((r9p) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
