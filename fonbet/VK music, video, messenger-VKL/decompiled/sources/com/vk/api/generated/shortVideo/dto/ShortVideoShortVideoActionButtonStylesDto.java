package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoShortVideoActionButtonStylesDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoActionButtonStylesDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoActionButtonStylesDto> CREATOR = new a();

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("icon")
    private final IconDto icon;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("show_milliseconds")
    private final Integer showMilliseconds;

    @pmi0("text_color")
    private final String textColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoShortVideoActionButtonStylesDto.kt */
    public static final class IconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconDto[] $VALUES;
        public static final Parcelable.Creator<IconDto> CREATOR;

        @pmi0("live_finished")
        public static final IconDto LIVE_FINISHED;

        @pmi0("live_started")
        public static final IconDto LIVE_STARTED;

        @pmi0("live_upcoming")
        public static final IconDto LIVE_UPCOMING;
        private final String value;

        /* compiled from: ShortVideoShortVideoActionButtonStylesDto.kt */
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
            IconDto iconDto = new IconDto("LIVE_STARTED", 0, "live_started");
            LIVE_STARTED = iconDto;
            IconDto iconDto2 = new IconDto("LIVE_UPCOMING", 1, "live_upcoming");
            LIVE_UPCOMING = iconDto2;
            IconDto iconDto3 = new IconDto("LIVE_FINISHED", 2, "live_finished");
            LIVE_FINISHED = iconDto3;
            IconDto[] iconDtoArr = {iconDto, iconDto2, iconDto3};
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

    /* compiled from: ShortVideoShortVideoActionButtonStylesDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoActionButtonStylesDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoActionButtonStylesDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ShortVideoShortVideoActionButtonStylesDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoShortVideoActionButtonStylesDto(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? IconDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoActionButtonStylesDto[] newArray(int i) {
            return new ShortVideoShortVideoActionButtonStylesDto[i];
        }
    }

    public ShortVideoShortVideoActionButtonStylesDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.backgroundColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final IconDto e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoActionButtonStylesDto)) {
            return false;
        }
        ShortVideoShortVideoActionButtonStylesDto shortVideoShortVideoActionButtonStylesDto = (ShortVideoShortVideoActionButtonStylesDto) obj;
        return epx.f(this.images, shortVideoShortVideoActionButtonStylesDto.images) && epx.f(this.backgroundColor, shortVideoShortVideoActionButtonStylesDto.backgroundColor) && epx.f(this.textColor, shortVideoShortVideoActionButtonStylesDto.textColor) && epx.f(this.showMilliseconds, shortVideoShortVideoActionButtonStylesDto.showMilliseconds) && this.icon == shortVideoShortVideoActionButtonStylesDto.icon;
    }

    public final List<BaseImageDto> f() {
        return this.images;
    }

    public final Integer g() {
        return this.showMilliseconds;
    }

    public final int hashCode() {
        List<BaseImageDto> list = this.images;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.showMilliseconds;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        IconDto iconDto = this.icon;
        return hashCode4 + (iconDto != null ? iconDto.hashCode() : 0);
    }

    public final String i() {
        return this.textColor;
    }

    public final String toString() {
        return "ShortVideoShortVideoActionButtonStylesDto(images=" + this.images + ", backgroundColor=" + this.backgroundColor + ", textColor=" + this.textColor + ", showMilliseconds=" + this.showMilliseconds + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.textColor);
        Integer num = this.showMilliseconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        IconDto iconDto = this.icon;
        if (iconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconDto.writeToParcel(parcel, i);
        }
    }

    public ShortVideoShortVideoActionButtonStylesDto(List<BaseImageDto> list, String str, String str2, Integer num, IconDto iconDto) {
        this.images = list;
        this.backgroundColor = str;
        this.textColor = str2;
        this.showMilliseconds = num;
        this.icon = iconDto;
    }

    public /* synthetic */ ShortVideoShortVideoActionButtonStylesDto(List list, String str, String str2, Integer num, IconDto iconDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : iconDto);
    }
}
