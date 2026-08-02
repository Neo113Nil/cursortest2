package ru.ozon.app.android.search.widgets.title.presentation;

import Ak.C2436a;
import Bi.a;
import G.g;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/widgets/title/presentation/SearchTitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "actionName", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clearHistoryTokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getActionName", "LWZ/t;", "getClearHistoryTokenizedEvent", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchTitleVO implements c {
    private final String actionName;
    private final t clearHistoryTokenizedEvent;
    private final long id;

    @NotNull
    private final String title;

    public SearchTitleVO(long j11, @NotNull String title, String str, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.actionName = str;
        this.clearHistoryTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTitleVO)) {
            return false;
        }
        SearchTitleVO searchTitleVO = (SearchTitleVO) other;
        return this.id == searchTitleVO.id && Intrinsics.d(this.title, searchTitleVO.title) && Intrinsics.d(this.actionName, searchTitleVO.actionName) && Intrinsics.d(this.clearHistoryTokenizedEvent, searchTitleVO.clearHistoryTokenizedEvent);
    }

    public final String getActionName() {
        return this.actionName;
    }

    public final t getClearHistoryTokenizedEvent() {
        return this.clearHistoryTokenizedEvent;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.actionName;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.clearHistoryTokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.actionName;
        t tVar = this.clearHistoryTokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "SearchTitleVO(id=", ", title=", str);
        a.f(c11, ", actionName=", str2, ", clearHistoryTokenizedEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ SearchTitleVO(long j11, String str, String str2, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, (i11 & 4) != 0 ? null : str2, tVar);
    }
}
