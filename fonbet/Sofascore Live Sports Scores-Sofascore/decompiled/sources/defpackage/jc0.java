package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import androidx.appcompat.widget.b;
import androidx.mediarouter.app.d;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jc0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jc0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                if (!bVar.getInternalPopup().a()) {
                    bVar.f.k(bVar.getTextDirection(), bVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = bVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                pc0 pc0Var = (pc0) obj;
                b bVar2 = pc0Var.G;
                if (!bVar2.isAttachedToWindow() || !bVar2.getGlobalVisibleRect(pc0Var.E)) {
                    pc0Var.dismiss();
                    break;
                } else {
                    pc0Var.r();
                    pc0Var.show();
                    break;
                }
                break;
            case 2:
                ((ck2) obj).i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                break;
            case 3:
                ql2 ql2Var = (ql2) obj;
                ArrayList arrayList = ql2Var.i;
                if (ql2Var.a() && arrayList.size() > 0 && !((pl2) arrayList.get(0)).a.y) {
                    View view = ql2Var.p;
                    if (view == null || !view.isShown()) {
                        ql2Var.dismiss();
                        break;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((pl2) it.next()).a.show();
                        }
                        break;
                    }
                }
                break;
            case 4:
                d dVar = (d) obj;
                dVar.G.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = dVar.J;
                if (hashSet != null && hashSet.size() != 0) {
                    vg2 vg2Var = new vg2(dVar, 2);
                    int firstVisiblePosition = dVar.G.getFirstVisiblePosition();
                    boolean z = false;
                    for (int i2 = 0; i2 < dVar.G.getChildCount(); i2++) {
                        View childAt = dVar.G.getChildAt(i2);
                        if (dVar.J.contains((obc) dVar.H.getItem(firstVisiblePosition + i2))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            alphaAnimation.setDuration(dVar.k0);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z) {
                                alphaAnimation.setAnimationListener(vg2Var);
                                z = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                    }
                    break;
                } else {
                    dVar.k(true);
                    break;
                }
                break;
            case 5:
                ((msc) obj).i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                break;
            default:
                m9i m9iVar = (m9i) obj;
                ufc ufcVar = m9iVar.i;
                if (m9iVar.a() && !ufcVar.y) {
                    View view2 = m9iVar.n;
                    if (view2 == null || !view2.isShown()) {
                        m9iVar.dismiss();
                        break;
                    } else {
                        ufcVar.show();
                        break;
                    }
                }
                break;
        }
    }
}
