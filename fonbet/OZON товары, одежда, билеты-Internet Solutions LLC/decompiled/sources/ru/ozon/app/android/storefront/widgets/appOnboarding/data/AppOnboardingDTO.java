package ru.ozon.app.android.storefront.widgets.appOnboarding.data;

import C.o0;
import Co.a;
import De.C2859b;
import G.g;
import Ns.b;
import T7.P;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004%&'(B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;", "", "logoImage", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$LogoImage;", "pageControls", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageControls;", "skipButton", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$SkipButton;", "pages", "", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageItem;", "shapeImage", "", "<init>", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$LogoImage;Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageControls;Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$SkipButton;Ljava/util/List;Ljava/lang/String;)V", "getLogoImage", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$LogoImage;", "getPageControls", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageControls;", "getSkipButton", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$SkipButton;", "getPages", "()Ljava/util/List;", "getShapeImage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "LogoImage", "PageControls", "SkipButton", "PageItem", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AppOnboardingDTO {
    public static final int $stable = 8;

    @NotNull
    private final LogoImage logoImage;

    @NotNull
    private final PageControls pageControls;

    @NotNull
    private final List<PageItem> pages;
    private final String shapeImage;

    @NotNull
    private final SkipButton skipButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$LogoImage;", "", "top", "", "bottom", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTop", "()Ljava/lang/String;", "getBottom", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LogoImage {
        public static final int $stable = 0;

        @NotNull
        private final String bottom;

        @NotNull
        private final String top;

        public LogoImage(@NotNull String top, @NotNull String bottom) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            this.top = top;
            this.bottom = bottom;
        }

        public static /* synthetic */ LogoImage copy$default(LogoImage logoImage, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = logoImage.top;
            }
            if ((i11 & 2) != 0) {
                str2 = logoImage.bottom;
            }
            return logoImage.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBottom() {
            return this.bottom;
        }

        @NotNull
        public final LogoImage copy(@NotNull String top, @NotNull String bottom) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            return new LogoImage(top, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogoImage)) {
                return false;
            }
            LogoImage logoImage = (LogoImage) other;
            return Intrinsics.d(this.top, logoImage.top) && Intrinsics.d(this.bottom, logoImage.bottom);
        }

        @NotNull
        public final String getBottom() {
            return this.bottom;
        }

        @NotNull
        public final String getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.bottom.hashCode() + (this.top.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("LogoImage(top=", this.top, ", bottom=", this.bottom, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageControls;", "", "activeColor", "", "inactiveColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getActiveColor", "()Ljava/lang/String;", "getInactiveColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PageControls {
        public static final int $stable = 0;

        @NotNull
        private final String activeColor;

        @NotNull
        private final String inactiveColor;

        public PageControls(@NotNull String activeColor, @NotNull String inactiveColor) {
            Intrinsics.checkNotNullParameter(activeColor, "activeColor");
            Intrinsics.checkNotNullParameter(inactiveColor, "inactiveColor");
            this.activeColor = activeColor;
            this.inactiveColor = inactiveColor;
        }

        public static /* synthetic */ PageControls copy$default(PageControls pageControls, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = pageControls.activeColor;
            }
            if ((i11 & 2) != 0) {
                str2 = pageControls.inactiveColor;
            }
            return pageControls.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getActiveColor() {
            return this.activeColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getInactiveColor() {
            return this.inactiveColor;
        }

        @NotNull
        public final PageControls copy(@NotNull String activeColor, @NotNull String inactiveColor) {
            Intrinsics.checkNotNullParameter(activeColor, "activeColor");
            Intrinsics.checkNotNullParameter(inactiveColor, "inactiveColor");
            return new PageControls(activeColor, inactiveColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageControls)) {
                return false;
            }
            PageControls pageControls = (PageControls) other;
            return Intrinsics.d(this.activeColor, pageControls.activeColor) && Intrinsics.d(this.inactiveColor, pageControls.inactiveColor);
        }

        @NotNull
        public final String getActiveColor() {
            return this.activeColor;
        }

        @NotNull
        public final String getInactiveColor() {
            return this.inactiveColor;
        }

        public int hashCode() {
            return this.inactiveColor.hashCode() + (this.activeColor.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("PageControls(activeColor=", this.activeColor, ", inactiveColor=", this.inactiveColor, ")");
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageItem;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "gradient", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageItem$Gradient;", "actionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageItem$Gradient;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getGradient", "()Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageItem$Gradient;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Gradient", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PageItem {
        public static final int $stable = 8;

        @NotNull
        private final ButtonV3DTO actionButton;
        private final Gradient gradient;

        @NotNull
        private final String image;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageItem$Gradient;", "", "startColor", "", "endColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStartColor", "()Ljava/lang/String;", "getEndColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Gradient {
            public static final int $stable = 0;

            @NotNull
            private final String endColor;

            @NotNull
            private final String startColor;

            public Gradient(@NotNull String startColor, @NotNull String endColor) {
                Intrinsics.checkNotNullParameter(startColor, "startColor");
                Intrinsics.checkNotNullParameter(endColor, "endColor");
                this.startColor = startColor;
                this.endColor = endColor;
            }

            public static /* synthetic */ Gradient copy$default(Gradient gradient, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = gradient.startColor;
                }
                if ((i11 & 2) != 0) {
                    str2 = gradient.endColor;
                }
                return gradient.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getStartColor() {
                return this.startColor;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getEndColor() {
                return this.endColor;
            }

            @NotNull
            public final Gradient copy(@NotNull String startColor, @NotNull String endColor) {
                Intrinsics.checkNotNullParameter(startColor, "startColor");
                Intrinsics.checkNotNullParameter(endColor, "endColor");
                return new Gradient(startColor, endColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Gradient)) {
                    return false;
                }
                Gradient gradient = (Gradient) other;
                return Intrinsics.d(this.startColor, gradient.startColor) && Intrinsics.d(this.endColor, gradient.endColor);
            }

            @NotNull
            public final String getEndColor() {
                return this.endColor;
            }

            @NotNull
            public final String getStartColor() {
                return this.startColor;
            }

            public int hashCode() {
                return this.endColor.hashCode() + (this.startColor.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("Gradient(startColor=", this.startColor, ", endColor=", this.endColor, ")");
            }
        }

        public PageItem(@NotNull String image, @NotNull TextDTO title, TextDTO textDTO, Gradient gradient, @NotNull ButtonV3DTO actionButton, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actionButton, "actionButton");
            this.image = image;
            this.title = title;
            this.subtitle = textDTO;
            this.gradient = gradient;
            this.actionButton = actionButton;
            this.trackingInfo = map;
        }

        public static /* synthetic */ PageItem copy$default(PageItem pageItem, String str, TextDTO textDTO, TextDTO textDTO2, Gradient gradient, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = pageItem.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = pageItem.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = pageItem.subtitle;
            }
            if ((i11 & 8) != 0) {
                gradient = pageItem.gradient;
            }
            if ((i11 & 16) != 0) {
                buttonV3DTO = pageItem.actionButton;
            }
            if ((i11 & 32) != 0) {
                map = pageItem.trackingInfo;
            }
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            Map map2 = map;
            return pageItem.copy(str, textDTO, textDTO2, gradient, buttonV3DTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final Gradient getGradient() {
            return this.gradient;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final ButtonV3DTO getActionButton() {
            return this.actionButton;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final PageItem copy(@NotNull String image, @NotNull TextDTO title, TextDTO subtitle, Gradient gradient, @NotNull ButtonV3DTO actionButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actionButton, "actionButton");
            return new PageItem(image, title, subtitle, gradient, actionButton, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageItem)) {
                return false;
            }
            PageItem pageItem = (PageItem) other;
            return Intrinsics.d(this.image, pageItem.image) && Intrinsics.d(this.title, pageItem.title) && Intrinsics.d(this.subtitle, pageItem.subtitle) && Intrinsics.d(this.gradient, pageItem.gradient) && Intrinsics.d(this.actionButton, pageItem.actionButton) && Intrinsics.d(this.trackingInfo, pageItem.trackingInfo);
        }

        @NotNull
        public final ButtonV3DTO getActionButton() {
            return this.actionButton;
        }

        public final Gradient getGradient() {
            return this.gradient;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.image.hashCode() * 31, 31);
            TextDTO textDTO = this.subtitle;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            Gradient gradient = this.gradient;
            int c11 = C2859b.c(this.actionButton, (hashCode + (gradient == null ? 0 : gradient.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return c11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            Gradient gradient = this.gradient;
            ButtonV3DTO buttonV3DTO = this.actionButton;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder b11 = a.b("PageItem(image=", textDTO, str, ", title=", ", subtitle=");
            b11.append(textDTO2);
            b11.append(", gradient=");
            b11.append(gradient);
            b11.append(", actionButton=");
            b11.append(buttonV3DTO);
            b11.append(", trackingInfo=");
            b11.append(map);
            b11.append(")");
            return b11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$SkipButton;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SkipButton {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public SkipButton(@NotNull TextDTO title, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.action = action;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SkipButton copy$default(SkipButton skipButton, TextDTO textDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = skipButton.title;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = skipButton.action;
            }
            if ((i11 & 4) != 0) {
                map = skipButton.trackingInfo;
            }
            return skipButton.copy(textDTO, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final SkipButton copy(@NotNull TextDTO title, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            return new SkipButton(title, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SkipButton)) {
                return false;
            }
            SkipButton skipButton = (SkipButton) other;
            return Intrinsics.d(this.title, skipButton.title) && Intrinsics.d(this.action, skipButton.action) && Intrinsics.d(this.trackingInfo, skipButton.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = Ih.a.b(this.action, this.title.hashCode() * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("SkipButton(title=");
            sb2.append(textDTO);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    public AppOnboardingDTO(@NotNull LogoImage logoImage, @NotNull PageControls pageControls, @NotNull SkipButton skipButton, @NotNull List<PageItem> pages, String str) {
        Intrinsics.checkNotNullParameter(logoImage, "logoImage");
        Intrinsics.checkNotNullParameter(pageControls, "pageControls");
        Intrinsics.checkNotNullParameter(skipButton, "skipButton");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.logoImage = logoImage;
        this.pageControls = pageControls;
        this.skipButton = skipButton;
        this.pages = pages;
        this.shapeImage = str;
    }

    public static /* synthetic */ AppOnboardingDTO copy$default(AppOnboardingDTO appOnboardingDTO, LogoImage logoImage, PageControls pageControls, SkipButton skipButton, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            logoImage = appOnboardingDTO.logoImage;
        }
        if ((i11 & 2) != 0) {
            pageControls = appOnboardingDTO.pageControls;
        }
        if ((i11 & 4) != 0) {
            skipButton = appOnboardingDTO.skipButton;
        }
        if ((i11 & 8) != 0) {
            list = appOnboardingDTO.pages;
        }
        if ((i11 & 16) != 0) {
            str = appOnboardingDTO.shapeImage;
        }
        String str2 = str;
        SkipButton skipButton2 = skipButton;
        return appOnboardingDTO.copy(logoImage, pageControls, skipButton2, list, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LogoImage getLogoImage() {
        return this.logoImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PageControls getPageControls() {
        return this.pageControls;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SkipButton getSkipButton() {
        return this.skipButton;
    }

    @NotNull
    public final List<PageItem> component4() {
        return this.pages;
    }

    /* renamed from: component5, reason: from getter */
    public final String getShapeImage() {
        return this.shapeImage;
    }

    @NotNull
    public final AppOnboardingDTO copy(@NotNull LogoImage logoImage, @NotNull PageControls pageControls, @NotNull SkipButton skipButton, @NotNull List<PageItem> pages, String shapeImage) {
        Intrinsics.checkNotNullParameter(logoImage, "logoImage");
        Intrinsics.checkNotNullParameter(pageControls, "pageControls");
        Intrinsics.checkNotNullParameter(skipButton, "skipButton");
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new AppOnboardingDTO(logoImage, pageControls, skipButton, pages, shapeImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppOnboardingDTO)) {
            return false;
        }
        AppOnboardingDTO appOnboardingDTO = (AppOnboardingDTO) other;
        return Intrinsics.d(this.logoImage, appOnboardingDTO.logoImage) && Intrinsics.d(this.pageControls, appOnboardingDTO.pageControls) && Intrinsics.d(this.skipButton, appOnboardingDTO.skipButton) && Intrinsics.d(this.pages, appOnboardingDTO.pages) && Intrinsics.d(this.shapeImage, appOnboardingDTO.shapeImage);
    }

    @NotNull
    public final LogoImage getLogoImage() {
        return this.logoImage;
    }

    @NotNull
    public final PageControls getPageControls() {
        return this.pageControls;
    }

    @NotNull
    public final List<PageItem> getPages() {
        return this.pages;
    }

    public final String getShapeImage() {
        return this.shapeImage;
    }

    @NotNull
    public final SkipButton getSkipButton() {
        return this.skipButton;
    }

    public int hashCode() {
        int b11 = g.b((this.skipButton.hashCode() + ((this.pageControls.hashCode() + (this.logoImage.hashCode() * 31)) * 31)) * 31, 31, this.pages);
        String str = this.shapeImage;
        return b11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        LogoImage logoImage = this.logoImage;
        PageControls pageControls = this.pageControls;
        SkipButton skipButton = this.skipButton;
        List<PageItem> list = this.pages;
        String str = this.shapeImage;
        StringBuilder sb2 = new StringBuilder("AppOnboardingDTO(logoImage=");
        sb2.append(logoImage);
        sb2.append(", pageControls=");
        sb2.append(pageControls);
        sb2.append(", skipButton=");
        sb2.append(skipButton);
        sb2.append(", pages=");
        sb2.append(list);
        sb2.append(", shapeImage=");
        return o0.c(sb2, str, ")");
    }
}
