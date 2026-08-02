package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003Ji\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Primary;", "", "color", "", "backgroundColor", "boundingBoxColor", "fontFamily", "button", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "progressBarColor", "imageThemeColor", "icon", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Icon;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Icon;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBoundingBoxColor", "getButton", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "getColor", "getFontFamily", "getIcon", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Icon;", "getImageThemeColor", "getProgressBarColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Primary {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final String boundingBoxColor;
    private final Button button;
    private final String color;
    private final String fontFamily;
    private final Icon icon;
    private final String imageThemeColor;
    private final String progressBarColor;

    public static /* synthetic */ Primary copy$default(Primary primary, String str, String str2, String str3, String str4, Button button, String str5, String str6, Icon icon, int i, Object obj) {
        if ((i & 1) != 0) {
            str = primary.color;
        }
        if ((i & 2) != 0) {
            str2 = primary.backgroundColor;
        }
        if ((i & 4) != 0) {
            str3 = primary.boundingBoxColor;
        }
        if ((i & 8) != 0) {
            str4 = primary.fontFamily;
        }
        if ((i & 16) != 0) {
            button = primary.button;
        }
        if ((i & 32) != 0) {
            str5 = primary.progressBarColor;
        }
        if ((i & 64) != 0) {
            str6 = primary.imageThemeColor;
        }
        if ((i & 128) != 0) {
            icon = primary.icon;
        }
        String str7 = str6;
        Icon icon2 = icon;
        Button button2 = button;
        String str8 = str5;
        return primary.copy(str, str2, str3, str4, button2, str8, str7, icon2);
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
    public final Button getButton() {
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
    public final Icon getIcon() {
        return this.icon;
    }

    public final Primary copy(String color, String backgroundColor, String boundingBoxColor, String fontFamily, Button button, String progressBarColor, String imageThemeColor, Icon icon) {
        return new Primary(color, backgroundColor, boundingBoxColor, fontFamily, button, progressBarColor, imageThemeColor, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Primary)) {
            return false;
        }
        Primary primary = (Primary) other;
        return Intrinsics.areEqual(this.color, primary.color) && Intrinsics.areEqual(this.backgroundColor, primary.backgroundColor) && Intrinsics.areEqual(this.boundingBoxColor, primary.boundingBoxColor) && Intrinsics.areEqual(this.fontFamily, primary.fontFamily) && Intrinsics.areEqual(this.button, primary.button) && Intrinsics.areEqual(this.progressBarColor, primary.progressBarColor) && Intrinsics.areEqual(this.imageThemeColor, primary.imageThemeColor) && Intrinsics.areEqual(this.icon, primary.icon);
    }

    public int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.boundingBoxColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fontFamily;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Button button = this.button;
        int hashCode5 = (hashCode4 + (button == null ? 0 : button.hashCode())) * 31;
        String str5 = this.progressBarColor;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.imageThemeColor;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Icon icon = this.icon;
        return hashCode7 + (icon != null ? icon.hashCode() : 0);
    }

    public String toString() {
        return "Primary(color=" + this.color + ", backgroundColor=" + this.backgroundColor + ", boundingBoxColor=" + this.boundingBoxColor + ", fontFamily=" + this.fontFamily + ", button=" + this.button + ", progressBarColor=" + this.progressBarColor + ", imageThemeColor=" + this.imageThemeColor + ", icon=" + this.icon + ")";
    }

    public Primary(String str, String str2, String str3, String str4, Button button, String str5, String str6, Icon icon) {
        this.color = str;
        this.backgroundColor = str2;
        this.boundingBoxColor = str3;
        this.fontFamily = str4;
        this.button = button;
        this.progressBarColor = str5;
        this.imageThemeColor = str6;
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

    public final Button getButton() {
        return this.button;
    }

    public final String getProgressBarColor() {
        return this.progressBarColor;
    }

    public final String getImageThemeColor() {
        return this.imageThemeColor;
    }

    public final Icon getIcon() {
        return this.icon;
    }
}
