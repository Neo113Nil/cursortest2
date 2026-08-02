package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nsk implements krk {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public nsk(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
