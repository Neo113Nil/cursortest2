package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m15 implements krk {
    public final LinearLayout a;
    public final TextInputEditText b;
    public final TextInputEditText c;

    public m15(LinearLayout linearLayout, TextInputEditText textInputEditText, TextInputEditText textInputEditText2) {
        this.a = linearLayout;
        this.b = textInputEditText;
        this.c = textInputEditText2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
