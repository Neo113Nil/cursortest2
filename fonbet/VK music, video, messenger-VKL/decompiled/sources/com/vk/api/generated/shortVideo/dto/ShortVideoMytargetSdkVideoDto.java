package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoMytargetSdkVideoDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoMytargetSdkVideoDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoMytargetSdkVideoDto> CREATOR = new a();

    @pmi0("sdk_source")
    private final String sdkSource;

    @pmi0("target_owner_id")
    private final UserId targetOwnerId;

    /* compiled from: ShortVideoMytargetSdkVideoDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoMytargetSdkVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoMytargetSdkVideoDto createFromParcel(Parcel parcel) {
            return new ShortVideoMytargetSdkVideoDto(parcel.readString(), (UserId) parcel.readParcelable(ShortVideoMytargetSdkVideoDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoMytargetSdkVideoDto[] newArray(int i) {
            return new ShortVideoMytargetSdkVideoDto[i];
        }
    }

    public ShortVideoMytargetSdkVideoDto(String str, UserId userId) {
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
        if (!(obj instanceof ShortVideoMytargetSdkVideoDto)) {
            return false;
        }
        ShortVideoMytargetSdkVideoDto shortVideoMytargetSdkVideoDto = (ShortVideoMytargetSdkVideoDto) obj;
        return epx.f(this.sdkSource, shortVideoMytargetSdkVideoDto.sdkSource) && epx.f(this.targetOwnerId, shortVideoMytargetSdkVideoDto.targetOwnerId);
    }

    public final int hashCode() {
        int hashCode = this.sdkSource.hashCode() * 31;
        UserId userId = this.targetOwnerId;
        return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoMytargetSdkVideoDto(sdkSource=");
        sb.append(this.sdkSource);
        sb.append(", targetOwnerId=");
        return gp.b(sb, this.targetOwnerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sdkSource);
        parcel.writeParcelable(this.targetOwnerId, i);
    }

    public /* synthetic */ ShortVideoMytargetSdkVideoDto(String str, UserId userId, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : userId);
    }
}
