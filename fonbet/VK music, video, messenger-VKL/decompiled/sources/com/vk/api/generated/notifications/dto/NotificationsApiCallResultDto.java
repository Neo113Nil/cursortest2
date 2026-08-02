package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: NotificationsApiCallResultDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsApiCallResultDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsApiCallResultDto> CREATOR = new a();

    @pmi0("icon")
    private final IconDto icon;

    @pmi0("string")
    private final String string;

    @pmi0("success")
    private final boolean success;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationsApiCallResultDto.kt */
    public static final class IconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconDto[] $VALUES;

        @pmi0("cancel")
        public static final IconDto CANCEL;
        public static final Parcelable.Creator<IconDto> CREATOR;

        @pmi0("done")
        public static final IconDto DONE;
        private final String value;

        /* compiled from: NotificationsApiCallResultDto.kt */
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
            IconDto iconDto = new IconDto("DONE", 0, "done");
            DONE = iconDto;
            IconDto iconDto2 = new IconDto("CANCEL", 1, "cancel");
            CANCEL = iconDto2;
            IconDto[] iconDtoArr = {iconDto, iconDto2};
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: NotificationsApiCallResultDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsApiCallResultDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsApiCallResultDto createFromParcel(Parcel parcel) {
            return new NotificationsApiCallResultDto(parcel.readInt() != 0, IconDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsApiCallResultDto[] newArray(int i) {
            return new NotificationsApiCallResultDto[i];
        }
    }

    public NotificationsApiCallResultDto(boolean z, IconDto iconDto, String str) {
        this.success = z;
        this.icon = iconDto;
        this.string = str;
    }

    public final IconDto d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsApiCallResultDto)) {
            return false;
        }
        NotificationsApiCallResultDto notificationsApiCallResultDto = (NotificationsApiCallResultDto) obj;
        return this.success == notificationsApiCallResultDto.success && this.icon == notificationsApiCallResultDto.icon && epx.f(this.string, notificationsApiCallResultDto.string);
    }

    public final int hashCode() {
        return this.string.hashCode() + ((this.icon.hashCode() + (Boolean.hashCode(this.success) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsApiCallResultDto(success=");
        sb.append(this.success);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", string=");
        return ho8.a(sb, this.string, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.success ? 1 : 0);
        this.icon.writeToParcel(parcel, i);
        parcel.writeString(this.string);
    }
}
