package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p7n {
    public int a;
    public long b;
    public Object c;
    public final z8n d;
    public int e;

    public p7n() {
        z8n z8nVar = z8n.b;
        int i = o7n.a;
        this.d = z8n.c;
    }

    public static /* synthetic */ String a(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public p7n(z8n z8nVar) {
        z8nVar.getClass();
        this.d = z8nVar;
    }
}
