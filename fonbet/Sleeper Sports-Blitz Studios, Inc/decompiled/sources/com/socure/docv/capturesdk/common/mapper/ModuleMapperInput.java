package com.socure.docv.capturesdk.common.mapper;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleMapperInput.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ModuleMapperInput;", "", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;", "moduleId", "", "sessionToken", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;Ljava/lang/String;Ljava/lang/String;)V", "getConfig", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;", "getModuleId", "()Ljava/lang/String;", "getSessionToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ModuleMapperInput {
    public static final int $stable = 8;
    private final ModuleConfig config;
    private final String moduleId;
    private final String sessionToken;

    public static /* synthetic */ ModuleMapperInput copy$default(ModuleMapperInput moduleMapperInput, ModuleConfig moduleConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            moduleConfig = moduleMapperInput.config;
        }
        if ((i & 2) != 0) {
            str = moduleMapperInput.moduleId;
        }
        if ((i & 4) != 0) {
            str2 = moduleMapperInput.sessionToken;
        }
        return moduleMapperInput.copy(moduleConfig, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ModuleConfig getConfig() {
        return this.config;
    }

    /* renamed from: component2, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final ModuleMapperInput copy(ModuleConfig config, String moduleId, String sessionToken) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        return new ModuleMapperInput(config, moduleId, sessionToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleMapperInput)) {
            return false;
        }
        ModuleMapperInput moduleMapperInput = (ModuleMapperInput) other;
        return Intrinsics.areEqual(this.config, moduleMapperInput.config) && Intrinsics.areEqual(this.moduleId, moduleMapperInput.moduleId) && Intrinsics.areEqual(this.sessionToken, moduleMapperInput.sessionToken);
    }

    public int hashCode() {
        int hashCode = ((this.config.hashCode() * 31) + this.moduleId.hashCode()) * 31;
        String str = this.sessionToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ModuleMapperInput(config=" + this.config + ", moduleId=" + this.moduleId + ", sessionToken=" + this.sessionToken + ")";
    }

    public ModuleMapperInput(ModuleConfig config, String moduleId, String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        this.config = config;
        this.moduleId = moduleId;
        this.sessionToken = str;
    }

    public final ModuleConfig getConfig() {
        return this.config;
    }

    public final String getModuleId() {
        return this.moduleId;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }
}
