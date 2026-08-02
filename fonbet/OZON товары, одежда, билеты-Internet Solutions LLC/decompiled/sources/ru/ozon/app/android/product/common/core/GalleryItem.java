package ru.ozon.app.android.product.common.core;

import G.g;
import Tl.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.videocover.VideoTileItem;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\u00020\t8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/product/common/core/GalleryItem;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "image", "<init>", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;)V", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "getImage", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "ImageItem", "VideoItem", "Lru/ozon/app/android/product/common/core/GalleryItem$ImageItem;", "Lru/ozon/app/android/product/common/core/GalleryItem$VideoItem;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GalleryItem implements AdultVO {

    @NotNull
    private final AdultImageView.Image image;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/product/common/core/GalleryItem$ImageItem;", "Lru/ozon/app/android/product/common/core/GalleryItem;", "", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "image", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "getImage", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageItem extends GalleryItem {

        @NotNull
        private final AdultImageView.Image image;
        private final t tokenizedEvent;

        public /* synthetic */ ImageItem(AdultImageView.Image image, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(image, (i11 & 2) != 0 ? null : tVar);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageItem)) {
                return false;
            }
            ImageItem imageItem = (ImageItem) other;
            return Intrinsics.d(this.image, imageItem.image) && Intrinsics.d(this.tokenizedEvent, imageItem.tokenizedEvent);
        }

        @NotNull
        public AdultImageView.Image getImage() {
            return this.image;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "ImageItem(image=" + this.image + ", tokenizedEvent=" + this.tokenizedEvent + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageItem(@NotNull AdultImageView.Image image, t tVar) {
            super(image, null);
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.tokenizedEvent = tVar;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001fR\"\u0010\u000b\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u000fR\u001a\u0010$\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/product/common/core/GalleryItem$VideoItem;", "Lru/ozon/app/android/product/common/core/GalleryItem;", "Lru/ozon/app/android/videocover/VideoTileItem;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "image", "", "link", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "startedTokenizedEvent", "finishedTokenizedEvent", "interruptedTokenizedEvent", "<init>", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;Ljava/lang/String;LWZ/t;LWZ/t;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "getImage", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "Ljava/lang/String;", "getLink", "LWZ/t;", "getStartedTokenizedEvent", "()LWZ/t;", "getFinishedTokenizedEvent", "getInterruptedTokenizedEvent", "videoUrl", "getVideoUrl", "shouldShowBlurredPreview", "Z", "getShouldShowBlurredPreview", "()Z", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoItem extends GalleryItem implements VideoTileItem {
        private final t finishedTokenizedEvent;

        @NotNull
        private final AdultImageView.Image image;
        private final t interruptedTokenizedEvent;

        @NotNull
        private final String link;
        private final boolean shouldShowBlurredPreview;
        private final t startedTokenizedEvent;

        @NotNull
        private final String videoUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoItem(@NotNull AdultImageView.Image image, @NotNull String link, t tVar, t tVar2, t tVar3) {
            super(image, null);
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(link, "link");
            this.image = image;
            this.link = link;
            this.startedTokenizedEvent = tVar;
            this.finishedTokenizedEvent = tVar2;
            this.interruptedTokenizedEvent = tVar3;
            this.videoUrl = link;
            this.shouldShowBlurredPreview = getShouldBlur();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoItem)) {
                return false;
            }
            VideoItem videoItem = (VideoItem) other;
            return Intrinsics.d(this.image, videoItem.image) && Intrinsics.d(this.link, videoItem.link) && Intrinsics.d(this.startedTokenizedEvent, videoItem.startedTokenizedEvent) && Intrinsics.d(this.finishedTokenizedEvent, videoItem.finishedTokenizedEvent) && Intrinsics.d(this.interruptedTokenizedEvent, videoItem.interruptedTokenizedEvent);
        }

        @Override // ru.ozon.app.android.videocover.VideoTileItem
        public t getFinishedTokenizedEvent() {
            return this.finishedTokenizedEvent;
        }

        @NotNull
        public AdultImageView.Image getImage() {
            return this.image;
        }

        @Override // ru.ozon.app.android.videocover.VideoTileItem
        public t getInterruptedTokenizedEvent() {
            return this.interruptedTokenizedEvent;
        }

        @Override // ru.ozon.app.android.videocover.VideoTileItem
        public boolean getShouldShowBlurredPreview() {
            return this.shouldShowBlurredPreview;
        }

        @Override // ru.ozon.app.android.videocover.VideoTileItem
        public t getStartedTokenizedEvent() {
            return this.startedTokenizedEvent;
        }

        @Override // ru.ozon.app.android.videocover.VideoTileItem
        @NotNull
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public int hashCode() {
            int a11 = g.a(this.image.hashCode() * 31, 31, this.link);
            t tVar = this.startedTokenizedEvent;
            int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.finishedTokenizedEvent;
            int hashCode2 = (hashCode + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            t tVar3 = this.interruptedTokenizedEvent;
            return hashCode2 + (tVar3 != null ? tVar3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AdultImageView.Image image = this.image;
            String str = this.link;
            t tVar = this.startedTokenizedEvent;
            t tVar2 = this.finishedTokenizedEvent;
            t tVar3 = this.interruptedTokenizedEvent;
            StringBuilder sb2 = new StringBuilder("VideoItem(image=");
            sb2.append(image);
            sb2.append(", link=");
            sb2.append(str);
            sb2.append(", startedTokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", finishedTokenizedEvent=");
            sb2.append(tVar2);
            sb2.append(", interruptedTokenizedEvent=");
            return b.d(sb2, tVar3, ")");
        }
    }

    public /* synthetic */ GalleryItem(AdultImageView.Image image, DefaultConstructorMarker defaultConstructorMarker) {
        this(image);
    }

    public boolean getShouldBlur() {
        return this.image.getShouldBlur();
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    /* renamed from: isAdult */
    public boolean getIsAdult() {
        return this.image.getIsAdult();
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    public void setShouldBlur(boolean z11) {
        this.image.setShouldBlur(z11);
    }

    private GalleryItem(AdultImageView.Image image) {
        this.image = image;
    }
}
