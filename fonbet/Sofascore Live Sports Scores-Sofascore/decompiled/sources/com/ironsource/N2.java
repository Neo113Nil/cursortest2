package com.ironsource;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.ironsource.C4190m1;
import com.ironsource.InterfaceC4136j1;
import com.ironsource.J8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import defpackage.n2d;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class N2 implements E2 {

    @NotNull
    private final J9 a;

    @NotNull
    private final C4036d8 b;

    @NotNull
    private final W1 c;

    @NotNull
    private final InterfaceC4262q1 d;

    @NotNull
    private final InterfaceC4165kc e;

    @NotNull
    private final InterfaceC4080fg f;

    @NotNull
    private final J8 g;

    @NotNull
    private final J8.a h;
    private final boolean i;

    @NotNull
    private BannerAdInfo j;

    @NotNull
    private WeakReference<O2> k;

    @Nullable
    private View.OnAttachStateChangeListener l;

    @NotNull
    private WeakReference<FrameLayout> m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            view.getClass();
            C4000b8 size = N2.this.d().getSize();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size.c(), size.a(), 17);
            if (N2.this.i) {
                ViewParent parent = N2.this.d().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(N2.this.d());
                }
            }
            ((FrameLayout) view).addView(N2.this.d(), 0, layoutParams);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            view.getClass();
            ((FrameLayout) view).removeAllViews();
        }
    }

    public N2(@NotNull J9 j9, @NotNull C4036d8 c4036d8, @NotNull W1 w1, @NotNull InterfaceC4262q1 interfaceC4262q1, @NotNull InterfaceC4165kc interfaceC4165kc, @NotNull InterfaceC4080fg interfaceC4080fg, @NotNull J8 j8, @NotNull J8.a aVar, @NotNull InterfaceC4375w7 interfaceC4375w7) {
        j9.getClass();
        c4036d8.getClass();
        w1.getClass();
        interfaceC4262q1.getClass();
        interfaceC4165kc.getClass();
        interfaceC4080fg.getClass();
        j8.getClass();
        aVar.getClass();
        interfaceC4375w7.getClass();
        this.a = j9;
        this.b = c4036d8;
        this.c = w1;
        this.d = interfaceC4262q1;
        this.e = interfaceC4165kc;
        this.f = interfaceC4080fg;
        this.g = j8;
        this.h = aVar;
        this.i = interfaceC4375w7.n();
        String f = j9.f();
        f.getClass();
        String e = j9.e();
        e.getClass();
        this.j = new BannerAdInfo(f, e);
        this.k = new WeakReference<>(null);
        this.m = new WeakReference<>(null);
        Ic ic = new Ic();
        j9.a(ic);
        ic.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(N2 n2) {
        n2.getClass();
        O2 o2 = n2.k.get();
        if (o2 != null) {
            o2.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(N2 n2) {
        n2.getClass();
        O2 o2 = n2.k.get();
        if (o2 != null) {
            o2.onBannerAdShown();
        }
    }

    public final void a(@NotNull BannerAdInfo bannerAdInfo) {
        bannerAdInfo.getClass();
        this.j = bannerAdInfo;
    }

    public final void b(@NotNull WeakReference<FrameLayout> weakReference) {
        FrameLayout frameLayout;
        weakReference.getClass();
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

    public final void finalize() {
        b();
    }

    @Override // com.ironsource.E2
    public void onBannerClick() {
        InterfaceC4136j1.a.a.a().a(this.d);
        this.f.a(new n2d(this, 1));
    }

    @Override // com.ironsource.E2
    public void onBannerShowSuccess() {
        J8 j8 = this.g;
        IronSource.a aVar = IronSource.a.BANNER;
        InterfaceC4136j1.a.a.f(new C4190m1.w(j8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onBannerShowSuccess");
        this.f.a(new n2d(this, 0));
    }

    @NotNull
    public final WeakReference<O2> e() {
        return this.k;
    }

    @NotNull
    public final WeakReference<FrameLayout> f() {
        return this.m;
    }

    public final void a(@NotNull WeakReference<O2> weakReference) {
        weakReference.getClass();
        this.k = weakReference;
    }

    private final a a() {
        return new a();
    }

    @NotNull
    public final BannerAdInfo c() {
        return this.j;
    }

    @NotNull
    public final C4036d8 d() {
        return this.b;
    }

    public final void b() {
        InterfaceC4080fg.a(this.f, new n2d(this, 2), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(N2 n2) {
        n2.getClass();
        InterfaceC4136j1.d.a.b().a(n2.d);
        n2.e.a(n2.a);
    }

    public /* synthetic */ N2(J9 j9, C4036d8 c4036d8, W1 w1, InterfaceC4262q1 interfaceC4262q1, InterfaceC4165kc interfaceC4165kc, InterfaceC4080fg interfaceC4080fg, J8 j8, J8.a aVar, InterfaceC4375w7 interfaceC4375w7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, c4036d8, w1, interfaceC4262q1, (i & 16) != 0 ? new C4183lc() : interfaceC4165kc, (i & 32) != 0 ? O7.a : interfaceC4080fg, (i & 64) != 0 ? Ib.v.d().s() : j8, (i & 128) != 0 ? Ib.v.a().i() : aVar, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? Ib.v.d().h() : interfaceC4375w7);
    }
}
