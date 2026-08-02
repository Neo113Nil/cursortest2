package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleResponse;", "", "moduleType", "", "moduleId", "moduleConfig", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;", "(Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;)V", "getModuleConfig", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;", "getModuleId", "()Ljava/lang/String;", "getModuleType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ModuleResponse {
    public static final int $stable = 8;
    private final ModuleConfig moduleConfig;
    private final String moduleId;
    private final String moduleType;

    public static /* synthetic */ ModuleResponse copy$default(ModuleResponse moduleResponse, String str, String str2, ModuleConfig moduleConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleResponse.moduleType;
        }
        if ((i & 2) != 0) {
            str2 = moduleResponse.moduleId;
        }
        if ((i & 4) != 0) {
            moduleConfig = moduleResponse.moduleConfig;
        }
        return moduleResponse.copy(str, str2, moduleConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final String getModuleType() {
        return this.moduleType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    /* renamed from: component3, reason: from getter */
    public final ModuleConfig getModuleConfig() {
        return this.moduleConfig;
    }

    public final ModuleResponse copy(String moduleType, String moduleId, ModuleConfig moduleConfig) {
        return new ModuleResponse(moduleType, moduleId, moduleConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleResponse)) {
            return false;
        }
        ModuleResponse moduleResponse = (ModuleResponse) other;
        return Intrinsics.areEqual(this.moduleType, moduleResponse.moduleType) && Intrinsics.areEqual(this.moduleId, moduleResponse.moduleId) && Intrinsics.areEqual(this.moduleConfig, moduleResponse.moduleConfig);
    }

    public int hashCode() {
        String str = this.moduleType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.moduleId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ModuleConfig moduleConfig = this.moduleConfig;
        return hashCode2 + (moduleConfig != null ? moduleConfig.hashCode() : 0);
    }

    public String toString() {
        return "ModuleResponse(moduleType=" + this.moduleType + ", moduleId=" + this.moduleId + ", moduleConfig=" + this.moduleConfig + ")";
    }

    public ModuleResponse(String str, String str2, ModuleConfig moduleConfig) {
        this.moduleType = str;
        this.moduleId = str2;
        this.moduleConfig = moduleConfig;
    }

    public final String getModuleType() {
        return this.moduleType;
    }

    public final String getModuleId() {
        return this.moduleId;
    }

    public final ModuleConfig getModuleConfig() {
        return this.moduleConfig;
    }
}
