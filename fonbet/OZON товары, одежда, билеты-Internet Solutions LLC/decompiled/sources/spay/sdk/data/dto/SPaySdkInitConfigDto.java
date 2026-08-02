package spay.sdk.data.dto;

import K1.G;
import Lf.a;
import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.api.SPayHelperConfig;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.api.SPayStage;
import spay.sdk.api.SPayTypeface;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\u0006\u0010(\u001a\u00020)J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\f\u0010+\u001a\u00020,*\u00020\u0005H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, d2 = {"Lspay/sdk/data/dto/SPaySdkInitConfigDto;", "", "enableBnpl", "", "stage", "", "helperConfig", "Lspay/sdk/api/SPayHelperConfig;", "spasiboBonuses", "resultViewNeeded", "enableLogging", "enableOutsideTouchCancelling", "typeface", "Lspay/sdk/api/SPayTypeface;", "(ZLjava/lang/String;Lspay/sdk/api/SPayHelperConfig;ZZZZLspay/sdk/api/SPayTypeface;)V", "getEnableBnpl", "()Z", "getEnableLogging", "getEnableOutsideTouchCancelling", "getHelperConfig", "()Lspay/sdk/api/SPayHelperConfig;", "getResultViewNeeded", "getSpasiboBonuses", "getStage", "()Ljava/lang/String;", "getTypeface", "()Lspay/sdk/api/SPayTypeface;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toSPaySdkInitConfig", "Lspay/sdk/api/SPaySdkInitConfig;", "toString", "toSPayStage", "Lspay/sdk/api/SPayStage;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SPaySdkInitConfigDto {
    private final boolean enableBnpl;
    private final boolean enableLogging;
    private final boolean enableOutsideTouchCancelling;

    @NotNull
    private final SPayHelperConfig helperConfig;
    private final boolean resultViewNeeded;
    private final boolean spasiboBonuses;

    @NotNull
    private final String stage;
    private final SPayTypeface typeface;

    public SPaySdkInitConfigDto(boolean z11, @NotNull String stage, @NotNull SPayHelperConfig helperConfig, boolean z12, boolean z13, boolean z14, boolean z15, SPayTypeface sPayTypeface) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(helperConfig, "helperConfig");
        this.enableBnpl = z11;
        this.stage = stage;
        this.helperConfig = helperConfig;
        this.spasiboBonuses = z12;
        this.resultViewNeeded = z13;
        this.enableLogging = z14;
        this.enableOutsideTouchCancelling = z15;
        this.typeface = sPayTypeface;
    }

    public static /* synthetic */ SPaySdkInitConfigDto copy$default(SPaySdkInitConfigDto sPaySdkInitConfigDto, boolean z11, String str, SPayHelperConfig sPayHelperConfig, boolean z12, boolean z13, boolean z14, boolean z15, SPayTypeface sPayTypeface, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = sPaySdkInitConfigDto.enableBnpl;
        }
        if ((i11 & 2) != 0) {
            str = sPaySdkInitConfigDto.stage;
        }
        if ((i11 & 4) != 0) {
            sPayHelperConfig = sPaySdkInitConfigDto.helperConfig;
        }
        if ((i11 & 8) != 0) {
            z12 = sPaySdkInitConfigDto.spasiboBonuses;
        }
        if ((i11 & 16) != 0) {
            z13 = sPaySdkInitConfigDto.resultViewNeeded;
        }
        if ((i11 & 32) != 0) {
            z14 = sPaySdkInitConfigDto.enableLogging;
        }
        if ((i11 & 64) != 0) {
            z15 = sPaySdkInitConfigDto.enableOutsideTouchCancelling;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            sPayTypeface = sPaySdkInitConfigDto.typeface;
        }
        boolean z16 = z15;
        SPayTypeface sPayTypeface2 = sPayTypeface;
        boolean z17 = z13;
        boolean z18 = z14;
        return sPaySdkInitConfigDto.copy(z11, str, sPayHelperConfig, z12, z17, z18, z16, sPayTypeface2);
    }

    private final SPayStage toSPayStage(String str) {
        SPayStage sPayStage = SPayStage.SandBoxWithoutBankApp;
        if (Intrinsics.d(str, sPayStage.toString())) {
            return sPayStage;
        }
        SPayStage sPayStage2 = SPayStage.SandboxRealBankApp;
        return Intrinsics.d(str, sPayStage2.toString()) ? sPayStage2 : SPayStage.Prod;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableBnpl() {
        return this.enableBnpl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStage() {
        return this.stage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SPayHelperConfig getHelperConfig() {
        return this.helperConfig;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSpasiboBonuses() {
        return this.spasiboBonuses;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getResultViewNeeded() {
        return this.resultViewNeeded;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnableLogging() {
        return this.enableLogging;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getEnableOutsideTouchCancelling() {
        return this.enableOutsideTouchCancelling;
    }

    /* renamed from: component8, reason: from getter */
    public final SPayTypeface getTypeface() {
        return this.typeface;
    }

    @NotNull
    public final SPaySdkInitConfigDto copy(boolean enableBnpl, @NotNull String stage, @NotNull SPayHelperConfig helperConfig, boolean spasiboBonuses, boolean resultViewNeeded, boolean enableLogging, boolean enableOutsideTouchCancelling, SPayTypeface typeface) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(helperConfig, "helperConfig");
        return new SPaySdkInitConfigDto(enableBnpl, stage, helperConfig, spasiboBonuses, resultViewNeeded, enableLogging, enableOutsideTouchCancelling, typeface);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPaySdkInitConfigDto)) {
            return false;
        }
        SPaySdkInitConfigDto sPaySdkInitConfigDto = (SPaySdkInitConfigDto) other;
        return this.enableBnpl == sPaySdkInitConfigDto.enableBnpl && Intrinsics.d(this.stage, sPaySdkInitConfigDto.stage) && Intrinsics.d(this.helperConfig, sPaySdkInitConfigDto.helperConfig) && this.spasiboBonuses == sPaySdkInitConfigDto.spasiboBonuses && this.resultViewNeeded == sPaySdkInitConfigDto.resultViewNeeded && this.enableLogging == sPaySdkInitConfigDto.enableLogging && this.enableOutsideTouchCancelling == sPaySdkInitConfigDto.enableOutsideTouchCancelling && Intrinsics.d(this.typeface, sPaySdkInitConfigDto.typeface);
    }

    public final boolean getEnableBnpl() {
        return this.enableBnpl;
    }

    public final boolean getEnableLogging() {
        return this.enableLogging;
    }

    public final boolean getEnableOutsideTouchCancelling() {
        return this.enableOutsideTouchCancelling;
    }

    @NotNull
    public final SPayHelperConfig getHelperConfig() {
        return this.helperConfig;
    }

    public final boolean getResultViewNeeded() {
        return this.resultViewNeeded;
    }

    public final boolean getSpasiboBonuses() {
        return this.spasiboBonuses;
    }

    @NotNull
    public final String getStage() {
        return this.stage;
    }

    public final SPayTypeface getTypeface() {
        return this.typeface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public int hashCode() {
        boolean z11 = this.enableBnpl;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int hashCode = (this.helperConfig.hashCode() + a.b0(r02 * 31, this.stage)) * 31;
        ?? r03 = this.spasiboBonuses;
        int i11 = r03;
        if (r03 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        ?? r04 = this.resultViewNeeded;
        int i13 = r04;
        if (r04 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r05 = this.enableLogging;
        int i15 = r05;
        if (r05 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z12 = this.enableOutsideTouchCancelling;
        int i17 = (i16 + (z12 ? 1 : z12 ? 1 : 0)) * 31;
        SPayTypeface sPayTypeface = this.typeface;
        return i17 + (sPayTypeface == null ? 0 : sPayTypeface.hashCode());
    }

    @NotNull
    public final SPaySdkInitConfig toSPaySdkInitConfig() {
        return new SPaySdkInitConfig(this.enableBnpl, toSPayStage(this.stage), this.helperConfig, this.spasiboBonuses, this.resultViewNeeded, this.enableLogging, this.enableOutsideTouchCancelling, this.typeface, SPaySdkInitConfigDto$toSPaySdkInitConfig$1.INSTANCE);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.enableBnpl;
        String str = this.stage;
        SPayHelperConfig sPayHelperConfig = this.helperConfig;
        boolean z12 = this.spasiboBonuses;
        boolean z13 = this.resultViewNeeded;
        boolean z14 = this.enableLogging;
        boolean z15 = this.enableOutsideTouchCancelling;
        SPayTypeface sPayTypeface = this.typeface;
        StringBuilder d11 = G.d("SPaySdkInitConfigDto(enableBnpl=", ", stage=", str, ", helperConfig=", z11);
        d11.append(sPayHelperConfig);
        d11.append(", spasiboBonuses=");
        d11.append(z12);
        d11.append(", resultViewNeeded=");
        f.c(", enableLogging=", ", enableOutsideTouchCancelling=", d11, z13, z14);
        d11.append(z15);
        d11.append(", typeface=");
        d11.append(sPayTypeface);
        d11.append(")");
        return d11.toString();
    }

    public SPaySdkInitConfigDto(boolean z11, String str, SPayHelperConfig sPayHelperConfig, boolean z12, boolean z13, boolean z14, boolean z15, SPayTypeface sPayTypeface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, str, (i11 & 4) != 0 ? new SPayHelperConfig(true, K.f71697a) : sPayHelperConfig, (i11 & 8) != 0 ? true : z12, (i11 & 16) != 0 ? true : z13, (i11 & 32) != 0 ? true : z14, (i11 & 64) != 0 ? true : z15, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : sPayTypeface);
    }
}
