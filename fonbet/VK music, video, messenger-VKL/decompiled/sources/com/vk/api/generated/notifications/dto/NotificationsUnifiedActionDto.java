package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NotificationsUnifiedActionDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsUnifiedActionDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsUnifiedActionDto> CREATOR = new a();

    @pmi0("confirm")
    private final NotificationsUnifiedActionConfirmDto confirm;

    @pmi0("context")
    private final NotificationsUnifiedActionContextDto context;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    /* compiled from: NotificationsUnifiedActionDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsUnifiedActionDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedActionDto createFromParcel(Parcel parcel) {
            return new NotificationsUnifiedActionDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : NotificationsUnifiedActionContextDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NotificationsUnifiedActionConfirmDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedActionDto[] newArray(int i) {
            return new NotificationsUnifiedActionDto[i];
        }
    }

    public NotificationsUnifiedActionDto(String str, String str2, NotificationsUnifiedActionContextDto notificationsUnifiedActionContextDto, NotificationsUnifiedActionConfirmDto notificationsUnifiedActionConfirmDto) {
        this.type = str;
        this.url = str2;
        this.context = notificationsUnifiedActionContextDto;
        this.confirm = notificationsUnifiedActionConfirmDto;
    }

    public static NotificationsUnifiedActionDto a(NotificationsUnifiedActionDto notificationsUnifiedActionDto) {
        String str = notificationsUnifiedActionDto.type;
        String str2 = notificationsUnifiedActionDto.url;
        NotificationsUnifiedActionConfirmDto notificationsUnifiedActionConfirmDto = notificationsUnifiedActionDto.confirm;
        notificationsUnifiedActionDto.getClass();
        return new NotificationsUnifiedActionDto(str, str2, null, notificationsUnifiedActionConfirmDto);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsUnifiedActionDto)) {
            return false;
        }
        NotificationsUnifiedActionDto notificationsUnifiedActionDto = (NotificationsUnifiedActionDto) obj;
        return epx.f(this.type, notificationsUnifiedActionDto.type) && epx.f(this.url, notificationsUnifiedActionDto.url) && epx.f(this.context, notificationsUnifiedActionDto.context) && epx.f(this.confirm, notificationsUnifiedActionDto.confirm);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NotificationsUnifiedActionContextDto notificationsUnifiedActionContextDto = this.context;
        int hashCode3 = (hashCode2 + (notificationsUnifiedActionContextDto == null ? 0 : notificationsUnifiedActionContextDto.hashCode())) * 31;
        NotificationsUnifiedActionConfirmDto notificationsUnifiedActionConfirmDto = this.confirm;
        return hashCode3 + (notificationsUnifiedActionConfirmDto != null ? notificationsUnifiedActionConfirmDto.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationsUnifiedActionDto(type=" + this.type + ", url=" + this.url + ", context=" + this.context + ", confirm=" + this.confirm + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.url);
        NotificationsUnifiedActionContextDto notificationsUnifiedActionContextDto = this.context;
        if (notificationsUnifiedActionContextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsUnifiedActionContextDto.writeToParcel(parcel, i);
        }
        NotificationsUnifiedActionConfirmDto notificationsUnifiedActionConfirmDto = this.confirm;
        if (notificationsUnifiedActionConfirmDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsUnifiedActionConfirmDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NotificationsUnifiedActionDto(String str, String str2, NotificationsUnifiedActionContextDto notificationsUnifiedActionContextDto, NotificationsUnifiedActionConfirmDto notificationsUnifiedActionConfirmDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : notificationsUnifiedActionContextDto, (i & 8) != 0 ? null : notificationsUnifiedActionConfirmDto);
    }
}
