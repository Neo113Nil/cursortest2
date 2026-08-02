package io.intercom.android.sdk.m5.home.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeV2Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/Action;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "icon", "Lio/intercom/android/sdk/m5/home/data/IconType;", "subtitle", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/home/data/IconType;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getIcon", "()Lio/intercom/android/sdk/m5/home/data/IconType;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Action {
    public static final int $stable = 0;

    @SerializedName("icon")
    private final IconType icon;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String label;

    @SerializedName("subtitle")
    private final String subtitle;

    public static /* synthetic */ Action copy$default(Action action, String str, IconType iconType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = action.label;
        }
        if ((i & 2) != 0) {
            iconType = action.icon;
        }
        if ((i & 4) != 0) {
            str2 = action.subtitle;
        }
        return action.copy(str, iconType, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final IconType getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Action copy(String label, IconType icon, String subtitle) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new Action(label, icon, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Action)) {
            return false;
        }
        Action action = (Action) other;
        return Intrinsics.areEqual(this.label, action.label) && this.icon == action.icon && Intrinsics.areEqual(this.subtitle, action.subtitle);
    }

    public int hashCode() {
        int hashCode = this.label.hashCode() * 31;
        IconType iconType = this.icon;
        int hashCode2 = (hashCode + (iconType == null ? 0 : iconType.hashCode())) * 31;
        String str = this.subtitle;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "Action(label=" + this.label + ", icon=" + this.icon + ", subtitle=" + this.subtitle + ')';
    }

    public Action(String label, IconType iconType, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.icon = iconType;
        this.subtitle = str;
    }

    public final String getLabel() {
        return this.label;
    }

    public final IconType getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }
}
