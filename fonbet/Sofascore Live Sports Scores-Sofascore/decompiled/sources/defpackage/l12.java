package defpackage;

import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class l12 {
    public static final byte[] a;

    static {
        String str = nik.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(j9e j9eVar) {
        int i = j9eVar.b;
        j9eVar.O(4);
        if (j9eVar.m() != 1751411826) {
            i += 4;
        }
        j9eVar.N(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x0595, code lost:
    
        if (r14 == 2) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x018f, code lost:
    
        if (r14 == (-1)) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x080e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x066d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(j9e j9eVar, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, j12 j12Var, int i5) {
        int i6;
        int i7;
        int i8;
        int H;
        int m;
        int i9;
        int i10;
        int i11;
        DrmInitData drmInitData2;
        String str2;
        List list;
        String str3;
        int i12;
        int i13;
        int i14;
        int i15;
        vl0 vl0Var;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        List z2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean h;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z3;
        int i35;
        boolean h2;
        int i36;
        String str4;
        j9e j9eVar2 = j9eVar;
        int i37 = i;
        int i38 = i3;
        int[] iArr = dy0.e;
        int[] iArr2 = dy0.c;
        j9eVar2.N(i2 + 16);
        if (z) {
            i6 = j9eVar2.H();
            j9eVar2.O(6);
        } else {
            j9eVar2.O(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            i7 = 2;
            i8 = 4;
            H = j9eVar2.H();
            j9eVar2.O(6);
            int B = j9eVar2.B();
            j9eVar2.N(j9eVar2.b - 4);
            m = j9eVar2.m();
            if (i6 == 1) {
                j9eVar2.O(16);
            }
            i9 = B;
            i10 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            j9eVar2.O(16);
            i7 = 2;
            int round = (int) Math.round(Double.longBitsToDouble(j9eVar2.u()));
            int E = j9eVar2.E();
            j9eVar2.O(4);
            i8 = 4;
            int E2 = j9eVar2.E();
            int E3 = j9eVar2.E();
            boolean z4 = (E3 & 1) != 0;
            boolean z5 = (E3 & 2) != 0;
            if (z4) {
                if (!z5 && E2 == 32) {
                    i10 = 4;
                    j9eVar2.O(8);
                    i9 = round;
                    H = E;
                    m = 0;
                }
                i10 = -1;
                j9eVar2.O(8);
                i9 = round;
                H = E;
                m = 0;
            } else {
                if (E2 == 8) {
                    i10 = 3;
                } else if (E2 == 16) {
                    i10 = z5 ? 268435456 : 2;
                } else if (E2 == 24) {
                    i10 = z5 ? 1342177280 : 21;
                } else {
                    if (E2 == 32) {
                        i10 = z5 ? 1610612736 : 22;
                    }
                    i10 = -1;
                }
                j9eVar2.O(8);
                i9 = round;
                H = E;
                m = 0;
            }
        }
        if (i37 == 1767992678) {
            H = -1;
            i9 = -1;
        } else {
            if (i37 != 1935764850) {
                i11 = i37 == 1935767394 ? 16000 : 8000;
            }
            i9 = i11;
            H = 1;
        }
        int i39 = j9eVar2.b;
        if (i37 == 1701733217) {
            Pair h3 = h(j9eVar2, i2, i38);
            if (h3 != null) {
                i37 = ((Integer) h3.first).intValue();
                drmInitData2 = drmInitData == null ? null : drmInitData.a(((lsj) h3.second).b);
                ((lsj[]) j12Var.d)[i5] = (lsj) h3.second;
            } else {
                drmInitData2 = drmInitData;
            }
            j9eVar2.N(i39);
        } else {
            drmInitData2 = drmInitData;
        }
        String str5 = "audio/mhm1";
        if (i37 == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i37 == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i37 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i37 == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (i37 == 1685353320 || i37 == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (i37 == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (i37 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i37 == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (i37 == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else {
            if (i37 != 1936684916) {
                if (i37 == 1953984371) {
                    str2 = MimeTypes.AUDIO_RAW;
                    i10 = 268435456;
                } else if (i37 != 1819304813) {
                    str2 = (i37 == 778924082 || i37 == 778924083) ? MimeTypes.AUDIO_MPEG : i37 == 1835557169 ? "audio/mha1" : i37 == 1835560241 ? "audio/mhm1" : i37 == 1634492771 ? MimeTypes.AUDIO_ALAC : i37 == 1634492791 ? MimeTypes.AUDIO_ALAW : i37 == 1970037111 ? MimeTypes.AUDIO_MLAW : i37 == 1332770163 ? MimeTypes.AUDIO_OPUS : i37 == 1716281667 ? MimeTypes.AUDIO_FLAC : i37 == 1835823201 ? MimeTypes.AUDIO_TRUEHD : i37 == 1767992678 ? "audio/iamf" : null;
                }
            }
            i10 = i7;
            str2 = MimeTypes.AUDIO_RAW;
        }
        vl0 vl0Var2 = null;
        String str6 = null;
        List list2 = null;
        h12 h12Var = null;
        while (i39 - i2 < i38) {
            j9eVar2.N(i39);
            int m2 = j9eVar2.m();
            int i40 = i10;
            o1j.s("childAtomSize must be positive", m2 > 0);
            int m3 = j9eVar2.m();
            String str7 = str6;
            if (m3 == 1835557187) {
                j9eVar2.N(i39 + 8);
                j9eVar2.O(1);
                int A = j9eVar2.A();
                j9eVar2.O(1);
                String format = Objects.equals(str2, str5) ? String.format("mhm1.%02X", Integer.valueOf(A)) : String.format("mha1.%02X", Integer.valueOf(A));
                int H2 = j9eVar2.H();
                byte[] bArr = new byte[H2];
                String str8 = format;
                j9eVar2.k(bArr, 0, H2);
                str6 = str8;
                list = list2 == null ? hv9.z(bArr) : hv9.A(bArr, (byte[]) list2.get(0));
                i15 = m2;
                i17 = H;
                str3 = str5;
            } else if (m3 == 1835557200) {
                j9eVar2.N(i39 + 8);
                int A2 = j9eVar2.A();
                if (A2 > 0) {
                    byte[] bArr2 = new byte[A2];
                    j9eVar2.k(bArr2, 0, A2);
                    list2 = list2 == null ? hv9.z(bArr2) : hv9.A((byte[]) list2.get(0), bArr2);
                }
                list = list2;
                i15 = m2;
                i17 = H;
                str3 = str5;
                str6 = str7;
            } else {
                if (m3 == 1702061171 || (z && m3 == 2002876005)) {
                    String str9 = str2;
                    list = list2;
                    int i41 = m2;
                    int i42 = i39;
                    int i43 = H;
                    str3 = str5;
                    i12 = i37;
                    if (m3 == 1702061171) {
                        i14 = i41;
                        i13 = i42;
                        i39 = i13;
                    } else {
                        i13 = j9eVar2.b;
                        i39 = i42;
                        o1j.s(null, i13 >= i39);
                        while (true) {
                            i14 = i41;
                            if (i13 - i39 < i14) {
                                j9eVar2.N(i13);
                                int m4 = j9eVar2.m();
                                o1j.s("childAtomSize must be positive", m4 > 0);
                                if (j9eVar2.m() != 1702061171) {
                                    i13 += m4;
                                    i41 = i14;
                                }
                            } else {
                                i13 = -1;
                            }
                        }
                    }
                    if (i13 != -1) {
                        vl0Var = c(i13, j9eVar2);
                        String str10 = vl0Var.a;
                        byte[] bArr3 = vl0Var.b;
                        if (bArr3 == null) {
                            i15 = i14;
                            str2 = str10;
                            i16 = i43;
                            str6 = str7;
                        } else if (MimeTypes.AUDIO_VORBIS.equals(str10)) {
                            j9e j9eVar3 = new j9e(bArr3);
                            j9eVar3.O(1);
                            int i44 = 0;
                            while (j9eVar3.a() > 0 && j9eVar3.j() == 255) {
                                i44 += 255;
                                j9eVar3.O(1);
                            }
                            int A3 = j9eVar3.A() + i44;
                            int i45 = 0;
                            while (true) {
                                if (j9eVar3.a() > 0) {
                                    i15 = i14;
                                    if (j9eVar3.j() == 255) {
                                        i45 += 255;
                                        j9eVar3.O(1);
                                        i14 = i15;
                                    }
                                } else {
                                    i15 = i14;
                                }
                            }
                            int A4 = j9eVar3.A() + i45;
                            byte[] bArr4 = new byte[A3];
                            int i46 = j9eVar3.b;
                            System.arraycopy(bArr3, i46, bArr4, 0, A3);
                            int i47 = i46 + A3 + A4;
                            int length = bArr3.length - i47;
                            byte[] bArr5 = new byte[length];
                            System.arraycopy(bArr3, i47, bArr5, 0, length);
                            list = hv9.A(bArr4, bArr5);
                            str2 = str10;
                            i16 = i43;
                            str6 = str7;
                        } else {
                            i15 = i14;
                            if (MimeTypes.AUDIO_AAC.equals(str10)) {
                                d0 K = lz.K(new nm2(bArr3, bArr3.length, 3, (byte) 0), false);
                                i9 = K.a;
                                int i48 = K.b;
                                str6 = K.c;
                                i16 = i48;
                            } else {
                                i16 = i43;
                                str6 = str7;
                            }
                            str2 = str10;
                            list = hv9.z(bArr3);
                        }
                    } else {
                        i15 = i14;
                        vl0Var = vl0Var2;
                        i16 = i43;
                        str6 = str7;
                        str2 = str9;
                    }
                    i17 = i16;
                } else if (m3 == 1651798644) {
                    j9eVar2.N(i39 + 8);
                    j9eVar2.O(i8);
                    str3 = str5;
                    h12Var = new h12(j9eVar2.C(), j9eVar2.C());
                    list = list2;
                    i15 = m2;
                    i17 = H;
                    str6 = str7;
                    str2 = str2;
                } else {
                    String str11 = str2;
                    str3 = str5;
                    if (m3 == 1684103987) {
                        j9eVar2.N(i39 + 8);
                        String num = Integer.toString(i4);
                        nm2 nm2Var = new nm2(3);
                        nm2Var.o(j9eVar2);
                        int i49 = iArr2[nm2Var.i(i7)];
                        nm2Var.t(8);
                        int i50 = iArr[nm2Var.i(3)];
                        if (nm2Var.i(1) != 0) {
                            i50++;
                        }
                        int i51 = dy0.f[nm2Var.i(5)] * 1000;
                        nm2Var.c();
                        j9eVar2.N(nm2Var.f());
                        qm8 qm8Var = new qm8();
                        qm8Var.a = num;
                        qm8Var.n = sjc.p(MimeTypes.AUDIO_AC3);
                        qm8Var.F = i50;
                        qm8Var.G = i49;
                        qm8Var.r = drmInitData2;
                        qm8Var.d = str;
                        qm8Var.h = i51;
                        qm8Var.i = i51;
                        j12Var.e = new b(qm8Var);
                        list = list2;
                        i15 = m2;
                        i18 = i39;
                        i19 = H;
                        i12 = i37;
                    } else if (m3 == 1684366131) {
                        j9eVar2.N(i39 + 8);
                        String num2 = Integer.toString(i4);
                        nm2 nm2Var2 = new nm2(3);
                        nm2Var2.o(j9eVar2);
                        int i52 = nm2Var2.i(13) * 1000;
                        nm2Var2.t(3);
                        int i53 = iArr2[nm2Var2.i(2)];
                        nm2Var2.t(10);
                        int i54 = iArr[nm2Var2.i(3)];
                        if (nm2Var2.i(1) != 0) {
                            i54++;
                        }
                        int i55 = i54;
                        nm2Var2.t(3);
                        int i56 = nm2Var2.i(4);
                        nm2Var2.t(1);
                        if (i56 > 0) {
                            list = list2;
                            nm2Var2.t(6);
                            if (nm2Var2.i(1) != 0) {
                                i55 += 2;
                            }
                            nm2Var2.t(1);
                        } else {
                            list = list2;
                        }
                        int i57 = i55;
                        i15 = m2;
                        if (nm2Var2.b() > 7) {
                            nm2Var2.t(7);
                            if (nm2Var2.i(1) != 0) {
                                str4 = MimeTypes.AUDIO_E_AC3_JOC;
                                nm2Var2.c();
                                j9eVar2.N(nm2Var2.f());
                                qm8 qm8Var2 = new qm8();
                                qm8Var2.a = num2;
                                qm8Var2.n = sjc.p(str4);
                                qm8Var2.F = i57;
                                qm8Var2.G = i53;
                                qm8Var2.r = drmInitData2;
                                qm8Var2.d = str;
                                qm8Var2.i = i52;
                                j12Var.e = new b(qm8Var2);
                                i12 = i37;
                                i18 = i39;
                                i19 = H;
                            }
                        }
                        str4 = MimeTypes.AUDIO_E_AC3;
                        nm2Var2.c();
                        j9eVar2.N(nm2Var2.f());
                        qm8 qm8Var22 = new qm8();
                        qm8Var22.a = num2;
                        qm8Var22.n = sjc.p(str4);
                        qm8Var22.F = i57;
                        qm8Var22.G = i53;
                        qm8Var22.r = drmInitData2;
                        qm8Var22.d = str;
                        qm8Var22.i = i52;
                        j12Var.e = new b(qm8Var22);
                        i12 = i37;
                        i18 = i39;
                        i19 = H;
                    } else {
                        list = list2;
                        i15 = m2;
                        if (m3 == 1684103988) {
                            j9eVar2.N(i39 + 8);
                            String num3 = Integer.toString(i4);
                            nm2 nm2Var3 = new nm2(3);
                            nm2Var3.o(j9eVar2);
                            int b = nm2Var3.b();
                            int i58 = nm2Var3.i(3);
                            if (i58 > 1) {
                                throw s9e.c("Unsupported AC-4 DSI version: " + i58);
                            }
                            int i59 = nm2Var3.i(7);
                            int i60 = nm2Var3.h() ? 48000 : 44100;
                            nm2Var3.t(4);
                            int i61 = nm2Var3.i(9);
                            if (i59 > 1) {
                                if (i58 == 0) {
                                    throw s9e.c("Invalid AC-4 DSI version: " + i58);
                                }
                                if (nm2Var3.h()) {
                                    nm2Var3.t(16);
                                    if (nm2Var3.h()) {
                                        nm2Var3.t(128);
                                    }
                                }
                            }
                            if (i58 == 1) {
                                i23 = i59;
                                if (nm2Var3.b() < 66) {
                                    throw s9e.c("Invalid AC-4 DSI bitrate.");
                                }
                                nm2Var3.t(66);
                                nm2Var3.c();
                            } else {
                                i23 = i59;
                            }
                            j9 j9Var = new j9();
                            j9Var.a = true;
                            j9Var.b = -1;
                            j9Var.c = -1;
                            j9Var.d = true;
                            i18 = i39;
                            j9Var.e = 2;
                            j9Var.f = 1;
                            j9Var.g = 0;
                            int i62 = 0;
                            while (i62 < i61) {
                                if (i58 == 0) {
                                    i26 = i9;
                                    h = nm2Var3.h();
                                    i31 = nm2Var3.i(5);
                                    i32 = nm2Var3.i(5);
                                    i33 = 0;
                                    i34 = 0;
                                    z3 = false;
                                } else {
                                    int i63 = i61;
                                    int i64 = nm2Var3.i(8);
                                    i26 = i9;
                                    int i65 = nm2Var3.i(8);
                                    int i66 = i65 == 255 ? nm2Var3.i(16) + i65 : i65;
                                    if (i64 > 2) {
                                        nm2Var3.t(i66 * 8);
                                        i62++;
                                        i61 = i63;
                                        i9 = i26;
                                    } else {
                                        int b2 = (b - nm2Var3.b()) / 8;
                                        int i67 = nm2Var3.i(5);
                                        i34 = b2;
                                        z3 = i67 == 31;
                                        h = false;
                                        i32 = i64;
                                        i31 = i67;
                                        i33 = i66;
                                    }
                                }
                                j9Var.f = i32;
                                i25 = H;
                                if (h || z3 || i31 != 6) {
                                    i24 = i37;
                                    j9Var.g = nm2Var3.i(3);
                                    if (nm2Var3.h()) {
                                        nm2Var3.t(5);
                                    }
                                    nm2Var3.t(2);
                                    int i68 = 1;
                                    if (i58 == 1 && (i32 == 1 || i32 == 2)) {
                                        nm2Var3.t(2);
                                    }
                                    nm2Var3.t(5);
                                    nm2Var3.t(10);
                                    if (i58 == 1) {
                                        if (i32 > 0) {
                                            j9Var.a = nm2Var3.h();
                                        }
                                        if (j9Var.a) {
                                            if (i32 != 1) {
                                                i36 = 2;
                                            }
                                            int i69 = nm2Var3.i(5);
                                            if (i69 >= 0 && i69 <= 15) {
                                                j9Var.b = i69;
                                            }
                                            if (i69 < 11 || i69 > 14) {
                                                i36 = 2;
                                            } else {
                                                j9Var.d = nm2Var3.h();
                                                i36 = 2;
                                                j9Var.e = nm2Var3.i(2);
                                            }
                                            nm2Var3.t(24);
                                            i68 = 1;
                                        } else {
                                            i36 = 2;
                                        }
                                        if (i32 == i68 || i32 == i36) {
                                            if (nm2Var3.h() && nm2Var3.h()) {
                                                nm2Var3.t(i36);
                                            }
                                            if (nm2Var3.h()) {
                                                nm2Var3.s();
                                                int i70 = 8;
                                                int i71 = nm2Var3.i(8);
                                                i35 = i32;
                                                int i72 = 0;
                                                while (i72 < i71) {
                                                    nm2Var3.t(i70);
                                                    i72++;
                                                    i70 = 8;
                                                }
                                                if (h && !z3) {
                                                    nm2Var3.s();
                                                    if (i31 == 0 || i31 == 1 || i31 == 2) {
                                                        if (i35 == 0) {
                                                            for (int i73 = 0; i73 < 2; i73++) {
                                                                s02.X(nm2Var3, j9Var);
                                                            }
                                                        } else {
                                                            for (int i74 = 0; i74 < 2; i74++) {
                                                                s02.Y(nm2Var3, j9Var);
                                                            }
                                                        }
                                                    } else if (i31 == 3 || i31 == 4) {
                                                        if (i35 == 0) {
                                                            for (int i75 = 0; i75 < 3; i75++) {
                                                                s02.X(nm2Var3, j9Var);
                                                            }
                                                        } else {
                                                            for (int i76 = 0; i76 < 3; i76++) {
                                                                s02.Y(nm2Var3, j9Var);
                                                            }
                                                        }
                                                    } else if (i31 != 5) {
                                                        int i77 = nm2Var3.i(7);
                                                        for (int i78 = 0; i78 < i77; i78++) {
                                                            nm2Var3.t(8);
                                                        }
                                                    } else if (i35 == 0) {
                                                        s02.X(nm2Var3, j9Var);
                                                    } else {
                                                        int i79 = nm2Var3.i(3);
                                                        for (int i80 = 0; i80 < i79 + 2; i80++) {
                                                            s02.Y(nm2Var3, j9Var);
                                                        }
                                                    }
                                                } else if (i35 != 0) {
                                                    s02.X(nm2Var3, j9Var);
                                                } else {
                                                    s02.Y(nm2Var3, j9Var);
                                                }
                                                nm2Var3.s();
                                                h2 = nm2Var3.h();
                                            }
                                        }
                                    }
                                    i35 = i32;
                                    if (h) {
                                    }
                                    if (i35 != 0) {
                                    }
                                    nm2Var3.s();
                                    h2 = nm2Var3.h();
                                } else {
                                    i24 = i37;
                                    i35 = i32;
                                    h2 = true;
                                }
                                if (h2) {
                                    int i81 = nm2Var3.i(7);
                                    for (int i82 = 0; i82 < i81; i82++) {
                                        nm2Var3.t(15);
                                    }
                                }
                                if (i35 > 0) {
                                    if (nm2Var3.h()) {
                                        if (nm2Var3.b() < 66) {
                                            throw s9e.c("Can't parse bitrate DSI.");
                                        }
                                        nm2Var3.t(66);
                                    }
                                    if (nm2Var3.h()) {
                                        nm2Var3.c();
                                        nm2Var3.u(nm2Var3.i(16));
                                        int i83 = nm2Var3.i(5);
                                        for (int i84 = 0; i84 < i83; i84++) {
                                            nm2Var3.t(3);
                                            nm2Var3.t(8);
                                        }
                                        i27 = 8;
                                        nm2Var3.c();
                                        if (i58 == 1) {
                                            int b3 = ((b - nm2Var3.b()) / 8) - i34;
                                            if (i33 < b3) {
                                                throw s9e.c("pres_bytes is smaller than presentation bytes read.");
                                            }
                                            nm2Var3.u(i33 - b3);
                                        }
                                        if (j9Var.a && j9Var.b == -1) {
                                            throw s9e.c("Can't determine channel mode of presentation " + i62);
                                        }
                                        if (j9Var.a) {
                                            int i85 = j9Var.b;
                                            boolean z6 = j9Var.d;
                                            int i86 = j9Var.e;
                                            switch (i85) {
                                                case 0:
                                                    i29 = 11;
                                                    i30 = 1;
                                                    break;
                                                case 1:
                                                    i29 = 11;
                                                    i30 = 2;
                                                    break;
                                                case 2:
                                                    i29 = 11;
                                                    i30 = 3;
                                                    break;
                                                case 3:
                                                    i29 = 11;
                                                    i30 = 5;
                                                    break;
                                                case 4:
                                                    i29 = 11;
                                                    i30 = 6;
                                                    break;
                                                case 5:
                                                case 7:
                                                case 9:
                                                    i29 = 11;
                                                    i30 = 7;
                                                    break;
                                                case 6:
                                                case 8:
                                                case 10:
                                                    i30 = i27;
                                                    i29 = 11;
                                                    break;
                                                case 11:
                                                    i29 = 11;
                                                    i30 = 11;
                                                    break;
                                                case 12:
                                                    i30 = 12;
                                                    i29 = 11;
                                                    break;
                                                case 13:
                                                    i29 = 11;
                                                    i30 = 13;
                                                    break;
                                                case 14:
                                                    i29 = 11;
                                                    i30 = 14;
                                                    break;
                                                case 15:
                                                    i29 = 11;
                                                    i30 = 24;
                                                    break;
                                                default:
                                                    i29 = 11;
                                                    i30 = -1;
                                                    break;
                                            }
                                            if (i85 == i29 || i85 == 12 || i85 == 13 || i85 == 14) {
                                                if (!z6) {
                                                    i30 -= 2;
                                                }
                                                if (i86 == 0) {
                                                    i30 -= 4;
                                                } else if (i86 == 1) {
                                                    i30 -= 2;
                                                }
                                            }
                                            i28 = i30;
                                        } else {
                                            int i87 = j9Var.c;
                                            int i88 = j9Var.g;
                                            if (i87 > 0) {
                                                i28 = i87 + 1;
                                                if (i88 == 4 && i28 == 17) {
                                                    i28 = 21;
                                                }
                                            } else {
                                                if (i88 != 0) {
                                                    if (i88 == 1) {
                                                        i28 = 6;
                                                    } else if (i88 == 2) {
                                                        i28 = i27;
                                                    } else if (i88 == 3) {
                                                        i28 = 10;
                                                    } else if (i88 != 4) {
                                                        tgj.d0("AC-4 level " + j9Var.g + " has not been defined.");
                                                    } else {
                                                        i28 = 12;
                                                    }
                                                }
                                                i28 = 2;
                                            }
                                        }
                                        if (i28 <= 0) {
                                            throw s9e.c("Cannot determine channel count of presentation.");
                                        }
                                        Object[] objArr = {Integer.valueOf(i23), Integer.valueOf(j9Var.f), Integer.valueOf(j9Var.g)};
                                        String str12 = nik.a;
                                        String format2 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                        qm8 qm8Var3 = new qm8();
                                        qm8Var3.a = num3;
                                        qm8Var3.n = sjc.p("audio/ac4");
                                        qm8Var3.F = i28;
                                        qm8Var3.G = i60;
                                        qm8Var3.r = drmInitData2;
                                        qm8Var3.d = str;
                                        qm8Var3.j = format2;
                                        j12Var.e = new b(qm8Var3);
                                        i9 = i26;
                                        i19 = i25;
                                        i12 = i24;
                                    }
                                }
                                i27 = 8;
                                nm2Var3.c();
                                if (i58 == 1) {
                                }
                                if (j9Var.a) {
                                    throw s9e.c("Can't determine channel mode of presentation " + i62);
                                }
                                if (j9Var.a) {
                                }
                                if (i28 <= 0) {
                                }
                            }
                            i24 = i37;
                            i25 = H;
                            i26 = i9;
                            i27 = 8;
                            if (j9Var.a) {
                            }
                            if (i28 <= 0) {
                            }
                        } else {
                            int i89 = i37;
                            i18 = i39;
                            i17 = H;
                            int i90 = i9;
                            if (m3 == 1684892784) {
                                if (m <= 0) {
                                    throw s9e.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + m);
                                }
                                vl0Var = vl0Var2;
                                i9 = m;
                                str6 = str7;
                                str2 = str11;
                                i39 = i18;
                                i12 = i89;
                                i17 = 2;
                            } else if (m3 == 1684305011 || m3 == 1969517683) {
                                i12 = i89;
                                qm8 qm8Var4 = new qm8();
                                qm8Var4.a = Integer.toString(i4);
                                qm8Var4.n = sjc.p(str11);
                                i19 = i17;
                                qm8Var4.F = i19;
                                i9 = i90;
                                qm8Var4.G = i9;
                                qm8Var4.r = drmInitData2;
                                qm8Var4.d = str;
                                j12Var.e = new b(qm8Var4);
                            } else {
                                if (m3 == 1682927731) {
                                    int i91 = i15 - 8;
                                    byte[] bArr6 = a;
                                    byte[] copyOf = Arrays.copyOf(bArr6, bArr6.length + i91);
                                    j9eVar2.N(i18 + 8);
                                    j9eVar2.k(copyOf, bArr6.length, i91);
                                    z2 = kda.s(copyOf);
                                } else if (m3 == 1684425825) {
                                    byte[] bArr7 = new byte[i15 - 8];
                                    bArr7[0] = 102;
                                    bArr7[1] = 76;
                                    bArr7[2] = 97;
                                    bArr7[3] = 67;
                                    j9eVar2.N(i18 + 12);
                                    j9eVar2.k(bArr7, 4, i15 - 12);
                                    z2 = hv9.z(bArr7);
                                } else if (m3 == 1634492771) {
                                    int i92 = i15 - 12;
                                    byte[] bArr8 = new byte[i92];
                                    j9eVar2.N(i18 + 12);
                                    j9eVar2.k(bArr8, 0, i92);
                                    byte[] bArr9 = wz2.a;
                                    j9e j9eVar4 = new j9e(bArr8);
                                    j9eVar4.N(5);
                                    int A5 = j9eVar4.A();
                                    j9eVar4.N(9);
                                    int A6 = j9eVar4.A();
                                    j9eVar4.N(20);
                                    int[] iArr3 = {j9eVar4.E(), A6, A5};
                                    int i93 = iArr3[0];
                                    int i94 = iArr3[1];
                                    int i95 = iArr3[2];
                                    String str13 = nik.a;
                                    int E4 = nik.E(i95, ByteOrder.LITTLE_ENDIAN);
                                    list = hv9.z(bArr8);
                                    i40 = E4;
                                    i9 = i93;
                                    i17 = i94;
                                    str6 = str7;
                                    str2 = str11;
                                    i39 = i18;
                                    i12 = i89;
                                    vl0Var = vl0Var2;
                                } else if (m3 == 1767990114) {
                                    j9eVar2.N(i18 + 9);
                                    int F = j9eVar2.F();
                                    byte[] bArr10 = new byte[F];
                                    j9eVar2.k(bArr10, 0, F);
                                    byte[] bArr11 = wz2.a;
                                    j9e j9eVar5 = new j9e(bArr10);
                                    String str14 = null;
                                    String str15 = null;
                                    while (j9eVar5.a() > 0 && (str14 == null || str15 == null)) {
                                        int A7 = j9eVar5.A();
                                        int i96 = A7 >> 3;
                                        boolean z7 = (A7 & 2) != 0;
                                        boolean z8 = (A7 & 1) != 0;
                                        int F2 = j9eVar5.F();
                                        if (i96 > 4 && i96 < 24 && z7) {
                                            do {
                                            } while ((j9eVar5.A() & 128) != 0);
                                            for (i22 = 128; (j9eVar5.A() & i22) != 0; i22 = 128) {
                                            }
                                        }
                                        if (z8) {
                                            j9eVar5.O(j9eVar5.F());
                                        }
                                        int i97 = j9eVar5.b + F2;
                                        if (i96 == 31) {
                                            j9eVar5.O(4);
                                            Object[] objArr2 = {Integer.valueOf(j9eVar5.A()), Integer.valueOf(j9eVar5.A())};
                                            String str16 = nik.a;
                                            str14 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                        } else if (i96 == 0) {
                                            while ((j9eVar5.A() & 128) != 0) {
                                            }
                                            str15 = j9eVar5.y(4, StandardCharsets.UTF_8);
                                            if (str15.equals("mp4a")) {
                                                while ((j9eVar5.A() & 128) != 0) {
                                                }
                                                j9eVar5.O(2);
                                                nm2 nm2Var4 = new nm2(3);
                                                nm2Var4.o(j9eVar5);
                                                int i98 = nm2Var4.i(5);
                                                if (i98 == 31) {
                                                    i98 = nm2Var4.i(6) + 32;
                                                }
                                                str15 = mz1.j(i98, str15, ".40.");
                                            }
                                            j9eVar5.N(i97);
                                        }
                                        j9eVar5.N(i97);
                                    }
                                    str6 = (str14 == null || str15 == null) ? null : lnb.o(str14, ".", str15);
                                    vl0Var = vl0Var2;
                                    list = hv9.z(bArr10);
                                    str2 = str11;
                                    i39 = i18;
                                    i9 = i90;
                                    i12 = i89;
                                } else if (m3 == 1885564227) {
                                    j9eVar2.N(i18 + 12);
                                    ByteOrder byteOrder = (j9eVar2.A() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                    int A8 = j9eVar2.A();
                                    i12 = i89;
                                    if (i12 == 1768973165) {
                                        i20 = nik.E(A8, byteOrder);
                                        i21 = -1;
                                    } else {
                                        i20 = (i12 == 1718641517 && A8 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i40;
                                        i21 = -1;
                                    }
                                    vl0Var = vl0Var2;
                                    i40 = i20;
                                    str6 = str7;
                                    str2 = i20 != i21 ? MimeTypes.AUDIO_RAW : str11;
                                    i39 = i18;
                                    i9 = i90;
                                } else {
                                    i12 = i89;
                                    i9 = i90;
                                    i19 = i17;
                                }
                                vl0Var = vl0Var2;
                                list = z2;
                                str6 = str7;
                                str2 = str11;
                                i39 = i18;
                                i9 = i90;
                                i12 = i89;
                            }
                        }
                    }
                    vl0Var = vl0Var2;
                    i17 = i19;
                    str6 = str7;
                    str2 = str11;
                    i39 = i18;
                }
                i39 += i15;
                i8 = 4;
                i7 = 2;
                j9eVar2 = j9eVar;
                i38 = i3;
                i37 = i12;
                vl0Var2 = vl0Var;
                i10 = i40;
                str5 = str3;
                list2 = list;
                H = i17;
            }
            vl0Var = vl0Var2;
            i12 = i37;
            i39 += i15;
            i8 = 4;
            i7 = 2;
            j9eVar2 = j9eVar;
            i38 = i3;
            i37 = i12;
            vl0Var2 = vl0Var;
            i10 = i40;
            str5 = str3;
            list2 = list;
            H = i17;
        }
        String str17 = str6;
        String str18 = str2;
        List list3 = list2;
        int i99 = H;
        int i100 = i10;
        if (((b) j12Var.e) != null || str18 == null) {
            return;
        }
        qm8 qm8Var5 = new qm8();
        qm8Var5.a = Integer.toString(i4);
        qm8Var5.n = sjc.p(str18);
        qm8Var5.j = str17;
        qm8Var5.F = i99;
        qm8Var5.G = i9;
        qm8Var5.H = i100;
        qm8Var5.q = list3;
        qm8Var5.r = drmInitData2;
        qm8Var5.d = str;
        if (vl0Var2 != null) {
            vl0 vl0Var3 = vl0Var2;
            qm8Var5.h = jaa.M(vl0Var3.c);
            qm8Var5.i = jaa.M(vl0Var3.d);
        } else {
            h12 h12Var2 = h12Var;
            if (h12Var2 != null) {
                qm8Var5.h = jaa.M(h12Var2.a);
                qm8Var5.i = jaa.M(h12Var2.b);
            }
        }
        j12Var.e = new b(qm8Var5);
    }

    public static vl0 c(int i, j9e j9eVar) {
        j9eVar.N(i + 12);
        j9eVar.O(1);
        d(j9eVar);
        j9eVar.O(2);
        int A = j9eVar.A();
        if ((A & 128) != 0) {
            j9eVar.O(2);
        }
        if ((A & 64) != 0) {
            j9eVar.O(j9eVar.A());
        }
        if ((A & 32) != 0) {
            j9eVar.O(2);
        }
        j9eVar.O(1);
        d(j9eVar);
        String f = sjc.f(j9eVar.A());
        if (MimeTypes.AUDIO_MPEG.equals(f) || MimeTypes.AUDIO_DTS.equals(f) || MimeTypes.AUDIO_DTS_HD.equals(f)) {
            return new vl0(f, null, -1L, -1L);
        }
        j9eVar.O(4);
        long C = j9eVar.C();
        long C2 = j9eVar.C();
        j9eVar.O(1);
        int d = d(j9eVar);
        long j = C2;
        byte[] bArr = new byte[d];
        j9eVar.k(bArr, 0, d);
        if (j <= 0) {
            j = -1;
        }
        return new vl0(f, bArr, j, C > 0 ? C : -1L);
    }

    public static int d(j9e j9eVar) {
        int A = j9eVar.A();
        int i = A & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while ((A & 128) == 128) {
            A = j9eVar.A();
            i = (i << 7) | (A & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r9 = r14.m();
        r10 = r14.m();
        r11 = r11 - 16;
        r12 = new byte[r11];
        r14.k(r12, 0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        r11 = new defpackage.e1c(r8, r12, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        defpackage.mz1.z("Failed to parse metadata entry with key: ", r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ric f(axc axcVar) {
        bxc B = axcVar.B(1751411826);
        bxc B2 = axcVar.B(1801812339);
        bxc B3 = axcVar.B(1768715124);
        if (B == null || B2 == null || B3 == null) {
            return null;
        }
        j9e j9eVar = B.g;
        j9eVar.N(16);
        if (j9eVar.m() != 1835299937) {
            return null;
        }
        j9e j9eVar2 = B2.g;
        j9eVar2.N(12);
        int m = j9eVar2.m();
        String[] strArr = new String[m];
        for (int i = 0; i < m; i++) {
            int m2 = j9eVar2.m();
            j9eVar2.O(4);
            strArr[i] = j9eVar2.y(m2 - 8, StandardCharsets.UTF_8);
        }
        j9e j9eVar3 = B3.g;
        j9eVar3.N(8);
        ArrayList arrayList = new ArrayList();
        while (j9eVar3.a() > 8) {
            int i2 = j9eVar3.b;
            int m3 = j9eVar3.m();
            int m4 = j9eVar3.m() - 1;
            if (m4 < 0 || m4 >= m) {
                fn0.r(m4, "Skipped metadata with unknown key index: ");
            } else {
                String str = strArr[m4];
                int i3 = i2 + m3;
                while (true) {
                    int i4 = j9eVar3.b;
                    if (i4 >= i3) {
                        break;
                    }
                    int m5 = j9eVar3.m();
                    if (j9eVar3.m() == 1684108385) {
                        break;
                    }
                    j9eVar3.N(i4 + m5);
                }
                e1c e1cVar = null;
                if (e1cVar != null) {
                    arrayList.add(e1cVar);
                }
            }
            j9eVar3.N(i2 + m3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ric(arrayList);
    }

    public static ixc g(j9e j9eVar) {
        long u;
        long u2;
        j9eVar.N(8);
        if (e(j9eVar.m()) == 0) {
            u = j9eVar.C();
            u2 = j9eVar.C();
        } else {
            u = j9eVar.u();
            u2 = j9eVar.u();
        }
        return new ixc(u, u2, j9eVar.C());
    }

    public static Pair h(j9e j9eVar, int i, int i2) {
        Integer num;
        lsj lsjVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = j9eVar.b;
        while (i5 - i < i2) {
            j9eVar.N(i5);
            int m = j9eVar.m();
            o1j.s("childAtomSize must be positive", m > 0);
            if (j9eVar.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < m) {
                    j9eVar.N(i6);
                    int m2 = j9eVar.m();
                    int m3 = j9eVar.m();
                    if (m3 == 1718775137) {
                        num3 = Integer.valueOf(j9eVar.m());
                    } else if (m3 == 1935894637) {
                        j9eVar.O(4);
                        str = j9eVar.y(4, StandardCharsets.UTF_8);
                    } else if (m3 == 1935894633) {
                        i8 = i6;
                        i7 = m2;
                    }
                    i6 += m2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(str) || C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) || C.CENC_TYPE_cbcs.equals(str)) {
                    o1j.s("frma atom is mandatory", num3 != null);
                    o1j.s("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num3;
                            lsjVar = null;
                            break;
                        }
                        j9eVar.N(i9);
                        int m4 = j9eVar.m();
                        if (j9eVar.m() == 1952804451) {
                            int e = e(j9eVar.m());
                            j9eVar.O(1);
                            if (e == 0) {
                                j9eVar.O(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int A = j9eVar.A();
                                i3 = A & 15;
                                i4 = (A & 240) >> 4;
                            }
                            if (j9eVar.A() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int A2 = j9eVar.A();
                            byte[] bArr2 = new byte[16];
                            j9eVar.k(bArr2, 0, 16);
                            if (z && A2 == 0) {
                                int A3 = j9eVar.A();
                                byte[] bArr3 = new byte[A3];
                                j9eVar.k(bArr3, 0, A3);
                                bArr = bArr3;
                            }
                            num = num2;
                            lsjVar = new lsj(z, str, A2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += m4;
                        }
                    }
                    o1j.s("tenc atom is mandatory", lsjVar != null);
                    String str2 = nik.a;
                    create = Pair.create(num, lsjVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += m;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0953  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j12 i(j9e j9eVar, k12 k12Var, String str, DrmInitData drmInitData, boolean z) {
        int i;
        int i2;
        DrmInitData drmInitData2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        String str2;
        String str3;
        int i6;
        int i7;
        String str4;
        String str5;
        int i8;
        g7h g7hVar;
        byte b;
        int i9;
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        w13 w13Var;
        w13 w13Var2;
        int i22;
        int i23;
        int i24;
        int i25;
        String str6;
        int i26;
        int i27;
        int i28;
        DrmInitData drmInitData3;
        int i29;
        String str7;
        vvf vvfVar;
        j9e j9eVar2 = j9eVar;
        k12 k12Var2 = k12Var;
        String str8 = str;
        int i30 = k12Var2.a;
        j9eVar2.N(12);
        int m = j9eVar2.m();
        boolean z3 = false;
        j12 j12Var = new j12(m, 0);
        int i31 = 0;
        while (i31 < m) {
            int i32 = j9eVar2.b;
            int m2 = j9eVar2.m();
            String str9 = "childAtomSize must be positive";
            o1j.s("childAtomSize must be positive", m2 > 0 ? true : z3);
            int m3 = j9eVar2.m();
            int i33 = 8;
            byte b2 = 3;
            String str10 = null;
            if (m3 == 1635148593 || m3 == 1635148595 || m3 == 1701733238 || m3 == 1831958048 || m3 == 1836070006 || m3 == 1752589105 || m3 == 1751479857 || m3 == 1987470129 || m3 == 1987471665 || m3 == 1932670515 || m3 == 1211250227 || m3 == 1748121139 || m3 == 1987063864 || m3 == 1987063865 || m3 == 1635135537 || m3 == 1685479798 || m3 == 1685479729 || m3 == 1685481573 || m3 == 1685481521 || m3 == 1634760241 || m3 == 1684108849) {
                int i34 = k12Var2.c;
                j9eVar2.N(i32 + 16);
                j9eVar2.O(16);
                int H = j9eVar2.H();
                int H2 = j9eVar2.H();
                j9eVar2.O(50);
                int i35 = j9eVar2.b;
                i = i31;
                if (m3 == 1701733238) {
                    Pair h = h(j9eVar2, i32, m2);
                    if (h != null) {
                        m3 = ((Integer) h.first).intValue();
                        if (drmInitData == null) {
                            i2 = i32;
                            drmInitData3 = null;
                        } else {
                            i2 = i32;
                            drmInitData3 = drmInitData.a(((lsj) h.second).b);
                        }
                        ((lsj[]) j12Var.d)[i] = (lsj) h.second;
                    } else {
                        i2 = i32;
                        drmInitData3 = drmInitData;
                    }
                    j9eVar2.N(i35);
                    drmInitData2 = drmInitData3;
                } else {
                    i2 = i32;
                    drmInitData2 = drmInitData;
                }
                DrmInitData drmInitData4 = drmInitData2;
                i3 = i30;
                i4 = m;
                int i36 = i35;
                int i37 = 8;
                List list = null;
                g7h g7hVar2 = null;
                ByteBuffer byteBuffer = null;
                String str11 = null;
                byte[] bArr2 = null;
                f79 f79Var = null;
                h12 h12Var = null;
                vl0 vl0Var = null;
                String str12 = m3 == 1831958048 ? MimeTypes.VIDEO_MPEG : m3 == 1211250227 ? MimeTypes.VIDEO_H263 : null;
                float f = 1.0f;
                int i38 = -1;
                int i39 = -1;
                int i40 = -1;
                int i41 = -1;
                boolean z4 = false;
                int i42 = -1;
                int i43 = -1;
                int i44 = -1;
                int i45 = -1;
                int i46 = 8;
                while (i36 - i2 < m2) {
                    j9eVar2.N(i36);
                    int i47 = j9eVar2.b;
                    int i48 = i36;
                    int m4 = j9eVar2.m();
                    if (m4 == 0 && j9eVar2.b - i2 == m2) {
                        break;
                    }
                    o1j.s(str9, m4 > 0);
                    int m5 = j9eVar2.m();
                    int i49 = m2;
                    if (m5 == 1635148611) {
                        o1j.s(str10, str12 == null);
                        j9eVar2.N(i47 + 8);
                        wv0 a2 = wv0.a(j9eVar2);
                        list = a2.a;
                        j12Var.b = a2.b;
                        float f2 = !z4 ? a2.k : f;
                        String str13 = a2.l;
                        int i50 = a2.j;
                        int i51 = a2.g;
                        int i52 = a2.h;
                        int i53 = a2.i;
                        int i54 = a2.e;
                        i37 = a2.f;
                        i6 = m3;
                        str4 = str9;
                        i7 = i52;
                        f = f2;
                        i43 = i50;
                        i8 = i54;
                        g7hVar = g7hVar2;
                        i9 = i33;
                        b = b2;
                        str12 = "video/avc";
                        str11 = str13;
                        i41 = i51;
                        i39 = i53;
                    } else {
                        i6 = m3;
                        if (m5 == 1752589123) {
                            o1j.s(null, str12 == null);
                            j9eVar2.N(i47 + 8);
                            v99 a3 = v99.a(j9eVar2, false, null);
                            list = a3.a;
                            j12Var.b = a3.b;
                            float f3 = !z4 ? a3.l : f;
                            int i55 = a3.m;
                            int i56 = a3.c;
                            String str14 = a3.n;
                            int i57 = a3.k;
                            if (i57 != -1) {
                                i38 = i57;
                            }
                            int i58 = a3.d;
                            int i59 = a3.e;
                            int i60 = a3.h;
                            int i61 = a3.i;
                            int i62 = a3.j;
                            int i63 = a3.f;
                            i37 = a3.g;
                            g7hVar = a3.o;
                            str4 = str9;
                            i44 = i59;
                            i45 = i58;
                            f = f3;
                            i7 = i61;
                            b = b2;
                            i39 = i62;
                            i8 = i63;
                            str12 = "video/hevc";
                            i43 = i55;
                            i41 = i60;
                            i9 = i33;
                            i42 = i56;
                            str11 = str14;
                        } else {
                            int i64 = i38;
                            if (m5 == 1818785347) {
                                o1j.s("lhvC must follow hvcC atom", "video/hevc".equals(str12));
                                o1j.s("must have at least two layers", g7hVar2 != null && ((hv9) g7hVar2.b).size() >= 2);
                                j9eVar2.N(i47 + 8);
                                g7hVar2.getClass();
                                v99 a4 = v99.a(j9eVar2, true, g7hVar2);
                                o1j.s("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", j12Var.b == a4.b);
                                int i65 = a4.h;
                                if (i65 != -1) {
                                    o1j.s("colorSpace must be the same for both views", i41 == i65);
                                }
                                int i66 = a4.i;
                                if (i66 != -1) {
                                    o1j.s("colorRange must be the same for both views", i40 == i66);
                                }
                                int i67 = a4.j;
                                if (i67 != -1) {
                                    o1j.s("colorTransfer must be the same for both views", i39 == i67);
                                }
                                o1j.s("bitdepthLuma must be the same for both views", i46 == a4.f);
                                o1j.s("bitdepthChroma must be the same for both views", i37 == a4.g);
                                if (list != null) {
                                    zu9 s = hv9.s();
                                    s.e(list);
                                    s.e(a4.a);
                                    list = s.g();
                                } else {
                                    o1j.s("initializationData must be already set from hvcC atom", false);
                                }
                                str11 = a4.n;
                                str12 = "video/mv-hevc";
                                i8 = i46;
                                i7 = i40;
                                g7hVar = g7hVar2;
                                i9 = i33;
                                b = b2;
                                i10 = i64;
                            } else {
                                int i68 = 7;
                                if (m5 == 1987470147) {
                                    o1j.s(null, str12 == null);
                                    j9eVar2.N(i47 + 8);
                                    try {
                                        if (j9eVar2.m() != 0) {
                                            throw s9e.a(null, "Unsupported VVC version");
                                        }
                                        int A = j9eVar2.A();
                                        int i69 = (A >> 1) & 3;
                                        boolean z5 = (A & 1) != 0;
                                        int i70 = i69 + 1;
                                        str6 = "L";
                                        if (z5) {
                                            j9eVar2.O(1);
                                            int A2 = (j9eVar2.A() >> 4) & 7;
                                            i27 = (j9eVar2.A() >> 5) & 7;
                                            int A3 = j9eVar2.A() & 63;
                                            int A4 = j9eVar2.A();
                                            int i71 = (A4 >> 1) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                                            str6 = (A4 & 1) != 0 ? "H" : "L";
                                            i28 = j9eVar2.A();
                                            j9eVar2.O(A3);
                                            int i72 = 1;
                                            if (A2 > 1) {
                                                int A5 = j9eVar2.A();
                                                int i73 = 0;
                                                while (i73 < A2 - 1) {
                                                    if (((A5 >> (7 - i73)) & i72) != 0) {
                                                        j9eVar2.O(i72);
                                                    }
                                                    i73++;
                                                    i72 = 1;
                                                }
                                            }
                                            j9eVar2.O(j9eVar2.A() * 4);
                                            j9eVar2.O(6);
                                            i26 = i71;
                                        } else {
                                            i26 = 0;
                                            i27 = 0;
                                            i28 = 0;
                                        }
                                        int A6 = j9eVar2.A();
                                        int i74 = j9eVar2.b;
                                        int i75 = i27;
                                        int i76 = 0;
                                        int i77 = 0;
                                        while (i77 < A6) {
                                            int i78 = i40;
                                            int A7 = j9eVar2.A() & 31;
                                            int i79 = i77;
                                            int H3 = (A7 == 13 || A7 == 12) ? 1 : j9eVar2.H();
                                            int i80 = 0;
                                            while (i80 < H3) {
                                                int i81 = i76;
                                                int H4 = j9eVar2.H();
                                                j9eVar2.O(H4);
                                                i80++;
                                                i76 = H4 + 4 + i81;
                                            }
                                            i77 = i79 + 1;
                                            i40 = i78;
                                        }
                                        i7 = i40;
                                        j9eVar2.N(i74);
                                        byte[] bArr3 = new byte[i76];
                                        int i82 = 0;
                                        int i83 = 0;
                                        while (i82 < A6) {
                                            int A8 = j9eVar2.A() & 31;
                                            int i84 = A6;
                                            int H5 = (A8 == 13 || A8 == 12) ? 1 : j9eVar2.H();
                                            int i85 = 0;
                                            while (i85 < H5) {
                                                int i86 = H5;
                                                int H6 = j9eVar2.H();
                                                System.arraycopy(kik.l, 0, bArr3, i83, 4);
                                                int i87 = i83 + 4;
                                                j9eVar2.k(bArr3, i87, H6);
                                                i83 = i87 + H6;
                                                i85++;
                                                H5 = i86;
                                                i82 = i82;
                                                i39 = i39;
                                            }
                                            i82++;
                                            A6 = i84;
                                        }
                                        int i88 = i39;
                                        Locale locale = Locale.US;
                                        String str15 = "vvc1." + i26 + "." + str6 + i28;
                                        list = hv9.z(bArr3);
                                        int i89 = i75 + 8;
                                        j12Var.b = i70;
                                        str11 = str15;
                                        str12 = "video/vvc";
                                        i37 = i89;
                                        i8 = i37;
                                        g7hVar = g7hVar2;
                                        i9 = i33;
                                        b = b2;
                                        i10 = i64;
                                        i39 = i88;
                                        i43 = 16;
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        throw s9e.a(e, "Error parsing VVC configuration");
                                    }
                                } else {
                                    int i90 = i39;
                                    i7 = i40;
                                    if (m5 == 1986361461) {
                                        j9eVar2.N(i47 + 8);
                                        int i91 = j9eVar2.b;
                                        sz8 sz8Var = null;
                                        while (i91 - i47 < m4) {
                                            j9eVar2.N(i91);
                                            int m6 = j9eVar2.m();
                                            o1j.s(str9, m6 > 0);
                                            if (j9eVar2.m() == 1702454643) {
                                                j9eVar2.N(i91 + 8);
                                                int i92 = j9eVar2.b;
                                                while (true) {
                                                    if (i92 - i91 >= m6) {
                                                        i24 = i37;
                                                        i25 = i91;
                                                        sz8Var = null;
                                                        break;
                                                    }
                                                    j9eVar2.N(i92);
                                                    int m7 = j9eVar2.m();
                                                    o1j.s(str9, m7 > 0);
                                                    if (j9eVar2.m() == 1937011305) {
                                                        j9eVar2.O(4);
                                                        int A9 = j9eVar2.A();
                                                        i24 = i37;
                                                        i25 = i91;
                                                        sz8Var = new sz8(new vn0((A9 & 1) == 1, (A9 & 2) == 2, (A9 & 8) == i33), 11);
                                                    } else {
                                                        i92 += m7;
                                                        i33 = 8;
                                                    }
                                                }
                                            } else {
                                                i24 = i37;
                                                i25 = i91;
                                            }
                                            i91 = i25 + m6;
                                            i37 = i24;
                                            i33 = 8;
                                        }
                                        int i93 = i37;
                                        t9d t9dVar = sz8Var == null ? null : new t9d(sz8Var);
                                        if (t9dVar != null) {
                                            vn0 vn0Var = (vn0) ((sz8) t9dVar.a).b;
                                            boolean z6 = vn0Var.c;
                                            if (g7hVar2 == null || ((hv9) g7hVar2.b).size() < 2) {
                                                i22 = i64;
                                                if (i22 == -1) {
                                                    i23 = z6 ? 5 : 4;
                                                    i10 = i23;
                                                    str4 = str9;
                                                    i8 = i46;
                                                    g7hVar = g7hVar2;
                                                    b = b2;
                                                    i39 = i90;
                                                    i37 = i93;
                                                }
                                                i23 = i22;
                                                i10 = i23;
                                                str4 = str9;
                                                i8 = i46;
                                                g7hVar = g7hVar2;
                                                b = b2;
                                                i39 = i90;
                                                i37 = i93;
                                            } else {
                                                o1j.s("both eye views must be marked as available", vn0Var.a && vn0Var.b);
                                                o1j.s("for MV-HEVC, eye_views_reversed must be set to false", !z6);
                                            }
                                        }
                                        i22 = i64;
                                        i23 = i22;
                                        i10 = i23;
                                        str4 = str9;
                                        i8 = i46;
                                        g7hVar = g7hVar2;
                                        b = b2;
                                        i39 = i90;
                                        i37 = i93;
                                    } else {
                                        int i94 = i37;
                                        int i95 = i64;
                                        if (m5 == 1685480259 || m5 == 1685485123 || m5 == 1685485379) {
                                            str4 = str9;
                                            str5 = str12;
                                            i8 = i46;
                                            g7hVar = g7hVar2;
                                            b = b2;
                                            i9 = 8;
                                            i10 = i95;
                                            i39 = i90;
                                            f79Var = f79.b(j9eVar2);
                                        } else if (m5 == 1987076931) {
                                            o1j.s(null, str12 == null);
                                            str12 = i6 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                            j9eVar2.N(i47 + 12);
                                            byte A10 = (byte) j9eVar2.A();
                                            byte A11 = (byte) j9eVar2.A();
                                            int A12 = j9eVar2.A();
                                            int i96 = A12 >> 4;
                                            byte b3 = (byte) ((A12 >> 1) & 7);
                                            if (str12.equals(MimeTypes.VIDEO_VP9)) {
                                                byte[] bArr4 = wz2.a;
                                                byte[] bArr5 = new byte[12];
                                                bArr5[0] = 1;
                                                bArr5[1] = 1;
                                                bArr5[2] = A10;
                                                bArr5[b2] = 2;
                                                bArr5[4] = 1;
                                                bArr5[5] = A11;
                                                bArr5[6] = b2;
                                                bArr5[7] = 1;
                                                bArr5[8] = (byte) i96;
                                                bArr5[9] = 4;
                                                bArr5[10] = 1;
                                                bArr5[11] = b3;
                                                list = hv9.z(bArr5);
                                            }
                                            boolean z7 = (A12 & 1) != 0;
                                            int A13 = j9eVar2.A();
                                            int A14 = j9eVar2.A();
                                            i41 = w13.f(A13);
                                            int i97 = z7 ? 1 : 2;
                                            i39 = w13.g(A14);
                                            i10 = i95;
                                            i6 = i6;
                                            str4 = str9;
                                            i37 = i96;
                                            i8 = i37;
                                            g7hVar = g7hVar2;
                                            b = b2;
                                            i7 = i97;
                                        } else {
                                            if (m5 == 1635135811) {
                                                int i98 = m4 - 8;
                                                byte[] bArr6 = new byte[i98];
                                                j9eVar2.k(bArr6, 0, i98);
                                                list = hv9.z(bArr6);
                                                j9eVar2.N(i47 + 8);
                                                byte[] bArr7 = j9eVar2.a;
                                                byte b4 = b2;
                                                nm2 nm2Var = new nm2(bArr7, bArr7.length, b4, (byte) 0);
                                                nm2Var.q(j9eVar2.b * 8);
                                                nm2Var.u(1);
                                                int i99 = nm2Var.i(b4);
                                                nm2Var.t(6);
                                                boolean h2 = nm2Var.h();
                                                boolean h3 = nm2Var.h();
                                                int i100 = -1;
                                                if (i99 == 2 && h2) {
                                                    int i101 = h3 ? 12 : 10;
                                                    i14 = h3 ? 12 : 10;
                                                    i12 = i101;
                                                } else if (i99 <= 2) {
                                                    int i102 = h2 ? 10 : 8;
                                                    i14 = h2 ? 10 : 8;
                                                    i12 = i102;
                                                } else {
                                                    i12 = -1;
                                                    i13 = -1;
                                                    nm2Var.t(13);
                                                    nm2Var.s();
                                                    i15 = nm2Var.i(4);
                                                    if (i15 == 1) {
                                                        tgj.O("Unsupported obu_type: " + i15);
                                                        w13Var2 = new w13(-1, -1, -1, i12, i13, null);
                                                    } else if (nm2Var.h()) {
                                                        tgj.O("Unsupported obu_extension_flag");
                                                        w13Var2 = new w13(-1, -1, -1, i12, i13, null);
                                                    } else {
                                                        boolean h4 = nm2Var.h();
                                                        nm2Var.s();
                                                        if (!h4 || nm2Var.i(8) <= 127) {
                                                            int i103 = nm2Var.i(3);
                                                            nm2Var.s();
                                                            if (nm2Var.h()) {
                                                                tgj.O("Unsupported reduced_still_picture_header");
                                                                w13Var2 = new w13(-1, -1, -1, i12, i13, null);
                                                            } else if (nm2Var.h()) {
                                                                tgj.O("Unsupported timing_info_present_flag");
                                                                w13Var2 = new w13(-1, -1, -1, i12, i13, null);
                                                            } else if (nm2Var.h()) {
                                                                tgj.O("Unsupported initial_display_delay_present_flag");
                                                                w13Var2 = new w13(-1, -1, -1, i12, i13, null);
                                                            } else {
                                                                int i104 = 5;
                                                                int i105 = nm2Var.i(5);
                                                                int i106 = 0;
                                                                while (i106 <= i105) {
                                                                    nm2Var.t(12);
                                                                    if (nm2Var.i(i104) > i68) {
                                                                        nm2Var.s();
                                                                    }
                                                                    i106++;
                                                                    i104 = 5;
                                                                    i68 = 7;
                                                                }
                                                                int i107 = nm2Var.i(4);
                                                                int i108 = nm2Var.i(4);
                                                                nm2Var.t(i107 + 1);
                                                                nm2Var.t(i108 + 1);
                                                                if (nm2Var.h()) {
                                                                    i16 = 7;
                                                                    nm2Var.t(7);
                                                                } else {
                                                                    i16 = 7;
                                                                }
                                                                nm2Var.t(i16);
                                                                boolean h5 = nm2Var.h();
                                                                if (h5) {
                                                                    nm2Var.t(2);
                                                                }
                                                                if (nm2Var.h()) {
                                                                    i18 = 2;
                                                                    i17 = 1;
                                                                } else {
                                                                    i17 = 1;
                                                                    i18 = nm2Var.i(1);
                                                                }
                                                                if (i18 > 0 && !nm2Var.h()) {
                                                                    nm2Var.t(i17);
                                                                }
                                                                if (h5) {
                                                                    nm2Var.t(3);
                                                                }
                                                                nm2Var.t(3);
                                                                boolean h6 = nm2Var.h();
                                                                if (i103 == 2 && h6) {
                                                                    nm2Var.s();
                                                                }
                                                                boolean z8 = i103 != 1 && nm2Var.h();
                                                                if (nm2Var.h()) {
                                                                    int i109 = nm2Var.i(8);
                                                                    int i110 = nm2Var.i(8);
                                                                    int i111 = (!z8 && i109 == 1 && i110 == 13 && nm2Var.i(8) == 0) ? 1 : nm2Var.i(1);
                                                                    int f4 = w13.f(i109);
                                                                    int i112 = i111 == 1 ? 1 : 2;
                                                                    i19 = f4;
                                                                    i20 = i13;
                                                                    i21 = w13.g(i110);
                                                                    i100 = i112;
                                                                } else {
                                                                    i19 = -1;
                                                                    i20 = i13;
                                                                    i21 = -1;
                                                                }
                                                                w13Var = new w13(i19, i100, i21, i12, i20, null);
                                                                int i113 = w13Var.e;
                                                                int i114 = w13Var.f;
                                                                i41 = w13Var.a;
                                                                int i115 = w13Var.b;
                                                                int i116 = w13Var.c;
                                                                i6 = i6;
                                                                str4 = str9;
                                                                i7 = i115;
                                                                i8 = i113;
                                                                g7hVar = g7hVar2;
                                                                i9 = 8;
                                                                b = 3;
                                                                str12 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                                i10 = i95;
                                                                i37 = i114;
                                                                i39 = i116;
                                                            }
                                                        } else {
                                                            tgj.O("Excessive obu_size");
                                                            w13Var2 = new w13(-1, -1, -1, i12, i13, null);
                                                        }
                                                    }
                                                    w13Var = w13Var2;
                                                    int i1132 = w13Var.e;
                                                    int i1142 = w13Var.f;
                                                    i41 = w13Var.a;
                                                    int i1152 = w13Var.b;
                                                    int i1162 = w13Var.c;
                                                    i6 = i6;
                                                    str4 = str9;
                                                    i7 = i1152;
                                                    i8 = i1132;
                                                    g7hVar = g7hVar2;
                                                    i9 = 8;
                                                    b = 3;
                                                    str12 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                    i10 = i95;
                                                    i37 = i1142;
                                                    i39 = i1162;
                                                }
                                                i13 = i14;
                                                nm2Var.t(13);
                                                nm2Var.s();
                                                i15 = nm2Var.i(4);
                                                if (i15 == 1) {
                                                }
                                                w13Var = w13Var2;
                                                int i11322 = w13Var.e;
                                                int i11422 = w13Var.f;
                                                i41 = w13Var.a;
                                                int i11522 = w13Var.b;
                                                int i11622 = w13Var.c;
                                                i6 = i6;
                                                str4 = str9;
                                                i7 = i11522;
                                                i8 = i11322;
                                                g7hVar = g7hVar2;
                                                i9 = 8;
                                                b = 3;
                                                str12 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                                i10 = i95;
                                                i37 = i11422;
                                                i39 = i11622;
                                            } else {
                                                if (m5 == 1668050025) {
                                                    ByteBuffer order = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    order.position(21);
                                                    order.putShort(j9eVar2.x());
                                                    order.putShort(j9eVar2.x());
                                                    i10 = i95;
                                                    byteBuffer = order;
                                                    i6 = i6;
                                                    str4 = str9;
                                                    i8 = i46;
                                                    g7hVar = g7hVar2;
                                                } else {
                                                    if (m5 == 1835295606) {
                                                        ByteBuffer order2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                        short x = j9eVar2.x();
                                                        short x2 = j9eVar2.x();
                                                        short x3 = j9eVar2.x();
                                                        short x4 = j9eVar2.x();
                                                        i6 = i6;
                                                        short x5 = j9eVar2.x();
                                                        str4 = str9;
                                                        short x6 = j9eVar2.x();
                                                        str5 = str12;
                                                        short x7 = j9eVar2.x();
                                                        i8 = i46;
                                                        short x8 = j9eVar2.x();
                                                        long C = j9eVar2.C();
                                                        long C2 = j9eVar2.C();
                                                        g7hVar = g7hVar2;
                                                        order2.position(1);
                                                        order2.putShort(x5);
                                                        order2.putShort(x6);
                                                        order2.putShort(x);
                                                        order2.putShort(x2);
                                                        order2.putShort(x3);
                                                        order2.putShort(x4);
                                                        order2.putShort(x7);
                                                        order2.putShort(x8);
                                                        order2.putShort((short) (C / Ua.s));
                                                        order2.putShort((short) (C2 / Ua.s));
                                                        i10 = i95;
                                                        byteBuffer = order2;
                                                    } else {
                                                        i6 = i6;
                                                        str4 = str9;
                                                        str5 = str12;
                                                        i8 = i46;
                                                        g7hVar = g7hVar2;
                                                        if (m5 == 1681012275) {
                                                            o1j.s(null, str5 == null);
                                                            i10 = i95;
                                                            str12 = MimeTypes.VIDEO_H263;
                                                        } else if (m5 == 1702061171) {
                                                            o1j.s(null, str5 == null);
                                                            vl0 c = c(i47, j9eVar2);
                                                            String str16 = c.a;
                                                            byte[] bArr8 = c.b;
                                                            if (bArr8 != null) {
                                                                list = hv9.z(bArr8);
                                                            }
                                                            i10 = i95;
                                                            vl0Var = c;
                                                            str12 = str16;
                                                        } else if (m5 == 1651798644) {
                                                            j9eVar2.N(i47 + 8);
                                                            j9eVar2.O(4);
                                                            i10 = i95;
                                                            h12Var = new h12(j9eVar2.C(), j9eVar2.C());
                                                        } else if (m5 == 1885434736) {
                                                            j9eVar2.N(i47 + 8);
                                                            i10 = i95;
                                                            f = j9eVar2.E() / j9eVar2.E();
                                                            str12 = str5;
                                                            i39 = i90;
                                                            i37 = i94;
                                                            i9 = 8;
                                                            b = 3;
                                                            z4 = true;
                                                            i36 = i48 + m4;
                                                            i38 = i10;
                                                            i33 = i9;
                                                            b2 = b;
                                                            m2 = i49;
                                                            m3 = i6;
                                                            str9 = str4;
                                                            i46 = i8;
                                                            i40 = i7;
                                                            g7hVar2 = g7hVar;
                                                            str10 = null;
                                                        } else if (m5 == 1937126244) {
                                                            int i117 = i47 + 8;
                                                            while (true) {
                                                                if (i117 - i47 >= m4) {
                                                                    bArr = null;
                                                                    break;
                                                                }
                                                                j9eVar2.N(i117);
                                                                int m8 = j9eVar2.m();
                                                                if (j9eVar2.m() == 1886547818) {
                                                                    bArr = Arrays.copyOfRange(j9eVar2.a, i117, m8 + i117);
                                                                    break;
                                                                }
                                                                i117 += m8;
                                                            }
                                                            i10 = i95;
                                                            bArr2 = bArr;
                                                        } else if (m5 == 1936995172) {
                                                            int A15 = j9eVar2.A();
                                                            j9eVar2.O(3);
                                                            if (A15 == 0) {
                                                                int A16 = j9eVar2.A();
                                                                if (A16 == 0) {
                                                                    i95 = 0;
                                                                } else if (A16 == 1) {
                                                                    i95 = 1;
                                                                } else if (A16 == 2) {
                                                                    i95 = 2;
                                                                } else if (A16 == 3) {
                                                                    i95 = 3;
                                                                }
                                                            }
                                                            i10 = i95;
                                                        } else if (m5 == 1634760259) {
                                                            int i118 = m4 - 12;
                                                            byte[] bArr9 = new byte[i118];
                                                            j9eVar2.N(i47 + 12);
                                                            j9eVar2.k(bArr9, 0, i118);
                                                            byte[] bArr10 = wz2.a;
                                                            z1a.o(i118, "Invalid APV CSD length: %s", i118 >= 17);
                                                            byte b5 = bArr9[0];
                                                            z1a.o(b5, "Invalid APV CSD version: %s", b5 == 1);
                                                            int i119 = bArr9[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                            int i120 = bArr9[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                            int i121 = bArr9[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                            String str17 = nik.a;
                                                            Locale locale2 = Locale.US;
                                                            StringBuilder s2 = lnb.s(i119, i120, "apv1.apvf", ".apvl", ".apvb");
                                                            s2.append(i121);
                                                            str11 = s2.toString();
                                                            list = hv9.z(bArr9);
                                                            j9e j9eVar3 = new j9e(bArr9);
                                                            b = 3;
                                                            nm2 nm2Var2 = new nm2(bArr9, i118, 3, (byte) 0);
                                                            i9 = 8;
                                                            nm2Var2.q(j9eVar3.b * 8);
                                                            nm2Var2.u(1);
                                                            int i122 = nm2Var2.i(8);
                                                            int i123 = 0;
                                                            int i124 = -1;
                                                            int i125 = -1;
                                                            int i126 = -1;
                                                            int i127 = -1;
                                                            int i128 = -1;
                                                            while (i123 < i122) {
                                                                nm2Var2.u(1);
                                                                int i129 = nm2Var2.i(8);
                                                                int i130 = i128;
                                                                int i131 = i127;
                                                                int i132 = i126;
                                                                int i133 = i125;
                                                                int i134 = 0;
                                                                while (i134 < i129) {
                                                                    nm2Var2.t(6);
                                                                    boolean h7 = nm2Var2.h();
                                                                    nm2Var2.s();
                                                                    nm2Var2.u(11);
                                                                    nm2Var2.t(4);
                                                                    i132 = nm2Var2.i(4) + 8;
                                                                    nm2Var2.u(1);
                                                                    if (h7) {
                                                                        int i135 = nm2Var2.i(8);
                                                                        int i136 = nm2Var2.i(8);
                                                                        nm2Var2.u(1);
                                                                        boolean h8 = nm2Var2.h();
                                                                        int f5 = w13.f(i135);
                                                                        i131 = h8 ? 1 : 2;
                                                                        i133 = w13.g(i136);
                                                                        i130 = f5;
                                                                    }
                                                                    i134++;
                                                                    i124 = i132;
                                                                }
                                                                i123++;
                                                                i125 = i133;
                                                                i126 = i132;
                                                                i127 = i131;
                                                                i128 = i130;
                                                            }
                                                            i10 = i95;
                                                            str12 = "video/apv";
                                                            i37 = i124;
                                                            i39 = i125;
                                                            i8 = i126;
                                                            i7 = i127;
                                                            i41 = i128;
                                                        } else {
                                                            i9 = 8;
                                                            b = 3;
                                                            if (m5 == 1668246642) {
                                                                i11 = i90;
                                                                if (i41 == -1 && i11 == -1) {
                                                                    int m9 = j9eVar2.m();
                                                                    if (m9 == 1852009592 || m9 == 1852009571) {
                                                                        int H7 = j9eVar2.H();
                                                                        int H8 = j9eVar2.H();
                                                                        j9eVar2.O(2);
                                                                        boolean z9 = m4 == 19 && (j9eVar2.A() & 128) != 0;
                                                                        int f6 = w13.f(H7);
                                                                        int i137 = z9 ? 1 : 2;
                                                                        i39 = w13.g(H8);
                                                                        i41 = f6;
                                                                        i7 = i137;
                                                                        str12 = str5;
                                                                        i10 = i95;
                                                                        i37 = i94;
                                                                        i36 = i48 + m4;
                                                                        i38 = i10;
                                                                        i33 = i9;
                                                                        b2 = b;
                                                                        m2 = i49;
                                                                        m3 = i6;
                                                                        str9 = str4;
                                                                        i46 = i8;
                                                                        i40 = i7;
                                                                        g7hVar2 = g7hVar;
                                                                        str10 = null;
                                                                    } else {
                                                                        tgj.d0("Unsupported color type: ".concat(ffb.h(m9)));
                                                                    }
                                                                }
                                                            } else {
                                                                i11 = i90;
                                                            }
                                                            i10 = i95;
                                                            i39 = i11;
                                                        }
                                                    }
                                                    str12 = str5;
                                                }
                                                i39 = i90;
                                                i37 = i94;
                                                i9 = 8;
                                                b = 3;
                                                i36 = i48 + m4;
                                                i38 = i10;
                                                i33 = i9;
                                                b2 = b;
                                                m2 = i49;
                                                m3 = i6;
                                                str9 = str4;
                                                i46 = i8;
                                                i40 = i7;
                                                g7hVar2 = g7hVar;
                                                str10 = null;
                                            }
                                            i36 = i48 + m4;
                                            i38 = i10;
                                            i33 = i9;
                                            b2 = b;
                                            m2 = i49;
                                            m3 = i6;
                                            str9 = str4;
                                            i46 = i8;
                                            i40 = i7;
                                            g7hVar2 = g7hVar;
                                            str10 = null;
                                        }
                                        str12 = str5;
                                        i37 = i94;
                                        i36 = i48 + m4;
                                        i38 = i10;
                                        i33 = i9;
                                        b2 = b;
                                        m2 = i49;
                                        m3 = i6;
                                        str9 = str4;
                                        i46 = i8;
                                        i40 = i7;
                                        g7hVar2 = g7hVar;
                                        str10 = null;
                                    }
                                    i9 = 8;
                                    i36 = i48 + m4;
                                    i38 = i10;
                                    i33 = i9;
                                    b2 = b;
                                    m2 = i49;
                                    m3 = i6;
                                    str9 = str4;
                                    i46 = i8;
                                    i40 = i7;
                                    g7hVar2 = g7hVar;
                                    str10 = null;
                                }
                            }
                            str4 = str9;
                            i36 = i48 + m4;
                            i38 = i10;
                            i33 = i9;
                            b2 = b;
                            m2 = i49;
                            m3 = i6;
                            str9 = str4;
                            i46 = i8;
                            i40 = i7;
                            g7hVar2 = g7hVar;
                            str10 = null;
                        }
                    }
                    i10 = i38;
                    i36 = i48 + m4;
                    i38 = i10;
                    i33 = i9;
                    b2 = b;
                    m2 = i49;
                    m3 = i6;
                    str9 = str4;
                    i46 = i8;
                    i40 = i7;
                    g7hVar2 = g7hVar;
                    str10 = null;
                }
                int i138 = i37;
                int i139 = i38;
                i5 = m2;
                String str18 = str12;
                int i140 = i46;
                int i141 = i40;
                z2 = false;
                int i142 = i39;
                if (f79Var != null) {
                    str2 = f79Var.b;
                    str3 = "video/dolby-vision";
                } else {
                    str2 = str11;
                    str3 = str18;
                }
                if (str3 == null) {
                    str8 = str;
                } else {
                    qm8 qm8Var = new qm8();
                    qm8Var.a = Integer.toString(i3);
                    qm8Var.n = sjc.p(str3);
                    qm8Var.j = str2;
                    qm8Var.u = H;
                    qm8Var.v = H2;
                    qm8Var.w = i45;
                    qm8Var.x = i44;
                    qm8Var.A = f;
                    qm8Var.z = i34;
                    qm8Var.B = bArr2;
                    qm8Var.C = i139;
                    qm8Var.q = list;
                    qm8Var.p = i43;
                    qm8Var.E = i42;
                    qm8Var.r = drmInitData4;
                    str8 = str;
                    qm8Var.d = str8;
                    qm8Var.D = new w13(i41, i141, i142, i140, i138, byteBuffer != null ? byteBuffer.array() : null);
                    h12 h12Var2 = h12Var;
                    if (h12Var2 != null) {
                        qm8Var.h = jaa.M(h12Var2.a);
                        qm8Var.i = jaa.M(h12Var2.b);
                    } else {
                        vl0 vl0Var2 = vl0Var;
                        if (vl0Var2 != null) {
                            qm8Var.h = jaa.M(vl0Var2.c);
                            qm8Var.i = jaa.M(vl0Var2.d);
                        }
                    }
                    j12Var.e = new b(qm8Var);
                }
            } else {
                if (m3 == 1836069985 || m3 == 1701733217 || m3 == 1633889587 || m3 == 1700998451 || m3 == 1633889588 || m3 == 1835823201 || m3 == 1685353315 || m3 == 1685353317 || m3 == 1685353320 || m3 == 1685353324 || m3 == 1685353336 || m3 == 1935764850 || m3 == 1935767394 || m3 == 1819304813 || m3 == 1936684916 || m3 == 1953984371 || m3 == 778924082 || m3 == 778924083 || m3 == 1835557169 || m3 == 1835560241 || m3 == 1634492771 || m3 == 1634492791 || m3 == 1970037111 || m3 == 1332770163 || m3 == 1716281667 || m3 == 1767992678 || m3 == 1768973165 || m3 == 1718641517) {
                    i2 = i32;
                    j9eVar2 = j9eVar;
                    m2 = m2;
                    b(j9eVar2, m3, i2, m2, k12Var2.a, str8, z, drmInitData, j12Var, i31);
                    str8 = str;
                } else if (m3 == 1414810956 || m3 == 1954034535 || m3 == 2004251764 || m3 == 1937010800 || m3 == 1664495672 || m3 == 1836070003) {
                    j9eVar2.N(i32 + 16);
                    String str19 = MimeTypes.APPLICATION_TTML;
                    long j = Long.MAX_VALUE;
                    if (m3 != 1414810956) {
                        if (m3 == 1954034535) {
                            int i143 = m2 - 16;
                            byte[] bArr11 = new byte[i143];
                            j9eVar2.k(bArr11, 0, i143);
                            vvfVar = hv9.z(bArr11);
                            str19 = MimeTypes.APPLICATION_TX3G;
                            i2 = i32;
                            i29 = m2;
                        } else if (m3 == 2004251764) {
                            str19 = MimeTypes.APPLICATION_MP4VTT;
                        } else if (m3 == 1937010800) {
                            j = 0;
                        } else if (m3 == 1664495672) {
                            j12Var.c = 1;
                            str19 = MimeTypes.APPLICATION_MP4CEA608;
                        } else {
                            if (m3 != 1836070003) {
                                zzl.s();
                                return null;
                            }
                            int i144 = j9eVar2.b;
                            j9eVar2.O(4);
                            if (j9eVar2.m() == 1702061171) {
                                byte[] bArr12 = c(i144, j9eVar2).b;
                                if (bArr12 == null || bArr12.length != 64) {
                                    i2 = i32;
                                    i29 = m2;
                                    j9eVar2 = j9eVar;
                                    i3 = i30;
                                    i4 = m;
                                    i5 = i29;
                                    i = i31;
                                    z2 = false;
                                } else {
                                    int i145 = k12Var2.d;
                                    int i146 = k12Var2.e;
                                    z1a.E(bArr12.length == 64);
                                    ArrayList arrayList = new ArrayList(16);
                                    int i147 = 0;
                                    while (i147 < bArr12.length - 3) {
                                        byte[] bArr13 = bArr12;
                                        int B = jaa.B(bArr12[i147], bArr12[i147 + 1], bArr12[i147 + 2], bArr13[i147 + 3]);
                                        int i148 = (B >> 16) & 255;
                                        int i149 = ((B >> 8) & 255) - 128;
                                        int i150 = (B & 255) - 128;
                                        arrayList.add(String.format("%06x", Integer.valueOf(nik.j(vxd.c(i150, 17790, 10000, i148), 0, 255) | (nik.j((i148 - ((i150 * 3455) / 10000)) - ((i149 * 7169) / 10000), 0, 255) << 8) | (nik.j(vxd.c(i149, 14075, 10000, i148), 0, 255) << 16))));
                                        i147 += 4;
                                        bArr12 = bArr13;
                                        i32 = i32;
                                        m2 = m2;
                                    }
                                    i2 = i32;
                                    i29 = m2;
                                    StringBuilder s3 = lnb.s(i145, i146, "size: ", "x", "\npalette: ");
                                    s3.append(new ih2(", ").e(arrayList));
                                    s3.append("\n");
                                    String sb = s3.toString();
                                    String str20 = nik.a;
                                    vvfVar = hv9.z(sb.getBytes(StandardCharsets.UTF_8));
                                    str7 = MimeTypes.APPLICATION_VOBSUB;
                                }
                            } else {
                                i2 = i32;
                                i29 = m2;
                                str7 = null;
                                vvfVar = null;
                            }
                            str19 = str7;
                        }
                        long j2 = j;
                        if (str19 != null) {
                            qm8 qm8Var2 = new qm8();
                            qm8Var2.a = Integer.toString(i30);
                            qm8Var2.n = sjc.p(str19);
                            qm8Var2.d = str8;
                            qm8Var2.s = j2;
                            qm8Var2.q = vvfVar;
                            j12Var.e = new b(qm8Var2);
                        }
                        j9eVar2 = j9eVar;
                        i3 = i30;
                        i4 = m;
                        i5 = i29;
                        i = i31;
                        z2 = false;
                    }
                    i2 = i32;
                    i29 = m2;
                    vvfVar = null;
                    long j22 = j;
                    if (str19 != null) {
                    }
                    j9eVar2 = j9eVar;
                    i3 = i30;
                    i4 = m;
                    i5 = i29;
                    i = i31;
                    z2 = false;
                } else {
                    if (m3 == 1835365492) {
                        j9eVar2.N(i32 + 16);
                        if (m3 == 1835365492) {
                            j9eVar2.v();
                            String v = j9eVar2.v();
                            if (v != null) {
                                qm8 qm8Var3 = new qm8();
                                qm8Var3.a = Integer.toString(i30);
                                qm8Var3.n = sjc.p(v);
                                j12Var.e = new b(qm8Var3);
                            }
                        }
                    } else if (m3 == 1667329389) {
                        qm8 qm8Var4 = new qm8();
                        qm8Var4.a = Integer.toString(i30);
                        qm8Var4.n = sjc.p(MimeTypes.APPLICATION_CAMERA_MOTION);
                        j12Var.e = new b(qm8Var4);
                    }
                    i2 = i32;
                }
                i5 = m2;
                i = i31;
                i3 = i30;
                i4 = m;
                z2 = false;
            }
            j9eVar2.N(i2 + i5);
            k12Var2 = k12Var;
            z3 = z2;
            i30 = i3;
            m = i4;
            i31 = i + 1;
        }
        return j12Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:387:0x00e8, code lost:
    
        if (r23 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x00ea, code lost:
    
        r23 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x06fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList j(axc axcVar, hv8 hv8Var, long j, DrmInitData drmInitData, boolean z, boolean z2, xs8 xs8Var, boolean z3) {
        long j2;
        long j3;
        long j4;
        ArrayList arrayList;
        int i;
        long j5;
        long j6;
        long b0;
        int i2;
        int i3;
        int i4;
        String str;
        bxc B;
        int i5;
        long[] jArr;
        long[] jArr2;
        b bVar;
        b bVar2;
        xs8 xs8Var2;
        jsj jsjVar;
        axc A;
        Pair create;
        int i6;
        long m;
        i12 xl0Var;
        boolean z4;
        int i7;
        int i8;
        int i9;
        boolean z5;
        ArrayList arrayList2;
        int i10;
        int i11;
        long[] jArr3;
        int[] iArr;
        long[] jArr4;
        int[] iArr2;
        int i12;
        int i13;
        boolean z6;
        int i14;
        int i15;
        int i16;
        long j7;
        long j8;
        long[] jArr5;
        int[] iArr3;
        int[] iArr4;
        int i17;
        long[] jArr6;
        int i18;
        int i19;
        long j9;
        long[] jArr7;
        ArrayList arrayList3;
        long j10;
        int i20;
        boolean z7;
        int i21;
        boolean z8;
        xsj xsjVar;
        ArrayList arrayList4;
        boolean z9;
        int i22;
        ArrayList arrayList5;
        int i23;
        xsj xsjVar2;
        long b02;
        axc axcVar2 = axcVar;
        ArrayList arrayList6 = new ArrayList();
        int i24 = 0;
        for (ArrayList arrayList7 = axcVar2.i; i24 < arrayList7.size(); arrayList7 = arrayList) {
            axc axcVar3 = (axc) arrayList7.get(i24);
            if (axcVar3.b != 1953653099) {
                arrayList = arrayList7;
                arrayList4 = arrayList6;
                i5 = i24;
            } else {
                bxc B2 = axcVar2.B(1836476516);
                B2.getClass();
                axc A2 = axcVar3.A(1835297121);
                A2.getClass();
                bxc B3 = A2.B(1751411826);
                B3.getClass();
                j9e j9eVar = B3.g;
                j9eVar.N(16);
                int m2 = j9eVar.m();
                int i25 = m2 == 1936684398 ? 1 : m2 == 1986618469 ? 2 : (m2 == 1952807028 || m2 == 1935832172 || m2 == 1937072756 || m2 == 1668047728 || m2 == 1937072752) ? 3 : m2 == 1835365473 ? 5 : -1;
                int i26 = 1;
                if (i25 == -1) {
                    arrayList = arrayList7;
                    i5 = i24;
                    jsjVar = null;
                    j2 = 0;
                    xs8Var2 = xs8Var;
                } else {
                    j2 = 0;
                    bxc B4 = axcVar3.B(1953196132);
                    B4.getClass();
                    j9e j9eVar2 = B4.g;
                    j9eVar2.N(8);
                    int e = e(j9eVar2.m());
                    j9eVar2.O(e != 0 ? 16 : 8);
                    int m3 = j9eVar2.m();
                    j9eVar2.O(4);
                    int i27 = j9eVar2.b;
                    int i28 = e == 0 ? 4 : 8;
                    int i29 = 0;
                    while (true) {
                        j3 = C.TIME_UNSET;
                        if (i29 >= i28) {
                            j9eVar2.O(i28);
                            break;
                        }
                        if (j9eVar2.a[i27 + i29] != -1) {
                            j4 = e == 0 ? j9eVar2.C() : j9eVar2.G();
                        } else {
                            i29++;
                        }
                    }
                    j9eVar2.O(10);
                    int H = j9eVar2.H();
                    j9eVar2.O(4);
                    int m4 = j9eVar2.m();
                    int m5 = j9eVar2.m();
                    j9eVar2.O(4);
                    int m6 = j9eVar2.m();
                    int m7 = j9eVar2.m();
                    if (m4 == 0 && m5 == 65536) {
                        arrayList = arrayList7;
                        if ((m6 == -65536 || m6 == 65536) && m7 == 0) {
                            i = 90;
                            j9eVar2.O(16);
                            short x = j9eVar2.x();
                            j9eVar2.O(2);
                            short x2 = j9eVar2.x();
                            k12 k12Var = new k12();
                            k12Var.a = m3;
                            k12Var.b = H;
                            k12Var.c = i;
                            k12Var.d = x;
                            k12Var.e = x2;
                            j5 = j != C.TIME_UNSET ? j4 : j;
                            long j11 = g(B2.g).c;
                            if (j5 != C.TIME_UNSET) {
                                j6 = j11;
                                b0 = -9223372036854775807L;
                            } else {
                                String str2 = nik.a;
                                j6 = j11;
                                b0 = nik.b0(j5, 1000000L, j6, RoundingMode.DOWN);
                            }
                            axc A3 = A2.A(1835626086);
                            A3.getClass();
                            axc A4 = A3.A(1937007212);
                            A4.getClass();
                            bxc B5 = A2.B(1835296868);
                            B5.getClass();
                            j9e j9eVar3 = B5.g;
                            j9eVar3.N(8);
                            int e2 = e(j9eVar3.m());
                            j9eVar3.O(e2 != 0 ? 8 : 16);
                            long C = j9eVar3.C();
                            int i30 = j9eVar3.b;
                            i2 = e2 != 0 ? 4 : 8;
                            i3 = 0;
                            while (true) {
                                if (i3 < i2) {
                                    j9eVar3.O(i2);
                                    break;
                                }
                                if (j9eVar3.a[i30 + i3] != -1) {
                                    long C2 = e2 == 0 ? j9eVar3.C() : j9eVar3.G();
                                    if (C2 != 0) {
                                        String str3 = nik.a;
                                        j3 = nik.b0(C2, 1000000L, C, RoundingMode.DOWN);
                                    }
                                } else {
                                    i3++;
                                }
                            }
                            long j12 = j3;
                            int H2 = j9eVar3.H();
                            char[] cArr = {(char) (((H2 >> 10) & 31) + 96), (char) (((H2 >> 5) & 31) + 96), (char) ((H2 & 31) + 96)};
                            for (i4 = 0; i4 < 3; i4++) {
                                char c = cArr[i4];
                                if (c < 'a' || c > 'z') {
                                    str = null;
                                    break;
                                }
                            }
                            str = new String(cArr);
                            B = A4.B(1937011556);
                            if (B != null) {
                                tgj.d0("Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                                xs8Var2 = xs8Var;
                                i5 = i24;
                            } else {
                                j12 i31 = i(B.g, k12Var, str, drmInitData, z2);
                                if (z || (A = axcVar3.A(1701082227)) == null) {
                                    i5 = i24;
                                } else {
                                    bxc B6 = A.B(1701606260);
                                    if (B6 == null) {
                                        i5 = i24;
                                        create = null;
                                    } else {
                                        j9e j9eVar4 = B6.g;
                                        j9eVar4.N(8);
                                        int e3 = e(j9eVar4.m());
                                        int E = j9eVar4.E();
                                        long[] jArr8 = new long[E];
                                        long[] jArr9 = new long[E];
                                        int i32 = 0;
                                        while (i32 < E) {
                                            int i33 = i26;
                                            jArr8[i32] = e3 == i33 ? j9eVar4.G() : j9eVar4.C();
                                            if (e3 == i33) {
                                                m = j9eVar4.u();
                                                i6 = i24;
                                            } else {
                                                i6 = i24;
                                                m = j9eVar4.m();
                                            }
                                            jArr9[i32] = m;
                                            if (j9eVar4.x() != 1) {
                                                a70.p("Unsupported media rate.");
                                                return null;
                                            }
                                            j9eVar4.O(2);
                                            i32++;
                                            i24 = i6;
                                            i26 = 1;
                                        }
                                        i5 = i24;
                                        create = Pair.create(jArr8, jArr9);
                                    }
                                    if (create != null) {
                                        long[] jArr10 = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        jArr = jArr10;
                                        bVar = (b) i31.e;
                                        if (bVar != null) {
                                            xs8Var2 = xs8Var;
                                        } else {
                                            int i34 = k12Var.b;
                                            if (i34 != 0) {
                                                zwc zwcVar = new zwc(i34);
                                                qm8 a2 = bVar.a();
                                                ric ricVar = ((b) i31.e).l;
                                                a2.k = ricVar != null ? ricVar.a(zwcVar) : new ric(zwcVar);
                                                bVar2 = new b(a2);
                                            } else {
                                                bVar2 = bVar;
                                            }
                                            xs8Var2 = xs8Var;
                                            jsjVar = new jsj(k12Var.a, i25, C, j6, b0, j12, bVar2, i31.c, (lsj[]) i31.d, i31.b, jArr, jArr2);
                                        }
                                    }
                                }
                                jArr = null;
                                jArr2 = null;
                                bVar = (b) i31.e;
                                if (bVar != null) {
                                }
                            }
                            jsjVar = null;
                        }
                    } else {
                        arrayList = arrayList7;
                    }
                    i = (m4 == 0 && m5 == -65536 && (m6 == 65536 || m6 == -65536) && m7 == 0) ? 270 : ((m4 == -65536 || m4 == 65536) && m5 == 0 && m6 == 0 && m7 == -65536) ? 180 : 0;
                    j9eVar2.O(16);
                    short x3 = j9eVar2.x();
                    j9eVar2.O(2);
                    short x22 = j9eVar2.x();
                    k12 k12Var2 = new k12();
                    k12Var2.a = m3;
                    k12Var2.b = H;
                    k12Var2.c = i;
                    k12Var2.d = x3;
                    k12Var2.e = x22;
                    if (j != C.TIME_UNSET) {
                    }
                    long j112 = g(B2.g).c;
                    if (j5 != C.TIME_UNSET) {
                    }
                    axc A32 = A2.A(1835626086);
                    A32.getClass();
                    axc A42 = A32.A(1937007212);
                    A42.getClass();
                    bxc B52 = A2.B(1835296868);
                    B52.getClass();
                    j9e j9eVar32 = B52.g;
                    j9eVar32.N(8);
                    int e22 = e(j9eVar32.m());
                    j9eVar32.O(e22 != 0 ? 8 : 16);
                    long C3 = j9eVar32.C();
                    int i302 = j9eVar32.b;
                    if (e22 != 0) {
                    }
                    i3 = 0;
                    while (true) {
                        if (i3 < i2) {
                        }
                        i3++;
                    }
                    long j122 = j3;
                    int H22 = j9eVar32.H();
                    char[] cArr2 = {(char) (((H22 >> 10) & 31) + 96), (char) (((H22 >> 5) & 31) + 96), (char) ((H22 & 31) + 96)};
                    while (i4 < 3) {
                    }
                    str = new String(cArr2);
                    B = A42.B(1937011556);
                    if (B != null) {
                    }
                    jsjVar = null;
                }
                jsj jsjVar2 = (jsj) xs8Var2.apply(jsjVar);
                if (jsjVar2 == null) {
                    arrayList4 = arrayList6;
                } else {
                    b bVar3 = jsjVar2.g;
                    axc A5 = axcVar3.A(1835297121);
                    A5.getClass();
                    axc A6 = A5.A(1835626086);
                    A6.getClass();
                    axc A7 = A6.A(1937007212);
                    A7.getClass();
                    bxc B7 = A7.B(1937011578);
                    if (B7 != null) {
                        xl0Var = new und(B7, bVar3);
                    } else {
                        bxc B8 = A7.B(1937013298);
                        if (B8 == null) {
                            throw s9e.a(null, "Track has no sample table size information");
                        }
                        xl0Var = new xl0(B8);
                    }
                    int sampleCount = xl0Var.getSampleCount();
                    if (sampleCount == 0) {
                        arrayList4 = arrayList6;
                        xsjVar = new xsj(jsjVar2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (jsjVar2.b == 2) {
                            long j13 = jsjVar2.f;
                            if (j13 > j2) {
                                qm8 a3 = bVar3.a();
                                a3.y = sampleCount / (j13 / 1000000.0f);
                                jsjVar2 = jsjVar2.a(new b(a3));
                            }
                        }
                        b bVar4 = jsjVar2.g;
                        bxc B9 = A7.B(1937007471);
                        if (B9 == null) {
                            B9 = A7.B(1668232756);
                            B9.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        j9e j9eVar5 = B9.g;
                        bxc B10 = A7.B(1937011555);
                        B10.getClass();
                        j9e j9eVar6 = B10.g;
                        bxc B11 = A7.B(1937011827);
                        B11.getClass();
                        j9e j9eVar7 = B11.g;
                        bxc B12 = A7.B(1937011571);
                        j9e j9eVar8 = B12 != null ? B12.g : null;
                        bxc B13 = A7.B(1668576371);
                        j9e j9eVar9 = B13 != null ? B13.g : null;
                        ul0 ul0Var = new ul0(j9eVar6, j9eVar5, z4);
                        j9eVar7.N(12);
                        int E2 = j9eVar7.E() - 1;
                        int E3 = j9eVar7.E();
                        int E4 = j9eVar7.E();
                        if (j9eVar9 != null) {
                            j9eVar9.N(12);
                            i7 = j9eVar9.E();
                        } else {
                            i7 = 0;
                        }
                        if (j9eVar8 != null) {
                            j9eVar8.N(12);
                            i8 = j9eVar8.E();
                            if (i8 > 0) {
                                i9 = j9eVar8.E() - 1;
                                int a4 = xl0Var.a();
                                j9e j9eVar10 = j9eVar9;
                                String str4 = bVar4.o;
                                z5 = a4 == -1 && (MimeTypes.AUDIO_RAW.equals(str4) || MimeTypes.AUDIO_MLAW.equals(str4) || MimeTypes.AUDIO_ALAW.equals(str4)) && E2 == 0 && i7 == 0 && i8 == 0;
                                ArrayList arrayList8 = new ArrayList();
                                boolean z10 = j9eVar8 != null;
                                if (z5) {
                                    long[] jArr11 = z3 ? new long[0] : new long[sampleCount];
                                    int[] iArr5 = z3 ? new int[0] : new int[sampleCount];
                                    i12 i12Var = xl0Var;
                                    long[] jArr12 = z3 ? new long[0] : new long[sampleCount];
                                    int i35 = i8;
                                    int[] iArr6 = z3 ? new int[0] : new int[sampleCount];
                                    arrayList2 = arrayList6;
                                    int i36 = i7;
                                    int i37 = i9;
                                    int i38 = i35;
                                    long j14 = j2;
                                    long j15 = j14;
                                    long j16 = j15;
                                    int i39 = 0;
                                    int i40 = 0;
                                    int i41 = 0;
                                    j9e j9eVar11 = j9eVar8;
                                    int i42 = 0;
                                    int i43 = 0;
                                    while (true) {
                                        if (i42 >= sampleCount) {
                                            i10 = E2;
                                            i11 = E3;
                                            jArr3 = jArr11;
                                            iArr = iArr5;
                                            jArr4 = jArr12;
                                            iArr2 = iArr6;
                                            i12 = i40;
                                            i13 = sampleCount;
                                            break;
                                        }
                                        boolean z11 = true;
                                        while (i40 == 0) {
                                            z11 = ul0Var.a();
                                            if (!z11) {
                                                break;
                                            }
                                            int i44 = E2;
                                            long j17 = ul0Var.e;
                                            i40 = ul0Var.d;
                                            j16 = j17;
                                            E2 = i44;
                                            E3 = E3;
                                            sampleCount = sampleCount;
                                        }
                                        int i45 = sampleCount;
                                        i10 = E2;
                                        i11 = E3;
                                        if (z11) {
                                            if (j9eVar10 != null) {
                                                while (i41 == 0 && i36 > 0) {
                                                    i41 = j9eVar10.E();
                                                    i43 = j9eVar10.m();
                                                    i36--;
                                                }
                                                i41--;
                                            }
                                            int readNextSampleSize = i12Var.readNextSampleSize();
                                            long j18 = readNextSampleSize;
                                            j15 += j18;
                                            if (readNextSampleSize > i39) {
                                                i39 = readNextSampleSize;
                                            }
                                            if (z3) {
                                                i17 = i39;
                                                jArr6 = jArr11;
                                            } else {
                                                jArr11[i42] = j16;
                                                iArr5[i42] = readNextSampleSize;
                                                i17 = i39;
                                                jArr6 = jArr11;
                                                jArr12[i42] = j14 + i43;
                                                iArr6[i42] = j9eVar11 == null ? 1 : 0;
                                                if (i42 == i37) {
                                                    iArr6[i42] = 1;
                                                    arrayList8.add(Integer.valueOf(i42));
                                                }
                                            }
                                            if (j9eVar11 != null && i42 == i37 && i38 - 1 > 0) {
                                                i37 = j9eVar11.E() - 1;
                                            }
                                            j14 += E4;
                                            int i46 = i11 - 1;
                                            if (i46 != 0 || i10 <= 0) {
                                                i18 = E4;
                                                i19 = i10;
                                            } else {
                                                i46 = j9eVar7.E();
                                                i18 = j9eVar7.m();
                                                i19 = i10 - 1;
                                            }
                                            j16 += j18;
                                            i40--;
                                            i42++;
                                            E3 = i46;
                                            E2 = i19;
                                            i39 = i17;
                                            E4 = i18;
                                            jArr11 = jArr6;
                                            sampleCount = i45;
                                        } else {
                                            tgj.d0("Unexpected end of chunk data");
                                            if (z3) {
                                                iArr = iArr5;
                                                jArr4 = jArr12;
                                                i13 = i42;
                                                i12 = i40;
                                                jArr3 = jArr11;
                                                iArr2 = iArr6;
                                            } else {
                                                long[] copyOf = Arrays.copyOf(jArr11, i42);
                                                int[] copyOf2 = Arrays.copyOf(iArr5, i42);
                                                long[] copyOf3 = Arrays.copyOf(jArr12, i42);
                                                int[] copyOf4 = Arrays.copyOf(iArr6, i42);
                                                iArr = copyOf2;
                                                jArr4 = copyOf3;
                                                i13 = i42;
                                                i12 = i40;
                                                jArr3 = copyOf;
                                                iArr2 = copyOf4;
                                            }
                                        }
                                    }
                                    long j19 = j14 + i43;
                                    if (j9eVar10 != null) {
                                        while (i36 > 0) {
                                            if (j9eVar10.E() != 0) {
                                                z6 = false;
                                                break;
                                            }
                                            j9eVar10.m();
                                            i36--;
                                        }
                                    }
                                    z6 = true;
                                    if (i38 == 0 && i11 == 0 && i12 == 0 && i10 == 0 && i41 == 0 && z6) {
                                        i14 = i39;
                                    } else {
                                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                        i14 = i39;
                                        me4.q(sb, jsjVar2.a, ": remainingSynchronizationSamples ", i38, ", remainingSamplesAtTimestampDelta ");
                                        me4.q(sb, i11, ", remainingSamplesInChunk ", i12, ", remainingTimestampDeltaChanges ");
                                        sb.append(i10);
                                        sb.append(", remainingSamplesAtTimestampOffset ");
                                        sb.append(i41);
                                        sb.append(!z6 ? ", ctts invalid" : "");
                                        tgj.d0(sb.toString());
                                    }
                                    i15 = i13;
                                    i16 = i14;
                                    j7 = j15;
                                    j8 = j19;
                                    jArr5 = jArr3;
                                    iArr3 = iArr;
                                    iArr4 = iArr2;
                                } else {
                                    int i47 = ul0Var.b;
                                    long[] jArr13 = new long[i47];
                                    int[] iArr7 = new int[i47];
                                    while (ul0Var.a()) {
                                        int i48 = ul0Var.c;
                                        jArr13[i48] = ul0Var.e;
                                        iArr7[i48] = ul0Var.d;
                                    }
                                    long j20 = E4;
                                    int i49 = 8192 / a4;
                                    int i50 = 0;
                                    for (int i51 = 0; i51 < i47; i51++) {
                                        i50 += nik.g(iArr7[i51], i49);
                                    }
                                    long[] jArr14 = new long[i50];
                                    int[] iArr8 = new int[i50];
                                    jArr4 = new long[i50];
                                    int[] iArr9 = new int[i50];
                                    int i52 = 0;
                                    int i53 = 0;
                                    int i54 = 0;
                                    int i55 = 0;
                                    int i56 = 0;
                                    while (i52 < i47) {
                                        int i57 = iArr7[i52];
                                        long j21 = jArr13[i52];
                                        int i58 = i56;
                                        int i59 = i52;
                                        int i60 = i55;
                                        int i61 = i58;
                                        int i62 = i47;
                                        int i63 = i57;
                                        while (i63 > 0) {
                                            int min = Math.min(i49, i63);
                                            jArr14[i61] = j21;
                                            int i64 = i63;
                                            int i65 = a4 * min;
                                            iArr8[i61] = i65;
                                            int i66 = i54 + i65;
                                            i60 = Math.max(i60, i65);
                                            jArr4[i61] = i53 * j20;
                                            iArr9[i61] = 1;
                                            j21 += iArr8[i61];
                                            i53 += min;
                                            i61++;
                                            iArr7 = iArr7;
                                            i63 = i64 - min;
                                            i54 = i66;
                                        }
                                        int[] iArr10 = iArr7;
                                        int i67 = i59 + 1;
                                        i56 = i61;
                                        i55 = i60;
                                        i52 = i67;
                                        iArr7 = iArr10;
                                        i47 = i62;
                                    }
                                    long j22 = j20 * i53;
                                    j7 = i54;
                                    if (z3) {
                                        jArr14 = new long[0];
                                    }
                                    if (z3) {
                                        iArr8 = new int[0];
                                    }
                                    if (z3) {
                                        jArr4 = new long[0];
                                    }
                                    arrayList2 = arrayList6;
                                    i15 = i50;
                                    i16 = i55;
                                    iArr4 = z3 ? new int[0] : iArr9;
                                    j8 = j22;
                                    jArr5 = jArr14;
                                    iArr3 = iArr8;
                                }
                                j9 = jsjVar2.f;
                                if (j9 > j2) {
                                    long b03 = nik.b0(j7 * 8, 1000000L, j9, RoundingMode.HALF_DOWN);
                                    if (b03 > j2 && b03 < 2147483647L) {
                                        qm8 a5 = bVar4.a();
                                        a5.h = (int) b03;
                                        jsjVar2 = jsjVar2.a(new b(a5));
                                    }
                                }
                                int i68 = jsjVar2.b;
                                long j23 = jsjVar2.c;
                                b bVar5 = jsjVar2.g;
                                long[] jArr15 = jsjVar2.j;
                                jArr7 = jsjVar2.i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long b04 = nik.b0(j8, 1000000L, j23, roundingMode);
                                int[] O = jaa.O(arrayList8);
                                if (jArr7 != null) {
                                    if (!z3) {
                                        nik.a0(jArr4, j23);
                                    }
                                    xsjVar2 = new xsj(jsjVar2, jArr5, iArr3, i16, jArr4, iArr4, O, z10, b04, i15);
                                } else {
                                    long[] jArr16 = jArr4;
                                    if (z3) {
                                        jArr15.getClass();
                                        if (jArr7.length == 1 && jArr7[0] == j2) {
                                            b02 = nik.b0(j8 - jArr15[0], 1000000L, jsjVar2.c, roundingMode);
                                        } else {
                                            long j24 = j2;
                                            for (int i69 = 0; i69 < jArr7.length; i69++) {
                                                if (jArr15[i69] != -1) {
                                                    j24 += jArr7[i69];
                                                }
                                            }
                                            b02 = nik.b0(j24, 1000000L, jsjVar2.d, RoundingMode.DOWN);
                                        }
                                        xsjVar2 = new xsj(jsjVar2, jArr5, iArr3, i16, jArr16, iArr4, O, z10, b02, i15);
                                    } else {
                                        if (jArr7.length == 1 && i68 == 1 && jArr16.length >= 2) {
                                            jArr15.getClass();
                                            long j25 = jArr15[0];
                                            j10 = -1;
                                            long b05 = j25 + nik.b0(jArr7[0], jsjVar2.c, jsjVar2.d, roundingMode);
                                            int length = jArr16.length - 1;
                                            int j26 = nik.j(4, 0, length);
                                            int j27 = nik.j(jArr16.length - 4, 0, length);
                                            if (jArr16[0] > j25 || j25 >= jArr16[j26] || jArr16[j27] >= b05 || b05 > 2 + j8) {
                                                arrayList3 = arrayList8;
                                                int i70 = 1;
                                                if (jArr7.length == 1) {
                                                    if (jArr7[0] == 0) {
                                                        jArr15.getClass();
                                                        long j28 = jArr15[0];
                                                        for (int i71 = 0; i71 < jArr16.length; i71++) {
                                                            jArr16[i71] = nik.b0(jArr16[i71] - j28, 1000000L, jsjVar2.c, RoundingMode.DOWN);
                                                        }
                                                        xsjVar2 = new xsj(jsjVar2, jArr5, iArr3, i16, jArr16, iArr4, O, z10, nik.b0(j8 - j28, 1000000L, jsjVar2.c, RoundingMode.DOWN), i15);
                                                    } else {
                                                        i70 = 1;
                                                    }
                                                }
                                                long[] jArr17 = jArr5;
                                                int[] iArr11 = iArr3;
                                                int[] iArr12 = iArr4;
                                                int i72 = i15;
                                                boolean z12 = i68 != i70;
                                                int[] iArr13 = new int[jArr7.length];
                                                int[] iArr14 = new int[jArr7.length];
                                                jArr15.getClass();
                                                int i73 = 0;
                                                int i74 = 0;
                                                i20 = 0;
                                                boolean z13 = false;
                                                while (i20 < jArr7.length) {
                                                    int[] iArr15 = iArr14;
                                                    long j29 = jArr15[i20];
                                                    if (j29 != j10) {
                                                        i22 = i20;
                                                        boolean z14 = z13;
                                                        long b06 = nik.b0(jArr7[i20], jsjVar2.c, jsjVar2.d, RoundingMode.DOWN) + j29;
                                                        arrayList5 = arrayList3;
                                                        iArr13[i22] = nik.f(jArr16, j29, true);
                                                        int b = nik.b(jArr16, b06, z12);
                                                        z9 = z12;
                                                        int i75 = b - 1;
                                                        int i76 = 0;
                                                        for (int i77 = b; i77 < jArr16.length; i77++) {
                                                            if (jArr16[i77] >= b06) {
                                                                i76++;
                                                                if (i76 > bVar5.q) {
                                                                    break;
                                                                }
                                                            } else {
                                                                i75 = i77;
                                                            }
                                                        }
                                                        iArr15[i22] = i75 + 1;
                                                        int i78 = iArr13[i22];
                                                        while (true) {
                                                            i23 = iArr13[i22];
                                                            if (i23 <= 0 || (iArr12[i23] & 1) != 0) {
                                                                break;
                                                            }
                                                            iArr13[i22] = i23 - 1;
                                                        }
                                                        if (i23 == 0 && (iArr12[0] & 1) == 0) {
                                                            iArr13[i22] = i78;
                                                            while (true) {
                                                                int i79 = iArr13[i22];
                                                                if (i79 >= iArr15[i22] || (iArr12[i79] & 1) != 0) {
                                                                    break;
                                                                }
                                                                iArr13[i22] = i79 + 1;
                                                            }
                                                        }
                                                        int i80 = iArr15[i22];
                                                        int i81 = iArr13[i22];
                                                        int i82 = (i80 - i81) + i73;
                                                        boolean z15 = i74 != i81;
                                                        i74 = i80;
                                                        z13 = z14 | z15;
                                                        i73 = i82;
                                                    } else {
                                                        z9 = z12;
                                                        i22 = i20;
                                                        arrayList5 = arrayList3;
                                                    }
                                                    i20 = i22 + 1;
                                                    iArr14 = iArr15;
                                                    arrayList3 = arrayList5;
                                                    z12 = z9;
                                                }
                                                int[] iArr16 = iArr14;
                                                ArrayList arrayList9 = arrayList3;
                                                z7 = z13 | (i73 == i72);
                                                long[] jArr18 = !z7 ? new long[i73] : jArr17;
                                                int[] iArr17 = !z7 ? new int[i73] : iArr11;
                                                if (z7) {
                                                    i16 = 0;
                                                }
                                                int[] iArr18 = !z7 ? new int[i73] : iArr12;
                                                ArrayList arrayList10 = !z7 ? new ArrayList() : arrayList9;
                                                long[] jArr19 = new long[i73];
                                                i21 = 0;
                                                z8 = false;
                                                int i83 = 0;
                                                int i84 = i16;
                                                long j30 = 0;
                                                while (i21 < jArr7.length) {
                                                    long j31 = jArr15[i21];
                                                    int i85 = iArr13[i21];
                                                    b bVar6 = bVar5;
                                                    int i86 = iArr16[i21];
                                                    long[] jArr20 = jArr19;
                                                    if (z7) {
                                                        int i87 = i86 - i85;
                                                        System.arraycopy(jArr17, i85, jArr18, i83, i87);
                                                        System.arraycopy(iArr11, i85, iArr17, i83, i87);
                                                        System.arraycopy(iArr12, i85, iArr18, i83, i87);
                                                    }
                                                    int i88 = i84;
                                                    while (i85 < i86) {
                                                        int i89 = i85;
                                                        int i90 = i86;
                                                        long j32 = jsjVar2.d;
                                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                        long b07 = nik.b0(j30, 1000000L, j32, roundingMode2);
                                                        long b08 = nik.b0(jArr16[i89] - j31, 1000000L, jsjVar2.c, roundingMode2);
                                                        if (b08 < 0) {
                                                            z8 = true;
                                                        }
                                                        jArr20[i83] = b07 + b08;
                                                        if (z7 && iArr17[i83] > i88) {
                                                            i88 = iArr11[i89];
                                                        }
                                                        if (z7 && !z10 && (iArr18[i83] & 1) != 0) {
                                                            arrayList10.add(Integer.valueOf(i83));
                                                        }
                                                        i83++;
                                                        i85 = i89 + 1;
                                                        i86 = i90;
                                                    }
                                                    j30 += jArr7[i21];
                                                    i21++;
                                                    i84 = i88;
                                                    bVar5 = bVar6;
                                                    jArr19 = jArr20;
                                                }
                                                b bVar7 = bVar5;
                                                long[] jArr21 = jArr19;
                                                long b09 = nik.b0(j30, 1000000L, jsjVar2.d, RoundingMode.DOWN);
                                                if (z8) {
                                                    qm8 a6 = bVar7.a();
                                                    a6.t = true;
                                                    jsjVar2 = jsjVar2.a(new b(a6));
                                                }
                                                xsjVar = new xsj(jsjVar2, jArr18, iArr17, i84, jArr21, iArr18, jaa.O(arrayList10), z10, b09, jArr18.length);
                                                arrayList4 = arrayList2;
                                                arrayList4.add(xsjVar);
                                            } else {
                                                long max = Math.max(j2, j8 - b05);
                                                long b010 = nik.b0(j25 - jArr16[0], bVar5.H, jsjVar2.c, roundingMode);
                                                arrayList3 = arrayList8;
                                                long b011 = nik.b0(max, bVar5.H, jsjVar2.c, roundingMode);
                                                if ((b010 != j2 || b011 != j2) && b010 <= 2147483647L && b011 <= 2147483647L) {
                                                    hv8Var.a = (int) b010;
                                                    hv8Var.b = (int) b011;
                                                    nik.a0(jArr16, j23);
                                                    xsjVar2 = new xsj(jsjVar2, jArr5, iArr3, i16, jArr16, iArr4, O, z10, nik.b0(jArr7[0], 1000000L, jsjVar2.d, roundingMode), i15);
                                                }
                                            }
                                        } else {
                                            arrayList3 = arrayList8;
                                            j10 = -1;
                                        }
                                        int i702 = 1;
                                        if (jArr7.length == 1) {
                                        }
                                        long[] jArr172 = jArr5;
                                        int[] iArr112 = iArr3;
                                        int[] iArr122 = iArr4;
                                        int i722 = i15;
                                        if (i68 != i702) {
                                        }
                                        int[] iArr132 = new int[jArr7.length];
                                        int[] iArr142 = new int[jArr7.length];
                                        jArr15.getClass();
                                        int i732 = 0;
                                        int i742 = 0;
                                        i20 = 0;
                                        boolean z132 = false;
                                        while (i20 < jArr7.length) {
                                        }
                                        int[] iArr162 = iArr142;
                                        ArrayList arrayList92 = arrayList3;
                                        z7 = z132 | (i732 == i722);
                                        if (!z7) {
                                        }
                                        if (!z7) {
                                        }
                                        if (z7) {
                                        }
                                        if (!z7) {
                                        }
                                        if (!z7) {
                                        }
                                        long[] jArr192 = new long[i732];
                                        i21 = 0;
                                        z8 = false;
                                        int i832 = 0;
                                        int i842 = i16;
                                        long j302 = 0;
                                        while (i21 < jArr7.length) {
                                        }
                                        b bVar72 = bVar5;
                                        long[] jArr212 = jArr192;
                                        long b092 = nik.b0(j302, 1000000L, jsjVar2.d, RoundingMode.DOWN);
                                        if (z8) {
                                        }
                                        xsjVar = new xsj(jsjVar2, jArr18, iArr17, i842, jArr212, iArr18, jaa.O(arrayList10), z10, b092, jArr18.length);
                                        arrayList4 = arrayList2;
                                        arrayList4.add(xsjVar);
                                    }
                                }
                                xsjVar = xsjVar2;
                                arrayList4 = arrayList2;
                            } else {
                                j9eVar8 = null;
                            }
                        } else {
                            i8 = 0;
                        }
                        i9 = -1;
                        int a42 = xl0Var.a();
                        j9e j9eVar102 = j9eVar9;
                        String str42 = bVar4.o;
                        if (a42 == -1) {
                        }
                        ArrayList arrayList82 = new ArrayList();
                        if (j9eVar8 != null) {
                        }
                        if (z5) {
                        }
                        j9 = jsjVar2.f;
                        if (j9 > j2) {
                        }
                        int i682 = jsjVar2.b;
                        long j232 = jsjVar2.c;
                        b bVar52 = jsjVar2.g;
                        long[] jArr152 = jsjVar2.j;
                        jArr7 = jsjVar2.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long b042 = nik.b0(j8, 1000000L, j232, roundingMode3);
                        int[] O2 = jaa.O(arrayList82);
                        if (jArr7 != null) {
                        }
                        xsjVar = xsjVar2;
                        arrayList4 = arrayList2;
                    }
                    arrayList4.add(xsjVar);
                }
            }
            i24 = i5 + 1;
            axcVar2 = axcVar;
            arrayList6 = arrayList4;
        }
        return arrayList6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0199, code lost:
    
        r1.N(r10);
        r1.O(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ac, code lost:
    
        r10 = new defpackage.d8a(r0, r9, r1.w(r13 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x027a, code lost:
    
        defpackage.tgj.y("Skipped unknown metadata entry: ".concat(defpackage.ffb.h(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0285, code lost:
    
        r1.N(r15);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0076, code lost:
    
        r0 = defpackage.zq9.a(defpackage.yfa.A(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x007f, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0081, code lost:
    
        r10 = new defpackage.cdj("TCON", r12, defpackage.hv9.z(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x008b, code lost:
    
        defpackage.tgj.d0("Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0090, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00a3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02a5, code lost:
    
        r1.N(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02a8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b8, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01bf, code lost:
    
        if (r0 != 6516084) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c1, code lost:
    
        r0 = r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cc, code lost:
    
        if (r1.m() != 1684108385) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ce, code lost:
    
        r1.O(8);
        r0 = r1.w(r0 - 16);
        r10 = new defpackage.u33(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e4, code lost:
    
        defpackage.tgj.d0("Failed to parse comment attribute: ".concat(defpackage.ffb.h(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f5, code lost:
    
        if (r0 == 7233901) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01fa, code lost:
    
        if (r0 != 7631467) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0201, code lost:
    
        if (r0 == 6516589) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0206, code lost:
    
        if (r0 != 7828084) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x020d, code lost:
    
        if (r0 != 6578553) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x020f, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0219, code lost:
    
        if (r0 != 4280916) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r1.N(r7);
        r7 = r7 + r13;
        r1.O(r0);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x021b, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0225, code lost:
    
        if (r0 != 7630703) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0227, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0231, code lost:
    
        if (r0 != 6384738) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0233, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x023e, code lost:
    
        if (r0 != 7108978) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0240, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x024b, code lost:
    
        if (r0 != 6776174) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x024d, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0256, code lost:
    
        if (r0 != 6779504) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0258, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0263, code lost:
    
        if (r0 != 7173742) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0265, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "MVNM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r13 >= r7) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0270, code lost:
    
        if (r0 != 7173737) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0272, code lost:
    
        r10 = defpackage.yfa.B(r13, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x028a, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0292, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02ad, code lost:
    
        if (r6.isEmpty() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r15 = r1.m() + r13;
        r13 = r1.m();
        r0 = (r13 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02b1, code lost:
    
        r12 = new defpackage.ric(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r0 == 169) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r0 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r13 != 1735291493) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if (r13 != 1684632427) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        r10 = defpackage.yfa.z(r13, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        r1.N(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x029a, code lost:
    
        if (r10 == null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x029c, code lost:
    
        r6.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x029f, code lost:
    
        r8 = 4;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r13 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        r10 = defpackage.yfa.z(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        r10 = defpackage.yfa.B(r13, "TBPM", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        r10 = defpackage.yfa.B(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        r10 = defpackage.yfa.y(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fd, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0113, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0120, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0122, code lost:
    
        r10 = defpackage.yfa.B(r13, "ITUNESADVISORY", r1, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012d, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012f, code lost:
    
        r10 = defpackage.yfa.B(r13, "ITUNESGAPLESS", r1, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013a, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013c, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0147, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0149, code lost:
    
        r10 = defpackage.yfa.D(r13, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        if (r13 != 757935405) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0156, code lost:
    
        r0 = r12;
        r9 = r0;
        r10 = -1;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015a, code lost:
    
        r14 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015c, code lost:
    
        if (r14 >= r15) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015e, code lost:
    
        r17 = r1.m();
        r12 = r1.m();
        r1.O(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016c, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016e, code lost:
    
        r0 = r1.w(r17 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
    
        r8 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0178, code lost:
    
        if (r12 != 1851878757) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017a, code lost:
    
        r9 = r1.w(r17 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0184, code lost:
    
        if (r12 != 1684108385) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0186, code lost:
    
        r10 = r14;
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0189, code lost:
    
        r1.O(r17 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0191, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0193, code lost:
    
        if (r9 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0196, code lost:
    
        if (r10 != (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01af, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b0, code lost:
    
        r1.N(r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ric k(bxc bxcVar) {
        int i;
        ric ricVar;
        ric b;
        ric ricVar2;
        int i2;
        j9e j9eVar = bxcVar.g;
        int i3 = 8;
        j9eVar.N(8);
        ric ricVar3 = new ric(new lic[0]);
        while (j9eVar.a() >= i3) {
            int i4 = j9eVar.b;
            int m = j9eVar.m();
            int m2 = j9eVar.m();
            int i5 = 4;
            String str = null;
            if (m2 == 1835365473) {
                j9eVar.N(i4);
                int i6 = i4 + m;
                j9eVar.O(i3);
                a(j9eVar);
                while (true) {
                    int i7 = j9eVar.b;
                    if (i7 >= i6) {
                        break;
                    }
                    int m3 = j9eVar.m();
                    if (j9eVar.m() == 1768715124) {
                        break;
                    }
                    j9eVar.N(i7 + m3);
                    i3 = 8;
                    i5 = 4;
                    str = null;
                }
                ric ricVar4 = null;
                ricVar3 = ricVar3.b(ricVar4);
                i = 8;
            } else {
                if (m2 == 1936553057) {
                    j9eVar.N(i4);
                    int i8 = i4 + m;
                    j9eVar.O(12);
                    while (true) {
                        int i9 = j9eVar.b;
                        if (i9 >= i8) {
                            i = 8;
                            break;
                        }
                        int m4 = j9eVar.m();
                        if (j9eVar.m() != 1935766900) {
                            j9eVar.N(i9 + m4);
                        } else if (m4 < 16) {
                            ricVar2 = null;
                            i = 8;
                        } else {
                            j9eVar.O(4);
                            int i10 = 0;
                            int i11 = -1;
                            for (int i12 = 0; i12 < 2; i12++) {
                                int A = j9eVar.A();
                                int A2 = j9eVar.A();
                                if (A == 0) {
                                    i11 = A2;
                                } else if (A == 1) {
                                    i10 = A2;
                                }
                            }
                            if (i11 == 12) {
                                i2 = 240;
                            } else if (i11 == 13) {
                                i2 = 120;
                            } else if (i11 != 21) {
                                i2 = -2147483647;
                            } else {
                                i = 8;
                                if (j9eVar.a() >= 8 && j9eVar.b + 8 <= i8) {
                                    int m5 = j9eVar.m();
                                    int m6 = j9eVar.m();
                                    if (m5 >= 12 && m6 == 1936877170) {
                                        i2 = j9eVar.B();
                                        if (i2 != -2147483647) {
                                            ricVar2 = new ric(new cmh(i2, i10));
                                        }
                                    }
                                }
                                i2 = -2147483647;
                                if (i2 != -2147483647) {
                                }
                            }
                            i = 8;
                            if (i2 != -2147483647) {
                            }
                        }
                    }
                    ricVar2 = null;
                    b = ricVar3.b(ricVar2);
                } else {
                    i = 8;
                    if (m2 == -1451722374) {
                        short x = j9eVar.x();
                        j9eVar.O(2);
                        String y = j9eVar.y(x, StandardCharsets.UTF_8);
                        int max = Math.max(y.lastIndexOf(43), y.lastIndexOf(45));
                        try {
                            ricVar = new ric(new hxc(Float.parseFloat(y.substring(0, max)), Float.parseFloat(y.substring(max, y.length() - 1))));
                        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                            ricVar = null;
                        }
                        b = ricVar3.b(ricVar);
                    }
                }
                ricVar3 = b;
            }
            j9eVar.N(i4 + m);
            i3 = i;
        }
        return ricVar3;
    }
}
