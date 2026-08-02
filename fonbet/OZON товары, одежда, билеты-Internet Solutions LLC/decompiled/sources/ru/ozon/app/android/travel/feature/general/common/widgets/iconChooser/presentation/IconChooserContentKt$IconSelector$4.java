package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.data.IconChooserDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserVI;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class IconChooserContentKt$IconSelector$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ IconChooserVI.EnabledStyle $enabledStyle;
    final /* synthetic */ Function1<IconChooserVI.IconSelectorVI, Unit> $iconSelectCallback;
    final /* synthetic */ IconChooserDTO.SelectedStyle $selectedStyle;
    final /* synthetic */ IconChooserVI.IconSelectorVI $selector;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    IconChooserContentKt$IconSelector$4(IconChooserVI.IconSelectorVI iconSelectorVI, IconChooserDTO.SelectedStyle selectedStyle, IconChooserVI.EnabledStyle enabledStyle, Function1<? super IconChooserVI.IconSelectorVI, Unit> function1, l lVar, int i11) {
        super(2);
        this.$selector = iconSelectorVI;
        this.$selectedStyle = selectedStyle;
        this.$enabledStyle = enabledStyle;
        this.$iconSelectCallback = function1;
        this.$tokenizedAnalytics = lVar;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        IconChooserContentKt.IconSelector(this.$selector, this.$selectedStyle, this.$enabledStyle, this.$iconSelectCallback, this.$tokenizedAnalytics, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
