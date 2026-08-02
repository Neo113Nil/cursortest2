package com.vk.api.generated.owner.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnerStatePhotosDto.kt */
/* loaded from: classes15.dex */
public final class OwnerStatePhotosDto implements Parcelable {
    public static final Parcelable.Creator<OwnerStatePhotosDto> CREATOR = new a();

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_1440_960")
    private final String photo1440960;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_400")
    private final String photo400;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    /* compiled from: OwnerStatePhotosDto.kt */
    public static final class a implements Parcelable.Creator<OwnerStatePhotosDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnerStatePhotosDto createFromParcel(Parcel parcel) {
            return new OwnerStatePhotosDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnerStatePhotosDto[] newArray(int i) {
            return new OwnerStatePhotosDto[i];
        }
    }

    public OwnerStatePhotosDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final String d() {
        return this.photo100;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.photo200;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerStatePhotosDto)) {
            return false;
        }
        OwnerStatePhotosDto ownerStatePhotosDto = (OwnerStatePhotosDto) obj;
        return epx.f(this.photo1440960, ownerStatePhotosDto.photo1440960) && epx.f(this.photo400, ownerStatePhotosDto.photo400) && epx.f(this.photo200, ownerStatePhotosDto.photo200) && epx.f(this.photo100, ownerStatePhotosDto.photo100) && epx.f(this.photo50, ownerStatePhotosDto.photo50) && epx.f(this.photoBase, ownerStatePhotosDto.photoBase);
    }

    public final String f() {
        return this.photo50;
    }

    public final String g() {
        return this.photoBase;
    }

    public final int hashCode() {
        String str = this.photo1440960;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.photo400;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo200;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo100;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo50;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photoBase;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnerStatePhotosDto(photo1440960=");
        sb.append(this.photo1440960);
        sb.append(", photo400=");
        sb.append(this.photo400);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photoBase=");
        return ho8.a(sb, this.photoBase, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.photo1440960);
        parcel.writeString(this.photo400);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photoBase);
    }

    public OwnerStatePhotosDto(String str, String str2, String str3, String str4, String str5, String str6) {
        this.photo1440960 = str;
        this.photo400 = str2;
        this.photo200 = str3;
        this.photo100 = str4;
        this.photo50 = str5;
        this.photoBase = str6;
    }

    public /* synthetic */ OwnerStatePhotosDto(String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
