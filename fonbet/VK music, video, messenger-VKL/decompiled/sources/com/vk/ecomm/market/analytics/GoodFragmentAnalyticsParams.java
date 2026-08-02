package com.vk.ecomm.market.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.nr;
import xsna.zcl;

/* compiled from: GoodFragmentAnalyticsParams.kt */
/* loaded from: classes18.dex */
public final class GoodFragmentAnalyticsParams implements Parcelable {
    public static final Parcelable.Creator<GoodFragmentAnalyticsParams> CREATOR = new a();
    public final Integer b;
    public final Integer c;
    public final Long d;
    public final MobileOfficialAppsMarketStat$ReferrerItemType e;
    public final String f;
    public final Long g;
    public final String h;
    public final CommonMarketStat$TypeMarketContextContent.Type i;
    public final Integer j;
    public final Long k;
    public final String l;
    public final String m;
    public final CommonMarketStat$TypeMarketContextContent.Type n;
    public final Integer o;
    public final Long p;

    /* compiled from: GoodFragmentAnalyticsParams.kt */
    public static final class a implements Parcelable.Creator<GoodFragmentAnalyticsParams> {
        @Override // android.os.Parcelable.Creator
        public final GoodFragmentAnalyticsParams createFromParcel(Parcel parcel) {
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            MobileOfficialAppsMarketStat$ReferrerItemType valueOf4 = parcel.readInt() == 0 ? null : MobileOfficialAppsMarketStat$ReferrerItemType.valueOf(parcel.readString());
            String readString = parcel.readString();
            Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString2 = parcel.readString();
            CommonMarketStat$TypeMarketContextContent.Type valueOf6 = parcel.readInt() == 0 ? null : CommonMarketStat$TypeMarketContextContent.Type.valueOf(parcel.readString());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long valueOf8 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString3 = parcel.readString();
            Long l = null;
            Integer num = valueOf2;
            Long l2 = valueOf3;
            MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = valueOf4;
            Long l3 = valueOf5;
            CommonMarketStat$TypeMarketContextContent.Type type = valueOf6;
            Integer num2 = valueOf7;
            Long l4 = valueOf8;
            String readString4 = parcel.readString();
            CommonMarketStat$TypeMarketContextContent.Type valueOf9 = parcel.readInt() == 0 ? null : CommonMarketStat$TypeMarketContextContent.Type.valueOf(parcel.readString());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new GoodFragmentAnalyticsParams(valueOf, num, l2, mobileOfficialAppsMarketStat$ReferrerItemType, readString, l3, readString2, type, num2, l4, readString3, readString4, valueOf9, valueOf10, l);
        }

        @Override // android.os.Parcelable.Creator
        public final GoodFragmentAnalyticsParams[] newArray(int i) {
            return new GoodFragmentAnalyticsParams[i];
        }
    }

    public GoodFragmentAnalyticsParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = this.e;
        if (mobileOfficialAppsMarketStat$ReferrerItemType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(mobileOfficialAppsMarketStat$ReferrerItemType.name());
        }
        parcel.writeString(this.f);
        Long l2 = this.g;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
        parcel.writeString(this.h);
        CommonMarketStat$TypeMarketContextContent.Type type = this.i;
        if (type == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(type.name());
        }
        Integer num3 = this.j;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Long l3 = this.k;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l3);
        }
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        CommonMarketStat$TypeMarketContextContent.Type type2 = this.n;
        if (type2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(type2.name());
        }
        Integer num4 = this.o;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Long l4 = this.p;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l4);
        }
    }

    public GoodFragmentAnalyticsParams(Integer num, Integer num2, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, Long l2, String str2, CommonMarketStat$TypeMarketContextContent.Type type, Integer num3, Long l3, String str3, String str4, CommonMarketStat$TypeMarketContextContent.Type type2, Integer num4, Long l4) {
        this.b = num;
        this.c = num2;
        this.d = l;
        this.e = mobileOfficialAppsMarketStat$ReferrerItemType;
        this.f = str;
        this.g = l2;
        this.h = str2;
        this.i = type;
        this.j = num3;
        this.k = l3;
        this.l = str3;
        this.m = str4;
        this.n = type2;
        this.o = num4;
        this.p = l4;
    }

    public /* synthetic */ GoodFragmentAnalyticsParams(Integer num, Integer num2, Long l, MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType, String str, Long l2, String str2, CommonMarketStat$TypeMarketContextContent.Type type, Integer num3, Long l3, String str3, String str4, CommonMarketStat$TypeMarketContextContent.Type type2, Integer num4, Long l4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : mobileOfficialAppsMarketStat$ReferrerItemType, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : type, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : l3, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : type2, (i & 8192) != 0 ? null : num4, (i & 16384) != 0 ? null : l4);
    }
}
