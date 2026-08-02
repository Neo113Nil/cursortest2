package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ClassifiedsYoulaCarouselBlockGroupDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaCarouselBlockGroupDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaCarouselBlockGroupDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("name")
    private final String name;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("url")
    private final String url;

    /* compiled from: ClassifiedsYoulaCarouselBlockGroupDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaCarouselBlockGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaCarouselBlockGroupDto createFromParcel(Parcel parcel) {
            return new ClassifiedsYoulaCarouselBlockGroupDto((UserId) parcel.readParcelable(ClassifiedsYoulaCarouselBlockGroupDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaCarouselBlockGroupDto[] newArray(int i) {
            return new ClassifiedsYoulaCarouselBlockGroupDto[i];
        }
    }

    public ClassifiedsYoulaCarouselBlockGroupDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = userId;
        this.name = str;
        this.photo50 = str2;
        this.photo100 = str3;
        this.photo200 = str4;
        this.photoBase = str5;
        this.url = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaCarouselBlockGroupDto)) {
            return false;
        }
        ClassifiedsYoulaCarouselBlockGroupDto classifiedsYoulaCarouselBlockGroupDto = (ClassifiedsYoulaCarouselBlockGroupDto) obj;
        return epx.f(this.id, classifiedsYoulaCarouselBlockGroupDto.id) && epx.f(this.name, classifiedsYoulaCarouselBlockGroupDto.name) && epx.f(this.photo50, classifiedsYoulaCarouselBlockGroupDto.photo50) && epx.f(this.photo100, classifiedsYoulaCarouselBlockGroupDto.photo100) && epx.f(this.photo200, classifiedsYoulaCarouselBlockGroupDto.photo200) && epx.f(this.photoBase, classifiedsYoulaCarouselBlockGroupDto.photoBase) && epx.f(this.url, classifiedsYoulaCarouselBlockGroupDto.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(Long.hashCode(this.id.b) * 31, 31, this.name), 31, this.photo50), 31, this.photo100), 31, this.photo200), 31, this.photoBase);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaCarouselBlockGroupDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.name);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.url);
    }
}
