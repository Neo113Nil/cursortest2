package com.sports.insider.data.repository.room.news;

import androidx.annotation.Keep;
import d9.e;
import ib.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010\u000f¨\u0006%"}, d2 = {"Lcom/sports/insider/data/repository/room/news/NewsTable;", "", "", "id", NewsTable.DATE_TIME_COLUMN, "", "title", NewsTable.PICTURE_COLUMN, NewsTable.TEXT_COLUMN, "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sports/insider/data/repository/room/news/NewsTable;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "getDateTime", "Ljava/lang/String;", "getTitle", "getPicture", "getText", "NewsTableNamed", "ib/f", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NewsTable {

    @NotNull
    public static final String DATE_TIME_COLUMN = "dateTime";

    @NotNull
    public static final String ID_COLUMN = "id";

    @NotNull
    public static final f NewsTableNamed = new f();

    @NotNull
    public static final String PICTURE_COLUMN = "picture";

    @NotNull
    public static final String TABLE_NAME = "news_table";

    @NotNull
    public static final String TEXT_COLUMN = "text";

    @NotNull
    public static final String TITLE_COLUMN = "title";
    private final int dateTime;
    private int id;

    @Nullable
    private final String picture;

    @Nullable
    private final String text;

    @NotNull
    private final String title;

    public NewsTable(int i5, int i10, @NotNull String title, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = i5;
        this.dateTime = i10;
        this.title = title;
        this.picture = str;
        this.text = str2;
    }

    public static /* synthetic */ NewsTable copy$default(NewsTable newsTable, int i5, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i5 = newsTable.id;
        }
        if ((i11 & 2) != 0) {
            i10 = newsTable.dateTime;
        }
        if ((i11 & 4) != 0) {
            str = newsTable.title;
        }
        if ((i11 & 8) != 0) {
            str2 = newsTable.picture;
        }
        if ((i11 & 16) != 0) {
            str3 = newsTable.text;
        }
        String str4 = str3;
        String str5 = str;
        return newsTable.copy(i5, i10, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDateTime() {
        return this.dateTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final NewsTable copy(int id2, int dateTime, @NotNull String title, @Nullable String picture, @Nullable String text) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new NewsTable(id2, dateTime, title, picture, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsTable)) {
            return false;
        }
        NewsTable newsTable = (NewsTable) other;
        return this.id == newsTable.id && this.dateTime == newsTable.dateTime && Intrinsics.areEqual(this.title, newsTable.title) && Intrinsics.areEqual(this.picture, newsTable.picture) && Intrinsics.areEqual(this.text, newsTable.text);
    }

    public final int getDateTime() {
        return this.dateTime;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getPicture() {
        return this.picture;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int j = k.j(((this.id * 31) + this.dateTime) * 31, 31, this.title);
        String str = this.picture;
        int hashCode = (j + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setId(int i5) {
        this.id = i5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NewsTable(id=");
        sb2.append(this.id);
        sb2.append(", dateTime=");
        sb2.append(this.dateTime);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", picture=");
        sb2.append(this.picture);
        sb2.append(", text=");
        return e.k(sb2, this.text, ')');
    }

    public /* synthetic */ NewsTable(int i5, int i10, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i5, i10, str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
    }
}
