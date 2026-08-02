package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: ClassifiedsYoulaCityDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaCityDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaCityDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("latitude")
    private final String latitude;

    @pmi0("longitude")
    private final String longitude;

    @pmi0("name")
    private final String name;

    @pmi0("vk_id")
    private final int vkId;

    /* compiled from: ClassifiedsYoulaCityDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaCityDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaCityDto createFromParcel(Parcel parcel) {
            return new ClassifiedsYoulaCityDto(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaCityDto[] newArray(int i) {
            return new ClassifiedsYoulaCityDto[i];
        }
    }

    public ClassifiedsYoulaCityDto(String str, int i, String str2, String str3, String str4) {
        this.id = str;
        this.vkId = i;
        this.name = str2;
        this.latitude = str3;
        this.longitude = str4;
    }

    public final String d() {
        return this.latitude;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.longitude;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaCityDto)) {
            return false;
        }
        ClassifiedsYoulaCityDto classifiedsYoulaCityDto = (ClassifiedsYoulaCityDto) obj;
        return epx.f(this.id, classifiedsYoulaCityDto.id) && this.vkId == classifiedsYoulaCityDto.vkId && epx.f(this.name, classifiedsYoulaCityDto.name) && epx.f(this.latitude, classifiedsYoulaCityDto.latitude) && epx.f(this.longitude, classifiedsYoulaCityDto.longitude);
    }

    public final String f() {
        return this.name;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.longitude.hashCode() + urd0.a(urd0.a(shy.a(this.vkId, this.id.hashCode() * 31, 31), 31, this.name), 31, this.latitude);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaCityDto(id=");
        sb.append(this.id);
        sb.append(", vkId=");
        sb.append(this.vkId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        return ho8.a(sb, this.longitude, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.vkId);
        parcel.writeString(this.name);
        parcel.writeString(this.latitude);
        parcel.writeString(this.longitude);
    }
}
