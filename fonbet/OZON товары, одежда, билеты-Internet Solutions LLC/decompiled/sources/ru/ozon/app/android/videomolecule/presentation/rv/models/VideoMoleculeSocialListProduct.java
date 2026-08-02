package ru.ozon.app.android.videomolecule.presentation.rv.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.app.android.videomolecule.presentation.rv.viewholders.socialporduct.SocialProductViewHolder;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeSocialListProduct;", "Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeBottomContentModel;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "productListDTO", "", "widgetId", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "getProductListDTO", "()Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "J", "getWidgetId", "()J", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoMoleculeSocialListProduct extends VideoMoleculeBottomContentModel {

    @NotNull
    private final SocialProductListDTO productListDTO;
    private final long widgetId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeSocialListProduct(@NotNull SocialProductListDTO productListDTO, long j11) {
        super(SocialProductViewHolder.INSTANCE.getViewType(), j11);
        Intrinsics.checkNotNullParameter(productListDTO, "productListDTO");
        this.productListDTO = productListDTO;
        this.widgetId = j11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoMoleculeSocialListProduct)) {
            return false;
        }
        VideoMoleculeSocialListProduct videoMoleculeSocialListProduct = (VideoMoleculeSocialListProduct) other;
        return Intrinsics.d(this.productListDTO, videoMoleculeSocialListProduct.productListDTO) && this.widgetId == videoMoleculeSocialListProduct.widgetId;
    }

    @NotNull
    public final SocialProductListDTO getProductListDTO() {
        return this.productListDTO;
    }

    public long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return Long.hashCode(this.widgetId) + (this.productListDTO.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VideoMoleculeSocialListProduct(productListDTO=" + this.productListDTO + ", widgetId=" + this.widgetId + ")";
    }
}
