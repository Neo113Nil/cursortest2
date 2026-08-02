package ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.carousel;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.databinding.ItemHorizontalSplitCarouselBinding;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2VO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/carousel/CarouselAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/carousel/CarouselVH;", "", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO$Split$Horizontal$ProductImage;", "urls", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/carousel/CarouselVH;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/carousel/CarouselVH;I)V", "imagesUrls", "Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CarouselAdapter extends RecyclerView.g<CarouselVH> {

    @NotNull
    private List<SplitDetailV2VO.Split.Horizontal.ProductImage> imagesUrls;

    public CarouselAdapter(@NotNull List<SplitDetailV2VO.Split.Horizontal.ProductImage> urls) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        this.imagesUrls = urls;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.imagesUrls.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CarouselVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.imagesUrls.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CarouselVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemHorizontalSplitCarouselBinding inflate = ItemHorizontalSplitCarouselBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new CarouselVH(inflate);
    }
}
