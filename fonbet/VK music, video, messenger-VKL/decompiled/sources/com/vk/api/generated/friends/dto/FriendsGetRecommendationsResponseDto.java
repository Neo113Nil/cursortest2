package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsGetRecommendationsResponseDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetRecommendationsResponseDto implements Parcelable {
    public static final Parcelable.Creator<FriendsGetRecommendationsResponseDto> CREATOR = new a();

    @pmi0("account_import_block_pos")
    private final Integer accountImportBlockPos;

    @pmi0("count")
    private final int count;

    @pmi0("info_card")
    private final FriendsRecBlockInfoCardDto infoCard;

    @pmi0("items")
    private final List<FriendsUserRecommendationsDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: FriendsGetRecommendationsResponseDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetRecommendationsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetRecommendationsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(FriendsUserRecommendationsDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new FriendsGetRecommendationsResponseDto(readInt, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? FriendsRecBlockInfoCardDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetRecommendationsResponseDto[] newArray(int i) {
            return new FriendsGetRecommendationsResponseDto[i];
        }
    }

    public FriendsGetRecommendationsResponseDto(int i, List<FriendsUserRecommendationsDto> list, String str, Integer num, String str2, String str3, FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto) {
        this.count = i;
        this.items = list;
        this.nextFrom = str;
        this.accountImportBlockPos = num;
        this.title = str2;
        this.trackCode = str3;
        this.infoCard = friendsRecBlockInfoCardDto;
    }

    public final FriendsRecBlockInfoCardDto d() {
        return this.infoCard;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<FriendsUserRecommendationsDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsGetRecommendationsResponseDto)) {
            return false;
        }
        FriendsGetRecommendationsResponseDto friendsGetRecommendationsResponseDto = (FriendsGetRecommendationsResponseDto) obj;
        return this.count == friendsGetRecommendationsResponseDto.count && epx.f(this.items, friendsGetRecommendationsResponseDto.items) && epx.f(this.nextFrom, friendsGetRecommendationsResponseDto.nextFrom) && epx.f(this.accountImportBlockPos, friendsGetRecommendationsResponseDto.accountImportBlockPos) && epx.f(this.title, friendsGetRecommendationsResponseDto.title) && epx.f(this.trackCode, friendsGetRecommendationsResponseDto.trackCode) && epx.f(this.infoCard, friendsGetRecommendationsResponseDto.infoCard);
    }

    public final String f() {
        return this.nextFrom;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.nextFrom;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.accountImportBlockPos;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackCode;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto = this.infoCard;
        return hashCode4 + (friendsRecBlockInfoCardDto != null ? friendsRecBlockInfoCardDto.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "FriendsGetRecommendationsResponseDto(count=" + this.count + ", items=" + this.items + ", nextFrom=" + this.nextFrom + ", accountImportBlockPos=" + this.accountImportBlockPos + ", title=" + this.title + ", trackCode=" + this.trackCode + ", infoCard=" + this.infoCard + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((FriendsUserRecommendationsDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
        Integer num = this.accountImportBlockPos;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.trackCode);
        FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto = this.infoCard;
        if (friendsRecBlockInfoCardDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsRecBlockInfoCardDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FriendsGetRecommendationsResponseDto(int i, List list, String str, Integer num, String str2, String str3, FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : friendsRecBlockInfoCardDto);
    }
}
