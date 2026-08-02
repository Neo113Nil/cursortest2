package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation;

import B6.b;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Pk0.a;
import Ve.C4636t5;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "tips", "", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO;", "changePayment", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$ChangePaymentVO;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$ChangePaymentVO;)V", "getTitle", "()Ljava/lang/String;", "getTips", "()Ljava/util/List;", "getChangePayment", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$ChangePaymentVO;", "ChangePaymentVO", "BaseCourierTipVO", "CourierTipInput", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierReviewVO {
    private final ChangePaymentVO changePayment;
    private final List<BaseCourierTipVO> tips;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO;", "", "<init>", "()V", "CourierTipVariant", "CourierTipInputStub", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO$CourierTipInputStub;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO$CourierTipVariant;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class BaseCourierTipVO {

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO$CourierTipInputStub;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CourierTipInputStub extends BaseCourierTipVO {
            public CourierTipInputStub() {
                super(null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return CourierTipInputStub.class.equals(other != null ? other.getClass() : null);
            }

            public int hashCode() {
                return CourierTipInputStub.class.hashCode();
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO$CourierTipVariant;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO;", "", "text", "", "isSelected", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CourierTipVariant extends BaseCourierTipVO {
            private final AtomAction action;
            private final boolean isSelected;

            @NotNull
            private final String text;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CourierTipVariant(@NotNull String text, boolean z11, AtomAction atomAction) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.isSelected = z11;
                this.action = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CourierTipVariant)) {
                    return false;
                }
                CourierTipVariant courierTipVariant = (CourierTipVariant) other;
                return Intrinsics.d(this.text, courierTipVariant.text) && this.isSelected == courierTipVariant.isSelected && Intrinsics.d(this.action, courierTipVariant.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int a11 = C3532b.a(this.text.hashCode() * 31, 31, this.isSelected);
                AtomAction atomAction = this.action;
                return a11 + (atomAction == null ? 0 : atomAction.hashCode());
            }

            /* renamed from: isSelected, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                String str = this.text;
                boolean z11 = this.isSelected;
                return b.b(C4636t5.b("CourierTipVariant(text=", str, ", isSelected=", ", action=", z11), this.action, ")");
            }
        }

        public /* synthetic */ BaseCourierTipVO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BaseCourierTipVO() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$ChangePaymentVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "actionButton", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChangePaymentVO {
        private final ButtonV3Atom.SmallBorderlessButton actionButton;

        @NotNull
        private final String title;

        public ChangePaymentVO(@NotNull String title, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.actionButton = smallBorderlessButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangePaymentVO)) {
                return false;
            }
            ChangePaymentVO changePaymentVO = (ChangePaymentVO) other;
            return Intrinsics.d(this.title, changePaymentVO.title) && Intrinsics.d(this.actionButton, changePaymentVO.actionButton);
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
            return "ChangePaymentVO(title=" + this.title + ", actionButton=" + this.actionButton + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u000b\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$CourierTipInput;", "", "", "hint", "minValueError", "maxValueError", "Ljava/math/BigDecimal;", "minValue", "maxValue", "currentValue", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHint", "getMinValueError", "getMaxValueError", "Ljava/math/BigDecimal;", "getMinValue", "()Ljava/math/BigDecimal;", "getMaxValue", "getCurrentValue", "Z", "()Z", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CourierTipInput {
        private final String currentValue;

        @NotNull
        private final String hint;
        private final boolean isSelected;

        @NotNull
        private final BigDecimal maxValue;

        @NotNull
        private final String maxValueError;

        @NotNull
        private final BigDecimal minValue;

        @NotNull
        private final String minValueError;

        public CourierTipInput(@NotNull String hint, @NotNull String minValueError, @NotNull String maxValueError, @NotNull BigDecimal minValue, @NotNull BigDecimal maxValue, String str, boolean z11) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(minValueError, "minValueError");
            Intrinsics.checkNotNullParameter(maxValueError, "maxValueError");
            Intrinsics.checkNotNullParameter(minValue, "minValue");
            Intrinsics.checkNotNullParameter(maxValue, "maxValue");
            this.hint = hint;
            this.minValueError = minValueError;
            this.maxValueError = maxValueError;
            this.minValue = minValue;
            this.maxValue = maxValue;
            this.currentValue = str;
            this.isSelected = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CourierTipInput)) {
                return false;
            }
            CourierTipInput courierTipInput = (CourierTipInput) other;
            return Intrinsics.d(this.hint, courierTipInput.hint) && Intrinsics.d(this.minValueError, courierTipInput.minValueError) && Intrinsics.d(this.maxValueError, courierTipInput.maxValueError) && Intrinsics.d(this.minValue, courierTipInput.minValue) && Intrinsics.d(this.maxValue, courierTipInput.maxValue) && Intrinsics.d(this.currentValue, courierTipInput.currentValue) && this.isSelected == courierTipInput.isSelected;
        }

        public final String getCurrentValue() {
            return this.currentValue;
        }

        @NotNull
        public final String getHint() {
            return this.hint;
        }

        @NotNull
        public final BigDecimal getMaxValue() {
            return this.maxValue;
        }

        @NotNull
        public final String getMaxValueError() {
            return this.maxValueError;
        }

        @NotNull
        public final BigDecimal getMinValue() {
            return this.minValue;
        }

        @NotNull
        public final String getMinValueError() {
            return this.minValueError;
        }

        public int hashCode() {
            int hashCode = (this.maxValue.hashCode() + ((this.minValue.hashCode() + g.a(g.a(this.hint.hashCode() * 31, 31, this.minValueError), 31, this.maxValueError)) * 31)) * 31;
            String str = this.currentValue;
            return Boolean.hashCode(this.isSelected) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.hint;
            String str2 = this.minValueError;
            String str3 = this.maxValueError;
            BigDecimal bigDecimal = this.minValue;
            BigDecimal bigDecimal2 = this.maxValue;
            String str4 = this.currentValue;
            boolean z11 = this.isSelected;
            StringBuilder d11 = C3660k.d("CourierTipInput(hint=", str, ", minValueError=", str2, ", maxValueError=");
            d11.append(str3);
            d11.append(", minValue=");
            d11.append(bigDecimal);
            d11.append(", maxValue=");
            d11.append(bigDecimal2);
            d11.append(", currentValue=");
            d11.append(str4);
            d11.append(", isSelected=");
            return a.a(")", d11, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TipCourierReviewVO(@NotNull String title, List<? extends BaseCourierTipVO> list, ChangePaymentVO changePaymentVO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.tips = list;
        this.changePayment = changePaymentVO;
    }

    public final ChangePaymentVO getChangePayment() {
        return this.changePayment;
    }

    public final List<BaseCourierTipVO> getTips() {
        return this.tips;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
