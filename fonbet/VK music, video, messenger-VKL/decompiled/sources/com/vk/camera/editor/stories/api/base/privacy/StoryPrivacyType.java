package com.vk.camera.editor.stories.api.base.privacy;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryPrivacyType.kt */
/* loaded from: classes16.dex */
public final class StoryPrivacyType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryPrivacyType[] $VALUES;
    public static final StoryPrivacyType ALL;
    public static final StoryPrivacyType BEST_FRIENDS;
    public static final Parcelable.Creator<StoryPrivacyType> CREATOR;
    public static final StoryPrivacyType EXCLUDED;
    public static final StoryPrivacyType FRIENDS;
    public static final StoryPrivacyType FRIENDS_OF_FRIENDS;
    public static final StoryPrivacyType ONLY_ME;
    public static final StoryPrivacyType SOME;
    private final String value;

    /* compiled from: StoryPrivacyType.kt */
    public static final class a implements Parcelable.Creator<StoryPrivacyType> {
        @Override // android.os.Parcelable.Creator
        public final StoryPrivacyType createFromParcel(Parcel parcel) {
            return StoryPrivacyType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryPrivacyType[] newArray(int i) {
            return new StoryPrivacyType[i];
        }
    }

    static {
        StoryPrivacyType storyPrivacyType = new StoryPrivacyType("ALL", 0, "all");
        ALL = storyPrivacyType;
        StoryPrivacyType storyPrivacyType2 = new StoryPrivacyType(Privacy.FRIENDS, 1, "friends");
        FRIENDS = storyPrivacyType2;
        StoryPrivacyType storyPrivacyType3 = new StoryPrivacyType("BEST_FRIENDS", 2, "best_friends");
        BEST_FRIENDS = storyPrivacyType3;
        StoryPrivacyType storyPrivacyType4 = new StoryPrivacyType("ONLY_ME", 3, "only_me");
        ONLY_ME = storyPrivacyType4;
        StoryPrivacyType storyPrivacyType5 = new StoryPrivacyType("FRIENDS_OF_FRIENDS", 4, "friends_of_friends");
        FRIENDS_OF_FRIENDS = storyPrivacyType5;
        StoryPrivacyType storyPrivacyType6 = new StoryPrivacyType("SOME", 5, "some");
        SOME = storyPrivacyType6;
        StoryPrivacyType storyPrivacyType7 = new StoryPrivacyType("EXCLUDED", 6, "excluded");
        EXCLUDED = storyPrivacyType7;
        StoryPrivacyType[] storyPrivacyTypeArr = {storyPrivacyType, storyPrivacyType2, storyPrivacyType3, storyPrivacyType4, storyPrivacyType5, storyPrivacyType6, storyPrivacyType7};
        $VALUES = storyPrivacyTypeArr;
        $ENTRIES = new asp(storyPrivacyTypeArr);
        CREATOR = new a();
    }

    public StoryPrivacyType(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<StoryPrivacyType> i() {
        return $ENTRIES;
    }

    public static StoryPrivacyType valueOf(String str) {
        return (StoryPrivacyType) Enum.valueOf(StoryPrivacyType.class, str);
    }

    public static StoryPrivacyType[] values() {
        return (StoryPrivacyType[]) $VALUES.clone();
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
