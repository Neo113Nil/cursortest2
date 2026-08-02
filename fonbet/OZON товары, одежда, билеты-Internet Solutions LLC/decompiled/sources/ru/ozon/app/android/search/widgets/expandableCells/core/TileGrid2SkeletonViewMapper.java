package ru.ozon.app.android.search.widgets.expandableCells.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.search.widgets.expandableCells.data.ExpandableCellsDTO;
import ru.ozon.app.android.search.widgets.expandableCells.di.ExpandableCellsComponent;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.SkeletonVO;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.TileItemSkeleton;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.tileGrid2.TileGrid2SkeletonDecorator;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.tileGrid2.TileGrid2SkeletonViewHolder;
import ru.ozon.composer.ui.widget.h;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001dj\b\u0012\u0004\u0012\u00020\u0002`\u001e2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 R6\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\"j\u0002`#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R,\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001c\u0010-\u001a\u0004\u0018\u00010,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/core/TileGrid2SkeletonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/widgets/expandableCells/di/ExpandableCellsComponent;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/SkeletonVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/SkeletonVO;Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/SkeletonVO;)Lru/ozon/composer/ui/widget/h;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/tileGrid2/TileGrid2SkeletonViewHolder;", "holderProducer", "getHolderProducer", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2SkeletonViewMapper extends WidgetViewMapper2<ExpandableCellsComponent, SkeletonVO, SkeletonVO> {
    private final Integer layout;

    @NotNull
    private final Function2<SkeletonVO, d, List<SkeletonVO>> mapper = TileGrid2SkeletonViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, TileGrid2SkeletonViewHolder> holderProducer = TileGrid2SkeletonViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof SkeletonVO) && ((SkeletonVO) state).getTilesType() == ExpandableCellsDTO.TilesType.TILE_GRID_2;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new TileItemSkeleton(context);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new TileGrid2SkeletonDecorator());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TileGrid2SkeletonViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SkeletonVO, d, List<SkeletonVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ExpandableCellsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ExpandableCellsComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h getWidgetSpan(@NotNull SkeletonVO state, @NotNull SkeletonVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.b.f94870b;
    }
}
