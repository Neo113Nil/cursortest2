package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ig3 extends f7 {
    public static final wib e = new wib(18);
    public static final ccd f = new ccd();
    public static final q1f g = new q1f(18);
    public static final tnf h = new tnf(18);
    public static final hjg i = new hjg();
    public final ArrayDeque a;
    public ArrayDeque b;
    public int c;
    public boolean d;

    public ig3() {
        new ArrayDeque(2);
        this.a = new ArrayDeque();
    }

    @Override // defpackage.f7
    public final int C() {
        return e0(e, 1, null, 0);
    }

    @Override // defpackage.f7
    public final int H() {
        return this.c;
    }

    @Override // defpackage.f7
    public final void M(int i2) {
        e0(f, i2, null, 0);
    }

    public final void T(f7 f7Var) {
        boolean z = this.d;
        ArrayDeque arrayDeque = this.a;
        boolean z2 = z && arrayDeque.isEmpty();
        if (f7Var instanceof ig3) {
            ig3 ig3Var = (ig3) f7Var;
            ArrayDeque arrayDeque2 = ig3Var.a;
            while (!arrayDeque2.isEmpty()) {
                arrayDeque.add((f7) arrayDeque2.remove());
            }
            this.c += ig3Var.c;
            ig3Var.c = 0;
            ig3Var.close();
        } else {
            arrayDeque.add(f7Var);
            this.c = f7Var.H() + this.c;
        }
        if (z2) {
            ((f7) arrayDeque.peek()).h();
        }
    }

    public final void Z() {
        boolean z = this.d;
        ArrayDeque arrayDeque = this.a;
        if (!z) {
            ((f7) arrayDeque.remove()).close();
            return;
        }
        this.b.add((f7) arrayDeque.remove());
        f7 f7Var = (f7) arrayDeque.peek();
        if (f7Var != null) {
            f7Var.h();
        }
    }

    public final int a0(hg3 hg3Var, int i2, Object obj, int i3) {
        e(i2);
        ArrayDeque arrayDeque = this.a;
        if (!arrayDeque.isEmpty() && ((f7) arrayDeque.peek()).H() == 0) {
            Z();
        }
        while (i2 > 0 && !arrayDeque.isEmpty()) {
            f7 f7Var = (f7) arrayDeque.peek();
            int min = Math.min(i2, f7Var.H());
            i3 = hg3Var.l(f7Var, min, obj, i3);
            i2 -= min;
            this.c -= min;
            if (((f7) arrayDeque.peek()).H() == 0) {
                Z();
            }
        }
        if (i2 <= 0) {
            return i3;
        }
        a70.j("Failed executing read operation");
        return 0;
    }

    @Override // defpackage.f7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((f7) arrayDeque.remove()).close();
            }
        }
        if (this.b != null) {
            while (!this.b.isEmpty()) {
                ((f7) this.b.remove()).close();
            }
        }
    }

    public final int e0(gg3 gg3Var, int i2, Object obj, int i3) {
        try {
            return a0(gg3Var, i2, obj, i3);
        } catch (IOException e2) {
            a70.j(e2);
            return 0;
        }
    }

    @Override // defpackage.f7
    public final void h() {
        ArrayDeque arrayDeque = this.b;
        ArrayDeque arrayDeque2 = this.a;
        if (arrayDeque == null) {
            this.b = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.b.isEmpty()) {
            ((f7) this.b.remove()).close();
        }
        this.d = true;
        f7 f7Var = (f7) arrayDeque2.peek();
        if (f7Var != null) {
            f7Var.h();
        }
    }

    @Override // defpackage.f7
    public final boolean k() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!((f7) it.next()).k()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.f7
    public final f7 m(int i2) {
        f7 f7Var;
        int i3;
        f7 f7Var2;
        if (i2 <= 0) {
            return cof.a;
        }
        e(i2);
        this.c -= i2;
        f7 f7Var3 = null;
        ig3 ig3Var = null;
        while (true) {
            ArrayDeque arrayDeque = this.a;
            f7 f7Var4 = (f7) arrayDeque.peek();
            int H = f7Var4.H();
            if (H > i2) {
                f7Var2 = f7Var4.m(i2);
                i3 = 0;
            } else {
                if (this.d) {
                    f7Var = f7Var4.m(H);
                    Z();
                } else {
                    f7Var = (f7) arrayDeque.poll();
                }
                f7 f7Var5 = f7Var;
                i3 = i2 - H;
                f7Var2 = f7Var5;
            }
            if (f7Var3 == null) {
                f7Var3 = f7Var2;
            } else {
                if (ig3Var == null) {
                    ig3Var = new ig3(i3 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    ig3Var.T(f7Var3);
                    f7Var3 = ig3Var;
                }
                ig3Var.T(f7Var2);
            }
            if (i3 <= 0) {
                return f7Var3;
            }
            i2 = i3;
        }
    }

    @Override // defpackage.f7
    public final void n(OutputStream outputStream, int i2) {
        a0(i, i2, outputStream, 0);
    }

    @Override // defpackage.f7
    public final void p(ByteBuffer byteBuffer) {
        e0(h, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.f7
    public final void reset() {
        if (!this.d) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.a;
        f7 f7Var = (f7) arrayDeque.peek();
        if (f7Var != null) {
            int H = f7Var.H();
            f7Var.reset();
            this.c = (f7Var.H() - H) + this.c;
        }
        while (true) {
            f7 f7Var2 = (f7) this.b.pollLast();
            if (f7Var2 == null) {
                return;
            }
            f7Var2.reset();
            arrayDeque.addFirst(f7Var2);
            this.c = f7Var2.H() + this.c;
        }
    }

    @Override // defpackage.f7
    public final void t(byte[] bArr, int i2, int i3) {
        e0(g, i3, bArr, i2);
    }

    public ig3(int i2) {
        new ArrayDeque(2);
        this.a = new ArrayDeque(i2);
    }
}
