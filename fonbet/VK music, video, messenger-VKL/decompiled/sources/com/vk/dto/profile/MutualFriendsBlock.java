package com.vk.dto.profile;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.TrackableOwner;
import java.util.ArrayList;
import xsna.epx;
import xsna.shy;
import xsna.vu5;

/* compiled from: MutualFriendsBlock.kt */
/* loaded from: classes18.dex */
public final class MutualFriendsBlock implements Serializer.StreamParcelable {
    public static final Serializer.c<MutualFriendsBlock> CREATOR = new a();
    public final ArrayList<TrackableOwner> b;
    public final int c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MutualFriendsBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MutualFriendsBlock a(Serializer serializer) {
            ArrayList j = serializer.j(TrackableOwner.CREATOR);
            if (j == null) {
                j = new ArrayList();
            }
            return new MutualFriendsBlock(j, serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MutualFriendsBlock[i];
        }
    }

    public MutualFriendsBlock(ArrayList<TrackableOwner> arrayList, int i, int i2) {
        this.b = arrayList;
        this.c = i;
        this.d = i2;
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
        if (!(obj instanceof MutualFriendsBlock)) {
            return false;
        }
        MutualFriendsBlock mutualFriendsBlock = (MutualFriendsBlock) obj;
        return epx.f(this.b, mutualFriendsBlock.b) && this.c == mutualFriendsBlock.c && this.d == mutualFriendsBlock.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutualFriendsBlock(mutuals=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", offset=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
