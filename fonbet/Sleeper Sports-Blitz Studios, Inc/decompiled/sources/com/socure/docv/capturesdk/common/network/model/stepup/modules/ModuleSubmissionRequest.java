package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleSubmissionRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleSubmissionRequest;", "", "moduleType", "", "moduleVersion", "moduleId", "moduleData", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;)V", "getModuleData", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleData;", "getModuleId", "()Ljava/lang/String;", "getModuleType", "getModuleVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ModuleSubmissionRequest {
    public static final int $stable = 0;
    private final ModuleData moduleData;
    private final String moduleId;
    private final String moduleType;
    private final String moduleVersion;

    public static /* synthetic */ ModuleSubmissionRequest copy$default(ModuleSubmissionRequest moduleSubmissionRequest, String str, String str2, String str3, ModuleData moduleData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleSubmissionRequest.moduleType;
        }
        if ((i & 2) != 0) {
            str2 = moduleSubmissionRequest.moduleVersion;
        }
        if ((i & 4) != 0) {
            str3 = moduleSubmissionRequest.moduleId;
        }
        if ((i & 8) != 0) {
            moduleData = moduleSubmissionRequest.moduleData;
        }
        return moduleSubmissionRequest.copy(str, str2, str3, moduleData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getModuleType() {
        return this.moduleType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getModuleVersion() {
        return this.moduleVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    /* renamed from: component4, reason: from getter */
    public final ModuleData getModuleData() {
        return this.moduleData;
    }

    public final ModuleSubmissionRequest copy(String moduleType, String moduleVersion, String moduleId, ModuleData moduleData) {
        Intrinsics.checkNotNullParameter(moduleType, "moduleType");
        Intrinsics.checkNotNullParameter(moduleVersion, "moduleVersion");
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        return new ModuleSubmissionRequest(moduleType, moduleVersion, moduleId, moduleData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleSubmissionRequest)) {
            return false;
        }
        ModuleSubmissionRequest moduleSubmissionRequest = (ModuleSubmissionRequest) other;
        return Intrinsics.areEqual(this.moduleType, moduleSubmissionRequest.moduleType) && Intrinsics.areEqual(this.moduleVersion, moduleSubmissionRequest.moduleVersion) && Intrinsics.areEqual(this.moduleId, moduleSubmissionRequest.moduleId) && Intrinsics.areEqual(this.moduleData, moduleSubmissionRequest.moduleData);
    }

    public int hashCode() {
        int hashCode = ((((this.moduleType.hashCode() * 31) + this.moduleVersion.hashCode()) * 31) + this.moduleId.hashCode()) * 31;
        ModuleData moduleData = this.moduleData;
        return hashCode + (moduleData == null ? 0 : moduleData.hashCode());
    }

    public String toString() {
        return "ModuleSubmissionRequest(moduleType=" + this.moduleType + ", moduleVersion=" + this.moduleVersion + ", moduleId=" + this.moduleId + ", moduleData=" + this.moduleData + ")";
    }

    public ModuleSubmissionRequest(String moduleType, String moduleVersion, String moduleId, ModuleData moduleData) {
        Intrinsics.checkNotNullParameter(moduleType, "moduleType");
        Intrinsics.checkNotNullParameter(moduleVersion, "moduleVersion");
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        this.moduleType = moduleType;
        this.moduleVersion = moduleVersion;
        this.moduleId = moduleId;
        this.moduleData = moduleData;
    }

    public /* synthetic */ ModuleSubmissionRequest(String str, String str2, String str3, ModuleData moduleData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : moduleData);
    }

    public final String getModuleType() {
        return this.moduleType;
    }

    public final String getModuleVersion() {
        return this.moduleVersion;
    }

    public final String getModuleId() {
        return this.moduleId;
    }

    public final ModuleData getModuleData() {
        return this.moduleData;
    }
}
