package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mw7 implements pw7 {
    public final int a;
    public final int b;

    public mw7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw7)) {
            return false;
        }
        mw7 mw7Var = (mw7) obj;
        return this.a == mw7Var.a && this.b == mw7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lnb.j(this.a, this.b, "ShareAction(postId=", ", oldShareCount=", ")");
    }
}
