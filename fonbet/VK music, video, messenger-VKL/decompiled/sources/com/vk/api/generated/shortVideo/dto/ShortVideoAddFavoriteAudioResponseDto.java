package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoAddFavoriteAudioResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoAddFavoriteAudioResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoAddFavoriteAudioResponseDto> CREATOR = new a();

    @pmi0("added_audio_ids")
    private final List<String> addedAudioIds;

    /* compiled from: ShortVideoAddFavoriteAudioResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoAddFavoriteAudioResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoAddFavoriteAudioResponseDto createFromParcel(Parcel parcel) {
            return new ShortVideoAddFavoriteAudioResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoAddFavoriteAudioResponseDto[] newArray(int i) {
            return new ShortVideoAddFavoriteAudioResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoAddFavoriteAudioResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<String> d() {
        return this.addedAudioIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoAddFavoriteAudioResponseDto) && epx.f(this.addedAudioIds, ((ShortVideoAddFavoriteAudioResponseDto) obj).addedAudioIds);
    }

    public final int hashCode() {
        List<String> list = this.addedAudioIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ShortVideoAddFavoriteAudioResponseDto(addedAudioIds="), this.addedAudioIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.addedAudioIds);
    }

    public ShortVideoAddFavoriteAudioResponseDto(List<String> list) {
        this.addedAudioIds = list;
    }

    public /* synthetic */ ShortVideoAddFavoriteAudioResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
