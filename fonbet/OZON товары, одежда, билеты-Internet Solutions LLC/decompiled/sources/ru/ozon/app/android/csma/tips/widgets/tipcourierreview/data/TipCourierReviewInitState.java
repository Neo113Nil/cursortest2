package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ@\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;", "", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;", "tips", "Lru/ozon/uni/atoms/data/AtomDTO;", "actionButton", "cancelButton", "Ljava/math/BigDecimal;", "currentTips", "<init>", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/math/BigDecimal;)V", "copy", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/math/BigDecimal;)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;", "getTips", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getActionButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getCancelButton", "Ljava/math/BigDecimal;", "getCurrentTips", "()Ljava/math/BigDecimal;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TipCourierReviewInitState {
    private final AtomDTO actionButton;
    private final AtomDTO cancelButton;
    private final BigDecimal currentTips;
    private final TipCourierReviewDTO.TipsReview tips;

    public TipCourierReviewInitState(TipCourierReviewDTO.TipsReview tipsReview, AtomDTO atomDTO, AtomDTO atomDTO2, BigDecimal bigDecimal) {
        this.tips = tipsReview;
        this.actionButton = atomDTO;
        this.cancelButton = atomDTO2;
        this.currentTips = bigDecimal;
    }

    public static /* synthetic */ TipCourierReviewInitState copy$default(TipCourierReviewInitState tipCourierReviewInitState, TipCourierReviewDTO.TipsReview tipsReview, AtomDTO atomDTO, AtomDTO atomDTO2, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tipsReview = tipCourierReviewInitState.tips;
        }
        if ((i11 & 2) != 0) {
            atomDTO = tipCourierReviewInitState.actionButton;
        }
        if ((i11 & 4) != 0) {
            atomDTO2 = tipCourierReviewInitState.cancelButton;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = tipCourierReviewInitState.currentTips;
        }
        return tipCourierReviewInitState.copy(tipsReview, atomDTO, atomDTO2, bigDecimal);
    }

    @NotNull
    public final TipCourierReviewInitState copy(TipCourierReviewDTO.TipsReview tips, AtomDTO actionButton, AtomDTO cancelButton, BigDecimal currentTips) {
        return new TipCourierReviewInitState(tips, actionButton, cancelButton, currentTips);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipCourierReviewInitState)) {
            return false;
        }
        TipCourierReviewInitState tipCourierReviewInitState = (TipCourierReviewInitState) other;
        return Intrinsics.d(this.tips, tipCourierReviewInitState.tips) && Intrinsics.d(this.actionButton, tipCourierReviewInitState.actionButton) && Intrinsics.d(this.cancelButton, tipCourierReviewInitState.cancelButton) && Intrinsics.d(this.currentTips, tipCourierReviewInitState.currentTips);
    }

    public final AtomDTO getActionButton() {
        return this.actionButton;
    }

    public final AtomDTO getCancelButton() {
        return this.cancelButton;
    }

    public final BigDecimal getCurrentTips() {
        return this.currentTips;
    }

    public final TipCourierReviewDTO.TipsReview getTips() {
        return this.tips;
    }

    public int hashCode() {
        TipCourierReviewDTO.TipsReview tipsReview = this.tips;
        int hashCode = (tipsReview == null ? 0 : tipsReview.hashCode()) * 31;
        AtomDTO atomDTO = this.actionButton;
        int hashCode2 = (hashCode + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        AtomDTO atomDTO2 = this.cancelButton;
        int hashCode3 = (hashCode2 + (atomDTO2 == null ? 0 : atomDTO2.hashCode())) * 31;
        BigDecimal bigDecimal = this.currentTips;
        return hashCode3 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TipCourierReviewInitState(tips=" + this.tips + ", actionButton=" + this.actionButton + ", cancelButton=" + this.cancelButton + ", currentTips=" + this.currentTips + ")";
    }
}
