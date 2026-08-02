package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonOpenChallenge extends CatalogButton {
    public static final Serializer.c<CatalogButtonOpenChallenge> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonOpenChallenge> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonOpenChallenge a(Serializer serializer) {
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
            return new CatalogButtonOpenChallenge(H, H2, H3, str, serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonOpenChallenge[i];
        }
    }

    public /* synthetic */ CatalogButtonOpenChallenge(String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonOpenChallenge)) {
            return false;
        }
        CatalogButtonOpenChallenge catalogButtonOpenChallenge = (CatalogButtonOpenChallenge) obj;
        return epx.f(this.c, catalogButtonOpenChallenge.c) && epx.f(this.d, catalogButtonOpenChallenge.d) && epx.f(this.e, catalogButtonOpenChallenge.e) && epx.f(this.f, catalogButtonOpenChallenge.f) && epx.f(this.g, catalogButtonOpenChallenge.g);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = urd0.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        return a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonOpenChallenge(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", blockId=");
        sb.append(this.e);
        sb.append(", hashtag=");
        sb.append(this.f);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }

    public CatalogButtonOpenChallenge(String str, String str2, String str3, String str4, String str5) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }
}
