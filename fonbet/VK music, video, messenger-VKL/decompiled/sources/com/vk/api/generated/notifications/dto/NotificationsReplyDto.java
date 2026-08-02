package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: NotificationsReplyDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsReplyDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsReplyDto> CREATOR = new a();

    @pmi0("date")
    private final Integer date;

    @pmi0("id")
    private final Integer id;

    @pmi0("text")
    private final Integer text;

    /* compiled from: NotificationsReplyDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsReplyDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsReplyDto createFromParcel(Parcel parcel) {
            return new NotificationsReplyDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsReplyDto[] newArray(int i) {
            return new NotificationsReplyDto[i];
        }
    }

    public NotificationsReplyDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsReplyDto)) {
            return false;
        }
        NotificationsReplyDto notificationsReplyDto = (NotificationsReplyDto) obj;
        return epx.f(this.date, notificationsReplyDto.date) && epx.f(this.id, notificationsReplyDto.id) && epx.f(this.text, notificationsReplyDto.text);
    }

    public final int hashCode() {
        Integer num = this.date;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.id;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.text;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsReplyDto(date=");
        sb.append(this.date);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", text=");
        return uqi.b(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.id;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.text;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public NotificationsReplyDto(Integer num, Integer num2, Integer num3) {
        this.date = num;
        this.id = num2;
        this.text = num3;
    }

    public /* synthetic */ NotificationsReplyDto(Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
