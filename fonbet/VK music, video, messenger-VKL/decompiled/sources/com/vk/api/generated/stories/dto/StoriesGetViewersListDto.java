package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesGetViewersListDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetViewersListDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesGetViewersListDto[] $VALUES;

    @pmi0("all")
    public static final StoriesGetViewersListDto ALL;
    public static final Parcelable.Creator<StoriesGetViewersListDto> CREATOR;

    @pmi0("liked")
    public static final StoriesGetViewersListDto LIKED;

    @pmi0("viewed")
    public static final StoriesGetViewersListDto VIEWED;
    private final String value;

    /* compiled from: StoriesGetViewersListDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetViewersListDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetViewersListDto createFromParcel(Parcel parcel) {
            return StoriesGetViewersListDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetViewersListDto[] newArray(int i) {
            return new StoriesGetViewersListDto[i];
        }
    }

    static {
        StoriesGetViewersListDto storiesGetViewersListDto = new StoriesGetViewersListDto("ALL", 0, "all");
        ALL = storiesGetViewersListDto;
        StoriesGetViewersListDto storiesGetViewersListDto2 = new StoriesGetViewersListDto("LIKED", 1, "liked");
        LIKED = storiesGetViewersListDto2;
        StoriesGetViewersListDto storiesGetViewersListDto3 = new StoriesGetViewersListDto("VIEWED", 2, "viewed");
        VIEWED = storiesGetViewersListDto3;
        StoriesGetViewersListDto[] storiesGetViewersListDtoArr = {storiesGetViewersListDto, storiesGetViewersListDto2, storiesGetViewersListDto3};
        $VALUES = storiesGetViewersListDtoArr;
        $ENTRIES = new asp(storiesGetViewersListDtoArr);
        CREATOR = new a();
    }

    private StoriesGetViewersListDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoriesGetViewersListDto valueOf(String str) {
        return (StoriesGetViewersListDto) Enum.valueOf(StoriesGetViewersListDto.class, str);
    }

    public static StoriesGetViewersListDto[] values() {
        return (StoriesGetViewersListDto[]) $VALUES.clone();
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
