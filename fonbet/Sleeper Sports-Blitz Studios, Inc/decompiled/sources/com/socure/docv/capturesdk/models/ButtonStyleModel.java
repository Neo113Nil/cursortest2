package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/socure/docv/capturesdk/models/ButtonStyleModel;", "", "color", "", "backgroundColor", "fontSize", "fontWeight", ViewProps.BORDER_RADIUS, ViewProps.BORDER_COLOR, ViewProps.BORDER_WIDTH, "shadow", "width", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getBorderRadius", "getBorderWidth", "getColor", "getFontSize", "getFontWeight", "getShadow", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ButtonStyleModel {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final String borderColor;
    private final String borderRadius;
    private final String borderWidth;
    private final String color;
    private final String fontSize;
    private final String fontWeight;
    private final String shadow;
    private final String width;

    public static /* synthetic */ ButtonStyleModel copy$default(ButtonStyleModel buttonStyleModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buttonStyleModel.color;
        }
        if ((i & 2) != 0) {
            str2 = buttonStyleModel.backgroundColor;
        }
        if ((i & 4) != 0) {
            str3 = buttonStyleModel.fontSize;
        }
        if ((i & 8) != 0) {
            str4 = buttonStyleModel.fontWeight;
        }
        if ((i & 16) != 0) {
            str5 = buttonStyleModel.borderRadius;
        }
        if ((i & 32) != 0) {
            str6 = buttonStyleModel.borderColor;
        }
        if ((i & 64) != 0) {
            str7 = buttonStyleModel.borderWidth;
        }
        if ((i & 128) != 0) {
            str8 = buttonStyleModel.shadow;
        }
        if ((i & 256) != 0) {
            str9 = buttonStyleModel.width;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return buttonStyleModel.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
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
    public final String getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBorderRadius() {
        return this.borderRadius;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBorderWidth() {
        return this.borderWidth;
    }

    /* renamed from: component8, reason: from getter */
    public final String getShadow() {
        return this.shadow;
    }

    /* renamed from: component9, reason: from getter */
    public final String getWidth() {
        return this.width;
    }

    public final ButtonStyleModel copy(String color, String backgroundColor, String fontSize, String fontWeight, String borderRadius, String borderColor, String borderWidth, String shadow, String width) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(fontSize, "fontSize");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Intrinsics.checkNotNullParameter(borderRadius, "borderRadius");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(borderWidth, "borderWidth");
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        Intrinsics.checkNotNullParameter(width, "width");
        return new ButtonStyleModel(color, backgroundColor, fontSize, fontWeight, borderRadius, borderColor, borderWidth, shadow, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonStyleModel)) {
            return false;
        }
        ButtonStyleModel buttonStyleModel = (ButtonStyleModel) other;
        return Intrinsics.areEqual(this.color, buttonStyleModel.color) && Intrinsics.areEqual(this.backgroundColor, buttonStyleModel.backgroundColor) && Intrinsics.areEqual(this.fontSize, buttonStyleModel.fontSize) && Intrinsics.areEqual(this.fontWeight, buttonStyleModel.fontWeight) && Intrinsics.areEqual(this.borderRadius, buttonStyleModel.borderRadius) && Intrinsics.areEqual(this.borderColor, buttonStyleModel.borderColor) && Intrinsics.areEqual(this.borderWidth, buttonStyleModel.borderWidth) && Intrinsics.areEqual(this.shadow, buttonStyleModel.shadow) && Intrinsics.areEqual(this.width, buttonStyleModel.width);
    }

    public int hashCode() {
        return (((((((((((((((this.color.hashCode() * 31) + this.backgroundColor.hashCode()) * 31) + this.fontSize.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + this.borderRadius.hashCode()) * 31) + this.borderColor.hashCode()) * 31) + this.borderWidth.hashCode()) * 31) + this.shadow.hashCode()) * 31) + this.width.hashCode();
    }

    public String toString() {
        return "ButtonStyleModel(color=" + this.color + ", backgroundColor=" + this.backgroundColor + ", fontSize=" + this.fontSize + ", fontWeight=" + this.fontWeight + ", borderRadius=" + this.borderRadius + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ", shadow=" + this.shadow + ", width=" + this.width + ")";
    }

    public ButtonStyleModel(String color, String backgroundColor, String fontSize, String fontWeight, String borderRadius, String borderColor, String borderWidth, String shadow, String width) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(fontSize, "fontSize");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Intrinsics.checkNotNullParameter(borderRadius, "borderRadius");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(borderWidth, "borderWidth");
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        Intrinsics.checkNotNullParameter(width, "width");
        this.color = color;
        this.backgroundColor = backgroundColor;
        this.fontSize = fontSize;
        this.fontWeight = fontWeight;
        this.borderRadius = borderRadius;
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
        this.shadow = shadow;
        this.width = width;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getFontSize() {
        return this.fontSize;
    }

    public final String getFontWeight() {
        return this.fontWeight;
    }

    public final String getBorderRadius() {
        return this.borderRadius;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final String getBorderWidth() {
        return this.borderWidth;
    }

    public final String getShadow() {
        return this.shadow;
    }

    public final String getWidth() {
        return this.width;
    }
}
