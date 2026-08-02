package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class i65 {
    public static final c65 c = new c65(-1, -16777216);
    public final int a;
    public final int b;

    public i65(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(i65.class.getSimpleName());
        sb.append("{width=");
        sb.append(this.a);
        sb.append(", color=");
        return wv8.j(sb, this.b, '}');
    }
}
