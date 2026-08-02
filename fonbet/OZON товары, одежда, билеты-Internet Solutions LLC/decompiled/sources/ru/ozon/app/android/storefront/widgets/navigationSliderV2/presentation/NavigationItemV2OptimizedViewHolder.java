package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.ui.navslider.databinding.ItemNavigationBlockElementV2OptimizedBinding;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationItemV2OptimizedViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/storefront/ui/navslider/databinding/ItemNavigationBlockElementV2OptimizedBinding;", "binding", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "adapterCallback", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/storefront/ui/navslider/databinding/ItemNavigationBlockElementV2OptimizedBinding;Lru/ozon/app/android/tools/ItemAdapterCallback;Landroidx/lifecycle/J;)V", "", "itemWidth", "", "setupRootView", "(I)V", "onAttach", "()V", "onViewInVisibleBounds", "item", "bind", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;)V", "Lru/ozon/app/android/storefront/ui/navslider/databinding/ItemNavigationBlockElementV2OptimizedBinding;", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationItemV2OptimizedViewHolder extends j {

    @NotNull
    private final ItemAdapterCallback<NavigationSliderV2VO.NavigationItemV2> adapterCallback;

    @NotNull
    private final ItemNavigationBlockElementV2OptimizedBinding binding;
    private NavigationSliderV2VO.NavigationItemV2 item;

    @NotNull
    private final J lifecycleOwner;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationItemV2OptimizedViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            NavigationItemV2OptimizedViewHolder.this.adapterCallback.click(NavigationItemV2OptimizedViewHolder.this.getAdapterPosition(), NavigationItemV2OptimizedViewHolder.this.item);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationItemV2OptimizedViewHolder(@NotNull ItemNavigationBlockElementV2OptimizedBinding binding, @NotNull ItemAdapterCallback<? super NavigationSliderV2VO.NavigationItemV2> adapterCallback, @NotNull J lifecycleOwner) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(adapterCallback, "adapterCallback");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.adapterCallback = adapterCallback;
        this.lifecycleOwner = lifecycleOwner;
        LinearLayout constraintLayout2 = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        ViewExtKt.setOnClickListenerThrottle$default(constraintLayout2, 0L, new AnonymousClass1(), 1, null);
    }

    private final void setupRootView(int itemWidth) {
        LinearLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.f(constraintLayout);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = itemWidth;
        constraintLayout.setLayoutParams(layoutParams);
    }

    public final void bind(@NotNull NavigationSliderV2VO.NavigationItemV2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        ItemNavigationBlockElementV2OptimizedBinding itemNavigationBlockElementV2OptimizedBinding = this.binding;
        if (itemNavigationBlockElementV2OptimizedBinding.getConstraintLayout().getMeasuredWidth() != item.getItemWidth() || itemNavigationBlockElementV2OptimizedBinding.getConstraintLayout().getLayoutParams().width != item.getItemWidth()) {
            setupRootView(item.getItemWidth());
        }
        TextView titleTv = itemNavigationBlockElementV2OptimizedBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        NavigationSliderUtilsKt.configureText(titleTv, item);
        ImageView categoryIv = itemNavigationBlockElementV2OptimizedBinding.categoryIv;
        Intrinsics.checkNotNullExpressionValue(categoryIv, "categoryIv");
        ImageViewExtKt.load$default(categoryIv, item.getImage(), null, null, null, null, false, null, 126, null);
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        this.lifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationItemV2OptimizedViewHolder$onAttach$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                J j11;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                NavigationItemV2OptimizedViewHolder.this.setLifecycleState(AbstractC5434v.b.DESTROYED);
                j11 = NavigationItemV2OptimizedViewHolder.this.lifecycleOwner;
                j11.getLifecycle().e(this);
            }
        });
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.adapterCallback.view(getAdapterPosition(), this.item);
    }
}
