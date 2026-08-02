package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedItemWallpostFeedbackTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemWallpostFeedbackTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedItemWallpostFeedbackTypeDto[] $VALUES;

    @pmi0("buttons")
    public static final NewsfeedItemWallpostFeedbackTypeDto BUTTONS;
    public static final Parcelable.Creator<NewsfeedItemWallpostFeedbackTypeDto> CREATOR;

    @pmi0("stars")
    public static final NewsfeedItemWallpostFeedbackTypeDto STARS;
    private final String value;

    /* compiled from: NewsfeedItemWallpostFeedbackTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemWallpostFeedbackTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemWallpostFeedbackTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedItemWallpostFeedbackTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemWallpostFeedbackTypeDto[] newArray(int i) {
            return new NewsfeedItemWallpostFeedbackTypeDto[i];
        }
    }

    static {
        NewsfeedItemWallpostFeedbackTypeDto newsfeedItemWallpostFeedbackTypeDto = new NewsfeedItemWallpostFeedbackTypeDto("BUTTONS", 0, "buttons");
        BUTTONS = newsfeedItemWallpostFeedbackTypeDto;
        NewsfeedItemWallpostFeedbackTypeDto newsfeedItemWallpostFeedbackTypeDto2 = new NewsfeedItemWallpostFeedbackTypeDto("STARS", 1, "stars");
        STARS = newsfeedItemWallpostFeedbackTypeDto2;
        NewsfeedItemWallpostFeedbackTypeDto[] newsfeedItemWallpostFeedbackTypeDtoArr = {newsfeedItemWallpostFeedbackTypeDto, newsfeedItemWallpostFeedbackTypeDto2};
        $VALUES = newsfeedItemWallpostFeedbackTypeDtoArr;
        $ENTRIES = new asp(newsfeedItemWallpostFeedbackTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedItemWallpostFeedbackTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedItemWallpostFeedbackTypeDto valueOf(String str) {
        return (NewsfeedItemWallpostFeedbackTypeDto) Enum.valueOf(NewsfeedItemWallpostFeedbackTypeDto.class, str);
    }

    public static NewsfeedItemWallpostFeedbackTypeDto[] values() {
        return (NewsfeedItemWallpostFeedbackTypeDto[]) $VALUES.clone();
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
