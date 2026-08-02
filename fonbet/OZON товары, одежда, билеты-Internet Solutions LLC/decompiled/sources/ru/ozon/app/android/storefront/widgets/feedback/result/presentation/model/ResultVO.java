package ru.ozon.app.android.storefront.widgets.feedback.result.presentation.model;

import G.g;
import Lh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.common.presentation.FeedbackNavbarVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;", "navbar", "", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell;", "body", "Lru/ozon/uni/atoms/af/AtomAction;", "finalAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;", "getNavbar", "()Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;", "Ljava/util/List;", "getBody", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getFinalAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ResultVO implements c {

    @NotNull
    private final List<ResultServiceCell> body;
    private final AtomAction finalAction;
    private final long id;

    @NotNull
    private final FeedbackNavbarVO navbar;
    private final t tokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultVO(long j11, @NotNull FeedbackNavbarVO navbar, @NotNull List<? extends ResultServiceCell> body, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        Intrinsics.checkNotNullParameter(body, "body");
        this.id = j11;
        this.navbar = navbar;
        this.body = body;
        this.finalAction = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultVO)) {
            return false;
        }
        ResultVO resultVO = (ResultVO) other;
        return this.id == resultVO.id && Intrinsics.d(this.navbar, resultVO.navbar) && Intrinsics.d(this.body, resultVO.body) && Intrinsics.d(this.finalAction, resultVO.finalAction) && Intrinsics.d(this.tokenizedEvent, resultVO.tokenizedEvent);
    }

    @NotNull
    public final List<ResultServiceCell> getBody() {
        return this.body;
    }

    public final AtomAction getFinalAction() {
        return this.finalAction;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final FeedbackNavbarVO getNavbar() {
        return this.navbar;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b((this.navbar.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.body);
        AtomAction atomAction = this.finalAction;
        int hashCode = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        FeedbackNavbarVO feedbackNavbarVO = this.navbar;
        List<ResultServiceCell> list = this.body;
        AtomAction atomAction = this.finalAction;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("ResultVO(id=");
        sb2.append(j11);
        sb2.append(", navbar=");
        sb2.append(feedbackNavbarVO);
        sb2.append(", body=");
        sb2.append(list);
        sb2.append(", finalAction=");
        sb2.append(atomAction);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
