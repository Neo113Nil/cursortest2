package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonFollowUser extends CatalogButton {
    public static final Serializer.c<CatalogButtonFollowUser> CREATOR = new a();
    public final String c;
    public final String d;
    public final UserId e;
    public final String f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonFollowUser> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonFollowUser a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonFollowUser(H, serializer.H(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonFollowUser[i];
        }
    }

    public CatalogButtonFollowUser(String str, String str2, UserId userId, String str3, String str4) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = userId;
        this.f = str3;
        this.g = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonFollowUser)) {
            return false;
        }
        CatalogButtonFollowUser catalogButtonFollowUser = (CatalogButtonFollowUser) obj;
        return epx.f(this.c, catalogButtonFollowUser.c) && epx.f(this.d, catalogButtonFollowUser.d) && epx.f(this.e, catalogButtonFollowUser.e) && epx.f(this.f, catalogButtonFollowUser.f) && epx.f(this.g, catalogButtonFollowUser.g);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e.b);
        String str2 = this.f;
        int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonFollowUser(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", ownerId=");
        sb.append(this.e);
        sb.append(", consumeReason=");
        sb.append(this.f);
        sb.append(", trackCode=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
