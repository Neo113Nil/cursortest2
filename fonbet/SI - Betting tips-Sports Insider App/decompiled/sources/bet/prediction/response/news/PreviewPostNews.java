package bet.prediction.response.news;

import com.sports.insider.data.repository.room.news.NewsTable;
import d9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o9.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z3.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JH\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\"R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010&R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010&R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lbet/prediction/response/news/PreviewPostNews;", "Lz3/g;", "", "id", "", "title", NewsTable.PICTURE_COLUMN, "publishDate", "", "date", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "mapper", "()Lz3/g;", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()J", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lbet/prediction/response/news/PreviewPostNews;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getPicture", "setPicture", "getPublishDate", "setPublishDate", "J", "getDate", "setDate", "(J)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PreviewPostNews implements g {

    @b("date")
    private long date;

    @b("id")
    private int id;

    @b(NewsTable.PICTURE_COLUMN)
    @Nullable
    private String picture;

    @b("publish_date")
    @Nullable
    private String publishDate;

    @b("title")
    @Nullable
    private String title;

    public PreviewPostNews(int i5, @Nullable String str, @Nullable String str2, @Nullable String str3, long j) {
        this.id = i5;
        this.title = str;
        this.picture = str2;
        this.publishDate = str3;
        this.date = j;
    }

    public static /* synthetic */ PreviewPostNews copy$default(PreviewPostNews previewPostNews, int i5, String str, String str2, String str3, long j, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i5 = previewPostNews.id;
        }
        if ((i10 & 2) != 0) {
            str = previewPostNews.title;
        }
        if ((i10 & 4) != 0) {
            str2 = previewPostNews.picture;
        }
        if ((i10 & 8) != 0) {
            str3 = previewPostNews.publishDate;
        }
        if ((i10 & 16) != 0) {
            j = previewPostNews.date;
        }
        long j6 = j;
        return previewPostNews.copy(i5, str, str2, str3, j6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPublishDate() {
        return this.publishDate;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @NotNull
    public final PreviewPostNews copy(int id2, @Nullable String title, @Nullable String picture, @Nullable String publishDate, long date) {
        return new PreviewPostNews(id2, title, picture, publishDate, date);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewPostNews)) {
            return false;
        }
        PreviewPostNews previewPostNews = (PreviewPostNews) other;
        return this.id == previewPostNews.id && Intrinsics.areEqual(this.title, previewPostNews.title) && Intrinsics.areEqual(this.picture, previewPostNews.picture) && Intrinsics.areEqual(this.publishDate, previewPostNews.publishDate) && this.date == previewPostNews.date;
    }

    @Override // z3.g
    public long getDate() {
        return this.date;
    }

    @Override // z3.g
    public int getId() {
        return this.id;
    }

    @Override // z3.g
    @Nullable
    public String getPicture() {
        return this.picture;
    }

    @Nullable
    public String getPublishDate() {
        return this.publishDate;
    }

    @Override // z3.g
    @Nullable
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i5 = this.id * 31;
        String str = this.title;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.picture;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publishDate;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.date;
        return ((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public final g mapper() {
        return new g(this) { // from class: bet.prediction.response.news.PreviewPostNews$mapper$1
            private long date;
            private int id;
            private String picture;
            private String publishDate;
            private String title;

            {
                this.id = this.getId();
                this.title = this.getTitle();
                this.picture = this.getPicture();
                this.publishDate = this.getPublishDate();
                this.date = this.getDate();
            }

            @Override // z3.g
            public long getDate() {
                return this.date;
            }

            @Override // z3.g
            public int getId() {
                return this.id;
            }

            @Override // z3.g
            public String getPicture() {
                return this.picture;
            }

            public String getPublishDate() {
                return this.publishDate;
            }

            @Override // z3.g
            public String getTitle() {
                return this.title;
            }

            public void setDate(long j) {
                this.date = j;
            }

            public void setId(int i5) {
                this.id = i5;
            }

            public void setPicture(String str) {
                this.picture = str;
            }

            public void setPublishDate(String str) {
                this.publishDate = str;
            }

            public void setTitle(String str) {
                this.title = str;
            }
        };
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setId(int i5) {
        this.id = i5;
    }

    public void setPicture(@Nullable String str) {
        this.picture = str;
    }

    public void setPublishDate(@Nullable String str) {
        this.publishDate = str;
    }

    public void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PreviewPostNews(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", picture=");
        sb2.append(this.picture);
        sb2.append(", publishDate=");
        sb2.append(this.publishDate);
        sb2.append(", date=");
        return e.j(sb2, this.date, ')');
    }
}
