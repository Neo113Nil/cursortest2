package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsWarningNotificationDto.kt */
/* loaded from: classes14.dex */
public final class GroupsWarningNotificationDto implements Parcelable {
    public static final Parcelable.Creator<GroupsWarningNotificationDto> CREATOR = new a();

    @pmi0("back_button")
    private final String backButton;

    @pmi0("can_close")
    private final boolean canClose;

    @pmi0("icon")
    private final IconDto icon;

    @pmi0("id")
    private final int id;

    @pmi0("need_reload_on_accept")
    private final boolean needReloadOnAccept;

    @pmi0("notification_icon")
    private final NotificationIconDto notificationIcon;

    @pmi0("ok_button")
    private final String okButton;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsWarningNotificationDto.kt */
    public static final class IconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconDto[] $VALUES;
        public static final Parcelable.Creator<IconDto> CREATOR;

        @pmi0("hide_outline")
        public static final IconDto HIDE_OUTLINE;
        private final String value;

        /* compiled from: GroupsWarningNotificationDto.kt */
        public static final class a implements Parcelable.Creator<IconDto> {
            @Override // android.os.Parcelable.Creator
            public final IconDto createFromParcel(Parcel parcel) {
                return IconDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IconDto[] newArray(int i) {
                return new IconDto[i];
            }
        }

        static {
            IconDto iconDto = new IconDto("HIDE_OUTLINE", 0, "hide_outline");
            HIDE_OUTLINE = iconDto;
            IconDto[] iconDtoArr = {iconDto};
            $VALUES = iconDtoArr;
            $ENTRIES = new asp(iconDtoArr);
            CREATOR = new a();
        }

        private IconDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IconDto valueOf(String str) {
            return (IconDto) Enum.valueOf(IconDto.class, str);
        }

        public static IconDto[] values() {
            return (IconDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsWarningNotificationDto.kt */
    public static final class NotificationIconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NotificationIconDto[] $VALUES;
        public static final Parcelable.Creator<NotificationIconDto> CREATOR;

        @pmi0("hide_outline")
        public static final NotificationIconDto HIDE_OUTLINE;

        @pmi0("illustration_lgbt")
        public static final NotificationIconDto ILLUSTRATION_LGBT;

        @pmi0("illustration_unreliable")
        public static final NotificationIconDto ILLUSTRATION_UNRELIABLE;
        private final String value;

        /* compiled from: GroupsWarningNotificationDto.kt */
        public static final class a implements Parcelable.Creator<NotificationIconDto> {
            @Override // android.os.Parcelable.Creator
            public final NotificationIconDto createFromParcel(Parcel parcel) {
                return NotificationIconDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotificationIconDto[] newArray(int i) {
                return new NotificationIconDto[i];
            }
        }

        static {
            NotificationIconDto notificationIconDto = new NotificationIconDto("ILLUSTRATION_LGBT", 0, "illustration_lgbt");
            ILLUSTRATION_LGBT = notificationIconDto;
            NotificationIconDto notificationIconDto2 = new NotificationIconDto("ILLUSTRATION_UNRELIABLE", 1, "illustration_unreliable");
            ILLUSTRATION_UNRELIABLE = notificationIconDto2;
            NotificationIconDto notificationIconDto3 = new NotificationIconDto("HIDE_OUTLINE", 2, "hide_outline");
            HIDE_OUTLINE = notificationIconDto3;
            NotificationIconDto[] notificationIconDtoArr = {notificationIconDto, notificationIconDto2, notificationIconDto3};
            $VALUES = notificationIconDtoArr;
            $ENTRIES = new asp(notificationIconDtoArr);
            CREATOR = new a();
        }

        private NotificationIconDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static NotificationIconDto valueOf(String str) {
            return (NotificationIconDto) Enum.valueOf(NotificationIconDto.class, str);
        }

        public static NotificationIconDto[] values() {
            return (NotificationIconDto[]) $VALUES.clone();
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

    /* compiled from: GroupsWarningNotificationDto.kt */
    public static final class a implements Parcelable.Creator<GroupsWarningNotificationDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsWarningNotificationDto createFromParcel(Parcel parcel) {
            return new GroupsWarningNotificationDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : IconDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NotificationIconDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsWarningNotificationDto[] newArray(int i) {
            return new GroupsWarningNotificationDto[i];
        }
    }

    public GroupsWarningNotificationDto(int i, String str, String str2, String str3, boolean z, boolean z2, String str4, IconDto iconDto, NotificationIconDto notificationIconDto) {
        this.id = i;
        this.title = str;
        this.text = str2;
        this.backButton = str3;
        this.needReloadOnAccept = z;
        this.canClose = z2;
        this.okButton = str4;
        this.icon = iconDto;
        this.notificationIcon = notificationIconDto;
    }

    public final String d() {
        return this.backButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.canClose;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsWarningNotificationDto)) {
            return false;
        }
        GroupsWarningNotificationDto groupsWarningNotificationDto = (GroupsWarningNotificationDto) obj;
        return this.id == groupsWarningNotificationDto.id && epx.f(this.title, groupsWarningNotificationDto.title) && epx.f(this.text, groupsWarningNotificationDto.text) && epx.f(this.backButton, groupsWarningNotificationDto.backButton) && this.needReloadOnAccept == groupsWarningNotificationDto.needReloadOnAccept && this.canClose == groupsWarningNotificationDto.canClose && epx.f(this.okButton, groupsWarningNotificationDto.okButton) && this.icon == groupsWarningNotificationDto.icon && this.notificationIcon == groupsWarningNotificationDto.notificationIcon;
    }

    public final String f() {
        return this.okButton;
    }

    public final String g() {
        return this.text;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.text), 31, this.backButton), 31, this.needReloadOnAccept), 31, this.canClose);
        String str = this.okButton;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        IconDto iconDto = this.icon;
        int hashCode2 = (hashCode + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
        NotificationIconDto notificationIconDto = this.notificationIcon;
        return hashCode2 + (notificationIconDto != null ? notificationIconDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsWarningNotificationDto(id=" + this.id + ", title=" + this.title + ", text=" + this.text + ", backButton=" + this.backButton + ", needReloadOnAccept=" + this.needReloadOnAccept + ", canClose=" + this.canClose + ", okButton=" + this.okButton + ", icon=" + this.icon + ", notificationIcon=" + this.notificationIcon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.backButton);
        parcel.writeInt(this.needReloadOnAccept ? 1 : 0);
        parcel.writeInt(this.canClose ? 1 : 0);
        parcel.writeString(this.okButton);
        IconDto iconDto = this.icon;
        if (iconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconDto.writeToParcel(parcel, i);
        }
        NotificationIconDto notificationIconDto = this.notificationIcon;
        if (notificationIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationIconDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsWarningNotificationDto(int i, String str, String str2, String str3, boolean z, boolean z2, String str4, IconDto iconDto, NotificationIconDto notificationIconDto, int i2, zcl zclVar) {
        this(i, str, str2, str3, z, z2, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : iconDto, (i2 & 256) != 0 ? null : notificationIconDto);
    }
}
