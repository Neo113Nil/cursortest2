package com.vk.dto.attachments;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.log.L;
import com.vkontakte.android.R;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dd80;
import xsna.epx;
import xsna.gmq;
import xsna.iah0;
import xsna.ptx0;
import xsna.tec0;
import xsna.tfw;

/* compiled from: ArticleAttachment.kt */
/* loaded from: classes18.dex */
public final class ArticleAttachment extends Attachment implements tfw, gmq, ptx0, tec0 {
    public static final Serializer.c<ArticleAttachment> CREATOR = new a();
    public final Article f;
    public final int g = 4;
    public boolean h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ArticleAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ArticleAttachment a(Serializer serializer) {
            return new ArticleAttachment((Article) serializer.G(Article.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ArticleAttachment[i];
        }
    }

    public ArticleAttachment(Article article) {
        this.f = article;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return this.g;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.p;
    }

    public final Article Db() {
        return this.f;
    }

    public final boolean Eb() {
        return this.f.d();
    }

    public final boolean Fb() {
        return this.f.j();
    }

    public final boolean Gb() {
        return this.f.k();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
    }

    @Override // xsna.tec0
    public final JSONObject Q3() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 14);
        try {
            jSONObject.put("article", this.f.e5());
            return jSONObject;
        } catch (JSONException e) {
            L.i(e);
            return jSONObject;
        }
    }

    public final boolean Q8() {
        return this.f.Q8();
    }

    @Override // xsna.gmq
    public final boolean X() {
        return this.f.n;
    }

    public final boolean d5() {
        return this.f.i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ArticleAttachment.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ArticleAttachment articleAttachment = (ArticleAttachment) obj;
        return epx.f(this.f, articleAttachment.f) && this.h == articleAttachment.h;
    }

    @Override // xsna.tfw
    public final String h9() {
        return this.f.f(iah0.v());
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + (this.f.hashCode() * 31);
    }

    @Override // xsna.ptx0
    public final UserId q() {
        throw null;
    }

    @Override // xsna.ptx0
    public final Owner s() {
        throw null;
    }

    @Override // xsna.gmq
    public final void s0(boolean z) {
        this.f.n = z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("article");
        Article article = this.f;
        sb.append(article.c);
        sb.append('_');
        sb.append(article.b);
        if (article.d != null) {
            str = BundleUtil.UNDERLINE_TAG + article.d;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.article;
    }
}
