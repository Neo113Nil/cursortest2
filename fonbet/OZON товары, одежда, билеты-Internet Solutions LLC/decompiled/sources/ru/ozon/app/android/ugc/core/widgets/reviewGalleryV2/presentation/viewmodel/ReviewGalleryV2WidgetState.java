package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel;

import Kk.C3532b;
import Pk0.a;
import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJj\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u000b\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2WidgetState;", "", "", "orientation", "", "hasAudio", "viewsIsVisible", "hasProduct", "hasProductsContainer", "hasFreshBadge", "hasMuteButton", "isCurrentWidget", "hasCloseButton", "<init>", "(IZZZZZZZZ)V", "copy", "(IZZZZZZZZ)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/viewmodel/ReviewGalleryV2WidgetState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getOrientation", "Z", "getHasAudio", "()Z", "getViewsIsVisible", "getHasProduct", "getHasProductsContainer", "getHasFreshBadge", "getHasMuteButton", "getHasCloseButton", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewGalleryV2WidgetState {
    private final boolean hasAudio;
    private final boolean hasCloseButton;
    private final boolean hasFreshBadge;
    private final boolean hasMuteButton;
    private final boolean hasProduct;
    private final boolean hasProductsContainer;
    private final boolean isCurrentWidget;
    private final int orientation;
    private final boolean viewsIsVisible;

    public ReviewGalleryV2WidgetState(int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.orientation = i11;
        this.hasAudio = z11;
        this.viewsIsVisible = z12;
        this.hasProduct = z13;
        this.hasProductsContainer = z14;
        this.hasFreshBadge = z15;
        this.hasMuteButton = z16;
        this.isCurrentWidget = z17;
        this.hasCloseButton = z18;
    }

    public static /* synthetic */ ReviewGalleryV2WidgetState copy$default(ReviewGalleryV2WidgetState reviewGalleryV2WidgetState, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = reviewGalleryV2WidgetState.orientation;
        }
        if ((i12 & 2) != 0) {
            z11 = reviewGalleryV2WidgetState.hasAudio;
        }
        if ((i12 & 4) != 0) {
            z12 = reviewGalleryV2WidgetState.viewsIsVisible;
        }
        if ((i12 & 8) != 0) {
            z13 = reviewGalleryV2WidgetState.hasProduct;
        }
        if ((i12 & 16) != 0) {
            z14 = reviewGalleryV2WidgetState.hasProductsContainer;
        }
        if ((i12 & 32) != 0) {
            z15 = reviewGalleryV2WidgetState.hasFreshBadge;
        }
        if ((i12 & 64) != 0) {
            z16 = reviewGalleryV2WidgetState.hasMuteButton;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z17 = reviewGalleryV2WidgetState.isCurrentWidget;
        }
        if ((i12 & 256) != 0) {
            z18 = reviewGalleryV2WidgetState.hasCloseButton;
        }
        boolean z19 = z17;
        boolean z21 = z18;
        boolean z22 = z15;
        boolean z23 = z16;
        boolean z24 = z14;
        boolean z25 = z12;
        return reviewGalleryV2WidgetState.copy(i11, z11, z25, z13, z24, z22, z23, z19, z21);
    }

    @NotNull
    public final ReviewGalleryV2WidgetState copy(int orientation, boolean hasAudio, boolean viewsIsVisible, boolean hasProduct, boolean hasProductsContainer, boolean hasFreshBadge, boolean hasMuteButton, boolean isCurrentWidget, boolean hasCloseButton) {
        return new ReviewGalleryV2WidgetState(orientation, hasAudio, viewsIsVisible, hasProduct, hasProductsContainer, hasFreshBadge, hasMuteButton, isCurrentWidget, hasCloseButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryV2WidgetState)) {
            return false;
        }
        ReviewGalleryV2WidgetState reviewGalleryV2WidgetState = (ReviewGalleryV2WidgetState) other;
        return this.orientation == reviewGalleryV2WidgetState.orientation && this.hasAudio == reviewGalleryV2WidgetState.hasAudio && this.viewsIsVisible == reviewGalleryV2WidgetState.viewsIsVisible && this.hasProduct == reviewGalleryV2WidgetState.hasProduct && this.hasProductsContainer == reviewGalleryV2WidgetState.hasProductsContainer && this.hasFreshBadge == reviewGalleryV2WidgetState.hasFreshBadge && this.hasMuteButton == reviewGalleryV2WidgetState.hasMuteButton && this.isCurrentWidget == reviewGalleryV2WidgetState.isCurrentWidget && this.hasCloseButton == reviewGalleryV2WidgetState.hasCloseButton;
    }

    public final boolean getHasCloseButton() {
        return this.hasCloseButton;
    }

    public final boolean getHasFreshBadge() {
        return this.hasFreshBadge;
    }

    public final boolean getHasProduct() {
        return this.hasProduct;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final boolean getViewsIsVisible() {
        return this.viewsIsVisible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasCloseButton) + C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(Integer.hashCode(this.orientation) * 31, 31, this.hasAudio), 31, this.viewsIsVisible), 31, this.hasProduct), 31, this.hasProductsContainer), 31, this.hasFreshBadge), 31, this.hasMuteButton), 31, this.isCurrentWidget);
    }

    /* renamed from: isCurrentWidget, reason: from getter */
    public final boolean getIsCurrentWidget() {
        return this.isCurrentWidget;
    }

    @NotNull
    public String toString() {
        int i11 = this.orientation;
        boolean z11 = this.hasAudio;
        boolean z12 = this.viewsIsVisible;
        boolean z13 = this.hasProduct;
        boolean z14 = this.hasProductsContainer;
        boolean z15 = this.hasFreshBadge;
        boolean z16 = this.hasMuteButton;
        boolean z17 = this.isCurrentWidget;
        boolean z18 = this.hasCloseButton;
        StringBuilder sb2 = new StringBuilder("ReviewGalleryV2WidgetState(orientation=");
        sb2.append(i11);
        sb2.append(", hasAudio=");
        sb2.append(z11);
        sb2.append(", viewsIsVisible=");
        f.c(", hasProduct=", ", hasProductsContainer=", sb2, z12, z13);
        f.c(", hasFreshBadge=", ", hasMuteButton=", sb2, z14, z15);
        f.c(", isCurrentWidget=", ", hasCloseButton=", sb2, z16, z17);
        return a.a(")", sb2, z18);
    }

    public /* synthetic */ ReviewGalleryV2WidgetState(int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? true : z11, (i12 & 4) != 0 ? true : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? false : z15, (i12 & 64) != 0 ? false : z16, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z17, (i12 & 256) != 0 ? false : z18);
    }
}
