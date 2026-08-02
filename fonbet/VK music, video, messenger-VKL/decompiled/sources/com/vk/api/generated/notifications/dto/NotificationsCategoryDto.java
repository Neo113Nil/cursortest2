package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: NotificationsCategoryDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsCategoryDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsCategoryDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("title")
    private final String title;

    /* compiled from: NotificationsCategoryDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsCategoryDto createFromParcel(Parcel parcel) {
            return new NotificationsCategoryDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsCategoryDto[] newArray(int i) {
            return new NotificationsCategoryDto[i];
        }
    }

    public NotificationsCategoryDto(String str, String str2) {
        this.name = str;
        this.title = str2;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsCategoryDto)) {
            return false;
        }
        NotificationsCategoryDto notificationsCategoryDto = (NotificationsCategoryDto) obj;
        return epx.f(this.name, notificationsCategoryDto.name) && epx.f(this.title, notificationsCategoryDto.title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsCategoryDto(name=");
        sb.append(this.name);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.title);
    }
}
