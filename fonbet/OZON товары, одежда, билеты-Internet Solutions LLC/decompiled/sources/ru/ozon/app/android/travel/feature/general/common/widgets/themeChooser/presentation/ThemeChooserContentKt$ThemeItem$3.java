package ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.data.ThemeChooserDTO;
import u0.InterfaceC9890C;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ThemeChooserContentKt$ThemeItem$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ThemeChooserDTO.ThemeEnum $currentTheme;
    final /* synthetic */ Function1<ThemeChooserDTO.ThemeEnum, Unit> $themeSelectCallback;
    final /* synthetic */ ThemeChooserDTO.ThemeSelector $themeSelector;
    final /* synthetic */ InterfaceC9890C $this_ThemeItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ThemeChooserContentKt$ThemeItem$3(InterfaceC9890C interfaceC9890C, ThemeChooserDTO.ThemeSelector themeSelector, ThemeChooserDTO.ThemeEnum themeEnum, Function1<? super ThemeChooserDTO.ThemeEnum, Unit> function1, int i11) {
        super(2);
        this.$this_ThemeItem = interfaceC9890C;
        this.$themeSelector = themeSelector;
        this.$currentTheme = themeEnum;
        this.$themeSelectCallback = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ThemeChooserContentKt.ThemeItem(this.$this_ThemeItem, this.$themeSelector, this.$currentTheme, this.$themeSelectCallback, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
