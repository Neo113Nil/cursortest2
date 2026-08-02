package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import java.util.Objects;
import org.json.JSONObject;
import xsna.bxx;
import xsna.zcl;

/* compiled from: VerifyInfo.kt */
/* loaded from: classes.dex */
public class VerifyInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VerifyInfo> CREATOR = new b();
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    /* compiled from: VerifyInfo.kt */
    public static final class VerifyInfoJSONSerialize extends VerifyInfo implements bxx {
        public static final /* synthetic */ int h = 0;

        public VerifyInfoJSONSerialize() {
            this(false, false, false, false, false, false, 63, null);
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            return Eb(new JSONObject());
        }

        public /* synthetic */ VerifyInfoJSONSerialize(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6);
        }

        public VerifyInfoJSONSerialize(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            super(z, z2, z3, z4, z5, z6);
        }
    }

    /* compiled from: VerifyInfo.kt */
    public static final class a {
        public static VerifyInfo a(JSONObject jSONObject) {
            boolean z = jSONObject.optInt("verified", 0) == 1;
            boolean z2 = jSONObject.optInt("trending", 0) == 1;
            boolean optBoolean = jSONObject.optBoolean("is_verified");
            int optInt = jSONObject.optInt("trust_mark", 0);
            boolean z3 = optInt == 2;
            boolean z4 = optInt == 3;
            boolean z5 = optInt == 4 || optInt == 5;
            boolean z6 = z5;
            if (!b(z, z2, optBoolean, z3, z4, z5)) {
                return null;
            }
            return new VerifyInfo(z, z2, optBoolean, z3, z4, z6);
        }

        public static boolean b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            return z || z2 || z3 || z4 || z5 || z6;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VerifyInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VerifyInfo a(Serializer serializer) {
            VerifyInfo verifyInfo = new VerifyInfo(false, false, false, false, false, false, 63, null);
            verifyInfo.zb(serializer);
            return verifyInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VerifyInfo[i];
        }
    }

    public VerifyInfo() {
        this(false, false, false, false, false, false, 63, null);
    }

    public final void Ab(VerifyInfo verifyInfo) {
        if (verifyInfo != null) {
            this.b = verifyInfo.b;
            this.c = verifyInfo.c;
            this.d = verifyInfo.d;
            this.e = verifyInfo.e;
            this.f = verifyInfo.f;
            this.g = verifyInfo.g;
            return;
        }
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
    }

    public final void Bb(JSONObject jSONObject) {
        this.b = jSONObject.optInt("verified", 0) == 1;
        this.c = jSONObject.optInt("trending", 0) == 1;
        this.d = jSONObject.optBoolean("is_verified");
        int optInt = jSONObject.optInt("trust_mark", 0);
        this.e = optInt == 2;
        this.f = optInt == 3;
        this.g = optInt == 4 || optInt == 5;
    }

    public final boolean Cb() {
        return a.b(this.b, this.c, this.d, false, false, false);
    }

    public final boolean Db() {
        return this.b || this.d;
    }

    public final JSONObject Eb(JSONObject jSONObject) {
        return jSONObject.put("verified", this.b ? 1 : 0).put("trending", this.c ? 1 : 0).put("is_oauth_verified", this.d).put("trust_mark", this.e ? 2 : this.f ? 3 : this.g ? 5 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyInfo)) {
            return false;
        }
        VerifyInfo verifyInfo = (VerifyInfo) obj;
        return this.c == verifyInfo.c && this.b == verifyInfo.b && this.d == verifyInfo.d && this.e == verifyInfo.e && this.f == verifyInfo.f && this.g == verifyInfo.g;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.c), Boolean.valueOf(this.b), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g));
    }

    public final void zb(Serializer serializer) {
        this.b = serializer.m();
        this.c = serializer.m();
        this.d = serializer.m();
        this.e = serializer.m();
        this.f = serializer.m();
        this.g = serializer.m();
    }

    public /* synthetic */ VerifyInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6);
    }

    public VerifyInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }
}
