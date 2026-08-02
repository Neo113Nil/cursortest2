package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sl2 {
    public final String a;
    public final int b;

    public sl2(String str) {
        str.getClass();
        this.a = str;
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + Character.toLowerCase(str.charAt(i2));
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        String str;
        sl2 sl2Var = obj instanceof sl2 ? (sl2) obj : null;
        return (sl2Var == null || (str = sl2Var.a) == null || !str.equalsIgnoreCase(this.a)) ? false : true;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a;
    }
}
