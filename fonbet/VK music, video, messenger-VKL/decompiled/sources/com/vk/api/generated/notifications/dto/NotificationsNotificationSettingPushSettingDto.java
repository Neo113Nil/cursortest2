package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationsNotificationSettingPushSettingDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationSettingPushSettingDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationsNotificationSettingPushSettingDto[] $VALUES;
    public static final Parcelable.Creator<NotificationsNotificationSettingPushSettingDto> CREATOR;

    @pmi0("no_sound")
    public static final NotificationsNotificationSettingPushSettingDto NO_SOUND;

    @pmi0("off")
    public static final NotificationsNotificationSettingPushSettingDto OFF;

    @pmi0("on")
    public static final NotificationsNotificationSettingPushSettingDto ON;

    @pmi0("unavailable")
    public static final NotificationsNotificationSettingPushSettingDto UNAVAILABLE;
    private final String value;

    /* compiled from: NotificationsNotificationSettingPushSettingDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationSettingPushSettingDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingPushSettingDto createFromParcel(Parcel parcel) {
            return NotificationsNotificationSettingPushSettingDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingPushSettingDto[] newArray(int i) {
            return new NotificationsNotificationSettingPushSettingDto[i];
        }
    }

    static {
        NotificationsNotificationSettingPushSettingDto notificationsNotificationSettingPushSettingDto = new NotificationsNotificationSettingPushSettingDto("ON", 0, "on");
        ON = notificationsNotificationSettingPushSettingDto;
        NotificationsNotificationSettingPushSettingDto notificationsNotificationSettingPushSettingDto2 = new NotificationsNotificationSettingPushSettingDto("NO_SOUND", 1, "no_sound");
        NO_SOUND = notificationsNotificationSettingPushSettingDto2;
        NotificationsNotificationSettingPushSettingDto notificationsNotificationSettingPushSettingDto3 = new NotificationsNotificationSettingPushSettingDto("OFF", 2, "off");
        OFF = notificationsNotificationSettingPushSettingDto3;
        NotificationsNotificationSettingPushSettingDto notificationsNotificationSettingPushSettingDto4 = new NotificationsNotificationSettingPushSettingDto("UNAVAILABLE", 3, "unavailable");
        UNAVAILABLE = notificationsNotificationSettingPushSettingDto4;
        NotificationsNotificationSettingPushSettingDto[] notificationsNotificationSettingPushSettingDtoArr = {notificationsNotificationSettingPushSettingDto, notificationsNotificationSettingPushSettingDto2, notificationsNotificationSettingPushSettingDto3, notificationsNotificationSettingPushSettingDto4};
        $VALUES = notificationsNotificationSettingPushSettingDtoArr;
        $ENTRIES = new asp(notificationsNotificationSettingPushSettingDtoArr);
        CREATOR = new a();
    }

    private NotificationsNotificationSettingPushSettingDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NotificationsNotificationSettingPushSettingDto valueOf(String str) {
        return (NotificationsNotificationSettingPushSettingDto) Enum.valueOf(NotificationsNotificationSettingPushSettingDto.class, str);
    }

    public static NotificationsNotificationSettingPushSettingDto[] values() {
        return (NotificationsNotificationSettingPushSettingDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
