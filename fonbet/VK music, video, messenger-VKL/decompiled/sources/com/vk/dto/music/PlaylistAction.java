package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: PlaylistAction.kt */
/* loaded from: classes18.dex */
public final class PlaylistAction extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<PlaylistAction> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<PlaylistAction> {
        @Override // xsna.aay
        public final PlaylistAction a(JSONObject jSONObject) {
            return new PlaylistAction(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PlaylistAction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaylistAction a(Serializer serializer) {
            return new PlaylistAction(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaylistAction[i];
        }
    }

    public PlaylistAction(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "type");
        w9yVar.e(this.c, "location");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistAction)) {
            return false;
        }
        PlaylistAction playlistAction = (PlaylistAction) obj;
        return epx.f(this.b, playlistAction.b) && epx.f(this.c, playlistAction.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistAction(type=");
        sb.append(this.b);
        sb.append(", location=");
        return ho8.a(sb, this.c, ')');
    }

    public PlaylistAction(JSONObject jSONObject) {
        this(jSONObject.optString("type"), jSONObject.optString("location"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlaylistAction(Serializer serializer) {
        this(r0, r3 != null ? r3 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
    }
}
