package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.item;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2VO;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BG\u0012\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/item/CatalogTabsMaxItemsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/item/CatalogTabsMaxItemViewHolder;", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onView", "onClick", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/item/CatalogTabsMaxItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/item/CatalogTabsMaxItemViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsMaxItemsAdapter extends t<CatalogTabsV2VO.Tab, CatalogTabsMaxItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function1<CatalogTabsV2VO.Tab, Unit> onClick;

    @NotNull
    private final Function1<WZ.t, Unit> onView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatalogTabsMaxItemsAdapter(@NotNull Function1<? super WZ.t, Unit> onView, @NotNull Function1<? super CatalogTabsV2VO.Tab, Unit> onClick, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new TabDiffCallback());
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.onView = onView;
        this.onClick = onClick;
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CatalogTabsMaxItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CatalogTabsV2VO.Tab item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CatalogTabsMaxItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new CatalogTabsMaxItemViewHolder(new TagButtonView(context, null, 0, 0, 14, null), this.onView, this.onClick, this.actionHandler);
    }
}
