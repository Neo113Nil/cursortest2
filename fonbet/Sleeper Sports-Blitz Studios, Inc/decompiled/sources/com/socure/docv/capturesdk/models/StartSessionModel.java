package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/socure/docv/capturesdk/models/StartSessionModel;", "", "sessionToken", "", "nextModule", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "globalConfig", "Lcom/socure/docv/capturesdk/models/GlobalConfigModel;", "(Ljava/lang/String;Lcom/socure/docv/capturesdk/models/ModuleModel;Lcom/socure/docv/capturesdk/models/GlobalConfigModel;)V", "getGlobalConfig", "()Lcom/socure/docv/capturesdk/models/GlobalConfigModel;", "getNextModule", "()Lcom/socure/docv/capturesdk/models/ModuleModel;", "getSessionToken", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class StartSessionModel {
    public static final int $stable = 8;
    private final GlobalConfigModel globalConfig;
    private final ModuleModel nextModule;
    private final String sessionToken;

    public static /* synthetic */ StartSessionModel copy$default(StartSessionModel startSessionModel, String str, ModuleModel moduleModel, GlobalConfigModel globalConfigModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startSessionModel.sessionToken;
        }
        if ((i & 2) != 0) {
            moduleModel = startSessionModel.nextModule;
        }
        if ((i & 4) != 0) {
            globalConfigModel = startSessionModel.globalConfig;
        }
        return startSessionModel.copy(str, moduleModel, globalConfigModel);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    /* renamed from: component2, reason: from getter */
    public final ModuleModel getNextModule() {
        return this.nextModule;
    }

    /* renamed from: component3, reason: from getter */
    public final GlobalConfigModel getGlobalConfig() {
        return this.globalConfig;
    }

    public final StartSessionModel copy(String sessionToken, ModuleModel nextModule, GlobalConfigModel globalConfig) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(nextModule, "nextModule");
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        return new StartSessionModel(sessionToken, nextModule, globalConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartSessionModel)) {
            return false;
        }
        StartSessionModel startSessionModel = (StartSessionModel) other;
        return Intrinsics.areEqual(this.sessionToken, startSessionModel.sessionToken) && Intrinsics.areEqual(this.nextModule, startSessionModel.nextModule) && Intrinsics.areEqual(this.globalConfig, startSessionModel.globalConfig);
    }

    public int hashCode() {
        return (((this.sessionToken.hashCode() * 31) + this.nextModule.hashCode()) * 31) + this.globalConfig.hashCode();
    }

    public String toString() {
        return "StartSessionModel(sessionToken=" + this.sessionToken + ", nextModule=" + this.nextModule + ", globalConfig=" + this.globalConfig + ")";
    }

    public StartSessionModel(String sessionToken, ModuleModel nextModule, GlobalConfigModel globalConfig) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(nextModule, "nextModule");
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        this.sessionToken = sessionToken;
        this.nextModule = nextModule;
        this.globalConfig = globalConfig;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final ModuleModel getNextModule() {
        return this.nextModule;
    }

    public final GlobalConfigModel getGlobalConfig() {
        return this.globalConfig;
    }
}
