package ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.presentation;

import Lh.a;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/presentation/ScrollAnchorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "scrollWidgetKey", "", "scrollAnchorId", "<init>", "(JLjava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getScrollAnchorId", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ScrollAnchorVO implements c {
    private final long id;

    @NotNull
    private final String scrollAnchorId;
    private final Integer scrollWidgetKey;

    public ScrollAnchorVO(long j11, Integer num, @NotNull String scrollAnchorId) {
        Intrinsics.checkNotNullParameter(scrollAnchorId, "scrollAnchorId");
        this.id = j11;
        this.scrollWidgetKey = num;
        this.scrollAnchorId = scrollAnchorId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollAnchorVO)) {
            return false;
        }
        ScrollAnchorVO scrollAnchorVO = (ScrollAnchorVO) other;
        return this.id == scrollAnchorVO.id && Intrinsics.d(this.scrollWidgetKey, scrollAnchorVO.scrollWidgetKey) && Intrinsics.d(this.scrollAnchorId, scrollAnchorVO.scrollAnchorId);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getScrollAnchorId() {
        return this.scrollAnchorId;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.scrollWidgetKey;
        return this.scrollAnchorId.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return C6594f.a(", scrollAnchorId=", this.scrollAnchorId, ")", a.c("ScrollAnchorVO(id=", this.id, ", scrollWidgetKey=", this.scrollWidgetKey));
    }
}
