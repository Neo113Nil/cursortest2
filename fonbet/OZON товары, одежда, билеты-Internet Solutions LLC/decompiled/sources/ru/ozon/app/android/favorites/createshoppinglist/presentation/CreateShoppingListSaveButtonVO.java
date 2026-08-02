package ru.ozon.app.android.favorites.createshoppinglist.presentation;

import Ak.C2436a;
import Tl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\n\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSaveButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "newListTitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "saveButton", "", "isModal", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getNewListTitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSaveButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Z", "()Z", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreateShoppingListSaveButtonVO implements c {
    private final long id;
    private final boolean isModal;
    private final String newListTitle;

    @NotNull
    private final ButtonV3Atom.LargeButton saveButton;

    public CreateShoppingListSaveButtonVO(long j11, String str, @NotNull ButtonV3Atom.LargeButton saveButton, boolean z11) {
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        this.id = j11;
        this.newListTitle = str;
        this.saveButton = saveButton;
        this.isModal = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateShoppingListSaveButtonVO)) {
            return false;
        }
        CreateShoppingListSaveButtonVO createShoppingListSaveButtonVO = (CreateShoppingListSaveButtonVO) other;
        return this.id == createShoppingListSaveButtonVO.id && Intrinsics.d(this.newListTitle, createShoppingListSaveButtonVO.newListTitle) && Intrinsics.d(this.saveButton, createShoppingListSaveButtonVO.saveButton) && this.isModal == createShoppingListSaveButtonVO.isModal;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getNewListTitle() {
        return this.newListTitle;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSaveButton() {
        return this.saveButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.newListTitle;
        return Boolean.hashCode(this.isModal) + b.a(this.saveButton, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    /* renamed from: isModal, reason: from getter */
    public final boolean getIsModal() {
        return this.isModal;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.newListTitle;
        ButtonV3Atom.LargeButton largeButton = this.saveButton;
        boolean z11 = this.isModal;
        StringBuilder c11 = C2436a.c(j11, "CreateShoppingListSaveButtonVO(id=", ", newListTitle=", str);
        c11.append(", saveButton=");
        c11.append(largeButton);
        c11.append(", isModal=");
        c11.append(z11);
        c11.append(")");
        return c11.toString();
    }
}
