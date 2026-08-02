package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonCloseNotification extends CatalogButton {
    public static final Serializer.c<CatalogButtonCloseNotification> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonCloseNotification> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonCloseNotification a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonCloseNotification(H, serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonCloseNotification[i];
        }
    }

    public CatalogButtonCloseNotification(String str, String str2, String str3) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonCloseNotification)) {
            return false;
        }
        CatalogButtonCloseNotification catalogButtonCloseNotification = (CatalogButtonCloseNotification) obj;
        return epx.f(this.c, catalogButtonCloseNotification.c) && epx.f(this.d, catalogButtonCloseNotification.d) && epx.f(this.e, catalogButtonCloseNotification.e);
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
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonCloseNotification(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
