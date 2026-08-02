package H1;

import b1.C2338G;
import e1.AbstractC4144k;
import f1.AbstractC4230h;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final List f4305a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4306b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4307c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4308d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4309e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4310f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4311g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4312h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4313i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4314j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4315k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4316l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4317m;

    /* renamed from: n, reason: collision with root package name */
    public final float f4318n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4319o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4320p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC4230h.k f4321q;

    public C(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, float f10, int i22, String str, AbstractC4230h.k kVar) {
        this.f4305a = list;
        this.f4306b = i10;
        this.f4307c = i11;
        this.f4308d = i12;
        this.f4309e = i13;
        this.f4310f = i14;
        this.f4311g = i15;
        this.f4312h = i16;
        this.f4313i = i17;
        this.f4314j = i18;
        this.f4315k = i19;
        this.f4316l = i20;
        this.f4317m = i21;
        this.f4318n = f10;
        this.f4319o = i22;
        this.f4320p = str;
        this.f4321q = kVar;
    }

    public static C a(e1.J j10) {
        return b(j10, false, null);
    }

    public static C b(e1.J j10, boolean z10, AbstractC4230h.k kVar) {
        boolean z11;
        int i10;
        AbstractC4230h.g t10;
        int i11;
        try {
            if (z10) {
                j10.c0(4);
            } else {
                j10.c0(21);
            }
            int M10 = j10.M() & 3;
            int M11 = j10.M();
            int g10 = j10.g();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i13 >= M11) {
                    break;
                }
                j10.c0(1);
                int U10 = j10.U();
                for (int i15 = 0; i15 < U10; i15++) {
                    int U11 = j10.U();
                    i14 += U11 + 4;
                    j10.c0(U11);
                }
                i13++;
            }
            j10.b0(g10);
            byte[] bArr = new byte[i14];
            AbstractC4230h.k kVar2 = kVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            float f10 = 1.0f;
            String str = null;
            int i28 = 0;
            int i29 = 0;
            while (i28 < M11) {
                int M12 = j10.M() & 63;
                int U12 = j10.U();
                int i30 = i12;
                AbstractC4230h.k kVar3 = kVar2;
                while (i30 < U12) {
                    int U13 = j10.U();
                    boolean z12 = z11;
                    byte[] bArr2 = AbstractC4230h.NAL_START_CODE;
                    int i31 = M10;
                    System.arraycopy(bArr2, i12, bArr, i29, bArr2.length);
                    int length = i29 + bArr2.length;
                    System.arraycopy(j10.f(), j10.g(), bArr, length, U13);
                    if (M12 == 32 && i30 == 0) {
                        kVar3 = AbstractC4230h.y(bArr, length, length + U13);
                        i10 = M11;
                    } else {
                        if (M12 == 33 && i30 == 0) {
                            AbstractC4230h.C0670h u10 = AbstractC4230h.u(bArr, length, length + U13, kVar3);
                            i16 = u10.f46213b + 1;
                            i17 = u10.f46219h;
                            int i32 = u10.f46220i;
                            int i33 = u10.f46221j;
                            i10 = M11;
                            int i34 = u10.f46222k;
                            i21 = u10.f46216e + 8;
                            i22 = u10.f46217f + 8;
                            int i35 = u10.f46225n;
                            int i36 = u10.f46226o;
                            int i37 = u10.f46227p;
                            float f11 = u10.f46223l;
                            int i38 = u10.f46224m;
                            AbstractC4230h.c cVar = u10.f46214c;
                            if (cVar != null) {
                                i11 = i38;
                                str = AbstractC4144k.j(cVar.f46191a, cVar.f46192b, cVar.f46193c, cVar.f46194d, cVar.constraintBytes, cVar.f46195e);
                            } else {
                                i11 = i38;
                            }
                            f10 = f11;
                            i27 = i11;
                            i24 = i36;
                            i25 = i37;
                            i20 = i34;
                            i23 = i35;
                            i19 = i33;
                            i18 = i32;
                        } else {
                            i10 = M11;
                            if (M12 == 39 && i30 == 0 && (t10 = AbstractC4230h.t(bArr, length, length + U13)) != null && kVar3 != null) {
                                i12 = 0;
                                i26 = t10.f46206d == ((AbstractC4230h.a) kVar3.f46233b.get(0)).f46187b ? 4 : 5;
                            }
                        }
                        i12 = 0;
                    }
                    i29 = length + U13;
                    j10.c0(U13);
                    i30++;
                    z11 = z12;
                    M10 = i31;
                    M11 = i10;
                }
                i28++;
                kVar2 = kVar3;
            }
            return new C(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), M10 + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, f10, i27, str, kVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z10 ? "L-HEVC config" : "HEVC config");
            throw C2338G.a(sb2.toString(), e10);
        }
    }

    public static C c(e1.J j10, AbstractC4230h.k kVar) {
        return b(j10, true, kVar);
    }
}
