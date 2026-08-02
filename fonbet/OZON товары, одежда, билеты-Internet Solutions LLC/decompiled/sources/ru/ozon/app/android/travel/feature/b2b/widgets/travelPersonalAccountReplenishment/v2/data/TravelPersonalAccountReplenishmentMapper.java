package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data;

import Gl.C3124a;
import Nk.a;
import V.e;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.R$string;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentVO;
import ru.ozon.app.android.travel.utils.extensions.StringExtensionsKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.PriceUtilsKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0011\u0010 \u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO$InputDTO;", "item", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO$InputVO;", "mapInput", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO$InputDTO;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO$InputVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO;Ll20/d;)Ljava/util/List;", "", "", "digitsLimit", "mapPrice", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "errors", "mapErrors", "(Ljava/util/List;)Ljava/lang/String;", "currencySymbol", "Ljava/lang/String;", "formatPattern", "getCurrencyWithPrefixLength", "()I", "currencyWithPrefixLength", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelPersonalAccountReplenishmentMapper implements Function2<TravelPersonalAccountReplenishmentDTO, d, List<? extends TravelPersonalAccountReplenishmentVO>> {

    @NotNull
    private final String currencySymbol;

    @NotNull
    private final String formatPattern;

    public TravelPersonalAccountReplenishmentMapper() {
        String string = StringProvider.getString(R$string.account_replenishment_ruble_symbol);
        this.currencySymbol = string;
        this.formatPattern = a.b("%s ", string);
    }

    private final TravelPersonalAccountReplenishmentVO.InputVO mapInput(TravelPersonalAccountReplenishmentDTO.InputDTO item) {
        Integer num;
        String X9;
        String mask = item.getMask();
        Integer valueOf = (mask == null || (X9 = h.X(mask, " ", "", false)) == null) ? null : Integer.valueOf(X9.length());
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            num = Integer.valueOf(getCurrencyWithPrefixLength() + C3124a.a(intValue, 1, 3, intValue));
        } else {
            num = null;
        }
        String value = item.getValue();
        String mapPrice = mapPrice(value != null ? StringExtensionsKt.removeNonDigitSymbols(value) : null, valueOf);
        String str = mapPrice == null ? "" : mapPrice;
        String placeholder = item.getPlaceholder();
        return new TravelPersonalAccountReplenishmentVO.InputVO(str, placeholder == null ? "" : placeholder, !item.getErrors().isEmpty(), mapErrors(item.getErrors()), valueOf, num, Math.max(0, str.length() - getCurrencyWithPrefixLength()));
    }

    public final int getCurrencyWithPrefixLength() {
        return this.currencySymbol.length() + 1;
    }

    @NotNull
    public final String mapErrors(@NotNull List<String> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        return C7714v.V(errors, "\n", null, null, null, 62);
    }

    public final String mapPrice(String item, Integer digitsLimit) {
        if (item == null) {
            return null;
        }
        if (digitsLimit != null && item.length() > digitsLimit.intValue()) {
            return null;
        }
        if (item.length() == 0) {
            return item;
        }
        BigDecimal s02 = h.s0(item);
        if (s02 == null) {
            return null;
        }
        String str = this.formatPattern;
        Object obj = s02;
        if (digitsLimit != null) {
            obj = h.z0(PriceUtilsKt.formatWithCurrency(s02));
        }
        return e.b(new Object[]{obj}, 1, str, "format(...)");
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelPersonalAccountReplenishmentVO> invoke(@NotNull TravelPersonalAccountReplenishmentDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        String name = state.getInput().getName();
        TravelPersonalAccountReplenishmentVO.InputVO mapInput = mapInput(state.getInput());
        ButtonV3Atom.LargeButton submitButton = state.getSubmitButton();
        TextAtom description = state.getDescription();
        TextAtom agreementText = state.getAgreementText();
        boolean z11 = !state.getInputVariants().isEmpty();
        List<TagV3Atom.TagAtom> inputVariants = state.getInputVariants();
        Iterator<TagV3Atom.TagAtom> it = state.getInputVariants().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().isSelected()) {
                break;
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() <= -1) {
            valueOf = null;
        }
        return C7714v.a0(new TravelPersonalAccountReplenishmentVO(hashCode, title, name, "validateOnly", mapInput, submitButton, description, agreementText, z11, inputVariants, null, valueOf));
    }
}
