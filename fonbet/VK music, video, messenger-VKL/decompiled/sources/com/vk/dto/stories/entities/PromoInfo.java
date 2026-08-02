package com.vk.dto.stories.entities;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import org.json.JSONObject;
import xsna.epx;
import xsna.ozl;
import xsna.qoy;

/* compiled from: PromoInfo.kt */
@ozl
/* loaded from: classes18.dex */
public final class PromoInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PromoInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PromoInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PromoInfo a(Serializer serializer) {
            return new PromoInfo(serializer.H(), serializer.H(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromoInfo[i];
        }
    }

    public PromoInfo(String str, String str2, boolean z, boolean z2) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoInfo)) {
            return false;
        }
        PromoInfo promoInfo = (PromoInfo) obj;
        return epx.f(this.b, promoInfo.b) && epx.f(this.c, promoInfo.c) && this.d == promoInfo.d && this.e == promoInfo.e;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.e) + qoy.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoInfo(url=");
        sb.append(this.b);
        sb.append(", ownerName=");
        sb.append(this.c);
        sb.append(", hideOwner=");
        sb.append(this.d);
        sb.append(", hideSettings=");
        return q0.a(sb, this.e, ')');
    }

    public PromoInfo(JSONObject jSONObject) {
        this(jSONObject.optString("url"), jSONObject.optString("owner_name"), jSONObject.optBoolean("hide_owner", false), jSONObject.optBoolean("hide_settings", false));
    }
}
