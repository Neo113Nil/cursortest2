package com.vk.catalog2.common.dto.api.hint;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.s3q0;
import xsna.urd0;
import xsna.w9y;

/* compiled from: CatalogHint.kt */
/* loaded from: classes16.dex */
public final class CatalogHint extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<CatalogHint> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final CatalogHintType e;
    public final boolean f;
    public final ArrayList<CatalogButton> g;
    public final String h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogHint> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogHint a(Serializer serializer) {
            return new CatalogHint(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogHint[i];
        }
    }

    public CatalogHint(String str, String str2, String str3, CatalogHintType catalogHintType, boolean z, ArrayList<CatalogButton> arrayList, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = catalogHintType;
        this.f = z;
        this.g = arrayList;
        this.h = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e.h());
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.f0(this.g);
        serializer.j0(this.h);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "id");
        w9yVar.e(this.c, "title");
        w9yVar.e(this.d, "text");
        w9yVar.b(Boolean.valueOf(this.f), "unskipable");
        w9yVar.e(this.g, "actions");
        w9yVar.e(this.h, "campaign_name");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogHint)) {
            return false;
        }
        CatalogHint catalogHint = (CatalogHint) obj;
        return epx.f(this.b, catalogHint.b) && epx.f(this.c, catalogHint.c) && epx.f(this.d, catalogHint.d) && this.e == catalogHint.e && this.f == catalogHint.f && epx.f(this.g, catalogHint.g) && epx.f(this.h, catalogHint.h);
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + qoy.b((this.e.hashCode() + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31, 31, this.f)) * 31;
        String str = this.h;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogHint(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", unskipable=");
        sb.append(this.f);
        sb.append(", actions=");
        sb.append(this.g);
        sb.append(", campaignName=");
        return ho8.a(sb, this.h, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogHint(Serializer serializer) {
        this(r3, r4, r5, r6, r7, r8, r11 == null ? "" : r11);
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        CatalogHintType.a aVar = CatalogHintType.Companion;
        String H4 = serializer.H();
        H4 = H4 == null ? "" : H4;
        aVar.getClass();
        CatalogHintType a2 = CatalogHintType.a.a(H4);
        boolean m = serializer.m();
        ArrayList B = serializer.B(CatalogButton.class.getClassLoader());
        String H5 = serializer.H();
    }
}
