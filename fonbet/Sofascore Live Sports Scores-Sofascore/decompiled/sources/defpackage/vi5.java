package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vi5 extends anf {
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi5(int i) {
        super(3);
        this.p = i;
    }

    @Override // defpackage.anf
    public final void g(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float sin;
        float cos;
        switch (this.p) {
            case 0:
                RectF d = anf.d(tabLayout, view);
                RectF d2 = anf.d(tabLayout, view2);
                if (d.left < d2.left) {
                    double d3 = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) (1.0d - Math.cos(d3));
                    cos = (float) Math.sin(d3);
                } else {
                    double d4 = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) Math.sin(d4);
                    cos = (float) (1.0d - Math.cos(d4));
                }
                drawable.setBounds(e80.c(sin, (int) d.left, (int) d2.left), drawable.getBounds().top, e80.c(cos, (int) d.right, (int) d2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF d5 = anf.d(tabLayout, view);
                float b = f < 0.5f ? e80.b(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, f) : e80.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) d5.left, drawable.getBounds().top, (int) d5.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b * 255.0f));
                break;
        }
    }
}
