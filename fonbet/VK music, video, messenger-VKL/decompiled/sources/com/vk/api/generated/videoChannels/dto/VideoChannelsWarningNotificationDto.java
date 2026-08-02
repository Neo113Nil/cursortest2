package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoChannelsWarningNotificationDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsWarningNotificationDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsWarningNotificationDto> CREATOR = new a();

    @pmi0("back_button")
    private final String backButton;

    @pmi0("can_close")
    private final boolean canClose;

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
    /* compiled from: VideoChannelsWarningNotificationDto.kt */
    public static final class NotificationIconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NotificationIconDto[] $VALUES;
        public static final Parcelable.Creator<NotificationIconDto> CREATOR;

        @pmi0("illustration_lgbt")
        public static final NotificationIconDto ILLUSTRATION_LGBT;

        @pmi0("illustration_unreliable")
        public static final NotificationIconDto ILLUSTRATION_UNRELIABLE;
        private final String value;

        /* compiled from: VideoChannelsWarningNotificationDto.kt */
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
            NotificationIconDto[] notificationIconDtoArr = {notificationIconDto, notificationIconDto2};
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

    /* compiled from: VideoChannelsWarningNotificationDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsWarningNotificationDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsWarningNotificationDto createFromParcel(Parcel parcel) {
            return new VideoChannelsWarningNotificationDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : NotificationIconDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsWarningNotificationDto[] newArray(int i) {
            return new VideoChannelsWarningNotificationDto[i];
        }
    }

    public VideoChannelsWarningNotificationDto(int i, String str, String str2, String str3, boolean z, boolean z2, String str4, NotificationIconDto notificationIconDto) {
        this.id = i;
        this.title = str;
        this.text = str2;
        this.backButton = str3;
        this.needReloadOnAccept = z;
        this.canClose = z2;
        this.okButton = str4;
        this.notificationIcon = notificationIconDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsWarningNotificationDto)) {
            return false;
        }
        VideoChannelsWarningNotificationDto videoChannelsWarningNotificationDto = (VideoChannelsWarningNotificationDto) obj;
        return this.id == videoChannelsWarningNotificationDto.id && epx.f(this.title, videoChannelsWarningNotificationDto.title) && epx.f(this.text, videoChannelsWarningNotificationDto.text) && epx.f(this.backButton, videoChannelsWarningNotificationDto.backButton) && this.needReloadOnAccept == videoChannelsWarningNotificationDto.needReloadOnAccept && this.canClose == videoChannelsWarningNotificationDto.canClose && epx.f(this.okButton, videoChannelsWarningNotificationDto.okButton) && this.notificationIcon == videoChannelsWarningNotificationDto.notificationIcon;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.text), 31, this.backButton), 31, this.needReloadOnAccept), 31, this.canClose);
        String str = this.okButton;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        NotificationIconDto notificationIconDto = this.notificationIcon;
        return hashCode + (notificationIconDto != null ? notificationIconDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoChannelsWarningNotificationDto(id=" + this.id + ", title=" + this.title + ", text=" + this.text + ", backButton=" + this.backButton + ", needReloadOnAccept=" + this.needReloadOnAccept + ", canClose=" + this.canClose + ", okButton=" + this.okButton + ", notificationIcon=" + this.notificationIcon + ')';
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
        NotificationIconDto notificationIconDto = this.notificationIcon;
        if (notificationIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationIconDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoChannelsWarningNotificationDto(int i, String str, String str2, String str3, boolean z, boolean z2, String str4, NotificationIconDto notificationIconDto, int i2, zcl zclVar) {
        this(i, str, str2, str3, z, z2, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : notificationIconDto);
    }
}
