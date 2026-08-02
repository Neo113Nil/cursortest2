package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ls2 implements krk {
    public final LinearLayout a;
    public final TextView b;
    public final RadioGroup c;
    public final RadioGroup d;

    public ls2(LinearLayout linearLayout, TextView textView, RadioGroup radioGroup, RadioGroup radioGroup2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = radioGroup;
        this.d = radioGroup2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
