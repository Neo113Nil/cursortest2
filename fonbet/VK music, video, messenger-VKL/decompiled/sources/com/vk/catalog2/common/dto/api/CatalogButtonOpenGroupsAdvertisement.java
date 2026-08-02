package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonOpenGroupsAdvertisement extends CatalogButton {
    public static final Serializer.c<CatalogButtonOpenGroupsAdvertisement> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final UserId f;
    public final ActionOpenUrl g;
    public final String h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonOpenGroupsAdvertisement> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonOpenGroupsAdvertisement a(Serializer serializer) {
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
            return new CatalogButtonOpenGroupsAdvertisement(H, H2, str, (UserId) serializer.A(UserId.class.getClassLoader()), (ActionOpenUrl) serializer.G(Action.class.getClassLoader()), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonOpenGroupsAdvertisement[i];
        }
    }

    public CatalogButtonOpenGroupsAdvertisement(String str, String str2, String str3, UserId userId, ActionOpenUrl actionOpenUrl, String str4, String str5) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = userId;
        this.g = actionOpenUrl;
        this.h = str4;
        this.i = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.e0(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonOpenGroupsAdvertisement)) {
            return false;
        }
        CatalogButtonOpenGroupsAdvertisement catalogButtonOpenGroupsAdvertisement = (CatalogButtonOpenGroupsAdvertisement) obj;
        return epx.f(this.c, catalogButtonOpenGroupsAdvertisement.c) && epx.f(this.d, catalogButtonOpenGroupsAdvertisement.d) && epx.f(this.e, catalogButtonOpenGroupsAdvertisement.e) && epx.f(this.f, catalogButtonOpenGroupsAdvertisement.f) && epx.f(this.g, catalogButtonOpenGroupsAdvertisement.g) && epx.f(this.h, catalogButtonOpenGroupsAdvertisement.h) && epx.f(this.i, catalogButtonOpenGroupsAdvertisement.i);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = bh10.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f.b);
        ActionOpenUrl actionOpenUrl = this.g;
        int hashCode2 = (a2 + (actionOpenUrl == null ? 0 : actionOpenUrl.hashCode())) * 31;
        String str2 = this.h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonOpenGroupsAdvertisement(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", ownerId=");
        sb.append(this.f);
        sb.append(", openUrlAction=");
        sb.append(this.g);
        sb.append(", consumeReason=");
        sb.append(this.h);
        sb.append(", clickEventType=");
        return ho8.a(sb, this.i, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
