package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;", "", "color", "", "backgroundColor", "fontSize", "fontWeight", ViewProps.BORDER_RADIUS, ViewProps.BORDER_COLOR, ViewProps.BORDER_WIDTH, "shadow", "width", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getBorderRadius", "getBorderWidth", "getColor", "getFontSize", "getFontWeight", "getShadow", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ButtonStyle {
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

    public static /* synthetic */ ButtonStyle copy$default(ButtonStyle buttonStyle, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buttonStyle.color;
        }
        if ((i & 2) != 0) {
            str2 = buttonStyle.backgroundColor;
        }
        if ((i & 4) != 0) {
            str3 = buttonStyle.fontSize;
        }
        if ((i & 8) != 0) {
            str4 = buttonStyle.fontWeight;
        }
        if ((i & 16) != 0) {
            str5 = buttonStyle.borderRadius;
        }
        if ((i & 32) != 0) {
            str6 = buttonStyle.borderColor;
        }
        if ((i & 64) != 0) {
            str7 = buttonStyle.borderWidth;
        }
        if ((i & 128) != 0) {
            str8 = buttonStyle.shadow;
        }
        if ((i & 256) != 0) {
            str9 = buttonStyle.width;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return buttonStyle.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
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

    public final ButtonStyle copy(String color, String backgroundColor, String fontSize, String fontWeight, String borderRadius, String borderColor, String borderWidth, String shadow, String width) {
        return new ButtonStyle(color, backgroundColor, fontSize, fontWeight, borderRadius, borderColor, borderWidth, shadow, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonStyle)) {
            return false;
        }
        ButtonStyle buttonStyle = (ButtonStyle) other;
        return Intrinsics.areEqual(this.color, buttonStyle.color) && Intrinsics.areEqual(this.backgroundColor, buttonStyle.backgroundColor) && Intrinsics.areEqual(this.fontSize, buttonStyle.fontSize) && Intrinsics.areEqual(this.fontWeight, buttonStyle.fontWeight) && Intrinsics.areEqual(this.borderRadius, buttonStyle.borderRadius) && Intrinsics.areEqual(this.borderColor, buttonStyle.borderColor) && Intrinsics.areEqual(this.borderWidth, buttonStyle.borderWidth) && Intrinsics.areEqual(this.shadow, buttonStyle.shadow) && Intrinsics.areEqual(this.width, buttonStyle.width);
    }

    public int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fontSize;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fontWeight;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.borderRadius;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.borderColor;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.borderWidth;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shadow;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.width;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "ButtonStyle(color=" + this.color + ", backgroundColor=" + this.backgroundColor + ", fontSize=" + this.fontSize + ", fontWeight=" + this.fontWeight + ", borderRadius=" + this.borderRadius + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ", shadow=" + this.shadow + ", width=" + this.width + ")";
    }

    public ButtonStyle(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.color = str;
        this.backgroundColor = str2;
        this.fontSize = str3;
        this.fontWeight = str4;
        this.borderRadius = str5;
        this.borderColor = str6;
        this.borderWidth = str7;
        this.shadow = str8;
        this.width = str9;
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
