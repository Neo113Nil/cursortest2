package ru.ozon.app.android.returns.list.viewMapper.extension;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.returns.common.data.dto.ReturnStatusDto;
import ru.ozon.app.android.returns.common.mapper.ReturnTotalsKt;
import ru.ozon.app.android.returns.common.presentation.viewObject.ReturnTotalVO;
import ru.ozon.app.android.returns.list.data.dto.ReturnPreviewDto;
import ru.ozon.app.android.returns.list.presentation.viewObject.ReturnPreviewVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"toVo", "Lru/ozon/app/android/returns/list/presentation/viewObject/ReturnPreviewVO;", "Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto;", "id", "", "Lru/ozon/app/android/returns/list/presentation/viewObject/ReturnPreviewVO$Header;", "Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto$Header;", "details_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnPreviewsKt {
    @NotNull
    public static final ReturnPreviewVO toVo(@NotNull ReturnPreviewDto returnPreviewDto, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(returnPreviewDto, "<this>");
        ReturnPreviewVO.Header vo = toVo(returnPreviewDto.getHeader());
        ReturnTotalVO vo2 = ReturnTotalsKt.toVo(returnPreviewDto.getTotal());
        ReturnStatusDto status = returnPreviewDto.getStatus();
        String backgroundColor = returnPreviewDto.getBackgroundColor();
        CommonControlSettings common = returnPreviewDto.getCommon();
        t tVar = null;
        AtomAction atomAction = common != null ? common.toAtomAction() : null;
        CommonControlSettings common2 = returnPreviewDto.getCommon();
        if (common2 != null && (trackingInfo = common2.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        }
        return new ReturnPreviewVO(j11, vo, status, vo2, backgroundColor, returnPreviewDto.getAction(), atomAction, tVar);
    }

    private static final ReturnPreviewVO.Header toVo(ReturnPreviewDto.Header header) {
        return new ReturnPreviewVO.Header(header.getNewTitle(), header.getNewSubtitle(), header.getIcon(), header.getSeparatorColor());
    }
}
