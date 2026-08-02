package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: NotificationsUnifiedImageObjectDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsUnifiedImageObjectDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsUnifiedImageObjectDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("is_avatar")
    private final Integer isAvatar;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: NotificationsUnifiedImageObjectDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsUnifiedImageObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedImageObjectDto createFromParcel(Parcel parcel) {
            return new NotificationsUnifiedImageObjectDto(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedImageObjectDto[] newArray(int i) {
            return new NotificationsUnifiedImageObjectDto[i];
        }
    }

    public NotificationsUnifiedImageObjectDto(String str, int i, int i2, Integer num) {
        this.url = str;
        this.width = i;
        this.height = i2;
        this.isAvatar = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsUnifiedImageObjectDto)) {
            return false;
        }
        NotificationsUnifiedImageObjectDto notificationsUnifiedImageObjectDto = (NotificationsUnifiedImageObjectDto) obj;
        return epx.f(this.url, notificationsUnifiedImageObjectDto.url) && this.width == notificationsUnifiedImageObjectDto.width && this.height == notificationsUnifiedImageObjectDto.height && epx.f(this.isAvatar, notificationsUnifiedImageObjectDto.isAvatar);
    }

    public final int hashCode() {
        int a2 = shy.a(this.height, shy.a(this.width, this.url.hashCode() * 31, 31), 31);
        Integer num = this.isAvatar;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsUnifiedImageObjectDto(url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", isAvatar=");
        return uqi.b(sb, this.isAvatar, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        Integer num = this.isAvatar;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ NotificationsUnifiedImageObjectDto(String str, int i, int i2, Integer num, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : num);
    }
}
