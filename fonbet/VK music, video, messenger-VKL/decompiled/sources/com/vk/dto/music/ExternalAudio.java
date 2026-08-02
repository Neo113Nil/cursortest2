package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.article.ArticleTtsInfo;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.s3q0;
import xsna.vu5;
import xsna.w9y;
import xsna.zcl;

/* compiled from: ExternalAudio.kt */
/* loaded from: classes18.dex */
public final class ExternalAudio extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ExternalAudio> CREATOR = new a();
    public final String b;
    public final ArticleTtsInfo c;
    public final String d;
    public final int e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ExternalAudio> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ExternalAudio a(Serializer serializer) {
            return new ExternalAudio(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalAudio[i];
        }
    }

    public /* synthetic */ ExternalAudio(String str, ArticleTtsInfo articleTtsInfo, String str2, int i, int i2, zcl zclVar) {
        this(str, (i2 & 2) != 0 ? null : articleTtsInfo, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0 : i);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.S(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "uid");
        w9yVar.g("article_tts_info", this.c);
        w9yVar.e(this.d, "type");
        w9yVar.c(Integer.valueOf(this.e), "media_type");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalAudio)) {
            return false;
        }
        ExternalAudio externalAudio = (ExternalAudio) obj;
        return epx.f(this.b, externalAudio.b) && epx.f(this.c, externalAudio.c) && epx.f(this.d, externalAudio.d) && this.e == externalAudio.e;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArticleTtsInfo articleTtsInfo = this.c;
        int hashCode2 = (hashCode + (articleTtsInfo == null ? 0 : articleTtsInfo.hashCode())) * 31;
        String str2 = this.d;
        return Integer.hashCode(this.e) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAudio(uid=");
        sb.append(this.b);
        sb.append(", articleTtsInfo=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", mediaType=");
        return vu5.b(sb, this.e, ')');
    }

    public ExternalAudio(String str, ArticleTtsInfo articleTtsInfo, String str2, int i) {
        this.b = str;
        this.c = articleTtsInfo;
        this.d = str2;
        this.e = i;
    }

    public ExternalAudio(JSONObject jSONObject) {
        this(f370.D(jSONObject, "uid"), jSONObject.has("article_tts_info") ? new ArticleTtsInfo(jSONObject.getJSONObject("article_tts_info")) : null, f370.D(jSONObject, "type"), jSONObject.optInt("media_type"));
    }

    public ExternalAudio(Serializer serializer, zcl zclVar) {
        this(serializer.H(), (ArticleTtsInfo) serializer.G(ArticleTtsInfo.class.getClassLoader()), serializer.H(), serializer.u());
    }
}
