package com.vk.fave.entities;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.OnlineInfo;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.gux0;
import xsna.ms9;

/* compiled from: FavePage.kt */
/* loaded from: classes18.dex */
public final class FavePage extends Serializer.StreamParcelableAdapter implements gux0 {
    public static final Serializer.c<FavePage> CREATOR = new a();
    public final String b;
    public final String c;
    public final long d;
    public final Owner e;
    public final String f;
    public final OnlineInfo g;
    public final boolean h;
    public final List<FaveTag> i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FavePage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FavePage a(Serializer serializer) {
            return new FavePage(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FavePage[i];
        }
    }

    public FavePage(String str, String str2, long j, Owner owner, String str3, OnlineInfo onlineInfo, boolean z, List<FaveTag> list) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = owner;
        this.f = str3;
        this.g = onlineInfo;
        this.h = z;
        this.i = list;
    }

    public static FavePage zb(FavePage favePage, Owner owner, boolean z, List list, int i) {
        String str = favePage.b;
        String str2 = favePage.c;
        long j = favePage.d;
        if ((i & 8) != 0) {
            owner = favePage.e;
        }
        Owner owner2 = owner;
        String str3 = favePage.f;
        OnlineInfo onlineInfo = favePage.g;
        if ((i & 64) != 0) {
            z = favePage.h;
        }
        boolean z2 = z;
        if ((i & 128) != 0) {
            list = favePage.i;
        }
        favePage.getClass();
        return new FavePage(str, str2, j, owner2, str3, onlineInfo, z2, list);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.Y(this.d);
        serializer.i0(this.e);
        serializer.j0(this.f);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.i0(this.g);
        serializer.W(this.i);
    }

    @Override // xsna.gux0
    public final List<FaveTag> U1() {
        return this.i;
    }

    @Override // xsna.gux0
    public final gux0 copy(List<FaveTag> list) {
        return zb(this, null, false, list, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!FavePage.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        FavePage favePage = (FavePage) obj;
        if (!epx.f(this.b, favePage.b)) {
            return false;
        }
        Owner owner = this.e;
        UserId userId = owner != null ? owner.b : null;
        Owner owner2 = favePage.e;
        return epx.f(userId, owner2 != null ? owner2.b : null);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Owner owner = this.e;
        return hashCode + (owner != null ? owner.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavePage(type=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", updateDate=");
        sb.append(this.d);
        sb.append(", owner=");
        sb.append(this.e);
        sb.append(", shortName=");
        sb.append(this.f);
        sb.append(", online=");
        sb.append(this.g);
        sb.append(", isFave=");
        sb.append(this.h);
        sb.append(", tags=");
        return ms9.a(')', sb, this.i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FavePage(Serializer serializer) {
        this(r3, r4, r5, r7, r8, r9, r10, r13 == null ? EmptyList.b : r13);
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        long w = serializer.w();
        Owner owner = (Owner) serializer.G(Owner.class.getClassLoader());
        String H3 = serializer.H();
        OnlineInfo onlineInfo = (OnlineInfo) serializer.G(OnlineInfo.class.getClassLoader());
        boolean m = serializer.m();
        List l = serializer.l(FaveTag.class.getClassLoader());
    }
}
