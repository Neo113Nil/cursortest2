package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import gk0.q;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storefront.ui.navslider.R$layout;
import ru.ozon.app.android.storefront.ui.navslider.databinding.ItemNavigationBlockElementAdultV2Binding;
import ru.ozon.app.android.storefront.ui.navslider.databinding.ItemNavigationBlockElementV2Binding;
import ru.ozon.app.android.storefront.ui.navslider.databinding.ItemNavigationBlockElementV2OptimizedBinding;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\b\u0001\u0018\u0000 82\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u00018B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0016\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020!2\n\u0010 \u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0$¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00106\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationBlockV2Adapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "adapterCallback", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "", "optimizeFF", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/tools/ItemAdapterCallback;Landroidx/lifecycle/J;Z)V", "Landroid/view/ViewGroup;", "parent", "createNavigationBlockViewHolder", "(Landroid/view/ViewGroup;)Ljk0/j;", "createNavigationBlockViewHolderOptimized", "createNavigationBlockAdultViewHolder", "", "position", "getItemViewType", "(I)I", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "getItemCount", "()I", "holder", "", "onBindViewHolder", "(Ljk0/j;I)V", "", "list", "bind", "(Ljava/util/List;)V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Landroidx/lifecycle/J;", "Z", "itemWidth", "Ljava/lang/Integer;", "getItemWidth", "()Ljava/lang/Integer;", "setItemWidth", "(Ljava/lang/Integer;)V", "layoutNavigationBlock", "I", "layoutNavigationBlockOptimized", "layoutNavigationBlockAdult", "Ljava/util/List;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationBlockV2Adapter extends LifecycleAdapter<j> {

    @NotNull
    private final ItemAdapterCallback<NavigationSliderV2VO.NavigationItemV2> adapterCallback;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final J containerViewLifecycleOwner;

    @NotNull
    private final FeatureChecker featureChecker;
    private Integer itemWidth;
    private final int layoutNavigationBlock;
    private final int layoutNavigationBlockAdult;
    private final int layoutNavigationBlockOptimized;

    @NotNull
    private List<NavigationSliderV2VO.NavigationItemV2> list;
    private final boolean optimizeFF;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationBlockV2Adapter(@NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker, @NotNull ItemAdapterCallback<? super NavigationSliderV2VO.NavigationItemV2> adapterCallback, @NotNull J containerViewLifecycleOwner, boolean z11) {
        super(containerViewLifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(adapterCallback, "adapterCallback");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        this.adultHandler = adultHandler;
        this.featureChecker = featureChecker;
        this.adapterCallback = adapterCallback;
        this.containerViewLifecycleOwner = containerViewLifecycleOwner;
        this.optimizeFF = z11;
        this.layoutNavigationBlock = R$layout.item_navigation_block_element_v2;
        this.layoutNavigationBlockOptimized = R$layout.item_navigation_block_element_v2_optimized;
        this.layoutNavigationBlockAdult = R$layout.item_navigation_block_element_adult_v2;
        this.list = K.f71697a;
    }

    private final j createNavigationBlockAdultViewHolder(ViewGroup parent) {
        View h11 = q.f64554a.h(this.layoutNavigationBlockAdult);
        if (h11 != null) {
            h11.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        } else {
            h11 = LayoutInflater.from(parent.getContext()).inflate(this.layoutNavigationBlockAdult, parent, false);
        }
        ItemNavigationBlockElementAdultV2Binding bind = ItemNavigationBlockElementAdultV2Binding.bind(h11);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new NavigationItemV2AdultViewHolder(new AdultDelegate(this.adultHandler, this.featureChecker), bind, this.adapterCallback, this.containerViewLifecycleOwner);
    }

    private final j createNavigationBlockViewHolder(ViewGroup parent) {
        View h11 = q.f64554a.h(this.layoutNavigationBlock);
        if (h11 != null) {
            h11.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        } else {
            h11 = LayoutInflater.from(parent.getContext()).inflate(this.layoutNavigationBlock, parent, false);
        }
        ItemNavigationBlockElementV2Binding bind = ItemNavigationBlockElementV2Binding.bind(h11);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new NavigationItemV2ViewHolder(bind, this.adapterCallback, this.containerViewLifecycleOwner);
    }

    private final j createNavigationBlockViewHolderOptimized(ViewGroup parent) {
        View h11 = q.f64554a.h(this.layoutNavigationBlockOptimized);
        if (h11 != null) {
            Integer num = this.itemWidth;
            h11.setLayoutParams(new ViewGroup.LayoutParams(num != null ? num.intValue() : -1, -2));
        } else {
            h11 = LayoutInflater.from(parent.getContext()).inflate(this.layoutNavigationBlockOptimized, parent, false);
            Integer num2 = this.itemWidth;
            h11.setLayoutParams(new ViewGroup.LayoutParams(num2 != null ? num2.intValue() : -1, -2));
        }
        ItemNavigationBlockElementV2OptimizedBinding bind = ItemNavigationBlockElementV2OptimizedBinding.bind(h11);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new NavigationItemV2OptimizedViewHolder(bind, this.adapterCallback, this.containerViewLifecycleOwner);
    }

    public final void bind(@NotNull List<NavigationSliderV2VO.NavigationItemV2> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        if (this.list.get(position).getShouldBlur()) {
            return 2;
        }
        return !this.optimizeFF ? 1 : 3;
    }

    public final void setItemWidth(Integer num) {
        this.itemWidth = num;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof NavigationItemV2ViewHolder) {
            ((NavigationItemV2ViewHolder) holder).bind(this.list.get(position));
        } else if (holder instanceof NavigationItemV2OptimizedViewHolder) {
            ((NavigationItemV2OptimizedViewHolder) holder).bind(this.list.get(position));
        } else if (holder instanceof NavigationItemV2AdultViewHolder) {
            ((NavigationItemV2AdultViewHolder) holder).bind(this.list.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return viewType != 1 ? viewType != 3 ? createNavigationBlockAdultViewHolder(parent) : createNavigationBlockViewHolderOptimized(parent) : createNavigationBlockViewHolder(parent);
    }
}
