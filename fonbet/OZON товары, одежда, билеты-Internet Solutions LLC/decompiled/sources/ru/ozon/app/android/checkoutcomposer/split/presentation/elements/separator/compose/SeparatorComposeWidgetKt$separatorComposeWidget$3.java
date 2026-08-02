package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.separator.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.separator.SeparatorVO;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/separator/SeparatorVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class SeparatorComposeWidgetKt$separatorComposeWidget$3 extends AbstractC7737t implements Function1<k<SeparatorVO>, Unit> {
    public static final SeparatorComposeWidgetKt$separatorComposeWidget$3 INSTANCE = new SeparatorComposeWidgetKt$separatorComposeWidget$3();

    SeparatorComposeWidgetKt$separatorComposeWidget$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(k<SeparatorVO> kVar) {
        invoke2(kVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(k<SeparatorVO> widgetSpec) {
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(ComposableSingletons$SeparatorComposeWidgetKt.INSTANCE.m576getLambda1$checkout_prodGoogleAllVendorsRelease());
    }
}
