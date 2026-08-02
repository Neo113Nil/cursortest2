package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation;

import android.text.Editable;
import android.text.Selection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneVO;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneTextWatcher;", "Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "Lkotlin/Function2;", "", "", "", "onPhoneChanged", "Lkotlin/Function1;", "onInputChanged", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Landroid/text/Editable;", "input", "afterTextChanged", "(Landroid/text/Editable;)V", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO$PhoneInputVO;", "phoneInput", "updatePhoneFormat", "(Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneVO$PhoneInputVO;)V", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/PhoneFormatter;", "formatter", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/PhoneFormatter;", "skipChange", "Z", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParticipantPhoneTextWatcher extends OzonTextWatcher {

    @NotNull
    private final PhoneFormatter formatter;

    @NotNull
    private final Function1<String, Unit> onInputChanged;

    @NotNull
    private final Function2<String, Boolean, Unit> onPhoneChanged;
    private boolean skipChange;

    /* JADX WARN: Multi-variable type inference failed */
    public ParticipantPhoneTextWatcher(@NotNull Function2<? super String, ? super Boolean, Unit> onPhoneChanged, @NotNull Function1<? super String, Unit> onInputChanged) {
        Intrinsics.checkNotNullParameter(onPhoneChanged, "onPhoneChanged");
        Intrinsics.checkNotNullParameter(onInputChanged, "onInputChanged");
        this.onPhoneChanged = onPhoneChanged;
        this.onInputChanged = onInputChanged;
        this.formatter = new PhoneFormatter();
    }

    @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
    public void afterTextChanged(Editable input) {
        if (this.skipChange || input == null) {
            return;
        }
        String unformat = this.formatter.unformat(input);
        this.onInputChanged.invoke(unformat);
        if (!this.formatter.isPhoneNumber(input)) {
            if (Intrinsics.d(unformat, input.toString())) {
                return;
            }
            this.skipChange = true;
            input.replace(0, input.length(), unformat);
            Selection.setSelection(input, unformat.length());
            this.skipChange = false;
            return;
        }
        Pair<String, Integer> format = this.formatter.format(input, Selection.getSelectionEnd(input));
        CharSequence charSequence = (String) format.a();
        int intValue = format.b().intValue();
        this.skipChange = true;
        input.replace(0, input.length(), charSequence);
        Selection.setSelection(input, intValue);
        this.skipChange = false;
        this.onPhoneChanged.invoke(input.toString(), Boolean.valueOf(this.formatter.isFullPhoneEntered(input)));
    }

    public final void updatePhoneFormat(@NotNull ParticipantPhoneVO.PhoneInputVO phoneInput) {
        Intrinsics.checkNotNullParameter(phoneInput, "phoneInput");
        this.formatter.updatePhoneFormat(phoneInput.getCountryCode(), phoneInput.getAdditionalCountryCodes(), phoneInput.getPhoneMask());
    }
}
