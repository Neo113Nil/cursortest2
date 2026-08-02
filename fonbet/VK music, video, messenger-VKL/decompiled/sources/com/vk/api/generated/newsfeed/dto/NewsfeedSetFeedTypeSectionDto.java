package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedSetFeedTypeSectionDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedSetFeedTypeSectionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedSetFeedTypeSectionDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedSetFeedTypeSectionDto> CREATOR;

    @pmi0("news")
    public static final NewsfeedSetFeedTypeSectionDto NEWS;
    private final String value;

    /* compiled from: NewsfeedSetFeedTypeSectionDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedSetFeedTypeSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedSetFeedTypeSectionDto createFromParcel(Parcel parcel) {
            return NewsfeedSetFeedTypeSectionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedSetFeedTypeSectionDto[] newArray(int i) {
            return new NewsfeedSetFeedTypeSectionDto[i];
        }
    }

    static {
        NewsfeedSetFeedTypeSectionDto newsfeedSetFeedTypeSectionDto = new NewsfeedSetFeedTypeSectionDto("NEWS", 0, "news");
        NEWS = newsfeedSetFeedTypeSectionDto;
        NewsfeedSetFeedTypeSectionDto[] newsfeedSetFeedTypeSectionDtoArr = {newsfeedSetFeedTypeSectionDto};
        $VALUES = newsfeedSetFeedTypeSectionDtoArr;
        $ENTRIES = new asp(newsfeedSetFeedTypeSectionDtoArr);
        CREATOR = new a();
    }

    private NewsfeedSetFeedTypeSectionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedSetFeedTypeSectionDto valueOf(String str) {
        return (NewsfeedSetFeedTypeSectionDto) Enum.valueOf(NewsfeedSetFeedTypeSectionDto.class, str);
    }

    public static NewsfeedSetFeedTypeSectionDto[] values() {
        return (NewsfeedSetFeedTypeSectionDto[]) $VALUES.clone();
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
