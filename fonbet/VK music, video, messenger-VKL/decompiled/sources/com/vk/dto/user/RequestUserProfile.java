package com.vk.dto.user;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.fkq0;

/* loaded from: classes18.dex */
public class RequestUserProfile extends UserProfile {
    public static final Serializer.c<RequestUserProfile> CREATOR = new a();
    public String h0;

    @Nullable
    public Boolean i0;

    @Nullable
    public UserProfile[] j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public final boolean o0;
    public boolean p0;
    public boolean q0;
    public String r0;
    public String s0;
    public String t0;

    public class a extends Serializer.c<RequestUserProfile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RequestUserProfile a(@NonNull Serializer serializer) {
            return new RequestUserProfile(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RequestUserProfile[i];
        }
    }

    public RequestUserProfile() {
        this.q0 = false;
    }

    @Override // com.vk.dto.user.UserProfile, com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(@NonNull Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.h0);
        Boolean bool = this.i0;
        serializer.L(bool == null ? (byte) -1 : bool.booleanValue() ? (byte) 1 : (byte) 0);
        UserProfile[] userProfileArr = this.j0;
        int length = userProfileArr == null ? 0 : userProfileArr.length;
        serializer.S(length);
        for (int i = 0; i < length; i++) {
            serializer.i0(this.j0[i]);
        }
        serializer.S(this.k0);
        serializer.L(this.l0 ? (byte) 1 : (byte) 0);
        serializer.L(this.m0 ? (byte) 1 : (byte) 0);
        serializer.L(this.n0 ? (byte) 1 : (byte) 0);
        serializer.L(this.o0 ? (byte) 1 : (byte) 0);
        serializer.L(this.p0 ? (byte) 1 : (byte) 0);
        serializer.L(this.q0 ? (byte) 1 : (byte) 0);
        serializer.j0(this.r0);
        serializer.j0(this.s0);
        serializer.j0(this.t0);
    }

    @Override // com.vk.dto.user.UserProfile
    public final void R(JSONObject jSONObject) {
        this.c = new UserId(jSONObject.optLong("id"));
        this.t0 = jSONObject.optString("access_key");
    }

    @Override // com.vk.dto.user.UserProfile
    public boolean equals(Object obj) {
        String str;
        if (fkq0.c(this.c) || (str = this.t0) == null) {
            return super.equals(obj);
        }
        if (obj instanceof RequestUserProfile) {
            return TextUtils.equals(str, ((RequestUserProfile) obj).t0);
        }
        return false;
    }

    @Override // com.vk.dto.user.UserProfile
    public int hashCode() {
        String str;
        return (fkq0.c(this.c) || (str = this.t0) == null) ? super.hashCode() : str.hashCode();
    }

    public RequestUserProfile(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        this.q0 = false;
        this.o0 = "new".equals(jSONObject.optString("recommendation_state", ""));
    }

    public RequestUserProfile(UserProfile userProfile) {
        super(userProfile);
        this.q0 = false;
    }

    public RequestUserProfile(Serializer serializer) {
        super(serializer);
        Boolean valueOf;
        this.q0 = false;
        this.h0 = serializer.H();
        byte p = serializer.p();
        if (p == -1) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(p == 1);
        }
        this.i0 = valueOf;
        int u = serializer.u();
        this.j0 = new UserProfile[u];
        for (int i = 0; i < u; i++) {
            this.j0[i] = (UserProfile) serializer.G(UserProfile.class.getClassLoader());
        }
        this.k0 = serializer.u();
        this.l0 = serializer.m();
        this.m0 = serializer.m();
        this.n0 = serializer.m();
        this.o0 = serializer.m();
        this.p0 = serializer.m();
        this.q0 = serializer.m();
        this.r0 = serializer.H();
        this.s0 = serializer.H();
        this.t0 = serializer.H();
    }
}
