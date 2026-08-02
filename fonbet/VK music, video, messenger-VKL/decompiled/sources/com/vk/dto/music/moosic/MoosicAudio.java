package com.vk.dto.music.moosic;

import com.unity3d.ads.metadata.PlayerMetaData;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.bh10;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: MoosicAudio.kt */
/* loaded from: classes18.dex */
public final class MoosicAudio extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<MoosicAudio> CREATOR = new a();
    public final int b;
    public final String c;
    public final EncryptedFileInfo d;
    public final long e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MoosicAudio> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MoosicAudio a(Serializer serializer) {
            return new MoosicAudio(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoosicAudio[i];
        }
    }

    public MoosicAudio(int i, String str, EncryptedFileInfo encryptedFileInfo, long j, String str2) {
        this.b = i;
        this.c = str;
        this.d = encryptedFileInfo;
        this.e = j;
        this.f = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.Y(this.e);
        serializer.j0(this.f);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), "moosic_user_id");
        w9yVar.e(this.c, PlayerMetaData.KEY_SERVER_ID);
        w9yVar.g("encrypted_file_info", this.d);
        w9yVar.d(Long.valueOf(this.e), "size");
        w9yVar.e(this.f, "cover_path");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoosicAudio)) {
            return false;
        }
        MoosicAudio moosicAudio = (MoosicAudio) obj;
        return this.b == moosicAudio.b && epx.f(this.c, moosicAudio.c) && epx.f(this.d, moosicAudio.d) && this.e == moosicAudio.e && epx.f(this.f, moosicAudio.f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EncryptedFileInfo encryptedFileInfo = this.d;
        int a2 = bh10.a((hashCode2 + (encryptedFileInfo == null ? 0 : encryptedFileInfo.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        return a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoosicAudio(moosicUserId=");
        sb.append(this.b);
        sb.append(", serverId=");
        sb.append(this.c);
        sb.append(", encryptedFileInfo=");
        sb.append(this.d);
        sb.append(", size=");
        sb.append(this.e);
        sb.append(", coverPath=");
        return ho8.a(sb, this.f, ')');
    }

    public final EncryptedFileInfo zb() {
        return this.d;
    }

    public MoosicAudio(JSONObject jSONObject) {
        this(jSONObject.getInt("moosic_user_id"), f370.D(jSONObject, PlayerMetaData.KEY_SERVER_ID), jSONObject.has("encrypted_file_info") ? new EncryptedFileInfo(jSONObject.getJSONObject("encrypted_file_info")) : null, jSONObject.optLong("size"), jSONObject.getString("cover_path"));
    }

    public MoosicAudio(Serializer serializer, zcl zclVar) {
        this(serializer.u(), serializer.H(), (EncryptedFileInfo) serializer.G(EncryptedFileInfo.class.getClassLoader()), serializer.w(), serializer.H());
    }
}
