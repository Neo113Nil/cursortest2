package ru.ozon.app.android.pdp.widgets.navBar.data;

import B0.C2454a;
import C.o0;
import Kk.C3532b;
import N3.C3660k;
import Pk0.a;
import Sc.InterfaceC3999a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b0\b\u0081\b\u0018\u0000 >2\u00020\u0001:\u0004>?@AB\u0093\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J¨\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\rHÖ\u0001J\t\u0010=\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010%\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010 ¨\u0006B"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO;", "", "buttonsConfig", "Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$ButtonsConfig;", "backgroundColor", "", "backButton", "Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$NavBarButton;", "rightButtons", "", "isAlwaysSolid", "", "cornerRadius", "", "cornerRadiusToken", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "subwidgetTrackingInfo", "opacityChangeLevel", "isCommonBgForIcons", "<init>", "(Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$ButtonsConfig;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$NavBarButton;Ljava/util/List;ZLjava/lang/Integer;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/util/Map;Ljava/util/Map;IZ)V", "getButtonsConfig", "()Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$ButtonsConfig;", "getBackgroundColor", "()Ljava/lang/String;", "getBackButton", "()Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$NavBarButton;", "getRightButtons", "()Ljava/util/List;", "()Z", "getCornerRadius$annotations", "()V", "getCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCornerRadiusToken", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTrackingInfo", "()Ljava/util/Map;", "getSubwidgetTrackingInfo", "getOpacityChangeLevel", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$ButtonsConfig;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$NavBarButton;Ljava/util/List;ZLjava/lang/Integer;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/util/Map;Ljava/util/Map;IZ)Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO;", "equals", "other", "hashCode", "toString", "Companion", "NavBarButton", "ButtonsConfig", "Colors", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NavBarDTO {

    @Deprecated
    @NotNull
    public static final String FAVORITE_MOLECULE_BUTTON = "favoriteMolecule";

    @Deprecated
    @NotNull
    public static final String NAV_BAR_BUTTON = "navBarButton";

    @Deprecated
    @NotNull
    public static final String TYPE = "type";

    @NotNull
    private final NavBarButton backButton;
    private final String backgroundColor;
    private final ButtonsConfig buttonsConfig;
    private final Integer cornerRadius;
    private final CornerRadius cornerRadiusToken;
    private final boolean isAlwaysSolid;
    private final boolean isCommonBgForIcons;
    private final int opacityChangeLevel;
    private final List<Object> rightButtons;
    private final Map<String, TokenizedTrackingInfo> subwidgetTrackingInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$ButtonsConfig;", "", "cornerRadius", "", "cornerRadiusToken", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "colors", "Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$Colors;", "<init>", "(Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$Colors;)V", "getCornerRadius$annotations", "()V", "getCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCornerRadiusToken", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getColors", "()Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$Colors;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$Colors;)Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$ButtonsConfig;", "equals", "", "other", "hashCode", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonsConfig {
        public static final int $stable = 0;
        private final Colors colors;
        private final Integer cornerRadius;
        private final CornerRadius cornerRadiusToken;

        public ButtonsConfig(Integer num, CornerRadius cornerRadius, Colors colors) {
            this.cornerRadius = num;
            this.cornerRadiusToken = cornerRadius;
            this.colors = colors;
        }

        public static /* synthetic */ ButtonsConfig copy$default(ButtonsConfig buttonsConfig, Integer num, CornerRadius cornerRadius, Colors colors, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = buttonsConfig.cornerRadius;
            }
            if ((i11 & 2) != 0) {
                cornerRadius = buttonsConfig.cornerRadiusToken;
            }
            if ((i11 & 4) != 0) {
                colors = buttonsConfig.colors;
            }
            return buttonsConfig.copy(num, cornerRadius, colors);
        }

        @InterfaceC3999a
        public static /* synthetic */ void getCornerRadius$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component2, reason: from getter */
        public final CornerRadius getCornerRadiusToken() {
            return this.cornerRadiusToken;
        }

        /* renamed from: component3, reason: from getter */
        public final Colors getColors() {
            return this.colors;
        }

        @NotNull
        public final ButtonsConfig copy(Integer cornerRadius, CornerRadius cornerRadiusToken, Colors colors) {
            return new ButtonsConfig(cornerRadius, cornerRadiusToken, colors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonsConfig)) {
                return false;
            }
            ButtonsConfig buttonsConfig = (ButtonsConfig) other;
            return Intrinsics.d(this.cornerRadius, buttonsConfig.cornerRadius) && this.cornerRadiusToken == buttonsConfig.cornerRadiusToken && Intrinsics.d(this.colors, buttonsConfig.colors);
        }

        public final Colors getColors() {
            return this.colors;
        }

        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        public final CornerRadius getCornerRadiusToken() {
            return this.cornerRadiusToken;
        }

        public int hashCode() {
            Integer num = this.cornerRadius;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            CornerRadius cornerRadius = this.cornerRadiusToken;
            int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            Colors colors = this.colors;
            return hashCode2 + (colors != null ? colors.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ButtonsConfig(cornerRadius=" + this.cornerRadius + ", cornerRadiusToken=" + this.cornerRadiusToken + ", colors=" + this.colors + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$Colors;", "", "buttonBackgroundColor", "", "iconTintColor", "scrolledIconTintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonBackgroundColor", "()Ljava/lang/String;", "getIconTintColor", "getScrolledIconTintColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final String buttonBackgroundColor;
        private final String iconTintColor;
        private final String scrolledIconTintColor;

        public Colors(String str, String str2, String str3) {
            this.buttonBackgroundColor = str;
            this.iconTintColor = str2;
            this.scrolledIconTintColor = str3;
        }

        public static /* synthetic */ Colors copy$default(Colors colors, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = colors.buttonBackgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = colors.iconTintColor;
            }
            if ((i11 & 4) != 0) {
                str3 = colors.scrolledIconTintColor;
            }
            return colors.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getButtonBackgroundColor() {
            return this.buttonBackgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getScrolledIconTintColor() {
            return this.scrolledIconTintColor;
        }

        @NotNull
        public final Colors copy(String buttonBackgroundColor, String iconTintColor, String scrolledIconTintColor) {
            return new Colors(buttonBackgroundColor, iconTintColor, scrolledIconTintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Intrinsics.d(this.buttonBackgroundColor, colors.buttonBackgroundColor) && Intrinsics.d(this.iconTintColor, colors.iconTintColor) && Intrinsics.d(this.scrolledIconTintColor, colors.scrolledIconTintColor);
        }

        public final String getButtonBackgroundColor() {
            return this.buttonBackgroundColor;
        }

        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        public final String getScrolledIconTintColor() {
            return this.scrolledIconTintColor;
        }

        public int hashCode() {
            String str = this.buttonBackgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconTintColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.scrolledIconTintColor;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.buttonBackgroundColor;
            String str2 = this.iconTintColor;
            return o0.c(C3660k.d("Colors(buttonBackgroundColor=", str, ", iconTintColor=", str2, ", scrolledIconTintColor="), this.scrolledIconTintColor, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$Companion;", "", "<init>", "()V", "TYPE", "", "NAV_BAR_BUTTON", "FAVORITE_MOLECULE_BUTTON", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO$NavBarButton;", "", "icon", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getIcon", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavBarButton {
        public static final int $stable = 0;
        private final CommonControlSettings common;

        @NotNull
        private final String icon;

        public NavBarButton(@NotNull String icon, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ NavBarButton copy$default(NavBarButton navBarButton, String str, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = navBarButton.icon;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = navBarButton.common;
            }
            return navBarButton.copy(str, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final NavBarButton copy(@NotNull String icon, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new NavBarButton(icon, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavBarButton)) {
                return false;
            }
            NavBarButton navBarButton = (NavBarButton) other;
            return Intrinsics.d(this.icon, navBarButton.icon) && Intrinsics.d(this.common, navBarButton.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            return "NavBarButton(icon=" + this.icon + ", common=" + this.common + ")";
        }
    }

    public NavBarDTO(ButtonsConfig buttonsConfig, String str, @NotNull NavBarButton backButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "navBarButton", type = NavBarButton.class), @ProtoOneOfSignature(name = "favoriteMolecule", type = FavoriteProductMoleculeV4.class)}) @ProtoOneOf(label = "type") List<? extends Object> list, boolean z11, Integer num, CornerRadius cornerRadius, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, int i11, boolean z12) {
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        this.buttonsConfig = buttonsConfig;
        this.backgroundColor = str;
        this.backButton = backButton;
        this.rightButtons = list;
        this.isAlwaysSolid = z11;
        this.cornerRadius = num;
        this.cornerRadiusToken = cornerRadius;
        this.trackingInfo = map;
        this.subwidgetTrackingInfo = map2;
        this.opacityChangeLevel = i11;
        this.isCommonBgForIcons = z12;
    }

    public static /* synthetic */ NavBarDTO copy$default(NavBarDTO navBarDTO, ButtonsConfig buttonsConfig, String str, NavBarButton navBarButton, List list, boolean z11, Integer num, CornerRadius cornerRadius, Map map, Map map2, int i11, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            buttonsConfig = navBarDTO.buttonsConfig;
        }
        if ((i12 & 2) != 0) {
            str = navBarDTO.backgroundColor;
        }
        if ((i12 & 4) != 0) {
            navBarButton = navBarDTO.backButton;
        }
        if ((i12 & 8) != 0) {
            list = navBarDTO.rightButtons;
        }
        if ((i12 & 16) != 0) {
            z11 = navBarDTO.isAlwaysSolid;
        }
        if ((i12 & 32) != 0) {
            num = navBarDTO.cornerRadius;
        }
        if ((i12 & 64) != 0) {
            cornerRadius = navBarDTO.cornerRadiusToken;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = navBarDTO.trackingInfo;
        }
        if ((i12 & 256) != 0) {
            map2 = navBarDTO.subwidgetTrackingInfo;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            i11 = navBarDTO.opacityChangeLevel;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            z12 = navBarDTO.isCommonBgForIcons;
        }
        int i13 = i11;
        boolean z13 = z12;
        Map map3 = map;
        Map map4 = map2;
        Integer num2 = num;
        CornerRadius cornerRadius2 = cornerRadius;
        boolean z14 = z11;
        NavBarButton navBarButton2 = navBarButton;
        return navBarDTO.copy(buttonsConfig, str, navBarButton2, list, z14, num2, cornerRadius2, map3, map4, i13, z13);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getCornerRadius$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonsConfig getButtonsConfig() {
        return this.buttonsConfig;
    }

    /* renamed from: component10, reason: from getter */
    public final int getOpacityChangeLevel() {
        return this.opacityChangeLevel;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsCommonBgForIcons() {
        return this.isCommonBgForIcons;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final NavBarButton getBackButton() {
        return this.backButton;
    }

    public final List<Object> component4() {
        return this.rightButtons;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAlwaysSolid() {
        return this.isAlwaysSolid;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component7, reason: from getter */
    public final CornerRadius getCornerRadiusToken() {
        return this.cornerRadiusToken;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.subwidgetTrackingInfo;
    }

    @NotNull
    public final NavBarDTO copy(ButtonsConfig buttonsConfig, String backgroundColor, @NotNull NavBarButton backButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "navBarButton", type = NavBarButton.class), @ProtoOneOfSignature(name = "favoriteMolecule", type = FavoriteProductMoleculeV4.class)}) @ProtoOneOf(label = "type") List<? extends Object> rightButtons, boolean isAlwaysSolid, Integer cornerRadius, CornerRadius cornerRadiusToken, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> subwidgetTrackingInfo, int opacityChangeLevel, boolean isCommonBgForIcons) {
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        return new NavBarDTO(buttonsConfig, backgroundColor, backButton, rightButtons, isAlwaysSolid, cornerRadius, cornerRadiusToken, trackingInfo, subwidgetTrackingInfo, opacityChangeLevel, isCommonBgForIcons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarDTO)) {
            return false;
        }
        NavBarDTO navBarDTO = (NavBarDTO) other;
        return Intrinsics.d(this.buttonsConfig, navBarDTO.buttonsConfig) && Intrinsics.d(this.backgroundColor, navBarDTO.backgroundColor) && Intrinsics.d(this.backButton, navBarDTO.backButton) && Intrinsics.d(this.rightButtons, navBarDTO.rightButtons) && this.isAlwaysSolid == navBarDTO.isAlwaysSolid && Intrinsics.d(this.cornerRadius, navBarDTO.cornerRadius) && this.cornerRadiusToken == navBarDTO.cornerRadiusToken && Intrinsics.d(this.trackingInfo, navBarDTO.trackingInfo) && Intrinsics.d(this.subwidgetTrackingInfo, navBarDTO.subwidgetTrackingInfo) && this.opacityChangeLevel == navBarDTO.opacityChangeLevel && this.isCommonBgForIcons == navBarDTO.isCommonBgForIcons;
    }

    @NotNull
    public final NavBarButton getBackButton() {
        return this.backButton;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonsConfig getButtonsConfig() {
        return this.buttonsConfig;
    }

    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    public final CornerRadius getCornerRadiusToken() {
        return this.cornerRadiusToken;
    }

    public final int getOpacityChangeLevel() {
        return this.opacityChangeLevel;
    }

    public final List<Object> getRightButtons() {
        return this.rightButtons;
    }

    public final Map<String, TokenizedTrackingInfo> getSubwidgetTrackingInfo() {
        return this.subwidgetTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        ButtonsConfig buttonsConfig = this.buttonsConfig;
        int hashCode = (buttonsConfig == null ? 0 : buttonsConfig.hashCode()) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (this.backButton.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List<Object> list = this.rightButtons;
        int a11 = C3532b.a((hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isAlwaysSolid);
        Integer num = this.cornerRadius;
        int hashCode3 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadiusToken;
        int hashCode4 = (hashCode3 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.subwidgetTrackingInfo;
        return Boolean.hashCode(this.isCommonBgForIcons) + C2454a.a(this.opacityChangeLevel, (hashCode5 + (map2 != null ? map2.hashCode() : 0)) * 31, 31);
    }

    public final boolean isAlwaysSolid() {
        return this.isAlwaysSolid;
    }

    public final boolean isCommonBgForIcons() {
        return this.isCommonBgForIcons;
    }

    @NotNull
    public String toString() {
        ButtonsConfig buttonsConfig = this.buttonsConfig;
        String str = this.backgroundColor;
        NavBarButton navBarButton = this.backButton;
        List<Object> list = this.rightButtons;
        boolean z11 = this.isAlwaysSolid;
        Integer num = this.cornerRadius;
        CornerRadius cornerRadius = this.cornerRadiusToken;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.subwidgetTrackingInfo;
        int i11 = this.opacityChangeLevel;
        boolean z12 = this.isCommonBgForIcons;
        StringBuilder sb2 = new StringBuilder("NavBarDTO(buttonsConfig=");
        sb2.append(buttonsConfig);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", backButton=");
        sb2.append(navBarButton);
        sb2.append(", rightButtons=");
        sb2.append(list);
        sb2.append(", isAlwaysSolid=");
        sb2.append(z11);
        sb2.append(", cornerRadius=");
        sb2.append(num);
        sb2.append(", cornerRadiusToken=");
        sb2.append(cornerRadius);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", subwidgetTrackingInfo=");
        sb2.append(map2);
        sb2.append(", opacityChangeLevel=");
        sb2.append(i11);
        sb2.append(", isCommonBgForIcons=");
        return a.a(")", sb2, z12);
    }

    public /* synthetic */ NavBarDTO(ButtonsConfig buttonsConfig, String str, NavBarButton navBarButton, List list, boolean z11, Integer num, CornerRadius cornerRadius, Map map, Map map2, int i11, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonsConfig, str, navBarButton, list, (i12 & 16) != 0 ? false : z11, num, cornerRadius, map, map2, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 0 : i11, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z12);
    }
}
