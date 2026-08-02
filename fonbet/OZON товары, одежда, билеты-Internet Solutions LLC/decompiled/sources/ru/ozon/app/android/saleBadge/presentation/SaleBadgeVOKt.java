package ru.ozon.app.android.saleBadge.presentation;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.common.ugc.timer.TimerDTO;
import ru.ozon.app.android.saleBadge.data.SaleBadgeDTO;
import ru.ozon.app.android.saleBadge.presentation.SaleBadgeVO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVOKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u0014\u0010\u000b\u001a\u00020\b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"toVo", "Lru/ozon/app/android/saleBadge/presentation/SaleBadgeVO;", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO;", "widgetId", "", "index", "", "calculateTimerForMeasure", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "hasBgAnim", "", "toTimerVo", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Timer;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaleBadgeVOKt {
    private static final TimerVO calculateTimerForMeasure(TimerVO timerVO, boolean z11) {
        return TimerVO.copy$default(timerVO, null, null, null, timerVO.getTimeDelta() + 1000 + (z11 ? 1800 : 0), null, null, 55, null);
    }

    private static final TimerVO toTimerVo(SaleBadgeDTO.Timer timer, TextDTO textDTO) {
        return TimerVOKt.toVo(new TimerDTO(textDTO, timer.getServerTimestamp(), timer.getDateEnd(), null, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0229, code lost:
    
        if (r0 == null) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SaleBadgeVO toVo(@NotNull SaleBadgeDTO saleBadgeDTO, long j11, int i11) {
        String str;
        String str2;
        float f7;
        String str3;
        TextDTO textDTO;
        TimerVO timerVO;
        SaleBadgeVO.BackgroundOverlay backgroundOverlay;
        TestInfo testInfo;
        t tVar;
        SaleBadgeVO.LabelAnimation labelAnimation;
        SaleBadgeDTO.AnimationFrames.LabelFrame animationLabelFrame;
        SaleBadgeDTO saleBadgeDTO2;
        TimerVO timerVO2;
        TimerVO timerVO3;
        SaleBadgeDTO.AnimationFrames.BGOverlayFrame animationBGFrame;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(saleBadgeDTO, "<this>");
        SaleBadgeDTO.BadgeSize size = saleBadgeDTO.getSize();
        SaleBadgeDTO.BadgeSize badgeSize = SaleBadgeDTO.BadgeSize.SIZE_400;
        String id2 = (size == badgeSize ? UniTheme.INSTANCE.getTypographyTokens().getBodyControl300XSmall() : UniTheme.INSTANCE.getTypographyTokens().getBodyControl400Small()).getId();
        String id3 = (saleBadgeDTO.getSize() == badgeSize ? UniTheme.INSTANCE.getTypographyTokens().getBodyNumeric300XSmall() : UniTheme.INSTANCE.getTypographyTokens().getBodyNumeric400Small()).getId();
        float m1848getDp20D9Ej5fM = saleBadgeDTO.getSize() == badgeSize ? DsSpacings.INSTANCE.m1848getDp20D9Ej5fM() : DsSpacings.INSTANCE.m1850getDp24D9Ej5fM();
        CornerRadius cornerRadius = saleBadgeDTO.getSize() == badgeSize ? CornerRadius.RADIUS_250 : CornerRadius.RADIUS_300;
        float m1847getDp2D9Ej5fM = saleBadgeDTO.getSize() == badgeSize ? DsSpacings.INSTANCE.m1847getDp2D9Ej5fM() : DsSpacings.INSTANCE.m1854getDp4D9Ej5fM();
        float m1838getDp0D9Ej5fM = saleBadgeDTO.getSize() == badgeSize ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : DsSpacings.INSTANCE.m1847getDp2D9Ej5fM();
        float m1859getDp6D9Ej5fM = saleBadgeDTO.getSize() == badgeSize ? saleBadgeDTO.getLeftIcon() == null ? DsSpacings.INSTANCE.m1859getDp6D9Ej5fM() : DsSpacings.INSTANCE.m1854getDp4D9Ej5fM() : saleBadgeDTO.getLeftIcon() == null ? DsSpacings.INSTANCE.m1861getDp8D9Ej5fM() : DsSpacings.INSTANCE.m1859getDp6D9Ej5fM();
        float m1859getDp6D9Ej5fM2 = saleBadgeDTO.getSize() == badgeSize ? saleBadgeDTO.getRightIcon() == null ? DsSpacings.INSTANCE.m1859getDp6D9Ej5fM() : DsSpacings.INSTANCE.m1847getDp2D9Ej5fM() : saleBadgeDTO.getRightIcon() == null ? DsSpacings.INSTANCE.m1861getDp8D9Ej5fM() : DsSpacings.INSTANCE.m1847getDp2D9Ej5fM();
        String str4 = "saleBadge_" + i11 + j11;
        TextDTO vo$createSaleTextDTO = toVo$createSaleTextDTO(saleBadgeDTO, id3, id2, saleBadgeDTO.getText(), false);
        SaleBadgeDTO.Timer timer = saleBadgeDTO.getTimer();
        if (timer != null) {
            str = id2;
            str2 = id3;
            str3 = str4;
            textDTO = vo$createSaleTextDTO;
            f7 = m1848getDp20D9Ej5fM;
            timerVO = toTimerVo(timer, toVo$createSaleTextDTO$default(saleBadgeDTO, str2, str, null, true, 8, null));
        } else {
            str = id2;
            str2 = id3;
            f7 = m1848getDp20D9Ej5fM;
            str3 = str4;
            textDTO = vo$createSaleTextDTO;
            timerVO = null;
        }
        CommonAtomIconDTO leftIcon = saleBadgeDTO.getLeftIcon();
        CommonAtomIconDTO rightIcon = saleBadgeDTO.getRightIcon();
        String color = saleBadgeDTO.getBackground().getColor();
        SaleBadgeDTO.BackgroundOverlay backgroundOverlay2 = saleBadgeDTO.getBackgroundOverlay();
        if (backgroundOverlay2 != null) {
            String color2 = backgroundOverlay2.getColor();
            String darkColor = backgroundOverlay2.getDarkColor();
            if (darkColor == null) {
                darkColor = backgroundOverlay2.getColor();
            }
            backgroundOverlay = new SaleBadgeVO.BackgroundOverlay(color2, darkColor, backgroundOverlay2.getOverlayProgress() / 100.0f);
        } else {
            backgroundOverlay = null;
        }
        SaleBadgeVO.BadgeParams badgeParams = new SaleBadgeVO.BadgeParams(f7, cornerRadius, m1859getDp6D9Ej5fM, m1859getDp6D9Ej5fM2, m1847getDp2D9Ej5fM, m1838getDp0D9Ej5fM, null);
        SaleBadgeDTO.Common common = saleBadgeDTO.getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, saleBadgeDTO.getCommon().getTrackingInfo());
        SaleBadgeDTO.Common common2 = saleBadgeDTO.getCommon();
        if (common2 == null || (trackingInfo = common2.getTrackingInfo()) == null) {
            testInfo = null;
            tVar = null;
        } else {
            testInfo = null;
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        }
        SaleBadgeDTO.Common common3 = saleBadgeDTO.getCommon();
        TestInfo testInfo2 = common3 != null ? common3.getTestInfo() : testInfo;
        SaleBadgeDTO.AnimationFrames animationFrames = saleBadgeDTO.getAnimationFrames();
        Float valueOf = (animationFrames == null || (animationBGFrame = animationFrames.getAnimationBGFrame()) == null) ? testInfo : Float.valueOf(animationBGFrame.getOverlayProgress() / 100.0f);
        SaleBadgeDTO.AnimationFrames animationFrames2 = saleBadgeDTO.getAnimationFrames();
        if (animationFrames2 == null || (animationLabelFrame = animationFrames2.getAnimationLabelFrame()) == null) {
            labelAnimation = testInfo;
        } else {
            SaleBadgeDTO.Timer timer2 = animationLabelFrame.getTimer();
            if (timer2 != null) {
                saleBadgeDTO2 = saleBadgeDTO;
                timerVO2 = toTimerVo(timer2, toVo$createSaleTextDTO$default(saleBadgeDTO2, str2, str, null, true, 8, null));
            } else {
                saleBadgeDTO2 = saleBadgeDTO;
                timerVO2 = testInfo;
            }
            TextDTO vo$createSaleTextDTO2 = toVo$createSaleTextDTO(saleBadgeDTO2, str2, str, animationLabelFrame.getText(), false);
            if (timerVO2 != 0) {
                timerVO3 = calculateTimerForMeasure(timerVO2, saleBadgeDTO2.getAnimationFrames().getAnimationBGFrame() != null);
            }
            timerVO3 = timerVO2;
            labelAnimation = new SaleBadgeVO.LabelAnimation(vo$createSaleTextDTO2, timerVO2, timerVO3);
        }
        return new SaleBadgeVO(str3, textDTO, timerVO, leftIcon, rightIcon, color, backgroundOverlay, badgeParams, atomAction, tVar, testInfo2, valueOf, labelAnimation);
    }

    private static final TextDTO toVo$createSaleTextDTO(SaleBadgeDTO saleBadgeDTO, String str, String str2, String str3, boolean z11) {
        return new TextDTO(OzonSpannableStringKt.toOzonSpannableString(str3), null, null, null, null, null, TextPreset.PRESET_CUSTOM, z11 ? str : str2, saleBadgeDTO.getTextColor(), null, null, null, null, false, null, null, null, null, null, 523838, null);
    }

    static /* synthetic */ TextDTO toVo$createSaleTextDTO$default(SaleBadgeDTO saleBadgeDTO, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str3 = "";
        }
        return toVo$createSaleTextDTO(saleBadgeDTO, str, str2, str3, z11);
    }

    public static /* synthetic */ SaleBadgeVO toVo$default(SaleBadgeDTO saleBadgeDTO, long j11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return toVo(saleBadgeDTO, j11, i11);
    }
}
