package ru.ozon.app.android.pdp.offline;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.offline.widgetfactory.GalleryV4WidgetFactory;
import ru.ozon.app.android.pdp.offline.widgetfactory.PdpStatusWidgetFactory;
import ru.ozon.app.android.pdp.offline.widgetfactory.PriceV4WidgetFactory;
import ru.ozon.app.android.pdp.offline.widgetfactory.TextProductNameWidgetFactory;
import z00.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz00/e;", "", "invoke", "(Lz00/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class PdpOfflineScreenFactory$createErrorState$1 extends AbstractC7737t implements Function1<e, Unit> {
    final /* synthetic */ PdpOfflineScreenFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdpOfflineScreenFactory$createErrorState$1(PdpOfflineScreenFactory pdpOfflineScreenFactory) {
        super(1);
        this.this$0 = pdpOfflineScreenFactory;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
        invoke2(eVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(e createOfflinePage) {
        GalleryV4WidgetFactory galleryV4WidgetFactory;
        PriceV4WidgetFactory priceV4WidgetFactory;
        TextProductNameWidgetFactory textProductNameWidgetFactory;
        PdpStatusWidgetFactory pdpStatusWidgetFactory;
        Intrinsics.checkNotNullParameter(createOfflinePage, "$this$createOfflinePage");
        galleryV4WidgetFactory = this.this$0.galleryV4WidgetFactory;
        galleryV4WidgetFactory.appendWidget(createOfflinePage);
        priceV4WidgetFactory = this.this$0.priceV4WidgetFactory;
        priceV4WidgetFactory.appendWidget(createOfflinePage);
        textProductNameWidgetFactory = this.this$0.textProductNameWidgetFactory;
        textProductNameWidgetFactory.appendWidget(createOfflinePage);
        pdpStatusWidgetFactory = this.this$0.pdpStatusWidgetFactory;
        pdpStatusWidgetFactory.appendWidget(createOfflinePage);
    }
}
