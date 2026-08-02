package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseStickerDto;
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

/* compiled from: StoreStickersKeywordDto.kt */
/* loaded from: classes15.dex */
public final class StoreStickersKeywordDto implements Parcelable {
    public static final Parcelable.Creator<StoreStickersKeywordDto> CREATOR = new a();

    @pmi0("promoted_stickers")
    private final List<BaseStickerDto> promotedStickers;

    @pmi0("special_items")
    private final List<StoreStickersKeywordSpecialItemDto> specialItems;

    @pmi0("stickers")
    private final List<StoreStickersKeywordStickerDto> stickers;

    @pmi0("user_stickers")
    private final List<BaseStickerDto> userStickers;

    @pmi0("words")
    private final List<String> words;

    /* compiled from: StoreStickersKeywordDto.kt */
    public static final class a implements Parcelable.Creator<StoreStickersKeywordDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreStickersKeywordDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int i = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(StoreStickersKeywordDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(StoreStickersKeywordDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(StoreStickersKeywordStickerDto.CREATOR, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(StoreStickersKeywordSpecialItemDto.CREATOR, parcel, arrayList4, i, 1);
                }
            }
            return new StoreStickersKeywordDto(createStringArrayList, arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreStickersKeywordDto[] newArray(int i) {
            return new StoreStickersKeywordDto[i];
        }
    }

    public StoreStickersKeywordDto(List<String> list, List<BaseStickerDto> list2, List<BaseStickerDto> list3, List<StoreStickersKeywordStickerDto> list4, List<StoreStickersKeywordSpecialItemDto> list5) {
        this.words = list;
        this.userStickers = list2;
        this.promotedStickers = list3;
        this.stickers = list4;
        this.specialItems = list5;
    }

    public final List<StoreStickersKeywordSpecialItemDto> d() {
        return this.specialItems;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<StoreStickersKeywordStickerDto> e() {
        return this.stickers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStickersKeywordDto)) {
            return false;
        }
        StoreStickersKeywordDto storeStickersKeywordDto = (StoreStickersKeywordDto) obj;
        return epx.f(this.words, storeStickersKeywordDto.words) && epx.f(this.userStickers, storeStickersKeywordDto.userStickers) && epx.f(this.promotedStickers, storeStickersKeywordDto.promotedStickers) && epx.f(this.stickers, storeStickersKeywordDto.stickers) && epx.f(this.specialItems, storeStickersKeywordDto.specialItems);
    }

    public final List<BaseStickerDto> f() {
        return this.userStickers;
    }

    public final List<String> g() {
        return this.words;
    }

    public final int hashCode() {
        int hashCode = this.words.hashCode() * 31;
        List<BaseStickerDto> list = this.userStickers;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseStickerDto> list2 = this.promotedStickers;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StoreStickersKeywordStickerDto> list3 = this.stickers;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<StoreStickersKeywordSpecialItemDto> list4 = this.specialItems;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreStickersKeywordDto(words=");
        sb.append(this.words);
        sb.append(", userStickers=");
        sb.append(this.userStickers);
        sb.append(", promotedStickers=");
        sb.append(this.promotedStickers);
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append(", specialItems=");
        return ms9.a(')', sb, this.specialItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.words);
        List<BaseStickerDto> list = this.userStickers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseStickerDto> list2 = this.promotedStickers;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<StoreStickersKeywordStickerDto> list3 = this.stickers;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((StoreStickersKeywordStickerDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<StoreStickersKeywordSpecialItemDto> list4 = this.specialItems;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            ((StoreStickersKeywordSpecialItemDto) f4.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StoreStickersKeywordDto(List list, List list2, List list3, List list4, List list5, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5);
    }
}
