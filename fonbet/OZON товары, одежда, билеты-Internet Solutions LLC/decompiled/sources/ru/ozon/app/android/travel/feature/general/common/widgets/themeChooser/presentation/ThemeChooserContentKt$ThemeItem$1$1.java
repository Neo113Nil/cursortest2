package ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.data.ThemeChooserDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ThemeChooserContentKt$ThemeItem$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<ThemeChooserDTO.ThemeEnum, Unit> $themeSelectCallback;
    final /* synthetic */ ThemeChooserDTO.ThemeSelector $themeSelector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ThemeChooserContentKt$ThemeItem$1$1(Function1<? super ThemeChooserDTO.ThemeEnum, Unit> function1, ThemeChooserDTO.ThemeSelector themeSelector) {
        super(0);
        this.$themeSelectCallback = function1;
        this.$themeSelector = themeSelector;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$themeSelectCallback.invoke(this.$themeSelector.getTheme());
    }
}
