package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonPlayVideosFromBlock extends CatalogButton {
    public static final Serializer.c<CatalogButtonPlayVideosFromBlock> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List<String> i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonPlayVideosFromBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonPlayVideosFromBlock a(Serializer serializer) {
            String H = serializer.H();
            String str = H == null ? "" : H;
            String H2 = serializer.H();
            String H3 = serializer.H();
            return new CatalogButtonPlayVideosFromBlock(str, H2, H3 == null ? "" : H3, serializer.H(), serializer.H(), serializer.H(), com.vk.core.serialize.a.a(serializer));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonPlayVideosFromBlock[i];
        }
    }

    public /* synthetic */ CatalogButtonPlayVideosFromBlock(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : list);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.h);
        serializer.j0(this.f);
        serializer.l0(this.i);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonPlayVideosFromBlock)) {
            return false;
        }
        CatalogButtonPlayVideosFromBlock catalogButtonPlayVideosFromBlock = (CatalogButtonPlayVideosFromBlock) obj;
        return epx.f(this.c, catalogButtonPlayVideosFromBlock.c) && epx.f(this.d, catalogButtonPlayVideosFromBlock.d) && epx.f(this.e, catalogButtonPlayVideosFromBlock.e) && epx.f(this.f, catalogButtonPlayVideosFromBlock.f) && epx.f(this.g, catalogButtonPlayVideosFromBlock.g) && epx.f(this.h, catalogButtonPlayVideosFromBlock.h) && epx.f(this.i, catalogButtonPlayVideosFromBlock.i);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.i;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonPlayVideosFromBlock(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", videoBlockId=");
        sb.append(this.f);
        sb.append(", style=");
        sb.append(this.g);
        sb.append(", consumeReason=");
        sb.append(this.h);
        sb.append(", videosToPlay=");
        return ms9.a(')', sb, this.i);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }

    public CatalogButtonPlayVideosFromBlock(String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = list;
    }
}
