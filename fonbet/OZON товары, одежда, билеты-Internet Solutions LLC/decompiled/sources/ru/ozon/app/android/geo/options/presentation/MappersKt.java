package ru.ozon.app.android.geo.options.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.geo.options.data.Options;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toYandexSearchFragmentData", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "Lru/ozon/app/android/geo/options/data/Options;", "geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MappersKt {
    @NotNull
    public static final YandexSearchSheetFragment.Data toYandexSearchFragmentData(@NotNull Options options) {
        Intrinsics.checkNotNullParameter(options, "<this>");
        String title = options.getTitle();
        String placeholder = options.getPlaceholder();
        String query = options.getQuery();
        String geocodingActionPath = options.getGeocodingActionPath();
        String title2 = options.getTitle();
        int threshold = options.getThreshold();
        FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox boundingBox = new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox(new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox.GeoCoordinate(options.getViewPort().getRightTop().getLatitude(), options.getViewPort().getRightTop().getLongitude()), new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox.GeoCoordinate(options.getViewPort().getLeftBottom().getLatitude(), options.getViewPort().getLeftBottom().getLongitude()));
        List<TextAtom> emptyStateElements = options.getEmptyStateElements();
        if (emptyStateElements == null) {
            emptyStateElements = K.f71697a;
        }
        List<TextAtom> list = emptyStateElements;
        List<TextAtom> unavailableStateElements = options.getUnavailableStateElements();
        if (unavailableStateElements == null) {
            unavailableStateElements = K.f71697a;
        }
        List<TextAtom> list2 = unavailableStateElements;
        List<TextAtom> initialElements = options.getInitialElements();
        if (initialElements == null) {
            initialElements = K.f71697a;
        }
        return new YandexSearchSheetFragment.Data("", title, placeholder, query, new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions(geocodingActionPath, title2, threshold, boundingBox, list, list2, initialElements), null, null, null, null, null, 992, null);
    }
}
