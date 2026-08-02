package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.mediarouter.app.d;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gac extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public gac(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.a = 2;
        this.d = swipeRefreshLayout;
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        View view = this.d;
        switch (i) {
            case 0:
                d.o(i3 - ((int) ((i3 - i2) * f)), view);
                break;
            case 1:
                int i4 = i2 + ((int) ((i3 - i2) * f));
                int i5 = bbc.U;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i4;
                view.setLayoutParams(layoutParams);
                break;
            default:
                ((SwipeRefreshLayout) view).z.setAlpha((int) (((i2 - i3) * f) + i3));
                break;
        }
    }

    public /* synthetic */ gac(int i, int i2, int i3, View view) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = view;
    }
}
