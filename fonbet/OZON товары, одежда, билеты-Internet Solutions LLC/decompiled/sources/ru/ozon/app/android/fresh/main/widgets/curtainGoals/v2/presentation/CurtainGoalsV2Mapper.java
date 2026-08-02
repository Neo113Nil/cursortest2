package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation;

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
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.data.CurtainGoalsV2DTO;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation.CurtainGoalsV2VO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/data/CurtainGoalsV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/data/CurtainGoalsV2DTO;J)Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO$ProgressState;", "mapProgressState", "(Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/data/CurtainGoalsV2DTO;)Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO$ProgressState;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/data/CurtainGoalsV2DTO;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CurtainGoalsV2Mapper implements Function2<CurtainGoalsV2DTO, d, List<? extends CurtainGoalsV2VO>> {
    private final CurtainGoalsV2VO.ProgressState mapProgressState(CurtainGoalsV2DTO curtainGoalsV2DTO) {
        Integer progress = curtainGoalsV2DTO.getProgress();
        if (progress == null) {
            return null;
        }
        int intValue = progress.intValue();
        TextDTO progressText = curtainGoalsV2DTO.getProgressText();
        if (progressText == null) {
            return null;
        }
        return new CurtainGoalsV2VO.ProgressState(intValue, progressText);
    }

    private final CurtainGoalsV2VO toVO(CurtainGoalsV2DTO curtainGoalsV2DTO, long j11) {
        String image = curtainGoalsV2DTO.getImage();
        TextDTO title = curtainGoalsV2DTO.getTitle();
        TextDTO description = curtainGoalsV2DTO.getDescription();
        BadgeDTO badge = curtainGoalsV2DTO.getBadge();
        CurtainGoalsV2VO.ProgressState mapProgressState = mapProgressState(curtainGoalsV2DTO);
        ButtonV3DTO largeButton = curtainGoalsV2DTO.getLargeButton();
        ButtonV3DTO termsButton = curtainGoalsV2DTO.getTermsButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = curtainGoalsV2DTO.getTrackingInfo();
        return new CurtainGoalsV2VO(j11, image, title, description, badge, mapProgressState, largeButton, termsButton, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CurtainGoalsV2VO> invoke(@NotNull CurtainGoalsV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }
}
