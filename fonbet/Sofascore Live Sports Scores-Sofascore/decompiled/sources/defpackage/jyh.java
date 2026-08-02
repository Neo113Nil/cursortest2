package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jyh {
    public static final jyh c = new jyh("LOCALE", 0);
    public static final jyh d = new jyh("LEFT_TO_RIGHT", 1);
    public static final jyh e = new jyh("RIGHT_TO_LEFT", 2);
    public static final jyh f = new jyh("TOP_TO_BOTTOM", 3);
    public static final jyh g = new jyh("BOTTOM_TO_TOP", 4);
    public final String a;
    public final int b;

    public jyh(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jyh)) {
            return false;
        }
        jyh jyhVar = (jyh) obj;
        return this.a.equals(jyhVar.a) && this.b == jyhVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return this.a;
    }
}
