package com.vk.im.ui.views.msg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.messages.MsgSyncState;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.biq;
import xsna.bpn0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.dnp0;
import xsna.e3m;
import xsna.f1;
import xsna.f4m;
import xsna.g6b;
import xsna.m33;
import xsna.ng1;
import xsna.on;
import xsna.s3q0;
import xsna.too0;
import xsna.wra;
import xsna.xuo0;
import xsna.yc;
import xsna.zmp0;

/* compiled from: BombView.kt */
/* loaded from: classes2.dex */
public final class BombView extends FrameLayout implements too0 {
    public static final /* synthetic */ int v = 0;
    public final Drawable b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final int f;
    public final int g;
    public long h;
    public long i;
    public MsgSyncState j;
    public boolean k;
    public final Handler l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final dnp0 q;
    public final dnp0 r;
    public final g6b s;
    public c t;
    public int u;

    /* compiled from: BombView.kt */
    public static final class a {
        public final View a;
        public final ObjectAnimator b;

        /* compiled from: BombView.kt */
        /* renamed from: com.vk.im.ui.views.msg.BombView$a$a, reason: collision with other inner class name */
        public static final class C1182a extends AnimatorListenerAdapter {
            public C1182a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                a.this.a.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                a.this.a.setAlpha(1.0f);
            }
        }

