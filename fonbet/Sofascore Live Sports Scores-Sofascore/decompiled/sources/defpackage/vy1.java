package defpackage;

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vy1 implements krk {
    public final /* synthetic */ int a;
    public final LinearLayout b;

    public vy1(LinearLayout linearLayout, vba vbaVar, vba vbaVar2, vba vbaVar3, vba vbaVar4) {
        this.a = 6;
        this.b = linearLayout;
    }

    public static vy1 a(View view) {
        if (view != null) {
            return new vy1((LinearLayout) view, 4);
        }
        yhk.s("rootView");
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public /* synthetic */ vy1(LinearLayout linearLayout, int i) {
        this.a = i;
        this.b = linearLayout;
    }
}
