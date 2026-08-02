package androidx.mediarouter.app;

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
import java.util.Iterator;

/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes12.dex */
public final class d implements Animation.AnimationListener {
    public final /* synthetic */ b b;

    public d(b bVar) {
        this.b = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        b bVar = this.b;
        OverlayListView overlayListView = bVar.G;
        Iterator it = overlayListView.b.iterator();
        while (it.hasNext()) {
            OverlayListView.a aVar = (OverlayListView.a) it.next();
            if (!aVar.j) {
                aVar.i = overlayListView.getDrawingTime();
                aVar.j = true;
            }
        }
        bVar.G.postDelayed(bVar.q0, bVar.j0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
