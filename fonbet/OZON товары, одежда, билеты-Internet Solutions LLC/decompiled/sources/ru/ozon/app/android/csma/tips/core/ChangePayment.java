package ru.ozon.app.android.csma.tips.core;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/csma/tips/core/ChangePayment;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "actionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "getTitle", "()Ljava/lang/String;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChangePayment {
    private final ButtonV3Atom.SmallBorderlessButton actionButton;

    @NotNull
    private final String title;

    public ChangePayment(@NotNull String title, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.actionButton = smallBorderlessButton;
    }

    public static /* synthetic */ ChangePayment copy$default(ChangePayment changePayment, String str, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = changePayment.title;
        }
        if ((i11 & 2) != 0) {
            smallBorderlessButton = changePayment.actionButton;
        }
        return changePayment.copy(str, smallBorderlessButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final ChangePayment copy(@NotNull String title, ButtonV3Atom.SmallBorderlessButton actionButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ChangePayment(title, actionButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePayment)) {
            return false;
        }
        ChangePayment changePayment = (ChangePayment) other;
        return Intrinsics.d(this.title, changePayment.title) && Intrinsics.d(this.actionButton, changePayment.actionButton);
    }

    public final ButtonV3Atom.SmallBorderlessButton getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.actionButton;
        return hashCode + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode());
    }

    @NotNull
    public String toString() {
        return "ChangePayment(title=" + this.title + ", actionButton=" + this.actionButton + ")";
    }
}
