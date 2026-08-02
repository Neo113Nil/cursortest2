package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TileGrid3WidgetComponent$Companion$create$1$1$coroutineDispatcherProvider$2 extends AbstractC7737t implements Function0<CoroutineDispatcherProvider> {
    final /* synthetic */ TileGrid3WidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid3WidgetComponent$Companion$create$1$1$coroutineDispatcherProvider$2(TileGrid3WidgetComponent$Companion$create$1$1 tileGrid3WidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = tileGrid3WidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CoroutineDispatcherProvider invoke() {
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        coroutineDispatchersComponentApi = this.this$0.coroutineDispatchersComponentApi;
        return coroutineDispatchersComponentApi.getDispatcherProvider();
    }
}
