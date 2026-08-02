package ru.ozon.app.android.common.ui.actionCards.presentation;

import Ak.C2436a;
import B0.C2454a;
import B90.C2618u;
import B90.C2619v;
import Bl.C2639a;
import Cm.e;
import G.g;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00017BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u0010\u001aR\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "image", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "buttonWidth", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO$MarginModel;", "marginModel", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/af/AtomAction;ILWZ/t;Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO$MarginModel;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getButtonWidth", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO$MarginModel;", "getMarginModel", "()Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO$MarginModel;", "MarginModel", "action-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardVO implements c {
    private final AtomAction action;

    @NotNull
    private final ButtonV3Atom.SmallButton button;
    private final int buttonWidth;
    private final long id;

    @NotNull
    private final String image;

    @NotNull
    private final MarginModel marginModel;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO$MarginModel;", "", "", "top", "bottom", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "action-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MarginModel {
        private final int bottom;
        private final int top;

        public MarginModel(int i11, int i12) {
            this.top = i11;
            this.bottom = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginModel)) {
                return false;
            }
            MarginModel marginModel = (MarginModel) other;
            return this.top == marginModel.top && this.bottom == marginModel.bottom;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + (Integer.hashCode(this.top) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("MarginModel(top=", this.top, ", bottom=", ")", this.bottom);
        }
    }

    public CardVO(long j11, @NotNull String image, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.SmallButton button, AtomAction atomAction, int i11, t tVar, @NotNull MarginModel marginModel) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(marginModel, "marginModel");
        this.id = j11;
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.button = button;
        this.action = atomAction;
        this.buttonWidth = i11;
        this.tokenizedEvent = tVar;
        this.marginModel = marginModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardVO)) {
            return false;
        }
        CardVO cardVO = (CardVO) other;
        return this.id == cardVO.id && Intrinsics.d(this.image, cardVO.image) && Intrinsics.d(this.title, cardVO.title) && Intrinsics.d(this.subtitle, cardVO.subtitle) && Intrinsics.d(this.button, cardVO.button) && Intrinsics.d(this.action, cardVO.action) && this.buttonWidth == cardVO.buttonWidth && Intrinsics.d(this.tokenizedEvent, cardVO.tokenizedEvent) && Intrinsics.d(this.marginModel, cardVO.marginModel);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    public final int getButtonWidth() {
        return this.buttonWidth;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final MarginModel getMarginModel() {
        return this.marginModel;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
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
        int c11 = C2618u.c(this.button, C2619v.b(C2619v.b(g.a(Long.hashCode(this.id) * 31, 31, this.image), 31, this.title), 31, this.subtitle), 31);
        AtomAction atomAction = this.action;
        int a11 = C2454a.a(this.buttonWidth, (c11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31);
        t tVar = this.tokenizedEvent;
        return this.marginModel.hashCode() + ((a11 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.image;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        ButtonV3Atom.SmallButton smallButton = this.button;
        AtomAction atomAction = this.action;
        int i11 = this.buttonWidth;
        t tVar = this.tokenizedEvent;
        MarginModel marginModel = this.marginModel;
        StringBuilder c11 = C2436a.c(j11, "CardVO(id=", ", image=", str);
        C2639a.e(", title=", ", subtitle=", c11, textAtom, textAtom2);
        c11.append(", button=");
        c11.append(smallButton);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", buttonWidth=");
        c11.append(i11);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", marginModel=");
        c11.append(marginModel);
        c11.append(")");
        return c11.toString();
    }
}
