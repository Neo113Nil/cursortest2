package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonMusicFollowOwner extends CatalogButton {
    public static final Serializer.c<CatalogButtonMusicFollowOwner> CREATOR = new a();
    public final String c;
    public final String d;
    public final UserId e;
    public final boolean f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonMusicFollowOwner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonMusicFollowOwner a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonMusicFollowOwner(H, serializer.H(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.m(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonMusicFollowOwner[i];
        }
    }

    public CatalogButtonMusicFollowOwner(String str, String str2, UserId userId, boolean z, String str3) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = userId;
        this.f = z;
        this.g = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonMusicFollowOwner)) {
            return false;
        }
        CatalogButtonMusicFollowOwner catalogButtonMusicFollowOwner = (CatalogButtonMusicFollowOwner) obj;
        return epx.f(this.c, catalogButtonMusicFollowOwner.c) && epx.f(this.d, catalogButtonMusicFollowOwner.d) && epx.f(this.e, catalogButtonMusicFollowOwner.e) && this.f == catalogButtonMusicFollowOwner.f && epx.f(this.g, catalogButtonMusicFollowOwner.g);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int b = qoy.b(bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e.b), 31, this.f);
        String str2 = this.g;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonMusicFollowOwner(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", ownerId=");
        sb.append(this.e);
        sb.append(", isFollowing=");
        sb.append(this.f);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
