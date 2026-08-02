package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVOKt;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorAtomDTO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenDTO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001e2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u001eB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0012\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0017J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0003j\u0002`\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO;", "Ll20/d;", "", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBlockDTO;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$UpdateProgressAnimation;", "mapToProgressAnimation", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBlockDTO;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$UpdateProgressAnimation;", "", "widgetId", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "map", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$ProgressBlockDTO;J)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$LootboxItemDTO;", "id", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$Lootbox;", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO$LootboxItemDTO;J)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$Lootbox;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenMapper implements Function2<MainDrawMajorScreenDTO, d, List<? extends MainDrawMajorScreenVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenMapper$Companion;", "", "<init>", "()V", "SIDEBAR_MAX_ITEMS_COUNT", "", "MAX_DISPLAY_WIDTH_PIXELS_FOR_ANIM_SHOW", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MainDrawMajorScreenMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final MainDrawMajorScreenVO.ProgressBlock map(MainDrawMajorScreenDTO.ProgressBlockDTO progressBlockDTO, long j11) {
        if (progressBlockDTO.getProgressBar() == null) {
            String infoText = progressBlockDTO.getInfoText();
            String centralText = progressBlockDTO.getCentralText();
            AtomActionDTO progressBarAction = progressBlockDTO.getProgressBarAction();
            AtomAction atomAction = progressBarAction != null ? AtomActionMapperKt.toAtomAction(progressBarAction, progressBlockDTO.getTrackingInfo()) : null;
            String infoIcon = progressBlockDTO.getInfoIcon();
            AtomActionDTO infoAction = progressBlockDTO.getInfoAction();
            AtomAction atomAction2 = infoAction != null ? AtomActionMapperKt.toAtomAction(infoAction, progressBlockDTO.getInfoTrackingInfo()) : null;
            Map<String, TokenizedTrackingInfo> infoTrackingInfo = progressBlockDTO.getInfoTrackingInfo();
            return new MainDrawMajorScreenVO.ProgressBlock.Empty(infoText, centralText, atomAction, infoIcon, atomAction2, infoTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(infoTrackingInfo, Long.valueOf(j11), null, 2, null) : null);
        }
        String infoText2 = progressBlockDTO.getInfoText();
        String centralText2 = progressBlockDTO.getCentralText();
        AtomActionDTO progressBarAction2 = progressBlockDTO.getProgressBarAction();
        AtomAction atomAction3 = progressBarAction2 != null ? AtomActionMapperKt.toAtomAction(progressBarAction2, progressBlockDTO.getTrackingInfo()) : null;
        String infoIcon2 = progressBlockDTO.getInfoIcon();
        AtomActionDTO infoAction2 = progressBlockDTO.getInfoAction();
        AtomAction atomAction4 = infoAction2 != null ? AtomActionMapperKt.toAtomAction(infoAction2, progressBlockDTO.getInfoTrackingInfo()) : null;
        MainDrawMajorScreenVO.ProgressBar progressBar = new MainDrawMajorScreenVO.ProgressBar(progressBlockDTO.getProgressBar().getPercent(), progressBlockDTO.getProgressBar().getText(), progressBlockDTO.getProgressBar().getIcon());
        String leftImage = progressBlockDTO.getLeftImage();
        String rightFinalText = progressBlockDTO.getRightFinalText();
        Map<String, TokenizedTrackingInfo> trackingInfo = progressBlockDTO.getTrackingInfo();
        return new MainDrawMajorScreenVO.ProgressBlock.Progress(infoText2, centralText2, atomAction3, infoIcon2, atomAction4, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, progressBar, leftImage, rightFinalText);
    }

    private final MainDrawMajorScreenVO.UpdateProgressAnimation mapToProgressAnimation(MainDrawMajorScreenDTO.ProgressBlockDTO progressBlockDTO) {
        boolean z11 = UiExtKt.toDp(this.context.getResources().getDisplayMetrics().widthPixels) <= 505;
        MainDrawMajorScreenDTO.ProgressBarDTO progressBar = progressBlockDTO.getProgressBar();
        if ((progressBar != null ? progressBar.getAnimationTime() : null) == null || progressBlockDTO.getProgressBar().getActionProgress() == null || !z11) {
            return null;
        }
        return new MainDrawMajorScreenVO.UpdateProgressAnimation(TimeUnit.SECONDS.toMillis(progressBlockDTO.getProgressBar().getAnimationTime().intValue()), AtomActionMapperKt.toAtomAction(progressBlockDTO.getProgressBar().getActionProgress(), null));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MainDrawMajorScreenVO> invoke(@NotNull MainDrawMajorScreenDTO state, @NotNull d widgetInfo) {
        List list;
        List list2;
        List K02;
        List K03;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<MainDrawMajorScreenDTO.LootboxItemDTO> leftItems = state.getLeftItems();
        if (leftItems == null || (K03 = C7714v.K0(leftItems, 3)) == null) {
            list = K.f71697a;
        } else {
            List list3 = K03;
            list = new ArrayList(C7714v.z(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                list.add(map((MainDrawMajorScreenDTO.LootboxItemDTO) it.next(), hashCode));
            }
        }
        List<MainDrawMajorScreenDTO.LootboxItemDTO> rightItems = state.getRightItems();
        if (rightItems == null || (K02 = C7714v.K0(rightItems, 3)) == null) {
            list2 = K.f71697a;
        } else {
            List list4 = K02;
            list2 = new ArrayList(C7714v.z(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                list2.add(map((MainDrawMajorScreenDTO.LootboxItemDTO) it2.next(), hashCode));
            }
        }
        List list5 = list2;
        String backgroundImage = state.getBackgroundImage();
        MainDrawMajorScreenVO.ProgressBlock map = map(state.getProgressBlock(), hashCode);
        MainDrawMajorScreenVO.UpdateProgressAnimation mapToProgressAnimation = mapToProgressAnimation(state.getProgressBlock());
        AtomActionDTO action = state.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new MainDrawMajorScreenVO(hashCode, backgroundImage, list, list5, map, mapToProgressAnimation, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }

    private final MainDrawMajorScreenVO.Lootbox map(MainDrawMajorScreenDTO.LootboxItemDTO lootboxItemDTO, long j11) {
        String image = lootboxItemDTO.getImage();
        IndicatorAtomDTO indicator = lootboxItemDTO.getIndicator();
        if (indicator != null) {
            indicator.setSize(IndicatorAtomDTO.Size.SMALL);
        } else {
            indicator = null;
        }
        MorkovskCurrencyBadgeDTO badgeCounter = lootboxItemDTO.getBadgeCounter();
        MorkovskCurrencyBadgeVO map = badgeCounter != null ? MorkovskCurrencyBadgeVOKt.map(badgeCounter, MorkovskCurrencyBadgeVO.Size.SMALL) : null;
        Boolean isSingleImage = lootboxItemDTO.isSingleImage();
        boolean booleanValue = isSingleImage != null ? isSingleImage.booleanValue() : false;
        String bottomImage = lootboxItemDTO.getBottomImage();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(lootboxItemDTO.getAction(), lootboxItemDTO.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = lootboxItemDTO.getTrackingInfo();
        return new MainDrawMajorScreenVO.Lootbox(image, indicator, map, booleanValue, bottomImage, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
