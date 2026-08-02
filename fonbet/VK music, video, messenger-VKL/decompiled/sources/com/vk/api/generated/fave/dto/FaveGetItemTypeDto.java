package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveGetItemTypeDto.kt */
/* loaded from: classes14.dex */
public final class FaveGetItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveGetItemTypeDto[] $VALUES;

    @pmi0("article")
    public static final FaveGetItemTypeDto ARTICLE;

    @pmi0("clip")
    public static final FaveGetItemTypeDto CLIP;
    public static final Parcelable.Creator<FaveGetItemTypeDto> CREATOR;

    @pmi0("game")
    public static final FaveGetItemTypeDto GAME;

    @pmi0("link")
    public static final FaveGetItemTypeDto LINK;

    @pmi0("mini_app")
    public static final FaveGetItemTypeDto MINI_APP;

    @pmi0("narrative")
    public static final FaveGetItemTypeDto NARRATIVE;

    @pmi0("page")
    public static final FaveGetItemTypeDto PAGE;

    @pmi0("podcast")
    public static final FaveGetItemTypeDto PODCAST;

    @pmi0("post")
    public static final FaveGetItemTypeDto POST;

    @pmi0("product")
    public static final FaveGetItemTypeDto PRODUCT;

    @pmi0("video")
    public static final FaveGetItemTypeDto VIDEO;

    @pmi0("youla_product")
    public static final FaveGetItemTypeDto YOULA_PRODUCT;
    private final String value;

    /* compiled from: FaveGetItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<FaveGetItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveGetItemTypeDto createFromParcel(Parcel parcel) {
            return FaveGetItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FaveGetItemTypeDto[] newArray(int i) {
            return new FaveGetItemTypeDto[i];
        }
    }

    static {
        FaveGetItemTypeDto faveGetItemTypeDto = new FaveGetItemTypeDto("ARTICLE", 0, "article");
        ARTICLE = faveGetItemTypeDto;
        FaveGetItemTypeDto faveGetItemTypeDto2 = new FaveGetItemTypeDto("CLIP", 1, "clip");
        CLIP = faveGetItemTypeDto2;
        FaveGetItemTypeDto faveGetItemTypeDto3 = new FaveGetItemTypeDto("GAME", 2, "game");
        GAME = faveGetItemTypeDto3;
        FaveGetItemTypeDto faveGetItemTypeDto4 = new FaveGetItemTypeDto("LINK", 3, "link");
        LINK = faveGetItemTypeDto4;
        FaveGetItemTypeDto faveGetItemTypeDto5 = new FaveGetItemTypeDto("MINI_APP", 4, "mini_app");
        MINI_APP = faveGetItemTypeDto5;
        FaveGetItemTypeDto faveGetItemTypeDto6 = new FaveGetItemTypeDto("NARRATIVE", 5, "narrative");
        NARRATIVE = faveGetItemTypeDto6;
        FaveGetItemTypeDto faveGetItemTypeDto7 = new FaveGetItemTypeDto("PAGE", 6, "page");
        PAGE = faveGetItemTypeDto7;
        FaveGetItemTypeDto faveGetItemTypeDto8 = new FaveGetItemTypeDto("PODCAST", 7, "podcast");
        PODCAST = faveGetItemTypeDto8;
        FaveGetItemTypeDto faveGetItemTypeDto9 = new FaveGetItemTypeDto("POST", 8, "post");
        POST = faveGetItemTypeDto9;
        FaveGetItemTypeDto faveGetItemTypeDto10 = new FaveGetItemTypeDto("PRODUCT", 9, "product");
        PRODUCT = faveGetItemTypeDto10;
        FaveGetItemTypeDto faveGetItemTypeDto11 = new FaveGetItemTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 10, "video");
        VIDEO = faveGetItemTypeDto11;
        FaveGetItemTypeDto faveGetItemTypeDto12 = new FaveGetItemTypeDto("YOULA_PRODUCT", 11, "youla_product");
        YOULA_PRODUCT = faveGetItemTypeDto12;
        FaveGetItemTypeDto[] faveGetItemTypeDtoArr = {faveGetItemTypeDto, faveGetItemTypeDto2, faveGetItemTypeDto3, faveGetItemTypeDto4, faveGetItemTypeDto5, faveGetItemTypeDto6, faveGetItemTypeDto7, faveGetItemTypeDto8, faveGetItemTypeDto9, faveGetItemTypeDto10, faveGetItemTypeDto11, faveGetItemTypeDto12};
        $VALUES = faveGetItemTypeDtoArr;
        $ENTRIES = new asp(faveGetItemTypeDtoArr);
        CREATOR = new a();
    }

    private FaveGetItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FaveGetItemTypeDto valueOf(String str) {
        return (FaveGetItemTypeDto) Enum.valueOf(FaveGetItemTypeDto.class, str);
    }

    public static FaveGetItemTypeDto[] values() {
        return (FaveGetItemTypeDto[]) $VALUES.clone();
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
