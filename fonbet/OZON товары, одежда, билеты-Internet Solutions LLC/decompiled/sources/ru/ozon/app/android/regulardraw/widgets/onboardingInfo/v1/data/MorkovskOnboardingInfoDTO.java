package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.data;

import B4.V;
import G.g;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0005)*+,-B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006."}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO;", "", "tooltipImage", "", "welcomeStep", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$WelcomeStepDTO;", "balanceStep", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$BalanceStepDTO;", "progressStep", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$ProgressStepDTO;", "routeStep", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$RouteStepDTO;", "prizeStep", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$PrizeStepDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$WelcomeStepDTO;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$BalanceStepDTO;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$ProgressStepDTO;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$RouteStepDTO;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$PrizeStepDTO;)V", "getTooltipImage", "()Ljava/lang/String;", "getWelcomeStep", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$WelcomeStepDTO;", "getBalanceStep", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$BalanceStepDTO;", "getProgressStep", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$ProgressStepDTO;", "getRouteStep", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$RouteStepDTO;", "getPrizeStep", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$PrizeStepDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "WelcomeStepDTO", "BalanceStepDTO", "ProgressStepDTO", "RouteStepDTO", "PrizeStepDTO", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskOnboardingInfoDTO {
    public static final int $stable = 8;

    @NotNull
    private final BalanceStepDTO balanceStep;

    @NotNull
    private final PrizeStepDTO prizeStep;

    @NotNull
    private final ProgressStepDTO progressStep;

    @NotNull
    private final RouteStepDTO routeStep;

    @NotNull
    private final String tooltipImage;

    @NotNull
    private final WelcomeStepDTO welcomeStep;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$BalanceStepDTO;", "", "tooltipText", "", "actionText", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTooltipText", "()Ljava/lang/String;", "getActionText", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BalanceStepDTO {
        public static final int $stable = 8;

        @NotNull
        private final String actionText;

        @NotNull
        private final String tooltipText;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public BalanceStepDTO(@NotNull String tooltipText, @NotNull String actionText, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            this.tooltipText = tooltipText;
            this.actionText = actionText;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BalanceStepDTO copy$default(BalanceStepDTO balanceStepDTO, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = balanceStepDTO.tooltipText;
            }
            if ((i11 & 2) != 0) {
                str2 = balanceStepDTO.actionText;
            }
            if ((i11 & 4) != 0) {
                map = balanceStepDTO.trackingInfo;
            }
            return balanceStepDTO.copy(str, str2, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTooltipText() {
            return this.tooltipText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getActionText() {
            return this.actionText;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final BalanceStepDTO copy(@NotNull String tooltipText, @NotNull String actionText, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            return new BalanceStepDTO(tooltipText, actionText, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BalanceStepDTO)) {
                return false;
            }
            BalanceStepDTO balanceStepDTO = (BalanceStepDTO) other;
            return Intrinsics.d(this.tooltipText, balanceStepDTO.tooltipText) && Intrinsics.d(this.actionText, balanceStepDTO.actionText) && Intrinsics.d(this.trackingInfo, balanceStepDTO.trackingInfo);
        }

        @NotNull
        public final String getActionText() {
            return this.actionText;
        }

        @NotNull
        public final String getTooltipText() {
            return this.tooltipText;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.tooltipText.hashCode() * 31, 31, this.actionText);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.tooltipText;
            String str2 = this.actionText;
            return P.f(C3660k.d("BalanceStepDTO(tooltipText=", str, ", actionText=", str2, ", trackingInfo="), this.trackingInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$PrizeStepDTO;", "", "prizeText", "", "prizeImage", "tooltipText", "carrotsExchangeRate", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "ticketsExchangeRate", "finishButton", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Ljava/util/Map;)V", "getPrizeText", "()Ljava/lang/String;", "getPrizeImage", "getTooltipText", "getCarrotsExchangeRate", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "getTicketsExchangeRate", "getFinishButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PrizeStepDTO {
        public static final int $stable = 8;

        @NotNull
        private final MorkovskCurrencyBadgeDTO carrotsExchangeRate;

        @NotNull
        private final MorkovskShadowButtonDTO finishButton;

        @NotNull
        private final String prizeImage;

        @NotNull
        private final String prizeText;

        @NotNull
        private final MorkovskCurrencyBadgeDTO ticketsExchangeRate;

        @NotNull
        private final String tooltipText;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public PrizeStepDTO(@NotNull String prizeText, @NotNull String prizeImage, @NotNull String tooltipText, @NotNull MorkovskCurrencyBadgeDTO carrotsExchangeRate, @NotNull MorkovskCurrencyBadgeDTO ticketsExchangeRate, @NotNull MorkovskShadowButtonDTO finishButton, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(prizeText, "prizeText");
            Intrinsics.checkNotNullParameter(prizeImage, "prizeImage");
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(carrotsExchangeRate, "carrotsExchangeRate");
            Intrinsics.checkNotNullParameter(ticketsExchangeRate, "ticketsExchangeRate");
            Intrinsics.checkNotNullParameter(finishButton, "finishButton");
            this.prizeText = prizeText;
            this.prizeImage = prizeImage;
            this.tooltipText = tooltipText;
            this.carrotsExchangeRate = carrotsExchangeRate;
            this.ticketsExchangeRate = ticketsExchangeRate;
            this.finishButton = finishButton;
            this.trackingInfo = map;
        }

        public static /* synthetic */ PrizeStepDTO copy$default(PrizeStepDTO prizeStepDTO, String str, String str2, String str3, MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO, MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO2, MorkovskShadowButtonDTO morkovskShadowButtonDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = prizeStepDTO.prizeText;
            }
            if ((i11 & 2) != 0) {
                str2 = prizeStepDTO.prizeImage;
            }
            if ((i11 & 4) != 0) {
                str3 = prizeStepDTO.tooltipText;
            }
            if ((i11 & 8) != 0) {
                morkovskCurrencyBadgeDTO = prizeStepDTO.carrotsExchangeRate;
            }
            if ((i11 & 16) != 0) {
                morkovskCurrencyBadgeDTO2 = prizeStepDTO.ticketsExchangeRate;
            }
            if ((i11 & 32) != 0) {
                morkovskShadowButtonDTO = prizeStepDTO.finishButton;
            }
            if ((i11 & 64) != 0) {
                map = prizeStepDTO.trackingInfo;
            }
            MorkovskShadowButtonDTO morkovskShadowButtonDTO2 = morkovskShadowButtonDTO;
            Map map2 = map;
            MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO3 = morkovskCurrencyBadgeDTO2;
            String str4 = str3;
            return prizeStepDTO.copy(str, str2, str4, morkovskCurrencyBadgeDTO, morkovskCurrencyBadgeDTO3, morkovskShadowButtonDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPrizeText() {
            return this.prizeText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPrizeImage() {
            return this.prizeImage;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTooltipText() {
            return this.tooltipText;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final MorkovskCurrencyBadgeDTO getCarrotsExchangeRate() {
            return this.carrotsExchangeRate;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final MorkovskCurrencyBadgeDTO getTicketsExchangeRate() {
            return this.ticketsExchangeRate;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final MorkovskShadowButtonDTO getFinishButton() {
            return this.finishButton;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final PrizeStepDTO copy(@NotNull String prizeText, @NotNull String prizeImage, @NotNull String tooltipText, @NotNull MorkovskCurrencyBadgeDTO carrotsExchangeRate, @NotNull MorkovskCurrencyBadgeDTO ticketsExchangeRate, @NotNull MorkovskShadowButtonDTO finishButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(prizeText, "prizeText");
            Intrinsics.checkNotNullParameter(prizeImage, "prizeImage");
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(carrotsExchangeRate, "carrotsExchangeRate");
            Intrinsics.checkNotNullParameter(ticketsExchangeRate, "ticketsExchangeRate");
            Intrinsics.checkNotNullParameter(finishButton, "finishButton");
            return new PrizeStepDTO(prizeText, prizeImage, tooltipText, carrotsExchangeRate, ticketsExchangeRate, finishButton, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrizeStepDTO)) {
                return false;
            }
            PrizeStepDTO prizeStepDTO = (PrizeStepDTO) other;
            return Intrinsics.d(this.prizeText, prizeStepDTO.prizeText) && Intrinsics.d(this.prizeImage, prizeStepDTO.prizeImage) && Intrinsics.d(this.tooltipText, prizeStepDTO.tooltipText) && Intrinsics.d(this.carrotsExchangeRate, prizeStepDTO.carrotsExchangeRate) && Intrinsics.d(this.ticketsExchangeRate, prizeStepDTO.ticketsExchangeRate) && Intrinsics.d(this.finishButton, prizeStepDTO.finishButton) && Intrinsics.d(this.trackingInfo, prizeStepDTO.trackingInfo);
        }

        @NotNull
        public final MorkovskCurrencyBadgeDTO getCarrotsExchangeRate() {
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

        @NotNull
        public final String getPrizeText() {
            return this.prizeText;
        }

        @NotNull
        public final MorkovskCurrencyBadgeDTO getTicketsExchangeRate() {
            return this.ticketsExchangeRate;
        }

        @NotNull
        public final String getTooltipText() {
            return this.tooltipText;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.finishButton.hashCode() + ((this.ticketsExchangeRate.hashCode() + ((this.carrotsExchangeRate.hashCode() + g.a(g.a(this.prizeText.hashCode() * 31, 31, this.prizeImage), 31, this.tooltipText)) * 31)) * 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.prizeText;
            String str2 = this.prizeImage;
            String str3 = this.tooltipText;
            MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = this.carrotsExchangeRate;
            MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO2 = this.ticketsExchangeRate;
            MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.finishButton;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("PrizeStepDTO(prizeText=", str, ", prizeImage=", str2, ", tooltipText=");
            d11.append(str3);
            d11.append(", carrotsExchangeRate=");
            d11.append(morkovskCurrencyBadgeDTO);
            d11.append(", ticketsExchangeRate=");
            d11.append(morkovskCurrencyBadgeDTO2);
            d11.append(", finishButton=");
            d11.append(morkovskShadowButtonDTO);
            d11.append(", trackingInfo=");
            return P.f(d11, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$ProgressStepDTO;", "", "tooltipText", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getTooltipText", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressStepDTO {
        public static final int $stable = 8;

        @NotNull
        private final String tooltipText;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ProgressStepDTO(@NotNull String tooltipText, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            this.tooltipText = tooltipText;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProgressStepDTO copy$default(ProgressStepDTO progressStepDTO, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = progressStepDTO.tooltipText;
            }
            if ((i11 & 2) != 0) {
                map = progressStepDTO.trackingInfo;
            }
            return progressStepDTO.copy(str, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTooltipText() {
            return this.tooltipText;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        @NotNull
        public final ProgressStepDTO copy(@NotNull String tooltipText, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            return new ProgressStepDTO(tooltipText, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressStepDTO)) {
                return false;
            }
            ProgressStepDTO progressStepDTO = (ProgressStepDTO) other;
            return Intrinsics.d(this.tooltipText, progressStepDTO.tooltipText) && Intrinsics.d(this.trackingInfo, progressStepDTO.trackingInfo);
        }

        @NotNull
        public final String getTooltipText() {
            return this.tooltipText;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.tooltipText.hashCode() * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return a.d("ProgressStepDTO(tooltipText=", this.tooltipText, ", trackingInfo=", ")", this.trackingInfo);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003JM\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$RouteStepDTO;", "", "tooltipText", "", "skipButtonText", "skipButtonTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getTooltipText", "()Ljava/lang/String;", "getSkipButtonText", "getSkipButtonTrackingInfo", "()Ljava/util/Map;", "getTrackingInfo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteStepDTO {
        public static final int $stable = 8;

        @NotNull
        private final String skipButtonText;
        private final Map<String, TokenizedTrackingInfo> skipButtonTrackingInfo;

        @NotNull
        private final String tooltipText;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public RouteStepDTO(@NotNull String tooltipText, @NotNull String skipButtonText, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(skipButtonText, "skipButtonText");
            this.tooltipText = tooltipText;
            this.skipButtonText = skipButtonText;
            this.skipButtonTrackingInfo = map;
            this.trackingInfo = map2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RouteStepDTO copy$default(RouteStepDTO routeStepDTO, String str, String str2, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = routeStepDTO.tooltipText;
            }
            if ((i11 & 2) != 0) {
                str2 = routeStepDTO.skipButtonText;
            }
            if ((i11 & 4) != 0) {
                map = routeStepDTO.skipButtonTrackingInfo;
            }
            if ((i11 & 8) != 0) {
                map2 = routeStepDTO.trackingInfo;
            }
            return routeStepDTO.copy(str, str2, map, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTooltipText() {
            return this.tooltipText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSkipButtonText() {
            return this.skipButtonText;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.skipButtonTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final RouteStepDTO copy(@NotNull String tooltipText, @NotNull String skipButtonText, Map<String, TokenizedTrackingInfo> skipButtonTrackingInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(tooltipText, "tooltipText");
            Intrinsics.checkNotNullParameter(skipButtonText, "skipButtonText");
            return new RouteStepDTO(tooltipText, skipButtonText, skipButtonTrackingInfo, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RouteStepDTO)) {
                return false;
            }
            RouteStepDTO routeStepDTO = (RouteStepDTO) other;
            return Intrinsics.d(this.tooltipText, routeStepDTO.tooltipText) && Intrinsics.d(this.skipButtonText, routeStepDTO.skipButtonText) && Intrinsics.d(this.skipButtonTrackingInfo, routeStepDTO.skipButtonTrackingInfo) && Intrinsics.d(this.trackingInfo, routeStepDTO.trackingInfo);
        }

        @NotNull
        public final String getSkipButtonText() {
            return this.skipButtonText;
        }

        public final Map<String, TokenizedTrackingInfo> getSkipButtonTrackingInfo() {
            return this.skipButtonTrackingInfo;
        }

        @NotNull
        public final String getTooltipText() {
            return this.tooltipText;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.tooltipText.hashCode() * 31, 31, this.skipButtonText);
            Map<String, TokenizedTrackingInfo> map = this.skipButtonTrackingInfo;
            int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
            return hashCode + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.tooltipText;
            String str2 = this.skipButtonText;
            return V.c(C3660k.d("RouteStepDTO(tooltipText=", str, ", skipButtonText=", str2, ", skipButtonTrackingInfo="), this.skipButtonTrackingInfo, ", trackingInfo=", this.trackingInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/data/MorkovskOnboardingInfoDTO$WelcomeStepDTO;", "", "image", "", "actionText", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getActionText", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WelcomeStepDTO {
        public static final int $stable = 8;

        @NotNull
        private final String actionText;

        @NotNull
        private final String image;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public WelcomeStepDTO(@NotNull String image, @NotNull String actionText, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            this.image = image;
            this.actionText = actionText;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WelcomeStepDTO copy$default(WelcomeStepDTO welcomeStepDTO, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = welcomeStepDTO.image;
            }
            if ((i11 & 2) != 0) {
                str2 = welcomeStepDTO.actionText;
            }
            if ((i11 & 4) != 0) {
                map = welcomeStepDTO.trackingInfo;
            }
            return welcomeStepDTO.copy(str, str2, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getActionText() {
            return this.actionText;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final WelcomeStepDTO copy(@NotNull String image, @NotNull String actionText, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            return new WelcomeStepDTO(image, actionText, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WelcomeStepDTO)) {
                return false;
            }
            WelcomeStepDTO welcomeStepDTO = (WelcomeStepDTO) other;
            return Intrinsics.d(this.image, welcomeStepDTO.image) && Intrinsics.d(this.actionText, welcomeStepDTO.actionText) && Intrinsics.d(this.trackingInfo, welcomeStepDTO.trackingInfo);
        }

        @NotNull
        public final String getActionText() {
            return this.actionText;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.image.hashCode() * 31, 31, this.actionText);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.actionText;
            return P.f(C3660k.d("WelcomeStepDTO(image=", str, ", actionText=", str2, ", trackingInfo="), this.trackingInfo, ")");
        }
    }

    public MorkovskOnboardingInfoDTO(@NotNull String tooltipImage, @NotNull WelcomeStepDTO welcomeStep, @NotNull BalanceStepDTO balanceStep, @NotNull ProgressStepDTO progressStep, @NotNull RouteStepDTO routeStep, @NotNull PrizeStepDTO prizeStep) {
        Intrinsics.checkNotNullParameter(tooltipImage, "tooltipImage");
        Intrinsics.checkNotNullParameter(welcomeStep, "welcomeStep");
        Intrinsics.checkNotNullParameter(balanceStep, "balanceStep");
        Intrinsics.checkNotNullParameter(progressStep, "progressStep");
        Intrinsics.checkNotNullParameter(routeStep, "routeStep");
        Intrinsics.checkNotNullParameter(prizeStep, "prizeStep");
        this.tooltipImage = tooltipImage;
        this.welcomeStep = welcomeStep;
        this.balanceStep = balanceStep;
        this.progressStep = progressStep;
        this.routeStep = routeStep;
        this.prizeStep = prizeStep;
    }

    public static /* synthetic */ MorkovskOnboardingInfoDTO copy$default(MorkovskOnboardingInfoDTO morkovskOnboardingInfoDTO, String str, WelcomeStepDTO welcomeStepDTO, BalanceStepDTO balanceStepDTO, ProgressStepDTO progressStepDTO, RouteStepDTO routeStepDTO, PrizeStepDTO prizeStepDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = morkovskOnboardingInfoDTO.tooltipImage;
        }
        if ((i11 & 2) != 0) {
            welcomeStepDTO = morkovskOnboardingInfoDTO.welcomeStep;
        }
        if ((i11 & 4) != 0) {
            balanceStepDTO = morkovskOnboardingInfoDTO.balanceStep;
        }
        if ((i11 & 8) != 0) {
            progressStepDTO = morkovskOnboardingInfoDTO.progressStep;
        }
        if ((i11 & 16) != 0) {
            routeStepDTO = morkovskOnboardingInfoDTO.routeStep;
        }
        if ((i11 & 32) != 0) {
            prizeStepDTO = morkovskOnboardingInfoDTO.prizeStep;
        }
        RouteStepDTO routeStepDTO2 = routeStepDTO;
        PrizeStepDTO prizeStepDTO2 = prizeStepDTO;
        return morkovskOnboardingInfoDTO.copy(str, welcomeStepDTO, balanceStepDTO, progressStepDTO, routeStepDTO2, prizeStepDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTooltipImage() {
        return this.tooltipImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final WelcomeStepDTO getWelcomeStep() {
        return this.welcomeStep;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BalanceStepDTO getBalanceStep() {
        return this.balanceStep;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ProgressStepDTO getProgressStep() {
        return this.progressStep;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final RouteStepDTO getRouteStep() {
        return this.routeStep;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final PrizeStepDTO getPrizeStep() {
        return this.prizeStep;
    }

    @NotNull
    public final MorkovskOnboardingInfoDTO copy(@NotNull String tooltipImage, @NotNull WelcomeStepDTO welcomeStep, @NotNull BalanceStepDTO balanceStep, @NotNull ProgressStepDTO progressStep, @NotNull RouteStepDTO routeStep, @NotNull PrizeStepDTO prizeStep) {
        Intrinsics.checkNotNullParameter(tooltipImage, "tooltipImage");
        Intrinsics.checkNotNullParameter(welcomeStep, "welcomeStep");
        Intrinsics.checkNotNullParameter(balanceStep, "balanceStep");
        Intrinsics.checkNotNullParameter(progressStep, "progressStep");
        Intrinsics.checkNotNullParameter(routeStep, "routeStep");
        Intrinsics.checkNotNullParameter(prizeStep, "prizeStep");
        return new MorkovskOnboardingInfoDTO(tooltipImage, welcomeStep, balanceStep, progressStep, routeStep, prizeStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskOnboardingInfoDTO)) {
            return false;
        }
        MorkovskOnboardingInfoDTO morkovskOnboardingInfoDTO = (MorkovskOnboardingInfoDTO) other;
        return Intrinsics.d(this.tooltipImage, morkovskOnboardingInfoDTO.tooltipImage) && Intrinsics.d(this.welcomeStep, morkovskOnboardingInfoDTO.welcomeStep) && Intrinsics.d(this.balanceStep, morkovskOnboardingInfoDTO.balanceStep) && Intrinsics.d(this.progressStep, morkovskOnboardingInfoDTO.progressStep) && Intrinsics.d(this.routeStep, morkovskOnboardingInfoDTO.routeStep) && Intrinsics.d(this.prizeStep, morkovskOnboardingInfoDTO.prizeStep);
    }

    @NotNull
    public final BalanceStepDTO getBalanceStep() {
        return this.balanceStep;
    }

    @NotNull
    public final PrizeStepDTO getPrizeStep() {
        return this.prizeStep;
    }

    @NotNull
    public final ProgressStepDTO getProgressStep() {
        return this.progressStep;
    }

    @NotNull
    public final RouteStepDTO getRouteStep() {
        return this.routeStep;
    }

    @NotNull
    public final String getTooltipImage() {
        return this.tooltipImage;
    }

    @NotNull
    public final WelcomeStepDTO getWelcomeStep() {
        return this.welcomeStep;
    }

    public int hashCode() {
        return this.prizeStep.hashCode() + ((this.routeStep.hashCode() + ((this.progressStep.hashCode() + ((this.balanceStep.hashCode() + ((this.welcomeStep.hashCode() + (this.tooltipImage.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "MorkovskOnboardingInfoDTO(tooltipImage=" + this.tooltipImage + ", welcomeStep=" + this.welcomeStep + ", balanceStep=" + this.balanceStep + ", progressStep=" + this.progressStep + ", routeStep=" + this.routeStep + ", prizeStep=" + this.prizeStep + ")";
    }
}
