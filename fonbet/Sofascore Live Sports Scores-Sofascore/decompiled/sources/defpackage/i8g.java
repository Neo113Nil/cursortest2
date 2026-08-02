package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i8g {
    public final String a;
    public final String b;
    public final q9k c;
    public final Double d;
    public final Double e;

    public i8g(q9k q9kVar, String str, String str2, Double d, Double d2) {
        this.a = str;
        this.b = str2;
        this.c = q9kVar;
        this.d = d;
        this.e = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        i8g i8gVar = (i8g) obj;
        return this.a.equals(i8gVar.a) && this.b.equals(i8gVar.b) && this.c.equals(i8gVar.c);
    }

    public final int hashCode() {
        return lnb.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
