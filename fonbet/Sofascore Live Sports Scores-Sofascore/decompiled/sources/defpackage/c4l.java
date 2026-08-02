package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c4l {
    public final boolean a;
    public final boolean b;

    public c4l(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4l)) {
            return false;
        }
        c4l c4lVar = (c4l) obj;
        return this.a == c4lVar.a && this.b == c4lVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PurchaseProcessWrapper(isProcessing=" + this.a + ", showLoader=" + this.b + ")";
    }
}
