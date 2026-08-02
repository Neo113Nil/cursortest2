package ru.ozon.app.android.search.widgets.expandableCells.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.search.widgets.expandableCells.data.ExpandableCellsDTO;
import ru.ozon.app.android.search.widgets.expandableCells.di.ExpandableCellsComponent;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.SkeletonVO;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.tileScroll.TileScrollSkeleton;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.tileScroll.TileScrollSkeletonViewHolder;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00142\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0018j\u0002`\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/core/TileScrollSkeletonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/widgets/expandableCells/di/ExpandableCellsComponent;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/SkeletonVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/tileScroll/TileScrollSkeletonViewHolder;", "holderProducer", "getHolderProducer", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileScrollSkeletonViewMapper extends WidgetViewMapper2<ExpandableCellsComponent, SkeletonVO, SkeletonVO> {
    private final Integer layout;

    @NotNull
    private final Function2<SkeletonVO, d, List<SkeletonVO>> mapper = TileScrollSkeletonViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, TileScrollSkeletonViewHolder> holderProducer = TileScrollSkeletonViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof SkeletonVO) && ((SkeletonVO) state).getTilesType() == ExpandableCellsDTO.TilesType.TILE_SCROLL;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new TileScrollSkeleton(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TileScrollSkeletonViewHolder> mo614getHolderProducer() {
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
}
