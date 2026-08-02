package com.vk.api.generated.kidsCollection.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: KidsCollectionRestoreAudioResponseDto.kt */
/* loaded from: classes14.dex */
public final class KidsCollectionRestoreAudioResponseDto implements Parcelable {
    public static final Parcelable.Creator<KidsCollectionRestoreAudioResponseDto> CREATOR = new a();

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("result")
    private final int result;

    /* compiled from: KidsCollectionRestoreAudioResponseDto.kt */
    public static final class a implements Parcelable.Creator<KidsCollectionRestoreAudioResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final KidsCollectionRestoreAudioResponseDto createFromParcel(Parcel parcel) {
            return new KidsCollectionRestoreAudioResponseDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(KidsCollectionRestoreAudioResponseDto.class.getClassLoader()), (AudioAudioDto) parcel.readParcelable(KidsCollectionRestoreAudioResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final KidsCollectionRestoreAudioResponseDto[] newArray(int i) {
            return new KidsCollectionRestoreAudioResponseDto[i];
        }
    }

    public KidsCollectionRestoreAudioResponseDto(int i, Integer num, UserId userId, AudioAudioDto audioAudioDto) {
        this.result = i;
        this.audioId = num;
        this.ownerId = userId;
        this.audio = audioAudioDto;
    }

    public final Integer d() {
        return this.audioId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsCollectionRestoreAudioResponseDto)) {
            return false;
        }
        KidsCollectionRestoreAudioResponseDto kidsCollectionRestoreAudioResponseDto = (KidsCollectionRestoreAudioResponseDto) obj;
        return this.result == kidsCollectionRestoreAudioResponseDto.result && epx.f(this.audioId, kidsCollectionRestoreAudioResponseDto.audioId) && epx.f(this.ownerId, kidsCollectionRestoreAudioResponseDto.ownerId) && epx.f(this.audio, kidsCollectionRestoreAudioResponseDto.audio);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.result) * 31;
        Integer num = this.audioId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        AudioAudioDto audioAudioDto = this.audio;
        return hashCode3 + (audioAudioDto != null ? audioAudioDto.hashCode() : 0);
    }

    public final String toString() {
        return "KidsCollectionRestoreAudioResponseDto(result=" + this.result + ", audioId=" + this.audioId + ", ownerId=" + this.ownerId + ", audio=" + this.audio + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.result);
        Integer num = this.audioId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeParcelable(this.audio, i);
    }

    public /* synthetic */ KidsCollectionRestoreAudioResponseDto(int i, Integer num, UserId userId, AudioAudioDto audioAudioDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : userId, (i2 & 8) != 0 ? null : audioAudioDto);
    }
}
