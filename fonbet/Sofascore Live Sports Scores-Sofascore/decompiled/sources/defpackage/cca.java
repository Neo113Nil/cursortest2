package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cca extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ eca b;

    public cca(eca ecaVar) {
        this.b = ecaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View k;
        u childViewHolder;
        eca ecaVar = this.b;
        bca bcaVar = ecaVar.m;
        if (!this.a || (k = ecaVar.k(motionEvent)) == null || (childViewHolder = ecaVar.r.getChildViewHolder(k)) == null) {
            return;
        }
        RecyclerView recyclerView = ecaVar.r;
        if ((bcaVar.d(bcaVar.i(recyclerView, childViewHolder), recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = ecaVar.l;
            if (pointerId == i) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                ecaVar.d = x;
                ecaVar.e = y;
                ecaVar.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                ecaVar.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (bcaVar.m()) {
                    ecaVar.o(childViewHolder, 2);
                }
            }
        }
    }
}
