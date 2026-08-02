package ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.databinding.WidgetDeliveryReviewHeaderBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation.photos.HeaderItemAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/DeliveryReviewHeaderWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/DeliveryReviewHeaderVO;", "Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewHeaderBinding;", "binding", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewHeaderBinding;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/DeliveryReviewHeaderVO;Ll20/d;)V", "Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewHeaderBinding;", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItemAdapter;", "headerItemAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItemAdapter;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryReviewHeaderWidgetViewHolder extends k<DeliveryReviewHeaderVO> {

    @NotNull
    private final WidgetDeliveryReviewHeaderBinding binding;

    @NotNull
    private final HeaderItemAdapter headerItemAdapter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeliveryReviewHeaderWidgetViewHolder(@NotNull WidgetDeliveryReviewHeaderBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        HeaderItemAdapter headerItemAdapter = new HeaderItemAdapter();
        this.headerItemAdapter = headerItemAdapter;
        binding.photosRv.setAdapter(headerItemAdapter);
        binding.photosRv.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryReviewHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetDeliveryReviewHeaderBinding widgetDeliveryReviewHeaderBinding = this.binding;
        widgetDeliveryReviewHeaderBinding.titleTv.setText(item.getTitle());
        TextView infoTv = widgetDeliveryReviewHeaderBinding.infoTv;
        Intrinsics.checkNotNullExpressionValue(infoTv, "infoTv");
        TextViewExtKt.setTextOrGone(infoTv, item.getInfo());
        RecyclerView photosRv = widgetDeliveryReviewHeaderBinding.photosRv;
        Intrinsics.checkNotNullExpressionValue(photosRv, "photosRv");
        ViewExtKt.showOrGoneByPresence(photosRv, item.getHeaderItems());
        this.headerItemAdapter.submitList(item.getHeaderItems());
    }
}
