package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ClassifiedsProfileInfoSimpleButtonDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsProfileInfoSimpleButtonDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsProfileInfoSimpleButtonDto> CREATOR = new a();

    @pmi0("badge")
    private final String badge;

    @pmi0("show_notification_dot")
    private final Boolean showNotificationDot;

    @pmi0("url")
    private final String url;

    /* compiled from: ClassifiedsProfileInfoSimpleButtonDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsProfileInfoSimpleButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProfileInfoSimpleButtonDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ClassifiedsProfileInfoSimpleButtonDto(readString, readString2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsProfileInfoSimpleButtonDto[] newArray(int i) {
            return new ClassifiedsProfileInfoSimpleButtonDto[i];
        }
    }

    public ClassifiedsProfileInfoSimpleButtonDto(String str, String str2, Boolean bool) {
        this.url = str;
        this.badge = str2;
        this.showNotificationDot = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsProfileInfoSimpleButtonDto)) {
            return false;
        }
        ClassifiedsProfileInfoSimpleButtonDto classifiedsProfileInfoSimpleButtonDto = (ClassifiedsProfileInfoSimpleButtonDto) obj;
        return epx.f(this.url, classifiedsProfileInfoSimpleButtonDto.url) && epx.f(this.badge, classifiedsProfileInfoSimpleButtonDto.badge) && epx.f(this.showNotificationDot, classifiedsProfileInfoSimpleButtonDto.showNotificationDot);
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.badge;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.showNotificationDot;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsProfileInfoSimpleButtonDto(url=");
        sb.append(this.url);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", showNotificationDot=");
        return tn.a(sb, this.showNotificationDot, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.badge);
        Boolean bool = this.showNotificationDot;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ ClassifiedsProfileInfoSimpleButtonDto(String str, String str2, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }
}
