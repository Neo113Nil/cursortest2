package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.adapters;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.C5468b;
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
import ru.ozon.app.android.product.tiles.toprightbuttons.TopRightButtonsListDiffUtil;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils.TopRightButtonsViewHolderUtils;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00012\u00020\u0004B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u00030\u0007j\u0006\u0012\u0002\b\u0003`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u000f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0017H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R \u0010\t\u001a\u000e\u0012\u0002\b\u00030\u0007j\u0006\u0012\u0002\b\u0003`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R6\u0010-\u001a\u0016\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0018\u00010*j\u0004\u0018\u0001`,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020!038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapterMain;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapter;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonsViewHolderUtils;", "topRightButtonsViewHolderUtils", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonsViewHolderUtils;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;)V", "holder", "", "onViewAttachedToWindow", "(Ljk0/j;)V", "onViewDetachedFromWindow", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$g;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "position", "onBindViewHolder", "(Ljk0/j;I)V", "getItemViewType", "(I)I", "", "", "list", "submitList", "(Ljava/util/List;)V", "getItemCount", "()I", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonsViewHolderUtils;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/BuildedActionHandler;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "", "buttons", "Ljava/util/List;", "Landroidx/recyclerview/widget/b;", "adapterUpdateCallback", "Landroidx/recyclerview/widget/b;", "Lru/ozon/app/android/product/tiles/toprightbuttons/TopRightButtonsListDiffUtil;", "diffUtil", "Lru/ozon/app/android/product/tiles/toprightbuttons/TopRightButtonsListDiffUtil;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopRightButtonAdapterMain extends RecyclerView.g<j> implements TopRightButtonAdapter {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final C5468b adapterUpdateCallback;

    @NotNull
    private List<Object> buttons;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final TopRightButtonsListDiffUtil diffUtil;

    @NotNull
    private final TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils;

    @NotNull
    private final k<?> widgetViewHolder;

    public TopRightButtonAdapterMain(@NotNull TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils, @NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(topRightButtonsViewHolderUtils, "topRightButtonsViewHolderUtils");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.topRightButtonsViewHolderUtils = topRightButtonsViewHolderUtils;
        this.widgetViewHolder = widgetViewHolder;
        this.composerReferences = composerReferences;
        ArrayList arrayList = new ArrayList();
        this.buttons = arrayList;
        this.adapterUpdateCallback = new C5468b(this);
        this.diffUtil = new TopRightButtonsListDiffUtil(arrayList, K.f71697a);
    }

    public Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.adapters.TopRightButtonAdapter
    @NotNull
    public RecyclerView.g<j> getAdapter() {
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.buttons.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return this.topRightButtonsViewHolderUtils.getItemViewType(this.buttons.get(position));
    }

    public void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.adapters.TopRightButtonAdapter
    public void submitList(List<? extends Object> list) {
        if (list == null) {
            return;
        }
        this.diffUtil.setNewList(list);
        i.c a11 = i.a(this.diffUtil, false);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.buttons.clear();
        this.buttons.addAll(list);
        this.diffUtil.setOldList(this.buttons);
        a11.b(this.adapterUpdateCallback);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.topRightButtonsViewHolderUtils.bindViewHolder(this.buttons.get(position), holder, getActionHandler(), this.widgetViewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.topRightButtonsViewHolderUtils.createViewHolder(parent, viewType, this.composerReferences);
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
