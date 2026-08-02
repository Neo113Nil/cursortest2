package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import d2.C6041S;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$tooltip$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ IconButtonV3View $anchorView;
    final /* synthetic */ Integer $autohideDelaySeconds;
    final /* synthetic */ TooltipDTO $dto;
    final /* synthetic */ boolean $isRichAnimationEnabled;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    final /* synthetic */ C6041S $properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$tooltip$1(TooltipDTO tooltipDTO, Integer num, IconButtonV3View iconButtonV3View, boolean z11, boolean z12, C6041S c6041s, Function0<Unit> function0, Function0<Unit> function02, int i11) {
        super(2);
        this.$dto = tooltipDTO;
        this.$autohideDelaySeconds = num;
        this.$anchorView = iconButtonV3View;
        this.$isVisible = z11;
        this.$isRichAnimationEnabled = z12;
        this.$properties = c6041s;
        this.$onDismissRequest = function0;
        this.$onCloseClick = function02;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ProfileIconButtonTooltipKt.ProfileIconButtonTooltip(this.$dto, this.$autohideDelaySeconds, this.$anchorView, this.$isVisible, this.$isRichAnimationEnabled, this.$properties, this.$onDismissRequest, this.$onCloseClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
