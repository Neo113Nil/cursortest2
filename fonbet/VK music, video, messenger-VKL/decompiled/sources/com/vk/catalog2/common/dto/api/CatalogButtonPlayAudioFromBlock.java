package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.rdi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonPlayAudioFromBlock extends CatalogButton {
    public static final Serializer.c<CatalogButtonPlayAudioFromBlock> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List<String> g;
    public final boolean h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonPlayAudioFromBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonPlayAudioFromBlock a(Serializer serializer) {
            String H = serializer.H();
            String str = H == null ? "" : H;
            String H2 = serializer.H();
            String H3 = serializer.H();
            String str2 = H3 == null ? "" : H3;
            boolean m = serializer.m();
            String H4 = serializer.H();
            String H5 = serializer.H();
            return new CatalogButtonPlayAudioFromBlock(str, H2, H5 == null ? "" : H5, str2, rdi.x(com.vk.core.serialize.a.a(serializer)), m, H4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonPlayAudioFromBlock[i];
        }
    }

    public /* synthetic */ CatalogButtonPlayAudioFromBlock(String str, String str2, String str3, String str4, List list, boolean z, String str5, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str5);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.f);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.j0(this.i);
        serializer.j0(this.e);
        serializer.l0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonPlayAudioFromBlock)) {
            return false;
        }
        CatalogButtonPlayAudioFromBlock catalogButtonPlayAudioFromBlock = (CatalogButtonPlayAudioFromBlock) obj;
        return epx.f(this.c, catalogButtonPlayAudioFromBlock.c) && epx.f(this.d, catalogButtonPlayAudioFromBlock.d) && epx.f(this.e, catalogButtonPlayAudioFromBlock.e) && epx.f(this.f, catalogButtonPlayAudioFromBlock.f) && epx.f(this.g, catalogButtonPlayAudioFromBlock.g) && this.h == catalogButtonPlayAudioFromBlock.h && epx.f(this.i, catalogButtonPlayAudioFromBlock.i);
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
        List<String> list = this.g;
        int b = qoy.b((hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.h);
        String str3 = this.i;
        return b + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonPlayAudioFromBlock(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", musicTracksPageId=");
        sb.append(this.f);
        sb.append(", tracksToPlay=");
        sb.append(this.g);
        sb.append(", isShuffled=");
        sb.append(this.h);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.i, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }

    public CatalogButtonPlayAudioFromBlock(String str, String str2, String str3, String str4, List<String> list, boolean z, String str5) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = z;
        this.i = str5;
    }
}
