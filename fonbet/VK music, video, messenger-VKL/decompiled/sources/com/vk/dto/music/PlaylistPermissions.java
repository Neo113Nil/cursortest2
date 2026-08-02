package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.qi00;
import xsna.qoy;
import xsna.zcl;

/* compiled from: PlaylistPermissions.kt */
/* loaded from: classes18.dex */
public final class PlaylistPermissions extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<PlaylistPermissions> CREATOR = new b();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<PlaylistPermissions> {
        @Override // xsna.aay
        public final PlaylistPermissions a(JSONObject jSONObject) {
            return new PlaylistPermissions(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PlaylistPermissions> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaylistPermissions a(Serializer serializer) {
            return new PlaylistPermissions(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaylistPermissions[i];
        }
    }

    static {
        new a();
    }

    public PlaylistPermissions() {
        this(false, false, false, false, false, false, false, 127, null);
    }

    public static PlaylistPermissions zb(PlaylistPermissions playlistPermissions, boolean z) {
        boolean z2 = playlistPermissions.b;
        boolean z3 = playlistPermissions.c;
        boolean z4 = playlistPermissions.e;
        boolean z5 = playlistPermissions.f;
        boolean z6 = playlistPermissions.g;
        boolean z7 = playlistPermissions.h;
        playlistPermissions.getClass();
        return new PlaylistPermissions(z2, z3, z, z4, z5, z6, z7);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new qi00(this, 24));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistPermissions)) {
            return false;
        }
        PlaylistPermissions playlistPermissions = (PlaylistPermissions) obj;
        return this.b == playlistPermissions.b && this.c == playlistPermissions.c && this.d == playlistPermissions.d && this.e == playlistPermissions.e && this.f == playlistPermissions.f && this.g == playlistPermissions.g && this.h == playlistPermissions.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistPermissions(canPlay=");
        sb.append(this.b);
        sb.append(", canEdit=");
        sb.append(this.c);
        sb.append(", canFollow=");
        sb.append(this.d);
        sb.append(", canShare=");
        sb.append(this.e);
        sb.append(", canBoomDownload=");
        sb.append(this.f);
        sb.append(", canDelete=");
        sb.append(this.g);
        sb.append(", canSaveAsCopy=");
        return q0.a(sb, this.h, ')');
    }

    public /* synthetic */ PlaylistPermissions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7);
    }

    public PlaylistPermissions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    public PlaylistPermissions(Serializer serializer) {
        this(serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m());
    }

    public PlaylistPermissions(JSONObject jSONObject) {
        this(jSONObject.optBoolean("play"), jSONObject.optBoolean("edit"), jSONObject.optBoolean("follow"), jSONObject.optBoolean("share"), jSONObject.optBoolean("boom_download"), jSONObject.optBoolean("delete"), jSONObject.optBoolean("save_as_copy"));
    }
}
