package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetPhotoUploadServerFilterPhotoDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetPhotoUploadServerFilterPhotoDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetPhotoUploadServerFilterPhotoDto[] $VALUES;

    @pmi0("AC")
    public static final StoriesGetPhotoUploadServerFilterPhotoDto AC;

    @pmi0("AF")
    public static final StoriesGetPhotoUploadServerFilterPhotoDto AF;

    @pmi0("clahe")
    public static final StoriesGetPhotoUploadServerFilterPhotoDto CLAHE;
    public static final Parcelable.Creator<StoriesGetPhotoUploadServerFilterPhotoDto> CREATOR;

    @pmi0("no_filter")
    public static final StoriesGetPhotoUploadServerFilterPhotoDto NO_FILTER;
    private final String value;

    /* compiled from: StoriesGetPhotoUploadServerFilterPhotoDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetPhotoUploadServerFilterPhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerFilterPhotoDto createFromParcel(Parcel parcel) {
            return StoriesGetPhotoUploadServerFilterPhotoDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetPhotoUploadServerFilterPhotoDto[] newArray(int i) {
            return new StoriesGetPhotoUploadServerFilterPhotoDto[i];
        }
    }

    static {
        StoriesGetPhotoUploadServerFilterPhotoDto storiesGetPhotoUploadServerFilterPhotoDto = new StoriesGetPhotoUploadServerFilterPhotoDto("AC", 0, "AC");
        AC = storiesGetPhotoUploadServerFilterPhotoDto;
        StoriesGetPhotoUploadServerFilterPhotoDto storiesGetPhotoUploadServerFilterPhotoDto2 = new StoriesGetPhotoUploadServerFilterPhotoDto("AF", 1, "AF");
        AF = storiesGetPhotoUploadServerFilterPhotoDto2;
        StoriesGetPhotoUploadServerFilterPhotoDto storiesGetPhotoUploadServerFilterPhotoDto3 = new StoriesGetPhotoUploadServerFilterPhotoDto("CLAHE", 2, "clahe");
        CLAHE = storiesGetPhotoUploadServerFilterPhotoDto3;
        StoriesGetPhotoUploadServerFilterPhotoDto storiesGetPhotoUploadServerFilterPhotoDto4 = new StoriesGetPhotoUploadServerFilterPhotoDto("NO_FILTER", 3, "no_filter");
        NO_FILTER = storiesGetPhotoUploadServerFilterPhotoDto4;
        StoriesGetPhotoUploadServerFilterPhotoDto[] storiesGetPhotoUploadServerFilterPhotoDtoArr = {storiesGetPhotoUploadServerFilterPhotoDto, storiesGetPhotoUploadServerFilterPhotoDto2, storiesGetPhotoUploadServerFilterPhotoDto3, storiesGetPhotoUploadServerFilterPhotoDto4};
        $VALUES = storiesGetPhotoUploadServerFilterPhotoDtoArr;
        $ENTRIES = new asp(storiesGetPhotoUploadServerFilterPhotoDtoArr);
        CREATOR = new a();
    }

    private StoriesGetPhotoUploadServerFilterPhotoDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<StoriesGetPhotoUploadServerFilterPhotoDto> i() {
        return $ENTRIES;
    }

    public static StoriesGetPhotoUploadServerFilterPhotoDto valueOf(String str) {
        return (StoriesGetPhotoUploadServerFilterPhotoDto) Enum.valueOf(StoriesGetPhotoUploadServerFilterPhotoDto.class, str);
    }

    public static StoriesGetPhotoUploadServerFilterPhotoDto[] values() {
        return (StoriesGetPhotoUploadServerFilterPhotoDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
