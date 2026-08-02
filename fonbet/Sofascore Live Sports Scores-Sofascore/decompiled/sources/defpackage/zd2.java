package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zd2 {
    public ae2 a;
    public omg b;
    public int c;

    public final String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(this.a));
        sb.append(" {...} (src=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "RenderOptions" : "Document");
        sb.append(")");
        return sb.toString();
    }
}
