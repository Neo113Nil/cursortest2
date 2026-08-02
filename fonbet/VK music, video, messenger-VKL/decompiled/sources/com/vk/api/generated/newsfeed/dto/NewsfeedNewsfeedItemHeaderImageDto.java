package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedNewsfeedItemHeaderImageDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderImageDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderImageDto> CREATOR = new a();

    @pmi0("color")
    private final NewsfeedNewsfeedItemColorDto color;

    @pmi0(CampaignEx.JSON_KEY_IMAGE_URL)
    private final String imageUrl;

    @pmi0("name")
    private final String name;

    @pmi0("sizes")
    private final List<PhotosPhotoSizesDto> sizes;

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0("source_ids")
    private final List<UserId> sourceIds;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedNewsfeedItemHeaderImageDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("circle")
        public static final StyleDto CIRCLE;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("square")
        public static final StyleDto SQUARE;

        @pmi0("squircle")
        public static final StyleDto SQUIRCLE;
        private final String value;

        /* compiled from: NewsfeedNewsfeedItemHeaderImageDto.kt */
        public static final class a implements Parcelable.Creator<StyleDto> {
            @Override // android.os.Parcelable.Creator
            public final StyleDto createFromParcel(Parcel parcel) {
                return StyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StyleDto[] newArray(int i) {
                return new StyleDto[i];
            }
        }

        static {
            StyleDto styleDto = new StyleDto("CIRCLE", 0, "circle");
            CIRCLE = styleDto;
            StyleDto styleDto2 = new StyleDto("SQUARE", 1, "square");
            SQUARE = styleDto2;
            StyleDto styleDto3 = new StyleDto("SQUIRCLE", 2, "squircle");
            SQUIRCLE = styleDto3;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
            CREATOR = new a();
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
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

    /* compiled from: NewsfeedNewsfeedItemHeaderImageDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderImageDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderImageDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            UserId userId = (UserId) parcel.readParcelable(NewsfeedNewsfeedItemHeaderImageDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NewsfeedNewsfeedItemHeaderImageDto.class, parcel, arrayList, i, 1);
                }
                arrayList2 = null;
            }
            String readString = parcel.readString();
            int i2 = 0;
            ArrayList arrayList4 = arrayList;
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                while (i2 != readInt2) {
                    i2 = bo.b(NewsfeedNewsfeedItemHeaderImageDto.class, parcel, arrayList5, i2, 1);
                }
                arrayList3 = arrayList5;
            }
            return new NewsfeedNewsfeedItemHeaderImageDto(userId, arrayList4, readString, readString2, arrayList3, (StyleDto) (parcel.readInt() == 0 ? arrayList2 : StyleDto.CREATOR.createFromParcel(parcel)), (NewsfeedNewsfeedItemColorDto) (parcel.readInt() == 0 ? arrayList2 : NewsfeedNewsfeedItemColorDto.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderImageDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderImageDto[i];
        }
    }

    public NewsfeedNewsfeedItemHeaderImageDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final NewsfeedNewsfeedItemColorDto d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderImageDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = (NewsfeedNewsfeedItemHeaderImageDto) obj;
        return epx.f(this.sourceId, newsfeedNewsfeedItemHeaderImageDto.sourceId) && epx.f(this.sourceIds, newsfeedNewsfeedItemHeaderImageDto.sourceIds) && epx.f(this.imageUrl, newsfeedNewsfeedItemHeaderImageDto.imageUrl) && epx.f(this.name, newsfeedNewsfeedItemHeaderImageDto.name) && epx.f(this.sizes, newsfeedNewsfeedItemHeaderImageDto.sizes) && this.style == newsfeedNewsfeedItemHeaderImageDto.style && epx.f(this.color, newsfeedNewsfeedItemHeaderImageDto.color);
    }

    public final String f() {
        return this.name;
    }

    public final List<PhotosPhotoSizesDto> g() {
        return this.sizes;
    }

    public final int hashCode() {
        UserId userId = this.sourceId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        List<UserId> list = this.sourceIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.imageUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PhotosPhotoSizesDto> list2 = this.sizes;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        StyleDto styleDto = this.style;
        int hashCode6 = (hashCode5 + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = this.color;
        return hashCode6 + (newsfeedNewsfeedItemColorDto != null ? newsfeedNewsfeedItemColorDto.hashCode() : 0);
    }

    public final UserId i() {
        return this.sourceId;
    }

    public final List<UserId> j() {
        return this.sourceIds;
    }

    public final StyleDto k() {
        return this.style;
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderImageDto(sourceId=" + this.sourceId + ", sourceIds=" + this.sourceIds + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", sizes=" + this.sizes + ", style=" + this.style + ", color=" + this.color + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.sourceId, i);
        List<UserId> list = this.sourceIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.name);
        List<PhotosPhotoSizesDto> list2 = this.sizes;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = this.color;
        if (newsfeedNewsfeedItemColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemColorDto.writeToParcel(parcel, i);
        }
    }

    public NewsfeedNewsfeedItemHeaderImageDto(UserId userId, List<UserId> list, String str, String str2, List<PhotosPhotoSizesDto> list2, StyleDto styleDto, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto) {
        this.sourceId = userId;
        this.sourceIds = list;
        this.imageUrl = str;
        this.name = str2;
        this.sizes = list2;
        this.style = styleDto;
        this.color = newsfeedNewsfeedItemColorDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderImageDto(UserId userId, List list, String str, String str2, List list2, StyleDto styleDto, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : styleDto, (i & 64) != 0 ? null : newsfeedNewsfeedItemColorDto);
    }
}
