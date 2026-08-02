package ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.presentation;

import Ak.C2436a;
import G.g;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/presentation/CrosslinkVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "deeplink", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getDeeplink", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CrosslinkVO implements c, InterfaceC8039a {

    @NotNull
    private final String deeplink;
    private final long id;

    @NotNull
    private final String title;

    public CrosslinkVO(long j11, @NotNull String title, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.id = j11;
        this.title = title;
        this.deeplink = deeplink;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrosslinkVO)) {
            return false;
        }
        CrosslinkVO crosslinkVO = (CrosslinkVO) other;
        return this.id == crosslinkVO.id && Intrinsics.d(this.title, crosslinkVO.title) && Intrinsics.d(this.deeplink, crosslinkVO.deeplink);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
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
        return this.deeplink.hashCode() + g.a(Long.hashCode(this.id) * 31, 31, this.title);
    }

    @NotNull
    public String toString() {
        return C6594f.a(", deeplink=", this.deeplink, ")", C2436a.c(this.id, "CrosslinkVO(id=", ", title=", this.title));
    }
}
