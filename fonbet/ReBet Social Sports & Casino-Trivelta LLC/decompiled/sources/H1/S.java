package H1;

import android.util.Base64;
import b1.C2334C;
import b1.C2338G;
import com.google.common.collect.AbstractC3445z;
import com.plaid.internal.EnumC3631g;
import e1.AbstractC4156x;
import e1.Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class S {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f4362a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4363b;
        public final String[] comments;

        public a(String str, String[] strArr, int i10) {
            this.f4362a = str;
            this.comments = strArr;
            this.f4363b = i10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4364a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4365b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4366c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4367d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f4364a = z10;
            this.f4365b = i10;
            this.f4366c = i11;
            this.f4367d = i12;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f4368a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4369b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4370c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4371d;
        public final byte[] data;

        /* renamed from: e, reason: collision with root package name */
        public final int f4372e;

        /* renamed from: f, reason: collision with root package name */
        public final int f4373f;

        /* renamed from: g, reason: collision with root package name */
        public final int f4374g;

        /* renamed from: h, reason: collision with root package name */
        public final int f4375h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f4376i;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f4368a = i10;
            this.f4369b = i11;
            this.f4370c = i12;
            this.f4371d = i13;
            this.f4372e = i14;
            this.f4373f = i15;
            this.f4374g = i16;
            this.f4375h = i17;
            this.f4376i = z10;
            this.data = bArr;
        }
    }

    public static int[] a(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static long c(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static C2334C d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] B12 = Z.B1(str, "=");
            if (B12.length != 2) {
                AbstractC4156x.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (B12[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(T1.a.d(new e1.J(Base64.decode(B12[1], 0))));
                } catch (RuntimeException e10) {
                    AbstractC4156x.j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new Y1.a(B12[0], B12[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2334C(arrayList);
    }

    public static AbstractC3445z e(byte[] bArr) {
        e1.J j10 = new e1.J(bArr);
        j10.c0(1);
        int i10 = 0;
        while (j10.a() > 0 && j10.n() == 255) {
            i10 += 255;
            j10.c0(1);
        }
        int M10 = i10 + j10.M();
        int i11 = 0;
        while (j10.a() > 0 && j10.n() == 255) {
            i11 += 255;
            j10.c0(1);
        }
        int M11 = i11 + j10.M();
        byte[] bArr2 = new byte[M10];
        int g10 = j10.g();
        System.arraycopy(bArr, g10, bArr2, 0, M10);
        int i12 = g10 + M10 + M11;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return AbstractC3445z.v(bArr2, bArr3);
    }

    public static void f(Q q10) {
        int d10 = q10.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            int d11 = q10.d(16);
            if (d11 == 0) {
                q10.e(8);
                q10.e(16);
                q10.e(16);
                q10.e(6);
                q10.e(8);
                int d12 = q10.d(4) + 1;
                for (int i11 = 0; i11 < d12; i11++) {
                    q10.e(8);
                }
            } else {
                if (d11 != 1) {
                    throw C2338G.a("floor type greater than 1 not decodable: " + d11, null);
                }
                int d13 = q10.d(5);
                int[] iArr = new int[d13];
                int i12 = -1;
                for (int i13 = 0; i13 < d13; i13++) {
                    int d14 = q10.d(4);
                    iArr[i13] = d14;
                    if (d14 > i12) {
                        i12 = d14;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = q10.d(3) + 1;
                    int d15 = q10.d(2);
                    if (d15 > 0) {
                        q10.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << d15); i16++) {
                        q10.e(8);
                    }
                }
                q10.e(2);
                int d16 = q10.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < d13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        q10.e(d16);
                        i18++;
                    }
                }
            }
        }
    }

    public static void g(int i10, Q q10) {
        int d10 = q10.d(6) + 1;
        for (int i11 = 0; i11 < d10; i11++) {
            int d11 = q10.d(16);
            if (d11 != 0) {
                AbstractC4156x.d("VorbisUtil", "mapping type other than 0 not supported: " + d11);
            } else {
                int d12 = q10.c() ? q10.d(4) + 1 : 1;
                if (q10.c()) {
                    int d13 = q10.d(8) + 1;
                    for (int i12 = 0; i12 < d13; i12++) {
                        int i13 = i10 - 1;
                        q10.e(b(i13));
                        q10.e(b(i13));
                    }
                }
                if (q10.d(2) != 0) {
                    throw C2338G.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (d12 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        q10.e(4);
                    }
                }
                for (int i15 = 0; i15 < d12; i15++) {
                    q10.e(8);
                    q10.e(8);
                    q10.e(8);
                }
            }
        }
    }

    public static b[] h(Q q10) {
        int d10 = q10.d(6) + 1;
        b[] bVarArr = new b[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            bVarArr[i10] = new b(q10.c(), q10.d(16), q10.d(16), q10.d(8));
        }
        return bVarArr;
    }

    public static void i(Q q10) {
        int d10 = q10.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            if (q10.d(16) > 2) {
                throw C2338G.a("residueType greater than 2 is not decodable", null);
            }
            q10.e(24);
            q10.e(24);
            q10.e(24);
            int d11 = q10.d(6) + 1;
            q10.e(8);
            int[] iArr = new int[d11];
            for (int i11 = 0; i11 < d11; i11++) {
                iArr[i11] = ((q10.c() ? q10.d(5) : 0) * 8) + q10.d(3);
            }
            for (int i12 = 0; i12 < d11; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        q10.e(8);
                    }
                }
            }
        }
    }

    public static a j(e1.J j10) {
        return k(j10, true, true);
    }

    public static a k(e1.J j10, boolean z10, boolean z11) {
        if (z10) {
            o(3, j10, false);
        }
        String J10 = j10.J((int) j10.C());
        int length = J10.length();
        long C10 = j10.C();
        String[] strArr = new String[(int) C10];
        int i10 = length + 15;
        for (int i11 = 0; i11 < C10; i11++) {
            String J11 = j10.J((int) j10.C());
            strArr[i11] = J11;
            i10 = i10 + 4 + J11.length();
        }
        if (z11 && (j10.M() & 1) == 0) {
            throw C2338G.a("framing bit expected to be set", null);
        }
        return new a(J10, strArr, i10 + 1);
    }

    public static c l(e1.J j10) {
        o(1, j10, false);
        int D10 = j10.D();
        int M10 = j10.M();
        int D11 = j10.D();
        int z10 = j10.z();
        if (z10 <= 0) {
            z10 = -1;
        }
        int z11 = j10.z();
        if (z11 <= 0) {
            z11 = -1;
        }
        int z12 = j10.z();
        if (z12 <= 0) {
            z12 = -1;
        }
        int M11 = j10.M();
        return new c(D10, M10, D11, z10, z11, z12, (int) Math.pow(2.0d, M11 & 15), (int) Math.pow(2.0d, (M11 & EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4), (j10.M() & 1) > 0, Arrays.copyOf(j10.f(), j10.j()));
    }

    public static b[] m(e1.J j10, int i10) {
        o(5, j10, false);
        int M10 = j10.M() + 1;
        Q q10 = new Q(j10.f());
        q10.e(j10.g() * 8);
        for (int i11 = 0; i11 < M10; i11++) {
            n(q10);
        }
        int d10 = q10.d(6) + 1;
        for (int i12 = 0; i12 < d10; i12++) {
            if (q10.d(16) != 0) {
                throw C2338G.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(q10);
        i(q10);
        g(i10, q10);
        b[] h10 = h(q10);
        if (q10.c()) {
            return h10;
        }
        throw C2338G.a("framing bit after modes not set as expected", null);
    }

    public static void n(Q q10) {
        if (q10.d(24) != 5653314) {
            throw C2338G.a("expected code book to start with [0x56, 0x43, 0x42] at " + q10.b(), null);
        }
        int d10 = q10.d(16);
        int d11 = q10.d(24);
        int i10 = 0;
        if (q10.c()) {
            q10.e(5);
            while (i10 < d11) {
                i10 += q10.d(b(d11 - i10));
            }
        } else {
            boolean c10 = q10.c();
            while (i10 < d11) {
                if (!c10) {
                    q10.e(5);
                } else if (q10.c()) {
                    q10.e(5);
                }
                i10++;
            }
        }
        int d12 = q10.d(4);
        if (d12 > 2) {
            throw C2338G.a("lookup type greater than 2 not decodable: " + d12, null);
        }
        if (d12 == 1 || d12 == 2) {
            q10.e(32);
            q10.e(32);
            int d13 = q10.d(4) + 1;
            q10.e(1);
            q10.e((int) ((d12 == 1 ? d10 != 0 ? c(d11, d10) : 0L : d10 * d11) * d13));
        }
    }

    public static boolean o(int i10, e1.J j10, boolean z10) {
        if (j10.a() < 7) {
            if (z10) {
                return false;
            }
            throw C2338G.a("too short header: " + j10.a(), null);
        }
        if (j10.M() != i10) {
            if (z10) {
                return false;
            }
            throw C2338G.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (j10.M() == 118 && j10.M() == 111 && j10.M() == 114 && j10.M() == 98 && j10.M() == 105 && j10.M() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw C2338G.a("expected characters 'vorbis'", null);
    }
}
