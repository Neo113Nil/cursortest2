package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.leaveatdoor;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.v3.holders.listed.gallery.GalleryHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.list.GalleryView;
import ru.ozon.app.android.orderdetails.databinding.OrderDeliveryDetailLeaveAtDoorBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/OrderDeliveryDetailLeaveAtDoorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/OrderDeliveryDetailLeaveAtDoorVO;", "Lru/ozon/app/android/orderdetails/databinding/OrderDeliveryDetailLeaveAtDoorBinding;", "binding", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/OrderDeliveryDetailLeaveAtDoorBinding;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/OrderDeliveryDetailLeaveAtDoorVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/OrderDeliveryDetailLeaveAtDoorBinding;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDeliveryDetailLeaveAtDoorViewHolder extends k<OrderDeliveryDetailLeaveAtDoorVO> {

    @NotNull
    private final OrderDeliveryDetailLeaveAtDoorBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderDeliveryDetailLeaveAtDoorViewHolder(@NotNull OrderDeliveryDetailLeaveAtDoorBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderDeliveryDetailLeaveAtDoorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        OrderDeliveryDetailLeaveAtDoorBinding orderDeliveryDetailLeaveAtDoorBinding = this.binding;
        orderDeliveryDetailLeaveAtDoorBinding.checkMarkIcon.setImageResource(item.getLeaveAtDoor().getIconId());
        orderDeliveryDetailLeaveAtDoorBinding.leaveAtDoorLabel.setText(item.getLeaveAtDoor().getTitle());
        if (item.getLeaveAtDoor().getGallery() != null) {
            GalleryView gallery = orderDeliveryDetailLeaveAtDoorBinding.gallery;
            Intrinsics.checkNotNullExpressionValue(gallery, "gallery");
            ViewExtKt.show(gallery);
            GalleryView gallery2 = orderDeliveryDetailLeaveAtDoorBinding.gallery;
            Intrinsics.checkNotNullExpressionValue(gallery2, "gallery");
            Unit unit = null;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            GalleryHolderKt.bind$default(gallery2, item.getLeaveAtDoor().getGallery(), null, 2, null);
            RecyclerView recyclerView = (RecyclerView) orderDeliveryDetailLeaveAtDoorBinding.gallery.findViewById(R$id.galleryImages);
            if (recyclerView != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.bottomMargin = 0;
                    marginLayoutParams = marginLayoutParams2;
                }
                recyclerView.setLayoutParams(marginLayoutParams);
                unit = Unit.f71690a;
            }
            if (unit != null) {
                return;
            }
        }
        GalleryView gallery3 = orderDeliveryDetailLeaveAtDoorBinding.gallery;
        Intrinsics.checkNotNullExpressionValue(gallery3, "gallery");
        ViewExtKt.gone(gallery3);
    }
}
