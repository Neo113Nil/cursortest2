package com.vk.stickers;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import java.util.ArrayList;
import java.util.Collection;
import xsna.epx;
import xsna.ho8;
import xsna.j5g;
import xsna.t6g0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ContextUser.kt */
/* loaded from: classes5.dex */
public final class ContextUser extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ContextUser> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public Collection<Integer> e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ContextUser> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ContextUser a(Serializer serializer) {
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            String H = serializer.H();
            String H2 = serializer.H();
            ArrayList<Integer> d = serializer.d();
            return new ContextUser(userId, H, H2, d != null ? j5g.V(d) : null, serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContextUser[i];
        }
    }

    public /* synthetic */ ContextUser(UserId userId, String str, String str2, Collection collection, String str3, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : collection, (i & 16) != 0 ? null : str3);
    }

    public final boolean Ab(int i) {
        Collection<Integer> collection;
        t6g0 t6g0Var = t6g0.b;
        StickerStockItem I = t6g0.d().I(i);
        if ((I == null || I.A) && (collection = this.e) != null) {
            return !collection.contains(Integer.valueOf(i));
        }
        return false;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        Collection<Integer> collection = this.e;
        serializer.U(collection != null ? j5g.O0(collection) : null);
        serializer.j0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextUser)) {
            return false;
        }
        ContextUser contextUser = (ContextUser) obj;
        return epx.f(this.b, contextUser.b) && epx.f(this.c, contextUser.c) && epx.f(this.d, contextUser.d) && epx.f(this.e, contextUser.e) && epx.f(this.f, contextUser.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Collection<Integer> collection = this.e;
        int hashCode2 = (hashCode + (collection == null ? 0 : collection.hashCode())) * 31;
        String str2 = this.f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextUser(id=");
        sb.append(this.b);
        sb.append(", firstNameGen=");
        sb.append(this.c);
        sb.append(", avatarUrl=");
        sb.append(this.d);
        sb.append(", availablePacksForGift=");
        sb.append(this.e);
        sb.append(", characterId=");
        return ho8.a(sb, this.f, ')');
    }

    public final boolean zb(StickerStockItem stickerStockItem) {
        Collection<Integer> collection;
        if (stickerStockItem.A && (collection = this.e) != null) {
            return !collection.contains(Integer.valueOf(stickerStockItem.b));
        }
        return false;
    }

    public ContextUser(UserId userId, String str, String str2, Collection<Integer> collection, String str3) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = collection;
        this.f = str3;
    }

    public /* synthetic */ ContextUser(UserId userId, String str, String str2, Collection collection, int i, zcl zclVar) {
        this(userId, str, str2, (i & 8) != 0 ? null : collection);
    }

    public ContextUser(UserId userId, String str, String str2, Collection<Integer> collection) {
        this(userId, str, str2, collection, null);
    }

    public ContextUser(String str) {
        this(UserId.d, "", null, null, str, 8, null);
    }
}
