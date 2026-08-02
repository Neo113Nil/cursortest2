package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ik8 implements krk {
    public final ConstraintLayout a;
    public final GraphicLarge b;
    public final xk8 c;
    public final dd d;
    public final ImageView e;
    public final SegmentedButtonsView f;

    public ik8(ConstraintLayout constraintLayout, GraphicLarge graphicLarge, xk8 xk8Var, dd ddVar, ImageView imageView, SegmentedButtonsView segmentedButtonsView) {
        this.a = constraintLayout;
        this.b = graphicLarge;
        this.c = xk8Var;
        this.d = ddVar;
        this.e = imageView;
        this.f = segmentedButtonsView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
