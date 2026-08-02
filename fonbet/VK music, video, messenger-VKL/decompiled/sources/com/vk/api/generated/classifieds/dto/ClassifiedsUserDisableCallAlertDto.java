package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: ClassifiedsUserDisableCallAlertDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsUserDisableCallAlertDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsUserDisableCallAlertDto> CREATOR = new a();

    @pmi0("expires_after")
    private final int expiresAfter;

    @pmi0("gmt_offset")
    private final String gmtOffset;

    @pmi0("text")
    private final String text;

    @pmi0("timestamp")
    private final int timestamp;

    @pmi0("title")
    private final String title;

    /* compiled from: ClassifiedsUserDisableCallAlertDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsUserDisableCallAlertDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsUserDisableCallAlertDto createFromParcel(Parcel parcel) {
            return new ClassifiedsUserDisableCallAlertDto(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsUserDisableCallAlertDto[] newArray(int i) {
            return new ClassifiedsUserDisableCallAlertDto[i];
        }
    }

    public ClassifiedsUserDisableCallAlertDto(String str, String str2, int i, String str3, int i2) {
        this.title = str;
        this.text = str2;
        this.timestamp = i;
        this.gmtOffset = str3;
        this.expiresAfter = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsUserDisableCallAlertDto)) {
            return false;
        }
        ClassifiedsUserDisableCallAlertDto classifiedsUserDisableCallAlertDto = (ClassifiedsUserDisableCallAlertDto) obj;
        return epx.f(this.title, classifiedsUserDisableCallAlertDto.title) && epx.f(this.text, classifiedsUserDisableCallAlertDto.text) && this.timestamp == classifiedsUserDisableCallAlertDto.timestamp && epx.f(this.gmtOffset, classifiedsUserDisableCallAlertDto.gmtOffset) && this.expiresAfter == classifiedsUserDisableCallAlertDto.expiresAfter;
    }

    public final int hashCode() {
        return Integer.hashCode(this.expiresAfter) + urd0.a(shy.a(this.timestamp, urd0.a(this.title.hashCode() * 31, 31, this.text), 31), 31, this.gmtOffset);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsUserDisableCallAlertDto(title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", gmtOffset=");
        sb.append(this.gmtOffset);
        sb.append(", expiresAfter=");
        return vu5.b(sb, this.expiresAfter, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeInt(this.timestamp);
        parcel.writeString(this.gmtOffset);
        parcel.writeInt(this.expiresAfter);
    }
}
