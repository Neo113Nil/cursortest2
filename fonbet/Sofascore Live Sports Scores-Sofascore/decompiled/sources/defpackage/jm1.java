package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class jm1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jm1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                csf csfVar = (csf) obj3;
                asf asfVar = (asf) obj2;
                bv1 bv1Var = (bv1) ((km1) obj).d;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    csfVar.a = motionEvent.getRawX();
                    asfVar.a = false;
                    ((ConstraintLayout) bv1Var.b).setPressed(true);
                    break;
                } else if (actionMasked == 1) {
                    ((ConstraintLayout) bv1Var.b).setPressed(false);
                    if (!asfVar.a) {
                        ((ConstraintLayout) bv1Var.b).performClick();
                    }
                    break;
                } else if (actionMasked == 2) {
                    if (!asfVar.a && Math.abs(motionEvent.getRawX() - csfVar.a) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop()) {
                        asfVar.a = true;
                        ((ConstraintLayout) bv1Var.b).setPressed(false);
                        break;
                    }
                } else if (actionMasked == 3) {
                    ((ConstraintLayout) bv1Var.b).setPressed(false);
                    break;
                }
                break;
            default:
                View view2 = (View) obj3;
                gca gcaVar = (gca) obj2;
                RecyclerView recyclerView = (RecyclerView) obj;
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    view2.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(50L);
                    gcaVar.m = null;
                    u findContainingViewHolder = recyclerView.findContainingViewHolder(view2);
                    if (findContainingViewHolder != null) {
                        if (Math.abs(view2.getX()) >= gcaVar.v() + (view2.getX() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? gcaVar.w() : gcaVar.x()).getMeasuredWidth()) {
                            gcaVar.t(findContainingViewHolder, view2.getX() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 32 : 16);
                        }
                    }
                    gcaVar.l = true;
                    recyclerView.setOnTouchListener(null);
                    break;
                }
                break;
        }
        return false;
    }
}
