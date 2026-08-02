package bet.prediction.response.news;

import com.sports.insider.data.repository.room.news.NewsTable;
import d9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o9.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z3.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J^\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010&R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010*R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010*R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010*R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u00102R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u0010*R\"\u0010\u000b\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b5\u0010\u0011\"\u0004\b6\u0010&¨\u00067"}, d2 = {"Lbet/prediction/response/news/PostOneNews;", "Lz3/c;", "", "id", "", "title", NewsTable.PICTURE_COLUMN, "dateTimeUTC", "", "date", "body", "published", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;I)V", "mapper", "()Lz3/c;", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()J", "component6", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;I)Lbet/prediction/response/news/PostOneNews;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getPicture", "setPicture", "getDateTimeUTC", "setDateTimeUTC", "J", "getDate", "setDate", "(J)V", "getBody", "setBody", "getPublished", "setPublished", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PostOneNews implements c {

    @b(NewsTable.TEXT_COLUMN)
    @Nullable
    private String body;

    @b("date")
    private long date;

    @b("publish_date")
    @Nullable
    private String dateTimeUTC;

    @b("id")
    private int id;

    @b(NewsTable.PICTURE_COLUMN)
    @Nullable
    private String picture;

    @b("published")
    private int published;

    @b("title")
    @Nullable
    private String title;

    public PostOneNews(int i5, @Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, int i10) {
        this.id = i5;
        this.title = str;
        this.picture = str2;
        this.dateTimeUTC = str3;
        this.date = j;
        this.body = str4;
        this.published = i10;
    }

    public static /* synthetic */ PostOneNews copy$default(PostOneNews postOneNews, int i5, String str, String str2, String str3, long j, String str4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i5 = postOneNews.id;
        }
        if ((i11 & 2) != 0) {
            str = postOneNews.title;
        }
        if ((i11 & 4) != 0) {
            str2 = postOneNews.picture;
        }
        if ((i11 & 8) != 0) {
            str3 = postOneNews.dateTimeUTC;
        }
        if ((i11 & 16) != 0) {
            j = postOneNews.date;
        }
        if ((i11 & 32) != 0) {
            str4 = postOneNews.body;
        }
        if ((i11 & 64) != 0) {
            i10 = postOneNews.published;
        }
        long j6 = j;
        String str5 = str2;
        String str6 = str3;
        return postOneNews.copy(i5, str, str5, str6, j6, str4, i10);
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
    public final String getDateTimeUTC() {
        return this.dateTimeUTC;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPublished() {
        return this.published;
    }

    @NotNull
    public final PostOneNews copy(int id2, @Nullable String title, @Nullable String picture, @Nullable String dateTimeUTC, long date, @Nullable String body, int published) {
        return new PostOneNews(id2, title, picture, dateTimeUTC, date, body, published);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostOneNews)) {
            return false;
        }
        PostOneNews postOneNews = (PostOneNews) other;
        return this.id == postOneNews.id && Intrinsics.areEqual(this.title, postOneNews.title) && Intrinsics.areEqual(this.picture, postOneNews.picture) && Intrinsics.areEqual(this.dateTimeUTC, postOneNews.dateTimeUTC) && this.date == postOneNews.date && Intrinsics.areEqual(this.body, postOneNews.body) && this.published == postOneNews.published;
    }

    @Override // z3.c
    @Nullable
    public String getBody() {
        return this.body;
    }

    @Override // z3.c
    public long getDate() {
        return this.date;
    }

    @Nullable
    public String getDateTimeUTC() {
        return this.dateTimeUTC;
    }

    @Override // z3.c
    public int getId() {
        return this.id;
    }

    @Override // z3.c
    @Nullable
    public String getPicture() {
        return this.picture;
    }

    public int getPublished() {
        return this.published;
    }

    @Override // z3.c
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
        String str3 = this.dateTimeUTC;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.date;
        int i10 = (((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str4 = this.body;
        return ((i10 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.published;
    }

    @NotNull
    public final c mapper() {
        return new c(this) { // from class: bet.prediction.response.news.PostOneNews$mapper$1
            private String body;
            private long date;
            private String dateTimeUTC;
            private int id;
            private String picture;
            private int published;
            private String title;

            {
                this.id = this.getId();
                this.title = this.getTitle();
                this.picture = this.getPicture();
                this.dateTimeUTC = this.getDateTimeUTC();
                this.date = this.getDate();
                this.body = this.getBody();
                this.published = this.getPublished();
            }

            @Override // z3.c
            public String getBody() {
                return this.body;
            }

            @Override // z3.c
            public long getDate() {
                return this.date;
            }

            public String getDateTimeUTC() {
                return this.dateTimeUTC;
            }

            @Override // z3.c
            public int getId() {
                return this.id;
            }

            @Override // z3.c
            public String getPicture() {
                return this.picture;
            }

            public int getPublished() {
                return this.published;
            }

            @Override // z3.c
            public String getTitle() {
                return this.title;
            }

            public void setBody(String str) {
                this.body = str;
            }

            public void setDate(long j) {
                this.date = j;
            }

            public void setDateTimeUTC(String str) {
                this.dateTimeUTC = str;
            }

            public void setId(int i5) {
                this.id = i5;
            }

            public void setPicture(String str) {
                this.picture = str;
            }

            public void setPublished(int i5) {
                this.published = i5;
            }

            public void setTitle(String str) {
                this.title = str;
            }
        };
    }

    public void setBody(@Nullable String str) {
        this.body = str;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setDateTimeUTC(@Nullable String str) {
        this.dateTimeUTC = str;
    }

    public void setId(int i5) {
        this.id = i5;
    }

    public void setPicture(@Nullable String str) {
        this.picture = str;
    }

    public void setPublished(int i5) {
        this.published = i5;
    }

    public void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PostOneNews(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", picture=");
        sb2.append(this.picture);
        sb2.append(", dateTimeUTC=");
        sb2.append(this.dateTimeUTC);
        sb2.append(", date=");
        sb2.append(this.date);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", published=");
        return e.i(sb2, this.published, ')');
    }

    public /* synthetic */ PostOneNews(int i5, String str, String str2, String str3, long j, String str4, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i5, str, (i11 & 4) != 0 ? null : str2, str3, j, str4, i10);
    }
}
