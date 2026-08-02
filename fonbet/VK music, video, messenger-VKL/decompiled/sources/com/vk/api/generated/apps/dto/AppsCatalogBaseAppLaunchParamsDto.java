package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsCatalogBaseAppLaunchParamsDto.kt */
/* loaded from: classes14.dex */
public final class AppsCatalogBaseAppLaunchParamsDto implements Parcelable {
    public static final Parcelable.Creator<AppsCatalogBaseAppLaunchParamsDto> CREATOR = new a();

    @pmi0("app_id")
    private final int appId;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: AppsCatalogBaseAppLaunchParamsDto.kt */
    public static final class a implements Parcelable.Creator<AppsCatalogBaseAppLaunchParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCatalogBaseAppLaunchParamsDto createFromParcel(Parcel parcel) {
            return new AppsCatalogBaseAppLaunchParamsDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCatalogBaseAppLaunchParamsDto[] newArray(int i) {
            return new AppsCatalogBaseAppLaunchParamsDto[i];
        }
    }

    public AppsCatalogBaseAppLaunchParamsDto(int i, String str) {
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

    public final String e() {
        return this.webviewUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCatalogBaseAppLaunchParamsDto)) {
            return false;
        }
        AppsCatalogBaseAppLaunchParamsDto appsCatalogBaseAppLaunchParamsDto = (AppsCatalogBaseAppLaunchParamsDto) obj;
        return this.appId == appsCatalogBaseAppLaunchParamsDto.appId && epx.f(this.webviewUrl, appsCatalogBaseAppLaunchParamsDto.webviewUrl);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.appId) * 31;
        String str = this.webviewUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsCatalogBaseAppLaunchParamsDto(appId=");
        sb.append(this.appId);
        sb.append(", webviewUrl=");
        return ho8.a(sb, this.webviewUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.appId);
        parcel.writeString(this.webviewUrl);
    }

    public /* synthetic */ AppsCatalogBaseAppLaunchParamsDto(int i, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
