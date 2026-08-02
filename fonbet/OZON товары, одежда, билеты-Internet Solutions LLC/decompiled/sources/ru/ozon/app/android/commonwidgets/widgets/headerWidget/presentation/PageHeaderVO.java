package ru.ozon.app.android.commonwidgets.widgets.headerWidget.presentation;

import Ak.C2436a;
import G.g;
import Pk0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/headerWidget/presentation/PageHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "textSize", "", "bottomPadding", "<init>", "(JLjava/lang/String;FI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "F", "getTextSize", "()F", "I", "getBottomPadding", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PageHeaderVO implements c {
    private final int bottomPadding;
    private final long id;
    private final float textSize;

    @NotNull
    private final String title;

    public PageHeaderVO(long j11, @NotNull String title, float f7, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.textSize = f7;
        this.bottomPadding = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageHeaderVO)) {
            return false;
        }
        PageHeaderVO pageHeaderVO = (PageHeaderVO) other;
        return this.id == pageHeaderVO.id && Intrinsics.d(this.title, pageHeaderVO.title) && Float.compare(this.textSize, pageHeaderVO.textSize) == 0 && this.bottomPadding == pageHeaderVO.bottomPadding;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final float getTextSize() {
        return this.textSize;
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
        return Integer.hashCode(this.bottomPadding) + b.a(this.textSize, g.a(Long.hashCode(this.id) * 31, 31, this.title), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        float f7 = this.textSize;
        int i11 = this.bottomPadding;
        StringBuilder c11 = C2436a.c(j11, "PageHeaderVO(id=", ", title=", str);
        c11.append(", textSize=");
        c11.append(f7);
        c11.append(", bottomPadding=");
        c11.append(i11);
        c11.append(")");
        return c11.toString();
    }
}
