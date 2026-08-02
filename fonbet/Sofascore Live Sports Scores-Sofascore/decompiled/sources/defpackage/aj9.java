package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aj9 {
    public final oo2 a;
    public int b;
    public int c;
    public v89 d;

    public aj9(oo2 oo2Var) {
        oo2Var.getClass();
        this.a = oo2Var;
        this.d = (v89) dj9.b.p0();
    }

    public final mo2 a(String str) {
        if (this.b == 0) {
            return null;
        }
        int i = up2.a;
        int abs = Math.abs(up2.a(0, str.length(), str));
        int i2 = this.c;
        while (true) {
            int i3 = abs % i2;
            int i4 = i3 * 6;
            if (this.d.a(i4) == -1) {
                return null;
            }
            if (b(str, i4)) {
                return (mo2) this.a.subSequence(this.d.a(i4 + 3), this.d.a(i4 + 4));
            }
            abs = i3 + 1;
            i2 = this.c;
        }
    }

    public final boolean b(CharSequence charSequence, int i) {
        int a = this.d.a(i + 1);
        int a2 = this.d.a(i + 2);
        int i2 = up2.a;
        oo2 oo2Var = this.a;
        oo2Var.getClass();
        if (a2 - a != charSequence.length()) {
            return false;
        }
        for (int i3 = a; i3 < a2; i3++) {
            int charAt = oo2Var.charAt(i3);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            int charAt2 = charSequence.charAt(i3 - a);
            if (65 <= charAt2 && charAt2 < 91) {
                charAt2 += 32;
            }
            if (charAt != charAt2) {
                return false;
            }
        }
        return true;
    }

    public final void c(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.b;
        double d = i6;
        int i7 = this.c;
        if (d >= i7 * 0.75d) {
            v89 v89Var = this.d;
            this.b = 0;
            this.c = (i7 * 2) | 128;
            v89 v89Var2 = (v89) dj9.b.p0();
            int size = (v89Var.a.size() * 2) | 1;
            for (int i8 = 0; i8 < size; i8++) {
                v89Var2.a.add(dj9.a.p0());
            }
            this.d = v89Var2;
            w4h a = b5h.a(new u89(v89Var, null));
            while (a.hasNext()) {
                int intValue = ((Number) a.next()).intValue();
                c(v89Var.a(intValue + 1), v89Var.a(intValue + 2), v89Var.a(intValue + 3), v89Var.a(intValue + 4));
            }
            dj9.b.O0(v89Var);
            if (i6 != this.b) {
                a70.p("Failed requirement.");
                return;
            }
        }
        oo2 oo2Var = this.a;
        int abs = Math.abs(up2.a(i, i2, oo2Var));
        CharSequence subSequence = oo2Var.subSequence(i, i2);
        int i9 = abs % this.c;
        int i10 = -1;
        while (true) {
            i5 = i9 * 6;
            if (this.d.a(i5) == -1) {
                break;
            }
            if (b(subSequence, i5)) {
                i10 = i9;
            }
            i9 = (i9 + 1) % this.c;
        }
        this.d.b(i5, abs);
        this.d.b(i5 + 1, i);
        this.d.b(i5 + 2, i2);
        this.d.b(i5 + 3, i3);
        this.d.b(i5 + 4, i4);
        this.d.b(i5 + 5, -1);
        if (i10 != -1) {
            this.d.b((i10 * 6) + 5, i9);
        }
        this.b++;
    }

    public final void d() {
        this.b = 0;
        this.c = 0;
        bj9 bj9Var = dj9.b;
        bj9Var.O0(this.d);
        this.d = (v89) bj9Var.p0();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        cj9 cj9Var = dj9.a;
        v89 v89Var = this.d;
        v89Var.getClass();
        w4h a = b5h.a(new u89(v89Var, null));
        while (a.hasNext()) {
            int intValue = ((Number) a.next()).intValue();
            sb.append((CharSequence) "");
            int a2 = this.d.a(intValue + 1);
            int a3 = this.d.a(intValue + 2);
            sb.append(this.a.subSequence(a2, a3));
            sb.append((CharSequence) " => ");
            sb.append(r5.subSequence(this.d.a(intValue + 3), this.d.a(intValue + 4)));
            sb.append((CharSequence) "\n");
        }
        return sb.toString();
    }
}
