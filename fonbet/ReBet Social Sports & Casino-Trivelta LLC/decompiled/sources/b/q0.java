package b;

import java.io.OutputStream;

/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f24140a;

    public q0(OutputStream outputStream) {
        this.f24140a = outputStream;
    }

    public static int a(boolean z10, int i10) {
        int i11;
        if (i10 >= 128) {
            i11 = 2;
            int i12 = i10;
            while (true) {
                i12 >>>= 8;
                if (i12 == 0) {
                    break;
                }
                i11++;
            }
        } else {
            i11 = 1;
        }
        return i11 + (z10 ? 1 : 0) + i10;
    }

    public C2325v b() {
        return new C2325v(this.f24140a);
    }

    public final void c(int i10) {
        if (i10 < 128) {
            this.f24140a.write(i10);
            return;
        }
        int i11 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i12 = i11 - 1;
            bArr[i12] = (byte) i10;
            i10 >>>= 8;
            if (i10 == 0) {
                int i13 = i11 - 2;
                bArr[i13] = (byte) ((5 - i12) | 128);
                this.f24140a.write(bArr, i13, 6 - i12);
                return;
            }
            i11 = i12;
        }
    }

    public final void d(int i10, int i11) {
        if (i11 < 31) {
            this.f24140a.write(i10 | i11);
            return;
        }
        byte[] bArr = new byte[6];
        int i12 = 5;
        bArr[5] = (byte) (i11 & 127);
        while (i11 > 127) {
            i11 >>>= 7;
            i12--;
            bArr[i12] = (byte) ((i11 & 127) | 128);
        }
        int i13 = i12 - 1;
        bArr[i13] = (byte) (i10 | 31);
        this.f24140a.write(bArr, i13, 6 - i13);
    }

    public void e(w0 w0Var) {
        w0Var.b(this, true);
    }

    public final void f(boolean z10, int i10, byte[] bArr) {
        k(z10, i10);
        c(bArr.length);
        this.f24140a.write(bArr, 0, bArr.length);
    }

    public final void g(boolean z10, int i10, InterfaceC2323t[] interfaceC2323tArr) {
        k(z10, i10);
        this.f24140a.write(128);
        h(interfaceC2323tArr);
        this.f24140a.write(0);
        this.f24140a.write(0);
    }

    public void h(InterfaceC2323t[] interfaceC2323tArr) {
        for (InterfaceC2323t interfaceC2323t : interfaceC2323tArr) {
            interfaceC2323t.d().b(this, true);
        }
    }

    public void i(w0[] w0VarArr) {
        for (w0 w0Var : w0VarArr) {
            w0Var.b(this, true);
        }
    }

    public m0 j() {
        return new m0(this.f24140a);
    }

    public final void k(boolean z10, int i10) {
        if (z10) {
            this.f24140a.write(i10);
        }
    }
}
