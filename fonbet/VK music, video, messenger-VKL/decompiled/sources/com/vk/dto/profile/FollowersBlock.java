package com.vk.dto.profile;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.TrackableOwner;
import java.util.ArrayList;
import xsna.epx;
import xsna.shy;
import xsna.vu5;

/* compiled from: FollowersBlock.kt */
/* loaded from: classes18.dex */
public final class FollowersBlock implements Serializer.StreamParcelable {
    public static final Serializer.c<FollowersBlock> CREATOR = new a();
    public final ArrayList<TrackableOwner> b;
    public final int c;
    public final int d;
    public final int e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FollowersBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FollowersBlock a(Serializer serializer) {
            ArrayList j = serializer.j(TrackableOwner.CREATOR);
            if (j == null) {
                j = new ArrayList();
            }
            return new FollowersBlock(j, serializer.u(), serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FollowersBlock[i];
        }
    }

    public FollowersBlock(ArrayList<TrackableOwner> arrayList, int i, int i2, int i3) {
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowersBlock)) {
            return false;
        }
        FollowersBlock followersBlock = (FollowersBlock) obj;
        return epx.f(this.b, followersBlock.b) && this.c == followersBlock.c && this.d == followersBlock.d && this.e == followersBlock.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowersBlock(followers=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", friendsCount=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
