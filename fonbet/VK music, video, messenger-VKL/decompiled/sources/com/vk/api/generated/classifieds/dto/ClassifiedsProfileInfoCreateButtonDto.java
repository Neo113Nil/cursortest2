package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ClassifiedsProfileInfoCreateButtonDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsProfileInfoCreateButtonDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsProfileInfoCreateButtonDto> CREATOR = new a();

    @pmi0("miniapp_url")
    private final String miniappUrl;

    @pmi0("title")
    private final String title;

    /* compiled from: ClassifiedsProfileInfoCreateButtonDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsProfileInfoCreateButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProfileInfoCreateButtonDto createFromParcel(Parcel parcel) {
            return new ClassifiedsProfileInfoCreateButtonDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProfileInfoCreateButtonDto[] newArray(int i) {
            return new ClassifiedsProfileInfoCreateButtonDto[i];
        }
    }

    public ClassifiedsProfileInfoCreateButtonDto(String str, String str2) {
        this.miniappUrl = str;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsProfileInfoCreateButtonDto)) {
            return false;
        }
        ClassifiedsProfileInfoCreateButtonDto classifiedsProfileInfoCreateButtonDto = (ClassifiedsProfileInfoCreateButtonDto) obj;
        return epx.f(this.miniappUrl, classifiedsProfileInfoCreateButtonDto.miniappUrl) && epx.f(this.title, classifiedsProfileInfoCreateButtonDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.miniappUrl.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsProfileInfoCreateButtonDto(miniappUrl=");
        sb.append(this.miniappUrl);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.miniappUrl);
        parcel.writeString(this.title);
    }
}
