package ru.ozon.uni.android.ds.compose.component.selectionControls.toggle;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.v3.holders.selectionControls.ToggleHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\"&\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\u0004j\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "", "", "onCheckedChange", "DsToggleAtom", "(Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "Lru/ozon/uni/android/ds/compose/modifier/AtomLocator;", "toggleLocator", "Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsToggleAtomKt {

    @NotNull
    private static final Function1<TestInfo, Locator> toggleLocator = DsToggleAtomKt$toggleLocator$1.INSTANCE;

    public static final void DsToggleAtom(@NotNull ToggleDTO dto, e eVar, Function1<? super Boolean, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super Boolean, Unit> function12;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-1573902567);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function12 = function1;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            if (i15 != 0) {
                function1 = null;
            }
            Function1<? super Boolean, Unit> function13 = function1;
            e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar, dto);
            Boolean isEnabled = dto.isEnabled();
            boolean booleanValue = isEnabled != null ? isEnabled.booleanValue() : true;
            Boolean isSelected = dto.isSelected();
            DsToggleKt.DsToggle(AtomLocatorKt.testTag(viewAnalytics, toggleLocator.invoke(dto.getTestInfo())), isSelected != null ? isSelected.booleanValue() : false, booleanValue, ToggleHolderKt.getViewSize(dto.getSize()), function13, u11, (i13 << 6) & 57344, 0);
            function12 = function13;
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DsToggleAtomKt$DsToggleAtom$1(dto, eVar2, function12, i11, i12));
        }
    }
}
