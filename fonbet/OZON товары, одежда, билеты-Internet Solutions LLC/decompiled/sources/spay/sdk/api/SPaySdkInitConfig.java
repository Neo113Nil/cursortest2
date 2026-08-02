package spay.sdk.api;

import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.data.dto.SPaySdkInitConfigDto;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fHÆ\u0003Jq\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\u0006\u0010/\u001a\u000200J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00063"}, d2 = {"Lspay/sdk/api/SPaySdkInitConfig;", "", "enableBnpl", "", "stage", "Lspay/sdk/api/SPayStage;", "helperConfig", "Lspay/sdk/api/SPayHelperConfig;", "spasiboBonuses", "resultViewNeeded", "enableLogging", "enableOutsideTouchCancelling", "typeface", "Lspay/sdk/api/SPayTypeface;", "initializationResult", "Lkotlin/Function1;", "Lspay/sdk/api/InitializationResult;", "", "(ZLspay/sdk/api/SPayStage;Lspay/sdk/api/SPayHelperConfig;ZZZZLspay/sdk/api/SPayTypeface;Lkotlin/jvm/functions/Function1;)V", "getEnableBnpl", "()Z", "getEnableLogging", "getEnableOutsideTouchCancelling", "getHelperConfig", "()Lspay/sdk/api/SPayHelperConfig;", "getInitializationResult", "()Lkotlin/jvm/functions/Function1;", "getResultViewNeeded", "getSpasiboBonuses", "getStage", "()Lspay/sdk/api/SPayStage;", "getTypeface", "()Lspay/sdk/api/SPayTypeface;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toSPaySdkInitConfigDto", "Lspay/sdk/data/dto/SPaySdkInitConfigDto;", "toString", "", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SPaySdkInitConfig {
    private final boolean enableBnpl;
    private final boolean enableLogging;
    private final boolean enableOutsideTouchCancelling;

    @NotNull
    private final SPayHelperConfig helperConfig;

    @NotNull
    private final Function1<InitializationResult, Unit> initializationResult;
    private final boolean resultViewNeeded;
    private final boolean spasiboBonuses;

    @NotNull
    private final SPayStage stage;
    private final SPayTypeface typeface;

    /* JADX WARN: Multi-variable type inference failed */
    public SPaySdkInitConfig(boolean z11, @NotNull SPayStage stage, @NotNull SPayHelperConfig helperConfig, boolean z12, boolean z13, boolean z14, boolean z15, SPayTypeface sPayTypeface, @NotNull Function1<? super InitializationResult, Unit> initializationResult) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(helperConfig, "helperConfig");
        Intrinsics.checkNotNullParameter(initializationResult, "initializationResult");
        this.enableBnpl = z11;
        this.stage = stage;
        this.helperConfig = helperConfig;
        this.spasiboBonuses = z12;
        this.resultViewNeeded = z13;
        this.enableLogging = z14;
        this.enableOutsideTouchCancelling = z15;
        this.typeface = sPayTypeface;
        this.initializationResult = initializationResult;
    }

    public static /* synthetic */ SPaySdkInitConfig copy$default(SPaySdkInitConfig sPaySdkInitConfig, boolean z11, SPayStage sPayStage, SPayHelperConfig sPayHelperConfig, boolean z12, boolean z13, boolean z14, boolean z15, SPayTypeface sPayTypeface, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = sPaySdkInitConfig.enableBnpl;
        }
        if ((i11 & 2) != 0) {
            sPayStage = sPaySdkInitConfig.stage;
        }
        if ((i11 & 4) != 0) {
            sPayHelperConfig = sPaySdkInitConfig.helperConfig;
        }
        if ((i11 & 8) != 0) {
            z12 = sPaySdkInitConfig.spasiboBonuses;
        }
        if ((i11 & 16) != 0) {
            z13 = sPaySdkInitConfig.resultViewNeeded;
        }
        if ((i11 & 32) != 0) {
            z14 = sPaySdkInitConfig.enableLogging;
        }
        if ((i11 & 64) != 0) {
            z15 = sPaySdkInitConfig.enableOutsideTouchCancelling;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            sPayTypeface = sPaySdkInitConfig.typeface;
        }
        if ((i11 & 256) != 0) {
            function1 = sPaySdkInitConfig.initializationResult;
        }
        SPayTypeface sPayTypeface2 = sPayTypeface;
        Function1 function12 = function1;
        boolean z16 = z14;
        boolean z17 = z15;
        boolean z18 = z13;
        SPayHelperConfig sPayHelperConfig2 = sPayHelperConfig;
        return sPaySdkInitConfig.copy(z11, sPayStage, sPayHelperConfig2, z12, z18, z16, z17, sPayTypeface2, function12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableBnpl() {
        return this.enableBnpl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SPayStage getStage() {
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
    public final Function1<InitializationResult, Unit> component9() {
        return this.initializationResult;
    }

    @NotNull
    public final SPaySdkInitConfig copy(boolean enableBnpl, @NotNull SPayStage stage, @NotNull SPayHelperConfig helperConfig, boolean spasiboBonuses, boolean resultViewNeeded, boolean enableLogging, boolean enableOutsideTouchCancelling, SPayTypeface typeface, @NotNull Function1<? super InitializationResult, Unit> initializationResult) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(helperConfig, "helperConfig");
        Intrinsics.checkNotNullParameter(initializationResult, "initializationResult");
        return new SPaySdkInitConfig(enableBnpl, stage, helperConfig, spasiboBonuses, resultViewNeeded, enableLogging, enableOutsideTouchCancelling, typeface, initializationResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPaySdkInitConfig)) {
            return false;
        }
        SPaySdkInitConfig sPaySdkInitConfig = (SPaySdkInitConfig) other;
        return this.enableBnpl == sPaySdkInitConfig.enableBnpl && this.stage == sPaySdkInitConfig.stage && Intrinsics.d(this.helperConfig, sPaySdkInitConfig.helperConfig) && this.spasiboBonuses == sPaySdkInitConfig.spasiboBonuses && this.resultViewNeeded == sPaySdkInitConfig.resultViewNeeded && this.enableLogging == sPaySdkInitConfig.enableLogging && this.enableOutsideTouchCancelling == sPaySdkInitConfig.enableOutsideTouchCancelling && Intrinsics.d(this.typeface, sPaySdkInitConfig.typeface) && Intrinsics.d(this.initializationResult, sPaySdkInitConfig.initializationResult);
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

    @NotNull
    public final Function1<InitializationResult, Unit> getInitializationResult() {
        return this.initializationResult;
    }

    public final boolean getResultViewNeeded() {
        return this.resultViewNeeded;
    }

    public final boolean getSpasiboBonuses() {
        return this.spasiboBonuses;
    }

    @NotNull
    public final SPayStage getStage() {
        return this.stage;
    }

    public final SPayTypeface getTypeface() {
        return this.typeface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z11 = this.enableBnpl;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int hashCode = (this.helperConfig.hashCode() + ((this.stage.hashCode() + (r02 * 31)) * 31)) * 31;
        ?? r22 = this.spasiboBonuses;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        ?? r23 = this.resultViewNeeded;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r24 = this.enableLogging;
        int i15 = r24;
        if (r24 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z12 = this.enableOutsideTouchCancelling;
        int i17 = (i16 + (z12 ? 1 : z12 ? 1 : 0)) * 31;
        SPayTypeface sPayTypeface = this.typeface;
        return this.initializationResult.hashCode() + ((i17 + (sPayTypeface == null ? 0 : sPayTypeface.hashCode())) * 31);
    }

    @NotNull
    public final SPaySdkInitConfigDto toSPaySdkInitConfigDto() {
        return new SPaySdkInitConfigDto(this.enableBnpl, this.stage.toString(), this.helperConfig, this.spasiboBonuses, this.resultViewNeeded, this.enableLogging, this.enableOutsideTouchCancelling, this.typeface);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.enableBnpl;
        SPayStage sPayStage = this.stage;
        SPayHelperConfig sPayHelperConfig = this.helperConfig;
        boolean z12 = this.spasiboBonuses;
        boolean z13 = this.resultViewNeeded;
        boolean z14 = this.enableLogging;
        boolean z15 = this.enableOutsideTouchCancelling;
        SPayTypeface sPayTypeface = this.typeface;
        Function1<InitializationResult, Unit> function1 = this.initializationResult;
        StringBuilder sb2 = new StringBuilder("SPaySdkInitConfig(enableBnpl=");
        sb2.append(z11);
        sb2.append(", stage=");
        sb2.append(sPayStage);
        sb2.append(", helperConfig=");
        sb2.append(sPayHelperConfig);
        sb2.append(", spasiboBonuses=");
        sb2.append(z12);
        sb2.append(", resultViewNeeded=");
        f.c(", enableLogging=", ", enableOutsideTouchCancelling=", sb2, z13, z14);
        sb2.append(z15);
        sb2.append(", typeface=");
        sb2.append(sPayTypeface);
        sb2.append(", initializationResult=");
        sb2.append(function1);
        sb2.append(")");
        return sb2.toString();
    }

    public SPaySdkInitConfig(boolean z11, SPayStage sPayStage, SPayHelperConfig sPayHelperConfig, boolean z12, boolean z13, boolean z14, boolean z15, SPayTypeface sPayTypeface, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, sPayStage, (i11 & 4) != 0 ? new SPayHelperConfig(true, K.f71697a) : sPayHelperConfig, (i11 & 8) != 0 ? true : z12, (i11 & 16) != 0 ? true : z13, (i11 & 32) != 0 ? true : z14, (i11 & 64) != 0 ? true : z15, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : sPayTypeface, function1);
    }
}
