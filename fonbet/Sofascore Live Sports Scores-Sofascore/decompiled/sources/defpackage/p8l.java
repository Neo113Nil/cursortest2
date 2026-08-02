package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p8l extends wuk {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8l b;

    public /* synthetic */ p8l(r8l r8lVar, int i) {
        this.a = i;
        this.b = r8lVar;
    }

    @Override // defpackage.vuk
    public final void c() {
        View view;
        int i = this.a;
        r8l r8lVar = this.b;
        switch (i) {
            case 0:
                if (r8lVar.B && (view = r8lVar.t) != null) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    r8lVar.q.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                r8lVar.q.setVisibility(8);
                r8lVar.q.setTransitioning(false);
                r8lVar.F = null;
                f4a f4aVar = r8lVar.x;
                if (f4aVar != null) {
                    f4aVar.q(r8lVar.w);
                    r8lVar.w = null;
                    r8lVar.x = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = r8lVar.p;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = bsk.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                r8lVar.F = null;
                r8lVar.q.requestLayout();
                break;
        }
    }
}
