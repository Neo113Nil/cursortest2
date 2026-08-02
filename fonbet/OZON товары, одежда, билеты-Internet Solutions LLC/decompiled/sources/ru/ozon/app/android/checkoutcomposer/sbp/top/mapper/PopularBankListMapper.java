package ru.ozon.app.android.checkoutcomposer.sbp.top.mapper;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.sbp.top.data.PopularBankListDTO;
import ru.ozon.app.android.checkoutcomposer.sbp.top.presentation.PopularBankListVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/top/mapper/PopularBankListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/sbp/top/data/PopularBankListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutcomposer/sbp/top/presentation/PopularBankListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/checkoutcomposer/sbp/top/data/PopularBankListDTO;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/sbp/top/presentation/PopularBankListVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutcomposer/sbp/top/data/PopularBankListDTO;Ll20/d;)Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PopularBankListMapper implements Function2<PopularBankListDTO, d, List<? extends PopularBankListVO>> {
    private final PopularBankListVO toVO(PopularBankListDTO popularBankListDTO, String str) {
        long hashCode = str.hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = popularBankListDTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        return new PopularBankListVO(hashCode, popularBankListDTO.getElements(), popularBankListDTO.getRestriction(), popularBankListDTO.getBackgroundColor(), tokenizedEvent$default);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PopularBankListVO> invoke(@NotNull PopularBankListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d()));
    }
}
