package ru.ozon.app.android.pdp.widgets.othersellers.core.title;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.othersellers.data.OtherSellersDTO;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.title.OtherSellersTitleVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/core/title/OtherSellersTitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/title/OtherSellersTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OtherSellersTitleMapper implements Function2<OtherSellersDTO, d, List<? extends OtherSellersTitleVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OtherSellersTitleVO> invoke(@NotNull OtherSellersDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String title = dto.getTitle();
        if (title != null) {
            long hashCode = widgetInfo.d().hashCode();
            Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
            List<OtherSellersTitleVO> a02 = C7714v.a0(new OtherSellersTitleVO(hashCode, title, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
