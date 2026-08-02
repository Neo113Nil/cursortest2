package ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation;

import NV.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.marketing.databinding.ItemSellerCategoryListBinding;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.vo.CategoryVO;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleListAdapter;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B?\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/SellerCategoryListAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleListAdapter;", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/vo/CategoryVO;", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/SellerCategoryListItemHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "adultDelegate", "Landroidx/recyclerview/widget/i$d;", "diffUtilCallback", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;Landroidx/recyclerview/widget/i$d;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/SellerCategoryListItemHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/SellerCategoryListItemHolder;I)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerCategoryListAdapter extends LifecycleListAdapter<CategoryVO, SellerCategoryListItemHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultDelegate<CategoryVO> adultDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SellerCategoryListAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull AdultDelegate<CategoryVO> adultDelegate, @NotNull i.d<CategoryVO> diffUtilCallback, @NotNull J lifecycleOwner) {
        super(diffUtilCallback, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        Intrinsics.checkNotNullParameter(diffUtilCallback, "diffUtilCallback");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = actionHandler;
        this.adultDelegate = adultDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$4$lambda$3(SellerCategoryListItemHolder sellerCategoryListItemHolder, SellerCategoryListAdapter sellerCategoryListAdapter, View view) {
        CategoryVO item;
        Integer valueOf = Integer.valueOf(sellerCategoryListItemHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null || (item = sellerCategoryListAdapter.getItem(valueOf.intValue())) == null) {
            return;
        }
        sellerCategoryListAdapter.actionHandler.invoke(item.getAction());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SellerCategoryListItemHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CategoryVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SellerCategoryListItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemSellerCategoryListBinding inflate = ItemSellerCategoryListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        SellerCategoryListItemHolder sellerCategoryListItemHolder = new SellerCategoryListItemHolder(inflate, this.adultDelegate);
        sellerCategoryListItemHolder.itemView.setOnClickListener(new a(2, sellerCategoryListItemHolder, this));
        return sellerCategoryListItemHolder;
    }
}
