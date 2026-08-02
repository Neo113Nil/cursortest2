package com.vk.story.viewer.stat.data.cache.viewers.replies;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.vu5;

/* compiled from: RepliesCachedData.kt */
/* loaded from: classes6.dex */
public final class RepliesKey implements Serializer.StreamParcelable {
    public static final Serializer.c<RepliesKey> CREATOR = new a();
    public final UserId b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RepliesKey> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RepliesKey a(Serializer serializer) {
            return new RepliesKey(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RepliesKey[i];
        }
    }

    public RepliesKey(UserId userId, int i) {
        this.b = userId;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.S(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepliesKey)) {
            return false;
        }
        RepliesKey repliesKey = (RepliesKey) obj;
        return epx.f(this.b, repliesKey.b) && this.c == repliesKey.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepliesKey(ownerId=");
        sb.append(this.b);
        sb.append(", storyId=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RepliesKey(Serializer serializer) {
        this(r0 == null ? UserId.d : r0, serializer.u());
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
    }
}
