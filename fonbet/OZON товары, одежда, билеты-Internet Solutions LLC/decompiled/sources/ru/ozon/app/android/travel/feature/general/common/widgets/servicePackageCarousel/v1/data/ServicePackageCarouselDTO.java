package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.data;

import G.g;
import Ns.b;
import T7.P;
import Tl.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v2.ThemeImageV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniGradient;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002%&BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO;", "", "travelLogoApp", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "packages", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO$ServicePackageCardDTO;", "viewTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/Map;)V", "getTravelLogoApp", "()Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getPackages", "()Ljava/util/List;", "getViewTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ServicePackageCardDTO", "ButtonWrapper", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ServicePackageCarouselDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ServicePackageCardDTO> packages;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final ThemeImageV2DTO travelLogoApp;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO$ButtonWrapper;", "", "lightThemeButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "darkThemeButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getLightThemeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDarkThemeButton", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonWrapper {
        public static final int $stable = 0;
        private final ButtonV3DTO darkThemeButton;

        @NotNull
        private final ButtonV3DTO lightThemeButton;

        public ButtonWrapper(@NotNull ButtonV3DTO lightThemeButton, ButtonV3DTO buttonV3DTO) {
            Intrinsics.checkNotNullParameter(lightThemeButton, "lightThemeButton");
            this.lightThemeButton = lightThemeButton;
            this.darkThemeButton = buttonV3DTO;
        }

        public static /* synthetic */ ButtonWrapper copy$default(ButtonWrapper buttonWrapper, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = buttonWrapper.lightThemeButton;
            }
            if ((i11 & 2) != 0) {
                buttonV3DTO2 = buttonWrapper.darkThemeButton;
            }
            return buttonWrapper.copy(buttonV3DTO, buttonV3DTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getLightThemeButton() {
            return this.lightThemeButton;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonV3DTO getDarkThemeButton() {
            return this.darkThemeButton;
        }

        @NotNull
        public final ButtonWrapper copy(@NotNull ButtonV3DTO lightThemeButton, ButtonV3DTO darkThemeButton) {
            Intrinsics.checkNotNullParameter(lightThemeButton, "lightThemeButton");
            return new ButtonWrapper(lightThemeButton, darkThemeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonWrapper)) {
                return false;
            }
            ButtonWrapper buttonWrapper = (ButtonWrapper) other;
            return Intrinsics.d(this.lightThemeButton, buttonWrapper.lightThemeButton) && Intrinsics.d(this.darkThemeButton, buttonWrapper.darkThemeButton);
        }

        public final ButtonV3DTO getDarkThemeButton() {
            return this.darkThemeButton;
        }

        @NotNull
        public final ButtonV3DTO getLightThemeButton() {
            return this.lightThemeButton;
        }

        public int hashCode() {
            int hashCode = this.lightThemeButton.hashCode() * 31;
            ButtonV3DTO buttonV3DTO = this.darkThemeButton;
            return hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "ButtonWrapper(lightThemeButton=" + this.lightThemeButton + ", darkThemeButton=" + this.darkThemeButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0011HÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010;\u001a\u00020\u0018HÆ\u0003J\u009c\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u0002\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO$ServicePackageCardDTO;", "", "isActive", "", "borderColor", "", "backgroundGradient", "Lru/ozon/uni/core/UniGradient;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "benefits", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "smsToggler", "buttonApp", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO$ButtonWrapper;", "viewTracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/core/UniGradient;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO$ButtonWrapper;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBorderColor", "()Ljava/lang/String;", "getBackgroundGradient", "()Lru/ozon/uni/core/UniGradient;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBenefits", "()Ljava/util/List;", "getSmsToggler", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getButtonApp", "()Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO$ButtonWrapper;", "getViewTracking", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/core/UniGradient;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO$ButtonWrapper;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/data/price/PriceDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO$ServicePackageCardDTO;", "equals", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServicePackageCardDTO {
        public static final int $stable = 8;
        private final UniGradient backgroundGradient;
        private final BadgeDTO badge;

        @NotNull
        private final List<CellDTO> benefits;
        private final String borderColor;

        @NotNull
        private final ButtonWrapper buttonApp;
        private final Boolean isActive;

        @NotNull
        private final PriceDTO price;
        private final CellDTO smsToggler;
        private final TestInfo testInfo;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> viewTracking;

        public ServicePackageCardDTO(Boolean bool, String str, UniGradient uniGradient, BadgeDTO badgeDTO, @NotNull TextDTO title, @NotNull List<CellDTO> benefits, CellDTO cellDTO, @NotNull ButtonWrapper buttonApp, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, @NotNull PriceDTO price) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(buttonApp, "buttonApp");
            Intrinsics.checkNotNullParameter(price, "price");
            this.isActive = bool;
            this.borderColor = str;
            this.backgroundGradient = uniGradient;
            this.badge = badgeDTO;
            this.title = title;
            this.benefits = benefits;
            this.smsToggler = cellDTO;
            this.buttonApp = buttonApp;
            this.viewTracking = map;
            this.testInfo = testInfo;
            this.price = price;
        }

        public static /* synthetic */ ServicePackageCardDTO copy$default(ServicePackageCardDTO servicePackageCardDTO, Boolean bool, String str, UniGradient uniGradient, BadgeDTO badgeDTO, TextDTO textDTO, List list, CellDTO cellDTO, ButtonWrapper buttonWrapper, Map map, TestInfo testInfo, PriceDTO priceDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = servicePackageCardDTO.isActive;
            }
            if ((i11 & 2) != 0) {
                str = servicePackageCardDTO.borderColor;
            }
            if ((i11 & 4) != 0) {
                uniGradient = servicePackageCardDTO.backgroundGradient;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = servicePackageCardDTO.badge;
            }
            if ((i11 & 16) != 0) {
                textDTO = servicePackageCardDTO.title;
            }
            if ((i11 & 32) != 0) {
                list = servicePackageCardDTO.benefits;
            }
            if ((i11 & 64) != 0) {
                cellDTO = servicePackageCardDTO.smsToggler;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                buttonWrapper = servicePackageCardDTO.buttonApp;
            }
            if ((i11 & 256) != 0) {
                map = servicePackageCardDTO.viewTracking;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                testInfo = servicePackageCardDTO.testInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                priceDTO = servicePackageCardDTO.price;
            }
            TestInfo testInfo2 = testInfo;
            PriceDTO priceDTO2 = priceDTO;
            ButtonWrapper buttonWrapper2 = buttonWrapper;
            Map map2 = map;
            List list2 = list;
            CellDTO cellDTO2 = cellDTO;
            TextDTO textDTO2 = textDTO;
            UniGradient uniGradient2 = uniGradient;
            return servicePackageCardDTO.copy(bool, str, uniGradient2, badgeDTO, textDTO2, list2, cellDTO2, buttonWrapper2, map2, testInfo2, priceDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component10, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        /* renamed from: component11, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component3, reason: from getter */
        public final UniGradient getBackgroundGradient() {
            return this.backgroundGradient;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final List<CellDTO> component6() {
            return this.benefits;
        }

        /* renamed from: component7, reason: from getter */
        public final CellDTO getSmsToggler() {
            return this.smsToggler;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final ButtonWrapper getButtonApp() {
            return this.buttonApp;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.viewTracking;
        }

        @NotNull
        public final ServicePackageCardDTO copy(Boolean isActive, String borderColor, UniGradient backgroundGradient, BadgeDTO badge, @NotNull TextDTO title, @NotNull List<CellDTO> benefits, CellDTO smsToggler, @NotNull ButtonWrapper buttonApp, Map<String, TokenizedTrackingInfo> viewTracking, TestInfo testInfo, @NotNull PriceDTO price) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(buttonApp, "buttonApp");
            Intrinsics.checkNotNullParameter(price, "price");
            return new ServicePackageCardDTO(isActive, borderColor, backgroundGradient, badge, title, benefits, smsToggler, buttonApp, viewTracking, testInfo, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServicePackageCardDTO)) {
                return false;
            }
            ServicePackageCardDTO servicePackageCardDTO = (ServicePackageCardDTO) other;
            return Intrinsics.d(this.isActive, servicePackageCardDTO.isActive) && Intrinsics.d(this.borderColor, servicePackageCardDTO.borderColor) && Intrinsics.d(this.backgroundGradient, servicePackageCardDTO.backgroundGradient) && Intrinsics.d(this.badge, servicePackageCardDTO.badge) && Intrinsics.d(this.title, servicePackageCardDTO.title) && Intrinsics.d(this.benefits, servicePackageCardDTO.benefits) && Intrinsics.d(this.smsToggler, servicePackageCardDTO.smsToggler) && Intrinsics.d(this.buttonApp, servicePackageCardDTO.buttonApp) && Intrinsics.d(this.viewTracking, servicePackageCardDTO.viewTracking) && Intrinsics.d(this.testInfo, servicePackageCardDTO.testInfo) && Intrinsics.d(this.price, servicePackageCardDTO.price);
        }

        public final UniGradient getBackgroundGradient() {
            return this.backgroundGradient;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final List<CellDTO> getBenefits() {
            return this.benefits;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final ButtonWrapper getButtonApp() {
            return this.buttonApp;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public final CellDTO getSmsToggler() {
            return this.smsToggler;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getViewTracking() {
            return this.viewTracking;
        }

        public int hashCode() {
            Boolean bool = this.isActive;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.borderColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            UniGradient uniGradient = this.backgroundGradient;
            int hashCode3 = (hashCode2 + (uniGradient == null ? 0 : uniGradient.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int b11 = g.b(b.a(this.title, (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31), 31, this.benefits);
            CellDTO cellDTO = this.smsToggler;
            int hashCode4 = (this.buttonApp.hashCode() + ((b11 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.viewTracking;
            int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return this.price.hashCode() + ((hashCode5 + (testInfo != null ? testInfo.hashCode() : 0)) * 31);
        }

        public final Boolean isActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.isActive;
            String str = this.borderColor;
            UniGradient uniGradient = this.backgroundGradient;
            BadgeDTO badgeDTO = this.badge;
            TextDTO textDTO = this.title;
            List<CellDTO> list = this.benefits;
            CellDTO cellDTO = this.smsToggler;
            ButtonWrapper buttonWrapper = this.buttonApp;
            Map<String, TokenizedTrackingInfo> map = this.viewTracking;
            TestInfo testInfo = this.testInfo;
            PriceDTO priceDTO = this.price;
            StringBuilder e11 = D3.g.e("ServicePackageCardDTO(isActive=", bool, ", borderColor=", str, ", backgroundGradient=");
            e11.append(uniGradient);
            e11.append(", badge=");
            e11.append(badgeDTO);
            e11.append(", title=");
            a.e(e11, textDTO, ", benefits=", list, ", smsToggler=");
            e11.append(cellDTO);
            e11.append(", buttonApp=");
            e11.append(buttonWrapper);
            e11.append(", viewTracking=");
            e11.append(map);
            e11.append(", testInfo=");
            e11.append(testInfo);
            e11.append(", price=");
            e11.append(priceDTO);
            e11.append(")");
            return e11.toString();
        }
    }

    public ServicePackageCarouselDTO(@NotNull ThemeImageV2DTO travelLogoApp, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<ServicePackageCardDTO> packages, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(travelLogoApp, "travelLogoApp");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.travelLogoApp = travelLogoApp;
        this.title = title;
        this.subtitle = subtitle;
        this.packages = packages;
        this.viewTracking = map;
    }

    public static /* synthetic */ ServicePackageCarouselDTO copy$default(ServicePackageCarouselDTO servicePackageCarouselDTO, ThemeImageV2DTO themeImageV2DTO, TextDTO textDTO, TextDTO textDTO2, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            themeImageV2DTO = servicePackageCarouselDTO.travelLogoApp;
        }
        if ((i11 & 2) != 0) {
            textDTO = servicePackageCarouselDTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = servicePackageCarouselDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            list = servicePackageCarouselDTO.packages;
        }
        if ((i11 & 16) != 0) {
            map = servicePackageCarouselDTO.viewTracking;
        }
        Map map2 = map;
        TextDTO textDTO3 = textDTO2;
        return servicePackageCarouselDTO.copy(themeImageV2DTO, textDTO, textDTO3, list, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ThemeImageV2DTO getTravelLogoApp() {
        return this.travelLogoApp;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<ServicePackageCardDTO> component4() {
        return this.packages;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.viewTracking;
    }

    @NotNull
    public final ServicePackageCarouselDTO copy(@NotNull ThemeImageV2DTO travelLogoApp, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<ServicePackageCardDTO> packages, Map<String, TokenizedTrackingInfo> viewTracking) {
        Intrinsics.checkNotNullParameter(travelLogoApp, "travelLogoApp");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(packages, "packages");
        return new ServicePackageCarouselDTO(travelLogoApp, title, subtitle, packages, viewTracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicePackageCarouselDTO)) {
            return false;
        }
        ServicePackageCarouselDTO servicePackageCarouselDTO = (ServicePackageCarouselDTO) other;
        return Intrinsics.d(this.travelLogoApp, servicePackageCarouselDTO.travelLogoApp) && Intrinsics.d(this.title, servicePackageCarouselDTO.title) && Intrinsics.d(this.subtitle, servicePackageCarouselDTO.subtitle) && Intrinsics.d(this.packages, servicePackageCarouselDTO.packages) && Intrinsics.d(this.viewTracking, servicePackageCarouselDTO.viewTracking);
    }

    @NotNull
    public final List<ServicePackageCardDTO> getPackages() {
        return this.packages;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final ThemeImageV2DTO getTravelLogoApp() {
        return this.travelLogoApp;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        int b11 = g.b(b.a(this.subtitle, b.a(this.title, this.travelLogoApp.hashCode() * 31, 31), 31), 31, this.packages);
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        ThemeImageV2DTO themeImageV2DTO = this.travelLogoApp;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<ServicePackageCardDTO> list = this.packages;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        StringBuilder sb2 = new StringBuilder("ServicePackageCarouselDTO(travelLogoApp=");
        sb2.append(themeImageV2DTO);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", subtitle=");
        a.e(sb2, textDTO2, ", packages=", list, ", viewTracking=");
        return P.f(sb2, map, ")");
    }
}
