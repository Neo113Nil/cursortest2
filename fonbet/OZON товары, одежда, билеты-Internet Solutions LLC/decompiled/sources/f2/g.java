package f2;

import B4.V;
import E0.C2942q;
import Ij.C3261b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f2.C6402b;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class g extends C6402b {

    /* renamed from: f, reason: collision with root package name */
    private h[] f62472f;

    /* renamed from: g, reason: collision with root package name */
    private h[] f62473g;

    /* renamed from: h, reason: collision with root package name */
    private int f62474h;

    /* renamed from: i, reason: collision with root package name */
    b f62475i;

    final class a implements Comparator<h> {
        @Override // java.util.Comparator
        public final int compare(h hVar, h hVar2) {
            return hVar.f62479b - hVar2.f62479b;
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        h f62476a;

        b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f62476a != null) {
                for (int i11 = 0; i11 < 9; i11++) {
                    str = V.b(this.f62476a.f62485h[i11], " ", C3261b.e(str));
                }
            }
            StringBuilder e11 = C2942q.e(str, "] ");
            e11.append(this.f62476a);
            return e11.toString();
        }
    }

    public g(C6403c c6403c) {
        super(c6403c);
        this.f62472f = new h[UserVerificationMethods.USER_VERIFY_PATTERN];
        this.f62473g = new h[UserVerificationMethods.USER_VERIFY_PATTERN];
        this.f62474h = 0;
        this.f62475i = new b();
    }

    private void n(h hVar) {
        int i11;
        int i12 = this.f62474h + 1;
        h[] hVarArr = this.f62472f;
        if (i12 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f62472f = hVarArr2;
            this.f62473g = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.f62472f;
        int i13 = this.f62474h;
        hVarArr3[i13] = hVar;
        int i14 = i13 + 1;
        this.f62474h = i14;
        if (i14 > 1 && hVarArr3[i13].f62479b > hVar.f62479b) {
            int i15 = 0;
            while (true) {
                i11 = this.f62474h;
                if (i15 >= i11) {
                    break;
                }
                this.f62473g[i15] = this.f62472f[i15];
                i15++;
            }
            Arrays.sort(this.f62473g, 0, i11, new a());
            for (int i16 = 0; i16 < this.f62474h; i16++) {
                this.f62472f[i16] = this.f62473g[i16];
            }
        }
        hVar.f62478a = true;
        hVar.a(this);
    }

    private void p(h hVar) {
        int i11 = 0;
        while (i11 < this.f62474h) {
            if (this.f62472f[i11] == hVar) {
                while (true) {
                    int i12 = this.f62474h;
                    if (i11 >= i12 - 1) {
                        this.f62474h = i12 - 1;
                        hVar.f62478a = false;
                        return;
                    } else {
                        h[] hVarArr = this.f62472f;
                        int i13 = i11 + 1;
                        hVarArr[i11] = hVarArr[i13];
                        i11 = i13;
                    }
                }
            } else {
                i11++;
            }
        }
    }

    @Override // f2.C6402b, f2.C6404d.a
    public final h a(boolean[] zArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < this.f62474h; i12++) {
            h[] hVarArr = this.f62472f;
            h hVar = hVarArr[i12];
            if (!zArr[hVar.f62479b]) {
                b bVar = this.f62475i;
                bVar.f62476a = hVar;
                int i13 = 8;
                if (i11 == -1) {
                    while (i13 >= 0) {
                        float f7 = bVar.f62476a.f62485h[i13];
                        if (f7 <= 0.0f) {
                            if (f7 < 0.0f) {
                                i11 = i12;
                                break;
                            }
                            i13--;
                        }
                    }
                } else {
                    h hVar2 = hVarArr[i11];
                    while (true) {
                        if (i13 >= 0) {
                            float f11 = hVar2.f62485h[i13];
                            float f12 = bVar.f62476a.f62485h[i13];
                            if (f12 == f11) {
                                i13--;
                            } else if (f12 >= f11) {
                            }
                        }
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        return this.f62472f[i11];
    }

    @Override // f2.C6402b
    public final boolean g() {
        return this.f62474h == 0;
    }

    @Override // f2.C6402b
    public final void l(C6404d c6404d, C6402b c6402b, boolean z11) {
        h hVar = c6402b.f62445a;
        if (hVar == null) {
            return;
        }
        C6402b.a aVar = c6402b.f62448d;
        int j11 = aVar.j();
        for (int i11 = 0; i11 < j11; i11++) {
            h b11 = aVar.b(i11);
            float k11 = aVar.k(i11);
            b bVar = this.f62475i;
            bVar.f62476a = b11;
            boolean z12 = b11.f62478a;
            float[] fArr = hVar.f62485h;
            if (z12) {
                boolean z13 = true;
                for (int i12 = 0; i12 < 9; i12++) {
                    float[] fArr2 = bVar.f62476a.f62485h;
                    float f7 = (fArr[i12] * k11) + fArr2[i12];
                    fArr2[i12] = f7;
                    if (Math.abs(f7) < 1.0E-4f) {
                        bVar.f62476a.f62485h[i12] = 0.0f;
                    } else {
                        z13 = false;
                    }
                }
                if (z13) {
                    g.this.p(bVar.f62476a);
                }
            } else {
                for (int i13 = 0; i13 < 9; i13++) {
                    float f11 = fArr[i13];
                    if (f11 != 0.0f) {
                        float f12 = f11 * k11;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        bVar.f62476a.f62485h[i13] = f12;
                    } else {
                        bVar.f62476a.f62485h[i13] = 0.0f;
                    }
                }
                n(b11);
            }
            this.f62446b = (c6402b.f62446b * k11) + this.f62446b;
        }
        p(hVar);
    }

    public final void m(h hVar) {
        this.f62475i.f62476a = hVar;
        Arrays.fill(hVar.f62485h, 0.0f);
        hVar.f62485h[hVar.f62481d] = 1.0f;
        n(hVar);
    }

    public final void o() {
        this.f62474h = 0;
        this.f62446b = 0.0f;
    }

    @Override // f2.C6402b
    public final String toString() {
        String b11 = V.b(this.f62446b, ") : ", new StringBuilder(" goal -> ("));
        for (int i11 = 0; i11 < this.f62474h; i11++) {
            h hVar = this.f62472f[i11];
            b bVar = this.f62475i;
            bVar.f62476a = hVar;
            b11 = b11 + bVar + " ";
        }
        return b11;
    }
}
