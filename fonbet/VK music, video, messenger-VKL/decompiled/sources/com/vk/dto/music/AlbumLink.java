package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;
import xsna.bh10;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.ho8;
import xsna.n40;
import xsna.zcl;

/* compiled from: AlbumLink.kt */
/* loaded from: classes18.dex */
public final class AlbumLink extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AlbumLink> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final String d;
    public final String e;
    public final Thumb f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AlbumLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AlbumLink a(Serializer serializer) {
            return new AlbumLink(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AlbumLink[i];
        }
    }

    public /* synthetic */ AlbumLink(int i, UserId userId, String str, String str2, Thumb thumb, String str3, int i2, zcl zclVar) {
        this(i, userId, str, str2, (i2 & 16) != 0 ? null : thumb, (i2 & 32) != 0 ? null : str3);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.j0(this.g);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new n40(this, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumLink)) {
            return false;
        }
        AlbumLink albumLink = (AlbumLink) obj;
        return this.b == albumLink.b && epx.f(this.c, albumLink.c) && epx.f(this.d, albumLink.d) && epx.f(this.e, albumLink.e) && epx.f(this.f, albumLink.f) && epx.f(this.g, albumLink.g);
    }

    public final int hashCode() {
        int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Thumb thumb = this.f;
        int hashCode3 = (hashCode2 + (thumb == null ? 0 : thumb.hashCode())) * 31;
        String str3 = this.g;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumLink(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", accessKey=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", thumb=");
        sb.append(this.f);
        sb.append(", mainColor=");
        return ho8.a(sb, this.g, ')');
    }

    public AlbumLink(int i, UserId userId, String str, String str2, Thumb thumb, String str3) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = str2;
        this.f = thumb;
        this.g = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AlbumLink(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r0 != null ? (Thumb) Thumb.f.a(r0) : null, jSONObject.optString("main_color"));
        int optInt = jSONObject.optInt("id");
        UserId userId = new UserId(jSONObject.optLong("owner_id"));
        String optString = jSONObject.optString("access_key");
        String optString2 = jSONObject.optString("title");
        JSONObject optJSONObject = jSONObject.optJSONObject("thumb");
    }

    public AlbumLink(Serializer serializer, zcl zclVar) {
        this(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H(), (Thumb) serializer.G(Thumb.class.getClassLoader()), serializer.H());
    }
}
