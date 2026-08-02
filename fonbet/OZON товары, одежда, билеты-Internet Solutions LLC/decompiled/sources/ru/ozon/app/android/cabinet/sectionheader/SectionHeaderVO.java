package ru.ozon.app.android.cabinet.sectionheader;

import Ak.C2436a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.WidgetGroupObject;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cabinet/sectionheader/SectionHeaderVO;", "Lru/ozon/app/android/cabinet/WidgetGroupObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "widgetGroup", "getWidgetGroup", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SectionHeaderVO implements WidgetGroupObject {
    private final Badge badge;
    private final long id;

    @NotNull
    private final String title;

    @NotNull
    private final String widgetGroup;

    public SectionHeaderVO(long j11, @NotNull String title, Badge badge) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.badge = badge;
        this.widgetGroup = "section_header";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionHeaderVO)) {
            return false;
        }
        SectionHeaderVO sectionHeaderVO = (SectionHeaderVO) other;
        return this.id == sectionHeaderVO.id && Intrinsics.d(this.title, sectionHeaderVO.title) && Intrinsics.d(this.badge, sectionHeaderVO.badge);
    }

    public final Badge getBadge() {
        return this.badge;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return WidgetGroupObject.DefaultImpls.getScrollWidgetKey(this);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return WidgetGroupObject.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        Badge badge = this.badge;
        return a11 + (badge == null ? 0 : badge.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        Badge badge = this.badge;
        StringBuilder c11 = C2436a.c(j11, "SectionHeaderVO(id=", ", title=", str);
        c11.append(", badge=");
        c11.append(badge);
        c11.append(")");
        return c11.toString();
    }
}
