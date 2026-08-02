package ru.ozon.app.android.marketing.widgets.blackFridayStatus.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ButtonWithTitle;", "", "button", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/app/android/atoms/data/button/SwitchingButton;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getButton", "()Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ButtonWithTitle {
    public static final int $stable = 8;

    @NotNull
    private final SwitchingButton button;
    private final TextAtom title;

    public ButtonWithTitle(@NotNull SwitchingButton button, TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.title = textAtom;
    }

    public static /* synthetic */ ButtonWithTitle copy$default(ButtonWithTitle buttonWithTitle, SwitchingButton switchingButton, TextAtom textAtom, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            switchingButton = buttonWithTitle.button;
        }
        if ((i11 & 2) != 0) {
            textAtom = buttonWithTitle.title;
        }
        return buttonWithTitle.copy(switchingButton, textAtom);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SwitchingButton getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final ButtonWithTitle copy(@NotNull SwitchingButton button, TextAtom title) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new ButtonWithTitle(button, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonWithTitle)) {
            return false;
        }
        ButtonWithTitle buttonWithTitle = (ButtonWithTitle) other;
        return Intrinsics.d(this.button, buttonWithTitle.button) && Intrinsics.d(this.title, buttonWithTitle.title);
    }

    @NotNull
    public final SwitchingButton getButton() {
        return this.button;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        TextAtom textAtom = this.title;
        return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
    }

    @NotNull
    public String toString() {
        return "ButtonWithTitle(button=" + this.button + ", title=" + this.title + ")";
    }

    public /* synthetic */ ButtonWithTitle(SwitchingButton switchingButton, TextAtom textAtom, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(switchingButton, (i11 & 2) != 0 ? null : textAtom);
    }
}
