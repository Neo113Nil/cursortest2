package ru.ozon.app.android.common.productselectormobile.data;

import Ak.C2436a;
import B90.C2618u;
import G.g;
import Nh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "image", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "actionButton", "resetButton", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "tagsTitle", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "tags", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "getImage", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getResetButton", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTagsTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "product-selector-mobile_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductSelectorMobileVO implements c {

    @NotNull
    private final ButtonV3Atom.SmallButton actionButton;
    private final long id;
    private final String image;
    private final ButtonV3Atom.SmallButton resetButton;
    private final String subtitle;
    private final List<AtomDTO> tags;
    private final OzonSpannableString tagsTitle;

    @NotNull
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductSelectorMobileVO(long j11, @NotNull String title, String str, String str2, @NotNull ButtonV3Atom.SmallButton actionButton, ButtonV3Atom.SmallButton smallButton, OzonSpannableString ozonSpannableString, List<? extends AtomDTO> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.id = j11;
        this.title = title;
        this.subtitle = str;
        this.image = str2;
        this.actionButton = actionButton;
        this.resetButton = smallButton;
        this.tagsTitle = ozonSpannableString;
        this.tags = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSelectorMobileVO)) {
            return false;
        }
        ProductSelectorMobileVO productSelectorMobileVO = (ProductSelectorMobileVO) other;
        return this.id == productSelectorMobileVO.id && Intrinsics.d(this.title, productSelectorMobileVO.title) && Intrinsics.d(this.subtitle, productSelectorMobileVO.subtitle) && Intrinsics.d(this.image, productSelectorMobileVO.image) && Intrinsics.d(this.actionButton, productSelectorMobileVO.actionButton) && Intrinsics.d(this.resetButton, productSelectorMobileVO.resetButton) && Intrinsics.d(this.tagsTitle, productSelectorMobileVO.tagsTitle) && Intrinsics.d(this.tags, productSelectorMobileVO.tags);
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getActionButton() {
        return this.actionButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final ButtonV3Atom.SmallButton getResetButton() {
        return this.resetButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<AtomDTO> getTags() {
        return this.tags;
    }

    public final OzonSpannableString getTagsTitle() {
        return this.tagsTitle;
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
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int c11 = C2618u.c(this.actionButton, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ButtonV3Atom.SmallButton smallButton = this.resetButton;
        int hashCode2 = (c11 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        OzonSpannableString ozonSpannableString = this.tagsTitle;
        int hashCode3 = (hashCode2 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        List<AtomDTO> list = this.tags;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.image;
        ButtonV3Atom.SmallButton smallButton = this.actionButton;
        ButtonV3Atom.SmallButton smallButton2 = this.resetButton;
        OzonSpannableString ozonSpannableString = this.tagsTitle;
        List<AtomDTO> list = this.tags;
        StringBuilder c11 = C2436a.c(j11, "ProductSelectorMobileVO(id=", ", title=", str);
        a.h(c11, ", subtitle=", str2, ", image=", str3);
        c11.append(", actionButton=");
        c11.append(smallButton);
        c11.append(", resetButton=");
        c11.append(smallButton2);
        c11.append(", tagsTitle=");
        c11.append((Object) ozonSpannableString);
        c11.append(", tags=");
        c11.append(list);
        c11.append(")");
        return c11.toString();
    }
}
