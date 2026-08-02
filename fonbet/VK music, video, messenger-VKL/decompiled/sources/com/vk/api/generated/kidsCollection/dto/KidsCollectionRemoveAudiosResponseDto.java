package com.vk.api.generated.kidsCollection.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: KidsCollectionRemoveAudiosResponseDto.kt */
/* loaded from: classes14.dex */
public final class KidsCollectionRemoveAudiosResponseDto implements Parcelable {
    public static final Parcelable.Creator<KidsCollectionRemoveAudiosResponseDto> CREATOR = new a();

    @pmi0("audio_ids")
    private final List<String> audioIds;

    /* compiled from: KidsCollectionRemoveAudiosResponseDto.kt */
    public static final class a implements Parcelable.Creator<KidsCollectionRemoveAudiosResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final KidsCollectionRemoveAudiosResponseDto createFromParcel(Parcel parcel) {
            return new KidsCollectionRemoveAudiosResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final KidsCollectionRemoveAudiosResponseDto[] newArray(int i) {
            return new KidsCollectionRemoveAudiosResponseDto[i];
        }
    }

    public KidsCollectionRemoveAudiosResponseDto(List<String> list) {
        this.audioIds = list;
    }

    public final List<String> d() {
        return this.audioIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KidsCollectionRemoveAudiosResponseDto) && epx.f(this.audioIds, ((KidsCollectionRemoveAudiosResponseDto) obj).audioIds);
    }

    public final int hashCode() {
        return this.audioIds.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("KidsCollectionRemoveAudiosResponseDto(audioIds="), this.audioIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.audioIds);
    }
}
