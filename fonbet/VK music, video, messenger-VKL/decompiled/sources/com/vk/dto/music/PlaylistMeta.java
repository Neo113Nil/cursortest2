package com.vk.dto.music;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: PlaylistMeta.kt */
/* loaded from: classes18.dex */
public final class PlaylistMeta extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<PlaylistMeta> CREATOR = new b();
    public final boolean b;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<PlaylistMeta> {
        @Override // xsna.aay
        public final PlaylistMeta a(JSONObject jSONObject) {
            return new PlaylistMeta(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PlaylistMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaylistMeta a(Serializer serializer) {
            return new PlaylistMeta(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaylistMeta[i];
        }
    }

    static {
        new a();
    }

    public PlaylistMeta() {
        this(false, 1, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b ? "compact" : null, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlaylistMeta) && this.b == ((PlaylistMeta) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return q0.a(new StringBuilder("PlaylistMeta(isCompat="), this.b, ')');
    }

    public PlaylistMeta(boolean z) {
        this.b = z;
    }

    public /* synthetic */ PlaylistMeta(boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z);
    }

    public PlaylistMeta(JSONObject jSONObject) {
        this("compact".equals(jSONObject.getString(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)));
    }

    public PlaylistMeta(Serializer serializer, zcl zclVar) {
        this(serializer.m());
    }
}
