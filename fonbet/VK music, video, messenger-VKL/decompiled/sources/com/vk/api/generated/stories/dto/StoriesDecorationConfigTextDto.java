package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StoriesDecorationConfigTextDto.kt */
/* loaded from: classes15.dex */
public final class StoriesDecorationConfigTextDto implements Parcelable {
    public static final Parcelable.Creator<StoriesDecorationConfigTextDto> CREATOR = new a();

    @pmi0("color")
    private final String color;

    /* compiled from: StoriesDecorationConfigTextDto.kt */
    public static final class a implements Parcelable.Creator<StoriesDecorationConfigTextDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesDecorationConfigTextDto createFromParcel(Parcel parcel) {
            return new StoriesDecorationConfigTextDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesDecorationConfigTextDto[] newArray(int i) {
            return new StoriesDecorationConfigTextDto[i];
        }
    }

    public StoriesDecorationConfigTextDto(String str) {
        this.color = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoriesDecorationConfigTextDto) && epx.f(this.color, ((StoriesDecorationConfigTextDto) obj).color);
    }

    public final int hashCode() {
        return this.color.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("StoriesDecorationConfigTextDto(color="), this.color, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.color);
    }
}
