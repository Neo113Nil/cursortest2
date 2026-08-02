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
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoGetSubscriptionsShortVideosResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetSubscriptionsShortVideosResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetSubscriptionsShortVideosResponseDto> CREATOR = new a();

    @pmi0("audios")
    private final List<ShortVideoAudioDto> audios;

    @pmi0("compilations")
    private final List<ShortVideoCompilationInfoDto> compilations;

    @pmi0("effects")
    private final List<MasksEffectDto> effects;

    @pmi0("feed")
    private final ShortVideoGetSubscriptionsShortVideosFeedDto feed;

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

    /* compiled from: ShortVideoGetSubscriptionsShortVideosResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetSubscriptionsShortVideosResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetSubscriptionsShortVideosResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ShortVideoGetSubscriptionsShortVideosFeedDto createFromParcel = ShortVideoGetSubscriptionsShortVideosFeedDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            ArrayList arrayList8 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(ShortVideoGetSubscriptionsShortVideosResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(ShortVideoGetSubscriptionsShortVideosResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(ShortVideoGetSubscriptionsShortVideosResponseDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = bo.b(ShortVideoGetSubscriptionsShortVideosResponseDto.class, parcel, arrayList4, i5, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                int i6 = 0;
                while (i6 != readInt5) {
                    i6 = bo.b(ShortVideoGetSubscriptionsShortVideosResponseDto.class, parcel, arrayList5, i6, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList6 = new ArrayList(readInt6);
                int i7 = 0;
                while (i7 != readInt6) {
                    i7 = bo.b(ShortVideoGetSubscriptionsShortVideosResponseDto.class, parcel, arrayList6, i7, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList7 = new ArrayList(readInt7);
                int i8 = 0;
                while (i8 != readInt7) {
                    i8 = bo.b(ShortVideoGetSubscriptionsShortVideosResponseDto.class, parcel, arrayList7, i8, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt8 = parcel.readInt();
                arrayList8 = new ArrayList(readInt8);
                while (i != readInt8) {
                    i = bo.b(ShortVideoGetSubscriptionsShortVideosResponseDto.class, parcel, arrayList8, i, 1);
                }
            }
            return new ShortVideoGetSubscriptionsShortVideosResponseDto(createFromParcel, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetSubscriptionsShortVideosResponseDto[] newArray(int i) {
            return new ShortVideoGetSubscriptionsShortVideosResponseDto[i];
        }
    }

    public ShortVideoGetSubscriptionsShortVideosResponseDto(ShortVideoGetSubscriptionsShortVideosFeedDto shortVideoGetSubscriptionsShortVideosFeedDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, List<MarketMarketItemDto> list3, List<PlacesPlaceDto> list4, List<MasksMaskDto> list5, List<MasksEffectDto> list6, List<ShortVideoAudioDto> list7, List<ShortVideoCompilationInfoDto> list8) {
        this.feed = shortVideoGetSubscriptionsShortVideosFeedDto;
        this.profiles = list;
        this.groups = list2;
        this.marketItems = list3;
        this.places = list4;
        this.masks = list5;
        this.effects = list6;
        this.audios = list7;
        this.compilations = list8;
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
        if (!(obj instanceof ShortVideoGetSubscriptionsShortVideosResponseDto)) {
            return false;
        }
        ShortVideoGetSubscriptionsShortVideosResponseDto shortVideoGetSubscriptionsShortVideosResponseDto = (ShortVideoGetSubscriptionsShortVideosResponseDto) obj;
        return epx.f(this.feed, shortVideoGetSubscriptionsShortVideosResponseDto.feed) && epx.f(this.profiles, shortVideoGetSubscriptionsShortVideosResponseDto.profiles) && epx.f(this.groups, shortVideoGetSubscriptionsShortVideosResponseDto.groups) && epx.f(this.marketItems, shortVideoGetSubscriptionsShortVideosResponseDto.marketItems) && epx.f(this.places, shortVideoGetSubscriptionsShortVideosResponseDto.places) && epx.f(this.masks, shortVideoGetSubscriptionsShortVideosResponseDto.masks) && epx.f(this.effects, shortVideoGetSubscriptionsShortVideosResponseDto.effects) && epx.f(this.audios, shortVideoGetSubscriptionsShortVideosResponseDto.audios) && epx.f(this.compilations, shortVideoGetSubscriptionsShortVideosResponseDto.compilations);
    }

    public final ShortVideoGetSubscriptionsShortVideosFeedDto f() {
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
        List<MarketMarketItemDto> list3 = this.marketItems;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PlacesPlaceDto> list4 = this.places;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<MasksMaskDto> list5 = this.masks;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<MasksEffectDto> list6 = this.effects;
        int hashCode7 = (hashCode6 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<ShortVideoAudioDto> list7 = this.audios;
        int hashCode8 = (hashCode7 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<ShortVideoCompilationInfoDto> list8 = this.compilations;
        return hashCode8 + (list8 != null ? list8.hashCode() : 0);
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
        StringBuilder sb = new StringBuilder("ShortVideoGetSubscriptionsShortVideosResponseDto(feed=");
        sb.append(this.feed);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
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
        return ms9.a(')', sb, this.compilations);
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
        List<MarketMarketItemDto> list3 = this.marketItems;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<PlacesPlaceDto> list4 = this.places;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        List<MasksMaskDto> list5 = this.masks;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        List<MasksEffectDto> list6 = this.effects;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
            }
        }
        List<ShortVideoAudioDto> list7 = this.audios;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }
        List<ShortVideoCompilationInfoDto> list8 = this.compilations;
        if (list8 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f8 = dn.f(parcel, list8, 1);
        while (f8.hasNext()) {
            parcel.writeParcelable((Parcelable) f8.next(), i);
        }
    }

    public /* synthetic */ ShortVideoGetSubscriptionsShortVideosResponseDto(ShortVideoGetSubscriptionsShortVideosFeedDto shortVideoGetSubscriptionsShortVideosFeedDto, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, zcl zclVar) {
        this(shortVideoGetSubscriptionsShortVideosFeedDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : list5, (i & 64) != 0 ? null : list6, (i & 128) != 0 ? null : list7, (i & 256) != 0 ? null : list8);
    }
}
