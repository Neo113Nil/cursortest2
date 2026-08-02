package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips;

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
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.data.TipCourierDetailsDTO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button.TipCourierDetailInitState;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.BaseCourierTipVI;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsTipsVI;
import ru.ozon.app.android.utils.PriceUtilsKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0006\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\u0006\u0010\nJ\u0013\u0010\u0006\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0006\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0006\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0006\u0010\u0018J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010&J\u001f\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;", "", "<init>", "()V", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/data/TipCourierDetailsDTO$TipsDetails;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI;", "toVO", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/data/TipCourierDetailsDTO$TipsDetails;)Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI;", "Lru/ozon/app/android/csma/tips/core/TipItem;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI;", "(Lru/ozon/app/android/csma/tips/core/TipItem;)Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/BaseCourierTipVI;", "Lru/ozon/app/android/csma/tips/core/TipsInput;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/CourierTipInput;", "(Lru/ozon/app/android/csma/tips/core/TipsInput;)Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/CourierTipInput;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;", "state", "", "isInputAvailable", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;)Z", "", "getError", "(Lru/ozon/app/android/csma/tips/core/TipsInput;)Ljava/lang/String;", "Lru/ozon/app/android/csma/tips/core/ChangePayment;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI$ChangePaymentVI;", "(Lru/ozon/app/android/csma/tips/core/ChangePayment;)Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI$ChangePaymentVI;", "tipsAmount", "Ljava/math/BigDecimal;", "getPriceFromString", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "stateToTips", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;)Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI;", "Lru/ozon/uni/atoms/data/AtomDTO;", "stateToActionButton", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;)Lru/ozon/uni/atoms/data/AtomDTO;", "toFormattedPrice", "(Ljava/lang/String;)Ljava/lang/String;", "input", "currentTipsString", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/CourierTipInput;Ljava/lang/String;)Ljava/lang/String;", "link", "generateLink", "(Ljava/lang/String;Lru/ozon/app/android/csma/tips/core/TipsInput;)Ljava/lang/String;", "stateToCourierTipInput", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/button/TipCourierDetailInitState;)Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/CourierTipInput;", "Companion", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierDetailsMapper {
    private final BigDecimal getPriceFromString(String tipsAmount) {
        String g10;
        if (tipsAmount == null || (g10 = C3143a.g("[^\\d.]", tipsAmount, "")) == null || h.K(g10)) {
            return null;
        }
        return new BigDecimal(g10);
    }

    private final boolean isInputAvailable(TipCourierDetailInitState state) {
        List<TipItem> tipsVariants;
        TipsInput tipsInput;
        TipsInput tipsInput2;
        TipsInput tipsInput3;
        TipCourierDetailsDTO.TipsDetails tips = state.getTips();
        boolean isSelected = (tips == null || (tipsInput3 = tips.getTipsInput()) == null) ? false : tipsInput3.isSelected();
        TipCourierDetailsDTO.TipsDetails tips2 = state.getTips();
        Object obj = null;
        boolean z11 = ((tips2 == null || (tipsInput2 = tips2.getTipsInput()) == null) ? null : getError(tipsInput2)) == null;
        TipCourierDetailsDTO.TipsDetails tips3 = state.getTips();
        boolean z12 = ((tips3 == null || (tipsInput = tips3.getTipsInput()) == null) ? null : tipsInput.getCurrentValue()) != null;
        TipCourierDetailsDTO.TipsDetails tips4 = state.getTips();
        if (tips4 != null && (tipsVariants = tips4.getTipsVariants()) != null) {
            Iterator<T> it = tipsVariants.iterator();
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
            obj = (TipItem) obj;
        }
        return obj != null || (z12 && isSelected && z11);
    }

    private final TipCourierDetailsTipsVI toVO(TipCourierDetailsDTO.TipsDetails tipsDetails) {
        List<TipItem> tipsVariants = tipsDetails.getTipsVariants();
        ArrayList arrayList = new ArrayList(C7714v.z(tipsVariants, 10));
        Iterator<T> it = tipsVariants.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((TipItem) it.next()));
        }
        ArrayList W02 = C7714v.W0(arrayList);
        if (tipsDetails.getTipsInput() != null) {
            W02.add(new BaseCourierTipVI.CourierTipInputStub());
        }
        ChangePayment changePayment = tipsDetails.getChangePayment();
        return new TipCourierDetailsTipsVI(W02, changePayment != null ? toVO(changePayment) : null);
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

    public final String getError(@NotNull CourierTipInput input, String currentTipsString) {
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

    @NotNull
    public final AtomDTO stateToActionButton(@NotNull TipCourierDetailInitState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TipCourierDetailsDTO.TipsDetails tips = state.getTips();
        AtomDTO actionButton = state.getActionButton();
        if (tips != null && !isInputAvailable(state)) {
            if (actionButton instanceof ButtonV3Atom.LargeButton) {
                return ButtonV3Atom.LargeButton.copy$default((ButtonV3Atom.LargeButton) actionButton, null, null, null, null, null, null, null, null, null, 479, null);
            }
            if (actionButton instanceof ButtonV3Atom.PaymentButtonLarge) {
                ButtonV3Atom.PaymentButtonLarge paymentButtonLarge = (ButtonV3Atom.PaymentButtonLarge) actionButton;
                return ButtonV3Atom.PaymentButtonLarge.copy$default(paymentButtonLarge, isInputAvailable(state) ? paymentButtonLarge.getTheme() : ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle.STYLE_TYPE_ONLINE, null, null, null, null, null, null, 122, null);
            }
        }
        return actionButton;
    }

    public final CourierTipInput stateToCourierTipInput(TipCourierDetailInitState state) {
        TipCourierDetailsDTO.TipsDetails tips;
        TipsInput tipsInput;
        if (state == null || (tips = state.getTips()) == null || (tipsInput = tips.getTipsInput()) == null) {
            return null;
        }
        return toVO(tipsInput);
    }

    public final TipCourierDetailsTipsVI stateToTips(@NotNull TipCourierDetailInitState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TipCourierDetailsDTO.TipsDetails tips = state.getTips();
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

    private final BaseCourierTipVI toVO(TipItem tipItem) {
        String text = tipItem.getText();
        boolean isSelected = tipItem.isSelected();
        AtomActionDTO action = tipItem.getAction();
        return new BaseCourierTipVI.CourierTipVariant(text, isSelected, action != null ? AtomActionMapperKt.toAtomAction(action, tipItem.getTrackingInfo()) : null);
    }

    private final CourierTipInput toVO(TipsInput tipsInput) {
        String hint = tipsInput.getHint();
        boolean isSelected = tipsInput.isSelected();
        BigDecimal currentValue = tipsInput.getCurrentValue();
        return new CourierTipInput(hint, tipsInput.getMinValueError(), tipsInput.getMaxValueError(), tipsInput.getMinValue(), tipsInput.getMaxValue(), isSelected, currentValue != null ? PriceUtilsKt.toFormattedPrice(currentValue) : null);
    }

    private final TipCourierDetailsTipsVI.ChangePaymentVI toVO(ChangePayment changePayment) {
        return new TipCourierDetailsTipsVI.ChangePaymentVI(changePayment.getTitle(), changePayment.getActionButton());
    }
}
