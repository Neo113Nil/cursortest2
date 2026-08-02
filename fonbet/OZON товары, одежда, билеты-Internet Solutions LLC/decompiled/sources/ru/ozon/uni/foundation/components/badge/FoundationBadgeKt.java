package ru.ozon.uni.foundation.components.badge;

import D1.InterfaceC2801g;
import Fr.g;
import J0.T0;
import J0.u3;
import K1.M;
import K1.N;
import K1.T;
import P9.a;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.d;
import Z1.h;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import m0.D0;
import m0.H0;
import m0.U0;
import m0.W0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.foundation.utils.ModifierUtilsKt;
import ru.ozon.uni.foundation.utils.TransitionsKt;
import t0.p;
import t0.q;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aÝ\u0001\u0010%\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0010H\u0001¢\u0006\u0004\b#\u0010$\u001aÝ\u0001\u0010'\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0010H\u0003¢\u0006\u0004\b&\u0010$\u001a)\u0010,\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0015H\u0003¢\u0006\u0004\b*\u0010+¨\u0006/²\u0006\f\u0010.\u001a\u00020-8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "labelModifier", "startGraphicModifier", "endGraphicModifier", "LZ1/h;", "height", "topStartCornerRadius", "topEndCornerRadius", "bottomEndCornerRadius", "bottomStartCornerRadius", "Ll1/Q;", "backgroundBrush", "Lkotlin/Function0;", "", "onClick", "", "isClickable", "Lq1/b;", "startGraphic", "endGraphic", "Ll1/Z;", "startGraphicColor", "labelColor", "", "label", "LK1/T;", "textStyle", "endGraphicColor", "startGraphicPadding", "endGraphicPadding", "graphicSize", "Lu0/x;", "contentPadding", "isAllCaps", "FoundationBadge-WhIEsx8", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;FFFFFLl1/Q;Lkotlin/jvm/functions/Function0;ZLq1/b;Lq1/b;JJLjava/lang/String;LK1/T;JFFFLu0/x;ZLS0/k;IIII)V", "FoundationBadge", "FoundationBadgeImpl-WhIEsx8", "FoundationBadgeImpl", "graphic", "color", "BadgeIcon-FNF3uiM", "(Landroidx/compose/ui/e;Lq1/b;JLS0/k;II)V", "BadgeIcon", "", "contentOpacity", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationBadgeKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BadgeIcon-FNF3uiM, reason: not valid java name */
    public static final void m2973BadgeIconFNF3uiM(e eVar, AbstractC8972b abstractC8972b, long j11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        AbstractC8972b abstractC8972b2;
        long j12;
        e eVar2;
        C3969l u11 = interfaceC3967k.u(-75482706);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(abstractC8972b) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            j12 = j11;
            abstractC8972b2 = abstractC8972b;
            eVar2 = eVar;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar3 = eVar;
            T0.a(abstractC8972b, null, eVar3, j11, u11, ((i13 >> 3) & 14) | 48 | ((i13 << 6) & 896) | ((i13 << 3) & 7168));
            abstractC8972b2 = abstractC8972b;
            j12 = j11;
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new FoundationBadgeKt$BadgeIcon$1(eVar2, abstractC8972b2, j12, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f2  */
    /* renamed from: FoundationBadge-WhIEsx8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2974FoundationBadgeWhIEsx8(@NotNull e modifier, @NotNull e labelModifier, @NotNull e startGraphicModifier, @NotNull e endGraphicModifier, float f7, float f11, float f12, float f13, float f14, @NotNull AbstractC7799Q backgroundBrush, @NotNull Function0<Unit> onClick, boolean z11, AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, long j11, long j12, String str, @NotNull T textStyle, long j13, float f15, float f16, float f17, @NotNull InterfaceC9914x contentPadding, boolean z12, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13, int i14) {
        int i15;
        float f18;
        float f19;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        boolean z13;
        C3969l c3969l;
        J0 m02;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(labelModifier, "labelModifier");
        Intrinsics.checkNotNullParameter(startGraphicModifier, "startGraphicModifier");
        Intrinsics.checkNotNullParameter(endGraphicModifier, "endGraphicModifier");
        Intrinsics.checkNotNullParameter(backgroundBrush, "backgroundBrush");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        C3969l u11 = interfaceC3967k.u(256069618);
        if ((i14 & 1) != 0) {
            i15 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i15 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i11 & 48) == 0) {
            i15 |= u11.n(labelModifier) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i11 & 384) == 0) {
            i15 |= u11.n(startGraphicModifier) ? 256 : 128;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i15 |= u11.n(endGraphicModifier) ? 2048 : 1024;
        }
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i11 & 24576) == 0) {
            f18 = f7;
            i15 |= u11.q(f18) ? 16384 : 8192;
            if ((i14 & 32) == 0) {
                i15 |= 196608;
                f19 = f11;
            } else {
                f19 = f11;
                if ((i11 & 196608) == 0) {
                    i15 |= u11.q(f19) ? 131072 : 65536;
                }
            }
            if ((i14 & 64) == 0) {
                i15 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                i15 |= u11.q(f12) ? 1048576 : 524288;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                i15 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i15 |= u11.q(f13) ? 8388608 : 4194304;
                if ((i14 & 256) != 0) {
                    i15 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i15 |= u11.q(f14) ? 67108864 : 33554432;
                    if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                        i15 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        i15 |= u11.n(backgroundBrush) ? 536870912 : 268435456;
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                        i16 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        i16 = (u11.F(onClick) ? 4 : 2) | i12;
                    } else {
                        i16 = i12;
                    }
                    int i24 = i16;
                    if ((i14 & 2048) == 0) {
                        i17 = i24 | 48;
                    } else {
                        if ((i12 & 48) == 0) {
                            i24 |= u11.p(z11) ? 32 : 16;
                        }
                        i17 = i24;
                    }
                    if ((i14 & 4096) == 0) {
                        i17 |= 384;
                    } else if ((i12 & 384) == 0) {
                        i17 |= u11.n(abstractC8972b) ? 256 : 128;
                        if ((i14 & 8192) != 0) {
                            i17 |= 3072;
                        } else if ((i12 & 3072) == 0) {
                            i17 |= u11.n(abstractC8972b2) ? 2048 : 1024;
                            if ((i14 & 16384) == 0) {
                                i18 = i17 | 24576;
                            } else {
                                int i25 = i17;
                                if ((i12 & 24576) == 0) {
                                    i18 = i25 | (u11.s(j11) ? 16384 : 8192);
                                } else {
                                    i18 = i25;
                                }
                            }
                            if ((i14 & 32768) == 0) {
                                i18 |= 196608;
                            } else if ((i12 & 196608) == 0) {
                                i18 |= u11.s(j12) ? 131072 : 65536;
                            }
                            if ((i14 & 65536) == 0) {
                                i18 |= 1572864;
                            } else if ((i12 & 1572864) == 0) {
                                i18 |= u11.n(str) ? 1048576 : 524288;
                            }
                            if ((i14 & 131072) == 0) {
                                i18 |= 12582912;
                            } else if ((i12 & 12582912) == 0) {
                                i18 |= u11.n(textStyle) ? 8388608 : 4194304;
                            }
                            if ((262144 & i14) == 0) {
                                i18 |= 100663296;
                            } else if ((i12 & 100663296) == 0) {
                                i18 |= u11.s(j13) ? 67108864 : 33554432;
                                if ((i14 & 524288) != 0) {
                                    i18 |= 805306368;
                                } else if ((i12 & 805306368) == 0) {
                                    i18 |= u11.q(f15) ? 536870912 : 268435456;
                                }
                                if ((i14 & 1048576) != 0) {
                                    i19 = i13 | 6;
                                } else if ((i13 & 6) == 0) {
                                    i19 = i13 | (u11.q(f16) ? 4 : 2);
                                } else {
                                    i19 = i13;
                                }
                                if ((i14 & 2097152) != 0) {
                                    i19 |= 48;
                                } else if ((i13 & 48) == 0) {
                                    i19 |= u11.q(f17) ? 32 : 16;
                                }
                                int i26 = i19;
                                if ((i14 & 4194304) != 0) {
                                    i21 = i26 | 384;
                                } else if ((i13 & 384) == 0) {
                                    i21 = i26 | (u11.n(contentPadding) ? 256 : 128);
                                } else {
                                    i21 = i26;
                                }
                                i22 = i14 & 8388608;
                                if (i22 != 0) {
                                    i23 = i21 | 3072;
                                } else {
                                    int i27 = i21;
                                    if ((i13 & 3072) == 0) {
                                        i23 = i27 | (u11.p(z12) ? 2048 : 1024);
                                    } else {
                                        i23 = i27;
                                    }
                                }
                                if ((i15 & 306783379) != 306783378 && (i18 & 306783379) == 306783378 && (i23 & 1171) == 1170 && u11.b()) {
                                    u11.j();
                                    z13 = z12;
                                    c3969l = u11;
                                } else {
                                    z13 = i22 != 0 ? false : z12;
                                    c3969l = u11;
                                    m2975FoundationBadgeImplWhIEsx8(modifier, labelModifier, startGraphicModifier, endGraphicModifier, f18, f19, f12, f13, f14, backgroundBrush, onClick, z11, abstractC8972b, abstractC8972b2, j11, j12, str, textStyle, j13, f15, f16, f17, contentPadding, z13, c3969l, i15 & 2147483646, i18 & 2147483646, i23 & 8190, 0);
                                }
                                m02 = c3969l.m0();
                                if (m02 != null) {
                                    m02.G(new FoundationBadgeKt$FoundationBadge$1(modifier, labelModifier, startGraphicModifier, endGraphicModifier, f7, f11, f12, f13, f14, backgroundBrush, onClick, z11, abstractC8972b, abstractC8972b2, j11, j12, str, textStyle, j13, f15, f16, f17, contentPadding, z13, i11, i12, i13, i14));
                                    return;
                                }
                                return;
                            }
                            if ((i14 & 524288) != 0) {
                            }
                            if ((i14 & 1048576) != 0) {
                            }
                            if ((i14 & 2097152) != 0) {
                            }
                            int i262 = i19;
                            if ((i14 & 4194304) != 0) {
                            }
                            i22 = i14 & 8388608;
                            if (i22 != 0) {
                            }
                            if ((i15 & 306783379) != 306783378) {
                            }
                            if (i22 != 0) {
                            }
                            c3969l = u11;
                            m2975FoundationBadgeImplWhIEsx8(modifier, labelModifier, startGraphicModifier, endGraphicModifier, f18, f19, f12, f13, f14, backgroundBrush, onClick, z11, abstractC8972b, abstractC8972b2, j11, j12, str, textStyle, j13, f15, f16, f17, contentPadding, z13, c3969l, i15 & 2147483646, i18 & 2147483646, i23 & 8190, 0);
                            m02 = c3969l.m0();
                            if (m02 != null) {
                            }
                        }
                        if ((i14 & 16384) == 0) {
                        }
                        if ((i14 & 32768) == 0) {
                        }
                        if ((i14 & 65536) == 0) {
                        }
                        if ((i14 & 131072) == 0) {
                        }
                        if ((262144 & i14) == 0) {
                        }
                        if ((i14 & 524288) != 0) {
                        }
                        if ((i14 & 1048576) != 0) {
                        }
                        if ((i14 & 2097152) != 0) {
                        }
                        int i2622 = i19;
                        if ((i14 & 4194304) != 0) {
                        }
                        i22 = i14 & 8388608;
                        if (i22 != 0) {
                        }
                        if ((i15 & 306783379) != 306783378) {
                        }
                        if (i22 != 0) {
                        }
                        c3969l = u11;
                        m2975FoundationBadgeImplWhIEsx8(modifier, labelModifier, startGraphicModifier, endGraphicModifier, f18, f19, f12, f13, f14, backgroundBrush, onClick, z11, abstractC8972b, abstractC8972b2, j11, j12, str, textStyle, j13, f15, f16, f17, contentPadding, z13, c3969l, i15 & 2147483646, i18 & 2147483646, i23 & 8190, 0);
                        m02 = c3969l.m0();
                        if (m02 != null) {
                        }
                    }
                    if ((i14 & 8192) != 0) {
                    }
                    if ((i14 & 16384) == 0) {
                    }
                    if ((i14 & 32768) == 0) {
                    }
                    if ((i14 & 65536) == 0) {
                    }
                    if ((i14 & 131072) == 0) {
                    }
                    if ((262144 & i14) == 0) {
                    }
                    if ((i14 & 524288) != 0) {
                    }
                    if ((i14 & 1048576) != 0) {
                    }
                    if ((i14 & 2097152) != 0) {
                    }
                    int i26222 = i19;
                    if ((i14 & 4194304) != 0) {
                    }
                    i22 = i14 & 8388608;
                    if (i22 != 0) {
                    }
                    if ((i15 & 306783379) != 306783378) {
                    }
                    if (i22 != 0) {
                    }
                    c3969l = u11;
                    m2975FoundationBadgeImplWhIEsx8(modifier, labelModifier, startGraphicModifier, endGraphicModifier, f18, f19, f12, f13, f14, backgroundBrush, onClick, z11, abstractC8972b, abstractC8972b2, j11, j12, str, textStyle, j13, f15, f16, f17, contentPadding, z13, c3969l, i15 & 2147483646, i18 & 2147483646, i23 & 8190, 0);
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                }
                int i242 = i16;
                if ((i14 & 2048) == 0) {
                }
                if ((i14 & 4096) == 0) {
                }
                if ((i14 & 8192) != 0) {
                }
                if ((i14 & 16384) == 0) {
                }
                if ((i14 & 32768) == 0) {
                }
                if ((i14 & 65536) == 0) {
                }
                if ((i14 & 131072) == 0) {
                }
                if ((262144 & i14) == 0) {
                }
                if ((i14 & 524288) != 0) {
                }
                if ((i14 & 1048576) != 0) {
                }
                if ((i14 & 2097152) != 0) {
                }
                int i262222 = i19;
                if ((i14 & 4194304) != 0) {
                }
                i22 = i14 & 8388608;
                if (i22 != 0) {
                }
                if ((i15 & 306783379) != 306783378) {
                }
                if (i22 != 0) {
                }
                c3969l = u11;
                m2975FoundationBadgeImplWhIEsx8(modifier, labelModifier, startGraphicModifier, endGraphicModifier, f18, f19, f12, f13, f14, backgroundBrush, onClick, z11, abstractC8972b, abstractC8972b2, j11, j12, str, textStyle, j13, f15, f16, f17, contentPadding, z13, c3969l, i15 & 2147483646, i18 & 2147483646, i23 & 8190, 0);
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            if ((i14 & 256) != 0) {
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            }
            int i2422 = i16;
            if ((i14 & 2048) == 0) {
            }
            if ((i14 & 4096) == 0) {
            }
            if ((i14 & 8192) != 0) {
            }
            if ((i14 & 16384) == 0) {
            }
            if ((i14 & 32768) == 0) {
            }
            if ((i14 & 65536) == 0) {
            }
            if ((i14 & 131072) == 0) {
            }
            if ((262144 & i14) == 0) {
            }
            if ((i14 & 524288) != 0) {
            }
            if ((i14 & 1048576) != 0) {
            }
            if ((i14 & 2097152) != 0) {
            }
            int i2622222 = i19;
            if ((i14 & 4194304) != 0) {
            }
            i22 = i14 & 8388608;
            if (i22 != 0) {
            }
            if ((i15 & 306783379) != 306783378) {
            }
            if (i22 != 0) {
            }
            c3969l = u11;
            m2975FoundationBadgeImplWhIEsx8(modifier, labelModifier, startGraphicModifier, endGraphicModifier, f18, f19, f12, f13, f14, backgroundBrush, onClick, z11, abstractC8972b, abstractC8972b2, j11, j12, str, textStyle, j13, f15, f16, f17, contentPadding, z13, c3969l, i15 & 2147483646, i18 & 2147483646, i23 & 8190, 0);
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        f18 = f7;
        if ((i14 & 32) == 0) {
        }
        if ((i14 & 64) == 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        if ((i14 & 256) != 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
        }
        int i24222 = i16;
        if ((i14 & 2048) == 0) {
        }
        if ((i14 & 4096) == 0) {
        }
        if ((i14 & 8192) != 0) {
        }
        if ((i14 & 16384) == 0) {
        }
        if ((i14 & 32768) == 0) {
        }
        if ((i14 & 65536) == 0) {
        }
        if ((i14 & 131072) == 0) {
        }
        if ((262144 & i14) == 0) {
        }
        if ((i14 & 524288) != 0) {
        }
        if ((i14 & 1048576) != 0) {
        }
        if ((i14 & 2097152) != 0) {
        }
        int i26222222 = i19;
        if ((i14 & 4194304) != 0) {
        }
        i22 = i14 & 8388608;
        if (i22 != 0) {
        }
        if ((i15 & 306783379) != 306783378) {
        }
        if (i22 != 0) {
        }
        c3969l = u11;
        m2975FoundationBadgeImplWhIEsx8(modifier, labelModifier, startGraphicModifier, endGraphicModifier, f18, f19, f12, f13, f14, backgroundBrush, onClick, z11, abstractC8972b, abstractC8972b2, j11, j12, str, textStyle, j13, f15, f16, f17, contentPadding, z13, c3969l, i15 & 2147483646, i18 & 2147483646, i23 & 8190, 0);
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0342  */
    /* renamed from: FoundationBadgeImpl-WhIEsx8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2975FoundationBadgeImplWhIEsx8(e eVar, e eVar2, e eVar3, e eVar4, float f7, float f11, float f12, float f13, float f14, AbstractC7799Q abstractC7799Q, Function0<Unit> function0, boolean z11, AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, long j11, long j12, String str, T t2, long j13, float f15, float f16, float f17, InterfaceC9914x interfaceC9914x, boolean z12, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        InterfaceC9914x interfaceC9914x2;
        int i26;
        int i27;
        int i28;
        Object C11;
        boolean n11;
        Object C12;
        boolean n12;
        Object C13;
        float f18;
        int I11;
        String str2;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1893811506);
        if ((i14 & 1) != 0) {
            i15 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i15 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i11 & 48) == 0) {
            i15 |= u11.n(eVar2) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i16 = i15 | 384;
        } else {
            int i29 = i15;
            if ((i11 & 384) == 0) {
                i29 |= u11.n(eVar3) ? 256 : 128;
            }
            i16 = i29;
        }
        int i31 = i14 & 8;
        int i32 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i31 != 0) {
            i17 = i16 | 3072;
        } else {
            int i33 = i16;
            if ((i11 & 3072) == 0) {
                i33 |= u11.n(eVar4) ? 2048 : 1024;
            }
            i17 = i33;
        }
        if ((i14 & 16) != 0) {
            i18 = i17 | 24576;
        } else {
            int i34 = i17;
            if ((i11 & 24576) == 0) {
                i18 = i34 | (u11.q(f7) ? 16384 : 8192);
            } else {
                i18 = i34;
            }
        }
        if ((i14 & 32) != 0) {
            i19 = i18 | 196608;
        } else {
            int i35 = i18;
            if ((i11 & 196608) == 0) {
                i19 = i35 | (u11.q(f11) ? 131072 : 65536);
            } else {
                i19 = i35;
            }
        }
        if ((i14 & 64) != 0) {
            i19 |= 1572864;
            i21 = 1048576;
        } else {
            i21 = 1048576;
            if ((i11 & 1572864) == 0) {
                i19 |= u11.q(f12) ? 1048576 : 524288;
            }
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            i19 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            i22 = 8388608;
            i19 |= u11.q(f13) ? 8388608 : 4194304;
            if ((i14 & 256) == 0) {
                i19 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                i19 |= u11.q(f14) ? 67108864 : 33554432;
                if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    i19 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    i19 |= u11.n(abstractC7799Q) ? 536870912 : 268435456;
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    i23 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    i23 = i12 | (u11.F(function0) ? 4 : 2);
                } else {
                    i23 = i12;
                }
                if ((i14 & 2048) != 0) {
                    i23 |= 48;
                } else if ((i12 & 48) == 0) {
                    i23 |= u11.p(z11) ? 32 : 16;
                }
                int i36 = i23;
                if ((i14 & 4096) != 0) {
                    i36 |= 384;
                } else if ((i12 & 384) == 0) {
                    i36 |= u11.n(abstractC8972b) ? 256 : 128;
                }
                if ((i14 & 8192) != 0) {
                    i36 |= 3072;
                } else if ((i12 & 3072) == 0) {
                    i36 |= u11.n(abstractC8972b2) ? 2048 : 1024;
                }
                if ((i14 & 16384) != 0) {
                    i24 = i36 | 24576;
                } else {
                    i24 = i36;
                    if ((i12 & 24576) == 0) {
                        i24 |= u11.s(j11) ? 16384 : 8192;
                        if ((i14 & 32768) == 0) {
                            i24 |= 196608;
                        } else if ((i12 & 196608) == 0) {
                            i24 |= u11.s(j12) ? 131072 : 65536;
                        }
                        if ((i14 & 65536) == 0) {
                            i24 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            i24 |= u11.n(str) ? i21 : 524288;
                        }
                        if ((i14 & 131072) == 0) {
                            i24 |= 12582912;
                        } else if ((i12 & 12582912) == 0) {
                            i24 |= u11.n(t2) ? i22 : 4194304;
                        }
                        if ((i14 & 262144) == 0) {
                            i24 |= 100663296;
                        } else if ((i12 & 100663296) == 0) {
                            i24 |= u11.s(j13) ? 67108864 : 33554432;
                        }
                        if ((i14 & 524288) == 0) {
                            i24 |= 805306368;
                        } else if ((i12 & 805306368) == 0) {
                            i24 |= u11.q(f15) ? 536870912 : 268435456;
                        }
                        if ((i14 & i21) == 0) {
                            i25 = i13 | 6;
                        } else if ((i13 & 6) == 0) {
                            i25 = i13 | (u11.q(f16) ? 4 : 2);
                        } else {
                            i25 = i13;
                        }
                        if ((i14 & 2097152) == 0) {
                            i25 |= 48;
                        } else if ((i13 & 48) == 0) {
                            i25 |= u11.q(f17) ? 32 : 16;
                        }
                        int i37 = i25;
                        if ((i14 & 4194304) == 0) {
                            i26 = i37 | 384;
                            interfaceC9914x2 = interfaceC9914x;
                        } else {
                            int i38 = i37;
                            if ((i13 & 384) == 0) {
                                interfaceC9914x2 = interfaceC9914x;
                                i38 |= u11.n(interfaceC9914x2) ? 256 : 128;
                            } else {
                                interfaceC9914x2 = interfaceC9914x;
                            }
                            i26 = i38;
                        }
                        i27 = i14 & i22;
                        if (i27 == 0) {
                            i28 = i26 | 3072;
                        } else {
                            int i39 = i26;
                            if ((i13 & 3072) == 0) {
                                if (u11.p(z12)) {
                                    i32 = 2048;
                                }
                                i39 |= i32;
                            }
                            i28 = i39;
                        }
                        if ((i19 & 306783379) != 306783378 && (i24 & 306783379) == 306783378 && (i28 & 1171) == 1170 && u11.b()) {
                            u11.j();
                        } else {
                            boolean z13 = i27 == 0 ? false : z12;
                            u11.o(-1144144424);
                            C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                                C11 = p.a();
                                u11.x(C11);
                            }
                            q qVar = (q) C11;
                            u11.k();
                            D0<Boolean> m3045rememberIndicationTransitionFbhrOv8 = TransitionsKt.m3045rememberIndicationTransitionFbhrOv8(qVar, 0L, 0L, u11, 6, 3);
                            M a11 = N.a(u11);
                            z12 = z13;
                            d dVar = (d) u11.m(K0.e());
                            u11.o(-1144137111);
                            n11 = u11.n(a11) | ((i24 & 29360128) != i22) | ((i24 & 3670016) == i21) | u11.n(dVar);
                            C12 = u11.C();
                            if (!n11 || C12 == InterfaceC3967k.a.a()) {
                                C12 = h.a(str != null ? 0 : dVar.B((int) (M.a(a11, str, t2, dVar, 876).A() & 4294967295L)));
                                u11.x(C12);
                            }
                            float d11 = ((h) C12).d();
                            u11.k();
                            float max = Math.max(f7, interfaceC9914x2.d() + interfaceC9914x2.a() + d11);
                            FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2 foundationBadgeKt$FoundationBadgeImpl$contentOpacity$2 = FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2.INSTANCE;
                            U0 b11 = W0.b();
                            boolean booleanValue = m3045rememberIndicationTransitionFbhrOv8.h().booleanValue();
                            u11.o(967586918);
                            float f19 = !booleanValue ? 0.4f : 1.0f;
                            u11.k();
                            Float valueOf = Float.valueOf(f19);
                            boolean booleanValue2 = m3045rememberIndicationTransitionFbhrOv8.n().booleanValue();
                            u11.o(967586918);
                            float f21 = !booleanValue2 ? 0.4f : 1.0f;
                            u11.k();
                            D0.d d12 = H0.d(m3045rememberIndicationTransitionFbhrOv8, valueOf, Float.valueOf(f21), foundationBadgeKt$FoundationBadgeImpl$contentOpacity$2.invoke((FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2) m3045rememberIndicationTransitionFbhrOv8.m(), (D0.b<Boolean>) u11, (C3969l) 0), b11, u11, 196608);
                            a.b(eVar, "container");
                            e a12 = androidx.compose.foundation.e.a(C6988h.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(eVar), max), A0.h.c(f11, f12, f13, f14)), abstractC7799Q, null, 6);
                            u11.o(-1144096181);
                            n12 = u11.n(d12);
                            C13 = u11.C();
                            if (!n12 || C13 == InterfaceC3967k.a.a()) {
                                C13 = new FoundationBadgeKt$FoundationBadgeImpl$1$1(d12);
                                u11.x(C13);
                            }
                            u11.k();
                            e a13 = androidx.compose.ui.graphics.a.a(a12, (Function1) C13);
                            if (z11) {
                                f18 = 1.0f;
                            } else {
                                f18 = 1.0f;
                                a13 = a13.l0(i.b(e.f40358c0, qVar, null, z11, null, null, function0, 24));
                            }
                            e e11 = androidx.compose.foundation.layout.T.e(a13, interfaceC9914x2);
                            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                            I11 = u11.I();
                            A0 d13 = u11.d();
                            e f22 = c.f(u11, e11);
                            Function0 a14 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                                u11.e();
                            } else {
                                u11.H(a14);
                            }
                            Function2 h11 = Cm.e.h(u11, b12, u11, d13);
                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                Ep.a.d(I11, u11, I11, h11);
                            }
                            U7.i.b(u11, f22, 1803841390);
                            if (abstractC8972b == null) {
                                e j14 = androidx.compose.foundation.layout.T.j(eVar3, 0.0f, 0.0f, f15, 0.0f, 11);
                                a.b(j14, "startGraphic");
                                u11 = u11;
                                m2973BadgeIconFNF3uiM(a0.n(j14, f17), abstractC8972b, j11, u11, ((i24 >> 3) & 112) | ((i24 >> 6) & 896), 0);
                            } else {
                                u11 = u11;
                            }
                            u11.k();
                            u11.o(1803853025);
                            if (str != null) {
                                e l02 = eVar2.l0(new VerticalAlignElement(InterfaceC6250b.a.i()));
                                if (f18 <= 0.0d) {
                                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                                }
                                e l03 = l02.l0(new LayoutWeightElement(f18, false));
                                a.b(l03, "text");
                                if (z12) {
                                    String upperCase = str.toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    str2 = upperCase;
                                } else {
                                    str2 = str;
                                }
                                C3969l c3969l = u11;
                                u3.b(str2, l03, j12, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, t2, c3969l, (i24 >> 9) & 896, ((i24 >> 3) & 3670016) | 3120, 55288);
                                u11 = c3969l;
                            }
                            u11.k();
                            u11.o(1803868115);
                            if (z11 && abstractC8972b2 != null) {
                                e n13 = a0.n(androidx.compose.foundation.layout.T.j(eVar4, f16, 0.0f, 0.0f, 0.0f, 14), f17);
                                a.b(n13, "endGraphic");
                                m2973BadgeIconFNF3uiM(n13, abstractC8972b2, j13, u11, ((i24 >> 6) & 112) | ((i24 >> 18) & 896), 0);
                            }
                            u11.k();
                            u11.f();
                        }
                        boolean z14 = z12;
                        m02 = u11.m0();
                        if (m02 == null) {
                            m02.G(new FoundationBadgeKt$FoundationBadgeImpl$4(eVar, eVar2, eVar3, eVar4, f7, f11, f12, f13, f14, abstractC7799Q, function0, z11, abstractC8972b, abstractC8972b2, j11, j12, str, t2, j13, f15, f16, f17, interfaceC9914x, z14, i11, i12, i13, i14));
                            return;
                        }
                        return;
                    }
                }
                if ((i14 & 32768) == 0) {
                }
                if ((i14 & 65536) == 0) {
                }
                if ((i14 & 131072) == 0) {
                }
                if ((i14 & 262144) == 0) {
                }
                if ((i14 & 524288) == 0) {
                }
                if ((i14 & i21) == 0) {
                }
                if ((i14 & 2097152) == 0) {
                }
                int i372 = i25;
                if ((i14 & 4194304) == 0) {
                }
                i27 = i14 & i22;
                if (i27 == 0) {
                }
                if ((i19 & 306783379) != 306783378) {
                }
                if (i27 == 0) {
                }
                u11.o(-1144144424);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                q qVar2 = (q) C11;
                u11.k();
                D0<Boolean> m3045rememberIndicationTransitionFbhrOv82 = TransitionsKt.m3045rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, 6, 3);
                M a112 = N.a(u11);
                z12 = z13;
                d dVar2 = (d) u11.m(K0.e());
                u11.o(-1144137111);
                n11 = u11.n(a112) | ((i24 & 29360128) != i22) | ((i24 & 3670016) == i21) | u11.n(dVar2);
                C12 = u11.C();
                if (!n11) {
                }
                C12 = h.a(str != null ? 0 : dVar2.B((int) (M.a(a112, str, t2, dVar2, 876).A() & 4294967295L)));
                u11.x(C12);
                float d112 = ((h) C12).d();
                u11.k();
                float max2 = Math.max(f7, interfaceC9914x2.d() + interfaceC9914x2.a() + d112);
                FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2 foundationBadgeKt$FoundationBadgeImpl$contentOpacity$22 = FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2.INSTANCE;
                U0 b112 = W0.b();
                boolean booleanValue3 = m3045rememberIndicationTransitionFbhrOv82.h().booleanValue();
                u11.o(967586918);
                if (!booleanValue3) {
                }
                u11.k();
                Float valueOf2 = Float.valueOf(f19);
                boolean booleanValue22 = m3045rememberIndicationTransitionFbhrOv82.n().booleanValue();
                u11.o(967586918);
                if (!booleanValue22) {
                }
                u11.k();
                D0.d d122 = H0.d(m3045rememberIndicationTransitionFbhrOv82, valueOf2, Float.valueOf(f21), foundationBadgeKt$FoundationBadgeImpl$contentOpacity$22.invoke((FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2) m3045rememberIndicationTransitionFbhrOv82.m(), (D0.b<Boolean>) u11, (C3969l) 0), b112, u11, 196608);
                a.b(eVar, "container");
                e a122 = androidx.compose.foundation.e.a(C6988h.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(eVar), max2), A0.h.c(f11, f12, f13, f14)), abstractC7799Q, null, 6);
                u11.o(-1144096181);
                n12 = u11.n(d122);
                C13 = u11.C();
                if (!n12) {
                }
                C13 = new FoundationBadgeKt$FoundationBadgeImpl$1$1(d122);
                u11.x(C13);
                u11.k();
                e a132 = androidx.compose.ui.graphics.a.a(a122, (Function1) C13);
                if (z11) {
                }
                e e112 = androidx.compose.foundation.layout.T.e(a132, interfaceC9914x2);
                Y b122 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                I11 = u11.I();
                A0 d132 = u11.d();
                e f222 = c.f(u11, e112);
                Function0 a142 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h112 = Cm.e.h(u11, b122, u11, d132);
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, h112);
                U7.i.b(u11, f222, 1803841390);
                if (abstractC8972b == null) {
                }
                u11.k();
                u11.o(1803853025);
                if (str != null) {
                }
                u11.k();
                u11.o(1803868115);
                if (z11) {
                    e n132 = a0.n(androidx.compose.foundation.layout.T.j(eVar4, f16, 0.0f, 0.0f, 0.0f, 14), f17);
                    a.b(n132, "endGraphic");
                    m2973BadgeIconFNF3uiM(n132, abstractC8972b2, j13, u11, ((i24 >> 6) & 112) | ((i24 >> 18) & 896), 0);
                }
                u11.k();
                u11.f();
                boolean z142 = z12;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            }
            if ((i14 & 2048) != 0) {
            }
            int i362 = i23;
            if ((i14 & 4096) != 0) {
            }
            if ((i14 & 8192) != 0) {
            }
            if ((i14 & 16384) != 0) {
            }
            if ((i14 & 32768) == 0) {
            }
            if ((i14 & 65536) == 0) {
            }
            if ((i14 & 131072) == 0) {
            }
            if ((i14 & 262144) == 0) {
            }
            if ((i14 & 524288) == 0) {
            }
            if ((i14 & i21) == 0) {
            }
            if ((i14 & 2097152) == 0) {
            }
            int i3722 = i25;
            if ((i14 & 4194304) == 0) {
            }
            i27 = i14 & i22;
            if (i27 == 0) {
            }
            if ((i19 & 306783379) != 306783378) {
            }
            if (i27 == 0) {
            }
            u11.o(-1144144424);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            q qVar22 = (q) C11;
            u11.k();
            D0<Boolean> m3045rememberIndicationTransitionFbhrOv822 = TransitionsKt.m3045rememberIndicationTransitionFbhrOv8(qVar22, 0L, 0L, u11, 6, 3);
            M a1122 = N.a(u11);
            z12 = z13;
            d dVar22 = (d) u11.m(K0.e());
            u11.o(-1144137111);
            n11 = u11.n(a1122) | ((i24 & 29360128) != i22) | ((i24 & 3670016) == i21) | u11.n(dVar22);
            C12 = u11.C();
            if (!n11) {
            }
            C12 = h.a(str != null ? 0 : dVar22.B((int) (M.a(a1122, str, t2, dVar22, 876).A() & 4294967295L)));
            u11.x(C12);
            float d1122 = ((h) C12).d();
            u11.k();
            float max22 = Math.max(f7, interfaceC9914x2.d() + interfaceC9914x2.a() + d1122);
            FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2 foundationBadgeKt$FoundationBadgeImpl$contentOpacity$222 = FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2.INSTANCE;
            U0 b1122 = W0.b();
            boolean booleanValue32 = m3045rememberIndicationTransitionFbhrOv822.h().booleanValue();
            u11.o(967586918);
            if (!booleanValue32) {
            }
            u11.k();
            Float valueOf22 = Float.valueOf(f19);
            boolean booleanValue222 = m3045rememberIndicationTransitionFbhrOv822.n().booleanValue();
            u11.o(967586918);
            if (!booleanValue222) {
            }
            u11.k();
            D0.d d1222 = H0.d(m3045rememberIndicationTransitionFbhrOv822, valueOf22, Float.valueOf(f21), foundationBadgeKt$FoundationBadgeImpl$contentOpacity$222.invoke((FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2) m3045rememberIndicationTransitionFbhrOv822.m(), (D0.b<Boolean>) u11, (C3969l) 0), b1122, u11, 196608);
            a.b(eVar, "container");
            e a1222 = androidx.compose.foundation.e.a(C6988h.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(eVar), max22), A0.h.c(f11, f12, f13, f14)), abstractC7799Q, null, 6);
            u11.o(-1144096181);
            n12 = u11.n(d1222);
            C13 = u11.C();
            if (!n12) {
            }
            C13 = new FoundationBadgeKt$FoundationBadgeImpl$1$1(d1222);
            u11.x(C13);
            u11.k();
            e a1322 = androidx.compose.ui.graphics.a.a(a1222, (Function1) C13);
            if (z11) {
            }
            e e1122 = androidx.compose.foundation.layout.T.e(a1322, interfaceC9914x2);
            Y b1222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            I11 = u11.I();
            A0 d1322 = u11.d();
            e f2222 = c.f(u11, e1122);
            Function0 a1422 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h1122 = Cm.e.h(u11, b1222, u11, d1322);
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, h1122);
            U7.i.b(u11, f2222, 1803841390);
            if (abstractC8972b == null) {
            }
            u11.k();
            u11.o(1803853025);
            if (str != null) {
            }
            u11.k();
            u11.o(1803868115);
            if (z11) {
            }
            u11.k();
            u11.f();
            boolean z1422 = z12;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        i22 = 8388608;
        if ((i14 & 256) == 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
        }
        if ((i14 & 2048) != 0) {
        }
        int i3622 = i23;
        if ((i14 & 4096) != 0) {
        }
        if ((i14 & 8192) != 0) {
        }
        if ((i14 & 16384) != 0) {
        }
        if ((i14 & 32768) == 0) {
        }
        if ((i14 & 65536) == 0) {
        }
        if ((i14 & 131072) == 0) {
        }
        if ((i14 & 262144) == 0) {
        }
        if ((i14 & 524288) == 0) {
        }
        if ((i14 & i21) == 0) {
        }
        if ((i14 & 2097152) == 0) {
        }
        int i37222 = i25;
        if ((i14 & 4194304) == 0) {
        }
        i27 = i14 & i22;
        if (i27 == 0) {
        }
        if ((i19 & 306783379) != 306783378) {
        }
        if (i27 == 0) {
        }
        u11.o(-1144144424);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        q qVar222 = (q) C11;
        u11.k();
        D0<Boolean> m3045rememberIndicationTransitionFbhrOv8222 = TransitionsKt.m3045rememberIndicationTransitionFbhrOv8(qVar222, 0L, 0L, u11, 6, 3);
        M a11222 = N.a(u11);
        z12 = z13;
        d dVar222 = (d) u11.m(K0.e());
        u11.o(-1144137111);
        n11 = u11.n(a11222) | ((i24 & 29360128) != i22) | ((i24 & 3670016) == i21) | u11.n(dVar222);
        C12 = u11.C();
        if (!n11) {
        }
        C12 = h.a(str != null ? 0 : dVar222.B((int) (M.a(a11222, str, t2, dVar222, 876).A() & 4294967295L)));
        u11.x(C12);
        float d11222 = ((h) C12).d();
        u11.k();
        float max222 = Math.max(f7, interfaceC9914x2.d() + interfaceC9914x2.a() + d11222);
        FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2 foundationBadgeKt$FoundationBadgeImpl$contentOpacity$2222 = FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2.INSTANCE;
        U0 b11222 = W0.b();
        boolean booleanValue322 = m3045rememberIndicationTransitionFbhrOv8222.h().booleanValue();
        u11.o(967586918);
        if (!booleanValue322) {
        }
        u11.k();
        Float valueOf222 = Float.valueOf(f19);
        boolean booleanValue2222 = m3045rememberIndicationTransitionFbhrOv8222.n().booleanValue();
        u11.o(967586918);
        if (!booleanValue2222) {
        }
        u11.k();
        D0.d d12222 = H0.d(m3045rememberIndicationTransitionFbhrOv8222, valueOf222, Float.valueOf(f21), foundationBadgeKt$FoundationBadgeImpl$contentOpacity$2222.invoke((FoundationBadgeKt$FoundationBadgeImpl$contentOpacity$2) m3045rememberIndicationTransitionFbhrOv8222.m(), (D0.b<Boolean>) u11, (C3969l) 0), b11222, u11, 196608);
        a.b(eVar, "container");
        e a12222 = androidx.compose.foundation.e.a(C6988h.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(eVar), max222), A0.h.c(f11, f12, f13, f14)), abstractC7799Q, null, 6);
        u11.o(-1144096181);
        n12 = u11.n(d12222);
        C13 = u11.C();
        if (!n12) {
        }
        C13 = new FoundationBadgeKt$FoundationBadgeImpl$1$1(d12222);
        u11.x(C13);
        u11.k();
        e a13222 = androidx.compose.ui.graphics.a.a(a12222, (Function1) C13);
        if (z11) {
        }
        e e11222 = androidx.compose.foundation.layout.T.e(a13222, interfaceC9914x2);
        Y b12222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
        I11 = u11.I();
        A0 d13222 = u11.d();
        e f22222 = c.f(u11, e11222);
        Function0 a14222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h11222 = Cm.e.h(u11, b12222, u11, d13222);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, h11222);
        U7.i.b(u11, f22222, 1803841390);
        if (abstractC8972b == null) {
        }
        u11.k();
        u11.o(1803853025);
        if (str != null) {
        }
        u11.k();
        u11.o(1803868115);
        if (z11) {
        }
        u11.k();
        u11.f();
        boolean z14222 = z12;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FoundationBadgeImpl_WhIEsx8$lambda$4(A1<Float> a12) {
        return a12.getValue().floatValue();
    }
}
