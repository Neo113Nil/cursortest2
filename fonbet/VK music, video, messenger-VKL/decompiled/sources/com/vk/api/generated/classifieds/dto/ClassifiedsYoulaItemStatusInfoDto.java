package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ClassifiedsYoulaItemStatusInfoDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaItemStatusInfoDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaItemStatusInfoDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("title")
    private final String title;

    /* compiled from: ClassifiedsYoulaItemStatusInfoDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaItemStatusInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemStatusInfoDto createFromParcel(Parcel parcel) {
            return new ClassifiedsYoulaItemStatusInfoDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemStatusInfoDto[] newArray(int i) {
            return new ClassifiedsYoulaItemStatusInfoDto[i];
        }
    }

    public ClassifiedsYoulaItemStatusInfoDto(String str, String str2) {
        this.title = str;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemStatusInfoDto)) {
            return false;
        }
        ClassifiedsYoulaItemStatusInfoDto classifiedsYoulaItemStatusInfoDto = (ClassifiedsYoulaItemStatusInfoDto) obj;
        return epx.f(this.title, classifiedsYoulaItemStatusInfoDto.title) && epx.f(this.description, classifiedsYoulaItemStatusInfoDto.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaItemStatusInfoDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}
