package ru.ozon.app.android.search.widgets.modalButton;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.widgets.modalButton.data.ModalButtonDTO;
import ru.ozon.app.android.search.widgets.modalButton.presentation.ModalButtonVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/app/android/search/widgets/modalButton/presentation/ModalButtonVO;", "Lru/ozon/app/android/search/widgets/modalButton/data/ModalButtonDTO;", "id", "", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalButtonExtKt {
    @NotNull
    public static final ModalButtonVO toVo(@NotNull ModalButtonDTO modalButtonDTO, long j11) {
        Intrinsics.checkNotNullParameter(modalButtonDTO, "<this>");
        String modalUrl = modalButtonDTO.getModalUrl();
        String displayType = modalButtonDTO.getDisplayType();
        Map<String, TokenizedTrackingInfo> trackingInfo = modalButtonDTO.getTrackingInfo();
        return new ModalButtonVO(j11, modalUrl, displayType, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
