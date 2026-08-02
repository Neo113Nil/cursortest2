package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation;

import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.fresh.unsorted.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.data.WholeSaleDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.WholeSaleVO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/data/WholeSaleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/data/WholeSaleDTO;J)Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/data/WholeSaleDTO$Cell;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO$Cell;", "(Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/data/WholeSaleDTO$Cell;)Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO$Cell;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/data/WholeSaleDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WholeSaleMapper implements Function2<WholeSaleDTO, d, List<? extends WholeSaleVO>> {
    private final WholeSaleVO toVO(WholeSaleDTO wholeSaleDTO, long j11) {
        List<WholeSaleDTO.Cell> cells = wholeSaleDTO.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        Iterator<T> it = cells.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((WholeSaleDTO.Cell) it.next()));
        }
        String background = wholeSaleDTO.getBackground();
        Integer radius = wholeSaleDTO.getRadius();
        String successMessage = wholeSaleDTO.getSuccessMessage();
        String errorMessage = wholeSaleDTO.getErrorMessage();
        Map<String, TokenizedTrackingInfo> trackingInfo = wholeSaleDTO.getTrackingInfo();
        return new WholeSaleVO(j11, arrayList, background, radius, successMessage, errorMessage, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<WholeSaleVO> invoke(@NotNull WholeSaleDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }

    private final WholeSaleVO.Cell toVO(WholeSaleDTO.Cell cell) {
        return new WholeSaleVO.Cell(cell.getTitleSubtitleCell(), cell.getButton(), cell.getHasSeparator());
    }
}
