package ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons;

import W10.c;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.tiles.toprightbuttons.TopRightButtonsListDiffUtil;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0013\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u000b2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R6\u0010/\u001a\u0016\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000b\u0018\u00010,j\u0004\u0018\u0001`.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsAdapterMain;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderUtils;", "topRightButtonsViewHolderUtils", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderUtils;Lru/ozon/app/android/composer/ComposerReferences;)V", "holder", "", "onViewAttachedToWindow", "(Ljk0/j;)V", "onViewDetachedFromWindow", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "position", "onBindViewHolder", "(Ljk0/j;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "", "", "newButtons", "submitList", "(Ljava/util/List;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "setTrackingData", "(LW10/c;)V", "Lru/ozon/composer/ui/widget/l;", "widgetViewItem", "setWidgetViewItem", "(Lru/ozon/composer/ui/widget/l;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderUtils;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/BuildedActionHandler;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "", "buttons", "Ljava/util/List;", "Landroidx/recyclerview/widget/b;", "adapterUpdateCallback", "Landroidx/recyclerview/widget/b;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopRightButtonsAdapterMain extends RecyclerView.g<j> {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final C5468b adapterUpdateCallback;

    @NotNull
    private List<Object> buttons;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils;

    public TopRightButtonsAdapterMain(@NotNull TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(topRightButtonsViewHolderUtils, "topRightButtonsViewHolderUtils");
        Intrinsics.checkNotNullParameter(references, "references");
        this.topRightButtonsViewHolderUtils = topRightButtonsViewHolderUtils;
        this.references = references;
        this.buttons = new ArrayList();
        this.adapterUpdateCallback = new C5468b(this);
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

    public final void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
    }

    public final void setTrackingData(c trackingData) {
        this.topRightButtonsViewHolderUtils.setTrackingData(trackingData);
    }

    public final void setWidgetViewItem(l widgetViewItem) {
        this.topRightButtonsViewHolderUtils.setWidgetViewItem(widgetViewItem);
    }

    public final void submitList(@NotNull List<? extends Object> newButtons) {
        Intrinsics.checkNotNullParameter(newButtons, "newButtons");
        i.c a11 = i.a(new TopRightButtonsListDiffUtil(this.buttons, newButtons), false);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.buttons.clear();
        this.buttons.addAll(newButtons);
        a11.b(this.adapterUpdateCallback);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.topRightButtonsViewHolderUtils.bindViewHolder(this.buttons.get(position), holder, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.topRightButtonsViewHolderUtils.createViewHolder(parent, viewType, this.references);
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
