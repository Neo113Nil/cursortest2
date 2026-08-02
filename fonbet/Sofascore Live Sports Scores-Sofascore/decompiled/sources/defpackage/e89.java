package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.stagesport.StageFeaturedOddsView;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e89 implements krk {
    public final ConstraintLayout a;
    public final e92 b;
    public final MaterialDivider c;
    public final TypeHeaderView d;
    public final SegmentedButtonsView e;
    public final TypeHeaderView f;
    public final GraphicLarge g;
    public final StageFeaturedOddsView h;
    public final TextView i;
    public final TextView j;

    public e89(ConstraintLayout constraintLayout, e92 e92Var, MaterialDivider materialDivider, TypeHeaderView typeHeaderView, SegmentedButtonsView segmentedButtonsView, TypeHeaderView typeHeaderView2, GraphicLarge graphicLarge, StageFeaturedOddsView stageFeaturedOddsView, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = e92Var;
        this.c = materialDivider;
        this.d = typeHeaderView;
        this.e = segmentedButtonsView;
        this.f = typeHeaderView2;
        this.g = graphicLarge;
        this.h = stageFeaturedOddsView;
        this.i = textView;
        this.j = textView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
