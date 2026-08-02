package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesSetPrivacyPrivacyDto.kt */
/* loaded from: classes15.dex */
public final class StoriesSetPrivacyPrivacyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoriesSetPrivacyPrivacyDto[] $VALUES;

    @pmi0("all")
    public static final StoriesSetPrivacyPrivacyDto ALL;

    @pmi0("best_friends")
    public static final StoriesSetPrivacyPrivacyDto BEST_FRIENDS;
    public static final Parcelable.Creator<StoriesSetPrivacyPrivacyDto> CREATOR;

    @pmi0("friends")
    public static final StoriesSetPrivacyPrivacyDto FRIENDS;
    private final String value;

    /* compiled from: StoriesSetPrivacyPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<StoriesSetPrivacyPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesSetPrivacyPrivacyDto createFromParcel(Parcel parcel) {
            return StoriesSetPrivacyPrivacyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesSetPrivacyPrivacyDto[] newArray(int i) {
            return new StoriesSetPrivacyPrivacyDto[i];
        }
    }

    static {
        StoriesSetPrivacyPrivacyDto storiesSetPrivacyPrivacyDto = new StoriesSetPrivacyPrivacyDto("ALL", 0, "all");
        ALL = storiesSetPrivacyPrivacyDto;
        StoriesSetPrivacyPrivacyDto storiesSetPrivacyPrivacyDto2 = new StoriesSetPrivacyPrivacyDto("BEST_FRIENDS", 1, "best_friends");
        BEST_FRIENDS = storiesSetPrivacyPrivacyDto2;
        StoriesSetPrivacyPrivacyDto storiesSetPrivacyPrivacyDto3 = new StoriesSetPrivacyPrivacyDto(Privacy.FRIENDS, 2, "friends");
        FRIENDS = storiesSetPrivacyPrivacyDto3;
        StoriesSetPrivacyPrivacyDto[] storiesSetPrivacyPrivacyDtoArr = {storiesSetPrivacyPrivacyDto, storiesSetPrivacyPrivacyDto2, storiesSetPrivacyPrivacyDto3};
        $VALUES = storiesSetPrivacyPrivacyDtoArr;
        $ENTRIES = new asp(storiesSetPrivacyPrivacyDtoArr);
        CREATOR = new a();
    }

    private StoriesSetPrivacyPrivacyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoriesSetPrivacyPrivacyDto valueOf(String str) {
        return (StoriesSetPrivacyPrivacyDto) Enum.valueOf(StoriesSetPrivacyPrivacyDto.class, str);
    }

    public static StoriesSetPrivacyPrivacyDto[] values() {
        return (StoriesSetPrivacyPrivacyDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
