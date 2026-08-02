package com.vk.dto.articles;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.article.ArticleTtsInfo;
import com.vk.dto.music.playlist.MarusiaTrackMeta;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: ArticleTts.kt */
/* loaded from: classes18.dex */
public final class ArticleTts extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ArticleTts> CREATOR = new b();
    public final MarusiaTrackMeta b;
    public final ArticleTtsInfo c;

    /* compiled from: ArticleTts.kt */
    public static final class a {
        public static ArticleTts a(JSONObject jSONObject) {
            Serializer.c<MarusiaTrackMeta> cVar = MarusiaTrackMeta.CREATOR;
            return new ArticleTts(MarusiaTrackMeta.a.a(jSONObject), new ArticleTtsInfo(jSONObject.getInt("id"), new UserId(jSONObject.optLong("owner_id")), jSONObject.optString("url"), jSONObject.optString("stream_id"), jSONObject.optBoolean("support_streaming")));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ArticleTts> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ArticleTts a(Serializer serializer) {
            return new ArticleTts(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ArticleTts[i];
        }
    }

    public ArticleTts(MarusiaTrackMeta marusiaTrackMeta, ArticleTtsInfo articleTtsInfo) {
        this.b = marusiaTrackMeta;
        this.c = articleTtsInfo;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleTts)) {
            return false;
        }
        ArticleTts articleTts = (ArticleTts) obj;
        return epx.f(this.b, articleTts.b) && epx.f(this.c, articleTts.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ArticleTts(meta=" + this.b + ", audioInfo=" + this.c + ')';
    }

    public ArticleTts(Serializer serializer) {
        this((MarusiaTrackMeta) serializer.G(MarusiaTrackMeta.class.getClassLoader()), (ArticleTtsInfo) serializer.G(ArticleTtsInfo.class.getClassLoader()));
    }
}
