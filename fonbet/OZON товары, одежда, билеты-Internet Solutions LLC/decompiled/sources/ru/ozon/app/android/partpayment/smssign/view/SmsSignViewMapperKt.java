package ru.ozon.app.android.partpayment.smssign.view;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.partpayment.smssign.data.SmsSignDTO;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignVO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO;", "Lru/ozon/app/android/partpayment/smssign/data/SmsSignDTO;", "widgetId", "", "homecredit_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SmsSignViewMapperKt {
    @NotNull
    public static final SmsSignVO toVO(@NotNull SmsSignDTO smsSignDTO, long j11) {
        Intrinsics.checkNotNullParameter(smsSignDTO, "<this>");
        String title = smsSignDTO.getTitle();
        int codeLength = smsSignDTO.getCodeLength();
        OzonSpannableString hint = smsSignDTO.getHint();
        SmsSignVO.Timer timer = new SmsSignVO.Timer(smsSignDTO.getTimer().getDescription(), smsSignDTO.getTimer().getDuration(), smsSignDTO.getTimer().getRepeatBtn());
        String approveUrl = smsSignDTO.getApproveUrl();
        Map<String, TokenizedTrackingInfo> trackingInfo = smsSignDTO.getTrackingInfo();
        return new SmsSignVO(title, codeLength, hint, timer, approveUrl, false, null, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, 96, null);
    }
}
