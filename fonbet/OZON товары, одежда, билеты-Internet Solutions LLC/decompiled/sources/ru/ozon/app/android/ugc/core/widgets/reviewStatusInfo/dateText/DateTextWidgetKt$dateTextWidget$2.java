package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText;

import Kk.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.data.ReviewStatusInfoDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/dateText/DateTextVO;", "invoke", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class DateTextWidgetKt$dateTextWidget$2 extends AbstractC7737t implements Function2<Object, d, List<? extends DateTextVO>> {
    public static final DateTextWidgetKt$dateTextWidget$2 INSTANCE = new DateTextWidgetKt$dateTextWidget$2();

    DateTextWidgetKt$dateTextWidget$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<DateTextVO> invoke(Object state, d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        ReviewStatusInfoDTO.DateTextDTO dateTextDTO = (ReviewStatusInfoDTO.DateTextDTO) state;
        long a11 = c.a(info.d(), "dateText");
        TextDTO copy$default = TextDTO.copy$default(dateTextDTO.getText(), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null);
        String timestamp = dateTextDTO.getTimestamp();
        String dateFormat = dateTextDTO.getDateFormat();
        String backgroundColor = dateTextDTO.getBackgroundColor();
        ReviewStatusInfoDTO.DateTextDTO.PaddingsDTO paddings = dateTextDTO.getPaddings();
        AtomActionDTO action = dateTextDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, dateTextDTO.getTracking()) : null;
        Map<String, TokenizedTrackingInfo> tracking = dateTextDTO.getTracking();
        return C7714v.a0(new DateTextVO(a11, copy$default, timestamp, dateFormat, backgroundColor, paddings, atomAction, tracking != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(tracking, Long.valueOf(a11), null, 2, null) : null));
    }
}
