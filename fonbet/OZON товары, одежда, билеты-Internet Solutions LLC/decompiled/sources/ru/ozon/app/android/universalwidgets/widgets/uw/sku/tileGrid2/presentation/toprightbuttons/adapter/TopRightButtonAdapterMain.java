package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2CheckBoxVO;
import ru.ozon.app.android.product.tiles.toprightbuttons.TopRightButtonsListDiffUtil;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.utils.TouchDelegateComposite;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.vhutils.TopRightButtonsViewHolderUtils;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00012\u00020\u0004BI\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u00030\u0007j\u0006\u0012\u0002\b\u0003`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"J+\u0010&\u001a\u00020\u00102\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010-\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R \u0010\t\u001a\u000e\u0012\u0002\b\u00030\u0007j\u0006\u0012\u0002\b\u0003`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00105R*\u0010%\u001a\u0016\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00105R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020+068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R0\u0010=\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u00105\u001a\u0004\b>\u0010?\"\u0004\b@\u0010'¨\u0006A"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapterMain;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonsViewHolderUtils;", "topRightButtonsViewHolderUtils", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "touchDelegateComposite", "Lkotlin/Function1;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;", "", "onCheckboxClick", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonsViewHolderUtils;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;Lkotlin/jvm/functions/Function1;)V", "holder", "onViewAttachedToWindow", "(Ljk0/j;)V", "onViewDetachedFromWindow", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$g;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "position", "onBindViewHolder", "(Ljk0/j;I)V", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/BuildedActionHandler;", "actionHandler", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "(I)I", "", "", "list", "submitList", "(Ljava/util/List;)V", "getItemCount", "()I", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonsViewHolderUtils;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "Lkotlin/jvm/functions/Function1;", "", "buttons", "Ljava/util/List;", "Lru/ozon/app/android/product/tiles/toprightbuttons/TopRightButtonsListDiffUtil;", "diffUtil", "Lru/ozon/app/android/product/tiles/toprightbuttons/TopRightButtonsListDiffUtil;", "", "onFavoriteClick", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TopRightButtonAdapterMain extends RecyclerView.g<j> implements TopRightButtonAdapter {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final List<Object> buttons;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final TopRightButtonsListDiffUtil diffUtil;

    @NotNull
    private final Function1<TileGrid2CheckBoxVO, Unit> onCheckboxClick;
    private Function1<? super Boolean, Unit> onFavoriteClick;

    @NotNull
    private final TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils;
    private final TouchDelegateComposite touchDelegateComposite;

    @NotNull
    private final k<?> widgetViewHolder;

    /* JADX WARN: Multi-variable type inference failed */
    public TopRightButtonAdapterMain(@NotNull TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils, @NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, TouchDelegateComposite touchDelegateComposite, @NotNull Function1<? super TileGrid2CheckBoxVO, Unit> onCheckboxClick) {
        Intrinsics.checkNotNullParameter(topRightButtonsViewHolderUtils, "topRightButtonsViewHolderUtils");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(onCheckboxClick, "onCheckboxClick");
        this.topRightButtonsViewHolderUtils = topRightButtonsViewHolderUtils;
        this.widgetViewHolder = widgetViewHolder;
        this.composerReferences = composerReferences;
        this.touchDelegateComposite = touchDelegateComposite;
        this.onCheckboxClick = onCheckboxClick;
        ArrayList arrayList = new ArrayList();
        this.buttons = arrayList;
        this.diffUtil = new TopRightButtonsListDiffUtil(arrayList, K.f71697a);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.TopRightButtonAdapter
    @NotNull
    public RecyclerView.g<j> getAdapter() {
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.buttons.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return this.topRightButtonsViewHolderUtils.getItemViewType(this.buttons.get(position));
    }

    public Function1<Boolean, Unit> getOnFavoriteClick() {
        return this.onFavoriteClick;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.TopRightButtonAdapter
    public void setActionHandler(Function1<? super AtomAction, Unit> actionHandler) {
        this.actionHandler = actionHandler;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.TopRightButtonAdapter
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.onFavoriteClick = function1;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.TopRightButtonAdapter
    public void submitList(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.diffUtil.setNewList(list);
        i.c a11 = i.a(this.diffUtil, false);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.buttons.clear();
        this.buttons.addAll(list);
        this.diffUtil.setOldList(this.buttons);
        a11.c(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof FavoriteProductDelegate) {
            ((FavoriteProductDelegate) holder).setOnFavoriteClick(new TopRightButtonAdapterMain$onBindViewHolder$1(this));
        }
        this.topRightButtonsViewHolderUtils.bindViewHolder(this.buttons.get(position), holder, this.actionHandler, this.widgetViewHolder, this.onCheckboxClick);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.topRightButtonsViewHolderUtils.createViewHolder(parent, viewType, this.composerReferences, this.touchDelegateComposite);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull j holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setLifecycleState(AbstractC5434v.b.CREATED);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull j holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setLifecycleState(AbstractC5434v.b.DESTROYED);
    }
}
