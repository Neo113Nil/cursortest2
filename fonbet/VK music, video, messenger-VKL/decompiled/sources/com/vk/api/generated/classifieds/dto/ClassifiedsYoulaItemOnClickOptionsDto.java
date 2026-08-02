package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.utils.Logger;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ClassifiedsYoulaItemOnClickOptionsDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaItemOnClickOptionsDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaItemOnClickOptionsDto> CREATOR = new a();

    @pmi0(Logger.METHOD_W)
    private final String w;

    /* compiled from: ClassifiedsYoulaItemOnClickOptionsDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaItemOnClickOptionsDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemOnClickOptionsDto createFromParcel(Parcel parcel) {
            return new ClassifiedsYoulaItemOnClickOptionsDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemOnClickOptionsDto[] newArray(int i) {
            return new ClassifiedsYoulaItemOnClickOptionsDto[i];
        }
    }

    public ClassifiedsYoulaItemOnClickOptionsDto(String str) {
        this.w = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClassifiedsYoulaItemOnClickOptionsDto) && epx.f(this.w, ((ClassifiedsYoulaItemOnClickOptionsDto) obj).w);
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ClassifiedsYoulaItemOnClickOptionsDto(w="), this.w, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w);
    }
}
