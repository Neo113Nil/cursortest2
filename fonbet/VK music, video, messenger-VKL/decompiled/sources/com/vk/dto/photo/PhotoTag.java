package com.vk.dto.photo;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zjh0;

/* compiled from: PhotoTag.kt */
/* loaded from: classes18.dex */
public final class PhotoTag extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PhotoTag> CREATOR = new b();
    public final int b;
    public final UserId c;
    public final UserId d;
    public final long e;
    public final String f;
    public final String g;
    public final double h;
    public final double i;
    public final double j;
    public final double k;
    public boolean l;
    public final UserProfile m;

    /* compiled from: PhotoTag.kt */
    public static final class a {
        public static PhotoTag a(JSONObject jSONObject) {
            return new PhotoTag(jSONObject.optInt("id"), new UserId(jSONObject.optLong("user_id")), new UserId(jSONObject.optLong("placer_id")), jSONObject.optLong("date"), jSONObject.optString("tagged_name"), jSONObject.optString("description"), jSONObject.optDouble("x"), jSONObject.optDouble("x2"), jSONObject.optDouble("y"), jSONObject.optDouble("y2"), jSONObject.optInt("viewed") == 1, null, 2048, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PhotoTag> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PhotoTag a(Serializer serializer) {
            return new PhotoTag(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.w(), serializer.H(), serializer.H(), serializer.r(), serializer.r(), serializer.r(), serializer.r(), serializer.m(), (UserProfile) serializer.G(UserProfile.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhotoTag[i];
        }
    }

    public /* synthetic */ PhotoTag(int i, UserId userId, UserId userId2, long j, String str, String str2, double d, double d2, double d3, double d4, boolean z, UserProfile userProfile, int i2, zcl zclVar) {
        this(i, userId, userId2, j, str, str2, d, d2, d3, d4, z, (i2 & 2048) != 0 ? null : userProfile);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.e0(this.d);
        serializer.Y(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.O(this.h);
        serializer.O(this.i);
        serializer.O(this.j);
        serializer.O(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.i0(this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoTag)) {
            return false;
        }
        PhotoTag photoTag = (PhotoTag) obj;
        return this.b == photoTag.b && epx.f(this.c, photoTag.c) && epx.f(this.d, photoTag.d) && this.e == photoTag.e && epx.f(this.f, photoTag.f) && epx.f(this.g, photoTag.g) && Double.compare(this.h, photoTag.h) == 0 && Double.compare(this.i, photoTag.i) == 0 && Double.compare(this.j, photoTag.j) == 0 && Double.compare(this.k, photoTag.k) == 0 && this.l == photoTag.l && epx.f(this.m, photoTag.m);
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(bh10.a(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31, this.d.b), 31, this.e), 31, this.f);
        String str = this.g;
        int b2 = qoy.b(zjh0.b(this.k, zjh0.b(this.j, zjh0.b(this.i, zjh0.b(this.h, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31, this.l);
        UserProfile userProfile = this.m;
        return b2 + (userProfile != null ? userProfile.hashCode() : 0);
    }

    public final String toString() {
        return "PhotoTag(id=" + this.b + ", userID=" + this.c + ", placerId=" + this.d + ", date=" + this.e + ", userName=" + this.f + ", description=" + this.g + ", x1=" + this.h + ", x2=" + this.i + ", y1=" + this.j + ", y2=" + this.k + ", viewed=" + this.l + ", placerProfile=" + this.m + ')';
    }

    public PhotoTag(int i, UserId userId, UserId userId2, long j, String str, String str2, double d, double d2, double d3, double d4, boolean z, UserProfile userProfile) {
        this.b = i;
        this.c = userId;
        this.d = userId2;
        this.e = j;
        this.f = str;
        this.g = str2;
        this.h = d;
        this.i = d2;
        this.j = d3;
        this.k = d4;
        this.l = z;
        this.m = userProfile;
    }
}
