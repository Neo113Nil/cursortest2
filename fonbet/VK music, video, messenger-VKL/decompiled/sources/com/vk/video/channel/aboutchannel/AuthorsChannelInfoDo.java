package com.vk.video.channel.aboutchannel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;

/* compiled from: AboutChannelArguments.kt */
/* loaded from: classes5.dex */
public final class AuthorsChannelInfoDo implements ChannelInfo {
    public static final Parcelable.Creator<AuthorsChannelInfoDo> CREATOR = new a();
    public final long b;
    public final String c;
    public final List<AdditionalInfoDo> d;
    public final String e;

    /* compiled from: AboutChannelArguments.kt */
    public static final class a implements Parcelable.Creator<AuthorsChannelInfoDo> {
        @Override // android.os.Parcelable.Creator
        public final AuthorsChannelInfoDo createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AdditionalInfoDo.CREATOR, parcel, arrayList, i, 1);
            }
            return new AuthorsChannelInfoDo(readLong, readString, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorsChannelInfoDo[] newArray(int i) {
            return new AuthorsChannelInfoDo[i];
        }
    }

    public AuthorsChannelInfoDo(long j, String str, List<AdditionalInfoDo> list, String str2) {
        this.b = j;
        this.c = str;
        this.d = list;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorsChannelInfoDo)) {
            return false;
        }
        AuthorsChannelInfoDo authorsChannelInfoDo = (AuthorsChannelInfoDo) obj;
        return this.b == authorsChannelInfoDo.b && epx.f(this.c, authorsChannelInfoDo.c) && epx.f(this.d, authorsChannelInfoDo.d) && epx.f(this.e, authorsChannelInfoDo.e);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        String str = this.c;
        int a2 = fw3.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorsChannelInfoDo(channelId=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", additionalInfos=");
        sb.append(this.d);
        sb.append(", aPlusLink=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            ((AdditionalInfoDo) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.e);
    }
}
