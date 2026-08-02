package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoMytargetSdkStaticDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoMytargetSdkStaticDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoMytargetSdkStaticDto> CREATOR = new a();

    @pmi0("sdk_source")
    private final String sdkSource;

    @pmi0("target_owner_id")
    private final UserId targetOwnerId;

    /* compiled from: ShortVideoMytargetSdkStaticDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoMytargetSdkStaticDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoMytargetSdkStaticDto createFromParcel(Parcel parcel) {
            return new ShortVideoMytargetSdkStaticDto(parcel.readString(), (UserId) parcel.readParcelable(ShortVideoMytargetSdkStaticDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoMytargetSdkStaticDto[] newArray(int i) {
            return new ShortVideoMytargetSdkStaticDto[i];
        }
    }

    public ShortVideoMytargetSdkStaticDto(String str, UserId userId) {
        this.sdkSource = str;
        this.targetOwnerId = userId;
    }

    public final String d() {
        return this.sdkSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UserId e() {
        return this.targetOwnerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoMytargetSdkStaticDto)) {
            return false;
        }
        ShortVideoMytargetSdkStaticDto shortVideoMytargetSdkStaticDto = (ShortVideoMytargetSdkStaticDto) obj;
        return epx.f(this.sdkSource, shortVideoMytargetSdkStaticDto.sdkSource) && epx.f(this.targetOwnerId, shortVideoMytargetSdkStaticDto.targetOwnerId);
    }

    public final int hashCode() {
        int hashCode = this.sdkSource.hashCode() * 31;
        UserId userId = this.targetOwnerId;
        return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoMytargetSdkStaticDto(sdkSource=");
        sb.append(this.sdkSource);
        sb.append(", targetOwnerId=");
        return gp.b(sb, this.targetOwnerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sdkSource);
        parcel.writeParcelable(this.targetOwnerId, i);
    }

    public /* synthetic */ ShortVideoMytargetSdkStaticDto(String str, UserId userId, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : userId);
    }
}
