package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class is2 implements krk {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final TextView c;
    public final TextView d;

    public is2(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
