package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketItemSkuReviewDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemSkuReviewDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemSkuReviewDto> CREATOR = new a();

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_update")
    private final Boolean canUpdate;

    @pmi0("comment")
    private final String comment;

    @pmi0("comments")
    private final MarketReviewCommentsDto comments;

    @pmi0("cons")
    private final String cons;

    @pmi0("date")
    private final int date;

    @pmi0("id")
    private final int id;

    @pmi0("item_id")
    private final int itemId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("pros")
    private final String pros;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final Float rating;

    @pmi0("source")
    private final SourceDto source;

    @pmi0("thumb")
    private final List<List<BaseImageDto>> thumb;

    @pmi0("user")
    private final UsersUserDto user;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketItemSkuReviewDto.kt */
    public static final class SourceDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SourceDto[] $VALUES;
        public static final Parcelable.Creator<SourceDto> CREATOR;

        @pmi0("1")
        public static final SourceDto OZON;

        @pmi0("0")
        public static final SourceDto VK;
        private final int value;

        /* compiled from: MarketItemSkuReviewDto.kt */
        public static final class a implements Parcelable.Creator<SourceDto> {
            @Override // android.os.Parcelable.Creator
            public final SourceDto createFromParcel(Parcel parcel) {
                return SourceDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SourceDto[] newArray(int i) {
                return new SourceDto[i];
            }
        }

        static {
            SourceDto sourceDto = new SourceDto("VK", 0, 0);
            VK = sourceDto;
            SourceDto sourceDto2 = new SourceDto("OZON", 1, 1);
            OZON = sourceDto2;
            SourceDto[] sourceDtoArr = {sourceDto, sourceDto2};
            $VALUES = sourceDtoArr;
            $ENTRIES = new asp(sourceDtoArr);
            CREATOR = new a();
        }

        private SourceDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static SourceDto valueOf(String str) {
            return (SourceDto) Enum.valueOf(SourceDto.class, str);
        }

        public static SourceDto[] values() {
            return (SourceDto[]) $VALUES.clone();
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

    /* compiled from: MarketItemSkuReviewDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemSkuReviewDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemSkuReviewDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            int i;
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            UsersUserDto usersUserDto = (UsersUserDto) parcel.readParcelable(MarketItemSkuReviewDto.class.getClassLoader());
            SourceDto createFromParcel = SourceDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(MarketItemSkuReviewDto.class.getClassLoader());
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString = parcel.readString();
            MarketReviewCommentsDto marketReviewCommentsDto = null;
            String readString2 = parcel.readString();
            Float f = valueOf3;
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                marketReviewCommentsDto = MarketReviewCommentsDto.CREATOR.createFromParcel(parcel);
            }
            MarketReviewCommentsDto marketReviewCommentsDto2 = marketReviewCommentsDto;
            if (parcel.readInt() == 0) {
                i = readInt;
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt4);
                i = readInt;
                int i2 = 0;
                while (i2 != readInt4) {
                    int i3 = i2;
                    int readInt5 = parcel.readInt();
                    int i4 = readInt2;
                    ArrayList arrayList3 = new ArrayList(readInt5);
                    int i5 = readInt3;
                    int i6 = 0;
                    while (i6 != readInt5) {
                        i6 = bo.b(MarketItemSkuReviewDto.class, parcel, arrayList3, i6, 1);
                        readInt5 = readInt5;
                    }
                    arrayList2.add(arrayList3);
                    i2 = i3 + 1;
                    readInt2 = i4;
                    readInt3 = i5;
                }
                arrayList = arrayList2;
            }
            return new MarketItemSkuReviewDto(i, readInt2, readInt3, usersUserDto, createFromParcel, userId, f, readString, readString2, readString3, valueOf, valueOf2, marketReviewCommentsDto2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemSkuReviewDto[] newArray(int i) {
            return new MarketItemSkuReviewDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketItemSkuReviewDto(int i, int i2, int i3, UsersUserDto usersUserDto, SourceDto sourceDto, UserId userId, Float f, String str, String str2, String str3, Boolean bool, Boolean bool2, MarketReviewCommentsDto marketReviewCommentsDto, List<? extends List<BaseImageDto>> list) {
        this.id = i;
        this.itemId = i2;
        this.date = i3;
        this.user = usersUserDto;
        this.source = sourceDto;
        this.ownerId = userId;
        this.rating = f;
        this.pros = str;
        this.cons = str2;
        this.comment = str3;
        this.canUpdate = bool;
        this.canDelete = bool2;
        this.comments = marketReviewCommentsDto;
        this.thumb = list;
    }

    public final Boolean d() {
        return this.canDelete;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemSkuReviewDto)) {
            return false;
        }
        MarketItemSkuReviewDto marketItemSkuReviewDto = (MarketItemSkuReviewDto) obj;
        return this.id == marketItemSkuReviewDto.id && this.itemId == marketItemSkuReviewDto.itemId && this.date == marketItemSkuReviewDto.date && epx.f(this.user, marketItemSkuReviewDto.user) && this.source == marketItemSkuReviewDto.source && epx.f(this.ownerId, marketItemSkuReviewDto.ownerId) && epx.f(this.rating, marketItemSkuReviewDto.rating) && epx.f(this.pros, marketItemSkuReviewDto.pros) && epx.f(this.cons, marketItemSkuReviewDto.cons) && epx.f(this.comment, marketItemSkuReviewDto.comment) && epx.f(this.canUpdate, marketItemSkuReviewDto.canUpdate) && epx.f(this.canDelete, marketItemSkuReviewDto.canDelete) && epx.f(this.comments, marketItemSkuReviewDto.comments) && epx.f(this.thumb, marketItemSkuReviewDto.thumb);
    }

    public final String f() {
        return this.comment;
    }

    public final MarketReviewCommentsDto g() {
        return this.comments;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.source.hashCode() + ((this.user.hashCode() + shy.a(this.date, shy.a(this.itemId, Integer.hashCode(this.id) * 31, 31), 31)) * 31)) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Float f = this.rating;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.pros;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cons;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.comment;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canUpdate;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canDelete;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MarketReviewCommentsDto marketReviewCommentsDto = this.comments;
        int hashCode9 = (hashCode8 + (marketReviewCommentsDto == null ? 0 : marketReviewCommentsDto.hashCode())) * 31;
        List<List<BaseImageDto>> list = this.thumb;
        return hashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String i() {
        return this.cons;
    }

    public final int j() {
        return this.date;
    }

    public final int k() {
        return this.itemId;
    }

    public final String l() {
        return this.pros;
    }

    public final Float n() {
        return this.rating;
    }

    public final SourceDto o() {
        return this.source;
    }

    public final List<List<BaseImageDto>> p() {
        return this.thumb;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemSkuReviewDto(id=");
        sb.append(this.id);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", pros=");
        sb.append(this.pros);
        sb.append(", cons=");
        sb.append(this.cons);
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", canUpdate=");
        sb.append(this.canUpdate);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", comments=");
        sb.append(this.comments);
        sb.append(", thumb=");
        return ms9.a(')', sb, this.thumb);
    }

    public final UsersUserDto u() {
        return this.user;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.itemId);
        parcel.writeInt(this.date);
        parcel.writeParcelable(this.user, i);
        this.source.writeToParcel(parcel, i);
        parcel.writeParcelable(this.ownerId, i);
        Float f = this.rating;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeString(this.pros);
        parcel.writeString(this.cons);
        parcel.writeString(this.comment);
        Boolean bool = this.canUpdate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canDelete;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        MarketReviewCommentsDto marketReviewCommentsDto = this.comments;
        if (marketReviewCommentsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketReviewCommentsDto.writeToParcel(parcel, i);
        }
        List<List<BaseImageDto>> list = this.thumb;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list, 1);
        while (f2.hasNext()) {
            Iterator a2 = ao.a(parcel, (List) f2.next());
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
        }
    }

    public /* synthetic */ MarketItemSkuReviewDto(int i, int i2, int i3, UsersUserDto usersUserDto, SourceDto sourceDto, UserId userId, Float f, String str, String str2, String str3, Boolean bool, Boolean bool2, MarketReviewCommentsDto marketReviewCommentsDto, List list, int i4, zcl zclVar) {
        this(i, i2, i3, usersUserDto, sourceDto, (i4 & 32) != 0 ? null : userId, (i4 & 64) != 0 ? null : f, (i4 & 128) != 0 ? null : str, (i4 & 256) != 0 ? null : str2, (i4 & 512) != 0 ? null : str3, (i4 & 1024) != 0 ? null : bool, (i4 & 2048) != 0 ? null : bool2, (i4 & 4096) != 0 ? null : marketReviewCommentsDto, (i4 & 8192) != 0 ? null : list);
    }
}
