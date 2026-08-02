package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonMusicSubscription extends CatalogButton {
    public static final Serializer.c<CatalogButtonMusicSubscription> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonMusicSubscription> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonMusicSubscription a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            String H3 = serializer.H();
            return new CatalogButtonMusicSubscription(H, H2, H3 != null ? H3 : "", serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonMusicSubscription[i];
        }
    }

    public CatalogButtonMusicSubscription(String str, String str2, String str3, String str4) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonMusicSubscription)) {
            return false;
        }
        CatalogButtonMusicSubscription catalogButtonMusicSubscription = (CatalogButtonMusicSubscription) obj;
        return epx.f(this.c, catalogButtonMusicSubscription.c) && epx.f(this.d, catalogButtonMusicSubscription.d) && epx.f(this.e, catalogButtonMusicSubscription.e) && epx.f(this.f, catalogButtonMusicSubscription.f);
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
        return a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonMusicSubscription(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", style=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
