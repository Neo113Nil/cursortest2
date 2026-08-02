package ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.data;

import B90.C2618u;
import B90.C2619v;
import C.o0;
import G.g;
import HY.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "selectButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "backgroundColor", "", "imageLink", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getSelectButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getBackgroundColor", "()Ljava/lang/String;", "getImageLink", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InsuranceUpgradeBannerDTO {
    public static final int $stable;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final TextAtom description;

    @NotNull
    private final String imageLink;

    @NotNull
    private final ButtonV3Atom.SmallButton selectButton;

    @NotNull
    private final TextAtom title;

    static {
        int i11 = ButtonV3Atom.SmallButton.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12;
    }

    public InsuranceUpgradeBannerDTO(@NotNull TextAtom title, @NotNull TextAtom description, @NotNull ButtonV3Atom.SmallButton selectButton, @NotNull String backgroundColor, @NotNull String imageLink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(selectButton, "selectButton");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(imageLink, "imageLink");
        this.title = title;
        this.description = description;
        this.selectButton = selectButton;
        this.backgroundColor = backgroundColor;
        this.imageLink = imageLink;
    }

    public static /* synthetic */ InsuranceUpgradeBannerDTO copy$default(InsuranceUpgradeBannerDTO insuranceUpgradeBannerDTO, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallButton smallButton, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = insuranceUpgradeBannerDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = insuranceUpgradeBannerDTO.description;
        }
        if ((i11 & 4) != 0) {
            smallButton = insuranceUpgradeBannerDTO.selectButton;
        }
        if ((i11 & 8) != 0) {
            str = insuranceUpgradeBannerDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            str2 = insuranceUpgradeBannerDTO.imageLink;
        }
        String str3 = str2;
        ButtonV3Atom.SmallButton smallButton2 = smallButton;
        return insuranceUpgradeBannerDTO.copy(textAtom, textAtom2, smallButton2, str, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallButton getSelectButton() {
        return this.selectButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getImageLink() {
        return this.imageLink;
    }

    @NotNull
    public final InsuranceUpgradeBannerDTO copy(@NotNull TextAtom title, @NotNull TextAtom description, @NotNull ButtonV3Atom.SmallButton selectButton, @NotNull String backgroundColor, @NotNull String imageLink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(selectButton, "selectButton");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(imageLink, "imageLink");
        return new InsuranceUpgradeBannerDTO(title, description, selectButton, backgroundColor, imageLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsuranceUpgradeBannerDTO)) {
            return false;
        }
        InsuranceUpgradeBannerDTO insuranceUpgradeBannerDTO = (InsuranceUpgradeBannerDTO) other;
        return Intrinsics.d(this.title, insuranceUpgradeBannerDTO.title) && Intrinsics.d(this.description, insuranceUpgradeBannerDTO.description) && Intrinsics.d(this.selectButton, insuranceUpgradeBannerDTO.selectButton) && Intrinsics.d(this.backgroundColor, insuranceUpgradeBannerDTO.backgroundColor) && Intrinsics.d(this.imageLink, insuranceUpgradeBannerDTO.imageLink);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TextAtom getDescription() {
        return this.description;
    }

    @NotNull
    public final String getImageLink() {
        return this.imageLink;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getSelectButton() {
        return this.selectButton;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.imageLink.hashCode() + g.a(C2618u.c(this.selectButton, C2619v.b(this.title.hashCode() * 31, 31, this.description), 31), 31, this.backgroundColor);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.description;
        ButtonV3Atom.SmallButton smallButton = this.selectButton;
        String str = this.backgroundColor;
        String str2 = this.imageLink;
        StringBuilder a11 = a.a("InsuranceUpgradeBannerDTO(title=", textAtom, ", description=", textAtom2, ", selectButton=");
        a11.append(smallButton);
        a11.append(", backgroundColor=");
        a11.append(str);
        a11.append(", imageLink=");
        return o0.c(a11, str2, ")");
    }
}
