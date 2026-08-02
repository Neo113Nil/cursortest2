package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.sofascore.results.view.SofascoreRatingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zj8 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ double b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zj8(double d, boolean z) {
        this.b = d;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.c;
        double d = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                SofascoreRatingView sofascoreRatingView = new SofascoreRatingView(context, null, 6);
                sofascoreRatingView.setShouldAnimate(z);
                sofascoreRatingView.m(d, false);
                return sofascoreRatingView;
            default:
                FrameLayout frameLayout = (FrameLayout) obj;
                frameLayout.getClass();
                View childAt = frameLayout.getChildAt(0);
                SofascoreRatingView sofascoreRatingView2 = childAt instanceof SofascoreRatingView ? (SofascoreRatingView) childAt : null;
                if (sofascoreRatingView2 != null) {
                    if (!z) {
                        sofascoreRatingView2.setRatingWithoutAnimation(d);
                    } else if (d == 0.0d) {
                        KProperty[] kPropertyArr = SofascoreRatingView.A;
                        sofascoreRatingView2.m(0.0d, false);
                    } else {
                        sofascoreRatingView2.n(d);
                    }
                }
                return Unit.a;
        }
    }

    public /* synthetic */ zj8(boolean z, double d) {
        this.c = z;
        this.b = d;
    }
}
