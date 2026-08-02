package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.ElementViewHolder;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.InvalidVH;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.PriceVH;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.TextVH;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.price.Price;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/ProductContentAdapter;", "Landroidx/recyclerview/widget/t;", "", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/vh/ElementViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/vh/ElementViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/vh/ElementViewHolder;I)V", "getItemViewType", "(I)I", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductContentAdapter extends t<Object, ElementViewHolder<? extends Object>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/ProductContentAdapter$Companion;", "", "<init>", "()V", "TEXT_VIEW_TYPE", "", "PRICE_VIEW_TYPE", "INVALID_TYPE", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ProductContentAdapter() {
        super(new i.d<Object>() { // from class: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.ProductContentAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(Object oldItem, Object newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(Object oldItem, Object newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getClass().getSimpleName().equals(newItem.getClass().getSimpleName());
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        Object obj = getCurrentList().get(position);
        if (obj instanceof AdvBannerVideoV2VO.TextWrapper) {
            return 1;
        }
        return obj instanceof Price ? 2 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ElementViewHolder<? extends Object> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bindElement(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ElementViewHolder<? extends Object> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new TextVH(new TextAtomView(context, null, 0, 6, null));
        }
        if (viewType != 2) {
            return new InvalidVH(new View(parent.getContext()));
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new PriceVH(new PriceView(context2, null, 0, 6, null));
    }
}
