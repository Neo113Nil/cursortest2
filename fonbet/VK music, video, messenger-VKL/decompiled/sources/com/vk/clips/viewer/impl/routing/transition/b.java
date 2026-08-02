package com.vk.clips.viewer.impl.routing.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.viewer.impl.routing.transition.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.b5q;
import xsna.bmp0;
import xsna.bwt0;
import xsna.f5z;
import xsna.gnp0;
import xsna.j5g;
import xsna.nhl;
import xsna.nx3;
import xsna.p4u0;
import xsna.q8e;
import xsna.rl3;
import xsna.rzc;
import xsna.tqs0;
import xsna.uvc;
import xsna.vlp0;
import xsna.wjt0;
import xsna.yg5;
import xsna.z8e;

/* compiled from: ExitScaleTransition.kt */
/* loaded from: classes17.dex */
public final class b extends p4u0 {
    public final Fragment b;
    public final rzc c;
    public Handler d = new Handler(Looper.getMainLooper());
    public nx3 e = new nx3(this, 4);

    public b(Fragment fragment, rzc rzcVar) {
        this.b = fragment;
        this.c = rzcVar;
        com.vk.clips.viewer.impl.routing.transition.a Uh = rzcVar.Uh();
        if (Uh != null) {
            a.C0714a c0714a = Uh.b;
            if (c0714a != null) {
                yg5 yg5Var = bmp0.a;
                bmp0.a(c0714a.d);
            }
            Uh.a.a.J();
        }
        this.d.postDelayed(this.e, uvc.a);
    }

    public static AnimatorSet a(com.vk.clips.viewer.impl.routing.transition.a aVar, z8e z8eVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        List<View> N0 = z8eVar.N0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : N0) {
            if (bwt0.K((View) obj)) {
                arrayList.add(obj);
            }
        }
        int i = uvc.c;
        AnimatorSet e = uvc.e(arrayList, false);
        a.b bVar = aVar.a;
        a.C0714a c0714a = aVar.b;
        animatorSet.playSequentially(rl3.I(new Animator[]{e, c0714a == null ? new AnimatorSet() : uvc.f(bVar.a, z8eVar.q1(), j5g.u0(z8eVar.w2(), c0714a.a), false)}));
        return animatorSet;
    }

    @Override // xsna.p4u0, xsna.vlp0
    public final void captureStartValues(gnp0 gnp0Var) {
        List list;
        a.C0714a c0714a;
        HashMap hashMap = gnp0Var.a;
        com.vk.clips.viewer.impl.routing.transition.a Uh = this.c.Uh();
        RecyclerView.e0 e0Var = null;
        if (Uh != null && (c0714a = Uh.b) != null) {
            q8e q8eVar = c0714a.b;
            Lifecycle lifecycle = this.b.getViewLifecycleOwner().getLifecycle();
            lifecycle.addObserver(new a(lifecycle));
            RecyclerView.o layoutManager = q8eVar.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.l = false;
                q8eVar.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0715b(linearLayoutManager));
                e0Var = q8eVar.findViewHolderForLayoutPosition(linearLayoutManager.v());
            }
        }
        if (e0Var == null || (list = wjt0.a(e0Var)) == null) {
            list = EmptyList.b;
        }
        hashMap.put("VIEW_HOLDER", e0Var);
        hashMap.put("RELEASE_TEXTURE_BACKGROUND", list);
        super.captureStartValues(gnp0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[RETURN] */
    @Override // xsna.p4u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator onDisappear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        AnimatorSet animatorSet;
        HashMap hashMap;
        com.vk.clips.viewer.impl.routing.transition.a Uh = this.c.Uh();
        if (Uh != null) {
            Object obj = (gnp0Var == null || (hashMap = gnp0Var.a) == null) ? null : hashMap.get("VIEW_HOLDER");
            if (obj instanceof tqs0) {
                animatorSet = a(Uh, (z8e) obj);
            } else if (obj instanceof z8e) {
                animatorSet = a(Uh, (z8e) obj);
            }
            if (animatorSet != null) {
                return null;
            }
            animatorSet.addListener(new b5q(this, gnp0Var));
            return animatorSet;
        }
        animatorSet = null;
        if (animatorSet != null) {
        }
    }

    @Override // xsna.vlp0
    public final vlp0 clone() {
        b bVar = (b) super.clone();
        bVar.d = this.d;
        bVar.e = this.e;
        return bVar;
    }

    /* compiled from: ExitScaleTransition.kt */
    public static final class a implements nhl {
        public final /* synthetic */ Lifecycle b;

        public a(Lifecycle lifecycle) {
            this.b = lifecycle;
        }

        @Override // xsna.nhl
        public final void onDestroy(f5z f5zVar) {
            bmp0.a(null);
            this.b.removeObserver(this);
        }

        @Override // xsna.nhl
        public final void onCreate(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onPause(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onResume(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStart(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStop(f5z f5zVar) {
        }
    }

    /* compiled from: ExitScaleTransition.kt */
    /* renamed from: com.vk.clips.viewer.impl.routing.transition.b$b, reason: collision with other inner class name */
    public static final class ViewOnAttachStateChangeListenerC0715b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ LinearLayoutManager b;

        public ViewOnAttachStateChangeListenerC0715b(LinearLayoutManager linearLayoutManager) {
            this.b = linearLayoutManager;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            LinearLayoutManager linearLayoutManager = this.b;
            if (linearLayoutManager != null) {
                linearLayoutManager.l = true;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
