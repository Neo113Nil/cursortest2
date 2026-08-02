package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xe implements krk {
    public final LinearLayout a;
    public final Button b;
    public final LinearLayout c;
    public final RadioGroup d;
    public final TextInputEditText e;
    public final TextView f;

    public xe(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, RadioGroup radioGroup, TextInputEditText textInputEditText, TextView textView) {
        this.a = linearLayout;
        this.b = button;
        this.c = linearLayout2;
        this.d = radioGroup;
        this.e = textInputEditText;
        this.f = textView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
