package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetVideoUploadServerLifetimeDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetVideoUploadServerLifetimeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetVideoUploadServerLifetimeDto[] $VALUES;
    public static final Parcelable.Creator<StoriesGetVideoUploadServerLifetimeDto> CREATOR;

    @pmi0("172800")
    public static final StoriesGetVideoUploadServerLifetimeDto TYPE_172800;

    @pmi0("3600")
    public static final StoriesGetVideoUploadServerLifetimeDto TYPE_3600;

    @pmi0("43200")
    public static final StoriesGetVideoUploadServerLifetimeDto TYPE_43200;

    @pmi0("86400")
    public static final StoriesGetVideoUploadServerLifetimeDto TYPE_86400;
    private final int value;

    /* compiled from: StoriesGetVideoUploadServerLifetimeDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetVideoUploadServerLifetimeDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerLifetimeDto createFromParcel(Parcel parcel) {
            return StoriesGetVideoUploadServerLifetimeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetVideoUploadServerLifetimeDto[] newArray(int i) {
            return new StoriesGetVideoUploadServerLifetimeDto[i];
        }
    }

    static {
        StoriesGetVideoUploadServerLifetimeDto storiesGetVideoUploadServerLifetimeDto = new StoriesGetVideoUploadServerLifetimeDto("TYPE_3600", 0, 3600);
        TYPE_3600 = storiesGetVideoUploadServerLifetimeDto;
        StoriesGetVideoUploadServerLifetimeDto storiesGetVideoUploadServerLifetimeDto2 = new StoriesGetVideoUploadServerLifetimeDto("TYPE_43200", 1, 43200);
        TYPE_43200 = storiesGetVideoUploadServerLifetimeDto2;
        StoriesGetVideoUploadServerLifetimeDto storiesGetVideoUploadServerLifetimeDto3 = new StoriesGetVideoUploadServerLifetimeDto("TYPE_86400", 2, 86400);
        TYPE_86400 = storiesGetVideoUploadServerLifetimeDto3;
        StoriesGetVideoUploadServerLifetimeDto storiesGetVideoUploadServerLifetimeDto4 = new StoriesGetVideoUploadServerLifetimeDto("TYPE_172800", 3, 172800);
        TYPE_172800 = storiesGetVideoUploadServerLifetimeDto4;
        StoriesGetVideoUploadServerLifetimeDto[] storiesGetVideoUploadServerLifetimeDtoArr = {storiesGetVideoUploadServerLifetimeDto, storiesGetVideoUploadServerLifetimeDto2, storiesGetVideoUploadServerLifetimeDto3, storiesGetVideoUploadServerLifetimeDto4};
        $VALUES = storiesGetVideoUploadServerLifetimeDtoArr;
        $ENTRIES = new asp(storiesGetVideoUploadServerLifetimeDtoArr);
        CREATOR = new a();
    }

    private StoriesGetVideoUploadServerLifetimeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static StoriesGetVideoUploadServerLifetimeDto valueOf(String str) {
        return (StoriesGetVideoUploadServerLifetimeDto) Enum.valueOf(StoriesGetVideoUploadServerLifetimeDto.class, str);
    }

    public static StoriesGetVideoUploadServerLifetimeDto[] values() {
        return (StoriesGetVideoUploadServerLifetimeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
