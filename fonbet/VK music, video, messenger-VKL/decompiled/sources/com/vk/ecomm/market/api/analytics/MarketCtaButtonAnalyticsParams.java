package com.vk.ecomm.market.api.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$ProductCardFomoLabels;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import io.reactivex.rxjava3.subjects.b;
import xsna.nr;
import xsna.zcl;

/* compiled from: MarketCtaButtonAnalyticsParams.kt */
/* loaded from: classes18.dex */
public final class MarketCtaButtonAnalyticsParams implements Parcelable {
    public static final Parcelable.Creator<MarketCtaButtonAnalyticsParams> CREATOR = new a();
    public final MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType b;
    public final long c;
    public final UserId d;
    public final String e;
    public final CommonMarketStat$TypeRefSource f;
    public final MobileOfficialAppsCoreNavStat$EventScreen g;
    public final Long h;
    public final Integer i;
    public final Integer j;
    public final MobileOfficialAppsMarketStat$ReferrerItemType k;
    public final Long l;
    public final String m;
    public final String n;
    public final Integer o;
    public final Integer p;
    public final Long q;
    public final CommonMarketStat$TypeMarketContextContent.Type r;
    public final String s;
    public final String t;
    public final String u;
    public final CommonMarketStat$ProductCardFomoLabels v;

    /* compiled from: MarketCtaButtonAnalyticsParams.kt */
    public static final class a implements Parcelable.Creator<MarketCtaButtonAnalyticsParams> {
        @Override // android.os.Parcelable.Creator
        public final MarketCtaButtonAnalyticsParams createFromParcel(Parcel parcel) {
            MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType valueOf = MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.valueOf(parcel.readString());
            long readLong = parcel.readLong();
            UserId userId = (UserId) parcel.readParcelable(MarketCtaButtonAnalyticsParams.class.getClassLoader());
            String readString = parcel.readString();
            CommonMarketStat$TypeRefSource valueOf2 = parcel.readInt() == 0 ? null : CommonMarketStat$TypeRefSource.valueOf(parcel.readString());
            MobileOfficialAppsCoreNavStat$EventScreen valueOf3 = MobileOfficialAppsCoreNavStat$EventScreen.valueOf(parcel.readString());
            Long valueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MobileOfficialAppsMarketStat$ReferrerItemType valueOf7 = parcel.readInt() == 0 ? null : MobileOfficialAppsMarketStat$ReferrerItemType.valueOf(parcel.readString());
            return new MarketCtaButtonAnalyticsParams(valueOf, readLong, userId, readString, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? CommonMarketStat$TypeMarketContextContent.Type.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString(), parcel.readString(), (CommonMarketStat$ProductCardFomoLabels) parcel.readValue(MarketCtaButtonAnalyticsParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCtaButtonAnalyticsParams[] newArray(int i) {
            return new MarketCtaButtonAnalyticsParams[i];
        }
    }

    public MarketCtaButtonAnalyticsParams(MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType, long j, UserId userId, String str, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Long l, Integer num, Integer num2, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, Long l2, String str2, String str3, Integer num3, Integer num4, Long l3, CommonMarketStat$TypeMarketContextContent.Type type, String str4, String str5, String str6, CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels) {
        this.b = eventType;
        this.c = j;
        this.d = userId;
        this.e = str;
        this.f = commonMarketStat$TypeRefSource;
        this.g = mobileOfficialAppsCoreNavStat$EventScreen;
        this.h = l;
        this.i = num;
        this.j = num2;
        this.k = mobileOfficialAppsMarketStat$ReferrerItemType;
        this.l = l2;
        this.m = str2;
        this.n = str3;
        this.o = num3;
        this.p = num4;
        this.q = l3;
        this.r = type;
        this.s = str4;
        this.t = str5;
        this.u = str6;
        this.v = commonMarketStat$ProductCardFomoLabels;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeLong(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.f;
        if (commonMarketStat$TypeRefSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(commonMarketStat$TypeRefSource.name());
        }
        parcel.writeString(this.g.name());
        Long l = this.h;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Integer num = this.i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.j;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.k;
        if (mobileOfficialAppsMarketStat$ReferrerItemType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(mobileOfficialAppsMarketStat$ReferrerItemType.name());
        }
        Long l2 = this.l;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        Integer num3 = this.o;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.p;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Long l3 = this.q;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l3);
        }
        CommonMarketStat$TypeMarketContextContent.Type type = this.r;
        if (type == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(type.name());
        }
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeValue(this.v);
    }

    public /* synthetic */ MarketCtaButtonAnalyticsParams(MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType, long j, UserId userId, String str, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Long l, Integer num, Integer num2, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, Long l2, String str2, String str3, Integer num3, Integer num4, Long l3, CommonMarketStat$TypeMarketContextContent.Type type, String str4, String str5, String str6, CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels, int i, zcl zclVar) {
        this(eventType, j, userId, str, (i & 16) != 0 ? null : commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType, (i & 1024) != 0 ? null : l2, (i & 2048) != 0 ? null : str2, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : num4, (32768 & i) != 0 ? null : l3, (65536 & i) != 0 ? null : type, (131072 & i) != 0 ? null : str4, (262144 & i) != 0 ? null : str5, (524288 & i) != 0 ? null : str6, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : commonMarketStat$ProductCardFomoLabels);
    }
}
