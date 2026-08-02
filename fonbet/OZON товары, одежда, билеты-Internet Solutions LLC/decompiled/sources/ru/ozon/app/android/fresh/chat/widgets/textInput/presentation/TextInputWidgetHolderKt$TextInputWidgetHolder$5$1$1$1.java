package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation;

import S0.InterfaceC3978p0;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class TextInputWidgetHolderKt$TextInputWidgetHolder$5$1$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ InterfaceC3978p0<Boolean> $isFocused$delegate;
    final /* synthetic */ TextInputVO $item;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputWidgetHolderKt$TextInputWidgetHolder$5$1$1$1(l lVar, TextInputVO textInputVO, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.$tokenizedAnalytics = lVar;
        this.$item = textInputVO;
        this.$isFocused$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        boolean TextInputWidgetHolder_Ow1X5yo$lambda$8;
        TextInputWidgetHolderKt.TextInputWidgetHolder_Ow1X5yo$lambda$9(this.$isFocused$delegate, z11);
        TextInputWidgetHolder_Ow1X5yo$lambda$8 = TextInputWidgetHolderKt.TextInputWidgetHolder_Ow1X5yo$lambda$8(this.$isFocused$delegate);
        if (TextInputWidgetHolder_Ow1X5yo$lambda$8) {
            TextInputWidgetHolderKt.processTypedEvent(this.$tokenizedAnalytics, this.$item.getTokenizedEvent(), "inputClick");
        }
    }
}
