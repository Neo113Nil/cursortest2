package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nd implements krk {
    public final LinearLayout a;
    public final MaterialButton b;
    public final ed c;
    public final ScrollView d;
    public final TextView e;

    public nd(LinearLayout linearLayout, MaterialButton materialButton, ed edVar, ScrollView scrollView, TextView textView) {
        this.a = linearLayout;
        this.b = materialButton;
        this.c = edVar;
        this.d = scrollView;
        this.e = textView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
