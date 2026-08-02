package ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox;

import I1.o;
import J1.a;
import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox.DsCheckboxSize;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.compose.tokens.UniTypography;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.components.checkbox.FoundationCheckboxKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001as\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxSize;", "size", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStatus;", "status", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxState;", "state", "LZ1/h;", "cornerRadius", "", "quantity", "Lt0/q;", "interactionSource", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle;", "style", "Lkotlin/Function0;", "", "onClick", "DsCheckbox-gNPyAyM", "(Landroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxSize;Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStatus;Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxState;FLjava/lang/Integer;Lt0/q;Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "DsCheckbox", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsCheckboxKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017b  */
    /* renamed from: DsCheckbox-gNPyAyM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1773DsCheckboxgNPyAyM(e eVar, DsCheckboxSize dsCheckboxSize, DsCheckboxStatus dsCheckboxStatus, DsCheckboxState dsCheckboxState, float f7, Integer num, q qVar, DsCheckboxStyle dsCheckboxStyle, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        DsCheckboxSize dsCheckboxSize2;
        int i14;
        DsCheckboxStatus dsCheckboxStatus2;
        int i15;
        DsCheckboxState dsCheckboxState2;
        float f11;
        int i16;
        Integer num2;
        int i17;
        q qVar2;
        int i18;
        int i19;
        int i21;
        e eVar2;
        DsCheckboxSize dsCheckboxSize3;
        DsCheckboxStatus dsCheckboxStatus3;
        DsCheckboxState dsCheckboxState3;
        float f12;
        DsCheckboxStyle dsCheckboxStyle2;
        Function0<Unit> function02;
        float f13;
        q qVar3;
        DsCheckboxStyle dsCheckboxStyle3;
        boolean z11;
        Object C11;
        T bodyControl500Medium;
        C3969l c3969l;
        DsCheckboxStyle dsCheckboxStyle4;
        DsCheckboxSize dsCheckboxSize4;
        DsCheckboxStatus dsCheckboxStatus4;
        DsCheckboxState dsCheckboxState4;
        Function0<Unit> function03;
        Integer num3;
        float f14;
        q qVar4;
        J0 m02;
        int i22;
        int i23;
        C3969l u11 = interfaceC3967k.u(-392553253);
        int i24 = i12 & 1;
        if (i24 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i25 = i12 & 2;
        if (i25 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            dsCheckboxSize2 = dsCheckboxSize;
            i13 |= u11.n(dsCheckboxSize2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                dsCheckboxStatus2 = dsCheckboxStatus;
                i13 |= u11.n(dsCheckboxStatus2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    dsCheckboxState2 = dsCheckboxState;
                    i13 |= u11.n(dsCheckboxState2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16) == 0) {
                            f11 = f7;
                            if (u11.q(f11)) {
                                i23 = 16384;
                                i13 |= i23;
                            }
                        } else {
                            f11 = f7;
                        }
                        i23 = 8192;
                        i13 |= i23;
                    } else {
                        f11 = f7;
                    }
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        num2 = num;
                        i13 |= u11.n(num2) ? 131072 : 65536;
                        i17 = i12 & 64;
                        if (i17 != 0) {
                            i13 |= 1572864;
                            qVar2 = qVar;
                        } else {
                            qVar2 = qVar;
                            if ((i11 & 1572864) == 0) {
                                i13 |= u11.n(qVar2) ? 1048576 : 524288;
                            }
                        }
                        if ((i11 & 12582912) == 0) {
                            i18 = i24;
                            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 && u11.n(dsCheckboxStyle)) {
                                i22 = 8388608;
                                i13 |= i22;
                            }
                            i22 = 4194304;
                            i13 |= i22;
                        } else {
                            i18 = i24;
                        }
                        i19 = i12 & 256;
                        if (i19 != 0) {
                            i13 |= 100663296;
                        } else if ((i11 & 100663296) == 0) {
                            i21 = i19;
                            i13 |= u11.F(function0) ? 67108864 : 33554432;
                            if ((i13 & 38347923) == 38347922 || !u11.b()) {
                                u11.Q0();
                                if ((i11 & 1) != 0 || u11.w0()) {
                                    eVar2 = i18 == 0 ? e.f40358c0 : eVar;
                                    dsCheckboxSize3 = i25 == 0 ? DsCheckboxSize.Size500.INSTANCE : dsCheckboxSize2;
                                    dsCheckboxStatus3 = i14 == 0 ? DsCheckboxStatus.EMPTY : dsCheckboxStatus2;
                                    dsCheckboxState3 = i15 == 0 ? DsCheckboxState.ENABLED : dsCheckboxState2;
                                    if ((i12 & 16) == 0) {
                                        f12 = dsCheckboxSize3.getCornerRadius();
                                        i13 &= -57345;
                                    } else {
                                        f12 = f11;
                                    }
                                    if (i16 != 0) {
                                        num2 = null;
                                    }
                                    if (i17 != 0) {
                                        u11.o(1574548898);
                                        Object C12 = u11.C();
                                        if (C12 == InterfaceC3967k.a.a()) {
                                            C12 = p.a();
                                            u11.x(C12);
                                        }
                                        qVar2 = (q) C12;
                                        u11.k();
                                    }
                                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                                        dsCheckboxStyle2 = DsCheckboxStyle.INSTANCE.base(u11, 6);
                                        i13 = (-29360129) & i13;
                                    } else {
                                        dsCheckboxStyle2 = dsCheckboxStyle;
                                    }
                                    if (i21 == 0) {
                                        f13 = f12;
                                        function02 = null;
                                    } else {
                                        function02 = function0;
                                        f13 = f12;
                                    }
                                    qVar3 = qVar2;
                                    dsCheckboxStyle3 = dsCheckboxStyle2;
                                } else {
                                    u11.j();
                                    if ((i12 & 16) != 0) {
                                        i13 &= -57345;
                                    }
                                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                        i13 &= -29360129;
                                    }
                                    eVar2 = eVar;
                                    dsCheckboxStyle3 = dsCheckboxStyle;
                                    function02 = function0;
                                    dsCheckboxSize3 = dsCheckboxSize2;
                                    dsCheckboxStatus3 = dsCheckboxStatus2;
                                    qVar3 = qVar2;
                                    dsCheckboxState3 = dsCheckboxState2;
                                    f13 = f11;
                                }
                                Integer num4 = num2;
                                u11.j0();
                                boolean z12 = dsCheckboxState3 == DsCheckboxState.DISABLED;
                                UniTheme uniTheme = UniTheme.INSTANCE;
                                uniTheme.getColors(u11, UniTheme.$stable);
                                e j11 = a0.j(eVar2, dsCheckboxSize3.getDpSize());
                                u11.o(1227727696);
                                z11 = (i13 & 7168) != 2048;
                                C11 = u11.C();
                                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                                    C11 = new DsCheckboxKt$DsCheckbox$4$1$1(dsCheckboxState3);
                                    u11.x(C11);
                                }
                                u11.k();
                                e c11 = o.c(j11, false, (Function1) C11);
                                e f15 = androidx.compose.foundation.layout.T.f(e.f40358c0, dsCheckboxSize3.getIconPadding());
                                a toggleableState = CheckboxMappersKt.toToggleableState(dsCheckboxStatus3);
                                boolean z13 = dsCheckboxState3 != DsCheckboxState.ERROR;
                                UniIconToken selectedIconToken = dsCheckboxSize3.getSelectedIconToken();
                                int i26 = UniIconToken.$stable;
                                AbstractC8972b icon = TokensExtKt.getIcon(selectedIconToken, u11, i26);
                                AbstractC8972b icon2 = TokensExtKt.getIcon(dsCheckboxSize3.getIndeterminateIconToken(), u11, i26);
                                UniTypography typography = uniTheme.getTypography();
                                if (!dsCheckboxSize3.equals(DsCheckboxSize.Size500.INSTANCE)) {
                                    bodyControl500Medium = typography.getBodyControl300XSmall();
                                } else {
                                    if (!dsCheckboxSize3.equals(DsCheckboxSize.Size600.INSTANCE)) {
                                        throw new Sc.o();
                                    }
                                    bodyControl500Medium = typography.getBodyControl500Medium();
                                }
                                c3969l = u11;
                                FoundationCheckboxKt.m2987FoundationCheckboxOs3FA(c11, f15, function02, toggleableState, z12, z13, icon, icon2, num4, T.c(bodyControl500Medium, dsCheckboxStyle3.getStateColors(dsCheckboxState3).getTextColor(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), dsCheckboxStyle3.getStateColors(dsCheckboxState3).getIconColor(), dsCheckboxSize3.getInnerSize(), dsCheckboxSize3.getIconSize(), dsCheckboxSize3.getIconSize(), f13, dsCheckboxSize3.getMargin(), qVar3, dsCheckboxStyle3.getDisabledColors().getBackgroundColor(), dsCheckboxStyle3.getDisabledColors().getColor(), dsCheckboxStyle3.getErrorColors().getColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), dsCheckboxStyle3.getErrorColors().getBackgroundColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getBackgroundColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), c3969l, ((i13 >> 18) & 896) | ((i13 << 9) & 234881024), i13 & 3727360, 0);
                                dsCheckboxStyle4 = dsCheckboxStyle3;
                                dsCheckboxSize4 = dsCheckboxSize3;
                                dsCheckboxStatus4 = dsCheckboxStatus3;
                                dsCheckboxState4 = dsCheckboxState3;
                                function03 = function02;
                                num3 = num4;
                                f14 = f13;
                                qVar4 = qVar3;
                            } else {
                                u11.j();
                                eVar2 = eVar;
                                dsCheckboxStyle4 = dsCheckboxStyle;
                                c3969l = u11;
                                dsCheckboxSize4 = dsCheckboxSize2;
                                dsCheckboxStatus4 = dsCheckboxStatus2;
                                qVar4 = qVar2;
                                dsCheckboxState4 = dsCheckboxState2;
                                f14 = f11;
                                num3 = num2;
                                function03 = function0;
                            }
                            m02 = c3969l.m0();
                            if (m02 == null) {
                                m02.G(new DsCheckboxKt$DsCheckbox$5(eVar2, dsCheckboxSize4, dsCheckboxStatus4, dsCheckboxState4, f14, num3, qVar4, dsCheckboxStyle4, function03, i11, i12));
                                return;
                            }
                            return;
                        }
                        i21 = i19;
                        if ((i13 & 38347923) == 38347922) {
                        }
                        u11.Q0();
                        if ((i11 & 1) != 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if ((i12 & 16) == 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                        }
                        if (i21 == 0) {
                        }
                        qVar3 = qVar2;
                        dsCheckboxStyle3 = dsCheckboxStyle2;
                        Integer num42 = num2;
                        u11.j0();
                        if (dsCheckboxState3 == DsCheckboxState.DISABLED) {
                        }
                        UniTheme uniTheme2 = UniTheme.INSTANCE;
                        uniTheme2.getColors(u11, UniTheme.$stable);
                        e j112 = a0.j(eVar2, dsCheckboxSize3.getDpSize());
                        u11.o(1227727696);
                        if ((i13 & 7168) != 2048) {
                        }
                        C11 = u11.C();
                        if (!z11) {
                        }
                        C11 = new DsCheckboxKt$DsCheckbox$4$1$1(dsCheckboxState3);
                        u11.x(C11);
                        u11.k();
                        e c112 = o.c(j112, false, (Function1) C11);
                        e f152 = androidx.compose.foundation.layout.T.f(e.f40358c0, dsCheckboxSize3.getIconPadding());
                        a toggleableState2 = CheckboxMappersKt.toToggleableState(dsCheckboxStatus3);
                        if (dsCheckboxState3 != DsCheckboxState.ERROR) {
                        }
                        UniIconToken selectedIconToken2 = dsCheckboxSize3.getSelectedIconToken();
                        int i262 = UniIconToken.$stable;
                        AbstractC8972b icon3 = TokensExtKt.getIcon(selectedIconToken2, u11, i262);
                        AbstractC8972b icon22 = TokensExtKt.getIcon(dsCheckboxSize3.getIndeterminateIconToken(), u11, i262);
                        UniTypography typography2 = uniTheme2.getTypography();
                        if (!dsCheckboxSize3.equals(DsCheckboxSize.Size500.INSTANCE)) {
                        }
                        c3969l = u11;
                        FoundationCheckboxKt.m2987FoundationCheckboxOs3FA(c112, f152, function02, toggleableState2, z12, z13, icon3, icon22, num42, T.c(bodyControl500Medium, dsCheckboxStyle3.getStateColors(dsCheckboxState3).getTextColor(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), dsCheckboxStyle3.getStateColors(dsCheckboxState3).getIconColor(), dsCheckboxSize3.getInnerSize(), dsCheckboxSize3.getIconSize(), dsCheckboxSize3.getIconSize(), f13, dsCheckboxSize3.getMargin(), qVar3, dsCheckboxStyle3.getDisabledColors().getBackgroundColor(), dsCheckboxStyle3.getDisabledColors().getColor(), dsCheckboxStyle3.getErrorColors().getColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), dsCheckboxStyle3.getErrorColors().getBackgroundColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getBackgroundColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), c3969l, ((i13 >> 18) & 896) | ((i13 << 9) & 234881024), i13 & 3727360, 0);
                        dsCheckboxStyle4 = dsCheckboxStyle3;
                        dsCheckboxSize4 = dsCheckboxSize3;
                        dsCheckboxStatus4 = dsCheckboxStatus3;
                        dsCheckboxState4 = dsCheckboxState3;
                        function03 = function02;
                        num3 = num42;
                        f14 = f13;
                        qVar4 = qVar3;
                        m02 = c3969l.m0();
                        if (m02 == null) {
                        }
                    }
                    num2 = num;
                    i17 = i12 & 64;
                    if (i17 != 0) {
                    }
                    if ((i11 & 12582912) == 0) {
                    }
                    i19 = i12 & 256;
                    if (i19 != 0) {
                    }
                    i21 = i19;
                    if ((i13 & 38347923) == 38347922) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if ((i12 & 16) == 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    }
                    if (i21 == 0) {
                    }
                    qVar3 = qVar2;
                    dsCheckboxStyle3 = dsCheckboxStyle2;
                    Integer num422 = num2;
                    u11.j0();
                    if (dsCheckboxState3 == DsCheckboxState.DISABLED) {
                    }
                    UniTheme uniTheme22 = UniTheme.INSTANCE;
                    uniTheme22.getColors(u11, UniTheme.$stable);
                    e j1122 = a0.j(eVar2, dsCheckboxSize3.getDpSize());
                    u11.o(1227727696);
                    if ((i13 & 7168) != 2048) {
                    }
                    C11 = u11.C();
                    if (!z11) {
                    }
                    C11 = new DsCheckboxKt$DsCheckbox$4$1$1(dsCheckboxState3);
                    u11.x(C11);
                    u11.k();
                    e c1122 = o.c(j1122, false, (Function1) C11);
                    e f1522 = androidx.compose.foundation.layout.T.f(e.f40358c0, dsCheckboxSize3.getIconPadding());
                    a toggleableState22 = CheckboxMappersKt.toToggleableState(dsCheckboxStatus3);
                    if (dsCheckboxState3 != DsCheckboxState.ERROR) {
                    }
                    UniIconToken selectedIconToken22 = dsCheckboxSize3.getSelectedIconToken();
                    int i2622 = UniIconToken.$stable;
                    AbstractC8972b icon32 = TokensExtKt.getIcon(selectedIconToken22, u11, i2622);
                    AbstractC8972b icon222 = TokensExtKt.getIcon(dsCheckboxSize3.getIndeterminateIconToken(), u11, i2622);
                    UniTypography typography22 = uniTheme22.getTypography();
                    if (!dsCheckboxSize3.equals(DsCheckboxSize.Size500.INSTANCE)) {
                    }
                    c3969l = u11;
                    FoundationCheckboxKt.m2987FoundationCheckboxOs3FA(c1122, f1522, function02, toggleableState22, z12, z13, icon32, icon222, num422, T.c(bodyControl500Medium, dsCheckboxStyle3.getStateColors(dsCheckboxState3).getTextColor(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), dsCheckboxStyle3.getStateColors(dsCheckboxState3).getIconColor(), dsCheckboxSize3.getInnerSize(), dsCheckboxSize3.getIconSize(), dsCheckboxSize3.getIconSize(), f13, dsCheckboxSize3.getMargin(), qVar3, dsCheckboxStyle3.getDisabledColors().getBackgroundColor(), dsCheckboxStyle3.getDisabledColors().getColor(), dsCheckboxStyle3.getErrorColors().getColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), dsCheckboxStyle3.getErrorColors().getBackgroundColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getBackgroundColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), c3969l, ((i13 >> 18) & 896) | ((i13 << 9) & 234881024), i13 & 3727360, 0);
                    dsCheckboxStyle4 = dsCheckboxStyle3;
                    dsCheckboxSize4 = dsCheckboxSize3;
                    dsCheckboxStatus4 = dsCheckboxStatus3;
                    dsCheckboxState4 = dsCheckboxState3;
                    function03 = function02;
                    num3 = num422;
                    f14 = f13;
                    qVar4 = qVar3;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                    }
                }
                dsCheckboxState2 = dsCheckboxState;
                if ((i11 & 24576) != 0) {
                }
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                num2 = num;
                i17 = i12 & 64;
                if (i17 != 0) {
                }
                if ((i11 & 12582912) == 0) {
                }
                i19 = i12 & 256;
                if (i19 != 0) {
                }
                i21 = i19;
                if ((i13 & 38347923) == 38347922) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i18 == 0) {
                }
                if (i25 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if ((i12 & 16) == 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                }
                if (i21 == 0) {
                }
                qVar3 = qVar2;
                dsCheckboxStyle3 = dsCheckboxStyle2;
                Integer num4222 = num2;
                u11.j0();
                if (dsCheckboxState3 == DsCheckboxState.DISABLED) {
                }
                UniTheme uniTheme222 = UniTheme.INSTANCE;
                uniTheme222.getColors(u11, UniTheme.$stable);
                e j11222 = a0.j(eVar2, dsCheckboxSize3.getDpSize());
                u11.o(1227727696);
                if ((i13 & 7168) != 2048) {
                }
                C11 = u11.C();
                if (!z11) {
                }
                C11 = new DsCheckboxKt$DsCheckbox$4$1$1(dsCheckboxState3);
                u11.x(C11);
                u11.k();
                e c11222 = o.c(j11222, false, (Function1) C11);
                e f15222 = androidx.compose.foundation.layout.T.f(e.f40358c0, dsCheckboxSize3.getIconPadding());
                a toggleableState222 = CheckboxMappersKt.toToggleableState(dsCheckboxStatus3);
                if (dsCheckboxState3 != DsCheckboxState.ERROR) {
                }
                UniIconToken selectedIconToken222 = dsCheckboxSize3.getSelectedIconToken();
                int i26222 = UniIconToken.$stable;
                AbstractC8972b icon322 = TokensExtKt.getIcon(selectedIconToken222, u11, i26222);
                AbstractC8972b icon2222 = TokensExtKt.getIcon(dsCheckboxSize3.getIndeterminateIconToken(), u11, i26222);
                UniTypography typography222 = uniTheme222.getTypography();
                if (!dsCheckboxSize3.equals(DsCheckboxSize.Size500.INSTANCE)) {
                }
                c3969l = u11;
                FoundationCheckboxKt.m2987FoundationCheckboxOs3FA(c11222, f15222, function02, toggleableState222, z12, z13, icon322, icon2222, num4222, T.c(bodyControl500Medium, dsCheckboxStyle3.getStateColors(dsCheckboxState3).getTextColor(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), dsCheckboxStyle3.getStateColors(dsCheckboxState3).getIconColor(), dsCheckboxSize3.getInnerSize(), dsCheckboxSize3.getIconSize(), dsCheckboxSize3.getIconSize(), f13, dsCheckboxSize3.getMargin(), qVar3, dsCheckboxStyle3.getDisabledColors().getBackgroundColor(), dsCheckboxStyle3.getDisabledColors().getColor(), dsCheckboxStyle3.getErrorColors().getColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), dsCheckboxStyle3.getErrorColors().getBackgroundColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getBackgroundColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), c3969l, ((i13 >> 18) & 896) | ((i13 << 9) & 234881024), i13 & 3727360, 0);
                dsCheckboxStyle4 = dsCheckboxStyle3;
                dsCheckboxSize4 = dsCheckboxSize3;
                dsCheckboxStatus4 = dsCheckboxStatus3;
                dsCheckboxState4 = dsCheckboxState3;
                function03 = function02;
                num3 = num4222;
                f14 = f13;
                qVar4 = qVar3;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            dsCheckboxStatus2 = dsCheckboxStatus;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            dsCheckboxState2 = dsCheckboxState;
            if ((i11 & 24576) != 0) {
            }
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            num2 = num;
            i17 = i12 & 64;
            if (i17 != 0) {
            }
            if ((i11 & 12582912) == 0) {
            }
            i19 = i12 & 256;
            if (i19 != 0) {
            }
            i21 = i19;
            if ((i13 & 38347923) == 38347922) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i18 == 0) {
            }
            if (i25 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if ((i12 & 16) == 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
            }
            if (i21 == 0) {
            }
            qVar3 = qVar2;
            dsCheckboxStyle3 = dsCheckboxStyle2;
            Integer num42222 = num2;
            u11.j0();
            if (dsCheckboxState3 == DsCheckboxState.DISABLED) {
            }
            UniTheme uniTheme2222 = UniTheme.INSTANCE;
            uniTheme2222.getColors(u11, UniTheme.$stable);
            e j112222 = a0.j(eVar2, dsCheckboxSize3.getDpSize());
            u11.o(1227727696);
            if ((i13 & 7168) != 2048) {
            }
            C11 = u11.C();
            if (!z11) {
            }
            C11 = new DsCheckboxKt$DsCheckbox$4$1$1(dsCheckboxState3);
            u11.x(C11);
            u11.k();
            e c112222 = o.c(j112222, false, (Function1) C11);
            e f152222 = androidx.compose.foundation.layout.T.f(e.f40358c0, dsCheckboxSize3.getIconPadding());
            a toggleableState2222 = CheckboxMappersKt.toToggleableState(dsCheckboxStatus3);
            if (dsCheckboxState3 != DsCheckboxState.ERROR) {
            }
            UniIconToken selectedIconToken2222 = dsCheckboxSize3.getSelectedIconToken();
            int i262222 = UniIconToken.$stable;
            AbstractC8972b icon3222 = TokensExtKt.getIcon(selectedIconToken2222, u11, i262222);
            AbstractC8972b icon22222 = TokensExtKt.getIcon(dsCheckboxSize3.getIndeterminateIconToken(), u11, i262222);
            UniTypography typography2222 = uniTheme2222.getTypography();
            if (!dsCheckboxSize3.equals(DsCheckboxSize.Size500.INSTANCE)) {
            }
            c3969l = u11;
            FoundationCheckboxKt.m2987FoundationCheckboxOs3FA(c112222, f152222, function02, toggleableState2222, z12, z13, icon3222, icon22222, num42222, T.c(bodyControl500Medium, dsCheckboxStyle3.getStateColors(dsCheckboxState3).getTextColor(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), dsCheckboxStyle3.getStateColors(dsCheckboxState3).getIconColor(), dsCheckboxSize3.getInnerSize(), dsCheckboxSize3.getIconSize(), dsCheckboxSize3.getIconSize(), f13, dsCheckboxSize3.getMargin(), qVar3, dsCheckboxStyle3.getDisabledColors().getBackgroundColor(), dsCheckboxStyle3.getDisabledColors().getColor(), dsCheckboxStyle3.getErrorColors().getColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), dsCheckboxStyle3.getErrorColors().getBackgroundColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getBackgroundColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), c3969l, ((i13 >> 18) & 896) | ((i13 << 9) & 234881024), i13 & 3727360, 0);
            dsCheckboxStyle4 = dsCheckboxStyle3;
            dsCheckboxSize4 = dsCheckboxSize3;
            dsCheckboxStatus4 = dsCheckboxStatus3;
            dsCheckboxState4 = dsCheckboxState3;
            function03 = function02;
            num3 = num42222;
            f14 = f13;
            qVar4 = qVar3;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        dsCheckboxSize2 = dsCheckboxSize;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        dsCheckboxStatus2 = dsCheckboxStatus;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        dsCheckboxState2 = dsCheckboxState;
        if ((i11 & 24576) != 0) {
        }
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        num2 = num;
        i17 = i12 & 64;
        if (i17 != 0) {
        }
        if ((i11 & 12582912) == 0) {
        }
        i19 = i12 & 256;
        if (i19 != 0) {
        }
        i21 = i19;
        if ((i13 & 38347923) == 38347922) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i18 == 0) {
        }
        if (i25 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if ((i12 & 16) == 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        if (i21 == 0) {
        }
        qVar3 = qVar2;
        dsCheckboxStyle3 = dsCheckboxStyle2;
        Integer num422222 = num2;
        u11.j0();
        if (dsCheckboxState3 == DsCheckboxState.DISABLED) {
        }
        UniTheme uniTheme22222 = UniTheme.INSTANCE;
        uniTheme22222.getColors(u11, UniTheme.$stable);
        e j1122222 = a0.j(eVar2, dsCheckboxSize3.getDpSize());
        u11.o(1227727696);
        if ((i13 & 7168) != 2048) {
        }
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new DsCheckboxKt$DsCheckbox$4$1$1(dsCheckboxState3);
        u11.x(C11);
        u11.k();
        e c1122222 = o.c(j1122222, false, (Function1) C11);
        e f1522222 = androidx.compose.foundation.layout.T.f(e.f40358c0, dsCheckboxSize3.getIconPadding());
        a toggleableState22222 = CheckboxMappersKt.toToggleableState(dsCheckboxStatus3);
        if (dsCheckboxState3 != DsCheckboxState.ERROR) {
        }
        UniIconToken selectedIconToken22222 = dsCheckboxSize3.getSelectedIconToken();
        int i2622222 = UniIconToken.$stable;
        AbstractC8972b icon32222 = TokensExtKt.getIcon(selectedIconToken22222, u11, i2622222);
        AbstractC8972b icon222222 = TokensExtKt.getIcon(dsCheckboxSize3.getIndeterminateIconToken(), u11, i2622222);
        UniTypography typography22222 = uniTheme22222.getTypography();
        if (!dsCheckboxSize3.equals(DsCheckboxSize.Size500.INSTANCE)) {
        }
        c3969l = u11;
        FoundationCheckboxKt.m2987FoundationCheckboxOs3FA(c1122222, f1522222, function02, toggleableState22222, z12, z13, icon32222, icon222222, num422222, T.c(bodyControl500Medium, dsCheckboxStyle3.getStateColors(dsCheckboxState3).getTextColor(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), dsCheckboxStyle3.getStateColors(dsCheckboxState3).getIconColor(), dsCheckboxSize3.getInnerSize(), dsCheckboxSize3.getIconSize(), dsCheckboxSize3.getIconSize(), f13, dsCheckboxSize3.getMargin(), qVar3, dsCheckboxStyle3.getDisabledColors().getBackgroundColor(), dsCheckboxStyle3.getDisabledColors().getColor(), dsCheckboxStyle3.getErrorColors().getColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), dsCheckboxStyle3.getErrorColors().getBackgroundColor(), dsCheckboxStyle3.getErrorColors().getBorderColor(), dsCheckboxStyle3.getEnabledColors().getBackgroundColor(), dsCheckboxStyle3.getEnabledColors().getBorderColor(), c3969l, ((i13 >> 18) & 896) | ((i13 << 9) & 234881024), i13 & 3727360, 0);
        dsCheckboxStyle4 = dsCheckboxStyle3;
        dsCheckboxSize4 = dsCheckboxSize3;
        dsCheckboxStatus4 = dsCheckboxStatus3;
        dsCheckboxState4 = dsCheckboxState3;
        function03 = function02;
        num3 = num422222;
        f14 = f13;
        qVar4 = qVar3;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
