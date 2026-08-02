package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesDecorationConfigDto.kt */
/* loaded from: classes15.dex */
public final class StoriesDecorationConfigDto implements Parcelable {
    public static final Parcelable.Creator<StoriesDecorationConfigDto> CREATOR = new a();

    @pmi0("border")
    private final StoriesDecorationConfigBorderDto border;

    @pmi0("text")
    private final StoriesDecorationConfigTextDto text;

    /* compiled from: StoriesDecorationConfigDto.kt */
    public static final class a implements Parcelable.Creator<StoriesDecorationConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesDecorationConfigDto createFromParcel(Parcel parcel) {
            return new StoriesDecorationConfigDto(parcel.readInt() == 0 ? null : StoriesDecorationConfigBorderDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StoriesDecorationConfigTextDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesDecorationConfigDto[] newArray(int i) {
            return new StoriesDecorationConfigDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoriesDecorationConfigDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final StoriesDecorationConfigBorderDto d() {
        return this.border;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesDecorationConfigDto)) {
            return false;
        }
        StoriesDecorationConfigDto storiesDecorationConfigDto = (StoriesDecorationConfigDto) obj;
        return epx.f(this.border, storiesDecorationConfigDto.border) && epx.f(this.text, storiesDecorationConfigDto.text);
    }

    public final int hashCode() {
        StoriesDecorationConfigBorderDto storiesDecorationConfigBorderDto = this.border;
        int hashCode = (storiesDecorationConfigBorderDto == null ? 0 : storiesDecorationConfigBorderDto.hashCode()) * 31;
        StoriesDecorationConfigTextDto storiesDecorationConfigTextDto = this.text;
        return hashCode + (storiesDecorationConfigTextDto != null ? storiesDecorationConfigTextDto.hashCode() : 0);
    }

    public final String toString() {
        return "StoriesDecorationConfigDto(border=" + this.border + ", text=" + this.text + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StoriesDecorationConfigBorderDto storiesDecorationConfigBorderDto = this.border;
        if (storiesDecorationConfigBorderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesDecorationConfigBorderDto.writeToParcel(parcel, i);
        }
        StoriesDecorationConfigTextDto storiesDecorationConfigTextDto = this.text;
        if (storiesDecorationConfigTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesDecorationConfigTextDto.writeToParcel(parcel, i);
        }
    }

    public StoriesDecorationConfigDto(StoriesDecorationConfigBorderDto storiesDecorationConfigBorderDto, StoriesDecorationConfigTextDto storiesDecorationConfigTextDto) {
        this.border = storiesDecorationConfigBorderDto;
        this.text = storiesDecorationConfigTextDto;
    }

    public /* synthetic */ StoriesDecorationConfigDto(StoriesDecorationConfigBorderDto storiesDecorationConfigBorderDto, StoriesDecorationConfigTextDto storiesDecorationConfigTextDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : storiesDecorationConfigBorderDto, (i & 2) != 0 ? null : storiesDecorationConfigTextDto);
    }
}
