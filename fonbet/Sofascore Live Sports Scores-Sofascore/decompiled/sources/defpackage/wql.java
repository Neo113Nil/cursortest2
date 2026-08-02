package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wql implements krk {
    public final ConstraintLayout a;
    public final PlayerView b;

    public wql(ConstraintLayout constraintLayout, PlayerView playerView) {
        this.a = constraintLayout;
        this.b = playerView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
