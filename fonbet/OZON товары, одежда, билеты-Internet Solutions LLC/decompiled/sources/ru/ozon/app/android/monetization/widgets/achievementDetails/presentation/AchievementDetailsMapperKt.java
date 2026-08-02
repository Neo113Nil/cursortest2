package ru.ozon.app.android.monetization.widgets.achievementDetails.presentation;

import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.achievementDetails.data.AchievementDetailsDTO;
import ru.ozon.app.android.monetization.widgets.achievementDetails.presentation.AchievementDetailsVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\t\u001a\u0013\u0010\u0005\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO;", "toVO", "(Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO;Ll20/d;)Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO;", "Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$LevelDTO;", "Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$LevelVO;", "(Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$LevelDTO;)Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$LevelVO;", "Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$ImagesDTO;", "Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$ImagesVO;", "(Lru/ozon/app/android/monetization/widgets/achievementDetails/data/AchievementDetailsDTO$ImagesDTO;)Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$ImagesVO;", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AchievementDetailsMapperKt {
    @NotNull
    public static final AchievementDetailsVO toVO(@NotNull AchievementDetailsDTO achievementDetailsDTO, @NotNull d info) {
        Intrinsics.checkNotNullParameter(achievementDetailsDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        TextDTO title = achievementDetailsDTO.getTitle();
        TextDTO subtitle = achievementDetailsDTO.getSubtitle();
        AchievementDetailsVO.ImagesVO vo = toVO(achievementDetailsDTO.getImages());
        AchievementDetailsDTO.LevelDTO level = achievementDetailsDTO.getLevel();
        AchievementDetailsVO.LevelVO vo2 = level != null ? toVO(level) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = achievementDetailsDTO.getTrackingInfo();
        return new AchievementDetailsVO(hashCode, title, subtitle, vo, vo2, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
    }

    private static final AchievementDetailsVO.LevelVO toVO(AchievementDetailsDTO.LevelDTO levelDTO) {
        return new AchievementDetailsVO.LevelVO(levelDTO.getBackgroundColor(), levelDTO.getBorderColor(), levelDTO.getText());
    }

    private static final AchievementDetailsVO.ImagesVO toVO(AchievementDetailsDTO.ImagesDTO imagesDTO) {
        return new AchievementDetailsVO.ImagesVO(imagesDTO.getDefaultImageLink(), imagesDTO.getDarkThemeImageLink());
    }
}
