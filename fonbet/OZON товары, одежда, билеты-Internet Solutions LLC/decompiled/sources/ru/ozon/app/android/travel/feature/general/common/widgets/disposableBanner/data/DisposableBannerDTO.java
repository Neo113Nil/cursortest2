package ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.data;

import B90.C2619v;
import G.g;
import N3.C3660k;
import Ve.C4636t5;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/data/DisposableBannerDTO;", "", "backgroundColor", "", "imageURL", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "iconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getBackgroundColor", "()Ljava/lang/String;", "getImageURL", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DisposableBannerDTO {
    public static final int $stable;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final TextAtom description;
    private final ButtonV3Atom.SmallIconButton iconButton;

    @NotNull
    private final String imageURL;

    @NotNull
    private final TextAtom title;

    static {
        int i11 = ButtonV3Atom.SmallIconButton.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12;
    }

    public DisposableBannerDTO(@NotNull String backgroundColor, @NotNull String imageURL, @NotNull TextAtom title, @NotNull TextAtom description, ButtonV3Atom.SmallIconButton smallIconButton) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.backgroundColor = backgroundColor;
        this.imageURL = imageURL;
        this.title = title;
        this.description = description;
        this.iconButton = smallIconButton;
    }

    public static /* synthetic */ DisposableBannerDTO copy$default(DisposableBannerDTO disposableBannerDTO, String str, String str2, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallIconButton smallIconButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = disposableBannerDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = disposableBannerDTO.imageURL;
        }
        if ((i11 & 4) != 0) {
            textAtom = disposableBannerDTO.title;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = disposableBannerDTO.description;
        }
        if ((i11 & 16) != 0) {
            smallIconButton = disposableBannerDTO.iconButton;
        }
        ButtonV3Atom.SmallIconButton smallIconButton2 = smallIconButton;
        TextAtom textAtom3 = textAtom;
        return disposableBannerDTO.copy(str, str2, textAtom3, textAtom2, smallIconButton2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final DisposableBannerDTO copy(@NotNull String backgroundColor, @NotNull String imageURL, @NotNull TextAtom title, @NotNull TextAtom description, ButtonV3Atom.SmallIconButton iconButton) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(imageURL, "imageURL");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new DisposableBannerDTO(backgroundColor, imageURL, title, description, iconButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisposableBannerDTO)) {
            return false;
        }
        DisposableBannerDTO disposableBannerDTO = (DisposableBannerDTO) other;
        return Intrinsics.d(this.backgroundColor, disposableBannerDTO.backgroundColor) && Intrinsics.d(this.imageURL, disposableBannerDTO.imageURL) && Intrinsics.d(this.title, disposableBannerDTO.title) && Intrinsics.d(this.description, disposableBannerDTO.description) && Intrinsics.d(this.iconButton, disposableBannerDTO.iconButton);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TextAtom getDescription() {
        return this.description;
    }

    public final ButtonV3Atom.SmallIconButton getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final String getImageURL() {
        return this.imageURL;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b(g.a(this.backgroundColor.hashCode() * 31, 31, this.imageURL), 31, this.title), 31, this.description);
        ButtonV3Atom.SmallIconButton smallIconButton = this.iconButton;
        return b11 + (smallIconButton == null ? 0 : smallIconButton.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.imageURL;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.description;
        ButtonV3Atom.SmallIconButton smallIconButton = this.iconButton;
        StringBuilder d11 = C3660k.d("DisposableBannerDTO(backgroundColor=", str, ", imageURL=", str2, ", title=");
        C4636t5.c(", description=", ", iconButton=", d11, textAtom, textAtom2);
        d11.append(smallIconButton);
        d11.append(")");
        return d11.toString();
    }
}
