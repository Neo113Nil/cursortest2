package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Tc.b;
import W10.c;
import WZ.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.CatalogTile;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.CatalogTileScrollVO;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.SpacersVO;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.adapter.CatalogScrollItemDecoration;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.adapter.CatalogTileScrollItemsAdapter;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.adapter.CatalogTileScrollItemsAdapterFactory;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00130,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00105\u001a\u0002008TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/CatalogTileScrollViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTileScrollVO;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile;", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileScrollItemsAdapterFactory;", "catalogTileFactoryProvider", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;LPc/a;)V", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/SpacersVO;", "spacers", "", "lastIndex", "", "setupSpacers", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/SpacersVO;I)V", "addDecorator", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "", "widgetId", "", "getRecyclerItems", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTileScrollVO;J)Ljava/util/List;", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTileScrollVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTileScrollVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "widgetInfo", "Ll20/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileScrollItemsAdapter;", "adapter$delegate", "LSc/j;", "getAdapter", "()Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileScrollItemsAdapter;", "adapter", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogScrollItemDecoration;", "itemDecor$delegate", "getItemDecor", "()Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogScrollItemDecoration;", "itemDecor", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileScrollViewHolder extends AbstractHorizontalListViewHolder<CatalogTileScrollVO, CatalogTile> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adapter;

    @NotNull
    private final RecyclerView containerView;

    /* renamed from: itemDecor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j itemDecor;

    @NotNull
    private final l tokenizedAnalytics;
    private d widgetInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogTileScrollViewHolder(@NotNull RecyclerView containerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull a<CatalogTileScrollItemsAdapterFactory> catalogTileFactoryProvider) {
        super(containerView, refs);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(catalogTileFactoryProvider, "catalogTileFactoryProvider");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.adapter = k.b(new CatalogTileScrollViewHolder$adapter$2(catalogTileFactoryProvider, this));
        this.itemDecor = k.b(CatalogTileScrollViewHolder$itemDecor$2.INSTANCE);
        containerView.setAdapter(getAdapter());
    }

    private final void addDecorator(RecyclerView recyclerView, int i11) {
        getItemDecor().setLastIndex(i11);
        recyclerView.addItemDecoration(getItemDecor());
    }

    private final CatalogScrollItemDecoration getItemDecor() {
        return (CatalogScrollItemDecoration) this.itemDecor.getValue();
    }

    private final List<CatalogTile> getRecyclerItems(CatalogTileScrollVO catalogTileScrollVO, long j11) {
        if (!catalogTileScrollVO.getHasFirstItemSeparator()) {
            return catalogTileScrollVO.getTiles();
        }
        b builder = C7714v.B();
        builder.addAll(catalogTileScrollVO.getTiles());
        builder.add(1, new CatalogTile.SeparatorVO(j11));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final void setupSpacers(RecyclerView recyclerView, SpacersVO spacersVO, int i11) {
        getItemDecor().setOffset(spacersVO.getBetween());
        ViewExtKt.updatePadding(recyclerView, spacersVO.getLeft(), spacersVO.getTop(), spacersVO.getRight(), spacersVO.getBottom());
        addDecorator(recyclerView, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CatalogTileScrollVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.widgetInfo = info;
        this.containerView.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        List<CatalogTile> recyclerItems = getRecyclerItems(item, item.getId());
        setupSpacers(this.containerView, item.getSpacers(), C7714v.P(recyclerItems));
        AbstractHorizontalListViewHolder.submitList$default(this, recyclerItems, item.getScrollState(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder
    @NotNull
    public t<CatalogTile, ?> getAdapter() {
        return (CatalogTileScrollItemsAdapter) this.adapter.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CatalogTileScrollVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CatalogTileScrollViewHolder) item, trackingData, viewedPond);
        this.containerView.setContentDescription("catalogScrollTileWidget");
    }
}
