package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.PointModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toBoundingBoxModel", "Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBuilderBlockVOKt {
    @NotNull
    public static final BoundingBoxModel toBoundingBoxModel(@NotNull FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox boundingBox) {
        Intrinsics.checkNotNullParameter(boundingBox, "<this>");
        return new BoundingBoxModel(new PointModel(boundingBox.getSouthwest().getLatitude(), boundingBox.getSouthwest().getLongitude()), new PointModel(boundingBox.getNortheast().getLatitude(), boundingBox.getNortheast().getLongitude()));
    }
}
