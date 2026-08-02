package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.ViewIntent;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "newText", "", "focusChanged", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WholeSaleModalComposableKt$WholeSaleModalComposable$1$1$1 extends AbstractC7737t implements Function2<String, Boolean, Unit> {
    final /* synthetic */ Function1<ViewIntent, Unit> $onViewIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WholeSaleModalComposableKt$WholeSaleModalComposable$1$1$1(Function1<? super ViewIntent, Unit> function1) {
        super(2);
        this.$onViewIntent = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
        invoke(str, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(String newText, boolean z11) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        this.$onViewIntent.invoke(new ViewIntent.CountInputUpdated(newText, z11));
    }
}
