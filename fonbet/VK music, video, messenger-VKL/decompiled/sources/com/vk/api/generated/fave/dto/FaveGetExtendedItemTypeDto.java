package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveGetExtendedItemTypeDto.kt */
/* loaded from: classes14.dex */
public final class FaveGetExtendedItemTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveGetExtendedItemTypeDto[] $VALUES;

    @pmi0("article")
    public static final FaveGetExtendedItemTypeDto ARTICLE;

    @pmi0("clip")
    public static final FaveGetExtendedItemTypeDto CLIP;
    public static final Parcelable.Creator<FaveGetExtendedItemTypeDto> CREATOR;

    @pmi0("game")
    public static final FaveGetExtendedItemTypeDto GAME;

    @pmi0("link")
    public static final FaveGetExtendedItemTypeDto LINK;

    @pmi0("mini_app")
    public static final FaveGetExtendedItemTypeDto MINI_APP;

    @pmi0("narrative")
    public static final FaveGetExtendedItemTypeDto NARRATIVE;

    @pmi0("page")
    public static final FaveGetExtendedItemTypeDto PAGE;

    @pmi0("podcast")
    public static final FaveGetExtendedItemTypeDto PODCAST;

    @pmi0("post")
    public static final FaveGetExtendedItemTypeDto POST;

    @pmi0("product")
    public static final FaveGetExtendedItemTypeDto PRODUCT;

    @pmi0("video")
    public static final FaveGetExtendedItemTypeDto VIDEO;

    @pmi0("youla_product")
    public static final FaveGetExtendedItemTypeDto YOULA_PRODUCT;
    private final String value;

    /* compiled from: FaveGetExtendedItemTypeDto.kt */
    public static final class a implements Parcelable.Creator<FaveGetExtendedItemTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveGetExtendedItemTypeDto createFromParcel(Parcel parcel) {
            return FaveGetExtendedItemTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FaveGetExtendedItemTypeDto[] newArray(int i) {
            return new FaveGetExtendedItemTypeDto[i];
        }
    }

    static {
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto = new FaveGetExtendedItemTypeDto("ARTICLE", 0, "article");
        ARTICLE = faveGetExtendedItemTypeDto;
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto2 = new FaveGetExtendedItemTypeDto("CLIP", 1, "clip");
        CLIP = faveGetExtendedItemTypeDto2;
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto3 = new FaveGetExtendedItemTypeDto("GAME", 2, "game");
        GAME = faveGetExtendedItemTypeDto3;
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto4 = new FaveGetExtendedItemTypeDto("LINK", 3, "link");
        LINK = faveGetExtendedItemTypeDto4;
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto5 = new FaveGetExtendedItemTypeDto("MINI_APP", 4, "mini_app");
        MINI_APP = faveGetExtendedItemTypeDto5;
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto6 = new FaveGetExtendedItemTypeDto("NARRATIVE", 5, "narrative");
        NARRATIVE = faveGetExtendedItemTypeDto6;
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto7 = new FaveGetExtendedItemTypeDto("PAGE", 6, "page");
        PAGE = faveGetExtendedItemTypeDto7;
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto8 = new FaveGetExtendedItemTypeDto("PODCAST", 7, "podcast");
        PODCAST = faveGetExtendedItemTypeDto8;
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto9 = new FaveGetExtendedItemTypeDto("POST", 8, "post");
        POST = faveGetExtendedItemTypeDto9;
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto10 = new FaveGetExtendedItemTypeDto("PRODUCT", 9, "product");
        PRODUCT = faveGetExtendedItemTypeDto10;
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto11 = new FaveGetExtendedItemTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 10, "video");
        VIDEO = faveGetExtendedItemTypeDto11;
        FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto12 = new FaveGetExtendedItemTypeDto("YOULA_PRODUCT", 11, "youla_product");
        YOULA_PRODUCT = faveGetExtendedItemTypeDto12;
        FaveGetExtendedItemTypeDto[] faveGetExtendedItemTypeDtoArr = {faveGetExtendedItemTypeDto, faveGetExtendedItemTypeDto2, faveGetExtendedItemTypeDto3, faveGetExtendedItemTypeDto4, faveGetExtendedItemTypeDto5, faveGetExtendedItemTypeDto6, faveGetExtendedItemTypeDto7, faveGetExtendedItemTypeDto8, faveGetExtendedItemTypeDto9, faveGetExtendedItemTypeDto10, faveGetExtendedItemTypeDto11, faveGetExtendedItemTypeDto12};
        $VALUES = faveGetExtendedItemTypeDtoArr;
        $ENTRIES = new asp(faveGetExtendedItemTypeDtoArr);
        CREATOR = new a();
    }

    private FaveGetExtendedItemTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FaveGetExtendedItemTypeDto valueOf(String str) {
        return (FaveGetExtendedItemTypeDto) Enum.valueOf(FaveGetExtendedItemTypeDto.class, str);
    }

    public static FaveGetExtendedItemTypeDto[] values() {
        return (FaveGetExtendedItemTypeDto[]) $VALUES.clone();
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
