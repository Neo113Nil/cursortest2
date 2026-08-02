package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoMytargetSdkAdDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoMytargetSdkAdDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoMytargetSdkAdDto> CREATOR = new a();

    @pmi0("sdk_source")
    private final String sdkSource;

    @pmi0("target_owner_id")
    private final UserId targetOwnerId;

    /* compiled from: ShortVideoMytargetSdkAdDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoMytargetSdkAdDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoMytargetSdkAdDto createFromParcel(Parcel parcel) {
            return new ShortVideoMytargetSdkAdDto(parcel.readString(), (UserId) parcel.readParcelable(ShortVideoMytargetSdkAdDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoMytargetSdkAdDto[] newArray(int i) {
            return new ShortVideoMytargetSdkAdDto[i];
        }
    }

    public ShortVideoMytargetSdkAdDto(String str, UserId userId) {
        this.sdkSource = str;
        this.targetOwnerId = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoMytargetSdkAdDto)) {
            return false;
        }
        ShortVideoMytargetSdkAdDto shortVideoMytargetSdkAdDto = (ShortVideoMytargetSdkAdDto) obj;
        return epx.f(this.sdkSource, shortVideoMytargetSdkAdDto.sdkSource) && epx.f(this.targetOwnerId, shortVideoMytargetSdkAdDto.targetOwnerId);
    }

    public final int hashCode() {
        int hashCode = this.sdkSource.hashCode() * 31;
        UserId userId = this.targetOwnerId;
        return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoMytargetSdkAdDto(sdkSource=");
        sb.append(this.sdkSource);
        sb.append(", targetOwnerId=");
        return gp.b(sb, this.targetOwnerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sdkSource);
        parcel.writeParcelable(this.targetOwnerId, i);
    }

    public /* synthetic */ ShortVideoMytargetSdkAdDto(String str, UserId userId, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : userId);
    }
}
