package com.vk.dto.friends.discover;

import com.vk.core.serialize.Serializer;
import com.vk.dto.profile.Occupation;
import com.vk.dto.user.RequestUserProfile;
import org.json.JSONObject;
import xsna.ahn;
import xsna.cqm0;
import xsna.epx;

/* compiled from: UserDiscoverItem.kt */
/* loaded from: classes18.dex */
public final class UserDiscoverItem extends RequestUserProfile {
    public final String A0;
    public final Occupation u0;
    public final int v0;
    public final String w0;
    public final String x0;
    public final String y0;
    public final String z0;
    public static final Serializer.c<UserDiscoverItem> CREATOR = new a();
    public static final String B0 = "crop_photo,bdate,has_photo,city,mutual,first_name_acc,occupation,relation,photo_base,screen_name";

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UserDiscoverItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UserDiscoverItem a(Serializer serializer) {
            return new UserDiscoverItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserDiscoverItem[i];
        }
    }

    public UserDiscoverItem(JSONObject jSONObject, boolean z, Occupation occupation, int i) {
        super(jSONObject);
        this.S = jSONObject.optInt("has_photo", z ? 1 : 0) == 1;
        JSONObject optJSONObject = jSONObject.optJSONObject("occupation");
        this.u0 = optJSONObject != null ? ahn.A(optJSONObject) : occupation;
        this.v0 = jSONObject.optInt("relation", i);
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = cqm0.a(jSONObject.optString("screen_name"));
        this.g = cqm0.a(jSONObject.optString("photo_base"));
    }

    @Override // com.vk.dto.user.RequestUserProfile, com.vk.dto.user.UserProfile, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.u0);
        serializer.S(this.v0);
        serializer.j0(this.w0);
        serializer.j0(this.x0);
        serializer.j0(this.y0);
        serializer.j0(this.z0);
        serializer.j0(this.A0);
    }

    @Override // com.vk.dto.user.RequestUserProfile, com.vk.dto.user.UserProfile
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserDiscoverItem) {
            return epx.f(this.c, ((UserDiscoverItem) obj).c);
        }
        return false;
    }

    @Override // com.vk.dto.user.RequestUserProfile, com.vk.dto.user.UserProfile
    public final int hashCode() {
        return Long.hashCode(this.c.b);
    }

    public UserDiscoverItem(RequestUserProfile requestUserProfile, JSONObject jSONObject, boolean z, Occupation occupation, int i) {
        super(requestUserProfile);
        this.S = jSONObject.optInt("has_photo", z ? 1 : 0) == 1;
        JSONObject optJSONObject = jSONObject.optJSONObject("occupation");
        this.u0 = optJSONObject != null ? ahn.A(optJSONObject) : occupation;
        this.v0 = jSONObject.optInt("relation", i);
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = cqm0.a(jSONObject.optString("screen_name"));
        this.g = cqm0.a(jSONObject.optString("photo_base"));
    }

    public UserDiscoverItem(UserDiscoverItem userDiscoverItem, JSONObject jSONObject) {
        super(userDiscoverItem);
        this.S = jSONObject.optInt("has_photo", userDiscoverItem.S ? 1 : 0) == 1;
        JSONObject optJSONObject = jSONObject.optJSONObject("occupation");
        this.u0 = optJSONObject != null ? ahn.A(optJSONObject) : userDiscoverItem.u0;
        this.v0 = jSONObject.optInt("relation", userDiscoverItem.v0);
        this.w0 = cqm0.a(userDiscoverItem.w0);
        this.x0 = cqm0.a(userDiscoverItem.x0);
        this.y0 = cqm0.a(userDiscoverItem.y0);
        this.z0 = cqm0.a(userDiscoverItem.z0);
        String str = userDiscoverItem.A0;
        this.A0 = cqm0.a(jSONObject.optString("screen_name", str == null ? "" : str));
        String str2 = userDiscoverItem.g;
        this.g = cqm0.a(jSONObject.optString("photo_base", str2 != null ? str2 : ""));
    }

    public UserDiscoverItem(Serializer serializer) {
        super(serializer);
        this.u0 = (Occupation) serializer.G(Occupation.class.getClassLoader());
        this.v0 = serializer.u();
        this.w0 = serializer.H();
        this.x0 = serializer.H();
        this.y0 = serializer.H();
        this.z0 = serializer.H();
        this.A0 = serializer.H();
    }
}
