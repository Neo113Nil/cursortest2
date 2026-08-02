package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.masks.dto.MasksEffectDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoGetRecomResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetRecomResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetRecomResponseDto> CREATOR = new a();

    @pmi0("alternative_items")
    private final List<ShortVideoRecomAlternativeItemDto> alternativeItems;

    @pmi0("audios")
    private final List<ShortVideoAudioDto> audios;

    @pmi0("compilations")
    private final List<ShortVideoCompilationInfoDto> compilations;

    @pmi0("effects")
    private final List<MasksEffectDto> effects;

    @pmi0("external_owners")
    private final List<ShortVideoExternalOwnerDto> externalOwners;

    @pmi0("feed")
    private final ShortVideoRecomFeedDto feed;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("market_items")
    private final List<MarketMarketItemDto> marketItems;

    @pmi0("masks")
    private final List<MasksMaskDto> masks;

    @pmi0("places")
    private final List<PlacesPlaceDto> places;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: ShortVideoGetRecomResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetRecomResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetRecomResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ShortVideoRecomFeedDto createFromParcel = ShortVideoRecomFeedDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList10 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ShortVideoGetRecomResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(ShortVideoGetRecomResponseDto.class, parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(ShortVideoExternalOwnerDto.CREATOR, parcel, arrayList3, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(ShortVideoGetRecomResponseDto.class, parcel, arrayList4, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(ShortVideoGetRecomResponseDto.class, parcel, arrayList5, i5, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList6 = new ArrayList(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = bo.b(ShortVideoGetRecomResponseDto.class, parcel, arrayList6, i6, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList7 = new ArrayList(readInt7);
                int i7 = 0;
                while (i7 != readInt7) {
                    i7 = bo.b(ShortVideoGetRecomResponseDto.class, parcel, arrayList7, i7, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList8 = new ArrayList(readInt8);
                int i8 = 0;
                while (i8 != readInt8) {
                    i8 = bo.b(ShortVideoGetRecomResponseDto.class, parcel, arrayList8, i8, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int readInt9 = parcel.readInt();
                arrayList9 = new ArrayList(readInt9);
                int i9 = 0;
                while (i9 != readInt9) {
                    i9 = bo.b(ShortVideoGetRecomResponseDto.class, parcel, arrayList9, i9, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt10 = parcel.readInt();
                arrayList10 = new ArrayList(readInt10);
                int i10 = 0;
                while (i10 != readInt10) {
                    i10 = en.a(ShortVideoRecomAlternativeItemDto.CREATOR, parcel, arrayList10, i10, 1);
                }
            }
            return new ShortVideoGetRecomResponseDto(createFromParcel, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetRecomResponseDto[] newArray(int i) {
            return new ShortVideoGetRecomResponseDto[i];
        }
    }

    public ShortVideoGetRecomResponseDto(ShortVideoRecomFeedDto shortVideoRecomFeedDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, List<ShortVideoExternalOwnerDto> list3, List<MarketMarketItemDto> list4, List<PlacesPlaceDto> list5, List<MasksMaskDto> list6, List<MasksEffectDto> list7, List<ShortVideoAudioDto> list8, List<ShortVideoCompilationInfoDto> list9, List<ShortVideoRecomAlternativeItemDto> list10) {
        this.feed = shortVideoRecomFeedDto;
        this.profiles = list;
        this.groups = list2;
        this.externalOwners = list3;
        this.marketItems = list4;
        this.places = list5;
        this.masks = list6;
        this.effects = list7;
        this.audios = list8;
        this.compilations = list9;
        this.alternativeItems = list10;
    }

    public final List<MasksMaskDto> H2() {
        return this.masks;
    }

    public final List<ShortVideoCompilationInfoDto> H4() {
        return this.compilations;
    }

    public final List<ShortVideoAudioDto> d() {
        return this.audios;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MasksEffectDto> e() {
        return this.effects;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGetRecomResponseDto)) {
            return false;
        }
        ShortVideoGetRecomResponseDto shortVideoGetRecomResponseDto = (ShortVideoGetRecomResponseDto) obj;
        return epx.f(this.feed, shortVideoGetRecomResponseDto.feed) && epx.f(this.profiles, shortVideoGetRecomResponseDto.profiles) && epx.f(this.groups, shortVideoGetRecomResponseDto.groups) && epx.f(this.externalOwners, shortVideoGetRecomResponseDto.externalOwners) && epx.f(this.marketItems, shortVideoGetRecomResponseDto.marketItems) && epx.f(this.places, shortVideoGetRecomResponseDto.places) && epx.f(this.masks, shortVideoGetRecomResponseDto.masks) && epx.f(this.effects, shortVideoGetRecomResponseDto.effects) && epx.f(this.audios, shortVideoGetRecomResponseDto.audios) && epx.f(this.compilations, shortVideoGetRecomResponseDto.compilations) && epx.f(this.alternativeItems, shortVideoGetRecomResponseDto.alternativeItems);
    }

    public final ShortVideoRecomFeedDto f() {
        return this.feed;
    }

    public final List<GroupsGroupFullDto> g() {
        return this.groups;
    }

    public final int hashCode() {
        int hashCode = this.feed.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ShortVideoExternalOwnerDto> list3 = this.externalOwners;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MarketMarketItemDto> list4 = this.marketItems;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<PlacesPlaceDto> list5 = this.places;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<MasksMaskDto> list6 = this.masks;
        int hashCode7 = (hashCode6 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<MasksEffectDto> list7 = this.effects;
        int hashCode8 = (hashCode7 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<ShortVideoAudioDto> list8 = this.audios;
        int hashCode9 = (hashCode8 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<ShortVideoCompilationInfoDto> list9 = this.compilations;
        int hashCode10 = (hashCode9 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<ShortVideoRecomAlternativeItemDto> list10 = this.alternativeItems;
        return hashCode10 + (list10 != null ? list10.hashCode() : 0);
    }

    public final List<MarketMarketItemDto> i() {
        return this.marketItems;
    }

    public final List<PlacesPlaceDto> j() {
        return this.places;
    }

    public final List<UsersUserFullDto> k() {
        return this.profiles;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetRecomResponseDto(feed=");
        sb.append(this.feed);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", externalOwners=");
        sb.append(this.externalOwners);
        sb.append(", marketItems=");
        sb.append(this.marketItems);
        sb.append(", places=");
        sb.append(this.places);
        sb.append(", masks=");
        sb.append(this.masks);
        sb.append(", effects=");
        sb.append(this.effects);
        sb.append(", audios=");
        sb.append(this.audios);
        sb.append(", compilations=");
        sb.append(this.compilations);
        sb.append(", alternativeItems=");
        return ms9.a(')', sb, this.alternativeItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.feed.writeToParcel(parcel, i);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<ShortVideoExternalOwnerDto> list3 = this.externalOwners;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((ShortVideoExternalOwnerDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketMarketItemDto> list4 = this.marketItems;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        List<PlacesPlaceDto> list5 = this.places;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        List<MasksMaskDto> list6 = this.masks;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
            }
        }
        List<MasksEffectDto> list7 = this.effects;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }
        List<ShortVideoAudioDto> list8 = this.audios;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list8, 1);
            while (f8.hasNext()) {
                parcel.writeParcelable((Parcelable) f8.next(), i);
            }
        }
        List<ShortVideoCompilationInfoDto> list9 = this.compilations;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list9, 1);
            while (f9.hasNext()) {
                parcel.writeParcelable((Parcelable) f9.next(), i);
            }
        }
        List<ShortVideoRecomAlternativeItemDto> list10 = this.alternativeItems;
        if (list10 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f10 = dn.f(parcel, list10, 1);
        while (f10.hasNext()) {
            ((ShortVideoRecomAlternativeItemDto) f10.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ShortVideoGetRecomResponseDto(ShortVideoRecomFeedDto shortVideoRecomFeedDto, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, int i, zcl zclVar) {
        this(shortVideoRecomFeedDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : list5, (i & 64) != 0 ? null : list6, (i & 128) != 0 ? null : list7, (i & 256) != 0 ? null : list8, (i & 512) != 0 ? null : list9, (i & 1024) != 0 ? null : list10);
    }
}
