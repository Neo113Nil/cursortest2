package ru.ozon.app.android.checkoutcomposer.totalExpanded.presentation;

import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.totalExpanded.data.TotalExpandedDTO;
import ru.ozon.app.android.checkoutcomposer.totalExpanded.presentation.TotalExpandedVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\t\u001a\u0013\u0010\u0005\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO;Ll20/d;)Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO;", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$SummaryDTO;", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$SummaryVO;", "(Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$SummaryDTO;)Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$SummaryVO;", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$HeaderDTO;", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$HeaderVO;", "(Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$HeaderDTO;)Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$HeaderVO;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalExpandedMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final TotalExpandedVO toVO(TotalExpandedDTO totalExpandedDTO, d dVar) {
        long hashCode = dVar.d().hashCode();
        ButtonV3DTO button = totalExpandedDTO.getButton();
        TotalExpandedVO.SummaryVO vo = toVO(totalExpandedDTO.getSummary());
        Map<String, TokenizedTrackingInfo> trackingInfo = totalExpandedDTO.getTrackingInfo();
        return new TotalExpandedVO(hashCode, vo, button, trackingInfo != null ? x.d(trackingInfo, dVar) : null);
    }

    private static final TotalExpandedVO.SummaryVO toVO(TotalExpandedDTO.SummaryDTO summaryDTO) {
        TotalExpandedDTO.HeaderDTO header = summaryDTO.getHeader();
        return new TotalExpandedVO.SummaryVO(header != null ? toVO(header) : null, summaryDTO.getTotalItems());
    }

    private static final TotalExpandedVO.HeaderVO toVO(TotalExpandedDTO.HeaderDTO headerDTO) {
        return new TotalExpandedVO.HeaderVO(headerDTO.getTitle());
    }
}
