package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.rgm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uxl extends rgm.e {
    @Override // rgm.e
    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (recyclerView != null && motionEvent.getHistorySize() != 0) {
            float y = motionEvent.getY(0) - motionEvent.getHistoricalY(0, 0);
            float x = motionEvent.getX(0) - motionEvent.getHistoricalX(0, 0);
            if (Math.abs(x) >= Math.abs(y)) {
                this.a = recyclerView.getTranslationX();
                this.b = x;
                this.c = x > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return true;
            }
        }
        return false;
    }
}
