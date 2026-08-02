package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.data;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.data.PriceCalendarHeaderV3DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.presentation.PriceCalendarHeaderV3VO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO$Content;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "dto", "mapContent", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO;)Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO$Content;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO$FieldDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO$Field;", "mapField", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO$FieldDTO;)Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO$Field;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Landroid/content/Context;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceCalendarHeaderV3Mapper implements Function2<PriceCalendarHeaderV3DTO, d, List<? extends PriceCalendarHeaderV3VO>>, AsyncWidgetStateMapper<PriceCalendarHeaderV3DTO, PriceCalendarHeaderV3VO.Content> {

    @NotNull
    private final Context context;

    public PriceCalendarHeaderV3Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final PriceCalendarHeaderV3VO.Content mapContent(PriceCalendarHeaderV3DTO dto) {
        return new PriceCalendarHeaderV3VO.Content(mapField(dto.getStartDateField()), mapField(dto.getReturnDateField()), dto.getBackgroundColor(), ResourceExtKt.toPxF(dto.getBottomRadius().getPx(), this.context), dto.getTrackingInfo());
    }

    private final PriceCalendarHeaderV3VO.Field mapField(PriceCalendarHeaderV3DTO.FieldDTO dto) {
        return new PriceCalendarHeaderV3VO.Field(dto.getTitle(), dto.getResetIcon(), dto.getAspect());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PriceCalendarHeaderV3VO> invoke(@NotNull PriceCalendarHeaderV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new PriceCalendarHeaderV3VO(widgetInfo.d().hashCode(), widgetInfo.c().a(), mapContent(state)));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public PriceCalendarHeaderV3VO.Content mapAsyncState(@NotNull PriceCalendarHeaderV3DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapContent(state);
    }
}
