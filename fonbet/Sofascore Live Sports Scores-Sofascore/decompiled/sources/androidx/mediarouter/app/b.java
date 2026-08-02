package androidx.mediarouter.app;

import android.view.animation.Animation;
import defpackage.iyd;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b implements Animation.AnimationListener {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        d dVar = this.a;
        OverlayListView overlayListView = dVar.G;
        Iterator it = overlayListView.a.iterator();
        while (it.hasNext()) {
            iyd iydVar = (iyd) it.next();
            if (!iydVar.j) {
                iydVar.i = overlayListView.getDrawingTime();
                iydVar.j = true;
            }
        }
        dVar.G.postDelayed(dVar.q0, dVar.j0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
