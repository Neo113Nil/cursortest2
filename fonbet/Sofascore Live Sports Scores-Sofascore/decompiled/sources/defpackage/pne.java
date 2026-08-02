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
/* loaded from: classes.dex */
public final /* synthetic */ class pne implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tne b;

    public /* synthetic */ pne(tne tneVar, int i) {
        this.a = i;
        this.b = tneVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = this.a;
        tne tneVar = this.b;
        switch (i) {
            case 0:
                tneVar.k();
                break;
            case 1:
                View view = tneVar.k;
                ViewGroup viewGroup = tneVar.f;
                if (viewGroup != null) {
                    viewGroup.setVisibility(tneVar.B ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = tneVar.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (tneVar.B) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof it4) {
                        it4 it4Var = (it4) view;
                        Rect rect = it4Var.a;
                        ValueAnimator valueAnimator = it4Var.E;
                        if (tneVar.B) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            it4Var.G = true;
                            it4Var.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            it4Var.invalidate(rect);
                        } else {
                            int i2 = tneVar.A;
                            if (i2 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                it4Var.G = false;
                                it4Var.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                it4Var.invalidate(rect);
                            } else if (i2 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                it4Var.G = false;
                                it4Var.F = 1.0f;
                                it4Var.invalidate(rect);
                            }
                        }
                    }
                }
                Iterator it = tneVar.z.iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    view2.setVisibility((tneVar.B && tne.j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                ValueAnimator valueAnimator2 = tneVar.s;
                View view3 = tneVar.l;
                one oneVar = tneVar.a;
                ViewGroup viewGroup2 = tneVar.h;
                ViewGroup viewGroup3 = tneVar.g;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (oneVar.getWidth() - oneVar.getPaddingLeft()) - oneVar.getPaddingRight();
                    while (viewGroup2.getChildCount() > 1) {
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    int c = tne.c(tneVar.j);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i3 = 0; i3 < childCount2; i3++) {
                        c += tne.c(viewGroup3.getChildAt(i3));
                    }
                    if (c <= width) {
                        ViewGroup viewGroup4 = tneVar.i;
                        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                            tneVar.r.cancel();
                            valueAnimator2.start();
                            break;
                        }
                    } else {
                        if (view3 != null) {
                            view3.setVisibility(0);
                            c += tne.c(view3);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            View childAt2 = viewGroup3.getChildAt(i4);
                            c -= tne.c(childAt2);
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
                tneVar.o.start();
                break;
            case 4:
                tneVar.n.start();
                break;
            case 5:
                tneVar.m.start();
                tneVar.e(2000L, tneVar.v);
                break;
            default:
                tneVar.i(2);
                break;
        }
    }
}
