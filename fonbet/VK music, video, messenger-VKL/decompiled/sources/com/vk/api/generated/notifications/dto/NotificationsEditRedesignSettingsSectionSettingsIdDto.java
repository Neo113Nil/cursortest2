package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationsEditRedesignSettingsSectionSettingsIdDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsEditRedesignSettingsSectionSettingsIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationsEditRedesignSettingsSectionSettingsIdDto[] $VALUES;

    @pmi0("all")
    public static final NotificationsEditRedesignSettingsSectionSettingsIdDto ALL;
    public static final Parcelable.Creator<NotificationsEditRedesignSettingsSectionSettingsIdDto> CREATOR;

    @pmi0("important")
    public static final NotificationsEditRedesignSettingsSectionSettingsIdDto IMPORTANT;

    @pmi0("none")
    public static final NotificationsEditRedesignSettingsSectionSettingsIdDto NONE;

    @pmi0("no_text")
    public static final NotificationsEditRedesignSettingsSectionSettingsIdDto NO_TEXT;

    @pmi0("push_notification_off")
    public static final NotificationsEditRedesignSettingsSectionSettingsIdDto PUSH_NOTIFICATION_OFF;

    @pmi0("push_notification_silent")
    public static final NotificationsEditRedesignSettingsSectionSettingsIdDto PUSH_NOTIFICATION_SILENT;

    @pmi0("push_notification_with_sound")
    public static final NotificationsEditRedesignSettingsSectionSettingsIdDto PUSH_NOTIFICATION_WITH_SOUND;

    @pmi0("special_1")
    public static final NotificationsEditRedesignSettingsSectionSettingsIdDto SPECIAL_1;

    @pmi0("special_2")
    public static final NotificationsEditRedesignSettingsSectionSettingsIdDto SPECIAL_2;

    @pmi0("special_3")
    public static final NotificationsEditRedesignSettingsSectionSettingsIdDto SPECIAL_3;

    @pmi0("text")
    public static final NotificationsEditRedesignSettingsSectionSettingsIdDto TEXT;
    private final String value;

    /* compiled from: NotificationsEditRedesignSettingsSectionSettingsIdDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsEditRedesignSettingsSectionSettingsIdDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsEditRedesignSettingsSectionSettingsIdDto createFromParcel(Parcel parcel) {
            return NotificationsEditRedesignSettingsSectionSettingsIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsEditRedesignSettingsSectionSettingsIdDto[] newArray(int i) {
            return new NotificationsEditRedesignSettingsSectionSettingsIdDto[i];
        }
    }

    static {
        NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto = new NotificationsEditRedesignSettingsSectionSettingsIdDto("ALL", 0, "all");
        ALL = notificationsEditRedesignSettingsSectionSettingsIdDto;
        NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto2 = new NotificationsEditRedesignSettingsSectionSettingsIdDto("IMPORTANT", 1, "important");
        IMPORTANT = notificationsEditRedesignSettingsSectionSettingsIdDto2;
        NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto3 = new NotificationsEditRedesignSettingsSectionSettingsIdDto("NO_TEXT", 2, "no_text");
        NO_TEXT = notificationsEditRedesignSettingsSectionSettingsIdDto3;
        NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto4 = new NotificationsEditRedesignSettingsSectionSettingsIdDto("NONE", 3, "none");
        NONE = notificationsEditRedesignSettingsSectionSettingsIdDto4;
        NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto5 = new NotificationsEditRedesignSettingsSectionSettingsIdDto("PUSH_NOTIFICATION_OFF", 4, "push_notification_off");
        PUSH_NOTIFICATION_OFF = notificationsEditRedesignSettingsSectionSettingsIdDto5;
        NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto6 = new NotificationsEditRedesignSettingsSectionSettingsIdDto("PUSH_NOTIFICATION_SILENT", 5, "push_notification_silent");
        PUSH_NOTIFICATION_SILENT = notificationsEditRedesignSettingsSectionSettingsIdDto6;
        NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto7 = new NotificationsEditRedesignSettingsSectionSettingsIdDto("PUSH_NOTIFICATION_WITH_SOUND", 6, "push_notification_with_sound");
        PUSH_NOTIFICATION_WITH_SOUND = notificationsEditRedesignSettingsSectionSettingsIdDto7;
        NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto8 = new NotificationsEditRedesignSettingsSectionSettingsIdDto("SPECIAL_1", 7, "special_1");
        SPECIAL_1 = notificationsEditRedesignSettingsSectionSettingsIdDto8;
        NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto9 = new NotificationsEditRedesignSettingsSectionSettingsIdDto("SPECIAL_2", 8, "special_2");
        SPECIAL_2 = notificationsEditRedesignSettingsSectionSettingsIdDto9;
        NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto10 = new NotificationsEditRedesignSettingsSectionSettingsIdDto("SPECIAL_3", 9, "special_3");
        SPECIAL_3 = notificationsEditRedesignSettingsSectionSettingsIdDto10;
        NotificationsEditRedesignSettingsSectionSettingsIdDto notificationsEditRedesignSettingsSectionSettingsIdDto11 = new NotificationsEditRedesignSettingsSectionSettingsIdDto("TEXT", 10, "text");
        TEXT = notificationsEditRedesignSettingsSectionSettingsIdDto11;
        NotificationsEditRedesignSettingsSectionSettingsIdDto[] notificationsEditRedesignSettingsSectionSettingsIdDtoArr = {notificationsEditRedesignSettingsSectionSettingsIdDto, notificationsEditRedesignSettingsSectionSettingsIdDto2, notificationsEditRedesignSettingsSectionSettingsIdDto3, notificationsEditRedesignSettingsSectionSettingsIdDto4, notificationsEditRedesignSettingsSectionSettingsIdDto5, notificationsEditRedesignSettingsSectionSettingsIdDto6, notificationsEditRedesignSettingsSectionSettingsIdDto7, notificationsEditRedesignSettingsSectionSettingsIdDto8, notificationsEditRedesignSettingsSectionSettingsIdDto9, notificationsEditRedesignSettingsSectionSettingsIdDto10, notificationsEditRedesignSettingsSectionSettingsIdDto11};
        $VALUES = notificationsEditRedesignSettingsSectionSettingsIdDtoArr;
        $ENTRIES = new asp(notificationsEditRedesignSettingsSectionSettingsIdDtoArr);
        CREATOR = new a();
    }

    private NotificationsEditRedesignSettingsSectionSettingsIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NotificationsEditRedesignSettingsSectionSettingsIdDto valueOf(String str) {
        return (NotificationsEditRedesignSettingsSectionSettingsIdDto) Enum.valueOf(NotificationsEditRedesignSettingsSectionSettingsIdDto.class, str);
    }

    public static NotificationsEditRedesignSettingsSectionSettingsIdDto[] values() {
        return (NotificationsEditRedesignSettingsSectionSettingsIdDto[]) $VALUES.clone();
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
