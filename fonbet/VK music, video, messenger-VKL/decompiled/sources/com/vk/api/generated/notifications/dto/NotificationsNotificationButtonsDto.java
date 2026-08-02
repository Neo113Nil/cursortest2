package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NotificationsNotificationButtonsDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationButtonsDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationButtonsDto> CREATOR = new a();

    @pmi0("primary")
    private final NotificationsNotificationButtonsButtonDto primary;

    @pmi0(X3.i.Y)
    private final NotificationsNotificationButtonsButtonDto secondary;

    /* compiled from: NotificationsNotificationButtonsDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationButtonsDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationButtonsDto createFromParcel(Parcel parcel) {
            Parcelable.Creator<NotificationsNotificationButtonsButtonDto> creator = NotificationsNotificationButtonsButtonDto.CREATOR;
            return new NotificationsNotificationButtonsDto(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationButtonsDto[] newArray(int i) {
            return new NotificationsNotificationButtonsDto[i];
        }
    }

    public NotificationsNotificationButtonsDto(NotificationsNotificationButtonsButtonDto notificationsNotificationButtonsButtonDto, NotificationsNotificationButtonsButtonDto notificationsNotificationButtonsButtonDto2) {
        this.primary = notificationsNotificationButtonsButtonDto;
        this.secondary = notificationsNotificationButtonsButtonDto2;
    }

    public final NotificationsNotificationButtonsButtonDto d() {
        return this.primary;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NotificationsNotificationButtonsButtonDto e() {
        return this.secondary;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationButtonsDto)) {
            return false;
        }
        NotificationsNotificationButtonsDto notificationsNotificationButtonsDto = (NotificationsNotificationButtonsDto) obj;
        return epx.f(this.primary, notificationsNotificationButtonsDto.primary) && epx.f(this.secondary, notificationsNotificationButtonsDto.secondary);
    }

    public final int hashCode() {
        int hashCode = this.primary.hashCode() * 31;
        NotificationsNotificationButtonsButtonDto notificationsNotificationButtonsButtonDto = this.secondary;
        return hashCode + (notificationsNotificationButtonsButtonDto == null ? 0 : notificationsNotificationButtonsButtonDto.hashCode());
    }

    public final String toString() {
        return "NotificationsNotificationButtonsDto(primary=" + this.primary + ", secondary=" + this.secondary + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.primary.writeToParcel(parcel, i);
        NotificationsNotificationButtonsButtonDto notificationsNotificationButtonsButtonDto = this.secondary;
        if (notificationsNotificationButtonsButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsNotificationButtonsButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NotificationsNotificationButtonsDto(NotificationsNotificationButtonsButtonDto notificationsNotificationButtonsButtonDto, NotificationsNotificationButtonsButtonDto notificationsNotificationButtonsButtonDto2, int i, zcl zclVar) {
        this(notificationsNotificationButtonsButtonDto, (i & 2) != 0 ? null : notificationsNotificationButtonsButtonDto2);
    }
}
