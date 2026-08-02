package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mdf {
    public final int a;
    public final int b;
    public final float[] c;
    public final float[] d;

    public mdf(int i, float[] fArr, float[] fArr2, int i2, int i3) {
        switch (i3) {
            case 1:
                this.a = i;
                z1a.s(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
                this.c = fArr;
                this.d = fArr2;
                this.b = i2;
                break;
            default:
                this.a = i;
                qx9.r(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
                this.c = fArr;
                this.d = fArr2;
                this.b = i2;
                break;
        }
    }
}
