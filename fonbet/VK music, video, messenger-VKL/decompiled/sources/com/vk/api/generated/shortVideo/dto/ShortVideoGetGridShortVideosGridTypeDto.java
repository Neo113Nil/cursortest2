package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoGetGridShortVideosGridTypeDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetGridShortVideosGridTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoGetGridShortVideosGridTypeDto[] $VALUES;

    @pmi0("audio")
    public static final ShortVideoGetGridShortVideosGridTypeDto AUDIO;

    @pmi0("compilation")
    public static final ShortVideoGetGridShortVideosGridTypeDto COMPILATION;
    public static final Parcelable.Creator<ShortVideoGetGridShortVideosGridTypeDto> CREATOR;

    @pmi0("effect")
    public static final ShortVideoGetGridShortVideosGridTypeDto EFFECT;

    @pmi0("hashtag")
    public static final ShortVideoGetGridShortVideosGridTypeDto HASHTAG;

    @pmi0("mask")
    public static final ShortVideoGetGridShortVideosGridTypeDto MASK;

    @pmi0("news_monotheme")
    public static final ShortVideoGetGridShortVideosGridTypeDto NEWS_MONOTHEME;

    @pmi0("place")
    public static final ShortVideoGetGridShortVideosGridTypeDto PLACE;
    private final String value;

    /* compiled from: ShortVideoGetGridShortVideosGridTypeDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetGridShortVideosGridTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetGridShortVideosGridTypeDto createFromParcel(Parcel parcel) {
            return ShortVideoGetGridShortVideosGridTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetGridShortVideosGridTypeDto[] newArray(int i) {
            return new ShortVideoGetGridShortVideosGridTypeDto[i];
        }
    }

    static {
        ShortVideoGetGridShortVideosGridTypeDto shortVideoGetGridShortVideosGridTypeDto = new ShortVideoGetGridShortVideosGridTypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 0, "audio");
        AUDIO = shortVideoGetGridShortVideosGridTypeDto;
        ShortVideoGetGridShortVideosGridTypeDto shortVideoGetGridShortVideosGridTypeDto2 = new ShortVideoGetGridShortVideosGridTypeDto("COMPILATION", 1, "compilation");
        COMPILATION = shortVideoGetGridShortVideosGridTypeDto2;
        ShortVideoGetGridShortVideosGridTypeDto shortVideoGetGridShortVideosGridTypeDto3 = new ShortVideoGetGridShortVideosGridTypeDto("EFFECT", 2, "effect");
        EFFECT = shortVideoGetGridShortVideosGridTypeDto3;
        ShortVideoGetGridShortVideosGridTypeDto shortVideoGetGridShortVideosGridTypeDto4 = new ShortVideoGetGridShortVideosGridTypeDto("HASHTAG", 3, "hashtag");
        HASHTAG = shortVideoGetGridShortVideosGridTypeDto4;
        ShortVideoGetGridShortVideosGridTypeDto shortVideoGetGridShortVideosGridTypeDto5 = new ShortVideoGetGridShortVideosGridTypeDto("MASK", 4, "mask");
        MASK = shortVideoGetGridShortVideosGridTypeDto5;
        ShortVideoGetGridShortVideosGridTypeDto shortVideoGetGridShortVideosGridTypeDto6 = new ShortVideoGetGridShortVideosGridTypeDto("NEWS_MONOTHEME", 5, "news_monotheme");
        NEWS_MONOTHEME = shortVideoGetGridShortVideosGridTypeDto6;
        ShortVideoGetGridShortVideosGridTypeDto shortVideoGetGridShortVideosGridTypeDto7 = new ShortVideoGetGridShortVideosGridTypeDto("PLACE", 6, "place");
        PLACE = shortVideoGetGridShortVideosGridTypeDto7;
        ShortVideoGetGridShortVideosGridTypeDto[] shortVideoGetGridShortVideosGridTypeDtoArr = {shortVideoGetGridShortVideosGridTypeDto, shortVideoGetGridShortVideosGridTypeDto2, shortVideoGetGridShortVideosGridTypeDto3, shortVideoGetGridShortVideosGridTypeDto4, shortVideoGetGridShortVideosGridTypeDto5, shortVideoGetGridShortVideosGridTypeDto6, shortVideoGetGridShortVideosGridTypeDto7};
        $VALUES = shortVideoGetGridShortVideosGridTypeDtoArr;
        $ENTRIES = new asp(shortVideoGetGridShortVideosGridTypeDtoArr);
        CREATOR = new a();
    }

    private ShortVideoGetGridShortVideosGridTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoGetGridShortVideosGridTypeDto valueOf(String str) {
        return (ShortVideoGetGridShortVideosGridTypeDto) Enum.valueOf(ShortVideoGetGridShortVideosGridTypeDto.class, str);
    }

    public static ShortVideoGetGridShortVideosGridTypeDto[] values() {
        return (ShortVideoGetGridShortVideosGridTypeDto[]) $VALUES.clone();
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
