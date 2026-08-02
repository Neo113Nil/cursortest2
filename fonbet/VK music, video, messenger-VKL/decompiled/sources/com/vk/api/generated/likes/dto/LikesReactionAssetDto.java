package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LikesReactionAssetDto.kt */
/* loaded from: classes14.dex */
public final class LikesReactionAssetDto implements Parcelable {
    public static final Parcelable.Creator<LikesReactionAssetDto> CREATOR = new a();

    @pmi0("animation_url")
    private final String animationUrl;

    @pmi0("images")
    private final List<LikesReactionImageMetaDto> images;

    @pmi0("splash_animation_url")
    private final String splashAnimationUrl;

    @pmi0("title")
    private final LikesReactionTitleDto title;

    @pmi0("title_color")
    private final LikesReactionLegacyColorDto titleColor;

    /* compiled from: LikesReactionAssetDto.kt */
    public static final class a implements Parcelable.Creator<LikesReactionAssetDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesReactionAssetDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(LikesReactionImageMetaDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new LikesReactionAssetDto(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LikesReactionTitleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LikesReactionLegacyColorDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final LikesReactionAssetDto[] newArray(int i) {
            return new LikesReactionAssetDto[i];
        }
    }

    public LikesReactionAssetDto(List<LikesReactionImageMetaDto> list, String str, String str2, LikesReactionTitleDto likesReactionTitleDto, LikesReactionLegacyColorDto likesReactionLegacyColorDto) {
        this.images = list;
        this.animationUrl = str;
        this.splashAnimationUrl = str2;
        this.title = likesReactionTitleDto;
        this.titleColor = likesReactionLegacyColorDto;
    }

    public final String d() {
        return this.animationUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<LikesReactionImageMetaDto> e() {
        return this.images;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesReactionAssetDto)) {
            return false;
        }
        LikesReactionAssetDto likesReactionAssetDto = (LikesReactionAssetDto) obj;
        return epx.f(this.images, likesReactionAssetDto.images) && epx.f(this.animationUrl, likesReactionAssetDto.animationUrl) && epx.f(this.splashAnimationUrl, likesReactionAssetDto.splashAnimationUrl) && epx.f(this.title, likesReactionAssetDto.title) && epx.f(this.titleColor, likesReactionAssetDto.titleColor);
    }

    public final LikesReactionTitleDto f() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.images.hashCode() * 31;
        String str = this.animationUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.splashAnimationUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LikesReactionTitleDto likesReactionTitleDto = this.title;
        int hashCode4 = (hashCode3 + (likesReactionTitleDto == null ? 0 : likesReactionTitleDto.hashCode())) * 31;
        LikesReactionLegacyColorDto likesReactionLegacyColorDto = this.titleColor;
        return hashCode4 + (likesReactionLegacyColorDto != null ? likesReactionLegacyColorDto.hashCode() : 0);
    }

    public final String toString() {
        return "LikesReactionAssetDto(images=" + this.images + ", animationUrl=" + this.animationUrl + ", splashAnimationUrl=" + this.splashAnimationUrl + ", title=" + this.title + ", titleColor=" + this.titleColor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.images);
        while (a2.hasNext()) {
            ((LikesReactionImageMetaDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.animationUrl);
        parcel.writeString(this.splashAnimationUrl);
        LikesReactionTitleDto likesReactionTitleDto = this.title;
        if (likesReactionTitleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            likesReactionTitleDto.writeToParcel(parcel, i);
        }
        LikesReactionLegacyColorDto likesReactionLegacyColorDto = this.titleColor;
        if (likesReactionLegacyColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            likesReactionLegacyColorDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ LikesReactionAssetDto(List list, String str, String str2, LikesReactionTitleDto likesReactionTitleDto, LikesReactionLegacyColorDto likesReactionLegacyColorDto, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : likesReactionTitleDto, (i & 16) != 0 ? null : likesReactionLegacyColorDto);
    }
}
