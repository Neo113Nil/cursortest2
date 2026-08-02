package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hw1 extends xjj {
    public final short c;
    public final short d;

    public hw1(xjj xjjVar, int i, int i2) {
        super(xjjVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.xjj
    public final void a(kw1 kw1Var, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                kw1Var.b(31, 5);
                if (s > 62) {
                    kw1Var.b(s - 31, 16);
                } else if (i == 0) {
                    kw1Var.b(Math.min((int) s, 31), 5);
                } else {
                    kw1Var.b(s - 31, 5);
                }
            }
            kw1Var.b(bArr[this.c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.c);
        sb.append("::");
        sb.append((r1 + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
