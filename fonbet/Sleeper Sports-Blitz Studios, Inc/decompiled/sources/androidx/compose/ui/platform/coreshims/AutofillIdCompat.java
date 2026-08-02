package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;
import androidx.core.graphics.ColorKt$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes4.dex */
public class AutofillIdCompat {
    private final Object mWrappedObj;

    private AutofillIdCompat(AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }

    public static AutofillIdCompat toAutofillIdCompat(AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    public AutofillId toAutofillId() {
        return ColorKt$$ExternalSyntheticApiModelOutline0.m9076m(this.mWrappedObj);
    }
}
