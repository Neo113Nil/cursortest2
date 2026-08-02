package ru.ozon.app.android.account.orders.emptyscreen;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import z00.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz00/e;", "", "invoke", "(Lz00/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class EmptyScreenWithBarcodeFactory$createNoScreenOfflinePage$1 extends AbstractC7737t implements Function1<e, Unit> {
    final /* synthetic */ EmptyScreenWithBarcodeFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyScreenWithBarcodeFactory$createNoScreenOfflinePage$1(EmptyScreenWithBarcodeFactory emptyScreenWithBarcodeFactory) {
        super(1);
        this.this$0 = emptyScreenWithBarcodeFactory;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
        invoke2(eVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(e createOfflinePage) {
        EmptyScreenIslandSeparatorFactory emptyScreenIslandSeparatorFactory;
        EmptyScreenStatusWidgetFactory emptyScreenStatusWidgetFactory;
        Intrinsics.checkNotNullParameter(createOfflinePage, "$this$createOfflinePage");
        emptyScreenIslandSeparatorFactory = this.this$0.islandSeparatorFactory;
        emptyScreenIslandSeparatorFactory.appendEndIslandSeparator(createOfflinePage);
        emptyScreenStatusWidgetFactory = this.this$0.emptyScreenStatusWidgetFactory;
        emptyScreenStatusWidgetFactory.appendWidget(createOfflinePage, null);
    }
}
