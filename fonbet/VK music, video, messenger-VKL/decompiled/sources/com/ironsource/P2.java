package com.ironsource;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C4467o1;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;
import xsna.rc4;
import xsna.sc4;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class P2 implements G2 {
    private final K9 a;
    private final C4331g8 b;
    private final Y1 c;
    private final InterfaceC4538s1 d;
    private final InterfaceC4424lc e;
    private final InterfaceC4357hg f;
    private final M8 g;
    private final M8.a h;
    private final boolean i;
    private BannerAdInfo j;
    private WeakReference<Q2> k;
    private View.OnAttachStateChangeListener l;
    private WeakReference<FrameLayout> m;

    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C4295e8 size = P2.this.d().getSize();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size.c(), size.a(), 17);
            if (P2.this.i) {
                ViewParent parent = P2.this.d().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(P2.this.d());
                }
            }
            ((FrameLayout) view).addView(P2.this.d(), 0, layoutParams);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ((FrameLayout) view).removeAllViews();
        }
    }

    public P2(K9 k9, C4331g8 c4331g8, Y1 y1, InterfaceC4538s1 interfaceC4538s1, InterfaceC4424lc interfaceC4424lc, InterfaceC4357hg interfaceC4357hg, M8 m8, M8.a aVar, A7 a7) {
        this.a = k9;
        this.b = c4331g8;
        this.c = y1;
        this.d = interfaceC4538s1;
        this.e = interfaceC4424lc;
        this.f = interfaceC4357hg;
        this.g = m8;
        this.h = aVar;
        this.i = a7.m();
        this.j = new BannerAdInfo(k9.f(), k9.e());
        this.k = new WeakReference<>(null);
        this.m = new WeakReference<>(null);
        Jc jc = new Jc();
        k9.a(jc);
        jc.a(this);
    }

    public final void b(WeakReference<FrameLayout> weakReference) {
        FrameLayout frameLayout;
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.l;
        if (onAttachStateChangeListener != null && (frameLayout = this.m.get()) != null) {
            frameLayout.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.m = weakReference;
        a a2 = a();
        this.l = a2;
        FrameLayout frameLayout2 = weakReference.get();
        if (frameLayout2 != null) {
            frameLayout2.addOnAttachStateChangeListener(a2);
        }
    }

    public final BannerAdInfo c() {
        return this.j;
    }

    public final C4331g8 d() {
        return this.b;
    }

    public final void finalize() {
        b();
    }

    @Override // com.ironsource.G2
    public void onBannerClick() {
        InterfaceC4413l1.a.a.a().a(this.d);
        this.f.a(new sc4(this, 10));
    }

    @Override // com.ironsource.G2
    public void onBannerShowSuccess() {
        M8 m8 = this.g;
        IronSource.a aVar = IronSource.a.BANNER;
        InterfaceC4413l1.a.a.f(new C4467o1.w(m8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onBannerShowSuccess");
        this.f.a(new rc4(this, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(P2 p2) {
        Q2 q2 = p2.k.get();
        if (q2 != null) {
            q2.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(P2 p2) {
        Q2 q2 = p2.k.get();
        if (q2 != null) {
            q2.onBannerAdShown();
        }
    }

    public final void a(BannerAdInfo bannerAdInfo) {
        this.j = bannerAdInfo;
    }

    public final WeakReference<Q2> e() {
        return this.k;
    }

    public final WeakReference<FrameLayout> f() {
        return this.m;
    }

    public final void a(WeakReference<Q2> weakReference) {
        this.k = weakReference;
    }

    private final a a() {
        return new a();
    }

    public final void b() {
        InterfaceC4357hg.a(this.f, new xsna.o4(this, 15), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(P2 p2) {
        InterfaceC4413l1.d.a.b().a(p2.d);
        p2.e.a(p2.a);
    }

    public /* synthetic */ P2(K9 k9, C4331g8 c4331g8, Y1 y1, InterfaceC4538s1 interfaceC4538s1, InterfaceC4424lc interfaceC4424lc, InterfaceC4357hg interfaceC4357hg, M8 m8, M8.a aVar, A7 a7, int i, zcl zclVar) {
        this(k9, c4331g8, y1, interfaceC4538s1, (i & 16) != 0 ? new C4442mc() : interfaceC4424lc, (i & 32) != 0 ? R7.a : interfaceC4357hg, (i & 64) != 0 ? Kb.u.d().s() : m8, (i & 128) != 0 ? Kb.u.a().i() : aVar, (i & 256) != 0 ? Kb.u.d().h() : a7);
    }
}
