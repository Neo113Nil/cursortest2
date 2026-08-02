package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components.CustomizableTextInputStyle;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components.IconButtonStyle;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components.VerticalScrollbarStyle;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class TextInputWidgetHolderKt$TextInputWidgetHolder$6 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ IconButtonStyle $buttonStyle;
    final /* synthetic */ long $containerBackgroundColor;
    final /* synthetic */ float $containerBottomPadding;
    final /* synthetic */ float $containerLeftPadding;
    final /* synthetic */ float $containerRadius;
    final /* synthetic */ float $containerRightPadding;
    final /* synthetic */ float $containerTopPadding;
    final /* synthetic */ String $currentText;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ TextInputVO $item;
    final /* synthetic */ Function1<String, Unit> $onTextChanged;
    final /* synthetic */ VerticalScrollbarStyle $scrollbarStyle;
    final /* synthetic */ CustomizableTextInputStyle $textInputStyle;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextInputWidgetHolderKt$TextInputWidgetHolder$6(TextInputVO textInputVO, l lVar, String str, Function1<? super String, Unit> function1, boolean z11, Function1<? super AtomAction, Unit> function12, float f7, float f11, float f12, float f13, float f14, long j11, CustomizableTextInputStyle customizableTextInputStyle, VerticalScrollbarStyle verticalScrollbarStyle, IconButtonStyle iconButtonStyle, int i11, int i12, int i13) {
        super(2);
        this.$item = textInputVO;
        this.$tokenizedAnalytics = lVar;
        this.$currentText = str;
        this.$onTextChanged = function1;
        this.$isLoading = z11;
        this.$actionHandler = function12;
        this.$containerRadius = f7;
        this.$containerLeftPadding = f11;
        this.$containerTopPadding = f12;
        this.$containerRightPadding = f13;
        this.$containerBottomPadding = f14;
        this.$containerBackgroundColor = j11;
        this.$textInputStyle = customizableTextInputStyle;
        this.$scrollbarStyle = verticalScrollbarStyle;
        this.$buttonStyle = iconButtonStyle;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TextInputWidgetHolderKt.m710TextInputWidgetHolderOw1X5yo(this.$item, this.$tokenizedAnalytics, this.$currentText, this.$onTextChanged, this.$isLoading, this.$actionHandler, this.$containerRadius, this.$containerLeftPadding, this.$containerTopPadding, this.$containerRightPadding, this.$containerBottomPadding, this.$containerBackgroundColor, this.$textInputStyle, this.$scrollbarStyle, this.$buttonStyle, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
