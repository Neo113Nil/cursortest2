package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VmojiGetPhotoUploadUrlResponseDto.kt */
/* loaded from: classes15.dex */
public final class VmojiGetPhotoUploadUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<VmojiGetPhotoUploadUrlResponseDto> CREATOR = new a();

    @pmi0("max_height")
    private final Integer maxHeight;

    @pmi0("max_width")
    private final Integer maxWidth;

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    /* compiled from: VmojiGetPhotoUploadUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<VmojiGetPhotoUploadUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiGetPhotoUploadUrlResponseDto createFromParcel(Parcel parcel) {
            return new VmojiGetPhotoUploadUrlResponseDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiGetPhotoUploadUrlResponseDto[] newArray(int i) {
            return new VmojiGetPhotoUploadUrlResponseDto[i];
        }
    }

    public VmojiGetPhotoUploadUrlResponseDto(String str, Integer num, Integer num2) {
        this.uploadUrl = str;
        this.maxWidth = num;
        this.maxHeight = num2;
    }

    public final Integer d() {
        return this.maxHeight;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.maxWidth;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiGetPhotoUploadUrlResponseDto)) {
            return false;
        }
        VmojiGetPhotoUploadUrlResponseDto vmojiGetPhotoUploadUrlResponseDto = (VmojiGetPhotoUploadUrlResponseDto) obj;
        return epx.f(this.uploadUrl, vmojiGetPhotoUploadUrlResponseDto.uploadUrl) && epx.f(this.maxWidth, vmojiGetPhotoUploadUrlResponseDto.maxWidth) && epx.f(this.maxHeight, vmojiGetPhotoUploadUrlResponseDto.maxHeight);
    }

    public final String f() {
        return this.uploadUrl;
    }

    public final int hashCode() {
        int hashCode = this.uploadUrl.hashCode() * 31;
        Integer num = this.maxWidth;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxHeight;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiGetPhotoUploadUrlResponseDto(uploadUrl=");
        sb.append(this.uploadUrl);
        sb.append(", maxWidth=");
        sb.append(this.maxWidth);
        sb.append(", maxHeight=");
        return uqi.b(sb, this.maxHeight, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadUrl);
        Integer num = this.maxWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.maxHeight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ VmojiGetPhotoUploadUrlResponseDto(String str, Integer num, Integer num2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
