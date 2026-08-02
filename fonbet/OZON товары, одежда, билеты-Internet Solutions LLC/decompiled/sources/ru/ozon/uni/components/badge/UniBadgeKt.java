package ru.ozon.uni.components.badge;

import A0.h;
import D1.InterfaceC2801g;
import Fr.g;
import K1.T;
import P0.E;
import P0.p2;
import P9.a;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import Z1.u;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import m0.D0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.components.badge.UniBadgeStyle;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.compose.tokens.UniTypography;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.utils.ModifierUtilsKt;
import ru.ozon.uni.ozi.utils.internal.AnimationUtilsKt;
import ru.ozon.uni.ozi.utils.internal.TransitionsKt;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.PainterUtilsKt;
import ru.ozon.uni.utils.UniTestTagsKt;
import t0.p;
import t0.q;
import u0.C9915y;

@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aq\u0010\u0017\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001au\u0010!\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\u001f\u0010 \u001ac\u0010!\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\"\u0010#\u001a)\u0010)\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b'\u0010(¨\u0006,²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"}, d2 = {"", "text", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "Lq1/b;", "leftIcon", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "styleType", "", "isNumeric", "Lru/ozon/uni/components/badge/UniBadgeSize;", "size", "hideDisclosure", "LZ1/h;", "cornerRadius", "Lru/ozon/uni/components/badge/UniBadgeStraightCorners;", "straightCorners", "contentDescription", "UniBadge-Wu8B24Y", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;Lq1/b;Lru/ozon/uni/components/badge/UniBadgeStyle;ZLru/ozon/uni/components/badge/UniBadgeSize;ZFLru/ozon/uni/components/badge/UniBadgeStraightCorners;Ljava/lang/String;LS0/k;III)V", "UniBadge", "UniBadge-V-95POc", "(Lq1/b;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;Lru/ozon/uni/components/badge/UniBadgeStyle;Lru/ozon/uni/components/badge/UniBadgeSize;ZFLru/ozon/uni/components/badge/UniBadgeStraightCorners;Ljava/lang/String;LS0/k;II)V", "label", "showChevron", "startGraphic", "style", "numeric", "UniBadgeImpl-rqE1x30", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;Lq1/b;Lru/ozon/uni/components/badge/UniBadgeStyle;ZLru/ozon/uni/components/badge/UniBadgeSize;FLru/ozon/uni/components/badge/UniBadgeStraightCorners;Ljava/lang/String;LS0/k;II)V", "UniBadgeImpl", "UniBadgeImpl-0vH8DBg", "(Lq1/b;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;Lru/ozon/uni/components/badge/UniBadgeStyle;Lru/ozon/uni/components/badge/UniBadgeSize;FLru/ozon/uni/components/badge/UniBadgeStraightCorners;Ljava/lang/String;LS0/k;I)V", "graphic", "Ll1/Z;", "color", "BadgeIcon-FNF3uiM", "(Landroidx/compose/ui/e;Lq1/b;JLS0/k;II)V", "BadgeIcon", "", "contentOpacity", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniBadgeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UniBadgeSize.values().length];
            try {
                iArr[UniBadgeSize.Size200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniBadgeSize.Size300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniBadgeSize.Size400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniBadgeSize.Size500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UniBadgeSize.Size600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BadgeIcon-FNF3uiM, reason: not valid java name */
    public static final void m1868BadgeIconFNF3uiM(e eVar, AbstractC8972b abstractC8972b, long j11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        AbstractC8972b abstractC8972b2;
        long j12;
        e eVar2;
        C3969l u11 = interfaceC3967k.u(-1398458666);
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
            E.a(abstractC8972b, null, eVar3, j11, u11, ((i13 >> 3) & 14) | 48 | ((i13 << 6) & 896) | ((i13 << 3) & 7168));
            abstractC8972b2 = abstractC8972b;
            j12 = j11;
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new UniBadgeKt$BadgeIcon$1(eVar2, abstractC8972b2, j12, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BasicBadge_WhIEsx8$lambda-9, reason: not valid java name */
    public static final float m1869BasicBadge_WhIEsx8$lambda9(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009f  */
    /* renamed from: UniBadge-V-95POc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1870UniBadgeV95POc(@NotNull AbstractC8972b leftIcon, Function0<Unit> function0, e eVar, UniBadgeStyle uniBadgeStyle, UniBadgeSize uniBadgeSize, boolean z11, float f7, UniBadgeStraightCorners uniBadgeStraightCorners, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        UniBadgeStyle uniBadgeStyle2;
        int i15;
        UniBadgeSize uniBadgeSize2;
        int i16;
        boolean z12;
        int i17;
        float f11;
        int i18;
        int i19;
        int i21;
        int i22;
        e eVar3;
        UniBadgeStyle uniBadgeStyle3;
        UniBadgeSize uniBadgeSize3;
        boolean z13;
        C3969l c3969l;
        String str2;
        UniBadgeStraightCorners uniBadgeStraightCorners2;
        float f12;
        J0 m02;
        Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
        C3969l u11 = interfaceC3967k.u(-1810702202);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(leftIcon) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function0) ? 32 : 16;
        }
        int i23 = i12 & 4;
        if (i23 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                uniBadgeStyle2 = uniBadgeStyle;
                i13 |= u11.n(uniBadgeStyle2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    uniBadgeSize2 = uniBadgeSize;
                    i13 |= u11.n(uniBadgeSize2) ? 16384 : 8192;
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        z12 = z11;
                        i13 |= u11.p(z12) ? 131072 : 65536;
                        i17 = i12 & 64;
                        if (i17 != 0) {
                            i13 |= 1572864;
                        } else if ((1572864 & i11) == 0) {
                            f11 = f7;
                            i13 |= u11.q(f11) ? 1048576 : 524288;
                            i18 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i18 == 0) {
                                i13 |= 12582912;
                            } else if ((i11 & 12582912) == 0) {
                                i19 = i18;
                                i13 |= u11.n(uniBadgeStraightCorners) ? 8388608 : 4194304;
                                i21 = i12 & 256;
                                if (i21 != 0) {
                                    i13 |= 100663296;
                                } else if ((i11 & 100663296) == 0) {
                                    i22 = i21;
                                    i13 |= u11.n(str) ? 67108864 : 33554432;
                                    int i24 = i13;
                                    if ((i13 & 38347923) == 38347922 || !u11.b()) {
                                        eVar3 = i23 == 0 ? e.f40358c0 : eVar2;
                                        uniBadgeStyle3 = i14 == 0 ? UniBadgeStyle.NeutralPrimary.INSTANCE : uniBadgeStyle2;
                                        uniBadgeSize3 = i15 == 0 ? UniBadgeSize.Size500 : uniBadgeSize2;
                                        z13 = false;
                                        if (i16 != 0) {
                                            z12 = false;
                                        }
                                        float f13 = i17 == 0 ? Float.NaN : f11;
                                        UniBadgeStraightCorners uniBadgeStraightCorners3 = i19 == 0 ? null : uniBadgeStraightCorners;
                                        String str3 = i22 == 0 ? null : str;
                                        if (function0 != null && !z12) {
                                            z13 = true;
                                        }
                                        int i25 = i24 << 3;
                                        m1872UniBadgeImpl0vH8DBg(leftIcon, z13, function0, eVar3, uniBadgeStyle3, uniBadgeSize3, f13, uniBadgeStraightCorners3, str3, u11, (i24 & 234881024) | (i24 & 14) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (i25 & 458752) | (i24 & 3670016) | (i24 & 29360128));
                                        c3969l = u11;
                                        str2 = str3;
                                        uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                                        f12 = f13;
                                    } else {
                                        u11.j();
                                        eVar3 = eVar2;
                                        uniBadgeStyle3 = uniBadgeStyle2;
                                        uniBadgeSize3 = uniBadgeSize2;
                                        c3969l = u11;
                                        f12 = f11;
                                        uniBadgeStraightCorners2 = uniBadgeStraightCorners;
                                        str2 = str;
                                    }
                                    boolean z14 = z12;
                                    m02 = c3969l.m0();
                                    if (m02 == null) {
                                        m02.G(new UniBadgeKt$UniBadge$2(leftIcon, function0, eVar3, uniBadgeStyle3, uniBadgeSize3, z14, f12, uniBadgeStraightCorners2, str2, i11, i12));
                                        return;
                                    }
                                    return;
                                }
                                i22 = i21;
                                int i242 = i13;
                                if ((i13 & 38347923) == 38347922) {
                                }
                                if (i23 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                z13 = false;
                                if (i16 != 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (function0 != null) {
                                    z13 = true;
                                }
                                int i252 = i242 << 3;
                                m1872UniBadgeImpl0vH8DBg(leftIcon, z13, function0, eVar3, uniBadgeStyle3, uniBadgeSize3, f13, uniBadgeStraightCorners3, str3, u11, (i242 & 234881024) | (i242 & 14) | (i252 & 896) | (i252 & 7168) | (57344 & i252) | (i252 & 458752) | (i242 & 3670016) | (i242 & 29360128));
                                c3969l = u11;
                                str2 = str3;
                                uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                                f12 = f13;
                                boolean z142 = z12;
                                m02 = c3969l.m0();
                                if (m02 == null) {
                                }
                            }
                            i19 = i18;
                            i21 = i12 & 256;
                            if (i21 != 0) {
                            }
                            i22 = i21;
                            int i2422 = i13;
                            if ((i13 & 38347923) == 38347922) {
                            }
                            if (i23 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            z13 = false;
                            if (i16 != 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (function0 != null) {
                            }
                            int i2522 = i2422 << 3;
                            m1872UniBadgeImpl0vH8DBg(leftIcon, z13, function0, eVar3, uniBadgeStyle3, uniBadgeSize3, f13, uniBadgeStraightCorners3, str3, u11, (i2422 & 234881024) | (i2422 & 14) | (i2522 & 896) | (i2522 & 7168) | (57344 & i2522) | (i2522 & 458752) | (i2422 & 3670016) | (i2422 & 29360128));
                            c3969l = u11;
                            str2 = str3;
                            uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                            f12 = f13;
                            boolean z1422 = z12;
                            m02 = c3969l.m0();
                            if (m02 == null) {
                            }
                        }
                        f11 = f7;
                        i18 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i18 == 0) {
                        }
                        i19 = i18;
                        i21 = i12 & 256;
                        if (i21 != 0) {
                        }
                        i22 = i21;
                        int i24222 = i13;
                        if ((i13 & 38347923) == 38347922) {
                        }
                        if (i23 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        z13 = false;
                        if (i16 != 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (function0 != null) {
                        }
                        int i25222 = i24222 << 3;
                        m1872UniBadgeImpl0vH8DBg(leftIcon, z13, function0, eVar3, uniBadgeStyle3, uniBadgeSize3, f13, uniBadgeStraightCorners3, str3, u11, (i24222 & 234881024) | (i24222 & 14) | (i25222 & 896) | (i25222 & 7168) | (57344 & i25222) | (i25222 & 458752) | (i24222 & 3670016) | (i24222 & 29360128));
                        c3969l = u11;
                        str2 = str3;
                        uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                        f12 = f13;
                        boolean z14222 = z12;
                        m02 = c3969l.m0();
                        if (m02 == null) {
                        }
                    }
                    z12 = z11;
                    i17 = i12 & 64;
                    if (i17 != 0) {
                    }
                    f11 = f7;
                    i18 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i18 == 0) {
                    }
                    i19 = i18;
                    i21 = i12 & 256;
                    if (i21 != 0) {
                    }
                    i22 = i21;
                    int i242222 = i13;
                    if ((i13 & 38347923) == 38347922) {
                    }
                    if (i23 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    z13 = false;
                    if (i16 != 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (function0 != null) {
                    }
                    int i252222 = i242222 << 3;
                    m1872UniBadgeImpl0vH8DBg(leftIcon, z13, function0, eVar3, uniBadgeStyle3, uniBadgeSize3, f13, uniBadgeStraightCorners3, str3, u11, (i242222 & 234881024) | (i242222 & 14) | (i252222 & 896) | (i252222 & 7168) | (57344 & i252222) | (i252222 & 458752) | (i242222 & 3670016) | (i242222 & 29360128));
                    c3969l = u11;
                    str2 = str3;
                    uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                    f12 = f13;
                    boolean z142222 = z12;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                    }
                }
                uniBadgeSize2 = uniBadgeSize;
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                z12 = z11;
                i17 = i12 & 64;
                if (i17 != 0) {
                }
                f11 = f7;
                i18 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i18 == 0) {
                }
                i19 = i18;
                i21 = i12 & 256;
                if (i21 != 0) {
                }
                i22 = i21;
                int i2422222 = i13;
                if ((i13 & 38347923) == 38347922) {
                }
                if (i23 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                z13 = false;
                if (i16 != 0) {
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                if (i22 == 0) {
                }
                if (function0 != null) {
                }
                int i2522222 = i2422222 << 3;
                m1872UniBadgeImpl0vH8DBg(leftIcon, z13, function0, eVar3, uniBadgeStyle3, uniBadgeSize3, f13, uniBadgeStraightCorners3, str3, u11, (i2422222 & 234881024) | (i2422222 & 14) | (i2522222 & 896) | (i2522222 & 7168) | (57344 & i2522222) | (i2522222 & 458752) | (i2422222 & 3670016) | (i2422222 & 29360128));
                c3969l = u11;
                str2 = str3;
                uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                f12 = f13;
                boolean z1422222 = z12;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            uniBadgeStyle2 = uniBadgeStyle;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            uniBadgeSize2 = uniBadgeSize;
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            z12 = z11;
            i17 = i12 & 64;
            if (i17 != 0) {
            }
            f11 = f7;
            i18 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i18 == 0) {
            }
            i19 = i18;
            i21 = i12 & 256;
            if (i21 != 0) {
            }
            i22 = i21;
            int i24222222 = i13;
            if ((i13 & 38347923) == 38347922) {
            }
            if (i23 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            z13 = false;
            if (i16 != 0) {
            }
            if (i17 == 0) {
            }
            if (i19 == 0) {
            }
            if (i22 == 0) {
            }
            if (function0 != null) {
            }
            int i25222222 = i24222222 << 3;
            m1872UniBadgeImpl0vH8DBg(leftIcon, z13, function0, eVar3, uniBadgeStyle3, uniBadgeSize3, f13, uniBadgeStraightCorners3, str3, u11, (i24222222 & 234881024) | (i24222222 & 14) | (i25222222 & 896) | (i25222222 & 7168) | (57344 & i25222222) | (i25222222 & 458752) | (i24222222 & 3670016) | (i24222222 & 29360128));
            c3969l = u11;
            str2 = str3;
            uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
            f12 = f13;
            boolean z14222222 = z12;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        uniBadgeStyle2 = uniBadgeStyle;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        uniBadgeSize2 = uniBadgeSize;
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        z12 = z11;
        i17 = i12 & 64;
        if (i17 != 0) {
        }
        f11 = f7;
        i18 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i18 == 0) {
        }
        i19 = i18;
        i21 = i12 & 256;
        if (i21 != 0) {
        }
        i22 = i21;
        int i242222222 = i13;
        if ((i13 & 38347923) == 38347922) {
        }
        if (i23 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        z13 = false;
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
        if (i19 == 0) {
        }
        if (i22 == 0) {
        }
        if (function0 != null) {
        }
        int i252222222 = i242222222 << 3;
        m1872UniBadgeImpl0vH8DBg(leftIcon, z13, function0, eVar3, uniBadgeStyle3, uniBadgeSize3, f13, uniBadgeStraightCorners3, str3, u11, (i242222222 & 234881024) | (i242222222 & 14) | (i252222222 & 896) | (i252222222 & 7168) | (57344 & i252222222) | (i252222222 & 458752) | (i242222222 & 3670016) | (i242222222 & 29360128));
        c3969l = u11;
        str2 = str3;
        uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
        f12 = f13;
        boolean z142222222 = z12;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fe  */
    /* renamed from: UniBadge-Wu8B24Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1871UniBadgeWu8B24Y(@NotNull String text, Function0<Unit> function0, e eVar, AbstractC8972b abstractC8972b, UniBadgeStyle uniBadgeStyle, boolean z11, UniBadgeSize uniBadgeSize, boolean z12, float f7, UniBadgeStraightCorners uniBadgeStraightCorners, String str, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        e eVar2;
        int i15;
        AbstractC8972b abstractC8972b2;
        int i16;
        UniBadgeStyle uniBadgeStyle2;
        int i17;
        boolean z13;
        int i18;
        UniBadgeSize uniBadgeSize2;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        UniBadgeStyle uniBadgeStyle3;
        boolean z14;
        UniBadgeSize uniBadgeSize3;
        AbstractC8972b abstractC8972b3;
        e eVar3;
        boolean z15;
        C3969l c3969l;
        String str2;
        UniBadgeStraightCorners uniBadgeStraightCorners2;
        float f11;
        boolean z16;
        J0 m02;
        Intrinsics.checkNotNullParameter(text, "text");
        C3969l u11 = interfaceC3967k.u(534160941);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.n(text) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= u11.F(function0) ? 32 : 16;
        }
        int i29 = i13 & 4;
        if (i29 != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i14 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i15 = i13 & 8;
            if (i15 == 0) {
                i14 |= 3072;
            } else if ((i11 & 3072) == 0) {
                abstractC8972b2 = abstractC8972b;
                i14 |= u11.n(abstractC8972b2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i16 = i13 & 16;
                if (i16 != 0) {
                    i14 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    uniBadgeStyle2 = uniBadgeStyle;
                    i14 |= u11.n(uniBadgeStyle2) ? 16384 : 8192;
                    i17 = i13 & 32;
                    if (i17 == 0) {
                        i14 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        z13 = z11;
                        i14 |= u11.p(z13) ? 131072 : 65536;
                        i18 = i13 & 64;
                        if (i18 != 0) {
                            i14 |= 1572864;
                            uniBadgeSize2 = uniBadgeSize;
                        } else {
                            uniBadgeSize2 = uniBadgeSize;
                            if ((i11 & 1572864) == 0) {
                                i14 |= u11.n(uniBadgeSize2) ? 1048576 : 524288;
                            }
                        }
                        i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i19 != 0) {
                            i14 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            i21 = i14 | (u11.p(z12) ? 8388608 : 4194304);
                            i22 = i13 & 256;
                            if (i22 == 0) {
                                i21 |= 100663296;
                            } else if ((i11 & 100663296) == 0) {
                                i23 = i22;
                                i21 |= u11.q(f7) ? 67108864 : 33554432;
                                i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                                if (i24 != 0) {
                                    i21 |= 805306368;
                                } else if ((i11 & 805306368) == 0) {
                                    i25 = i24;
                                    i21 |= u11.n(uniBadgeStraightCorners) ? 536870912 : 268435456;
                                    i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                                    if (i26 == 0) {
                                        i28 = i12 | 6;
                                        i27 = i26;
                                    } else if ((i12 & 6) == 0) {
                                        i27 = i26;
                                        i28 = i12 | (u11.n(str) ? 4 : 2);
                                    } else {
                                        i27 = i26;
                                        i28 = i12;
                                    }
                                    if ((i21 & 306783379) != 306783378 && (i28 & 3) == 2 && u11.b()) {
                                        u11.j();
                                        f11 = f7;
                                        uniBadgeSize3 = uniBadgeSize2;
                                        eVar3 = eVar2;
                                        abstractC8972b3 = abstractC8972b2;
                                        uniBadgeStyle3 = uniBadgeStyle2;
                                        c3969l = u11;
                                        z15 = z13;
                                        z16 = z12;
                                        uniBadgeStraightCorners2 = uniBadgeStraightCorners;
                                        str2 = str;
                                    } else {
                                        if (i29 != 0) {
                                            eVar2 = e.f40358c0;
                                        }
                                        if (i15 != 0) {
                                            abstractC8972b2 = null;
                                        }
                                        uniBadgeStyle3 = i16 == 0 ? UniBadgeStyle.NeutralPrimary.INSTANCE : uniBadgeStyle2;
                                        z14 = false;
                                        if (i17 != 0) {
                                            z13 = false;
                                        }
                                        if (i18 != 0) {
                                            uniBadgeSize2 = UniBadgeSize.Size500;
                                        }
                                        uniBadgeSize3 = uniBadgeSize2;
                                        boolean z17 = i19 == 0 ? false : z12;
                                        float f12 = i23 == 0 ? Float.NaN : f7;
                                        UniBadgeStraightCorners uniBadgeStraightCorners3 = i25 == 0 ? null : uniBadgeStraightCorners;
                                        String str3 = i27 == 0 ? null : str;
                                        if (function0 != null && !z17) {
                                            z14 = true;
                                        }
                                        int i31 = i21 << 3;
                                        abstractC8972b3 = abstractC8972b2;
                                        float f13 = f12;
                                        eVar3 = eVar2;
                                        z15 = z13;
                                        m1873UniBadgeImplrqE1x30(text, z14, function0, eVar3, abstractC8972b3, uniBadgeStyle3, z15, uniBadgeSize3, f13, uniBadgeStraightCorners3, str3, u11, (i21 & 14) | (i31 & 896) | (i31 & 7168) | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (i31 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), i28 & 14);
                                        c3969l = u11;
                                        str2 = str3;
                                        uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                                        f11 = f13;
                                        z16 = z17;
                                    }
                                    m02 = c3969l.m0();
                                    if (m02 == null) {
                                        m02.G(new UniBadgeKt$UniBadge$1(text, function0, eVar3, abstractC8972b3, uniBadgeStyle3, z15, uniBadgeSize3, z16, f11, uniBadgeStraightCorners2, str2, i11, i12, i13));
                                        return;
                                    }
                                    return;
                                }
                                i25 = i24;
                                i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                                if (i26 == 0) {
                                }
                                if ((i21 & 306783379) != 306783378) {
                                }
                                if (i29 != 0) {
                                }
                                if (i15 != 0) {
                                }
                                if (i16 == 0) {
                                }
                                z14 = false;
                                if (i17 != 0) {
                                }
                                if (i18 != 0) {
                                }
                                uniBadgeSize3 = uniBadgeSize2;
                                if (i19 == 0) {
                                }
                                if (i23 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                if (function0 != null) {
                                    z14 = true;
                                }
                                int i312 = i21 << 3;
                                abstractC8972b3 = abstractC8972b2;
                                float f132 = f12;
                                eVar3 = eVar2;
                                z15 = z13;
                                m1873UniBadgeImplrqE1x30(text, z14, function0, eVar3, abstractC8972b3, uniBadgeStyle3, z15, uniBadgeSize3, f132, uniBadgeStraightCorners3, str3, u11, (i21 & 14) | (i312 & 896) | (i312 & 7168) | (57344 & i312) | (458752 & i312) | (3670016 & i312) | (i312 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), i28 & 14);
                                c3969l = u11;
                                str2 = str3;
                                uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                                f11 = f132;
                                z16 = z17;
                                m02 = c3969l.m0();
                                if (m02 == null) {
                                }
                            }
                            i23 = i22;
                            i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                            if (i24 != 0) {
                            }
                            i25 = i24;
                            i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                            if (i26 == 0) {
                            }
                            if ((i21 & 306783379) != 306783378) {
                            }
                            if (i29 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 == 0) {
                            }
                            z14 = false;
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            uniBadgeSize3 = uniBadgeSize2;
                            if (i19 == 0) {
                            }
                            if (i23 == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i27 == 0) {
                            }
                            if (function0 != null) {
                            }
                            int i3122 = i21 << 3;
                            abstractC8972b3 = abstractC8972b2;
                            float f1322 = f12;
                            eVar3 = eVar2;
                            z15 = z13;
                            m1873UniBadgeImplrqE1x30(text, z14, function0, eVar3, abstractC8972b3, uniBadgeStyle3, z15, uniBadgeSize3, f1322, uniBadgeStraightCorners3, str3, u11, (i21 & 14) | (i3122 & 896) | (i3122 & 7168) | (57344 & i3122) | (458752 & i3122) | (3670016 & i3122) | (i3122 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), i28 & 14);
                            c3969l = u11;
                            str2 = str3;
                            uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                            f11 = f1322;
                            z16 = z17;
                            m02 = c3969l.m0();
                            if (m02 == null) {
                            }
                        }
                        i21 = i14;
                        i22 = i13 & 256;
                        if (i22 == 0) {
                        }
                        i23 = i22;
                        i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i24 != 0) {
                        }
                        i25 = i24;
                        i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                        if (i26 == 0) {
                        }
                        if ((i21 & 306783379) != 306783378) {
                        }
                        if (i29 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 == 0) {
                        }
                        z14 = false;
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        uniBadgeSize3 = uniBadgeSize2;
                        if (i19 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        if (function0 != null) {
                        }
                        int i31222 = i21 << 3;
                        abstractC8972b3 = abstractC8972b2;
                        float f13222 = f12;
                        eVar3 = eVar2;
                        z15 = z13;
                        m1873UniBadgeImplrqE1x30(text, z14, function0, eVar3, abstractC8972b3, uniBadgeStyle3, z15, uniBadgeSize3, f13222, uniBadgeStraightCorners3, str3, u11, (i21 & 14) | (i31222 & 896) | (i31222 & 7168) | (57344 & i31222) | (458752 & i31222) | (3670016 & i31222) | (i31222 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), i28 & 14);
                        c3969l = u11;
                        str2 = str3;
                        uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                        f11 = f13222;
                        z16 = z17;
                        m02 = c3969l.m0();
                        if (m02 == null) {
                        }
                    }
                    z13 = z11;
                    i18 = i13 & 64;
                    if (i18 != 0) {
                    }
                    i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i19 != 0) {
                    }
                    i21 = i14;
                    i22 = i13 & 256;
                    if (i22 == 0) {
                    }
                    i23 = i22;
                    i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i24 != 0) {
                    }
                    i25 = i24;
                    i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i26 == 0) {
                    }
                    if ((i21 & 306783379) != 306783378) {
                    }
                    if (i29 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 == 0) {
                    }
                    z14 = false;
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    uniBadgeSize3 = uniBadgeSize2;
                    if (i19 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    if (function0 != null) {
                    }
                    int i312222 = i21 << 3;
                    abstractC8972b3 = abstractC8972b2;
                    float f132222 = f12;
                    eVar3 = eVar2;
                    z15 = z13;
                    m1873UniBadgeImplrqE1x30(text, z14, function0, eVar3, abstractC8972b3, uniBadgeStyle3, z15, uniBadgeSize3, f132222, uniBadgeStraightCorners3, str3, u11, (i21 & 14) | (i312222 & 896) | (i312222 & 7168) | (57344 & i312222) | (458752 & i312222) | (3670016 & i312222) | (i312222 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), i28 & 14);
                    c3969l = u11;
                    str2 = str3;
                    uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                    f11 = f132222;
                    z16 = z17;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                    }
                }
                uniBadgeStyle2 = uniBadgeStyle;
                i17 = i13 & 32;
                if (i17 == 0) {
                }
                z13 = z11;
                i18 = i13 & 64;
                if (i18 != 0) {
                }
                i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i19 != 0) {
                }
                i21 = i14;
                i22 = i13 & 256;
                if (i22 == 0) {
                }
                i23 = i22;
                i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i24 != 0) {
                }
                i25 = i24;
                i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i26 == 0) {
                }
                if ((i21 & 306783379) != 306783378) {
                }
                if (i29 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 == 0) {
                }
                z14 = false;
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                uniBadgeSize3 = uniBadgeSize2;
                if (i19 == 0) {
                }
                if (i23 == 0) {
                }
                if (i25 == 0) {
                }
                if (i27 == 0) {
                }
                if (function0 != null) {
                }
                int i3122222 = i21 << 3;
                abstractC8972b3 = abstractC8972b2;
                float f1322222 = f12;
                eVar3 = eVar2;
                z15 = z13;
                m1873UniBadgeImplrqE1x30(text, z14, function0, eVar3, abstractC8972b3, uniBadgeStyle3, z15, uniBadgeSize3, f1322222, uniBadgeStraightCorners3, str3, u11, (i21 & 14) | (i3122222 & 896) | (i3122222 & 7168) | (57344 & i3122222) | (458752 & i3122222) | (3670016 & i3122222) | (i3122222 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), i28 & 14);
                c3969l = u11;
                str2 = str3;
                uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
                f11 = f1322222;
                z16 = z17;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            abstractC8972b2 = abstractC8972b;
            i16 = i13 & 16;
            if (i16 != 0) {
            }
            uniBadgeStyle2 = uniBadgeStyle;
            i17 = i13 & 32;
            if (i17 == 0) {
            }
            z13 = z11;
            i18 = i13 & 64;
            if (i18 != 0) {
            }
            i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i19 != 0) {
            }
            i21 = i14;
            i22 = i13 & 256;
            if (i22 == 0) {
            }
            i23 = i22;
            i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i24 != 0) {
            }
            i25 = i24;
            i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i26 == 0) {
            }
            if ((i21 & 306783379) != 306783378) {
            }
            if (i29 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 == 0) {
            }
            z14 = false;
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            uniBadgeSize3 = uniBadgeSize2;
            if (i19 == 0) {
            }
            if (i23 == 0) {
            }
            if (i25 == 0) {
            }
            if (i27 == 0) {
            }
            if (function0 != null) {
            }
            int i31222222 = i21 << 3;
            abstractC8972b3 = abstractC8972b2;
            float f13222222 = f12;
            eVar3 = eVar2;
            z15 = z13;
            m1873UniBadgeImplrqE1x30(text, z14, function0, eVar3, abstractC8972b3, uniBadgeStyle3, z15, uniBadgeSize3, f13222222, uniBadgeStraightCorners3, str3, u11, (i21 & 14) | (i31222222 & 896) | (i31222222 & 7168) | (57344 & i31222222) | (458752 & i31222222) | (3670016 & i31222222) | (i31222222 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), i28 & 14);
            c3969l = u11;
            str2 = str3;
            uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
            f11 = f13222222;
            z16 = z17;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i15 = i13 & 8;
        if (i15 == 0) {
        }
        abstractC8972b2 = abstractC8972b;
        i16 = i13 & 16;
        if (i16 != 0) {
        }
        uniBadgeStyle2 = uniBadgeStyle;
        i17 = i13 & 32;
        if (i17 == 0) {
        }
        z13 = z11;
        i18 = i13 & 64;
        if (i18 != 0) {
        }
        i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i19 != 0) {
        }
        i21 = i14;
        i22 = i13 & 256;
        if (i22 == 0) {
        }
        i23 = i22;
        i24 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i24 != 0) {
        }
        i25 = i24;
        i26 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i26 == 0) {
        }
        if ((i21 & 306783379) != 306783378) {
        }
        if (i29 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 == 0) {
        }
        z14 = false;
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        uniBadgeSize3 = uniBadgeSize2;
        if (i19 == 0) {
        }
        if (i23 == 0) {
        }
        if (i25 == 0) {
        }
        if (i27 == 0) {
        }
        if (function0 != null) {
        }
        int i312222222 = i21 << 3;
        abstractC8972b3 = abstractC8972b2;
        float f132222222 = f12;
        eVar3 = eVar2;
        z15 = z13;
        m1873UniBadgeImplrqE1x30(text, z14, function0, eVar3, abstractC8972b3, uniBadgeStyle3, z15, uniBadgeSize3, f132222222, uniBadgeStraightCorners3, str3, u11, (i21 & 14) | (i312222222 & 896) | (i312222222 & 7168) | (57344 & i312222222) | (458752 & i312222222) | (3670016 & i312222222) | (i312222222 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), i28 & 14);
        c3969l = u11;
        str2 = str3;
        uniBadgeStraightCorners2 = uniBadgeStraightCorners3;
        f11 = f132222222;
        z16 = z17;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00fb, code lost:
    
        if (r40 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00ff, code lost:
    
        if (r40 == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0336 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017c  */
    /* renamed from: UniBadgeImpl-0vH8DBg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1872UniBadgeImpl0vH8DBg(AbstractC8972b abstractC8972b, boolean z11, Function0<Unit> function0, e eVar, UniBadgeStyle uniBadgeStyle, UniBadgeSize uniBadgeSize, float f7, UniBadgeStraightCorners uniBadgeStraightCorners, String str, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        float f11;
        int i13;
        int i14;
        float f12;
        int i15;
        int i16;
        float f13;
        int i17;
        float f14;
        boolean z12;
        float f15;
        AbstractC8972b abstractC8972b2;
        long value;
        float f16;
        float f17;
        C9915y c9915y;
        Object C11;
        float f18;
        float e11;
        boolean n11;
        Object C12;
        float f19;
        C9915y c9915y2;
        int i18;
        int I11;
        C3969l c3969l;
        C3969l c3969l2;
        C3969l u11 = interfaceC3967k.u(1356166342);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(abstractC8972b) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(eVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(uniBadgeStyle) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(uniBadgeSize) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            f11 = f7;
            i12 |= u11.q(f11) ? 1048576 : 524288;
        } else {
            f11 = f7;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.n(uniBadgeStraightCorners) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.n(str) ? 67108864 : 33554432;
        }
        if ((38347923 & i12) == 38347922 && u11.b()) {
            u11.j();
            c3969l2 = u11;
        } else {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i19 = iArr[uniBadgeSize.ordinal()];
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 3) {
                        if (i19 != 4) {
                            if (i19 != 5) {
                                throw new o();
                            }
                            i13 = 8;
                        } else if (z11) {
                            i13 = 6;
                        }
                    }
                    i13 = 4;
                }
                float f21 = i13;
                if (z11) {
                    int i21 = iArr[uniBadgeSize.ordinal()];
                    if (i21 == 1) {
                        i14 = 0;
                    } else if (i21 == 2 || i21 == 3 || i21 == 4) {
                        i14 = 2;
                    } else {
                        if (i21 != 5) {
                            throw new o();
                        }
                        i14 = 4;
                    }
                    f12 = i14;
                } else {
                    f12 = f21;
                }
                i15 = iArr[uniBadgeSize.ordinal()];
                if (i15 == 1) {
                    i16 = 1;
                } else if (i15 == 2 || i15 == 3) {
                    i16 = 2;
                } else if (i15 == 4) {
                    i16 = 4;
                } else {
                    if (i15 != 5) {
                        throw new o();
                    }
                    i16 = 8;
                }
                float f22 = i16;
                float m1878getCornerRadiusD9Ej5fM$uni_release = !Float.isNaN(f11) ? f11 : uniBadgeSize.m1878getCornerRadiusD9Ej5fM$uni_release();
                u11.o(-1849019925);
                e.a aVar = e.f40358c0;
                e uniTestTag = UniTestTagsKt.uniTestTag(aVar, UniBadgeTestTags.Container, null, u11, 54, 2);
                int i22 = i12;
                u11.o(-1849019741);
                if (str != null) {
                    u11.o(-1891564754);
                    boolean z13 = (i22 & 234881024) == 67108864;
                    Object C13 = u11.C();
                    if (z13 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new UniBadgeKt$UniBadgeImpl$4$1$1(str);
                        u11.x(C13);
                    }
                    u11.k();
                    uniTestTag = I1.o.c(uniTestTag, false, (Function1) C13);
                }
                u11.k();
                u11.k();
                e l02 = uniTestTag.l0(eVar);
                UniTestTagsKt.uniTestTag(aVar, UniBadgeTestTags.Text, null, u11, 54, 2);
                e uniTestTag2 = UniTestTagsKt.uniTestTag(aVar, UniBadgeTestTags.LeftIcon, null, u11, 54, 2);
                e uniTestTag3 = UniTestTagsKt.uniTestTag(aVar, UniBadgeTestTags.Chevron, null, u11, 54, 2);
                float m1879getHeightD9Ej5fM$uni_release = uniBadgeSize.m1879getHeightD9Ej5fM$uni_release();
                if (uniBadgeStraightCorners != null) {
                    f13 = m1878getCornerRadiusD9Ej5fM$uni_release;
                    if (uniBadgeStraightCorners.getTopLeft()) {
                        i17 = 0;
                        f14 = 0;
                        if (uniBadgeStraightCorners == null) {
                            z12 = true;
                            if (uniBadgeStraightCorners.getTopRight()) {
                                f15 = i17;
                                float f23 = (uniBadgeStraightCorners == null && uniBadgeStraightCorners.getBottomRight() == z12) ? i17 : f13;
                                float f24 = (uniBadgeStraightCorners == null && uniBadgeStraightCorners.getBottomLeft() == z12) ? i17 : f13;
                                AbstractC7799Q value2 = DeferredBrush.getValue(uniBadgeStyle.getBackgroundDefBrush(), u11, i17);
                                UniTheme uniTheme = UniTheme.INSTANCE;
                                uniTheme.getIcons();
                                u11.B(-886331929);
                                AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                                u11.K();
                                if (!z11) {
                                    uniPainterResource = null;
                                }
                                abstractC8972b2 = uniPainterResource;
                                float f25 = f14;
                                float f26 = f15;
                                long m3266takeIfNotMulticolorIconDxMtmZc = PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniBadgeStyle.getStartGraphicDefColor(), u11, 0), abstractC8972b);
                                DeferredColor.getValue(uniBadgeStyle.getLabelDefColor(), u11, 0);
                                T bodyControl300XSmall = uniTheme.getTypography().getBodyControl300XSmall();
                                value = DeferredColor.getValue(uniBadgeStyle.getEndGraphicDefColor(), u11, 0);
                                float f27 = 0;
                                UniBadgeSize uniBadgeSize2 = UniBadgeSize.Size200;
                                f16 = (uniBadgeSize != uniBadgeSize2 || uniBadgeSize == UniBadgeSize.Size300 || uniBadgeSize == UniBadgeSize.Size400) ? f27 : 2;
                                f17 = (uniBadgeSize != uniBadgeSize2 || uniBadgeSize == UniBadgeSize.Size300) ? 12 : 16;
                                c9915y = new C9915y(f21, f22, f12, f22);
                                int i23 = ((i22 >> 6) & 14) | 806879232 | (i22 & 112) | ((i22 << 6) & 896);
                                u11.o(1137039003);
                                u11.o(-399766680);
                                C11 = u11.C();
                                if (C11 == InterfaceC3967k.a.a()) {
                                    C11 = p.a();
                                    u11.x(C11);
                                }
                                q qVar = (q) C11;
                                u11.k();
                                f18 = m1879getHeightD9Ej5fM$uni_release;
                                D0<Boolean> m3245rememberIndicationTransitionFbhrOv8 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(qVar, 0L, 0L, u11, 6, 3);
                                e11 = u.e(bodyControl300XSmall.i());
                                if (Float.compare(f18, e11) < 0) {
                                    f18 = e11;
                                }
                                A1<Float> animateClickAlpha = AnimationUtilsKt.animateClickAlpha(m3245rememberIndicationTransitionFbhrOv8, 0.0f, 0.0f, u11, 0, 3);
                                a.b(l02, "container");
                                e a11 = androidx.compose.foundation.e.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(l02), f18), value2, h.c(f25, f26, f23, f24), 4);
                                u11.o(-399740229);
                                n11 = u11.n(animateClickAlpha);
                                C12 = u11.C();
                                if (!n11 || C12 == InterfaceC3967k.a.a()) {
                                    C12 = new UniBadgeKt$BasicBadge$1$1(animateClickAlpha);
                                    u11.x(C12);
                                }
                                u11.k();
                                e a12 = androidx.compose.ui.graphics.a.a(a11, (Function1) C12);
                                if (z11 || function0 == null) {
                                    f19 = f17;
                                    c9915y2 = c9915y;
                                    i18 = 1;
                                } else {
                                    Intrinsics.f(function0);
                                    f19 = f17;
                                    c9915y2 = c9915y;
                                    i18 = 1;
                                    a12 = a12.l0(i.b(aVar, qVar, null, z11, null, null, function0, 24));
                                }
                                e e12 = androidx.compose.foundation.layout.T.e(a0.u(a12, i18), c9915y2);
                                Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                                I11 = u11.I();
                                A0 d11 = u11.d();
                                e f28 = c.f(u11, e12);
                                Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                    u11.H(a13);
                                } else {
                                    u11.e();
                                }
                                Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                    Ep.a.d(I11, u11, I11, h11);
                                }
                                U7.i.b(u11, f28, 778545310);
                                if (abstractC8972b != null) {
                                    e j11 = androidx.compose.foundation.layout.T.j(uniTestTag2, 0.0f, 0.0f, f27, 0.0f, 11);
                                    a.b(j11, "startGraphic");
                                    m1868BadgeIconFNF3uiM(a0.n(j11, f19), abstractC8972b, m3266takeIfNotMulticolorIconDxMtmZc, u11, (i23 >> 3) & 112, 0);
                                    c3969l = u11;
                                } else {
                                    c3969l = u11;
                                }
                                c3969l.k();
                                c3969l.o(778556990);
                                c3969l.k();
                                c3969l.o(778573475);
                                if (z11 && abstractC8972b2 != null) {
                                    e n12 = a0.n(androidx.compose.foundation.layout.T.j(uniTestTag3, f16, 0.0f, 0.0f, 0.0f, 14), f19);
                                    a.b(n12, "endGraphic");
                                    m1868BadgeIconFNF3uiM(n12, abstractC8972b2, value, c3969l, 0, 0);
                                }
                                c3969l2 = c3969l;
                                c3969l2.k();
                                c3969l2.f();
                                c3969l2.k();
                            }
                        } else {
                            z12 = true;
                        }
                        f15 = f13;
                        if (uniBadgeStraightCorners == null) {
                        }
                        if (uniBadgeStraightCorners == null) {
                        }
                        AbstractC7799Q value22 = DeferredBrush.getValue(uniBadgeStyle.getBackgroundDefBrush(), u11, i17);
                        UniTheme uniTheme2 = UniTheme.INSTANCE;
                        uniTheme2.getIcons();
                        u11.B(-886331929);
                        AbstractC8972b uniPainterResource2 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                        u11.K();
                        if (!z11) {
                        }
                        abstractC8972b2 = uniPainterResource2;
                        float f252 = f14;
                        float f262 = f15;
                        long m3266takeIfNotMulticolorIconDxMtmZc2 = PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniBadgeStyle.getStartGraphicDefColor(), u11, 0), abstractC8972b);
                        DeferredColor.getValue(uniBadgeStyle.getLabelDefColor(), u11, 0);
                        T bodyControl300XSmall2 = uniTheme2.getTypography().getBodyControl300XSmall();
                        value = DeferredColor.getValue(uniBadgeStyle.getEndGraphicDefColor(), u11, 0);
                        float f272 = 0;
                        UniBadgeSize uniBadgeSize22 = UniBadgeSize.Size200;
                        if (uniBadgeSize != uniBadgeSize22) {
                        }
                        f17 = (uniBadgeSize != uniBadgeSize22 || uniBadgeSize == UniBadgeSize.Size300) ? 12 : 16;
                        c9915y = new C9915y(f21, f22, f12, f22);
                        int i232 = ((i22 >> 6) & 14) | 806879232 | (i22 & 112) | ((i22 << 6) & 896);
                        u11.o(1137039003);
                        u11.o(-399766680);
                        C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                        }
                        q qVar2 = (q) C11;
                        u11.k();
                        f18 = m1879getHeightD9Ej5fM$uni_release;
                        D0<Boolean> m3245rememberIndicationTransitionFbhrOv82 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, 6, 3);
                        e11 = u.e(bodyControl300XSmall2.i());
                        if (Float.compare(f18, e11) < 0) {
                        }
                        A1<Float> animateClickAlpha2 = AnimationUtilsKt.animateClickAlpha(m3245rememberIndicationTransitionFbhrOv82, 0.0f, 0.0f, u11, 0, 3);
                        a.b(l02, "container");
                        e a112 = androidx.compose.foundation.e.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(l02), f18), value22, h.c(f252, f262, f23, f24), 4);
                        u11.o(-399740229);
                        n11 = u11.n(animateClickAlpha2);
                        C12 = u11.C();
                        if (!n11) {
                        }
                        C12 = new UniBadgeKt$BasicBadge$1$1(animateClickAlpha2);
                        u11.x(C12);
                        u11.k();
                        e a122 = androidx.compose.ui.graphics.a.a(a112, (Function1) C12);
                        if (z11) {
                        }
                        f19 = f17;
                        c9915y2 = c9915y;
                        i18 = 1;
                        e e122 = androidx.compose.foundation.layout.T.e(a0.u(a122, i18), c9915y2);
                        Y b112 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                        I11 = u11.I();
                        A0 d112 = u11.d();
                        e f282 = c.f(u11, e122);
                        Function0 a132 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 h112 = Cm.e.h(u11, b112, u11, d112);
                        if (!u11.t()) {
                        }
                        Ep.a.d(I11, u11, I11, h112);
                        U7.i.b(u11, f282, 778545310);
                        if (abstractC8972b != null) {
                        }
                        c3969l.k();
                        c3969l.o(778556990);
                        c3969l.k();
                        c3969l.o(778573475);
                        if (z11) {
                            e n122 = a0.n(androidx.compose.foundation.layout.T.j(uniTestTag3, f16, 0.0f, 0.0f, 0.0f, 14), f19);
                            a.b(n122, "endGraphic");
                            m1868BadgeIconFNF3uiM(n122, abstractC8972b2, value, c3969l, 0, 0);
                        }
                        c3969l2 = c3969l;
                        c3969l2.k();
                        c3969l2.f();
                        c3969l2.k();
                    }
                } else {
                    f13 = m1878getCornerRadiusD9Ej5fM$uni_release;
                }
                i17 = 0;
                f14 = f13;
                if (uniBadgeStraightCorners == null) {
                }
                f15 = f13;
                if (uniBadgeStraightCorners == null) {
                }
                if (uniBadgeStraightCorners == null) {
                }
                AbstractC7799Q value222 = DeferredBrush.getValue(uniBadgeStyle.getBackgroundDefBrush(), u11, i17);
                UniTheme uniTheme22 = UniTheme.INSTANCE;
                uniTheme22.getIcons();
                u11.B(-886331929);
                AbstractC8972b uniPainterResource22 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                u11.K();
                if (!z11) {
                }
                abstractC8972b2 = uniPainterResource22;
                float f2522 = f14;
                float f2622 = f15;
                long m3266takeIfNotMulticolorIconDxMtmZc22 = PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniBadgeStyle.getStartGraphicDefColor(), u11, 0), abstractC8972b);
                DeferredColor.getValue(uniBadgeStyle.getLabelDefColor(), u11, 0);
                T bodyControl300XSmall22 = uniTheme22.getTypography().getBodyControl300XSmall();
                value = DeferredColor.getValue(uniBadgeStyle.getEndGraphicDefColor(), u11, 0);
                float f2722 = 0;
                UniBadgeSize uniBadgeSize222 = UniBadgeSize.Size200;
                if (uniBadgeSize != uniBadgeSize222) {
                }
                f17 = (uniBadgeSize != uniBadgeSize222 || uniBadgeSize == UniBadgeSize.Size300) ? 12 : 16;
                c9915y = new C9915y(f21, f22, f12, f22);
                int i2322 = ((i22 >> 6) & 14) | 806879232 | (i22 & 112) | ((i22 << 6) & 896);
                u11.o(1137039003);
                u11.o(-399766680);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                q qVar22 = (q) C11;
                u11.k();
                f18 = m1879getHeightD9Ej5fM$uni_release;
                D0<Boolean> m3245rememberIndicationTransitionFbhrOv822 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(qVar22, 0L, 0L, u11, 6, 3);
                e11 = u.e(bodyControl300XSmall22.i());
                if (Float.compare(f18, e11) < 0) {
                }
                A1<Float> animateClickAlpha22 = AnimationUtilsKt.animateClickAlpha(m3245rememberIndicationTransitionFbhrOv822, 0.0f, 0.0f, u11, 0, 3);
                a.b(l02, "container");
                e a1122 = androidx.compose.foundation.e.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(l02), f18), value222, h.c(f2522, f2622, f23, f24), 4);
                u11.o(-399740229);
                n11 = u11.n(animateClickAlpha22);
                C12 = u11.C();
                if (!n11) {
                }
                C12 = new UniBadgeKt$BasicBadge$1$1(animateClickAlpha22);
                u11.x(C12);
                u11.k();
                e a1222 = androidx.compose.ui.graphics.a.a(a1122, (Function1) C12);
                if (z11) {
                }
                f19 = f17;
                c9915y2 = c9915y;
                i18 = 1;
                e e1222 = androidx.compose.foundation.layout.T.e(a0.u(a1222, i18), c9915y2);
                Y b1122 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                I11 = u11.I();
                A0 d1122 = u11.d();
                e f2822 = c.f(u11, e1222);
                Function0 a1322 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h1122 = Cm.e.h(u11, b1122, u11, d1122);
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, h1122);
                U7.i.b(u11, f2822, 778545310);
                if (abstractC8972b != null) {
                }
                c3969l.k();
                c3969l.o(778556990);
                c3969l.k();
                c3969l.o(778573475);
                if (z11) {
                }
                c3969l2 = c3969l;
                c3969l2.k();
                c3969l2.f();
                c3969l2.k();
            } else {
                if (!z11) {
                    i13 = 1;
                    float f212 = i13;
                    if (z11) {
                    }
                    i15 = iArr[uniBadgeSize.ordinal()];
                    if (i15 == 1) {
                    }
                    float f222 = i16;
                    if (!Float.isNaN(f11)) {
                    }
                    u11.o(-1849019925);
                    e.a aVar2 = e.f40358c0;
                    e uniTestTag4 = UniTestTagsKt.uniTestTag(aVar2, UniBadgeTestTags.Container, null, u11, 54, 2);
                    int i222 = i12;
                    u11.o(-1849019741);
                    if (str != null) {
                    }
                    u11.k();
                    u11.k();
                    e l022 = uniTestTag4.l0(eVar);
                    UniTestTagsKt.uniTestTag(aVar2, UniBadgeTestTags.Text, null, u11, 54, 2);
                    e uniTestTag22 = UniTestTagsKt.uniTestTag(aVar2, UniBadgeTestTags.LeftIcon, null, u11, 54, 2);
                    e uniTestTag32 = UniTestTagsKt.uniTestTag(aVar2, UniBadgeTestTags.Chevron, null, u11, 54, 2);
                    float m1879getHeightD9Ej5fM$uni_release2 = uniBadgeSize.m1879getHeightD9Ej5fM$uni_release();
                    if (uniBadgeStraightCorners != null) {
                    }
                    i17 = 0;
                    f14 = f13;
                    if (uniBadgeStraightCorners == null) {
                    }
                    f15 = f13;
                    if (uniBadgeStraightCorners == null) {
                    }
                    if (uniBadgeStraightCorners == null) {
                    }
                    AbstractC7799Q value2222 = DeferredBrush.getValue(uniBadgeStyle.getBackgroundDefBrush(), u11, i17);
                    UniTheme uniTheme222 = UniTheme.INSTANCE;
                    uniTheme222.getIcons();
                    u11.B(-886331929);
                    AbstractC8972b uniPainterResource222 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                    u11.K();
                    if (!z11) {
                    }
                    abstractC8972b2 = uniPainterResource222;
                    float f25222 = f14;
                    float f26222 = f15;
                    long m3266takeIfNotMulticolorIconDxMtmZc222 = PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniBadgeStyle.getStartGraphicDefColor(), u11, 0), abstractC8972b);
                    DeferredColor.getValue(uniBadgeStyle.getLabelDefColor(), u11, 0);
                    T bodyControl300XSmall222 = uniTheme222.getTypography().getBodyControl300XSmall();
                    value = DeferredColor.getValue(uniBadgeStyle.getEndGraphicDefColor(), u11, 0);
                    float f27222 = 0;
                    UniBadgeSize uniBadgeSize2222 = UniBadgeSize.Size200;
                    if (uniBadgeSize != uniBadgeSize2222) {
                    }
                    f17 = (uniBadgeSize != uniBadgeSize2222 || uniBadgeSize == UniBadgeSize.Size300) ? 12 : 16;
                    c9915y = new C9915y(f212, f222, f12, f222);
                    int i23222 = ((i222 >> 6) & 14) | 806879232 | (i222 & 112) | ((i222 << 6) & 896);
                    u11.o(1137039003);
                    u11.o(-399766680);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                    }
                    q qVar222 = (q) C11;
                    u11.k();
                    f18 = m1879getHeightD9Ej5fM$uni_release2;
                    D0<Boolean> m3245rememberIndicationTransitionFbhrOv8222 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(qVar222, 0L, 0L, u11, 6, 3);
                    e11 = u.e(bodyControl300XSmall222.i());
                    if (Float.compare(f18, e11) < 0) {
                    }
                    A1<Float> animateClickAlpha222 = AnimationUtilsKt.animateClickAlpha(m3245rememberIndicationTransitionFbhrOv8222, 0.0f, 0.0f, u11, 0, 3);
                    a.b(l022, "container");
                    e a11222 = androidx.compose.foundation.e.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(l022), f18), value2222, h.c(f25222, f26222, f23, f24), 4);
                    u11.o(-399740229);
                    n11 = u11.n(animateClickAlpha222);
                    C12 = u11.C();
                    if (!n11) {
                    }
                    C12 = new UniBadgeKt$BasicBadge$1$1(animateClickAlpha222);
                    u11.x(C12);
                    u11.k();
                    e a12222 = androidx.compose.ui.graphics.a.a(a11222, (Function1) C12);
                    if (z11) {
                    }
                    f19 = f17;
                    c9915y2 = c9915y;
                    i18 = 1;
                    e e12222 = androidx.compose.foundation.layout.T.e(a0.u(a12222, i18), c9915y2);
                    Y b11222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                    I11 = u11.I();
                    A0 d11222 = u11.d();
                    e f28222 = c.f(u11, e12222);
                    Function0 a13222 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 h11222 = Cm.e.h(u11, b11222, u11, d11222);
                    if (!u11.t()) {
                    }
                    Ep.a.d(I11, u11, I11, h11222);
                    U7.i.b(u11, f28222, 778545310);
                    if (abstractC8972b != null) {
                    }
                    c3969l.k();
                    c3969l.o(778556990);
                    c3969l.k();
                    c3969l.o(778573475);
                    if (z11) {
                    }
                    c3969l2 = c3969l;
                    c3969l2.k();
                    c3969l2.f();
                    c3969l2.k();
                }
                i13 = 2;
                float f2122 = i13;
                if (z11) {
                }
                i15 = iArr[uniBadgeSize.ordinal()];
                if (i15 == 1) {
                }
                float f2222 = i16;
                if (!Float.isNaN(f11)) {
                }
                u11.o(-1849019925);
                e.a aVar22 = e.f40358c0;
                e uniTestTag42 = UniTestTagsKt.uniTestTag(aVar22, UniBadgeTestTags.Container, null, u11, 54, 2);
                int i2222 = i12;
                u11.o(-1849019741);
                if (str != null) {
                }
                u11.k();
                u11.k();
                e l0222 = uniTestTag42.l0(eVar);
                UniTestTagsKt.uniTestTag(aVar22, UniBadgeTestTags.Text, null, u11, 54, 2);
                e uniTestTag222 = UniTestTagsKt.uniTestTag(aVar22, UniBadgeTestTags.LeftIcon, null, u11, 54, 2);
                e uniTestTag322 = UniTestTagsKt.uniTestTag(aVar22, UniBadgeTestTags.Chevron, null, u11, 54, 2);
                float m1879getHeightD9Ej5fM$uni_release22 = uniBadgeSize.m1879getHeightD9Ej5fM$uni_release();
                if (uniBadgeStraightCorners != null) {
                }
                i17 = 0;
                f14 = f13;
                if (uniBadgeStraightCorners == null) {
                }
                f15 = f13;
                if (uniBadgeStraightCorners == null) {
                }
                if (uniBadgeStraightCorners == null) {
                }
                AbstractC7799Q value22222 = DeferredBrush.getValue(uniBadgeStyle.getBackgroundDefBrush(), u11, i17);
                UniTheme uniTheme2222 = UniTheme.INSTANCE;
                uniTheme2222.getIcons();
                u11.B(-886331929);
                AbstractC8972b uniPainterResource2222 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                u11.K();
                if (!z11) {
                }
                abstractC8972b2 = uniPainterResource2222;
                float f252222 = f14;
                float f262222 = f15;
                long m3266takeIfNotMulticolorIconDxMtmZc2222 = PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniBadgeStyle.getStartGraphicDefColor(), u11, 0), abstractC8972b);
                DeferredColor.getValue(uniBadgeStyle.getLabelDefColor(), u11, 0);
                T bodyControl300XSmall2222 = uniTheme2222.getTypography().getBodyControl300XSmall();
                value = DeferredColor.getValue(uniBadgeStyle.getEndGraphicDefColor(), u11, 0);
                float f272222 = 0;
                UniBadgeSize uniBadgeSize22222 = UniBadgeSize.Size200;
                if (uniBadgeSize != uniBadgeSize22222) {
                }
                f17 = (uniBadgeSize != uniBadgeSize22222 || uniBadgeSize == UniBadgeSize.Size300) ? 12 : 16;
                c9915y = new C9915y(f2122, f2222, f12, f2222);
                int i232222 = ((i2222 >> 6) & 14) | 806879232 | (i2222 & 112) | ((i2222 << 6) & 896);
                u11.o(1137039003);
                u11.o(-399766680);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                q qVar2222 = (q) C11;
                u11.k();
                f18 = m1879getHeightD9Ej5fM$uni_release22;
                D0<Boolean> m3245rememberIndicationTransitionFbhrOv82222 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(qVar2222, 0L, 0L, u11, 6, 3);
                e11 = u.e(bodyControl300XSmall2222.i());
                if (Float.compare(f18, e11) < 0) {
                }
                A1<Float> animateClickAlpha2222 = AnimationUtilsKt.animateClickAlpha(m3245rememberIndicationTransitionFbhrOv82222, 0.0f, 0.0f, u11, 0, 3);
                a.b(l0222, "container");
                e a112222 = androidx.compose.foundation.e.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(l0222), f18), value22222, h.c(f252222, f262222, f23, f24), 4);
                u11.o(-399740229);
                n11 = u11.n(animateClickAlpha2222);
                C12 = u11.C();
                if (!n11) {
                }
                C12 = new UniBadgeKt$BasicBadge$1$1(animateClickAlpha2222);
                u11.x(C12);
                u11.k();
                e a122222 = androidx.compose.ui.graphics.a.a(a112222, (Function1) C12);
                if (z11) {
                }
                f19 = f17;
                c9915y2 = c9915y;
                i18 = 1;
                e e122222 = androidx.compose.foundation.layout.T.e(a0.u(a122222, i18), c9915y2);
                Y b112222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                I11 = u11.I();
                A0 d112222 = u11.d();
                e f282222 = c.f(u11, e122222);
                Function0 a132222 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h112222 = Cm.e.h(u11, b112222, u11, d112222);
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, h112222);
                U7.i.b(u11, f282222, 778545310);
                if (abstractC8972b != null) {
                }
                c3969l.k();
                c3969l.o(778556990);
                c3969l.k();
                c3969l.o(778573475);
                if (z11) {
                }
                c3969l2 = c3969l;
                c3969l2.k();
                c3969l2.f();
                c3969l2.k();
            }
        }
        J0 m02 = c3969l2.m0();
        if (m02 != null) {
            m02.G(new UniBadgeKt$UniBadgeImpl$6(abstractC8972b, z11, function0, eVar, uniBadgeStyle, uniBadgeSize, f7, uniBadgeStraightCorners, str, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x018d, code lost:
    
        if (r51 != null) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x055f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01c8  */
    /* renamed from: UniBadgeImpl-rqE1x30, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1873UniBadgeImplrqE1x30(String str, boolean z11, Function0<Unit> function0, e eVar, AbstractC8972b abstractC8972b, UniBadgeStyle uniBadgeStyle, boolean z12, UniBadgeSize uniBadgeSize, float f7, UniBadgeStraightCorners uniBadgeStraightCorners, String str2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        T body200XSmall;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        boolean z13;
        Object C11;
        float m1879getHeightD9Ej5fM$uni_release;
        e eVar2;
        int i23;
        float f11;
        float f12;
        boolean z14;
        float f13;
        UniBadgeSize uniBadgeSize2;
        boolean z15;
        float f14;
        C9915y c9915y;
        Object C12;
        float e11;
        boolean n11;
        Object C13;
        C3969l c3969l;
        C9915y c9915y2;
        e eVar3;
        int i24;
        int I11;
        C3969l c3969l2;
        String str3;
        C3969l c3969l3;
        String str4;
        C3969l u11 = interfaceC3967k.u(-1225457427);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i13 |= u11.n(eVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.n(abstractC8972b) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= u11.n(uniBadgeStyle) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= u11.p(z12) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= u11.n(uniBadgeSize) ? 8388608 : 4194304;
        }
        int i25 = i13;
        if ((i11 & 100663296) == 0) {
            i14 = i25 | (u11.q(f7) ? 67108864 : 33554432);
        } else {
            i14 = i25;
        }
        if ((i11 & 805306368) == 0) {
            i14 |= u11.n(uniBadgeStraightCorners) ? 536870912 : 268435456;
        }
        int i26 = i14;
        if ((i12 & 6) == 0) {
            i15 = i12 | (u11.n(str2) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i26 & 306783379) == 306783378 && (i15 & 3) == 2 && u11.b()) {
            u11.j();
            str3 = str;
            c3969l3 = u11;
        } else {
            UniTheme uniTheme = UniTheme.INSTANCE;
            UniTypography typography = uniTheme.getTypography();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i27 = iArr[uniBadgeSize.ordinal()];
            if (i27 == 1) {
                body200XSmall = typography.getBody200XSmall();
            } else if (i27 == 2) {
                body200XSmall = z12 ? typography.getBodyNumeric200XSmall() : typography.getBodyAccent250Caption();
            } else if (i27 == 3) {
                body200XSmall = z12 ? typography.getBodyNumeric300XSmall() : typography.getBodyControl300XSmall();
            } else if (i27 == 4) {
                body200XSmall = z12 ? typography.getBodyNumeric400Small() : typography.getBodyControl400Small();
            } else {
                if (i27 != 5) {
                    throw new o();
                }
                body200XSmall = z12 ? typography.getBodyNumeric500Medium() : typography.getBodyControl500Medium();
            }
            T t2 = body200XSmall;
            int i28 = iArr[uniBadgeSize.ordinal()];
            if (i28 != 1) {
                if (i28 == 2) {
                    if (abstractC8972b == null) {
                        i16 = 5;
                    }
                    i16 = 3;
                } else if (i28 != 3) {
                    if (i28 != 4) {
                        if (i28 != 5) {
                            throw new o();
                        }
                        if (abstractC8972b == null) {
                            i16 = 12;
                        }
                    }
                    i16 = 8;
                } else {
                    if (abstractC8972b != null) {
                        i16 = 4;
                    }
                    i16 = 6;
                }
                float f15 = i16;
                if (z11) {
                    int i29 = iArr[uniBadgeSize.ordinal()];
                    if (i29 == 1) {
                        i17 = 0;
                    } else if (i29 == 2 || i29 == 3 || i29 == 4) {
                        i17 = 2;
                    } else {
                        if (i29 != 5) {
                            throw new o();
                        }
                        i17 = 4;
                    }
                } else {
                    int i31 = iArr[uniBadgeSize.ordinal()];
                    if (i31 == 1) {
                        i17 = 3;
                    } else if (i31 == 2) {
                        i17 = 5;
                    } else if (i31 == 3) {
                        i17 = 6;
                    } else if (i31 == 4) {
                        i17 = 8;
                    } else {
                        if (i31 != 5) {
                            throw new o();
                        }
                        i17 = 12;
                    }
                }
                float f16 = i17;
                i18 = iArr[uniBadgeSize.ordinal()];
                if (i18 != 1 || i18 == 2) {
                    i19 = 0;
                } else if (i18 == 3 || i18 == 4) {
                    i19 = 2;
                } else {
                    if (i18 != 5) {
                        throw new o();
                    }
                    i19 = 4;
                }
                float f17 = i19;
                float m1878getCornerRadiusD9Ej5fM$uni_release = !Float.isNaN(f7) ? f7 : uniBadgeSize.m1878getCornerRadiusD9Ej5fM$uni_release();
                i21 = iArr[uniBadgeSize.ordinal()];
                if (i21 != 1) {
                    if (i21 != 2 && i21 != 3) {
                        if (i21 != 4 && i21 != 5) {
                            throw new o();
                        }
                        i22 = 4;
                        float f18 = i22;
                        e.a aVar = e.f40358c0;
                        e uniTestTag = UniTestTagsKt.uniTestTag(aVar, UniBadgeTestTags.Container, null, u11, 54, 2);
                        u11.o(-1849114472);
                        z13 = ((i15 & 14) != 4) | ((i26 & 14) != 4);
                        C11 = u11.C();
                        if (!z13 || C11 == InterfaceC3967k.a.a()) {
                            C11 = new UniBadgeKt$UniBadgeImpl$1$1(str2, str);
                            u11.x(C11);
                        }
                        u11.k();
                        e l02 = I1.o.c(uniTestTag, false, (Function1) C11).l0(eVar);
                        e uniTestTag2 = UniTestTagsKt.uniTestTag(aVar, UniBadgeTestTags.Text, null, u11, 54, 2);
                        e uniTestTag3 = UniTestTagsKt.uniTestTag(aVar, UniBadgeTestTags.LeftIcon, PainterUtilsKt.getIconNameTestTagParameter(abstractC8972b, UniBadgeTestTags.INSTANCE.getLeftIconName()), u11, 54, 0);
                        e uniTestTag4 = UniTestTagsKt.uniTestTag(aVar, UniBadgeTestTags.Chevron, null, u11, 54, 2);
                        m1879getHeightD9Ej5fM$uni_release = uniBadgeSize.m1879getHeightD9Ej5fM$uni_release();
                        if (uniBadgeStraightCorners == null) {
                            eVar2 = uniTestTag2;
                            if (uniBadgeStraightCorners.getTopLeft()) {
                                i23 = 0;
                                f11 = 0;
                                f12 = m1878getCornerRadiusD9Ej5fM$uni_release;
                                if (uniBadgeStraightCorners != null) {
                                    z14 = true;
                                    if (uniBadgeStraightCorners.getTopRight()) {
                                        f13 = i23;
                                        float f19 = (uniBadgeStraightCorners == null && uniBadgeStraightCorners.getBottomRight() == z14) ? i23 : f12;
                                        float f21 = (uniBadgeStraightCorners == null && uniBadgeStraightCorners.getBottomLeft() == z14) ? i23 : f12;
                                        AbstractC7799Q value = DeferredBrush.getValue(uniBadgeStyle.getBackgroundDefBrush(), u11, i23);
                                        uniTheme.getIcons();
                                        u11.B(-886331929);
                                        AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                                        u11.K();
                                        if (!z11) {
                                            uniPainterResource = null;
                                        }
                                        AbstractC8972b abstractC8972b2 = uniPainterResource;
                                        float f22 = f11;
                                        float f23 = f13;
                                        long m3266takeIfNotMulticolorIconDxMtmZc = PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniBadgeStyle.getStartGraphicDefColor(), u11, 0), abstractC8972b);
                                        long value2 = DeferredColor.getValue(uniBadgeStyle.getLabelDefColor(), u11, 0);
                                        long value3 = DeferredColor.getValue(uniBadgeStyle.getEndGraphicDefColor(), u11, 0);
                                        uniBadgeSize2 = UniBadgeSize.Size200;
                                        if (uniBadgeSize != uniBadgeSize2 || uniBadgeSize == UniBadgeSize.Size300 || uniBadgeSize == UniBadgeSize.Size400) {
                                            z15 = false;
                                            f14 = 0;
                                        } else {
                                            f14 = 2;
                                            z15 = false;
                                        }
                                        float f24 = (uniBadgeSize != uniBadgeSize2 || uniBadgeSize == UniBadgeSize.Size300) ? 12 : 16;
                                        c9915y = new C9915y(f15, f17, f16, f17);
                                        boolean z16 = uniBadgeSize != UniBadgeSize.Size300 ? true : z15;
                                        int i32 = i26 >> 6;
                                        int i33 = (i32 & 896) | (i32 & 14) | (i26 & 112) | ((i26 << 18) & 3670016);
                                        u11.o(1137039003);
                                        u11.o(-399766680);
                                        C12 = u11.C();
                                        if (C12 == InterfaceC3967k.a.a()) {
                                            C12 = p.a();
                                            u11.x(C12);
                                        }
                                        q qVar = (q) C12;
                                        u11.k();
                                        D0<Boolean> m3245rememberIndicationTransitionFbhrOv8 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(qVar, 0L, 0L, u11, 6, 3);
                                        e11 = u.e(t2.i());
                                        if (Float.compare(m1879getHeightD9Ej5fM$uni_release, e11) < 0) {
                                            m1879getHeightD9Ej5fM$uni_release = e11;
                                        }
                                        A1<Float> animateClickAlpha = AnimationUtilsKt.animateClickAlpha(m3245rememberIndicationTransitionFbhrOv8, 0.0f, 0.0f, u11, 0, 3);
                                        a.b(l02, "container");
                                        e a11 = androidx.compose.foundation.e.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(l02), m1879getHeightD9Ej5fM$uni_release), value, h.c(f22, f23, f19, f21), 4);
                                        u11.o(-399740229);
                                        n11 = u11.n(animateClickAlpha);
                                        C13 = u11.C();
                                        if (!n11 || C13 == InterfaceC3967k.a.a()) {
                                            C13 = new UniBadgeKt$BasicBadge$1$1(animateClickAlpha);
                                            u11.x(C13);
                                        }
                                        u11.k();
                                        e a12 = androidx.compose.ui.graphics.a.a(a11, (Function1) C13);
                                        if (z11 || function0 == null) {
                                            c3969l = u11;
                                            c9915y2 = c9915y;
                                            eVar3 = eVar2;
                                            i24 = 1;
                                        } else {
                                            Intrinsics.f(function0);
                                            c9915y2 = c9915y;
                                            c3969l = u11;
                                            eVar3 = eVar2;
                                            i24 = 1;
                                            a12 = a12.l0(i.b(aVar, qVar, null, z11, null, null, function0, 24));
                                        }
                                        e e12 = androidx.compose.foundation.layout.T.e(a0.u(a12, i24), c9915y2);
                                        Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, 48);
                                        I11 = c3969l.I();
                                        A0 d11 = c3969l.d();
                                        e f25 = c.f(c3969l, e12);
                                        Function0 a13 = g.a(InterfaceC2801g.f5440U, c3969l);
                                        if (c3969l.t()) {
                                            c3969l.e();
                                        } else {
                                            c3969l.H(a13);
                                        }
                                        Function2 h11 = Cm.e.h(c3969l, b11, c3969l, d11);
                                        if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I11))) {
                                            Ep.a.d(I11, c3969l, I11, h11);
                                        }
                                        U7.i.b(c3969l, f25, 778545310);
                                        if (abstractC8972b == null) {
                                            e j11 = androidx.compose.foundation.layout.T.j(uniTestTag3, 0.0f, 0.0f, f18, 0.0f, 11);
                                            a.b(j11, "startGraphic");
                                            c3969l2 = c3969l;
                                            m1868BadgeIconFNF3uiM(a0.n(j11, f24), abstractC8972b, m3266takeIfNotMulticolorIconDxMtmZc, c3969l2, (i33 >> 3) & 112, 0);
                                        } else {
                                            c3969l2 = c3969l;
                                        }
                                        c3969l2.k();
                                        c3969l2.o(778556990);
                                        if (str == null) {
                                            e l03 = eVar3.l0(new VerticalAlignElement(InterfaceC6250b.a.i()));
                                            if (1.0f <= 0.0d) {
                                                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                                            }
                                            e l04 = l03.l0(new LayoutWeightElement(1.0f, false));
                                            a.b(l04, "text");
                                            c3969l2.o(778564930);
                                            Object C14 = c3969l2.C();
                                            if (C14 == InterfaceC3967k.a.a()) {
                                                C14 = UniBadgeKt$BasicBadge$3$1$1.INSTANCE;
                                                c3969l2.x(C14);
                                            }
                                            c3969l2.k();
                                            e a14 = I1.o.a(l04, (Function1) C14);
                                            if (z16) {
                                                str3 = str;
                                                String upperCase = str3.toUpperCase(Locale.ROOT);
                                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                                str4 = upperCase;
                                            } else {
                                                str3 = str;
                                                str4 = str3;
                                            }
                                            p2.b(str4, a14, value2, 0L, 0L, null, 0L, 2, false, 1, 0, t2, c3969l2, 0, 3120, 55288);
                                        } else {
                                            str3 = str;
                                        }
                                        c3969l2.k();
                                        c3969l2.o(778573475);
                                        if (z11 || abstractC8972b2 == null) {
                                            c3969l3 = c3969l2;
                                        } else {
                                            e n12 = a0.n(androidx.compose.foundation.layout.T.j(uniTestTag4, f14, 0.0f, 0.0f, 0.0f, 14), f24);
                                            a.b(n12, "endGraphic");
                                            C3969l c3969l4 = c3969l2;
                                            m1868BadgeIconFNF3uiM(n12, abstractC8972b2, value3, c3969l4, 0, 0);
                                            c3969l3 = c3969l4;
                                        }
                                        c3969l3.k();
                                        c3969l3.f();
                                        c3969l3.k();
                                    }
                                } else {
                                    z14 = true;
                                }
                                f13 = f12;
                                if (uniBadgeStraightCorners == null) {
                                }
                                if (uniBadgeStraightCorners == null) {
                                }
                                AbstractC7799Q value4 = DeferredBrush.getValue(uniBadgeStyle.getBackgroundDefBrush(), u11, i23);
                                uniTheme.getIcons();
                                u11.B(-886331929);
                                AbstractC8972b uniPainterResource2 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                                u11.K();
                                if (!z11) {
                                }
                                AbstractC8972b abstractC8972b22 = uniPainterResource2;
                                float f222 = f11;
                                float f232 = f13;
                                long m3266takeIfNotMulticolorIconDxMtmZc2 = PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniBadgeStyle.getStartGraphicDefColor(), u11, 0), abstractC8972b);
                                long value22 = DeferredColor.getValue(uniBadgeStyle.getLabelDefColor(), u11, 0);
                                long value32 = DeferredColor.getValue(uniBadgeStyle.getEndGraphicDefColor(), u11, 0);
                                uniBadgeSize2 = UniBadgeSize.Size200;
                                if (uniBadgeSize != uniBadgeSize2) {
                                }
                                z15 = false;
                                f14 = 0;
                                float f242 = (uniBadgeSize != uniBadgeSize2 || uniBadgeSize == UniBadgeSize.Size300) ? 12 : 16;
                                c9915y = new C9915y(f15, f17, f16, f17);
                                if (uniBadgeSize != UniBadgeSize.Size300) {
                                }
                                int i322 = i26 >> 6;
                                int i332 = (i322 & 896) | (i322 & 14) | (i26 & 112) | ((i26 << 18) & 3670016);
                                u11.o(1137039003);
                                u11.o(-399766680);
                                C12 = u11.C();
                                if (C12 == InterfaceC3967k.a.a()) {
                                }
                                q qVar2 = (q) C12;
                                u11.k();
                                D0<Boolean> m3245rememberIndicationTransitionFbhrOv82 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, 6, 3);
                                e11 = u.e(t2.i());
                                if (Float.compare(m1879getHeightD9Ej5fM$uni_release, e11) < 0) {
                                }
                                A1<Float> animateClickAlpha2 = AnimationUtilsKt.animateClickAlpha(m3245rememberIndicationTransitionFbhrOv82, 0.0f, 0.0f, u11, 0, 3);
                                a.b(l02, "container");
                                e a112 = androidx.compose.foundation.e.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(l02), m1879getHeightD9Ej5fM$uni_release), value4, h.c(f222, f232, f19, f21), 4);
                                u11.o(-399740229);
                                n11 = u11.n(animateClickAlpha2);
                                C13 = u11.C();
                                if (!n11) {
                                }
                                C13 = new UniBadgeKt$BasicBadge$1$1(animateClickAlpha2);
                                u11.x(C13);
                                u11.k();
                                e a122 = androidx.compose.ui.graphics.a.a(a112, (Function1) C13);
                                if (z11) {
                                }
                                c3969l = u11;
                                c9915y2 = c9915y;
                                eVar3 = eVar2;
                                i24 = 1;
                                e e122 = androidx.compose.foundation.layout.T.e(a0.u(a122, i24), c9915y2);
                                Y b112 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, 48);
                                I11 = c3969l.I();
                                A0 d112 = c3969l.d();
                                e f252 = c.f(c3969l, e122);
                                Function0 a132 = g.a(InterfaceC2801g.f5440U, c3969l);
                                if (c3969l.t()) {
                                }
                                Function2 h112 = Cm.e.h(c3969l, b112, c3969l, d112);
                                if (!c3969l.t()) {
                                }
                                Ep.a.d(I11, c3969l, I11, h112);
                                U7.i.b(c3969l, f252, 778545310);
                                if (abstractC8972b == null) {
                                }
                                c3969l2.k();
                                c3969l2.o(778556990);
                                if (str == null) {
                                }
                                c3969l2.k();
                                c3969l2.o(778573475);
                                if (z11) {
                                }
                                c3969l3 = c3969l2;
                                c3969l3.k();
                                c3969l3.f();
                                c3969l3.k();
                            }
                        } else {
                            eVar2 = uniTestTag2;
                        }
                        i23 = 0;
                        f11 = m1878getCornerRadiusD9Ej5fM$uni_release;
                        f12 = m1878getCornerRadiusD9Ej5fM$uni_release;
                        if (uniBadgeStraightCorners != null) {
                        }
                        f13 = f12;
                        if (uniBadgeStraightCorners == null) {
                        }
                        if (uniBadgeStraightCorners == null) {
                        }
                        AbstractC7799Q value42 = DeferredBrush.getValue(uniBadgeStyle.getBackgroundDefBrush(), u11, i23);
                        uniTheme.getIcons();
                        u11.B(-886331929);
                        AbstractC8972b uniPainterResource22 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                        u11.K();
                        if (!z11) {
                        }
                        AbstractC8972b abstractC8972b222 = uniPainterResource22;
                        float f2222 = f11;
                        float f2322 = f13;
                        long m3266takeIfNotMulticolorIconDxMtmZc22 = PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniBadgeStyle.getStartGraphicDefColor(), u11, 0), abstractC8972b);
                        long value222 = DeferredColor.getValue(uniBadgeStyle.getLabelDefColor(), u11, 0);
                        long value322 = DeferredColor.getValue(uniBadgeStyle.getEndGraphicDefColor(), u11, 0);
                        uniBadgeSize2 = UniBadgeSize.Size200;
                        if (uniBadgeSize != uniBadgeSize2) {
                        }
                        z15 = false;
                        f14 = 0;
                        float f2422 = (uniBadgeSize != uniBadgeSize2 || uniBadgeSize == UniBadgeSize.Size300) ? 12 : 16;
                        c9915y = new C9915y(f15, f17, f16, f17);
                        if (uniBadgeSize != UniBadgeSize.Size300) {
                        }
                        int i3222 = i26 >> 6;
                        int i3322 = (i3222 & 896) | (i3222 & 14) | (i26 & 112) | ((i26 << 18) & 3670016);
                        u11.o(1137039003);
                        u11.o(-399766680);
                        C12 = u11.C();
                        if (C12 == InterfaceC3967k.a.a()) {
                        }
                        q qVar22 = (q) C12;
                        u11.k();
                        D0<Boolean> m3245rememberIndicationTransitionFbhrOv822 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(qVar22, 0L, 0L, u11, 6, 3);
                        e11 = u.e(t2.i());
                        if (Float.compare(m1879getHeightD9Ej5fM$uni_release, e11) < 0) {
                        }
                        A1<Float> animateClickAlpha22 = AnimationUtilsKt.animateClickAlpha(m3245rememberIndicationTransitionFbhrOv822, 0.0f, 0.0f, u11, 0, 3);
                        a.b(l02, "container");
                        e a1122 = androidx.compose.foundation.e.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(l02), m1879getHeightD9Ej5fM$uni_release), value42, h.c(f2222, f2322, f19, f21), 4);
                        u11.o(-399740229);
                        n11 = u11.n(animateClickAlpha22);
                        C13 = u11.C();
                        if (!n11) {
                        }
                        C13 = new UniBadgeKt$BasicBadge$1$1(animateClickAlpha22);
                        u11.x(C13);
                        u11.k();
                        e a1222 = androidx.compose.ui.graphics.a.a(a1122, (Function1) C13);
                        if (z11) {
                        }
                        c3969l = u11;
                        c9915y2 = c9915y;
                        eVar3 = eVar2;
                        i24 = 1;
                        e e1222 = androidx.compose.foundation.layout.T.e(a0.u(a1222, i24), c9915y2);
                        Y b1122 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, 48);
                        I11 = c3969l.I();
                        A0 d1122 = c3969l.d();
                        e f2522 = c.f(c3969l, e1222);
                        Function0 a1322 = g.a(InterfaceC2801g.f5440U, c3969l);
                        if (c3969l.t()) {
                        }
                        Function2 h1122 = Cm.e.h(c3969l, b1122, c3969l, d1122);
                        if (!c3969l.t()) {
                        }
                        Ep.a.d(I11, c3969l, I11, h1122);
                        U7.i.b(c3969l, f2522, 778545310);
                        if (abstractC8972b == null) {
                        }
                        c3969l2.k();
                        c3969l2.o(778556990);
                        if (str == null) {
                        }
                        c3969l2.k();
                        c3969l2.o(778573475);
                        if (z11) {
                        }
                        c3969l3 = c3969l2;
                        c3969l3.k();
                        c3969l3.f();
                        c3969l3.k();
                    }
                    i22 = 2;
                    float f182 = i22;
                    e.a aVar2 = e.f40358c0;
                    e uniTestTag5 = UniTestTagsKt.uniTestTag(aVar2, UniBadgeTestTags.Container, null, u11, 54, 2);
                    u11.o(-1849114472);
                    z13 = ((i15 & 14) != 4) | ((i26 & 14) != 4);
                    C11 = u11.C();
                    if (!z13) {
                    }
                    C11 = new UniBadgeKt$UniBadgeImpl$1$1(str2, str);
                    u11.x(C11);
                    u11.k();
                    e l022 = I1.o.c(uniTestTag5, false, (Function1) C11).l0(eVar);
                    e uniTestTag22 = UniTestTagsKt.uniTestTag(aVar2, UniBadgeTestTags.Text, null, u11, 54, 2);
                    e uniTestTag32 = UniTestTagsKt.uniTestTag(aVar2, UniBadgeTestTags.LeftIcon, PainterUtilsKt.getIconNameTestTagParameter(abstractC8972b, UniBadgeTestTags.INSTANCE.getLeftIconName()), u11, 54, 0);
                    e uniTestTag42 = UniTestTagsKt.uniTestTag(aVar2, UniBadgeTestTags.Chevron, null, u11, 54, 2);
                    m1879getHeightD9Ej5fM$uni_release = uniBadgeSize.m1879getHeightD9Ej5fM$uni_release();
                    if (uniBadgeStraightCorners == null) {
                    }
                    i23 = 0;
                    f11 = m1878getCornerRadiusD9Ej5fM$uni_release;
                    f12 = m1878getCornerRadiusD9Ej5fM$uni_release;
                    if (uniBadgeStraightCorners != null) {
                    }
                    f13 = f12;
                    if (uniBadgeStraightCorners == null) {
                    }
                    if (uniBadgeStraightCorners == null) {
                    }
                    AbstractC7799Q value422 = DeferredBrush.getValue(uniBadgeStyle.getBackgroundDefBrush(), u11, i23);
                    uniTheme.getIcons();
                    u11.B(-886331929);
                    AbstractC8972b uniPainterResource222 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                    u11.K();
                    if (!z11) {
                    }
                    AbstractC8972b abstractC8972b2222 = uniPainterResource222;
                    float f22222 = f11;
                    float f23222 = f13;
                    long m3266takeIfNotMulticolorIconDxMtmZc222 = PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniBadgeStyle.getStartGraphicDefColor(), u11, 0), abstractC8972b);
                    long value2222 = DeferredColor.getValue(uniBadgeStyle.getLabelDefColor(), u11, 0);
                    long value3222 = DeferredColor.getValue(uniBadgeStyle.getEndGraphicDefColor(), u11, 0);
                    uniBadgeSize2 = UniBadgeSize.Size200;
                    if (uniBadgeSize != uniBadgeSize2) {
                    }
                    z15 = false;
                    f14 = 0;
                    float f24222 = (uniBadgeSize != uniBadgeSize2 || uniBadgeSize == UniBadgeSize.Size300) ? 12 : 16;
                    c9915y = new C9915y(f15, f17, f16, f17);
                    if (uniBadgeSize != UniBadgeSize.Size300) {
                    }
                    int i32222 = i26 >> 6;
                    int i33222 = (i32222 & 896) | (i32222 & 14) | (i26 & 112) | ((i26 << 18) & 3670016);
                    u11.o(1137039003);
                    u11.o(-399766680);
                    C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                    }
                    q qVar222 = (q) C12;
                    u11.k();
                    D0<Boolean> m3245rememberIndicationTransitionFbhrOv8222 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(qVar222, 0L, 0L, u11, 6, 3);
                    e11 = u.e(t2.i());
                    if (Float.compare(m1879getHeightD9Ej5fM$uni_release, e11) < 0) {
                    }
                    A1<Float> animateClickAlpha222 = AnimationUtilsKt.animateClickAlpha(m3245rememberIndicationTransitionFbhrOv8222, 0.0f, 0.0f, u11, 0, 3);
                    a.b(l022, "container");
                    e a11222 = androidx.compose.foundation.e.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(l022), m1879getHeightD9Ej5fM$uni_release), value422, h.c(f22222, f23222, f19, f21), 4);
                    u11.o(-399740229);
                    n11 = u11.n(animateClickAlpha222);
                    C13 = u11.C();
                    if (!n11) {
                    }
                    C13 = new UniBadgeKt$BasicBadge$1$1(animateClickAlpha222);
                    u11.x(C13);
                    u11.k();
                    e a12222 = androidx.compose.ui.graphics.a.a(a11222, (Function1) C13);
                    if (z11) {
                    }
                    c3969l = u11;
                    c9915y2 = c9915y;
                    eVar3 = eVar2;
                    i24 = 1;
                    e e12222 = androidx.compose.foundation.layout.T.e(a0.u(a12222, i24), c9915y2);
                    Y b11222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, 48);
                    I11 = c3969l.I();
                    A0 d11222 = c3969l.d();
                    e f25222 = c.f(c3969l, e12222);
                    Function0 a13222 = g.a(InterfaceC2801g.f5440U, c3969l);
                    if (c3969l.t()) {
                    }
                    Function2 h11222 = Cm.e.h(c3969l, b11222, c3969l, d11222);
                    if (!c3969l.t()) {
                    }
                    Ep.a.d(I11, c3969l, I11, h11222);
                    U7.i.b(c3969l, f25222, 778545310);
                    if (abstractC8972b == null) {
                    }
                    c3969l2.k();
                    c3969l2.o(778556990);
                    if (str == null) {
                    }
                    c3969l2.k();
                    c3969l2.o(778573475);
                    if (z11) {
                    }
                    c3969l3 = c3969l2;
                    c3969l3.k();
                    c3969l3.f();
                    c3969l3.k();
                } else {
                    if (z11) {
                        i22 = 1;
                        float f1822 = i22;
                        e.a aVar22 = e.f40358c0;
                        e uniTestTag52 = UniTestTagsKt.uniTestTag(aVar22, UniBadgeTestTags.Container, null, u11, 54, 2);
                        u11.o(-1849114472);
                        z13 = ((i15 & 14) != 4) | ((i26 & 14) != 4);
                        C11 = u11.C();
                        if (!z13) {
                        }
                        C11 = new UniBadgeKt$UniBadgeImpl$1$1(str2, str);
                        u11.x(C11);
                        u11.k();
                        e l0222 = I1.o.c(uniTestTag52, false, (Function1) C11).l0(eVar);
                        e uniTestTag222 = UniTestTagsKt.uniTestTag(aVar22, UniBadgeTestTags.Text, null, u11, 54, 2);
                        e uniTestTag322 = UniTestTagsKt.uniTestTag(aVar22, UniBadgeTestTags.LeftIcon, PainterUtilsKt.getIconNameTestTagParameter(abstractC8972b, UniBadgeTestTags.INSTANCE.getLeftIconName()), u11, 54, 0);
                        e uniTestTag422 = UniTestTagsKt.uniTestTag(aVar22, UniBadgeTestTags.Chevron, null, u11, 54, 2);
                        m1879getHeightD9Ej5fM$uni_release = uniBadgeSize.m1879getHeightD9Ej5fM$uni_release();
                        if (uniBadgeStraightCorners == null) {
                        }
                        i23 = 0;
                        f11 = m1878getCornerRadiusD9Ej5fM$uni_release;
                        f12 = m1878getCornerRadiusD9Ej5fM$uni_release;
                        if (uniBadgeStraightCorners != null) {
                        }
                        f13 = f12;
                        if (uniBadgeStraightCorners == null) {
                        }
                        if (uniBadgeStraightCorners == null) {
                        }
                        AbstractC7799Q value4222 = DeferredBrush.getValue(uniBadgeStyle.getBackgroundDefBrush(), u11, i23);
                        uniTheme.getIcons();
                        u11.B(-886331929);
                        AbstractC8972b uniPainterResource2222 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                        u11.K();
                        if (!z11) {
                        }
                        AbstractC8972b abstractC8972b22222 = uniPainterResource2222;
                        float f222222 = f11;
                        float f232222 = f13;
                        long m3266takeIfNotMulticolorIconDxMtmZc2222 = PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniBadgeStyle.getStartGraphicDefColor(), u11, 0), abstractC8972b);
                        long value22222 = DeferredColor.getValue(uniBadgeStyle.getLabelDefColor(), u11, 0);
                        long value32222 = DeferredColor.getValue(uniBadgeStyle.getEndGraphicDefColor(), u11, 0);
                        uniBadgeSize2 = UniBadgeSize.Size200;
                        if (uniBadgeSize != uniBadgeSize2) {
                        }
                        z15 = false;
                        f14 = 0;
                        float f242222 = (uniBadgeSize != uniBadgeSize2 || uniBadgeSize == UniBadgeSize.Size300) ? 12 : 16;
                        c9915y = new C9915y(f15, f17, f16, f17);
                        if (uniBadgeSize != UniBadgeSize.Size300) {
                        }
                        int i322222 = i26 >> 6;
                        int i332222 = (i322222 & 896) | (i322222 & 14) | (i26 & 112) | ((i26 << 18) & 3670016);
                        u11.o(1137039003);
                        u11.o(-399766680);
                        C12 = u11.C();
                        if (C12 == InterfaceC3967k.a.a()) {
                        }
                        q qVar2222 = (q) C12;
                        u11.k();
                        D0<Boolean> m3245rememberIndicationTransitionFbhrOv82222 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(qVar2222, 0L, 0L, u11, 6, 3);
                        e11 = u.e(t2.i());
                        if (Float.compare(m1879getHeightD9Ej5fM$uni_release, e11) < 0) {
                        }
                        A1<Float> animateClickAlpha2222 = AnimationUtilsKt.animateClickAlpha(m3245rememberIndicationTransitionFbhrOv82222, 0.0f, 0.0f, u11, 0, 3);
                        a.b(l0222, "container");
                        e a112222 = androidx.compose.foundation.e.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(l0222), m1879getHeightD9Ej5fM$uni_release), value4222, h.c(f222222, f232222, f19, f21), 4);
                        u11.o(-399740229);
                        n11 = u11.n(animateClickAlpha2222);
                        C13 = u11.C();
                        if (!n11) {
                        }
                        C13 = new UniBadgeKt$BasicBadge$1$1(animateClickAlpha2222);
                        u11.x(C13);
                        u11.k();
                        e a122222 = androidx.compose.ui.graphics.a.a(a112222, (Function1) C13);
                        if (z11) {
                        }
                        c3969l = u11;
                        c9915y2 = c9915y;
                        eVar3 = eVar2;
                        i24 = 1;
                        e e122222 = androidx.compose.foundation.layout.T.e(a0.u(a122222, i24), c9915y2);
                        Y b112222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, 48);
                        I11 = c3969l.I();
                        A0 d112222 = c3969l.d();
                        e f252222 = c.f(c3969l, e122222);
                        Function0 a132222 = g.a(InterfaceC2801g.f5440U, c3969l);
                        if (c3969l.t()) {
                        }
                        Function2 h112222 = Cm.e.h(c3969l, b112222, c3969l, d112222);
                        if (!c3969l.t()) {
                        }
                        Ep.a.d(I11, c3969l, I11, h112222);
                        U7.i.b(c3969l, f252222, 778545310);
                        if (abstractC8972b == null) {
                        }
                        c3969l2.k();
                        c3969l2.o(778556990);
                        if (str == null) {
                        }
                        c3969l2.k();
                        c3969l2.o(778573475);
                        if (z11) {
                        }
                        c3969l3 = c3969l2;
                        c3969l3.k();
                        c3969l3.f();
                        c3969l3.k();
                    }
                    i22 = 2;
                    float f18222 = i22;
                    e.a aVar222 = e.f40358c0;
                    e uniTestTag522 = UniTestTagsKt.uniTestTag(aVar222, UniBadgeTestTags.Container, null, u11, 54, 2);
                    u11.o(-1849114472);
                    z13 = ((i15 & 14) != 4) | ((i26 & 14) != 4);
                    C11 = u11.C();
                    if (!z13) {
                    }
                    C11 = new UniBadgeKt$UniBadgeImpl$1$1(str2, str);
                    u11.x(C11);
                    u11.k();
                    e l02222 = I1.o.c(uniTestTag522, false, (Function1) C11).l0(eVar);
                    e uniTestTag2222 = UniTestTagsKt.uniTestTag(aVar222, UniBadgeTestTags.Text, null, u11, 54, 2);
                    e uniTestTag3222 = UniTestTagsKt.uniTestTag(aVar222, UniBadgeTestTags.LeftIcon, PainterUtilsKt.getIconNameTestTagParameter(abstractC8972b, UniBadgeTestTags.INSTANCE.getLeftIconName()), u11, 54, 0);
                    e uniTestTag4222 = UniTestTagsKt.uniTestTag(aVar222, UniBadgeTestTags.Chevron, null, u11, 54, 2);
                    m1879getHeightD9Ej5fM$uni_release = uniBadgeSize.m1879getHeightD9Ej5fM$uni_release();
                    if (uniBadgeStraightCorners == null) {
                    }
                    i23 = 0;
                    f11 = m1878getCornerRadiusD9Ej5fM$uni_release;
                    f12 = m1878getCornerRadiusD9Ej5fM$uni_release;
                    if (uniBadgeStraightCorners != null) {
                    }
                    f13 = f12;
                    if (uniBadgeStraightCorners == null) {
                    }
                    if (uniBadgeStraightCorners == null) {
                    }
                    AbstractC7799Q value42222 = DeferredBrush.getValue(uniBadgeStyle.getBackgroundDefBrush(), u11, i23);
                    uniTheme.getIcons();
                    u11.B(-886331929);
                    AbstractC8972b uniPainterResource22222 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                    u11.K();
                    if (!z11) {
                    }
                    AbstractC8972b abstractC8972b222222 = uniPainterResource22222;
                    float f2222222 = f11;
                    float f2322222 = f13;
                    long m3266takeIfNotMulticolorIconDxMtmZc22222 = PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniBadgeStyle.getStartGraphicDefColor(), u11, 0), abstractC8972b);
                    long value222222 = DeferredColor.getValue(uniBadgeStyle.getLabelDefColor(), u11, 0);
                    long value322222 = DeferredColor.getValue(uniBadgeStyle.getEndGraphicDefColor(), u11, 0);
                    uniBadgeSize2 = UniBadgeSize.Size200;
                    if (uniBadgeSize != uniBadgeSize2) {
                    }
                    z15 = false;
                    f14 = 0;
                    float f2422222 = (uniBadgeSize != uniBadgeSize2 || uniBadgeSize == UniBadgeSize.Size300) ? 12 : 16;
                    c9915y = new C9915y(f15, f17, f16, f17);
                    if (uniBadgeSize != UniBadgeSize.Size300) {
                    }
                    int i3222222 = i26 >> 6;
                    int i3322222 = (i3222222 & 896) | (i3222222 & 14) | (i26 & 112) | ((i26 << 18) & 3670016);
                    u11.o(1137039003);
                    u11.o(-399766680);
                    C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                    }
                    q qVar22222 = (q) C12;
                    u11.k();
                    D0<Boolean> m3245rememberIndicationTransitionFbhrOv822222 = TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(qVar22222, 0L, 0L, u11, 6, 3);
                    e11 = u.e(t2.i());
                    if (Float.compare(m1879getHeightD9Ej5fM$uni_release, e11) < 0) {
                    }
                    A1<Float> animateClickAlpha22222 = AnimationUtilsKt.animateClickAlpha(m3245rememberIndicationTransitionFbhrOv822222, 0.0f, 0.0f, u11, 0, 3);
                    a.b(l02222, "container");
                    e a1122222 = androidx.compose.foundation.e.a(a0.f(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(l02222), m1879getHeightD9Ej5fM$uni_release), value42222, h.c(f2222222, f2322222, f19, f21), 4);
                    u11.o(-399740229);
                    n11 = u11.n(animateClickAlpha22222);
                    C13 = u11.C();
                    if (!n11) {
                    }
                    C13 = new UniBadgeKt$BasicBadge$1$1(animateClickAlpha22222);
                    u11.x(C13);
                    u11.k();
                    e a1222222 = androidx.compose.ui.graphics.a.a(a1122222, (Function1) C13);
                    if (z11) {
                    }
                    c3969l = u11;
                    c9915y2 = c9915y;
                    eVar3 = eVar2;
                    i24 = 1;
                    e e1222222 = androidx.compose.foundation.layout.T.e(a0.u(a1222222, i24), c9915y2);
                    Y b1122222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, 48);
                    I11 = c3969l.I();
                    A0 d1122222 = c3969l.d();
                    e f2522222 = c.f(c3969l, e1222222);
                    Function0 a1322222 = g.a(InterfaceC2801g.f5440U, c3969l);
                    if (c3969l.t()) {
                    }
                    Function2 h1122222 = Cm.e.h(c3969l, b1122222, c3969l, d1122222);
                    if (!c3969l.t()) {
                    }
                    Ep.a.d(I11, c3969l, I11, h1122222);
                    U7.i.b(c3969l, f2522222, 778545310);
                    if (abstractC8972b == null) {
                    }
                    c3969l2.k();
                    c3969l2.o(778556990);
                    if (str == null) {
                    }
                    c3969l2.k();
                    c3969l2.o(778573475);
                    if (z11) {
                    }
                    c3969l3 = c3969l2;
                    c3969l3.k();
                    c3969l3.f();
                    c3969l3.k();
                }
            } else {
                if (abstractC8972b != null) {
                    i16 = 2;
                    float f152 = i16;
                    if (z11) {
                    }
                    float f162 = i17;
                    i18 = iArr[uniBadgeSize.ordinal()];
                    if (i18 != 1) {
                    }
                    i19 = 0;
                    float f172 = i19;
                    if (!Float.isNaN(f7)) {
                    }
                    i21 = iArr[uniBadgeSize.ordinal()];
                    if (i21 != 1) {
                    }
                }
                i16 = 3;
                float f1522 = i16;
                if (z11) {
                }
                float f1622 = i17;
                i18 = iArr[uniBadgeSize.ordinal()];
                if (i18 != 1) {
                }
                i19 = 0;
                float f1722 = i19;
                if (!Float.isNaN(f7)) {
                }
                i21 = iArr[uniBadgeSize.ordinal()];
                if (i21 != 1) {
                }
            }
        }
        J0 m02 = c3969l3.m0();
        if (m02 != null) {
            m02.G(new UniBadgeKt$UniBadgeImpl$3(str3, z11, function0, eVar, abstractC8972b, uniBadgeStyle, z12, uniBadgeSize, f7, uniBadgeStraightCorners, str2, i11, i12));
        }
    }
}
