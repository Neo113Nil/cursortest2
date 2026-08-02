package ru.ozon.app.android.pdp.widgets.cashbackPoints.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.data.CashbackPointsDTO;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.presentation.CashbackPointsVO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cashbackPoints/core/CashbackPointsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/data/CashbackPointsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVo", "(Lru/ozon/app/android/pdp/widgets/cashbackPoints/data/CashbackPointsDTO;J)Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointsVO;", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/data/CashbackPointsDTO$Block;", "", "hasBottomMargin", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointsVO$Block;", "toVoBlock", "(Lru/ozon/app/android/pdp/widgets/cashbackPoints/data/CashbackPointsDTO$Block;Z)Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointsVO$Block;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/cashbackPoints/data/CashbackPointsDTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CashbackPointsMapper implements Function2<CashbackPointsDTO, d, List<? extends CashbackPointsVO>> {
    private final CashbackPointsVO toVo(CashbackPointsDTO cashbackPointsDTO, long j11) {
        Pair pair = new Pair(toVoBlock((CashbackPointsDTO.Block) C7714v.K(cashbackPointsDTO.getBlocks()), cashbackPointsDTO.getHasBottomMargin()), toVoBlock((CashbackPointsDTO.Block) C7714v.X(cashbackPointsDTO.getBlocks()), cashbackPointsDTO.getHasBottomMargin()));
        String backgroundColor = cashbackPointsDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str = backgroundColor;
        Map<String, TokenizedTrackingInfo> trackingInfo = cashbackPointsDTO.getTrackingInfo();
        return new CashbackPointsVO(j11, pair, str, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final CashbackPointsVO.Block toVoBlock(CashbackPointsDTO.Block block, boolean z11) {
        return new CashbackPointsVO.Block(block.getTitle(), block.getSubtitle(), block.getBackgroundColor(), z11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CashbackPointsVO> invoke(@NotNull CashbackPointsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, MapperExtKt.widgetId(widgetInfo)));
    }
}
