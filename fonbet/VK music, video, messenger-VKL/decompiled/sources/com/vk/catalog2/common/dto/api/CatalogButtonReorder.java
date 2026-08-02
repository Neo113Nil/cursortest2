package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonReorder extends CatalogButton {
    public static final Serializer.c<CatalogButtonReorder> CREATOR = new a();
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonReorder> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonReorder a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonReorder(H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonReorder[i];
        }
    }

    public CatalogButtonReorder(String str) {
        super(null);
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogButtonReorder) && epx.f(this.c, ((CatalogButtonReorder) obj).c);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CatalogButtonReorder(type="), this.c, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return null;
    }
}
