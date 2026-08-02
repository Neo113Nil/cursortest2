package ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation;

import Ak.C2436a;
import G.g;
import Ve.C4598rp;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.data.ToursLoaderDTO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0014R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b\u000b\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/presentation/ToursLoaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "imageLink", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/data/ToursLoaderDTO$ProgressContent;", "progressContent", "Lru/ozon/uni/atoms/af/AtomAction;", "isAllDoneAction", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "error", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImageLink", "Ljava/util/List;", "getProgressContent", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "getError", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursLoaderVO implements c {

    @NotNull
    private final EmptyStateVO error;
    private final long id;

    @NotNull
    private final String imageLink;

    @NotNull
    private final AtomAction isAllDoneAction;

    @NotNull
    private final List<ToursLoaderDTO.ProgressContent> progressContent;
    private final t tokenizedEvent;

    public ToursLoaderVO(long j11, @NotNull String imageLink, @NotNull List<ToursLoaderDTO.ProgressContent> progressContent, @NotNull AtomAction isAllDoneAction, @NotNull EmptyStateVO error, t tVar) {
        Intrinsics.checkNotNullParameter(imageLink, "imageLink");
        Intrinsics.checkNotNullParameter(progressContent, "progressContent");
        Intrinsics.checkNotNullParameter(isAllDoneAction, "isAllDoneAction");
        Intrinsics.checkNotNullParameter(error, "error");
        this.id = j11;
        this.imageLink = imageLink;
        this.progressContent = progressContent;
        this.isAllDoneAction = isAllDoneAction;
        this.error = error;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursLoaderVO)) {
            return false;
        }
        ToursLoaderVO toursLoaderVO = (ToursLoaderVO) other;
        return this.id == toursLoaderVO.id && Intrinsics.d(this.imageLink, toursLoaderVO.imageLink) && Intrinsics.d(this.progressContent, toursLoaderVO.progressContent) && Intrinsics.d(this.isAllDoneAction, toursLoaderVO.isAllDoneAction) && Intrinsics.d(this.error, toursLoaderVO.error) && Intrinsics.d(this.tokenizedEvent, toursLoaderVO.tokenizedEvent);
    }

    @NotNull
    public final EmptyStateVO getError() {
        return this.error;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImageLink() {
        return this.imageLink;
    }

    @NotNull
    public final List<ToursLoaderDTO.ProgressContent> getProgressContent() {
        return this.progressContent;
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
        int hashCode = (this.error.hashCode() + C4598rp.a(this.isAllDoneAction, g.b(g.a(Long.hashCode(this.id) * 31, 31, this.imageLink), 31, this.progressContent), 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    /* renamed from: isAllDoneAction, reason: from getter */
    public final AtomAction getIsAllDoneAction() {
        return this.isAllDoneAction;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.imageLink;
        List<ToursLoaderDTO.ProgressContent> list = this.progressContent;
        AtomAction atomAction = this.isAllDoneAction;
        EmptyStateVO emptyStateVO = this.error;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "ToursLoaderVO(id=", ", imageLink=", str);
        c11.append(", progressContent=");
        c11.append(list);
        c11.append(", isAllDoneAction=");
        c11.append(atomAction);
        c11.append(", error=");
        c11.append(emptyStateVO);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }
}
