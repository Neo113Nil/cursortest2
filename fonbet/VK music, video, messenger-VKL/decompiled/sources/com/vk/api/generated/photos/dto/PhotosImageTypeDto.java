package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import ru.ok.android.utils.Logger;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotosImageTypeDto.kt */
/* loaded from: classes15.dex */
public final class PhotosImageTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotosImageTypeDto[] $VALUES;

    @pmi0("base")
    public static final PhotosImageTypeDto BASE;
    public static final Parcelable.Creator<PhotosImageTypeDto> CREATOR;

    @pmi0("l")
    public static final PhotosImageTypeDto L;

    @pmi0(InneractiveMediationDefs.GENDER_MALE)
    public static final PhotosImageTypeDto M;

    @pmi0("o")
    public static final PhotosImageTypeDto O;

    @pmi0(TtmlNode.TAG_P)
    public static final PhotosImageTypeDto P;

    @pmi0(CampaignEx.JSON_KEY_AD_Q)
    public static final PhotosImageTypeDto Q;

    @pmi0("r")
    public static final PhotosImageTypeDto R;

    @pmi0(UcumUtils.UCUM_SECONDS)
    public static final PhotosImageTypeDto S;

    @pmi0(Logger.METHOD_W)
    public static final PhotosImageTypeDto W;

    @pmi0("x")
    public static final PhotosImageTypeDto X;

    @pmi0("y")
    public static final PhotosImageTypeDto Y;

    @pmi0("z")
    public static final PhotosImageTypeDto Z;
    private final String value;

    /* compiled from: PhotosImageTypeDto.kt */
    public static final class a implements Parcelable.Creator<PhotosImageTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosImageTypeDto createFromParcel(Parcel parcel) {
            return PhotosImageTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosImageTypeDto[] newArray(int i) {
            return new PhotosImageTypeDto[i];
        }
    }

    static {
        PhotosImageTypeDto photosImageTypeDto = new PhotosImageTypeDto("S", 0, UcumUtils.UCUM_SECONDS);
        S = photosImageTypeDto;
        PhotosImageTypeDto photosImageTypeDto2 = new PhotosImageTypeDto("M", 1, InneractiveMediationDefs.GENDER_MALE);
        M = photosImageTypeDto2;
        PhotosImageTypeDto photosImageTypeDto3 = new PhotosImageTypeDto("X", 2, "x");
        X = photosImageTypeDto3;
        PhotosImageTypeDto photosImageTypeDto4 = new PhotosImageTypeDto("L", 3, "l");
        L = photosImageTypeDto4;
        PhotosImageTypeDto photosImageTypeDto5 = new PhotosImageTypeDto("O", 4, "o");
        O = photosImageTypeDto5;
        PhotosImageTypeDto photosImageTypeDto6 = new PhotosImageTypeDto("P", 5, TtmlNode.TAG_P);
        P = photosImageTypeDto6;
        PhotosImageTypeDto photosImageTypeDto7 = new PhotosImageTypeDto("Q", 6, CampaignEx.JSON_KEY_AD_Q);
        Q = photosImageTypeDto7;
        PhotosImageTypeDto photosImageTypeDto8 = new PhotosImageTypeDto("R", 7, "r");
        R = photosImageTypeDto8;
        PhotosImageTypeDto photosImageTypeDto9 = new PhotosImageTypeDto("Y", 8, "y");
        Y = photosImageTypeDto9;
        PhotosImageTypeDto photosImageTypeDto10 = new PhotosImageTypeDto("Z", 9, "z");
        Z = photosImageTypeDto10;
        PhotosImageTypeDto photosImageTypeDto11 = new PhotosImageTypeDto("W", 10, Logger.METHOD_W);
        W = photosImageTypeDto11;
        PhotosImageTypeDto photosImageTypeDto12 = new PhotosImageTypeDto("BASE", 11, "base");
        BASE = photosImageTypeDto12;
        PhotosImageTypeDto[] photosImageTypeDtoArr = {photosImageTypeDto, photosImageTypeDto2, photosImageTypeDto3, photosImageTypeDto4, photosImageTypeDto5, photosImageTypeDto6, photosImageTypeDto7, photosImageTypeDto8, photosImageTypeDto9, photosImageTypeDto10, photosImageTypeDto11, photosImageTypeDto12};
        $VALUES = photosImageTypeDtoArr;
        $ENTRIES = new asp(photosImageTypeDtoArr);
        CREATOR = new a();
    }

    private PhotosImageTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static PhotosImageTypeDto valueOf(String str) {
        return (PhotosImageTypeDto) Enum.valueOf(PhotosImageTypeDto.class, str);
    }

    public static PhotosImageTypeDto[] values() {
        return (PhotosImageTypeDto[]) $VALUES.clone();
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
