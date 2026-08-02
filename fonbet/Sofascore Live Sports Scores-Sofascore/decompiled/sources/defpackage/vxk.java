package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vxk extends qgi {
    public gtj o;
    public int p;
    public boolean q;
    public wxk r;
    public n89 s;

    @Override // defpackage.qgi
    public final void a(long j) {
        this.d = j;
        this.q = j != 0;
        wxk wxkVar = this.r;
        this.p = wxkVar != null ? wxkVar.e : 0;
    }

    @Override // defpackage.qgi
    public final long b(j9e j9eVar) {
        byte b = j9eVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        gtj gtjVar = this.o;
        gtjVar.getClass();
        boolean z = ((r0a[]) gtjVar.c)[(b >> 1) & (255 >>> (8 - gtjVar.b))].b;
        wxk wxkVar = (wxk) gtjVar.d;
        int i = !z ? wxkVar.e : wxkVar.f;
        long j = this.q ? (this.p + i) / 4 : 0;
        byte[] bArr = j9eVar.a;
        int length = bArr.length;
        int i2 = j9eVar.c + 4;
        if (length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            j9eVar.L(copyOf, copyOf.length);
        } else {
            j9eVar.M(i2);
        }
        byte[] bArr2 = j9eVar.a;
        int i3 = j9eVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.q = true;
        this.p = i;
        return j;
    }

    @Override // defpackage.qgi
    public final boolean d(j9e j9eVar, long j, y3g y3gVar) {
        gtj gtjVar;
        if (this.o != null) {
            ((b) y3gVar.b).getClass();
            return false;
        }
        wxk wxkVar = this.r;
        int i = 4;
        if (wxkVar == null) {
            w1a.G(1, j9eVar, false);
            j9eVar.s();
            int A = j9eVar.A();
            int s = j9eVar.s();
            int o = j9eVar.o();
            int i2 = o <= 0 ? -1 : o;
            int o2 = j9eVar.o();
            int i3 = o2 <= 0 ? -1 : o2;
            j9eVar.o();
            int A2 = j9eVar.A();
            int pow = (int) Math.pow(2.0d, A2 & 15);
            int pow2 = (int) Math.pow(2.0d, (A2 & 240) >> 4);
            j9eVar.A();
            this.r = new wxk(A, s, i2, i3, pow, pow2, Arrays.copyOf(j9eVar.a, j9eVar.c));
        } else {
            n89 n89Var = this.s;
            if (n89Var == null) {
                this.s = w1a.C(j9eVar, true, true);
            } else {
                int i4 = j9eVar.c;
                byte[] bArr = new byte[i4];
                System.arraycopy(j9eVar.a, 0, bArr, 0, i4);
                int i5 = wxkVar.a;
                int i6 = 5;
                w1a.G(5, j9eVar, false);
                int A3 = j9eVar.A() + 1;
                nm2 nm2Var = new nm2(j9eVar.a, 6);
                int i7 = 8;
                nm2Var.t(j9eVar.b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = i7;
                    int i10 = 16;
                    if (i8 >= A3) {
                        int i11 = nm2Var.i(6) + 1;
                        for (int i12 = 0; i12 < i11; i12++) {
                            if (nm2Var.i(16) != 0) {
                                throw s9e.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i13 = 1;
                        int i14 = nm2Var.i(6) + 1;
                        int i15 = 0;
                        while (true) {
                            int i16 = 3;
                            if (i15 < i14) {
                                int i17 = nm2Var.i(i10);
                                if (i17 == 0) {
                                    int i18 = i9;
                                    nm2Var.t(i18);
                                    nm2Var.t(16);
                                    nm2Var.t(16);
                                    nm2Var.t(6);
                                    nm2Var.t(i18);
                                    int i19 = nm2Var.i(4) + 1;
                                    int i20 = 0;
                                    while (i20 < i19) {
                                        nm2Var.t(i18);
                                        i20++;
                                        i18 = 8;
                                    }
                                } else {
                                    if (i17 != i13) {
                                        throw s9e.a(null, "floor type greater than 1 not decodable: " + i17);
                                    }
                                    int i21 = nm2Var.i(5);
                                    int[] iArr = new int[i21];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < i21; i23++) {
                                        int i24 = nm2Var.i(i);
                                        iArr[i23] = i24;
                                        if (i24 > i22) {
                                            i22 = i24;
                                        }
                                    }
                                    int i25 = i22 + 1;
                                    int[] iArr2 = new int[i25];
                                    int i26 = 0;
                                    while (i26 < i25) {
                                        iArr2[i26] = nm2Var.i(i16) + 1;
                                        int i27 = nm2Var.i(2);
                                        int i28 = i9;
                                        if (i27 > 0) {
                                            nm2Var.t(i28);
                                        }
                                        int[] iArr3 = iArr;
                                        int i29 = 0;
                                        for (int i30 = 1; i29 < (i30 << i27); i30 = 1) {
                                            nm2Var.t(i28);
                                            i29++;
                                            i28 = 8;
                                        }
                                        i26++;
                                        iArr = iArr3;
                                        i9 = 8;
                                        i16 = 3;
                                    }
                                    int[] iArr4 = iArr;
                                    nm2Var.t(2);
                                    int i31 = nm2Var.i(4);
                                    int i32 = 0;
                                    int i33 = 0;
                                    for (int i34 = 0; i34 < i21; i34++) {
                                        i32 += iArr2[iArr4[i34]];
                                        while (i33 < i32) {
                                            nm2Var.t(i31);
                                            i33++;
                                        }
                                    }
                                }
                                i15++;
                                i9 = 8;
                                i13 = 1;
                                i10 = 16;
                                i = 4;
                            } else {
                                int i35 = 6;
                                int i36 = nm2Var.i(6) + 1;
                                int i37 = 0;
                                while (i37 < i36) {
                                    if (nm2Var.i(16) > 2) {
                                        throw s9e.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    nm2Var.t(24);
                                    nm2Var.t(24);
                                    nm2Var.t(24);
                                    int i38 = nm2Var.i(i35) + 1;
                                    int i39 = 8;
                                    nm2Var.t(8);
                                    int[] iArr5 = new int[i38];
                                    for (int i40 = 0; i40 < i38; i40++) {
                                        iArr5[i40] = ((nm2Var.h() ? nm2Var.i(5) : 0) * 8) + nm2Var.i(3);
                                    }
                                    int i41 = 0;
                                    while (i41 < i38) {
                                        int i42 = 0;
                                        while (i42 < i39) {
                                            if ((iArr5[i41] & (1 << i42)) != 0) {
                                                nm2Var.t(i39);
                                            }
                                            i42++;
                                            i39 = 8;
                                        }
                                        i41++;
                                        i39 = 8;
                                    }
                                    i37++;
                                    i35 = 6;
                                }
                                int i43 = nm2Var.i(i35) + 1;
                                for (int i44 = 0; i44 < i43; i44++) {
                                    int i45 = nm2Var.i(16);
                                    if (i45 != 0) {
                                        tgj.z("mapping type other than 0 not supported: " + i45);
                                    } else {
                                        int i46 = nm2Var.h() ? nm2Var.i(4) + 1 : 1;
                                        if (nm2Var.h()) {
                                            int i47 = nm2Var.i(8) + 1;
                                            for (int i48 = 0; i48 < i47; i48++) {
                                                int i49 = i5 - 1;
                                                int i50 = 0;
                                                for (int i51 = i49; i51 > 0; i51 >>>= 1) {
                                                    i50++;
                                                }
                                                nm2Var.t(i50);
                                                int i52 = 0;
                                                while (i49 > 0) {
                                                    i52++;
                                                    i49 >>>= 1;
                                                }
                                                nm2Var.t(i52);
                                            }
                                        }
                                        if (nm2Var.i(2) != 0) {
                                            throw s9e.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i46 > 1) {
                                            for (int i53 = 0; i53 < i5; i53++) {
                                                nm2Var.t(4);
                                            }
                                        }
                                        for (int i54 = 0; i54 < i46; i54++) {
                                            nm2Var.t(8);
                                            nm2Var.t(8);
                                            nm2Var.t(8);
                                        }
                                    }
                                }
                                int i55 = nm2Var.i(6);
                                int i56 = i55 + 1;
                                r0a[] r0aVarArr = new r0a[i56];
                                for (int i57 = 0; i57 < i56; i57++) {
                                    boolean h = nm2Var.h();
                                    nm2Var.i(16);
                                    nm2Var.i(16);
                                    nm2Var.i(8);
                                    r0aVarArr[i57] = new r0a(h, 9);
                                }
                                if (!nm2Var.h()) {
                                    throw s9e.a(null, "framing bit after modes not set as expected");
                                }
                                int i58 = 0;
                                while (i55 > 0) {
                                    i58++;
                                    i55 >>>= 1;
                                }
                                gtjVar = new gtj(wxkVar, n89Var, bArr, r0aVarArr, i58, 9);
                            }
                        }
                    } else {
                        if (nm2Var.i(24) != 5653314) {
                            throw s9e.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((nm2Var.c * 8) + nm2Var.e));
                        }
                        int i59 = nm2Var.i(16);
                        int i60 = nm2Var.i(24);
                        if (nm2Var.h()) {
                            nm2Var.t(i6);
                            int i61 = 0;
                            while (i61 < i60) {
                                int i62 = 0;
                                for (int i63 = i60 - i61; i63 > 0; i63 >>>= 1) {
                                    i62++;
                                }
                                i61 += nm2Var.i(i62);
                            }
                        } else {
                            boolean h2 = nm2Var.h();
                            for (int i64 = 0; i64 < i60; i64++) {
                                if (!h2) {
                                    nm2Var.t(i6);
                                } else if (nm2Var.h()) {
                                    nm2Var.t(i6);
                                }
                            }
                        }
                        int i65 = nm2Var.i(4);
                        if (i65 > 2) {
                            throw s9e.a(null, "lookup type greater than 2 not decodable: " + i65);
                        }
                        if (i65 == 1 || i65 == 2) {
                            nm2Var.t(32);
                            nm2Var.t(32);
                            int i66 = nm2Var.i(4) + 1;
                            nm2Var.t(1);
                            nm2Var.t((int) ((i65 == 1 ? i59 != 0 ? (long) Math.floor(Math.pow(i60, 1.0d / i59)) : 0L : i59 * i60) * i66));
                        }
                        i8++;
                        i7 = i9;
                        i6 = 5;
                    }
                }
            }
        }
        gtjVar = null;
        this.o = gtjVar;
        if (gtjVar == null) {
            return true;
        }
        wxk wxkVar2 = (wxk) gtjVar.d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(wxkVar2.g);
        arrayList.add((byte[]) gtjVar.f);
        ric B = w1a.B(hv9.w(((n89) gtjVar.e).b));
        qm8 qm8Var = new qm8();
        qm8Var.m = sjc.p("audio/ogg");
        qm8Var.n = sjc.p(MimeTypes.AUDIO_VORBIS);
        qm8Var.h = wxkVar2.d;
        qm8Var.i = wxkVar2.c;
        qm8Var.F = wxkVar2.a;
        qm8Var.G = wxkVar2.b;
        qm8Var.q = arrayList;
        qm8Var.k = B;
        y3gVar.b = new b(qm8Var);
        return true;
    }

    @Override // defpackage.qgi
    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = null;
            this.r = null;
            this.s = null;
        }
        this.p = 0;
        this.q = false;
    }
}
