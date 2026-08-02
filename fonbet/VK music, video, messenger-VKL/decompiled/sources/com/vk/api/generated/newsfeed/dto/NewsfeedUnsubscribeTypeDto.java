package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedUnsubscribeTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedUnsubscribeTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedUnsubscribeTypeDto[] $VALUES;

    @pmi0("clip")
    public static final NewsfeedUnsubscribeTypeDto CLIP;
    public static final Parcelable.Creator<NewsfeedUnsubscribeTypeDto> CREATOR;

    @pmi0("market")
    public static final NewsfeedUnsubscribeTypeDto MARKET;

    @pmi0("note")
    public static final NewsfeedUnsubscribeTypeDto NOTE;

    @pmi0("photo")
    public static final NewsfeedUnsubscribeTypeDto PHOTO;

    @pmi0("post")
    public static final NewsfeedUnsubscribeTypeDto POST;

    @pmi0("topic")
    public static final NewsfeedUnsubscribeTypeDto TOPIC;

    @pmi0("video")
    public static final NewsfeedUnsubscribeTypeDto VIDEO;
    private final String value;

    /* compiled from: NewsfeedUnsubscribeTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedUnsubscribeTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedUnsubscribeTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedUnsubscribeTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedUnsubscribeTypeDto[] newArray(int i) {
            return new NewsfeedUnsubscribeTypeDto[i];
        }
    }

    static {
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto = new NewsfeedUnsubscribeTypeDto("CLIP", 0, "clip");
        CLIP = newsfeedUnsubscribeTypeDto;
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto2 = new NewsfeedUnsubscribeTypeDto("MARKET", 1, "market");
        MARKET = newsfeedUnsubscribeTypeDto2;
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto3 = new NewsfeedUnsubscribeTypeDto("NOTE", 2, "note");
        NOTE = newsfeedUnsubscribeTypeDto3;
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto4 = new NewsfeedUnsubscribeTypeDto("PHOTO", 3, "photo");
        PHOTO = newsfeedUnsubscribeTypeDto4;
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto5 = new NewsfeedUnsubscribeTypeDto("POST", 4, "post");
        POST = newsfeedUnsubscribeTypeDto5;
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto6 = new NewsfeedUnsubscribeTypeDto("TOPIC", 5, "topic");
        TOPIC = newsfeedUnsubscribeTypeDto6;
        NewsfeedUnsubscribeTypeDto newsfeedUnsubscribeTypeDto7 = new NewsfeedUnsubscribeTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 6, "video");
        VIDEO = newsfeedUnsubscribeTypeDto7;
        NewsfeedUnsubscribeTypeDto[] newsfeedUnsubscribeTypeDtoArr = {newsfeedUnsubscribeTypeDto, newsfeedUnsubscribeTypeDto2, newsfeedUnsubscribeTypeDto3, newsfeedUnsubscribeTypeDto4, newsfeedUnsubscribeTypeDto5, newsfeedUnsubscribeTypeDto6, newsfeedUnsubscribeTypeDto7};
        $VALUES = newsfeedUnsubscribeTypeDtoArr;
        $ENTRIES = new asp(newsfeedUnsubscribeTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedUnsubscribeTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedUnsubscribeTypeDto valueOf(String str) {
        return (NewsfeedUnsubscribeTypeDto) Enum.valueOf(NewsfeedUnsubscribeTypeDto.class, str);
    }

    public static NewsfeedUnsubscribeTypeDto[] values() {
        return (NewsfeedUnsubscribeTypeDto[]) $VALUES.clone();
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
