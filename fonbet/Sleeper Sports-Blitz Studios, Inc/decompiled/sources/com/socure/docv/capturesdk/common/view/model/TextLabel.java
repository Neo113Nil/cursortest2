package com.socure.docv.capturesdk.common.view.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BsViewData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/common/view/model/TextLabel;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "labelColor", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getLabelColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TextLabel {
    public static final int $stable = 0;
    private final String label;
    private final String labelColor;

    public static /* synthetic */ TextLabel copy$default(TextLabel textLabel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textLabel.label;
        }
        if ((i & 2) != 0) {
            str2 = textLabel.labelColor;
        }
        return textLabel.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabelColor() {
        return this.labelColor;
    }

    public final TextLabel copy(String label, String labelColor) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(labelColor, "labelColor");
        return new TextLabel(label, labelColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLabel)) {
            return false;
        }
        TextLabel textLabel = (TextLabel) other;
        return Intrinsics.areEqual(this.label, textLabel.label) && Intrinsics.areEqual(this.labelColor, textLabel.labelColor);
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.labelColor.hashCode();
    }

    public String toString() {
        return "TextLabel(label=" + this.label + ", labelColor=" + this.labelColor + ")";
    }

    public TextLabel(String label, String labelColor) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(labelColor, "labelColor");
        this.label = label;
        this.labelColor = labelColor;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLabelColor() {
        return this.labelColor;
    }
}
