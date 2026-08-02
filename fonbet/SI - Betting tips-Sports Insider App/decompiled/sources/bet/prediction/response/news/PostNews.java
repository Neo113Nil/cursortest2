package bet.prediction.response.news;

import io.sentry.config.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v3.b;
import z3.c;
import z3.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000fR\u0016\u0010%\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0017¨\u0006("}, d2 = {"Lbet/prediction/response/news/PostNews;", "Lz3/d;", "Lio/sentry/config/a;", "", "Lbet/prediction/response/news/PostOneNews;", "post", "Lv3/b;", "httpException", "<init>", "(Lbet/prediction/response/news/PostOneNews;Lv3/b;)V", "map", "()Lz3/d;", "component1", "()Lbet/prediction/response/news/PostOneNews;", "component2", "()Lv3/b;", "copy", "(Lbet/prediction/response/news/PostOneNews;Lv3/b;)Lbet/prediction/response/news/PostNews;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbet/prediction/response/news/PostOneNews;", "getPost", "setPost", "(Lbet/prediction/response/news/PostOneNews;)V", "Lv3/b;", "getHttpException", "Lz3/c;", "getPostNews", "()Lz3/c;", "postNews", "getStatusCode", "statusCode", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PostNews extends a implements d {

    @Nullable
    private final b httpException;

    @o9.b("data")
    @Nullable
    private PostOneNews post;

    public PostNews(@Nullable PostOneNews postOneNews, @Nullable b bVar) {
        this.post = postOneNews;
        this.httpException = bVar;
    }

    public static /* synthetic */ PostNews copy$default(PostNews postNews, PostOneNews postOneNews, b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            postOneNews = postNews.post;
        }
        if ((i5 & 2) != 0) {
            bVar = postNews.httpException;
        }
        return postNews.copy(postOneNews, bVar);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final PostOneNews getPost() {
        return this.post;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final PostNews copy(@Nullable PostOneNews post, @Nullable b httpException) {
        return new PostNews(post, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostNews)) {
            return false;
        }
        PostNews postNews = (PostNews) other;
        return Intrinsics.areEqual(this.post, postNews.post) && Intrinsics.areEqual(this.httpException, postNews.httpException);
    }

    @Override // v3.e
    @Nullable
    public b getHttpException() {
        return this.httpException;
    }

    @Nullable
    public final PostOneNews getPost() {
        return this.post;
    }

    @Override // z3.d
    @Nullable
    public c getPostNews() {
        PostOneNews postOneNews = this.post;
        if (postOneNews != null) {
            return postOneNews.mapper();
        }
        return null;
    }

    @Override // v3.e
    public int getStatusCode() {
        s0 response;
        b httpException = getHttpException();
        if (httpException == null || (response = httpException.getResponse()) == null) {
            return 200;
        }
        return response.f21334a.f10276d;
    }

    public int hashCode() {
        PostOneNews postOneNews = this.post;
        int hashCode = (postOneNews == null ? 0 : postOneNews.hashCode()) * 31;
        b bVar = this.httpException;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final void setPost(@Nullable PostOneNews postOneNews) {
        this.post = postOneNews;
    }

    @NotNull
    public String toString() {
        return "PostNews(post=" + this.post + ", httpException=" + this.httpException + ')';
    }

    @NotNull
    public d map() {
        return new d(this) { // from class: bet.prediction.response.news.PostNews$map$1
            private final b httpException;
            private c postNews;
            private final int statusCode;

            {
                this.postNews = this.getPostNews();
                this.statusCode = this.getStatusCode();
                this.httpException = this.getHttpException();
            }

            @Override // v3.e
            public b getHttpException() {
                return this.httpException;
            }

            @Override // z3.d
            public c getPostNews() {
                return this.postNews;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }

            public void setPostNews(c cVar) {
                this.postNews = cVar;
            }
        };
    }
}
