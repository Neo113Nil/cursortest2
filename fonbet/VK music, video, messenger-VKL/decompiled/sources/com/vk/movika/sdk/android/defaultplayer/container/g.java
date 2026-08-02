package com.vk.movika.sdk.android.defaultplayer.container;

import android.animation.Animator;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class g {
    public static final a Companion = new a();
    public final boolean a;
    public final boolean b;
    public ViewGroup c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final boolean e = true;
    public boolean f;
    public boolean g;
    public boolean h;

    public static final class a {
    }

    public g(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        PlaybackStateListener.PlaybackState playbackState = PlaybackStateListener.PlaybackState.IDLE;
    }

    public final void a(boolean z) {
        ViewGroup viewGroup = this.c;
        com.vk.movika.sdk.android.defaultplayer.container.b bVar = (com.vk.movika.sdk.android.defaultplayer.container.b) this;
        com.vk.movika.sdk.android.defaultplayer.view.b bVar2 = bVar.m.a;
        if (!this.b || !z || viewGroup == null || bVar2 == null) {
            if (viewGroup != null) {
                if (bVar2 != null) {
                    viewGroup.removeView(bVar2);
                }
                this.c = null;
            }
            this.d.removeCallbacksAndMessages(null);
            return;
        }
        Iterator it = bVar.n.iterator();
        while (it.hasNext()) {
            com.vk.movika.sdk.android.defaultplayer.control.a aVar = (com.vk.movika.sdk.android.defaultplayer.control.a) it.next();
            aVar.A0(null);
            if (aVar.s0()) {
                aVar.y0();
            }
        }
        bVar2.animate().setDuration(800L).setListener(new b()).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
    }

    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            g.this.a(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            g.this.a(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
