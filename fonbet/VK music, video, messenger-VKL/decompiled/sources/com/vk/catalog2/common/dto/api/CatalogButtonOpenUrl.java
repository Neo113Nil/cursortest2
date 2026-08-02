package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonOpenUrl extends CatalogButton {
    public static final Serializer.c<CatalogButtonOpenUrl> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final ActionOpenUrl f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonOpenUrl> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonOpenUrl a(Serializer serializer) {
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
            return new CatalogButtonOpenUrl(H, H2, str, (ActionOpenUrl) serializer.G(Action.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonOpenUrl[i];
        }
    }

    public /* synthetic */ CatalogButtonOpenUrl(String str, String str2, String str3, ActionOpenUrl actionOpenUrl, String str4, String str5, String str6, String str7, String str8, int i, zcl zclVar) {
        this(str, str2, str3, actionOpenUrl, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonOpenUrl)) {
            return false;
        }
        CatalogButtonOpenUrl catalogButtonOpenUrl = (CatalogButtonOpenUrl) obj;
        return epx.f(this.c, catalogButtonOpenUrl.c) && epx.f(this.d, catalogButtonOpenUrl.d) && epx.f(this.e, catalogButtonOpenUrl.e) && epx.f(this.f, catalogButtonOpenUrl.f) && epx.f(this.g, catalogButtonOpenUrl.g) && epx.f(this.h, catalogButtonOpenUrl.h) && epx.f(this.i, catalogButtonOpenUrl.i) && epx.f(this.j, catalogButtonOpenUrl.j) && epx.f(this.k, catalogButtonOpenUrl.k);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        ActionOpenUrl actionOpenUrl = this.f;
        int hashCode2 = (a2 + (actionOpenUrl == null ? 0 : actionOpenUrl.hashCode())) * 31;
        String str2 = this.g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonOpenUrl(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", openUrlAction=");
        sb.append(this.f);
        sb.append(", consumeReason=");
        sb.append(this.g);
        sb.append(", icon=");
        sb.append(this.h);
        sb.append(", clickEventType=");
        sb.append(this.i);
        sb.append(", trackCode=");
        sb.append(this.j);
        sb.append(", style=");
        return ho8.a(sb, this.k, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }

    public CatalogButtonOpenUrl(String str, String str2, String str3, ActionOpenUrl actionOpenUrl, String str4, String str5, String str6, String str7, String str8) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = actionOpenUrl;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
    }
}
