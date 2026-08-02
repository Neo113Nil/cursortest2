package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ExploreWidgetsBaseAppLaunchParamsDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseAppLaunchParamsDto implements Parcelable {
    public static final Parcelable.Creator<ExploreWidgetsBaseAppLaunchParamsDto> CREATOR = new a();

    @pmi0("app_id")
    private final int appId;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: ExploreWidgetsBaseAppLaunchParamsDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseAppLaunchParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseAppLaunchParamsDto createFromParcel(Parcel parcel) {
            return new ExploreWidgetsBaseAppLaunchParamsDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseAppLaunchParamsDto[] newArray(int i) {
            return new ExploreWidgetsBaseAppLaunchParamsDto[i];
        }
    }

    public ExploreWidgetsBaseAppLaunchParamsDto(int i, String str) {
        this.appId = i;
        this.webviewUrl = str;
    }

    public final int d() {
        return this.appId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreWidgetsBaseAppLaunchParamsDto)) {
            return false;
        }
        ExploreWidgetsBaseAppLaunchParamsDto exploreWidgetsBaseAppLaunchParamsDto = (ExploreWidgetsBaseAppLaunchParamsDto) obj;
        return this.appId == exploreWidgetsBaseAppLaunchParamsDto.appId && epx.f(this.webviewUrl, exploreWidgetsBaseAppLaunchParamsDto.webviewUrl);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.appId) * 31;
        String str = this.webviewUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExploreWidgetsBaseAppLaunchParamsDto(appId=");
        sb.append(this.appId);
        sb.append(", webviewUrl=");
        return ho8.a(sb, this.webviewUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.appId);
        parcel.writeString(this.webviewUrl);
    }

    public /* synthetic */ ExploreWidgetsBaseAppLaunchParamsDto(int i, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
