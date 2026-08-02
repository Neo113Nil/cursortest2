package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: ShortVideoFeedItemShortVideoFullDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoFeedItemShortVideoFullDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoFeedItemShortVideoFullDto> CREATOR = new a();

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final ShortVideoShortVideoFullDto item;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoFeedItemShortVideoFullDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("short_video_full")
        public static final TypeDto SHORT_VIDEO_FULL;
        private final String value;

        /* compiled from: ShortVideoFeedItemShortVideoFullDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("SHORT_VIDEO_FULL", 0, "short_video_full");
            SHORT_VIDEO_FULL = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: ShortVideoFeedItemShortVideoFullDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoFeedItemShortVideoFullDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoFeedItemShortVideoFullDto createFromParcel(Parcel parcel) {
            return new ShortVideoFeedItemShortVideoFullDto(TypeDto.CREATOR.createFromParcel(parcel), ShortVideoShortVideoFullDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoFeedItemShortVideoFullDto[] newArray(int i) {
            return new ShortVideoFeedItemShortVideoFullDto[i];
        }
    }

    public ShortVideoFeedItemShortVideoFullDto(TypeDto typeDto, ShortVideoShortVideoFullDto shortVideoShortVideoFullDto) {
        this.type = typeDto;
        this.item = shortVideoShortVideoFullDto;
    }

    public final ShortVideoShortVideoFullDto d() {
        return this.item;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoFeedItemShortVideoFullDto)) {
            return false;
        }
        ShortVideoFeedItemShortVideoFullDto shortVideoFeedItemShortVideoFullDto = (ShortVideoFeedItemShortVideoFullDto) obj;
        return this.type == shortVideoFeedItemShortVideoFullDto.type && epx.f(this.item, shortVideoFeedItemShortVideoFullDto.item);
    }

    public final int hashCode() {
        return this.item.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "ShortVideoFeedItemShortVideoFullDto(type=" + this.type + ", item=" + this.item + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        this.item.writeToParcel(parcel, i);
    }
}
