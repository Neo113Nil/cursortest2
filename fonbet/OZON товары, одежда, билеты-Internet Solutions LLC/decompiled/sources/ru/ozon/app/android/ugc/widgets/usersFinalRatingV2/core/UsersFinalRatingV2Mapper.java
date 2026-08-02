package ru.ozon.app.android.ugc.widgets.usersFinalRatingV2.core;

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
import ru.ozon.app.android.ugc.widgets.usersFinalRatingV2.data.UsersFinalRatingV2DTO;
import ru.ozon.app.android.ugc.widgets.usersFinalRatingV2.presentation.UsersFinalRatingV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersFinalRatingV2/core/UsersFinalRatingV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/usersFinalRatingV2/data/UsersFinalRatingV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/usersFinalRatingV2/presentation/UsersFinalRatingV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/usersFinalRatingV2/data/UsersFinalRatingV2DTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UsersFinalRatingV2Mapper implements Function2<UsersFinalRatingV2DTO, d, List<? extends UsersFinalRatingV2VO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<UsersFinalRatingV2VO> invoke(@NotNull UsersFinalRatingV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO value = state.getValue();
        RatingDTO rating = state.getRating();
        TextDTO ratingSubtitle = state.getRatingSubtitle();
        IconDTO icon = state.getIcon();
        AtomActionDTO clickAction = state.getClickAction();
        AtomAction atomAction = clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, state.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new UsersFinalRatingV2VO(hashCode, value, rating, ratingSubtitle, icon, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
