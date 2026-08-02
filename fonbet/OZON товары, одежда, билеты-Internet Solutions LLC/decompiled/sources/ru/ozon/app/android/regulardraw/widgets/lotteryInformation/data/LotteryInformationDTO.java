package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.data;

import Co.a;
import G.g;
import Ns.b;
import Pk0.h;
import Tz.C4055a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002!\"B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO;", "", "banner", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$Banner;", "mainInfo", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo;", "button", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$Banner;Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Ljava/util/Map;)V", "getBanner", "()Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$Banner;", "getMainInfo", "()Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo;", "getButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Banner", "MainInfo", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LotteryInformationDTO {
    public static final int $stable = 8;

    @NotNull
    private final Banner banner;
    private final MorkovskShadowButtonDTO button;

    @NotNull
    private final MainInfo mainInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$Banner;", "", "imagePath", "", "subtitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "ticketsAmount", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getImagePath", "()Ljava/lang/String;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTicketsAmount", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Banner {
        public static final int $stable = 8;

        @NotNull
        private final String imagePath;
        private final TextDTO subtitle;
        private final TestInfo testInfo;
        private final MorkovskCurrencyBadgeDTO ticketsAmount;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Banner(@NotNull String imagePath, TextDTO textDTO, MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            this.imagePath = imagePath;
            this.subtitle = textDTO;
            this.ticketsAmount = morkovskCurrencyBadgeDTO;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, String str, TextDTO textDTO, MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = banner.imagePath;
            }
            if ((i11 & 2) != 0) {
                textDTO = banner.subtitle;
            }
            if ((i11 & 4) != 0) {
                morkovskCurrencyBadgeDTO = banner.ticketsAmount;
            }
            if ((i11 & 8) != 0) {
                map = banner.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                testInfo = banner.testInfo;
            }
            TestInfo testInfo2 = testInfo;
            MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO2 = morkovskCurrencyBadgeDTO;
            return banner.copy(str, textDTO, morkovskCurrencyBadgeDTO2, map, testInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final MorkovskCurrencyBadgeDTO getTicketsAmount() {
            return this.ticketsAmount;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final Banner copy(@NotNull String imagePath, TextDTO subtitle, MorkovskCurrencyBadgeDTO ticketsAmount, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            return new Banner(imagePath, subtitle, ticketsAmount, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.d(this.imagePath, banner.imagePath) && Intrinsics.d(this.subtitle, banner.subtitle) && Intrinsics.d(this.ticketsAmount, banner.ticketsAmount) && Intrinsics.d(this.trackingInfo, banner.trackingInfo) && Intrinsics.d(this.testInfo, banner.testInfo);
        }

        @NotNull
        public final String getImagePath() {
            return this.imagePath;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final MorkovskCurrencyBadgeDTO getTicketsAmount() {
            return this.ticketsAmount;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.imagePath.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = this.ticketsAmount;
            int hashCode3 = (hashCode2 + (morkovskCurrencyBadgeDTO == null ? 0 : morkovskCurrencyBadgeDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.imagePath;
            TextDTO textDTO = this.subtitle;
            MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = this.ticketsAmount;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder b11 = a.b("Banner(imagePath=", textDTO, str, ", subtitle=", ", ticketsAmount=");
            b11.append(morkovskCurrencyBadgeDTO);
            b11.append(", trackingInfo=");
            b11.append(map);
            b11.append(", testInfo=");
            return h.c(b11, testInfo, ")");
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000234Bi\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003J{\u0010,\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo;", "", "infos", "", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo$Info;", "emptyLotteryImagePath", "", "imagePath", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "ticketsPurchaseExp", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo$TicketsPurchaseExp;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo$TicketsPurchaseExp;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getInfos", "()Ljava/util/List;", "getEmptyLotteryImagePath", "()Ljava/lang/String;", "getImagePath", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTicketsPurchaseExp", "()Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo$TicketsPurchaseExp;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Info", "TicketsPurchaseExp", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class MainInfo {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final BadgeDTO badge;
        private final String emptyLotteryImagePath;
        private final String imagePath;
        private final List<Info> infos;
        private final TestInfo testInfo;
        private final TicketsPurchaseExp ticketsPurchaseExp;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo$Info;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Info {
            public static final int $stable = 8;

            @NotNull
            private final String subtitle;
            private final TestInfo testInfo;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public Info(@NotNull TextDTO title, @NotNull String subtitle, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.title = title;
                this.subtitle = subtitle;
                this.trackingInfo = map;
                this.testInfo = testInfo;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Info copy$default(Info info, TextDTO textDTO, String str, Map map, TestInfo testInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = info.title;
                }
                if ((i11 & 2) != 0) {
                    str = info.subtitle;
                }
                if ((i11 & 4) != 0) {
                    map = info.trackingInfo;
                }
                if ((i11 & 8) != 0) {
                    testInfo = info.testInfo;
                }
                return info.copy(textDTO, str, map, testInfo);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.trackingInfo;
            }

            /* renamed from: component4, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final Info copy(@NotNull TextDTO title, @NotNull String subtitle, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new Info(title, subtitle, trackingInfo, testInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Info)) {
                    return false;
                }
                Info info = (Info) other;
                return Intrinsics.d(this.title, info.title) && Intrinsics.d(this.subtitle, info.subtitle) && Intrinsics.d(this.trackingInfo, info.trackingInfo) && Intrinsics.d(this.testInfo, info.testInfo);
            }

            @NotNull
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.subtitle);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                String str = this.subtitle;
                return b.b(", testInfo=", ")", D3.g.f("Info(title=", textDTO, ", subtitle=", str, ", trackingInfo="), this.trackingInfo, this.testInfo);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003J[\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo$TicketsPurchaseExp;", "", "date", "Lorg/joda/time/DateTime;", "timerText", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getDate", "()Lorg/joda/time/DateTime;", "getTimerText", "()Ljava/lang/String;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TicketsPurchaseExp {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final DateTime date;
            private final TestInfo testInfo;

            @NotNull
            private final TextDTO text;
            private final String timerText;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public TicketsPurchaseExp(DateTime dateTime, String str, @NotNull TextDTO text, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.date = dateTime;
                this.timerText = str;
                this.text = text;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.testInfo = testInfo;
            }

            public static /* synthetic */ TicketsPurchaseExp copy$default(TicketsPurchaseExp ticketsPurchaseExp, DateTime dateTime, String str, TextDTO textDTO, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    dateTime = ticketsPurchaseExp.date;
                }
                if ((i11 & 2) != 0) {
                    str = ticketsPurchaseExp.timerText;
                }
                if ((i11 & 4) != 0) {
                    textDTO = ticketsPurchaseExp.text;
                }
                if ((i11 & 8) != 0) {
                    atomActionDTO = ticketsPurchaseExp.action;
                }
                if ((i11 & 16) != 0) {
                    map = ticketsPurchaseExp.trackingInfo;
                }
                if ((i11 & 32) != 0) {
                    testInfo = ticketsPurchaseExp.testInfo;
                }
                Map map2 = map;
                TestInfo testInfo2 = testInfo;
                return ticketsPurchaseExp.copy(dateTime, str, textDTO, atomActionDTO, map2, testInfo2);
            }

            /* renamed from: component1, reason: from getter */
            public final DateTime getDate() {
                return this.date;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTimerText() {
                return this.timerText;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextDTO getText() {
                return this.text;
            }

            /* renamed from: component4, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            /* renamed from: component6, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final TicketsPurchaseExp copy(DateTime date, String timerText, @NotNull TextDTO text, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new TicketsPurchaseExp(date, timerText, text, action, trackingInfo, testInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TicketsPurchaseExp)) {
                    return false;
                }
                TicketsPurchaseExp ticketsPurchaseExp = (TicketsPurchaseExp) other;
                return Intrinsics.d(this.date, ticketsPurchaseExp.date) && Intrinsics.d(this.timerText, ticketsPurchaseExp.timerText) && Intrinsics.d(this.text, ticketsPurchaseExp.text) && Intrinsics.d(this.action, ticketsPurchaseExp.action) && Intrinsics.d(this.trackingInfo, ticketsPurchaseExp.trackingInfo) && Intrinsics.d(this.testInfo, ticketsPurchaseExp.testInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final DateTime getDate() {
                return this.date;
            }

            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public final String getTimerText() {
                return this.timerText;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                DateTime dateTime = this.date;
                int hashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
                String str = this.timerText;
                int a11 = b.a(this.text, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                AtomActionDTO atomActionDTO = this.action;
                int hashCode2 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                DateTime dateTime = this.date;
                String str = this.timerText;
                TextDTO textDTO = this.text;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                TestInfo testInfo = this.testInfo;
                StringBuilder sb2 = new StringBuilder("TicketsPurchaseExp(date=");
                sb2.append(dateTime);
                sb2.append(", timerText=");
                sb2.append(str);
                sb2.append(", text=");
                sb2.append(textDTO);
                sb2.append(", action=");
                sb2.append(atomActionDTO);
                sb2.append(", trackingInfo=");
                return b.b(", testInfo=", ")", sb2, map, testInfo);
            }
        }

        public MainInfo(List<Info> list, String str, String str2, BadgeDTO badgeDTO, TicketsPurchaseExp ticketsPurchaseExp, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            this.infos = list;
            this.emptyLotteryImagePath = str;
            this.imagePath = str2;
            this.badge = badgeDTO;
            this.ticketsPurchaseExp = ticketsPurchaseExp;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ MainInfo copy$default(MainInfo mainInfo, List list, String str, String str2, BadgeDTO badgeDTO, TicketsPurchaseExp ticketsPurchaseExp, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = mainInfo.infos;
            }
            if ((i11 & 2) != 0) {
                str = mainInfo.emptyLotteryImagePath;
            }
            if ((i11 & 4) != 0) {
                str2 = mainInfo.imagePath;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = mainInfo.badge;
            }
            if ((i11 & 16) != 0) {
                ticketsPurchaseExp = mainInfo.ticketsPurchaseExp;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = mainInfo.action;
            }
            if ((i11 & 64) != 0) {
                map = mainInfo.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                testInfo = mainInfo.testInfo;
            }
            Map map2 = map;
            TestInfo testInfo2 = testInfo;
            TicketsPurchaseExp ticketsPurchaseExp2 = ticketsPurchaseExp;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return mainInfo.copy(list, str, str2, badgeDTO, ticketsPurchaseExp2, atomActionDTO2, map2, testInfo2);
        }

        public final List<Info> component1() {
            return this.infos;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmptyLotteryImagePath() {
            return this.emptyLotteryImagePath;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component5, reason: from getter */
        public final TicketsPurchaseExp getTicketsPurchaseExp() {
            return this.ticketsPurchaseExp;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        /* renamed from: component8, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final MainInfo copy(List<Info> infos, String emptyLotteryImagePath, String imagePath, BadgeDTO badge, TicketsPurchaseExp ticketsPurchaseExp, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            return new MainInfo(infos, emptyLotteryImagePath, imagePath, badge, ticketsPurchaseExp, action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainInfo)) {
                return false;
            }
            MainInfo mainInfo = (MainInfo) other;
            return Intrinsics.d(this.infos, mainInfo.infos) && Intrinsics.d(this.emptyLotteryImagePath, mainInfo.emptyLotteryImagePath) && Intrinsics.d(this.imagePath, mainInfo.imagePath) && Intrinsics.d(this.badge, mainInfo.badge) && Intrinsics.d(this.ticketsPurchaseExp, mainInfo.ticketsPurchaseExp) && Intrinsics.d(this.action, mainInfo.action) && Intrinsics.d(this.trackingInfo, mainInfo.trackingInfo) && Intrinsics.d(this.testInfo, mainInfo.testInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final String getEmptyLotteryImagePath() {
            return this.emptyLotteryImagePath;
        }

        public final String getImagePath() {
            return this.imagePath;
        }

        public final List<Info> getInfos() {
            return this.infos;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final TicketsPurchaseExp getTicketsPurchaseExp() {
            return this.ticketsPurchaseExp;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            List<Info> list = this.infos;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.emptyLotteryImagePath;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.imagePath;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            TicketsPurchaseExp ticketsPurchaseExp = this.ticketsPurchaseExp;
            int hashCode5 = (hashCode4 + (ticketsPurchaseExp == null ? 0 : ticketsPurchaseExp.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode7 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<Info> list = this.infos;
            String str = this.emptyLotteryImagePath;
            String str2 = this.imagePath;
            BadgeDTO badgeDTO = this.badge;
            TicketsPurchaseExp ticketsPurchaseExp = this.ticketsPurchaseExp;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder a11 = C4055a.a("MainInfo(infos=", ", emptyLotteryImagePath=", str, ", imagePath=", list);
            a11.append(str2);
            a11.append(", badge=");
            a11.append(badgeDTO);
            a11.append(", ticketsPurchaseExp=");
            a11.append(ticketsPurchaseExp);
            a11.append(", action=");
            a11.append(atomActionDTO);
            a11.append(", trackingInfo=");
            return b.b(", testInfo=", ")", a11, map, testInfo);
        }
    }

    public LotteryInformationDTO(@NotNull Banner banner, @NotNull MainInfo mainInfo, MorkovskShadowButtonDTO morkovskShadowButtonDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(mainInfo, "mainInfo");
        this.banner = banner;
        this.mainInfo = mainInfo;
        this.button = morkovskShadowButtonDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LotteryInformationDTO copy$default(LotteryInformationDTO lotteryInformationDTO, Banner banner, MainInfo mainInfo, MorkovskShadowButtonDTO morkovskShadowButtonDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            banner = lotteryInformationDTO.banner;
        }
        if ((i11 & 2) != 0) {
            mainInfo = lotteryInformationDTO.mainInfo;
        }
        if ((i11 & 4) != 0) {
            morkovskShadowButtonDTO = lotteryInformationDTO.button;
        }
        if ((i11 & 8) != 0) {
            map = lotteryInformationDTO.trackingInfo;
        }
        return lotteryInformationDTO.copy(banner, mainInfo, morkovskShadowButtonDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MainInfo getMainInfo() {
        return this.mainInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final MorkovskShadowButtonDTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final LotteryInformationDTO copy(@NotNull Banner banner, @NotNull MainInfo mainInfo, MorkovskShadowButtonDTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(mainInfo, "mainInfo");
        return new LotteryInformationDTO(banner, mainInfo, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotteryInformationDTO)) {
            return false;
        }
        LotteryInformationDTO lotteryInformationDTO = (LotteryInformationDTO) other;
        return Intrinsics.d(this.banner, lotteryInformationDTO.banner) && Intrinsics.d(this.mainInfo, lotteryInformationDTO.mainInfo) && Intrinsics.d(this.button, lotteryInformationDTO.button) && Intrinsics.d(this.trackingInfo, lotteryInformationDTO.trackingInfo);
    }

    @NotNull
    public final Banner getBanner() {
        return this.banner;
    }

    public final MorkovskShadowButtonDTO getButton() {
        return this.button;
    }

    @NotNull
    public final MainInfo getMainInfo() {
        return this.mainInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.mainInfo.hashCode() + (this.banner.hashCode() * 31)) * 31;
        MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.button;
        int hashCode2 = (hashCode + (morkovskShadowButtonDTO == null ? 0 : morkovskShadowButtonDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LotteryInformationDTO(banner=" + this.banner + ", mainInfo=" + this.mainInfo + ", button=" + this.button + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
