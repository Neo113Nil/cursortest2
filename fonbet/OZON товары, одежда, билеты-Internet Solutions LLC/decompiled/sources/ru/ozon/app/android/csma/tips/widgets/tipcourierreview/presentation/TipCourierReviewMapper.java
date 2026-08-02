package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation;

import Hj.C3143a;
import android.net.Uri;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.core.ChangePayment;
import ru.ozon.app.android.csma.tips.core.TipItem;
import ru.ozon.app.android.csma.tips.core.TipsInput;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewDTO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewInitState;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewVO;
import ru.ozon.app.android.utils.PriceUtilsKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0006\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\u0006\u0010\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0006\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0006\u0010\u0011J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b \u0010!J!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010$J\u001f\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewMapper;", "", "<init>", "()V", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO;", "toVO", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO;", "Lru/ozon/app/android/csma/tips/core/TipItem;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO;", "(Lru/ozon/app/android/csma/tips/core/TipItem;)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$BaseCourierTipVO;", "Lru/ozon/app/android/csma/tips/core/TipsInput;", "", "getError", "(Lru/ozon/app/android/csma/tips/core/TipsInput;)Ljava/lang/String;", "Lru/ozon/app/android/csma/tips/core/ChangePayment;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$ChangePaymentVO;", "(Lru/ozon/app/android/csma/tips/core/ChangePayment;)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$ChangePaymentVO;", "tipsAmount", "Ljava/math/BigDecimal;", "getPriceFromString", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;", "state", "stateToTips", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "stateToActionButton", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;)Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$CourierTipInput;", "stateToTipInput", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewInitState;)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$CourierTipInput;", "toFormattedPrice", "(Ljava/lang/String;)Ljava/lang/String;", "input", "currentTipsString", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO$CourierTipInput;Ljava/lang/String;)Ljava/lang/String;", "link", "generateLink", "(Ljava/lang/String;Lru/ozon/app/android/csma/tips/core/TipsInput;)Ljava/lang/String;", "Companion", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierReviewMapper {
    private final BigDecimal getPriceFromString(String tipsAmount) {
        String g10;
        if (tipsAmount == null || (g10 = C3143a.g("[^\\d.]", tipsAmount, "")) == null || h.K(g10)) {
            return null;
        }
        return new BigDecimal(g10);
    }

    private final TipCourierReviewVO toVO(TipCourierReviewDTO.TipsReview tipsReview) {
        List<TipItem> tipsVariants = tipsReview.getTipsVariants();
        ArrayList arrayList = new ArrayList(C7714v.z(tipsVariants, 10));
        Iterator<T> it = tipsVariants.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((TipItem) it.next()));
        }
        ArrayList W02 = C7714v.W0(arrayList);
        if (tipsReview.getTipsInput() != null) {
            W02.add(new TipCourierReviewVO.BaseCourierTipVO.CourierTipInputStub());
        }
        String title = tipsReview.getTitle();
        ChangePayment changePayment = tipsReview.getChangePayment();
        return new TipCourierReviewVO(title, W02, changePayment != null ? toVO(changePayment) : null);
    }

    @NotNull
    public final String generateLink(@NotNull String link, TipsInput input) {
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter(link, "link");
        if (input == null || (bigDecimal = input.getCurrentValue()) == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        Uri.Builder buildUpon = Uri.parse(link).buildUpon();
        if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            buildUpon = buildUpon.appendQueryParameter("currentValue", bigDecimal.toString());
        }
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return builder;
    }

    public final String getError(@NotNull TipCourierReviewVO.CourierTipInput input, String currentTipsString) {
        BigDecimal priceFromString;
        Intrinsics.checkNotNullParameter(input, "input");
        if (currentTipsString == null || (priceFromString = getPriceFromString(currentTipsString)) == null) {
            return null;
        }
        if (priceFromString.compareTo(input.getMinValue()) < 0) {
            return input.getMinValueError();
        }
        if (priceFromString.compareTo(input.getMaxValue()) > 0) {
            return input.getMaxValueError();
        }
        return null;
    }

    public final AtomDTO stateToActionButton(@NotNull TipCourierReviewInitState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        AtomDTO cancelButton = state.getCancelButton();
        AtomDTO actionButton = state.getActionButton();
        TipCourierReviewDTO.TipsReview tips = state.getTips();
        if (tips != null) {
            TipsInput tipsInput = tips.getTipsInput();
            boolean isSelected = tipsInput != null ? tipsInput.isSelected() : false;
            TipsInput tipsInput2 = tips.getTipsInput();
            Object obj = null;
            boolean z11 = (tipsInput2 != null ? getError(tipsInput2) : null) == null;
            TipsInput tipsInput3 = tips.getTipsInput();
            boolean z12 = (tipsInput3 != null ? tipsInput3.getCurrentValue() : null) != null;
            Iterator<T> it = tips.getTipsVariants().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((TipItem) next).isSelected()) {
                    obj = next;
                    break;
                }
            }
            if (obj != null) {
                return actionButton;
            }
            if (z12 && isSelected && z11) {
                return actionButton;
            }
            if (isSelected && !z12 && !z11) {
                if (actionButton instanceof ButtonV3Atom.LargeButton) {
                    return ButtonV3Atom.LargeButton.copy$default((ButtonV3Atom.LargeButton) actionButton, null, null, null, null, null, null, null, null, null, 479, null);
                }
                if (actionButton instanceof ButtonV3Atom.PaymentButtonLarge) {
                    return ButtonV3Atom.PaymentButtonLarge.copy$default((ButtonV3Atom.PaymentButtonLarge) actionButton, null, null, null, null, null, null, null, 123, null);
                }
            }
        }
        return cancelButton;
    }

    public final TipCourierReviewVO.CourierTipInput stateToTipInput(@NotNull TipCourierReviewInitState state) {
        TipsInput tipsInput;
        Intrinsics.checkNotNullParameter(state, "state");
        TipCourierReviewDTO.TipsReview tips = state.getTips();
        if (tips == null || (tipsInput = tips.getTipsInput()) == null) {
            return null;
        }
        String hint = tipsInput.getHint();
        boolean isSelected = tipsInput.isSelected();
        BigDecimal currentValue = tipsInput.getCurrentValue();
        return new TipCourierReviewVO.CourierTipInput(hint, tipsInput.getMinValueError(), tipsInput.getMaxValueError(), tipsInput.getMinValue(), tipsInput.getMaxValue(), currentValue != null ? PriceUtilsKt.toFormattedPrice(currentValue) : null, isSelected);
    }

    public final TipCourierReviewVO stateToTips(@NotNull TipCourierReviewInitState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TipCourierReviewDTO.TipsReview tips = state.getTips();
        if (tips != null) {
            return toVO(tips);
        }
        return null;
    }

    @NotNull
    public final String toFormattedPrice(@NotNull String tipsAmount) {
        Intrinsics.checkNotNullParameter(tipsAmount, "tipsAmount");
        String replace = new Regex("[^\\d.]").replace(tipsAmount, "");
        return h.K(replace) ? replace : PriceUtilsKt.toFormattedPrice(new BigDecimal(replace));
    }

    private final String getError(TipsInput tipsInput) {
        if (tipsInput.getCurrentValue() == null) {
            return null;
        }
        if (tipsInput.getCurrentValue().compareTo(tipsInput.getMinValue()) < 0) {
            return tipsInput.getMinValueError();
        }
        if (tipsInput.getCurrentValue().compareTo(tipsInput.getMaxValue()) > 0) {
            return tipsInput.getMaxValueError();
        }
        return null;
    }

    private final TipCourierReviewVO.BaseCourierTipVO toVO(TipItem tipItem) {
        String text = tipItem.getText();
        boolean isSelected = tipItem.isSelected();
        AtomActionDTO action = tipItem.getAction();
        return new TipCourierReviewVO.BaseCourierTipVO.CourierTipVariant(text, isSelected, action != null ? AtomActionMapperKt.toAtomAction(action, tipItem.getTrackingInfo()) : null);
    }

    private final TipCourierReviewVO.ChangePaymentVO toVO(ChangePayment changePayment) {
        return new TipCourierReviewVO.ChangePaymentVO(changePayment.getTitle(), changePayment.getActionButton());
    }
}
