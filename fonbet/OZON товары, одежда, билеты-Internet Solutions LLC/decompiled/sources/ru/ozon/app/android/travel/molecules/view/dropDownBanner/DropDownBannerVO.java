package ru.ozon.app.android.travel.molecules.view.dropDownBanner;

import B90.C2619v;
import K1.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJP\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerVO;", "", "", "isIconVisible", "", "icon", "", "iconTint", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "hiddenText", "isExpanded", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Z)V", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Z)Lru/ozon/app/android/travel/molecules/view/dropDownBanner/DropDownBannerVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getIcon", "Ljava/lang/Integer;", "getIconTint", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHiddenText", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DropDownBannerVO {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final TextAtom hiddenText;
    private final String icon;
    private final Integer iconTint;
    private final boolean isExpanded;
    private final boolean isIconVisible;

    @NotNull
    private final TextAtom title;

    public DropDownBannerVO(boolean z11, String str, Integer num, @NotNull TextAtom title, @NotNull TextAtom hiddenText, boolean z12) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hiddenText, "hiddenText");
        this.isIconVisible = z11;
        this.icon = str;
        this.iconTint = num;
        this.title = title;
        this.hiddenText = hiddenText;
        this.isExpanded = z12;
    }

    public static /* synthetic */ DropDownBannerVO copy$default(DropDownBannerVO dropDownBannerVO, boolean z11, String str, Integer num, TextAtom textAtom, TextAtom textAtom2, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = dropDownBannerVO.isIconVisible;
        }
        if ((i11 & 2) != 0) {
            str = dropDownBannerVO.icon;
        }
        if ((i11 & 4) != 0) {
            num = dropDownBannerVO.iconTint;
        }
        if ((i11 & 8) != 0) {
            textAtom = dropDownBannerVO.title;
        }
        if ((i11 & 16) != 0) {
            textAtom2 = dropDownBannerVO.hiddenText;
        }
        if ((i11 & 32) != 0) {
            z12 = dropDownBannerVO.isExpanded;
        }
        TextAtom textAtom3 = textAtom2;
        boolean z13 = z12;
        return dropDownBannerVO.copy(z11, str, num, textAtom, textAtom3, z13);
    }

    @NotNull
    public final DropDownBannerVO copy(boolean isIconVisible, String icon, Integer iconTint, @NotNull TextAtom title, @NotNull TextAtom hiddenText, boolean isExpanded) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hiddenText, "hiddenText");
        return new DropDownBannerVO(isIconVisible, icon, iconTint, title, hiddenText, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropDownBannerVO)) {
            return false;
        }
        DropDownBannerVO dropDownBannerVO = (DropDownBannerVO) other;
        return this.isIconVisible == dropDownBannerVO.isIconVisible && Intrinsics.d(this.icon, dropDownBannerVO.icon) && Intrinsics.d(this.iconTint, dropDownBannerVO.iconTint) && Intrinsics.d(this.title, dropDownBannerVO.title) && Intrinsics.d(this.hiddenText, dropDownBannerVO.hiddenText) && this.isExpanded == dropDownBannerVO.isExpanded;
    }

    @NotNull
    public final TextAtom getHiddenText() {
        return this.hiddenText;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final Integer getIconTint() {
        return this.iconTint;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isIconVisible) * 31;
        String str = this.icon;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.iconTint;
        return Boolean.hashCode(this.isExpanded) + C2619v.b(C2619v.b((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.title), 31, this.hiddenText);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: isIconVisible, reason: from getter */
    public final boolean getIsIconVisible() {
        return this.isIconVisible;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isIconVisible;
        String str = this.icon;
        Integer num = this.iconTint;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.hiddenText;
        boolean z12 = this.isExpanded;
        StringBuilder d11 = G.d("DropDownBannerVO(isIconVisible=", ", icon=", str, ", iconTint=", z11);
        d11.append(num);
        d11.append(", title=");
        d11.append(textAtom);
        d11.append(", hiddenText=");
        d11.append(textAtom2);
        d11.append(", isExpanded=");
        d11.append(z12);
        d11.append(")");
        return d11.toString();
    }
}
