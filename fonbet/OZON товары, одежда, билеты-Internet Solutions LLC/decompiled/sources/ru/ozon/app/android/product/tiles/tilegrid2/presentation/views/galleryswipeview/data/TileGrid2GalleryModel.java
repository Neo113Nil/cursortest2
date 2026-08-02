package ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data;

import B4.V;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Pk0.b;
import WZ.t;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.videocover.VideoTileItem;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u0002%&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010!¨\u0006'"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;", "", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;", "adultImagesModel", "", "ratio", "", "fRatio", "<init>", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;Ljava/lang/String;F)V", "copy", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;Ljava/lang/String;F)Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;", "getAdultImagesModel", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;", "Ljava/lang/String;", "getRatio", "F", "getFRatio", "()F", "galleryPosition", "I", "getGalleryPosition", "setGalleryPosition", "(I)V", "galleryPrefetchPosition", "getGalleryPrefetchPosition", "setGalleryPrefetchPosition", "GalleryItem", "Image", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TileGrid2GalleryModel {

    @NotNull
    private final AdultImagesModel adultImagesModel;
    private final float fRatio;
    private int galleryPosition;
    private int galleryPrefetchPosition;

    @NotNull
    private final String ratio;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem;", "", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "image", "<init>", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "getImage", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "ImageItem", "VideoItem", "BlurItem", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem$BlurItem;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem$ImageItem;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem$VideoItem;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class GalleryItem {
        private final Image image;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem$BlurItem;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "molecule", "<init>", "(Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "getMolecule", "()Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final /* data */ class BlurItem extends GalleryItem {

            @NotNull
            private final BlurMoleculeVO molecule;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public BlurItem(@NotNull BlurMoleculeVO molecule) {
                super(null, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(molecule, "molecule");
                this.molecule = molecule;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BlurItem) && Intrinsics.d(this.molecule, ((BlurItem) other).molecule);
            }

            @NotNull
            public final BlurMoleculeVO getMolecule() {
                return this.molecule;
            }

            public int hashCode() {
                return this.molecule.hashCode();
            }

            @NotNull
            public String toString() {
                return "BlurItem(molecule=" + this.molecule + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem$ImageItem;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "image", "<init>", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "getImage", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageItem extends GalleryItem {

            @NotNull
            private final Image image;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageItem(@NotNull Image image) {
                super(image, null);
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ImageItem) && Intrinsics.d(this.image, ((ImageItem) other).image);
            }

            @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel.GalleryItem
            @NotNull
            public Image getImage() {
                return this.image;
            }

            public int hashCode() {
                return this.image.hashCode();
            }

            @NotNull
            public String toString() {
                return "ImageItem(image=" + this.image + ")";
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b!\u0010 R\"\u0010\u000b\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u0011¨\u0006("}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem$VideoItem;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$GalleryItem;", "Lru/ozon/app/android/videocover/VideoTileItem;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "image", "", "link", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "startedTokenizedEvent", "finishedTokenizedEvent", "interruptedTokenizedEvent", "", "shouldShowBlurredPreview", "<init>", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;Ljava/lang/String;LWZ/t;LWZ/t;LWZ/t;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "getImage", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "Ljava/lang/String;", "getLink", "LWZ/t;", "getStartedTokenizedEvent", "()LWZ/t;", "getFinishedTokenizedEvent", "getInterruptedTokenizedEvent", "Z", "getShouldShowBlurredPreview", "()Z", "videoUrl", "getVideoUrl", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VideoItem extends GalleryItem implements VideoTileItem {
            private final t finishedTokenizedEvent;

            @NotNull
            private final Image image;
            private final t interruptedTokenizedEvent;

            @NotNull
            private final String link;
            private final boolean shouldShowBlurredPreview;
            private final t startedTokenizedEvent;

            @NotNull
            private final String videoUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoItem(@NotNull Image image, @NotNull String link, t tVar, t tVar2, t tVar3, boolean z11) {
                super(image, null);
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(link, "link");
                this.image = image;
                this.link = link;
                this.startedTokenizedEvent = tVar;
                this.finishedTokenizedEvent = tVar2;
                this.interruptedTokenizedEvent = tVar3;
                this.shouldShowBlurredPreview = z11;
                this.videoUrl = link;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoItem)) {
                    return false;
                }
                VideoItem videoItem = (VideoItem) other;
                return Intrinsics.d(this.image, videoItem.image) && Intrinsics.d(this.link, videoItem.link) && Intrinsics.d(this.startedTokenizedEvent, videoItem.startedTokenizedEvent) && Intrinsics.d(this.finishedTokenizedEvent, videoItem.finishedTokenizedEvent) && Intrinsics.d(this.interruptedTokenizedEvent, videoItem.interruptedTokenizedEvent) && this.shouldShowBlurredPreview == videoItem.shouldShowBlurredPreview;
            }

            @Override // ru.ozon.app.android.videocover.VideoTileItem
            public t getFinishedTokenizedEvent() {
                return this.finishedTokenizedEvent;
            }

            @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel.GalleryItem
            @NotNull
            public Image getImage() {
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
                return Boolean.hashCode(this.shouldShowBlurredPreview) + ((hashCode2 + (tVar3 != null ? tVar3.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                return "VideoItem(image=" + this.image + ", link=" + this.link + ", startedTokenizedEvent=" + this.startedTokenizedEvent + ", finishedTokenizedEvent=" + this.finishedTokenizedEvent + ", interruptedTokenizedEvent=" + this.interruptedTokenizedEvent + ", shouldShowBlurredPreview=" + this.shouldShowBlurredPreview + ")";
            }
        }

        public /* synthetic */ GalleryItem(Image image, DefaultConstructorMarker defaultConstructorMarker) {
            this(image);
        }

        public Image getImage() {
            return this.image;
        }

        private GalleryItem(Image image) {
            this.image = image;
        }
    }

    public TileGrid2GalleryModel(@NotNull AdultImagesModel adultImagesModel, @NotNull String ratio, float f7) {
        Intrinsics.checkNotNullParameter(adultImagesModel, "adultImagesModel");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        this.adultImagesModel = adultImagesModel;
        this.ratio = ratio;
        this.fRatio = f7;
    }

    public static /* synthetic */ TileGrid2GalleryModel copy$default(TileGrid2GalleryModel tileGrid2GalleryModel, AdultImagesModel adultImagesModel, String str, float f7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            adultImagesModel = tileGrid2GalleryModel.adultImagesModel;
        }
        if ((i11 & 2) != 0) {
            str = tileGrid2GalleryModel.ratio;
        }
        if ((i11 & 4) != 0) {
            f7 = tileGrid2GalleryModel.fRatio;
        }
        return tileGrid2GalleryModel.copy(adultImagesModel, str, f7);
    }

    @NotNull
    public final TileGrid2GalleryModel copy(@NotNull AdultImagesModel adultImagesModel, @NotNull String ratio, float fRatio) {
        Intrinsics.checkNotNullParameter(adultImagesModel, "adultImagesModel");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        return new TileGrid2GalleryModel(adultImagesModel, ratio, fRatio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileGrid2GalleryModel)) {
            return false;
        }
        TileGrid2GalleryModel tileGrid2GalleryModel = (TileGrid2GalleryModel) other;
        return Intrinsics.d(this.adultImagesModel, tileGrid2GalleryModel.adultImagesModel) && Intrinsics.d(this.ratio, tileGrid2GalleryModel.ratio) && Float.compare(this.fRatio, tileGrid2GalleryModel.fRatio) == 0;
    }

    @NotNull
    public final AdultImagesModel getAdultImagesModel() {
        return this.adultImagesModel;
    }

    public final float getFRatio() {
        return this.fRatio;
    }

    public final int getGalleryPosition() {
        return this.galleryPosition;
    }

    public final int getGalleryPrefetchPosition() {
        return this.galleryPrefetchPosition;
    }

    @NotNull
    public final String getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        return Float.hashCode(this.fRatio) + g.a(this.adultImagesModel.hashCode() * 31, 31, this.ratio);
    }

    public final void setGalleryPosition(int i11) {
        this.galleryPosition = i11;
    }

    public final void setGalleryPrefetchPosition(int i11) {
        this.galleryPrefetchPosition = i11;
    }

    @NotNull
    public String toString() {
        AdultImagesModel adultImagesModel = this.adultImagesModel;
        String str = this.ratio;
        float f7 = this.fRatio;
        StringBuilder sb2 = new StringBuilder("TileGrid2GalleryModel(adultImagesModel=");
        sb2.append(adultImagesModel);
        sb2.append(", ratio=");
        sb2.append(str);
        sb2.append(", fRatio=");
        return V.b(f7, ")", sb2);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b&\u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b'\u0010\u0013R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b\r\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "", "", ImagesContract.URL, "", "ratio", "alpha", "", "enableParanja", "Landroid/widget/ImageView$ScaleType;", "scaleType", "topBgColor", "bottomBgColor", "isDarkAdultMessageRequired", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;FFZLandroid/widget/ImageView$ScaleType;Ljava/lang/String;Ljava/lang/String;ZLWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "F", "getRatio", "()F", "getAlpha", "Z", "getEnableParanja", "()Z", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "getTopBgColor", "getBottomBgColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image {
        private final float alpha;
        private final String bottomBgColor;
        private final boolean enableParanja;
        private final boolean isDarkAdultMessageRequired;
        private final float ratio;

        @NotNull
        private final ImageView.ScaleType scaleType;
        private final t tokenizedEvent;
        private final String topBgColor;

        @NotNull
        private final String url;

        public Image(@NotNull String url, float f7, float f11, boolean z11, @NotNull ImageView.ScaleType scaleType, String str, String str2, boolean z12, t tVar) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            this.url = url;
            this.ratio = f7;
            this.alpha = f11;
            this.enableParanja = z11;
            this.scaleType = scaleType;
            this.topBgColor = str;
            this.bottomBgColor = str2;
            this.isDarkAdultMessageRequired = z12;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.url, image.url) && Float.compare(this.ratio, image.ratio) == 0 && Float.compare(this.alpha, image.alpha) == 0 && this.enableParanja == image.enableParanja && this.scaleType == image.scaleType && Intrinsics.d(this.topBgColor, image.topBgColor) && Intrinsics.d(this.bottomBgColor, image.bottomBgColor) && this.isDarkAdultMessageRequired == image.isDarkAdultMessageRequired && Intrinsics.d(this.tokenizedEvent, image.tokenizedEvent);
        }

        public final float getAlpha() {
            return this.alpha;
        }

        public final String getBottomBgColor() {
            return this.bottomBgColor;
        }

        public final boolean getEnableParanja() {
            return this.enableParanja;
        }

        public final float getRatio() {
            return this.ratio;
        }

        @NotNull
        public final ImageView.ScaleType getScaleType() {
            return this.scaleType;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final String getTopBgColor() {
            return this.topBgColor;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = (this.scaleType.hashCode() + C3532b.a(b.a(this.alpha, b.a(this.ratio, this.url.hashCode() * 31, 31), 31), 31, this.enableParanja)) * 31;
            String str = this.topBgColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bottomBgColor;
            int a11 = C3532b.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isDarkAdultMessageRequired);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.url;
            float f7 = this.ratio;
            float f11 = this.alpha;
            boolean z11 = this.enableParanja;
            ImageView.ScaleType scaleType = this.scaleType;
            String str2 = this.topBgColor;
            String str3 = this.bottomBgColor;
            boolean z12 = this.isDarkAdultMessageRequired;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("Image(url=");
            sb2.append(str);
            sb2.append(", ratio=");
            sb2.append(f7);
            sb2.append(", alpha=");
            sb2.append(f11);
            sb2.append(", enableParanja=");
            sb2.append(z11);
            sb2.append(", scaleType=");
            sb2.append(scaleType);
            sb2.append(", topBgColor=");
            sb2.append(str2);
            sb2.append(", bottomBgColor=");
            C2880a.c(str3, ", isDarkAdultMessageRequired=", ", tokenizedEvent=", sb2, z12);
            return Tl.b.d(sb2, tVar, ")");
        }

        public /* synthetic */ Image(String str, float f7, float f11, boolean z11, ImageView.ScaleType scaleType, String str2, String str3, boolean z12, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f7, f11, z11, scaleType, str2, str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z12, tVar);
        }
    }
}
