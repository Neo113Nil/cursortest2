package spay.sdk.domain.model.response;

import Ak.b;
import An.C2439a;
import B0.A0;
import C.o0;
import I0.C3173b;
import Lf.a;
import N3.C3660k;
import Ve.Om;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0005,-./0B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\t\u0012\u001a\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\t¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010 \u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\tHÆ\u0003J\u001d\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010#\u001a\u00020\u000fHÆ\u0003J\u001d\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\tHÆ\u0003J\u008d\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\tHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R%\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R%\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00061"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig;", "", "version", "", "localization", "Lspay/sdk/domain/model/response/SPaySdkConfig$Localization;", "schemas", "Ljava/util/ArrayList;", "Lspay/sdk/domain/model/response/SPaySdkConfig$Schema;", "Lkotlin/collections/ArrayList;", "featuresToggle", "Lspay/sdk/domain/model/response/SPaySdkConfig$FeatureToggle;", "versionInfo", "Lspay/sdk/domain/model/response/SPaySdkConfig$VersionInfo;", "images", "Lspay/sdk/domain/model/response/SPaySdkConfig$Images;", "sslPins", "(Ljava/lang/String;Lspay/sdk/domain/model/response/SPaySdkConfig$Localization;Ljava/util/ArrayList;Ljava/util/ArrayList;Lspay/sdk/domain/model/response/SPaySdkConfig$VersionInfo;Lspay/sdk/domain/model/response/SPaySdkConfig$Images;Ljava/util/ArrayList;)V", "getFeaturesToggle", "()Ljava/util/ArrayList;", "getImages", "()Lspay/sdk/domain/model/response/SPaySdkConfig$Images;", "getLocalization", "()Lspay/sdk/domain/model/response/SPaySdkConfig$Localization;", "getSchemas", "getSslPins", "getVersion", "()Ljava/lang/String;", "getVersionInfo", "()Lspay/sdk/domain/model/response/SPaySdkConfig$VersionInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "FeatureToggle", "Images", "Localization", "Schema", "VersionInfo", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SPaySdkConfig {

    @NotNull
    private final ArrayList<FeatureToggle> featuresToggle;

    @NotNull
    private final Images images;

    @NotNull
    private final Localization localization;

    @NotNull
    private final ArrayList<Schema> schemas;
    private final ArrayList<String> sslPins;

    @NotNull
    private final String version;
    private final VersionInfo versionInfo;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig$FeatureToggle;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getValue", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FeatureToggle {

        @NotNull
        private final String name;
        private final boolean value;

        public FeatureToggle(@NotNull String name, boolean z11) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.value = z11;
        }

        public static /* synthetic */ FeatureToggle copy$default(FeatureToggle featureToggle, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = featureToggle.name;
            }
            if ((i11 & 2) != 0) {
                z11 = featureToggle.value;
            }
            return featureToggle.copy(str, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        @NotNull
        public final FeatureToggle copy(@NotNull String name, boolean value) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new FeatureToggle(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureToggle)) {
                return false;
            }
            FeatureToggle featureToggle = (FeatureToggle) other;
            return Intrinsics.d(this.name, featureToggle.name) && this.value == featureToggle.value;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final boolean getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            boolean z11 = this.value;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        @NotNull
        public String toString() {
            return b.f("FeatureToggle(name=", this.name, ", value=", ")", this.value);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig$Images;", "", "logoIcon", "", "(Ljava/lang/String;)V", "getLogoIcon", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Images {

        @NotNull
        private final String logoIcon;

        public Images(@NotNull String logoIcon) {
            Intrinsics.checkNotNullParameter(logoIcon, "logoIcon");
            this.logoIcon = logoIcon;
        }

        public static /* synthetic */ Images copy$default(Images images, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = images.logoIcon;
            }
            return images.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLogoIcon() {
            return this.logoIcon;
        }

        @NotNull
        public final Images copy(@NotNull String logoIcon) {
            Intrinsics.checkNotNullParameter(logoIcon, "logoIcon");
            return new Images(logoIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Images) && Intrinsics.d(this.logoIcon, ((Images) other).logoIcon);
        }

        @NotNull
        public final String getLogoIcon() {
            return this.logoIcon;
        }

        public int hashCode() {
            return this.logoIcon.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Images(logoIcon=", this.logoIcon, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig$Localization;", "", "bankApp", "", "bankAppLoading", "payLoading", "payError", "enableSPay", "successEnableSPay", "userProfileInfo", "noPaymentsAccount", "payBindingErrorDescription", "nmtTermsText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankApp", "()Ljava/lang/String;", "getBankAppLoading", "getEnableSPay", "getNmtTermsText", "getNoPaymentsAccount", "getPayBindingErrorDescription", "getPayError", "getPayLoading", "getSuccessEnableSPay", "getUserProfileInfo", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Localization {

        @NotNull
        private final String bankApp;

        @NotNull
        private final String bankAppLoading;

        @NotNull
        private final String enableSPay;

        @NotNull
        private final String nmtTermsText;

        @NotNull
        private final String noPaymentsAccount;

        @NotNull
        private final String payBindingErrorDescription;

        @NotNull
        private final String payError;

        @NotNull
        private final String payLoading;

        @NotNull
        private final String successEnableSPay;

        @NotNull
        private final String userProfileInfo;

        public Localization(@NotNull String bankApp, @NotNull String bankAppLoading, @NotNull String payLoading, @NotNull String payError, @NotNull String enableSPay, @NotNull String successEnableSPay, @NotNull String userProfileInfo, @NotNull String noPaymentsAccount, @NotNull String payBindingErrorDescription, @NotNull String nmtTermsText) {
            Intrinsics.checkNotNullParameter(bankApp, "bankApp");
            Intrinsics.checkNotNullParameter(bankAppLoading, "bankAppLoading");
            Intrinsics.checkNotNullParameter(payLoading, "payLoading");
            Intrinsics.checkNotNullParameter(payError, "payError");
            Intrinsics.checkNotNullParameter(enableSPay, "enableSPay");
            Intrinsics.checkNotNullParameter(successEnableSPay, "successEnableSPay");
            Intrinsics.checkNotNullParameter(userProfileInfo, "userProfileInfo");
            Intrinsics.checkNotNullParameter(noPaymentsAccount, "noPaymentsAccount");
            Intrinsics.checkNotNullParameter(payBindingErrorDescription, "payBindingErrorDescription");
            Intrinsics.checkNotNullParameter(nmtTermsText, "nmtTermsText");
            this.bankApp = bankApp;
            this.bankAppLoading = bankAppLoading;
            this.payLoading = payLoading;
            this.payError = payError;
            this.enableSPay = enableSPay;
            this.successEnableSPay = successEnableSPay;
            this.userProfileInfo = userProfileInfo;
            this.noPaymentsAccount = noPaymentsAccount;
            this.payBindingErrorDescription = payBindingErrorDescription;
            this.nmtTermsText = nmtTermsText;
        }

        public static /* synthetic */ Localization copy$default(Localization localization, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = localization.bankApp;
            }
            if ((i11 & 2) != 0) {
                str2 = localization.bankAppLoading;
            }
            if ((i11 & 4) != 0) {
                str3 = localization.payLoading;
            }
            if ((i11 & 8) != 0) {
                str4 = localization.payError;
            }
            if ((i11 & 16) != 0) {
                str5 = localization.enableSPay;
            }
            if ((i11 & 32) != 0) {
                str6 = localization.successEnableSPay;
            }
            if ((i11 & 64) != 0) {
                str7 = localization.userProfileInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str8 = localization.noPaymentsAccount;
            }
            if ((i11 & 256) != 0) {
                str9 = localization.payBindingErrorDescription;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                str10 = localization.nmtTermsText;
            }
            String str11 = str9;
            String str12 = str10;
            String str13 = str7;
            String str14 = str8;
            String str15 = str5;
            String str16 = str6;
            return localization.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBankApp() {
            return this.bankApp;
        }

        @NotNull
        /* renamed from: component10, reason: from getter */
        public final String getNmtTermsText() {
            return this.nmtTermsText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBankAppLoading() {
            return this.bankAppLoading;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getPayLoading() {
            return this.payLoading;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getPayError() {
            return this.payError;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getEnableSPay() {
            return this.enableSPay;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getSuccessEnableSPay() {
            return this.successEnableSPay;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final String getUserProfileInfo() {
            return this.userProfileInfo;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final String getNoPaymentsAccount() {
            return this.noPaymentsAccount;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final String getPayBindingErrorDescription() {
            return this.payBindingErrorDescription;
        }

        @NotNull
        public final Localization copy(@NotNull String bankApp, @NotNull String bankAppLoading, @NotNull String payLoading, @NotNull String payError, @NotNull String enableSPay, @NotNull String successEnableSPay, @NotNull String userProfileInfo, @NotNull String noPaymentsAccount, @NotNull String payBindingErrorDescription, @NotNull String nmtTermsText) {
            Intrinsics.checkNotNullParameter(bankApp, "bankApp");
            Intrinsics.checkNotNullParameter(bankAppLoading, "bankAppLoading");
            Intrinsics.checkNotNullParameter(payLoading, "payLoading");
            Intrinsics.checkNotNullParameter(payError, "payError");
            Intrinsics.checkNotNullParameter(enableSPay, "enableSPay");
            Intrinsics.checkNotNullParameter(successEnableSPay, "successEnableSPay");
            Intrinsics.checkNotNullParameter(userProfileInfo, "userProfileInfo");
            Intrinsics.checkNotNullParameter(noPaymentsAccount, "noPaymentsAccount");
            Intrinsics.checkNotNullParameter(payBindingErrorDescription, "payBindingErrorDescription");
            Intrinsics.checkNotNullParameter(nmtTermsText, "nmtTermsText");
            return new Localization(bankApp, bankAppLoading, payLoading, payError, enableSPay, successEnableSPay, userProfileInfo, noPaymentsAccount, payBindingErrorDescription, nmtTermsText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Localization)) {
                return false;
            }
            Localization localization = (Localization) other;
            return Intrinsics.d(this.bankApp, localization.bankApp) && Intrinsics.d(this.bankAppLoading, localization.bankAppLoading) && Intrinsics.d(this.payLoading, localization.payLoading) && Intrinsics.d(this.payError, localization.payError) && Intrinsics.d(this.enableSPay, localization.enableSPay) && Intrinsics.d(this.successEnableSPay, localization.successEnableSPay) && Intrinsics.d(this.userProfileInfo, localization.userProfileInfo) && Intrinsics.d(this.noPaymentsAccount, localization.noPaymentsAccount) && Intrinsics.d(this.payBindingErrorDescription, localization.payBindingErrorDescription) && Intrinsics.d(this.nmtTermsText, localization.nmtTermsText);
        }

        @NotNull
        public final String getBankApp() {
            return this.bankApp;
        }

        @NotNull
        public final String getBankAppLoading() {
            return this.bankAppLoading;
        }

        @NotNull
        public final String getEnableSPay() {
            return this.enableSPay;
        }

        @NotNull
        public final String getNmtTermsText() {
            return this.nmtTermsText;
        }

        @NotNull
        public final String getNoPaymentsAccount() {
            return this.noPaymentsAccount;
        }

        @NotNull
        public final String getPayBindingErrorDescription() {
            return this.payBindingErrorDescription;
        }

        @NotNull
        public final String getPayError() {
            return this.payError;
        }

        @NotNull
        public final String getPayLoading() {
            return this.payLoading;
        }

        @NotNull
        public final String getSuccessEnableSPay() {
            return this.successEnableSPay;
        }

        @NotNull
        public final String getUserProfileInfo() {
            return this.userProfileInfo;
        }

        public int hashCode() {
            return this.nmtTermsText.hashCode() + a.b0(a.b0(a.b0(a.b0(a.b0(a.b0(a.b0(a.b0(this.bankApp.hashCode() * 31, this.bankAppLoading), this.payLoading), this.payError), this.enableSPay), this.successEnableSPay), this.userProfileInfo), this.noPaymentsAccount), this.payBindingErrorDescription);
        }

        @NotNull
        public String toString() {
            String str = this.bankApp;
            String str2 = this.bankAppLoading;
            String str3 = this.payLoading;
            String str4 = this.payError;
            String str5 = this.enableSPay;
            String str6 = this.successEnableSPay;
            String str7 = this.userProfileInfo;
            String str8 = this.noPaymentsAccount;
            String str9 = this.payBindingErrorDescription;
            String str10 = this.nmtTermsText;
            StringBuilder d11 = C3660k.d("Localization(bankApp=", str, ", bankAppLoading=", str2, ", payLoading=");
            Nh.a.h(d11, str3, ", payError=", str4, ", enableSPay=");
            Nh.a.h(d11, str5, ", successEnableSPay=", str6, ", userProfileInfo=");
            Nh.a.h(d11, str7, ", noPaymentsAccount=", str8, ", payBindingErrorDescription=");
            return C3173b.c(d11, str9, ", nmtTermsText=", str10, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig$Schema;", "", "stand", "", "bankAppAuthUri", "dynatraceBeaconUri", "dynatraceApplicationId", "getIpUrl", "clickStreamUrl", "clickStreamAppId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankAppAuthUri", "()Ljava/lang/String;", "getClickStreamAppId", "getClickStreamUrl", "getDynatraceApplicationId", "getDynatraceBeaconUri", "getGetIpUrl", "getStand", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Schema {

        @NotNull
        private final String bankAppAuthUri;
        private final String clickStreamAppId;
        private final String clickStreamUrl;

        @NotNull
        private final String dynatraceApplicationId;

        @NotNull
        private final String dynatraceBeaconUri;

        @NotNull
        private final String getIpUrl;

        @NotNull
        private final String stand;

        public Schema(@NotNull String stand, @NotNull String bankAppAuthUri, @NotNull String dynatraceBeaconUri, @NotNull String dynatraceApplicationId, @NotNull String getIpUrl, String str, String str2) {
            Intrinsics.checkNotNullParameter(stand, "stand");
            Intrinsics.checkNotNullParameter(bankAppAuthUri, "bankAppAuthUri");
            Intrinsics.checkNotNullParameter(dynatraceBeaconUri, "dynatraceBeaconUri");
            Intrinsics.checkNotNullParameter(dynatraceApplicationId, "dynatraceApplicationId");
            Intrinsics.checkNotNullParameter(getIpUrl, "getIpUrl");
            this.stand = stand;
            this.bankAppAuthUri = bankAppAuthUri;
            this.dynatraceBeaconUri = dynatraceBeaconUri;
            this.dynatraceApplicationId = dynatraceApplicationId;
            this.getIpUrl = getIpUrl;
            this.clickStreamUrl = str;
            this.clickStreamAppId = str2;
        }

        public static /* synthetic */ Schema copy$default(Schema schema, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = schema.stand;
            }
            if ((i11 & 2) != 0) {
                str2 = schema.bankAppAuthUri;
            }
            if ((i11 & 4) != 0) {
                str3 = schema.dynatraceBeaconUri;
            }
            if ((i11 & 8) != 0) {
                str4 = schema.dynatraceApplicationId;
            }
            if ((i11 & 16) != 0) {
                str5 = schema.getIpUrl;
            }
            if ((i11 & 32) != 0) {
                str6 = schema.clickStreamUrl;
            }
            if ((i11 & 64) != 0) {
                str7 = schema.clickStreamAppId;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return schema.copy(str, str2, str11, str4, str10, str8, str9);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getStand() {
            return this.stand;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBankAppAuthUri() {
            return this.bankAppAuthUri;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDynatraceBeaconUri() {
            return this.dynatraceBeaconUri;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getDynatraceApplicationId() {
            return this.dynatraceApplicationId;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getGetIpUrl() {
            return this.getIpUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final String getClickStreamUrl() {
            return this.clickStreamUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final String getClickStreamAppId() {
            return this.clickStreamAppId;
        }

        @NotNull
        public final Schema copy(@NotNull String stand, @NotNull String bankAppAuthUri, @NotNull String dynatraceBeaconUri, @NotNull String dynatraceApplicationId, @NotNull String getIpUrl, String clickStreamUrl, String clickStreamAppId) {
            Intrinsics.checkNotNullParameter(stand, "stand");
            Intrinsics.checkNotNullParameter(bankAppAuthUri, "bankAppAuthUri");
            Intrinsics.checkNotNullParameter(dynatraceBeaconUri, "dynatraceBeaconUri");
            Intrinsics.checkNotNullParameter(dynatraceApplicationId, "dynatraceApplicationId");
            Intrinsics.checkNotNullParameter(getIpUrl, "getIpUrl");
            return new Schema(stand, bankAppAuthUri, dynatraceBeaconUri, dynatraceApplicationId, getIpUrl, clickStreamUrl, clickStreamAppId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Schema)) {
                return false;
            }
            Schema schema = (Schema) other;
            return Intrinsics.d(this.stand, schema.stand) && Intrinsics.d(this.bankAppAuthUri, schema.bankAppAuthUri) && Intrinsics.d(this.dynatraceBeaconUri, schema.dynatraceBeaconUri) && Intrinsics.d(this.dynatraceApplicationId, schema.dynatraceApplicationId) && Intrinsics.d(this.getIpUrl, schema.getIpUrl) && Intrinsics.d(this.clickStreamUrl, schema.clickStreamUrl) && Intrinsics.d(this.clickStreamAppId, schema.clickStreamAppId);
        }

        @NotNull
        public final String getBankAppAuthUri() {
            return this.bankAppAuthUri;
        }

        public final String getClickStreamAppId() {
            return this.clickStreamAppId;
        }

        public final String getClickStreamUrl() {
            return this.clickStreamUrl;
        }

        @NotNull
        public final String getDynatraceApplicationId() {
            return this.dynatraceApplicationId;
        }

        @NotNull
        public final String getDynatraceBeaconUri() {
            return this.dynatraceBeaconUri;
        }

        @NotNull
        public final String getGetIpUrl() {
            return this.getIpUrl;
        }

        @NotNull
        public final String getStand() {
            return this.stand;
        }

        public int hashCode() {
            int b02 = a.b0(a.b0(a.b0(a.b0(this.stand.hashCode() * 31, this.bankAppAuthUri), this.dynatraceBeaconUri), this.dynatraceApplicationId), this.getIpUrl);
            String str = this.clickStreamUrl;
            int hashCode = (b02 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.clickStreamAppId;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.stand;
            String str2 = this.bankAppAuthUri;
            String str3 = this.dynatraceBeaconUri;
            String str4 = this.dynatraceApplicationId;
            String str5 = this.getIpUrl;
            String str6 = this.clickStreamUrl;
            String str7 = this.clickStreamAppId;
            StringBuilder d11 = C3660k.d("Schema(stand=", str, ", bankAppAuthUri=", str2, ", dynatraceBeaconUri=");
            Nh.a.h(d11, str3, ", dynatraceApplicationId=", str4, ", getIpUrl=");
            Nh.a.h(d11, str5, ", clickStreamUrl=", str6, ", clickStreamAppId=");
            return o0.c(d11, str7, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig$VersionInfo;", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "deprecated", "", "(Ljava/lang/String;Ljava/util/List;)V", "getActive", "()Ljava/lang/String;", "getDeprecated", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class VersionInfo {

        @NotNull
        private final String active;

        @NotNull
        private final List<String> deprecated;

        public VersionInfo(@NotNull String active, @NotNull List<String> deprecated) {
            Intrinsics.checkNotNullParameter(active, "active");
            Intrinsics.checkNotNullParameter(deprecated, "deprecated");
            this.active = active;
            this.deprecated = deprecated;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VersionInfo copy$default(VersionInfo versionInfo, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = versionInfo.active;
            }
            if ((i11 & 2) != 0) {
                list = versionInfo.deprecated;
            }
            return versionInfo.copy(str, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getActive() {
            return this.active;
        }

        @NotNull
        public final List<String> component2() {
            return this.deprecated;
        }

        @NotNull
        public final VersionInfo copy(@NotNull String active, @NotNull List<String> deprecated) {
            Intrinsics.checkNotNullParameter(active, "active");
            Intrinsics.checkNotNullParameter(deprecated, "deprecated");
            return new VersionInfo(active, deprecated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VersionInfo)) {
                return false;
            }
            VersionInfo versionInfo = (VersionInfo) other;
            return Intrinsics.d(this.active, versionInfo.active) && Intrinsics.d(this.deprecated, versionInfo.deprecated);
        }

        @NotNull
        public final String getActive() {
            return this.active;
        }

        @NotNull
        public final List<String> getDeprecated() {
            return this.deprecated;
        }

        public int hashCode() {
            return this.deprecated.hashCode() + (this.active.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("VersionInfo(active=", this.active, ", deprecated=", ")", this.deprecated);
        }
    }

    public SPaySdkConfig(@NotNull String version, @NotNull Localization localization, @NotNull ArrayList<Schema> schemas, @NotNull ArrayList<FeatureToggle> featuresToggle, VersionInfo versionInfo, @NotNull Images images, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(schemas, "schemas");
        Intrinsics.checkNotNullParameter(featuresToggle, "featuresToggle");
        Intrinsics.checkNotNullParameter(images, "images");
        this.version = version;
        this.localization = localization;
        this.schemas = schemas;
        this.featuresToggle = featuresToggle;
        this.versionInfo = versionInfo;
        this.images = images;
        this.sslPins = arrayList;
    }

    public static /* synthetic */ SPaySdkConfig copy$default(SPaySdkConfig sPaySdkConfig, String str, Localization localization, ArrayList arrayList, ArrayList arrayList2, VersionInfo versionInfo, Images images, ArrayList arrayList3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sPaySdkConfig.version;
        }
        if ((i11 & 2) != 0) {
            localization = sPaySdkConfig.localization;
        }
        if ((i11 & 4) != 0) {
            arrayList = sPaySdkConfig.schemas;
        }
        if ((i11 & 8) != 0) {
            arrayList2 = sPaySdkConfig.featuresToggle;
        }
        if ((i11 & 16) != 0) {
            versionInfo = sPaySdkConfig.versionInfo;
        }
        if ((i11 & 32) != 0) {
            images = sPaySdkConfig.images;
        }
        if ((i11 & 64) != 0) {
            arrayList3 = sPaySdkConfig.sslPins;
        }
        Images images2 = images;
        ArrayList arrayList4 = arrayList3;
        VersionInfo versionInfo2 = versionInfo;
        ArrayList arrayList5 = arrayList;
        return sPaySdkConfig.copy(str, localization, arrayList5, arrayList2, versionInfo2, images2, arrayList4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Localization getLocalization() {
        return this.localization;
    }

    @NotNull
    public final ArrayList<Schema> component3() {
        return this.schemas;
    }

    @NotNull
    public final ArrayList<FeatureToggle> component4() {
        return this.featuresToggle;
    }

    /* renamed from: component5, reason: from getter */
    public final VersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Images getImages() {
        return this.images;
    }

    public final ArrayList<String> component7() {
        return this.sslPins;
    }

    @NotNull
    public final SPaySdkConfig copy(@NotNull String version, @NotNull Localization localization, @NotNull ArrayList<Schema> schemas, @NotNull ArrayList<FeatureToggle> featuresToggle, VersionInfo versionInfo, @NotNull Images images, ArrayList<String> sslPins) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(schemas, "schemas");
        Intrinsics.checkNotNullParameter(featuresToggle, "featuresToggle");
        Intrinsics.checkNotNullParameter(images, "images");
        return new SPaySdkConfig(version, localization, schemas, featuresToggle, versionInfo, images, sslPins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPaySdkConfig)) {
            return false;
        }
        SPaySdkConfig sPaySdkConfig = (SPaySdkConfig) other;
        return Intrinsics.d(this.version, sPaySdkConfig.version) && Intrinsics.d(this.localization, sPaySdkConfig.localization) && Intrinsics.d(this.schemas, sPaySdkConfig.schemas) && Intrinsics.d(this.featuresToggle, sPaySdkConfig.featuresToggle) && Intrinsics.d(this.versionInfo, sPaySdkConfig.versionInfo) && Intrinsics.d(this.images, sPaySdkConfig.images) && Intrinsics.d(this.sslPins, sPaySdkConfig.sslPins);
    }

    @NotNull
    public final ArrayList<FeatureToggle> getFeaturesToggle() {
        return this.featuresToggle;
    }

    @NotNull
    public final Images getImages() {
        return this.images;
    }

    @NotNull
    public final Localization getLocalization() {
        return this.localization;
    }

    @NotNull
    public final ArrayList<Schema> getSchemas() {
        return this.schemas;
    }

    public final ArrayList<String> getSslPins() {
        return this.sslPins;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final VersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    public int hashCode() {
        int hashCode = (this.featuresToggle.hashCode() + ((this.schemas.hashCode() + ((this.localization.hashCode() + (this.version.hashCode() * 31)) * 31)) * 31)) * 31;
        VersionInfo versionInfo = this.versionInfo;
        int hashCode2 = (this.images.hashCode() + ((hashCode + (versionInfo == null ? 0 : versionInfo.hashCode())) * 31)) * 31;
        ArrayList<String> arrayList = this.sslPins;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.version;
        Localization localization = this.localization;
        ArrayList<Schema> arrayList = this.schemas;
        ArrayList<FeatureToggle> arrayList2 = this.featuresToggle;
        VersionInfo versionInfo = this.versionInfo;
        Images images = this.images;
        ArrayList<String> arrayList3 = this.sslPins;
        StringBuilder sb2 = new StringBuilder("SPaySdkConfig(version=");
        sb2.append(str);
        sb2.append(", localization=");
        sb2.append(localization);
        sb2.append(", schemas=");
        sb2.append(arrayList);
        sb2.append(", featuresToggle=");
        sb2.append(arrayList2);
        sb2.append(", versionInfo=");
        sb2.append(versionInfo);
        sb2.append(", images=");
        sb2.append(images);
        sb2.append(", sslPins=");
        return Om.a(")", sb2, arrayList3);
    }
}
