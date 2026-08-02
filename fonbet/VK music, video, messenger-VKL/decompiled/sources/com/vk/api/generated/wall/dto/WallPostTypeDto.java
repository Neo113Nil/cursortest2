package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WallPostTypeDto.kt */
/* loaded from: classes15.dex */
public final class WallPostTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallPostTypeDto[] $VALUES;

    @pmi0("clip")
    public static final WallPostTypeDto CLIP;

    @pmi0("copy")
    public static final WallPostTypeDto COPY;
    public static final Parcelable.Creator<WallPostTypeDto> CREATOR;

    @pmi0("draft")
    public static final WallPostTypeDto DRAFT;

    @pmi0("photo")
    public static final WallPostTypeDto PHOTO;

    @pmi0("post")
    public static final WallPostTypeDto POST;

    @pmi0("postpone")
    public static final WallPostTypeDto POSTPONE;

    @pmi0("post_ads")
    public static final WallPostTypeDto POST_ADS;

    @pmi0("reply")
    public static final WallPostTypeDto REPLY;

    @pmi0("suggest")
    public static final WallPostTypeDto SUGGEST;

    @pmi0("video")
    public static final WallPostTypeDto VIDEO;
    private final String value;

    /* compiled from: WallPostTypeDto.kt */
    public static final class a implements Parcelable.Creator<WallPostTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostTypeDto createFromParcel(Parcel parcel) {
            return WallPostTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostTypeDto[] newArray(int i) {
            return new WallPostTypeDto[i];
        }
    }

    static {
        WallPostTypeDto wallPostTypeDto = new WallPostTypeDto("POST", 0, "post");
        POST = wallPostTypeDto;
        WallPostTypeDto wallPostTypeDto2 = new WallPostTypeDto("COPY", 1, "copy");
        COPY = wallPostTypeDto2;
        WallPostTypeDto wallPostTypeDto3 = new WallPostTypeDto("REPLY", 2, "reply");
        REPLY = wallPostTypeDto3;
        WallPostTypeDto wallPostTypeDto4 = new WallPostTypeDto("POSTPONE", 3, "postpone");
        POSTPONE = wallPostTypeDto4;
        WallPostTypeDto wallPostTypeDto5 = new WallPostTypeDto("SUGGEST", 4, "suggest");
        SUGGEST = wallPostTypeDto5;
        WallPostTypeDto wallPostTypeDto6 = new WallPostTypeDto("POST_ADS", 5, "post_ads");
        POST_ADS = wallPostTypeDto6;
        WallPostTypeDto wallPostTypeDto7 = new WallPostTypeDto("PHOTO", 6, "photo");
        PHOTO = wallPostTypeDto7;
        WallPostTypeDto wallPostTypeDto8 = new WallPostTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 7, "video");
        VIDEO = wallPostTypeDto8;
        WallPostTypeDto wallPostTypeDto9 = new WallPostTypeDto("CLIP", 8, "clip");
        CLIP = wallPostTypeDto9;
        WallPostTypeDto wallPostTypeDto10 = new WallPostTypeDto("DRAFT", 9, "draft");
        DRAFT = wallPostTypeDto10;
        WallPostTypeDto[] wallPostTypeDtoArr = {wallPostTypeDto, wallPostTypeDto2, wallPostTypeDto3, wallPostTypeDto4, wallPostTypeDto5, wallPostTypeDto6, wallPostTypeDto7, wallPostTypeDto8, wallPostTypeDto9, wallPostTypeDto10};
        $VALUES = wallPostTypeDtoArr;
        $ENTRIES = new asp(wallPostTypeDtoArr);
        CREATOR = new a();
    }

    private WallPostTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallPostTypeDto valueOf(String str) {
        return (WallPostTypeDto) Enum.valueOf(WallPostTypeDto.class, str);
    }

    public static WallPostTypeDto[] values() {
        return (WallPostTypeDto[]) $VALUES.clone();
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
