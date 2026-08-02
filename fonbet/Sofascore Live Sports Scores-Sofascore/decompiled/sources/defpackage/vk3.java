package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class vk3 {
    public final j23 a;
    public final j23 b;
    public final j23 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vk3(j23 j23Var, j23 j23Var2, int i) {
        this(j23Var2, r0, r1, r6);
        j23 i2 = kik.p(j23Var.b, 12884901888L) ? pd0.i(j23Var) : j23Var;
        j23 i3 = kik.p(j23Var2.b, 12884901888L) ? pd0.i(j23Var2) : j23Var2;
        float[] fArr = xw3.i;
        float[] fArr2 = null;
        if (i == 3) {
            boolean p = kik.p(j23Var.b, 12884901888L);
            boolean p2 = kik.p(j23Var2.b, 12884901888L);
            if ((!p || !p2) && (p || p2)) {
                u5l u5lVar = ((b5g) (p ? j23Var : j23Var2)).d;
                float[] a = p ? u5lVar.a() : fArr;
                fArr = p2 ? u5lVar.a() : fArr;
                fArr2 = new float[]{a[0] / fArr[0], a[1] / fArr[1], a[2] / fArr[2]};
            }
        }
    }

    public long a(long j) {
        float h = r13.h(j);
        float g = r13.g(j);
        float e = r13.e(j);
        float d = r13.d(j);
        j23 j23Var = this.b;
        long d2 = j23Var.d(h, g, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e2 = j23Var.e(h, g, e);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.c.f(f, f2, e2, d, this.a);
    }

    public vk3(j23 j23Var, j23 j23Var2, j23 j23Var3, float[] fArr) {
        this.a = j23Var;
        this.b = j23Var2;
        this.c = j23Var3;
        this.d = fArr;
    }
}
