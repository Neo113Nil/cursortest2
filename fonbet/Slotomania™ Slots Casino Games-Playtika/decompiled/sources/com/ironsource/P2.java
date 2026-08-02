package com.ironsource;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C2571o1;
import com.ironsource.InterfaceC2517l1;
import com.ironsource.L8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class P2 implements G2 {
    private final J9 a;
    private final C2417f8 b;
    private final Y1 c;
    private final InterfaceC2642s1 d;
    private final InterfaceC2510kc e;
    private final InterfaceC2371cg f;
    private final L8 g;
    private final L8.a h;
    private final boolean i;
    private BannerAdInfo j;
    private WeakReference<Q2> k;
    private View.OnAttachStateChangeListener l;
    private WeakReference<FrameLayout> m;

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            C2381d8 size = P2.this.d().getSize();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size.c(), size.a(), 17);
            if (P2.this.i) {
                ViewParent parent = P2.this.d().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(P2.this.d());
                }
            }
            ((FrameLayout) v).addView(P2.this.d(), 0, layoutParams);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            ((FrameLayout) v).removeAllViews();
        }
    }

    public P2(J9 adInstance, C2417f8 container, Y1 auctionDataReporter, InterfaceC2642s1 analytics, InterfaceC2510kc networkDestroyAPI, InterfaceC2371cg threadManager, L8 sessionDepthService, L8.a sessionDepthServiceEditor, InterfaceC2774z7 epService) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(epService, "epService");
        this.a = adInstance;
        this.b = container;
        this.c = auctionDataReporter;
        this.d = analytics;
        this.e = networkDestroyAPI;
        this.f = threadManager;
        this.g = sessionDepthService;
        this.h = sessionDepthServiceEditor;
        this.i = epService.m();
        String f = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(f, "adInstance.instanceId");
        String e = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        this.j = new BannerAdInfo(f, e);
        this.k = new WeakReference<>(null);
        this.m = new WeakReference<>(null);
        Ic ic = new Ic();
        adInstance.a(ic);
        ic.a(this);
    }

    public final void b(WeakReference<FrameLayout> value) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(value, "value");
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.l;
        if (onAttachStateChangeListener != null && (frameLayout = this.m.get()) != null) {
            frameLayout.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.m = value;
        a a2 = a();
        this.l = a2;
        FrameLayout frameLayout2 = value.get();
        if (frameLayout2 != null) {
            frameLayout2.addOnAttachStateChangeListener(a2);
        }
    }

    public final BannerAdInfo c() {
        return this.j;
    }

    public final C2417f8 d() {
        return this.b;
    }

    public final WeakReference<Q2> e() {
        return this.k;
    }

    public final WeakReference<FrameLayout> f() {
        return this.m;
    }

    protected final void finalize() {
        b();
    }

    @Override // com.ironsource.G2
    public void onBannerClick() {
        InterfaceC2517l1.a.a.a().a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                P2.c(P2.this);
            }
        });
    }

    @Override // com.ironsource.G2
    public void onBannerShowSuccess() {
        L8 l8 = this.g;
        IronSource.a aVar = IronSource.a.BANNER;
        InterfaceC2517l1.a.a.f(new C2571o1.w(l8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onBannerShowSuccess");
        this.f.a(new Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                P2.d(P2.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(P2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Q2 q2 = this$0.k.get();
        if (q2 != null) {
            q2.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(P2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Q2 q2 = this$0.k.get();
        if (q2 != null) {
            q2.onBannerAdShown();
        }
    }

    public final void a(BannerAdInfo bannerAdInfo) {
        Intrinsics.checkNotNullParameter(bannerAdInfo, "<set-?>");
        this.j = bannerAdInfo;
    }

    public final void a(WeakReference<Q2> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.k = weakReference;
    }

    private final a a() {
        return new a();
    }

    public final void b() {
        InterfaceC2371cg.a(this.f, new Runnable() { // from class: com.ironsource.P2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                P2.b(P2.this);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(P2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC2517l1.d.a.b().a(this$0.d);
        this$0.e.a(this$0.a);
    }

    public /* synthetic */ P2(J9 j9, C2417f8 c2417f8, Y1 y1, InterfaceC2642s1 interfaceC2642s1, InterfaceC2510kc interfaceC2510kc, InterfaceC2371cg interfaceC2371cg, L8 l8, L8.a aVar, InterfaceC2774z7 interfaceC2774z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, c2417f8, y1, interfaceC2642s1, (i & 16) != 0 ? new C2528lc() : interfaceC2510kc, (i & 32) != 0 ? Q7.a : interfaceC2371cg, (i & 64) != 0 ? Jb.u.d().s() : l8, (i & 128) != 0 ? Jb.u.a().i() : aVar, (i & 256) != 0 ? Jb.u.d().h() : interfaceC2774z7);
    }
}
