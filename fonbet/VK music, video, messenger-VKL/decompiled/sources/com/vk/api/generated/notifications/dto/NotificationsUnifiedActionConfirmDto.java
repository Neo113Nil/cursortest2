package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: NotificationsUnifiedActionConfirmDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsUnifiedActionConfirmDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsUnifiedActionConfirmDto> CREATOR = new a();

    @pmi0("cancel_label")
    private final String cancelLabel;

    @pmi0("ok_label")
    private final String okLabel;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: NotificationsUnifiedActionConfirmDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsUnifiedActionConfirmDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedActionConfirmDto createFromParcel(Parcel parcel) {
            return new NotificationsUnifiedActionConfirmDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedActionConfirmDto[] newArray(int i) {
            return new NotificationsUnifiedActionConfirmDto[i];
        }
    }

    public NotificationsUnifiedActionConfirmDto(String str, String str2, String str3, String str4) {
        this.title = str;
        this.text = str2;
        this.okLabel = str3;
        this.cancelLabel = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsUnifiedActionConfirmDto)) {
            return false;
        }
        NotificationsUnifiedActionConfirmDto notificationsUnifiedActionConfirmDto = (NotificationsUnifiedActionConfirmDto) obj;
        return epx.f(this.title, notificationsUnifiedActionConfirmDto.title) && epx.f(this.text, notificationsUnifiedActionConfirmDto.text) && epx.f(this.okLabel, notificationsUnifiedActionConfirmDto.okLabel) && epx.f(this.cancelLabel, notificationsUnifiedActionConfirmDto.cancelLabel);
    }

    public final int hashCode() {
        return this.cancelLabel.hashCode() + urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.text), 31, this.okLabel);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsUnifiedActionConfirmDto(title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", okLabel=");
        sb.append(this.okLabel);
        sb.append(", cancelLabel=");
        return ho8.a(sb, this.cancelLabel, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.okLabel);
        parcel.writeString(this.cancelLabel);
    }
}
