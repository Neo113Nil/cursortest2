package com.vk.superapp.api.dto.auth;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.drm0;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: VkAuthAppScope.kt */
/* loaded from: classes6.dex */
public final class VkAuthAppScope extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkAuthAppScope> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: VkAuthAppScope.kt */
    public static final class a {
        public static VkAuthAppScope a(JSONObject jSONObject) {
            String optString = jSONObject.optString("description");
            if (optString == null || drm0.N(optString)) {
                optString = null;
            }
            return new VkAuthAppScope(jSONObject.getString("name"), jSONObject.optString("title"), optString);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VkAuthAppScope> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkAuthAppScope a(Serializer serializer) {
            return new VkAuthAppScope(serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkAuthAppScope[i];
        }
    }

    public VkAuthAppScope(String str, String str2, String str3) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkAuthAppScope)) {
            return false;
        }
        VkAuthAppScope vkAuthAppScope = (VkAuthAppScope) obj;
        return epx.f(this.b, vkAuthAppScope.b) && epx.f(this.c, vkAuthAppScope.c) && epx.f(this.d, vkAuthAppScope.d);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthAppScope(name=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        return ho8.a(sb, this.d, ')');
    }
}
