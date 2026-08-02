package c2;

import H1.AbstractC1185s;
import H1.InterfaceC1184q;
import e1.AbstractC4134a;
import e1.J;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f26870a = new f();

    /* renamed from: b, reason: collision with root package name */
    public final J f26871b = new J(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f26872c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f26873d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26874e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f26873d = 0;
        do {
            int i13 = this.f26873d;
            int i14 = i10 + i13;
            f fVar = this.f26870a;
            if (i14 >= fVar.f26881g) {
                break;
            }
            int[] iArr = fVar.laces;
            this.f26873d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f26870a;
    }

    public J c() {
        return this.f26871b;
    }

    public boolean d(InterfaceC1184q interfaceC1184q) {
        int i10;
        AbstractC4134a.g(interfaceC1184q != null);
        if (this.f26874e) {
            this.f26874e = false;
            this.f26871b.X(0);
        }
        while (!this.f26874e) {
            if (this.f26872c < 0) {
                if (!this.f26870a.c(interfaceC1184q) || !this.f26870a.a(interfaceC1184q, true)) {
                    return false;
                }
                f fVar = this.f26870a;
                int i11 = fVar.f26882h;
                if ((fVar.f26876b & 1) == 1 && this.f26871b.j() == 0) {
                    i11 += a(0);
                    i10 = this.f26873d;
                } else {
                    i10 = 0;
                }
                if (!AbstractC1185s.f(interfaceC1184q, i11)) {
                    return false;
                }
                this.f26872c = i10;
            }
            int a10 = a(this.f26872c);
            int i12 = this.f26872c + this.f26873d;
            if (a10 > 0) {
                J j10 = this.f26871b;
                j10.d(j10.j() + a10);
                if (!AbstractC1185s.e(interfaceC1184q, this.f26871b.f(), this.f26871b.j(), a10)) {
                    return false;
                }
                J j11 = this.f26871b;
                j11.a0(j11.j() + a10);
                this.f26874e = this.f26870a.laces[i12 + (-1)] != 255;
            }
            if (i12 == this.f26870a.f26881g) {
                i12 = -1;
            }
            this.f26872c = i12;
        }
        return true;
    }

    public void e() {
        this.f26870a.b();
        this.f26871b.X(0);
        this.f26872c = -1;
        this.f26874e = false;
    }

    public void f() {
        if (this.f26871b.f().length == 65025) {
            return;
        }
        J j10 = this.f26871b;
        j10.Z(Arrays.copyOf(j10.f(), Math.max(65025, this.f26871b.j())), this.f26871b.j());
    }
}
