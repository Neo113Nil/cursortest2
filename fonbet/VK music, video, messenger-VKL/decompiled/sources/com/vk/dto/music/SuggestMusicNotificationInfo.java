package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.urd0;
import xsna.w9y;

/* compiled from: SuggestMusicNotificationInfo.kt */
/* loaded from: classes18.dex */
public final class SuggestMusicNotificationInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<SuggestMusicNotificationInfo> CREATOR = new b();
    public static final a e = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<SuggestMusicNotificationInfo> {
        @Override // xsna.aay
        public final SuggestMusicNotificationInfo a(JSONObject jSONObject) {
            return new SuggestMusicNotificationInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<SuggestMusicNotificationInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SuggestMusicNotificationInfo a(Serializer serializer) {
            return new SuggestMusicNotificationInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SuggestMusicNotificationInfo[i];
        }
    }

    public SuggestMusicNotificationInfo(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "id");
        w9yVar.e(this.c, "title");
        w9yVar.e(this.d, "subtitle");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestMusicNotificationInfo)) {
            return false;
        }
        SuggestMusicNotificationInfo suggestMusicNotificationInfo = (SuggestMusicNotificationInfo) obj;
        return epx.f(this.b, suggestMusicNotificationInfo.b) && epx.f(this.c, suggestMusicNotificationInfo.c) && epx.f(this.d, suggestMusicNotificationInfo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestMusicNotificationInfo(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        return ho8.a(sb, this.d, ')');
    }

    public SuggestMusicNotificationInfo(JSONObject jSONObject) {
        this(jSONObject.optString("id", ""), jSONObject.optString("title", ""), jSONObject.optString("subtitle", ""));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SuggestMusicNotificationInfo(Serializer serializer) {
        this(r0, r2, r4 != null ? r4 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
    }
}
