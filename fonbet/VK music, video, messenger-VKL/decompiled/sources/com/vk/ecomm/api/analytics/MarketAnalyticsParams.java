package com.vk.ecomm.api.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem;
import io.reactivex.rxjava3.subjects.b;
import xsna.nr;
import xsna.zcl;

/* compiled from: MarketAnalyticsParams.kt */
/* loaded from: classes18.dex */
public final class MarketAnalyticsParams implements Parcelable {
    public static final Parcelable.Creator<MarketAnalyticsParams> CREATOR = new a();
    public final MarketUtmData b;
    public final MobileOfficialAppsCoreNavStat$EventScreen c;
    public final CommonMarketStat$TypeRefSource d;
    public final Integer e;
    public final Long f;
    public final MobileOfficialAppsMarketStat$ReferrerItemType g;
    public final String h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType m;
    public final boolean n;

    /* compiled from: MarketAnalyticsParams.kt */
    public static final class a implements Parcelable.Creator<MarketAnalyticsParams> {
        @Override // android.os.Parcelable.Creator
        public final MarketAnalyticsParams createFromParcel(Parcel parcel) {
            Parcel parcel2;
            MarketUtmData createFromParcel;
            MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType blockType;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
            Integer num;
            MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType;
            boolean z;
            boolean z2;
            boolean z3;
            MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType blockType2;
            String str;
            if (parcel.readInt() == 0) {
                parcel2 = parcel;
                createFromParcel = null;
            } else {
                parcel2 = parcel;
                createFromParcel = MarketUtmData.CREATOR.createFromParcel(parcel2);
            }
            MarketUtmData marketUtmData = createFromParcel;
            MobileOfficialAppsCoreNavStat$EventScreen valueOf = parcel2.readInt() == 0 ? null : MobileOfficialAppsCoreNavStat$EventScreen.valueOf(parcel2.readString());
            CommonMarketStat$TypeRefSource valueOf2 = parcel2.readInt() == 0 ? null : CommonMarketStat$TypeRefSource.valueOf(parcel2.readString());
            Integer valueOf3 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            Long valueOf4 = parcel2.readInt() == 0 ? null : Long.valueOf(parcel2.readLong());
            MobileOfficialAppsMarketStat$ReferrerItemType valueOf5 = parcel2.readInt() == 0 ? null : MobileOfficialAppsMarketStat$ReferrerItemType.valueOf(parcel2.readString());
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = valueOf2;
            Long l = valueOf4;
            String readString = parcel.readString();
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                blockType = null;
                mobileOfficialAppsCoreNavStat$EventScreen = valueOf;
                num = valueOf3;
                mobileOfficialAppsMarketStat$ReferrerItemType = valueOf5;
                z = true;
            } else {
                blockType = null;
                mobileOfficialAppsCoreNavStat$EventScreen = valueOf;
                num = valueOf3;
                mobileOfficialAppsMarketStat$ReferrerItemType = valueOf5;
                z = false;
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = false;
                z4 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z5 = z2;
            }
            if (parcel.readInt() != 0) {
                blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                blockType2 = blockType;
                str = readString2;
                z2 = z3;
            } else {
                blockType2 = blockType;
                str = readString2;
            }
            return new MarketAnalyticsParams(marketUtmData, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, num, l, mobileOfficialAppsMarketStat$ReferrerItemType, readString, z, str, z4, z5, blockType2, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketAnalyticsParams[] newArray(int i) {
            return new MarketAnalyticsParams[i];
        }
    }

    public MarketAnalyticsParams() {
        this(null, null, null, null, null, null, null, false, null, false, false, null, false, 8191, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MarketUtmData marketUtmData = this.b;
        if (marketUtmData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketUtmData.writeToParcel(parcel, i);
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.c;
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(mobileOfficialAppsCoreNavStat$EventScreen.name());
        }
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.d;
        if (commonMarketStat$TypeRefSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(commonMarketStat$TypeRefSource.name());
        }
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Long l = this.f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.g;
        if (mobileOfficialAppsMarketStat$ReferrerItemType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(mobileOfficialAppsMarketStat$ReferrerItemType.name());
        }
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType blockType = this.m;
        if (blockType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(blockType.name());
        }
        parcel.writeInt(this.n ? 1 : 0);
    }

    public MarketAnalyticsParams(MarketUtmData marketUtmData, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Integer num, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, boolean z, String str2, boolean z2, boolean z3, MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType blockType, boolean z4) {
        this.b = marketUtmData;
        this.c = mobileOfficialAppsCoreNavStat$EventScreen;
        this.d = commonMarketStat$TypeRefSource;
        this.e = num;
        this.f = l;
        this.g = mobileOfficialAppsMarketStat$ReferrerItemType;
        this.h = str;
        this.i = z;
        this.j = str2;
        this.k = z2;
        this.l = z3;
        this.m = blockType;
        this.n = z4;
    }

    public /* synthetic */ MarketAnalyticsParams(MarketUtmData marketUtmData, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Integer num, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, boolean z, String str2, boolean z2, boolean z3, MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType blockType, boolean z4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketUtmData, (i & 2) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i & 4) != 0 ? null : commonMarketStat$TypeRefSource, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType, (i & 64) != 0 ? null : str, (i & 128) != 0 ? true : z, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) == 0 ? blockType : null, (i & 4096) != 0 ? false : z4);
    }
}
