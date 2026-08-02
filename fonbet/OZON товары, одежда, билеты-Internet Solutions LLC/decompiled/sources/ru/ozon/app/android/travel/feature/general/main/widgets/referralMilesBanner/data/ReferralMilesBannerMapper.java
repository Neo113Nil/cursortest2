package ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.data;

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
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.presentation.ReferralMilesBannerVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/data/ReferralMilesBannerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/data/ReferralMilesBannerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/presentation/ReferralMilesBannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/data/ReferralMilesBannerDTO;Ll20/d;)Ljava/util/List;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReferralMilesBannerMapper implements Function2<ReferralMilesBannerDTO, d, List<? extends ReferralMilesBannerVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReferralMilesBannerVO> invoke(@NotNull ReferralMilesBannerDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        String backgroundToken = state.getBackgroundToken();
        ImageDTO image = state.getImage();
        TextDTO bannerTitle = state.getBannerTitle();
        TextDTO userTitle = state.getUserTitle();
        TextDTO userSubtitle = state.getUserSubtitle();
        TextDTO referralTitle = state.getReferralTitle();
        TextDTO referralSubtitle = state.getReferralSubtitle();
        ProgressBar progressBar = state.getProgressBar();
        String progressBackgroundColor = state.getProgressBackgroundColor();
        TextDTO expectedMilesTitle = state.getExpectedMilesTitle();
        IconDTO expectedMilesIcon = state.getExpectedMilesIcon();
        ButtonV3DTO shareButton = state.getShareButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tVar = null;
        if (trackingInfo != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            hashCode = hashCode;
        }
        return C7714v.a0(new ReferralMilesBannerVO(hashCode, title, backgroundToken, image, bannerTitle, userTitle, userSubtitle, referralTitle, referralSubtitle, progressBar, progressBackgroundColor, expectedMilesTitle, expectedMilesIcon, shareButton, tVar));
    }
}
