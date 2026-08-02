package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ryf {
    public static final ryf b = new ryf(false);
    public final boolean a;

    public ryf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ryf.class == obj.getClass() && this.a == ((ryf) obj).a;
    }

    public final int hashCode() {
        return !this.a ? 1 : 0;
    }
}
