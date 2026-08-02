package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto> CREATOR = new a();

    @pmi0("app_id")
    private final int appId;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto[] newArray(int i) {
            return new SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto[i];
        }
    }

    public SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto(int i, String str) {
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
        if (!(obj instanceof SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto)) {
            return false;
        }
        SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto superAppUniversalWidgetActionOpenAppAppLaunchParamsDto = (SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto) obj;
        return this.appId == superAppUniversalWidgetActionOpenAppAppLaunchParamsDto.appId && epx.f(this.webviewUrl, superAppUniversalWidgetActionOpenAppAppLaunchParamsDto.webviewUrl);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.appId) * 31;
        String str = this.webviewUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto(appId=");
        sb.append(this.appId);
        sb.append(", webviewUrl=");
        return ho8.a(sb, this.webviewUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.appId);
        parcel.writeString(this.webviewUrl);
    }

    public /* synthetic */ SuperAppUniversalWidgetActionOpenAppAppLaunchParamsDto(int i, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
