package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.messaging.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003JQ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "", SDKConstants.PARAM_KEY, "", Constants.ScionAnalytics.PARAM_LABEL, "value", "subText", "primary", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;", "secondary", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;)V", "getKey", "()Ljava/lang/String;", "getLabel", "getPrimary", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;", "getSecondary", "getSubText", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Button {
    public static final int $stable = 0;
    private final String key;
    private final String label;
    private final ButtonStyle primary;
    private final ButtonStyle secondary;
    private final String subText;
    private final String value;

    public Button() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Button copy$default(Button button, String str, String str2, String str3, String str4, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = button.key;
        }
        if ((i & 2) != 0) {
            str2 = button.label;
        }
        if ((i & 4) != 0) {
            str3 = button.value;
        }
        if ((i & 8) != 0) {
            str4 = button.subText;
        }
        if ((i & 16) != 0) {
            buttonStyle = button.primary;
        }
        if ((i & 32) != 0) {
            buttonStyle2 = button.secondary;
        }
        ButtonStyle buttonStyle3 = buttonStyle;
        ButtonStyle buttonStyle4 = buttonStyle2;
        return button.copy(str, str2, str3, str4, buttonStyle3, buttonStyle4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonStyle getPrimary() {
        return this.primary;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonStyle getSecondary() {
        return this.secondary;
    }

    public final Button copy(String key, String label, String value, String subText, ButtonStyle primary, ButtonStyle secondary) {
        return new Button(key, label, value, subText, primary, secondary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Button)) {
            return false;
        }
        Button button = (Button) other;
        return Intrinsics.areEqual(this.key, button.key) && Intrinsics.areEqual(this.label, button.label) && Intrinsics.areEqual(this.value, button.value) && Intrinsics.areEqual(this.subText, button.subText) && Intrinsics.areEqual(this.primary, button.primary) && Intrinsics.areEqual(this.secondary, button.secondary);
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ButtonStyle buttonStyle = this.primary;
        int hashCode5 = (hashCode4 + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
        ButtonStyle buttonStyle2 = this.secondary;
        return hashCode5 + (buttonStyle2 != null ? buttonStyle2.hashCode() : 0);
    }

    public String toString() {
        return "Button(key=" + this.key + ", label=" + this.label + ", value=" + this.value + ", subText=" + this.subText + ", primary=" + this.primary + ", secondary=" + this.secondary + ")";
    }

    public Button(String str, String str2, String str3, String str4, ButtonStyle buttonStyle, ButtonStyle buttonStyle2) {
        this.key = str;
        this.label = str2;
        this.value = str3;
        this.subText = str4;
        this.primary = buttonStyle;
        this.secondary = buttonStyle2;
    }

    public /* synthetic */ Button(String str, String str2, String str3, String str4, ButtonStyle buttonStyle, ButtonStyle buttonStyle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : buttonStyle, (i & 32) != 0 ? null : buttonStyle2);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getSubText() {
        return this.subText;
    }

    public final ButtonStyle getPrimary() {
        return this.primary;
    }

    public final ButtonStyle getSecondary() {
        return this.secondary;
    }
}
