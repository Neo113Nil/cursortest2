package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import S0.A1;
import S0.InterfaceC3967k;
import WZ.l;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.data.IconChooserDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserVI;
import u0.InterfaceC9904m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/m;", "", "invoke", "(Lu0/m;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class IconChooserContentKt$IconChooserContent$3$2 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9904m, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ A1<UIState> $state$delegate;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ IconChooserViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconChooserContentKt$IconChooserContent$3$2(A1<UIState> a12, IconChooserViewModel iconChooserViewModel, l lVar) {
        super(3);
        this.$state$delegate = a12;
        this.$viewModel = iconChooserViewModel;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9904m interfaceC9904m, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9904m, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9904m FlowRow, InterfaceC3967k interfaceC3967k, int i11) {
        UIState IconChooserContent$lambda$0;
        UIState IconChooserContent$lambda$02;
        UIState IconChooserContent$lambda$03;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i11 & 17) == 16 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        IconChooserContent$lambda$0 = IconChooserContentKt.IconChooserContent$lambda$0(this.$state$delegate);
        IconChooserVI data = IconChooserContent$lambda$0.getData();
        List<IconChooserVI.IconSelectorVI> iconSelectors = data != null ? data.getIconSelectors() : null;
        if (iconSelectors == null) {
            return;
        }
        IconChooserViewModel iconChooserViewModel = this.$viewModel;
        l lVar = this.$tokenizedAnalytics;
        A1<UIState> a12 = this.$state$delegate;
        for (IconChooserVI.IconSelectorVI iconSelectorVI : iconSelectors) {
            IconChooserContent$lambda$02 = IconChooserContentKt.IconChooserContent$lambda$0(a12);
            IconChooserVI data2 = IconChooserContent$lambda$02.getData();
            IconChooserDTO.SelectedStyle selectedStyle = data2 != null ? data2.getSelectedStyle() : null;
            IconChooserContent$lambda$03 = IconChooserContentKt.IconChooserContent$lambda$0(a12);
            IconChooserVI data3 = IconChooserContent$lambda$03.getData();
            IconChooserVI.EnabledStyle enabledStyle = data3 != null ? data3.getEnabledStyle() : null;
            interfaceC3967k.o(542128399);
            boolean F11 = interfaceC3967k.F(iconChooserViewModel) | interfaceC3967k.F(iconSelectorVI);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new IconChooserContentKt$IconChooserContent$3$2$1$1$1(iconChooserViewModel, iconSelectorVI);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            IconChooserContentKt.IconSelector(iconSelectorVI, selectedStyle, enabledStyle, (Function1) C11, lVar, interfaceC3967k, 0);
        }
    }
}
