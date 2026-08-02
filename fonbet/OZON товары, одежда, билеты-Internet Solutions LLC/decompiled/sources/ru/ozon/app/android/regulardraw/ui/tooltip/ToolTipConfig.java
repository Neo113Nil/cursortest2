package ru.ozon.app.android.regulardraw.ui.tooltip;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig;", "", "tooltipText", "", "tooltipImg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTooltipText", "()Ljava/lang/String;", "getTooltipImg", "BasicOnboarding", "BottomViewOnboarding", "Warning", "Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig$BasicOnboarding;", "Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig$BottomViewOnboarding;", "Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig$Warning;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ToolTipConfig {

    @NotNull
    private final String tooltipImg;

    @NotNull
    private final String tooltipText;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig$BasicOnboarding;", "Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig;", "tooltipText", "", "tooltipImg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BasicOnboarding extends ToolTipConfig {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BasicOnboarding(@NotNull String tooltipText, @NotNull String tooltipImg) {
            super(tooltipText, tooltipImg, null);
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(tooltipImg, "tooltipImg");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig$BottomViewOnboarding;", "Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig;", "tooltipText", "", "tooltipImg", "leftCurrencyBadgeVO", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "rightCurrencyBadgeVO", "badgeSeparator", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;I)V", "getLeftCurrencyBadgeVO", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "getRightCurrencyBadgeVO", "getBadgeSeparator", "()I", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BottomViewOnboarding extends ToolTipConfig {
        public static final int $stable = AtomAction.$stable;
        private final int badgeSeparator;

        @NotNull
        private final MorkovskCurrencyBadgeVO leftCurrencyBadgeVO;

        @NotNull
        private final MorkovskCurrencyBadgeVO rightCurrencyBadgeVO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomViewOnboarding(@NotNull String tooltipText, @NotNull String tooltipImg, @NotNull MorkovskCurrencyBadgeVO leftCurrencyBadgeVO, @NotNull MorkovskCurrencyBadgeVO rightCurrencyBadgeVO, int i11) {
            super(tooltipText, tooltipImg, null);
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(tooltipImg, "tooltipImg");
            Intrinsics.checkNotNullParameter(leftCurrencyBadgeVO, "leftCurrencyBadgeVO");
            Intrinsics.checkNotNullParameter(rightCurrencyBadgeVO, "rightCurrencyBadgeVO");
            this.leftCurrencyBadgeVO = leftCurrencyBadgeVO;
            this.rightCurrencyBadgeVO = rightCurrencyBadgeVO;
            this.badgeSeparator = i11;
        }

        public final int getBadgeSeparator() {
            return this.badgeSeparator;
        }

        @NotNull
        public final MorkovskCurrencyBadgeVO getLeftCurrencyBadgeVO() {
            return this.leftCurrencyBadgeVO;
        }

        @NotNull
        public final MorkovskCurrencyBadgeVO getRightCurrencyBadgeVO() {
            return this.rightCurrencyBadgeVO;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig$Warning;", "Lru/ozon/app/android/regulardraw/ui/tooltip/ToolTipConfig;", "", "tooltipText", "tooltipImg", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lkotlin/jvm/functions/Function1;Lru/ozon/uni/atoms/data/TestInfo;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButtonV3DTO", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Warning extends ToolTipConfig {
        public static final int $stable = TestInfo.$stable | IconButtonV3DTO.$stable;

        @NotNull
        private final Function1<AtomAction, Unit> actionHandler;

        @NotNull
        private final IconButtonV3DTO iconButtonV3DTO;
        private final TestInfo testInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Warning(@NotNull String tooltipText, @NotNull String tooltipImg, @NotNull IconButtonV3DTO iconButtonV3DTO, @NotNull Function1<? super AtomAction, Unit> actionHandler, TestInfo testInfo) {
            super(tooltipText, tooltipImg, null);
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(tooltipImg, "tooltipImg");
            Intrinsics.checkNotNullParameter(iconButtonV3DTO, "iconButtonV3DTO");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            this.iconButtonV3DTO = iconButtonV3DTO;
            this.actionHandler = actionHandler;
            this.testInfo = testInfo;
        }

        @NotNull
        public final IconButtonV3DTO getIconButtonV3DTO() {
            return this.iconButtonV3DTO;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }
    }

    public /* synthetic */ ToolTipConfig(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @NotNull
    public final String getTooltipImg() {
        return this.tooltipImg;
    }

    @NotNull
    public final String getTooltipText() {
        return this.tooltipText;
    }

    private ToolTipConfig(String str, String str2) {
        this.tooltipText = str;
        this.tooltipImg = str2;
    }
}
