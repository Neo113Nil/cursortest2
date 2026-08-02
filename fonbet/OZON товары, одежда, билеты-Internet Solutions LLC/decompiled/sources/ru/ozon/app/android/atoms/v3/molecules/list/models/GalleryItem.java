package ru.ozon.app.android.atoms.v3.molecules.list.models;

import Cm.e;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$layout;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem;", "", "", "id", "<init>", "(I)V", "I", "getId", "()I", "GalleryImageItem", "GalleryImageCountItem", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem$GalleryImageCountItem;", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem$GalleryImageItem;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class GalleryItem {
    private final int id;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem$GalleryImageCountItem;", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem;", "", "id", "imageCount", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getImageCount", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryImageCountItem extends GalleryItem {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int LAYOUT_ITEM_ID = R$layout.gallery_item_image_count_view_holder;
        private final int id;
        private final int imageCount;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem$GalleryImageCountItem$Companion;", "", "<init>", "()V", "LAYOUT_ITEM_ID", "", "getLAYOUT_ITEM_ID", "()I", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int getLAYOUT_ITEM_ID() {
                return GalleryImageCountItem.LAYOUT_ITEM_ID;
            }

            private Companion() {
            }
        }

        public GalleryImageCountItem(int i11, int i12) {
            super(i11, null);
            this.id = i11;
            this.imageCount = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GalleryImageCountItem)) {
                return false;
            }
            GalleryImageCountItem galleryImageCountItem = (GalleryImageCountItem) other;
            return this.id == galleryImageCountItem.id && this.imageCount == galleryImageCountItem.imageCount;
        }

        public final int getImageCount() {
            return this.imageCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.imageCount) + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("GalleryImageCountItem(id=", this.id, ", imageCount=", ")", this.imageCount);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem$GalleryImageItem;", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem;", "", "id", "", "imageUrl", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getImageUrl", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryImageItem extends GalleryItem {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int LAYOUT_ITEM_ID = R$layout.gallery_item_image_view_holder;
        private final int id;

        @NotNull
        private final String imageUrl;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem$GalleryImageItem$Companion;", "", "<init>", "()V", "LAYOUT_ITEM_ID", "", "getLAYOUT_ITEM_ID", "()I", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int getLAYOUT_ITEM_ID() {
                return GalleryImageItem.LAYOUT_ITEM_ID;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GalleryImageItem(int i11, @NotNull String imageUrl) {
            super(i11, null);
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.id = i11;
            this.imageUrl = imageUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GalleryImageItem)) {
                return false;
            }
            GalleryImageItem galleryImageItem = (GalleryImageItem) other;
            return this.id == galleryImageItem.id && Intrinsics.d(this.imageUrl, galleryImageItem.imageUrl);
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public int hashCode() {
            return this.imageUrl.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return a.c(this.id, "GalleryImageItem(id=", ", imageUrl=", this.imageUrl, ")");
        }
    }

    public /* synthetic */ GalleryItem(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    private GalleryItem(int i11) {
        this.id = i11;
    }
}
