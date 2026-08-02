package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.badges;

import Nk.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.FlexboxLayoutManager;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementFactoriesV2Kt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolder;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/badges/BadgesAdapterV2;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "", "leftTopMargin", "<init>", "(Lkotlin/jvm/functions/Function1;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "I", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BadgesAdapterV2 extends t<BadgeDTO, AtomItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int leftTopMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BadgesAdapterV2(@NotNull Function1<? super AtomAction, Unit> actionHandler, int i11) {
        super(new i.d<BadgeDTO>() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.badges.BadgesAdapterV2.1
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
                return oldItem.getClass().equals(newItem.getClass());
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.leftTopMargin = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AtomItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BadgeDTO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind((AtomDTO) item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AtomItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Context a11 = a.a(parent, "parent", "getContext(...)");
        View i11 = q.f64554a.i(N.b(BadgeView.class), a11);
        if (i11 == null) {
            i11 = new BadgeView(a11, null, 0, 0, 14, null);
        }
        BadgeHolder badgeHolder = new BadgeHolder((BadgeView) i11, (String) null);
        Function1<AtomAction, Unit> function1 = this.actionHandler;
        FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
        int i12 = this.leftTopMargin;
        bVar.setMargins(i12, i12, 0, 0);
        Unit unit = Unit.f71690a;
        return DynamicElementFactoriesV2Kt.createVHV2(badgeHolder, function1, bVar);
    }
}
