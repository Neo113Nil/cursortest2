package defpackage;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.media3.ui.PlayerView;
import com.google.android.material.chip.Chip;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qt2 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ qt2(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a;
        View view2 = this.b;
        switch (i) {
            case 0:
                st2 st2Var = ((Chip) view2).e;
                if (st2Var == null) {
                    outline.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                } else {
                    st2Var.getOutline(outline);
                    break;
                }
            default:
                view.getClass();
                outline.getClass();
                int width = view.getWidth();
                int height = view.getHeight();
                Context context = ((PlayerView) view2).getContext();
                context.getClass();
                outline.setRoundRect(0, 0, width, height, ao2.u(16, context));
                break;
        }
    }
}
