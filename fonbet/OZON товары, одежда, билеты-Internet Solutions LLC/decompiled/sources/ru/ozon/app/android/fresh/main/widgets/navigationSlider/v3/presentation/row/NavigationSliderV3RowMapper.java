package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavigationSliderV3DTO;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row.NavigationSliderV3ItemVO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0010\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0010\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3RowMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$NavigationSliderV3RowDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3RowVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$NavigationSliderV3RowDTO;Ll20/d;)Ljava/util/List;", "", "id", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$NavigationSliderV3RowDTO;J)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3RowVO;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;", "", "ratio", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO;", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;JF)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationSliderV3RowMapper implements Function2<NavigationSliderV3DTO.NavigationSliderV3RowDTO, d, List<? extends NavigationSliderV3RowVO>> {
    @NotNull
    public final NavigationSliderV3RowVO toVO(@NotNull NavigationSliderV3DTO.NavigationSliderV3RowDTO navigationSliderV3RowDTO, long j11) {
        Intrinsics.checkNotNullParameter(navigationSliderV3RowDTO, "<this>");
        float f7 = navigationSliderV3RowDTO.getRightItem() == null ? 0.23323616f : 0.4848485f;
        NavigationSliderV3ItemVO vo = toVO(navigationSliderV3RowDTO.getLeftItem(), j11, f7);
        NavigationSliderV3DTO.Item rightItem = navigationSliderV3RowDTO.getRightItem();
        return new NavigationSliderV3RowVO(j11, vo, rightItem != null ? toVO(rightItem, j11, f7) : null, navigationSliderV3RowDTO.getRowType(), navigationSliderV3RowDTO.getCorners(), navigationSliderV3RowDTO.getHasHeader(), navigationSliderV3RowDTO.getBackgroundColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NavigationSliderV3RowVO> invoke(@NotNull NavigationSliderV3DTO.NavigationSliderV3RowDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }

    @NotNull
    public final NavigationSliderV3ItemVO toVO(@NotNull NavigationSliderV3DTO.Item item, long j11, float f7) {
        NavigationSliderV3ItemVO.Settings vo;
        NavigationSliderV3ItemVO.Data vo2;
        Intrinsics.checkNotNullParameter(item, "<this>");
        vo = NavigationSliderV3RowMapperKt.toVO(item.getSettings());
        vo2 = NavigationSliderV3RowMapperKt.toVO(item.getData(), item.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        return new NavigationSliderV3ItemVO(j11, vo, vo2, f7, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, item.getData().isAdult(), false, 64, null);
    }
}
