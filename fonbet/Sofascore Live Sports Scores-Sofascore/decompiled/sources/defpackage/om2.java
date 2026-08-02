package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class om2 extends um2 {
    public final nkk g = new nkk(4, false);
    public final nm2 h = new nm2(2);
    public int i = -1;
    public final int j;
    public final lm2[] k;
    public lm2 l;
    public List m;
    public List n;
    public nm2 o;
    public int p;

    public om2(int i, List list) {
        this.j = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.k = new lm2[8];
        int i2 = 0;
        while (true) {
            lm2[] lm2VarArr = this.k;
            if (i2 >= 8) {
                this.l = lm2VarArr[0];
                return;
            } else {
                lm2VarArr[i2] = new lm2();
                i2++;
            }
        }
    }

    @Override // defpackage.um2
    public final wm2 b() {
        List list = this.m;
        this.n = list;
        list.getClass();
        return new wm2(list, false);
    }

    @Override // defpackage.um2
    public final void c(qm2 qm2Var) {
        nm2 nm2Var;
        ByteBuffer byteBuffer = qm2Var.h;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        nkk nkkVar = this.g;
        nkkVar.C(array, limit);
        while (nkkVar.c() >= 3) {
            int s = nkkVar.s();
            int i = s & 3;
            boolean z = (s & 4) == 4;
            byte s2 = (byte) nkkVar.s();
            byte s3 = (byte) nkkVar.s();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        f();
                        int i2 = (s2 & 192) >> 6;
                        int i3 = this.i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            h();
                            m6k.f0();
                        }
                        this.i = i2;
                        int i4 = s2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        nm2Var = new nm2(i2, i4, 0);
                        this.o = nm2Var;
                        byte[] bArr = nm2Var.d;
                        nm2Var.e = 1;
                        bArr[0] = s3;
                    } else {
                        qx9.r(i == 2);
                        nm2Var = this.o;
                        if (nm2Var == null) {
                            m6k.B();
                        } else {
                            byte[] bArr2 = nm2Var.d;
                            int i5 = nm2Var.e;
                            int i6 = i5 + 1;
                            nm2Var.e = i6;
                            bArr2[i5] = s2;
                            nm2Var.e = i5 + 2;
                            bArr2[i6] = s3;
                        }
                    }
                    if (nm2Var.e == (nm2Var.c * 2) - 1) {
                        f();
                    }
                }
            }
        }
    }

    @Override // defpackage.um2
    public final boolean e() {
        return this.m != this.n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f() {
        int i;
        boolean z;
        int i2;
        char c;
        nm2 nm2Var = this.o;
        if (nm2Var == null) {
            return;
        }
        int i3 = 2;
        boolean z2 = true;
        if (nm2Var.e != (nm2Var.c * 2) - 1) {
            int i4 = nm2Var.b;
            m6k.A();
        }
        nm2 nm2Var2 = this.o;
        byte[] bArr = nm2Var2.d;
        int i5 = nm2Var2.e;
        nm2 nm2Var3 = this.h;
        nm2Var3.p(bArr, i5);
        boolean z3 = false;
        while (true) {
            if (nm2Var3.b() > 0) {
                int i6 = 3;
                int i7 = nm2Var3.i(3);
                int i8 = nm2Var3.i(5);
                int i9 = 7;
                if (i7 == 7) {
                    nm2Var3.t(i3);
                    i7 = nm2Var3.i(6);
                    if (i7 < 7) {
                        m6k.f0();
                    }
                }
                if (i8 == 0) {
                    if (i7 != 0) {
                        m6k.f0();
                    }
                } else if (i7 != this.j) {
                    nm2Var3.u(i8);
                } else {
                    for (int g = (i8 * 8) + nm2Var3.g(); nm2Var3.g() < g; g = i) {
                        int i10 = nm2Var3.i(8);
                        if (i10 != 16) {
                            if (i10 <= 31) {
                                if (i10 != 0) {
                                    if (i10 == i6) {
                                        this.m = g();
                                    } else if (i10 != 8) {
                                        switch (i10) {
                                            case 12:
                                                h();
                                                break;
                                            case 13:
                                                this.l.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i10 < 17 || i10 > 23) {
                                                    if (i10 < 24 || i10 > 31) {
                                                        m6k.f0();
                                                        break;
                                                    } else {
                                                        m6k.f0();
                                                        nm2Var3.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    m6k.f0();
                                                    nm2Var3.t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.l.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i2 = i3;
                                i = g;
                            } else if (i10 <= 127) {
                                lm2 lm2Var = this.l;
                                if (i10 == 127) {
                                    lm2Var.a((char) 9835);
                                } else {
                                    lm2Var.a((char) (i10 & 255));
                                }
                                i2 = i3;
                                i = g;
                                z3 = true;
                            } else {
                                if (i10 <= 159) {
                                    lm2[] lm2VarArr = this.k;
                                    switch (i10) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                        case OMSDK_JS_WRITE_FAILED_VALUE:
                                        case 134:
                                        case 135:
                                            i = g;
                                            z = true;
                                            int i11 = i10 - 128;
                                            if (this.p != i11) {
                                                this.p = i11;
                                                this.l = lm2VarArr[i11];
                                                break;
                                            }
                                            break;
                                        case PRIVACY_URL_ERROR_VALUE:
                                            i = g;
                                            z = true;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (nm2Var3.h()) {
                                                    lm2 lm2Var2 = lm2VarArr[8 - i12];
                                                    lm2Var2.a.clear();
                                                    lm2Var2.b.clear();
                                                    lm2Var2.p = -1;
                                                    lm2Var2.q = -1;
                                                    lm2Var2.r = -1;
                                                    lm2Var2.t = -1;
                                                    lm2Var2.v = 0;
                                                }
                                            }
                                            break;
                                        case TPAT_RETRY_FAILED_VALUE:
                                            i = g;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (nm2Var3.h()) {
                                                    lm2VarArr[8 - i13].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            i = g;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (nm2Var3.h()) {
                                                    lm2VarArr[8 - i14].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            i = g;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (nm2Var3.h()) {
                                                    lm2VarArr[8 - i15].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            i = g;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (nm2Var3.h()) {
                                                    lm2VarArr[8 - i16].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            i = g;
                                            nm2Var3.t(8);
                                            z = true;
                                            break;
                                        case 142:
                                            i = g;
                                            z = true;
                                            break;
                                        case 143:
                                            i = g;
                                            h();
                                            z = true;
                                            break;
                                        case 144:
                                            int i17 = i3;
                                            i = g;
                                            if (!this.l.c) {
                                                nm2Var3.t(16);
                                                z = true;
                                                i6 = 3;
                                                break;
                                            } else {
                                                nm2Var3.i(4);
                                                nm2Var3.i(i17);
                                                nm2Var3.i(i17);
                                                boolean h = nm2Var3.h();
                                                boolean h2 = nm2Var3.h();
                                                i6 = 3;
                                                nm2Var3.i(3);
                                                nm2Var3.i(3);
                                                this.l.e(h, h2);
                                                z = true;
                                            }
                                        case 145:
                                            i = g;
                                            if (this.l.c) {
                                                int c2 = lm2.c(nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2));
                                                int c3 = lm2.c(nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2));
                                                nm2Var3.t(2);
                                                lm2.c(nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2), 0);
                                                this.l.f(c2, c3);
                                            } else {
                                                nm2Var3.t(24);
                                            }
                                            z = true;
                                            i6 = 3;
                                            break;
                                        case 146:
                                            i = g;
                                            if (this.l.c) {
                                                nm2Var3.t(4);
                                                int i18 = nm2Var3.i(4);
                                                nm2Var3.t(2);
                                                nm2Var3.i(6);
                                                lm2 lm2Var3 = this.l;
                                                if (lm2Var3.v != i18) {
                                                    lm2Var3.a('\n');
                                                }
                                                lm2Var3.v = i18;
                                            } else {
                                                nm2Var3.t(16);
                                            }
                                            z = true;
                                            i6 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            m6k.f0();
                                            i = g;
                                            z = true;
                                            break;
                                        case 151:
                                            i = g;
                                            if (this.l.c) {
                                                int c4 = lm2.c(nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2));
                                                nm2Var3.i(2);
                                                lm2.c(nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2), 0);
                                                nm2Var3.h();
                                                nm2Var3.h();
                                                nm2Var3.i(2);
                                                nm2Var3.i(2);
                                                int i19 = nm2Var3.i(2);
                                                nm2Var3.t(8);
                                                lm2 lm2Var4 = this.l;
                                                lm2Var4.o = c4;
                                                lm2Var4.l = i19;
                                            } else {
                                                nm2Var3.t(32);
                                            }
                                            z = true;
                                            i6 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i20 = i10 - 152;
                                            lm2 lm2Var5 = lm2VarArr[i20];
                                            nm2Var3.t(i3);
                                            boolean h3 = nm2Var3.h();
                                            boolean h4 = nm2Var3.h();
                                            nm2Var3.h();
                                            int i21 = nm2Var3.i(i6);
                                            boolean h5 = nm2Var3.h();
                                            int i22 = nm2Var3.i(i9);
                                            int i23 = nm2Var3.i(8);
                                            int i24 = nm2Var3.i(4);
                                            int i25 = nm2Var3.i(4);
                                            nm2Var3.t(i3);
                                            nm2Var3.i(6);
                                            nm2Var3.t(i3);
                                            int i26 = nm2Var3.i(3);
                                            int i27 = nm2Var3.i(3);
                                            ArrayList arrayList = lm2Var5.a;
                                            i = g;
                                            lm2Var5.c = true;
                                            lm2Var5.d = h3;
                                            lm2Var5.k = h4;
                                            lm2Var5.e = i21;
                                            lm2Var5.f = h5;
                                            lm2Var5.g = i22;
                                            lm2Var5.h = i23;
                                            lm2Var5.i = i24;
                                            int i28 = i25 + 1;
                                            if (lm2Var5.j != i28) {
                                                lm2Var5.j = i28;
                                                while (true) {
                                                    if ((h4 && arrayList.size() >= lm2Var5.j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i26 != 0 && lm2Var5.m != i26) {
                                                lm2Var5.m = i26;
                                                int i29 = i26 - 1;
                                                int i30 = lm2.C[i29];
                                                boolean z4 = lm2.B[i29];
                                                int i31 = lm2.z[i29];
                                                int i32 = lm2.A[i29];
                                                int i33 = lm2.y[i29];
                                                lm2Var5.o = i30;
                                                lm2Var5.l = i33;
                                            }
                                            if (i27 != 0 && lm2Var5.n != i27) {
                                                lm2Var5.n = i27;
                                                int i34 = i27 - 1;
                                                int i35 = lm2.E[i34];
                                                int i36 = lm2.D[i34];
                                                lm2Var5.e(false, false);
                                                lm2Var5.f(lm2.w, lm2.F[i34]);
                                            }
                                            if (this.p != i20) {
                                                this.p = i20;
                                                this.l = lm2VarArr[i20];
                                            }
                                            z = true;
                                            i6 = 3;
                                            break;
                                    }
                                } else {
                                    i = g;
                                    z = true;
                                    if (i10 <= 255) {
                                        this.l.a((char) (i10 & 255));
                                    } else {
                                        m6k.f0();
                                        i2 = 2;
                                        i9 = 7;
                                    }
                                }
                                z3 = z;
                                i2 = 2;
                                i9 = 7;
                            }
                            z = true;
                        } else {
                            i = g;
                            z = true;
                            int i37 = nm2Var3.i(8);
                            if (i37 <= 31) {
                                i9 = 7;
                                if (i37 > 7) {
                                    if (i37 <= 15) {
                                        nm2Var3.t(8);
                                    } else if (i37 <= 23) {
                                        nm2Var3.t(16);
                                    } else if (i37 <= 31) {
                                        nm2Var3.t(24);
                                    }
                                }
                            } else {
                                i9 = 7;
                                if (i37 <= 127) {
                                    if (i37 == 32) {
                                        this.l.a(' ');
                                    } else if (i37 == 33) {
                                        this.l.a((char) 160);
                                    } else if (i37 == 37) {
                                        this.l.a((char) 8230);
                                    } else if (i37 == 42) {
                                        this.l.a((char) 352);
                                    } else if (i37 == 44) {
                                        this.l.a((char) 338);
                                    } else if (i37 == 63) {
                                        this.l.a((char) 376);
                                    } else if (i37 == 57) {
                                        this.l.a((char) 8482);
                                    } else if (i37 == 58) {
                                        this.l.a((char) 353);
                                    } else if (i37 == 60) {
                                        this.l.a((char) 339);
                                    } else if (i37 != 61) {
                                        switch (i37) {
                                            case 48:
                                                this.l.a((char) 9608);
                                                break;
                                            case 49:
                                                this.l.a((char) 8216);
                                                break;
                                            case 50:
                                                this.l.a((char) 8217);
                                                break;
                                            case 51:
                                                this.l.a((char) 8220);
                                                break;
                                            case 52:
                                                this.l.a((char) 8221);
                                                break;
                                            case 53:
                                                this.l.a((char) 8226);
                                                break;
                                            default:
                                                switch (i37) {
                                                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                                        this.l.a((char) 8539);
                                                        break;
                                                    case JSON_ENCODE_ERROR_VALUE:
                                                        this.l.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.l.a((char) 8541);
                                                        break;
                                                    case TPAT_ERROR_VALUE:
                                                        this.l.a((char) 8542);
                                                        break;
                                                    case INVALID_ADS_ENDPOINT_VALUE:
                                                        this.l.a((char) 9474);
                                                        break;
                                                    case INVALID_RI_ENDPOINT_VALUE:
                                                        this.l.a((char) 9488);
                                                        break;
                                                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                                        this.l.a((char) 9492);
                                                        break;
                                                    case INVALID_METRICS_ENDPOINT_VALUE:
                                                        this.l.a((char) 9472);
                                                        break;
                                                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                                                        this.l.a((char) 9496);
                                                        break;
                                                    case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                                                        this.l.a((char) 9484);
                                                        break;
                                                    default:
                                                        m6k.f0();
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.l.a((char) 8480);
                                    }
                                    z3 = true;
                                } else {
                                    if (i37 > 159) {
                                        i2 = 2;
                                        c = 6;
                                        if (i37 <= 255) {
                                            if (i37 == 160) {
                                                this.l.a((char) 13252);
                                            } else {
                                                m6k.f0();
                                                this.l.a('_');
                                            }
                                            z3 = true;
                                        } else {
                                            m6k.f0();
                                        }
                                    } else if (i37 <= 135) {
                                        nm2Var3.t(32);
                                    } else if (i37 <= 143) {
                                        nm2Var3.t(40);
                                    } else if (i37 <= 159) {
                                        i2 = 2;
                                        nm2Var3.t(2);
                                        c = 6;
                                        nm2Var3.t(nm2Var3.i(6) * 8);
                                    }
                                    int i38 = i2;
                                    z2 = z;
                                    i3 = i38;
                                }
                            }
                            i2 = 2;
                        }
                        c = 6;
                        int i382 = i2;
                        z2 = z;
                        i3 = i382;
                    }
                    z2 = z2;
                    i3 = i3;
                }
            }
        }
        if (z3) {
            this.m = g();
        }
        this.o = null;
    }

    @Override // defpackage.um2, defpackage.bm4
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        h();
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List g() {
        Layout.Alignment alignment;
        boolean z;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            lm2[] lm2VarArr = this.k;
            lm2 lm2Var = lm2VarArr[i];
            if (lm2Var.c && (!lm2Var.a.isEmpty() || lm2Var.b.length() != 0)) {
                lm2 lm2Var2 = lm2VarArr[i];
                if (lm2Var2.d) {
                    ArrayList arrayList2 = lm2Var2.a;
                    jm2 jm2Var = null;
                    if (lm2Var2.c && (!arrayList2.isEmpty() || lm2Var2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) lm2Var2.b());
                        int i3 = lm2Var2.l;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i3 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i3 != 3) {
                                hg6.d(lm2Var2.l, "Unexpected justification value: ");
                                return null;
                            }
                            Layout.Alignment alignment2 = alignment;
                            z = lm2Var2.f;
                            int i4 = lm2Var2.h;
                            int i5 = lm2Var2.g;
                            if (z) {
                                f = i4 / 209.0f;
                                f2 = i5 / 74.0f;
                            } else {
                                f = i4 / 99.0f;
                                f2 = i5 / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i6 = lm2Var2.i;
                            int i7 = i6 / 3;
                            int i8 = i7 != 0 ? 0 : i7 == 1 ? 1 : 2;
                            int i9 = i6 % 3;
                            int i10 = i9 != 0 ? 0 : i9 == 1 ? 1 : 2;
                            int i11 = lm2Var2.o;
                            jm2Var = new jm2(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 == lm2.x, i11, lm2Var2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        z = lm2Var2.f;
                        int i42 = lm2Var2.h;
                        int i52 = lm2Var2.g;
                        if (z) {
                        }
                        float f32 = (f * 0.9f) + 0.05f;
                        float f42 = (f2 * 0.9f) + 0.05f;
                        int i62 = lm2Var2.i;
                        int i72 = i62 / 3;
                        if (i72 != 0) {
                        }
                        int i92 = i62 % 3;
                        if (i92 != 0) {
                        }
                        int i112 = lm2Var2.o;
                        jm2Var = new jm2(spannableStringBuilder, alignment22, f42, i8, f32, i10, i112 == lm2.x, i112, lm2Var2.e);
                    }
                    if (jm2Var != null) {
                        arrayList.add(jm2Var);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, jm2.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((jm2) arrayList.get(i12)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void h() {
        for (int i = 0; i < 8; i++) {
            this.k[i].d();
        }
    }
}
