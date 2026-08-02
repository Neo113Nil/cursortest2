package ru.ozon.uni.android.ds.compose.component.text;

import K1.C3422b;
import K1.C3424d;
import K1.C3440u;
import K1.T;
import P0.p2;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.u;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.IndexedValue;
import kotlin.collections.O;
import kotlin.collections.P;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.text.DsTextPreset;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u001b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u001c\u001a\u001f\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"", "text", "Landroidx/compose/ui/e;", "modifier", "LV1/h;", "textAlign", "Ll1/Z;", "textColor", "LV1/r;", "truncatingMode", "", "maxLines", "LK1/T;", "textStyle", "LZ1/u;", "paragraphSpacing", "", "allCaps", "LZ1/h;", "topPadding", "leftPadding", "rightPadding", "bottomPadding", "", "DsText-kme9oNY", "(Ljava/lang/String;Landroidx/compose/ui/e;IJIILK1/T;JZFFFFLS0/k;III)V", "DsText", "LK1/b;", "(LK1/b;Landroidx/compose/ui/e;IJIILK1/T;JZFFFFLS0/k;III)V", "buildParagraphs-r9BaKPg", "(LK1/b;JLS0/k;I)LK1/b;", "buildParagraphs", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTextKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    /* renamed from: DsText-kme9oNY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1815DsTextkme9oNY(@NotNull String text, e eVar, int i11, long j11, int i12, int i13, T t2, long j12, boolean z11, float f7, float f11, float f12, float f13, InterfaceC3967k interfaceC3967k, int i14, int i15, int i16) {
        int i17;
        e eVar2;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        T t11;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        float f14;
        e eVar3;
        int i37;
        long j13;
        boolean z12;
        T t12;
        float f15;
        long j14;
        float f16;
        int i38;
        int i39;
        int i41;
        long j15;
        float f17;
        int i42;
        float f18;
        int i43;
        int i44;
        String str;
        e i45;
        float f19;
        int i46;
        long j16;
        float f21;
        long j17;
        float f22;
        C3969l c3969l;
        int i47;
        float f23;
        float f24;
        float f25;
        float f26;
        long j18;
        int i48;
        T t13;
        boolean z13;
        e eVar4;
        long j19;
        int i49;
        int i51;
        J0 m02;
        int i52;
        Intrinsics.checkNotNullParameter(text, "text");
        C3969l u11 = interfaceC3967k.u(378674643);
        if ((i16 & 1) != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = (u11.n(text) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i53 = i16 & 2;
        if (i53 != 0) {
            i17 |= 48;
        } else if ((i14 & 48) == 0) {
            eVar2 = eVar;
            i17 |= u11.n(eVar2) ? 32 : 16;
            if ((i14 & 384) != 0) {
                if ((i16 & 4) == 0) {
                    i18 = i11;
                    if (u11.r(i18)) {
                        i52 = 256;
                        i17 |= i52;
                    }
                } else {
                    i18 = i11;
                }
                i52 = UserVerificationMethods.USER_VERIFY_PATTERN;
                i17 |= i52;
            } else {
                i18 = i11;
            }
            if ((i14 & 3072) == 0) {
                i17 |= ((i16 & 8) == 0 && u11.s(j11)) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            i19 = i16 & 16;
            if (i19 == 0) {
                i17 |= 24576;
            } else if ((i14 & 24576) == 0) {
                i21 = i12;
                i17 |= u11.r(i21) ? 16384 : 8192;
                i22 = i16 & 32;
                if (i22 != 0) {
                    i17 |= 196608;
                    i23 = i13;
                } else {
                    i23 = i13;
                    if ((i14 & 196608) == 0) {
                        i17 |= u11.r(i23) ? 131072 : 65536;
                    }
                }
                i24 = i16 & 64;
                if (i24 != 0) {
                    i17 |= 1572864;
                    t11 = t2;
                } else {
                    t11 = t2;
                    if ((i14 & 1572864) == 0) {
                        i17 |= u11.n(t11) ? 1048576 : 524288;
                    }
                }
                i25 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i25 != 0) {
                    i26 = i17 | 12582912;
                } else {
                    i26 = i17;
                    if ((i14 & 12582912) == 0) {
                        i26 |= u11.s(j12) ? 8388608 : 4194304;
                    }
                }
                i27 = i16 & 256;
                if (i27 != 0) {
                    i26 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    i26 |= u11.p(z11) ? 67108864 : 33554432;
                }
                i28 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i28 != 0) {
                    i26 |= 805306368;
                } else if ((i14 & 805306368) == 0) {
                    i29 = i28;
                    i26 |= u11.q(f7) ? 536870912 : 268435456;
                    i31 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i31 == 0) {
                        i33 = i15 | 6;
                        i32 = i31;
                    } else if ((i15 & 6) == 0) {
                        i32 = i31;
                        i33 = i15 | (u11.q(f11) ? 4 : 2);
                    } else {
                        i32 = i31;
                        i33 = i15;
                    }
                    i34 = i16 & 2048;
                    if (i34 == 0) {
                        i33 |= 48;
                        i35 = i34;
                    } else if ((i15 & 48) == 0) {
                        i35 = i34;
                        i33 |= u11.q(f12) ? 32 : 16;
                    } else {
                        i35 = i34;
                    }
                    int i54 = i33;
                    i36 = i16 & 4096;
                    if (i36 == 0) {
                        i54 |= 384;
                    } else if ((i15 & 384) == 0) {
                        f14 = f13;
                        i54 |= u11.q(f14) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                        if ((i26 & 306783379) != 306783378 && (i54 & 147) == 146 && u11.b()) {
                            u11.j();
                            f24 = f12;
                            c3969l = u11;
                            f26 = f14;
                            i48 = i21;
                            i49 = i23;
                            eVar4 = eVar2;
                            i51 = i18;
                            t13 = t11;
                            j18 = j11;
                            j19 = j12;
                            z13 = z11;
                            f23 = f7;
                            f25 = f11;
                        } else {
                            u11.Q0();
                            if ((i14 & 1) != 0 || u11.w0()) {
                                eVar3 = i53 != 0 ? e.f40358c0 : eVar2;
                                if ((i16 & 4) != 0) {
                                    i26 &= -897;
                                    i37 = 5;
                                } else {
                                    i37 = i18;
                                }
                                if ((i16 & 8) != 0) {
                                    j13 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextPrimary();
                                    i26 &= -7169;
                                } else {
                                    j13 = j11;
                                }
                                if (i19 != 0) {
                                    i21 = 2;
                                }
                                int i55 = i22 != 0 ? 1 : i23;
                                if (i24 != 0) {
                                    t11 = DsTextPreset.Paragraph.INSTANCE.getTextStyle();
                                }
                                long d11 = i25 != 0 ? Hj0.T.d(0) : j12;
                                boolean z14 = i27 != 0 ? false : z11;
                                float m1838getDp0D9Ej5fM = i29 != 0 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f7;
                                float m1838getDp0D9Ej5fM2 = i32 != 0 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f11;
                                float m1838getDp0D9Ej5fM3 = i35 != 0 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f12;
                                if (i36 != 0) {
                                    z12 = z14;
                                    t12 = t11;
                                    f18 = m1838getDp0D9Ej5fM2;
                                    f16 = m1838getDp0D9Ej5fM3;
                                    int i56 = i26;
                                    i39 = i37;
                                    i41 = i55;
                                    long j21 = j13;
                                    f17 = DsSpacings.INSTANCE.m1838getDp0D9Ej5fM();
                                    i42 = i56;
                                    f15 = m1838getDp0D9Ej5fM;
                                    j14 = d11;
                                    i38 = i21;
                                    j15 = j21;
                                } else {
                                    z12 = z14;
                                    t12 = t11;
                                    f15 = m1838getDp0D9Ej5fM;
                                    j14 = d11;
                                    f16 = m1838getDp0D9Ej5fM3;
                                    i38 = i21;
                                    int i57 = i26;
                                    i39 = i37;
                                    i41 = i55;
                                    j15 = j13;
                                    f17 = f14;
                                    i42 = i57;
                                    f18 = m1838getDp0D9Ej5fM2;
                                }
                            } else {
                                u11.j();
                                if ((i16 & 4) != 0) {
                                    i26 &= -897;
                                }
                                if ((i16 & 8) != 0) {
                                    i26 &= -7169;
                                }
                                int i58 = i18;
                                i42 = i26;
                                i39 = i58;
                                z12 = z11;
                                f15 = f7;
                                i38 = i21;
                                i41 = i23;
                                eVar3 = eVar2;
                                t12 = t11;
                                j15 = j11;
                                j14 = j12;
                                f16 = f12;
                                f17 = f14;
                                f18 = f11;
                            }
                            u11.j0();
                            i43 = i41 == 0 ? Integer.MAX_VALUE : i41;
                            if (z12) {
                                str = text.toUpperCase(Locale.ROOT);
                                i44 = 0;
                                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
                            } else {
                                i44 = 0;
                                str = text;
                            }
                            float f27 = f18;
                            i45 = androidx.compose.foundation.layout.T.i(eVar3, f27, f15, f16, f17);
                            e eVar5 = eVar3;
                            if (u.c(j14, Hj0.T.d(i44)) && h.u(str, '\n')) {
                                u11.o(1226753699);
                                int i59 = i42 & 33095552;
                                f21 = f16;
                                i47 = i38;
                                T t14 = t12;
                                f22 = f17;
                                f19 = f15;
                                m1814DsTextkme9oNY(new C3422b(6, str, null), i45, i39, j15, i47, i43, t14, j14, false, 0.0f, 0.0f, 0.0f, 0.0f, (InterfaceC3967k) u11, i59, 0, 7936);
                                i46 = i39;
                                j16 = j15;
                                j17 = j14;
                                t12 = t14;
                                u11.k();
                                c3969l = u11;
                            } else {
                                f19 = f15;
                                i46 = i39;
                                j16 = j15;
                                f21 = f16;
                                j17 = j14;
                                int i61 = i38;
                                f22 = f17;
                                u11.o(1227098357);
                                c3969l = u11;
                                p2.b(str, i45, j16, 0L, 0L, V1.h.a(i46), 0L, i61, false, i43, 0, t12, c3969l, ((i42 >> 3) & 896) | ((i42 << 21) & 1879048192), ((i42 >> 9) & 112) | (i42 & 3670016), 54776);
                                i47 = i61;
                                c3969l.k();
                            }
                            f23 = f19;
                            f24 = f21;
                            f25 = f27;
                            f26 = f22;
                            j18 = j16;
                            i48 = i47;
                            t13 = t12;
                            z13 = z12;
                            eVar4 = eVar5;
                            j19 = j17;
                            i49 = i41;
                            i51 = i46;
                        }
                        m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new DsTextKt$DsText$1(text, eVar4, i51, j18, i48, i49, t13, j19, z13, f23, f25, f24, f26, i14, i15, i16));
                            return;
                        }
                        return;
                    }
                    f14 = f13;
                    if ((i26 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i14 & 1) != 0) {
                    }
                    if (i53 != 0) {
                    }
                    if ((i16 & 4) != 0) {
                    }
                    if ((i16 & 8) != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if (i29 != 0) {
                    }
                    if (i32 != 0) {
                    }
                    if (i35 != 0) {
                    }
                    if (i36 != 0) {
                    }
                    u11.j0();
                    if (i41 == 0) {
                    }
                    if (z12) {
                    }
                    float f272 = f18;
                    i45 = androidx.compose.foundation.layout.T.i(eVar3, f272, f15, f16, f17);
                    e eVar52 = eVar3;
                    if (u.c(j14, Hj0.T.d(i44))) {
                    }
                    f19 = f15;
                    i46 = i39;
                    j16 = j15;
                    f21 = f16;
                    j17 = j14;
                    int i612 = i38;
                    f22 = f17;
                    u11.o(1227098357);
                    c3969l = u11;
                    p2.b(str, i45, j16, 0L, 0L, V1.h.a(i46), 0L, i612, false, i43, 0, t12, c3969l, ((i42 >> 3) & 896) | ((i42 << 21) & 1879048192), ((i42 >> 9) & 112) | (i42 & 3670016), 54776);
                    i47 = i612;
                    c3969l.k();
                    f23 = f19;
                    f24 = f21;
                    f25 = f272;
                    f26 = f22;
                    j18 = j16;
                    i48 = i47;
                    t13 = t12;
                    z13 = z12;
                    eVar4 = eVar52;
                    j19 = j17;
                    i49 = i41;
                    i51 = i46;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                i29 = i28;
                i31 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i31 == 0) {
                }
                i34 = i16 & 2048;
                if (i34 == 0) {
                }
                int i542 = i33;
                i36 = i16 & 4096;
                if (i36 == 0) {
                }
                f14 = f13;
                if ((i26 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i14 & 1) != 0) {
                }
                if (i53 != 0) {
                }
                if ((i16 & 4) != 0) {
                }
                if ((i16 & 8) != 0) {
                }
                if (i19 != 0) {
                }
                if (i22 != 0) {
                }
                if (i24 != 0) {
                }
                if (i25 != 0) {
                }
                if (i27 != 0) {
                }
                if (i29 != 0) {
                }
                if (i32 != 0) {
                }
                if (i35 != 0) {
                }
                if (i36 != 0) {
                }
                u11.j0();
                if (i41 == 0) {
                }
                if (z12) {
                }
                float f2722 = f18;
                i45 = androidx.compose.foundation.layout.T.i(eVar3, f2722, f15, f16, f17);
                e eVar522 = eVar3;
                if (u.c(j14, Hj0.T.d(i44))) {
                }
                f19 = f15;
                i46 = i39;
                j16 = j15;
                f21 = f16;
                j17 = j14;
                int i6122 = i38;
                f22 = f17;
                u11.o(1227098357);
                c3969l = u11;
                p2.b(str, i45, j16, 0L, 0L, V1.h.a(i46), 0L, i6122, false, i43, 0, t12, c3969l, ((i42 >> 3) & 896) | ((i42 << 21) & 1879048192), ((i42 >> 9) & 112) | (i42 & 3670016), 54776);
                i47 = i6122;
                c3969l.k();
                f23 = f19;
                f24 = f21;
                f25 = f2722;
                f26 = f22;
                j18 = j16;
                i48 = i47;
                t13 = t12;
                z13 = z12;
                eVar4 = eVar522;
                j19 = j17;
                i49 = i41;
                i51 = i46;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            i21 = i12;
            i22 = i16 & 32;
            if (i22 != 0) {
            }
            i24 = i16 & 64;
            if (i24 != 0) {
            }
            i25 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i25 != 0) {
            }
            i27 = i16 & 256;
            if (i27 != 0) {
            }
            i28 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i28 != 0) {
            }
            i29 = i28;
            i31 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i31 == 0) {
            }
            i34 = i16 & 2048;
            if (i34 == 0) {
            }
            int i5422 = i33;
            i36 = i16 & 4096;
            if (i36 == 0) {
            }
            f14 = f13;
            if ((i26 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i14 & 1) != 0) {
            }
            if (i53 != 0) {
            }
            if ((i16 & 4) != 0) {
            }
            if ((i16 & 8) != 0) {
            }
            if (i19 != 0) {
            }
            if (i22 != 0) {
            }
            if (i24 != 0) {
            }
            if (i25 != 0) {
            }
            if (i27 != 0) {
            }
            if (i29 != 0) {
            }
            if (i32 != 0) {
            }
            if (i35 != 0) {
            }
            if (i36 != 0) {
            }
            u11.j0();
            if (i41 == 0) {
            }
            if (z12) {
            }
            float f27222 = f18;
            i45 = androidx.compose.foundation.layout.T.i(eVar3, f27222, f15, f16, f17);
            e eVar5222 = eVar3;
            if (u.c(j14, Hj0.T.d(i44))) {
            }
            f19 = f15;
            i46 = i39;
            j16 = j15;
            f21 = f16;
            j17 = j14;
            int i61222 = i38;
            f22 = f17;
            u11.o(1227098357);
            c3969l = u11;
            p2.b(str, i45, j16, 0L, 0L, V1.h.a(i46), 0L, i61222, false, i43, 0, t12, c3969l, ((i42 >> 3) & 896) | ((i42 << 21) & 1879048192), ((i42 >> 9) & 112) | (i42 & 3670016), 54776);
            i47 = i61222;
            c3969l.k();
            f23 = f19;
            f24 = f21;
            f25 = f27222;
            f26 = f22;
            j18 = j16;
            i48 = i47;
            t13 = t12;
            z13 = z12;
            eVar4 = eVar5222;
            j19 = j17;
            i49 = i41;
            i51 = i46;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i14 & 384) != 0) {
        }
        if ((i14 & 3072) == 0) {
        }
        i19 = i16 & 16;
        if (i19 == 0) {
        }
        i21 = i12;
        i22 = i16 & 32;
        if (i22 != 0) {
        }
        i24 = i16 & 64;
        if (i24 != 0) {
        }
        i25 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i25 != 0) {
        }
        i27 = i16 & 256;
        if (i27 != 0) {
        }
        i28 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i28 != 0) {
        }
        i29 = i28;
        i31 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i31 == 0) {
        }
        i34 = i16 & 2048;
        if (i34 == 0) {
        }
        int i54222 = i33;
        i36 = i16 & 4096;
        if (i36 == 0) {
        }
        f14 = f13;
        if ((i26 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i14 & 1) != 0) {
        }
        if (i53 != 0) {
        }
        if ((i16 & 4) != 0) {
        }
        if ((i16 & 8) != 0) {
        }
        if (i19 != 0) {
        }
        if (i22 != 0) {
        }
        if (i24 != 0) {
        }
        if (i25 != 0) {
        }
        if (i27 != 0) {
        }
        if (i29 != 0) {
        }
        if (i32 != 0) {
        }
        if (i35 != 0) {
        }
        if (i36 != 0) {
        }
        u11.j0();
        if (i41 == 0) {
        }
        if (z12) {
        }
        float f272222 = f18;
        i45 = androidx.compose.foundation.layout.T.i(eVar3, f272222, f15, f16, f17);
        e eVar52222 = eVar3;
        if (u.c(j14, Hj0.T.d(i44))) {
        }
        f19 = f15;
        i46 = i39;
        j16 = j15;
        f21 = f16;
        j17 = j14;
        int i612222 = i38;
        f22 = f17;
        u11.o(1227098357);
        c3969l = u11;
        p2.b(str, i45, j16, 0L, 0L, V1.h.a(i46), 0L, i612222, false, i43, 0, t12, c3969l, ((i42 >> 3) & 896) | ((i42 << 21) & 1879048192), ((i42 >> 9) & 112) | (i42 & 3670016), 54776);
        i47 = i612222;
        c3969l.k();
        f23 = f19;
        f24 = f21;
        f25 = f272222;
        f26 = f22;
        j18 = j16;
        i48 = i47;
        t13 = t12;
        z13 = z12;
        eVar4 = eVar52222;
        j19 = j17;
        i49 = i41;
        i51 = i46;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* renamed from: buildParagraphs-r9BaKPg, reason: not valid java name */
    private static final C3422b m1816buildParagraphsr9BaKPg(C3422b c3422b, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(1097428047);
        C3422b.a aVar = new C3422b.a();
        O I02 = h.I0(c3422b);
        ArrayList arrayList = new ArrayList();
        Iterator it = I02.iterator();
        while (true) {
            P p11 = (P) it;
            if (!p11.hasNext()) {
                break;
            }
            Object next = p11.next();
            if (((Character) ((IndexedValue) next).d()).charValue() == '\n') {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((IndexedValue) it2.next()).c()));
        }
        Iterator it3 = arrayList2.iterator();
        int i12 = 0;
        while (it3.hasNext()) {
            int intValue = ((Number) it3.next()).intValue();
            aVar.d(c3422b.subSequence(i12, intValue));
            long j12 = j11;
            int g10 = aVar.g(new C3440u(0, 0, j12, null, 507));
            try {
                Unit unit = Unit.f71690a;
                aVar.f(g10);
                i12 = intValue + 1;
                j11 = j12;
            } catch (Throwable th2) {
                aVar.f(g10);
                throw th2;
            }
        }
        aVar.d(c3422b.subSequence(((Number) C7714v.X(arrayList2)).intValue() + 1, c3422b.length()));
        C3422b i13 = aVar.i();
        interfaceC3967k.k();
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022a  */
    /* renamed from: DsText-kme9oNY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1814DsTextkme9oNY(@NotNull C3422b text, e eVar, int i11, long j11, int i12, int i13, T t2, long j12, boolean z11, float f7, float f11, float f12, float f13, InterfaceC3967k interfaceC3967k, int i14, int i15, int i16) {
        int i17;
        e eVar2;
        int i18;
        long j13;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        T t11;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        e eVar3;
        int i36;
        int i37;
        boolean z12;
        T t12;
        float f14;
        int i38;
        long j14;
        long j15;
        float f15;
        float f16;
        int i39;
        float f17;
        C3422b g10;
        C3969l c3969l;
        float f18;
        float f19;
        int i41;
        float f21;
        long j16;
        int i42;
        T t13;
        int i43;
        boolean z13;
        long j17;
        float f22;
        e eVar4;
        J0 m02;
        int i44;
        Intrinsics.checkNotNullParameter(text, "text");
        C3969l u11 = interfaceC3967k.u(1965574871);
        if ((i16 & 1) != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = (u11.n(text) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i45 = i16 & 2;
        if (i45 != 0) {
            i17 |= 48;
        } else if ((i14 & 48) == 0) {
            eVar2 = eVar;
            i17 |= u11.n(eVar2) ? 32 : 16;
            if ((i14 & 384) != 0) {
                if ((i16 & 4) == 0) {
                    i18 = i11;
                    if (u11.r(i18)) {
                        i44 = 256;
                        i17 |= i44;
                    }
                } else {
                    i18 = i11;
                }
                i44 = UserVerificationMethods.USER_VERIFY_PATTERN;
                i17 |= i44;
            } else {
                i18 = i11;
            }
            if ((i14 & 3072) != 0) {
                j13 = j11;
                i17 |= ((i16 & 8) == 0 && u11.s(j13)) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            } else {
                j13 = j11;
            }
            i19 = i16 & 16;
            if (i19 == 0) {
                i17 |= 24576;
            } else if ((i14 & 24576) == 0) {
                i21 = i12;
                i17 |= u11.r(i21) ? 16384 : 8192;
                i22 = i16 & 32;
                if (i22 != 0) {
                    i17 |= 196608;
                    i23 = i13;
                } else {
                    i23 = i13;
                    if ((i14 & 196608) == 0) {
                        i17 |= u11.r(i23) ? 131072 : 65536;
                    }
                }
                i24 = i16 & 64;
                if (i24 != 0) {
                    i17 |= 1572864;
                    t11 = t2;
                } else {
                    t11 = t2;
                    if ((i14 & 1572864) == 0) {
                        i17 |= u11.n(t11) ? 1048576 : 524288;
                    }
                }
                i25 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i25 != 0) {
                    i17 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    i17 |= u11.s(j12) ? 8388608 : 4194304;
                }
                i26 = i16 & 256;
                if (i26 != 0) {
                    i17 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    i17 |= u11.p(z11) ? 67108864 : 33554432;
                }
                i27 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i27 != 0) {
                    i17 |= 805306368;
                } else if ((i14 & 805306368) == 0) {
                    i17 |= u11.q(f7) ? 536870912 : 268435456;
                }
                i28 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i28 != 0) {
                    i31 = i15 | 6;
                    i29 = i28;
                } else if ((i15 & 6) == 0) {
                    i29 = i28;
                    i31 = i15 | (u11.q(f11) ? 4 : 2);
                } else {
                    i29 = i28;
                    i31 = i15;
                }
                i32 = i16 & 2048;
                if (i32 != 0) {
                    i31 |= 48;
                    i33 = i32;
                } else if ((i15 & 48) == 0) {
                    i33 = i32;
                    i31 |= u11.q(f12) ? 32 : 16;
                } else {
                    i33 = i32;
                }
                int i46 = i31;
                i34 = i16 & 4096;
                if (i34 != 0) {
                    i35 = i46 | 384;
                } else {
                    int i47 = i46;
                    if ((i15 & 384) == 0) {
                        i47 |= u11.q(f13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    i35 = i47;
                }
                if ((i17 & 306783379) != 306783378 && (i35 & 147) == 146 && u11.b()) {
                    u11.j();
                    f21 = f12;
                    f22 = f13;
                    c3969l = u11;
                    j16 = j13;
                    i42 = i21;
                    i43 = i23;
                    eVar4 = eVar2;
                    i41 = i18;
                    t13 = t11;
                    j17 = j12;
                    z13 = z11;
                    f19 = f7;
                    f18 = f11;
                } else {
                    u11.Q0();
                    if ((i14 & 1) == 0 && !u11.w0()) {
                        u11.j();
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                        }
                        z12 = z11;
                        j14 = j13;
                        i39 = i21;
                        i37 = i23;
                        eVar3 = eVar2;
                        i36 = i18;
                        t12 = t11;
                        f17 = f7;
                        f15 = f11;
                        f16 = f12;
                        f14 = f13;
                        i38 = i17;
                        j15 = j12;
                    } else {
                        eVar3 = i45 != 0 ? e.f40358c0 : eVar2;
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            i36 = 5;
                        } else {
                            i36 = i18;
                        }
                        if ((i16 & 8) != 0) {
                            j13 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextPrimary();
                            i17 &= -7169;
                        }
                        if (i19 != 0) {
                            i21 = 2;
                        }
                        int i48 = i22 != 0 ? 1 : i23;
                        if (i24 != 0) {
                            t11 = DsTextPreset.Paragraph.INSTANCE.getTextStyle();
                        }
                        long d11 = i25 != 0 ? Hj0.T.d(0) : j12;
                        boolean z14 = i26 != 0 ? false : z11;
                        float m1838getDp0D9Ej5fM = i27 != 0 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f7;
                        float m1838getDp0D9Ej5fM2 = i29 != 0 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f11;
                        float m1838getDp0D9Ej5fM3 = i33 != 0 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f12;
                        if (i34 != 0) {
                            i37 = i48;
                            z12 = z14;
                            t12 = t11;
                            f14 = DsSpacings.INSTANCE.m1838getDp0D9Ej5fM();
                        } else {
                            i37 = i48;
                            z12 = z14;
                            t12 = t11;
                            f14 = f13;
                        }
                        i38 = i17;
                        j14 = j13;
                        j15 = d11;
                        f15 = m1838getDp0D9Ej5fM2;
                        f16 = m1838getDp0D9Ej5fM3;
                        i39 = i21;
                        f17 = m1838getDp0D9Ej5fM;
                    }
                    u11.j0();
                    int i49 = i37 == 0 ? Integer.MAX_VALUE : i37;
                    g10 = z12 ? C3424d.g(text) : text;
                    e i51 = androidx.compose.foundation.layout.T.i(eVar3, f15, f17, f16, f14);
                    u11.o(-930188042);
                    e eVar5 = eVar3;
                    if (!u.c(j15, Hj0.T.d(0)) && h.u(g10, '\n')) {
                        g10 = m1816buildParagraphsr9BaKPg(g10, j15, u11, (i38 >> 18) & 112);
                    }
                    u11.k();
                    int i52 = i38;
                    float f23 = f14;
                    long j18 = j15;
                    c3969l = u11;
                    p2.c(g10, i51, j14, 0L, 0L, V1.h.a(i36), 0L, i39, false, i49, 0, null, null, t12, c3969l, ((i52 >> 3) & 896) | ((i52 << 21) & 1879048192), ((i52 >> 9) & 112) | ((i52 << 3) & 29360128), 120312);
                    f18 = f15;
                    f19 = f17;
                    i41 = i36;
                    f21 = f16;
                    j16 = j14;
                    i42 = i39;
                    t13 = t12;
                    i43 = i37;
                    z13 = z12;
                    j17 = j18;
                    f22 = f23;
                    eVar4 = eVar5;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new DsTextKt$DsText$2(text, eVar4, i41, j16, i42, i43, t13, j17, z13, f19, f18, f21, f22, i14, i15, i16));
                    return;
                }
                return;
            }
            i21 = i12;
            i22 = i16 & 32;
            if (i22 != 0) {
            }
            i24 = i16 & 64;
            if (i24 != 0) {
            }
            i25 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i25 != 0) {
            }
            i26 = i16 & 256;
            if (i26 != 0) {
            }
            i27 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i27 != 0) {
            }
            i28 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i28 != 0) {
            }
            i32 = i16 & 2048;
            if (i32 != 0) {
            }
            int i462 = i31;
            i34 = i16 & 4096;
            if (i34 != 0) {
            }
            if ((i17 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i14 & 1) == 0) {
            }
            if (i45 != 0) {
            }
            if ((i16 & 4) != 0) {
            }
            if ((i16 & 8) != 0) {
            }
            if (i19 != 0) {
            }
            if (i22 != 0) {
            }
            if (i24 != 0) {
            }
            if (i25 != 0) {
            }
            if (i26 != 0) {
            }
            if (i27 != 0) {
            }
            if (i29 != 0) {
            }
            if (i33 != 0) {
            }
            if (i34 != 0) {
            }
            i38 = i17;
            j14 = j13;
            j15 = d11;
            f15 = m1838getDp0D9Ej5fM2;
            f16 = m1838getDp0D9Ej5fM3;
            i39 = i21;
            f17 = m1838getDp0D9Ej5fM;
            u11.j0();
            if (i37 == 0) {
            }
            if (z12) {
            }
            e i512 = androidx.compose.foundation.layout.T.i(eVar3, f15, f17, f16, f14);
            u11.o(-930188042);
            e eVar52 = eVar3;
            if (!u.c(j15, Hj0.T.d(0))) {
                g10 = m1816buildParagraphsr9BaKPg(g10, j15, u11, (i38 >> 18) & 112);
            }
            u11.k();
            int i522 = i38;
            float f232 = f14;
            long j182 = j15;
            c3969l = u11;
            p2.c(g10, i512, j14, 0L, 0L, V1.h.a(i36), 0L, i39, false, i49, 0, null, null, t12, c3969l, ((i522 >> 3) & 896) | ((i522 << 21) & 1879048192), ((i522 >> 9) & 112) | ((i522 << 3) & 29360128), 120312);
            f18 = f15;
            f19 = f17;
            i41 = i36;
            f21 = f16;
            j16 = j14;
            i42 = i39;
            t13 = t12;
            i43 = i37;
            z13 = z12;
            j17 = j182;
            f22 = f232;
            eVar4 = eVar52;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i14 & 384) != 0) {
        }
        if ((i14 & 3072) != 0) {
        }
        i19 = i16 & 16;
        if (i19 == 0) {
        }
        i21 = i12;
        i22 = i16 & 32;
        if (i22 != 0) {
        }
        i24 = i16 & 64;
        if (i24 != 0) {
        }
        i25 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i25 != 0) {
        }
        i26 = i16 & 256;
        if (i26 != 0) {
        }
        i27 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i27 != 0) {
        }
        i28 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i28 != 0) {
        }
        i32 = i16 & 2048;
        if (i32 != 0) {
        }
        int i4622 = i31;
        i34 = i16 & 4096;
        if (i34 != 0) {
        }
        if ((i17 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i14 & 1) == 0) {
        }
        if (i45 != 0) {
        }
        if ((i16 & 4) != 0) {
        }
        if ((i16 & 8) != 0) {
        }
        if (i19 != 0) {
        }
        if (i22 != 0) {
        }
        if (i24 != 0) {
        }
        if (i25 != 0) {
        }
        if (i26 != 0) {
        }
        if (i27 != 0) {
        }
        if (i29 != 0) {
        }
        if (i33 != 0) {
        }
        if (i34 != 0) {
        }
        i38 = i17;
        j14 = j13;
        j15 = d11;
        f15 = m1838getDp0D9Ej5fM2;
        f16 = m1838getDp0D9Ej5fM3;
        i39 = i21;
        f17 = m1838getDp0D9Ej5fM;
        u11.j0();
        if (i37 == 0) {
        }
        if (z12) {
        }
        e i5122 = androidx.compose.foundation.layout.T.i(eVar3, f15, f17, f16, f14);
        u11.o(-930188042);
        e eVar522 = eVar3;
        if (!u.c(j15, Hj0.T.d(0))) {
        }
        u11.k();
        int i5222 = i38;
        float f2322 = f14;
        long j1822 = j15;
        c3969l = u11;
        p2.c(g10, i5122, j14, 0L, 0L, V1.h.a(i36), 0L, i39, false, i49, 0, null, null, t12, c3969l, ((i5222 >> 3) & 896) | ((i5222 << 21) & 1879048192), ((i5222 >> 9) & 112) | ((i5222 << 3) & 29360128), 120312);
        f18 = f15;
        f19 = f17;
        i41 = i36;
        f21 = f16;
        j16 = j14;
        i42 = i39;
        t13 = t12;
        i43 = i37;
        z13 = z12;
        j17 = j1822;
        f22 = f2322;
        eVar4 = eVar522;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
