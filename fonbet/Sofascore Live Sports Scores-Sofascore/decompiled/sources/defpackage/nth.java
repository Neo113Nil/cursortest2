package defpackage;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nth extends u61 {
    @Override // defpackage.u61
    public final void a() {
        ((ProgressBar) this.c.h).setVisibility(8);
    }

    @Override // defpackage.u61
    public final void b(boolean z) {
        int i = z ? R.drawable.ayp_ic_pause_36dp : R.drawable.ayp_ic_play_36dp;
        bv1 bv1Var = this.c;
        ((ImageView) bv1Var.e).setImageResource(i);
        if (z) {
            ((ImageView) bv1Var.e).setVisibility(8);
        }
    }
}
