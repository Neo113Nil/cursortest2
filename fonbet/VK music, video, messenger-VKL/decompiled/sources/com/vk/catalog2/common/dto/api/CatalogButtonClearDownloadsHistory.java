package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.uqi;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonClearDownloadsHistory extends CatalogButton {
    public static final Serializer.c<CatalogButtonClearDownloadsHistory> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonClearDownloadsHistory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonClearDownloadsHistory a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonClearDownloadsHistory(H, serializer.H(), serializer.H(), Integer.valueOf(serializer.u()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonClearDownloadsHistory[i];
        }
    }

    public CatalogButtonClearDownloadsHistory(String str, String str2, String str3, Integer num) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = num;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        Integer num = this.f;
        if (num != null) {
            serializer.S(num.intValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonClearDownloadsHistory)) {
            return false;
        }
        CatalogButtonClearDownloadsHistory catalogButtonClearDownloadsHistory = (CatalogButtonClearDownloadsHistory) obj;
        return epx.f(this.c, catalogButtonClearDownloadsHistory.c) && epx.f(this.d, catalogButtonClearDownloadsHistory.d) && epx.f(this.e, catalogButtonClearDownloadsHistory.e) && epx.f(this.f, catalogButtonClearDownloadsHistory.f);
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
        Integer num = this.f;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonClearDownloadsHistory(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", blockId=");
        sb.append(this.e);
        sb.append(", tracksCount=");
        return uqi.b(sb, this.f, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
