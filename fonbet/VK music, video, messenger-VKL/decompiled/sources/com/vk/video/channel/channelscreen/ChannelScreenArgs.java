package com.vk.video.channel.channelscreen;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ChannelScreenArgs.kt */
/* loaded from: classes5.dex */
public final class ChannelScreenArgs implements Parcelable {
    public static final Parcelable.Creator<ChannelScreenArgs> CREATOR = new a();
    public final UserId b;
    public final boolean c;
    public final CloseBehaviour d;
    public final SearchStatsDo e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    /* compiled from: ChannelScreenArgs.kt */
    public static final class a implements Parcelable.Creator<ChannelScreenArgs> {
        @Override // android.os.Parcelable.Creator
        public final ChannelScreenArgs createFromParcel(Parcel parcel) {
            boolean z;
            SearchStatsDo searchStatsDo;
            boolean z2;
            boolean z3;
            UserId userId = (UserId) parcel.readParcelable(ChannelScreenArgs.class.getClassLoader());
            boolean z4 = parcel.readInt() != 0;
            CloseBehaviour createFromParcel = CloseBehaviour.CREATOR.createFromParcel(parcel);
            SearchStatsDo createFromParcel2 = parcel.readInt() == 0 ? null : SearchStatsDo.CREATOR.createFromParcel(parcel);
            boolean z5 = false;
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
                searchStatsDo = createFromParcel2;
                z2 = true;
            } else {
                z = true;
                searchStatsDo = createFromParcel2;
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = false;
                z5 = z;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                z = z3;
            }
            return new ChannelScreenArgs(userId, z4, createFromParcel, searchStatsDo, readString, z2, z5, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelScreenArgs[] newArray(int i) {
            return new ChannelScreenArgs[i];
        }
    }

    public ChannelScreenArgs(UserId userId, boolean z, CloseBehaviour closeBehaviour, SearchStatsDo searchStatsDo, String str, boolean z2, boolean z3, boolean z4, String str2) {
        this.b = userId;
        this.c = z;
        this.d = closeBehaviour;
        this.e = searchStatsDo;
        this.f = str;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelScreenArgs)) {
            return false;
        }
        ChannelScreenArgs channelScreenArgs = (ChannelScreenArgs) obj;
        return epx.f(this.b, channelScreenArgs.b) && this.c == channelScreenArgs.c && this.d == channelScreenArgs.d && epx.f(this.e, channelScreenArgs.e) && epx.f(this.f, channelScreenArgs.f) && this.g == channelScreenArgs.g && this.h == channelScreenArgs.h && this.i == channelScreenArgs.i && epx.f(this.j, channelScreenArgs.j);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c)) * 31;
        SearchStatsDo searchStatsDo = this.e;
        int hashCode2 = (hashCode + (searchStatsDo == null ? 0 : searchStatsDo.hashCode())) * 31;
        String str = this.f;
        int b = qoy.b(qoy.b(qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
        String str2 = this.j;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelScreenArgs(channelId=");
        sb.append(this.b);
        sb.append(", isNavigationBackButtonVisible=");
        sb.append(this.c);
        sb.append(", closeBehaviour=");
        sb.append(this.d);
        sb.append(", searchStats=");
        sb.append(this.e);
        sb.append(", catalogUrl=");
        sb.append(this.f);
        sb.append(", isOwnChannel=");
        sb.append(this.g);
        sb.append(", isSectionTabDataLoading=");
        sb.append(this.h);
        sb.append(", openNotifySettings=");
        sb.append(this.i);
        sb.append(", trackCode=");
        return ho8.a(sb, this.j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        this.d.writeToParcel(parcel, i);
        SearchStatsDo searchStatsDo = this.e;
        if (searchStatsDo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchStatsDo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.j);
    }

    public /* synthetic */ ChannelScreenArgs(UserId userId, boolean z, CloseBehaviour closeBehaviour, SearchStatsDo searchStatsDo, String str, boolean z2, boolean z3, boolean z4, String str2, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? false : z, (i & 4) != 0 ? CloseBehaviour.FINISH : closeBehaviour, (i & 8) != 0 ? null : searchStatsDo, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? null : str2);
    }
}
