package com.vk.api.generated.kidsCollection.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: KidsCollectionAddAudioResponseDto.kt */
/* loaded from: classes14.dex */
public final class KidsCollectionAddAudioResponseDto implements Parcelable {
    public static final Parcelable.Creator<KidsCollectionAddAudioResponseDto> CREATOR = new a();

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("result")
    private final int result;

    /* compiled from: KidsCollectionAddAudioResponseDto.kt */
    public static final class a implements Parcelable.Creator<KidsCollectionAddAudioResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final KidsCollectionAddAudioResponseDto createFromParcel(Parcel parcel) {
            return new KidsCollectionAddAudioResponseDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(KidsCollectionAddAudioResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final KidsCollectionAddAudioResponseDto[] newArray(int i) {
            return new KidsCollectionAddAudioResponseDto[i];
        }
    }

    public KidsCollectionAddAudioResponseDto(int i, Integer num, UserId userId) {
        this.result = i;
        this.audioId = num;
        this.ownerId = userId;
    }

    public final Integer d() {
        return this.audioId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsCollectionAddAudioResponseDto)) {
            return false;
        }
        KidsCollectionAddAudioResponseDto kidsCollectionAddAudioResponseDto = (KidsCollectionAddAudioResponseDto) obj;
        return this.result == kidsCollectionAddAudioResponseDto.result && epx.f(this.audioId, kidsCollectionAddAudioResponseDto.audioId) && epx.f(this.ownerId, kidsCollectionAddAudioResponseDto.ownerId);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.result) * 31;
        Integer num = this.audioId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        UserId userId = this.ownerId;
        return hashCode2 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KidsCollectionAddAudioResponseDto(result=");
        sb.append(this.result);
        sb.append(", audioId=");
        sb.append(this.audioId);
        sb.append(", ownerId=");
        return gp.b(sb, this.ownerId, ')');
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
    }

    public /* synthetic */ KidsCollectionAddAudioResponseDto(int i, Integer num, UserId userId, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : userId);
    }
}
