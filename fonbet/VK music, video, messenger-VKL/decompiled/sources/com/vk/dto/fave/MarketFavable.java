package com.vk.dto.fave;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import xsna.gmq;
import xsna.l490;
import xsna.zcl;

/* compiled from: Favables.kt */
/* loaded from: classes18.dex */
public final class MarketFavable extends Serializer.StreamParcelableAdapter implements gmq, l490 {
    public static final Serializer.c<MarketFavable> CREATOR = new a();
    public final long b;
    public final UserId c;
    public final Owner d;
    public final boolean e;
    public boolean f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MarketFavable> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarketFavable a(Serializer serializer) {
            long w = serializer.w();
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            if (userId == null) {
                userId = UserId.d;
            }
            return new MarketFavable(w, userId, (Owner) serializer.G(Owner.class.getClassLoader()), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketFavable[i];
        }
    }

    public /* synthetic */ MarketFavable(long j, UserId userId, Owner owner, boolean z, boolean z2, int i, zcl zclVar) {
        this(j, userId, owner, (i & 8) != 0 ? false : z, z2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.e0(this.c);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.gmq
    public final boolean X() {
        return this.f;
    }

    @Override // xsna.l490
    public final Owner s() {
        return this.d;
    }

    @Override // xsna.gmq
    public final void s0(boolean z) {
        this.f = z;
    }

    public MarketFavable(long j, UserId userId, Owner owner, boolean z, boolean z2) {
        this.b = j;
        this.c = userId;
        this.d = owner;
        this.e = z;
        this.f = z2;
    }
}
