package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;
import xsna.bh10;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: PlaylistLink.kt */
/* loaded from: classes18.dex */
public final class PlaylistLink extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<PlaylistLink> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PlaylistLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaylistLink a(Serializer serializer) {
            return new PlaylistLink(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaylistLink[i];
        }
    }

    public PlaylistLink(int i, UserId userId) {
        this(i, userId, null, 4, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), "playlist_id");
        w9yVar.d(Long.valueOf(this.c.b), "owner_id");
        w9yVar.e(this.d, "access_key");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistLink)) {
            return false;
        }
        PlaylistLink playlistLink = (PlaylistLink) obj;
        return this.b == playlistLink.b && epx.f(this.c, playlistLink.c) && epx.f(this.d, playlistLink.d);
    }

    public final int hashCode() {
        int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final UserId q() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistLink(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", accessKey=");
        return ho8.a(sb, this.d, ')');
    }

    public /* synthetic */ PlaylistLink(int i, UserId userId, String str, int i2, zcl zclVar) {
        this(i, userId, (i2 & 4) != 0 ? null : str);
    }

    public PlaylistLink(int i, UserId userId, String str) {
        this.b = i;
        this.c = userId;
        this.d = str;
    }

    public PlaylistLink(JSONObject jSONObject) {
        this(jSONObject.optInt("playlist_id"), new UserId(jSONObject.optLong("owner_id")), jSONObject.optString("access_key"));
    }

    public PlaylistLink(Serializer serializer) {
        this(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H());
    }
}
