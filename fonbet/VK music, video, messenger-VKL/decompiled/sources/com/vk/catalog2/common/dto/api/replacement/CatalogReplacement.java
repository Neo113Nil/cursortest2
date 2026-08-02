package com.vk.catalog2.common.dto.api.replacement;

import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: CatalogReplacement.kt */
/* loaded from: classes16.dex */
public final class CatalogReplacement extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogReplacement> CREATOR = new a();
    public final List<String> b;
    public final List<CatalogBlock> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogReplacement> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogReplacement a(Serializer serializer) {
            ArrayList a = com.vk.core.serialize.a.a(serializer);
            ArrayList k = serializer.k(CatalogBlock.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new CatalogReplacement(a, k);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogReplacement[i];
        }
    }

    public CatalogReplacement(List<String> list, List<CatalogBlock> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.l0(this.b);
        serializer.W(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogReplacement)) {
            return false;
        }
        CatalogReplacement catalogReplacement = (CatalogReplacement) obj;
        return epx.f(this.b, catalogReplacement.b) && epx.f(this.c, catalogReplacement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogReplacement(fromBlockIds=");
        sb.append(this.b);
        sb.append(", toBlocks=");
        return ms9.a(')', sb, this.c);
    }
}
