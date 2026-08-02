package ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation;

import Ae.C2408n0;
import Pc.a;
import Sc.InterfaceC4008j;
import Tc.b;
import Ve.C4598rp;
import W10.c;
import WZ.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.storefront.navBar.v2.event.RichPromoScrollNotVisibleEvent;
import ru.ozon.app.android.storefront.navBar.v2.event.RichPromoScrollVisibleEvent;
import ru.ozon.app.android.storefront.widgets.cms.databinding.ItemRichPromoScrollBinding;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogTile;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogTileScrollVO;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.SpacersVO;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.adapter.CatalogScrollItemDecoration;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.adapter.CatalogTileScrollItemsAdapter;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.adapter.CatalogTileScrollItemsAdapterFactory;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0017\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J)\u0010-\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020\u0016H\u0016¢\u0006\u0004\b0\u0010#J\u0017\u00102\u001a\u00020\u00162\u0006\u0010&\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00160=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoScrollViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoScrollVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LPc/a;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/adapter/CatalogTileScrollItemsAdapterFactory;", "catalogTileFactoryProvider", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LPc/a;LWZ/l;Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoViewModel;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/SpacersVO;", "spacers", "", "lastIndex", "", "setupSpacers", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/SpacersVO;I)V", "addDecorator", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTileScrollVO;", "", "widgetId", "", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTile;", "getRecyclerItems", "(Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTileScrollVO;J)Ljava/util/List;", "observeSwipeRefresh", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoScrollVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoScrollVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "onDetach", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoViewModel;", "Lru/ozon/app/android/storefront/widgets/cms/databinding/ItemRichPromoScrollBinding;", "binding", "Lru/ozon/app/android/storefront/widgets/cms/databinding/ItemRichPromoScrollBinding;", "widgetInfo", "Ll20/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/adapter/CatalogScrollItemDecoration;", "itemDecor$delegate", "LSc/j;", "getItemDecor", "()Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/adapter/CatalogScrollItemDecoration;", "itemDecor", "", "isUpdateEnabled", "Z", "isVisible", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/adapter/CatalogTileScrollItemsAdapter;", "adapter$delegate", "getAdapter", "()Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/adapter/CatalogTileScrollItemsAdapter;", "adapter", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RichPromoScrollViewHolder extends k<RichPromoScrollVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adapter;

    @NotNull
    private final ItemRichPromoScrollBinding binding;
    private boolean isUpdateEnabled;
    private boolean isVisible;

    /* renamed from: itemDecor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j itemDecor;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final View view;

    @NotNull
    private final RichPromoViewModel viewModel;
    private d widgetInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichPromoScrollViewHolder(@NotNull View view, @NotNull ComposerReferences refs, @NotNull a<CatalogTileScrollItemsAdapterFactory> catalogTileFactoryProvider, @NotNull l tokenizedAnalytics, @NotNull RichPromoViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(catalogTileFactoryProvider, "catalogTileFactoryProvider");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        ItemRichPromoScrollBinding bind = ItemRichPromoScrollBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.itemDecor = Sc.k.b(RichPromoScrollViewHolder$itemDecor$2.INSTANCE);
        this.isUpdateEnabled = true;
        this.isVisible = true;
        this.adapter = Sc.k.b(new RichPromoScrollViewHolder$adapter$2(catalogTileFactoryProvider, this));
        bind.catalogScrollTiles.setAdapter(getAdapter());
        bind.richPromoScroll.setTranslationZ(10.0f);
    }

    private final void addDecorator(RecyclerView recyclerView, int i11) {
        getItemDecor().setLastIndex(i11);
        recyclerView.addItemDecoration(getItemDecor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1$lambda$0(RichPromoScrollViewHolder richPromoScrollViewHolder, ItemRichPromoScrollBinding itemRichPromoScrollBinding) {
        if (richPromoScrollViewHolder.viewModel.getScrollState() == null) {
            itemRichPromoScrollBinding.catalogScrollTiles.scrollToPosition(0);
            return;
        }
        RecyclerView.o layoutManager = itemRichPromoScrollBinding.catalogScrollTiles.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.onRestoreInstanceState(richPromoScrollViewHolder.viewModel.getScrollState());
        }
    }

    private final CatalogTileScrollItemsAdapter getAdapter() {
        return (CatalogTileScrollItemsAdapter) this.adapter.getValue();
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

    private final void observeSwipeRefresh() {
        C4598rp.f(this.refs, new C2408n0(this.refs.getController().getEventsFlow(), new RichPromoScrollViewHolder$observeSwipeRefresh$1(this, null)));
    }

    private final void setupSpacers(RecyclerView recyclerView, SpacersVO spacersVO, int i11) {
        getItemDecor().setOffset(spacersVO.getBetween());
        ViewExtKt.updatePadding(recyclerView, spacersVO.getLeft(), spacersVO.getTop(), spacersVO.getRight(), spacersVO.getBottom());
        addDecorator(recyclerView, i11);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeSwipeRefresh();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        if (this.isVisible) {
            this.refs.getController().update(new RichPromoScrollNotVisibleEvent());
            this.isVisible = false;
            this.isUpdateEnabled = true;
        }
        RichPromoViewModel richPromoViewModel = this.viewModel;
        RecyclerView.o layoutManager = this.binding.catalogScrollTiles.getLayoutManager();
        richPromoViewModel.saveScrollState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        FrameLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        if (o.a(constraintLayout, info, false) == 0.0f) {
            this.refs.getController().update(new RichPromoScrollNotVisibleEvent());
            this.isVisible = false;
            this.isUpdateEnabled = true;
        } else if (this.isUpdateEnabled) {
            this.refs.getController().update(new RichPromoScrollVisibleEvent());
            this.isVisible = true;
            this.isUpdateEnabled = false;
        }
        super.onVisibleAreaChanged(info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RichPromoScrollVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        final ItemRichPromoScrollBinding itemRichPromoScrollBinding = this.binding;
        this.widgetInfo = info;
        itemRichPromoScrollBinding.richPromoScroll.setBackgroundColor(0);
        Image bannerImage = itemRichPromoScrollBinding.bannerImage;
        Intrinsics.checkNotNullExpressionValue(bannerImage, "bannerImage");
        ImageHolderKt.bindOrGone$default(bannerImage, item.getImage(), null, 2, null);
        CatalogTileScrollVO catalogTileScroll = item.getCatalogTileScroll();
        if (catalogTileScroll != null) {
            itemRichPromoScrollBinding.catalogScrollTiles.setBackgroundColor(0);
            List<CatalogTile> recyclerItems = getRecyclerItems(catalogTileScroll, item.getId());
            RecyclerView catalogScrollTiles = itemRichPromoScrollBinding.catalogScrollTiles;
            Intrinsics.checkNotNullExpressionValue(catalogScrollTiles, "catalogScrollTiles");
            setupSpacers(catalogScrollTiles, item.getCatalogTileScroll().getSpacers(), C7714v.P(recyclerItems));
            getAdapter().submitList(recyclerItems, new AK.a(0, this, itemRichPromoScrollBinding));
        }
        ContextExtKt.load(getContext(), item.getBackgroundImage(), (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.RichPromoScrollViewHolder$bind$1$2
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                if (resource != null) {
                    ItemRichPromoScrollBinding.this.backgroundView.setBackground(resource);
                }
            }
        }, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull RichPromoScrollVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((RichPromoScrollViewHolder) item, trackingData, viewedPond);
        this.view.setContentDescription("catalogScrollTileWidget");
    }
}
