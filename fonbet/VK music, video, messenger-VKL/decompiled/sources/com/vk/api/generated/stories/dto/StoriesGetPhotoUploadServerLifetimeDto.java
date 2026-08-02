package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetPhotoUploadServerLifetimeDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetPhotoUploadServerLifetimeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetPhotoUploadServerLifetimeDto[] $VALUES;
    public static final Parcelable.Creator<StoriesGetPhotoUploadServerLifetimeDto> CREATOR;

    @pmi0("172800")
    public static final StoriesGetPhotoUploadServerLifetimeDto TYPE_172800;

    @pmi0("3600")
    public static final StoriesGetPhotoUploadServerLifetimeDto TYPE_3600;

    @pmi0("43200")
    public static final StoriesGetPhotoUploadServerLifetimeDto TYPE_43200;

    @pmi0("86400")
    public static final StoriesGetPhotoUploadServerLifetimeDto TYPE_86400;
    private final int value;

    /* compiled from: StoriesGetPhotoUploadServerLifetimeDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetPhotoUploadServerLifetimeDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerLifetimeDto createFromParcel(Parcel parcel) {
            return StoriesGetPhotoUploadServerLifetimeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerLifetimeDto[] newArray(int i) {
            return new StoriesGetPhotoUploadServerLifetimeDto[i];
        }
    }

    static {
        StoriesGetPhotoUploadServerLifetimeDto storiesGetPhotoUploadServerLifetimeDto = new StoriesGetPhotoUploadServerLifetimeDto("TYPE_3600", 0, 3600);
        TYPE_3600 = storiesGetPhotoUploadServerLifetimeDto;
        StoriesGetPhotoUploadServerLifetimeDto storiesGetPhotoUploadServerLifetimeDto2 = new StoriesGetPhotoUploadServerLifetimeDto("TYPE_43200", 1, 43200);
        TYPE_43200 = storiesGetPhotoUploadServerLifetimeDto2;
        StoriesGetPhotoUploadServerLifetimeDto storiesGetPhotoUploadServerLifetimeDto3 = new StoriesGetPhotoUploadServerLifetimeDto("TYPE_86400", 2, 86400);
        TYPE_86400 = storiesGetPhotoUploadServerLifetimeDto3;
        StoriesGetPhotoUploadServerLifetimeDto storiesGetPhotoUploadServerLifetimeDto4 = new StoriesGetPhotoUploadServerLifetimeDto("TYPE_172800", 3, 172800);
        TYPE_172800 = storiesGetPhotoUploadServerLifetimeDto4;
        StoriesGetPhotoUploadServerLifetimeDto[] storiesGetPhotoUploadServerLifetimeDtoArr = {storiesGetPhotoUploadServerLifetimeDto, storiesGetPhotoUploadServerLifetimeDto2, storiesGetPhotoUploadServerLifetimeDto3, storiesGetPhotoUploadServerLifetimeDto4};
        $VALUES = storiesGetPhotoUploadServerLifetimeDtoArr;
        $ENTRIES = new asp(storiesGetPhotoUploadServerLifetimeDtoArr);
        CREATOR = new a();
    }

    private StoriesGetPhotoUploadServerLifetimeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static StoriesGetPhotoUploadServerLifetimeDto valueOf(String str) {
        return (StoriesGetPhotoUploadServerLifetimeDto) Enum.valueOf(StoriesGetPhotoUploadServerLifetimeDto.class, str);
    }

    public static StoriesGetPhotoUploadServerLifetimeDto[] values() {
        return (StoriesGetPhotoUploadServerLifetimeDto[]) $VALUES.clone();
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
