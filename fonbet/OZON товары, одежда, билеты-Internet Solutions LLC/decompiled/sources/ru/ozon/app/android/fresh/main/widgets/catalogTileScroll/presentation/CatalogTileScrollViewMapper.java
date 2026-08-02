package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation;

import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.CatalogTileScrollDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.di.CatalogTileScrollComponent;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.CatalogTileScrollVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R<\u0010\u001d\u001a$\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001bj\b\u0012\u0004\u0012\u00020\u0004`\u001c0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R,\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010 ¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/CatalogTileScrollViewMapper;", "Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewMapper;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/di/CatalogTileScrollComponent;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/CatalogTileScrollDTO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTileScrollVO;", "<init>", "()V", "oldItem", "onRefresh", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTileScrollVO;)Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTileScrollVO;", "Landroid/os/Parcelable;", "newScrollState", "onScrollStateSave", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTileScrollVO;Landroid/os/Parcelable;)Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTileScrollVO;", "Landroidx/recyclerview/widget/RecyclerView;", "customize", "(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/recyclerview/widget/RecyclerView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "", "getMapper", "mapper", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CatalogTileScrollViewMapper extends AbstractHorizontalListViewMapper<CatalogTileScrollComponent, CatalogTileScrollDTO, CatalogTileScrollVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<CatalogTileScrollVO>> holderProducer = new CatalogTileScrollViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public RecyclerView customize(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.setId(R$id.catalogScrollTiles);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CatalogTileScrollVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CatalogTileScrollDTO, d, List<CatalogTileScrollVO>> getMapper() {
        return ((CatalogTileScrollComponent) component()).getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CatalogTileScrollComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CatalogTileScrollComponent.INSTANCE.create(storage);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public CatalogTileScrollVO onRefresh(@NotNull CatalogTileScrollVO oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return CatalogTileScrollVO.copy$default(oldItem, 0L, null, false, null, null, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public CatalogTileScrollVO onScrollStateSave(@NotNull CatalogTileScrollVO oldItem, @NotNull Parcelable newScrollState) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newScrollState, "newScrollState");
        return CatalogTileScrollVO.copy$default(oldItem, 0L, null, false, null, null, null, newScrollState, 63, null);
    }
}
