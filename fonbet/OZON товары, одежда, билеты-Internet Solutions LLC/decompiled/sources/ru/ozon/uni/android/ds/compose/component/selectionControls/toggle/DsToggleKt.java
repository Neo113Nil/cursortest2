package ru.ozon.uni.android.ds.compose.component.selectionControls.toggle;

import Ra.h;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import q1.AbstractC8972b;
import ru.ozon.uni.android.atom.selectionControls.ToggleSize;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.components.toggle.FoundationToggleKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aO\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "isSelected", "isEnabled", "Lru/ozon/uni/android/atom/selectionControls/ToggleSize;", "size", "Lkotlin/Function1;", "", "onCheckedChange", "DsToggle", "(Landroidx/compose/ui/e;ZZLru/ozon/uni/android/atom/selectionControls/ToggleSize;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsToggleKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsToggle(e eVar, boolean z11, boolean z12, ToggleSize toggleSize, Function1<? super Boolean, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        ToggleSize toggleSize2;
        int i16;
        Function1<? super Boolean, Unit> function12;
        Object C11;
        C3969l c3969l;
        ToggleSize toggleSize3;
        e eVar3;
        boolean z15;
        boolean z16;
        Function1<? super Boolean, Unit> function13;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1227208409);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            z13 = z11;
            i13 |= u11.p(z13) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                z14 = z12;
                i13 |= u11.p(z14) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    toggleSize2 = toggleSize;
                    i13 |= u11.n(toggleSize2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i16 = i12 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        function12 = function1;
                        i13 |= u11.F(function12) ? 16384 : 8192;
                        if ((i13 & 9363) == 9362 || !u11.b()) {
                            e eVar4 = i17 != 0 ? e.f40358c0 : eVar2;
                            if (i18 != 0) {
                                z13 = false;
                            }
                            if (i14 != 0) {
                                z14 = true;
                            }
                            ToggleSize toggleSize4 = i15 != 0 ? ToggleSize.Toggle600.INSTANCE : toggleSize2;
                            Function1<? super Boolean, Unit> function14 = i16 != 0 ? null : function12;
                            float knobSize = toggleSize4.getKnobSize();
                            long d11 = h.d(toggleSize4.getWidth(), toggleSize4.getHeight() - 4);
                            UniTheme uniTheme = UniTheme.INSTANCE;
                            int i19 = UniTheme.$stable;
                            long bgActionPrimary = uniTheme.getColors(u11, i19).getBgActionPrimary();
                            long graphicNeutral = uniTheme.getColors(u11, i19).getGraphicNeutral();
                            long bgSecondary = uniTheme.getColors(u11, i19).getBgSecondary();
                            long graphicPrimaryDynamic = uniTheme.getColors(u11, i19).getGraphicPrimaryDynamic();
                            long graphicSolidNeutral = uniTheme.getColors(u11, i19).getGraphicSolidNeutral();
                            uniTheme.getIcons();
                            u11.B(138200983);
                            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_lock_closed_filled, "ic_m_lock_closed_filled", u11, 48);
                            u11.K();
                            boolean z17 = z14;
                            boolean z18 = z13;
                            e.a aVar = e.f40358c0;
                            u11.o(1542041762);
                            C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                                C11 = p.a();
                                u11.x(C11);
                            }
                            u11.k();
                            float f7 = 2;
                            int i21 = (i13 & 14) | 197040;
                            int i22 = i13 << 6;
                            int i23 = i21 | (i22 & 7168) | (57344 & i22) | (i22 & 3670016);
                            c3969l = u11;
                            e eVar5 = eVar4;
                            FoundationToggleKt.m3039FoundationToggleMcPsvjw(eVar5, aVar, aVar, z18, z17, (q) C11, function14, !z17, graphicPrimaryDynamic, uniPainterResource, graphicSolidNeutral, d11, f7, knobSize, f7, graphicNeutral, bgSecondary, bgActionPrimary, c3969l, i23, 24960);
                            toggleSize3 = toggleSize4;
                            eVar3 = eVar5;
                            z15 = z18;
                            z16 = z17;
                            function13 = function14;
                        } else {
                            u11.j();
                            c3969l = u11;
                            eVar3 = eVar2;
                            z15 = z13;
                            z16 = z14;
                            toggleSize3 = toggleSize2;
                            function13 = function12;
                        }
                        m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new DsToggleKt$DsToggle$2(eVar3, z15, z16, toggleSize3, function13, i11, i12));
                            return;
                        }
                        return;
                    }
                    function12 = function1;
                    if ((i13 & 9363) == 9362) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    float knobSize2 = toggleSize4.getKnobSize();
                    long d112 = h.d(toggleSize4.getWidth(), toggleSize4.getHeight() - 4);
                    UniTheme uniTheme2 = UniTheme.INSTANCE;
                    int i192 = UniTheme.$stable;
                    long bgActionPrimary2 = uniTheme2.getColors(u11, i192).getBgActionPrimary();
                    long graphicNeutral2 = uniTheme2.getColors(u11, i192).getGraphicNeutral();
                    long bgSecondary2 = uniTheme2.getColors(u11, i192).getBgSecondary();
                    long graphicPrimaryDynamic2 = uniTheme2.getColors(u11, i192).getGraphicPrimaryDynamic();
                    long graphicSolidNeutral2 = uniTheme2.getColors(u11, i192).getGraphicSolidNeutral();
                    uniTheme2.getIcons();
                    u11.B(138200983);
                    AbstractC8972b uniPainterResource2 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_lock_closed_filled, "ic_m_lock_closed_filled", u11, 48);
                    u11.K();
                    boolean z172 = z14;
                    boolean z182 = z13;
                    e.a aVar2 = e.f40358c0;
                    u11.o(1542041762);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                    }
                    u11.k();
                    float f72 = 2;
                    int i212 = (i13 & 14) | 197040;
                    int i222 = i13 << 6;
                    int i232 = i212 | (i222 & 7168) | (57344 & i222) | (i222 & 3670016);
                    c3969l = u11;
                    e eVar52 = eVar4;
                    FoundationToggleKt.m3039FoundationToggleMcPsvjw(eVar52, aVar2, aVar2, z182, z172, (q) C11, function14, !z172, graphicPrimaryDynamic2, uniPainterResource2, graphicSolidNeutral2, d112, f72, knobSize2, f72, graphicNeutral2, bgSecondary2, bgActionPrimary2, c3969l, i232, 24960);
                    toggleSize3 = toggleSize4;
                    eVar3 = eVar52;
                    z15 = z182;
                    z16 = z172;
                    function13 = function14;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                toggleSize2 = toggleSize;
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                function12 = function1;
                if ((i13 & 9363) == 9362) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                float knobSize22 = toggleSize4.getKnobSize();
                long d1122 = h.d(toggleSize4.getWidth(), toggleSize4.getHeight() - 4);
                UniTheme uniTheme22 = UniTheme.INSTANCE;
                int i1922 = UniTheme.$stable;
                long bgActionPrimary22 = uniTheme22.getColors(u11, i1922).getBgActionPrimary();
                long graphicNeutral22 = uniTheme22.getColors(u11, i1922).getGraphicNeutral();
                long bgSecondary22 = uniTheme22.getColors(u11, i1922).getBgSecondary();
                long graphicPrimaryDynamic22 = uniTheme22.getColors(u11, i1922).getGraphicPrimaryDynamic();
                long graphicSolidNeutral22 = uniTheme22.getColors(u11, i1922).getGraphicSolidNeutral();
                uniTheme22.getIcons();
                u11.B(138200983);
                AbstractC8972b uniPainterResource22 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_lock_closed_filled, "ic_m_lock_closed_filled", u11, 48);
                u11.K();
                boolean z1722 = z14;
                boolean z1822 = z13;
                e.a aVar22 = e.f40358c0;
                u11.o(1542041762);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                u11.k();
                float f722 = 2;
                int i2122 = (i13 & 14) | 197040;
                int i2222 = i13 << 6;
                int i2322 = i2122 | (i2222 & 7168) | (57344 & i2222) | (i2222 & 3670016);
                c3969l = u11;
                e eVar522 = eVar4;
                FoundationToggleKt.m3039FoundationToggleMcPsvjw(eVar522, aVar22, aVar22, z1822, z1722, (q) C11, function14, !z1722, graphicPrimaryDynamic22, uniPainterResource22, graphicSolidNeutral22, d1122, f722, knobSize22, f722, graphicNeutral22, bgSecondary22, bgActionPrimary22, c3969l, i2322, 24960);
                toggleSize3 = toggleSize4;
                eVar3 = eVar522;
                z15 = z1822;
                z16 = z1722;
                function13 = function14;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            z14 = z12;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            toggleSize2 = toggleSize;
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            function12 = function1;
            if ((i13 & 9363) == 9362) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            float knobSize222 = toggleSize4.getKnobSize();
            long d11222 = h.d(toggleSize4.getWidth(), toggleSize4.getHeight() - 4);
            UniTheme uniTheme222 = UniTheme.INSTANCE;
            int i19222 = UniTheme.$stable;
            long bgActionPrimary222 = uniTheme222.getColors(u11, i19222).getBgActionPrimary();
            long graphicNeutral222 = uniTheme222.getColors(u11, i19222).getGraphicNeutral();
            long bgSecondary222 = uniTheme222.getColors(u11, i19222).getBgSecondary();
            long graphicPrimaryDynamic222 = uniTheme222.getColors(u11, i19222).getGraphicPrimaryDynamic();
            long graphicSolidNeutral222 = uniTheme222.getColors(u11, i19222).getGraphicSolidNeutral();
            uniTheme222.getIcons();
            u11.B(138200983);
            AbstractC8972b uniPainterResource222 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_lock_closed_filled, "ic_m_lock_closed_filled", u11, 48);
            u11.K();
            boolean z17222 = z14;
            boolean z18222 = z13;
            e.a aVar222 = e.f40358c0;
            u11.o(1542041762);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            u11.k();
            float f7222 = 2;
            int i21222 = (i13 & 14) | 197040;
            int i22222 = i13 << 6;
            int i23222 = i21222 | (i22222 & 7168) | (57344 & i22222) | (i22222 & 3670016);
            c3969l = u11;
            e eVar5222 = eVar4;
            FoundationToggleKt.m3039FoundationToggleMcPsvjw(eVar5222, aVar222, aVar222, z18222, z17222, (q) C11, function14, !z17222, graphicPrimaryDynamic222, uniPainterResource222, graphicSolidNeutral222, d11222, f7222, knobSize222, f7222, graphicNeutral222, bgSecondary222, bgActionPrimary222, c3969l, i23222, 24960);
            toggleSize3 = toggleSize4;
            eVar3 = eVar5222;
            z15 = z18222;
            z16 = z17222;
            function13 = function14;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        z13 = z11;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        z14 = z12;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        toggleSize2 = toggleSize;
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        function12 = function1;
        if ((i13 & 9363) == 9362) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        float knobSize2222 = toggleSize4.getKnobSize();
        long d112222 = h.d(toggleSize4.getWidth(), toggleSize4.getHeight() - 4);
        UniTheme uniTheme2222 = UniTheme.INSTANCE;
        int i192222 = UniTheme.$stable;
        long bgActionPrimary2222 = uniTheme2222.getColors(u11, i192222).getBgActionPrimary();
        long graphicNeutral2222 = uniTheme2222.getColors(u11, i192222).getGraphicNeutral();
        long bgSecondary2222 = uniTheme2222.getColors(u11, i192222).getBgSecondary();
        long graphicPrimaryDynamic2222 = uniTheme2222.getColors(u11, i192222).getGraphicPrimaryDynamic();
        long graphicSolidNeutral2222 = uniTheme2222.getColors(u11, i192222).getGraphicSolidNeutral();
        uniTheme2222.getIcons();
        u11.B(138200983);
        AbstractC8972b uniPainterResource2222 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_lock_closed_filled, "ic_m_lock_closed_filled", u11, 48);
        u11.K();
        boolean z172222 = z14;
        boolean z182222 = z13;
        e.a aVar2222 = e.f40358c0;
        u11.o(1542041762);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        float f72222 = 2;
        int i212222 = (i13 & 14) | 197040;
        int i222222 = i13 << 6;
        int i232222 = i212222 | (i222222 & 7168) | (57344 & i222222) | (i222222 & 3670016);
        c3969l = u11;
        e eVar52222 = eVar4;
        FoundationToggleKt.m3039FoundationToggleMcPsvjw(eVar52222, aVar2222, aVar2222, z182222, z172222, (q) C11, function14, !z172222, graphicPrimaryDynamic2222, uniPainterResource2222, graphicSolidNeutral2222, d112222, f72222, knobSize2222, f72222, graphicNeutral2222, bgSecondary2222, bgActionPrimary2222, c3969l, i232222, 24960);
        toggleSize3 = toggleSize4;
        eVar3 = eVar52222;
        z15 = z182222;
        z16 = z172222;
        function13 = function14;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
