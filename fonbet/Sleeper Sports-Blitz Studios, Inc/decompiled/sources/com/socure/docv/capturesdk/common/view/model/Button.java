package com.socure.docv.capturesdk.common.view.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BsViewData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/common/view/model/Button;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "labelColor", ViewProps.BORDER_COLOR, "bgColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBgColor", "()Ljava/lang/String;", "getBorderColor", "getLabel", "getLabelColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Button {
    public static final int $stable = 0;
    private final String bgColor;
    private final String borderColor;
    private final String label;
    private final String labelColor;

    public static /* synthetic */ Button copy$default(Button button, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = button.label;
        }
        if ((i & 2) != 0) {
            str2 = button.labelColor;
        }
        if ((i & 4) != 0) {
            str3 = button.borderColor;
        }
        if ((i & 8) != 0) {
            str4 = button.bgColor;
        }
        return button.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabelColor() {
        return this.labelColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    public final Button copy(String label, String labelColor, String borderColor, String bgColor) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(labelColor, "labelColor");
        return new Button(label, labelColor, borderColor, bgColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Button)) {
            return false;
        }
        Button button = (Button) other;
        return Intrinsics.areEqual(this.label, button.label) && Intrinsics.areEqual(this.labelColor, button.labelColor) && Intrinsics.areEqual(this.borderColor, button.borderColor) && Intrinsics.areEqual(this.bgColor, button.bgColor);
    }

    public int hashCode() {
        int hashCode = ((this.label.hashCode() * 31) + this.labelColor.hashCode()) * 31;
        String str = this.borderColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bgColor;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Button(label=" + this.label + ", labelColor=" + this.labelColor + ", borderColor=" + this.borderColor + ", bgColor=" + this.bgColor + ")";
    }

    public Button(String label, String labelColor, String str, String str2) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(labelColor, "labelColor");
        this.label = label;
        this.labelColor = labelColor;
        this.borderColor = str;
        this.bgColor = str2;
    }

    public /* synthetic */ Button(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLabelColor() {
        return this.labelColor;
    }
}
