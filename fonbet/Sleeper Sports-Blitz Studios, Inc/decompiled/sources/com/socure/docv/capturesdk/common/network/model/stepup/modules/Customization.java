package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0006\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "", "theme", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;", "logo", "", "isLogoCustomized", "", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;Ljava/lang/String;Ljava/lang/Boolean;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;)V", "getConfig", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLogo", "()Ljava/lang/String;", "getTheme", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;", "component1", "component2", "component3", "component4", "copy", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;Ljava/lang/String;Ljava/lang/Boolean;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Config;)Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Customization {
    public static final int $stable = 0;
    private final Config config;
    private final Boolean isLogoCustomized;
    private final String logo;
    private final Theme theme;

    public static /* synthetic */ Customization copy$default(Customization customization, Theme theme, String str, Boolean bool, Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            theme = customization.theme;
        }
        if ((i & 2) != 0) {
            str = customization.logo;
        }
        if ((i & 4) != 0) {
            bool = customization.isLogoCustomized;
        }
        if ((i & 8) != 0) {
            config = customization.config;
        }
        return customization.copy(theme, str, bool, config);
    }

    /* renamed from: component1, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsLogoCustomized() {
        return this.isLogoCustomized;
    }

    /* renamed from: component4, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    public final Customization copy(Theme theme, String logo, Boolean isLogoCustomized, Config config) {
        return new Customization(theme, logo, isLogoCustomized, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Customization)) {
            return false;
        }
        Customization customization = (Customization) other;
        return Intrinsics.areEqual(this.theme, customization.theme) && Intrinsics.areEqual(this.logo, customization.logo) && Intrinsics.areEqual(this.isLogoCustomized, customization.isLogoCustomized) && Intrinsics.areEqual(this.config, customization.config);
    }

    public int hashCode() {
        Theme theme = this.theme;
        int hashCode = (theme == null ? 0 : theme.hashCode()) * 31;
        String str = this.logo;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isLogoCustomized;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Config config = this.config;
        return hashCode3 + (config != null ? config.hashCode() : 0);
    }

    public String toString() {
        return "Customization(theme=" + this.theme + ", logo=" + this.logo + ", isLogoCustomized=" + this.isLogoCustomized + ", config=" + this.config + ")";
    }

    public Customization(Theme theme, String str, Boolean bool, Config config) {
        this.theme = theme;
        this.logo = str;
        this.isLogoCustomized = bool;
        this.config = config;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final Boolean isLogoCustomized() {
        return this.isLogoCustomized;
    }

    public final Config getConfig() {
        return this.config;
    }
}
