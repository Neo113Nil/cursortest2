package ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation;

import B90.C2618u;
import B90.C2619v;
import Bl.C2639a;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/addressCommunication/presentation/AddressCommunicationVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "noButton", "yesButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "noButtonTokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getNoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getYesButton", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getNoButtonTokenizedEvent", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressCommunicationVO implements c {
    private final long id;

    @NotNull
    private final ButtonV3Atom.SmallButton noButton;
    private final t noButtonTokenizedEvent;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    @NotNull
    private final ButtonV3Atom.SmallButton yesButton;

    public AddressCommunicationVO(long j11, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.SmallButton noButton, @NotNull ButtonV3Atom.SmallButton yesButton, t tVar, t tVar2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(noButton, "noButton");
        Intrinsics.checkNotNullParameter(yesButton, "yesButton");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.noButton = noButton;
        this.yesButton = yesButton;
        this.tokenizedEvent = tVar;
        this.noButtonTokenizedEvent = tVar2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressCommunicationVO)) {
            return false;
        }
        AddressCommunicationVO addressCommunicationVO = (AddressCommunicationVO) other;
        return this.id == addressCommunicationVO.id && Intrinsics.d(this.title, addressCommunicationVO.title) && Intrinsics.d(this.subtitle, addressCommunicationVO.subtitle) && Intrinsics.d(this.noButton, addressCommunicationVO.noButton) && Intrinsics.d(this.yesButton, addressCommunicationVO.yesButton) && Intrinsics.d(this.tokenizedEvent, addressCommunicationVO.tokenizedEvent) && Intrinsics.d(this.noButtonTokenizedEvent, addressCommunicationVO.noButtonTokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getNoButton() {
        return this.noButton;
    }

    public final t getNoButtonTokenizedEvent() {
        return this.noButtonTokenizedEvent;
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

    @NotNull
    public final ButtonV3Atom.SmallButton getYesButton() {
        return this.yesButton;
    }

    public int hashCode() {
        int c11 = C2618u.c(this.yesButton, C2618u.c(this.noButton, C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle), 31), 31);
        t tVar = this.tokenizedEvent;
        int hashCode = (c11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.noButtonTokenizedEvent;
        return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        ButtonV3Atom.SmallButton smallButton = this.noButton;
        ButtonV3Atom.SmallButton smallButton2 = this.yesButton;
        t tVar = this.tokenizedEvent;
        t tVar2 = this.noButtonTokenizedEvent;
        StringBuilder c11 = C2639a.c("AddressCommunicationVO(id=", j11, ", title=", textAtom);
        c11.append(", subtitle=");
        c11.append(textAtom2);
        c11.append(", noButton=");
        c11.append(smallButton);
        c11.append(", yesButton=");
        c11.append(smallButton2);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        return a.b(c11, ", noButtonTokenizedEvent=", tVar2, ")");
    }
}
