package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.data.IconChooserDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserVI;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class IconChooserContentKt$AspectIcon$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AspectDTO $aspect;
    final /* synthetic */ IconChooserVI.EnabledStyle $enabledStyle;
    final /* synthetic */ IconChooserVI.IconEnum $icon;
    final /* synthetic */ String $iconName;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ IconChooserDTO.SelectedStyle $selectedStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconChooserContentKt$AspectIcon$2(String str, AspectDTO aspectDTO, IconChooserVI.IconEnum iconEnum, IconChooserDTO.SelectedStyle selectedStyle, IconChooserVI.EnabledStyle enabledStyle, boolean z11, int i11) {
        super(2);
        this.$iconName = str;
        this.$aspect = aspectDTO;
        this.$icon = iconEnum;
        this.$selectedStyle = selectedStyle;
        this.$enabledStyle = enabledStyle;
        this.$isSelected = z11;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        IconChooserContentKt.AspectIcon(this.$iconName, this.$aspect, this.$icon, this.$selectedStyle, this.$enabledStyle, this.$isSelected, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
