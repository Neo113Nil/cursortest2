package com.vk.im.ui.fragments.chat;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.nr;
import xsna.zcl;

/* compiled from: ChatAnalyticsParams.kt */
/* loaded from: classes2.dex */
public final class ChatAnalyticsParams implements Parcelable {
    public static final Parcelable.Creator<ChatAnalyticsParams> CREATOR = new a();
    public final Long b;
    public final UserId c;
    public final CommonMarketStat$TypeRefSource d;
    public final MobileOfficialAppsCoreNavStat$EventScreen e;
    public final boolean f;
    public final String g;
    public final UserId h;
    public final ImSearchItemLoggingInfo i;
    public final Integer j;

    /* compiled from: ChatAnalyticsParams.kt */
    public static final class a implements Parcelable.Creator<ChatAnalyticsParams> {
        @Override // android.os.Parcelable.Creator
        public final ChatAnalyticsParams createFromParcel(Parcel parcel) {
            ImSearchItemLoggingInfo imSearchItemLoggingInfo;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
            boolean z;
            UserId userId;
            Integer valueOf;
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            UserId userId2 = (UserId) parcel.readParcelable(ChatAnalyticsParams.class.getClassLoader());
            CommonMarketStat$TypeRefSource valueOf3 = parcel.readInt() == 0 ? null : CommonMarketStat$TypeRefSource.valueOf(parcel.readString());
            MobileOfficialAppsCoreNavStat$EventScreen valueOf4 = parcel.readInt() == 0 ? null : MobileOfficialAppsCoreNavStat$EventScreen.valueOf(parcel.readString());
            boolean z2 = parcel.readInt() != 0;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = valueOf4;
            String readString = parcel.readString();
            UserId userId3 = (UserId) parcel.readParcelable(ChatAnalyticsParams.class.getClassLoader());
            ImSearchItemLoggingInfo imSearchItemLoggingInfo2 = (ImSearchItemLoggingInfo) parcel.readParcelable(ChatAnalyticsParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                imSearchItemLoggingInfo = imSearchItemLoggingInfo2;
                commonMarketStat$TypeRefSource = valueOf3;
                z = z2;
                userId = userId3;
                valueOf = null;
            } else {
                imSearchItemLoggingInfo = imSearchItemLoggingInfo2;
                commonMarketStat$TypeRefSource = valueOf3;
                z = z2;
                userId = userId3;
                valueOf = Integer.valueOf(parcel.readInt());
            }
            return new ChatAnalyticsParams(valueOf2, userId2, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen, z, readString, userId, imSearchItemLoggingInfo, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ChatAnalyticsParams[] newArray(int i) {
            return new ChatAnalyticsParams[i];
        }
    }

    public ChatAnalyticsParams() {
        this(null, null, null, null, false, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final ImSearchItemLoggingInfo d() {
        return this.i;
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
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
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
        parcel.writeParcelable(this.i, i);
        Integer num = this.j;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public ChatAnalyticsParams(Long l, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z, String str, UserId userId2, ImSearchItemLoggingInfo imSearchItemLoggingInfo, Integer num) {
        this.b = l;
        this.c = userId;
        this.d = commonMarketStat$TypeRefSource;
        this.e = mobileOfficialAppsCoreNavStat$EventScreen;
        this.f = z;
        this.g = str;
        this.h = userId2;
        this.i = imSearchItemLoggingInfo;
        this.j = num;
    }

    public /* synthetic */ ChatAnalyticsParams(Long l, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z, String str, UserId userId2, ImSearchItemLoggingInfo imSearchItemLoggingInfo, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : commonMarketStat$TypeRefSource, (i & 8) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : userId2, (i & 128) != 0 ? null : imSearchItemLoggingInfo, (i & 256) != 0 ? null : num);
    }
}
