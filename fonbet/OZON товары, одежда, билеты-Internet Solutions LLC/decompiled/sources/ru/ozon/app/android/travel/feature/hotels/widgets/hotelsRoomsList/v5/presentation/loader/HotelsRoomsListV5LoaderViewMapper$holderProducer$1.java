package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.loader;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsRoomsListV5LoaderViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, HotelsRoomsListV5LoaderWidgetViewHolder> {
    final /* synthetic */ HotelsRoomsListV5LoaderViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsRoomsListV5LoaderViewMapper$holderProducer$1(HotelsRoomsListV5LoaderViewMapper hotelsRoomsListV5LoaderViewMapper) {
        super(2);
        this.this$0 = hotelsRoomsListV5LoaderViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final HotelsRoomsListV5LoaderWidgetViewHolder invoke(View view, ComposerReferences refs) {
        HotelsRoomsListV5Component hotelsRoomsListV5Component;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        hotelsRoomsListV5Component = this.this$0.component;
        return new HotelsRoomsListV5LoaderWidgetViewHolder(view, refs, hotelsRoomsListV5Component.getCustomActionHandlersStoreFactory());
    }
}
