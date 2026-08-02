package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionOpenWidgetSettings.kt */
/* loaded from: classes6.dex */
public final class WebActionOpenWidgetSettings extends WebAction {
    public static final a CREATOR = new a();
    public final WebAction c;
    public final String d;
    public final String e;

    /* compiled from: WebActionOpenWidgetSettings.kt */
    public static final class a implements Parcelable.Creator<WebActionOpenWidgetSettings> {
        @Override // android.os.Parcelable.Creator
        public final WebActionOpenWidgetSettings createFromParcel(Parcel parcel) {
            return new WebActionOpenWidgetSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionOpenWidgetSettings[] newArray(int i) {
            return new WebActionOpenWidgetSettings[i];
        }
    }

    public WebActionOpenWidgetSettings(WebAction webAction, String str, String str2) {
        this.c = webAction;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionOpenWidgetSettings)) {
            return false;
        }
        WebActionOpenWidgetSettings webActionOpenWidgetSettings = (WebActionOpenWidgetSettings) obj;
        return epx.f(this.c, webActionOpenWidgetSettings.c) && epx.f(this.d, webActionOpenWidgetSettings.d) && epx.f(this.e, webActionOpenWidgetSettings.e);
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final String f() {
        return this.d;
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final WebAction g() {
        return this.c;
    }

    public final int hashCode() {
        WebAction webAction = this.c;
        int hashCode = (webAction == null ? 0 : webAction.hashCode()) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionOpenWidgetSettings(fallbackAction=");
        sb.append(this.c);
        sb.append(", accessibilityLabel=");
        sb.append(this.d);
        sb.append(", type=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public WebActionOpenWidgetSettings(Parcel parcel) {
        this((WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString(), parcel.readString());
    }
}
