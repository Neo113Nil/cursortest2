package bet.prediction.response.news;

import io.sentry.config.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v3.b;
import z3.g;
import z3.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003B+\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010#R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0014R\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0012R\u0014\u0010.\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001b¨\u0006/"}, d2 = {"Lbet/prediction/response/news/PostsNews;", "Lz3/h;", "Lio/sentry/config/a;", "", "", "offset", "", "Lbet/prediction/response/news/PreviewPostNews;", "news", "Lv3/b;", "httpException", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Lv3/b;)V", "map", "()Lz3/h;", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/util/List;", "component3", "()Lv3/b;", "copy", "(Ljava/lang/Integer;Ljava/util/List;Lv3/b;)Lbet/prediction/response/news/PostsNews;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getOffset", "setOffset", "(Ljava/lang/Integer;)V", "Ljava/util/List;", "getNews", "setNews", "(Ljava/util/List;)V", "Lv3/b;", "getHttpException", "Lz3/g;", "getPostsNews", "postsNews", "getStatusCode", "statusCode", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPostsNews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostsNews.kt\nbet/prediction/response/news/PostsNews\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1563#2:25\n1634#2,3:26\n*S KotlinDebug\n*F\n+ 1 PostsNews.kt\nbet/prediction/response/news/PostsNews\n*L\n15#1:25\n15#1:26,3\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class PostsNews extends a implements h {

    @Nullable
    private final b httpException;

    @o9.b("news")
    @Nullable
    private List<PreviewPostNews> news;

    @o9.b("offset")
    @Nullable
    private Integer offset;

    public PostsNews(@Nullable Integer num, @Nullable List<PreviewPostNews> list, @Nullable b bVar) {
        this.offset = num;
        this.news = list;
        this.httpException = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostsNews copy$default(PostsNews postsNews, Integer num, List list, b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            num = postsNews.offset;
        }
        if ((i5 & 2) != 0) {
            list = postsNews.news;
        }
        if ((i5 & 4) != 0) {
            bVar = postsNews.httpException;
        }
        return postsNews.copy(num, list, bVar);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    public final List<PreviewPostNews> component2() {
        return this.news;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final PostsNews copy(@Nullable Integer offset, @Nullable List<PreviewPostNews> news, @Nullable b httpException) {
        return new PostsNews(offset, news, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostsNews)) {
            return false;
        }
        PostsNews postsNews = (PostsNews) other;
        return Intrinsics.areEqual(this.offset, postsNews.offset) && Intrinsics.areEqual(this.news, postsNews.news) && Intrinsics.areEqual(this.httpException, postsNews.httpException);
    }

    @Override // v3.e
    @Nullable
    public b getHttpException() {
        return this.httpException;
    }

    @Nullable
    public final List<PreviewPostNews> getNews() {
        return this.news;
    }

    @Nullable
    public Integer getOffset() {
        return this.offset;
    }

    @Override // z3.h
    @Nullable
    public List<g> getPostsNews() {
        List<PreviewPostNews> list = this.news;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(v.k(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PreviewPostNews) it.next()).mapper());
        }
        return arrayList;
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
        Integer num = this.offset;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<PreviewPostNews> list = this.news;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        b bVar = this.httpException;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final void setNews(@Nullable List<PreviewPostNews> list) {
        this.news = list;
    }

    public void setOffset(@Nullable Integer num) {
        this.offset = num;
    }

    @NotNull
    public String toString() {
        return "PostsNews(offset=" + this.offset + ", news=" + this.news + ", httpException=" + this.httpException + ')';
    }

    @NotNull
    public h map() {
        return new h(this) { // from class: bet.prediction.response.news.PostsNews$map$1
            private final b httpException;
            private Integer offset;
            private List<? extends g> postsNews;
            private final int statusCode;

            {
                this.offset = this.getOffset();
                this.postsNews = this.getPostsNews();
                this.statusCode = this.getStatusCode();
                this.httpException = this.getHttpException();
            }

            @Override // v3.e
            public b getHttpException() {
                return this.httpException;
            }

            public Integer getOffset() {
                return this.offset;
            }

            @Override // z3.h
            public List<g> getPostsNews() {
                return this.postsNews;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }

            public void setOffset(Integer num) {
                this.offset = num;
            }

            public void setPostsNews(List<? extends g> list) {
                this.postsNews = list;
            }
        };
    }
}
