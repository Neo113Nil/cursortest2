package com.vk.dto.common.interactive;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.s3q0;

/* compiled from: InteractiveInfo.kt */
/* loaded from: classes18.dex */
public final class InteractiveInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<InteractiveInfo> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: InteractiveInfo.kt */
    public static final class a {
        public static InteractiveInfo a(String str, JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("manifests");
            if (optJSONObject == null) {
                return null;
            }
            String string = optJSONObject.getString(X3.i.Z);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("current_video");
            if (optJSONObject2 == null) {
                return null;
            }
            return new InteractiveInfo(string, f370.A("ov_id", optJSONObject2), str, f370.A("video_id", optJSONObject2));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<InteractiveInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InteractiveInfo a(Serializer serializer) {
            return new InteractiveInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InteractiveInfo[i];
        }
    }

    public InteractiveInfo(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(X3.i.Z, this.b);
        s3q0 s3q0Var = s3q0.a;
        jSONObject.putOpt("manifests", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.putOpt("ov_id", this.d);
        jSONObject3.putOpt("video_id", this.e);
        jSONObject.putOpt("current_video", jSONObject3);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!InteractiveInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        InteractiveInfo interactiveInfo = (InteractiveInfo) obj;
        return epx.f(this.b, interactiveInfo.b) && epx.f(this.c, interactiveInfo.c) && epx.f(this.d, interactiveInfo.d) && epx.f(this.e, interactiveInfo.e);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractiveInfo(mainManifest=");
        sb.append(this.b);
        sb.append(", currentVideoOvid=");
        sb.append(this.c);
        sb.append(", currentProjectOvid=");
        sb.append(this.d);
        sb.append(", currentVideoId=");
        return ho8.a(sb, this.e, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InteractiveInfo(Serializer serializer) {
        this(r0, r2, r3, r5 != null ? r5 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        H3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
    }
}
