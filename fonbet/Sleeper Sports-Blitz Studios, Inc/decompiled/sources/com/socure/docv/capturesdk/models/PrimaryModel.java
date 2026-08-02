package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, d2 = {"Lcom/socure/docv/capturesdk/models/PrimaryModel;", "", "color", "", "backgroundColor", "boundingBoxColor", "fontFamily", "button", "Lcom/socure/docv/capturesdk/models/ButtonModel;", "progressBarColor", "imageThemeColor", "icon", "Lcom/socure/docv/capturesdk/models/IconModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/ButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/IconModel;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBoundingBoxColor", "getButton", "()Lcom/socure/docv/capturesdk/models/ButtonModel;", "getColor", "getFontFamily", "getIcon", "()Lcom/socure/docv/capturesdk/models/IconModel;", "getImageThemeColor", "getProgressBarColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PrimaryModel {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final String boundingBoxColor;
    private final ButtonModel button;
    private final String color;
    private final String fontFamily;
    private final IconModel icon;
    private final String imageThemeColor;
    private final String progressBarColor;

    public static /* synthetic */ PrimaryModel copy$default(PrimaryModel primaryModel, String str, String str2, String str3, String str4, ButtonModel buttonModel, String str5, String str6, IconModel iconModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = primaryModel.color;
        }
        if ((i & 2) != 0) {
            str2 = primaryModel.backgroundColor;
        }
        if ((i & 4) != 0) {
            str3 = primaryModel.boundingBoxColor;
        }
        if ((i & 8) != 0) {
            str4 = primaryModel.fontFamily;
        }
        if ((i & 16) != 0) {
            buttonModel = primaryModel.button;
        }
        if ((i & 32) != 0) {
            str5 = primaryModel.progressBarColor;
        }
        if ((i & 64) != 0) {
            str6 = primaryModel.imageThemeColor;
        }
        if ((i & 128) != 0) {
            iconModel = primaryModel.icon;
        }
        String str7 = str6;
        IconModel iconModel2 = iconModel;
        ButtonModel buttonModel2 = buttonModel;
        String str8 = str5;
        return primaryModel.copy(str, str2, str3, str4, buttonModel2, str8, str7, iconModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBoundingBoxColor() {
        return this.boundingBoxColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonModel getButton() {
        return this.button;
    }

    /* renamed from: component6, reason: from getter */
    public final String getProgressBarColor() {
        return this.progressBarColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getImageThemeColor() {
        return this.imageThemeColor;
    }

    /* renamed from: component8, reason: from getter */
    public final IconModel getIcon() {
        return this.icon;
    }

    public final PrimaryModel copy(String color, String backgroundColor, String boundingBoxColor, String fontFamily, ButtonModel button, String progressBarColor, String imageThemeColor, IconModel icon) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(boundingBoxColor, "boundingBoxColor");
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(progressBarColor, "progressBarColor");
        Intrinsics.checkNotNullParameter(imageThemeColor, "imageThemeColor");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new PrimaryModel(color, backgroundColor, boundingBoxColor, fontFamily, button, progressBarColor, imageThemeColor, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryModel)) {
            return false;
        }
        PrimaryModel primaryModel = (PrimaryModel) other;
        return Intrinsics.areEqual(this.color, primaryModel.color) && Intrinsics.areEqual(this.backgroundColor, primaryModel.backgroundColor) && Intrinsics.areEqual(this.boundingBoxColor, primaryModel.boundingBoxColor) && Intrinsics.areEqual(this.fontFamily, primaryModel.fontFamily) && Intrinsics.areEqual(this.button, primaryModel.button) && Intrinsics.areEqual(this.progressBarColor, primaryModel.progressBarColor) && Intrinsics.areEqual(this.imageThemeColor, primaryModel.imageThemeColor) && Intrinsics.areEqual(this.icon, primaryModel.icon);
    }

    public int hashCode() {
        return (((((((((((((this.color.hashCode() * 31) + this.backgroundColor.hashCode()) * 31) + this.boundingBoxColor.hashCode()) * 31) + this.fontFamily.hashCode()) * 31) + this.button.hashCode()) * 31) + this.progressBarColor.hashCode()) * 31) + this.imageThemeColor.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "PrimaryModel(color=" + this.color + ", backgroundColor=" + this.backgroundColor + ", boundingBoxColor=" + this.boundingBoxColor + ", fontFamily=" + this.fontFamily + ", button=" + this.button + ", progressBarColor=" + this.progressBarColor + ", imageThemeColor=" + this.imageThemeColor + ", icon=" + this.icon + ")";
    }

    public PrimaryModel(String color, String backgroundColor, String boundingBoxColor, String fontFamily, ButtonModel button, String progressBarColor, String imageThemeColor, IconModel icon) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(boundingBoxColor, "boundingBoxColor");
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(progressBarColor, "progressBarColor");
        Intrinsics.checkNotNullParameter(imageThemeColor, "imageThemeColor");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.color = color;
        this.backgroundColor = backgroundColor;
        this.boundingBoxColor = boundingBoxColor;
        this.fontFamily = fontFamily;
        this.button = button;
        this.progressBarColor = progressBarColor;
        this.imageThemeColor = imageThemeColor;
        this.icon = icon;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBoundingBoxColor() {
        return this.boundingBoxColor;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final ButtonModel getButton() {
        return this.button;
    }

    public final String getProgressBarColor() {
        return this.progressBarColor;
    }

    public final String getImageThemeColor() {
        return this.imageThemeColor;
    }

    public final IconModel getIcon() {
        return this.icon;
    }
}
