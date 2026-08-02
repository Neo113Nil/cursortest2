package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationsEditRedesignPushSettingValueDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsEditRedesignPushSettingValueDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationsEditRedesignPushSettingValueDto[] $VALUES;
    public static final Parcelable.Creator<NotificationsEditRedesignPushSettingValueDto> CREATOR;

    @pmi0("no_sound")
    public static final NotificationsEditRedesignPushSettingValueDto NO_SOUND;

    @pmi0("off")
    public static final NotificationsEditRedesignPushSettingValueDto OFF;

    @pmi0("on")
    public static final NotificationsEditRedesignPushSettingValueDto ON;
    private final String value;

    /* compiled from: NotificationsEditRedesignPushSettingValueDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsEditRedesignPushSettingValueDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsEditRedesignPushSettingValueDto createFromParcel(Parcel parcel) {
            return NotificationsEditRedesignPushSettingValueDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsEditRedesignPushSettingValueDto[] newArray(int i) {
            return new NotificationsEditRedesignPushSettingValueDto[i];
        }
    }

    static {
        NotificationsEditRedesignPushSettingValueDto notificationsEditRedesignPushSettingValueDto = new NotificationsEditRedesignPushSettingValueDto("NO_SOUND", 0, "no_sound");
        NO_SOUND = notificationsEditRedesignPushSettingValueDto;
        NotificationsEditRedesignPushSettingValueDto notificationsEditRedesignPushSettingValueDto2 = new NotificationsEditRedesignPushSettingValueDto("OFF", 1, "off");
        OFF = notificationsEditRedesignPushSettingValueDto2;
        NotificationsEditRedesignPushSettingValueDto notificationsEditRedesignPushSettingValueDto3 = new NotificationsEditRedesignPushSettingValueDto("ON", 2, "on");
        ON = notificationsEditRedesignPushSettingValueDto3;
        NotificationsEditRedesignPushSettingValueDto[] notificationsEditRedesignPushSettingValueDtoArr = {notificationsEditRedesignPushSettingValueDto, notificationsEditRedesignPushSettingValueDto2, notificationsEditRedesignPushSettingValueDto3};
        $VALUES = notificationsEditRedesignPushSettingValueDtoArr;
        $ENTRIES = new asp(notificationsEditRedesignPushSettingValueDtoArr);
        CREATOR = new a();
    }

    private NotificationsEditRedesignPushSettingValueDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NotificationsEditRedesignPushSettingValueDto valueOf(String str) {
        return (NotificationsEditRedesignPushSettingValueDto) Enum.valueOf(NotificationsEditRedesignPushSettingValueDto.class, str);
    }

    public static NotificationsEditRedesignPushSettingValueDto[] values() {
        return (NotificationsEditRedesignPushSettingValueDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
