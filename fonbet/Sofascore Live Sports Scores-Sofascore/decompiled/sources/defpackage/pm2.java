package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pm2 extends vm2 {
    public final j9e h = new j9e();
    public final nm2 i = new nm2(3);
    public int j = -1;
    public final int k;
    public final mm2[] l;
    public mm2 m;
    public List n;
    public List o;
    public nm2 p;
    public int q;

    public pm2(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = wz2.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new mm2[8];
        int i2 = 0;
        while (true) {
            mm2[] mm2VarArr = this.l;
            if (i2 >= 8) {
                this.m = mm2VarArr[0];
                return;
            } else {
                mm2VarArr[i2] = new mm2();
                i2++;
            }
        }
    }

    @Override // defpackage.vm2
    public final t9d c() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new t9d(list);
    }

    @Override // defpackage.vm2
    public final void d(rm2 rm2Var) {
        nm2 nm2Var;
        ByteBuffer byteBuffer = rm2Var.i;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        j9e j9eVar = this.h;
        j9eVar.L(array, limit);
        while (j9eVar.a() >= 3) {
            int A = j9eVar.A();
            int i = A & 3;
            boolean z = (A & 4) == 4;
            byte A2 = (byte) j9eVar.A();
            byte A3 = (byte) j9eVar.A();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        g();
                        int i2 = (A2 & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            i();
                            tgj.d0("Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = A2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        nm2Var = new nm2(i2, i4, 1);
                        this.p = nm2Var;
                        byte[] bArr = nm2Var.d;
                        nm2Var.e = 1;
                        bArr[0] = A3;
                    } else {
                        z1a.s(i == 2);
                        nm2Var = this.p;
                        if (nm2Var == null) {
                            tgj.z("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = nm2Var.d;
                            int i5 = nm2Var.e;
                            int i6 = i5 + 1;
                            nm2Var.e = i6;
                            bArr2[i5] = A2;
                            nm2Var.e = i5 + 2;
                            bArr2[i6] = A3;
                        }
                    }
                    if (nm2Var.e == (nm2Var.c * 2) - 1) {
                        g();
                    }
                }
            }
        }
    }

    @Override // defpackage.vm2
    public final boolean f() {
        return this.n != this.o;
    }

    @Override // defpackage.vm2, defpackage.cm4
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        i();
        this.p = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void g() {
        int i;
        boolean z;
        int i2;
        int i3;
        char c;
        nm2 nm2Var = this.p;
        if (nm2Var == null) {
            return;
        }
        int i4 = 2;
        boolean z2 = true;
        if (nm2Var.e != (nm2Var.c * 2) - 1) {
            tgj.y("DtvCcPacket ended prematurely; size is " + ((this.p.c * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.b + ");");
        }
        nm2 nm2Var2 = this.p;
        byte[] bArr = nm2Var2.d;
        int i5 = nm2Var2.e;
        nm2 nm2Var3 = this.i;
        nm2Var3.p(bArr, i5);
        boolean z3 = false;
        while (true) {
            if (nm2Var3.b() > 0) {
                int i6 = 3;
                int i7 = nm2Var3.i(3);
                int i8 = nm2Var3.i(5);
                int i9 = 7;
                if (i7 == 7) {
                    nm2Var3.t(i4);
                    i7 = nm2Var3.i(6);
                    if (i7 < 7) {
                        fn0.r(i7, "Invalid extended service number: ");
                    }
                }
                if (i8 == 0) {
                    if (i7 != 0) {
                        tgj.d0("serviceNumber is non-zero (" + i7 + ") when blockSize is 0");
                    }
                } else if (i7 != this.k) {
                    nm2Var3.u(i8);
                } else {
                    int g = (i8 * 8) + nm2Var3.g();
                    while (nm2Var3.g() < g) {
                        int i10 = nm2Var3.i(8);
                        if (i10 != 16) {
                            if (i10 <= 31) {
                                if (i10 != 0) {
                                    if (i10 == i6) {
                                        this.n = h();
                                    } else if (i10 != 8) {
                                        switch (i10) {
                                            case 12:
                                                i();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i10 < 17 || i10 > 23) {
                                                    if (i10 < 24 || i10 > 31) {
                                                        fn0.r(i10, "Invalid C0 command: ");
                                                        break;
                                                    } else {
                                                        tgj.d0("Currently unsupported COMMAND_P16 Command: " + i10);
                                                        nm2Var3.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    tgj.d0("Currently unsupported COMMAND_EXT1 Command: " + i10);
                                                    nm2Var3.t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.m.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i9;
                            } else if (i10 <= 127) {
                                mm2 mm2Var = this.m;
                                if (i10 == 127) {
                                    mm2Var.a((char) 9835);
                                } else {
                                    mm2Var.a((char) (i10 & 255));
                                }
                                i3 = i4;
                                i = i6;
                                i2 = i9;
                                z3 = true;
                            } else {
                                if (i10 <= 159) {
                                    mm2[] mm2VarArr = this.l;
                                    switch (i10) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                        case OMSDK_JS_WRITE_FAILED_VALUE:
                                        case 134:
                                        case 135:
                                            i = i6;
                                            z = true;
                                            int i11 = i10 - 128;
                                            if (this.q != i11) {
                                                this.q = i11;
                                                this.m = mm2VarArr[i11];
                                                break;
                                            }
                                            break;
                                        case PRIVACY_URL_ERROR_VALUE:
                                            i = i6;
                                            z = true;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (nm2Var3.h()) {
                                                    mm2 mm2Var2 = mm2VarArr[8 - i12];
                                                    mm2Var2.a.clear();
                                                    mm2Var2.b.clear();
                                                    mm2Var2.o = -1;
                                                    mm2Var2.p = -1;
                                                    mm2Var2.q = -1;
                                                    mm2Var2.s = -1;
                                                    mm2Var2.u = 0;
                                                }
                                            }
                                            break;
                                        case TPAT_RETRY_FAILED_VALUE:
                                            i = i6;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (nm2Var3.h()) {
                                                    mm2VarArr[8 - i13].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            i = i6;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (nm2Var3.h()) {
                                                    mm2VarArr[8 - i14].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            i = i6;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (nm2Var3.h()) {
                                                    mm2VarArr[8 - i15].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            i = i6;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (nm2Var3.h()) {
                                                    mm2VarArr[8 - i16].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            i = i6;
                                            nm2Var3.t(8);
                                            z = true;
                                            break;
                                        case 142:
                                            i = i6;
                                            z = true;
                                            break;
                                        case 143:
                                            i = i6;
                                            i();
                                            z = true;
                                            break;
                                        case 144:
                                            int i17 = i4;
                                            if (!this.m.c) {
                                                nm2Var3.t(16);
                                                i = 3;
                                                z = true;
                                                break;
                                            } else {
                                                nm2Var3.i(4);
                                                nm2Var3.i(i17);
                                                nm2Var3.i(i17);
                                                boolean h = nm2Var3.h();
                                                boolean h2 = nm2Var3.h();
                                                i = 3;
                                                nm2Var3.i(3);
                                                nm2Var3.i(3);
                                                this.m.e(h, h2);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.m.c) {
                                                int c2 = mm2.c(nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2));
                                                int c3 = mm2.c(nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2));
                                                nm2Var3.t(2);
                                                mm2.c(nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2), 0);
                                                this.m.f(c2, c3);
                                            } else {
                                                nm2Var3.t(24);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                nm2Var3.t(4);
                                                int i18 = nm2Var3.i(4);
                                                nm2Var3.t(2);
                                                nm2Var3.i(6);
                                                mm2 mm2Var3 = this.m;
                                                if (mm2Var3.u != i18) {
                                                    mm2Var3.a('\n');
                                                }
                                                mm2Var3.u = i18;
                                            } else {
                                                nm2Var3.t(16);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            fn0.r(i10, "Invalid C1 command: ");
                                            i = i6;
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int c4 = mm2.c(nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2));
                                                nm2Var3.i(2);
                                                mm2.c(nm2Var3.i(2), nm2Var3.i(2), nm2Var3.i(2), 0);
                                                nm2Var3.h();
                                                nm2Var3.h();
                                                nm2Var3.i(2);
                                                nm2Var3.i(2);
                                                int i19 = nm2Var3.i(2);
                                                nm2Var3.t(8);
                                                mm2 mm2Var4 = this.m;
                                                mm2Var4.n = c4;
                                                mm2Var4.k = i19;
                                            } else {
                                                nm2Var3.t(32);
                                            }
                                            i = 3;
                                            z = true;
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
                                            mm2 mm2Var5 = mm2VarArr[i20];
                                            nm2Var3.t(i4);
                                            boolean h3 = nm2Var3.h();
                                            nm2Var3.t(i4);
                                            int i21 = nm2Var3.i(i6);
                                            boolean h4 = nm2Var3.h();
                                            int i22 = nm2Var3.i(i9);
                                            int i23 = nm2Var3.i(8);
                                            int i24 = nm2Var3.i(4);
                                            int i25 = nm2Var3.i(4);
                                            nm2Var3.t(i4);
                                            nm2Var3.t(6);
                                            nm2Var3.t(i4);
                                            int i26 = nm2Var3.i(i6);
                                            int i27 = nm2Var3.i(i6);
                                            ArrayList arrayList = mm2Var5.a;
                                            mm2Var5.c = true;
                                            mm2Var5.d = h3;
                                            mm2Var5.e = i21;
                                            mm2Var5.f = h4;
                                            mm2Var5.g = i22;
                                            mm2Var5.h = i23;
                                            mm2Var5.i = i24;
                                            int i28 = i25 + 1;
                                            if (mm2Var5.j != i28) {
                                                mm2Var5.j = i28;
                                                while (true) {
                                                    if (arrayList.size() >= mm2Var5.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i26 != 0 && mm2Var5.l != i26) {
                                                mm2Var5.l = i26;
                                                int i29 = i26 - 1;
                                                int i30 = mm2.B[i29];
                                                boolean z4 = mm2.A[i29];
                                                int i31 = mm2.y[i29];
                                                int i32 = mm2.z[i29];
                                                int i33 = mm2.x[i29];
                                                mm2Var5.n = i30;
                                                mm2Var5.k = i33;
                                            }
                                            if (i27 != 0 && mm2Var5.m != i27) {
                                                mm2Var5.m = i27;
                                                int i34 = i27 - 1;
                                                int i35 = mm2.D[i34];
                                                int i36 = mm2.C[i34];
                                                mm2Var5.e(false, false);
                                                mm2Var5.f(mm2.v, mm2.E[i34]);
                                            }
                                            if (this.q != i20) {
                                                this.q = i20;
                                                this.m = mm2VarArr[i20];
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                    }
                                } else {
                                    i = i6;
                                    z = true;
                                    if (i10 <= 255) {
                                        this.m.a((char) (i10 & 255));
                                    } else {
                                        fn0.r(i10, "Invalid base command: ");
                                        i3 = 2;
                                        i2 = 7;
                                    }
                                }
                                z3 = z;
                                i3 = 2;
                                i2 = 7;
                            }
                            z = true;
                        } else {
                            i = i6;
                            z = true;
                            int i37 = nm2Var3.i(8);
                            if (i37 <= 31) {
                                i2 = 7;
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
                                i2 = 7;
                                if (i37 <= 127) {
                                    if (i37 == 32) {
                                        this.m.a(' ');
                                    } else if (i37 == 33) {
                                        this.m.a((char) 160);
                                    } else if (i37 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (i37 == 42) {
                                        this.m.a((char) 352);
                                    } else if (i37 == 44) {
                                        this.m.a((char) 338);
                                    } else if (i37 == 63) {
                                        this.m.a((char) 376);
                                    } else if (i37 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (i37 == 58) {
                                        this.m.a((char) 353);
                                    } else if (i37 == 60) {
                                        this.m.a((char) 339);
                                    } else if (i37 != 61) {
                                        switch (i37) {
                                            case 48:
                                                this.m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i37) {
                                                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case JSON_ENCODE_ERROR_VALUE:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case TPAT_ERROR_VALUE:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case INVALID_ADS_ENDPOINT_VALUE:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case INVALID_RI_ENDPOINT_VALUE:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case INVALID_METRICS_ENDPOINT_VALUE:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        fn0.r(i37, "Invalid G2 character: ");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    z3 = true;
                                } else {
                                    if (i37 > 159) {
                                        i3 = 2;
                                        c = 6;
                                        if (i37 <= 255) {
                                            if (i37 == 160) {
                                                this.m.a((char) 13252);
                                            } else {
                                                fn0.r(i37, "Invalid G3 character: ");
                                                this.m.a('_');
                                            }
                                            z3 = true;
                                        } else {
                                            fn0.r(i37, "Invalid extended command: ");
                                        }
                                    } else if (i37 <= 135) {
                                        nm2Var3.t(32);
                                    } else if (i37 <= 143) {
                                        nm2Var3.t(40);
                                    } else if (i37 <= 159) {
                                        i3 = 2;
                                        nm2Var3.t(2);
                                        c = 6;
                                        nm2Var3.t(nm2Var3.i(6) * 8);
                                    }
                                    boolean z5 = z;
                                    i6 = i;
                                    i4 = i3;
                                    z2 = z5;
                                    i9 = i2;
                                }
                            }
                            i3 = 2;
                        }
                        c = 6;
                        boolean z52 = z;
                        i6 = i;
                        i4 = i3;
                        z2 = z52;
                        i9 = i2;
                    }
                }
            }
        }
        if (z3) {
            this.n = h();
        }
        this.p = null;
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
    public final List h() {
        Layout.Alignment alignment;
        boolean z;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            mm2[] mm2VarArr = this.l;
            mm2 mm2Var = mm2VarArr[i];
            if (mm2Var.c && (!mm2Var.a.isEmpty() || mm2Var.b.length() != 0)) {
                mm2 mm2Var2 = mm2VarArr[i];
                if (mm2Var2.d) {
                    ArrayList arrayList2 = mm2Var2.a;
                    km2 km2Var = null;
                    if (mm2Var2.c && (!arrayList2.isEmpty() || mm2Var2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) mm2Var2.b());
                        int i3 = mm2Var2.k;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i3 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i3 != 3) {
                                hg6.d(mm2Var2.k, "Unexpected justification value: ");
                                return null;
                            }
                            Layout.Alignment alignment2 = alignment;
                            z = mm2Var2.f;
                            int i4 = mm2Var2.h;
                            int i5 = mm2Var2.g;
                            if (z) {
                                f = i4 / 209.0f;
                                f2 = i5 / 74.0f;
                            } else {
                                f = i4 / 99.0f;
                                f2 = i5 / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i6 = mm2Var2.i;
                            int i7 = i6 / 3;
                            int i8 = i7 != 0 ? 0 : i7 == 1 ? 1 : 2;
                            int i9 = i6 % 3;
                            int i10 = i9 != 0 ? 0 : i9 == 1 ? 1 : 2;
                            int i11 = mm2Var2.n;
                            km2Var = new km2(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 == mm2.w, i11, mm2Var2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        z = mm2Var2.f;
                        int i42 = mm2Var2.h;
                        int i52 = mm2Var2.g;
                        if (z) {
                        }
                        float f32 = (f * 0.9f) + 0.05f;
                        float f42 = (f2 * 0.9f) + 0.05f;
                        int i62 = mm2Var2.i;
                        int i72 = i62 / 3;
                        if (i72 != 0) {
                        }
                        int i92 = i62 % 3;
                        if (i92 != 0) {
                        }
                        int i112 = mm2Var2.n;
                        km2Var = new km2(spannableStringBuilder, alignment22, f42, i8, f32, i10, i112 == mm2.w, i112, mm2Var2.e);
                    }
                    if (km2Var != null) {
                        arrayList.add(km2Var);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, km2.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((km2) arrayList.get(i12)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void i() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
