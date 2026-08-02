package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jn\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00063"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;", "", "accountId", "", "environment", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Environment;", "customization", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "errorLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;", "commonLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CommonLabels;", "nativeLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeLabels;", "allowDesktop", "", "language", "", "(Ljava/lang/Integer;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Environment;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CommonLabels;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeLabels;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAllowDesktop", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCommonLabels", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CommonLabels;", "getCustomization", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "getEnvironment", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Environment;", "getErrorLabels", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;", "getLanguage", "()Ljava/lang/String;", "getNativeLabels", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeLabels;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Environment;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CommonLabels;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeLabels;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class GlobalConfig {
    public static final int $stable = 0;
    private final Integer accountId;
    private final Boolean allowDesktop;
    private final CommonLabels commonLabels;
    private final Customization customization;
    private final Environment environment;
    private final ErrorLabels errorLabels;
    private final String language;
    private final NativeLabels nativeLabels;

    public static /* synthetic */ GlobalConfig copy$default(GlobalConfig globalConfig, Integer num, Environment environment, Customization customization, ErrorLabels errorLabels, CommonLabels commonLabels, NativeLabels nativeLabels, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = globalConfig.accountId;
        }
        if ((i & 2) != 0) {
            environment = globalConfig.environment;
        }
        if ((i & 4) != 0) {
            customization = globalConfig.customization;
        }
        if ((i & 8) != 0) {
            errorLabels = globalConfig.errorLabels;
        }
        if ((i & 16) != 0) {
            commonLabels = globalConfig.commonLabels;
        }
        if ((i & 32) != 0) {
            nativeLabels = globalConfig.nativeLabels;
        }
        if ((i & 64) != 0) {
            bool = globalConfig.allowDesktop;
        }
        if ((i & 128) != 0) {
            str = globalConfig.language;
        }
        Boolean bool2 = bool;
        String str2 = str;
        CommonLabels commonLabels2 = commonLabels;
        NativeLabels nativeLabels2 = nativeLabels;
        return globalConfig.copy(num, environment, customization, errorLabels, commonLabels2, nativeLabels2, bool2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getAccountId() {
        return this.accountId;
    }

    /* renamed from: component2, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    /* renamed from: component3, reason: from getter */
    public final Customization getCustomization() {
        return this.customization;
    }

    /* renamed from: component4, reason: from getter */
    public final ErrorLabels getErrorLabels() {
        return this.errorLabels;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonLabels getCommonLabels() {
        return this.commonLabels;
    }

    /* renamed from: component6, reason: from getter */
    public final NativeLabels getNativeLabels() {
        return this.nativeLabels;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getAllowDesktop() {
        return this.allowDesktop;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final GlobalConfig copy(Integer accountId, Environment environment, Customization customization, ErrorLabels errorLabels, CommonLabels commonLabels, NativeLabels nativeLabels, Boolean allowDesktop, String language) {
        return new GlobalConfig(accountId, environment, customization, errorLabels, commonLabels, nativeLabels, allowDesktop, language);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalConfig)) {
            return false;
        }
        GlobalConfig globalConfig = (GlobalConfig) other;
        return Intrinsics.areEqual(this.accountId, globalConfig.accountId) && Intrinsics.areEqual(this.environment, globalConfig.environment) && Intrinsics.areEqual(this.customization, globalConfig.customization) && Intrinsics.areEqual(this.errorLabels, globalConfig.errorLabels) && Intrinsics.areEqual(this.commonLabels, globalConfig.commonLabels) && Intrinsics.areEqual(this.nativeLabels, globalConfig.nativeLabels) && Intrinsics.areEqual(this.allowDesktop, globalConfig.allowDesktop) && Intrinsics.areEqual(this.language, globalConfig.language);
    }

    public int hashCode() {
        Integer num = this.accountId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Environment environment = this.environment;
        int hashCode2 = (hashCode + (environment == null ? 0 : environment.hashCode())) * 31;
        Customization customization = this.customization;
        int hashCode3 = (hashCode2 + (customization == null ? 0 : customization.hashCode())) * 31;
        ErrorLabels errorLabels = this.errorLabels;
        int hashCode4 = (hashCode3 + (errorLabels == null ? 0 : errorLabels.hashCode())) * 31;
        CommonLabels commonLabels = this.commonLabels;
        int hashCode5 = (hashCode4 + (commonLabels == null ? 0 : commonLabels.hashCode())) * 31;
        NativeLabels nativeLabels = this.nativeLabels;
        int hashCode6 = (hashCode5 + (nativeLabels == null ? 0 : nativeLabels.hashCode())) * 31;
        Boolean bool = this.allowDesktop;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.language;
        return hashCode7 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "GlobalConfig(accountId=" + this.accountId + ", environment=" + this.environment + ", customization=" + this.customization + ", errorLabels=" + this.errorLabels + ", commonLabels=" + this.commonLabels + ", nativeLabels=" + this.nativeLabels + ", allowDesktop=" + this.allowDesktop + ", language=" + this.language + ")";
    }

    public GlobalConfig(Integer num, Environment environment, Customization customization, ErrorLabels errorLabels, CommonLabels commonLabels, NativeLabels nativeLabels, Boolean bool, String str) {
        this.accountId = num;
        this.environment = environment;
        this.customization = customization;
        this.errorLabels = errorLabels;
        this.commonLabels = commonLabels;
        this.nativeLabels = nativeLabels;
        this.allowDesktop = bool;
        this.language = str;
    }

    public final Integer getAccountId() {
        return this.accountId;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final Customization getCustomization() {
        return this.customization;
    }

    public final ErrorLabels getErrorLabels() {
        return this.errorLabels;
    }

    public final CommonLabels getCommonLabels() {
        return this.commonLabels;
    }

    public final NativeLabels getNativeLabels() {
        return this.nativeLabels;
    }

    public final Boolean getAllowDesktop() {
        return this.allowDesktop;
    }

    public final String getLanguage() {
        return this.language;
    }
}
