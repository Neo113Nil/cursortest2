package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.mapper;

import Sc.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.SearchResultsConstants;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.image.TileImageComponent;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.image.TileItemsMapperKt;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.AdultImagesModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridDTO;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/mapper/SearchResultsGridGalleryModelMapper;", "", "<init>", "()V", "buildGalleryModel", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "parentVoId", "", "item", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO;", "isSoldOut", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "shouldBlur", "blurredImage", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel$GalleryItem;", "buildAdultImageModel", "createWaveModel", "Lru/ozon/app/android/product/common/wave/WaveModel;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultsGridGalleryModelMapper {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TileImageComponent.TileImageTheme.values().length];
            try {
                iArr[TileImageComponent.TileImageTheme.THEME_TYPE_WAVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileImageComponent.TileImageTheme.THEME_TYPE_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final WaveModel createWaveModel(SearchResultsGridDTO.GridItemDTO item) {
        TileImageComponent.TileImageTheme theme = item.getTileImage().getTheme();
        int i11 = theme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i11 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new o();
                }
            } else if (item.getBackgroundColor() == null) {
                return new WaveModel(SearchResultsConstants.INSTANCE.getWaveWidth(), R$attr.layerFloor1);
            }
        }
        return null;
    }

    public final SearchResultsGalleryModel.GalleryItem buildAdultImageModel(long parentVoId, @NotNull SearchResultsGridDTO.GridItemDTO item, boolean isSoldOut, boolean isAdult) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!isAdult) {
            return null;
        }
        return TileItemsMapperKt.createAdultItem(item.getTileImage(), parentVoId, isSoldOut, AdultImageView.Image.HeightMode.Relative.INSTANCE.fromString(item.getTileImage().getImageRatio()));
    }

    @NotNull
    public final SearchResultsGalleryModel buildGalleryModel(long parentVoId, @NotNull SearchResultsGridDTO.GridItemDTO item, boolean isSoldOut, boolean isAdult, boolean shouldBlur, SearchResultsGalleryModel.GalleryItem blurredImage) {
        Intrinsics.checkNotNullParameter(item, "item");
        AdultImageView.Image.HeightMode.Relative fromString = AdultImageView.Image.HeightMode.Relative.INSTANCE.fromString(item.getTileImage().getImageRatio());
        List<SearchResultsGalleryModel.GalleryItem> mapGalleryItems = TileItemsMapperKt.mapGalleryItems(item.getTileImage(), parentVoId, isSoldOut, fromString, false);
        String imageRatio = item.getTileImage().getImageRatio();
        float ratio = fromString.getRatio();
        WaveModel createWaveModel = createWaveModel(item);
        String overlayTitle = item.getTileImage().getOverlayTitle();
        List<Object> topRightButtons = item.getTopRightButtons();
        if (topRightButtons == null) {
            topRightButtons = K.f71697a;
        }
        return new SearchResultsGalleryModel(new AdultImagesModel(shouldBlur, isAdult, mapGalleryItems, blurredImage), imageRatio, ratio, createWaveModel, overlayTitle, topRightButtons);
    }
}
