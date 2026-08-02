package ru.ozon.app.android.partpayment.landing.limit.data;

import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitVO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVO;", "Lru/ozon/app/android/partpayment/landing/limit/data/FormPageLandingLimitDTO;", "widgetId", "", "homecredit_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormPageLandingLimitDTOKt {
    @NotNull
    public static final FormPageLandingLimitVO toVO(@NotNull FormPageLandingLimitDTO formPageLandingLimitDTO, long j11) {
        String str;
        BigDecimal s02;
        Intrinsics.checkNotNullParameter(formPageLandingLimitDTO, "<this>");
        String title = formPageLandingLimitDTO.getTitle();
        String hint = formPageLandingLimitDTO.getHint();
        String value = formPageLandingLimitDTO.getValue();
        if (value == null || (s02 = h.s0(value)) == null || (str = Integer.valueOf(s02.intValue()).toString()) == null) {
            str = "";
        }
        String str2 = str;
        String name = formPageLandingLimitDTO.getName();
        String validationBtn = formPageLandingLimitDTO.getValidationBtn();
        String validationURL = formPageLandingLimitDTO.getValidationURL();
        OzonSpannableString description = formPageLandingLimitDTO.getDescription();
        Map<String, TokenizedTrackingInfo> trackingInfo = formPageLandingLimitDTO.getTrackingInfo();
        return new FormPageLandingLimitVO(title, hint, str2, name, validationBtn, validationURL, description, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
