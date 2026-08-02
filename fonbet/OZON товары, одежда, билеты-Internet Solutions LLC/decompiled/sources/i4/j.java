package i4;

import N3.O;
import N3.P;
import com.google.common.collect.AbstractC5880y;
import i4.i;
import j3.C7272n;
import j3.t;
import j3.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import m3.C8050C;
import m3.s;

/* loaded from: classes8.dex */
final class j extends i {

    /* renamed from: n, reason: collision with root package name */
    private a f65847n;

    /* renamed from: o, reason: collision with root package name */
    private int f65848o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f65849p;

    /* renamed from: q, reason: collision with root package name */
    private P.c f65850q;

    /* renamed from: r, reason: collision with root package name */
    private P.a f65851r;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final P.c f65852a;

        /* renamed from: b, reason: collision with root package name */
        public final P.a f65853b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f65854c;

        /* renamed from: d, reason: collision with root package name */
        public final P.b[] f65855d;

        /* renamed from: e, reason: collision with root package name */
        public final int f65856e;

        public a(P.c cVar, P.a aVar, byte[] bArr, P.b[] bVarArr, int i11) {
            this.f65852a = cVar;
            this.f65853b = aVar;
            this.f65854c = bArr;
            this.f65855d = bVarArr;
            this.f65856e = i11;
        }
    }

    j() {
    }

    public static boolean j(C8050C c8050c) {
        try {
            return P.f(1, c8050c, true);
        } catch (v unused) {
            return false;
        }
    }

    @Override // i4.i
    protected final void d(long j11) {
        super.d(j11);
        this.f65849p = j11 != 0;
        P.c cVar = this.f65850q;
        this.f65848o = cVar != null ? cVar.f18537e : 0;
    }

    @Override // i4.i
    protected final long e(C8050C c8050c) {
        if ((c8050c.e()[0] & 1) == 1) {
            return -1L;
        }
        byte b11 = c8050c.e()[0];
        a aVar = this.f65847n;
        G10.a.i(aVar);
        boolean z11 = aVar.f65855d[(b11 >> 1) & (255 >>> (8 - aVar.f65856e))].f18532a;
        P.c cVar = aVar.f65852a;
        int i11 = !z11 ? cVar.f18537e : cVar.f18538f;
        long j11 = this.f65849p ? (this.f65848o + i11) / 4 : 0;
        if (c8050c.b() < c8050c.i() + 4) {
            byte[] copyOf = Arrays.copyOf(c8050c.e(), c8050c.i() + 4);
            c8050c.P(copyOf.length, copyOf);
        } else {
            c8050c.Q(c8050c.i() + 4);
        }
        byte[] e11 = c8050c.e();
        e11[c8050c.i() - 4] = (byte) (j11 & 255);
        e11[c8050c.i() - 3] = (byte) ((j11 >>> 8) & 255);
        e11[c8050c.i() - 2] = (byte) ((j11 >>> 16) & 255);
        e11[c8050c.i() - 1] = (byte) ((j11 >>> 24) & 255);
        this.f65849p = true;
        this.f65848o = i11;
        return j11;
    }

    @Override // i4.i
    protected final boolean g(C8050C c8050c, long j11, i.a aVar) throws IOException {
        a aVar2;
        int i11;
        if (this.f65847n != null) {
            aVar.f65845a.getClass();
            return false;
        }
        P.c cVar = this.f65850q;
        int i12 = 1;
        int i13 = 4;
        if (cVar == null) {
            P.f(1, c8050c, false);
            c8050c.w();
            int E11 = c8050c.E();
            int w11 = c8050c.w();
            int s11 = c8050c.s();
            int i14 = s11 <= 0 ? -1 : s11;
            int s12 = c8050c.s();
            int i15 = s12 <= 0 ? -1 : s12;
            c8050c.s();
            int E12 = c8050c.E();
            int pow = (int) Math.pow(2.0d, E12 & 15);
            int pow2 = (int) Math.pow(2.0d, (E12 & 240) >> 4);
            c8050c.E();
            this.f65850q = new P.c(E11, w11, i14, i15, pow, pow2, Arrays.copyOf(c8050c.e(), c8050c.i()));
        } else {
            P.a aVar3 = this.f65851r;
            if (aVar3 == null) {
                this.f65851r = P.e(c8050c, true, true);
            } else {
                byte[] bArr = new byte[c8050c.i()];
                System.arraycopy(c8050c.e(), 0, bArr, 0, c8050c.i());
                int i16 = 5;
                P.f(5, c8050c, false);
                int E13 = c8050c.E() + 1;
                O o11 = new O(c8050c.e());
                o11.d(c8050c.f() * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 2;
                    int i19 = 16;
                    if (i17 >= E13) {
                        int i21 = 6;
                        int c11 = o11.c(6) + 1;
                        for (int i22 = 0; i22 < c11; i22++) {
                            if (o11.c(16) != 0) {
                                throw v.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int c12 = o11.c(6) + 1;
                        int i23 = 0;
                        while (true) {
                            int i24 = 3;
                            if (i23 < c12) {
                                int c13 = o11.c(i19);
                                if (c13 == 0) {
                                    i11 = i12;
                                    int i25 = 8;
                                    o11.d(8);
                                    o11.d(16);
                                    o11.d(16);
                                    o11.d(6);
                                    o11.d(8);
                                    int c14 = o11.c(4) + 1;
                                    int i26 = 0;
                                    while (i26 < c14) {
                                        o11.d(i25);
                                        i26++;
                                        i25 = 8;
                                    }
                                } else {
                                    if (c13 != i12) {
                                        throw v.a(null, "floor type greater than 1 not decodable: " + c13);
                                    }
                                    int c15 = o11.c(i16);
                                    i11 = i12;
                                    int[] iArr = new int[c15];
                                    int i27 = -1;
                                    for (int i28 = 0; i28 < c15; i28++) {
                                        int c16 = o11.c(i13);
                                        iArr[i28] = c16;
                                        if (c16 > i27) {
                                            i27 = c16;
                                        }
                                    }
                                    int i29 = i27 + 1;
                                    int[] iArr2 = new int[i29];
                                    int i31 = 0;
                                    while (i31 < i29) {
                                        iArr2[i31] = o11.c(i24) + 1;
                                        int c17 = o11.c(i18);
                                        int i32 = 8;
                                        if (c17 > 0) {
                                            o11.d(8);
                                        }
                                        int i33 = 0;
                                        while (i33 < (i11 << c17)) {
                                            o11.d(i32);
                                            i33++;
                                            i32 = 8;
                                        }
                                        i31++;
                                        i18 = 2;
                                        i24 = 3;
                                    }
                                    o11.d(i18);
                                    int c18 = o11.c(4);
                                    int i34 = 0;
                                    int i35 = 0;
                                    for (int i36 = 0; i36 < c15; i36++) {
                                        i34 += iArr2[iArr[i36]];
                                        while (i35 < i34) {
                                            o11.d(c18);
                                            i35++;
                                        }
                                    }
                                }
                                i23++;
                                i12 = i11;
                                i21 = 6;
                                i18 = 2;
                                i13 = 4;
                                i19 = 16;
                                i16 = 5;
                            } else {
                                int i37 = i12;
                                int c19 = o11.c(i21) + 1;
                                int i38 = 0;
                                while (i38 < c19) {
                                    if (o11.c(16) > 2) {
                                        throw v.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    o11.d(24);
                                    o11.d(24);
                                    o11.d(24);
                                    int c21 = o11.c(i21) + 1;
                                    int i39 = 8;
                                    o11.d(8);
                                    int[] iArr3 = new int[c21];
                                    for (int i41 = 0; i41 < c21; i41++) {
                                        iArr3[i41] = ((o11.b() ? o11.c(5) : 0) * 8) + o11.c(3);
                                    }
                                    int i42 = 0;
                                    while (i42 < c21) {
                                        int i43 = 0;
                                        while (i43 < i39) {
                                            if ((iArr3[i42] & (i37 << i43)) != 0) {
                                                o11.d(i39);
                                            }
                                            i43++;
                                            i39 = 8;
                                        }
                                        i42++;
                                        i39 = 8;
                                    }
                                    i38++;
                                    i21 = 6;
                                }
                                int c22 = o11.c(i21) + 1;
                                int i44 = 0;
                                while (i44 < c22) {
                                    int c23 = o11.c(16);
                                    if (c23 != 0) {
                                        s.c("VorbisUtil", "mapping type other than 0 not supported: " + c23);
                                    } else {
                                        int c24 = o11.b() ? o11.c(4) + 1 : i37;
                                        boolean b11 = o11.b();
                                        int i45 = cVar.f18533a;
                                        if (b11) {
                                            int c25 = o11.c(8) + 1;
                                            for (int i46 = 0; i46 < c25; i46++) {
                                                int i47 = i45 - 1;
                                                o11.d(P.b(i47));
                                                o11.d(P.b(i47));
                                            }
                                        }
                                        if (o11.c(2) != 0) {
                                            throw v.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (c24 > i37) {
                                            for (int i48 = 0; i48 < i45; i48++) {
                                                o11.d(4);
                                            }
                                        }
                                        for (int i49 = 0; i49 < c24; i49++) {
                                            o11.d(8);
                                            o11.d(8);
                                            o11.d(8);
                                        }
                                    }
                                    i44++;
                                    i37 = 1;
                                }
                                int c26 = o11.c(6);
                                int i51 = c26 + 1;
                                P.b[] bVarArr = new P.b[i51];
                                for (int i52 = 0; i52 < i51; i52++) {
                                    boolean b12 = o11.b();
                                    o11.c(16);
                                    o11.c(16);
                                    o11.c(8);
                                    bVarArr[i52] = new P.b(b12);
                                }
                                if (!o11.b()) {
                                    throw v.a(null, "framing bit after modes not set as expected");
                                }
                                aVar2 = new a(cVar, aVar3, bArr, bVarArr, P.b(c26));
                            }
                        }
                    } else {
                        if (o11.c(24) != 5653314) {
                            throw v.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + o11.a());
                        }
                        int c27 = o11.c(16);
                        int c28 = o11.c(24);
                        if (o11.b()) {
                            o11.d(5);
                            for (int i53 = 0; i53 < c28; i53 += o11.c(P.b(c28 - i53))) {
                            }
                        } else {
                            boolean b13 = o11.b();
                            for (int i54 = 0; i54 < c28; i54++) {
                                if (!b13) {
                                    o11.d(5);
                                } else if (o11.b()) {
                                    o11.d(5);
                                }
                            }
                        }
                        int c29 = o11.c(4);
                        if (c29 > 2) {
                            throw v.a(null, "lookup type greater than 2 not decodable: " + c29);
                        }
                        if (c29 == 1 || c29 == 2) {
                            o11.d(32);
                            o11.d(32);
                            int c31 = o11.c(4) + 1;
                            o11.d(1);
                            o11.d((int) ((c29 == 1 ? c27 != 0 ? (long) Math.floor(Math.pow(c28, 1.0d / c27)) : 0L : c27 * c28) * c31));
                        }
                        i17++;
                    }
                }
            }
        }
        aVar2 = null;
        this.f65847n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        P.c cVar2 = aVar2.f65852a;
        arrayList.add(cVar2.f18539g);
        arrayList.add(aVar2.f65854c);
        t c32 = P.c(AbstractC5880y.s(aVar2.f65853b.f18531a));
        C7272n.a aVar4 = new C7272n.a();
        aVar4.W("audio/ogg");
        aVar4.y0("audio/vorbis");
        aVar4.S(cVar2.f18536d);
        aVar4.t0(cVar2.f18535c);
        aVar4.T(cVar2.f18533a);
        aVar4.z0(cVar2.f18534b);
        aVar4.k0(arrayList);
        aVar4.r0(c32);
        aVar.f65845a = aVar4.P();
        return true;
    }

    @Override // i4.i
    protected final void h(boolean z11) {
        super.h(z11);
        if (z11) {
            this.f65847n = null;
            this.f65850q = null;
            this.f65851r = null;
        }
        this.f65848o = 0;
        this.f65849p = false;
    }
}
