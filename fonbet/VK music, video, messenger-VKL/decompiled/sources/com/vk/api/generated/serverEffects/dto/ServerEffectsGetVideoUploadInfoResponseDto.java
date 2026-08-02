package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ServerEffectsGetVideoUploadInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsGetVideoUploadInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsGetVideoUploadInfoResponseDto> CREATOR = new a();

    @pmi0("generated_ov_id")
    private final long generatedOvId;

    @pmi0("original_ov_id")
    private final long originalOvId;

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    /* compiled from: ServerEffectsGetVideoUploadInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsGetVideoUploadInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetVideoUploadInfoResponseDto createFromParcel(Parcel parcel) {
            return new ServerEffectsGetVideoUploadInfoResponseDto(parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetVideoUploadInfoResponseDto[] newArray(int i) {
            return new ServerEffectsGetVideoUploadInfoResponseDto[i];
        }
    }

    public ServerEffectsGetVideoUploadInfoResponseDto(long j, long j2, String str) {
        this.originalOvId = j;
        this.generatedOvId = j2;
        this.uploadUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerEffectsGetVideoUploadInfoResponseDto)) {
            return false;
        }
        ServerEffectsGetVideoUploadInfoResponseDto serverEffectsGetVideoUploadInfoResponseDto = (ServerEffectsGetVideoUploadInfoResponseDto) obj;
        return this.originalOvId == serverEffectsGetVideoUploadInfoResponseDto.originalOvId && this.generatedOvId == serverEffectsGetVideoUploadInfoResponseDto.generatedOvId && epx.f(this.uploadUrl, serverEffectsGetVideoUploadInfoResponseDto.uploadUrl);
    }

    public final int hashCode() {
        return this.uploadUrl.hashCode() + bh10.a(Long.hashCode(this.originalOvId) * 31, 31, this.generatedOvId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerEffectsGetVideoUploadInfoResponseDto(originalOvId=");
        sb.append(this.originalOvId);
        sb.append(", generatedOvId=");
        sb.append(this.generatedOvId);
        sb.append(", uploadUrl=");
        return ho8.a(sb, this.uploadUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.originalOvId);
        parcel.writeLong(this.generatedOvId);
        parcel.writeString(this.uploadUrl);
    }
}
