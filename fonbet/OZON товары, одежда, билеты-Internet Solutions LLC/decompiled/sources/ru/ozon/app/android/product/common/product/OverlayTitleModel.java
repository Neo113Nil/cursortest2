package ru.ozon.app.android.product.common.product;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.overlaytitle.OverlayTitleView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView$SizeMode;", "size", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView$SizeMode;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView$SizeMode;", "getSize", "()Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView$SizeMode;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OverlayTitleModel {

    @NotNull
    private final OverlayTitleView.SizeMode size;

    @NotNull
    private final String title;

    public OverlayTitleModel(@NotNull String title, @NotNull OverlayTitleView.SizeMode size) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(size, "size");
        this.title = title;
        this.size = size;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayTitleModel)) {
            return false;
        }
        OverlayTitleModel overlayTitleModel = (OverlayTitleModel) other;
        return Intrinsics.d(this.title, overlayTitleModel.title) && this.size == overlayTitleModel.size;
    }

    @NotNull
    public final OverlayTitleView.SizeMode getSize() {
        return this.size;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.size.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "OverlayTitleModel(title=" + this.title + ", size=" + this.size + ")";
    }
}
