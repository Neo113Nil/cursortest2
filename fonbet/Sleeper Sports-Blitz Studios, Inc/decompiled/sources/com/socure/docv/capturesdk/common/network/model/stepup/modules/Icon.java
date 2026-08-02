package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Icon;", "", "successColor", "", "errorColor", "infoColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorColor", "()Ljava/lang/String;", "getInfoColor", "getSuccessColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Icon {
    public static final int $stable = 0;
    private final String errorColor;
    private final String infoColor;
    private final String successColor;

    public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = icon.successColor;
        }
        if ((i & 2) != 0) {
            str2 = icon.errorColor;
        }
        if ((i & 4) != 0) {
            str3 = icon.infoColor;
        }
        return icon.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSuccessColor() {
        return this.successColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorColor() {
        return this.errorColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInfoColor() {
        return this.infoColor;
    }

    public final Icon copy(String successColor, String errorColor, String infoColor) {
        return new Icon(successColor, errorColor, infoColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) other;
        return Intrinsics.areEqual(this.successColor, icon.successColor) && Intrinsics.areEqual(this.errorColor, icon.errorColor) && Intrinsics.areEqual(this.infoColor, icon.infoColor);
    }

    public int hashCode() {
        String str = this.successColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.infoColor;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Icon(successColor=" + this.successColor + ", errorColor=" + this.errorColor + ", infoColor=" + this.infoColor + ")";
    }

    public Icon(String str, String str2, String str3) {
        this.successColor = str;
        this.errorColor = str2;
        this.infoColor = str3;
    }

    public final String getSuccessColor() {
        return this.successColor;
    }

    public final String getErrorColor() {
        return this.errorColor;
    }

    public final String getInfoColor() {
        return this.infoColor;
    }
}
