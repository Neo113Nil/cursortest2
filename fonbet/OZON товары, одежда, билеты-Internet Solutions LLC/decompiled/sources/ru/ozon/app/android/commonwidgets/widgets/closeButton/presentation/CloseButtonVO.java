package ru.ozon.app.android.commonwidgets.widgets.closeButton.presentation;

import J0.C3349u1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.closeButton.data.Dialog;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/closeButton/presentation/CloseButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "button", "Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog;", "dialog", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog;", "getDialog", "()Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CloseButtonVO implements c {

    @NotNull
    private final ButtonV3Atom.SmallIconButton button;

    @NotNull
    private final Dialog dialog;
    private final long id;

    public CloseButtonVO(long j11, @NotNull ButtonV3Atom.SmallIconButton button, @NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.id = j11;
        this.button = button;
        this.dialog = dialog;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloseButtonVO)) {
            return false;
        }
        CloseButtonVO closeButtonVO = (CloseButtonVO) other;
        return this.id == closeButtonVO.id && Intrinsics.d(this.button, closeButtonVO.button) && Intrinsics.d(this.dialog, closeButtonVO.dialog);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getButton() {
        return this.button;
    }

    @NotNull
    public final Dialog getDialog() {
        return this.dialog;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        return this.dialog.hashCode() + C3349u1.d(this.button, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "CloseButtonVO(id=" + this.id + ", button=" + this.button + ", dialog=" + this.dialog + ")";
    }
}
