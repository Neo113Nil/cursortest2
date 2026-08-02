package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button;

import com.squareup.moshi.j;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.data.TipCourierDetailsDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;", "", "tips", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/data/TipCourierDetailsDTO$TipsDetails;", "actionButton", "Lru/ozon/uni/atoms/data/AtomDTO;", "currentTips", "Ljava/math/BigDecimal;", "<init>", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/data/TipCourierDetailsDTO$TipsDetails;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/math/BigDecimal;)V", "getTips", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/data/TipCourierDetailsDTO$TipsDetails;", "getActionButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getCurrentTips", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TipCourierDetailInitState {

    @NotNull
    private final AtomDTO actionButton;
    private final BigDecimal currentTips;
    private final TipCourierDetailsDTO.TipsDetails tips;

    public TipCourierDetailInitState(TipCourierDetailsDTO.TipsDetails tipsDetails, @NotNull AtomDTO actionButton, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.tips = tipsDetails;
        this.actionButton = actionButton;
        this.currentTips = bigDecimal;
    }

    public static /* synthetic */ TipCourierDetailInitState copy$default(TipCourierDetailInitState tipCourierDetailInitState, TipCourierDetailsDTO.TipsDetails tipsDetails, AtomDTO atomDTO, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tipsDetails = tipCourierDetailInitState.tips;
        }
        if ((i11 & 2) != 0) {
            atomDTO = tipCourierDetailInitState.actionButton;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = tipCourierDetailInitState.currentTips;
        }
        return tipCourierDetailInitState.copy(tipsDetails, atomDTO, bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final TipCourierDetailsDTO.TipsDetails getTips() {
        return this.tips;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomDTO getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getCurrentTips() {
        return this.currentTips;
    }

    @NotNull
    public final TipCourierDetailInitState copy(TipCourierDetailsDTO.TipsDetails tips, @NotNull AtomDTO actionButton, BigDecimal currentTips) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        return new TipCourierDetailInitState(tips, actionButton, currentTips);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipCourierDetailInitState)) {
            return false;
        }
        TipCourierDetailInitState tipCourierDetailInitState = (TipCourierDetailInitState) other;
        return Intrinsics.d(this.tips, tipCourierDetailInitState.tips) && Intrinsics.d(this.actionButton, tipCourierDetailInitState.actionButton) && Intrinsics.d(this.currentTips, tipCourierDetailInitState.currentTips);
    }

    @NotNull
    public final AtomDTO getActionButton() {
        return this.actionButton;
    }

    public final BigDecimal getCurrentTips() {
        return this.currentTips;
    }

    public final TipCourierDetailsDTO.TipsDetails getTips() {
        return this.tips;
    }

    public int hashCode() {
        TipCourierDetailsDTO.TipsDetails tipsDetails = this.tips;
        int hashCode = (this.actionButton.hashCode() + ((tipsDetails == null ? 0 : tipsDetails.hashCode()) * 31)) * 31;
        BigDecimal bigDecimal = this.currentTips;
        return hashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TipCourierDetailInitState(tips=" + this.tips + ", actionButton=" + this.actionButton + ", currentTips=" + this.currentTips + ")";
    }
}
