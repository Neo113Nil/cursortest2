package com.vk.im.chat.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.subjects.b;
import xsna.nr;
import xsna.zcl;

/* compiled from: ChatAnalyticsParamsNoLogging.kt */
/* loaded from: classes2.dex */
public final class ChatAnalyticsParamsNoLogging implements Parcelable {
    public static final Parcelable.Creator<ChatAnalyticsParamsNoLogging> CREATOR = new a();
    public final Long b;
    public final UserId c;
    public final CommonMarketStat$TypeRefSource d;
    public final MobileOfficialAppsCoreNavStat$EventScreen e;
    public final boolean f;
    public final String g;
    public final UserId h;
    public final Integer i;

    /* compiled from: ChatAnalyticsParamsNoLogging.kt */
    public static final class a implements Parcelable.Creator<ChatAnalyticsParamsNoLogging> {
        @Override // android.os.Parcelable.Creator
        public final ChatAnalyticsParamsNoLogging createFromParcel(Parcel parcel) {
            UserId userId;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
            boolean z;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            UserId userId2 = (UserId) parcel.readParcelable(ChatAnalyticsParamsNoLogging.class.getClassLoader());
            CommonMarketStat$TypeRefSource valueOf2 = parcel.readInt() == 0 ? null : CommonMarketStat$TypeRefSource.valueOf(parcel.readString());
            MobileOfficialAppsCoreNavStat$EventScreen valueOf3 = parcel.readInt() == 0 ? null : MobileOfficialAppsCoreNavStat$EventScreen.valueOf(parcel.readString());
            boolean z2 = parcel.readInt() != 0;
            Integer num = null;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = valueOf3;
            String readString = parcel.readString();
            UserId userId3 = (UserId) parcel.readParcelable(ChatAnalyticsParamsNoLogging.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolean z3 = z2;
                userId = userId3;
                commonMarketStat$TypeRefSource = valueOf2;
                z = z3;
            } else {
                boolean z4 = z2;
                userId = userId3;
                commonMarketStat$TypeRefSource = valueOf2;
                z = z4;
                num = Integer.valueOf(parcel.readInt());
            }
            return new ChatAnalyticsParamsNoLogging(valueOf, userId2, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen, z, readString, userId, num);
        }

        @Override // android.os.Parcelable.Creator
        public final ChatAnalyticsParamsNoLogging[] newArray(int i) {
            return new ChatAnalyticsParamsNoLogging[i];
        }
    }

    public ChatAnalyticsParamsNoLogging() {
        this(null, null, null, null, false, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        parcel.writeParcelable(this.c, i);
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.d;
        if (commonMarketStat$TypeRefSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(commonMarketStat$TypeRefSource.name());
        }
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.e;
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(mobileOfficialAppsCoreNavStat$EventScreen.name());
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        Integer num = this.i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public ChatAnalyticsParamsNoLogging(Long l, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z, String str, UserId userId2, Integer num) {
        this.b = l;
        this.c = userId;
        this.d = commonMarketStat$TypeRefSource;
        this.e = mobileOfficialAppsCoreNavStat$EventScreen;
        this.f = z;
        this.g = str;
        this.h = userId2;
        this.i = num;
    }

    public /* synthetic */ ChatAnalyticsParamsNoLogging(Long l, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z, String str, UserId userId2, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : commonMarketStat$TypeRefSource, (i & 8) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : userId2, (i & 128) != 0 ? null : num);
    }
}
