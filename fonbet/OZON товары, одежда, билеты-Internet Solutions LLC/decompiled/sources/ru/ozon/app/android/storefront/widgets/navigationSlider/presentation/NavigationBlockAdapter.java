package ru.ozon.app.android.storefront.widgets.navigationSlider.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultViewHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.ui.navslider.R$id;
import ru.ozon.app.android.storefront.ui.navslider.R$layout;
import ru.ozon.app.android.storefront.ui.navslider.databinding.ItemNavigationBlockElementBinding;
import ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationBlockAdapter;
import ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderVO;
import ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderWidgetViewHolder;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationBlockAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationBlockAdapter$NavigationItemViewHolder;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "categoryData", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationItem;", "adapterCallback", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/tools/ItemAdapterCallback;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationBlockAdapter$NavigationItemViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationBlockAdapter$NavigationItemViewHolder;I)V", "", "list", "bind", "(Ljava/util/List;)V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Landroidx/lifecycle/J;", "layoutNavigationBlockElement", "I", "Ljava/util/List;", "NavigationItemViewHolder", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationBlockAdapter extends LifecycleAdapter<NavigationItemViewHolder> {

    @NotNull
    private final ItemAdapterCallback<NavigationSliderVO.NavigationItem> adapterCallback;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final NavigationSliderWidgetViewHolder.CategoryData categoryData;

    @NotNull
    private final J containerViewLifecycleOwner;

    @NotNull
    private final FeatureChecker featureChecker;
    private final int layoutNavigationBlockElement;

    @NotNull
    private List<NavigationSliderVO.NavigationItem> list;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationBlockAdapter$NavigationItemViewHolder;", "Lru/ozon/app/android/account/adult/ui/AdultViewHolder;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationItem;", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "adultDelegate", "Lru/ozon/app/android/storefront/ui/navslider/databinding/ItemNavigationBlockElementBinding;", "binding", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "categoryData", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "adapterCallback", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultDelegate;Lru/ozon/app/android/storefront/ui/navslider/databinding/ItemNavigationBlockElementBinding;Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;Lru/ozon/app/android/tools/ItemAdapterCallback;Landroidx/lifecycle/J;)V", "", "onAttach", "()V", "item", "bind", "(Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationItem;)V", "bindAdultContent", "onViewInVisibleBounds", "Lru/ozon/app/android/storefront/ui/navslider/databinding/ItemNavigationBlockElementBinding;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Landroidx/lifecycle/J;", "", "singleLineHeight", "I", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationItem;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigationItemViewHolder extends AdultViewHolder<NavigationSliderVO.NavigationItem> {

        @NotNull
        private final ItemAdapterCallback<NavigationSliderVO.NavigationItem> adapterCallback;

        @NotNull
        private final ItemNavigationBlockElementBinding binding;

        @NotNull
        private final NavigationSliderWidgetViewHolder.CategoryData categoryData;
        private NavigationSliderVO.NavigationItem item;

        @NotNull
        private final J lifecycleOwner;
        private final int singleLineHeight;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public NavigationItemViewHolder(@NotNull AdultDelegate<NavigationSliderVO.NavigationItem> adultDelegate, @NotNull ItemNavigationBlockElementBinding binding, @NotNull NavigationSliderWidgetViewHolder.CategoryData categoryData, @NotNull ItemAdapterCallback<? super NavigationSliderVO.NavigationItem> adapterCallback, @NotNull J lifecycleOwner) {
            super(r0, adultDelegate);
            Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(categoryData, "categoryData");
            Intrinsics.checkNotNullParameter(adapterCallback, "adapterCallback");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            ConstraintLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
            this.categoryData = categoryData;
            this.adapterCallback = adapterCallback;
            this.lifecycleOwner = lifecycleOwner;
            this.singleLineHeight = ResourceExtKt.toPx(16);
            ConstraintLayout categoryCl = binding.categoryCl;
            Intrinsics.checkNotNullExpressionValue(categoryCl, "categoryCl");
            ViewGroup.LayoutParams layoutParams = categoryCl.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = categoryData.getItemWidth();
            categoryCl.setLayoutParams(layoutParams);
            d dVar = new d();
            dVar.p(binding.categoryCl);
            dVar.A(R$id.backgroundIv, categoryData.getBgImageSize());
            dVar.w(R$id.backgroundIv, categoryData.getBgImageSize());
            dVar.A(R$id.categoryIv, categoryData.getImageSize());
            dVar.w(R$id.categoryIv, categoryData.getImageSize());
            dVar.f(binding.categoryCl);
            ConstraintLayout constraintLayout2 = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            ViewExtKt.setOnClickListenerThrottle$default(constraintLayout2, 0L, new NavigationBlockAdapter$NavigationItemViewHolder$1$3(this), 1, null);
        }

        public void bind(@NotNull NavigationSliderVO.NavigationItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            super.bind((NavigationItemViewHolder) item);
            this.item = item;
            TextView textView = this.binding.titleTv;
            textView.setTextSize(0, item.getTextSize());
            textView.setHeight(item.getMaxLines() * this.singleLineHeight);
            textView.setMaxLines(item.getMaxLines());
            textView.setHyphenationFrequency(0);
            textView.setText(item.getTitle());
        }

        @Override // ru.ozon.app.android.account.adult.ui.AdultViewHolder, jk0.j
        public void onAttach() {
            super.onAttach();
            this.lifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationBlockAdapter$NavigationItemViewHolder$onAttach$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    J j11;
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    NavigationBlockAdapter.NavigationItemViewHolder.this.setLifecycleState(AbstractC5434v.b.DESTROYED);
                    j11 = NavigationBlockAdapter.NavigationItemViewHolder.this.lifecycleOwner;
                    j11.getLifecycle().e(this);
                }
            });
        }

        @Override // jk0.j, lk0.b
        public void onViewInVisibleBounds() {
            super.onViewInVisibleBounds();
            ItemAdapterCallback<NavigationSliderVO.NavigationItem> itemAdapterCallback = this.adapterCallback;
            int adapterPosition = getAdapterPosition();
            NavigationSliderVO.NavigationItem navigationItem = this.item;
            if (navigationItem != null) {
                itemAdapterCallback.view(adapterPosition, navigationItem);
            } else {
                Intrinsics.n("item");
                throw null;
            }
        }

        @Override // ru.ozon.app.android.account.adult.ui.AdultViewHolder
        public void bindAdultContent(@NotNull NavigationSliderVO.NavigationItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemNavigationBlockElementBinding itemNavigationBlockElementBinding = this.binding;
            if (item.getShouldBlur()) {
                View overlayView = itemNavigationBlockElementBinding.overlayView;
                Intrinsics.checkNotNullExpressionValue(overlayView, "overlayView");
                ViewExtKt.show(overlayView);
                ImageView adultEyeLogoIv = itemNavigationBlockElementBinding.adultEyeLogoIv;
                Intrinsics.checkNotNullExpressionValue(adultEyeLogoIv, "adultEyeLogoIv");
                ViewExtKt.show(adultEyeLogoIv);
                ImageView backgroundIv = itemNavigationBlockElementBinding.backgroundIv;
                Intrinsics.checkNotNullExpressionValue(backgroundIv, "backgroundIv");
                ViewExtKt.invisible(backgroundIv);
                return;
            }
            ImageView categoryIv = itemNavigationBlockElementBinding.categoryIv;
            Intrinsics.checkNotNullExpressionValue(categoryIv, "categoryIv");
            ImageViewExtKt.load$default(categoryIv, item.getImage(), null, null, null, null, false, null, 126, null);
            View overlayView2 = itemNavigationBlockElementBinding.overlayView;
            Intrinsics.checkNotNullExpressionValue(overlayView2, "overlayView");
            ViewExtKt.gone(overlayView2);
            ImageView adultEyeLogoIv2 = itemNavigationBlockElementBinding.adultEyeLogoIv;
            Intrinsics.checkNotNullExpressionValue(adultEyeLogoIv2, "adultEyeLogoIv");
            ViewExtKt.gone(adultEyeLogoIv2);
            ImageView backgroundIv2 = itemNavigationBlockElementBinding.backgroundIv;
            Intrinsics.checkNotNullExpressionValue(backgroundIv2, "backgroundIv");
            ImageViewExtKt.loadImageOrInvisible(backgroundIv2, item.getBackgroundImage());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationBlockAdapter(@NotNull AdultHandler adultHandler, @NotNull NavigationSliderWidgetViewHolder.CategoryData categoryData, @NotNull FeatureChecker featureChecker, @NotNull ItemAdapterCallback<? super NavigationSliderVO.NavigationItem> adapterCallback, @NotNull J containerViewLifecycleOwner) {
        super(containerViewLifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(categoryData, "categoryData");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(adapterCallback, "adapterCallback");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        this.adultHandler = adultHandler;
        this.categoryData = categoryData;
        this.featureChecker = featureChecker;
        this.adapterCallback = adapterCallback;
        this.containerViewLifecycleOwner = containerViewLifecycleOwner;
        this.layoutNavigationBlockElement = R$layout.item_navigation_block_element;
        this.list = K.f71697a;
    }

    public final void bind(@NotNull List<NavigationSliderVO.NavigationItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull NavigationItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.list.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public NavigationItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View h11 = q.f64554a.h(this.layoutNavigationBlockElement);
        if (h11 != null) {
            h11.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        } else {
            h11 = null;
        }
        if (h11 == null) {
            h11 = LayoutInflater.from(parent.getContext()).inflate(this.layoutNavigationBlockElement, parent, false);
        }
        ItemNavigationBlockElementBinding bind = ItemNavigationBlockElementBinding.bind(h11);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new NavigationItemViewHolder(new AdultDelegate(this.adultHandler, this.featureChecker), bind, this.categoryData, this.adapterCallback, this.containerViewLifecycleOwner);
    }
}
