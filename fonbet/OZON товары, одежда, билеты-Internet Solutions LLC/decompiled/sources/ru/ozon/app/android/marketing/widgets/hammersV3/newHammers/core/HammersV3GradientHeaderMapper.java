package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core;

import Bk.C2638a;
import android.content.Context;
import android.graphics.Color;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.GradientTitleDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3GradientHeaderDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.RightBadge;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.GradientTitleVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3GradientHeaderVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3TimerBadgeVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001c2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u001cB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\r\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3GradientHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3GradientHeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3GradientHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "id", "toVO", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3GradientHeaderDTO;J)Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3GradientHeaderVO;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/GradientTitleDTO;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/GradientTitleVO;", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/GradientTitleDTO;)Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/GradientTitleVO;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/RightBadge;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3TimerBadgeVO;", "toVo", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/RightBadge;)Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3TimerBadgeVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3GradientHeaderDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersV3GradientHeaderMapper implements Function2<HammersV3GradientHeaderDTO, d, List<? extends HammersV3GradientHeaderVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3GradientHeaderMapper$Companion;", "", "<init>", "()V", "MILLISECONDS_TO_SECONDS", "", "BADGE_MAX_LENGTH", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HammersV3GradientHeaderMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final HammersV3GradientHeaderVO toVO(HammersV3GradientHeaderDTO hammersV3GradientHeaderDTO, long j11) {
        GradientTitleVO vo = toVO(hammersV3GradientHeaderDTO.getTitle());
        TextDTO subtitle = hammersV3GradientHeaderDTO.getSubtitle();
        TextDTO infoText = hammersV3GradientHeaderDTO.getInfoText();
        RightBadge rightBadge = hammersV3GradientHeaderDTO.getRightBadge();
        HammersV3TimerBadgeVO vo2 = rightBadge != null ? toVo(rightBadge) : null;
        IconButtonV3DTO infoButton = hammersV3GradientHeaderDTO.getInfoButton();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(hammersV3GradientHeaderDTO.getAction(), hammersV3GradientHeaderDTO.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = hammersV3GradientHeaderDTO.getTrackingInfo();
        return new HammersV3GradientHeaderVO(j11, vo, subtitle, infoText, vo2, infoButton, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final HammersV3TimerBadgeVO toVo(RightBadge rightBadge) {
        TextDTO badgeText;
        OzonSpannableString text;
        TextDTO textDTO;
        OzonSpannableString text2;
        long a11 = C2638a.a();
        Long secondsLeft = rightBadge.getSecondsLeft();
        Long valueOf = secondsLeft != null ? Long.valueOf(secondsLeft.longValue() * 1000) : null;
        long longValue = a11 + (valueOf != null ? valueOf.longValue() : 0L);
        TextDTO badgeText2 = rightBadge.getBadgeText();
        boolean z11 = false;
        if (((badgeText2 == null || (text2 = badgeText2.getText()) == null) ? 0 : text2.length()) > 1000) {
            TextDTO badgeText3 = rightBadge.getBadgeText();
            if (badgeText3 != null) {
                badgeText = TextDTO.copy$default(badgeText3, OzonSpannableStringKt.toOzonSpannableString(rightBadge.getBadgeText().getText().subSequence(0, 1000).toString()), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
                textDTO = badgeText;
            }
            textDTO = null;
        } else {
            TextDTO badgeText4 = rightBadge.getBadgeText();
            if (badgeText4 != null && (text = badgeText4.getText()) != null && text.length() == 0) {
                z11 = true;
            }
            if (!z11 || rightBadge.getSecondsLeft() != null) {
                badgeText = rightBadge.getBadgeText();
                textDTO = badgeText;
            }
            textDTO = null;
        }
        Long secondsLeft2 = rightBadge.getSecondsLeft();
        TextDTO onExpiredText = rightBadge.getOnExpiredText();
        return new HammersV3TimerBadgeVO(longValue, secondsLeft2, onExpiredText != null ? TextDTO.copy$default(onExpiredText, null, null, null, null, null, null, null, null, rightBadge.getLeftTextColor(), null, null, null, null, false, null, null, null, null, null, 524031, null) : null, textDTO, rightBadge.getLeftBgColor(), rightBadge.getRightBgColor(), rightBadge.getLeftTextColor(), rightBadge.getRightTextColor(), rightBadge.getChevron(), this.context.getResources().getDisplayMetrics().widthPixels);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HammersV3GradientHeaderVO> invoke(@NotNull HammersV3GradientHeaderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, state.hashCode()));
    }

    private final GradientTitleVO toVO(GradientTitleDTO gradientTitleDTO) {
        return new GradientTitleVO(gradientTitleDTO.getText(), C7714v.b0(Integer.valueOf(Color.parseColor(gradientTitleDTO.getLeftColor())), Integer.valueOf(Color.parseColor(gradientTitleDTO.getRightColor()))));
    }
}
