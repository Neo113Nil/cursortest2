package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zl0 implements moh, f2f {
    public final /* synthetic */ int a = 2;
    public long b;
    public int c;
    public int d;

    public zl0(int i, long j, int i2) {
        this.c = i;
        this.b = j;
        this.d = i2;
    }

    @Override // defpackage.f2f
    public long a(x6a x6aVar, long j, ema emaVar, long j2) {
        x6aVar.getClass();
        emaVar.getClass();
        int i = (int) (j2 >> 32);
        int intBitsToFloat = (((int) Float.intBitsToFloat((int) (this.b >> 32))) + this.c) - (i / 2);
        if (intBitsToFloat < 0) {
            intBitsToFloat = 0;
        } else {
            int i2 = intBitsToFloat + i;
            int i3 = this.d;
            if (i2 > i3) {
                intBitsToFloat = i3 - i;
            }
        }
        return (intBitsToFloat << 32) | ((((int) Float.intBitsToFloat((int) (r3 & 4294967295L))) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(nik.g0(this.c));
                sb.append(", size=");
                sb.append(this.b);
                sb.append(", minHeaderSize=");
                return fc6.h(this.d, "}", sb);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zl0() {
    }

    public zl0(long j, int i, int i2) {
        this.b = j;
        this.c = i;
        this.d = i2;
    }
}
