package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonHideBlock extends CatalogButton {
    public static final Serializer.c<CatalogButtonHideBlock> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final UserId g;
    public final List<String> h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonHideBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonHideBlock a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonHideBlock(H, serializer.H(), serializer.H(), serializer.H(), (UserId) serializer.A(UserId.class.getClassLoader()), com.vk.core.serialize.a.a(serializer), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonHideBlock[i];
        }
    }

    public CatalogButtonHideBlock(String str, String str2, String str3, String str4, UserId userId, List<String> list, String str5) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = userId;
        this.h = list;
        this.i = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.e0(this.g);
        serializer.l0(this.h);
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonHideBlock)) {
            return false;
        }
        CatalogButtonHideBlock catalogButtonHideBlock = (CatalogButtonHideBlock) obj;
        return epx.f(this.c, catalogButtonHideBlock.c) && epx.f(this.d, catalogButtonHideBlock.d) && epx.f(this.e, catalogButtonHideBlock.e) && epx.f(this.f, catalogButtonHideBlock.f) && epx.f(this.g, catalogButtonHideBlock.g) && epx.f(this.h, catalogButtonHideBlock.h) && epx.f(this.i, catalogButtonHideBlock.i);
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
        int a2 = fw3.a(bh10.a(urd0.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g.b), 31, this.h);
        String str3 = this.i;
        return a2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonHideBlock(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", blockId=");
        sb.append(this.f);
        sb.append(", ownerId=");
        sb.append(this.g);
        sb.append(", targetBlockIds=");
        sb.append(this.h);
        sb.append(", refLayoutName=");
        return ho8.a(sb, this.i, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
