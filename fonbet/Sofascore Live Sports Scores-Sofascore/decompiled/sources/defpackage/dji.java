package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class dji implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hji b;

    public /* synthetic */ dji(hji hjiVar, int i) {
        this.a = i;
        this.b = hjiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = this.a;
        hji hjiVar = this.b;
        switch (i) {
            case 0:
                hjiVar.k();
                break;
            case 1:
                View view = hjiVar.j;
                ViewGroup viewGroup = hjiVar.e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(hjiVar.A ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = hjiVar.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (hjiVar.A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof ht4) {
                        ht4 ht4Var = (ht4) view;
                        Rect rect = ht4Var.a;
                        ValueAnimator valueAnimator = ht4Var.E;
                        if (hjiVar.A) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            ht4Var.G = true;
                            ht4Var.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            ht4Var.invalidate(rect);
                        } else {
                            int i2 = hjiVar.z;
                            if (i2 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                ht4Var.G = false;
                                ht4Var.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                ht4Var.invalidate(rect);
                            } else if (i2 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                ht4Var.G = false;
                                ht4Var.F = 1.0f;
                                ht4Var.invalidate(rect);
                            }
                        }
                    }
                }
                Iterator it = hjiVar.y.iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    view2.setVisibility((hjiVar.A && hji.j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                ValueAnimator valueAnimator2 = hjiVar.r;
                View view3 = hjiVar.k;
                cji cjiVar = hjiVar.a;
                ViewGroup viewGroup2 = hjiVar.g;
                ViewGroup viewGroup3 = hjiVar.f;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (cjiVar.getWidth() - cjiVar.getPaddingLeft()) - cjiVar.getPaddingRight();
                    while (viewGroup2.getChildCount() > 1) {
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    int c = hji.c(hjiVar.i);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i3 = 0; i3 < childCount2; i3++) {
                        c += hji.c(viewGroup3.getChildAt(i3));
                    }
                    if (c <= width) {
                        ViewGroup viewGroup4 = hjiVar.h;
                        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                            hjiVar.q.cancel();
                            valueAnimator2.start();
                            break;
                        }
                    } else {
                        if (view3 != null) {
                            view3.setVisibility(0);
                            c += hji.c(view3);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            View childAt2 = viewGroup3.getChildAt(i4);
                            c -= hji.c(childAt2);
                            arrayList.add(childAt2);
                            if (c <= width) {
                                if (arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                        viewGroup2.addView((View) arrayList.get(i5), viewGroup2.getChildCount() - 1);
                                    }
                                    break;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                        }
                    }
                }
                break;
            case 3:
                hjiVar.n.start();
                break;
            case 4:
                hjiVar.m.start();
                break;
            case 5:
                hjiVar.l.start();
                hjiVar.e(2000L, hjiVar.u);
                break;
            default:
                hjiVar.i(2);
                break;
        }
    }
}
