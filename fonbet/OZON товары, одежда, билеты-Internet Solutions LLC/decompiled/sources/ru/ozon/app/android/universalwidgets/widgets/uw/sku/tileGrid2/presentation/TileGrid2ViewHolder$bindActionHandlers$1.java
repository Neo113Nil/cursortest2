package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class TileGrid2ViewHolder$bindActionHandlers$1 extends C7735q implements Function0<DisposableActionHandler> {
    final /* synthetic */ d $info;
    final /* synthetic */ TileGrid2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ViewHolder$bindActionHandlers$1(TileGrid2ViewHolder tileGrid2ViewHolder, d dVar) {
        super(0, Intrinsics.a.class, "createActionHandler", "bindActionHandlers$createActionHandler(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ViewHolder;Lru/ozon/composer/widget/item/WidgetInfo;)Lru/ozon/app/android/action/sheet/DisposableActionHandler;", 0);
        this.this$0 = tileGrid2ViewHolder;
        this.$info = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DisposableActionHandler invoke() {
        DisposableActionHandler bindActionHandlers$createActionHandler;
        bindActionHandlers$createActionHandler = TileGrid2ViewHolder.bindActionHandlers$createActionHandler(this.this$0, this.$info);
        return bindActionHandlers$createActionHandler;
    }
}
