package ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.data;

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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.data.PromoCodeApplierDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.presentation.PromoCodeApplierVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/data/PromoCodeApplierDTO;Ll20/d;)Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoCodeApplierMapper implements Function2<PromoCodeApplierDTO, d, List<? extends PromoCodeApplierVO>> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PromoCodeApplierVO> invoke(@NotNull PromoCodeApplierDTO state, @NotNull d widgetInfo) {
        long j11;
        String str;
        t tVar;
        int i11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        ButtonV3DTO button = state.getButton();
        String label = state.getInput().getLabel();
        String name = state.getInput().getName();
        String size = state.getInput().getSize();
        Boolean hasClearButton = state.getInput().getHasClearButton();
        String value = state.getInput().getValue();
        PromoCodeApplierDTO.Status status = state.getInput().getStatus();
        String error = state.getInput().getError();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getInput().getTrackingInfo();
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(hashCode);
            j11 = hashCode;
            i11 = 2;
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, valueOf, null, 2, null);
            str = null;
        } else {
            j11 = hashCode;
            str = null;
            tVar = null;
            i11 = 2;
        }
        PromoCodeApplierVO.InputVO inputVO = new PromoCodeApplierVO.InputVO(label, name, size, hasClearButton, value, status, error, tVar);
        Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getTrackingInfo();
        return C7714v.a0(new PromoCodeApplierVO(j11, title, subtitle, inputVO, button, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), str, i11, str) : str));
    }
}