        public a(View view) {
            this.a = view;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ofFloat.addListener(new C1182a());
            this.b = ofFloat;
        }
    }

    /* compiled from: BombView.kt */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = BombView.v;
            BombView.this.e(true);
        }
    }

    /* compiled from: BombView.kt */
    public interface c {
        void a(int i);
    }

    /* compiled from: BombView.kt */
    public final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int f;
            BombView bombView = BombView.this;
            long remainTimeMs = bombView.getRemainTimeMs();
            TextView textView = bombView.e;
            int i = bombView.f;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int i2 = timeUnit.toSeconds(remainTimeMs) <= 10 ? 3 : timeUnit.toSeconds(remainTimeMs) <= 60 ? 2 : 1;
            if (bombView.u != i2) {
                if (i2 == 2) {
                    bombView.f();
                    f = e3m.f(i, bombView.getContext());
                } else if (i2 != 3) {
                    bombView.f();
                    f = e3m.f(bombView.g, bombView.getContext());
                } else {
                    BombView.c(bombView);
                    f = e3m.f(i, bombView.getContext());
                }
                textView.setTextColor(f);
                bombView.b.setTint(f);
                c cVar = bombView.t;
                if (cVar != null) {
                    cVar.a(i2);
                }
            }
            bombView.u = i2;
            if (bombView.k) {
                textView.setText(bombView.s.e(bombView.getRemainTimeMs()));
            }
            bombView.l.postDelayed(this, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    /* compiled from: BombView.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgSyncState.values().length];
            try {
                iArr[MsgSyncState.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BombView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e3m.a aVar = e3m.a;
        Drawable mutate = m33.a(R.drawable.bomb_outline_12, context).mutate();
        this.b = mutate;
        View inflate = e3m.b(context).inflate(R.layout.vkim_msg_bomb_view, (ViewGroup) this, false);
        this.c = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.bomb);
        this.d = imageView;
        this.e = (TextView) inflate.findViewById(R.id.time);
        this.f = R.attr.vk_legacy_destructive;
        this.g = R.attr.vk_legacy_text_secondary;
        this.j = MsgSyncState.DONE;
        this.l = new Handler(Looper.getMainLooper());
        this.m = new bpn0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 9));
        int i = 8;
        this.n = new bpn0(new f1(this, i));
        this.o = new bpn0(new ng1(this, i));
        this.p = new bpn0(new yc(this, 11));
        dnp0 dnp0Var = new dnp0();
        dnp0Var.c(new biq(1));
        dnp0Var.c(new wra().setInterpolator(new AccelerateInterpolator()));
        dnp0Var.c(new biq(2));
        dnp0Var.e(120L);
        dnp0Var.g(0);
        this.q = dnp0Var;
        dnp0 dnp0Var2 = new dnp0();
        dnp0Var2.c(new biq(1));
        dnp0Var2.c(new wra().setInterpolator(new DecelerateInterpolator()));
        dnp0Var2.c(new biq(2));
        dnp0Var2.e(120L);
        dnp0Var2.g(0);
        this.r = dnp0Var2;
        this.s = new g6b(context);
        if (attributeSet != null) {
            this.f = dhr0.B("bv_accentColor", attributeSet);
            this.g = dhr0.B("bv_normalColor", attributeSet);
        }
        addView(inflate);
        imageView.setImageDrawable(mutate);
        bwt0.i0(this, new on(this, 7));
    }

    public static s3q0 a(BombView bombView) {
        Handler handler = bombView.l;
        handler.removeCallbacks(bombView.getCollapseTask());
        if (bombView.k) {
            bombView.e(true);
        } else {
            bombView.k = true;
            TextView textView = bombView.e;
            textView.setText(bombView.s.e(bombView.getRemainTimeMs()));
            zmp0.a(bombView, bombView.q);
            bwt0.p0(bombView.d, false);
            bwt0.p0(textView, true);
            handler.postDelayed(bombView.getCollapseTask(), TimeUnit.SECONDS.toMillis(4L));
        }
        return s3q0.a;
    }

    public static final void c(BombView bombView) {
        ObjectAnimator objectAnimator = bombView.getTimeBlinkAnimator().b;
        objectAnimator.setDuration(800L);
        objectAnimator.start();
        ObjectAnimator objectAnimator2 = bombView.getBombBlinkAnimator().b;
        objectAnimator2.setDuration(800L);
        objectAnimator2.start();
    }

    private final a getBombBlinkAnimator() {
        return (a) this.p.getValue();
    }

    private final b getCollapseTask() {
        return (b) this.n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getRemainTimeMs() {
        long j = this.i;
        if (e.$EnumSwitchMapping$0[this.j.ordinal()] != 1) {
            return j;
        }
        long j2 = this.h + j;
        xuo0.a.getClass();
        return j2 - xuo0.a();
    }

    private final a getTimeBlinkAnimator() {
        return (a) this.o.getValue();
    }

    private final d getTimerTickTask() {
        return (d) this.m.getValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        if (f4m.g(this.c)) {
            return;
        }
        this.l.removeCallbacksAndMessages(null);
        this.u = 0;
        getTimerTickTask().run();
    }

    public final void d(long j, Long l, MsgSyncState msgSyncState) {
        if (l == null) {
            bwt0.p0(this.c, false);
            return;
        }
        this.i = l.longValue();
        this.j = msgSyncState;
        this.h = j;
        e(false);
        this.l.removeCallbacksAndMessages(null);
        getTimerTickTask().run();
    }

    public final void e(boolean z) {
        this.k = false;
        TextView textView = this.e;
        ImageView imageView = this.d;
        if (!z) {
            bwt0.p0(textView, false);
            bwt0.p0(imageView, true);
        } else {
            zmp0.a(this, this.r);
            bwt0.p0(imageView, true);
            bwt0.p0(textView, false);
        }
    }

    public final void f() {
        a timeBlinkAnimator = getTimeBlinkAnimator();
        timeBlinkAnimator.b.cancel();
        timeBlinkAnimator.a.setAlpha(1.0f);
        a bombBlinkAnimator = getBombBlinkAnimator();
        bombBlinkAnimator.b.cancel();
        bombBlinkAnimator.a.setAlpha(1.0f);
    }

    public final int getCurrentState() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (bwt0.K(this)) {
            getTimerTickTask().run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
        this.u = 0;
        this.l.removeCallbacksAndMessages(null);
    }

    public final void setBombGravity(int i) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).gravity = i;
    }

    public final void setStateListener(c cVar) {
        this.t = cVar;
    }
}
