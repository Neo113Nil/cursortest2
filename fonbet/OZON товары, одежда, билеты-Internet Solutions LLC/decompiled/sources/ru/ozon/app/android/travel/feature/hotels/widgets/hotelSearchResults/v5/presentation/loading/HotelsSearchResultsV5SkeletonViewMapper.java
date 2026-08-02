package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading;

import A00.a;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.di.HotelsSearchResultsV5Component;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00020\u0018j\u0002`\u00192\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R,\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R&\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R0\u00106\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u000603j\u0002`4\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040,0%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010+¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/di/HotelsSearchResultsV5Component;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;)Ljava/lang/Object;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "", "canMap", "(Ljava/lang/Object;)Z", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsSearchResultsV5SkeletonViewMapper extends WidgetViewMapper2<HotelsSearchResultsV5Component, HotelsSearchResultsV5DTO, HotelsSearchResultsV5SkeletonVO> {
    private final Integer layout;

    @NotNull
    private final Function2<View, ComposerReferences, HotelsSearchResultsV5SkeletonWidgetViewHolder> holderProducer = new HotelsSearchResultsV5SkeletonViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<HotelsSearchResultsV5SkeletonUpdate>> supportedUpdates = C7714v.a0(HotelsSearchResultsV5SkeletonUpdate.class);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof HotelsSearchResultsV5DTO) && ((HotelsSearchResultsV5DTO) state).getAsyncBehaviorType() == HotelsSearchResultsV5DTO.AsyncBehaviorType.SKELETON_STATE;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.f(context);
        float pxF = ResourceExtKt.toPxF(24, context);
        int px = ResourceExtKt.toPx(8, context);
        int px2 = ResourceExtKt.toPx(100, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        RecyclerViewExtensionsKt.addParentTouchesInterceptor(recyclerView, true);
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), pxF);
        EmptyStateView emptyStateView = new EmptyStateView(context, null, 0, 0, 14, null);
        emptyStateView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        emptyStateView.setBackground(produce);
        emptyStateView.setPadding(px, px2, px, px);
        frameLayout.addView(recyclerView);
        frameLayout.addView(emptyStateView);
        return frameLayout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, HotelsSearchResultsV5SkeletonWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HotelsSearchResultsV5DTO, d, List<HotelsSearchResultsV5SkeletonVO>> getMapper() {
        return component().getHotelsSearchResultsV5SkeletonMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<HotelsSearchResultsV5SkeletonUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsSearchResultsV5Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsSearchResultsV5Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull HotelsSearchResultsV5SkeletonVO oldItem, @NotNull HotelsSearchResultsV5SkeletonVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (newItem.getIsErrorState()) {
            return HotelsSearchResultsV5SkeletonPayloads.SHOW_ERROR;
        }
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public HotelsSearchResultsV5SkeletonVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsSearchResultsV5SkeletonVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof HotelsSearchResultsV5SkeletonUpdate) {
            return HotelsSearchResultsV5SkeletonVO.copy$default(oldItem, 0L, null, null, ((HotelsSearchResultsV5SkeletonUpdate) update).getIsErrorState(), 7, null);
        }
        return null;
    }
}
