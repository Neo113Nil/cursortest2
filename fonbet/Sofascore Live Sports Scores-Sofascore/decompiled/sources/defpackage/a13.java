package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.sofascore.results.redesign.dividers.SofaDivider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a13 implements krk {
    public final LinearLayout a;
    public final SofaDivider b;
    public final djf c;
    public final FrameLayout d;

    public a13(LinearLayout linearLayout, SofaDivider sofaDivider, djf djfVar, FrameLayout frameLayout) {
        this.a = linearLayout;
        this.b = sofaDivider;
        this.c = djfVar;
        this.d = frameLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
