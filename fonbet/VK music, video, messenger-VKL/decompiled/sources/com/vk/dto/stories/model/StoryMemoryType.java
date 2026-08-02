package com.vk.dto.stories.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryMemoryType.kt */
/* loaded from: classes18.dex */
public final class StoryMemoryType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryMemoryType[] $VALUES;
    public static final StoryMemoryType ALBUM;
    public static final StoryMemoryType AVATAR;
    public static final StoryMemoryType BIRTHDAY;
    public static final Parcelable.Creator<StoryMemoryType> CREATOR;
    public static final StoryMemoryType FIRST_AUDIO;
    public static final StoryMemoryType FIRST_AVATAR;
    public static final StoryMemoryType FIRST_POST;
    public static final StoryMemoryType FIRST_STORY;
    public static final StoryMemoryType FRIENDSHIP;
    public static final StoryMemoryType MY_TOP_TRACK;
    public static final StoryMemoryType PHOTO;
    public static final StoryMemoryType POST;
    public static final StoryMemoryType STORY;
    public static final StoryMemoryType YEAR_SUMMARY;

    /* compiled from: StoryMemoryType.kt */
    public static final class a implements Parcelable.Creator<StoryMemoryType> {
        @Override // android.os.Parcelable.Creator
        public final StoryMemoryType createFromParcel(Parcel parcel) {
            return StoryMemoryType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryMemoryType[] newArray(int i) {
            return new StoryMemoryType[i];
        }
    }

    static {
        StoryMemoryType storyMemoryType = new StoryMemoryType("ALBUM", 0);
        ALBUM = storyMemoryType;
        StoryMemoryType storyMemoryType2 = new StoryMemoryType("AVATAR", 1);
        AVATAR = storyMemoryType2;
        StoryMemoryType storyMemoryType3 = new StoryMemoryType("FRIENDSHIP", 2);
        FRIENDSHIP = storyMemoryType3;
        StoryMemoryType storyMemoryType4 = new StoryMemoryType("PHOTO", 3);
        PHOTO = storyMemoryType4;
        StoryMemoryType storyMemoryType5 = new StoryMemoryType("POST", 4);
        POST = storyMemoryType5;
        StoryMemoryType storyMemoryType6 = new StoryMemoryType("STORY", 5);
        STORY = storyMemoryType6;
        StoryMemoryType storyMemoryType7 = new StoryMemoryType("YEAR_SUMMARY", 6);
        YEAR_SUMMARY = storyMemoryType7;
        StoryMemoryType storyMemoryType8 = new StoryMemoryType("FIRST_AVATAR", 7);
        FIRST_AVATAR = storyMemoryType8;
        StoryMemoryType storyMemoryType9 = new StoryMemoryType("FIRST_POST", 8);
        FIRST_POST = storyMemoryType9;
        StoryMemoryType storyMemoryType10 = new StoryMemoryType("FIRST_AUDIO", 9);
        FIRST_AUDIO = storyMemoryType10;
        StoryMemoryType storyMemoryType11 = new StoryMemoryType("FIRST_STORY", 10);
        FIRST_STORY = storyMemoryType11;
        StoryMemoryType storyMemoryType12 = new StoryMemoryType("MY_TOP_TRACK", 11);
        MY_TOP_TRACK = storyMemoryType12;
        StoryMemoryType storyMemoryType13 = new StoryMemoryType("BIRTHDAY", 12);
        BIRTHDAY = storyMemoryType13;
        StoryMemoryType[] storyMemoryTypeArr = {storyMemoryType, storyMemoryType2, storyMemoryType3, storyMemoryType4, storyMemoryType5, storyMemoryType6, storyMemoryType7, storyMemoryType8, storyMemoryType9, storyMemoryType10, storyMemoryType11, storyMemoryType12, storyMemoryType13};
        $VALUES = storyMemoryTypeArr;
        $ENTRIES = new asp(storyMemoryTypeArr);
        CREATOR = new a();
    }

    public StoryMemoryType() {
        throw null;
    }

    public static StoryMemoryType valueOf(String str) {
        return (StoryMemoryType) Enum.valueOf(StoryMemoryType.class, str);
    }

    public static StoryMemoryType[] values() {
        return (StoryMemoryType[]) $VALUES.clone();
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
