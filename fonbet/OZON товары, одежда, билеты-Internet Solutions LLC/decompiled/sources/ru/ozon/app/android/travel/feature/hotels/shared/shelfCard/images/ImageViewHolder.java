package ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.images;

import GI.c;
import com.google.android.material.imageview.ShapeableImageView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;
import y7.k;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/images/ImageViewHolder;", "Ljk0/j;", "Lcom/google/android/material/imageview/ShapeableImageView;", "view", "Lkotlin/Function0;", "", "onImageClick", "<init>", "(Lcom/google/android/material/imageview/ShapeableImageView;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Image;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Image;)V", "Lcom/google/android/material/imageview/ShapeableImageView;", "", "cachedCornerRadius", "Ljava/lang/Float;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageViewHolder extends j {
    private Float cachedCornerRadius;

    @NotNull
    private final ShapeableImageView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewHolder(@NotNull ShapeableImageView view, @NotNull Function0<Unit> onImageClick) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onImageClick, "onImageClick");
        this.view = view;
        view.setOnClickListener(new c(onImageClick, 2));
    }

    public final void bind(@NotNull ShelfCardVO.Image item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!Intrinsics.b(this.cachedCornerRadius, item.getCornerRadius())) {
            this.view.setShapeAppearanceModel(new k().o(item.getCornerRadius()));
            this.cachedCornerRadius = Float.valueOf(item.getCornerRadius());
        }
        ImageViewExtKt.load$default(this.view, item.getUrl(), null, null, null, null, false, null, 126, null);
    }
}
