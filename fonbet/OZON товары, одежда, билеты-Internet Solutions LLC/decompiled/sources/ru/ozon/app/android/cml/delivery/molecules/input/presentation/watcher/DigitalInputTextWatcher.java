package ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher;

import android.text.Editable;
import android.text.Selection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.formatter.DigitalInputToMaskFormatter;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/DigitalInputTextWatcher;", "Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "<init>", "()V", "Landroid/text/Editable;", "input", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", FormPageDTO.Field.FIELD_TYPE_MASK, "updateMask", "(Ljava/lang/String;)V", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig$Digital;", "config", "getAcceptedLetters", "(Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig$Digital;)Ljava/lang/String;", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/formatter/DigitalInputToMaskFormatter;", "formatter", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/formatter/DigitalInputToMaskFormatter;", "", "skipChange", "Z", "Lkotlin/Function1;", "onTextChange", "Lkotlin/jvm/functions/Function1;", "getOnTextChange", "()Lkotlin/jvm/functions/Function1;", "setOnTextChange", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DigitalInputTextWatcher extends OzonTextWatcher {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<Character> digits = C7714v.Y0(new b('0', '9'));

    @NotNull
    private final DigitalInputToMaskFormatter formatter = new DigitalInputToMaskFormatter();
    private Function1<? super String, Unit> onTextChange;
    private boolean skipChange;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/DigitalInputTextWatcher$Companion;", "", "<init>", "()V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
    public void afterTextChanged(Editable input) {
        if (this.skipChange || input == null) {
            return;
        }
        Pair<String, Integer> format = this.formatter.format(input, Selection.getSelectionEnd(input));
        String a11 = format.a();
        int intValue = format.b().intValue();
        this.skipChange = true;
        input.replace(0, input.length(), a11);
        Selection.setSelection(input, intValue);
        this.skipChange = false;
        Function1<? super String, Unit> function1 = this.onTextChange;
        if (function1 != null) {
            function1.invoke(input.toString());
        }
    }

    @NotNull
    public final String getAcceptedLetters(@NotNull InputMoleculeVO.InputConfig.Digital config) {
        Intrinsics.checkNotNullParameter(config, "config");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(digits);
        String mask = config.getMask();
        if (mask != null) {
            StringBuilder sb3 = new StringBuilder();
            int length = mask.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = mask.charAt(i11);
                if (charAt != '#') {
                    sb3.append(charAt);
                }
            }
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
            sb2.append(sb4);
        }
        String sb5 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
        return sb5;
    }

    public final void setOnTextChange(Function1<? super String, Unit> function1) {
        this.onTextChange = function1;
    }

    public final void updateMask(String mask) {
        this.formatter.updateMask(mask);
    }
}
