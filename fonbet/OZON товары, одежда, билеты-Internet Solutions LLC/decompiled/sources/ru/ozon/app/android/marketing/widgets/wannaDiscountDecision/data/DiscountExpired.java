package ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.data;

import B90.C2619v;
import HY.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/DiscountExpired;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "infoButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DiscountExpired {
    public static final int $stable;

    @NotNull
    private final ButtonV3Atom.SmallIconButton infoButton;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;

    static {
        int i11 = ButtonV3Atom.SmallIconButton.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12;
    }

    public DiscountExpired(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.SmallIconButton infoButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        this.title = title;
        this.subtitle = subtitle;
        this.infoButton = infoButton;
    }

    public static /* synthetic */ DiscountExpired copy$default(DiscountExpired discountExpired, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallIconButton smallIconButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = discountExpired.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = discountExpired.subtitle;
        }
        if ((i11 & 4) != 0) {
            smallIconButton = discountExpired.infoButton;
        }
        return discountExpired.copy(textAtom, textAtom2, smallIconButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    public final DiscountExpired copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull ButtonV3Atom.SmallIconButton infoButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(infoButton, "infoButton");
        return new DiscountExpired(title, subtitle, infoButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountExpired)) {
            return false;
        }
        DiscountExpired discountExpired = (DiscountExpired) other;
        return Intrinsics.d(this.title, discountExpired.title) && Intrinsics.d(this.subtitle, discountExpired.subtitle) && Intrinsics.d(this.infoButton, discountExpired.infoButton);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getInfoButton() {
        return this.infoButton;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.infoButton.hashCode() + C2619v.b(this.title.hashCode() * 31, 31, this.subtitle);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        ButtonV3Atom.SmallIconButton smallIconButton = this.infoButton;
        StringBuilder a11 = a.a("DiscountExpired(title=", textAtom, ", subtitle=", textAtom2, ", infoButton=");
        a11.append(smallIconButton);
        a11.append(")");
        return a11.toString();
    }
}
