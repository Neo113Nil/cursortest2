package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.PlayerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class wgi implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bhi b;

    public /* synthetic */ wgi(bhi bhiVar, int i) {
        this.a = i;
        this.b = bhiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        bhi bhiVar = this.b;
        switch (i) {
            case 0:
                bhi.l(bhiVar);
                break;
            case 1:
                bhi.n(bhiVar);
                break;
            default:
                js2 js2Var = bhiVar.f;
                ale player = ((PlayerView) js2Var.l).getPlayer();
                if (player != null) {
                    player.setVolume(1.0f);
                }
                tgj.G((ImageView) js2Var.e, 0L, 3);
                break;
        }
    }
}
