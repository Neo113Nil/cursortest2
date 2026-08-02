package ru.ozon.app.android.common.progressivemolecula.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveBadgeDTO;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveTextWidgetDTO;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextWidgetVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\t"}, d2 = {"toVO", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO;", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO;", "id", "", "pageTypeIsPDP", "", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$ProgressiveTextDTO;", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtentionsKt {
    @NotNull
    public static final ProgressiveTextWidgetVO toVO(@NotNull ProgressiveTextWidgetDTO progressiveTextWidgetDTO, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(progressiveTextWidgetDTO, "<this>");
        return new ProgressiveTextWidgetVO(j11, toVO(progressiveTextWidgetDTO.getProgressiveText(), j11), progressiveTextWidgetDTO.getHorizontalPadding(), progressiveTextWidgetDTO.isSticky(), z11);
    }

    @NotNull
    public static final ProgressiveTextWidgetVO.ProgressiveTextVO toVO(@NotNull ProgressiveTextWidgetDTO.ProgressiveTextDTO progressiveTextDTO, long j11) {
        Intrinsics.checkNotNullParameter(progressiveTextDTO, "<this>");
        TextDTO title = progressiveTextDTO.getTitle();
        IconDTO icon = progressiveTextDTO.getIcon();
        ProgressiveBadgeDTO badge = progressiveTextDTO.getBadge();
        String backgroundColor = progressiveTextDTO.getBackgroundColor();
        String borderColor = progressiveTextDTO.getBorderColor();
        ProgressiveTextWidgetDTO.Paddings paddings = progressiveTextDTO.getPaddings();
        Integer cornerRadius = progressiveTextDTO.getCornerRadius();
        AtomActionDTO action = progressiveTextDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, progressiveTextDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = progressiveTextDTO.getTrackingInfo();
        return new ProgressiveTextWidgetVO.ProgressiveTextVO(j11, title, icon, badge, backgroundColor, borderColor, paddings, cornerRadius, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
