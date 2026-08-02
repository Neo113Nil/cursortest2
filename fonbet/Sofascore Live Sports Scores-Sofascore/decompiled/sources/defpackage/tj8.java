package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tj8 implements krk {
    public final ConstraintLayout a;
    public final ez0 b;
    public final SegmentedButtonsView c;

    public tj8(ConstraintLayout constraintLayout, ez0 ez0Var, SegmentedButtonsView segmentedButtonsView) {
        this.a = constraintLayout;
        this.b = ez0Var;
        this.c = segmentedButtonsView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
