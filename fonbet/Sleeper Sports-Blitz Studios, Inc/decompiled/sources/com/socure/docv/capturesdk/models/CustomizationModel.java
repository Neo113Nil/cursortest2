package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/socure/docv/capturesdk/models/CustomizationModel;", "", "theme", "Lcom/socure/docv/capturesdk/models/ThemeModel;", "logo", "", "isLogoCustomized", "", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/socure/docv/capturesdk/models/ConfigModel;", "(Lcom/socure/docv/capturesdk/models/ThemeModel;Ljava/lang/String;ZLcom/socure/docv/capturesdk/models/ConfigModel;)V", "getConfig", "()Lcom/socure/docv/capturesdk/models/ConfigModel;", "()Z", "getLogo", "()Ljava/lang/String;", "getTheme", "()Lcom/socure/docv/capturesdk/models/ThemeModel;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CustomizationModel {
    public static final int $stable = 0;
    private final ConfigModel config;
    private final boolean isLogoCustomized;
    private final String logo;
    private final ThemeModel theme;

    public static /* synthetic */ CustomizationModel copy$default(CustomizationModel customizationModel, ThemeModel themeModel, String str, boolean z, ConfigModel configModel, int i, Object obj) {
        if ((i & 1) != 0) {
            themeModel = customizationModel.theme;
        }
        if ((i & 2) != 0) {
            str = customizationModel.logo;
        }
        if ((i & 4) != 0) {
            z = customizationModel.isLogoCustomized;
        }
        if ((i & 8) != 0) {
            configModel = customizationModel.config;
        }
        return customizationModel.copy(themeModel, str, z, configModel);
    }

    /* renamed from: component1, reason: from getter */
    public final ThemeModel getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLogoCustomized() {
        return this.isLogoCustomized;
    }

    /* renamed from: component4, reason: from getter */
    public final ConfigModel getConfig() {
        return this.config;
    }

    public final CustomizationModel copy(ThemeModel theme, String logo, boolean isLogoCustomized, ConfigModel config) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(config, "config");
        return new CustomizationModel(theme, logo, isLogoCustomized, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomizationModel)) {
            return false;
        }
        CustomizationModel customizationModel = (CustomizationModel) other;
        return Intrinsics.areEqual(this.theme, customizationModel.theme) && Intrinsics.areEqual(this.logo, customizationModel.logo) && this.isLogoCustomized == customizationModel.isLogoCustomized && Intrinsics.areEqual(this.config, customizationModel.config);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.theme.hashCode() * 31) + this.logo.hashCode()) * 31;
        boolean z = this.isLogoCustomized;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.config.hashCode();
    }

    public String toString() {
        return "CustomizationModel(theme=" + this.theme + ", logo=" + this.logo + ", isLogoCustomized=" + this.isLogoCustomized + ", config=" + this.config + ")";
    }

    public CustomizationModel(ThemeModel theme, String logo, boolean z, ConfigModel config) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(config, "config");
        this.theme = theme;
        this.logo = logo;
        this.isLogoCustomized = z;
        this.config = config;
    }

    public final ThemeModel getTheme() {
        return this.theme;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final boolean isLogoCustomized() {
        return this.isLogoCustomized;
    }

    public final ConfigModel getConfig() {
        return this.config;
    }
}
