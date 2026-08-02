package ru.ozon.app.android.commonwidgets.widgets.refresh;

import Ak.C2436a;
import E0.C2942q;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/refresh/RefreshVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "link", "refreshAfter", "Lru/ozon/app/android/commonwidgets/widgets/refresh/ScrollPosition;", "scrollPosition", "<init>", "(JLjava/lang/String;JLru/ozon/app/android/commonwidgets/widgets/refresh/ScrollPosition;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getLink", "getRefreshAfter", "Lru/ozon/app/android/commonwidgets/widgets/refresh/ScrollPosition;", "getScrollPosition", "()Lru/ozon/app/android/commonwidgets/widgets/refresh/ScrollPosition;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RefreshVO implements c {
    private final long id;

    @NotNull
    private final String link;
    private final long refreshAfter;
    private final ScrollPosition scrollPosition;

    public RefreshVO(long j11, @NotNull String link, long j12, ScrollPosition scrollPosition) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.id = j11;
        this.link = link;
        this.refreshAfter = j12;
        this.scrollPosition = scrollPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefreshVO)) {
            return false;
        }
        RefreshVO refreshVO = (RefreshVO) other;
        return this.id == refreshVO.id && Intrinsics.d(this.link, refreshVO.link) && this.refreshAfter == refreshVO.refreshAfter && this.scrollPosition == refreshVO.scrollPosition;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final long getRefreshAfter() {
        return this.refreshAfter;
    }

    public final ScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Pk0.c.a(g.a(Long.hashCode(this.id) * 31, 31, this.link), 31, this.refreshAfter);
        ScrollPosition scrollPosition = this.scrollPosition;
        return a11 + (scrollPosition == null ? 0 : scrollPosition.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.link;
        long j12 = this.refreshAfter;
        ScrollPosition scrollPosition = this.scrollPosition;
        StringBuilder c11 = C2436a.c(j11, "RefreshVO(id=", ", link=", str);
        C2942q.f(c11, ", refreshAfter=", j12, ", scrollPosition=");
        c11.append(scrollPosition);
        c11.append(")");
        return c11.toString();
    }
}
