package ru.ozon.app.android.cart.cartSplitV2.accessories;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesSkeletonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesSkeletonAdapter$AccessoriesSkeletonItemVH;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesSkeletonAdapter$AccessoriesSkeletonItemVH;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesSkeletonAdapter$AccessoriesSkeletonItemVH;I)V", "Landroid/graphics/drawable/GradientDrawable;", "backgroundWithBorder$delegate", "LSc/j;", "getBackgroundWithBorder", "()Landroid/graphics/drawable/GradientDrawable;", "backgroundWithBorder", "Companion", "AccessoriesSkeletonItemVH", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccessoriesSkeletonAdapter extends RecyclerView.g<AccessoriesSkeletonItemVH> {

    /* renamed from: backgroundWithBorder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundWithBorder;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float RADIUS_20 = UiExtKt.toPxF(20);
    private static final float RADIUS_16 = UiExtKt.toPxF(16);
    private static final float RADIUS_8 = UiExtKt.toPxF(8);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesSkeletonAdapter$AccessoriesSkeletonItemVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding;", "binding", "<init>", "(Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding;)V", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding;", "getBinding", "()Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AccessoriesSkeletonItemVH extends RecyclerView.C {

        @NotNull
        private final WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccessoriesSkeletonItemVH(@NotNull WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding binding) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        @NotNull
        public final WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding getBinding() {
            return this.binding;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesSkeletonAdapter$Companion;", "", "<init>", "()V", "RADIUS_20", "", "RADIUS_16", "RADIUS_8", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AccessoriesSkeletonAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundWithBorder = LazyUtilsKt.unsafeLazy(new AccessoriesSkeletonAdapter$backgroundWithBorder$2(context));
    }

    private final GradientDrawable getBackgroundWithBorder() {
        return (GradientDrawable) this.backgroundWithBorder.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AccessoriesSkeletonItemVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AccessoriesSkeletonItemVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding inflate = WidgetCartSplitV2ItemAccessoriesSkeletonItemVhBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        AccessoriesSkeletonItemVH accessoriesSkeletonItemVH = new AccessoriesSkeletonItemVH(inflate);
        accessoriesSkeletonItemVH.itemView.setBackground(getBackgroundWithBorder());
        View view = accessoriesSkeletonItemVH.getBinding().imagePlaceHolder;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackground(AccessoriesSkeletonAdapterKt.createFillSkeletonBackground(context, RADIUS_16));
        View view2 = accessoriesSkeletonItemVH.getBinding().line1PlaceHolder;
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float f7 = RADIUS_8;
        view2.setBackground(AccessoriesSkeletonAdapterKt.createFillSkeletonBackground(context2, f7));
        View view3 = accessoriesSkeletonItemVH.getBinding().line2PlaceHolder;
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        view3.setBackground(AccessoriesSkeletonAdapterKt.createFillSkeletonBackground(context3, f7));
        View view4 = accessoriesSkeletonItemVH.getBinding().line3PlaceHolder;
        Context context4 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        view4.setBackground(AccessoriesSkeletonAdapterKt.createFillSkeletonBackground(context4, f7));
        View view5 = accessoriesSkeletonItemVH.getBinding().buttonPlaceHolder;
        Context context5 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        view5.setBackground(AccessoriesSkeletonAdapterKt.createFillSkeletonBackground(context5, f7));
        return accessoriesSkeletonItemVH;
    }
}
