package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

import Ak.C2436a;
import B0.C2454a;
import E0.C2942q;
import G.g;
import Kk.C3532b;
import Tl.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004B\u007f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b(\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u00103\u001a\u0004\b8\u0010\u001eR\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b9\u00102R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b:\u00102R\u001a\u0010;\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b<\u0010\u001c¨\u0006="}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/o;", "", "id", "", "reviewUuid", "productId", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/AtomDTO;", "leftAtoms", "rightAtoms", "", "separator", "", "leftMargin", "Lru/ozon/uni/atoms/af/AtomAction;", "rateUsefulnessAction", "bottomPadding", "hasGalleryPadding", "hasEmptyReviewPadding", "<init>", "(JLjava/lang/String;JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;ZILru/ozon/uni/atoms/af/AtomAction;IZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getReviewUuid", "getProductId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getLeftAtoms", "()Ljava/util/List;", "getRightAtoms", "Z", "getSeparator", "()Z", "I", "getLeftMargin", "Lru/ozon/uni/atoms/af/AtomAction;", "getRateUsefulnessAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getBottomPadding", "getHasGalleryPadding", "getHasEmptyReviewPadding", "widgetName", "getWidgetName", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ButtonsVO implements c, InterfaceC8039a, o {
    private final int bottomPadding;
    private final boolean hasEmptyReviewPadding;
    private final boolean hasGalleryPadding;
    private final long id;
    private final List<AtomDTO> leftAtoms;
    private final int leftMargin;
    private final long productId;
    private final AtomAction rateUsefulnessAction;

    @NotNull
    private final String reviewUuid;
    private final List<AtomDTO> rightAtoms;
    private final boolean separator;
    private final TextDTO title;

    @NotNull
    private final String widgetName;

    public ButtonsVO(long j11, @NotNull String reviewUuid, long j12, TextDTO textDTO, List<AtomDTO> list, List<AtomDTO> list2, boolean z11, int i11, AtomAction atomAction, int i12, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        this.id = j11;
        this.reviewUuid = reviewUuid;
        this.productId = j12;
        this.title = textDTO;
        this.leftAtoms = list;
        this.rightAtoms = list2;
        this.separator = z11;
        this.leftMargin = i11;
        this.rateUsefulnessAction = atomAction;
        this.bottomPadding = i12;
        this.hasGalleryPadding = z12;
        this.hasEmptyReviewPadding = z13;
        this.widgetName = "review";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsVO)) {
            return false;
        }
        ButtonsVO buttonsVO = (ButtonsVO) other;
        return this.id == buttonsVO.id && Intrinsics.d(this.reviewUuid, buttonsVO.reviewUuid) && this.productId == buttonsVO.productId && Intrinsics.d(this.title, buttonsVO.title) && Intrinsics.d(this.leftAtoms, buttonsVO.leftAtoms) && Intrinsics.d(this.rightAtoms, buttonsVO.rightAtoms) && this.separator == buttonsVO.separator && this.leftMargin == buttonsVO.leftMargin && Intrinsics.d(this.rateUsefulnessAction, buttonsVO.rateUsefulnessAction) && this.bottomPadding == buttonsVO.bottomPadding && this.hasGalleryPadding == buttonsVO.hasGalleryPadding && this.hasEmptyReviewPadding == buttonsVO.hasEmptyReviewPadding;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final boolean getHasEmptyReviewPadding() {
        return this.hasEmptyReviewPadding;
    }

    public final boolean getHasGalleryPadding() {
        return this.hasGalleryPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<AtomDTO> getLeftAtoms() {
        return this.leftAtoms;
    }

    public final int getLeftMargin() {
        return this.leftMargin;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final AtomAction getRateUsefulnessAction() {
        return this.rateUsefulnessAction;
    }

    @NotNull
    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    public final List<AtomDTO> getRightAtoms() {
        return this.rightAtoms;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getSeparator() {
        return this.separator;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int a11 = Pk0.c.a(g.a(Long.hashCode(this.id) * 31, 31, this.reviewUuid), 31, this.productId);
        TextDTO textDTO = this.title;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<AtomDTO> list = this.leftAtoms;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AtomDTO> list2 = this.rightAtoms;
        int a12 = C2454a.a(this.leftMargin, C3532b.a((hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.separator), 31);
        AtomAction atomAction = this.rateUsefulnessAction;
        return Boolean.hashCode(this.hasEmptyReviewPadding) + C3532b.a(C2454a.a(this.bottomPadding, (a12 + (atomAction != null ? atomAction.hashCode() : 0)) * 31, 31), 31, this.hasGalleryPadding);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.reviewUuid;
        long j12 = this.productId;
        TextDTO textDTO = this.title;
        List<AtomDTO> list = this.leftAtoms;
        List<AtomDTO> list2 = this.rightAtoms;
        boolean z11 = this.separator;
        int i11 = this.leftMargin;
        AtomAction atomAction = this.rateUsefulnessAction;
        int i12 = this.bottomPadding;
        boolean z12 = this.hasGalleryPadding;
        boolean z13 = this.hasEmptyReviewPadding;
        StringBuilder c11 = C2436a.c(j11, "ButtonsVO(id=", ", reviewUuid=", str);
        C2942q.f(c11, ", productId=", j12, ", title=");
        a.e(c11, textDTO, ", leftAtoms=", list, ", rightAtoms=");
        c11.append(list2);
        c11.append(", separator=");
        c11.append(z11);
        c11.append(", leftMargin=");
        c11.append(i11);
        c11.append(", rateUsefulnessAction=");
        c11.append(atomAction);
        c11.append(", bottomPadding=");
        Ql.c.d(c11, i12, ", hasGalleryPadding=", z12, ", hasEmptyReviewPadding=");
        return Pk0.a.a(")", c11, z13);
    }
}
