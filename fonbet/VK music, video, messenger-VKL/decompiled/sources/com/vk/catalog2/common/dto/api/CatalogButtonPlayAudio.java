package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonPlayAudio extends CatalogButton {
    public static final Serializer.c<CatalogButtonPlayAudio> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final UserId g;
    public final String h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonPlayAudio> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonPlayAudio a(Serializer serializer) {
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
            return new CatalogButtonPlayAudio(H, H2, str, serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonPlayAudio[i];
        }
    }

    public /* synthetic */ CatalogButtonPlayAudio(String str, String str2, String str3, int i, UserId userId, String str4, int i2, zcl zclVar) {
        this(str, str2, str3, i, userId, (i2 & 32) != 0 ? null : str4);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.e0(this.g);
        serializer.j0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonPlayAudio)) {
            return false;
        }
        CatalogButtonPlayAudio catalogButtonPlayAudio = (CatalogButtonPlayAudio) obj;
        return epx.f(this.c, catalogButtonPlayAudio.c) && epx.f(this.d, catalogButtonPlayAudio.d) && epx.f(this.e, catalogButtonPlayAudio.e) && this.f == catalogButtonPlayAudio.f && epx.f(this.g, catalogButtonPlayAudio.g) && epx.f(this.h, catalogButtonPlayAudio.h);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = bh10.a(shy.a(this.f, urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31), 31, this.g.b);
        String str2 = this.h;
        return a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonPlayAudio(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", blockId=");
        sb.append(this.e);
        sb.append(", audioId=");
        sb.append(this.f);
        sb.append(", ownerId=");
        sb.append(this.g);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }

    public CatalogButtonPlayAudio(String str, String str2, String str3, int i, UserId userId, String str4) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = userId;
        this.h = str4;
    }
}
