package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class qo2 {
    public int a;
    public Object b;

    public qo2(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.b = pmo.c(bArr);
        this.a = i;
    }

    public abstract int A();

    public abstract long B();

    public void C(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            try {
                int i = this.a;
                if (cArr.length + i < eh0.a) {
                    this.a = i + cArr.length;
                    ((vg0) this.b).addLast(cArr);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean D(int i);

    public void E() {
        int z;
        do {
            z = z();
            if (z == 0) {
                return;
            }
            int i = this.a;
            if (i >= 100) {
                throw new naa("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.a = i + 1;
            this.a--;
        } while (D(z));
    }

    public char[] F(int i) {
        char[] cArr;
        synchronized (this) {
            vg0 vg0Var = (vg0) this.b;
            cArr = null;
            char[] cArr2 = (char[]) (vg0Var.isEmpty() ? null : vg0Var.removeLast());
            if (cArr2 != null) {
                this.a -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }

    public abstract int[] G(int i, int[] iArr);

    public abstract int H();

    public ByteBuffer I(int i, byte[] bArr) {
        int[] G = G(i, pmo.c(bArr));
        int[] iArr = (int[]) G.clone();
        pmo.a(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            G[i2] = G[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(G, 0, 16);
        return order;
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract x9l f(x9l x9lVar, List list);

    public abstract c0l g(d9l d9lVar, c0l c0lVar);

    public abstract void h(int i);

    public abstract int i(int i);

    public abstract boolean j();

    public abstract cc2 k();

    public abstract ec2 l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    public qo2() {
        this.b = new vg0();
    }

    public void d(d9l d9lVar) {
    }

    public void e(d9l d9lVar) {
    }

    public qo2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public qo2(int i) {
        this.a = i;
    }
}
