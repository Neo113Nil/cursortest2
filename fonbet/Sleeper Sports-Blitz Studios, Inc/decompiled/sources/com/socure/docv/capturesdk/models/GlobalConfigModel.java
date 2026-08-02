package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionModel.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003Jf\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\rHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/socure/docv/capturesdk/models/GlobalConfigModel;", "", "accountId", "", "customization", "Lcom/socure/docv/capturesdk/models/CustomizationModel;", "errorLabels", "Lcom/socure/docv/capturesdk/models/ErrorLabelsModel;", "commonLabels", "Lcom/socure/docv/capturesdk/models/CommonLabelsModel;", "nativeLabelsModel", "Lcom/socure/docv/capturesdk/models/NativeLabelsModel;", "eventId", "", "environment", "Lcom/socure/docv/capturesdk/models/EnvironmentModel;", "language", "(Ljava/lang/Integer;Lcom/socure/docv/capturesdk/models/CustomizationModel;Lcom/socure/docv/capturesdk/models/ErrorLabelsModel;Lcom/socure/docv/capturesdk/models/CommonLabelsModel;Lcom/socure/docv/capturesdk/models/NativeLabelsModel;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/EnvironmentModel;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCommonLabels", "()Lcom/socure/docv/capturesdk/models/CommonLabelsModel;", "getCustomization", "()Lcom/socure/docv/capturesdk/models/CustomizationModel;", "getEnvironment", "()Lcom/socure/docv/capturesdk/models/EnvironmentModel;", "getErrorLabels", "()Lcom/socure/docv/capturesdk/models/ErrorLabelsModel;", "getEventId", "()Ljava/lang/String;", "getLanguage", "getNativeLabelsModel", "()Lcom/socure/docv/capturesdk/models/NativeLabelsModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Lcom/socure/docv/capturesdk/models/CustomizationModel;Lcom/socure/docv/capturesdk/models/ErrorLabelsModel;Lcom/socure/docv/capturesdk/models/CommonLabelsModel;Lcom/socure/docv/capturesdk/models/NativeLabelsModel;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/EnvironmentModel;Ljava/lang/String;)Lcom/socure/docv/capturesdk/models/GlobalConfigModel;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class GlobalConfigModel {
    public static final int $stable = 0;
    private final Integer accountId;
    private final CommonLabelsModel commonLabels;
    private final CustomizationModel customization;
    private final EnvironmentModel environment;
    private final ErrorLabelsModel errorLabels;
    private final String eventId;
    private final String language;
    private final NativeLabelsModel nativeLabelsModel;

    public static /* synthetic */ GlobalConfigModel copy$default(GlobalConfigModel globalConfigModel, Integer num, CustomizationModel customizationModel, ErrorLabelsModel errorLabelsModel, CommonLabelsModel commonLabelsModel, NativeLabelsModel nativeLabelsModel, String str, EnvironmentModel environmentModel, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = globalConfigModel.accountId;
        }
        if ((i & 2) != 0) {
            customizationModel = globalConfigModel.customization;
        }
        if ((i & 4) != 0) {
            errorLabelsModel = globalConfigModel.errorLabels;
        }
        if ((i & 8) != 0) {
            commonLabelsModel = globalConfigModel.commonLabels;
        }
        if ((i & 16) != 0) {
            nativeLabelsModel = globalConfigModel.nativeLabelsModel;
        }
        if ((i & 32) != 0) {
            str = globalConfigModel.eventId;
        }
        if ((i & 64) != 0) {
            environmentModel = globalConfigModel.environment;
        }
        if ((i & 128) != 0) {
            str2 = globalConfigModel.language;
        }
        EnvironmentModel environmentModel2 = environmentModel;
        String str3 = str2;
        NativeLabelsModel nativeLabelsModel2 = nativeLabelsModel;
        String str4 = str;
        return globalConfigModel.copy(num, customizationModel, errorLabelsModel, commonLabelsModel, nativeLabelsModel2, str4, environmentModel2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getAccountId() {
        return this.accountId;
    }

    /* renamed from: component2, reason: from getter */
    public final CustomizationModel getCustomization() {
        return this.customization;
    }

    /* renamed from: component3, reason: from getter */
    public final ErrorLabelsModel getErrorLabels() {
        return this.errorLabels;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonLabelsModel getCommonLabels() {
        return this.commonLabels;
    }

    /* renamed from: component5, reason: from getter */
    public final NativeLabelsModel getNativeLabelsModel() {
        return this.nativeLabelsModel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component7, reason: from getter */
    public final EnvironmentModel getEnvironment() {
        return this.environment;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final GlobalConfigModel copy(Integer accountId, CustomizationModel customization, ErrorLabelsModel errorLabels, CommonLabelsModel commonLabels, NativeLabelsModel nativeLabelsModel, String eventId, EnvironmentModel environment, String language) {
        Intrinsics.checkNotNullParameter(customization, "customization");
        Intrinsics.checkNotNullParameter(errorLabels, "errorLabels");
        Intrinsics.checkNotNullParameter(commonLabels, "commonLabels");
        Intrinsics.checkNotNullParameter(nativeLabelsModel, "nativeLabelsModel");
        return new GlobalConfigModel(accountId, customization, errorLabels, commonLabels, nativeLabelsModel, eventId, environment, language);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalConfigModel)) {
            return false;
        }
        GlobalConfigModel globalConfigModel = (GlobalConfigModel) other;
        return Intrinsics.areEqual(this.accountId, globalConfigModel.accountId) && Intrinsics.areEqual(this.customization, globalConfigModel.customization) && Intrinsics.areEqual(this.errorLabels, globalConfigModel.errorLabels) && Intrinsics.areEqual(this.commonLabels, globalConfigModel.commonLabels) && Intrinsics.areEqual(this.nativeLabelsModel, globalConfigModel.nativeLabelsModel) && Intrinsics.areEqual(this.eventId, globalConfigModel.eventId) && Intrinsics.areEqual(this.environment, globalConfigModel.environment) && Intrinsics.areEqual(this.language, globalConfigModel.language);
    }

    public int hashCode() {
        Integer num = this.accountId;
        int hashCode = (((((((((num == null ? 0 : num.hashCode()) * 31) + this.customization.hashCode()) * 31) + this.errorLabels.hashCode()) * 31) + this.commonLabels.hashCode()) * 31) + this.nativeLabelsModel.hashCode()) * 31;
        String str = this.eventId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnvironmentModel environmentModel = this.environment;
        int hashCode3 = (hashCode2 + (environmentModel == null ? 0 : environmentModel.hashCode())) * 31;
        String str2 = this.language;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GlobalConfigModel(accountId=" + this.accountId + ", customization=" + this.customization + ", errorLabels=" + this.errorLabels + ", commonLabels=" + this.commonLabels + ", nativeLabelsModel=" + this.nativeLabelsModel + ", eventId=" + this.eventId + ", environment=" + this.environment + ", language=" + this.language + ")";
    }

    public GlobalConfigModel(Integer num, CustomizationModel customization, ErrorLabelsModel errorLabels, CommonLabelsModel commonLabels, NativeLabelsModel nativeLabelsModel, String str, EnvironmentModel environmentModel, String str2) {
        Intrinsics.checkNotNullParameter(customization, "customization");
        Intrinsics.checkNotNullParameter(errorLabels, "errorLabels");
        Intrinsics.checkNotNullParameter(commonLabels, "commonLabels");
        Intrinsics.checkNotNullParameter(nativeLabelsModel, "nativeLabelsModel");
        this.accountId = num;
        this.customization = customization;
        this.errorLabels = errorLabels;
        this.commonLabels = commonLabels;
        this.nativeLabelsModel = nativeLabelsModel;
        this.eventId = str;
        this.environment = environmentModel;
        this.language = str2;
    }

    public final Integer getAccountId() {
        return this.accountId;
    }

    public final CustomizationModel getCustomization() {
        return this.customization;
    }

    public final ErrorLabelsModel getErrorLabels() {
        return this.errorLabels;
    }

    public final CommonLabelsModel getCommonLabels() {
        return this.commonLabels;
    }

    public final NativeLabelsModel getNativeLabelsModel() {
        return this.nativeLabelsModel;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final EnvironmentModel getEnvironment() {
        return this.environment;
    }

    public final String getLanguage() {
        return this.language;
    }
}
