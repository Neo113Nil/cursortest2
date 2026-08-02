package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ho {
    public static final ho c = new ho(0, 0);
    public static final ho d = new ho(0, 1);
    public static final ho e = new ho(1, 1);
    public static final ho f = new ho(2, 1);
    public static final ho g = new ho(0, 2);
    public static final ho h = new ho(2, 2);
    public final int a;
    public final int b;

    public ho(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ho.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ho hoVar = (ho) obj;
        return this.a == hoVar.a && this.b == hoVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) eo.b(this.a)) + ", vertical=" + ((Object) go.b(this.b)) + ')';
    }
}
