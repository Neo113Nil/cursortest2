package com.vk.core.simplescreen;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import xsna.bpn0;
import xsna.e3m;
import xsna.em6;
import xsna.enj;
import xsna.mhy;
import xsna.xy9;

/* loaded from: classes17.dex */
public class ScreenContainer extends FrameLayout {
    public int b;
    public Activity c;
    public a d;
    public final ArrayList<em6> e;

    public interface a {
        void onDismiss();
    }

    public ScreenContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ArrayList<>();
        bpn0 bpn0Var = enj.a;
        this.c = e3m.h(context);
    }

    public final void a() {
        a aVar;
        ArrayList<em6> arrayList = this.e;
        if (arrayList.size() > 0) {
            c((em6) xy9.b(1, arrayList));
            if (arrayList.size() > 0) {
                em6 em6Var = (em6) xy9.b(1, arrayList);
                View view = em6Var.e;
                for (int i = 0; i < getChildCount(); i++) {
                    getChildAt(i).setVisibility(8);
                }
                if (view == null || view.getParent() != this) {
                    if (view != null && view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    addView(em6Var.e(this.c.getLayoutInflater()));
                    if (view != null) {
                        view.setVisibility(0);
                    }
                } else {
                    view.setVisibility(0);
                }
                em6Var.j();
            }
        }
        if (arrayList.size() != 0 || (aVar = this.d) == null) {
            return;
        }
        aVar.onDismiss();
    }

    public final boolean b() {
        if (getCurrentScreen() != null && !getCurrentScreen().g()) {
            a();
            return true;
        }
        if (getCurrentScreen() != null) {
            return true;
        }
        a aVar = this.d;
        if (aVar == null) {
            return false;
        }
        aVar.onDismiss();
        return false;
    }

    public final void c(em6 em6Var) {
        if (em6Var != null && em6Var.d) {
            Activity activity = this.c;
            if (activity != null) {
                mhy.b(activity);
            }
            em6Var.i();
            View view = em6Var.e;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        View view2 = em6Var.e;
        if (view2 != null && view2.getParent() != null) {
            ((ViewGroup) view2.getParent()).removeView(view2);
        }
        em6Var.h();
        if (em6Var.f != null) {
            em6Var.f = null;
            View view3 = em6Var.e;
            if (view3 != null) {
                ViewGroup viewGroup = (ViewGroup) view3.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(em6Var.e);
                }
                em6Var.e = null;
            }
        }
        this.e.remove(em6Var);
    }

    public final void d(em6 em6Var) {
        em6 currentScreen = getCurrentScreen();
        if (currentScreen != null && currentScreen.d) {
            Activity activity = this.c;
            if (activity != null) {
                mhy.b(activity);
            }
            currentScreen.i();
            View view = currentScreen.e;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        if (em6Var.f != this) {
            em6Var.f = this;
            View view2 = em6Var.e;
            if (view2 != null) {
                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(em6Var.e);
                }
                em6Var.e = null;
            }
        }
        addView(em6Var.e(this.c.getLayoutInflater()));
        em6Var.j();
        em6Var.k(this.b);
        this.e.add(em6Var);
    }

    public em6 getCurrentScreen() {
        ArrayList<em6> arrayList = this.e;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (em6) xy9.b(1, arrayList);
    }

    public void setOnDismissListener(a aVar) {
        this.d = aVar;
    }
}
