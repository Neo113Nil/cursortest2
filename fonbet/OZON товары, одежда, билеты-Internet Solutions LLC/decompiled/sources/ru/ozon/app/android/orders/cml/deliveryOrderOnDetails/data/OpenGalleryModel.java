package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.data;

import H3.c;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/OpenGalleryModel;", "", "items", "", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/OpenGalleryModel$GalleryItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "GalleryItem", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OpenGalleryModel {
    public static final int $stable = 8;
    private final List<GalleryItem> items;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/OpenGalleryModel$GalleryItem;", "", "thumb", "", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getThumb", "()Ljava/lang/String;", "getImage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryItem {
        public static final int $stable = 0;
        private final String image;
        private final String thumb;

        public GalleryItem(String str, String str2) {
            this.thumb = str;
            this.image = str2;
        }

        public static /* synthetic */ GalleryItem copy$default(GalleryItem galleryItem, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = galleryItem.thumb;
            }
            if ((i11 & 2) != 0) {
                str2 = galleryItem.image;
            }
            return galleryItem.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getThumb() {
            return this.thumb;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final GalleryItem copy(String thumb, String image) {
            return new GalleryItem(thumb, image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GalleryItem)) {
                return false;
            }
            GalleryItem galleryItem = (GalleryItem) other;
            return Intrinsics.d(this.thumb, galleryItem.thumb) && Intrinsics.d(this.image, galleryItem.image);
        }

        public final String getImage() {
            return this.image;
        }

        public final String getThumb() {
            return this.thumb;
        }

        public int hashCode() {
            String str = this.thumb;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.image;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("GalleryItem(thumb=", this.thumb, ", image=", this.image, ")");
        }
    }

    public OpenGalleryModel(List<GalleryItem> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenGalleryModel copy$default(OpenGalleryModel openGalleryModel, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = openGalleryModel.items;
        }
        return openGalleryModel.copy(list);
    }

    public final List<GalleryItem> component1() {
        return this.items;
    }

    @NotNull
    public final OpenGalleryModel copy(List<GalleryItem> items) {
        return new OpenGalleryModel(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OpenGalleryModel) && Intrinsics.d(this.items, ((OpenGalleryModel) other).items);
    }

    public final List<GalleryItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<GalleryItem> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("OpenGalleryModel(items=", ")", this.items);
    }
}
