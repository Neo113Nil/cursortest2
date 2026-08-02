package com.vk.dto.badges;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.zcl;

/* compiled from: BadgesSet.kt */
/* loaded from: classes18.dex */
public final class BadgesSet implements Serializer.StreamParcelable {
    public static final Serializer.c<BadgesSet> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final int d;
    public final List<BadgePostItem> e;
    public final int f;
    public final int g;
    public final boolean h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BadgesSet> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BadgesSet a(Serializer serializer) {
            return new BadgesSet(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BadgesSet[i];
        }
    }

    public BadgesSet(int i, UserId userId, int i2, List<BadgePostItem> list, int i3, int i4, boolean z) {
        this.b = i;
        this.c = userId;
        this.d = i2;
        this.e = list;
        this.f = i3;
        this.g = i4;
        this.h = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.S(this.d);
        serializer.W(this.e);
        serializer.S(this.f);
        serializer.S(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BadgesSet(Serializer serializer) {
        this(r1, r2, r3, r0 == null ? EmptyList.b : r0, serializer.u(), serializer.u(), serializer.m());
        int u = serializer.u();
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        int u2 = serializer.u();
        List k = serializer.k(BadgePostItem.class);
    }

    public BadgesSet(int i, UserId userId, int i2, List list, int i3, int i4, boolean z, int i5, zcl zclVar) {
        this(i, userId, i2, (i5 & 8) != 0 ? EmptyList.b : list, (i5 & 16) != 0 ? -1 : i3, (i5 & 32) != 0 ? -1 : i4, (i5 & 64) != 0 ? false : z);
    }
}
