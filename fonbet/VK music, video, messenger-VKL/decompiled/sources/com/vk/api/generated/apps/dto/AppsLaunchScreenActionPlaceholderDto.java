package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: AppsLaunchScreenActionPlaceholderDto.kt */
/* loaded from: classes14.dex */
public final class AppsLaunchScreenActionPlaceholderDto implements Parcelable {
    public static final Parcelable.Creator<AppsLaunchScreenActionPlaceholderDto> CREATOR = new a();

    @pmi0("icon")
    private final IconDto icon;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsLaunchScreenActionPlaceholderDto.kt */
    public static final class IconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconDto[] $VALUES;
        public static final Parcelable.Creator<IconDto> CREATOR;

        @pmi0("desktop")
        public static final IconDto DESKTOP;

        @pmi0("mobile")
        public static final IconDto MOBILE;
        private final String value;

        /* compiled from: AppsLaunchScreenActionPlaceholderDto.kt */
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
            IconDto iconDto = new IconDto("MOBILE", 0, "mobile");
            MOBILE = iconDto;
            IconDto iconDto2 = new IconDto("DESKTOP", 1, "desktop");
            DESKTOP = iconDto2;
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

    /* compiled from: AppsLaunchScreenActionPlaceholderDto.kt */
    public static final class a implements Parcelable.Creator<AppsLaunchScreenActionPlaceholderDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsLaunchScreenActionPlaceholderDto createFromParcel(Parcel parcel) {
            return new AppsLaunchScreenActionPlaceholderDto(IconDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsLaunchScreenActionPlaceholderDto[] newArray(int i) {
            return new AppsLaunchScreenActionPlaceholderDto[i];
        }
    }

    public AppsLaunchScreenActionPlaceholderDto(IconDto iconDto, String str, String str2) {
        this.icon = iconDto;
        this.title = str;
        this.text = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsLaunchScreenActionPlaceholderDto)) {
            return false;
        }
        AppsLaunchScreenActionPlaceholderDto appsLaunchScreenActionPlaceholderDto = (AppsLaunchScreenActionPlaceholderDto) obj;
        return this.icon == appsLaunchScreenActionPlaceholderDto.icon && epx.f(this.title, appsLaunchScreenActionPlaceholderDto.title) && epx.f(this.text, appsLaunchScreenActionPlaceholderDto.text);
    }

    public final int hashCode() {
        return this.text.hashCode() + urd0.a(this.icon.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsLaunchScreenActionPlaceholderDto(icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.icon.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
    }
}
