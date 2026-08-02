package com.vk.catalog2.common.dto.api.block;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: CatalogBlockAnchorInfo.kt */
/* loaded from: classes16.dex */
public final class CatalogBlockAnchorInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<CatalogBlockAnchorInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogBlockAnchorInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogBlockAnchorInfo a(Serializer serializer) {
            return new CatalogBlockAnchorInfo(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogBlockAnchorInfo[i];
        }
    }

    public CatalogBlockAnchorInfo() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "tag");
        w9yVar.e(this.c, "token");
        w9yVar.e(this.d, "ref");
        w9yVar.e(this.e, "product_data");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBlockAnchorInfo)) {
            return false;
        }
        CatalogBlockAnchorInfo catalogBlockAnchorInfo = (CatalogBlockAnchorInfo) obj;
        return epx.f(this.b, catalogBlockAnchorInfo.b) && epx.f(this.c, catalogBlockAnchorInfo.c) && epx.f(this.d, catalogBlockAnchorInfo.d) && epx.f(this.e, catalogBlockAnchorInfo.e);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBlockAnchorInfo(tag=");
        sb.append(this.b);
        sb.append(", token=");
        sb.append(this.c);
        sb.append(", ref=");
        sb.append(this.d);
        sb.append(", productData=");
        return ho8.a(sb, this.e, ')');
    }

    public /* synthetic */ CatalogBlockAnchorInfo(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public CatalogBlockAnchorInfo(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public CatalogBlockAnchorInfo(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H());
    }
}
