package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core;

import WZ.t;
import d00.C6020f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.data.AvatarAchievementsDTO;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation.AvatarAchievementsDefaults;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation.AvatarAchievementsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\n\u001a\u00020\r*\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000e\u001a\u0015\u0010\n\u001a\u00020\u0010*\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "AvatarAchievementsComposeWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AvatarDTO;", "", "id", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AvatarVO;", "toVO", "(Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AvatarDTO;J)Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AvatarVO;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AchievementDTO;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AchievementVO;", "(Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AchievementDTO;J)Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$AchievementVO;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$PaddingsDTO;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$PaddingsVO;", "(Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$PaddingsDTO;)Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO$PaddingsVO;", "LA00/a;", "composerEvent", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AvatarAchievementsComposeWidgetKt {
    @NotNull
    public static final i AvatarAchievementsComposeWidget(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("rpProduct", "avatarAchievements", null, new AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1(jsonDeserializer), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final AvatarAchievementsVO.AvatarVO toVO(AvatarAchievementsDTO.AvatarDTO avatarDTO, long j11) {
        AtomAction atomAction;
        String str;
        t tVar;
        boolean z11;
        IconDTO icon = avatarDTO.getIcon();
        AtomActionDTO clickAction = avatarDTO.getClickAction();
        if (clickAction != null) {
            atomAction = AtomActionMapperKt.toAtomAction(clickAction, avatarDTO.getTracking());
            str = null;
        } else {
            atomAction = null;
            str = null;
        }
        BadgeDTO badge = avatarDTO.getBadge();
        Boolean isTopAuthor = avatarDTO.isTopAuthor();
        boolean booleanValue = isTopAuthor != null ? isTopAuthor.booleanValue() : false;
        Map<String, TokenizedTrackingInfo> tracking = avatarDTO.getTracking();
        if (tracking != null) {
            t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(tracking, Long.valueOf(j11), str, 2, str);
            z11 = booleanValue;
            tVar = mapToTokenizedEvent$default;
        } else {
            boolean z12 = booleanValue;
            tVar = str;
            z11 = z12;
        }
        return new AvatarAchievementsVO.AvatarVO(icon, atomAction, badge, z11, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AvatarAchievementsVO.AchievementVO toVO(AvatarAchievementsDTO.AchievementDTO achievementDTO, long j11) {
        ImageDTO defaultImage = achievementDTO.getDefaultImage();
        ImageDTO darkThemeImage = achievementDTO.getDarkThemeImage();
        BadgeDTO counter = achievementDTO.getCounter();
        TooltipDTO tooltip = achievementDTO.getTooltip();
        String tooltipKey = achievementDTO.getTooltipKey();
        String counterStrokeColor = achievementDTO.getCounterStrokeColor();
        if (counterStrokeColor == null) {
            counterStrokeColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        AtomActionDTO clickAction = achievementDTO.getClickAction();
        AtomAction atomAction = clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, achievementDTO.getTracking()) : null;
        Map<String, TokenizedTrackingInfo> tracking = achievementDTO.getTracking();
        return new AvatarAchievementsVO.AchievementVO(defaultImage, darkThemeImage, counter, tooltip, tooltipKey, counterStrokeColor, atomAction, tracking != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(tracking, Long.valueOf(j11), null, 2, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AvatarAchievementsVO.PaddingsVO toVO(AvatarAchievementsDTO.PaddingsDTO paddingsDTO) {
        Paddings intersectionPadding;
        Paddings rightPadding;
        Paddings leftPadding;
        return new AvatarAchievementsVO.PaddingsVO((paddingsDTO == null || (leftPadding = paddingsDTO.getLeftPadding()) == null) ? AvatarAchievementsDefaults.INSTANCE.m1461getSTART_PADDINGD9Ej5fM() : leftPadding.m1867getDpD9Ej5fM(), (paddingsDTO == null || (rightPadding = paddingsDTO.getRightPadding()) == null) ? AvatarAchievementsDefaults.INSTANCE.m1459getEND_PADDINGD9Ej5fM() : rightPadding.m1867getDpD9Ej5fM(), (paddingsDTO == null || (intersectionPadding = paddingsDTO.getIntersectionPadding()) == null) ? AvatarAchievementsDefaults.INSTANCE.m1460getOVERLAP_PADDINGD9Ej5fM() : intersectionPadding.m1867getDpD9Ej5fM(), null);
    }
}
