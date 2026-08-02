package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ClassifiedsProfileInfoLocationDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsProfileInfoLocationDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsProfileInfoLocationDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("latitude")
    private final float latitude;

    @pmi0("longitude")
    private final float longitude;

    /* compiled from: ClassifiedsProfileInfoLocationDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsProfileInfoLocationDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProfileInfoLocationDto createFromParcel(Parcel parcel) {
            return new ClassifiedsProfileInfoLocationDto(parcel.readFloat(), parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProfileInfoLocationDto[] newArray(int i) {
            return new ClassifiedsProfileInfoLocationDto[i];
        }
    }

    public ClassifiedsProfileInfoLocationDto(float f, float f2, String str) {
        this.latitude = f;
        this.longitude = f2;
        this.address = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsProfileInfoLocationDto)) {
            return false;
        }
        ClassifiedsProfileInfoLocationDto classifiedsProfileInfoLocationDto = (ClassifiedsProfileInfoLocationDto) obj;
        return Float.compare(this.latitude, classifiedsProfileInfoLocationDto.latitude) == 0 && Float.compare(this.longitude, classifiedsProfileInfoLocationDto.longitude) == 0 && epx.f(this.address, classifiedsProfileInfoLocationDto.address);
    }

    public final int hashCode() {
        int a2 = b.a(this.longitude, Float.hashCode(this.latitude) * 31, 31);
        String str = this.address;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsProfileInfoLocationDto(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", address=");
        return ho8.a(sb, this.address, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.latitude);
        parcel.writeFloat(this.longitude);
        parcel.writeString(this.address);
    }

    public /* synthetic */ ClassifiedsProfileInfoLocationDto(float f, float f2, String str, int i, zcl zclVar) {
        this(f, f2, (i & 4) != 0 ? null : str);
    }
}
