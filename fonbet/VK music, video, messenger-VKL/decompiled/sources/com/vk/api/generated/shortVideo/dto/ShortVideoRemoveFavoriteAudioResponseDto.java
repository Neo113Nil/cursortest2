package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoRemoveFavoriteAudioResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoRemoveFavoriteAudioResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoRemoveFavoriteAudioResponseDto> CREATOR = new a();

    @pmi0("removed_audio_ids")
    private final List<String> removedAudioIds;

    /* compiled from: ShortVideoRemoveFavoriteAudioResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoRemoveFavoriteAudioResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoRemoveFavoriteAudioResponseDto createFromParcel(Parcel parcel) {
            return new ShortVideoRemoveFavoriteAudioResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoRemoveFavoriteAudioResponseDto[] newArray(int i) {
            return new ShortVideoRemoveFavoriteAudioResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoRemoveFavoriteAudioResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<String> d() {
        return this.removedAudioIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoRemoveFavoriteAudioResponseDto) && epx.f(this.removedAudioIds, ((ShortVideoRemoveFavoriteAudioResponseDto) obj).removedAudioIds);
    }

    public final int hashCode() {
        List<String> list = this.removedAudioIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ShortVideoRemoveFavoriteAudioResponseDto(removedAudioIds="), this.removedAudioIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.removedAudioIds);
    }

    public ShortVideoRemoveFavoriteAudioResponseDto(List<String> list) {
        this.removedAudioIds = list;
    }

    public /* synthetic */ ShortVideoRemoveFavoriteAudioResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
