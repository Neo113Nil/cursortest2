package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item;

import Cm.e;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/UpdateCarousel;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/UpdateComponent;", "", "groupCarouselId", "", "componentId", "itemId", "", "isSelected", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getGroupCarouselId", "Ljava/lang/String;", "getComponentId", "getItemId", "Z", "()Z", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UpdateCarousel extends UpdateComponent {

    @NotNull
    private final String componentId;
    private final int groupCarouselId;
    private final boolean isSelected;

    @NotNull
    private final String itemId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCarousel(int i11, @NotNull String componentId, @NotNull String itemId, boolean z11) {
        super(i11, null);
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.groupCarouselId = i11;
        this.componentId = componentId;
        this.itemId = itemId;
        this.isSelected = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCarousel)) {
            return false;
        }
        UpdateCarousel updateCarousel = (UpdateCarousel) other;
        return this.groupCarouselId == updateCarousel.groupCarouselId && Intrinsics.d(this.componentId, updateCarousel.componentId) && Intrinsics.d(this.itemId, updateCarousel.itemId) && this.isSelected == updateCarousel.isSelected;
    }

    @NotNull
    public final String getComponentId() {
        return this.componentId;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + g.a(g.a(Integer.hashCode(this.groupCarouselId) * 31, 31, this.componentId), 31, this.itemId);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        int i11 = this.groupCarouselId;
        String str = this.componentId;
        String str2 = this.itemId;
        boolean z11 = this.isSelected;
        StringBuilder g10 = e.g(i11, "UpdateCarousel(groupCarouselId=", ", componentId=", str, ", itemId=");
        g10.append(str2);
        g10.append(", isSelected=");
        g10.append(z11);
        g10.append(")");
        return g10.toString();
    }
}
