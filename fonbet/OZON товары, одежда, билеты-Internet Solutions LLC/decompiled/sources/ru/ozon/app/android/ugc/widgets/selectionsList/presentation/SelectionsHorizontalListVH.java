package ru.ozon.app.android.ugc.widgets.selectionsList.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.os.Parcelable;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.MarginItemDecoration;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.adapter.SelectionsListAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00110(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/SelectionsHorizontalListVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI;", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favProductMoleculeDelegateProvider", "<init>", "(LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/recyclerview/widget/RecyclerView;LVg/d;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;)V", "item", "", "updateItemDecorationIfNeeded", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "()V", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroidx/recyclerview/widget/RecyclerView;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/adapter/SelectionsListAdapter;", "adapter", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/adapter/SelectionsListAdapter;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionsHorizontalListVH extends k<SelectionsListVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SelectionsListAdapter adapter;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionsHorizontalListVH(@NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull RecyclerView recyclerView, @NotNull d customActionHandlersStoreFactory, @NotNull ProductFavoriteDelegateProvider favProductMoleculeDelegateProvider) {
        super(recyclerView);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegateProvider, "favProductMoleculeDelegateProvider");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        this.recyclerView = recyclerView;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new SelectionsHorizontalListVH$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        SelectionsListAdapter selectionsListAdapter = new SelectionsListAdapter(refs.getContainer().g(), buildHandler, tokenizedAnalytics, getTrackingData(), refs, favProductMoleculeDelegateProvider);
        this.adapter = selectionsListAdapter;
        recyclerView.setAdapter(selectionsListAdapter);
    }

    private final void updateItemDecorationIfNeeded(SelectionsListVI item) {
        CommonCellSettings.LayoutPadding horizontalPadding = item.getHorizontalPadding();
        if (horizontalPadding != null) {
            int dimension = (int) getResources().getDimension(horizontalPadding.getCellLayoutPadding());
            RecyclerView.n itemDecorationAt = this.recyclerView.getItemDecorationAt(0);
            MarginItemDecoration marginItemDecoration = itemDecorationAt instanceof MarginItemDecoration ? (MarginItemDecoration) itemDecorationAt : null;
            if (marginItemDecoration == null || marginItemDecoration.getEdgesMargin() != dimension) {
                if (marginItemDecoration != null) {
                    this.recyclerView.removeItemDecoration(marginItemDecoration);
                }
                this.recyclerView.addItemDecoration(new MarginItemDecoration(Dimens.INSTANCE.getDP_2(), dimension));
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.refs.getController().getEventsFlow(), new SelectionsHorizontalListVH$onAttachViewModel$1(this, null)), K.a(lifecycle));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        Parcelable onSaveInstanceState;
        SelectionsListVI boundData;
        super.onDetach();
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null || (boundData = getBoundData()) == null) {
            return;
        }
        boundData.setScrollState(onSaveInstanceState);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SelectionsListVI item, @NotNull l20.d info) {
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        updateItemDecorationIfNeeded(item);
        this.adapter.submitList(item.getItems(), getViewItem());
        Parcelable scrollState = item.getScrollState();
        if (scrollState == null || (layoutManager = this.recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(scrollState);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SelectionsListVI item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SelectionsHorizontalListVH) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
