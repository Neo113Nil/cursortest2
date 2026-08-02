package ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation.photos;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem;", "", "<init>", "()V", "PhotoItem", "MoreCountItem", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem$MoreCountItem;", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem$PhotoItem;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class HeaderItem {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem$MoreCountItem;", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem;", "", "countText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountText", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MoreCountItem extends HeaderItem {

        @NotNull
        private final String countText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoreCountItem(@NotNull String countText) {
            super(null);
            Intrinsics.checkNotNullParameter(countText, "countText");
            this.countText = countText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MoreCountItem) && Intrinsics.d(this.countText, ((MoreCountItem) other).countText);
        }

        @NotNull
        public final String getCountText() {
            return this.countText;
        }

        public int hashCode() {
            return this.countText.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("MoreCountItem(countText=", this.countText, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem$PhotoItem;", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem;", "", "photoUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhotoUrl", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhotoItem extends HeaderItem {

        @NotNull
        private final String photoUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhotoItem(@NotNull String photoUrl) {
            super(null);
            Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
            this.photoUrl = photoUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PhotoItem) && Intrinsics.d(this.photoUrl, ((PhotoItem) other).photoUrl);
        }

        @NotNull
        public final String getPhotoUrl() {
            return this.photoUrl;
        }

        public int hashCode() {
            return this.photoUrl.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("PhotoItem(photoUrl=", this.photoUrl, ")");
        }
    }

    public /* synthetic */ HeaderItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HeaderItem() {
    }
}
