package ru.ozon.uni.android.ds.compose.component.selectionControls.radio;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\"&\u0010\u000f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lt0/q;", "interactionSource", "Lkotlin/Function0;", "", "onClick", "DsRadioAtom", "(Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;Landroidx/compose/ui/e;Lt0/q;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "Lru/ozon/uni/android/ds/compose/modifier/AtomLocator;", "radioLocator", "Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsRadioAtomKt {

    @NotNull
    private static final Function1<TestInfo, Locator> radioLocator = DsRadioAtomKt$radioLocator$1.INSTANCE;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsRadioAtom(@NotNull RadioDTO dto, e eVar, q qVar, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        q qVar2;
        int i15;
        Function0<Unit> function02;
        q qVar3;
        q qVar4;
        Function0<Unit> function03;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(1885988241);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                qVar2 = qVar;
                i13 |= u11.n(qVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    function02 = function0;
                    i13 |= u11.F(function02) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i13 & 1171) == 1170 || !u11.b()) {
                        e eVar3 = i16 == 0 ? e.f40358c0 : eVar2;
                        if (i14 == 0) {
                            u11.o(-261646545);
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
                        Function0<Unit> function04 = i15 == 0 ? null : function02;
                        e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
                        DsRadioSize vo = RadioMappersKt.toVo(dto.getSize());
                        DsRadioState vo2 = RadioMappersKt.toVo(dto.getState());
                        Boolean isSelected = dto.isSelected();
                        DsRadioKt.DsRadio(AtomLocatorKt.testTag(viewAnalytics, radioLocator.invoke(dto.getTestInfo())), vo2, vo, isSelected == null ? isSelected.booleanValue() : false, qVar3, function04, u11, (i13 << 6) & 516096, 0);
                        eVar2 = eVar3;
                        qVar4 = qVar3;
                        function03 = function04;
                    } else {
                        u11.j();
                        qVar4 = qVar2;
                        function03 = function02;
                    }
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new DsRadioAtomKt$DsRadioAtom$2(dto, eVar2, qVar4, function03, i11, i12));
                        return;
                    }
                    return;
                }
                function02 = function0;
                if ((i13 & 1171) == 1170) {
                }
                if (i16 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
                DsRadioSize vo3 = RadioMappersKt.toVo(dto.getSize());
                DsRadioState vo22 = RadioMappersKt.toVo(dto.getState());
                Boolean isSelected2 = dto.isSelected();
                DsRadioKt.DsRadio(AtomLocatorKt.testTag(viewAnalytics2, radioLocator.invoke(dto.getTestInfo())), vo22, vo3, isSelected2 == null ? isSelected2.booleanValue() : false, qVar3, function04, u11, (i13 << 6) & 516096, 0);
                eVar2 = eVar3;
                qVar4 = qVar3;
                function03 = function04;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            qVar2 = qVar;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            function02 = function0;
            if ((i13 & 1171) == 1170) {
            }
            if (i16 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
            DsRadioSize vo32 = RadioMappersKt.toVo(dto.getSize());
            DsRadioState vo222 = RadioMappersKt.toVo(dto.getState());
            Boolean isSelected22 = dto.isSelected();
            DsRadioKt.DsRadio(AtomLocatorKt.testTag(viewAnalytics22, radioLocator.invoke(dto.getTestInfo())), vo222, vo32, isSelected22 == null ? isSelected22.booleanValue() : false, qVar3, function04, u11, (i13 << 6) & 516096, 0);
            eVar2 = eVar3;
            qVar4 = qVar3;
            function03 = function04;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        qVar2 = qVar;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        function02 = function0;
        if ((i13 & 1171) == 1170) {
        }
        if (i16 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        e viewAnalytics222 = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
        DsRadioSize vo322 = RadioMappersKt.toVo(dto.getSize());
        DsRadioState vo2222 = RadioMappersKt.toVo(dto.getState());
        Boolean isSelected222 = dto.isSelected();
        DsRadioKt.DsRadio(AtomLocatorKt.testTag(viewAnalytics222, radioLocator.invoke(dto.getTestInfo())), vo2222, vo322, isSelected222 == null ? isSelected222.booleanValue() : false, qVar3, function04, u11, (i13 << 6) & 516096, 0);
        eVar2 = eVar3;
        qVar4 = qVar3;
        function03 = function04;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
