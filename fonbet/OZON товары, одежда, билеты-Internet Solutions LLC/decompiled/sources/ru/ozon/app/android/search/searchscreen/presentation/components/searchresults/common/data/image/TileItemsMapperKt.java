package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.image;

import Sc.o;
import WZ.t;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.product.imagesswipeview.Paranja;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.image.TileImageComponent;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;
import ru.ozon.app.android.storefront.data.tiles.common.ContentMode;
import ru.ozon.app.android.storefront.data.tiles.common.ContentModeKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001aa\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0015\u0010\u001d\u001a\u00020\u0010*\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent;", "", "parentVoId", "", "isSoldOut", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;", "heightMode", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem;", "mapGalleryItems", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent;JZLru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;Z)Ljava/util/List;", "createAdultItem", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent;JZLru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem;", "", "imageUrl", "Lru/ozon/app/android/product/imagesswipeview/Paranja;", "imageParanja", "Landroid/widget/ImageView$ScaleType;", "scaleType", "isPinchToZoomEnabled", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "pinchToZoomTokenizedEvent", "blurPlaceholderImage", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "createImage", "(Ljava/lang/String;Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image$HeightMode;ZLru/ozon/app/android/product/imagesswipeview/Paranja;ZLandroid/widget/ImageView$ScaleType;ZLWZ/t;Ljava/lang/String;)Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$Paranja;", "toImageParanjaOrDefault", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$Paranja;)Lru/ozon/app/android/product/imagesswipeview/Paranja;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileItemsMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TileImageComponent.Paranja.values().length];
            try {
                iArr[TileImageComponent.Paranja.PARANJA_BOTH_THEMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileImageComponent.Paranja.PARANJA_DARK_THEME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TileImageComponent.Paranja.PARANJA_DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final SearchResultsGalleryModel.GalleryItem createAdultItem(@NotNull TileImageComponent tileImageComponent, long j11, boolean z11, @NotNull AdultImageView.Image.HeightMode heightMode) {
        Intrinsics.checkNotNullParameter(tileImageComponent, "<this>");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Paranja imageParanjaOrDefault = toImageParanjaOrDefault(tileImageComponent.getParanja());
        Map<String, TokenizedTrackingInfo> pinchToZoomTrackingInfo = tileImageComponent.getPinchToZoomTrackingInfo();
        t tokenizedEvent$default = pinchToZoomTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(pinchToZoomTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        String blurPlaceholderImage = tileImageComponent.getBlurPlaceholderImage();
        if (blurPlaceholderImage == null) {
            blurPlaceholderImage = "";
        }
        TileImageComponent.TileItemDTO.ImageDTO imageDTO = new TileImageComponent.TileItemDTO.ImageDTO(blurPlaceholderImage, null);
        return new SearchResultsGalleryModel.GalleryItem.ImageItem(createImage(imageDTO.getLink(), heightMode, z11, imageParanjaOrDefault, true, ContentModeKt.mapScaleType(imageDTO.getContentMode()), true, tokenizedEvent$default, tileImageComponent.getBlurPlaceholderImage()));
    }

    private static final AdultImageView.Image createImage(String str, AdultImageView.Image.HeightMode heightMode, boolean z11, Paranja paranja, boolean z12, ImageView.ScaleType scaleType, boolean z13, t tVar, String str2) {
        return new AdultImageView.Image(str, heightMode, z11 ? 0.5f : 1.0f, false, z12, false, str2, paranja, scaleType, z13, tVar, false, 2080, null);
    }

    @NotNull
    public static final List<SearchResultsGalleryModel.GalleryItem> mapGalleryItems(@NotNull TileImageComponent tileImageComponent, long j11, boolean z11, @NotNull AdultImageView.Image.HeightMode heightMode, boolean z12) {
        String preview;
        ContentMode previewContentMode;
        Object videoItem;
        Map<String, TokenizedTrackingInfo> interruptedTrackingInfo;
        Map<String, TokenizedTrackingInfo> finishedTrackingInfo;
        Map<String, TokenizedTrackingInfo> startedTrackingInfo;
        Intrinsics.checkNotNullParameter(tileImageComponent, "<this>");
        AdultImageView.Image.HeightMode heightMode2 = heightMode;
        Intrinsics.checkNotNullParameter(heightMode2, "heightMode");
        Paranja imageParanjaOrDefault = toImageParanjaOrDefault(tileImageComponent.getParanja());
        Map<String, TokenizedTrackingInfo> pinchToZoomTrackingInfo = tileImageComponent.getPinchToZoomTrackingInfo();
        t tokenizedEvent$default = pinchToZoomTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(pinchToZoomTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        List<TileImageComponent.TileItemDTO> items = tileImageComponent.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (TileImageComponent.TileItemDTO tileItemDTO : items) {
            boolean z13 = tileItemDTO instanceof TileImageComponent.TileItemDTO.ImageDTO;
            if (z13) {
                preview = ((TileImageComponent.TileItemDTO.ImageDTO) tileItemDTO).getLink();
            } else {
                if (!(tileItemDTO instanceof TileImageComponent.TileItemDTO.VideoDTO)) {
                    throw new o();
                }
                preview = ((TileImageComponent.TileItemDTO.VideoDTO) tileItemDTO).getPreview();
            }
            if (z13) {
                previewContentMode = ((TileImageComponent.TileItemDTO.ImageDTO) tileItemDTO).getContentMode();
            } else {
                if (!(tileItemDTO instanceof TileImageComponent.TileItemDTO.VideoDTO)) {
                    throw new o();
                }
                previewContentMode = ((TileImageComponent.TileItemDTO.VideoDTO) tileItemDTO).getPreviewContentMode();
            }
            boolean z14 = tileItemDTO instanceof TileImageComponent.TileItemDTO.VideoDTO;
            AdultImageView.Image createImage = createImage(preview, heightMode2, z11, imageParanjaOrDefault, z12, ContentModeKt.mapScaleType(previewContentMode), !z14, tokenizedEvent$default, null);
            if (z13) {
                videoItem = new SearchResultsGalleryModel.GalleryItem.ImageItem(createImage);
            } else {
                if (!z14) {
                    throw new o();
                }
                TileImageComponent.TileItemDTO.VideoDTO videoDTO = (TileImageComponent.TileItemDTO.VideoDTO) tileItemDTO;
                String link = videoDTO.getLink();
                TileImageComponent.TileItemDTO.VideoDTO.VideoTracking tracking = videoDTO.getTracking();
                t tokenizedEvent$default2 = (tracking == null || (startedTrackingInfo = tracking.getStartedTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(startedTrackingInfo, Long.valueOf(j11), null, 2, null);
                TileImageComponent.TileItemDTO.VideoDTO.VideoTracking tracking2 = videoDTO.getTracking();
                t tokenizedEvent$default3 = (tracking2 == null || (finishedTrackingInfo = tracking2.getFinishedTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(finishedTrackingInfo, Long.valueOf(j11), null, 2, null);
                TileImageComponent.TileItemDTO.VideoDTO.VideoTracking tracking3 = videoDTO.getTracking();
                videoItem = new SearchResultsGalleryModel.GalleryItem.VideoItem(createImage, link, tokenizedEvent$default2, tokenizedEvent$default3, (tracking3 == null || (interruptedTrackingInfo = tracking3.getInterruptedTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(interruptedTrackingInfo, Long.valueOf(j11), null, 2, null));
            }
            arrayList.add(videoItem);
            heightMode2 = heightMode;
        }
        return arrayList;
    }

    private static final Paranja toImageParanjaOrDefault(TileImageComponent.Paranja paranja) {
        int i11 = paranja == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paranja.ordinal()];
        if (i11 != -1 && i11 != 1) {
            if (i11 == 2) {
                return Paranja.PARANJA_DARK_THEME;
            }
            if (i11 == 3) {
                return Paranja.PARANJA_DISABLED;
            }
            throw new o();
        }
        return Paranja.PARANJA_BOTH_THEMES;
    }
}
