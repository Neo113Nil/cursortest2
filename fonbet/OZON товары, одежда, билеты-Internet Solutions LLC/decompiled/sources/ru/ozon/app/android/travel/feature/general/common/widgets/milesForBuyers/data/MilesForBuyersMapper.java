package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.imageprefetch.PrefetchUtilsKt;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data.MilesForBuyersDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007BG\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "bannerBackgroundImagePrefetcher", "bannerRightImagePrefetcher", "progressBarImagePrefetcher", "cardImagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "state", "", "asyncData", "mapState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressDTO;", "progressDTO", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$ProgressState$Progress;", "mapProgress", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$ProgressState$Progress;", "", "prefetchImages", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO;)V", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersMapper implements Function2<MilesForBuyersDTO, d, List<? extends MilesForBuyersVO>>, AsyncWidgetStateMapper<MilesForBuyersDTO, MilesForBuyersVO.State> {

    @NotNull
    private final ImagePrefetcher<ImageDTO> bannerBackgroundImagePrefetcher;

    @NotNull
    private final ImagePrefetcher<ImageDTO> bannerRightImagePrefetcher;

    @NotNull
    private final ImagePrefetcher<ImageDTO> cardImagePrefetcher;

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<ImageDTO> progressBarImagePrefetcher;

    public MilesForBuyersMapper(@NotNull Context context, @NotNull ImagePrefetcher<ImageDTO> bannerBackgroundImagePrefetcher, @NotNull ImagePrefetcher<ImageDTO> bannerRightImagePrefetcher, @NotNull ImagePrefetcher<ImageDTO> progressBarImagePrefetcher, @NotNull ImagePrefetcher<ImageDTO> cardImagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bannerBackgroundImagePrefetcher, "bannerBackgroundImagePrefetcher");
        Intrinsics.checkNotNullParameter(bannerRightImagePrefetcher, "bannerRightImagePrefetcher");
        Intrinsics.checkNotNullParameter(progressBarImagePrefetcher, "progressBarImagePrefetcher");
        Intrinsics.checkNotNullParameter(cardImagePrefetcher, "cardImagePrefetcher");
        this.context = context;
        this.bannerBackgroundImagePrefetcher = bannerBackgroundImagePrefetcher;
        this.bannerRightImagePrefetcher = bannerRightImagePrefetcher;
        this.progressBarImagePrefetcher = progressBarImagePrefetcher;
        this.cardImagePrefetcher = cardImagePrefetcher;
    }

    private final MilesForBuyersVO.State.ProgressState.Progress mapProgress(MilesForBuyersDTO.ProgressDTO progressDTO) {
        return new MilesForBuyersVO.State.ProgressState.Progress(progressDTO.getProgressBar(), progressDTO.getBackgroundColor(), progressDTO.getDarkBackgroundColor());
    }

    private final MilesForBuyersVO.State mapState(MilesForBuyersDTO state, String asyncData) {
        AtomActionDTO action;
        prefetchImages(state);
        r1 = null;
        AtomAction atomAction = null;
        if (state.getContent().getBanner() != null) {
            MilesForBuyersDTO.BannerDTO banner = state.getContent().getBanner();
            TextDTO title = banner.getTitle();
            title.setTagSupported(true);
            ButtonV3DTO actionButton = banner.getActionButton();
            ImageDTO backgroundImage = banner.getBackgroundImage();
            ImageDTO rightImage = banner.getRightImage();
            CommonControlSettings common = banner.getActionButton().getCommon();
            if (common != null && (action = common.getAction()) != null) {
                CommonControlSettings common2 = banner.getActionButton().getCommon();
                atomAction = AtomActionMapperKt.toAtomAction(action, common2 != null ? common2.getTrackingInfo() : null);
            }
            return new MilesForBuyersVO.State.BannerState(title, actionButton, backgroundImage, rightImage, atomAction, banner.getTrackingInfo(), asyncData, state.getAsyncParameters());
        }
        if (state.getContent().getProgressBar() != null) {
            MilesForBuyersDTO.ProgressBarDTO progressBar = state.getContent().getProgressBar();
            TextDTO title2 = progressBar.getTitle();
            title2.setTagSupported(true);
            TextDTO subtitle = progressBar.getSubtitle();
            subtitle.setTagSupported(true);
            BadgeDTO subtitleBadge = progressBar.getSubtitleBadge();
            MilesForBuyersVO.State.ProgressState.Progress mapProgress = mapProgress(progressBar.getProgressBar());
            TextDTO progressBarDescription = progressBar.getProgressBarDescription();
            ImageDTO rightImage2 = progressBar.getRightImage();
            String borderColor = progressBar.getBorderColor();
            AtomActionDTO action2 = progressBar.getCommon().getAction();
            return new MilesForBuyersVO.State.ProgressState(title2, subtitle, subtitleBadge, mapProgress, progressBarDescription, rightImage2, borderColor, action2 != null ? AtomActionMapperKt.toAtomAction(action2, progressBar.getCommon().getTrackingInfo()) : null, progressBar.getCommon().getTrackingInfo());
        }
        if (state.getContent().getCard() == null) {
            throw new IllegalStateException("No supported state provided");
        }
        MilesForBuyersDTO.CardDTO card = state.getContent().getCard();
        ImageDTO image = card.getImage();
        TextDTO title3 = card.getTitle();
        TextDTO subtitle2 = card.getSubtitle();
        ButtonV3DTO actionButton2 = card.getActionButton();
        String backgroundColor = card.getBackgroundColor();
        String borderColor2 = card.getBorderColor();
        boolean z11 = card.getWithAnimation() != null;
        AtomActionDTO action3 = card.getCommon().getAction();
        return new MilesForBuyersVO.State.CardState(image, title3, subtitle2, actionButton2, backgroundColor, borderColor2, z11, action3 != null ? AtomActionMapperKt.toAtomAction(action3, card.getCommon().getTrackingInfo()) : null, card.getCommon().getTrackingInfo(), asyncData, state.getAsyncParameters());
    }

    static /* synthetic */ MilesForBuyersVO.State mapState$default(MilesForBuyersMapper milesForBuyersMapper, MilesForBuyersDTO milesForBuyersDTO, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return milesForBuyersMapper.mapState(milesForBuyersDTO, str);
    }

    private final void prefetchImages(MilesForBuyersDTO milesForBuyersDTO) {
        MilesForBuyersDTO.BannerDTO banner = milesForBuyersDTO.getContent().getBanner();
        if (banner != null) {
            PrefetchUtilsKt.prefetchImage(this.context, banner.getBackgroundImage(), this.bannerBackgroundImagePrefetcher);
            PrefetchUtilsKt.prefetchImage(this.context, banner.getRightImage(), this.bannerRightImagePrefetcher);
        }
        MilesForBuyersDTO.ProgressBarDTO progressBar = milesForBuyersDTO.getContent().getProgressBar();
        if (progressBar != null) {
            PrefetchUtilsKt.prefetchImage(this.context, progressBar.getRightImage(), this.progressBarImagePrefetcher);
        }
        MilesForBuyersDTO.CardDTO card = milesForBuyersDTO.getContent().getCard();
        if (card != null) {
            PrefetchUtilsKt.prefetchImage(this.context, card.getImage(), this.cardImagePrefetcher);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MilesForBuyersVO> invoke(@NotNull MilesForBuyersDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new MilesForBuyersVO(widgetInfo.d().hashCode(), mapState(state, widgetInfo.c().a())));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public MilesForBuyersVO.State mapAsyncState(@NotNull MilesForBuyersDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapState$default(this, state, null, 2, null);
    }
}
