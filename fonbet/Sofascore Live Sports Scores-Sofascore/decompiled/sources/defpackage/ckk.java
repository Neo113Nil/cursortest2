package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ckk {
    public static final und a = new und(mnd.a, 0, 0);

    public static final gwj a(jwk jwkVar, q80 q80Var) {
        gwj a2 = jwkVar.a(q80Var);
        int length = q80Var.b.length();
        q80 q80Var2 = a2.a;
        nnd nndVar = a2.b;
        int length2 = q80Var2.b.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            b(nndVar.v(i), length2, i);
        }
        b(nndVar.v(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            c(nndVar.i(i2), length, i2);
        }
        c(nndVar.i(length2), length, length2);
        return new gwj(q80Var2, new und(nndVar, q80Var.b.length(), q80Var2.b.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder s = lnb.s(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        s.append(i2);
        s.append(']');
        u3a.c(s.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder s = lnb.s(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        s.append(i2);
        s.append(']');
        u3a.c(s.toString());
    }
}
