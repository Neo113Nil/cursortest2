package defpackage;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.results.view.SofaTextInputLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ikj implements krk {
    public final SofaTextInputLayout a;
    public final TextInputEditText b;

    public ikj(SofaTextInputLayout sofaTextInputLayout, TextInputEditText textInputEditText) {
        this.a = sofaTextInputLayout;
        this.b = textInputEditText;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
