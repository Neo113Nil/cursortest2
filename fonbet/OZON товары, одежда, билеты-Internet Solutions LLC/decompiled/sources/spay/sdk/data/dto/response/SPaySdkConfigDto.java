package spay.sdk.data.dto.response;

import An.C2439a;
import B0.A0;
import C.o0;
import I0.C3173b;
import J8.b;
import N3.C3660k;
import Nh.a;
import Ve.C4452mn;
import Ve.Om;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.SPaySdkConfig;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005/0123B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\n\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u0001`\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\n¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010!\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\nHÆ\u0003J!\u0010\"\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u0001`\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u001d\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\nHÆ\u0003J\u009b\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\n2 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u0001`\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\nHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\b\u0010-\u001a\u00020\u0002H\u0016J\t\u0010.\u001a\u00020\u0004HÖ\u0001R.\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R.\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R*\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00064"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig;", "version", "", "localization", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$LocalizationDto;", "schemas", "Ljava/util/ArrayList;", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$SchemaDto;", "Lkotlin/collections/ArrayList;", "featuresToggle", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$FeatureToggleDto;", "images", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$ImagesDto;", "versionInfoDto", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$VersionInfoDto;", "sslPins", "(Ljava/lang/String;Lspay/sdk/data/dto/response/SPaySdkConfigDto$LocalizationDto;Ljava/util/ArrayList;Ljava/util/ArrayList;Lspay/sdk/data/dto/response/SPaySdkConfigDto$ImagesDto;Lspay/sdk/data/dto/response/SPaySdkConfigDto$VersionInfoDto;Ljava/util/ArrayList;)V", "getFeaturesToggle", "()Ljava/util/ArrayList;", "getImages", "()Lspay/sdk/data/dto/response/SPaySdkConfigDto$ImagesDto;", "getLocalization", "()Lspay/sdk/data/dto/response/SPaySdkConfigDto$LocalizationDto;", "getSchemas", "getSslPins", "getVersion", "()Ljava/lang/String;", "getVersionInfoDto", "()Lspay/sdk/data/dto/response/SPaySdkConfigDto$VersionInfoDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "FeatureToggleDto", "ImagesDto", "LocalizationDto", "SchemaDto", "VersionInfoDto", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SPaySdkConfigDto implements DataDtoInterface<SPaySdkConfig> {

    @b("featuresToggle")
    private final ArrayList<FeatureToggleDto> featuresToggle;

    @b("images")
    private final ImagesDto images;

    @b("localization")
    private final LocalizationDto localization;

    @b("schemas")
    private final ArrayList<SchemaDto> schemas;

    @b("sslPins")
    private final ArrayList<String> sslPins;

    @b("version")
    private final String version;

    @b("versionInfo")
    private final VersionInfoDto versionInfoDto;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$FeatureToggleDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig$FeatureToggle;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lspay/sdk/data/dto/response/SPaySdkConfigDto$FeatureToggleDto;", "equals", "other", "", "hashCode", "", "toModel", "toString", "Companion", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FeatureToggleDto implements DataDtoInterface<SPaySdkConfig.FeatureToggle> {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @b(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        @b(AppMeasurementSdk.ConditionalUserProperty.VALUE)
        private final Boolean value;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006*\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\u0006¨\u0006\b"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$FeatureToggleDto$Companion;", "", "()V", "toModelArray", "Ljava/util/ArrayList;", "Lspay/sdk/domain/model/response/SPaySdkConfig$FeatureToggle;", "Lkotlin/collections/ArrayList;", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$FeatureToggleDto;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ArrayList<SPaySdkConfig.FeatureToggle> toModelArray(@NotNull ArrayList<FeatureToggleDto> arrayList) {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                ArrayList<SPaySdkConfig.FeatureToggle> arrayList2 = new ArrayList<>();
                Iterator<FeatureToggleDto> it = arrayList.iterator();
                while (it.hasNext()) {
                    FeatureToggleDto next = it.next();
                    arrayList2.add(next != null ? next.toModel() : null);
                }
                return arrayList2;
            }

            private Companion() {
            }
        }

        public FeatureToggleDto(String str, Boolean bool) {
            this.name = str;
            this.value = bool;
        }

        public static /* synthetic */ FeatureToggleDto copy$default(FeatureToggleDto featureToggleDto, String str, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = featureToggleDto.name;
            }
            if ((i11 & 2) != 0) {
                bool = featureToggleDto.value;
            }
            return featureToggleDto.copy(str, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getValue() {
            return this.value;
        }

        @NotNull
        public final FeatureToggleDto copy(String name, Boolean value) {
            return new FeatureToggleDto(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureToggleDto)) {
                return false;
            }
            FeatureToggleDto featureToggleDto = (FeatureToggleDto) other;
            return Intrinsics.d(this.name, featureToggleDto.name) && Intrinsics.d(this.value, featureToggleDto.value);
        }

        public final String getName() {
            return this.name;
        }

        public final Boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.value;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FeatureToggleDto(name=" + this.name + ", value=" + this.value + ")";
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        @NotNull
        public SPaySdkConfig.FeatureToggle toModel() {
            String str = this.name;
            if (str == null) {
                throw new C4452mn(AppMeasurementSdk.ConditionalUserProperty.NAME);
            }
            Boolean bool = this.value;
            if (bool != null) {
                return new SPaySdkConfig.FeatureToggle(str, bool.booleanValue());
            }
            throw new C4452mn(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$ImagesDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig$Images;", "logoIcon", "", "(Ljava/lang/String;)V", "getLogoIcon", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ImagesDto implements DataDtoInterface<SPaySdkConfig.Images> {

        @b("logoIcon")
        private final String logoIcon;

        public ImagesDto(String str) {
            this.logoIcon = str;
        }

        public static /* synthetic */ ImagesDto copy$default(ImagesDto imagesDto, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = imagesDto.logoIcon;
            }
            return imagesDto.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLogoIcon() {
            return this.logoIcon;
        }

        @NotNull
        public final ImagesDto copy(String logoIcon) {
            return new ImagesDto(logoIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ImagesDto) && Intrinsics.d(this.logoIcon, ((ImagesDto) other).logoIcon);
        }

        public final String getLogoIcon() {
            return this.logoIcon;
        }

        public int hashCode() {
            String str = this.logoIcon;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("ImagesDto(logoIcon=", this.logoIcon, ")");
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        @NotNull
        public SPaySdkConfig.Images toModel() {
            String str = this.logoIcon;
            if (str != null) {
                return new SPaySdkConfig.Images(str);
            }
            throw new C4452mn("logoIcon");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0081\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\b\u0010+\u001a\u00020\u0002H\u0016J\t\u0010,\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006-"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$LocalizationDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig$Localization;", "bankApp", "", "bankAppLoading", "payLoading", "payError", "enableSPay", "successEnableSPay", "userProfileInfo", "noPaymentsAccount", "payBindingErrorDescription", "npmLinkText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankApp", "()Ljava/lang/String;", "getBankAppLoading", "getEnableSPay", "getNoPaymentsAccount", "getNpmLinkText", "getPayBindingErrorDescription", "getPayError", "getPayLoading", "getSuccessEnableSPay", "getUserProfileInfo", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LocalizationDto implements DataDtoInterface<SPaySdkConfig.Localization> {

        @b("bankApp")
        private final String bankApp;

        @b("bankAppLoading")
        private final String bankAppLoading;

        @b("enableSPay")
        private final String enableSPay;

        @b("noPaymentsAccountsSubtitle")
        private final String noPaymentsAccount;

        @b("npmLinkText")
        private final String npmLinkText;

        @b("payBindingErrorDescription")
        private final String payBindingErrorDescription;

        @b("payError")
        private final String payError;

        @b("payLoading")
        private final String payLoading;

        @b("successEnableSPay")
        private final String successEnableSPay;

        @b("userProfileInfo")
        private final String userProfileInfo;

        public LocalizationDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.bankApp = str;
            this.bankAppLoading = str2;
            this.payLoading = str3;
            this.payError = str4;
            this.enableSPay = str5;
            this.successEnableSPay = str6;
            this.userProfileInfo = str7;
            this.noPaymentsAccount = str8;
            this.payBindingErrorDescription = str9;
            this.npmLinkText = str10;
        }

        public static /* synthetic */ LocalizationDto copy$default(LocalizationDto localizationDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = localizationDto.bankApp;
            }
            if ((i11 & 2) != 0) {
                str2 = localizationDto.bankAppLoading;
            }
            if ((i11 & 4) != 0) {
                str3 = localizationDto.payLoading;
            }
            if ((i11 & 8) != 0) {
                str4 = localizationDto.payError;
            }
            if ((i11 & 16) != 0) {
                str5 = localizationDto.enableSPay;
            }
            if ((i11 & 32) != 0) {
                str6 = localizationDto.successEnableSPay;
            }
            if ((i11 & 64) != 0) {
                str7 = localizationDto.userProfileInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str8 = localizationDto.noPaymentsAccount;
            }
            if ((i11 & 256) != 0) {
                str9 = localizationDto.payBindingErrorDescription;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                str10 = localizationDto.npmLinkText;
            }
            String str11 = str9;
            String str12 = str10;
            String str13 = str7;
            String str14 = str8;
            String str15 = str5;
            String str16 = str6;
            return localizationDto.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBankApp() {
            return this.bankApp;
        }

        /* renamed from: component10, reason: from getter */
        public final String getNpmLinkText() {
            return this.npmLinkText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBankAppLoading() {
            return this.bankAppLoading;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPayLoading() {
            return this.payLoading;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPayError() {
            return this.payError;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEnableSPay() {
            return this.enableSPay;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSuccessEnableSPay() {
            return this.successEnableSPay;
        }

        /* renamed from: component7, reason: from getter */
        public final String getUserProfileInfo() {
            return this.userProfileInfo;
        }

        /* renamed from: component8, reason: from getter */
        public final String getNoPaymentsAccount() {
            return this.noPaymentsAccount;
        }

        /* renamed from: component9, reason: from getter */
        public final String getPayBindingErrorDescription() {
            return this.payBindingErrorDescription;
        }

        @NotNull
        public final LocalizationDto copy(String bankApp, String bankAppLoading, String payLoading, String payError, String enableSPay, String successEnableSPay, String userProfileInfo, String noPaymentsAccount, String payBindingErrorDescription, String npmLinkText) {
            return new LocalizationDto(bankApp, bankAppLoading, payLoading, payError, enableSPay, successEnableSPay, userProfileInfo, noPaymentsAccount, payBindingErrorDescription, npmLinkText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalizationDto)) {
                return false;
            }
            LocalizationDto localizationDto = (LocalizationDto) other;
            return Intrinsics.d(this.bankApp, localizationDto.bankApp) && Intrinsics.d(this.bankAppLoading, localizationDto.bankAppLoading) && Intrinsics.d(this.payLoading, localizationDto.payLoading) && Intrinsics.d(this.payError, localizationDto.payError) && Intrinsics.d(this.enableSPay, localizationDto.enableSPay) && Intrinsics.d(this.successEnableSPay, localizationDto.successEnableSPay) && Intrinsics.d(this.userProfileInfo, localizationDto.userProfileInfo) && Intrinsics.d(this.noPaymentsAccount, localizationDto.noPaymentsAccount) && Intrinsics.d(this.payBindingErrorDescription, localizationDto.payBindingErrorDescription) && Intrinsics.d(this.npmLinkText, localizationDto.npmLinkText);
        }

        public final String getBankApp() {
            return this.bankApp;
        }

        public final String getBankAppLoading() {
            return this.bankAppLoading;
        }

        public final String getEnableSPay() {
            return this.enableSPay;
        }

        public final String getNoPaymentsAccount() {
            return this.noPaymentsAccount;
        }

        public final String getNpmLinkText() {
            return this.npmLinkText;
        }

        public final String getPayBindingErrorDescription() {
            return this.payBindingErrorDescription;
        }

        public final String getPayError() {
            return this.payError;
        }

        public final String getPayLoading() {
            return this.payLoading;
        }

        public final String getSuccessEnableSPay() {
            return this.successEnableSPay;
        }

        public final String getUserProfileInfo() {
            return this.userProfileInfo;
        }

        public int hashCode() {
            String str = this.bankApp;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankAppLoading;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.payLoading;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.payError;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.enableSPay;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.successEnableSPay;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.userProfileInfo;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.noPaymentsAccount;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.payBindingErrorDescription;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.npmLinkText;
            return hashCode9 + (str10 != null ? str10.hashCode() : 0);
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
            String str10 = this.npmLinkText;
            StringBuilder d11 = C3660k.d("LocalizationDto(bankApp=", str, ", bankAppLoading=", str2, ", payLoading=");
            a.h(d11, str3, ", payError=", str4, ", enableSPay=");
            a.h(d11, str5, ", successEnableSPay=", str6, ", userProfileInfo=");
            a.h(d11, str7, ", noPaymentsAccount=", str8, ", payBindingErrorDescription=");
            return C3173b.c(d11, str9, ", npmLinkText=", str10, ")");
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        @NotNull
        public SPaySdkConfig.Localization toModel() {
            String str;
            String str2;
            String str3;
            String str4 = this.bankApp;
            if (str4 == null) {
                throw new C4452mn("bankApp");
            }
            String str5 = this.bankAppLoading;
            if (str5 == null) {
                throw new C4452mn("bankAppLoading");
            }
            String str6 = this.payLoading;
            if (str6 == null) {
                throw new C4452mn("payLoading");
            }
            String str7 = this.payError;
            if (str7 == null) {
                throw new C4452mn("payError");
            }
            String str8 = this.enableSPay;
            if (str8 == null) {
                throw new C4452mn("enableSPay");
            }
            String str9 = this.successEnableSPay;
            if (str9 == null) {
                throw new C4452mn("successEnableSPay");
            }
            String str10 = this.userProfileInfo;
            if (str10 == null) {
                str10 = "";
            }
            String str11 = this.noPaymentsAccount;
            if (str11 == null) {
                str11 = "";
            }
            String str12 = this.payBindingErrorDescription;
            if (str12 == null) {
                str12 = "";
            }
            String str13 = this.npmLinkText;
            if (str13 == null) {
                String str14 = str12;
                str3 = "";
                str = str11;
                str2 = str14;
            } else {
                str = str11;
                str2 = str12;
                str3 = str13;
            }
            return new SPaySdkConfig.Localization(str4, str5, str6, str7, str8, str9, str10, str, str2, str3);
        }

        public /* synthetic */ LocalizationDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str10);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\b\u0010\"\u001a\u00020\u0002H\u0016J\t\u0010#\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006%"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$SchemaDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig$Schema;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "bankAppAuthUri", "dynatraceBeaconUri", "dynatraceApplicationId", "getIpServiceUrl", "clickStreamUrl", "clickStreamAppId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankAppAuthUri", "()Ljava/lang/String;", "getClickStreamAppId", "getClickStreamUrl", "getDynatraceApplicationId", "getDynatraceBeaconUri", "getGetIpServiceUrl", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "Companion", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SchemaDto implements DataDtoInterface<SPaySdkConfig.Schema> {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @b("baau")
        private final String bankAppAuthUri;

        @b("clsai")
        private final String clickStreamAppId;

        @b("clsu")
        private final String clickStreamUrl;

        @b("dtaid")
        private final String dynatraceApplicationId;

        @b("dtbu")
        private final String dynatraceBeaconUri;

        @b("giu")
        private final String getIpServiceUrl;

        @b(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006*\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\u0006¨\u0006\b"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$SchemaDto$Companion;", "", "()V", "toModelArray", "Ljava/util/ArrayList;", "Lspay/sdk/domain/model/response/SPaySdkConfig$Schema;", "Lkotlin/collections/ArrayList;", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$SchemaDto;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ArrayList<SPaySdkConfig.Schema> toModelArray(@NotNull ArrayList<SchemaDto> arrayList) {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                ArrayList<SPaySdkConfig.Schema> arrayList2 = new ArrayList<>();
                Iterator<SchemaDto> it = arrayList.iterator();
                while (it.hasNext()) {
                    SchemaDto next = it.next();
                    arrayList2.add(next != null ? next.toModel() : null);
                }
                return arrayList2;
            }

            private Companion() {
            }
        }

        public SchemaDto(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.name = str;
            this.bankAppAuthUri = str2;
            this.dynatraceBeaconUri = str3;
            this.dynatraceApplicationId = str4;
            this.getIpServiceUrl = str5;
            this.clickStreamUrl = str6;
            this.clickStreamAppId = str7;
        }

        public static /* synthetic */ SchemaDto copy$default(SchemaDto schemaDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = schemaDto.name;
            }
            if ((i11 & 2) != 0) {
                str2 = schemaDto.bankAppAuthUri;
            }
            if ((i11 & 4) != 0) {
                str3 = schemaDto.dynatraceBeaconUri;
            }
            if ((i11 & 8) != 0) {
                str4 = schemaDto.dynatraceApplicationId;
            }
            if ((i11 & 16) != 0) {
                str5 = schemaDto.getIpServiceUrl;
            }
            if ((i11 & 32) != 0) {
                str6 = schemaDto.clickStreamUrl;
            }
            if ((i11 & 64) != 0) {
                str7 = schemaDto.clickStreamAppId;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return schemaDto.copy(str, str2, str11, str4, str10, str8, str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBankAppAuthUri() {
            return this.bankAppAuthUri;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDynatraceBeaconUri() {
            return this.dynatraceBeaconUri;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDynatraceApplicationId() {
            return this.dynatraceApplicationId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getGetIpServiceUrl() {
            return this.getIpServiceUrl;
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
        public final SchemaDto copy(String name, String bankAppAuthUri, String dynatraceBeaconUri, String dynatraceApplicationId, String getIpServiceUrl, String clickStreamUrl, String clickStreamAppId) {
            return new SchemaDto(name, bankAppAuthUri, dynatraceBeaconUri, dynatraceApplicationId, getIpServiceUrl, clickStreamUrl, clickStreamAppId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SchemaDto)) {
                return false;
            }
            SchemaDto schemaDto = (SchemaDto) other;
            return Intrinsics.d(this.name, schemaDto.name) && Intrinsics.d(this.bankAppAuthUri, schemaDto.bankAppAuthUri) && Intrinsics.d(this.dynatraceBeaconUri, schemaDto.dynatraceBeaconUri) && Intrinsics.d(this.dynatraceApplicationId, schemaDto.dynatraceApplicationId) && Intrinsics.d(this.getIpServiceUrl, schemaDto.getIpServiceUrl) && Intrinsics.d(this.clickStreamUrl, schemaDto.clickStreamUrl) && Intrinsics.d(this.clickStreamAppId, schemaDto.clickStreamAppId);
        }

        public final String getBankAppAuthUri() {
            return this.bankAppAuthUri;
        }

        public final String getClickStreamAppId() {
            return this.clickStreamAppId;
        }

        public final String getClickStreamUrl() {
            return this.clickStreamUrl;
        }

        public final String getDynatraceApplicationId() {
            return this.dynatraceApplicationId;
        }

        public final String getDynatraceBeaconUri() {
            return this.dynatraceBeaconUri;
        }

        public final String getGetIpServiceUrl() {
            return this.getIpServiceUrl;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankAppAuthUri;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dynatraceBeaconUri;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.dynatraceApplicationId;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.getIpServiceUrl;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.clickStreamUrl;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.clickStreamAppId;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.bankAppAuthUri;
            String str3 = this.dynatraceBeaconUri;
            String str4 = this.dynatraceApplicationId;
            String str5 = this.getIpServiceUrl;
            String str6 = this.clickStreamUrl;
            String str7 = this.clickStreamAppId;
            StringBuilder d11 = C3660k.d("SchemaDto(name=", str, ", bankAppAuthUri=", str2, ", dynatraceBeaconUri=");
            a.h(d11, str3, ", dynatraceApplicationId=", str4, ", getIpServiceUrl=");
            a.h(d11, str5, ", clickStreamUrl=", str6, ", clickStreamAppId=");
            return o0.c(d11, str7, ")");
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        @NotNull
        public SPaySdkConfig.Schema toModel() {
            String str = this.name;
            if (str == null) {
                throw new C4452mn(AppMeasurementSdk.ConditionalUserProperty.NAME);
            }
            String str2 = this.bankAppAuthUri;
            if (str2 == null) {
                throw new C4452mn("bankAppAuthUri");
            }
            String str3 = this.dynatraceBeaconUri;
            if (str3 == null) {
                throw new C4452mn("dynatraceBeaconUri");
            }
            String str4 = this.dynatraceApplicationId;
            if (str4 == null) {
                throw new C4452mn("dynatraceApplicationId");
            }
            String str5 = this.getIpServiceUrl;
            if (str5 != null) {
                return new SPaySdkConfig.Schema(str, str2, str3, str4, str5, this.clickStreamUrl, this.clickStreamAppId);
            }
            throw new C4452mn("getIpServiceUrl");
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$VersionInfoDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig$VersionInfo;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "deprecated", "", "(Ljava/lang/String;Ljava/util/List;)V", "getActive", "()Ljava/lang/String;", "getDeprecated", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class VersionInfoDto implements DataDtoInterface<SPaySdkConfig.VersionInfo> {

        @b(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
        private final String active;

        @b("deprecated")
        private final List<String> deprecated;

        public VersionInfoDto(String str, List<String> list) {
            this.active = str;
            this.deprecated = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VersionInfoDto copy$default(VersionInfoDto versionInfoDto, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = versionInfoDto.active;
            }
            if ((i11 & 2) != 0) {
                list = versionInfoDto.deprecated;
            }
            return versionInfoDto.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getActive() {
            return this.active;
        }

        public final List<String> component2() {
            return this.deprecated;
        }

        @NotNull
        public final VersionInfoDto copy(String active, List<String> deprecated) {
            return new VersionInfoDto(active, deprecated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VersionInfoDto)) {
                return false;
            }
            VersionInfoDto versionInfoDto = (VersionInfoDto) other;
            return Intrinsics.d(this.active, versionInfoDto.active) && Intrinsics.d(this.deprecated, versionInfoDto.deprecated);
        }

        public final String getActive() {
            return this.active;
        }

        public final List<String> getDeprecated() {
            return this.deprecated;
        }

        public int hashCode() {
            String str = this.active;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.deprecated;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return C2439a.a("VersionInfoDto(active=", this.active, ", deprecated=", ")", this.deprecated);
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        @NotNull
        public SPaySdkConfig.VersionInfo toModel() {
            String str = this.active;
            if (str == null) {
                str = "";
            }
            List<String> list = this.deprecated;
            return new SPaySdkConfig.VersionInfo(str, list != null ? C7714v.I(list) : K.f71697a);
        }
    }

    public SPaySdkConfigDto(String str, LocalizationDto localizationDto, ArrayList<SchemaDto> arrayList, ArrayList<FeatureToggleDto> arrayList2, ImagesDto imagesDto, VersionInfoDto versionInfoDto, ArrayList<String> arrayList3) {
        this.version = str;
        this.localization = localizationDto;
        this.schemas = arrayList;
        this.featuresToggle = arrayList2;
        this.images = imagesDto;
        this.versionInfoDto = versionInfoDto;
        this.sslPins = arrayList3;
    }

    public static /* synthetic */ SPaySdkConfigDto copy$default(SPaySdkConfigDto sPaySdkConfigDto, String str, LocalizationDto localizationDto, ArrayList arrayList, ArrayList arrayList2, ImagesDto imagesDto, VersionInfoDto versionInfoDto, ArrayList arrayList3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sPaySdkConfigDto.version;
        }
        if ((i11 & 2) != 0) {
            localizationDto = sPaySdkConfigDto.localization;
        }
        if ((i11 & 4) != 0) {
            arrayList = sPaySdkConfigDto.schemas;
        }
        if ((i11 & 8) != 0) {
            arrayList2 = sPaySdkConfigDto.featuresToggle;
        }
        if ((i11 & 16) != 0) {
            imagesDto = sPaySdkConfigDto.images;
        }
        if ((i11 & 32) != 0) {
            versionInfoDto = sPaySdkConfigDto.versionInfoDto;
        }
        if ((i11 & 64) != 0) {
            arrayList3 = sPaySdkConfigDto.sslPins;
        }
        VersionInfoDto versionInfoDto2 = versionInfoDto;
        ArrayList arrayList4 = arrayList3;
        ImagesDto imagesDto2 = imagesDto;
        ArrayList arrayList5 = arrayList;
        return sPaySdkConfigDto.copy(str, localizationDto, arrayList5, arrayList2, imagesDto2, versionInfoDto2, arrayList4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final LocalizationDto getLocalization() {
        return this.localization;
    }

    public final ArrayList<SchemaDto> component3() {
        return this.schemas;
    }

    public final ArrayList<FeatureToggleDto> component4() {
        return this.featuresToggle;
    }

    /* renamed from: component5, reason: from getter */
    public final ImagesDto getImages() {
        return this.images;
    }

    /* renamed from: component6, reason: from getter */
    public final VersionInfoDto getVersionInfoDto() {
        return this.versionInfoDto;
    }

    public final ArrayList<String> component7() {
        return this.sslPins;
    }

    @NotNull
    public final SPaySdkConfigDto copy(String version, LocalizationDto localization, ArrayList<SchemaDto> schemas, ArrayList<FeatureToggleDto> featuresToggle, ImagesDto images, VersionInfoDto versionInfoDto, ArrayList<String> sslPins) {
        return new SPaySdkConfigDto(version, localization, schemas, featuresToggle, images, versionInfoDto, sslPins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPaySdkConfigDto)) {
            return false;
        }
        SPaySdkConfigDto sPaySdkConfigDto = (SPaySdkConfigDto) other;
        return Intrinsics.d(this.version, sPaySdkConfigDto.version) && Intrinsics.d(this.localization, sPaySdkConfigDto.localization) && Intrinsics.d(this.schemas, sPaySdkConfigDto.schemas) && Intrinsics.d(this.featuresToggle, sPaySdkConfigDto.featuresToggle) && Intrinsics.d(this.images, sPaySdkConfigDto.images) && Intrinsics.d(this.versionInfoDto, sPaySdkConfigDto.versionInfoDto) && Intrinsics.d(this.sslPins, sPaySdkConfigDto.sslPins);
    }

    public final ArrayList<FeatureToggleDto> getFeaturesToggle() {
        return this.featuresToggle;
    }

    public final ImagesDto getImages() {
        return this.images;
    }

    public final LocalizationDto getLocalization() {
        return this.localization;
    }

    public final ArrayList<SchemaDto> getSchemas() {
        return this.schemas;
    }

    public final ArrayList<String> getSslPins() {
        return this.sslPins;
    }

    public final String getVersion() {
        return this.version;
    }

    public final VersionInfoDto getVersionInfoDto() {
        return this.versionInfoDto;
    }

    public int hashCode() {
        String str = this.version;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalizationDto localizationDto = this.localization;
        int hashCode2 = (hashCode + (localizationDto == null ? 0 : localizationDto.hashCode())) * 31;
        ArrayList<SchemaDto> arrayList = this.schemas;
        int hashCode3 = (hashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<FeatureToggleDto> arrayList2 = this.featuresToggle;
        int hashCode4 = (hashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ImagesDto imagesDto = this.images;
        int hashCode5 = (hashCode4 + (imagesDto == null ? 0 : imagesDto.hashCode())) * 31;
        VersionInfoDto versionInfoDto = this.versionInfoDto;
        int hashCode6 = (hashCode5 + (versionInfoDto == null ? 0 : versionInfoDto.hashCode())) * 31;
        ArrayList<String> arrayList3 = this.sslPins;
        return hashCode6 + (arrayList3 != null ? arrayList3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.version;
        LocalizationDto localizationDto = this.localization;
        ArrayList<SchemaDto> arrayList = this.schemas;
        ArrayList<FeatureToggleDto> arrayList2 = this.featuresToggle;
        ImagesDto imagesDto = this.images;
        VersionInfoDto versionInfoDto = this.versionInfoDto;
        ArrayList<String> arrayList3 = this.sslPins;
        StringBuilder sb2 = new StringBuilder("SPaySdkConfigDto(version=");
        sb2.append(str);
        sb2.append(", localization=");
        sb2.append(localizationDto);
        sb2.append(", schemas=");
        sb2.append(arrayList);
        sb2.append(", featuresToggle=");
        sb2.append(arrayList2);
        sb2.append(", images=");
        sb2.append(imagesDto);
        sb2.append(", versionInfoDto=");
        sb2.append(versionInfoDto);
        sb2.append(", sslPins=");
        return Om.a(")", sb2, arrayList3);
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public SPaySdkConfig toModel() {
        SPaySdkConfig.Localization model;
        ArrayList<SPaySdkConfig.Schema> modelArray;
        ArrayList<SPaySdkConfig.FeatureToggle> modelArray2;
        SPaySdkConfig.Images model2;
        String str = this.version;
        if (str == null) {
            throw new C4452mn("version");
        }
        LocalizationDto localizationDto = this.localization;
        if (localizationDto == null || (model = localizationDto.toModel()) == null) {
            throw new C4452mn("localization");
        }
        ArrayList<SchemaDto> arrayList = this.schemas;
        if (arrayList == null || (modelArray = SchemaDto.INSTANCE.toModelArray(arrayList)) == null) {
            throw new C4452mn("schemas");
        }
        ArrayList<FeatureToggleDto> arrayList2 = this.featuresToggle;
        if (arrayList2 == null || (modelArray2 = FeatureToggleDto.INSTANCE.toModelArray(arrayList2)) == null) {
            throw new C4452mn("featuresToggle");
        }
        ImagesDto imagesDto = this.images;
        if (imagesDto == null || (model2 = imagesDto.toModel()) == null) {
            throw new C4452mn("images");
        }
        VersionInfoDto versionInfoDto = this.versionInfoDto;
        return new SPaySdkConfig(str, model, modelArray, modelArray2, versionInfoDto != null ? versionInfoDto.toModel() : null, model2, this.sslPins);
    }
}
