package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NotificationsNotificationSettingRedesignDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationSettingRedesignDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationSettingRedesignDto> CREATOR = new a();

    @pmi0("hint")
    private final NotificationsNotificationSettingHintDto hint;

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final String id;

    @pmi0("push_setting")
    private final NotificationsNotificationSettingPushSettingDto pushSetting;

    @pmi0("status")
    private final NotificationsNotificationSettingStatusDto status;

    @pmi0("title")
    private final String title;

    @pmi0("what_to_send")
    private final NotificationsNotificationSettingOptionsDto whatToSend;

    @pmi0("what_to_show")
    private final NotificationsNotificationSettingOptionsDto whatToShow;

    /* compiled from: NotificationsNotificationSettingRedesignDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationSettingRedesignDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingRedesignDto createFromParcel(Parcel parcel) {
            return new NotificationsNotificationSettingRedesignDto(parcel.readString(), parcel.readString(), parcel.readString(), (NotificationsNotificationSettingStatusDto) parcel.readParcelable(NotificationsNotificationSettingRedesignDto.class.getClassLoader()), parcel.readInt() == 0 ? null : NotificationsNotificationSettingHintDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NotificationsNotificationSettingOptionsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NotificationsNotificationSettingOptionsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NotificationsNotificationSettingPushSettingDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingRedesignDto[] newArray(int i) {
            return new NotificationsNotificationSettingRedesignDto[i];
        }
    }

    public NotificationsNotificationSettingRedesignDto(String str, String str2, String str3, NotificationsNotificationSettingStatusDto notificationsNotificationSettingStatusDto, NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto, NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto, NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto2, NotificationsNotificationSettingPushSettingDto notificationsNotificationSettingPushSettingDto) {
        this.id = str;
        this.title = str2;
        this.icon = str3;
        this.status = notificationsNotificationSettingStatusDto;
        this.hint = notificationsNotificationSettingHintDto;
        this.whatToSend = notificationsNotificationSettingOptionsDto;
        this.whatToShow = notificationsNotificationSettingOptionsDto2;
        this.pushSetting = notificationsNotificationSettingPushSettingDto;
    }

    public static NotificationsNotificationSettingRedesignDto a(NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto, NotificationsNotificationSettingStatusDto notificationsNotificationSettingStatusDto, NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto, NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto, int i) {
        String str = notificationsNotificationSettingRedesignDto.id;
        String str2 = notificationsNotificationSettingRedesignDto.title;
        String str3 = notificationsNotificationSettingRedesignDto.icon;
        if ((i & 8) != 0) {
            notificationsNotificationSettingStatusDto = notificationsNotificationSettingRedesignDto.status;
        }
        NotificationsNotificationSettingStatusDto notificationsNotificationSettingStatusDto2 = notificationsNotificationSettingStatusDto;
        if ((i & 16) != 0) {
            notificationsNotificationSettingHintDto = notificationsNotificationSettingRedesignDto.hint;
        }
        NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto2 = notificationsNotificationSettingHintDto;
        NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto2 = notificationsNotificationSettingRedesignDto.whatToSend;
        if ((i & 64) != 0) {
            notificationsNotificationSettingOptionsDto = notificationsNotificationSettingRedesignDto.whatToShow;
        }
        NotificationsNotificationSettingPushSettingDto notificationsNotificationSettingPushSettingDto = notificationsNotificationSettingRedesignDto.pushSetting;
        notificationsNotificationSettingRedesignDto.getClass();
        return new NotificationsNotificationSettingRedesignDto(str, str2, str3, notificationsNotificationSettingStatusDto2, notificationsNotificationSettingHintDto2, notificationsNotificationSettingOptionsDto2, notificationsNotificationSettingOptionsDto, notificationsNotificationSettingPushSettingDto);
    }

    public final NotificationsNotificationSettingHintDto d() {
        return this.hint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationSettingRedesignDto)) {
            return false;
        }
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = (NotificationsNotificationSettingRedesignDto) obj;
        return epx.f(this.id, notificationsNotificationSettingRedesignDto.id) && epx.f(this.title, notificationsNotificationSettingRedesignDto.title) && epx.f(this.icon, notificationsNotificationSettingRedesignDto.icon) && epx.f(this.status, notificationsNotificationSettingRedesignDto.status) && epx.f(this.hint, notificationsNotificationSettingRedesignDto.hint) && epx.f(this.whatToSend, notificationsNotificationSettingRedesignDto.whatToSend) && epx.f(this.whatToShow, notificationsNotificationSettingRedesignDto.whatToShow) && this.pushSetting == notificationsNotificationSettingRedesignDto.pushSetting;
    }

    public final NotificationsNotificationSettingPushSettingDto f() {
        return this.pushSetting;
    }

    public final NotificationsNotificationSettingStatusDto g() {
        return this.status;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.status.hashCode() + urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.icon)) * 31;
        NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto = this.hint;
        int hashCode2 = (hashCode + (notificationsNotificationSettingHintDto == null ? 0 : notificationsNotificationSettingHintDto.hashCode())) * 31;
        NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto = this.whatToSend;
        int hashCode3 = (hashCode2 + (notificationsNotificationSettingOptionsDto == null ? 0 : notificationsNotificationSettingOptionsDto.hashCode())) * 31;
        NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto2 = this.whatToShow;
        int hashCode4 = (hashCode3 + (notificationsNotificationSettingOptionsDto2 == null ? 0 : notificationsNotificationSettingOptionsDto2.hashCode())) * 31;
        NotificationsNotificationSettingPushSettingDto notificationsNotificationSettingPushSettingDto = this.pushSetting;
        return hashCode4 + (notificationsNotificationSettingPushSettingDto != null ? notificationsNotificationSettingPushSettingDto.hashCode() : 0);
    }

    public final NotificationsNotificationSettingOptionsDto i() {
        return this.whatToSend;
    }

    public final NotificationsNotificationSettingOptionsDto j() {
        return this.whatToShow;
    }

    public final String toString() {
        return "NotificationsNotificationSettingRedesignDto(id=" + this.id + ", title=" + this.title + ", icon=" + this.icon + ", status=" + this.status + ", hint=" + this.hint + ", whatToSend=" + this.whatToSend + ", whatToShow=" + this.whatToShow + ", pushSetting=" + this.pushSetting + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.icon);
        parcel.writeParcelable(this.status, i);
        NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto = this.hint;
        if (notificationsNotificationSettingHintDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsNotificationSettingHintDto.writeToParcel(parcel, i);
        }
        NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto = this.whatToSend;
        if (notificationsNotificationSettingOptionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsNotificationSettingOptionsDto.writeToParcel(parcel, i);
        }
        NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto2 = this.whatToShow;
        if (notificationsNotificationSettingOptionsDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsNotificationSettingOptionsDto2.writeToParcel(parcel, i);
        }
        NotificationsNotificationSettingPushSettingDto notificationsNotificationSettingPushSettingDto = this.pushSetting;
        if (notificationsNotificationSettingPushSettingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsNotificationSettingPushSettingDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NotificationsNotificationSettingRedesignDto(String str, String str2, String str3, NotificationsNotificationSettingStatusDto notificationsNotificationSettingStatusDto, NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto, NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto, NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto2, NotificationsNotificationSettingPushSettingDto notificationsNotificationSettingPushSettingDto, int i, zcl zclVar) {
        this(str, str2, str3, notificationsNotificationSettingStatusDto, (i & 16) != 0 ? null : notificationsNotificationSettingHintDto, (i & 32) != 0 ? null : notificationsNotificationSettingOptionsDto, (i & 64) != 0 ? null : notificationsNotificationSettingOptionsDto2, (i & 128) != 0 ? null : notificationsNotificationSettingPushSettingDto);
    }
}
