package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonGoToOwner extends CatalogButton {
    public static final Serializer.c<CatalogButtonGoToOwner> CREATOR = new a();
    public final String c;
    public final String d;
    public final UserId e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonGoToOwner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonGoToOwner a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonGoToOwner(H, serializer.H(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonGoToOwner[i];
        }
    }

    public CatalogButtonGoToOwner(String str, String str2, UserId userId, String str3) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = userId;
        this.f = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
        serializer.j0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonGoToOwner)) {
            return false;
        }
        CatalogButtonGoToOwner catalogButtonGoToOwner = (CatalogButtonGoToOwner) obj;
        return epx.f(this.c, catalogButtonGoToOwner.c) && epx.f(this.d, catalogButtonGoToOwner.d) && epx.f(this.e, catalogButtonGoToOwner.e) && epx.f(this.f, catalogButtonGoToOwner.f);
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
        return a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonGoToOwner(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", ownerId=");
        sb.append(this.e);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
