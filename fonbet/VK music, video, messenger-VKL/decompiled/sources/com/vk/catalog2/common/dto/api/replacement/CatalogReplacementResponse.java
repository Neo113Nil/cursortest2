package com.vk.catalog2.common.dto.api.replacement;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogReplacementResponse.kt */
/* loaded from: classes16.dex */
public final class CatalogReplacementResponse extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogReplacementResponse> CREATOR = new a();
    public final List<CatalogReplacement> b;
    public final CatalogExtendedData c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogReplacementResponse> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogReplacementResponse a(Serializer serializer) {
            ArrayList k = serializer.k(CatalogReplacement.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new CatalogReplacementResponse(k, (CatalogExtendedData) serializer.G(CatalogExtendedData.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogReplacementResponse[i];
        }
    }

    public CatalogReplacementResponse(List<CatalogReplacement> list, CatalogExtendedData catalogExtendedData, String str) {
        this.b = list;
        this.c = catalogExtendedData;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogReplacementResponse)) {
            return false;
        }
        CatalogReplacementResponse catalogReplacementResponse = (CatalogReplacementResponse) obj;
        return epx.f(this.b, catalogReplacementResponse.b) && epx.f(this.c, catalogReplacementResponse.c) && epx.f(this.d, catalogReplacementResponse.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogReplacementResponse(replacements=");
        sb.append(this.b);
        sb.append(", extendedData=");
        sb.append(this.c);
        sb.append(", newNextFrom=");
        return ho8.a(sb, this.d, ')');
    }
}
