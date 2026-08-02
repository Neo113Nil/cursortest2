package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonSearchMode extends CatalogButton {
    public static final Serializer.c<CatalogButtonSearchMode> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final UserId j;
    public final String k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonSearchMode> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonSearchMode a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonSearchMode(H, serializer.I(), serializer.I(), serializer.I(), serializer.I(), serializer.I(), serializer.I(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonSearchMode[i];
        }
    }

    public /* synthetic */ CatalogButtonSearchMode(String str, String str2, String str3, String str4, String str5, String str6, String str7, UserId userId, String str8, int i, zcl zclVar) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : userId, (i & 256) != 0 ? null : str8);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.m0(this.d);
        serializer.m0(this.e);
        serializer.m0(this.f);
        serializer.m0(this.g);
        serializer.m0(this.h);
        serializer.m0(this.i);
        serializer.e0(this.j);
        serializer.m0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonSearchMode)) {
            return false;
        }
        CatalogButtonSearchMode catalogButtonSearchMode = (CatalogButtonSearchMode) obj;
        return epx.f(this.c, catalogButtonSearchMode.c) && epx.f(this.d, catalogButtonSearchMode.d) && epx.f(this.e, catalogButtonSearchMode.e) && epx.f(this.f, catalogButtonSearchMode.f) && epx.f(this.g, catalogButtonSearchMode.g) && epx.f(this.h, catalogButtonSearchMode.h) && epx.f(this.i, catalogButtonSearchMode.i) && epx.f(this.j, catalogButtonSearchMode.j) && epx.f(this.k, catalogButtonSearchMode.k);
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
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        UserId userId = this.j;
        int hashCode8 = (hashCode7 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str7 = this.k;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonSearchMode(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", blockId=");
        sb.append(this.e);
        sb.append(", searchType=");
        sb.append(this.f);
        sb.append(", sectionId=");
        sb.append(this.g);
        sb.append(", consumeReason=");
        sb.append(this.h);
        sb.append(", placeholder=");
        sb.append(this.i);
        sb.append(", ownerId=");
        sb.append(this.j);
        sb.append(", style=");
        return ho8.a(sb, this.k, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }

    public CatalogButtonSearchMode(String str, String str2, String str3, String str4, String str5, String str6, String str7, UserId userId, String str8) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = userId;
        this.k = str8;
    }
}
