package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsJoinAndGetResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsJoinAndGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsJoinAndGetResponseDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppDto f64app;

    @pmi0("app_access_token")
    private final String appAccessToken;

    @pmi0("is_joined")
    private final boolean isJoined;

    /* compiled from: AppsJoinAndGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsJoinAndGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsJoinAndGetResponseDto createFromParcel(Parcel parcel) {
            return new AppsJoinAndGetResponseDto(parcel.readInt() != 0, (AppsAppDto) parcel.readParcelable(AppsJoinAndGetResponseDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsJoinAndGetResponseDto[] newArray(int i) {
            return new AppsJoinAndGetResponseDto[i];
        }
    }

    public AppsJoinAndGetResponseDto(boolean z, AppsAppDto appsAppDto, String str) {
        this.isJoined = z;
        this.f64app = appsAppDto;
        this.appAccessToken = str;
    }

    public final AppsAppDto d() {
        return this.f64app;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isJoined;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsJoinAndGetResponseDto)) {
            return false;
        }
        AppsJoinAndGetResponseDto appsJoinAndGetResponseDto = (AppsJoinAndGetResponseDto) obj;
        return this.isJoined == appsJoinAndGetResponseDto.isJoined && epx.f(this.f64app, appsJoinAndGetResponseDto.f64app) && epx.f(this.appAccessToken, appsJoinAndGetResponseDto.appAccessToken);
    }

    public final int hashCode() {
        int hashCode = (this.f64app.hashCode() + (Boolean.hashCode(this.isJoined) * 31)) * 31;
        String str = this.appAccessToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsJoinAndGetResponseDto(isJoined=");
        sb.append(this.isJoined);
        sb.append(", app=");
        sb.append(this.f64app);
        sb.append(", appAccessToken=");
        return ho8.a(sb, this.appAccessToken, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isJoined ? 1 : 0);
        parcel.writeParcelable(this.f64app, i);
        parcel.writeString(this.appAccessToken);
    }

    public /* synthetic */ AppsJoinAndGetResponseDto(boolean z, AppsAppDto appsAppDto, String str, int i, zcl zclVar) {
        this(z, appsAppDto, (i & 4) != 0 ? null : str);
    }
}
