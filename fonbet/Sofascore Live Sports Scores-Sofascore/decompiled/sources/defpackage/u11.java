package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.adsbynimbus.google.DynamicPriceRenderer;
import com.adsbynimbus.google.GoogleAuctionData;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.firebase.AdConfig;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.firebase.BannerSize;
import com.sofascore.model.firebase.BaseAdUnit;
import com.sofascore.model.newNetwork.AffiliateBanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class u11 {
    public a11 A;
    public String B;
    public String C;
    public String D;
    public Integer E;
    public long F;
    public final ViewGroup a;
    public final FragmentActivity b;
    public final u6b c;
    public final Map d;
    public final fdi e;
    public final mqi f;
    public yda g;
    public yda h;
    public boolean i;
    public boolean j;
    public final e6b k;
    public AdManagerAdView l;
    public fcg m;
    public WebView n;
    public kf o;
    public lf p;
    public y01 q;
    public boolean r;
    public t11 s;
    public AdType.Banner t;
    public Integer u;
    public Long v;
    public ru w;
    public String x;
    public boolean y;
    public z01 z;

    public u11(ViewGroup viewGroup, FragmentActivity fragmentActivity, u6b u6bVar, Map map, Fragment fragment) {
        e6b e6bVar;
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = fragmentActivity;
        this.c = u6bVar;
        this.d = map;
        this.e = gdi.a(Boolean.TRUE);
        this.f = ypa.b(new tv0(7));
        String C = fc6.C();
        this.B = C;
        this.C = C;
        this.D = C;
        this.F = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        if (fragment != null) {
            e6b e6bVar2 = e6b.a;
            ad2 ad2Var = qv5.a;
            u6b viewLifecycleOwner = fragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            LinkedHashMap linkedHashMap = qv5.b;
            KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(i42.class);
            Object obj = linkedHashMap.get(orCreateKotlinClass);
            if (obj == null) {
                obj = beh.b(0, 0, null, 7);
                linkedHashMap.put(orCreateKotlinClass, obj);
            }
            xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new u1(viewLifecycleOwner, (b1d) obj, fragment, (rq3) null, this), 3);
            e6bVar = e6b.e;
            this.k = e6bVar;
        } else {
            e6bVar = e6b.d;
            this.k = e6bVar;
        }
        e6b e6bVar3 = e6bVar;
        LinkedHashMap linkedHashMap2 = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(q42.class);
        Object obj2 = linkedHashMap2.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap2.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(u6bVar.getLifecycle()), null, null, new o11(u6bVar, e6bVar3, (b1d) obj2, null, this, 0), 3);
        KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(p42.class);
        Object obj3 = linkedHashMap2.get(orCreateKotlinClass3);
        if (obj3 == null) {
            obj3 = beh.b(0, 0, null, 7);
            linkedHashMap2.put(orCreateKotlinClass3, obj3);
        }
        xw3.L(wca.x(u6bVar.getLifecycle()), null, null, new o11(u6bVar, e6bVar3, (b1d) obj3, null, this, 1), 3);
        u6bVar.getLifecycle().a(new b11(this));
        KClass orCreateKotlinClass4 = fufVar.getOrCreateKotlinClass(w42.class);
        Object obj4 = linkedHashMap2.get(orCreateKotlinClass4);
        if (obj4 == null) {
            obj4 = beh.b(0, 0, null, 7);
            linkedHashMap2.put(orCreateKotlinClass4, obj4);
        }
        xw3.L(wca.x(u6bVar.getLifecycle()), null, null, new o11(u6bVar, e6bVar3, (b1d) obj4, null, this, 2), 3);
    }

    public static /* synthetic */ AdSize e(u11 u11Var, int i, boolean z, int i2) {
        int i3 = (i2 & 1) != 0 ? 0 : 8;
        if ((i2 & 2) != 0) {
            i = 50;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return u11Var.d(i3, i, z);
    }

    public static String q(int i) {
        return i == 50 ? "affiliate_320x50" : ljg.j(i, "affiliate_300x");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object s(u11 u11Var, View view, Rect rect, Point point, sq3 sq3Var) {
        p11 p11Var;
        int i;
        fsf fsfVar;
        u11 u11Var2;
        View view2;
        fsf fsfVar2;
        fsf fsfVar3;
        Throwable th;
        u11 u11Var3;
        s11 s11Var;
        u11 u11Var4;
        View view3;
        ViewTreeObserver g;
        s11 s11Var2;
        ViewTreeObserver g2;
        s11 s11Var3;
        if (sq3Var instanceof p11) {
            p11Var = (p11) sq3Var;
            int i2 = p11Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p11Var.y = i2 - Integer.MIN_VALUE;
                Object obj = p11Var.w;
                lu3 lu3Var = lu3.a;
                i = p11Var.y;
                if (i != 0) {
                    y6a.M(obj);
                    if (u11Var.r || !view.isAttachedToWindow() || !view.getGlobalVisibleRect(rect, point)) {
                        fsf fsfVar4 = new fsf();
                        fsf fsfVar5 = new fsf();
                        fsfVar = new fsf();
                        try {
                            p11Var.r = u11Var;
                            p11Var.s = view;
                            p11Var.t = fsfVar4;
                            p11Var.u = fsfVar5;
                            p11Var.v = fsfVar;
                            p11Var.y = 1;
                            lj2 lj2Var = new lj2(1, z9a.b(p11Var));
                            lj2Var.t();
                            u11Var2 = u11Var;
                            view2 = view;
                            try {
                                fsfVar4.a = new q11(u11Var2, lj2Var, view2, rect, point);
                                fsfVar5.a = new r11(u11Var2, lj2Var, view2, rect, point);
                                s11Var = new s11(u11Var2, lj2Var, view2, rect, point);
                                fsfVar.a = s11Var;
                                u11Var2.s = new t11(u11Var2, lj2Var, view2, rect, point);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                ee3.a.add(s11Var);
                                ViewTreeObserver g3 = u11Var2.g();
                                if (g3 != null) {
                                    g3.addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) fsfVar5.a);
                                }
                                view2.addOnLayoutChangeListener((View.OnLayoutChangeListener) fsfVar4.a);
                                if (lj2Var.q() == lu3Var) {
                                    return lu3Var;
                                }
                                fsfVar2 = fsfVar4;
                                fsfVar3 = fsfVar5;
                                u11Var4 = u11Var2;
                                view3 = view2;
                            } catch (Throwable th3) {
                                th = th3;
                                fsfVar2 = fsfVar4;
                                fsfVar3 = fsfVar5;
                                th = th;
                                u11Var3 = u11Var2;
                                g = u11Var3.g();
                                if (g != null) {
                                }
                                view2.removeOnLayoutChangeListener((View.OnLayoutChangeListener) fsfVar2.a);
                                s11Var2 = (s11) fsfVar.a;
                                if (s11Var2 != null) {
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            u11Var2 = u11Var;
                            view2 = view;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fsf fsfVar6 = p11Var.v;
                fsfVar3 = p11Var.u;
                fsfVar2 = p11Var.t;
                view3 = p11Var.s;
                u11 u11Var5 = p11Var.r;
                try {
                    y6a.M(obj);
                    fsfVar = fsfVar6;
                    u11Var4 = u11Var5;
                } catch (Throwable th5) {
                    th = th5;
                    fsfVar = fsfVar6;
                    view2 = view3;
                    u11Var3 = u11Var5;
                    g = u11Var3.g();
                    if (g != null) {
                        g.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) fsfVar3.a);
                    }
                    view2.removeOnLayoutChangeListener((View.OnLayoutChangeListener) fsfVar2.a);
                    s11Var2 = (s11) fsfVar.a;
                    if (s11Var2 != null) {
                        throw th;
                    }
                    ee3.a.remove(s11Var2);
                    throw th;
                }
                g2 = u11Var4.g();
                if (g2 != null) {
                    g2.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) fsfVar3.a);
                }
                view3.removeOnLayoutChangeListener((View.OnLayoutChangeListener) fsfVar2.a);
                s11Var3 = (s11) fsfVar.a;
                if (s11Var3 != null) {
                    ee3.a.remove(s11Var3);
                }
                return Unit.a;
            }
        }
        p11Var = new p11(u11Var, sq3Var);
        Object obj2 = p11Var.w;
        lu3 lu3Var2 = lu3.a;
        i = p11Var.y;
        if (i != 0) {
        }
        g2 = u11Var4.g();
        if (g2 != null) {
        }
        view3.removeOnLayoutChangeListener((View.OnLayoutChangeListener) fsfVar2.a);
        s11Var3 = (s11) fsfVar.a;
        if (s11Var3 != null) {
        }
        return Unit.a;
    }

    public final void a() {
        ViewGroup viewGroup = this.a;
        if (viewGroup.getMinimumHeight() == 0) {
            return;
        }
        viewGroup.clearAnimation();
        ValueAnimator ofInt = ValueAnimator.ofInt(viewGroup.getMinimumHeight(), 0);
        ofInt.setDuration(500L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new s2(this, 2));
        ofInt.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (defpackage.n4o.y(1000, r0) == r13) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, fdi fdiVar, sq3 sq3Var) {
        c11 c11Var;
        int i;
        long j2;
        long j3;
        if (sq3Var instanceof c11) {
            c11Var = (c11) sq3Var;
            int i2 = c11Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c11Var.v = i2 - Integer.MIN_VALUE;
                Object obj = c11Var.t;
                lu3 lu3Var = lu3.a;
                i = c11Var.v;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    xhj.a.getClass();
                    xuc.a.getClass();
                    long b = xuc.b();
                    e11 e11Var = new e11(fdiVar, rq3Var, 0);
                    c11Var.r = j;
                    c11Var.s = b;
                    c11Var.v = 1;
                    if (wba.W(j, e11Var, c11Var) != lu3Var) {
                        j2 = j;
                        j3 = b;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = c11Var.s;
                j2 = c11Var.r;
                y6a.M(obj);
                if (xd5.c(xd5.h(j2, whj.b(j3)), wkn.R(100, be5.MILLISECONDS)) > 0) {
                    return Unit.a;
                }
                c11Var.r = j2;
                c11Var.s = j3;
                c11Var.v = 2;
            }
        }
        c11Var = new c11(this, sq3Var);
        Object obj2 = c11Var.t;
        lu3 lu3Var2 = lu3.a;
        i = c11Var.v;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        if (xd5.c(xd5.h(j2, whj.b(j3)), wkn.R(100, be5.MILLISECONDS)) > 0) {
        }
    }

    public final void c() {
        this.q = null;
        yda ydaVar = this.g;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        yda ydaVar2 = this.h;
        if (ydaVar2 != null) {
            ydaVar2.e(null);
        }
        this.s = null;
        p();
        l(false);
        AdManagerAdView adManagerAdView = this.l;
        ViewGroup viewGroup = this.a;
        if (adManagerAdView != null) {
            adManagerAdView.setVisibility(8);
            adManagerAdView.setOnPaidEventListener(null);
            adManagerAdView.setAdListener(new f11());
            viewGroup.removeAllViews();
            adManagerAdView.destroy();
            this.l = null;
        }
        fcg fcgVar = this.m;
        if (fcgVar != null) {
            fcgVar.setVisibility(8);
            viewGroup.removeAllViews();
            fcgVar.setBannerListener(null);
            fcgVar.d();
            this.m = null;
        }
        viewGroup.removeAllViews();
        WebView webView = this.n;
        if (webView != null) {
            webView.destroy();
        }
        this.n = null;
    }

    public final AdSize d(int i, int i2, boolean z) {
        int i3;
        WindowManager windowManager;
        WindowMetrics currentWindowMetrics;
        int i4;
        int i5;
        FragmentActivity fragmentActivity = this.b;
        DisplayMetrics displayMetrics = fragmentActivity.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            FragmentActivity K = hkg.K(fragmentActivity);
            if (K == null || (windowManager = K.getWindowManager()) == null || (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) == null) {
                i3 = 0;
            } else {
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
                insetsIgnoringVisibility.getClass();
                int width = currentWindowMetrics.getBounds().width();
                i4 = insetsIgnoringVisibility.left;
                i5 = insetsIgnoringVisibility.right;
                i3 = (width - i4) - i5;
            }
        } else {
            DisplayMetrics displayMetrics2 = fragmentActivity.getResources().getDisplayMetrics();
            displayMetrics2.getClass();
            i3 = displayMetrics2.widthPixels;
        }
        int s = (int) ((i3 - (ao2.s(i, fragmentActivity) * 2)) / displayMetrics.density);
        if (z) {
            AdSize inlineAdaptiveBannerAdSize = AdSize.getInlineAdaptiveBannerAdSize(s, i2);
            inlineAdaptiveBannerAdSize.getClass();
            return inlineAdaptiveBannerAdSize;
        }
        AdSize inlineAdaptiveBannerAdSize2 = AdSize.getInlineAdaptiveBannerAdSize(s, i2);
        inlineAdaptiveBannerAdSize2.getClass();
        return inlineAdaptiveBannerAdSize2;
    }

    public final ViewGroup f() {
        AdManagerAdView adManagerAdView = this.l;
        if (adManagerAdView != null) {
            return adManagerAdView;
        }
        fcg fcgVar = this.m;
        return fcgVar != null ? fcgVar : this.n;
    }

    public final ViewTreeObserver g() {
        Window window;
        View decorView;
        View findViewById;
        FragmentActivity K = hkg.K(this.b);
        if (K == null || (window = K.getWindow()) == null || (decorView = window.getDecorView()) == null || (findViewById = decorView.findViewById(R.id.content)) == null) {
            return null;
        }
        return findViewById.getViewTreeObserver();
    }

    public final void h() {
        Long l;
        if (!this.y || (l = this.v) == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        String str = this.x;
        AdType.Banner banner = this.t;
        if (str != null && banner != null) {
            AdManagerAdView adManagerAdView = this.l;
            if (adManagerAdView != null) {
                adManagerAdView.pause();
            }
            l(true);
            String str2 = this.D;
            ru ruVar = this.w;
            if (ruVar == null) {
                ruVar = ru.GOOGLE;
            }
            WebView webView = this.n;
            Object tag = webView != null ? webView.getTag(com.sofascore.results.R.id.affiliate_name_tag) : null;
            String str3 = tag instanceof String ? (String) tag : null;
            FragmentActivity fragmentActivity = this.b;
            if (nv.v0(fragmentActivity)) {
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                if (str2 != null) {
                    firebaseBundle.putString("selection_id", str2);
                }
                firebaseBundle.putString("type", nv.y0(banner));
                firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, ruVar.a);
                firebaseBundle.putString("position", str);
                firebaseBundle.putLong("time_on_screen", currentTimeMillis);
                if (str3 != null) {
                    firebaseBundle.putString("name", str3);
                }
                nv.N(fragmentActivity, firebaseBundle, "ad_off_screen");
                nv.M(fragmentActivity, firebaseBundle, "ad_off_screen");
            }
        }
        this.y = false;
        this.v = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b6, code lost:
    
        if (r13 == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z) {
        boolean z2;
        int i;
        ArrayList arrayList;
        FragmentActivity fragmentActivity;
        WebView o;
        h();
        ViewGroup viewGroup = this.a;
        viewGroup.setVisibility(8);
        c();
        if (z) {
            AdType.Banner banner = this.t;
            Integer num = this.u;
            if (banner != null && num != null) {
                int intValue = num.intValue();
                ia0 ia0Var = ia0.q;
                if (!Intrinsics.c(ok3.p().e().getDataSharingOptOut(), Boolean.TRUE)) {
                    ru ruVar = ru.SOFASCORE;
                    this.w = ruVar;
                    this.x = q(intValue);
                    String str = this.B;
                    String q = q(intValue);
                    FragmentActivity fragmentActivity2 = this.b;
                    nv.f(fragmentActivity2, str, banner, ruVar, q, null, 96);
                    int width = e(this, 0, false, 6).getWidth();
                    y01 y01Var = new y01(this, banner, intValue, 0);
                    int i2 = 1;
                    y01 y01Var2 = new y01(this, banner, intValue, i2);
                    y01 y01Var3 = new y01(this, banner, intValue, 2);
                    if (bea.b) {
                        z2 = true;
                    } else {
                        try {
                            z2 = WebView.getCurrentWebViewPackage() != null;
                            bea.b = z2;
                        } catch (Exception unused) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        List list = f7a.f;
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (Object obj : list) {
                                int i3 = i2;
                                if (intValue == ((AffiliateBanner) obj).getHeight()) {
                                    arrayList.add(obj);
                                }
                                i2 = i3;
                            }
                            i = i2;
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                        } else {
                            i = 1;
                        }
                        List list2 = f7a.f;
                        if (list2 != null) {
                            arrayList = new ArrayList();
                            for (Object obj2 : list2) {
                                if (intValue > ((AffiliateBanner) obj2).getHeight()) {
                                    arrayList.add(obj2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : arrayList) {
                                AffiliateBanner affiliateBanner = (AffiliateBanner) obj3;
                                if (width >= affiliateBanner.getWidth() && affiliateBanner.getEnabled()) {
                                    arrayList2.add(obj3);
                                }
                            }
                            glf.a.getClass();
                            AffiliateBanner affiliateBanner2 = (AffiliateBanner) (arrayList2.isEmpty() ? null : CollectionsKt.U(glf.b.k(arrayList2.size()), arrayList2));
                            if (affiliateBanner2 != null) {
                                fragmentActivity = fragmentActivity2;
                                o = f7a.o(fragmentActivity, affiliateBanner2, this.a, y01Var, y01Var2, y01Var3);
                                if (o == null) {
                                    this.C = this.B;
                                    n(o);
                                    a();
                                    Integer num2 = this.u;
                                    if ((num2 != null ? num2.intValue() : 0) <= 50) {
                                        Integer num3 = this.u;
                                        AdSize d = d(8, num3 != null ? num3.intValue() : 0, false);
                                        AdSize adSize = AdSize.BANNER;
                                        adSize.getClass();
                                        AdSize[] adSizeArr = {d, adSize};
                                        int heightInPixels = adSizeArr[0].getHeightInPixels(fragmentActivity);
                                        int heightInPixels2 = adSizeArr[i].getHeightInPixels(fragmentActivity);
                                        if (heightInPixels < heightInPixels2) {
                                            heightInPixels = heightInPixels2;
                                        }
                                        int paddingBottom = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() + heightInPixels;
                                        this.E = Integer.valueOf(paddingBottom);
                                        viewGroup.setMinimumHeight(paddingBottom);
                                    }
                                    this.n = o;
                                    String str2 = this.C;
                                    ru ruVar2 = ru.SOFASCORE;
                                    String q2 = q(intValue);
                                    WebView webView = this.n;
                                    Object tag = webView != null ? webView.getTag(com.sofascore.results.R.id.affiliate_name_tag) : null;
                                    nv.e(fragmentActivity, str2, banner, ruVar2, q2, null, tag instanceof String ? (String) tag : null, null, 128);
                                } else {
                                    FragmentActivity fragmentActivity3 = fragmentActivity;
                                    this.E = 0;
                                    String str3 = this.B;
                                    ru ruVar3 = ru.SOFASCORE;
                                    String q3 = q(intValue);
                                    qu quVar = qu.LOAD;
                                    WebView webView2 = this.n;
                                    Object tag2 = webView2 != null ? webView2.getTag(com.sofascore.results.R.id.affiliate_name_tag) : null;
                                    nv.j(fragmentActivity3, str3, banner, ruVar3, q3, 1, "No fill", quVar, tag2 instanceof String ? (String) tag2 : null, null, 512);
                                }
                            }
                        }
                        fragmentActivity = fragmentActivity2;
                    } else {
                        fragmentActivity = fragmentActivity2;
                        i = 1;
                    }
                    o = null;
                    if (o == null) {
                    }
                }
            }
            this.h = xw3.L(wca.x(this.c.getLifecycle()), null, null, new g11(this, null), 3);
        }
    }

    public final void j(AdType.Banner banner) {
        ng ngVar;
        banner.getClass();
        String str = "ad_banner_" + banner.getLabel();
        ViewGroup viewGroup = this.a;
        viewGroup.setContentDescription(str);
        AdConfig f = it7.h.f(banner);
        rq3 rq3Var = null;
        AdConfig.Banner banner2 = f instanceof AdConfig.Banner ? (AdConfig.Banner) f : null;
        this.t = banner;
        int i = 0;
        if (banner2 == null) {
            i(false);
            return;
        }
        this.F = banner2.getRefreshSeconds() * 1000;
        this.u = Integer.valueOf(banner2.getHeight());
        if (this.i || this.j) {
            ia0 ia0Var = ia0.q;
            if (mz1.C()) {
                FragmentActivity fragmentActivity = this.b;
                if (z8e.O(fragmentActivity)) {
                    int i2 = 1;
                    if (!mx9.x(true)) {
                        BaseAdUnit.GamAdUnit nimbus = banner2.getAdUnit().getNimbus();
                        yea yeaVar = j58.a;
                        if (!j58.l(true)) {
                            nimbus = null;
                        }
                        if (nimbus != null) {
                            ngVar = new ng(banner2.getHeight(), banner2.getSize(), nimbus, banner);
                        } else {
                            BaseAdUnit.GamAdUnit gam = banner2.getAdUnit().getGam();
                            ngVar = gam != null ? new ng(banner2.getHeight(), banner2.getSize(), gam, banner) : null;
                        }
                        if (ngVar == null) {
                            i(false);
                            return;
                        }
                        if (this.l == null) {
                            c();
                            viewGroup.setVisibility(0);
                            int i3 = ngVar.a;
                            AdSize[] adSizeArr = i3 > 50 ? new AdSize[]{AdSize.MEDIUM_RECTANGLE} : new AdSize[]{AdSize.BANNER};
                            BannerSize bannerSize = ngVar.b;
                            if (bannerSize != BannerSize.STANDARD) {
                                adSizeArr = (AdSize[]) mh0.q(new AdSize[]{e(this, i3, bannerSize == BannerSize.ANCHORED_ADAPTIVE, 1)}, adSizeArr);
                            }
                            if (adSizeArr.length == 0) {
                                yhk.d();
                                return;
                            }
                            int heightInPixels = adSizeArr[0].getHeightInPixels(fragmentActivity);
                            int length = adSizeArr.length - 1;
                            if (1 <= length) {
                                int i4 = 1;
                                while (true) {
                                    int heightInPixels2 = adSizeArr[i4].getHeightInPixels(fragmentActivity);
                                    if (heightInPixels < heightInPixels2) {
                                        heightInPixels = heightInPixels2;
                                    }
                                    if (i4 == length) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            if (i3 <= 50) {
                                Integer num = this.E;
                                viewGroup.setMinimumHeight(num != null ? num.intValue() : viewGroup.getPaddingTop() + heightInPixels + viewGroup.getPaddingBottom());
                            } else {
                                viewGroup.setMinimumHeight(viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() + heightInPixels);
                            }
                            AdManagerAdView adManagerAdView = new AdManagerAdView(fragmentActivity.getApplicationContext());
                            adManagerAdView.setAdSizes((AdSize[]) Arrays.copyOf(adSizeArr, adSizeArr.length));
                            adManagerAdView.setAdUnitId(((BaseAdUnit.GamAdUnit) ngVar.c).getAdUnitId());
                            if (j58.l(true) || this.F != CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                                this.g = xw3.L(wca.x(this.c.getLifecycle()), null, null, new j11(this, new esf(), adManagerAdView, ngVar, ph0.v(adSizeArr, AdSize.MEDIUM_RECTANGLE) ? tm8.f : tm8.e, adSizeArr, null), 3);
                            } else {
                                m(adManagerAdView, ngVar.d, i3, null);
                            }
                            this.l = adManagerAdView;
                            return;
                        }
                        return;
                    }
                    BaseAdUnit.EquativAdUnit equativ = banner2.getAdUnit().getEquativ();
                    ng ngVar2 = equativ != null ? new ng(banner2.getHeight(), banner2.getSize(), equativ, banner) : null;
                    if (ngVar2 == null) {
                        i(false);
                        return;
                    }
                    if (this.m != null) {
                        return;
                    }
                    c();
                    viewGroup.setVisibility(0);
                    int i5 = ngVar2.a;
                    BaseAdUnit baseAdUnit = ngVar2.c;
                    Integer valueOf = Integer.valueOf(i5);
                    if (i5 <= 0) {
                        valueOf = null;
                    }
                    Integer valueOf2 = valueOf != null ? Integer.valueOf(ao2.s(valueOf.intValue(), fragmentActivity) + 8) : null;
                    ng ngVar3 = ngVar2;
                    Context applicationContext = fragmentActivity.getApplicationContext();
                    applicationContext.getClass();
                    fcg fcgVar = new fcg(applicationContext);
                    Integer num2 = -1;
                    int intValue = num2.intValue();
                    Integer valueOf3 = Integer.valueOf(i5);
                    if (i5 > 0) {
                        valueOf3 = null;
                    }
                    fcgVar.setLayoutParams(new LinearLayout.LayoutParams(intValue, valueOf3 != null ? valueOf3.intValue() : ao2.s(i5, fragmentActivity)));
                    Map map = this.d;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(entry.getKey() + U3.j.b + entry.getValue());
                    }
                    String f0 = CollectionsKt.f0(arrayList, ";", null, null, null, 62);
                    BaseAdUnit.EquativAdUnit equativAdUnit = (BaseAdUnit.EquativAdUnit) baseAdUnit;
                    long pageId = equativAdUnit.getPageId();
                    long formatId = equativAdUnit.getFormatId();
                    hbg hbgVar = new hbg(pageId, formatId, f0);
                    fcgVar.setBannerListener(new k11(valueOf2, this, ngVar3, hbgVar, fcgVar));
                    fcgVar.setDescendantFocusability(393216);
                    n(fcgVar);
                    String uuid = UUID.randomUUID().toString();
                    uuid.getClass();
                    this.B = uuid;
                    nv.f(fragmentActivity, uuid, ngVar3.d, ru.EQUATIV, String.valueOf(formatId), null, 96);
                    jeg jegVar = jeg.d;
                    hbgVar.toString();
                    jegVar.f(2);
                    fr7 fr7Var = new fr7(fcgVar, hbgVar, null);
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        myLooper = Looper.getMainLooper();
                    }
                    fcgVar.k = new Handler(myLooper);
                    yda ydaVar = fcgVar.h;
                    if (ydaVar != null && !ydaVar.t()) {
                        fcgVar.k.post(new zbg(fcgVar, i));
                    } else if (Intrinsics.c(fcgVar.l.getParent(), fcgVar)) {
                        fcgVar.d();
                        hs4 hs4Var = z45.a;
                        fcgVar.h = xw3.L(s9a.c(hq4.c), null, null, new gje(fcgVar, fr7Var, rq3Var, 22), 3);
                    } else {
                        fcgVar.k.post(new zbg(fcgVar, i2));
                    }
                    this.m = fcgVar;
                    return;
                }
            }
            i(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d7, code lost:
    
        if (defpackage.n4o.y(1000, r1) == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a8 -> B:18:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j, fdi fdiVar, sq3 sq3Var) {
        h11 h11Var;
        int i;
        long j2;
        ddi ddiVar;
        h11 h11Var2;
        long j3;
        long j4;
        if (sq3Var instanceof h11) {
            h11Var = (h11) sq3Var;
            int i2 = h11Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h11Var.x = i2 - Integer.MIN_VALUE;
                Object obj = h11Var.v;
                lu3 lu3Var = lu3.a;
                i = h11Var.x;
                int i3 = 1;
                int i4 = 2;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    j2 = j;
                    ddiVar = fdiVar;
                    h11Var2 = h11Var;
                    j3 = j2;
                    xd5.b.getClass();
                    if (xd5.c(j3, 0L) > 0) {
                    }
                    return Unit.a;
                }
                if (i == 1) {
                    long j5 = h11Var.s;
                    long j6 = h11Var.r;
                    ddiVar = h11Var.u;
                    y6a.M(obj);
                    j4 = j5;
                    j2 = j6;
                    xhj.a.getClass();
                    xuc.a.getClass();
                    long b = xuc.b();
                    e11 e11Var = new e11(ddiVar, rq3Var, i3);
                    h11Var.u = ddiVar;
                    h11Var.r = j2;
                    h11Var.s = j4;
                    h11Var.t = b;
                    h11Var.x = 2;
                    obj = wba.W(j4, e11Var, h11Var);
                    if (obj != lu3Var) {
                    }
                    return lu3Var;
                }
                if (i != 2) {
                    if (i == 3) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j7 = h11Var.t;
                j4 = h11Var.s;
                long j8 = h11Var.r;
                ddiVar = h11Var.u;
                y6a.M(obj);
                Boolean bool = (Boolean) obj;
                long h = xd5.h(j4, whj.b(j7));
                if (bool != null) {
                    if (xd5.c(h, wkn.R(100, be5.MILLISECONDS)) > 0) {
                        h11Var.u = null;
                        h11Var.r = j8;
                        h11Var.s = h;
                        h11Var.t = j7;
                        h11Var.x = 3;
                    }
                    return Unit.a;
                }
                h11Var2 = h11Var;
                j3 = h;
                j2 = j8;
                xd5.b.getClass();
                if (xd5.c(j3, 0L) > 0) {
                    d11 d11Var = new d11(i4, rq3Var, i4);
                    h11Var2.u = ddiVar;
                    h11Var2.r = j2;
                    h11Var2.s = j3;
                    h11Var2.x = 1;
                    if (rd0.z(ddiVar, d11Var, h11Var2) != lu3Var) {
                        h11Var = h11Var2;
                        j4 = j3;
                        xhj.a.getClass();
                        xuc.a.getClass();
                        long b2 = xuc.b();
                        e11 e11Var2 = new e11(ddiVar, rq3Var, i3);
                        h11Var.u = ddiVar;
                        h11Var.r = j2;
                        h11Var.s = j4;
                        h11Var.t = b2;
                        h11Var.x = 2;
                        obj = wba.W(j4, e11Var2, h11Var);
                        if (obj != lu3Var) {
                            j8 = j2;
                            j7 = b2;
                            Boolean bool2 = (Boolean) obj;
                            long h2 = xd5.h(j4, whj.b(j7));
                            if (bool2 != null) {
                            }
                        }
                    }
                    return lu3Var;
                }
                return Unit.a;
            }
        }
        h11Var = new h11(this, sq3Var);
        Object obj2 = h11Var.v;
        lu3 lu3Var2 = lu3.a;
        i = h11Var.x;
        int i32 = 1;
        int i42 = 2;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
    }

    public final void l(boolean z) {
        this.r = z;
        Boolean valueOf = Boolean.valueOf(!z);
        fdi fdiVar = this.e;
        fdiVar.getClass();
        fdiVar.m(null, valueOf);
        t11 t11Var = this.s;
        if (t11Var != null) {
            t11Var.invoke(Boolean.valueOf(z));
        }
    }

    public final void m(final AdManagerAdView adManagerAdView, AdType.Banner banner, int i, wcd wcdVar) {
        final GoogleAuctionData googleAuctionData = wcdVar != null ? new GoogleAuctionData(wcdVar) : null;
        adManagerAdView.setAdListener(new l11(adManagerAdView, i, this, banner, googleAuctionData));
        adManagerAdView.setOnPaidEventListener(new w01(this, banner, adManagerAdView, googleAuctionData));
        adManagerAdView.setAppEventListener(new AppEventListener() { // from class: x01
            @Override // com.google.android.gms.ads.admanager.AppEventListener
            public final void onAppEvent(String str, String str2) {
                GoogleAuctionData googleAuctionData2;
                str.getClass();
                str2.getClass();
                if (!DynamicPriceRenderer.handleEventForNimbus(AdManagerAdView.this, str, str2) || (googleAuctionData2 = googleAuctionData) == null) {
                    return;
                }
                googleAuctionData2.setNimbusWin(true);
            }
        });
        adManagerAdView.setDescendantFocusability(393216);
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        builder.setHttpTimeoutMillis(5000);
        for (Map.Entry entry : this.d.entrySet()) {
            builder.addCustomTargeting((String) entry.getKey(), (String) entry.getValue());
        }
        FragmentActivity fragmentActivity = this.b;
        pk.a(builder, fragmentActivity);
        if (wcdVar != null) {
            u09.a(builder, wcdVar, ocd.a);
        }
        if (!j58.l(true) && this.F == CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            this.B = fc6.C();
        }
        String str = this.B;
        ru ruVar = ru.GOOGLE;
        String adUnitId = adManagerAdView.getAdUnitId();
        adUnitId.getClass();
        nv.f(fragmentActivity, str, banner, ruVar, adUnitId, null, 96);
        adManagerAdView.loadAd(builder.build());
    }

    public final void n(View view) {
        WebView webView = this.n;
        if (webView != null) {
            webView.destroy();
        }
        ViewGroup viewGroup = this.a;
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        viewGroup.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a11] */
    public final void o(final View view) {
        p();
        this.z = new z01(0, this, view);
        this.A = new View.OnLayoutChangeListener() { // from class: a11
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                u11.this.r(view);
            }
        };
        ViewTreeObserver g = g();
        if (g != null) {
            g.addOnScrollChangedListener(this.z);
        }
        view.addOnLayoutChangeListener(this.A);
        r(view);
    }

    public final void p() {
        ViewTreeObserver g;
        z01 z01Var = this.z;
        if (z01Var != null && (g = g()) != null) {
            g.removeOnScrollChangedListener(z01Var);
        }
        this.z = null;
        a11 a11Var = this.A;
        if (a11Var != null) {
            AdManagerAdView adManagerAdView = this.l;
            if (adManagerAdView != null) {
                adManagerAdView.removeOnLayoutChangeListener(a11Var);
            }
            fcg fcgVar = this.m;
            if (fcgVar != null) {
                fcgVar.removeOnLayoutChangeListener(a11Var);
            }
        }
        this.A = null;
        h();
    }

    public final void r(View view) {
        boolean z;
        long j;
        String str;
        if (this.q != null) {
            if ((view.isShown() && view.isAttachedToWindow()) ? view.getGlobalVisibleRect(new Rect()) : false) {
                y01 y01Var = this.q;
                if (y01Var != null) {
                    y01Var.invoke();
                }
                this.q = null;
            }
        }
        if (view.isShown() && view.isAttachedToWindow()) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect) && rect.width() >= view.getWidth() && rect.height() >= view.getHeight()) {
                z = true;
                if (z || this.y) {
                    if (z && this.y) {
                        h();
                        return;
                    }
                }
                this.y = true;
                Long l = this.v;
                if (l != null) {
                    long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                    Long valueOf = Long.valueOf(currentTimeMillis);
                    if (currentTimeMillis <= 5) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        j = valueOf.longValue();
                        this.v = Long.valueOf(System.currentTimeMillis());
                        str = this.x;
                        AdType.Banner banner = this.t;
                        if (str != null || banner == null) {
                            return;
                        }
                        AdManagerAdView adManagerAdView = this.l;
                        if (adManagerAdView != null) {
                            adManagerAdView.resume();
                        }
                        l(false);
                        String str2 = this.C;
                        ru ruVar = this.w;
                        if (ruVar == null) {
                            ruVar = ru.GOOGLE;
                        }
                        WebView webView = this.n;
                        Object tag = webView != null ? webView.getTag(com.sofascore.results.R.id.affiliate_name_tag) : null;
                        String str3 = tag instanceof String ? (String) tag : null;
                        FragmentActivity fragmentActivity = this.b;
                        if (nv.v0(fragmentActivity)) {
                            FirebaseBundle firebaseBundle = new FirebaseBundle();
                            if (str2 != null) {
                                firebaseBundle.putString("selection_id", str2);
                            }
                            firebaseBundle.putString("type", nv.y0(banner));
                            firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, ruVar.a);
                            firebaseBundle.putString("position", str);
                            firebaseBundle.putLong("time_on_screen", j);
                            if (str3 != null) {
                                firebaseBundle.putString("name", str3);
                            }
                            nv.N(fragmentActivity, firebaseBundle, "ad_on_screen");
                            nv.M(fragmentActivity, firebaseBundle, "ad_on_screen");
                            return;
                        }
                        return;
                    }
                }
                j = 0;
                this.v = Long.valueOf(System.currentTimeMillis());
                str = this.x;
                AdType.Banner banner2 = this.t;
                if (str != null) {
                    return;
                } else {
                    return;
                }
            }
        }
        z = false;
        if (z) {
        }
        if (z) {
        }
    }
}
