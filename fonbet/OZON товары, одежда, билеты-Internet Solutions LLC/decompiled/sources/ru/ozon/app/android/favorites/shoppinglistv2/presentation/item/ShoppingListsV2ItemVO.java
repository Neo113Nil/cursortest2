package ru.ozon.app.android.favorites.shoppinglistv2.presentation.item;

import Ak.C2436a;
import Bi.b;
import G.g;
import Nh.a;
import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b\u000e\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2ItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "optionsButton", "", "isPinned", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "getIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getOptionsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Z", "()Z", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ShoppingListsV2ItemVO implements c {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final String icon;
    private final long id;
    private final boolean isPinned;
    private final ButtonV3Atom.SmallIconButton optionsButton;
    private final String subtitle;

    @NotNull
    private final String title;

    public ShoppingListsV2ItemVO(long j11, @NotNull String title, String str, @NotNull String icon, @NotNull AtomAction action, ButtonV3Atom.SmallIconButton smallIconButton, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.title = title;
        this.subtitle = str;
        this.icon = icon;
        this.action = action;
        this.optionsButton = smallIconButton;
        this.isPinned = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListsV2ItemVO)) {
            return false;
        }
        ShoppingListsV2ItemVO shoppingListsV2ItemVO = (ShoppingListsV2ItemVO) other;
        return this.id == shoppingListsV2ItemVO.id && Intrinsics.d(this.title, shoppingListsV2ItemVO.title) && Intrinsics.d(this.subtitle, shoppingListsV2ItemVO.subtitle) && Intrinsics.d(this.icon, shoppingListsV2ItemVO.icon) && Intrinsics.d(this.action, shoppingListsV2ItemVO.action) && Intrinsics.d(this.optionsButton, shoppingListsV2ItemVO.optionsButton) && this.isPinned == shoppingListsV2ItemVO.isPinned;
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ButtonV3Atom.SmallIconButton getOptionsButton() {
        return this.optionsButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSubtitle() {
        return this.subtitle;
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
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.subtitle;
        int a12 = C4598rp.a(this.action, g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.icon), 31);
        ButtonV3Atom.SmallIconButton smallIconButton = this.optionsButton;
        return Boolean.hashCode(this.isPinned) + ((a12 + (smallIconButton != null ? smallIconButton.hashCode() : 0)) * 31);
    }

    /* renamed from: isPinned, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.icon;
        AtomAction atomAction = this.action;
        ButtonV3Atom.SmallIconButton smallIconButton = this.optionsButton;
        boolean z11 = this.isPinned;
        StringBuilder c11 = C2436a.c(j11, "ShoppingListsV2ItemVO(id=", ", title=", str);
        a.h(c11, ", subtitle=", str2, ", icon=", str3);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", optionsButton=");
        c11.append(smallIconButton);
        return b.f(c11, ", isPinned=", z11, ")");
    }
}
