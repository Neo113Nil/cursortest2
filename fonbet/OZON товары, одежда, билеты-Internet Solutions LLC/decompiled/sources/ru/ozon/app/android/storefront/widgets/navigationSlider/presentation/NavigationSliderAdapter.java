package ru.ozon.app.android.storefront.widgets.navigationSlider.presentation;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import gk0.q;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storefront.ui.navslider.R$layout;
import ru.ozon.app.android.storefront.ui.navslider.databinding.ItemNavigationBlockBinding;
import ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderAdapter;
import ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderVO;
import ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderWidgetViewHolder;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import ru.ozon.app.android.uikit.R$dimen;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0002%&B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderAdapter;", "Landroidx/recyclerview/widget/t;", "", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationItem;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderAdapter$NavigationSliderViewHolder;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "adapterCallback", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/tools/ItemAdapterCallback;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderAdapter$NavigationSliderViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderAdapter$NavigationSliderViewHolder;I)V", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "categoryData", "setCategoryData", "(Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;)V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Landroidx/lifecycle/J;", "layoutNavigationBlock", "I", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "NavigationSliderViewHolder", "NavigationDiffCallback", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderAdapter extends t<List<? extends NavigationSliderVO.NavigationItem>, NavigationSliderViewHolder> {

    @NotNull
    private final ItemAdapterCallback<NavigationSliderVO.NavigationItem> adapterCallback;

    @NotNull
    private final AdultHandler adultHandler;
    private NavigationSliderWidgetViewHolder.CategoryData categoryData;

    @NotNull
    private final J containerViewLifecycleOwner;

    @NotNull
    private final FeatureChecker featureChecker;
    private final int layoutNavigationBlock;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderAdapter$NavigationDiffCallback;", "Landroidx/recyclerview/widget/i$d;", "", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Ljava/util/List;Ljava/util/List;)Z", "areContentsTheSame", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigationDiffCallback extends i.d<List<? extends NavigationSliderVO.NavigationItem>> {
        @Override // androidx.recyclerview.widget.i.d
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(List<? extends NavigationSliderVO.NavigationItem> list, List<? extends NavigationSliderVO.NavigationItem> list2) {
            return areContentsTheSame2((List<NavigationSliderVO.NavigationItem>) list, (List<NavigationSliderVO.NavigationItem>) list2);
        }

        @Override // androidx.recyclerview.widget.i.d
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(List<? extends NavigationSliderVO.NavigationItem> list, List<? extends NavigationSliderVO.NavigationItem> list2) {
            return areItemsTheSame2((List<NavigationSliderVO.NavigationItem>) list, (List<NavigationSliderVO.NavigationItem>) list2);
        }

        /* renamed from: areContentsTheSame, reason: avoid collision after fix types in other method */
        public boolean areContentsTheSame2(@NotNull List<NavigationSliderVO.NavigationItem> oldItem, @NotNull List<NavigationSliderVO.NavigationItem> newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        /* renamed from: areItemsTheSame, reason: avoid collision after fix types in other method */
        public boolean areItemsTheSame2(@NotNull List<NavigationSliderVO.NavigationItem> oldItem, @NotNull List<NavigationSliderVO.NavigationItem> newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderAdapter$NavigationSliderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/storefront/ui/navslider/databinding/ItemNavigationBlockBinding;", "binding", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "categoryData", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationItem;", "adapterCallback", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "<init>", "(Lru/ozon/app/android/storefront/ui/navslider/databinding/ItemNavigationBlockBinding;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/tools/ItemAdapterCallback;Landroidx/lifecycle/J;)V", "", "item", "", "bind", "(Ljava/util/List;)V", "Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationBlockAdapter;", "navigationBlockAdapter", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationBlockAdapter;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "", "dp8", "I", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigationSliderViewHolder extends RecyclerView.C {
        private final Context context;
        private final int dp8;
        private List<NavigationSliderVO.NavigationItem> item;
        private NavigationBlockAdapter navigationBlockAdapter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigationSliderViewHolder(@NotNull ItemNavigationBlockBinding binding, @NotNull AdultHandler adultHandler, @NotNull NavigationSliderWidgetViewHolder.CategoryData categoryData, @NotNull FeatureChecker featureChecker, @NotNull final ItemAdapterCallback<? super NavigationSliderVO.NavigationItem> adapterCallback, @NotNull J containerViewLifecycleOwner) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
            Intrinsics.checkNotNullParameter(categoryData, "categoryData");
            Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
            Intrinsics.checkNotNullParameter(adapterCallback, "adapterCallback");
            Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
            Context context = binding.getConstraintLayout().getContext();
            this.context = context;
            this.dp8 = context.getResources().getDimensionPixelSize(R$dimen.margin);
            final int columns = categoryData.getColumns();
            final int rows = categoryData.getRows();
            this.navigationBlockAdapter = new NavigationBlockAdapter(adultHandler, categoryData, featureChecker, new ItemAdapterCallback<NavigationSliderVO.NavigationItem>() { // from class: ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderAdapter.NavigationSliderViewHolder.1
                @Override // ru.ozon.app.android.tools.ItemAdapterCallback
                public void click(int position, NavigationSliderVO.NavigationItem item) {
                    adapterCallback.click((this.getAdapterPosition() * rows * columns) + position, item);
                }

                @Override // ru.ozon.app.android.tools.ItemAdapterCallback
                public void view(int position, NavigationSliderVO.NavigationItem item) {
                    adapterCallback.view((this.getAdapterPosition() * rows * columns) + position, item);
                }
            }, containerViewLifecycleOwner);
            RecyclerView recyclerView = binding.naviBlockRv;
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), columns));
            recyclerView.setAdapter(this.navigationBlockAdapter);
            recyclerView.addItemDecoration(new RecyclerView.n() { // from class: ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderAdapter$NavigationSliderViewHolder$2$1
                @Override // androidx.recyclerview.widget.RecyclerView.n
                public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.A state) {
                    int i11;
                    Intrinsics.checkNotNullParameter(outRect, "outRect");
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(state, "state");
                    i11 = NavigationSliderAdapter.NavigationSliderViewHolder.this.dp8;
                    outRect.top = i11;
                }
            });
            recyclerView.setNestedScrollingEnabled(false);
        }

        public final void bind(@NotNull List<NavigationSliderVO.NavigationItem> item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            NavigationBlockAdapter navigationBlockAdapter = this.navigationBlockAdapter;
            if (navigationBlockAdapter != null) {
                navigationBlockAdapter.bind(item);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationSliderAdapter(@NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker, @NotNull ItemAdapterCallback<? super NavigationSliderVO.NavigationItem> adapterCallback, @NotNull J containerViewLifecycleOwner) {
        super(new NavigationDiffCallback());
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(adapterCallback, "adapterCallback");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        this.adultHandler = adultHandler;
        this.featureChecker = featureChecker;
        this.adapterCallback = adapterCallback;
        this.containerViewLifecycleOwner = containerViewLifecycleOwner;
        this.layoutNavigationBlock = R$layout.item_navigation_block;
    }

    public final void setCategoryData(@NotNull NavigationSliderWidgetViewHolder.CategoryData categoryData) {
        Intrinsics.checkNotNullParameter(categoryData, "categoryData");
        this.categoryData = categoryData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull NavigationSliderViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Collection item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind((List) item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public NavigationSliderViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View h11 = q.f64554a.h(this.layoutNavigationBlock);
        if (h11 != null) {
            h11.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        } else {
            h11 = null;
        }
        if (h11 == null) {
            h11 = LayoutInflater.from(parent.getContext()).inflate(this.layoutNavigationBlock, parent, false);
        }
        ItemNavigationBlockBinding bind = ItemNavigationBlockBinding.bind(h11);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        AdultHandler adultHandler = this.adultHandler;
        NavigationSliderWidgetViewHolder.CategoryData categoryData = this.categoryData;
        if (categoryData != null) {
            return new NavigationSliderViewHolder(bind, adultHandler, categoryData, this.featureChecker, this.adapterCallback, this.containerViewLifecycleOwner);
        }
        Intrinsics.n("categoryData");
        throw null;
    }
}
