package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedGetByTypeFeedTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetByTypeFeedTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetByTypeFeedTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetByTypeFeedTypeDto> CREATOR;

    @pmi0("top")
    public static final NewsfeedGetByTypeFeedTypeDto TOP;
    private final String value;

    /* compiled from: NewsfeedGetByTypeFeedTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetByTypeFeedTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetByTypeFeedTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetByTypeFeedTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetByTypeFeedTypeDto[] newArray(int i) {
            return new NewsfeedGetByTypeFeedTypeDto[i];
        }
    }

    static {
        NewsfeedGetByTypeFeedTypeDto newsfeedGetByTypeFeedTypeDto = new NewsfeedGetByTypeFeedTypeDto("TOP", 0, "top");
        TOP = newsfeedGetByTypeFeedTypeDto;
        NewsfeedGetByTypeFeedTypeDto[] newsfeedGetByTypeFeedTypeDtoArr = {newsfeedGetByTypeFeedTypeDto};
        $VALUES = newsfeedGetByTypeFeedTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetByTypeFeedTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetByTypeFeedTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetByTypeFeedTypeDto valueOf(String str) {
        return (NewsfeedGetByTypeFeedTypeDto) Enum.valueOf(NewsfeedGetByTypeFeedTypeDto.class, str);
    }

    public static NewsfeedGetByTypeFeedTypeDto[] values() {
        return (NewsfeedGetByTypeFeedTypeDto[]) $VALUES.clone();
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
