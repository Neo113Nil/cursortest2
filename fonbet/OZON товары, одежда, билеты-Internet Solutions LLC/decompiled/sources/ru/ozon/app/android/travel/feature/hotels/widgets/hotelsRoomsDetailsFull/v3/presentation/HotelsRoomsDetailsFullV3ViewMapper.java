package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.presentation;

import android.view.View;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.data.HotelsRoomsDetailsFullV3DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.data.HotelsRoomsDetailsFullV3Mapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.di.HotelsRoomsDetailsFullV3Component;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/HotelsRoomsDetailsFullV3ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/di/HotelsRoomsDetailsFullV3Component;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/data/HotelsRoomsDetailsFullV3DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/HotelsRoomsDetailsFullV3VO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/HotelsRoomsDetailsFullV3WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/data/HotelsRoomsDetailsFullV3Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/data/HotelsRoomsDetailsFullV3Mapper;", "mapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsRoomsDetailsFullV3ViewMapper extends WidgetViewMapper2<HotelsRoomsDetailsFullV3Component, HotelsRoomsDetailsFullV3DTO, HotelsRoomsDetailsFullV3VO> {
    private final int layout = R$layout.widget_hotels_rooms_details_full_v3;

    @NotNull
    private final Function2<View, ComposerReferences, HotelsRoomsDetailsFullV3WidgetViewHolder> holderProducer = new HotelsRoomsDetailsFullV3ViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, HotelsRoomsDetailsFullV3WidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsRoomsDetailsFullV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsRoomsDetailsFullV3Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public HotelsRoomsDetailsFullV3Mapper getMapper() {
        return component().getMapper();
    }
}
