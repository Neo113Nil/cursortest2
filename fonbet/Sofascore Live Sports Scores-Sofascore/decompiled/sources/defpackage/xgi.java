package defpackage;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xgi implements wke {
    public final /* synthetic */ bhi a;
    public final /* synthetic */ hx5 b;

    public xgi(bhi bhiVar, hx5 hx5Var) {
        this.a = bhiVar;
        this.b = hx5Var;
    }

    @Override // defpackage.wke
    public final void onIsPlayingChanged(boolean z) {
        bhi bhiVar = this.a;
        bhiVar.o = z;
        if (bhiVar.w) {
            bhiVar.w();
        }
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        js2 js2Var = this.a.f;
        if (i == 3) {
            tgj.G((ConstraintLayout) js2Var.o, 0L, 3);
            tgj.G((ImageView) js2Var.b, 0L, 3);
            ((PlayerView) js2Var.l).setVisibility(0);
            ale player = ((PlayerView) js2Var.l).getPlayer();
            if (player != null) {
                player.play();
            }
        }
    }

    @Override // defpackage.wke
    public final void onPlayerError(dke dkeVar) {
        dkeVar.getClass();
        int i = dkeVar.a;
        boolean z = i == 2001;
        bhi bhiVar = this.a;
        bhiVar.l = z;
        if (Intrinsics.c(bhiVar.m, fbd.a) && i == 2004) {
            this.b.invoke();
        }
    }
}
