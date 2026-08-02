package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qzg implements e2k {
    public final ozg a;
    public final j9e b = new j9e(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public qzg(ozg ozgVar) {
        this.a = ozgVar;
    }

    @Override // defpackage.e2k
    public final void a(int i, j9e j9eVar) {
        boolean z = (i & 1) != 0;
        int A = z ? j9eVar.b + j9eVar.A() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            j9eVar.N(A);
            this.d = 0;
        }
        while (j9eVar.a() > 0) {
            int i2 = this.d;
            j9e j9eVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int A2 = j9eVar.A();
                    j9eVar.N(j9eVar.b - 1);
                    if (A2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(j9eVar.a(), 3 - this.d);
                j9eVar.k(j9eVar2.a, this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    j9eVar2.N(0);
                    j9eVar2.M(3);
                    j9eVar2.O(1);
                    int A3 = j9eVar2.A();
                    int A4 = j9eVar2.A();
                    this.e = (A3 & 128) != 0;
                    int i4 = (((A3 & 15) << 8) | A4) + 3;
                    this.c = i4;
                    byte[] bArr = j9eVar2.a;
                    if (bArr.length < i4) {
                        j9eVar2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(j9eVar.a(), this.c - this.d);
                j9eVar.k(j9eVar2.a, this.d, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        j9eVar2.M(i6);
                    } else {
                        if (nik.p(0, i6, -1, j9eVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        j9eVar2.M(this.c - 4);
                    }
                    j9eVar2.N(0);
                    this.a.b(j9eVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.e2k
    public final void c(djj djjVar, pl6 pl6Var, c2k c2kVar) {
        this.a.c(djjVar, pl6Var, c2kVar);
        this.f = true;
    }

    @Override // defpackage.e2k
    public final void seek() {
        this.f = true;
    }
}
