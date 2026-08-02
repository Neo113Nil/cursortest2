package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.presentation;

import G.g;
import N3.C3660k;
import Nh.a;
import Tl.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005./012B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u00063"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO;", "Ll20/c;", "Lru/ozon/composer/network/widget/item/ViewItem;", "", "id", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$WelcomeStepVO;", "welcomeStep", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$BalanceStepVO;", "balanceStep", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$ProgressStepVO;", "progressStep", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$RouteStepVO;", "routeStep", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$PrizeStepVO;", "prizeStep", "<init>", "(JLru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$WelcomeStepVO;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$BalanceStepVO;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$ProgressStepVO;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$RouteStepVO;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$PrizeStepVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$WelcomeStepVO;", "getWelcomeStep", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$WelcomeStepVO;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$BalanceStepVO;", "getBalanceStep", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$BalanceStepVO;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$ProgressStepVO;", "getProgressStep", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$ProgressStepVO;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$RouteStepVO;", "getRouteStep", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$RouteStepVO;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$PrizeStepVO;", "getPrizeStep", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$PrizeStepVO;", "WelcomeStepVO", "BalanceStepVO", "ProgressStepVO", "RouteStepVO", "PrizeStepVO", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskOnboardingInfoVO implements c {

    @NotNull
    private final BalanceStepVO balanceStep;
    private final long id;

    @NotNull
    private final PrizeStepVO prizeStep;

    @NotNull
    private final ProgressStepVO progressStep;

    @NotNull
    private final RouteStepVO routeStep;

    @NotNull
    private final WelcomeStepVO welcomeStep;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$BalanceStepVO;", "", "", "tooltipImage", "tooltipText", "actionText", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "balanceScreenViewEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTooltipImage", "getTooltipText", "getActionText", "LWZ/t;", "getBalanceScreenViewEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BalanceStepVO {

        @NotNull
        private final String actionText;
        private final t balanceScreenViewEvent;

        @NotNull
        private final String tooltipImage;

        @NotNull
        private final String tooltipText;

        public BalanceStepVO(@NotNull String tooltipImage, @NotNull String tooltipText, @NotNull String actionText, t tVar) {
            Intrinsics.checkNotNullParameter(tooltipImage, "tooltipImage");
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            this.tooltipImage = tooltipImage;
            this.tooltipText = tooltipText;
            this.actionText = actionText;
            this.balanceScreenViewEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BalanceStepVO)) {
                return false;
            }
            BalanceStepVO balanceStepVO = (BalanceStepVO) other;
            return Intrinsics.d(this.tooltipImage, balanceStepVO.tooltipImage) && Intrinsics.d(this.tooltipText, balanceStepVO.tooltipText) && Intrinsics.d(this.actionText, balanceStepVO.actionText) && Intrinsics.d(this.balanceScreenViewEvent, balanceStepVO.balanceScreenViewEvent);
        }

        @NotNull
        public final String getActionText() {
            return this.actionText;
        }

        public final t getBalanceScreenViewEvent() {
            return this.balanceScreenViewEvent;
        }

        @NotNull
        public final String getTooltipImage() {
            return this.tooltipImage;
        }

        @NotNull
        public final String getTooltipText() {
            return this.tooltipText;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.tooltipImage.hashCode() * 31, 31, this.tooltipText), 31, this.actionText);
            t tVar = this.balanceScreenViewEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.tooltipImage;
            String str2 = this.tooltipText;
            String str3 = this.actionText;
            t tVar = this.balanceScreenViewEvent;
            StringBuilder d11 = C3660k.d("BalanceStepVO(tooltipImage=", str, ", tooltipText=", str2, ", actionText=");
            d11.append(str3);
            d11.append(", balanceScreenViewEvent=");
            d11.append(tVar);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$PrizeStepVO;", "", "", "prizeText", "prizeImage", "tooltipImage", "tooltipText", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "carrotsExchangeRate", "ticketsExchangeRate", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "finishButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "prizeScreenViewEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrizeText", "getPrizeImage", "getTooltipImage", "getTooltipText", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "getCarrotsExchangeRate", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "getTicketsExchangeRate", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getFinishButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "LWZ/t;", "getPrizeScreenViewEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PrizeStepVO {

        @NotNull
        private final MorkovskCurrencyBadgeVO carrotsExchangeRate;

        @NotNull
        private final MorkovskShadowButtonDTO finishButton;

        @NotNull
        private final String prizeImage;
        private final t prizeScreenViewEvent;

        @NotNull
        private final String prizeText;

        @NotNull
        private final MorkovskCurrencyBadgeVO ticketsExchangeRate;

        @NotNull
        private final String tooltipImage;

        @NotNull
        private final String tooltipText;

        public PrizeStepVO(@NotNull String prizeText, @NotNull String prizeImage, @NotNull String tooltipImage, @NotNull String tooltipText, @NotNull MorkovskCurrencyBadgeVO carrotsExchangeRate, @NotNull MorkovskCurrencyBadgeVO ticketsExchangeRate, @NotNull MorkovskShadowButtonDTO finishButton, t tVar) {
            Intrinsics.checkNotNullParameter(prizeText, "prizeText");
            Intrinsics.checkNotNullParameter(prizeImage, "prizeImage");
            Intrinsics.checkNotNullParameter(tooltipImage, "tooltipImage");
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(carrotsExchangeRate, "carrotsExchangeRate");
            Intrinsics.checkNotNullParameter(ticketsExchangeRate, "ticketsExchangeRate");
            Intrinsics.checkNotNullParameter(finishButton, "finishButton");
            this.prizeText = prizeText;
            this.prizeImage = prizeImage;
            this.tooltipImage = tooltipImage;
            this.tooltipText = tooltipText;
            this.carrotsExchangeRate = carrotsExchangeRate;
            this.ticketsExchangeRate = ticketsExchangeRate;
            this.finishButton = finishButton;
            this.prizeScreenViewEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrizeStepVO)) {
                return false;
            }
            PrizeStepVO prizeStepVO = (PrizeStepVO) other;
            return Intrinsics.d(this.prizeText, prizeStepVO.prizeText) && Intrinsics.d(this.prizeImage, prizeStepVO.prizeImage) && Intrinsics.d(this.tooltipImage, prizeStepVO.tooltipImage) && Intrinsics.d(this.tooltipText, prizeStepVO.tooltipText) && Intrinsics.d(this.carrotsExchangeRate, prizeStepVO.carrotsExchangeRate) && Intrinsics.d(this.ticketsExchangeRate, prizeStepVO.ticketsExchangeRate) && Intrinsics.d(this.finishButton, prizeStepVO.finishButton) && Intrinsics.d(this.prizeScreenViewEvent, prizeStepVO.prizeScreenViewEvent);
        }

        @NotNull
        public final MorkovskCurrencyBadgeVO getCarrotsExchangeRate() {
            return this.carrotsExchangeRate;
        }

        @NotNull
        public final MorkovskShadowButtonDTO getFinishButton() {
            return this.finishButton;
        }

        @NotNull
        public final String getPrizeImage() {
            return this.prizeImage;
        }

        public final t getPrizeScreenViewEvent() {
            return this.prizeScreenViewEvent;
        }

        @NotNull
        public final String getPrizeText() {
            return this.prizeText;
        }

        @NotNull
        public final MorkovskCurrencyBadgeVO getTicketsExchangeRate() {
            return this.ticketsExchangeRate;
        }

        @NotNull
        public final String getTooltipImage() {
            return this.tooltipImage;
        }

        @NotNull
        public final String getTooltipText() {
            return this.tooltipText;
        }

        public int hashCode() {
            int hashCode = (this.finishButton.hashCode() + ((this.ticketsExchangeRate.hashCode() + ((this.carrotsExchangeRate.hashCode() + g.a(g.a(g.a(this.prizeText.hashCode() * 31, 31, this.prizeImage), 31, this.tooltipImage), 31, this.tooltipText)) * 31)) * 31)) * 31;
            t tVar = this.prizeScreenViewEvent;
            return hashCode + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.prizeText;
            String str2 = this.prizeImage;
            String str3 = this.tooltipImage;
            String str4 = this.tooltipText;
            MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO = this.carrotsExchangeRate;
            MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO2 = this.ticketsExchangeRate;
            MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.finishButton;
            t tVar = this.prizeScreenViewEvent;
            StringBuilder d11 = C3660k.d("PrizeStepVO(prizeText=", str, ", prizeImage=", str2, ", tooltipImage=");
            a.h(d11, str3, ", tooltipText=", str4, ", carrotsExchangeRate=");
            d11.append(morkovskCurrencyBadgeVO);
            d11.append(", ticketsExchangeRate=");
            d11.append(morkovskCurrencyBadgeVO2);
            d11.append(", finishButton=");
            d11.append(morkovskShadowButtonDTO);
            d11.append(", prizeScreenViewEvent=");
            d11.append(tVar);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$ProgressStepVO;", "", "", "tooltipImage", "tooltipText", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "progressScreenViewEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTooltipImage", "getTooltipText", "LWZ/t;", "getProgressScreenViewEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressStepVO {
        private final t progressScreenViewEvent;

        @NotNull
        private final String tooltipImage;

        @NotNull
        private final String tooltipText;

        public ProgressStepVO(@NotNull String tooltipImage, @NotNull String tooltipText, t tVar) {
            Intrinsics.checkNotNullParameter(tooltipImage, "tooltipImage");
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            this.tooltipImage = tooltipImage;
            this.tooltipText = tooltipText;
            this.progressScreenViewEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressStepVO)) {
                return false;
            }
            ProgressStepVO progressStepVO = (ProgressStepVO) other;
            return Intrinsics.d(this.tooltipImage, progressStepVO.tooltipImage) && Intrinsics.d(this.tooltipText, progressStepVO.tooltipText) && Intrinsics.d(this.progressScreenViewEvent, progressStepVO.progressScreenViewEvent);
        }

        public final t getProgressScreenViewEvent() {
            return this.progressScreenViewEvent;
        }

        @NotNull
        public final String getTooltipImage() {
            return this.tooltipImage;
        }

        @NotNull
        public final String getTooltipText() {
            return this.tooltipText;
        }

        public int hashCode() {
            int a11 = g.a(this.tooltipImage.hashCode() * 31, 31, this.tooltipText);
            t tVar = this.progressScreenViewEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.tooltipImage;
            String str2 = this.tooltipText;
            return b.d(C3660k.d("ProgressStepVO(tooltipImage=", str, ", tooltipText=", str2, ", progressScreenViewEvent="), this.progressScreenViewEvent, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$RouteStepVO;", "", "", "tooltipImage", "tooltipText", "skipButtonText", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "skipButtonClickEvent", "routeScreenViewEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTooltipImage", "getTooltipText", "getSkipButtonText", "LWZ/t;", "getSkipButtonClickEvent", "()LWZ/t;", "getRouteScreenViewEvent", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteStepVO {
        private final t routeScreenViewEvent;
        private final t skipButtonClickEvent;

        @NotNull
        private final String skipButtonText;

        @NotNull
        private final String tooltipImage;

        @NotNull
        private final String tooltipText;

        public RouteStepVO(@NotNull String tooltipImage, @NotNull String tooltipText, @NotNull String skipButtonText, t tVar, t tVar2) {
            Intrinsics.checkNotNullParameter(tooltipImage, "tooltipImage");
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(skipButtonText, "skipButtonText");
            this.tooltipImage = tooltipImage;
            this.tooltipText = tooltipText;
            this.skipButtonText = skipButtonText;
            this.skipButtonClickEvent = tVar;
            this.routeScreenViewEvent = tVar2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RouteStepVO)) {
                return false;
            }
            RouteStepVO routeStepVO = (RouteStepVO) other;
            return Intrinsics.d(this.tooltipImage, routeStepVO.tooltipImage) && Intrinsics.d(this.tooltipText, routeStepVO.tooltipText) && Intrinsics.d(this.skipButtonText, routeStepVO.skipButtonText) && Intrinsics.d(this.skipButtonClickEvent, routeStepVO.skipButtonClickEvent) && Intrinsics.d(this.routeScreenViewEvent, routeStepVO.routeScreenViewEvent);
        }

        public final t getRouteScreenViewEvent() {
            return this.routeScreenViewEvent;
        }

        public final t getSkipButtonClickEvent() {
            return this.skipButtonClickEvent;
        }

        @NotNull
        public final String getSkipButtonText() {
            return this.skipButtonText;
        }

        @NotNull
        public final String getTooltipImage() {
            return this.tooltipImage;
        }

        @NotNull
        public final String getTooltipText() {
            return this.tooltipText;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.tooltipImage.hashCode() * 31, 31, this.tooltipText), 31, this.skipButtonText);
            t tVar = this.skipButtonClickEvent;
            int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.routeScreenViewEvent;
            return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.tooltipImage;
            String str2 = this.tooltipText;
            String str3 = this.skipButtonText;
            t tVar = this.skipButtonClickEvent;
            t tVar2 = this.routeScreenViewEvent;
            StringBuilder d11 = C3660k.d("RouteStepVO(tooltipImage=", str, ", tooltipText=", str2, ", skipButtonText=");
            d11.append(str3);
            d11.append(", skipButtonClickEvent=");
            d11.append(tVar);
            d11.append(", routeScreenViewEvent=");
            return b.d(d11, tVar2, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/presentation/MorkovskOnboardingInfoVO$WelcomeStepVO;", "", "", "image", "actionText", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "welcomeScreenViewEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getActionText", "LWZ/t;", "getWelcomeScreenViewEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WelcomeStepVO {

        @NotNull
        private final String actionText;

        @NotNull
        private final String image;
        private final t welcomeScreenViewEvent;

        public WelcomeStepVO(@NotNull String image, @NotNull String actionText, t tVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            this.image = image;
            this.actionText = actionText;
            this.welcomeScreenViewEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WelcomeStepVO)) {
                return false;
            }
            WelcomeStepVO welcomeStepVO = (WelcomeStepVO) other;
            return Intrinsics.d(this.image, welcomeStepVO.image) && Intrinsics.d(this.actionText, welcomeStepVO.actionText) && Intrinsics.d(this.welcomeScreenViewEvent, welcomeStepVO.welcomeScreenViewEvent);
        }

        @NotNull
        public final String getActionText() {
            return this.actionText;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final t getWelcomeScreenViewEvent() {
            return this.welcomeScreenViewEvent;
        }

        public int hashCode() {
            int a11 = g.a(this.image.hashCode() * 31, 31, this.actionText);
            t tVar = this.welcomeScreenViewEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.actionText;
            return b.d(C3660k.d("WelcomeStepVO(image=", str, ", actionText=", str2, ", welcomeScreenViewEvent="), this.welcomeScreenViewEvent, ")");
        }
    }

    public MorkovskOnboardingInfoVO(long j11, @NotNull WelcomeStepVO welcomeStep, @NotNull BalanceStepVO balanceStep, @NotNull ProgressStepVO progressStep, @NotNull RouteStepVO routeStep, @NotNull PrizeStepVO prizeStep) {
        Intrinsics.checkNotNullParameter(welcomeStep, "welcomeStep");
        Intrinsics.checkNotNullParameter(balanceStep, "balanceStep");
        Intrinsics.checkNotNullParameter(progressStep, "progressStep");
        Intrinsics.checkNotNullParameter(routeStep, "routeStep");
        Intrinsics.checkNotNullParameter(prizeStep, "prizeStep");
        this.id = j11;
        this.welcomeStep = welcomeStep;
        this.balanceStep = balanceStep;
        this.progressStep = progressStep;
        this.routeStep = routeStep;
        this.prizeStep = prizeStep;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskOnboardingInfoVO)) {
            return false;
        }
        MorkovskOnboardingInfoVO morkovskOnboardingInfoVO = (MorkovskOnboardingInfoVO) other;
        return this.id == morkovskOnboardingInfoVO.id && Intrinsics.d(this.welcomeStep, morkovskOnboardingInfoVO.welcomeStep) && Intrinsics.d(this.balanceStep, morkovskOnboardingInfoVO.balanceStep) && Intrinsics.d(this.progressStep, morkovskOnboardingInfoVO.progressStep) && Intrinsics.d(this.routeStep, morkovskOnboardingInfoVO.routeStep) && Intrinsics.d(this.prizeStep, morkovskOnboardingInfoVO.prizeStep);
    }

    @NotNull
    public final BalanceStepVO getBalanceStep() {
        return this.balanceStep;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PrizeStepVO getPrizeStep() {
        return this.prizeStep;
    }

    @NotNull
    public final ProgressStepVO getProgressStep() {
        return this.progressStep;
    }

    @NotNull
    public final RouteStepVO getRouteStep() {
        return this.routeStep;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @NotNull
    public final WelcomeStepVO getWelcomeStep() {
        return this.welcomeStep;
    }

    public int hashCode() {
        return this.prizeStep.hashCode() + ((this.routeStep.hashCode() + ((this.progressStep.hashCode() + ((this.balanceStep.hashCode() + ((this.welcomeStep.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "MorkovskOnboardingInfoVO(id=" + this.id + ", welcomeStep=" + this.welcomeStep + ", balanceStep=" + this.balanceStep + ", progressStep=" + this.progressStep + ", routeStep=" + this.routeStep + ", prizeStep=" + this.prizeStep + ")";
    }
}
