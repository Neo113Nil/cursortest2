package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zod {
    public final x52 a;
    public int b;
    public int c;

    public zod(x52 x52Var, int i) {
        this.a = x52Var;
        this.b = i;
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}
