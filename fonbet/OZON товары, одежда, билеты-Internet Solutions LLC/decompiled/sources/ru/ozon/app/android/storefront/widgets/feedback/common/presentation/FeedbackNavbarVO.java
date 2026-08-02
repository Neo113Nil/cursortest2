package ru.ozon.app.android.storefront.widgets.feedback.common.presentation;

import B90.C2619v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "backButton", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "closeButton", "Lru/ozon/uni/atoms/af/AtomAction;", "closeAction", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getBackButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCloseButton", "Lru/ozon/uni/atoms/af/AtomAction;", "getCloseAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FeedbackNavbarVO implements c {
    public static final int $stable;
    private final ButtonV3Atom.SmallIconButton backButton;
    private final AtomAction closeAction;
    private final ButtonV3Atom.SmallIconButton closeButton;
    private final long id;

    @NotNull
    private final TextAtom title;

    static {
        int i11 = AtomAction.$stable;
        int i12 = ButtonV3Atom.SmallIconButton.$stable;
        $stable = i11 | i12 | TextAtom.$stable | i12;
    }

    public FeedbackNavbarVO(long j11, ButtonV3Atom.SmallIconButton smallIconButton, @NotNull TextAtom title, ButtonV3Atom.SmallIconButton smallIconButton2, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.backButton = smallIconButton;
        this.title = title;
        this.closeButton = smallIconButton2;
        this.closeAction = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackNavbarVO)) {
            return false;
        }
        FeedbackNavbarVO feedbackNavbarVO = (FeedbackNavbarVO) other;
        return this.id == feedbackNavbarVO.id && Intrinsics.d(this.backButton, feedbackNavbarVO.backButton) && Intrinsics.d(this.title, feedbackNavbarVO.title) && Intrinsics.d(this.closeButton, feedbackNavbarVO.closeButton) && Intrinsics.d(this.closeAction, feedbackNavbarVO.closeAction);
    }

    public final ButtonV3Atom.SmallIconButton getBackButton() {
        return this.backButton;
    }

    public final AtomAction getCloseAction() {
        return this.closeAction;
    }

    public final ButtonV3Atom.SmallIconButton getCloseButton() {
        return this.closeButton;
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
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.backButton;
        int b11 = C2619v.b((hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31, 31, this.title);
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.closeButton;
        int hashCode2 = (b11 + (smallIconButton2 == null ? 0 : smallIconButton2.hashCode())) * 31;
        AtomAction atomAction = this.closeAction;
        return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FeedbackNavbarVO(id=" + this.id + ", backButton=" + this.backButton + ", title=" + this.title + ", closeButton=" + this.closeButton + ", closeAction=" + this.closeAction + ")";
    }
}
