package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcni;
import com.google.android.gms.internal.ads.zzdgq;
import com.google.android.gms.internal.ads.zzdxg;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sofascore.results.R;
import com.sofascore.results.chat.view.ChatMessageInputView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sa0 implements kpd, sti, tti, zzn, zzcni {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public sa0(hkj hkjVar, qaj qajVar) {
        this.a = 8;
        this.b = hkjVar;
    }

    @Override // defpackage.tti
    public void A(nr9 nr9Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                ChatMessageInputView chatMessageInputView = (ChatMessageInputView) obj;
                ((ImageView) chatMessageInputView.d.h).post(new a8p(3, chatMessageInputView, nr9Var));
                break;
            default:
                hkj hkjVar = (hkj) obj;
                hkjVar.j = rfo.O(nr9Var);
                hkjVar.invalidateSelf();
                break;
        }
    }

    @Override // defpackage.tti
    public void D(nr9 nr9Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                ((ChatMessageInputView) obj).p();
                break;
            default:
                if (nr9Var != null) {
                    Resources resources = ((hkj) obj).a.getResources();
                    resources.getClass();
                    rfo.t(nr9Var, resources);
                }
                Unit unit = Unit.a;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        x9l x9lVar2;
        boolean z;
        boolean z2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                x9lVar2 = appBarLayout.getFitsSystemWindows() ? x9lVar : null;
                if (!Objects.equals(appBarLayout.g, x9lVar2)) {
                    appBarLayout.g = x9lVar2;
                    if (appBarLayout.x != null && appBarLayout.getTopInset() > 0) {
                        r5 = 1;
                    }
                    appBarLayout.setWillNotDraw(r5 ^ 1);
                    appBarLayout.requestLayout();
                }
                return x9lVar;
            case 1:
                int d = x9lVar.d();
                ub0 ub0Var = (ub0) obj;
                Context context = ub0Var.k;
                int d2 = x9lVar.d();
                ActionBarContextView actionBarContextView = ub0Var.u;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    z = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ub0Var.u.getLayoutParams();
                    if (ub0Var.u.isShown()) {
                        if (ub0Var.c0 == null) {
                            ub0Var.c0 = new Rect();
                            ub0Var.d0 = new Rect();
                        }
                        Rect rect = ub0Var.c0;
                        Rect rect2 = ub0Var.d0;
                        rect.set(x9lVar.b(), x9lVar.d(), x9lVar.c(), x9lVar.a());
                        ViewGroup viewGroup = ub0Var.A;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean z3 = lvk.a;
                            jvk.a(viewGroup, rect, rect2);
                        } else {
                            if (!lvk.a) {
                                lvk.a = true;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    lvk.b = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        lvk.b.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException unused) {
                                }
                            }
                            Method method = lvk.b;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        int i2 = rect.top;
                        int i3 = rect.left;
                        int i4 = rect.right;
                        ViewGroup viewGroup2 = ub0Var.A;
                        WeakHashMap weakHashMap = bsk.a;
                        x9l a = trk.a(viewGroup2);
                        int b = a == null ? 0 : a.b();
                        int c = a == null ? 0 : a.c();
                        if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                            z2 = false;
                        } else {
                            marginLayoutParams.topMargin = i2;
                            marginLayoutParams.leftMargin = i3;
                            marginLayoutParams.rightMargin = i4;
                            z2 = true;
                        }
                        if (i2 <= 0 || ub0Var.C != null) {
                            View view2 = ub0Var.C;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i5 = marginLayoutParams2.height;
                                int i6 = marginLayoutParams.topMargin;
                                if (i5 != i6 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                                    marginLayoutParams2.height = i6;
                                    marginLayoutParams2.leftMargin = b;
                                    marginLayoutParams2.rightMargin = c;
                                    ub0Var.C.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context);
                            ub0Var.C = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = b;
                            layoutParams.rightMargin = c;
                            ub0Var.A.addView(ub0Var.C, -1, layoutParams);
                        }
                        View view4 = ub0Var.C;
                        r4 = view4 != null;
                        if (r4 && view4.getVisibility() != 0) {
                            View view5 = ub0Var.C;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                        }
                        if (!ub0Var.H && r4) {
                            d2 = 0;
                        }
                        z = r4;
                        r4 = z2;
                    } else if (marginLayoutParams.topMargin != 0) {
                        marginLayoutParams.topMargin = 0;
                        z = false;
                    } else {
                        z = false;
                        r4 = false;
                    }
                    if (r4) {
                        ub0Var.u.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = ub0Var.C;
                if (view6 != null) {
                    view6.setVisibility(z ? 0 : 8);
                }
                return bsk.l(view, d != d2 ? x9lVar.f(x9lVar.b(), d2, x9lVar.c(), x9lVar.a()) : x9lVar);
            case 2:
            case 5:
            default:
                u9l u9lVar = x9lVar.a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!Objects.equals(coordinatorLayout.n, x9lVar)) {
                    coordinatorLayout.n = x9lVar;
                    boolean z4 = x9lVar.d() > 0;
                    coordinatorLayout.o = z4;
                    coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
                    if (!u9lVar.s()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (r5 < childCount) {
                            View childAt = coordinatorLayout.getChildAt(r5);
                            WeakHashMap weakHashMap2 = bsk.a;
                            if (!childAt.getFitsSystemWindows() || ((xs3) childAt.getLayoutParams()).a == null || !u9lVar.s()) {
                                r5++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return x9lVar;
            case 3:
                n71 n71Var = (n71) obj;
                n71Var.n = x9lVar.a();
                n71Var.o = x9lVar.b();
                n71Var.p = x9lVar.c();
                n71Var.k();
                return x9lVar;
            case 4:
                g02 g02Var = (g02) obj;
                f02 f02Var = g02Var.n;
                if (f02Var != null) {
                    g02Var.g.a0.remove(f02Var);
                }
                f02 f02Var2 = new f02(g02Var.j, x9lVar);
                g02Var.n = f02Var2;
                f02Var2.e(g02Var.getWindow());
                BottomSheetBehavior bottomSheetBehavior = g02Var.g;
                f02 f02Var3 = g02Var.n;
                ArrayList arrayList = bottomSheetBehavior.a0;
                if (!arrayList.contains(f02Var3)) {
                    arrayList.add(f02Var3);
                }
                return x9lVar;
            case 6:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) obj;
                x9lVar2 = collapsingToolbarLayout.getFitsSystemWindows() ? x9lVar : null;
                if (!Objects.equals(collapsingToolbarLayout.E, x9lVar2)) {
                    collapsingToolbarLayout.E = x9lVar2;
                    collapsingToolbarLayout.requestLayout();
                }
                return x9lVar.a.c();
        }
    }

    @Override // defpackage.sti
    public void j(Drawable drawable) {
        zj0 zj0Var = (zj0) this.b;
        zj0Var.l(new oj0(drawable != null ? zj0Var.k(drawable) : null));
    }

    @Override // defpackage.tti
    public void t(nr9 nr9Var) {
        switch (this.a) {
            case 5:
                break;
            default:
                hkj hkjVar = (hkj) this.b;
                hkjVar.j = nr9Var != null ? rfo.O(nr9Var) : null;
                hkjVar.invalidateSelf();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcni
    public /* synthetic */ void zza(boolean z, int i, String str, String str2) {
        zzclm zzclmVar = (zzclm) this.b;
        zzclmVar.zzJ();
        zzclmVar.zzP().q0();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public void zzdk() {
        zzdgq zzdgqVar = ((zzdxg) this.b).g;
        synchronized (zzdgqVar) {
            try {
                if (zzdgqVar.i) {
                    return;
                }
                ScheduledFuture scheduledFuture = zzdgqVar.j;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    zzdgqVar.g = -1L;
                } else {
                    zzdgqVar.j.cancel(false);
                    zzdgqVar.g = zzdgqVar.e - zzdgqVar.c.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = zzdgqVar.k;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    zzdgqVar.h = -1L;
                } else {
                    zzdgqVar.k.cancel(false);
                    zzdgqVar.h = zzdgqVar.f - zzdgqVar.c.elapsedRealtime();
                }
                zzdgqVar.i = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public void zzdl() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        zzdgq zzdgqVar = ((zzdxg) this.b).g;
        synchronized (zzdgqVar) {
            try {
                if (zzdgqVar.i) {
                    if (zzdgqVar.g > 0 && (scheduledFuture2 = zzdgqVar.j) != null && scheduledFuture2.isCancelled()) {
                        zzdgqVar.s0(zzdgqVar.g);
                    }
                    if (zzdgqVar.h > 0 && (scheduledFuture = zzdgqVar.k) != null && scheduledFuture.isCancelled()) {
                        zzdgqVar.t0(zzdgqVar.h);
                    }
                    zzdgqVar.i = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ sa0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void h(nr9 nr9Var) {
    }

    @Override // defpackage.sti
    public void I(Drawable drawable) {
    }

    @Override // defpackage.sti
    public void c(Drawable drawable) {
    }
}
