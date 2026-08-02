package ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.rv;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.R$id;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.Dp;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.HorizontalAutoScrollVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/rv/HorizontalAutoScrollRVAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO$ImageItem;", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/rv/HorizontalAutoScrollRVAdapter$ImageViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/rv/HorizontalAutoScrollRVAdapter$ImageViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/rv/HorizontalAutoScrollRVAdapter$ImageViewHolder;I)V", "ImageViewHolder", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HorizontalAutoScrollRVAdapter extends t<HorizontalAutoScrollVO.ImageItem, ImageViewHolder> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/rv/HorizontalAutoScrollRVAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/widget/ImageView;", "imageView", "<init>", "(Landroid/widget/ImageView;)V", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO$ImageItem;", "item", "", "bind", "(Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO$ImageItem;)V", "Landroid/widget/ImageView;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImageViewHolder extends RecyclerView.C {

        @NotNull
        private final ImageView imageView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageViewHolder(@NotNull ImageView imageView) {
            super(imageView);
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            this.imageView = imageView;
        }

        public final void bind(@NotNull HorizontalAutoScrollVO.ImageItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ImageView imageView = this.imageView;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = item.getWidth();
            imageView.setLayoutParams(layoutParams);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(imageView, styleParser.parseColor(context, item.getTintColorToken()));
            imageView.setImageBitmap(item.getBitmap());
        }
    }

    public HorizontalAutoScrollRVAdapter() {
        super(HorizontalAutoScrollRVDiffUtil.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ImageViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HorizontalAutoScrollVO.ImageItem imageItem = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(imageItem, "get(...)");
        holder.bind(imageItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ImageViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ImageView imageView = (ImageView) q.f64554a.i(N.b(ImageView.class), parent.getContext());
        if (imageView == null) {
            imageView = new ImageView(parent.getContext());
        }
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, Dp.INSTANCE.getDp14()));
        imageView.setId(R$id.horizontalAutoScroll_RecyclerView_Item);
        return new ImageViewHolder(imageView);
    }
}
