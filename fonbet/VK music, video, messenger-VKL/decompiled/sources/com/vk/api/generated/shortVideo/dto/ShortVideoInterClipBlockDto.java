package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoInterClipBlockDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoInterClipBlockDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoInterClipBlockDto> CREATOR = new a();

    @pmi0("audio_templates")
    private final ShortVideoInterClipBlockAudioTemplatesDto audioTemplates;

    @pmi0("popular_authors")
    private final ShortVideoInterClipBlockPopularAuthorsDto popularAuthors;

    @pmi0("type")
    private final ShortVideoInterClipBlockTypeDto type;

    /* compiled from: ShortVideoInterClipBlockDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoInterClipBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoInterClipBlockDto createFromParcel(Parcel parcel) {
            return new ShortVideoInterClipBlockDto(ShortVideoInterClipBlockTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ShortVideoInterClipBlockAudioTemplatesDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ShortVideoInterClipBlockPopularAuthorsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoInterClipBlockDto[] newArray(int i) {
            return new ShortVideoInterClipBlockDto[i];
        }
    }

    public ShortVideoInterClipBlockDto(ShortVideoInterClipBlockTypeDto shortVideoInterClipBlockTypeDto, ShortVideoInterClipBlockAudioTemplatesDto shortVideoInterClipBlockAudioTemplatesDto, ShortVideoInterClipBlockPopularAuthorsDto shortVideoInterClipBlockPopularAuthorsDto) {
        this.type = shortVideoInterClipBlockTypeDto;
        this.audioTemplates = shortVideoInterClipBlockAudioTemplatesDto;
        this.popularAuthors = shortVideoInterClipBlockPopularAuthorsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoInterClipBlockDto)) {
            return false;
        }
        ShortVideoInterClipBlockDto shortVideoInterClipBlockDto = (ShortVideoInterClipBlockDto) obj;
        return this.type == shortVideoInterClipBlockDto.type && epx.f(this.audioTemplates, shortVideoInterClipBlockDto.audioTemplates) && epx.f(this.popularAuthors, shortVideoInterClipBlockDto.popularAuthors);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        ShortVideoInterClipBlockAudioTemplatesDto shortVideoInterClipBlockAudioTemplatesDto = this.audioTemplates;
        int hashCode2 = (hashCode + (shortVideoInterClipBlockAudioTemplatesDto == null ? 0 : shortVideoInterClipBlockAudioTemplatesDto.hashCode())) * 31;
        ShortVideoInterClipBlockPopularAuthorsDto shortVideoInterClipBlockPopularAuthorsDto = this.popularAuthors;
        return hashCode2 + (shortVideoInterClipBlockPopularAuthorsDto != null ? shortVideoInterClipBlockPopularAuthorsDto.hashCode() : 0);
    }

    public final String toString() {
        return "ShortVideoInterClipBlockDto(type=" + this.type + ", audioTemplates=" + this.audioTemplates + ", popularAuthors=" + this.popularAuthors + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        ShortVideoInterClipBlockAudioTemplatesDto shortVideoInterClipBlockAudioTemplatesDto = this.audioTemplates;
        if (shortVideoInterClipBlockAudioTemplatesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoInterClipBlockAudioTemplatesDto.writeToParcel(parcel, i);
        }
        ShortVideoInterClipBlockPopularAuthorsDto shortVideoInterClipBlockPopularAuthorsDto = this.popularAuthors;
        if (shortVideoInterClipBlockPopularAuthorsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoInterClipBlockPopularAuthorsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ShortVideoInterClipBlockDto(ShortVideoInterClipBlockTypeDto shortVideoInterClipBlockTypeDto, ShortVideoInterClipBlockAudioTemplatesDto shortVideoInterClipBlockAudioTemplatesDto, ShortVideoInterClipBlockPopularAuthorsDto shortVideoInterClipBlockPopularAuthorsDto, int i, zcl zclVar) {
        this(shortVideoInterClipBlockTypeDto, (i & 2) != 0 ? null : shortVideoInterClipBlockAudioTemplatesDto, (i & 4) != 0 ? null : shortVideoInterClipBlockPopularAuthorsDto);
    }
}
