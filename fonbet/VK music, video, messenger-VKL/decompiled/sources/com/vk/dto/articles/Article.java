package com.vk.dto.articles;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.article.ArticleTtsInfo;
import com.vk.dto.music.playlist.MarusiaTrackMeta;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import defpackage.q0;
import java.util.Objects;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.cqm0;
import xsna.d370;
import xsna.epx;
import xsna.op1;
import xsna.zcl;

/* compiled from: Article.kt */
/* loaded from: classes18.dex */
public final class Article implements Serializer.StreamParcelable, bxx {
    public final int b;
    public final UserId c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final Owner h;
    public final String i;
    public final String j;
    public final String k;
    public final Photo l;
    public final int m;
    public boolean n;
    public final boolean o;
    public final boolean p;
    public final ArticleDonut q;
    public final ArticleTts r;
    public final String s;
    public final int t;
    public final boolean u;
    public static final Regex v = new Regex("^https?://[a-z0-9.-]*(vk|vkontakte).(com|ru|me)/(@-?[a-z0-9._]+)-([a-zA-Z0-9=\\-_&]+.*)$");
    public static final b w = new b();
    public static final Serializer.c<Article> CREATOR = new c();

    /* compiled from: Article.kt */
    public static final class a {
        public static boolean a(String str) {
            if (str != null) {
                return Article.v.f(str);
            }
            return false;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<Article> {
        @Override // xsna.aay
        public final Article a(JSONObject jSONObject) {
            long j;
            String str;
            ArticleDonut articleDonut;
            ArticleDonut.Placeholder placeholder;
            Owner owner = new Owner(new UserId(jSONObject.optLong("owner_id")), jSONObject.optString("owner_name"), null, jSONObject.optString("owner_photo"), null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194292, null);
            int optInt = jSONObject.optInt("id");
            UserId userId = new UserId(jSONObject.optLong("owner_id"));
            String optString = jSONObject.optString("access_key");
            long optLong = jSONObject.optLong("published_date");
            String optString2 = jSONObject.optString("title");
            String optString3 = jSONObject.optString("subtitle");
            String optString4 = jSONObject.optString("url");
            String optString5 = jSONObject.optString("view_url");
            String optString6 = jSONObject.optString("state");
            JSONObject optJSONObject = jSONObject.optJSONObject("photo");
            ArticleTts articleTts = null;
            Photo photo = optJSONObject != null ? new Photo(optJSONObject) : null;
            int optInt2 = jSONObject.optInt("views");
            Photo photo2 = photo;
            boolean optBoolean = jSONObject.optBoolean("is_favorite");
            boolean optBoolean2 = jSONObject.optBoolean("can_report", true);
            boolean optBoolean3 = jSONObject.optBoolean("no_footer", false);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("donut");
            if (optJSONObject2 != null) {
                boolean optBoolean4 = optJSONObject2.optBoolean("is_donut");
                j = optLong;
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("placeholder");
                if (optJSONObject3 != null) {
                    String optString7 = optJSONObject3.optString("text");
                    String optString8 = optJSONObject3.optString("description");
                    str = optString3;
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject("button");
                    placeholder = new ArticleDonut.Placeholder(optString7, optString8, optJSONObject4 != null ? new LinkButton(optJSONObject4) : null);
                } else {
                    str = optString3;
                    placeholder = null;
                }
                articleDonut = new ArticleDonut(optBoolean4, placeholder);
            } else {
                j = optLong;
                str = optString3;
                articleDonut = null;
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("marusya_tts");
            if (optJSONObject5 != null) {
                Serializer.c<ArticleTts> cVar = ArticleTts.CREATOR;
                int optInt3 = jSONObject.optInt("id");
                UserId userId2 = new UserId(jSONObject.optLong("owner_id"));
                String optString9 = jSONObject.optString("url");
                Serializer.c<MarusiaTrackMeta> cVar2 = MarusiaTrackMeta.CREATOR;
                articleTts = new ArticleTts(MarusiaTrackMeta.a.a(optJSONObject5), new ArticleTtsInfo(optInt3, userId2, optString9, optJSONObject5.optString("stream_id"), optJSONObject5.optBoolean("support_streaming")));
            }
            return new Article(optInt, userId, optString, j, optString2, str, owner, optString4, optString5, optString6, photo2, optInt2, optBoolean, optBoolean2, optBoolean3, articleDonut, articleTts, cqm0.a(jSONObject.optString("lead_description")), jSONObject.optInt("time_to_read"), jSONObject.optBoolean("can_edit"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<Article> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Article a(Serializer serializer) {
            return new Article(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Article[i];
        }
    }

    static {
        new Article(0, UserId.d, null, 12L, null, null, null, null, null, null, null, 12, false, false, false, null, null, null, 0, false);
    }

    public Article(int i, UserId userId, String str, long j, String str2, String str3, Owner owner, String str4, String str5, String str6, Photo photo, int i2, boolean z, boolean z2, boolean z3, ArticleDonut articleDonut, ArticleTts articleTts, String str7, int i3, boolean z4) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = j;
        this.f = str2;
        this.g = str3;
        this.h = owner;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = photo;
        this.m = i2;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = articleDonut;
        this.r = articleTts;
        this.s = str7;
        this.t = i3;
        this.u = z4;
    }

    public static Article a(Article article, Owner owner, int i) {
        boolean z;
        ArticleDonut articleDonut;
        int i2 = article.b;
        UserId userId = article.c;
        String str = article.d;
        long j = article.e;
        String str2 = article.f;
        String str3 = article.g;
        Owner owner2 = (i & 64) != 0 ? article.h : owner;
        String str4 = article.i;
        String str5 = article.j;
        String str6 = article.k;
        Photo photo = article.l;
        int i3 = article.m;
        boolean z2 = article.n;
        boolean z3 = article.o;
        boolean z4 = article.p;
        if ((i & 32768) != 0) {
            z = z4;
            articleDonut = article.q;
        } else {
            z = z4;
            articleDonut = null;
        }
        ArticleDonut articleDonut2 = articleDonut;
        ArticleTts articleTts = article.r;
        String str7 = article.s;
        int i4 = article.t;
        boolean z5 = article.u;
        article.getClass();
        return new Article(i2, userId, str, j, str2, str3, owner2, str4, str5, str6, photo, i3, z2, z3, z, articleDonut2, articleTts, str7, i4, z5);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.Y(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.i0(this.l);
        serializer.S(this.m);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.i0(this.q);
        serializer.i0(this.r);
        serializer.j0(this.s);
        serializer.S(this.t);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
    }

    public final boolean Q8() {
        return "protected".equals(this.k);
    }

    public final boolean d() {
        ArticleDonut articleDonut = this.q;
        return (articleDonut != null ? articleDonut.c : null) != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        Photo photo = this.l;
        return (photo == null || photo.y.b.isEmpty()) ? false : true;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new op1(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Article.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Article article = (Article) obj;
        return this.b == article.b && epx.f(this.c, article.c);
    }

    public final String f(int i) {
        Photo photo = this.l;
        if ((photo != null ? photo.y : null) == null || photo.y.b.isEmpty()) {
            return null;
        }
        return photo.Fb(i, false).d.d;
    }

    public final boolean g() {
        if ("available".equals(this.k)) {
            return true;
        }
        String str = this.i;
        if (str != null && str.length() != 0) {
            if (!(str != null ? a.a(str) : false)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c);
    }

    public final boolean i() {
        return "banned".equals(this.k);
    }

    public final boolean j() {
        return "deleted".equals(this.k);
    }

    public final boolean k() {
        return "paid".equals(this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Article(id=");
        sb.append(this.b);
        sb.append(", ownderId=");
        sb.append(this.c);
        sb.append(", accessKey=");
        sb.append(this.d);
        sb.append(", date=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", owner=");
        sb.append(this.h);
        sb.append(", link=");
        sb.append(this.i);
        sb.append(", viewLink=");
        sb.append(this.j);
        sb.append(", state=");
        sb.append(this.k);
        sb.append(", photo=");
        sb.append(this.l);
        sb.append(", viewCount=");
        sb.append(this.m);
        sb.append(", isFavoriteField=");
        sb.append(this.n);
        sb.append(", canReport=");
        sb.append(this.o);
        sb.append(", noFooter=");
        sb.append(this.p);
        sb.append(", donut=");
        sb.append(this.q);
        sb.append(", tts=");
        sb.append(this.r);
        sb.append(", leadDescription=");
        sb.append(this.s);
        sb.append(", timeToRead=");
        sb.append(this.t);
        sb.append(", canEdit=");
        return q0.a(sb, this.u, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ Article(int i, UserId userId, String str, long j, String str2, String str3, Owner owner, String str4, String str5, String str6, Photo photo, int i2, boolean z, boolean z2, boolean z3, ArticleDonut articleDonut, ArticleTts articleTts, String str7, int i3, boolean z4, int i4, zcl zclVar) {
        this(i, userId, str, j, str2, str3, owner, str4, str5, str6, photo, i2, z, z2, z3, articleDonut, (i4 & 65536) != 0 ? null : articleTts, str7, i3, z4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Article(Serializer serializer) {
        this(r1, r2, serializer.H(), serializer.w(), serializer.H(), serializer.H(), (Owner) serializer.G(Owner.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), (Photo) serializer.G(Photo.class.getClassLoader()), serializer.u(), serializer.m(), serializer.m(), serializer.m(), (ArticleDonut) serializer.G(ArticleDonut.class.getClassLoader()), (ArticleTts) serializer.G(ArticleTts.class.getClassLoader()), serializer.H(), serializer.u(), serializer.m());
        int u = serializer.u();
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        if (userId != null) {
            return;
        }
        throw new IllegalArgumentException("Can't read owner id!");
    }
}
