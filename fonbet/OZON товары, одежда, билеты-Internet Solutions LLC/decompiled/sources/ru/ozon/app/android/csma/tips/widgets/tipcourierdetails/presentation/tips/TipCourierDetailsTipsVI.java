package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI;", "", "tips", "", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI;", "changePayment", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI$ChangePaymentVI;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI$ChangePaymentVI;)V", "getTips", "()Ljava/util/List;", "getChangePayment", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI$ChangePaymentVI;", "ChangePaymentVI", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierDetailsTipsVI {
    private final ChangePaymentVI changePayment;
    private final List<BaseCourierTipVI> tips;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI$ChangePaymentVI;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "actionButton", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChangePaymentVI {
        private final ButtonV3Atom.SmallBorderlessButton actionButton;

        @NotNull
        private final String title;

        public ChangePaymentVI(@NotNull String title, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.actionButton = smallBorderlessButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangePaymentVI)) {
                return false;
            }
            ChangePaymentVI changePaymentVI = (ChangePaymentVI) other;
            return Intrinsics.d(this.title, changePaymentVI.title) && Intrinsics.d(this.actionButton, changePaymentVI.actionButton);
        }

        public final ButtonV3Atom.SmallBorderlessButton getActionButton() {
            return this.actionButton;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.actionButton;
            return hashCode + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode());
        }

        @NotNull
        public String toString() {
            return "ChangePaymentVI(title=" + this.title + ", actionButton=" + this.actionButton + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TipCourierDetailsTipsVI(List<? extends BaseCourierTipVI> list, ChangePaymentVI changePaymentVI) {
        this.tips = list;
        this.changePayment = changePaymentVI;
    }

    public final ChangePaymentVI getChangePayment() {
        return this.changePayment;
    }

    public final List<BaseCourierTipVI> getTips() {
        return this.tips;
    }
}
