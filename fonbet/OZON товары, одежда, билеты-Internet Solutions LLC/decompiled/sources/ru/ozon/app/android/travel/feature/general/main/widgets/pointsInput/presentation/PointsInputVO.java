package ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.presentation;

import Ak.C2436a;
import G.g;
import Nh.a;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/pointsInput/presentation/PointsInputVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "hint", SearchIntents.EXTRA_QUERY, "queryParamName", "pageUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getHint", "getQuery", "getQueryParamName", "getPageUrl", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PointsInputVO implements c {

    @NotNull
    private final String hint;
    private final long id;

    @NotNull
    private final String pageUrl;

    @NotNull
    private final String query;

    @NotNull
    private final String queryParamName;

    @NotNull
    private final String title;

    public PointsInputVO(long j11, @NotNull String title, @NotNull String hint, @NotNull String query, @NotNull String queryParamName, @NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(queryParamName, "queryParamName");
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        this.id = j11;
        this.title = title;
        this.hint = hint;
        this.query = query;
        this.queryParamName = queryParamName;
        this.pageUrl = pageUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointsInputVO)) {
            return false;
        }
        PointsInputVO pointsInputVO = (PointsInputVO) other;
        return this.id == pointsInputVO.id && Intrinsics.d(this.title, pointsInputVO.title) && Intrinsics.d(this.hint, pointsInputVO.hint) && Intrinsics.d(this.query, pointsInputVO.query) && Intrinsics.d(this.queryParamName, pointsInputVO.queryParamName) && Intrinsics.d(this.pageUrl, pointsInputVO.pageUrl);
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getPageUrl() {
        return this.pageUrl;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    public final String getQueryParamName() {
        return this.queryParamName;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.pageUrl.hashCode() + g.a(g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.hint), 31, this.query), 31, this.queryParamName);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.hint;
        String str3 = this.query;
        String str4 = this.queryParamName;
        String str5 = this.pageUrl;
        StringBuilder c11 = C2436a.c(j11, "PointsInputVO(id=", ", title=", str);
        a.h(c11, ", hint=", str2, ", query=", str3);
        a.h(c11, ", queryParamName=", str4, ", pageUrl=", str5);
        c11.append(")");
        return c11.toString();
    }
}
