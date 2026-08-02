package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gu0 extends el6 {
    public final Integer a;

    public gu0(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof el6)) {
            return false;
        }
        Integer num = this.a;
        gu0 gu0Var = (gu0) ((el6) obj);
        return num == null ? gu0Var.a == null : num.equals(gu0Var.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return vxd.n(new StringBuilder("ExternalPRequestContext{originAssociatedProductId="), this.a, "}");
    }
}
