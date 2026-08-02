package ru.ozon.app.android.orderdetails.cheques.presentation.cheque;

import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b$\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/orderdetails/cheques/presentation/cheque/ChequeVO;", "Ll20/c;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "subtitle", "price", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "<init>", "(JLjava/lang/CharSequence;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/String;", "getSubtitle", "getPrice", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ChequeVO implements c {
    private final AtomAction action;

    @NotNull
    private final ButtonV3Atom.SmallButton button;
    private final long id;

    @NotNull
    private final String price;

    @NotNull
    private final String subtitle;

    @NotNull
    private final CharSequence title;

    public ChequeVO(long j11, @NotNull CharSequence title, AtomAction atomAction, @NotNull String subtitle, @NotNull String price, @NotNull ButtonV3Atom.SmallButton button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.title = title;
        this.action = atomAction;
        this.subtitle = subtitle;
        this.price = price;
        this.button = button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChequeVO)) {
            return false;
        }
        ChequeVO chequeVO = (ChequeVO) other;
        return this.id == chequeVO.id && Intrinsics.d(this.title, chequeVO.title) && Intrinsics.d(this.action, chequeVO.action) && Intrinsics.d(this.subtitle, chequeVO.subtitle) && Intrinsics.d(this.price, chequeVO.price) && Intrinsics.d(this.button, chequeVO.button);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
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
    public final CharSequence getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.title.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        AtomAction atomAction = this.action;
        return this.button.hashCode() + g.a(g.a((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.subtitle), 31, this.price);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CharSequence charSequence = this.title;
        return "ChequeVO(id=" + j11 + ", title=" + ((Object) charSequence) + ", action=" + this.action + ", subtitle=" + this.subtitle + ", price=" + this.price + ", button=" + this.button + ")";
    }
}
