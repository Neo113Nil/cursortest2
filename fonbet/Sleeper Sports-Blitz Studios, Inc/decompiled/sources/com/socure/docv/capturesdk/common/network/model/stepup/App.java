package com.socure.docv.capturesdk.common.network.model.stepup;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/App;", "", "theme", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Theme;", "logo", "", "isLogoCustomized", "", "screens", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Screens;", "newLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/NewLabels;", "accessibility", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Accessibility;", Session.JsonKeys.ERRORS, "Lcom/socure/docv/capturesdk/common/network/model/stepup/Errors;", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/Theme;Ljava/lang/String;ZLcom/socure/docv/capturesdk/common/network/model/stepup/Screens;Lcom/socure/docv/capturesdk/common/network/model/stepup/NewLabels;Lcom/socure/docv/capturesdk/common/network/model/stepup/Accessibility;Lcom/socure/docv/capturesdk/common/network/model/stepup/Errors;)V", "getAccessibility", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/Accessibility;", "getErrors", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/Errors;", "()Z", "getLogo", "()Ljava/lang/String;", "setLogo", "(Ljava/lang/String;)V", "getNewLabels", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/NewLabels;", "getScreens", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/Screens;", "getTheme", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/Theme;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class App {
    public static final int $stable = 8;
    private final Accessibility accessibility;
    private final Errors errors;
    private final boolean isLogoCustomized;
    private String logo;
    private final NewLabels newLabels;
    private final Screens screens;
    private final Theme theme;

    public static /* synthetic */ App copy$default(App app, Theme theme, String str, boolean z, Screens screens, NewLabels newLabels, Accessibility accessibility, Errors errors, int i, Object obj) {
        if ((i & 1) != 0) {
            theme = app.theme;
        }
        if ((i & 2) != 0) {
            str = app.logo;
        }
        if ((i & 4) != 0) {
            z = app.isLogoCustomized;
        }
        if ((i & 8) != 0) {
            screens = app.screens;
        }
        if ((i & 16) != 0) {
            newLabels = app.newLabels;
        }
        if ((i & 32) != 0) {
            accessibility = app.accessibility;
        }
        if ((i & 64) != 0) {
            errors = app.errors;
        }
        Accessibility accessibility2 = accessibility;
        Errors errors2 = errors;
        NewLabels newLabels2 = newLabels;
        boolean z2 = z;
        return app.copy(theme, str, z2, screens, newLabels2, accessibility2, errors2);
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
    public final boolean getIsLogoCustomized() {
        return this.isLogoCustomized;
    }

    /* renamed from: component4, reason: from getter */
    public final Screens getScreens() {
        return this.screens;
    }

    /* renamed from: component5, reason: from getter */
    public final NewLabels getNewLabels() {
        return this.newLabels;
    }

    /* renamed from: component6, reason: from getter */
    public final Accessibility getAccessibility() {
        return this.accessibility;
    }

    /* renamed from: component7, reason: from getter */
    public final Errors getErrors() {
        return this.errors;
    }

    public final App copy(Theme theme, String logo, boolean isLogoCustomized, Screens screens, NewLabels newLabels, Accessibility accessibility, Errors errors) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(screens, "screens");
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        Intrinsics.checkNotNullParameter(accessibility, "accessibility");
        Intrinsics.checkNotNullParameter(errors, "errors");
        return new App(theme, logo, isLogoCustomized, screens, newLabels, accessibility, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof App)) {
            return false;
        }
        App app = (App) other;
        return Intrinsics.areEqual(this.theme, app.theme) && Intrinsics.areEqual(this.logo, app.logo) && this.isLogoCustomized == app.isLogoCustomized && Intrinsics.areEqual(this.screens, app.screens) && Intrinsics.areEqual(this.newLabels, app.newLabels) && Intrinsics.areEqual(this.accessibility, app.accessibility) && Intrinsics.areEqual(this.errors, app.errors);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.theme.hashCode() * 31) + this.logo.hashCode()) * 31;
        boolean z = this.isLogoCustomized;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode + i) * 31) + this.screens.hashCode()) * 31) + this.newLabels.hashCode()) * 31) + this.accessibility.hashCode()) * 31) + this.errors.hashCode();
    }

    public String toString() {
        return "App(theme=" + this.theme + ", logo=" + this.logo + ", isLogoCustomized=" + this.isLogoCustomized + ", screens=" + this.screens + ", newLabels=" + this.newLabels + ", accessibility=" + this.accessibility + ", errors=" + this.errors + ")";
    }

    public App(Theme theme, String logo, boolean z, Screens screens, NewLabels newLabels, Accessibility accessibility, Errors errors) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(screens, "screens");
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        Intrinsics.checkNotNullParameter(accessibility, "accessibility");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.theme = theme;
        this.logo = logo;
        this.isLogoCustomized = z;
        this.screens = screens;
        this.newLabels = newLabels;
        this.accessibility = accessibility;
        this.errors = errors;
    }

    public final Accessibility getAccessibility() {
        return this.accessibility;
    }

    public final Errors getErrors() {
        return this.errors;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final NewLabels getNewLabels() {
        return this.newLabels;
    }

    public final Screens getScreens() {
        return this.screens;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final boolean isLogoCustomized() {
        return this.isLogoCustomized;
    }

    public final void setLogo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logo = str;
    }
}
