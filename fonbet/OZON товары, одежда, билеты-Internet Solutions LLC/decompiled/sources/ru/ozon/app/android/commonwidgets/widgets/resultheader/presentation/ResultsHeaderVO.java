package ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation;

import Ak.C2436a;
import Ak.b;
import G.g;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ResultsHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "actionButton", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/util/List;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Ljava/util/List;", "getBadge", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ResultsHeaderVO implements c {
    private final ButtonV3Atom.SmallIconButton actionButton;

    @NotNull
    private final List<Badge> badge;
    private final long id;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;
    private final t tokenizedEvent;

    public ResultsHeaderVO(long j11, @NotNull String title, @NotNull String subtitle, ButtonV3Atom.SmallIconButton smallIconButton, @NotNull List<Badge> badge, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.actionButton = smallIconButton;
        this.badge = badge;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultsHeaderVO)) {
            return false;
        }
        ResultsHeaderVO resultsHeaderVO = (ResultsHeaderVO) other;
        return this.id == resultsHeaderVO.id && Intrinsics.d(this.title, resultsHeaderVO.title) && Intrinsics.d(this.subtitle, resultsHeaderVO.subtitle) && Intrinsics.d(this.actionButton, resultsHeaderVO.actionButton) && Intrinsics.d(this.badge, resultsHeaderVO.badge) && Intrinsics.d(this.tokenizedEvent, resultsHeaderVO.tokenizedEvent);
    }

    public final ButtonV3Atom.SmallIconButton getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final List<Badge> getBadge() {
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
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle);
        ButtonV3Atom.SmallIconButton smallIconButton = this.actionButton;
        int b11 = g.b((a11 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31, 31, this.badge);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        ButtonV3Atom.SmallIconButton smallIconButton = this.actionButton;
        List<Badge> list = this.badge;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "ResultsHeaderVO(id=", ", title=", str);
        c11.append(", subtitle=");
        c11.append(str2);
        c11.append(", actionButton=");
        c11.append(smallIconButton);
        b.h(c11, ", badge=", list, ", tokenizedEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }
}
