package ru.ozon.uni.android.ds.compose.component.badge;

import I1.o;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.UniGlobalConfig;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.components.badge.FoundationBadgeKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u001a¹\u0001\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b \u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010'\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b'\u0010\u001e\u001a)\u0010)\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010,\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeSize;", "size", "Ll1/Q;", "backgroundBrush", "Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "textColor", "leftIconColor", "rightIconColor", "LZ1/h;", "cornerRadius", "", "text", "", "isTopLeftCornerDisabled", "isTopRightCornerDisabled", "isBottomLeftCornerDisabled", "isBottomRightCornerDisabled", "hideDisclosure", "Lq1/b;", "leftIcon", "Lkotlin/Function0;", "", "onClick", "accessibilityContentDescription", "DsBadge-ATjRvoI", "(Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeSize;Ll1/Q;Landroidx/compose/ui/e;JJJFLjava/lang/String;ZZZZZLq1/b;Lkotlin/jvm/functions/Function0;Ljava/lang/String;LS0/k;III)V", "DsBadge", "getLeftGap", "(Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeSize;)F", "getRightGap", "getIconSize", "isAllCaps", "(Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeSize;)Z", "badgeSize", "LK1/T;", "getTextStyle", "(Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeSize;)LK1/T;", "getBadgeHeight", "hasLeftIcon", "getLeftPadding", "(Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeSize;Ljava/lang/String;Z)F", "hasRightIcon", "getRightPadding", "(Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeSize;Z)F", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsBadgeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DsBadgeSize.values().length];
            try {
                iArr[DsBadgeSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DsBadgeSize.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DsBadgeSize.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DsBadgeSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DsBadgeSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0349 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0379  */
    /* renamed from: DsBadge-ATjRvoI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1675DsBadgeATjRvoI(@NotNull DsBadgeSize size, @NotNull AbstractC7799Q backgroundBrush, e eVar, long j11, long j12, long j13, float f7, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, AbstractC8972b abstractC8972b, Function0<Unit> function0, String str2, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        int i15;
        long j14;
        int i16;
        int i17;
        long j15;
        float f11;
        int i18;
        String str3;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
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
        int i37;
        e eVar2;
        int i38;
        Function0<Unit> function02;
        boolean z16;
        float f12;
        boolean z17;
        AbstractC8972b abstractC8972b2;
        boolean z18;
        boolean z19;
        boolean z21;
        String str4;
        long j16;
        int i39;
        boolean z22;
        long j17;
        long j18;
        boolean z23;
        boolean z24;
        AbstractC8972b abstractC8972b3;
        float rightPadding;
        AbstractC8972b abstractC8972b4;
        e eVar3;
        boolean z25;
        Object C11;
        C3969l c3969l;
        e eVar4;
        long j19;
        long j21;
        String str5;
        long j22;
        float f13;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        Function0<Unit> function03;
        String str6;
        AbstractC8972b abstractC8972b5;
        boolean z31;
        J0 m02;
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(backgroundBrush, "backgroundBrush");
        C3969l u11 = interfaceC3967k.u(-838081713);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.n(size) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= u11.n(backgroundBrush) ? 32 : 16;
        }
        int i41 = i13 & 4;
        if (i41 != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            i14 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i15 = i13 & 8;
            if (i15 == 0) {
                i14 |= 3072;
                j14 = j11;
            } else {
                j14 = j11;
                if ((i11 & 3072) == 0) {
                    i14 |= u11.s(j14) ? 2048 : 1024;
                }
            }
            i16 = i13 & 16;
            if (i16 == 0) {
                i14 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i14 |= u11.s(j12) ? 16384 : 8192;
            }
            i17 = i13 & 32;
            if (i17 == 0) {
                i14 |= 196608;
                j15 = j13;
            } else {
                j15 = j13;
                if ((i11 & 196608) == 0) {
                    i14 |= u11.s(j15) ? 131072 : 65536;
                }
            }
            if ((i11 & 1572864) != 0) {
                f11 = f7;
                i14 |= ((i13 & 64) == 0 && u11.q(f11)) ? 1048576 : 524288;
            } else {
                f11 = f7;
            }
            i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i18 == 0) {
                i14 |= 12582912;
                str3 = str;
            } else {
                str3 = str;
                if ((i11 & 12582912) == 0) {
                    i14 |= u11.n(str3) ? 8388608 : 4194304;
                }
            }
            i19 = i13 & 256;
            if (i19 == 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                i21 = i19;
                i14 |= u11.p(z11) ? 67108864 : 33554432;
                i22 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i22 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    i23 = i22;
                    i14 |= u11.p(z12) ? 536870912 : 268435456;
                    i24 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i24 == 0) {
                        i26 = i12 | 6;
                        i25 = i24;
                    } else if ((i12 & 6) == 0) {
                        i25 = i24;
                        i26 = i12 | (u11.p(z13) ? 4 : 2);
                    } else {
                        i25 = i24;
                        i26 = i12;
                    }
                    i27 = i13 & 2048;
                    if (i27 == 0) {
                        i26 |= 48;
                        i28 = i27;
                    } else if ((i12 & 48) == 0) {
                        i28 = i27;
                        i26 |= u11.p(z14) ? 32 : 16;
                    } else {
                        i28 = i27;
                    }
                    int i42 = i26;
                    i29 = i14;
                    i31 = i13 & 4096;
                    if (i31 == 0) {
                        i32 = i42 | 384;
                    } else {
                        int i43 = i42;
                        if ((i12 & 384) == 0) {
                            i43 |= u11.p(z15) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                        }
                        i32 = i43;
                    }
                    i33 = i13 & 8192;
                    if (i33 == 0) {
                        i34 = i32 | 3072;
                    } else {
                        int i44 = i32;
                        if ((i12 & 3072) == 0) {
                            i34 = i44 | (u11.n(abstractC8972b) ? 2048 : 1024);
                        } else {
                            i34 = i44;
                        }
                    }
                    i35 = i13 & 16384;
                    if (i35 == 0) {
                        i36 = i34 | 24576;
                    } else {
                        i36 = i34;
                        if ((i12 & 24576) == 0) {
                            i36 |= u11.F(function0) ? 16384 : 8192;
                            i37 = i13 & 32768;
                            if (i37 != 0) {
                                i36 |= 196608;
                            } else if ((i12 & 196608) == 0) {
                                i36 |= u11.n(str2) ? 131072 : 65536;
                            }
                            if ((i29 & 306783379) != 306783378 && (i36 & 74899) == 74898 && u11.b()) {
                                u11.j();
                                eVar4 = eVar;
                                z28 = z14;
                                z29 = z15;
                                abstractC8972b5 = abstractC8972b;
                                function03 = function0;
                                str6 = str2;
                                c3969l = u11;
                                str5 = str3;
                                j21 = j14;
                                j22 = j15;
                                f13 = f11;
                                j19 = j12;
                                z26 = z11;
                                z27 = z12;
                                z31 = z13;
                            } else {
                                u11.Q0();
                                if ((i11 & 1) != 0 || u11.w0()) {
                                    eVar2 = i41 != 0 ? e.f40358c0 : eVar;
                                    if (i15 != 0) {
                                        j18 = C7807Z.f72259m;
                                        j14 = j18;
                                    }
                                    long j23 = i16 != 0 ? C7807Z.f72259m : j12;
                                    if (i17 != 0) {
                                        j15 = C7807Z.f72259m;
                                    }
                                    if ((i13 & 64) != 0) {
                                        f11 = DsBadgeMappersKt.getBadgeCornerRadius(size, null, u11, i29 & 14, 2);
                                        i38 = i29 & (-3670017);
                                    } else {
                                        i38 = i29;
                                    }
                                    if (i18 != 0) {
                                        str3 = null;
                                    }
                                    boolean z32 = i21 != 0 ? false : z11;
                                    boolean z33 = i23 != 0 ? false : z12;
                                    boolean z34 = i25 != 0 ? false : z13;
                                    boolean z35 = i28 != 0 ? false : z14;
                                    boolean z36 = i31 != 0 ? false : z15;
                                    AbstractC8972b abstractC8972b6 = i33 != 0 ? null : abstractC8972b;
                                    function02 = i35 != 0 ? null : function0;
                                    z16 = z32;
                                    f12 = f11;
                                    z17 = z33;
                                    abstractC8972b2 = abstractC8972b6;
                                    z18 = z36;
                                    z19 = z34;
                                    z21 = z35;
                                    str4 = i37 != 0 ? null : str2;
                                    j16 = j14;
                                    i39 = i36;
                                    z22 = false;
                                    j17 = j23;
                                } else {
                                    u11.j();
                                    if ((i13 & 64) != 0) {
                                        eVar2 = eVar;
                                        z16 = z11;
                                        z17 = z12;
                                        z19 = z13;
                                        z21 = z14;
                                        z18 = z15;
                                        str4 = str2;
                                        i38 = i29 & (-3670017);
                                        j16 = j14;
                                        f12 = f11;
                                        i39 = i36;
                                        z22 = false;
                                        j17 = j12;
                                        abstractC8972b2 = abstractC8972b;
                                        function02 = function0;
                                    } else {
                                        eVar2 = eVar;
                                        z16 = z11;
                                        z17 = z12;
                                        z19 = z13;
                                        z21 = z14;
                                        z18 = z15;
                                        function02 = function0;
                                        str4 = str2;
                                        i38 = i29;
                                        j16 = j14;
                                        f12 = f11;
                                        i39 = i36;
                                        z22 = false;
                                        j17 = j12;
                                        abstractC8972b2 = abstractC8972b;
                                    }
                                }
                                long j24 = j15;
                                u11.j0();
                                boolean z37 = (str3 != null || str3.length() == 0) ? true : z22;
                                float badgeHeight = getBadgeHeight(size);
                                z23 = z37;
                                boolean z38 = function02 != null ? true : z22;
                                z24 = (z38 || z18 || z23) ? z22 : true;
                                u11.o(-302537163);
                                if (z24) {
                                    UniTheme.INSTANCE.getIcons();
                                    u11.B(1299823147);
                                    abstractC8972b3 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_s_disclosure_compact, "ic_s_disclosure_compact", u11, 48);
                                    u11.K();
                                } else {
                                    abstractC8972b3 = null;
                                }
                                u11.k();
                                float leftPadding = getLeftPadding(size, str3, abstractC8972b2 != null);
                                if (z23) {
                                    rightPadding = leftPadding;
                                } else {
                                    rightPadding = getRightPadding(size, abstractC8972b3 != null);
                                }
                                e eVar5 = eVar2;
                                u11.o(-302525056);
                                e.a aVar = e.f40358c0;
                                if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
                                    abstractC8972b4 = abstractC8972b3;
                                    eVar3 = aVar;
                                } else {
                                    u11.o(-1572037188);
                                    abstractC8972b4 = abstractC8972b3;
                                    boolean z39 = ((458752 & i39) == 131072) | ((29360128 & i38) == 8388608);
                                    Object C12 = u11.C();
                                    if (z39 || C12 == InterfaceC3967k.a.a()) {
                                        C12 = new DsBadgeKt$DsBadge$1$1$1(str4, str3);
                                        u11.x(C12);
                                    }
                                    u11.k();
                                    eVar3 = o.a(aVar, (Function1) C12);
                                }
                                u11.k();
                                e j25 = T.j(aVar, 0.0f, 0.0f, z23 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getLeftGap(size), 0.0f, 11);
                                e j26 = T.j(aVar, z23 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getRightGap(size), 0.0f, 0.0f, 0.0f, 14);
                                float m1838getDp0D9Ej5fM = z16 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f12;
                                float m1838getDp0D9Ej5fM2 = z17 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f12;
                                float m1838getDp0D9Ej5fM3 = z21 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f12;
                                float m1838getDp0D9Ej5fM4 = z19 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : f12;
                                u11.o(-302497592);
                                e eVar6 = eVar3;
                                z25 = (57344 & i39) == 16384;
                                C11 = u11.C();
                                if (!z25 || C11 == InterfaceC3967k.a.a()) {
                                    C11 = new DsBadgeKt$DsBadge$2$1(function02);
                                    u11.x(C11);
                                }
                                u11.k();
                                int i45 = i38;
                                float f14 = m1838getDp0D9Ej5fM2;
                                K1.T textStyle = getTextStyle(size);
                                DsSpacings dsSpacings = DsSpacings.INSTANCE;
                                float f15 = m1838getDp0D9Ej5fM;
                                String str7 = str3;
                                c3969l = u11;
                                String str8 = str4;
                                FoundationBadgeKt.m2974FoundationBadgeWhIEsx8(eVar5, eVar6, j25, j26, badgeHeight, f15, f14, m1838getDp0D9Ej5fM3, m1838getDp0D9Ej5fM4, backgroundBrush, (Function0) C11, z38, abstractC8972b2, abstractC8972b4, j17, j16, str7, textStyle, j24, dsSpacings.m1838getDp0D9Ej5fM(), dsSpacings.m1838getDp0D9Ej5fM(), getIconSize(size), T.b(leftPadding, 0.0f, rightPadding, 0.0f, 10), isAllCaps(size), c3969l, ((i45 >> 6) & 14) | ((i45 << 24) & 1879048192), ((i39 >> 3) & 896) | 805306368 | (i45 & 57344) | (458752 & (i45 << 6)) | ((i45 >> 3) & 3670016) | ((i45 << 9) & 234881024), 6, 0);
                                eVar4 = eVar5;
                                j19 = j17;
                                j21 = j16;
                                str5 = str7;
                                j22 = j24;
                                f13 = f12;
                                z26 = z16;
                                z27 = z17;
                                z28 = z21;
                                z29 = z18;
                                function03 = function02;
                                str6 = str8;
                                abstractC8972b5 = abstractC8972b2;
                                z31 = z19;
                            }
                            m02 = c3969l.m0();
                            if (m02 != null) {
                                m02.G(new DsBadgeKt$DsBadge$3(size, backgroundBrush, eVar4, j21, j19, j22, f13, str5, z26, z27, z31, z28, z29, abstractC8972b5, function03, str6, i11, i12, i13));
                                return;
                            }
                            return;
                        }
                    }
                    i37 = i13 & 32768;
                    if (i37 != 0) {
                    }
                    if ((i29 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i41 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if ((i13 & 64) != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i31 != 0) {
                    }
                    if (i33 != 0) {
                    }
                    if (i35 != 0) {
                    }
                    z16 = z32;
                    f12 = f11;
                    z17 = z33;
                    abstractC8972b2 = abstractC8972b6;
                    z18 = z36;
                    z19 = z34;
                    z21 = z35;
                    if (i37 != 0) {
                    }
                    j16 = j14;
                    i39 = i36;
                    z22 = false;
                    j17 = j23;
                    long j242 = j15;
                    u11.j0();
                    if (str3 != null) {
                    }
                    float badgeHeight2 = getBadgeHeight(size);
                    z23 = z37;
                    if (function02 != null) {
                    }
                    if (z38) {
                    }
                    u11.o(-302537163);
                    if (z24) {
                    }
                    u11.k();
                    float leftPadding2 = getLeftPadding(size, str3, abstractC8972b2 != null);
                    if (z23) {
                    }
                    e eVar52 = eVar2;
                    u11.o(-302525056);
                    e.a aVar2 = e.f40358c0;
                    if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
                    }
                    u11.k();
                    e j252 = T.j(aVar2, 0.0f, 0.0f, z23 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getLeftGap(size), 0.0f, 11);
                    e j262 = T.j(aVar2, z23 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getRightGap(size), 0.0f, 0.0f, 0.0f, 14);
                    if (z16) {
                    }
                    if (z17) {
                    }
                    if (z21) {
                    }
                    if (z19) {
                    }
                    u11.o(-302497592);
                    e eVar62 = eVar3;
                    if ((57344 & i39) == 16384) {
                    }
                    C11 = u11.C();
                    if (!z25) {
                    }
                    C11 = new DsBadgeKt$DsBadge$2$1(function02);
                    u11.x(C11);
                    u11.k();
                    int i452 = i38;
                    float f142 = m1838getDp0D9Ej5fM2;
                    K1.T textStyle2 = getTextStyle(size);
                    DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
                    float f152 = m1838getDp0D9Ej5fM;
                    String str72 = str3;
                    c3969l = u11;
                    String str82 = str4;
                    FoundationBadgeKt.m2974FoundationBadgeWhIEsx8(eVar52, eVar62, j252, j262, badgeHeight2, f152, f142, m1838getDp0D9Ej5fM3, m1838getDp0D9Ej5fM4, backgroundBrush, (Function0) C11, z38, abstractC8972b2, abstractC8972b4, j17, j16, str72, textStyle2, j242, dsSpacings2.m1838getDp0D9Ej5fM(), dsSpacings2.m1838getDp0D9Ej5fM(), getIconSize(size), T.b(leftPadding2, 0.0f, rightPadding, 0.0f, 10), isAllCaps(size), c3969l, ((i452 >> 6) & 14) | ((i452 << 24) & 1879048192), ((i39 >> 3) & 896) | 805306368 | (i452 & 57344) | (458752 & (i452 << 6)) | ((i452 >> 3) & 3670016) | ((i452 << 9) & 234881024), 6, 0);
                    eVar4 = eVar52;
                    j19 = j17;
                    j21 = j16;
                    str5 = str72;
                    j22 = j242;
                    f13 = f12;
                    z26 = z16;
                    z27 = z17;
                    z28 = z21;
                    z29 = z18;
                    function03 = function02;
                    str6 = str82;
                    abstractC8972b5 = abstractC8972b2;
                    z31 = z19;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                i23 = i22;
                i24 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i24 == 0) {
                }
                i27 = i13 & 2048;
                if (i27 == 0) {
                }
                int i422 = i26;
                i29 = i14;
                i31 = i13 & 4096;
                if (i31 == 0) {
                }
                i33 = i13 & 8192;
                if (i33 == 0) {
                }
                i35 = i13 & 16384;
                if (i35 == 0) {
                }
                i37 = i13 & 32768;
                if (i37 != 0) {
                }
                if ((i29 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i41 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if ((i13 & 64) != 0) {
                }
                if (i18 != 0) {
                }
                if (i21 != 0) {
                }
                if (i23 != 0) {
                }
                if (i25 != 0) {
                }
                if (i28 != 0) {
                }
                if (i31 != 0) {
                }
                if (i33 != 0) {
                }
                if (i35 != 0) {
                }
                z16 = z32;
                f12 = f11;
                z17 = z33;
                abstractC8972b2 = abstractC8972b6;
                z18 = z36;
                z19 = z34;
                z21 = z35;
                if (i37 != 0) {
                }
                j16 = j14;
                i39 = i36;
                z22 = false;
                j17 = j23;
                long j2422 = j15;
                u11.j0();
                if (str3 != null) {
                }
                float badgeHeight22 = getBadgeHeight(size);
                z23 = z37;
                if (function02 != null) {
                }
                if (z38) {
                }
                u11.o(-302537163);
                if (z24) {
                }
                u11.k();
                float leftPadding22 = getLeftPadding(size, str3, abstractC8972b2 != null);
                if (z23) {
                }
                e eVar522 = eVar2;
                u11.o(-302525056);
                e.a aVar22 = e.f40358c0;
                if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
                }
                u11.k();
                e j2522 = T.j(aVar22, 0.0f, 0.0f, z23 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getLeftGap(size), 0.0f, 11);
                e j2622 = T.j(aVar22, z23 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getRightGap(size), 0.0f, 0.0f, 0.0f, 14);
                if (z16) {
                }
                if (z17) {
                }
                if (z21) {
                }
                if (z19) {
                }
                u11.o(-302497592);
                e eVar622 = eVar3;
                if ((57344 & i39) == 16384) {
                }
                C11 = u11.C();
                if (!z25) {
                }
                C11 = new DsBadgeKt$DsBadge$2$1(function02);
                u11.x(C11);
                u11.k();
                int i4522 = i38;
                float f1422 = m1838getDp0D9Ej5fM2;
                K1.T textStyle22 = getTextStyle(size);
                DsSpacings dsSpacings22 = DsSpacings.INSTANCE;
                float f1522 = m1838getDp0D9Ej5fM;
                String str722 = str3;
                c3969l = u11;
                String str822 = str4;
                FoundationBadgeKt.m2974FoundationBadgeWhIEsx8(eVar522, eVar622, j2522, j2622, badgeHeight22, f1522, f1422, m1838getDp0D9Ej5fM3, m1838getDp0D9Ej5fM4, backgroundBrush, (Function0) C11, z38, abstractC8972b2, abstractC8972b4, j17, j16, str722, textStyle22, j2422, dsSpacings22.m1838getDp0D9Ej5fM(), dsSpacings22.m1838getDp0D9Ej5fM(), getIconSize(size), T.b(leftPadding22, 0.0f, rightPadding, 0.0f, 10), isAllCaps(size), c3969l, ((i4522 >> 6) & 14) | ((i4522 << 24) & 1879048192), ((i39 >> 3) & 896) | 805306368 | (i4522 & 57344) | (458752 & (i4522 << 6)) | ((i4522 >> 3) & 3670016) | ((i4522 << 9) & 234881024), 6, 0);
                eVar4 = eVar522;
                j19 = j17;
                j21 = j16;
                str5 = str722;
                j22 = j2422;
                f13 = f12;
                z26 = z16;
                z27 = z17;
                z28 = z21;
                z29 = z18;
                function03 = function02;
                str6 = str822;
                abstractC8972b5 = abstractC8972b2;
                z31 = z19;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            i21 = i19;
            i22 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i22 != 0) {
            }
            i23 = i22;
            i24 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i24 == 0) {
            }
            i27 = i13 & 2048;
            if (i27 == 0) {
            }
            int i4222 = i26;
            i29 = i14;
            i31 = i13 & 4096;
            if (i31 == 0) {
            }
            i33 = i13 & 8192;
            if (i33 == 0) {
            }
            i35 = i13 & 16384;
            if (i35 == 0) {
            }
            i37 = i13 & 32768;
            if (i37 != 0) {
            }
            if ((i29 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i41 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if ((i13 & 64) != 0) {
            }
            if (i18 != 0) {
            }
            if (i21 != 0) {
            }
            if (i23 != 0) {
            }
            if (i25 != 0) {
            }
            if (i28 != 0) {
            }
            if (i31 != 0) {
            }
            if (i33 != 0) {
            }
            if (i35 != 0) {
            }
            z16 = z32;
            f12 = f11;
            z17 = z33;
            abstractC8972b2 = abstractC8972b6;
            z18 = z36;
            z19 = z34;
            z21 = z35;
            if (i37 != 0) {
            }
            j16 = j14;
            i39 = i36;
            z22 = false;
            j17 = j23;
            long j24222 = j15;
            u11.j0();
            if (str3 != null) {
            }
            float badgeHeight222 = getBadgeHeight(size);
            z23 = z37;
            if (function02 != null) {
            }
            if (z38) {
            }
            u11.o(-302537163);
            if (z24) {
            }
            u11.k();
            float leftPadding222 = getLeftPadding(size, str3, abstractC8972b2 != null);
            if (z23) {
            }
            e eVar5222 = eVar2;
            u11.o(-302525056);
            e.a aVar222 = e.f40358c0;
            if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
            }
            u11.k();
            e j25222 = T.j(aVar222, 0.0f, 0.0f, z23 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getLeftGap(size), 0.0f, 11);
            e j26222 = T.j(aVar222, z23 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getRightGap(size), 0.0f, 0.0f, 0.0f, 14);
            if (z16) {
            }
            if (z17) {
            }
            if (z21) {
            }
            if (z19) {
            }
            u11.o(-302497592);
            e eVar6222 = eVar3;
            if ((57344 & i39) == 16384) {
            }
            C11 = u11.C();
            if (!z25) {
            }
            C11 = new DsBadgeKt$DsBadge$2$1(function02);
            u11.x(C11);
            u11.k();
            int i45222 = i38;
            float f14222 = m1838getDp0D9Ej5fM2;
            K1.T textStyle222 = getTextStyle(size);
            DsSpacings dsSpacings222 = DsSpacings.INSTANCE;
            float f15222 = m1838getDp0D9Ej5fM;
            String str7222 = str3;
            c3969l = u11;
            String str8222 = str4;
            FoundationBadgeKt.m2974FoundationBadgeWhIEsx8(eVar5222, eVar6222, j25222, j26222, badgeHeight222, f15222, f14222, m1838getDp0D9Ej5fM3, m1838getDp0D9Ej5fM4, backgroundBrush, (Function0) C11, z38, abstractC8972b2, abstractC8972b4, j17, j16, str7222, textStyle222, j24222, dsSpacings222.m1838getDp0D9Ej5fM(), dsSpacings222.m1838getDp0D9Ej5fM(), getIconSize(size), T.b(leftPadding222, 0.0f, rightPadding, 0.0f, 10), isAllCaps(size), c3969l, ((i45222 >> 6) & 14) | ((i45222 << 24) & 1879048192), ((i39 >> 3) & 896) | 805306368 | (i45222 & 57344) | (458752 & (i45222 << 6)) | ((i45222 >> 3) & 3670016) | ((i45222 << 9) & 234881024), 6, 0);
            eVar4 = eVar5222;
            j19 = j17;
            j21 = j16;
            str5 = str7222;
            j22 = j24222;
            f13 = f12;
            z26 = z16;
            z27 = z17;
            z28 = z21;
            z29 = z18;
            function03 = function02;
            str6 = str8222;
            abstractC8972b5 = abstractC8972b2;
            z31 = z19;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        i15 = i13 & 8;
        if (i15 == 0) {
        }
        i16 = i13 & 16;
        if (i16 == 0) {
        }
        i17 = i13 & 32;
        if (i17 == 0) {
        }
        if ((i11 & 1572864) != 0) {
        }
        i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i18 == 0) {
        }
        i19 = i13 & 256;
        if (i19 == 0) {
        }
        i21 = i19;
        i22 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i22 != 0) {
        }
        i23 = i22;
        i24 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i24 == 0) {
        }
        i27 = i13 & 2048;
        if (i27 == 0) {
        }
        int i42222 = i26;
        i29 = i14;
        i31 = i13 & 4096;
        if (i31 == 0) {
        }
        i33 = i13 & 8192;
        if (i33 == 0) {
        }
        i35 = i13 & 16384;
        if (i35 == 0) {
        }
        i37 = i13 & 32768;
        if (i37 != 0) {
        }
        if ((i29 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i41 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if ((i13 & 64) != 0) {
        }
        if (i18 != 0) {
        }
        if (i21 != 0) {
        }
        if (i23 != 0) {
        }
        if (i25 != 0) {
        }
        if (i28 != 0) {
        }
        if (i31 != 0) {
        }
        if (i33 != 0) {
        }
        if (i35 != 0) {
        }
        z16 = z32;
        f12 = f11;
        z17 = z33;
        abstractC8972b2 = abstractC8972b6;
        z18 = z36;
        z19 = z34;
        z21 = z35;
        if (i37 != 0) {
        }
        j16 = j14;
        i39 = i36;
        z22 = false;
        j17 = j23;
        long j242222 = j15;
        u11.j0();
        if (str3 != null) {
        }
        float badgeHeight2222 = getBadgeHeight(size);
        z23 = z37;
        if (function02 != null) {
        }
        if (z38) {
        }
        u11.o(-302537163);
        if (z24) {
        }
        u11.k();
        float leftPadding2222 = getLeftPadding(size, str3, abstractC8972b2 != null);
        if (z23) {
        }
        e eVar52222 = eVar2;
        u11.o(-302525056);
        e.a aVar2222 = e.f40358c0;
        if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
        }
        u11.k();
        e j252222 = T.j(aVar2222, 0.0f, 0.0f, z23 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getLeftGap(size), 0.0f, 11);
        e j262222 = T.j(aVar2222, z23 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getRightGap(size), 0.0f, 0.0f, 0.0f, 14);
        if (z16) {
        }
        if (z17) {
        }
        if (z21) {
        }
        if (z19) {
        }
        u11.o(-302497592);
        e eVar62222 = eVar3;
        if ((57344 & i39) == 16384) {
        }
        C11 = u11.C();
        if (!z25) {
        }
        C11 = new DsBadgeKt$DsBadge$2$1(function02);
        u11.x(C11);
        u11.k();
        int i452222 = i38;
        float f142222 = m1838getDp0D9Ej5fM2;
        K1.T textStyle2222 = getTextStyle(size);
        DsSpacings dsSpacings2222 = DsSpacings.INSTANCE;
        float f152222 = m1838getDp0D9Ej5fM;
        String str72222 = str3;
        c3969l = u11;
        String str82222 = str4;
        FoundationBadgeKt.m2974FoundationBadgeWhIEsx8(eVar52222, eVar62222, j252222, j262222, badgeHeight2222, f152222, f142222, m1838getDp0D9Ej5fM3, m1838getDp0D9Ej5fM4, backgroundBrush, (Function0) C11, z38, abstractC8972b2, abstractC8972b4, j17, j16, str72222, textStyle2222, j242222, dsSpacings2222.m1838getDp0D9Ej5fM(), dsSpacings2222.m1838getDp0D9Ej5fM(), getIconSize(size), T.b(leftPadding2222, 0.0f, rightPadding, 0.0f, 10), isAllCaps(size), c3969l, ((i452222 >> 6) & 14) | ((i452222 << 24) & 1879048192), ((i39 >> 3) & 896) | 805306368 | (i452222 & 57344) | (458752 & (i452222 << 6)) | ((i452222 >> 3) & 3670016) | ((i452222 << 9) & 234881024), 6, 0);
        eVar4 = eVar52222;
        j19 = j17;
        j21 = j16;
        str5 = str72222;
        j22 = j242222;
        f13 = f12;
        z26 = z16;
        z27 = z17;
        z28 = z21;
        z29 = z18;
        function03 = function02;
        str6 = str82222;
        abstractC8972b5 = abstractC8972b2;
        z31 = z19;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    private static final float getBadgeHeight(DsBadgeSize dsBadgeSize) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[dsBadgeSize.ordinal()];
        if (i11 == 1) {
            return DsSpacings.INSTANCE.m1844getDp14D9Ej5fM();
        }
        if (i11 == 2) {
            return DsSpacings.INSTANCE.m1845getDp16D9Ej5fM();
        }
        if (i11 == 3) {
            return DsSpacings.INSTANCE.m1848getDp20D9Ej5fM();
        }
        if (i11 == 4) {
            return DsSpacings.INSTANCE.m1850getDp24D9Ej5fM();
        }
        if (i11 == 5) {
            return DsSpacings.INSTANCE.m1853getDp32D9Ej5fM();
        }
        throw new Sc.o();
    }

    private static final float getIconSize(DsBadgeSize dsBadgeSize) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[dsBadgeSize.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return DsSpacings.INSTANCE.m1842getDp12D9Ej5fM();
        }
        if (i11 == 3 || i11 == 4 || i11 == 5) {
            return DsSpacings.INSTANCE.m1845getDp16D9Ej5fM();
        }
        throw new Sc.o();
    }

    private static final float getLeftGap(DsBadgeSize dsBadgeSize) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[dsBadgeSize.ordinal()];
        if (i11 == 1) {
            return DsSpacings.INSTANCE.m1839getDp1D9Ej5fM();
        }
        if (i11 == 2 || i11 == 3) {
            return DsSpacings.INSTANCE.m1847getDp2D9Ej5fM();
        }
        if (i11 == 4 || i11 == 5) {
            return DsSpacings.INSTANCE.m1854getDp4D9Ej5fM();
        }
        throw new Sc.o();
    }

    private static final float getLeftPadding(DsBadgeSize dsBadgeSize, String str, boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[dsBadgeSize.ordinal()];
        if (i11 == 1) {
            return (str == null || str.length() == 0) ? DsSpacings.INSTANCE.m1839getDp1D9Ej5fM() : !z11 ? DsSpacings.INSTANCE.m1852getDp3D9Ej5fM() : DsSpacings.INSTANCE.m1847getDp2D9Ej5fM();
        }
        if (i11 == 2) {
            return (str == null || str.length() == 0) ? DsSpacings.INSTANCE.m1847getDp2D9Ej5fM() : !z11 ? DsSpacings.INSTANCE.m1857getDp5D9Ej5fM() : DsSpacings.INSTANCE.m1852getDp3D9Ej5fM();
        }
        if (i11 == 3) {
            return (str == null || str.length() == 0) ? DsSpacings.INSTANCE.m1847getDp2D9Ej5fM() : !z11 ? DsSpacings.INSTANCE.m1859getDp6D9Ej5fM() : DsSpacings.INSTANCE.m1854getDp4D9Ej5fM();
        }
        if (i11 == 4) {
            return (str == null || str.length() == 0) ? DsSpacings.INSTANCE.m1854getDp4D9Ej5fM() : !z11 ? DsSpacings.INSTANCE.m1861getDp8D9Ej5fM() : DsSpacings.INSTANCE.m1859getDp6D9Ej5fM();
        }
        if (i11 == 5) {
            return !z11 ? DsSpacings.INSTANCE.m1842getDp12D9Ej5fM() : DsSpacings.INSTANCE.m1861getDp8D9Ej5fM();
        }
        throw new Sc.o();
    }

    private static final float getRightGap(DsBadgeSize dsBadgeSize) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[dsBadgeSize.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return DsSpacings.INSTANCE.m1838getDp0D9Ej5fM();
        }
        if (i11 == 4 || i11 == 5) {
            return DsSpacings.INSTANCE.m1847getDp2D9Ej5fM();
        }
        throw new Sc.o();
    }

    private static final float getRightPadding(DsBadgeSize dsBadgeSize, boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[dsBadgeSize.ordinal()];
        if (i11 == 1) {
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            return z11 ? dsSpacings.m1838getDp0D9Ej5fM() : dsSpacings.m1852getDp3D9Ej5fM();
        }
        if (i11 == 2) {
            DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
            return z11 ? dsSpacings2.m1838getDp0D9Ej5fM() : dsSpacings2.m1857getDp5D9Ej5fM();
        }
        if (i11 == 3) {
            DsSpacings dsSpacings3 = DsSpacings.INSTANCE;
            return z11 ? dsSpacings3.m1847getDp2D9Ej5fM() : dsSpacings3.m1859getDp6D9Ej5fM();
        }
        if (i11 == 4) {
            DsSpacings dsSpacings4 = DsSpacings.INSTANCE;
            return z11 ? dsSpacings4.m1847getDp2D9Ej5fM() : dsSpacings4.m1861getDp8D9Ej5fM();
        }
        if (i11 != 5) {
            throw new Sc.o();
        }
        DsSpacings dsSpacings5 = DsSpacings.INSTANCE;
        return z11 ? dsSpacings5.m1854getDp4D9Ej5fM() : dsSpacings5.m1842getDp12D9Ej5fM();
    }

    private static final K1.T getTextStyle(DsBadgeSize dsBadgeSize) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[dsBadgeSize.ordinal()];
        if (i11 == 1) {
            return UniTheme.INSTANCE.getTypography().getBody200XSmall();
        }
        if (i11 == 2) {
            return UniTheme.INSTANCE.getTypography().getBodyAccent250Caption();
        }
        if (i11 == 3) {
            return UniTheme.INSTANCE.getTypography().getBodyControl300XSmall();
        }
        if (i11 == 4) {
            return UniTheme.INSTANCE.getTypography().getBodyControl400Small();
        }
        if (i11 == 5) {
            return UniTheme.INSTANCE.getTypography().getBodyControl500Medium();
        }
        throw new Sc.o();
    }

    private static final boolean isAllCaps(DsBadgeSize dsBadgeSize) {
        return dsBadgeSize == DsBadgeSize.SIZE_300;
    }
}
