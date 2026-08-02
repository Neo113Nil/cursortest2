package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonClearRecent extends CatalogButton {
    public static final Serializer.c<CatalogButtonClearRecent> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final List<String> f;
    public final String g;
    public final String h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonClearRecent> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonClearRecent a(Serializer serializer) {
            String str;
            String H = serializer.H();
            if (H == null) {
                H = "";
                str = H;
            } else {
                str = "";
            }
            String H2 = serializer.H();
            String H3 = serializer.H();
            if (H3 != null) {
                str = H3;
            }
            return new CatalogButtonClearRecent(H, H2, str, com.vk.core.serialize.a.a(serializer), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonClearRecent[i];
        }
    }

    public /* synthetic */ CatalogButtonClearRecent(String str, String str2, String str3, List list, String str4, String str5, int i, zcl zclVar) {
        this(str, str2, str3, list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.l0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonClearRecent)) {
            return false;
        }
        CatalogButtonClearRecent catalogButtonClearRecent = (CatalogButtonClearRecent) obj;
        return epx.f(this.c, catalogButtonClearRecent.c) && epx.f(this.d, catalogButtonClearRecent.d) && epx.f(this.e, catalogButtonClearRecent.e) && epx.f(this.f, catalogButtonClearRecent.f) && epx.f(this.g, catalogButtonClearRecent.g) && epx.f(this.h, catalogButtonClearRecent.h);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = fw3.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonClearRecent(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", blocksIds=");
        sb.append(this.f);
        sb.append(", consumeReason=");
        sb.append(this.g);
        sb.append(", trackCode=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }

    public CatalogButtonClearRecent(String str, String str2, String str3, List<String> list, String str4, String str5) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = list;
        this.g = str4;
        this.h = str5;
    }
}
