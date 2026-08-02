package com.vk.clips.viewer.impl.routing.transition;

import android.animation.Animator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.viewer.impl.routing.transition.a;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.a0k0;
import xsna.bmp0;
import xsna.f5z;
import xsna.gnp0;
import xsna.m52;
import xsna.nhl;
import xsna.q8e;
import xsna.qj80;
import xsna.rzc;
import xsna.uvc;
import xsna.vlp0;
import xsna.wjt0;
import xsna.yg5;

/* compiled from: ExitSlideTransition.kt */
/* loaded from: classes17.dex */
public final class c extends a0k0 {
    public final Fragment l;
    public final rzc m;
    public Handler n = new Handler(Looper.getMainLooper());
    public m52 o = new m52(this, 3);

    /* compiled from: View.kt */
    public static final class d implements Runnable {
        public final /* synthetic */ Object b;

        public d(VideoTextureView videoTextureView, wjt0.a aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((wjt0.a) this.b).a.setBackground(null);
        }
    }

    public c(Fragment fragment, rzc rzcVar) {
        this.l = fragment;
        this.m = rzcVar;
        a(3);
        setDuration(220L);
        com.vk.clips.viewer.impl.routing.transition.a Uh = rzcVar.Uh();
        if (Uh != null) {
            a.C0714a c0714a = Uh.b;
            if (c0714a != null) {
                yg5 yg5Var = bmp0.a;
                bmp0.a(c0714a.d);
            }
            Uh.a.a.J();
        }
        this.n.postDelayed(this.o, uvc.a);
    }

    @Override // xsna.a0k0, xsna.p4u0, xsna.vlp0
    public final void captureStartValues(gnp0 gnp0Var) {
        List list;
        a.C0714a c0714a;
        HashMap hashMap = gnp0Var.a;
        com.vk.clips.viewer.impl.routing.transition.a Uh = this.m.Uh();
        RecyclerView.e0 e0Var = null;
        if (Uh != null && (c0714a = Uh.b) != null) {
            q8e q8eVar = c0714a.b;
            Lifecycle lifecycle = this.l.getViewLifecycleOwner().getLifecycle();
            lifecycle.addObserver(new a(lifecycle));
            RecyclerView.o layoutManager = q8eVar.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.l = false;
                q8eVar.addOnAttachStateChangeListener(new b(linearLayoutManager));
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

    @Override // xsna.p4u0
    public final Animator onDisappear(ViewGroup viewGroup, gnp0 gnp0Var, int i, gnp0 gnp0Var2, int i2) {
        Animator onDisappear = super.onDisappear(viewGroup, gnp0Var, i, gnp0Var2, i2);
        if (onDisappear == null) {
            return null;
        }
        onDisappear.addListener(new C0716c(gnp0Var));
        return onDisappear;
    }

    @Override // xsna.vlp0
    public final vlp0 clone() {
        c cVar = (c) super.clone();
        cVar.n = this.n;
        cVar.o = this.o;
        return cVar;
    }

    /* compiled from: ExitSlideTransition.kt */
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

    /* compiled from: ExitSlideTransition.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ LinearLayoutManager b;

        public b(LinearLayoutManager linearLayoutManager) {
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

    /* compiled from: Animator.kt */
    /* renamed from: com.vk.clips.viewer.impl.routing.transition.c$c, reason: collision with other inner class name */
    public static final class C0716c implements Animator.AnimatorListener {
        public final /* synthetic */ gnp0 c;

        public C0716c(gnp0 gnp0Var) {
            this.c = gnp0Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            yg5 yg5Var = bmp0.a;
            if (yg5Var != null) {
                yg5Var.C(true);
            }
            bmp0.a(null);
            com.vk.clips.viewer.impl.routing.transition.a Uh = c.this.m.Uh();
            if (Uh != null) {
                Uh.a.a.C();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            HashMap hashMap;
            c cVar = c.this;
            cVar.n.removeCallbacks(cVar.o);
            gnp0 gnp0Var = this.c;
            Object obj = (gnp0Var == null || (hashMap = gnp0Var.a) == null) ? null : hashMap.get("RELEASE_TEXTURE_BACKGROUND");
            List list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                for (Object obj2 : list) {
                    if (obj2 instanceof wjt0.a) {
                        VideoTextureView videoTextureView = ((wjt0.a) obj2).a;
                        qj80.a(videoTextureView, new d(videoTextureView, (wjt0.a) obj2));
                    }
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }
}
