package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonOnboarding extends CatalogButton {
    public static final Serializer.c<CatalogButtonOnboarding> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List<CatalogFilterData> g;
    public final String h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonOnboarding> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonOnboarding a(Serializer serializer) {
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
            if (H3 == null) {
                H3 = str;
            }
            String H4 = serializer.H();
            if (H4 != null) {
                str = H4;
            }
            return new CatalogButtonOnboarding(H, H2, H3, str, serializer.l(CatalogFilterData.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonOnboarding[i];
        }
    }

    public CatalogButtonOnboarding(String str, String str2, String str3, String str4, List<CatalogFilterData> list, String str5) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.W(this.g);
        serializer.j0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonOnboarding)) {
            return false;
        }
        CatalogButtonOnboarding catalogButtonOnboarding = (CatalogButtonOnboarding) obj;
        return epx.f(this.c, catalogButtonOnboarding.c) && epx.f(this.d, catalogButtonOnboarding.d) && epx.f(this.e, catalogButtonOnboarding.e) && epx.f(this.f, catalogButtonOnboarding.f) && epx.f(this.g, catalogButtonOnboarding.g) && epx.f(this.h, catalogButtonOnboarding.h);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = urd0.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        List<CatalogFilterData> list = this.g;
        int hashCode2 = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonOnboarding(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", blockId=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", filters=");
        sb.append(this.g);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
