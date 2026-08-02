package com.vk.dto.music.article;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import org.json.JSONObject;
import xsna.bh10;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.urd0;
import xsna.w9y;

/* compiled from: ArticleTtsInfo.kt */
/* loaded from: classes18.dex */
public final class ArticleTtsInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ArticleTtsInfo> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final String d;
    public final String e;
    public final boolean f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ArticleTtsInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ArticleTtsInfo a(Serializer serializer) {
            return new ArticleTtsInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ArticleTtsInfo[i];
        }
    }

    public ArticleTtsInfo(int i, UserId userId, String str, String str2, boolean z) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), "id");
        w9yVar.d(Long.valueOf(this.c.b), "owner_id");
        w9yVar.e(this.d, "url");
        w9yVar.e(this.e, "stream_id");
        w9yVar.b(Boolean.valueOf(this.f), "stream_support");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleTtsInfo)) {
            return false;
        }
        ArticleTtsInfo articleTtsInfo = (ArticleTtsInfo) obj;
        return this.b == articleTtsInfo.b && epx.f(this.c, articleTtsInfo.c) && epx.f(this.d, articleTtsInfo.d) && epx.f(this.e, articleTtsInfo.e) && this.f == articleTtsInfo.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + urd0.a(urd0.a(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleTtsInfo(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", streamId=");
        sb.append(this.e);
        sb.append(", streamSupport=");
        return q0.a(sb, this.f, ')');
    }

    public ArticleTtsInfo(Serializer serializer) {
        this(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H(), serializer.m());
    }

    public ArticleTtsInfo(JSONObject jSONObject) {
        this(jSONObject.optInt("id"), new UserId(jSONObject.optLong("owner_id")), jSONObject.optString("url"), jSONObject.optString("stream_id"), jSONObject.optBoolean("stream_support"));
    }
}
