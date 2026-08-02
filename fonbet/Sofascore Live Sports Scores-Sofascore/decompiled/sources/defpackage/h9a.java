package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h9a {
    public final int a;
    public final int b;
    public final iqa c;

    public h9a(int i, int i2, iqa iqaVar) {
        this.a = i;
        this.b = i2;
        this.c = iqaVar;
        if (i < 0) {
            u3a.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        u3a.a("size should be > 0");
    }
}
