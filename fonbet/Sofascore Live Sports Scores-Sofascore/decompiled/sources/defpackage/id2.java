package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class id2 extends Exception {
    public final String a;
    public final String b;

    public id2(String str, dd2 dd2Var) {
        super(str);
        this.a = str;
        if (dd2Var != null) {
            this.b = dd2Var.o();
        } else {
            this.b = "unknown";
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.a + " (" + this.b + " at line 0)");
        return sb.toString();
    }
}
