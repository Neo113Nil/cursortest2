package com.vk.catalog2.common.dto.api.block;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogArtistInfo.kt */
/* loaded from: classes16.dex */
public final class CatalogArtistInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogArtistInfo> CREATOR = new a();
    public final List<CatalogArtistChip> b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogArtistInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogArtistInfo a(Serializer serializer) {
            return new CatalogArtistInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogArtistInfo[i];
        }
    }

    public CatalogArtistInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.f0(this.b);
        serializer.J(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogArtistInfo)) {
            return false;
        }
        CatalogArtistInfo catalogArtistInfo = (CatalogArtistInfo) obj;
        return epx.f(this.b, catalogArtistInfo.b) && epx.f(this.c, catalogArtistInfo.c) && epx.f(this.d, catalogArtistInfo.d) && epx.f(this.e, catalogArtistInfo.e) && epx.f(this.f, catalogArtistInfo.f) && epx.f(this.g, catalogArtistInfo.g) && epx.f(this.h, catalogArtistInfo.h) && epx.f(this.i, catalogArtistInfo.i);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Boolean bool = this.c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogArtistInfo(chips=");
        sb.append(this.b);
        sb.append(", isForeignAgent=");
        sb.append(this.c);
        sb.append(", playTrackCode=");
        sb.append(this.d);
        sb.append(", subscriptionTrackCode=");
        sb.append(this.e);
        sb.append(", subscriptionBioTrackCode=");
        sb.append(this.f);
        sb.append(", viewTrackCode=");
        sb.append(this.g);
        sb.append(", expandTrackCode=");
        sb.append(this.h);
        sb.append(", playActionRef=");
        return ho8.a(sb, this.i, ')');
    }

    public CatalogArtistInfo(List<CatalogArtistChip> list, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        this.b = list;
        this.c = bool;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public CatalogArtistInfo(Serializer serializer) {
        this(serializer.B(CatalogArtistChip.class.getClassLoader()), serializer.n(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public CatalogArtistInfo(java.util.List r2, java.lang.Boolean r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, xsna.zcl r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.b
        L6:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto Lc
            r3 = r0
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L11
            r4 = r0
        L11:
            r11 = r10 & 8
            if (r11 == 0) goto L16
            r5 = r0
        L16:
            r11 = r10 & 16
            if (r11 == 0) goto L1b
            r6 = r0
        L1b:
            r11 = r10 & 32
            if (r11 == 0) goto L20
            r7 = r0
        L20:
            r11 = r10 & 64
            if (r11 == 0) goto L25
            r8 = r0
        L25:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L33
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3c
        L33:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3c:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.catalog2.common.dto.api.block.CatalogArtistInfo.<init>(java.util.List, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, xsna.zcl):void");
    }
}
