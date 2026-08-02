package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.recycler;

import WZ.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.List;
import jk0.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b \u0010!R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/NavLikezoneCaruselBannerMultiAdapter;", "Ljk0/d;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/NavLikezoneCaruselBannerMultiViewHolder;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function0;", "onLongTapUp", "onLongTapDown", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(LWZ/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/NavLikezoneCaruselBannerMultiViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/NavLikezoneCaruselBannerMultiViewHolder;I)V", "getItemCount", "()I", "", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;", "list", "submitList", "(Ljava/util/List;)V", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "currentList", "Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavLikezoneCaruselBannerMultiAdapter extends d<NavLikezoneCaruselBannerMultiViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private List<? extends BannerItem> currentList;

    @NotNull
    private final Function0<Unit> onLongTapDown;

    @NotNull
    private final Function0<Unit> onLongTapUp;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavLikezoneCaruselBannerMultiAdapter(@NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Unit> onLongTapUp, @NotNull Function0<Unit> onLongTapDown, @NotNull J lifecycleOwner) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onLongTapUp, "onLongTapUp");
        Intrinsics.checkNotNullParameter(onLongTapDown, "onLongTapDown");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = actionHandler;
        this.onLongTapUp = onLongTapUp;
        this.onLongTapDown = onLongTapDown;
        this.currentList = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.currentList.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<? extends BannerItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.currentList = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull NavLikezoneCaruselBannerMultiViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.currentList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public NavLikezoneCaruselBannerMultiViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new NavLikezoneCaruselBannerMultiViewHolder(new NavLikezoneCaruselBanner.View(context), this.tokenizedAnalytics, this.actionHandler, this.onLongTapUp, this.onLongTapDown);
    }
}
