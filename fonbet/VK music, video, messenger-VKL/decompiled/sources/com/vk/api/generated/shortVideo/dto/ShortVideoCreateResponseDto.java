package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: ShortVideoCreateResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoCreateResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoCreateResponseDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    @pmi0("video_id")
    private final int videoId;

    /* compiled from: ShortVideoCreateResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoCreateResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoCreateResponseDto createFromParcel(Parcel parcel) {
            return new ShortVideoCreateResponseDto((UserId) parcel.readParcelable(ShortVideoCreateResponseDto.class.getClassLoader()), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoCreateResponseDto[] newArray(int i) {
            return new ShortVideoCreateResponseDto[i];
        }
    }

    public ShortVideoCreateResponseDto(UserId userId, int i, String str) {
        this.ownerId = userId;
        this.videoId = i;
        this.uploadUrl = str;
    }

    public final String d() {
        return this.uploadUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.videoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoCreateResponseDto)) {
            return false;
        }
        ShortVideoCreateResponseDto shortVideoCreateResponseDto = (ShortVideoCreateResponseDto) obj;
        return epx.f(this.ownerId, shortVideoCreateResponseDto.ownerId) && this.videoId == shortVideoCreateResponseDto.videoId && epx.f(this.uploadUrl, shortVideoCreateResponseDto.uploadUrl);
    }

    public final int hashCode() {
        return this.uploadUrl.hashCode() + shy.a(this.videoId, Long.hashCode(this.ownerId.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoCreateResponseDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", uploadUrl=");
        return ho8.a(sb, this.uploadUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.videoId);
        parcel.writeString(this.uploadUrl);
    }
}
