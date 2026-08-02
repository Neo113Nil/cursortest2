package com.vk.superapp.core.api.models;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: BanInfo.kt */
/* loaded from: classes6.dex */
public final class BanInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<BanInfo> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: BanInfo.kt */
    public static final class a {
        public static BanInfo a(JSONObject jSONObject) {
            return new BanInfo(jSONObject.optString("member_name"), jSONObject.optString(SharedKt.PARAM_ACCESS_TOKEN), jSONObject.optString("secret"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<BanInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BanInfo a(Serializer serializer) {
            return new BanInfo(serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BanInfo[i];
        }
    }

    public BanInfo() {
        this(null, null, null, 7, null);
    }

    public final String Ab() {
        return this.b;
    }

    public final String Bb() {
        return this.d;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BanInfo)) {
            return false;
        }
        BanInfo banInfo = (BanInfo) obj;
        return epx.f(this.b, banInfo.b) && epx.f(this.c, banInfo.c) && epx.f(this.d, banInfo.d);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BanInfo(memberName=");
        sb.append(this.b);
        sb.append(", accessToken=");
        sb.append(this.c);
        sb.append(", secret=");
        return ho8.a(sb, this.d, ')');
    }

    public final String zb() {
        return this.c;
    }

    public /* synthetic */ BanInfo(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public BanInfo(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
