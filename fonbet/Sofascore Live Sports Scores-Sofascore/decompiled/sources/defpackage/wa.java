package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wa {
    public final String a;
    public final o72 b;

    public wa(String str, o72 o72Var) {
        this.a = str;
        this.b = o72Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        o72 o72Var = waVar.b;
        String str = waVar.a;
        if (hashCode() != waVar.hashCode()) {
            return false;
        }
        String str2 = this.a;
        if ((str2 == null && str != null) || (str2 != null && !str2.equals(str))) {
            return false;
        }
        o72 o72Var2 = this.b;
        return (o72Var2 == null && o72Var == null) || (o72Var2 != null && o72Var2.equals(o72Var));
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        o72 o72Var = this.b;
        return hashCode + (o72Var != null ? o72Var.hashCode() : 0);
    }
}
