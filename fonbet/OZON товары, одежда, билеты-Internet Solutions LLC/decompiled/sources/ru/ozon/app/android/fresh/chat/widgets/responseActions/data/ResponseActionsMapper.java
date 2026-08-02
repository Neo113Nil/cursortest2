package ru.ozon.app.android.fresh.chat.widgets.responseActions.data;

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
import ru.ozon.app.android.fresh.chat.widgets.responseActions.presentation.ResponseActionsVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/responseActions/data/ResponseActionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/chat/widgets/responseActions/data/ResponseActionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/chat/widgets/responseActions/presentation/ResponseActionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/chat/widgets/responseActions/data/ResponseActionsDTO;Ll20/d;)Ljava/util/List;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ResponseActionsMapper implements Function2<ResponseActionsDTO, d, List<? extends ResponseActionsVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ResponseActionsVO> invoke(@NotNull ResponseActionsDTO state, @NotNull d widgetInfo) {
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Map<String, TokenizedTrackingInfo> trackingInfo2;
        Map<String, TokenizedTrackingInfo> trackingInfo3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        IconButtonV3DTO likeIconButton = state.getLikeIconButton();
        IconButtonV3DTO likeIconButtonTapped = state.getLikeIconButtonTapped();
        IconButtonV3DTO dislikeIconButton = state.getDislikeIconButton();
        IconButtonV3DTO dislikeIconButtonTapped = state.getDislikeIconButtonTapped();
        IconButtonV3DTO refreshIconButton = state.getRefreshIconButton();
        Map<String, TokenizedTrackingInfo> trackingInfo4 = state.getTrackingInfo();
        t tVar = null;
        t mapToTokenizedEvent$default = trackingInfo4 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo4, Long.valueOf(hashCode), null, 2, null) : null;
        CommonControlSettings common2 = state.getLikeIconButton().getCommon();
        t tokenizedEvent$default = (common2 == null || (trackingInfo3 = common2.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo3, Long.valueOf(hashCode), null, 2, null);
        CommonControlSettings common3 = state.getDislikeIconButton().getCommon();
        t tokenizedEvent$default2 = (common3 == null || (trackingInfo2 = common3.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null);
        IconButtonV3DTO refreshIconButton2 = state.getRefreshIconButton();
        if (refreshIconButton2 != null && (common = refreshIconButton2.getCommon()) != null && (trackingInfo = common.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        }
        return C7714v.a0(new ResponseActionsVO(hashCode, likeIconButton, likeIconButtonTapped, dislikeIconButton, dislikeIconButtonTapped, refreshIconButton, mapToTokenizedEvent$default, tokenizedEvent$default, tokenizedEvent$default2, tVar));
    }
}
