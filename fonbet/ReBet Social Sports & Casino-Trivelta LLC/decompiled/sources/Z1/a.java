package Z1;

import H1.InterfaceC1184q;
import b1.C2338G;
import e1.AbstractC4134a;
import java.util.ArrayDeque;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: c, reason: collision with root package name */
    public Z1.b f14441c;

    /* renamed from: d, reason: collision with root package name */
    public int f14442d;

    /* renamed from: e, reason: collision with root package name */
    public int f14443e;

    /* renamed from: f, reason: collision with root package name */
    public long f14444f;
    private final byte[] scratch = new byte[8];

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f14439a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final g f14440b = new g();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f14445a;

        /* renamed from: b, reason: collision with root package name */
        public final long f14446b;

        public b(int i10, long j10) {
            this.f14445a = i10;
            this.f14446b = j10;
        }
    }

    public static String f(InterfaceC1184q interfaceC1184q, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        interfaceC1184q.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // Z1.c
    public boolean a(InterfaceC1184q interfaceC1184q) {
        AbstractC4134a.i(this.f14441c);
        while (true) {
            b bVar = (b) this.f14439a.peek();
            if (bVar != null && interfaceC1184q.getPosition() >= bVar.f14446b) {
                this.f14441c.a(((b) this.f14439a.pop()).f14445a);
                return true;
            }
            if (this.f14442d == 0) {
                long d10 = this.f14440b.d(interfaceC1184q, true, false, 4);
                if (d10 == -2) {
                    d10 = c(interfaceC1184q);
                }
                if (d10 == -1) {
                    return false;
                }
                this.f14443e = (int) d10;
                this.f14442d = 1;
            }
            if (this.f14442d == 1) {
                this.f14444f = this.f14440b.d(interfaceC1184q, false, true, 8);
                this.f14442d = 2;
            }
            int e10 = this.f14441c.e(this.f14443e);
            if (e10 != 0) {
                if (e10 == 1) {
                    long position = interfaceC1184q.getPosition();
                    this.f14439a.push(new b(this.f14443e, this.f14444f + position));
                    this.f14441c.h(this.f14443e, position, this.f14444f);
                    this.f14442d = 0;
                    return true;
                }
                if (e10 == 2) {
                    long j10 = this.f14444f;
                    if (j10 <= 8) {
                        this.f14441c.d(this.f14443e, e(interfaceC1184q, (int) j10));
                        this.f14442d = 0;
                        return true;
                    }
                    throw C2338G.a("Invalid integer size: " + this.f14444f, null);
                }
                if (e10 == 3) {
                    long j11 = this.f14444f;
                    if (j11 <= 2147483647L) {
                        this.f14441c.g(this.f14443e, f(interfaceC1184q, (int) j11));
                        this.f14442d = 0;
                        return true;
                    }
                    throw C2338G.a("String element size: " + this.f14444f, null);
                }
                if (e10 == 4) {
                    this.f14441c.b(this.f14443e, (int) this.f14444f, interfaceC1184q);
                    this.f14442d = 0;
                    return true;
                }
                if (e10 != 5) {
                    throw C2338G.a("Invalid element type " + e10, null);
                }
                long j12 = this.f14444f;
                if (j12 == 4 || j12 == 8) {
                    this.f14441c.c(this.f14443e, d(interfaceC1184q, (int) j12));
                    this.f14442d = 0;
                    return true;
                }
                throw C2338G.a("Invalid float size: " + this.f14444f, null);
            }
            interfaceC1184q.l((int) this.f14444f);
            this.f14442d = 0;
        }
    }

    @Override // Z1.c
    public void b(Z1.b bVar) {
        this.f14441c = bVar;
    }

    public final long c(InterfaceC1184q interfaceC1184q) {
        interfaceC1184q.g();
        while (true) {
            interfaceC1184q.n(this.scratch, 0, 4);
            int c10 = g.c(this.scratch[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.scratch, c10, false);
                if (this.f14441c.f(a10)) {
                    interfaceC1184q.l(c10);
                    return a10;
                }
            }
            interfaceC1184q.l(1);
        }
    }

    public final double d(InterfaceC1184q interfaceC1184q, int i10) {
        return i10 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(e(interfaceC1184q, i10));
    }

    public final long e(InterfaceC1184q interfaceC1184q, int i10) {
        interfaceC1184q.readFully(this.scratch, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.scratch[i11] & UByte.MAX_VALUE);
        }
        return j10;
    }

    @Override // Z1.c
    public void reset() {
        this.f14442d = 0;
        this.f14439a.clear();
        this.f14440b.e();
    }
}
