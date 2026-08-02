package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.header;

import Bl.b;
import G.g;
import Kk.C3532b;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b)\u0010\u0011¨\u0006*"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/header/DeliveryReviewFormHeaderVO;", "Ll20/c;", "", "id", "", "disabled", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "showRating", "", "selectedRating", "Lru/ozon/uni/atoms/af/AtomAction;", "changeRatingAction", "ratingTitle", "<init>", "(JZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getDisabled", "()Z", "Ljava/lang/String;", "getTitle", "Ljava/lang/Boolean;", "getShowRating", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getSelectedRating", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/af/AtomAction;", "getChangeRatingAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getRatingTitle", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryReviewFormHeaderVO implements c {
    private final AtomAction changeRatingAction;
    private final boolean disabled;
    private final long id;
    private final String ratingTitle;
    private final Integer selectedRating;
    private final Boolean showRating;

    @NotNull
    private final String title;

    public DeliveryReviewFormHeaderVO(long j11, boolean z11, @NotNull String title, Boolean bool, Integer num, AtomAction atomAction, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.disabled = z11;
        this.title = title;
        this.showRating = bool;
        this.selectedRating = num;
        this.changeRatingAction = atomAction;
        this.ratingTitle = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryReviewFormHeaderVO)) {
            return false;
        }
        DeliveryReviewFormHeaderVO deliveryReviewFormHeaderVO = (DeliveryReviewFormHeaderVO) other;
        return this.id == deliveryReviewFormHeaderVO.id && this.disabled == deliveryReviewFormHeaderVO.disabled && Intrinsics.d(this.title, deliveryReviewFormHeaderVO.title) && Intrinsics.d(this.showRating, deliveryReviewFormHeaderVO.showRating) && Intrinsics.d(this.selectedRating, deliveryReviewFormHeaderVO.selectedRating) && Intrinsics.d(this.changeRatingAction, deliveryReviewFormHeaderVO.changeRatingAction) && Intrinsics.d(this.ratingTitle, deliveryReviewFormHeaderVO.ratingTitle);
    }

    public final AtomAction getChangeRatingAction() {
        return this.changeRatingAction;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getRatingTitle() {
        return this.ratingTitle;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getSelectedRating() {
        return this.selectedRating;
    }

    public final Boolean getShowRating() {
        return this.showRating;
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
        int a11 = g.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.disabled), 31, this.title);
        Boolean bool = this.showRating;
        int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.selectedRating;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        AtomAction atomAction = this.changeRatingAction;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str = this.ratingTitle;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.disabled;
        String str = this.title;
        Boolean bool = this.showRating;
        Integer num = this.selectedRating;
        AtomAction atomAction = this.changeRatingAction;
        String str2 = this.ratingTitle;
        StringBuilder c11 = b.c(j11, "DeliveryReviewFormHeaderVO(id=", ", disabled=", z11);
        c11.append(", title=");
        c11.append(str);
        c11.append(", showRating=");
        c11.append(bool);
        c11.append(", selectedRating=");
        c11.append(num);
        c11.append(", changeRatingAction=");
        c11.append(atomAction);
        return C6594f.a(", ratingTitle=", str2, ")", c11);
    }
}
