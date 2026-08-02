package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.view.BellButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class woc implements krk {
    public final /* synthetic */ int a = 2;
    public final ConstraintLayout b;

    public woc(ConstraintLayout constraintLayout, ImageView imageView) {
        this.b = constraintLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public woc(ConstraintLayout constraintLayout, BellButton bellButton, TextView textView, TextView textView2) {
        this.b = constraintLayout;
    }

    public woc(ConstraintLayout constraintLayout) {
        this.b = constraintLayout;
    }
}
