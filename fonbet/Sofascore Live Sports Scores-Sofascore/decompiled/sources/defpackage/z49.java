package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class z49 implements cwh {
    public byte a;
    public final lof b;
    public final Inflater c;
    public final n2a d;
    public final CRC32 e;

    public z49(l62 l62Var) {
        l62Var.getClass();
        lof lofVar = new lof(l62Var);
        this.b = lofVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new n2a(lofVar, inflater);
        this.e = new CRC32();
    }

    public static void e(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        StringBuilder r = mz1.r(str, ": actual 0x");
        r.append(StringsKt.U(8, yqo.M(i2)));
        r.append(" != expected 0x");
        r.append(StringsKt.U(8, yqo.M(i)));
        throw new IOException(r.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void f(x52 x52Var, long j, long j2) {
        b1h b1hVar = x52Var.a;
        b1hVar.getClass();
        while (true) {
            long j3 = b1hVar.c - b1hVar.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            b1hVar = b1hVar.f;
            b1hVar.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(b1hVar.c - r6, j2);
            this.e.update(b1hVar.a, (int) (b1hVar.b + j), min);
            j2 -= min;
            b1hVar = b1hVar.f;
            b1hVar.getClass();
            j = 0;
        }
    }

    @Override // defpackage.cwh
    public final long read(x52 x52Var, long j) {
        byte b;
        x52 x52Var2;
        z49 z49Var = this;
        lof lofVar = z49Var.b;
        x52 x52Var3 = lofVar.b;
        x52Var.getClass();
        if (j < 0) {
            ogj.h(vxd.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = z49Var.a;
        CRC32 crc32 = z49Var.e;
        if (b2 == 0) {
            lofVar.o(10L);
            byte t = x52Var3.t(3L);
            boolean z = ((t >> 1) & 1) == 1;
            if (z) {
                z49Var.f(x52Var3, 0L, 10L);
            }
            e(8075, lofVar.readShort(), "ID1ID2");
            lofVar.skip(8L);
            if (((t >> 2) & 1) == 1) {
                lofVar.o(2L);
                if (z) {
                    f(x52Var3, 0L, 2L);
                }
                long u0 = x52Var3.u0() & 65535;
                lofVar.o(u0);
                if (z) {
                    f(x52Var3, 0L, u0);
                }
                x52Var2 = x52Var3;
                lofVar.skip(u0);
            } else {
                x52Var2 = x52Var3;
            }
            if (((t >> 3) & 1) == 1) {
                long e = lofVar.e((byte) 0, 0L, Long.MAX_VALUE);
                if (e == -1) {
                    a70.q();
                    return 0L;
                }
                if (z) {
                    f(x52Var2, 0L, e + 1);
                }
                lofVar.skip(e + 1);
            }
            if (((t >> 4) & 1) == 1) {
                long e2 = lofVar.e((byte) 0, 0L, Long.MAX_VALUE);
                if (e2 == -1) {
                    a70.q();
                    return 0L;
                }
                if (z) {
                    z49Var = this;
                    z49Var.f(x52Var2, 0L, e2 + 1);
                } else {
                    z49Var = this;
                }
                lofVar.skip(e2 + 1);
            } else {
                z49Var = this;
            }
            if (z) {
                e(lofVar.m(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            z49Var.a = (byte) 1;
            b2 = 1;
        }
        if (b2 == 1) {
            long j2 = x52Var.b;
            long read = z49Var.d.read(x52Var, j);
            if (read != -1) {
                z49Var.f(x52Var, j2, read);
                return read;
            }
            b = 2;
            z49Var.a = (byte) 2;
            b2 = 2;
        } else {
            b = 2;
        }
        if (b2 == b) {
            e(lofVar.K0(), (int) crc32.getValue(), "CRC");
            e(lofVar.K0(), (int) z49Var.c.getBytesWritten(), "ISIZE");
            z49Var.a = (byte) 3;
            if (!lofVar.w()) {
                is8.e("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // defpackage.cwh
    public final pij timeout() {
        return this.b.a.timeout();
    }
}
