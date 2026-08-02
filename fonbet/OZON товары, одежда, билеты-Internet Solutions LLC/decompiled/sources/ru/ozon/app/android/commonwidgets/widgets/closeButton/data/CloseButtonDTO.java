package ru.ozon.app.android.commonwidgets.widgets.closeButton.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/CloseButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "dialog", "Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getDialog", "()Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CloseButtonDTO {

    @NotNull
    private final ButtonV3Atom.SmallIconButton button;

    @NotNull
    private final Dialog dialog;

    public CloseButtonDTO(@NotNull ButtonV3Atom.SmallIconButton button, @NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.button = button;
        this.dialog = dialog;
    }

    public static /* synthetic */ CloseButtonDTO copy$default(CloseButtonDTO closeButtonDTO, ButtonV3Atom.SmallIconButton smallIconButton, Dialog dialog, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            smallIconButton = closeButtonDTO.button;
        }
        if ((i11 & 2) != 0) {
            dialog = closeButtonDTO.dialog;
        }
        return closeButtonDTO.copy(smallIconButton, dialog);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Dialog getDialog() {
        return this.dialog;
    }

    @NotNull
    public final CloseButtonDTO copy(@NotNull ButtonV3Atom.SmallIconButton button, @NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        return new CloseButtonDTO(button, dialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloseButtonDTO)) {
            return false;
        }
        CloseButtonDTO closeButtonDTO = (CloseButtonDTO) other;
        return Intrinsics.d(this.button, closeButtonDTO.button) && Intrinsics.d(this.dialog, closeButtonDTO.dialog);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getButton() {
        return this.button;
    }

    @NotNull
    public final Dialog getDialog() {
        return this.dialog;
    }

    public int hashCode() {
        return this.dialog.hashCode() + (this.button.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CloseButtonDTO(button=" + this.button + ", dialog=" + this.dialog + ")";
    }
}
