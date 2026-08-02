package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ClassifiedsYoulaItemAttributeDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaItemAttributeDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaItemAttributeDto> CREATOR = new a();

    @pmi0("slug")
    private final String slug;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    @pmi0("value")
    private final String value;

    /* compiled from: ClassifiedsYoulaItemAttributeDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaItemAttributeDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemAttributeDto createFromParcel(Parcel parcel) {
            return new ClassifiedsYoulaItemAttributeDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemAttributeDto[] newArray(int i) {
            return new ClassifiedsYoulaItemAttributeDto[i];
        }
    }

    public ClassifiedsYoulaItemAttributeDto(String str, String str2, String str3, String str4) {
        this.title = str;
        this.slug = str2;
        this.type = str3;
        this.value = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemAttributeDto)) {
            return false;
        }
        ClassifiedsYoulaItemAttributeDto classifiedsYoulaItemAttributeDto = (ClassifiedsYoulaItemAttributeDto) obj;
        return epx.f(this.title, classifiedsYoulaItemAttributeDto.title) && epx.f(this.slug, classifiedsYoulaItemAttributeDto.slug) && epx.f(this.type, classifiedsYoulaItemAttributeDto.type) && epx.f(this.value, classifiedsYoulaItemAttributeDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.slug), 31, this.type);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaItemAttributeDto(title=");
        sb.append(this.title);
        sb.append(", slug=");
        sb.append(this.slug);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.slug);
        parcel.writeString(this.type);
        parcel.writeString(this.value);
    }
}
