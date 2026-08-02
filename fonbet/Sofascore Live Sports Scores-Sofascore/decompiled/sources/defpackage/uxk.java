package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uxk extends qgi {
    public gtj o;
    public int p;
    public boolean q;
    public wxk r;
    public d4a s;

    @Override // defpackage.qgi
    public final void a(long j) {
        this.d = j;
        this.q = j != 0;
        wxk wxkVar = this.r;
        this.p = wxkVar != null ? wxkVar.e : 0;
    }

    @Override // defpackage.qgi
    public final long c(nkk nkkVar) {
        byte b = nkkVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        gtj gtjVar = this.o;
        qx9.u(gtjVar);
        boolean z = ((r0a[]) gtjVar.c)[(b >> 1) & (255 >>> (8 - gtjVar.b))].b;
        wxk wxkVar = (wxk) gtjVar.d;
        int i = !z ? wxkVar.e : wxkVar.f;
        long j = this.q ? (this.p + i) / 4 : 0;
        byte[] bArr = nkkVar.a;
        int length = bArr.length;
        int i2 = nkkVar.c + 4;
        if (length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            nkkVar.C(copyOf, copyOf.length);
        } else {
            nkkVar.D(i2);
        }
        byte[] bArr2 = nkkVar.a;
        int i3 = nkkVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.q = true;
        this.p = i;
        return j;
    }

    @Override // defpackage.qgi
    public final boolean e(nkk nkkVar, long j, y3g y3gVar) {
        gtj gtjVar;
        int i;
        int i2;
        int i3;
        if (this.o != null) {
            ((sm8) y3gVar.b).getClass();
            return false;
        }
        wxk wxkVar = this.r;
        int i4 = 1;
        if (wxkVar == null) {
            xxk.c(1, nkkVar, false);
            nkkVar.k();
            int s = nkkVar.s();
            int k = nkkVar.k();
            int h = nkkVar.h();
            int i5 = h <= 0 ? -1 : h;
            int h2 = nkkVar.h();
            int i6 = h2 <= 0 ? -1 : h2;
            nkkVar.h();
            int s2 = nkkVar.s();
            int pow = (int) Math.pow(2.0d, s2 & 15);
            int pow2 = (int) Math.pow(2.0d, (s2 & 240) >> 4);
            nkkVar.s();
            this.r = new wxk(s, k, i5, i6, pow, pow2, Arrays.copyOf(nkkVar.a, nkkVar.c));
        } else {
            d4a d4aVar = this.s;
            if (d4aVar == null) {
                this.s = xxk.b(nkkVar, true, true);
            } else {
                int i7 = nkkVar.c;
                byte[] bArr = new byte[i7];
                System.arraycopy(nkkVar.a, 0, bArr, 0, i7);
                int i8 = wxkVar.a;
                int i9 = 5;
                xxk.c(5, nkkVar, false);
                int s3 = nkkVar.s() + 1;
                nm2 nm2Var = new nm2(nkkVar.a, 5);
                int i10 = 8;
                nm2Var.t(nkkVar.b * 8);
                int i11 = 0;
                while (true) {
                    int i12 = i10;
                    int i13 = 16;
                    if (i11 < s3) {
                        int i14 = i4;
                        if (nm2Var.i(24) != 5653314) {
                            throw r9e.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((nm2Var.c * 8) + nm2Var.e), null);
                        }
                        int i15 = nm2Var.i(16);
                        int i16 = nm2Var.i(24);
                        long[] jArr = new long[i16];
                        long j2 = 0;
                        if (nm2Var.h()) {
                            i = s3;
                            int i17 = nm2Var.i(i9) + 1;
                            int i18 = 0;
                            while (i18 < i16) {
                                int i19 = 0;
                                for (int i20 = i16 - i18; i20 > 0; i20 >>>= 1) {
                                    i19++;
                                }
                                int i21 = nm2Var.i(i19);
                                int i22 = 0;
                                while (i22 < i21 && i18 < i16) {
                                    int i23 = i18;
                                    jArr[i23] = i17;
                                    i18 = i23 + 1;
                                    i22++;
                                    wxkVar = wxkVar;
                                }
                                i17++;
                                i18 = i18;
                                wxkVar = wxkVar;
                            }
                        } else {
                            boolean h3 = nm2Var.h();
                            int i24 = 0;
                            while (i24 < i16) {
                                if (h3) {
                                    if (nm2Var.h()) {
                                        i3 = s3;
                                        jArr[i24] = nm2Var.i(i9) + 1;
                                    } else {
                                        i3 = s3;
                                        jArr[i24] = 0;
                                    }
                                    i2 = 5;
                                } else {
                                    i2 = i9;
                                    i3 = s3;
                                    jArr[i24] = nm2Var.i(i2) + 1;
                                }
                                i24++;
                                i9 = i2;
                                s3 = i3;
                            }
                            i = s3;
                        }
                        wxk wxkVar2 = wxkVar;
                        int i25 = nm2Var.i(4);
                        if (i25 > 2) {
                            throw r9e.a("lookup type greater than 2 not decodable: " + i25, null);
                        }
                        if (i25 == i14 || i25 == 2) {
                            nm2Var.t(32);
                            nm2Var.t(32);
                            int i26 = nm2Var.i(4) + i14;
                            nm2Var.t(i14);
                            if (i25 != i14) {
                                j2 = i16 * i15;
                            } else if (i15 != 0) {
                                j2 = (long) Math.floor(Math.pow(i16, 1.0d / i15));
                            }
                            nm2Var.t((int) (i26 * j2));
                        }
                        i11++;
                        i10 = i12;
                        s3 = i;
                        wxkVar = wxkVar2;
                        i4 = 1;
                        i9 = 5;
                    } else {
                        wxk wxkVar3 = wxkVar;
                        int i27 = 6;
                        int i28 = nm2Var.i(6) + 1;
                        for (int i29 = 0; i29 < i28; i29++) {
                            if (nm2Var.i(16) != 0) {
                                throw r9e.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i30 = 1;
                        int i31 = nm2Var.i(6) + 1;
                        int i32 = 0;
                        while (true) {
                            int i33 = 3;
                            if (i32 < i31) {
                                int i34 = nm2Var.i(i13);
                                if (i34 == 0) {
                                    int i35 = i12;
                                    nm2Var.t(i35);
                                    nm2Var.t(16);
                                    nm2Var.t(16);
                                    nm2Var.t(6);
                                    nm2Var.t(i35);
                                    int i36 = nm2Var.i(4) + 1;
                                    int i37 = 0;
                                    while (i37 < i36) {
                                        nm2Var.t(i35);
                                        i37++;
                                        i35 = 8;
                                    }
                                } else {
                                    if (i34 != i30) {
                                        throw r9e.a("floor type greater than 1 not decodable: " + i34, null);
                                    }
                                    int i38 = nm2Var.i(5);
                                    int[] iArr = new int[i38];
                                    int i39 = -1;
                                    for (int i40 = 0; i40 < i38; i40++) {
                                        int i41 = nm2Var.i(4);
                                        iArr[i40] = i41;
                                        if (i41 > i39) {
                                            i39 = i41;
                                        }
                                    }
                                    int i42 = i39 + 1;
                                    int[] iArr2 = new int[i42];
                                    int i43 = 0;
                                    while (i43 < i42) {
                                        iArr2[i43] = nm2Var.i(i33) + 1;
                                        int i44 = nm2Var.i(2);
                                        int i45 = i12;
                                        if (i44 > 0) {
                                            nm2Var.t(i45);
                                        }
                                        int i46 = 0;
                                        for (int i47 = 1; i46 < (i47 << i44); i47 = 1) {
                                            nm2Var.t(i45);
                                            i46++;
                                            i45 = 8;
                                        }
                                        i43++;
                                        i12 = 8;
                                        i33 = 3;
                                    }
                                    nm2Var.t(2);
                                    int i48 = nm2Var.i(4);
                                    int i49 = 0;
                                    int i50 = 0;
                                    for (int i51 = 0; i51 < i38; i51++) {
                                        i49 += iArr2[iArr[i51]];
                                        while (i50 < i49) {
                                            nm2Var.t(i48);
                                            i50++;
                                        }
                                    }
                                }
                                i32++;
                                i12 = 8;
                                i27 = 6;
                                i30 = 1;
                                i13 = 16;
                            } else {
                                int i52 = nm2Var.i(i27) + 1;
                                int i53 = 0;
                                while (i53 < i52) {
                                    if (nm2Var.i(16) > 2) {
                                        throw r9e.a("residueType greater than 2 is not decodable", null);
                                    }
                                    nm2Var.t(24);
                                    nm2Var.t(24);
                                    nm2Var.t(24);
                                    int i54 = nm2Var.i(i27) + 1;
                                    int i55 = 8;
                                    nm2Var.t(8);
                                    int[] iArr3 = new int[i54];
                                    for (int i56 = 0; i56 < i54; i56++) {
                                        iArr3[i56] = ((nm2Var.h() ? nm2Var.i(5) : 0) * 8) + nm2Var.i(3);
                                    }
                                    int i57 = 0;
                                    while (i57 < i54) {
                                        int i58 = 0;
                                        while (i58 < i55) {
                                            if ((iArr3[i57] & (1 << i58)) != 0) {
                                                nm2Var.t(i55);
                                            }
                                            i58++;
                                            i55 = 8;
                                        }
                                        i57++;
                                        i55 = 8;
                                    }
                                    i53++;
                                    i27 = 6;
                                }
                                int i59 = 1;
                                int i60 = nm2Var.i(i27) + 1;
                                int i61 = 0;
                                while (i61 < i60) {
                                    if (nm2Var.i(16) != 0) {
                                        m6k.B();
                                    } else {
                                        int i62 = nm2Var.h() ? nm2Var.i(4) + 1 : i59;
                                        if (nm2Var.h()) {
                                            int i63 = nm2Var.i(8) + 1;
                                            for (int i64 = 0; i64 < i63; i64++) {
                                                int i65 = i8 - 1;
                                                int i66 = 0;
                                                for (int i67 = i65; i67 > 0; i67 >>>= 1) {
                                                    i66++;
                                                }
                                                nm2Var.t(i66);
                                                int i68 = 0;
                                                while (i65 > 0) {
                                                    i68++;
                                                    i65 >>>= 1;
                                                }
                                                nm2Var.t(i68);
                                            }
                                        }
                                        if (nm2Var.i(2) != 0) {
                                            throw r9e.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i62 > 1) {
                                            for (int i69 = 0; i69 < i8; i69++) {
                                                nm2Var.t(4);
                                            }
                                        }
                                        for (int i70 = 0; i70 < i62; i70++) {
                                            nm2Var.t(8);
                                            nm2Var.t(8);
                                            nm2Var.t(8);
                                        }
                                    }
                                    i61++;
                                    i59 = 1;
                                }
                                int i71 = nm2Var.i(6);
                                int i72 = i71 + 1;
                                r0a[] r0aVarArr = new r0a[i72];
                                for (int i73 = 0; i73 < i72; i73++) {
                                    boolean h4 = nm2Var.h();
                                    nm2Var.i(16);
                                    nm2Var.i(16);
                                    nm2Var.i(8);
                                    r0aVarArr[i73] = new r0a(h4, 8);
                                }
                                if (!nm2Var.h()) {
                                    throw r9e.a("framing bit after modes not set as expected", null);
                                }
                                int i74 = 0;
                                while (i71 > 0) {
                                    i74++;
                                    i71 >>>= 1;
                                }
                                gtjVar = new gtj(wxkVar3, d4aVar, bArr, r0aVarArr, i74, 8);
                            }
                        }
                    }
                }
            }
        }
        gtjVar = null;
        this.o = gtjVar;
        if (gtjVar == null) {
            return true;
        }
        wxk wxkVar4 = (wxk) gtjVar.d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(wxkVar4.g);
        arrayList.add((byte[]) gtjVar.f);
        Metadata a = xxk.a(hv9.w((String[]) ((d4a) gtjVar.e).b));
        pm8 pm8Var = new pm8();
        pm8Var.k = MimeTypes.AUDIO_VORBIS;
        pm8Var.f = wxkVar4.d;
        pm8Var.g = wxkVar4.c;
        pm8Var.x = wxkVar4.a;
        pm8Var.y = wxkVar4.b;
        pm8Var.m = arrayList;
        pm8Var.i = a;
        y3gVar.b = new sm8(pm8Var);
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
