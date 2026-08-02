package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedSetFeedTypeTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedSetFeedTypeTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedSetFeedTypeTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedSetFeedTypeTypeDto> CREATOR;

    @pmi0("recent")
    public static final NewsfeedSetFeedTypeTypeDto RECENT;

    @pmi0("top")
    public static final NewsfeedSetFeedTypeTypeDto TOP;
    private final String value;

    /* compiled from: NewsfeedSetFeedTypeTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedSetFeedTypeTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedSetFeedTypeTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedSetFeedTypeTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedSetFeedTypeTypeDto[] newArray(int i) {
            return new NewsfeedSetFeedTypeTypeDto[i];
        }
    }

    static {
        NewsfeedSetFeedTypeTypeDto newsfeedSetFeedTypeTypeDto = new NewsfeedSetFeedTypeTypeDto("RECENT", 0, "recent");
        RECENT = newsfeedSetFeedTypeTypeDto;
        NewsfeedSetFeedTypeTypeDto newsfeedSetFeedTypeTypeDto2 = new NewsfeedSetFeedTypeTypeDto("TOP", 1, "top");
        TOP = newsfeedSetFeedTypeTypeDto2;
        NewsfeedSetFeedTypeTypeDto[] newsfeedSetFeedTypeTypeDtoArr = {newsfeedSetFeedTypeTypeDto, newsfeedSetFeedTypeTypeDto2};
        $VALUES = newsfeedSetFeedTypeTypeDtoArr;
        $ENTRIES = new asp(newsfeedSetFeedTypeTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedSetFeedTypeTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedSetFeedTypeTypeDto valueOf(String str) {
        return (NewsfeedSetFeedTypeTypeDto) Enum.valueOf(NewsfeedSetFeedTypeTypeDto.class, str);
    }

    public static NewsfeedSetFeedTypeTypeDto[] values() {
        return (NewsfeedSetFeedTypeTypeDto[]) $VALUES.clone();
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
