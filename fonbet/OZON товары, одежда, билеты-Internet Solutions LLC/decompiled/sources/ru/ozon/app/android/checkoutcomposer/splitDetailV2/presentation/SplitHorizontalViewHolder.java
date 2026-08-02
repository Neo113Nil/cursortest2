package ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.databinding.ItemSplitDetailHorizontalBinding;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2VO;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.carousel.CarouselAdapter;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.recycler.RecyclerViewExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitHorizontalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkout/databinding/ItemSplitDetailHorizontalBinding;", "binding", "<init>", "(Lru/ozon/app/android/checkout/databinding/ItemSplitDetailHorizontalBinding;)V", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Horizontal;", "item", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Horizontal;)V", "Lru/ozon/app/android/checkout/databinding/ItemSplitDetailHorizontalBinding;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitHorizontalViewHolder extends RecyclerView.C {

    @NotNull
    private final ItemSplitDetailHorizontalBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitHorizontalViewHolder(@NotNull ItemSplitDetailHorizontalBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bind(@NotNull SplitDetailV2VO.Split.Horizontal item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemSplitDetailHorizontalBinding itemSplitDetailHorizontalBinding = this.binding;
        SingleAtom.bind$default(itemSplitDetailHorizontalBinding.titleSA, item.getTitle(), false, 2, null);
        itemSplitDetailHorizontalBinding.carouselRV.setAdapter(new CarouselAdapter(item.getCarousel()));
        RecyclerView.o layoutManager = itemSplitDetailHorizontalBinding.carouselRV.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            RecyclerView carouselRV = itemSplitDetailHorizontalBinding.carouselRV;
            Intrinsics.checkNotNullExpressionValue(carouselRV, "carouselRV");
            Context context = itemSplitDetailHorizontalBinding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            RecyclerViewExtKt.setupSeparatorItemDecoration$default(carouselRV, context, R$drawable.divider_transparent, ((LinearLayoutManager) layoutManager).getOrientation(), false, 8, null);
        }
    }
}
