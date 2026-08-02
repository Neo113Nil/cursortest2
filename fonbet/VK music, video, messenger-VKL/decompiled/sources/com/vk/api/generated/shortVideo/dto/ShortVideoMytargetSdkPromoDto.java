package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ShortVideoMytargetSdkPromoDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoMytargetSdkPromoDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoMytargetSdkPromoDto> CREATOR = new a();

    @pmi0("sdk_source")
    private final String sdkSource;

    @pmi0("target_owner_id")
    private final UserId targetOwnerId;

    @pmi0("video")
    private final ShortVideoShortVideoFullDto video;

    /* compiled from: ShortVideoMytargetSdkPromoDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoMytargetSdkPromoDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoMytargetSdkPromoDto createFromParcel(Parcel parcel) {
            return new ShortVideoMytargetSdkPromoDto(ShortVideoShortVideoFullDto.CREATOR.createFromParcel(parcel), parcel.readString(), (UserId) parcel.readParcelable(ShortVideoMytargetSdkPromoDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoMytargetSdkPromoDto[] newArray(int i) {
            return new ShortVideoMytargetSdkPromoDto[i];
        }
    }

    public ShortVideoMytargetSdkPromoDto(ShortVideoShortVideoFullDto shortVideoShortVideoFullDto, String str, UserId userId) {
        this.video = shortVideoShortVideoFullDto;
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

    public final ShortVideoShortVideoFullDto e() {
        return this.video;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoMytargetSdkPromoDto)) {
            return false;
        }
        ShortVideoMytargetSdkPromoDto shortVideoMytargetSdkPromoDto = (ShortVideoMytargetSdkPromoDto) obj;
        return epx.f(this.video, shortVideoMytargetSdkPromoDto.video) && epx.f(this.sdkSource, shortVideoMytargetSdkPromoDto.sdkSource) && epx.f(this.targetOwnerId, shortVideoMytargetSdkPromoDto.targetOwnerId);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.video.hashCode() * 31, 31, this.sdkSource);
        UserId userId = this.targetOwnerId;
        return a2 + (userId == null ? 0 : Long.hashCode(userId.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoMytargetSdkPromoDto(video=");
        sb.append(this.video);
        sb.append(", sdkSource=");
        sb.append(this.sdkSource);
        sb.append(", targetOwnerId=");
        return gp.b(sb, this.targetOwnerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.video.writeToParcel(parcel, i);
        parcel.writeString(this.sdkSource);
        parcel.writeParcelable(this.targetOwnerId, i);
    }

    public /* synthetic */ ShortVideoMytargetSdkPromoDto(ShortVideoShortVideoFullDto shortVideoShortVideoFullDto, String str, UserId userId, int i, zcl zclVar) {
        this(shortVideoShortVideoFullDto, str, (i & 4) != 0 ? null : userId);
    }
}
