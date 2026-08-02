package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/adapter/AviaSearchResultV4BadgesAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/adapter/AviaSearchResultV4BadgesViewHolder;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/adapter/AviaSearchResultV4BadgesViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/adapter/AviaSearchResultV4BadgesViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "dp8", "I", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4BadgesAdapter extends t<BadgeDTO, AviaSearchResultV4BadgesViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int dp8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AviaSearchResultV4BadgesAdapter(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<BadgeDTO>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.adapter.AviaSearchResultV4BadgesAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(BadgeDTO oldItem, BadgeDTO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(BadgeDTO oldItem, BadgeDTO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.hashCode() == newItem.hashCode();
            }
        });
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.dp8 = ResourceExtKt.toPx(8, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AviaSearchResultV4BadgesViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BadgeDTO item = getItem(position);
        Intrinsics.f(item);
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AviaSearchResultV4BadgesViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = this.dp8;
        badgeView.setLayoutParams(bVar);
        return new AviaSearchResultV4BadgesViewHolder(badgeView, this.actionHandler);
    }
}
