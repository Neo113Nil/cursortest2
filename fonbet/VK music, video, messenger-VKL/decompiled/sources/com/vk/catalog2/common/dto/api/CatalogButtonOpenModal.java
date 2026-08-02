package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonOpenModal extends CatalogButton {
    public static final Serializer.c<CatalogButtonOpenModal> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final UserId f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonOpenModal> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonOpenModal a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonOpenModal(H, serializer.H(), serializer.H(), (UserId) serializer.A(UserId.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonOpenModal[i];
        }
    }

    public CatalogButtonOpenModal(String str, String str2, String str3, UserId userId) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = userId;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.e0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonOpenModal)) {
            return false;
        }
        CatalogButtonOpenModal catalogButtonOpenModal = (CatalogButtonOpenModal) obj;
        return epx.f(this.c, catalogButtonOpenModal.c) && epx.f(this.d, catalogButtonOpenModal.d) && epx.f(this.e, catalogButtonOpenModal.e) && epx.f(this.f, catalogButtonOpenModal.f);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.f;
        return hashCode3 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonOpenModal(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", ownerId=");
        return gp.b(sb, this.f, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
