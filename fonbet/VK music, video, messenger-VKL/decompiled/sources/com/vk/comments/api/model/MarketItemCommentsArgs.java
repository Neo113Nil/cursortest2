package com.vk.comments.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: MarketItemCommentsArgs.kt */
/* loaded from: classes17.dex */
public final class MarketItemCommentsArgs implements Parcelable {
    public static final Parcelable.Creator<MarketItemCommentsArgs> CREATOR = new a();
    public final UserId b;
    public final long c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* compiled from: MarketItemCommentsArgs.kt */
    public static final class a implements Parcelable.Creator<MarketItemCommentsArgs> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemCommentsArgs createFromParcel(Parcel parcel) {
            return new MarketItemCommentsArgs((UserId) parcel.readParcelable(MarketItemCommentsArgs.class.getClassLoader()), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemCommentsArgs[] newArray(int i) {
            return new MarketItemCommentsArgs[i];
        }
    }

    public MarketItemCommentsArgs(UserId userId, long j, String str, boolean z, boolean z2) {
        this.b = userId;
        this.c = j;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemCommentsArgs)) {
            return false;
        }
        MarketItemCommentsArgs marketItemCommentsArgs = (MarketItemCommentsArgs) obj;
        return epx.f(this.b, marketItemCommentsArgs.b) && this.c == marketItemCommentsArgs.c && epx.f(this.d, marketItemCommentsArgs.d) && this.e == marketItemCommentsArgs.e && this.f == marketItemCommentsArgs.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(urd0.a(bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemCommentsArgs(ownerId=");
        sb.append(this.b);
        sb.append(", itemId=");
        sb.append(this.c);
        sb.append(", productOwnerName=");
        sb.append(this.d);
        sb.append(", isCommentsClosed=");
        sb.append(this.e);
        sb.append(", openKeyboard=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
