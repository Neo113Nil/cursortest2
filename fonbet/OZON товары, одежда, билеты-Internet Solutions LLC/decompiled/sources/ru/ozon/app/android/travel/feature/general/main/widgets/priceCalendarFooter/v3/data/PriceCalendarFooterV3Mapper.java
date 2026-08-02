package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.PriceCalendarFooterV3VO;
import ru.ozon.app.android.travel.molecules.dto.buttonsRow.ButtonsRowDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/data/PriceCalendarFooterV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/data/PriceCalendarFooterV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO$Content;", "<init>", "()V", "dto", "mapContent", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/data/PriceCalendarFooterV3DTO;)Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO$Content;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/data/PriceCalendarFooterV3DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceCalendarFooterV3Mapper implements Function2<PriceCalendarFooterV3DTO, d, List<? extends PriceCalendarFooterV3VO>>, AsyncWidgetStateMapper<PriceCalendarFooterV3DTO, PriceCalendarFooterV3VO.Content> {
    private final PriceCalendarFooterV3VO.Content mapContent(PriceCalendarFooterV3DTO dto) {
        ButtonsRowDTO buttonsRow = dto.getButtonsRow();
        return new PriceCalendarFooterV3VO.Content(buttonsRow != null ? MapperExtKt.toVO(buttonsRow) : null, dto.getBackgroundColor(), dto.getTopRadius(), dto.getTrackingInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PriceCalendarFooterV3VO> invoke(@NotNull PriceCalendarFooterV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new PriceCalendarFooterV3VO(widgetInfo.d().hashCode(), widgetInfo.c().a(), mapContent(state)));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public PriceCalendarFooterV3VO.Content mapAsyncState(@NotNull PriceCalendarFooterV3DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapContent(state);
    }
}
