package com.vk.dto.newsfeed.entries;

import android.os.Parcel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.TrackableOwner;
import java.util.ArrayList;
import xsna.epx;

/* compiled from: FriendsBlock.kt */
/* loaded from: classes18.dex */
public final class FriendsBlock implements Serializer.StreamParcelable {
    public static final Serializer.c<FriendsBlock> CREATOR = new a();
    public final ArrayList<TrackableOwner> b;
    public final int c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FriendsBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FriendsBlock a(Serializer serializer) {
            ArrayList j = serializer.j(TrackableOwner.CREATOR);
            if (j == null) {
                j = new ArrayList();
            }
            return new FriendsBlock(j, serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FriendsBlock[i];
        }
    }

    public FriendsBlock(ArrayList<TrackableOwner> arrayList, int i, int i2) {
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
        if (obj instanceof FriendsBlock) {
            FriendsBlock friendsBlock = (FriendsBlock) obj;
            if (epx.f(this.b, friendsBlock.b) && this.c == friendsBlock.c && this.d == friendsBlock.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c) * 31) + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
