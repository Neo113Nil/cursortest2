package ru.ozon.uni.android.ds.compose.component.tooltip;

import A0.h;
import B1.B;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import P0.p2;
import S0.A0;
import S0.A1;
import S0.C3956f1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.C6041S;
import d2.C6054l;
import d2.InterfaceC6040Q;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonKt;
import ru.ozon.uni.android.ds.compose.component.tooltip.DsTooltipBeakPosition;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0097\u0001\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a£\u0001\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u001c\u001ay\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 ²\u0006\f\u0010\u001f\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/compose/ui/e;", "modifier", "titleModifier", "subtitleModifier", "subtitle", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle;", "style", "", "hasCloseButton", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "beakPosition", "LB1/B;", "anchorLayoutCoordinates", "Ld2/S;", "properties", "Lkotlin/Function0;", "", "onDismissRequest", "onCloseClick", "DsTooltip", "(Ljava/lang/String;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle;ZLru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;LB1/B;Ld2/S;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;III)V", "LS0/A1;", "", "beakOffset", "Ld2/Q;", "popupPositionProvider", "(Ljava/lang/String;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle;ZLru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;LS0/A1;Ld2/Q;Ld2/S;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;III)V", "DsTooltipBox", "(Ljava/lang/String;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle;ZLru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;ILkotlin/jvm/functions/Function0;LS0/k;II)V", "offset", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsTooltipKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsTooltip(@NotNull String title, e eVar, e eVar2, e eVar3, String str, DsTooltipStyle dsTooltipStyle, boolean z11, DsTooltipBeakPosition dsTooltipBeakPosition, B b11, C6041S c6041s, Function0<Unit> function0, Function0<Unit> function02, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        e eVar4;
        int i15;
        e eVar5;
        int i16;
        e eVar6;
        int i17;
        String str2;
        DsTooltipStyle dsTooltipStyle2;
        int i18;
        boolean z12;
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
        e eVar7;
        e eVar8;
        boolean z13;
        DsTooltipBeakPosition dsTooltipBeakPosition2;
        B b12;
        int i31;
        e eVar9;
        Function0<Unit> function03;
        C6041S c6041s2;
        Function0<Unit> function04;
        DsTooltipBeakPosition dsTooltipBeakPosition3;
        B b13;
        DsTooltipStyle dsTooltipStyle3;
        String str3;
        e eVar10;
        e eVar11;
        e eVar12;
        J0 m02;
        Intrinsics.checkNotNullParameter(title, "title");
        C3969l u11 = interfaceC3967k.u(-1757312069);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.n(title) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        int i32 = i13 & 2;
        if (i32 != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar4 = eVar;
            i14 |= u11.n(eVar4) ? 32 : 16;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 384;
            } else if ((i11 & 384) == 0) {
                eVar5 = eVar2;
                i14 |= u11.n(eVar5) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    eVar6 = eVar3;
                    i14 |= u11.n(eVar6) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i17 = i13 & 16;
                    if (i17 == 0) {
                        i14 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        str2 = str;
                        i14 |= u11.n(str2) ? 16384 : 8192;
                        if ((i11 & 196608) == 0) {
                            dsTooltipStyle2 = dsTooltipStyle;
                            i14 |= ((i13 & 32) == 0 && u11.n(dsTooltipStyle2)) ? 131072 : 65536;
                        } else {
                            dsTooltipStyle2 = dsTooltipStyle;
                        }
                        i18 = i13 & 64;
                        if (i18 != 0) {
                            i14 |= 1572864;
                            z12 = z11;
                        } else {
                            z12 = z11;
                            if ((i11 & 1572864) == 0) {
                                i14 |= u11.p(z12) ? 1048576 : 524288;
                            }
                        }
                        i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i19 != 0) {
                            i14 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            i14 |= u11.n(dsTooltipBeakPosition) ? 8388608 : 4194304;
                        }
                        i21 = i13 & 256;
                        if (i21 != 0) {
                            i14 |= 100663296;
                        } else if ((i11 & 100663296) == 0) {
                            i22 = i21;
                            i14 |= u11.F(b11) ? 67108864 : 33554432;
                            i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                            if (i23 == 0) {
                                i14 |= 805306368;
                            } else if ((i11 & 805306368) == 0) {
                                i24 = i23;
                                i14 |= u11.n(c6041s) ? 536870912 : 268435456;
                                i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                                if (i25 != 0) {
                                    i27 = i12 | 6;
                                    i26 = i25;
                                } else if ((i12 & 6) == 0) {
                                    i26 = i25;
                                    i27 = i12 | (u11.F(function0) ? 4 : 2);
                                } else {
                                    i26 = i25;
                                    i27 = i12;
                                }
                                i28 = i13 & 2048;
                                if (i28 != 0) {
                                    i27 |= 48;
                                } else if ((i12 & 48) == 0) {
                                    i29 = i28;
                                    i27 |= u11.F(function02) ? 32 : 16;
                                    if ((i14 & 306783379) != 306783378 && (i27 & 19) == 18 && u11.b()) {
                                        u11.j();
                                        dsTooltipBeakPosition3 = dsTooltipBeakPosition;
                                        c6041s2 = c6041s;
                                        function04 = function02;
                                        dsTooltipStyle3 = dsTooltipStyle2;
                                        eVar12 = eVar4;
                                        eVar11 = eVar5;
                                        b13 = b11;
                                        function03 = function0;
                                        str3 = str2;
                                        eVar10 = eVar6;
                                    } else {
                                        u11.Q0();
                                        if ((i11 & 1) != 0 || u11.w0()) {
                                            e eVar13 = i32 == 0 ? e.f40358c0 : eVar4;
                                            e eVar14 = i15 == 0 ? e.f40358c0 : eVar5;
                                            e eVar15 = i16 == 0 ? e.f40358c0 : eVar6;
                                            if (i17 != 0) {
                                                str2 = null;
                                            }
                                            if ((i13 & 32) != 0) {
                                                dsTooltipStyle2 = DsTooltipStyle.INSTANCE.m1835default(u11, 6);
                                                i14 &= -458753;
                                            }
                                            if (i18 != 0) {
                                                z12 = false;
                                            }
                                            DsTooltipBeakPosition dsTooltipBeakPosition4 = i19 == 0 ? DsTooltipBeakPosition.BottomCenter.INSTANCE : dsTooltipBeakPosition;
                                            B b14 = i22 == 0 ? null : b11;
                                            C6041S c6041s3 = i24 == 0 ? new C6041S(15, false, false) : c6041s;
                                            Function0<Unit> function05 = i26 == 0 ? function0 : null;
                                            if (i29 == 0) {
                                                u11.o(-818680939);
                                                Object C11 = u11.C();
                                                if (C11 == InterfaceC3967k.a.a()) {
                                                    C11 = DsTooltipKt$DsTooltip$1$1.INSTANCE;
                                                    u11.x(C11);
                                                }
                                                Function0<Unit> function06 = (Function0) C11;
                                                u11.k();
                                                eVar7 = eVar13;
                                                b12 = b14;
                                                function03 = function05;
                                                c6041s2 = c6041s3;
                                                function04 = function06;
                                                eVar8 = eVar14;
                                                z13 = z12;
                                                dsTooltipBeakPosition2 = dsTooltipBeakPosition4;
                                                i31 = i14;
                                                eVar9 = eVar15;
                                            } else {
                                                eVar7 = eVar13;
                                                eVar8 = eVar14;
                                                z13 = z12;
                                                dsTooltipBeakPosition2 = dsTooltipBeakPosition4;
                                                b12 = b14;
                                                i31 = i14;
                                                eVar9 = eVar15;
                                                function03 = function05;
                                                c6041s2 = c6041s3;
                                                function04 = function02;
                                            }
                                        } else {
                                            u11.j();
                                            if ((i13 & 32) != 0) {
                                                i14 &= -458753;
                                            }
                                            b12 = b11;
                                            c6041s2 = c6041s;
                                            function04 = function02;
                                            i31 = i14;
                                            z13 = z12;
                                            eVar7 = eVar4;
                                            eVar8 = eVar5;
                                            eVar9 = eVar6;
                                            dsTooltipBeakPosition2 = dsTooltipBeakPosition;
                                            function03 = function0;
                                        }
                                        u11.j0();
                                        DsTooltipPositionProvider dsTooltipPositionProvider = new DsTooltipPositionProvider(b12, dsTooltipBeakPosition2);
                                        int i33 = i31;
                                        B b15 = b12;
                                        int i34 = i27 << 3;
                                        DsTooltip(title, eVar7, eVar8, eVar9, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, dsTooltipPositionProvider.getBeakOffset$uni_release(), dsTooltipPositionProvider, c6041s2, function03, function04, u11, 33554430 & i33, (i34 & 896) | ((i33 >> 27) & 14) | (i34 & 112), 0);
                                        dsTooltipBeakPosition3 = dsTooltipBeakPosition2;
                                        b13 = b15;
                                        z12 = z13;
                                        dsTooltipStyle3 = dsTooltipStyle2;
                                        str3 = str2;
                                        eVar10 = eVar9;
                                        eVar11 = eVar8;
                                        eVar12 = eVar7;
                                    }
                                    m02 = u11.m0();
                                    if (m02 == null) {
                                        m02.G(new DsTooltipKt$DsTooltip$2(title, eVar12, eVar11, eVar10, str3, dsTooltipStyle3, z12, dsTooltipBeakPosition3, b13, c6041s2, function03, function04, i11, i12, i13));
                                        return;
                                    }
                                    return;
                                }
                                i29 = i28;
                                if ((i14 & 306783379) != 306783378) {
                                }
                                u11.Q0();
                                if ((i11 & 1) != 0) {
                                }
                                if (i32 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 != 0) {
                                }
                                if ((i13 & 32) != 0) {
                                }
                                if (i18 != 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i24 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                if (i29 == 0) {
                                }
                                u11.j0();
                                DsTooltipPositionProvider dsTooltipPositionProvider2 = new DsTooltipPositionProvider(b12, dsTooltipBeakPosition2);
                                int i332 = i31;
                                B b152 = b12;
                                int i342 = i27 << 3;
                                DsTooltip(title, eVar7, eVar8, eVar9, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, dsTooltipPositionProvider2.getBeakOffset$uni_release(), dsTooltipPositionProvider2, c6041s2, function03, function04, u11, 33554430 & i332, (i342 & 896) | ((i332 >> 27) & 14) | (i342 & 112), 0);
                                dsTooltipBeakPosition3 = dsTooltipBeakPosition2;
                                b13 = b152;
                                z12 = z13;
                                dsTooltipStyle3 = dsTooltipStyle2;
                                str3 = str2;
                                eVar10 = eVar9;
                                eVar11 = eVar8;
                                eVar12 = eVar7;
                                m02 = u11.m0();
                                if (m02 == null) {
                                }
                            }
                            i24 = i23;
                            i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                            if (i25 != 0) {
                            }
                            i28 = i13 & 2048;
                            if (i28 != 0) {
                            }
                            i29 = i28;
                            if ((i14 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i11 & 1) != 0) {
                            }
                            if (i32 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 != 0) {
                            }
                            if ((i13 & 32) != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i24 == 0) {
                            }
                            if (i26 == 0) {
                            }
                            if (i29 == 0) {
                            }
                            u11.j0();
                            DsTooltipPositionProvider dsTooltipPositionProvider22 = new DsTooltipPositionProvider(b12, dsTooltipBeakPosition2);
                            int i3322 = i31;
                            B b1522 = b12;
                            int i3422 = i27 << 3;
                            DsTooltip(title, eVar7, eVar8, eVar9, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, dsTooltipPositionProvider22.getBeakOffset$uni_release(), dsTooltipPositionProvider22, c6041s2, function03, function04, u11, 33554430 & i3322, (i3422 & 896) | ((i3322 >> 27) & 14) | (i3422 & 112), 0);
                            dsTooltipBeakPosition3 = dsTooltipBeakPosition2;
                            b13 = b1522;
                            z12 = z13;
                            dsTooltipStyle3 = dsTooltipStyle2;
                            str3 = str2;
                            eVar10 = eVar9;
                            eVar11 = eVar8;
                            eVar12 = eVar7;
                            m02 = u11.m0();
                            if (m02 == null) {
                            }
                        }
                        i22 = i21;
                        i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i23 == 0) {
                        }
                        i24 = i23;
                        i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                        if (i25 != 0) {
                        }
                        i28 = i13 & 2048;
                        if (i28 != 0) {
                        }
                        i29 = i28;
                        if ((i14 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i11 & 1) != 0) {
                        }
                        if (i32 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 != 0) {
                        }
                        if ((i13 & 32) != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (i29 == 0) {
                        }
                        u11.j0();
                        DsTooltipPositionProvider dsTooltipPositionProvider222 = new DsTooltipPositionProvider(b12, dsTooltipBeakPosition2);
                        int i33222 = i31;
                        B b15222 = b12;
                        int i34222 = i27 << 3;
                        DsTooltip(title, eVar7, eVar8, eVar9, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, dsTooltipPositionProvider222.getBeakOffset$uni_release(), dsTooltipPositionProvider222, c6041s2, function03, function04, u11, 33554430 & i33222, (i34222 & 896) | ((i33222 >> 27) & 14) | (i34222 & 112), 0);
                        dsTooltipBeakPosition3 = dsTooltipBeakPosition2;
                        b13 = b15222;
                        z12 = z13;
                        dsTooltipStyle3 = dsTooltipStyle2;
                        str3 = str2;
                        eVar10 = eVar9;
                        eVar11 = eVar8;
                        eVar12 = eVar7;
                        m02 = u11.m0();
                        if (m02 == null) {
                        }
                    }
                    str2 = str;
                    if ((i11 & 196608) == 0) {
                    }
                    i18 = i13 & 64;
                    if (i18 != 0) {
                    }
                    i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i19 != 0) {
                    }
                    i21 = i13 & 256;
                    if (i21 != 0) {
                    }
                    i22 = i21;
                    i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i23 == 0) {
                    }
                    i24 = i23;
                    i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i25 != 0) {
                    }
                    i28 = i13 & 2048;
                    if (i28 != 0) {
                    }
                    i29 = i28;
                    if ((i14 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i32 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 != 0) {
                    }
                    if ((i13 & 32) != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (i29 == 0) {
                    }
                    u11.j0();
                    DsTooltipPositionProvider dsTooltipPositionProvider2222 = new DsTooltipPositionProvider(b12, dsTooltipBeakPosition2);
                    int i332222 = i31;
                    B b152222 = b12;
                    int i342222 = i27 << 3;
                    DsTooltip(title, eVar7, eVar8, eVar9, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, dsTooltipPositionProvider2222.getBeakOffset$uni_release(), dsTooltipPositionProvider2222, c6041s2, function03, function04, u11, 33554430 & i332222, (i342222 & 896) | ((i332222 >> 27) & 14) | (i342222 & 112), 0);
                    dsTooltipBeakPosition3 = dsTooltipBeakPosition2;
                    b13 = b152222;
                    z12 = z13;
                    dsTooltipStyle3 = dsTooltipStyle2;
                    str3 = str2;
                    eVar10 = eVar9;
                    eVar11 = eVar8;
                    eVar12 = eVar7;
                    m02 = u11.m0();
                    if (m02 == null) {
                    }
                }
                eVar6 = eVar3;
                i17 = i13 & 16;
                if (i17 == 0) {
                }
                str2 = str;
                if ((i11 & 196608) == 0) {
                }
                i18 = i13 & 64;
                if (i18 != 0) {
                }
                i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i19 != 0) {
                }
                i21 = i13 & 256;
                if (i21 != 0) {
                }
                i22 = i21;
                i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i23 == 0) {
                }
                i24 = i23;
                i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i25 != 0) {
                }
                i28 = i13 & 2048;
                if (i28 != 0) {
                }
                i29 = i28;
                if ((i14 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i32 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 != 0) {
                }
                if ((i13 & 32) != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 == 0) {
                }
                if (i22 == 0) {
                }
                if (i24 == 0) {
                }
                if (i26 == 0) {
                }
                if (i29 == 0) {
                }
                u11.j0();
                DsTooltipPositionProvider dsTooltipPositionProvider22222 = new DsTooltipPositionProvider(b12, dsTooltipBeakPosition2);
                int i3322222 = i31;
                B b1522222 = b12;
                int i3422222 = i27 << 3;
                DsTooltip(title, eVar7, eVar8, eVar9, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, dsTooltipPositionProvider22222.getBeakOffset$uni_release(), dsTooltipPositionProvider22222, c6041s2, function03, function04, u11, 33554430 & i3322222, (i3422222 & 896) | ((i3322222 >> 27) & 14) | (i3422222 & 112), 0);
                dsTooltipBeakPosition3 = dsTooltipBeakPosition2;
                b13 = b1522222;
                z12 = z13;
                dsTooltipStyle3 = dsTooltipStyle2;
                str3 = str2;
                eVar10 = eVar9;
                eVar11 = eVar8;
                eVar12 = eVar7;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            eVar5 = eVar2;
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            eVar6 = eVar3;
            i17 = i13 & 16;
            if (i17 == 0) {
            }
            str2 = str;
            if ((i11 & 196608) == 0) {
            }
            i18 = i13 & 64;
            if (i18 != 0) {
            }
            i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i19 != 0) {
            }
            i21 = i13 & 256;
            if (i21 != 0) {
            }
            i22 = i21;
            i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i23 == 0) {
            }
            i24 = i23;
            i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i25 != 0) {
            }
            i28 = i13 & 2048;
            if (i28 != 0) {
            }
            i29 = i28;
            if ((i14 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i32 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 != 0) {
            }
            if ((i13 & 32) != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 == 0) {
            }
            if (i22 == 0) {
            }
            if (i24 == 0) {
            }
            if (i26 == 0) {
            }
            if (i29 == 0) {
            }
            u11.j0();
            DsTooltipPositionProvider dsTooltipPositionProvider222222 = new DsTooltipPositionProvider(b12, dsTooltipBeakPosition2);
            int i33222222 = i31;
            B b15222222 = b12;
            int i34222222 = i27 << 3;
            DsTooltip(title, eVar7, eVar8, eVar9, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, dsTooltipPositionProvider222222.getBeakOffset$uni_release(), dsTooltipPositionProvider222222, c6041s2, function03, function04, u11, 33554430 & i33222222, (i34222222 & 896) | ((i33222222 >> 27) & 14) | (i34222222 & 112), 0);
            dsTooltipBeakPosition3 = dsTooltipBeakPosition2;
            b13 = b15222222;
            z12 = z13;
            dsTooltipStyle3 = dsTooltipStyle2;
            str3 = str2;
            eVar10 = eVar9;
            eVar11 = eVar8;
            eVar12 = eVar7;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        eVar4 = eVar;
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        eVar5 = eVar2;
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        eVar6 = eVar3;
        i17 = i13 & 16;
        if (i17 == 0) {
        }
        str2 = str;
        if ((i11 & 196608) == 0) {
        }
        i18 = i13 & 64;
        if (i18 != 0) {
        }
        i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i19 != 0) {
        }
        i21 = i13 & 256;
        if (i21 != 0) {
        }
        i22 = i21;
        i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i23 == 0) {
        }
        i24 = i23;
        i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i25 != 0) {
        }
        i28 = i13 & 2048;
        if (i28 != 0) {
        }
        i29 = i28;
        if ((i14 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i32 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 != 0) {
        }
        if ((i13 & 32) != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 == 0) {
        }
        if (i22 == 0) {
        }
        if (i24 == 0) {
        }
        if (i26 == 0) {
        }
        if (i29 == 0) {
        }
        u11.j0();
        DsTooltipPositionProvider dsTooltipPositionProvider2222222 = new DsTooltipPositionProvider(b12, dsTooltipBeakPosition2);
        int i332222222 = i31;
        B b152222222 = b12;
        int i342222222 = i27 << 3;
        DsTooltip(title, eVar7, eVar8, eVar9, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, dsTooltipPositionProvider2222222.getBeakOffset$uni_release(), dsTooltipPositionProvider2222222, c6041s2, function03, function04, u11, 33554430 & i332222222, (i342222222 & 896) | ((i332222222 >> 27) & 14) | (i342222222 & 112), 0);
        dsTooltipBeakPosition3 = dsTooltipBeakPosition2;
        b13 = b152222222;
        z12 = z13;
        dsTooltipStyle3 = dsTooltipStyle2;
        str3 = str2;
        eVar10 = eVar9;
        eVar11 = eVar8;
        eVar12 = eVar7;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int DsTooltip$lambda$3(A1<Integer> a12) {
        return a12.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsTooltipBox(String str, e eVar, e eVar2, e eVar3, String str2, DsTooltipStyle dsTooltipStyle, boolean z11, DsTooltipBeakPosition dsTooltipBeakPosition, int i11, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        String str3;
        int i14;
        e eVar4;
        int i15;
        e eVar5;
        int i16;
        e eVar6;
        int i17;
        String str4;
        DsTooltipStyle dsTooltipStyle2;
        int i18;
        boolean z12;
        int i19;
        DsTooltipBeakPosition dsTooltipBeakPosition2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Function0<Unit> function02;
        e eVar7;
        e eVar8;
        int I11;
        int I12;
        String str5;
        e eVar9;
        Function0<Unit> function03;
        DsTooltipStyle dsTooltipStyle3;
        e eVar10;
        e eVar11;
        DsTooltipBeakPosition dsTooltipBeakPosition3;
        C3969l c3969l;
        e eVar12;
        boolean z13;
        Function0<Unit> function04;
        int i27;
        String str6;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(145307673);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i12 & 6) == 0) {
                i14 = (u11.n(str3) ? 4 : 2) | i12;
            } else {
                i14 = i12;
            }
        }
        int i28 = i13 & 2;
        if (i28 != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            eVar4 = eVar;
            i14 |= u11.n(eVar4) ? 32 : 16;
            i15 = 4 & i13;
            if (i15 == 0) {
                i14 |= 384;
            } else if ((i12 & 384) == 0) {
                eVar5 = eVar2;
                i14 |= u11.n(eVar5) ? 256 : 128;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 3072;
                    eVar6 = eVar3;
                } else if ((i12 & 3072) == 0) {
                    eVar6 = eVar3;
                    i14 |= u11.n(eVar6) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                } else {
                    eVar6 = eVar3;
                }
                i17 = i13 & 16;
                if (i17 != 0) {
                    i14 |= 24576;
                    str4 = str2;
                } else if ((i12 & 24576) == 0) {
                    str4 = str2;
                    i14 |= u11.n(str4) ? 16384 : 8192;
                } else {
                    str4 = str2;
                }
                if ((i12 & 196608) == 0) {
                    dsTooltipStyle2 = dsTooltipStyle;
                    i14 |= ((i13 & 32) == 0 && u11.n(dsTooltipStyle2)) ? 131072 : 65536;
                } else {
                    dsTooltipStyle2 = dsTooltipStyle;
                }
                i18 = i13 & 64;
                if (i18 != 0) {
                    i14 |= 1572864;
                    z12 = z11;
                } else {
                    z12 = z11;
                    if ((i12 & 1572864) == 0) {
                        i14 |= u11.p(z12) ? 1048576 : 524288;
                    }
                }
                i19 = 128 & i13;
                if (i19 != 0) {
                    i14 |= 12582912;
                    dsTooltipBeakPosition2 = dsTooltipBeakPosition;
                } else {
                    dsTooltipBeakPosition2 = dsTooltipBeakPosition;
                    if ((i12 & 12582912) == 0) {
                        i14 |= u11.n(dsTooltipBeakPosition2) ? 8388608 : 4194304;
                    }
                }
                i21 = 256 & i13;
                if (i21 != 0) {
                    i14 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    i22 = i19;
                    i14 |= u11.r(i11) ? 67108864 : 33554432;
                    i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i23 == 0) {
                        i14 |= 805306368;
                    } else if ((i12 & 805306368) == 0) {
                        i24 = i23;
                        i14 |= u11.F(function0) ? 536870912 : 268435456;
                        if ((i14 & 306783379) == 306783378 || !u11.b()) {
                            u11.Q0();
                            if ((i12 & 1) != 0 || u11.w0()) {
                                if (i28 != 0) {
                                    eVar4 = e.f40358c0;
                                }
                                if (i15 != 0) {
                                    eVar5 = e.f40358c0;
                                }
                                e eVar13 = i16 != 0 ? e.f40358c0 : eVar6;
                                if (i17 != 0) {
                                    str4 = null;
                                }
                                if ((i13 & 32) != 0) {
                                    i14 &= -458753;
                                    dsTooltipStyle2 = DsTooltipStyle.INSTANCE.m1835default(u11, 6);
                                }
                                if (i18 != 0) {
                                    z12 = false;
                                }
                                if (i22 != 0) {
                                    dsTooltipBeakPosition2 = DsTooltipBeakPosition.BottomCenter.INSTANCE;
                                }
                                int i29 = i21 != 0 ? 0 : i11;
                                if (i24 != 0) {
                                    u11.o(-742618374);
                                    Object C11 = u11.C();
                                    if (C11 == InterfaceC3967k.a.a()) {
                                        C11 = DsTooltipKt$DsTooltipBox$1$1.INSTANCE;
                                        u11.x(C11);
                                    }
                                    u11.k();
                                    i26 = i14;
                                    function02 = (Function0) C11;
                                    i25 = i29;
                                } else {
                                    i25 = i29;
                                    i26 = i14;
                                    function02 = function0;
                                }
                                eVar6 = eVar13;
                                eVar7 = eVar4;
                                eVar8 = eVar5;
                            } else {
                                u11.j();
                                if ((i13 & 32) != 0) {
                                    i14 &= -458753;
                                }
                                i25 = i11;
                                i26 = i14;
                                eVar7 = eVar4;
                                eVar8 = eVar5;
                                function02 = function0;
                            }
                            u11.j0();
                            DsSpacings dsSpacings = DsSpacings.INSTANCE;
                            e eVar14 = eVar6;
                            int i31 = i25;
                            e eVar15 = eVar7;
                            e i32 = T.i(androidx.compose.foundation.e.b(a0.t(eVar7, dsSpacings.m1841getDp100D9Ej5fM(), 0.0f, 2), dsTooltipStyle2.getBackground(), new RoundRectWithBeak(dsSpacings.m1845getDp16D9Ej5fM(), dsTooltipBeakPosition2, i31, 0.0f, 0.0f, 24, null)), Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Left.INSTANCE) ? dsSpacings.m1842getDp12D9Ej5fM() : dsSpacings.m1838getDp0D9Ej5fM(), (!(dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.TopCenter) || (dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.TopCustom)) ? dsSpacings.m1842getDp12D9Ej5fM() : dsSpacings.m1838getDp0D9Ej5fM(), Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Right.INSTANCE) ? dsSpacings.m1842getDp12D9Ej5fM() : dsSpacings.m1838getDp0D9Ej5fM(), (!(dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.BottomCenter) || (dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.BottomCustom)) ? dsSpacings.m1842getDp12D9Ej5fM() : dsSpacings.m1838getDp0D9Ej5fM());
                            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                            I11 = u11.I();
                            A0 d11 = u11.d();
                            e f11 = c.f(u11, i32);
                            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                                u11.H(a11);
                            } else {
                                u11.e();
                            }
                            Function2 f12 = E.f(u11, f7, u11, d11);
                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                a.d(I11, u11, I11, f12);
                            }
                            F1.b(u11, f11, InterfaceC2801g.a.f());
                            C5187j c5187j = C5187j.f39515a;
                            e.a aVar = e.f40358c0;
                            DsTooltipBeakPosition dsTooltipBeakPosition4 = dsTooltipBeakPosition2;
                            e a12 = c5187j.a(T.i(aVar, dsSpacings.m1842getDp12D9Ej5fM(), dsSpacings.m1842getDp12D9Ej5fM(), z12 ? dsSpacings.m1853getDp32D9Ej5fM() : dsSpacings.m1842getDp12D9Ej5fM(), dsSpacings.m1842getDp12D9Ej5fM()), InterfaceC6250b.a.o());
                            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                            I12 = u11.I();
                            A0 d12 = u11.d();
                            e f13 = c.f(u11, a12);
                            String str7 = str4;
                            Function0 a14 = InterfaceC2801g.a.a();
                            u11.i();
                            if (u11.t()) {
                                u11.H(a14);
                            } else {
                                u11.e();
                            }
                            Function2 g10 = b.g(u11, a13, u11, d12);
                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                                a.d(I12, u11, I12, g10);
                            }
                            F1.b(u11, f13, InterfaceC2801g.a.f());
                            UniTheme uniTheme = UniTheme.INSTANCE;
                            p2.b(str3, eVar8, dsTooltipStyle2.getTitleColor(), 0L, 0L, null, 0L, 0, false, 0, 0, uniTheme.getTypography().getCompact400Small(), u11, (i26 & 14) | ((i26 >> 3) & 112), 0, 65528);
                            e eVar16 = eVar8;
                            str5 = (str7 != null || str7.length() == 0) ? null : str7;
                            u11.o(-832556476);
                            if (str5 == null) {
                                eVar9 = eVar14;
                            } else {
                                eVar9 = eVar14;
                                p2.b(str5, T.j(eVar14, 0.0f, dsSpacings.m1847getDp2D9Ej5fM(), 0.0f, 0.0f, 13), dsTooltipStyle2.getSubtitleColor(), 0L, 0L, null, 0L, 0, false, 0, 0, uniTheme.getTypography().getBody300XSmall(), u11, 0, 0, 65528);
                                Unit unit = Unit.f71690a;
                            }
                            u11.k();
                            u11.f();
                            u11.o(1605038069);
                            if (z12) {
                                e a15 = c5187j.a(aVar, InterfaceC6250b.a.n());
                                V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
                                int I13 = u11.I();
                                A0 d13 = u11.d();
                                e f15 = c.f(u11, a15);
                                Function0 a16 = InterfaceC2801g.a.a();
                                u11.i();
                                if (u11.t()) {
                                    u11.H(a16);
                                } else {
                                    u11.e();
                                }
                                Function2 f16 = E.f(u11, f14, u11, d13);
                                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                                    a.d(I13, u11, I13, f16);
                                }
                                F1.b(u11, f15, InterfaceC2801g.a.f());
                                uniTheme.getIcons();
                                u11.B(-214941345);
                                AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_cross_filled_compact, "ic_m_cross_filled_compact", u11, 48);
                                u11.K();
                                function03 = function02;
                                DsIconButtonKt.DsIconButton(uniPainterResource, DsTooltipStyleKt.closeButtonStyle(dsTooltipStyle2, u11, (i26 >> 15) & 14), h.e(), T.j(aVar, 0.0f, dsSpacings.m1861getDp8D9Ej5fM(), dsSpacings.m1861getDp8D9Ej5fM(), 0.0f, 9), null, false, null, false, null, function03, u11, (1879048192 & i26) | 3072, 496);
                                u11.f();
                            } else {
                                function03 = function02;
                            }
                            u11.k();
                            u11.f();
                            e eVar17 = eVar9;
                            dsTooltipStyle3 = dsTooltipStyle2;
                            eVar10 = eVar17;
                            eVar11 = eVar15;
                            dsTooltipBeakPosition3 = dsTooltipBeakPosition4;
                            c3969l = u11;
                            eVar12 = eVar16;
                            z13 = z12;
                            function04 = function03;
                            i27 = i31;
                            str6 = str7;
                        } else {
                            u11.j();
                            function04 = function0;
                            dsTooltipBeakPosition3 = dsTooltipBeakPosition2;
                            str6 = str4;
                            c3969l = u11;
                            z13 = z12;
                            eVar12 = eVar5;
                            i27 = i11;
                            dsTooltipStyle3 = dsTooltipStyle2;
                            eVar10 = eVar6;
                            eVar11 = eVar4;
                        }
                        m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new DsTooltipKt$DsTooltipBox$3(str, eVar11, eVar12, eVar10, str6, dsTooltipStyle3, z13, dsTooltipBeakPosition3, i27, function04, i12, i13));
                            return;
                        }
                        return;
                    }
                    i24 = i23;
                    if ((i14 & 306783379) == 306783378) {
                    }
                    u11.Q0();
                    if ((i12 & 1) != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if ((i13 & 32) != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    eVar6 = eVar13;
                    eVar7 = eVar4;
                    eVar8 = eVar5;
                    u11.j0();
                    DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
                    e eVar142 = eVar6;
                    int i312 = i25;
                    e eVar152 = eVar7;
                    e i322 = T.i(androidx.compose.foundation.e.b(a0.t(eVar7, dsSpacings2.m1841getDp100D9Ej5fM(), 0.0f, 2), dsTooltipStyle2.getBackground(), new RoundRectWithBeak(dsSpacings2.m1845getDp16D9Ej5fM(), dsTooltipBeakPosition2, i312, 0.0f, 0.0f, 24, null)), Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Left.INSTANCE) ? dsSpacings2.m1842getDp12D9Ej5fM() : dsSpacings2.m1838getDp0D9Ej5fM(), (!(dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.TopCenter) || (dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.TopCustom)) ? dsSpacings2.m1842getDp12D9Ej5fM() : dsSpacings2.m1838getDp0D9Ej5fM(), Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Right.INSTANCE) ? dsSpacings2.m1842getDp12D9Ej5fM() : dsSpacings2.m1838getDp0D9Ej5fM(), (!(dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.BottomCenter) || (dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.BottomCustom)) ? dsSpacings2.m1842getDp12D9Ej5fM() : dsSpacings2.m1838getDp0D9Ej5fM());
                    V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d112 = u11.d();
                    e f112 = c.f(u11, i322);
                    Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f122 = E.f(u11, f72, u11, d112);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f122);
                    F1.b(u11, f112, InterfaceC2801g.a.f());
                    C5187j c5187j2 = C5187j.f39515a;
                    e.a aVar2 = e.f40358c0;
                    DsTooltipBeakPosition dsTooltipBeakPosition42 = dsTooltipBeakPosition2;
                    e a122 = c5187j2.a(T.i(aVar2, dsSpacings2.m1842getDp12D9Ej5fM(), dsSpacings2.m1842getDp12D9Ej5fM(), z12 ? dsSpacings2.m1853getDp32D9Ej5fM() : dsSpacings2.m1842getDp12D9Ej5fM(), dsSpacings2.m1842getDp12D9Ej5fM()), InterfaceC6250b.a.o());
                    C5194q a132 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                    I12 = u11.I();
                    A0 d122 = u11.d();
                    e f132 = c.f(u11, a122);
                    String str72 = str4;
                    Function0 a142 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                    }
                    Function2 g102 = b.g(u11, a132, u11, d122);
                    if (!u11.t()) {
                    }
                    a.d(I12, u11, I12, g102);
                    F1.b(u11, f132, InterfaceC2801g.a.f());
                    UniTheme uniTheme2 = UniTheme.INSTANCE;
                    p2.b(str3, eVar8, dsTooltipStyle2.getTitleColor(), 0L, 0L, null, 0L, 0, false, 0, 0, uniTheme2.getTypography().getCompact400Small(), u11, (i26 & 14) | ((i26 >> 3) & 112), 0, 65528);
                    e eVar162 = eVar8;
                    if (str72 != null) {
                    }
                    u11.o(-832556476);
                    if (str5 == null) {
                    }
                    u11.k();
                    u11.f();
                    u11.o(1605038069);
                    if (z12) {
                    }
                    u11.k();
                    u11.f();
                    e eVar172 = eVar9;
                    dsTooltipStyle3 = dsTooltipStyle2;
                    eVar10 = eVar172;
                    eVar11 = eVar152;
                    dsTooltipBeakPosition3 = dsTooltipBeakPosition42;
                    c3969l = u11;
                    eVar12 = eVar162;
                    z13 = z12;
                    function04 = function03;
                    i27 = i312;
                    str6 = str72;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                i22 = i19;
                i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i23 == 0) {
                }
                i24 = i23;
                if ((i14 & 306783379) == 306783378) {
                }
                u11.Q0();
                if ((i12 & 1) != 0) {
                }
                if (i28 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if ((i13 & 32) != 0) {
                }
                if (i18 != 0) {
                }
                if (i22 != 0) {
                }
                if (i21 != 0) {
                }
                if (i24 != 0) {
                }
                eVar6 = eVar13;
                eVar7 = eVar4;
                eVar8 = eVar5;
                u11.j0();
                DsSpacings dsSpacings22 = DsSpacings.INSTANCE;
                e eVar1422 = eVar6;
                int i3122 = i25;
                e eVar1522 = eVar7;
                e i3222 = T.i(androidx.compose.foundation.e.b(a0.t(eVar7, dsSpacings22.m1841getDp100D9Ej5fM(), 0.0f, 2), dsTooltipStyle2.getBackground(), new RoundRectWithBeak(dsSpacings22.m1845getDp16D9Ej5fM(), dsTooltipBeakPosition2, i3122, 0.0f, 0.0f, 24, null)), Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Left.INSTANCE) ? dsSpacings22.m1842getDp12D9Ej5fM() : dsSpacings22.m1838getDp0D9Ej5fM(), (!(dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.TopCenter) || (dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.TopCustom)) ? dsSpacings22.m1842getDp12D9Ej5fM() : dsSpacings22.m1838getDp0D9Ej5fM(), Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Right.INSTANCE) ? dsSpacings22.m1842getDp12D9Ej5fM() : dsSpacings22.m1838getDp0D9Ej5fM(), (!(dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.BottomCenter) || (dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.BottomCustom)) ? dsSpacings22.m1842getDp12D9Ej5fM() : dsSpacings22.m1838getDp0D9Ej5fM());
                V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d1122 = u11.d();
                e f1122 = c.f(u11, i3222);
                Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f1222 = E.f(u11, f722, u11, d1122);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f1222);
                F1.b(u11, f1122, InterfaceC2801g.a.f());
                C5187j c5187j22 = C5187j.f39515a;
                e.a aVar22 = e.f40358c0;
                DsTooltipBeakPosition dsTooltipBeakPosition422 = dsTooltipBeakPosition2;
                e a1222 = c5187j22.a(T.i(aVar22, dsSpacings22.m1842getDp12D9Ej5fM(), dsSpacings22.m1842getDp12D9Ej5fM(), z12 ? dsSpacings22.m1853getDp32D9Ej5fM() : dsSpacings22.m1842getDp12D9Ej5fM(), dsSpacings22.m1842getDp12D9Ej5fM()), InterfaceC6250b.a.o());
                C5194q a1322 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I12 = u11.I();
                A0 d1222 = u11.d();
                e f1322 = c.f(u11, a1222);
                String str722 = str4;
                Function0 a1422 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                }
                Function2 g1022 = b.g(u11, a1322, u11, d1222);
                if (!u11.t()) {
                }
                a.d(I12, u11, I12, g1022);
                F1.b(u11, f1322, InterfaceC2801g.a.f());
                UniTheme uniTheme22 = UniTheme.INSTANCE;
                p2.b(str3, eVar8, dsTooltipStyle2.getTitleColor(), 0L, 0L, null, 0L, 0, false, 0, 0, uniTheme22.getTypography().getCompact400Small(), u11, (i26 & 14) | ((i26 >> 3) & 112), 0, 65528);
                e eVar1622 = eVar8;
                if (str722 != null) {
                }
                u11.o(-832556476);
                if (str5 == null) {
                }
                u11.k();
                u11.f();
                u11.o(1605038069);
                if (z12) {
                }
                u11.k();
                u11.f();
                e eVar1722 = eVar9;
                dsTooltipStyle3 = dsTooltipStyle2;
                eVar10 = eVar1722;
                eVar11 = eVar1522;
                dsTooltipBeakPosition3 = dsTooltipBeakPosition422;
                c3969l = u11;
                eVar12 = eVar1622;
                z13 = z12;
                function04 = function03;
                i27 = i3122;
                str6 = str722;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            eVar5 = eVar2;
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            i17 = i13 & 16;
            if (i17 != 0) {
            }
            if ((i12 & 196608) == 0) {
            }
            i18 = i13 & 64;
            if (i18 != 0) {
            }
            i19 = 128 & i13;
            if (i19 != 0) {
            }
            i21 = 256 & i13;
            if (i21 != 0) {
            }
            i22 = i19;
            i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i23 == 0) {
            }
            i24 = i23;
            if ((i14 & 306783379) == 306783378) {
            }
            u11.Q0();
            if ((i12 & 1) != 0) {
            }
            if (i28 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if ((i13 & 32) != 0) {
            }
            if (i18 != 0) {
            }
            if (i22 != 0) {
            }
            if (i21 != 0) {
            }
            if (i24 != 0) {
            }
            eVar6 = eVar13;
            eVar7 = eVar4;
            eVar8 = eVar5;
            u11.j0();
            DsSpacings dsSpacings222 = DsSpacings.INSTANCE;
            e eVar14222 = eVar6;
            int i31222 = i25;
            e eVar15222 = eVar7;
            e i32222 = T.i(androidx.compose.foundation.e.b(a0.t(eVar7, dsSpacings222.m1841getDp100D9Ej5fM(), 0.0f, 2), dsTooltipStyle2.getBackground(), new RoundRectWithBeak(dsSpacings222.m1845getDp16D9Ej5fM(), dsTooltipBeakPosition2, i31222, 0.0f, 0.0f, 24, null)), Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Left.INSTANCE) ? dsSpacings222.m1842getDp12D9Ej5fM() : dsSpacings222.m1838getDp0D9Ej5fM(), (!(dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.TopCenter) || (dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.TopCustom)) ? dsSpacings222.m1842getDp12D9Ej5fM() : dsSpacings222.m1838getDp0D9Ej5fM(), Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Right.INSTANCE) ? dsSpacings222.m1842getDp12D9Ej5fM() : dsSpacings222.m1838getDp0D9Ej5fM(), (!(dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.BottomCenter) || (dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.BottomCustom)) ? dsSpacings222.m1842getDp12D9Ej5fM() : dsSpacings222.m1838getDp0D9Ej5fM());
            V f7222 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d11222 = u11.d();
            e f11222 = c.f(u11, i32222);
            Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f12222 = E.f(u11, f7222, u11, d11222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f12222);
            F1.b(u11, f11222, InterfaceC2801g.a.f());
            C5187j c5187j222 = C5187j.f39515a;
            e.a aVar222 = e.f40358c0;
            DsTooltipBeakPosition dsTooltipBeakPosition4222 = dsTooltipBeakPosition2;
            e a12222 = c5187j222.a(T.i(aVar222, dsSpacings222.m1842getDp12D9Ej5fM(), dsSpacings222.m1842getDp12D9Ej5fM(), z12 ? dsSpacings222.m1853getDp32D9Ej5fM() : dsSpacings222.m1842getDp12D9Ej5fM(), dsSpacings222.m1842getDp12D9Ej5fM()), InterfaceC6250b.a.o());
            C5194q a13222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I12 = u11.I();
            A0 d12222 = u11.d();
            e f13222 = c.f(u11, a12222);
            String str7222 = str4;
            Function0 a14222 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 g10222 = b.g(u11, a13222, u11, d12222);
            if (!u11.t()) {
            }
            a.d(I12, u11, I12, g10222);
            F1.b(u11, f13222, InterfaceC2801g.a.f());
            UniTheme uniTheme222 = UniTheme.INSTANCE;
            p2.b(str3, eVar8, dsTooltipStyle2.getTitleColor(), 0L, 0L, null, 0L, 0, false, 0, 0, uniTheme222.getTypography().getCompact400Small(), u11, (i26 & 14) | ((i26 >> 3) & 112), 0, 65528);
            e eVar16222 = eVar8;
            if (str7222 != null) {
            }
            u11.o(-832556476);
            if (str5 == null) {
            }
            u11.k();
            u11.f();
            u11.o(1605038069);
            if (z12) {
            }
            u11.k();
            u11.f();
            e eVar17222 = eVar9;
            dsTooltipStyle3 = dsTooltipStyle2;
            eVar10 = eVar17222;
            eVar11 = eVar15222;
            dsTooltipBeakPosition3 = dsTooltipBeakPosition4222;
            c3969l = u11;
            eVar12 = eVar16222;
            z13 = z12;
            function04 = function03;
            i27 = i31222;
            str6 = str7222;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar4 = eVar;
        i15 = 4 & i13;
        if (i15 == 0) {
        }
        eVar5 = eVar2;
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        i17 = i13 & 16;
        if (i17 != 0) {
        }
        if ((i12 & 196608) == 0) {
        }
        i18 = i13 & 64;
        if (i18 != 0) {
        }
        i19 = 128 & i13;
        if (i19 != 0) {
        }
        i21 = 256 & i13;
        if (i21 != 0) {
        }
        i22 = i19;
        i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i23 == 0) {
        }
        i24 = i23;
        if ((i14 & 306783379) == 306783378) {
        }
        u11.Q0();
        if ((i12 & 1) != 0) {
        }
        if (i28 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if ((i13 & 32) != 0) {
        }
        if (i18 != 0) {
        }
        if (i22 != 0) {
        }
        if (i21 != 0) {
        }
        if (i24 != 0) {
        }
        eVar6 = eVar13;
        eVar7 = eVar4;
        eVar8 = eVar5;
        u11.j0();
        DsSpacings dsSpacings2222 = DsSpacings.INSTANCE;
        e eVar142222 = eVar6;
        int i312222 = i25;
        e eVar152222 = eVar7;
        e i322222 = T.i(androidx.compose.foundation.e.b(a0.t(eVar7, dsSpacings2222.m1841getDp100D9Ej5fM(), 0.0f, 2), dsTooltipStyle2.getBackground(), new RoundRectWithBeak(dsSpacings2222.m1845getDp16D9Ej5fM(), dsTooltipBeakPosition2, i312222, 0.0f, 0.0f, 24, null)), Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Left.INSTANCE) ? dsSpacings2222.m1842getDp12D9Ej5fM() : dsSpacings2222.m1838getDp0D9Ej5fM(), (!(dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.TopCenter) || (dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.TopCustom)) ? dsSpacings2222.m1842getDp12D9Ej5fM() : dsSpacings2222.m1838getDp0D9Ej5fM(), Intrinsics.d(dsTooltipBeakPosition2, DsTooltipBeakPosition.Right.INSTANCE) ? dsSpacings2222.m1842getDp12D9Ej5fM() : dsSpacings2222.m1838getDp0D9Ej5fM(), (!(dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.BottomCenter) || (dsTooltipBeakPosition2 instanceof DsTooltipBeakPosition.BottomCustom)) ? dsSpacings2222.m1842getDp12D9Ej5fM() : dsSpacings2222.m1838getDp0D9Ej5fM());
        V f72222 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112222 = u11.d();
        e f112222 = c.f(u11, i322222);
        Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122222 = E.f(u11, f72222, u11, d112222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f122222);
        F1.b(u11, f112222, InterfaceC2801g.a.f());
        C5187j c5187j2222 = C5187j.f39515a;
        e.a aVar2222 = e.f40358c0;
        DsTooltipBeakPosition dsTooltipBeakPosition42222 = dsTooltipBeakPosition2;
        e a122222 = c5187j2222.a(T.i(aVar2222, dsSpacings2222.m1842getDp12D9Ej5fM(), dsSpacings2222.m1842getDp12D9Ej5fM(), z12 ? dsSpacings2222.m1853getDp32D9Ej5fM() : dsSpacings2222.m1842getDp12D9Ej5fM(), dsSpacings2222.m1842getDp12D9Ej5fM()), InterfaceC6250b.a.o());
        C5194q a132222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I12 = u11.I();
        A0 d122222 = u11.d();
        e f132222 = c.f(u11, a122222);
        String str72222 = str4;
        Function0 a142222 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g102222 = b.g(u11, a132222, u11, d122222);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, g102222);
        F1.b(u11, f132222, InterfaceC2801g.a.f());
        UniTheme uniTheme2222 = UniTheme.INSTANCE;
        p2.b(str3, eVar8, dsTooltipStyle2.getTitleColor(), 0L, 0L, null, 0L, 0, false, 0, 0, uniTheme2222.getTypography().getCompact400Small(), u11, (i26 & 14) | ((i26 >> 3) & 112), 0, 65528);
        e eVar162222 = eVar8;
        if (str72222 != null) {
        }
        u11.o(-832556476);
        if (str5 == null) {
        }
        u11.k();
        u11.f();
        u11.o(1605038069);
        if (z12) {
        }
        u11.k();
        u11.f();
        e eVar172222 = eVar9;
        dsTooltipStyle3 = dsTooltipStyle2;
        eVar10 = eVar172222;
        eVar11 = eVar152222;
        dsTooltipBeakPosition3 = dsTooltipBeakPosition42222;
        c3969l = u11;
        eVar12 = eVar162222;
        z13 = z12;
        function04 = function03;
        i27 = i312222;
        str6 = str72222;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsTooltip(@NotNull String title, e eVar, e eVar2, e eVar3, String str, DsTooltipStyle dsTooltipStyle, boolean z11, DsTooltipBeakPosition dsTooltipBeakPosition, A1<Integer> a12, @NotNull InterfaceC6040Q popupPositionProvider, C6041S c6041s, Function0<Unit> function0, Function0<Unit> function02, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        e eVar4;
        int i15;
        e eVar5;
        int i16;
        e eVar6;
        int i17;
        String str2;
        DsTooltipStyle dsTooltipStyle2;
        int i18;
        boolean z12;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        DsTooltipBeakPosition dsTooltipBeakPosition2;
        A1<Integer> a13;
        e eVar7;
        C6041S c6041s2;
        Function0<Unit> function03;
        boolean z13;
        A1<Integer> a14;
        Function0<Unit> function04;
        e eVar8;
        e eVar9;
        e eVar10;
        Object C11;
        C3969l c3969l;
        Function0<Unit> function05;
        Function0<Unit> function06;
        C6041S c6041s3;
        A1<Integer> a15;
        J0 m02;
        int i29;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(popupPositionProvider, "popupPositionProvider");
        C3969l u11 = interfaceC3967k.u(1871146709);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.n(title) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        int i31 = i13 & 2;
        if (i31 != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar4 = eVar;
            i14 |= u11.n(eVar4) ? 32 : 16;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 384;
            } else if ((i11 & 384) == 0) {
                eVar5 = eVar2;
                i14 |= u11.n(eVar5) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    eVar6 = eVar3;
                    i14 |= u11.n(eVar6) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i17 = i13 & 16;
                    if (i17 == 0) {
                        i14 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        str2 = str;
                        i14 |= u11.n(str2) ? 16384 : 8192;
                        if ((i11 & 196608) == 0) {
                            dsTooltipStyle2 = dsTooltipStyle;
                            i14 |= ((i13 & 32) == 0 && u11.n(dsTooltipStyle2)) ? 131072 : 65536;
                        } else {
                            dsTooltipStyle2 = dsTooltipStyle;
                        }
                        i18 = i13 & 64;
                        if (i18 != 0) {
                            i14 |= 1572864;
                            z12 = z11;
                        } else {
                            z12 = z11;
                            if ((i11 & 1572864) == 0) {
                                i14 |= u11.p(z12) ? 1048576 : 524288;
                            }
                        }
                        i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i19 != 0) {
                            i14 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            i21 = i14 | (u11.n(dsTooltipBeakPosition) ? 8388608 : 4194304);
                            if ((i11 & 100663296) == 0) {
                                if ((i13 & 256) == 0 && u11.n(a12)) {
                                    i29 = 67108864;
                                    i21 |= i29;
                                }
                                i29 = 33554432;
                                i21 |= i29;
                            }
                            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                                i21 |= 805306368;
                            } else if ((i11 & 805306368) == 0) {
                                i21 |= u11.n(popupPositionProvider) ? 536870912 : 268435456;
                            }
                            i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                            if (i22 == 0) {
                                i24 = i12 | 6;
                                i23 = i22;
                            } else if ((i12 & 6) == 0) {
                                i23 = i22;
                                i24 = i12 | (u11.n(c6041s) ? 4 : 2);
                            } else {
                                i23 = i22;
                                i24 = i12;
                            }
                            i25 = i13 & 2048;
                            if (i25 == 0) {
                                i24 |= 48;
                                i26 = i25;
                            } else if ((i12 & 48) == 0) {
                                i26 = i25;
                                i24 |= u11.F(function0) ? 32 : 16;
                            } else {
                                i26 = i25;
                            }
                            int i32 = i24;
                            i27 = i13 & 4096;
                            if (i27 == 0) {
                                i28 = i32 | 384;
                            } else {
                                int i33 = i32;
                                if ((i12 & 384) == 0) {
                                    i33 |= u11.F(function02) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                                }
                                i28 = i33;
                            }
                            if ((i21 & 306783379) != 306783378 && (i28 & 147) == 146 && u11.b()) {
                                u11.j();
                                dsTooltipBeakPosition2 = dsTooltipBeakPosition;
                                c6041s3 = c6041s;
                                function05 = function0;
                                eVar8 = eVar6;
                                c3969l = u11;
                                function06 = function02;
                                eVar9 = eVar5;
                                eVar10 = eVar4;
                                z13 = z12;
                                a15 = a12;
                            } else {
                                u11.Q0();
                                if ((i11 & 1) == 0 && !u11.w0()) {
                                    u11.j();
                                    if ((i13 & 32) != 0) {
                                        i21 &= -458753;
                                    }
                                    if ((i13 & 256) != 0) {
                                        i21 &= -234881025;
                                    }
                                    dsTooltipBeakPosition2 = dsTooltipBeakPosition;
                                    a14 = a12;
                                    c6041s2 = c6041s;
                                    function03 = function0;
                                    eVar8 = eVar6;
                                    eVar9 = eVar5;
                                    eVar10 = eVar4;
                                    z13 = z12;
                                    function04 = function02;
                                } else {
                                    e eVar11 = i31 == 0 ? e.f40358c0 : eVar4;
                                    if (i15 != 0) {
                                        eVar5 = e.f40358c0;
                                    }
                                    if (i16 != 0) {
                                        eVar6 = e.f40358c0;
                                    }
                                    if (i17 != 0) {
                                        str2 = null;
                                    }
                                    if ((i13 & 32) != 0) {
                                        dsTooltipStyle2 = DsTooltipStyle.INSTANCE.m1835default(u11, 6);
                                        i21 &= -458753;
                                    }
                                    if (i18 != 0) {
                                        z12 = false;
                                    }
                                    dsTooltipBeakPosition2 = i19 == 0 ? DsTooltipBeakPosition.BottomCenter.INSTANCE : dsTooltipBeakPosition;
                                    if ((i13 & 256) == 0) {
                                        a13 = C3956f1.a(0);
                                        i21 &= -234881025;
                                    } else {
                                        a13 = a12;
                                    }
                                    C6041S c6041s4 = i23 == 0 ? new C6041S(15, false, false) : c6041s;
                                    Function0<Unit> function07 = i26 == 0 ? null : function0;
                                    if (i27 == 0) {
                                        u11.o(-818613579);
                                        Object C12 = u11.C();
                                        eVar7 = eVar11;
                                        if (C12 == InterfaceC3967k.a.a()) {
                                            C12 = DsTooltipKt$DsTooltip$3$1.INSTANCE;
                                            u11.x(C12);
                                        }
                                        Function0<Unit> function08 = (Function0) C12;
                                        u11.k();
                                        c6041s2 = c6041s4;
                                        function03 = function07;
                                        z13 = z12;
                                        function04 = function08;
                                        eVar8 = eVar6;
                                        a14 = a13;
                                    } else {
                                        eVar7 = eVar11;
                                        c6041s2 = c6041s4;
                                        function03 = function07;
                                        z13 = z12;
                                        a14 = a13;
                                        function04 = function02;
                                        eVar8 = eVar6;
                                    }
                                    eVar9 = eVar5;
                                    eVar10 = eVar7;
                                }
                                u11.j0();
                                u11.o(-818612726);
                                C11 = u11.C();
                                if (C11 == InterfaceC3967k.a.a()) {
                                    u11.x(a14);
                                    C11 = a14;
                                }
                                A1 a16 = (A1) C11;
                                u11.k();
                                A1<Integer> a17 = a14;
                                C6041S c6041s5 = c6041s2;
                                Function0<Unit> function09 = function03;
                                C6054l.a(popupPositionProvider, function09, c6041s5, a1.c.c(-774123149, new DsTooltipKt$DsTooltip$4(title, eVar10, eVar9, eVar8, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, function04, a16), u11), u11, ((i21 >> 27) & 14) | 3072 | (i28 & 112) | ((i28 << 6) & 896), 0);
                                c3969l = u11;
                                function05 = function09;
                                function06 = function04;
                                c6041s3 = c6041s5;
                                a15 = a17;
                            }
                            m02 = c3969l.m0();
                            if (m02 == null) {
                                m02.G(new DsTooltipKt$DsTooltip$5(title, eVar10, eVar9, eVar8, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, a15, popupPositionProvider, c6041s3, function05, function06, i11, i12, i13));
                                return;
                            }
                            return;
                        }
                        i21 = i14;
                        if ((i11 & 100663296) == 0) {
                        }
                        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                        }
                        i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                        if (i22 == 0) {
                        }
                        i25 = i13 & 2048;
                        if (i25 == 0) {
                        }
                        int i322 = i24;
                        i27 = i13 & 4096;
                        if (i27 == 0) {
                        }
                        if ((i21 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i11 & 1) == 0) {
                        }
                        if (i31 == 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if ((i13 & 32) != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 == 0) {
                        }
                        if ((i13 & 256) == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        eVar9 = eVar5;
                        eVar10 = eVar7;
                        u11.j0();
                        u11.o(-818612726);
                        C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                        }
                        A1 a162 = (A1) C11;
                        u11.k();
                        A1<Integer> a172 = a14;
                        C6041S c6041s52 = c6041s2;
                        Function0<Unit> function092 = function03;
                        C6054l.a(popupPositionProvider, function092, c6041s52, a1.c.c(-774123149, new DsTooltipKt$DsTooltip$4(title, eVar10, eVar9, eVar8, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, function04, a162), u11), u11, ((i21 >> 27) & 14) | 3072 | (i28 & 112) | ((i28 << 6) & 896), 0);
                        c3969l = u11;
                        function05 = function092;
                        function06 = function04;
                        c6041s3 = c6041s52;
                        a15 = a172;
                        m02 = c3969l.m0();
                        if (m02 == null) {
                        }
                    }
                    str2 = str;
                    if ((i11 & 196608) == 0) {
                    }
                    i18 = i13 & 64;
                    if (i18 != 0) {
                    }
                    i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i19 != 0) {
                    }
                    i21 = i14;
                    if ((i11 & 100663296) == 0) {
                    }
                    if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                    }
                    i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i22 == 0) {
                    }
                    i25 = i13 & 2048;
                    if (i25 == 0) {
                    }
                    int i3222 = i24;
                    i27 = i13 & 4096;
                    if (i27 == 0) {
                    }
                    if ((i21 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i11 & 1) == 0) {
                    }
                    if (i31 == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if ((i13 & 32) != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 == 0) {
                    }
                    if ((i13 & 256) == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    eVar9 = eVar5;
                    eVar10 = eVar7;
                    u11.j0();
                    u11.o(-818612726);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                    }
                    A1 a1622 = (A1) C11;
                    u11.k();
                    A1<Integer> a1722 = a14;
                    C6041S c6041s522 = c6041s2;
                    Function0<Unit> function0922 = function03;
                    C6054l.a(popupPositionProvider, function0922, c6041s522, a1.c.c(-774123149, new DsTooltipKt$DsTooltip$4(title, eVar10, eVar9, eVar8, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, function04, a1622), u11), u11, ((i21 >> 27) & 14) | 3072 | (i28 & 112) | ((i28 << 6) & 896), 0);
                    c3969l = u11;
                    function05 = function0922;
                    function06 = function04;
                    c6041s3 = c6041s522;
                    a15 = a1722;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                    }
                }
                eVar6 = eVar3;
                i17 = i13 & 16;
                if (i17 == 0) {
                }
                str2 = str;
                if ((i11 & 196608) == 0) {
                }
                i18 = i13 & 64;
                if (i18 != 0) {
                }
                i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i19 != 0) {
                }
                i21 = i14;
                if ((i11 & 100663296) == 0) {
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                }
                i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i22 == 0) {
                }
                i25 = i13 & 2048;
                if (i25 == 0) {
                }
                int i32222 = i24;
                i27 = i13 & 4096;
                if (i27 == 0) {
                }
                if ((i21 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) == 0) {
                }
                if (i31 == 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if ((i13 & 32) != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 == 0) {
                }
                if ((i13 & 256) == 0) {
                }
                if (i23 == 0) {
                }
                if (i26 == 0) {
                }
                if (i27 == 0) {
                }
                eVar9 = eVar5;
                eVar10 = eVar7;
                u11.j0();
                u11.o(-818612726);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                A1 a16222 = (A1) C11;
                u11.k();
                A1<Integer> a17222 = a14;
                C6041S c6041s5222 = c6041s2;
                Function0<Unit> function09222 = function03;
                C6054l.a(popupPositionProvider, function09222, c6041s5222, a1.c.c(-774123149, new DsTooltipKt$DsTooltip$4(title, eVar10, eVar9, eVar8, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, function04, a16222), u11), u11, ((i21 >> 27) & 14) | 3072 | (i28 & 112) | ((i28 << 6) & 896), 0);
                c3969l = u11;
                function05 = function09222;
                function06 = function04;
                c6041s3 = c6041s5222;
                a15 = a17222;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            eVar5 = eVar2;
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            eVar6 = eVar3;
            i17 = i13 & 16;
            if (i17 == 0) {
            }
            str2 = str;
            if ((i11 & 196608) == 0) {
            }
            i18 = i13 & 64;
            if (i18 != 0) {
            }
            i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i19 != 0) {
            }
            i21 = i14;
            if ((i11 & 100663296) == 0) {
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
            }
            i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i22 == 0) {
            }
            i25 = i13 & 2048;
            if (i25 == 0) {
            }
            int i322222 = i24;
            i27 = i13 & 4096;
            if (i27 == 0) {
            }
            if ((i21 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) == 0) {
            }
            if (i31 == 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if ((i13 & 32) != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 == 0) {
            }
            if ((i13 & 256) == 0) {
            }
            if (i23 == 0) {
            }
            if (i26 == 0) {
            }
            if (i27 == 0) {
            }
            eVar9 = eVar5;
            eVar10 = eVar7;
            u11.j0();
            u11.o(-818612726);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            A1 a162222 = (A1) C11;
            u11.k();
            A1<Integer> a172222 = a14;
            C6041S c6041s52222 = c6041s2;
            Function0<Unit> function092222 = function03;
            C6054l.a(popupPositionProvider, function092222, c6041s52222, a1.c.c(-774123149, new DsTooltipKt$DsTooltip$4(title, eVar10, eVar9, eVar8, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, function04, a162222), u11), u11, ((i21 >> 27) & 14) | 3072 | (i28 & 112) | ((i28 << 6) & 896), 0);
            c3969l = u11;
            function05 = function092222;
            function06 = function04;
            c6041s3 = c6041s52222;
            a15 = a172222;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar4 = eVar;
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        eVar5 = eVar2;
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        eVar6 = eVar3;
        i17 = i13 & 16;
        if (i17 == 0) {
        }
        str2 = str;
        if ((i11 & 196608) == 0) {
        }
        i18 = i13 & 64;
        if (i18 != 0) {
        }
        i19 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i19 != 0) {
        }
        i21 = i14;
        if ((i11 & 100663296) == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
        }
        i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i22 == 0) {
        }
        i25 = i13 & 2048;
        if (i25 == 0) {
        }
        int i3222222 = i24;
        i27 = i13 & 4096;
        if (i27 == 0) {
        }
        if ((i21 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) == 0) {
        }
        if (i31 == 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if ((i13 & 32) != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 == 0) {
        }
        if ((i13 & 256) == 0) {
        }
        if (i23 == 0) {
        }
        if (i26 == 0) {
        }
        if (i27 == 0) {
        }
        eVar9 = eVar5;
        eVar10 = eVar7;
        u11.j0();
        u11.o(-818612726);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        A1 a1622222 = (A1) C11;
        u11.k();
        A1<Integer> a1722222 = a14;
        C6041S c6041s522222 = c6041s2;
        Function0<Unit> function0922222 = function03;
        C6054l.a(popupPositionProvider, function0922222, c6041s522222, a1.c.c(-774123149, new DsTooltipKt$DsTooltip$4(title, eVar10, eVar9, eVar8, str2, dsTooltipStyle2, z13, dsTooltipBeakPosition2, function04, a1622222), u11), u11, ((i21 >> 27) & 14) | 3072 | (i28 & 112) | ((i28 << 6) & 896), 0);
        c3969l = u11;
        function05 = function0922222;
        function06 = function04;
        c6041s3 = c6041s522222;
        a15 = a1722222;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
