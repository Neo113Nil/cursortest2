package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonToggleSubscriptionCurator extends CatalogButton {
    public static final Serializer.c<CatalogButtonToggleSubscriptionCurator> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonToggleSubscriptionCurator> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonToggleSubscriptionCurator a(Serializer serializer) {
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
            return new CatalogButtonToggleSubscriptionCurator(H, H2, str, serializer.m(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonToggleSubscriptionCurator[i];
        }
    }

    public CatalogButtonToggleSubscriptionCurator(String str, String str2, String str3, boolean z, String str4) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonToggleSubscriptionCurator)) {
            return false;
        }
        CatalogButtonToggleSubscriptionCurator catalogButtonToggleSubscriptionCurator = (CatalogButtonToggleSubscriptionCurator) obj;
        return epx.f(this.c, catalogButtonToggleSubscriptionCurator.c) && epx.f(this.d, catalogButtonToggleSubscriptionCurator.d) && epx.f(this.e, catalogButtonToggleSubscriptionCurator.e) && this.f == catalogButtonToggleSubscriptionCurator.f && epx.f(this.g, catalogButtonToggleSubscriptionCurator.g);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int b = qoy.b(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonToggleSubscriptionCurator(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", curatorId=");
        sb.append(this.e);
        sb.append(", isFollowed=");
        sb.append(this.f);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
