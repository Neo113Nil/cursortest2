package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "", "sessionToken", "", "eventId", "nextModule", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleResponse;", "globalConfig", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;", "(Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleResponse;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;)V", "getEventId", "()Ljava/lang/String;", "getGlobalConfig", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;", "getNextModule", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleResponse;", "getSessionToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ModuleDataResponse {
    public static final int $stable = 8;
    private final String eventId;
    private final GlobalConfig globalConfig;
    private final ModuleResponse nextModule;
    private final String sessionToken;

    public static /* synthetic */ ModuleDataResponse copy$default(ModuleDataResponse moduleDataResponse, String str, String str2, ModuleResponse moduleResponse, GlobalConfig globalConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moduleDataResponse.sessionToken;
        }
        if ((i & 2) != 0) {
            str2 = moduleDataResponse.eventId;
        }
        if ((i & 4) != 0) {
            moduleResponse = moduleDataResponse.nextModule;
        }
        if ((i & 8) != 0) {
            globalConfig = moduleDataResponse.globalConfig;
        }
        return moduleDataResponse.copy(str, str2, moduleResponse, globalConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component3, reason: from getter */
    public final ModuleResponse getNextModule() {
        return this.nextModule;
    }

    /* renamed from: component4, reason: from getter */
    public final GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public final ModuleDataResponse copy(String sessionToken, String eventId, ModuleResponse nextModule, GlobalConfig globalConfig) {
        return new ModuleDataResponse(sessionToken, eventId, nextModule, globalConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleDataResponse)) {
            return false;
        }
        ModuleDataResponse moduleDataResponse = (ModuleDataResponse) other;
        return Intrinsics.areEqual(this.sessionToken, moduleDataResponse.sessionToken) && Intrinsics.areEqual(this.eventId, moduleDataResponse.eventId) && Intrinsics.areEqual(this.nextModule, moduleDataResponse.nextModule) && Intrinsics.areEqual(this.globalConfig, moduleDataResponse.globalConfig);
    }

    public int hashCode() {
        String str = this.sessionToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ModuleResponse moduleResponse = this.nextModule;
        int hashCode3 = (hashCode2 + (moduleResponse == null ? 0 : moduleResponse.hashCode())) * 31;
        GlobalConfig globalConfig = this.globalConfig;
        return hashCode3 + (globalConfig != null ? globalConfig.hashCode() : 0);
    }

    public String toString() {
        return "ModuleDataResponse(sessionToken=" + this.sessionToken + ", eventId=" + this.eventId + ", nextModule=" + this.nextModule + ", globalConfig=" + this.globalConfig + ")";
    }

    public ModuleDataResponse(String str, String str2, ModuleResponse moduleResponse, GlobalConfig globalConfig) {
        this.sessionToken = str;
        this.eventId = str2;
        this.nextModule = moduleResponse;
        this.globalConfig = globalConfig;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final ModuleResponse getNextModule() {
        return this.nextModule;
    }

    public final GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }
}
