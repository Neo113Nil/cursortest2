package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class osk implements krk {
    public final ConstraintLayout a;
    public final TextView b;
    public final Group c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public osk(ConstraintLayout constraintLayout, TextView textView, Group group, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = group;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = textView5;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
