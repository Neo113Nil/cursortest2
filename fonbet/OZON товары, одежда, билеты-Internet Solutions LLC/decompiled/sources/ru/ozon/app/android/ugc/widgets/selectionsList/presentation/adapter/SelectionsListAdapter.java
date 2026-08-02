package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.adapter;

import Sc.o;
import W10.c;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import java.util.ArrayList;
import java.util.List;
import jk0.d;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.EmptyView;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.SelectionTileView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\"J%\u0010(\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020$0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/adapter/SelectionsListAdapter;", "Ljk0/d;", "Ljk0/j;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favProductMoleculeDelegateProvider", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;LWZ/l;LW10/c;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onBindViewHolder", "(Ljk0/j;I)V", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI;", "items", "Lru/ozon/composer/ui/widget/l;", "viewItem", "submitList", "(Ljava/util/List;Lru/ozon/composer/ui/widget/l;)V", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "LW10/c;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "", "selections", "Ljava/util/List;", "Lru/ozon/composer/ui/widget/l;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionsListAdapter extends d<j> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ProductFavoriteDelegateProvider favProductMoleculeDelegateProvider;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final List<SelectionsListVI.SelectionsListItemVI> selections;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final c trackingData;
    private ru.ozon.composer.ui.widget.l viewItem;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/adapter/SelectionsListAdapter$Companion;", "", "<init>", "()V", "WIDTH_DIVIDER", "", "HEIGHT_MULTIPLIER", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionsListAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull c trackingData, @NotNull ComposerReferences refs, @NotNull ProductFavoriteDelegateProvider favProductMoleculeDelegateProvider) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegateProvider, "favProductMoleculeDelegateProvider");
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.trackingData = trackingData;
        this.refs = refs;
        this.favProductMoleculeDelegateProvider = favProductMoleculeDelegateProvider;
        this.selections = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.selections.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        SelectionsListVI.SelectionsListItemVI selectionsListItemVI = this.selections.get(position);
        if (selectionsListItemVI instanceof SelectionsListVI.SelectionsListItemVI.TileItem) {
            return 1;
        }
        if (selectionsListItemVI instanceof SelectionsListVI.SelectionsListItemVI.EmptyItem) {
            return 2;
        }
        throw new o();
    }

    public final void submitList(@NotNull List<? extends SelectionsListVI.SelectionsListItemVI> items, ru.ozon.composer.ui.widget.l viewItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.viewItem = viewItem;
        this.selections.clear();
        this.selections.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SelectionsListVI.SelectionsListItemVI selectionsListItemVI = this.selections.get(position);
        if (holder instanceof SelectionTileViewHolder) {
            if ((selectionsListItemVI instanceof SelectionsListVI.SelectionsListItemVI.TileItem ? (SelectionsListVI.SelectionsListItemVI.TileItem) selectionsListItemVI : null) != null) {
                ((SelectionTileViewHolder) holder).bind((SelectionsListVI.SelectionsListItemVI.TileItem) selectionsListItemVI, this.actionHandler, this.trackingData, this.viewItem, this.favProductMoleculeDelegateProvider.get(this.refs));
            }
        } else if (holder instanceof EmptyViewHolder) {
            SelectionsListVI.SelectionsListItemVI.EmptyItem emptyItem = selectionsListItemVI instanceof SelectionsListVI.SelectionsListItemVI.EmptyItem ? (SelectionsListVI.SelectionsListItemVI.EmptyItem) selectionsListItemVI : null;
            if (emptyItem != null) {
                ((EmptyViewHolder) holder).bind(emptyItem, this.actionHandler);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i11 = (int) (parent.getContext().getResources().getDisplayMetrics().widthPixels / 2.15f);
        int i12 = (int) (i11 * 1.5d);
        if (viewType == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SelectionTileView selectionTileView = new SelectionTileView(context);
            selectionTileView.setLayoutParams(new ConstraintLayout.b(i11, i12));
            return new SelectionTileViewHolder(selectionTileView, this.tokenizedAnalytics);
        }
        if (viewType == 2) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            EmptyView emptyView = new EmptyView(context2);
            emptyView.setLayoutParams(new ConstraintLayout.b(i11, i12));
            return new EmptyViewHolder(emptyView, this.tokenizedAnalytics);
        }
        throw new IllegalArgumentException("Unknown viewType=" + viewType + " in " + SelectionsListAdapter.class);
    }
}
