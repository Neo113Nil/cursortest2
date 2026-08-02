package ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.posting.items;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.posting.PostingVO;
import ru.ozon.app.android.cs_orders.databinding.WidgetCancelPostingsV2ItemBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/posting/items/ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/cs_orders/databinding/WidgetCancelPostingsV2ItemBinding;", "binding", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetCancelPostingsV2ItemBinding;)V", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/posting/PostingVO$ItemVO;", "item", "", "bind", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/posting/PostingVO$ItemVO;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetCancelPostingsV2ItemBinding;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemViewHolder extends RecyclerView.C {

    @NotNull
    private final WidgetCancelPostingsV2ItemBinding binding;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int cornerRadius = ResourceExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/posting/items/ItemViewHolder$Companion;", "", "<init>", "()V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemViewHolder(@NotNull WidgetCancelPostingsV2ItemBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bind(@NotNull PostingVO.ItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetCancelPostingsV2ItemBinding widgetCancelPostingsV2ItemBinding = this.binding;
        AppCompatImageView imageIv = widgetCancelPostingsV2ItemBinding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ImageViewExtKt.load$default(imageIv, item.getImage(), C7714v.b0(ImageTransformation.CenterCrop.INSTANCE, new ImageTransformation.RoundedCorners(cornerRadius, null, 2, null)), null, null, null, false, null, 124, null);
        widgetCancelPostingsV2ItemBinding.subtitleTv.setText(item.getSubtitle());
    }
}
