package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rhh extends xjj {
    public final short c;
    public final short d;

    public rhh(xjj xjjVar, int i, int i2) {
        super(xjjVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.xjj
    public final void a(kw1 kw1Var, byte[] bArr) {
        kw1Var.b(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
