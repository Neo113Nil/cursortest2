package ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher;

import android.text.Editable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/RawTextWatcher;", "Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "<init>", "()V", "Landroid/text/Editable;", "input", "", "afterTextChanged", "(Landroid/text/Editable;)V", "Lkotlin/Function1;", "", "onTextChange", "Lkotlin/jvm/functions/Function1;", "getOnTextChange", "()Lkotlin/jvm/functions/Function1;", "setOnTextChange", "(Lkotlin/jvm/functions/Function1;)V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RawTextWatcher extends OzonTextWatcher {
    private Function1<? super String, Unit> onTextChange;

    @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
    public void afterTextChanged(Editable input) {
        Function1<? super String, Unit> function1 = this.onTextChange;
        if (function1 != null) {
            String obj = input != null ? input.toString() : null;
            if (obj == null) {
                obj = "";
            }
            function1.invoke(obj);
        }
    }

    public final void setOnTextChange(Function1<? super String, Unit> function1) {
        this.onTextChange = function1;
    }
}
