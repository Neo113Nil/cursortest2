package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ServerEffectsRenderVideoPreviewResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsRenderVideoPreviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsRenderVideoPreviewResponseDto> CREATOR = new a();

    @pmi0("generated_ov_id")
    private final long generatedOvId;

    /* compiled from: ServerEffectsRenderVideoPreviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsRenderVideoPreviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsRenderVideoPreviewResponseDto createFromParcel(Parcel parcel) {
            return new ServerEffectsRenderVideoPreviewResponseDto(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsRenderVideoPreviewResponseDto[] newArray(int i) {
            return new ServerEffectsRenderVideoPreviewResponseDto[i];
        }
    }

    public ServerEffectsRenderVideoPreviewResponseDto(long j) {
        this.generatedOvId = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServerEffectsRenderVideoPreviewResponseDto) && this.generatedOvId == ((ServerEffectsRenderVideoPreviewResponseDto) obj).generatedOvId;
    }

    public final int hashCode() {
        return Long.hashCode(this.generatedOvId);
    }

    public final String toString() {
        return vu5.a(')', this.generatedOvId, new StringBuilder("ServerEffectsRenderVideoPreviewResponseDto(generatedOvId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.generatedOvId);
    }
}
