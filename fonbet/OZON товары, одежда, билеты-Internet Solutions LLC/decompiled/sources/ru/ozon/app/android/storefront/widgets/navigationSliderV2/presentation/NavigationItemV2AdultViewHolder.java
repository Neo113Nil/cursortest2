package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.ui.AdultViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.ui.navslider.databinding.ItemNavigationBlockElementAdultV2Binding;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationItemV2AdultViewHolder;", "Lru/ozon/app/android/account/adult/ui/AdultViewHolder;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "adultDelegate", "Lru/ozon/app/android/storefront/ui/navslider/databinding/ItemNavigationBlockElementAdultV2Binding;", "binding", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "adapterCallback", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultDelegate;Lru/ozon/app/android/storefront/ui/navslider/databinding/ItemNavigationBlockElementAdultV2Binding;Lru/ozon/app/android/tools/ItemAdapterCallback;Landroidx/lifecycle/J;)V", "", "itemWidth", "", "setupRootView", "(I)V", "onAttach", "()V", "item", "bind", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;)V", "bindAdultContent", "onViewInVisibleBounds", "Lru/ozon/app/android/storefront/ui/navslider/databinding/ItemNavigationBlockElementAdultV2Binding;", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationItemV2AdultViewHolder extends AdultViewHolder<NavigationSliderV2VO.NavigationItemV2> {

    @NotNull
    private final ItemAdapterCallback<NavigationSliderV2VO.NavigationItemV2> adapterCallback;

    @NotNull
    private final ItemNavigationBlockElementAdultV2Binding binding;
    private NavigationSliderV2VO.NavigationItemV2 item;

    @NotNull
    private final J lifecycleOwner;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationItemV2AdultViewHolder(@NotNull AdultDelegate<NavigationSliderV2VO.NavigationItemV2> adultDelegate, @NotNull ItemNavigationBlockElementAdultV2Binding binding, @NotNull ItemAdapterCallback<? super NavigationSliderV2VO.NavigationItemV2> adapterCallback, @NotNull J lifecycleOwner) {
        super(r0, adultDelegate);
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(adapterCallback, "adapterCallback");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.adapterCallback = adapterCallback;
        this.lifecycleOwner = lifecycleOwner;
    }

    private final void setupRootView(int itemWidth) {
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.f(constraintLayout);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = itemWidth;
        constraintLayout.setLayoutParams(layoutParams);
        ViewExtKt.setOnClickListenerThrottle$default(constraintLayout, 0L, new NavigationItemV2AdultViewHolder$setupRootView$1$2(this), 1, null);
    }

    public void bind(@NotNull NavigationSliderV2VO.NavigationItemV2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((NavigationItemV2AdultViewHolder) item);
        this.item = item;
        ItemNavigationBlockElementAdultV2Binding itemNavigationBlockElementAdultV2Binding = this.binding;
        if (itemNavigationBlockElementAdultV2Binding.getConstraintLayout().getMeasuredWidth() != item.getItemWidth()) {
            setupRootView(item.getItemWidth());
        }
        TextView titleTv = itemNavigationBlockElementAdultV2Binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        NavigationSliderUtilsKt.configureText(titleTv, item);
    }

    @Override // ru.ozon.app.android.account.adult.ui.AdultViewHolder, jk0.j
    public void onAttach() {
        super.onAttach();
        this.lifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationItemV2AdultViewHolder$onAttach$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                J j11;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                NavigationItemV2AdultViewHolder.this.setLifecycleState(AbstractC5434v.b.DESTROYED);
                j11 = NavigationItemV2AdultViewHolder.this.lifecycleOwner;
                j11.getLifecycle().e(this);
            }
        });
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.adapterCallback.view(getAdapterPosition(), this.item);
    }

    @Override // ru.ozon.app.android.account.adult.ui.AdultViewHolder
    public void bindAdultContent(@NotNull NavigationSliderV2VO.NavigationItemV2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemNavigationBlockElementAdultV2Binding itemNavigationBlockElementAdultV2Binding = this.binding;
        if (item.getShouldBlur()) {
            ImageView categoryIv = itemNavigationBlockElementAdultV2Binding.categoryIv;
            Intrinsics.checkNotNullExpressionValue(categoryIv, "categoryIv");
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.hide(categoryIv);
            View overlayView = itemNavigationBlockElementAdultV2Binding.overlayView;
            Intrinsics.checkNotNullExpressionValue(overlayView, "overlayView");
            ViewExtKt.show(overlayView);
            ImageView adultEyeLogoIv = itemNavigationBlockElementAdultV2Binding.adultEyeLogoIv;
            Intrinsics.checkNotNullExpressionValue(adultEyeLogoIv, "adultEyeLogoIv");
            ViewExtKt.show(adultEyeLogoIv);
            return;
        }
        ImageView categoryIv2 = itemNavigationBlockElementAdultV2Binding.categoryIv;
        Intrinsics.checkNotNullExpressionValue(categoryIv2, "categoryIv");
        ViewExtKt.show(categoryIv2);
        ImageView categoryIv3 = itemNavigationBlockElementAdultV2Binding.categoryIv;
        Intrinsics.checkNotNullExpressionValue(categoryIv3, "categoryIv");
        ImageViewExtKt.load$default(categoryIv3, item.getImage(), null, null, null, null, false, null, 126, null);
        View overlayView2 = itemNavigationBlockElementAdultV2Binding.overlayView;
        Intrinsics.checkNotNullExpressionValue(overlayView2, "overlayView");
        ViewExtKt.gone(overlayView2);
        ImageView adultEyeLogoIv2 = itemNavigationBlockElementAdultV2Binding.adultEyeLogoIv;
        Intrinsics.checkNotNullExpressionValue(adultEyeLogoIv2, "adultEyeLogoIv");
        ViewExtKt.gone(adultEyeLogoIv2);
    }
}
