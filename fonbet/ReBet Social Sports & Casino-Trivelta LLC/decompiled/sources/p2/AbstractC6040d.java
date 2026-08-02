package p2;

import H1.InterfaceC1184q;
import android.util.Pair;
import b1.C2338G;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.J;
import e1.Z;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.math.ec.Tnaf;

/* renamed from: p2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6040d {
    private static final byte[] WAVEEXT_SUBFORMAT = {0, 0, 0, 0, Tnaf.POW_2_WIDTH, 0, ByteCompanionObject.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] AMBISONIC_SUBFORMAT = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* renamed from: p2.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f63021a;

        /* renamed from: b, reason: collision with root package name */
        public final long f63022b;

        public a(int i10, long j10) {
            this.f63021a = i10;
            this.f63022b = j10;
        }

        public static a a(InterfaceC1184q interfaceC1184q, J j10) {
            interfaceC1184q.n(j10.f(), 0, 8);
            j10.b0(0);
            return new a(j10.v(), j10.C());
        }
    }

    public static boolean a(InterfaceC1184q interfaceC1184q) {
        J j10 = new J(8);
        int i10 = a.a(interfaceC1184q, j10).f63021a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        interfaceC1184q.n(j10.f(), 0, 4);
        j10.b0(0);
        int v10 = j10.v();
        if (v10 == 1463899717) {
            return true;
        }
        AbstractC4156x.d("WavHeaderReader", "Unsupported form type: " + v10);
        return false;
    }

    public static C6039c b(InterfaceC1184q interfaceC1184q) {
        byte[] bArr;
        J j10 = new J(16);
        a d10 = d(1718449184, interfaceC1184q, j10);
        AbstractC4134a.g(d10.f63022b >= 16);
        interfaceC1184q.n(j10.f(), 0, 16);
        j10.b0(0);
        int E10 = j10.E();
        int E11 = j10.E();
        int D10 = j10.D();
        int D11 = j10.D();
        int E12 = j10.E();
        int E13 = j10.E();
        int i10 = ((int) d10.f63022b) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            interfaceC1184q.n(bArr, 0, i10);
            if (E10 == 65534 && i10 == 24) {
                J j11 = new J(bArr);
                j11.E();
                int E14 = j11.E();
                if (E14 != 0 && E14 != E13) {
                    throw C2338G.d("validBits ( " + E14 + ")  != bitsPerSample( " + E13 + ") are not supported");
                }
                int D12 = j11.D();
                if ((D12 >> 18) != 0) {
                    throw C2338G.d("invalid channel mask " + D12);
                }
                if (D12 != 0 && Integer.bitCount(D12) != E11) {
                    throw C2338G.d("invalid number of channels (" + Integer.bitCount(D12) + ") in channel mask " + D12);
                }
                E10 = j11.E();
                byte[] bArr2 = new byte[14];
                j11.q(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, WAVEEXT_SUBFORMAT) && !Arrays.equals(bArr2, AMBISONIC_SUBFORMAT)) {
                    throw C2338G.d("invalid wav format extension guid");
                }
            }
        } else {
            bArr = Z.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr3 = bArr;
        int i11 = E10;
        interfaceC1184q.l((int) (interfaceC1184q.i() - interfaceC1184q.getPosition()));
        return new C6039c(i11, E11, D10, D11, E12, E13, bArr3);
    }

    public static long c(InterfaceC1184q interfaceC1184q) {
        J j10 = new J(8);
        a a10 = a.a(interfaceC1184q, j10);
        if (a10.f63021a != 1685272116) {
            interfaceC1184q.g();
            return -1L;
        }
        interfaceC1184q.j(8);
        j10.b0(0);
        interfaceC1184q.n(j10.f(), 0, 8);
        long A10 = j10.A();
        interfaceC1184q.l(((int) a10.f63022b) + 8);
        return A10;
    }

    public static a d(int i10, InterfaceC1184q interfaceC1184q, J j10) {
        a a10 = a.a(interfaceC1184q, j10);
        while (a10.f63021a != i10) {
            AbstractC4156x.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + a10.f63021a);
            long j11 = a10.f63022b;
            long j12 = 8 + j11;
            if (j11 % 2 != 0) {
                j12 = 9 + j11;
            }
            if (j12 > 2147483647L) {
                throw C2338G.d("Chunk is too large (~2GB+) to skip; id: " + a10.f63021a);
            }
            interfaceC1184q.l((int) j12);
            a10 = a.a(interfaceC1184q, j10);
        }
        return a10;
    }

    public static Pair e(InterfaceC1184q interfaceC1184q) {
        interfaceC1184q.g();
        a d10 = d(1684108385, interfaceC1184q, new J(8));
        interfaceC1184q.l(8);
        return Pair.create(Long.valueOf(interfaceC1184q.getPosition()), Long.valueOf(d10.f63022b));
    }
}
