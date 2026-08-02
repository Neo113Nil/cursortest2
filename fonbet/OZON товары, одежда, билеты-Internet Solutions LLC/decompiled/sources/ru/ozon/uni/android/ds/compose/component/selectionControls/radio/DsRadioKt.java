package ru.ozon.uni.android.ds.compose.component.selectionControls.radio;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.component.selectionControls.radio.DsRadioSize;
import ru.ozon.uni.core.compose.theme.UniColorScheme;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.components.radio.FoundationRadioKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aS\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioState;", "state", "Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioSize;", "size", "", "isSelected", "Lt0/q;", "interactionSource", "Lkotlin/Function0;", "", "onClick", "DsRadio", "(Landroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioState;Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioSize;ZLt0/q;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsRadioKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsRadio(e eVar, DsRadioState dsRadioState, DsRadioSize dsRadioSize, boolean z11, q qVar, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        DsRadioState dsRadioState2;
        int i14;
        DsRadioSize dsRadioSize2;
        int i15;
        boolean z12;
        int i16;
        q qVar2;
        int i17;
        Function0<Unit> function02;
        e eVar3;
        DsRadioState dsRadioState3;
        q qVar3;
        DsRadioState dsRadioState4;
        boolean z13;
        e eVar4;
        boolean z14;
        C3969l c3969l;
        DsRadioSize dsRadioSize3;
        Function0<Unit> function03;
        boolean z15;
        q qVar4;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1764029957);
        int i18 = i12 & 1;
        if (i18 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        int i19 = i12 & 2;
        if (i19 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            dsRadioState2 = dsRadioState;
            i13 |= u11.n(dsRadioState2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                dsRadioSize2 = dsRadioSize;
                i13 |= u11.n(dsRadioSize2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    z12 = z11;
                    i13 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i16 = i12 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        qVar2 = qVar;
                        i13 |= u11.n(qVar2) ? 16384 : 8192;
                        i17 = i12 & 32;
                        if (i17 != 0) {
                            i13 |= 196608;
                        } else if ((196608 & i11) == 0) {
                            function02 = function0;
                            i13 |= u11.F(function02) ? 131072 : 65536;
                            if ((74899 & i13) == 74898 || !u11.b()) {
                                eVar3 = i18 == 0 ? e.f40358c0 : eVar2;
                                dsRadioState3 = i19 == 0 ? DsRadioState.ENABLED : dsRadioState2;
                                DsRadioSize dsRadioSize4 = i14 == 0 ? DsRadioSize.Size500.INSTANCE : dsRadioSize2;
                                if (i15 != 0) {
                                    z12 = false;
                                }
                                if (i16 == 0) {
                                    u11.o(-1498083234);
                                    Object C11 = u11.C();
                                    if (C11 == InterfaceC3967k.a.a()) {
                                        C11 = p.a();
                                        u11.x(C11);
                                    }
                                    u11.k();
                                    qVar3 = (q) C11;
                                } else {
                                    qVar3 = qVar2;
                                }
                                if (i17 != 0) {
                                    function02 = null;
                                }
                                dsRadioState4 = DsRadioState.DISABLED;
                                boolean z16 = dsRadioState3 == dsRadioState4;
                                UniColorScheme colors = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable);
                                e j11 = a0.j(eVar3, dsRadioSize4.getDpSize());
                                e f7 = T.f(e.f40358c0, dsRadioSize4.getIconPadding());
                                if (dsRadioState3 == dsRadioState4) {
                                    z13 = true;
                                    eVar4 = j11;
                                    z14 = true;
                                } else {
                                    z13 = true;
                                    eVar4 = j11;
                                    z14 = false;
                                }
                                boolean z17 = dsRadioState3 == DsRadioState.ERROR ? z13 : false;
                                AbstractC8972b icon = TokensExtKt.getIcon(dsRadioSize4.getIconToken(), u11, UniIconToken.$stable);
                                long graphicPrimaryDynamic = !z16 ? colors.getGraphicPrimaryDynamic() : colors.getGraphicTertiary();
                                c3969l = u11;
                                boolean z18 = z12;
                                Function0<Unit> function04 = function02;
                                FoundationRadioKt.m3026FoundationRadioYYtx3bQ(eVar4, f7, function04, z18, z14, z17, icon, graphicPrimaryDynamic, dsRadioSize4.getInnerSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getMargin(), qVar3, colors.getBgOverlap(), colors.getBgNegativePrimary(), colors.getBgNegativePrimary(), colors.getBgActionPrimary(), colors.getBgActionPrimary(), colors.getBgOpaqueNegativeSecondary(), colors.getGraphicNegativePrimary(), colors.getBgPrimary(), colors.getGraphicNeutral(), c3969l, ((i13 >> 9) & 896) | (i13 & 7168), (i13 >> 6) & 896, 0);
                                dsRadioSize3 = dsRadioSize4;
                                function03 = function04;
                                z15 = z18;
                                qVar4 = qVar3;
                            } else {
                                u11.j();
                                c3969l = u11;
                                eVar3 = eVar2;
                                dsRadioState3 = dsRadioState2;
                                dsRadioSize3 = dsRadioSize2;
                                z15 = z12;
                                qVar4 = qVar2;
                                function03 = function02;
                            }
                            m02 = c3969l.m0();
                            if (m02 == null) {
                                m02.G(new DsRadioKt$DsRadio$3(eVar3, dsRadioState3, dsRadioSize3, z15, qVar4, function03, i11, i12));
                                return;
                            }
                            return;
                        }
                        function02 = function0;
                        if ((74899 & i13) == 74898) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 != 0) {
                        }
                        dsRadioState4 = DsRadioState.DISABLED;
                        if (dsRadioState3 == dsRadioState4) {
                        }
                        UniColorScheme colors2 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable);
                        e j112 = a0.j(eVar3, dsRadioSize4.getDpSize());
                        e f72 = T.f(e.f40358c0, dsRadioSize4.getIconPadding());
                        if (dsRadioState3 == dsRadioState4) {
                        }
                        if (dsRadioState3 == DsRadioState.ERROR) {
                        }
                        AbstractC8972b icon2 = TokensExtKt.getIcon(dsRadioSize4.getIconToken(), u11, UniIconToken.$stable);
                        if (!z16) {
                        }
                        c3969l = u11;
                        boolean z182 = z12;
                        Function0<Unit> function042 = function02;
                        FoundationRadioKt.m3026FoundationRadioYYtx3bQ(eVar4, f72, function042, z182, z14, z17, icon2, graphicPrimaryDynamic, dsRadioSize4.getInnerSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getMargin(), qVar3, colors2.getBgOverlap(), colors2.getBgNegativePrimary(), colors2.getBgNegativePrimary(), colors2.getBgActionPrimary(), colors2.getBgActionPrimary(), colors2.getBgOpaqueNegativeSecondary(), colors2.getGraphicNegativePrimary(), colors2.getBgPrimary(), colors2.getGraphicNeutral(), c3969l, ((i13 >> 9) & 896) | (i13 & 7168), (i13 >> 6) & 896, 0);
                        dsRadioSize3 = dsRadioSize4;
                        function03 = function042;
                        z15 = z182;
                        qVar4 = qVar3;
                        m02 = c3969l.m0();
                        if (m02 == null) {
                        }
                    }
                    qVar2 = qVar;
                    i17 = i12 & 32;
                    if (i17 != 0) {
                    }
                    function02 = function0;
                    if ((74899 & i13) == 74898) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 != 0) {
                    }
                    dsRadioState4 = DsRadioState.DISABLED;
                    if (dsRadioState3 == dsRadioState4) {
                    }
                    UniColorScheme colors22 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable);
                    e j1122 = a0.j(eVar3, dsRadioSize4.getDpSize());
                    e f722 = T.f(e.f40358c0, dsRadioSize4.getIconPadding());
                    if (dsRadioState3 == dsRadioState4) {
                    }
                    if (dsRadioState3 == DsRadioState.ERROR) {
                    }
                    AbstractC8972b icon22 = TokensExtKt.getIcon(dsRadioSize4.getIconToken(), u11, UniIconToken.$stable);
                    if (!z16) {
                    }
                    c3969l = u11;
                    boolean z1822 = z12;
                    Function0<Unit> function0422 = function02;
                    FoundationRadioKt.m3026FoundationRadioYYtx3bQ(eVar4, f722, function0422, z1822, z14, z17, icon22, graphicPrimaryDynamic, dsRadioSize4.getInnerSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getMargin(), qVar3, colors22.getBgOverlap(), colors22.getBgNegativePrimary(), colors22.getBgNegativePrimary(), colors22.getBgActionPrimary(), colors22.getBgActionPrimary(), colors22.getBgOpaqueNegativeSecondary(), colors22.getGraphicNegativePrimary(), colors22.getBgPrimary(), colors22.getGraphicNeutral(), c3969l, ((i13 >> 9) & 896) | (i13 & 7168), (i13 >> 6) & 896, 0);
                    dsRadioSize3 = dsRadioSize4;
                    function03 = function0422;
                    z15 = z1822;
                    qVar4 = qVar3;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                    }
                }
                z12 = z11;
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                qVar2 = qVar;
                i17 = i12 & 32;
                if (i17 != 0) {
                }
                function02 = function0;
                if ((74899 & i13) == 74898) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 != 0) {
                }
                if (i16 == 0) {
                }
                if (i17 != 0) {
                }
                dsRadioState4 = DsRadioState.DISABLED;
                if (dsRadioState3 == dsRadioState4) {
                }
                UniColorScheme colors222 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable);
                e j11222 = a0.j(eVar3, dsRadioSize4.getDpSize());
                e f7222 = T.f(e.f40358c0, dsRadioSize4.getIconPadding());
                if (dsRadioState3 == dsRadioState4) {
                }
                if (dsRadioState3 == DsRadioState.ERROR) {
                }
                AbstractC8972b icon222 = TokensExtKt.getIcon(dsRadioSize4.getIconToken(), u11, UniIconToken.$stable);
                if (!z16) {
                }
                c3969l = u11;
                boolean z18222 = z12;
                Function0<Unit> function04222 = function02;
                FoundationRadioKt.m3026FoundationRadioYYtx3bQ(eVar4, f7222, function04222, z18222, z14, z17, icon222, graphicPrimaryDynamic, dsRadioSize4.getInnerSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getMargin(), qVar3, colors222.getBgOverlap(), colors222.getBgNegativePrimary(), colors222.getBgNegativePrimary(), colors222.getBgActionPrimary(), colors222.getBgActionPrimary(), colors222.getBgOpaqueNegativeSecondary(), colors222.getGraphicNegativePrimary(), colors222.getBgPrimary(), colors222.getGraphicNeutral(), c3969l, ((i13 >> 9) & 896) | (i13 & 7168), (i13 >> 6) & 896, 0);
                dsRadioSize3 = dsRadioSize4;
                function03 = function04222;
                z15 = z18222;
                qVar4 = qVar3;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            dsRadioSize2 = dsRadioSize;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            z12 = z11;
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            qVar2 = qVar;
            i17 = i12 & 32;
            if (i17 != 0) {
            }
            function02 = function0;
            if ((74899 & i13) == 74898) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 != 0) {
            }
            if (i16 == 0) {
            }
            if (i17 != 0) {
            }
            dsRadioState4 = DsRadioState.DISABLED;
            if (dsRadioState3 == dsRadioState4) {
            }
            UniColorScheme colors2222 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable);
            e j112222 = a0.j(eVar3, dsRadioSize4.getDpSize());
            e f72222 = T.f(e.f40358c0, dsRadioSize4.getIconPadding());
            if (dsRadioState3 == dsRadioState4) {
            }
            if (dsRadioState3 == DsRadioState.ERROR) {
            }
            AbstractC8972b icon2222 = TokensExtKt.getIcon(dsRadioSize4.getIconToken(), u11, UniIconToken.$stable);
            if (!z16) {
            }
            c3969l = u11;
            boolean z182222 = z12;
            Function0<Unit> function042222 = function02;
            FoundationRadioKt.m3026FoundationRadioYYtx3bQ(eVar4, f72222, function042222, z182222, z14, z17, icon2222, graphicPrimaryDynamic, dsRadioSize4.getInnerSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getMargin(), qVar3, colors2222.getBgOverlap(), colors2222.getBgNegativePrimary(), colors2222.getBgNegativePrimary(), colors2222.getBgActionPrimary(), colors2222.getBgActionPrimary(), colors2222.getBgOpaqueNegativeSecondary(), colors2222.getGraphicNegativePrimary(), colors2222.getBgPrimary(), colors2222.getGraphicNeutral(), c3969l, ((i13 >> 9) & 896) | (i13 & 7168), (i13 >> 6) & 896, 0);
            dsRadioSize3 = dsRadioSize4;
            function03 = function042222;
            z15 = z182222;
            qVar4 = qVar3;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        dsRadioState2 = dsRadioState;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        dsRadioSize2 = dsRadioSize;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        z12 = z11;
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        qVar2 = qVar;
        i17 = i12 & 32;
        if (i17 != 0) {
        }
        function02 = function0;
        if ((74899 & i13) == 74898) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 != 0) {
        }
        if (i16 == 0) {
        }
        if (i17 != 0) {
        }
        dsRadioState4 = DsRadioState.DISABLED;
        if (dsRadioState3 == dsRadioState4) {
        }
        UniColorScheme colors22222 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable);
        e j1122222 = a0.j(eVar3, dsRadioSize4.getDpSize());
        e f722222 = T.f(e.f40358c0, dsRadioSize4.getIconPadding());
        if (dsRadioState3 == dsRadioState4) {
        }
        if (dsRadioState3 == DsRadioState.ERROR) {
        }
        AbstractC8972b icon22222 = TokensExtKt.getIcon(dsRadioSize4.getIconToken(), u11, UniIconToken.$stable);
        if (!z16) {
        }
        c3969l = u11;
        boolean z1822222 = z12;
        Function0<Unit> function0422222 = function02;
        FoundationRadioKt.m3026FoundationRadioYYtx3bQ(eVar4, f722222, function0422222, z1822222, z14, z17, icon22222, graphicPrimaryDynamic, dsRadioSize4.getInnerSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getIconSize(), dsRadioSize4.getMargin(), qVar3, colors22222.getBgOverlap(), colors22222.getBgNegativePrimary(), colors22222.getBgNegativePrimary(), colors22222.getBgActionPrimary(), colors22222.getBgActionPrimary(), colors22222.getBgOpaqueNegativeSecondary(), colors22222.getGraphicNegativePrimary(), colors22222.getBgPrimary(), colors22222.getGraphicNeutral(), c3969l, ((i13 >> 9) & 896) | (i13 & 7168), (i13 >> 6) & 896, 0);
        dsRadioSize3 = dsRadioSize4;
        function03 = function0422222;
        z15 = z1822222;
        qVar4 = qVar3;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
