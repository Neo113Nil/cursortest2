package ru.ozon.app.android.monetization.widgets.achievementsList.data;

import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.achievementsList.data.AchievementsListDTO;
import ru.ozon.app.android.monetization.widgets.achievementsList.presentation.AchievementVO;
import ru.ozon.app.android.monetization.widgets.achievementsList.presentation.AchievementsListAnalyticsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u0005*\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u000e\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0012\u001a\u0013\u0010\u000e\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u000e\u0010\u0015\u001a\u0013\u0010\u000e\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u000e\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO;", "toAchievementVOList", "(Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementsListAnalyticsVO;", "toAchievementsListAnalytics", "(Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;Ll20/d;)Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementsListAnalyticsVO;", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$AchievementDTO;", "", "index", "toVO", "(Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$AchievementDTO;Ll20/d;I)Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO;", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$LevelDTO;", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$LevelVO;", "(Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$LevelDTO;)Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$LevelVO;", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ProgressBarDTO;", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ProgressBarVO;", "(Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ProgressBarDTO;)Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ProgressBarVO;", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ImagesDTO;", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ImagesVO;", "(Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO$ImagesDTO;)Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ImagesVO;", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AchievementsListMapperKt {
    @NotNull
    public static final List<AchievementVO> toAchievementVOList(@NotNull AchievementsListDTO achievementsListDTO, @NotNull d info) {
        Intrinsics.checkNotNullParameter(achievementsListDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        List<AchievementsListDTO.AchievementDTO> achievements = achievementsListDTO.getAchievements();
        ArrayList arrayList = null;
        if (achievements != null) {
            List<AchievementsListDTO.AchievementDTO> list = achievements;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                arrayList2.add(toVO((AchievementsListDTO.AchievementDTO) obj, info, i11));
                i11 = i12;
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? K.f71697a : arrayList;
    }

    @NotNull
    public static final AchievementsListAnalyticsVO toAchievementsListAnalytics(@NotNull AchievementsListDTO achievementsListDTO, @NotNull d info) {
        Intrinsics.checkNotNullParameter(achievementsListDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = achievementsListDTO.getTrackingInfo();
        return new AchievementsListAnalyticsVO(hashCode, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
    }

    private static final AchievementVO toVO(AchievementsListDTO.AchievementDTO achievementDTO, d dVar, int i11) {
        AtomActionDTO action;
        long hashCode = (dVar.d() + achievementDTO.getTitle()).hashCode();
        AchievementVO.ImagesVO vo = toVO(achievementDTO.getImages());
        TextDTO title = achievementDTO.getTitle();
        AchievementsListDTO.LevelDTO level = achievementDTO.getLevel();
        AtomAction atomAction = null;
        AchievementVO.LevelVO vo2 = level != null ? toVO(level) : null;
        AchievementsListDTO.ProgressBarDTO progressBar = achievementDTO.getProgressBar();
        AchievementVO.ProgressBarVO vo3 = progressBar != null ? toVO(progressBar) : null;
        CommonControlSettings settings = achievementDTO.getSettings();
        if (settings != null && (action = settings.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, achievementDTO.getSettings().getTrackingInfo());
        }
        return new AchievementVO(hashCode, vo, title, vo2, vo3, atomAction, i11);
    }

    private static final AchievementVO.LevelVO toVO(AchievementsListDTO.LevelDTO levelDTO) {
        return new AchievementVO.LevelVO(levelDTO.getBackgroundColor(), levelDTO.getBorderColor(), levelDTO.getText());
    }

    private static final AchievementVO.ProgressBarVO toVO(AchievementsListDTO.ProgressBarDTO progressBarDTO) {
        return new AchievementVO.ProgressBarVO(progressBarDTO.getProgress() / 100.0f, progressBarDTO.getProgressGradient(), progressBarDTO.getProgressBackgroundColor());
    }

    private static final AchievementVO.ImagesVO toVO(AchievementsListDTO.ImagesDTO imagesDTO) {
        return new AchievementVO.ImagesVO(imagesDTO.getDefaultImageLink(), imagesDTO.getDarkThemeImageLink());
    }
}
