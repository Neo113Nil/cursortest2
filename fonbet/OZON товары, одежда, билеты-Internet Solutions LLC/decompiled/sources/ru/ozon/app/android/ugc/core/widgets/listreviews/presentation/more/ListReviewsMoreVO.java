package ru.ozon.app.android.ugc.core.widgets.listreviews.presentation.more;

import Ak.C2436a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.m;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u00042\u00020\u0005B+\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0011¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/more/ListReviewsMoreVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/m;", "Lm10/o;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/deprecated/Label;", "badge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/atoms/data/deprecated/Label;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Lru/ozon/app/android/atoms/data/deprecated/Label;", "getBadge", "()Lru/ozon/app/android/atoms/data/deprecated/Label;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "widgetName", "getWidgetName", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ListReviewsMoreVO implements c, InterfaceC8039a, m, o {
    private final AtomAction action;
    private final Label badge;
    private final long id;

    @NotNull
    private final String title;

    @NotNull
    private final String widgetName;

    public ListReviewsMoreVO(long j11, @NotNull String title, Label label, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.badge = label;
        this.action = atomAction;
        this.widgetName = "review";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListReviewsMoreVO)) {
            return false;
        }
        ListReviewsMoreVO listReviewsMoreVO = (ListReviewsMoreVO) other;
        return this.id == listReviewsMoreVO.id && Intrinsics.d(this.title, listReviewsMoreVO.title) && Intrinsics.d(this.badge, listReviewsMoreVO.badge) && Intrinsics.d(this.action, listReviewsMoreVO.action);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final Label getBadge() {
        return this.badge;
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

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        Label label = this.badge;
        int hashCode = (a11 + (label == null ? 0 : label.hashCode())) * 31;
        AtomAction atomAction = this.action;
        return hashCode + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        Label label = this.badge;
        AtomAction atomAction = this.action;
        StringBuilder c11 = C2436a.c(j11, "ListReviewsMoreVO(id=", ", title=", str);
        c11.append(", badge=");
        c11.append(label);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(")");
        return c11.toString();
    }
}
