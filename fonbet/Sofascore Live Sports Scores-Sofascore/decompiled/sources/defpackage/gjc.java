package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.internal.d;
import com.inmobi.media.R5;
import com.ironsource.R8;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class gjc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gjc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i = 3;
        int i2 = 6;
        final int i3 = 2;
        final int i4 = 1;
        final int i5 = 0;
        r8 = false;
        boolean z = false;
        int width = 0;
        int width2 = 0;
        int width3 = 0;
        switch (this.a) {
            case 0:
                View view = (View) this.b;
                hjc hjcVar = (hjc) this.c;
                if (cw3.a.contains(hjc.class)) {
                    return;
                }
                try {
                    if (view instanceof EditText) {
                        hjcVar.b(view);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    cw3.a(hjc.class, th);
                    return;
                }
            case 1:
                final p4d p4dVar = (p4d) this.b;
                final h5d h5dVar = (h5d) this.c;
                final yp5 yp5Var = p4dVar.a.n;
                yp5Var.getClass();
                yp5.a.info(new Supplier() { // from class: xp5
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        int i6 = i5;
                        Object obj = h5dVar;
                        p4d p4dVar2 = p4dVar;
                        yp5 yp5Var2 = yp5Var;
                        switch (i6) {
                            case 0:
                                yp5Var2.getClass();
                                return yp5.a("messageDiscarded", p4dVar2, null, "Message: ", (h5d) obj);
                            case 1:
                                yp5Var2.getClass();
                                return yp5.a("slowConsumerDetected", p4dVar2, (u4d) obj, new Object[0]);
                            case 2:
                                yp5Var2.getClass();
                                return yp5.a("exceptionOccurred", p4dVar2, null, "Exception: ", (Exception) obj);
                            default:
                                yp5Var2.getClass();
                                return yp5.a("errorOccurred", p4dVar2, null, "Error: ", (String) obj);
                        }
                    }
                });
                return;
            case 2:
                p4d p4dVar2 = (p4d) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } catch (Exception unused) {
                    ((AtomicLong) p4dVar2.b.g).incrementAndGet();
                    return;
                }
            case 3:
                final p4d p4dVar3 = (p4d) this.b;
                final Exception exc = (Exception) this.c;
                final yp5 yp5Var2 = p4dVar3.a.n;
                yp5Var2.getClass();
                yp5.a.severe(new Supplier() { // from class: xp5
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        int i6 = i3;
                        Object obj = exc;
                        p4d p4dVar22 = p4dVar3;
                        yp5 yp5Var22 = yp5Var2;
                        switch (i6) {
                            case 0:
                                yp5Var22.getClass();
                                return yp5.a("messageDiscarded", p4dVar22, null, "Message: ", (h5d) obj);
                            case 1:
                                yp5Var22.getClass();
                                return yp5.a("slowConsumerDetected", p4dVar22, (u4d) obj, new Object[0]);
                            case 2:
                                yp5Var22.getClass();
                                return yp5.a("exceptionOccurred", p4dVar22, null, "Exception: ", (Exception) obj);
                            default:
                                yp5Var22.getClass();
                                return yp5.a("errorOccurred", p4dVar22, null, "Error: ", (String) obj);
                        }
                    }
                });
                return;
            case 4:
                final p4d p4dVar4 = (p4d) this.b;
                final String str = (String) this.c;
                final yp5 yp5Var3 = p4dVar4.a.n;
                yp5Var3.getClass();
                yp5.a.severe(new Supplier() { // from class: xp5
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        int i6 = i;
                        Object obj = str;
                        p4d p4dVar22 = p4dVar4;
                        yp5 yp5Var22 = yp5Var3;
                        switch (i6) {
                            case 0:
                                yp5Var22.getClass();
                                return yp5.a("messageDiscarded", p4dVar22, null, "Message: ", (h5d) obj);
                            case 1:
                                yp5Var22.getClass();
                                return yp5.a("slowConsumerDetected", p4dVar22, (u4d) obj, new Object[0]);
                            case 2:
                                yp5Var22.getClass();
                                return yp5.a("exceptionOccurred", p4dVar22, null, "Exception: ", (Exception) obj);
                            default:
                                yp5Var22.getClass();
                                return yp5.a("errorOccurred", p4dVar22, null, "Error: ", (String) obj);
                        }
                    }
                });
                return;
            case 5:
                final p4d p4dVar5 = (p4d) this.b;
                final u4d u4dVar = (u4d) this.c;
                final yp5 yp5Var4 = p4dVar5.a.n;
                yp5Var4.getClass();
                yp5.a.warning(new Supplier() { // from class: xp5
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        int i6 = i4;
                        Object obj = u4dVar;
                        p4d p4dVar22 = p4dVar5;
                        yp5 yp5Var22 = yp5Var4;
                        switch (i6) {
                            case 0:
                                yp5Var22.getClass();
                                return yp5.a("messageDiscarded", p4dVar22, null, "Message: ", (h5d) obj);
                            case 1:
                                yp5Var22.getClass();
                                return yp5.a("slowConsumerDetected", p4dVar22, (u4d) obj, new Object[0]);
                            case 2:
                                yp5Var22.getClass();
                                return yp5.a("exceptionOccurred", p4dVar22, null, "Exception: ", (Exception) obj);
                            default:
                                yp5Var22.getClass();
                                return yp5.a("errorOccurred", p4dVar22, null, "Error: ", (String) obj);
                        }
                    }
                });
                return;
            case 6:
                dm8 dm8Var = (dm8) this.b;
                soh sohVar = (soh) this.c;
                try {
                    if (!dm8Var.a) {
                        sohVar.b();
                        return;
                    }
                    Socket socket = sohVar.d;
                    if (socket != null) {
                        try {
                            socket.setSoLinger(true, 0);
                        } catch (SocketException unused2) {
                        }
                        sohVar.b();
                        return;
                    }
                    return;
                } catch (IOException unused3) {
                    return;
                }
            case 7:
                ((qn4) this.c).a(((mbd) this.b).c());
                return;
            case 8:
                nbd nbdVar = (nbd) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new d(nbdVar, i2), intentFilter);
                return;
            case 9:
                d dVar = (d) this.b;
                Context context2 = (Context) this.c;
                nbd nbdVar2 = (nbd) dVar.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i = type != 9 ? 8 : 7;
                                        }
                                        i = 5;
                                    }
                                }
                                i = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i = 4;
                                    break;
                                case 13:
                                    i = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i = 6;
                                    break;
                                case 18:
                                    i = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i = 1;
                        }
                    } catch (SecurityException unused4) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i != 5) {
                        nbdVar2.j(i);
                        return;
                    } else {
                        qz.e(context2, nbdVar2);
                        return;
                    }
                }
                i = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                nbdVar2.j(i);
                return;
            case 10:
                Context context3 = (Context) this.b;
                String str2 = (String) this.c;
                Set set = cw3.a;
                if (set.contains(aqd.class)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = context3.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String concat = str2.concat("pingForOnDevice");
                    if (sharedPreferences.getLong(concat, 0L) == 0) {
                        wxf wxfVar = wxf.b;
                        if (!set.contains(wxf.class)) {
                            try {
                                wxf.b.A(1, str2, km5.a);
                            } catch (Throwable th2) {
                                cw3.a(wxf.class, th2);
                            }
                        }
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(concat, System.currentTimeMillis());
                        edit.apply();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    cw3.a(aqd.class, th3);
                    return;
                }
            case 11:
                ((h2h) this.b).i((uqd) this.c, Unit.a);
                return;
            case 12:
                p03 p03Var = (p03) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                ((h0e) ((mqi) p03Var.e).getValue()).a = true;
                RecyclerView recyclerView = (RecyclerView) p03Var.c;
                if (recyclerView == null) {
                    Intrinsics.i("recyclerView");
                    throw null;
                }
                recyclerView.setNestedScrollingEnabled(true);
                frameLayout.setVisibility(8);
                return;
            case 13:
                z82 z82Var = (z82) this.b;
                jme jmeVar = (jme) this.c;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) z82Var.e;
                Integer c = ((tug) jmeVar.e).c();
                if (c != null) {
                    i5 = c.intValue();
                } else if (hkg.c0(jmeVar.b)) {
                    i5 = scrollInterceptorHorizontalScrollView.getChildAt(0).getWidth();
                }
                scrollInterceptorHorizontalScrollView.setScrollX(i5);
                return;
            case 14:
                z82 z82Var2 = (z82) this.b;
                kme kmeVar = (kme) this.c;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView2 = (ScrollInterceptorHorizontalScrollView) z82Var2.g;
                Integer c2 = kmeVar.d.c();
                if (c2 != null) {
                    width3 = c2.intValue();
                } else if (hkg.c0(kmeVar.b)) {
                    width3 = scrollInterceptorHorizontalScrollView2.getChildAt(0).getWidth();
                }
                scrollInterceptorHorizontalScrollView2.setScrollX(width3);
                return;
            case 15:
                z82 z82Var3 = (z82) this.b;
                lme lmeVar = (lme) this.c;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView3 = (ScrollInterceptorHorizontalScrollView) z82Var3.e;
                Integer c3 = ((tug) lmeVar.e).c();
                if (c3 != null) {
                    width2 = c3.intValue();
                } else if (hkg.c0(lmeVar.b)) {
                    width2 = scrollInterceptorHorizontalScrollView3.getChildAt(0).getWidth();
                }
                scrollInterceptorHorizontalScrollView3.setScrollX(width2);
                return;
            case 16:
                z82 z82Var4 = (z82) this.b;
                jme jmeVar2 = (jme) this.c;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView4 = (ScrollInterceptorHorizontalScrollView) z82Var4.e;
                Integer c4 = ((tug) jmeVar2.e).c();
                if (c4 != null) {
                    width = c4.intValue();
                } else if (hkg.c0(jmeVar2.b)) {
                    width = scrollInterceptorHorizontalScrollView4.getChildAt(0).getWidth();
                }
                scrollInterceptorHorizontalScrollView4.setScrollX(width);
                return;
            case 17:
                PlayerView playerView = (PlayerView) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                int i6 = PlayerView.H;
                playerView.d(bitmap);
                return;
            case 18:
                g8f g8fVar = (g8f) this.b;
                qbl qblVar = (qbl) this.c;
                synchronized (g8fVar.k) {
                    try {
                        Iterator it = g8fVar.j.iterator();
                        while (it.hasNext()) {
                            ((qe6) it.next()).a(qblVar, false);
                        }
                    } finally {
                    }
                }
                return;
            case 19:
                cdf cdfVar = (cdf) this.b;
                a0h a0hVar = (a0h) this.c;
                cdfVar.x = cdfVar.q == null ? a0hVar : new aw0(C.TIME_UNSET);
                cdfVar.y = a0hVar.getDurationUs();
                if (!cdfVar.E && a0hVar.getDurationUs() == C.TIME_UNSET) {
                    z = true;
                }
                cdfVar.z = z;
                cdfVar.A = z ? 7 : 1;
                cdfVar.g.s(cdfVar.y, a0hVar.isSeekable(), cdfVar.z);
                if (cdfVar.u) {
                    return;
                }
                cdfVar.m();
                return;
            case 20:
                ((ddf) this.b).s((b0h) this.c);
                return;
            case 21:
                R5.a((Integer) this.b, (Context) this.c);
                return;
            case 22:
                R5.b((WindowInsets) this.b, (Context) this.c);
                return;
            case 23:
                R5.a((Map) this.b, (Context) this.c);
                return;
            case 24:
                R8.a((R8) this.b, (Set) this.c);
                return;
            case 25:
                R8.a((R8) this.b, (LevelPlayImpressionDataListener) this.c);
                return;
            case 26:
                kzf kzfVar = (kzf) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    gyj.a().d.h(((jv0) kzfVar.h.b).b(i7f.c), 1);
                } catch (Exception unused5) {
                }
                countDownLatch.countDown();
                return;
            case 27:
                ((t6a) this.b).C((Typeface) this.c);
                return;
            case 28:
                ((oy3) this.b).onResult((gx8) this.c);
                return;
            default:
                fcg fcgVar = (fcg) this.b;
                uag uagVar = (uag) this.c;
                jeg.d.f(2);
                bcg bannerListener = fcgVar.getBannerListener();
                if (bannerListener != null) {
                    k11 k11Var = (k11) bannerListener;
                    u11 u11Var = k11Var.b;
                    FragmentActivity fragmentActivity = u11Var.b;
                    ng ngVar = k11Var.c;
                    long j = k11Var.d.b;
                    fcg fcgVar2 = k11Var.e;
                    uagVar.getClass();
                    Integer num = k11Var.a;
                    if (num != null) {
                        if (fcgVar2.getHeight() > num.intValue()) {
                            nv.j(fragmentActivity, u11Var.B, ngVar.d, ru.EQUATIV, String.valueOf(j), -2, lnb.k(fcgVar2.getHeight(), "oversized creative h=", "px"), qu.LOAD, null, null, 768);
                            u11Var.i(true);
                            return;
                        }
                    }
                    ru ruVar = ru.EQUATIV;
                    u11Var.w = ruVar;
                    u11Var.x = String.valueOf(j);
                    nv.e(fragmentActivity, u11Var.B, ngVar.d, ruVar, String.valueOf(j), null, null, null, 224);
                    u11Var.C = u11Var.B;
                    u11Var.o(fcgVar2);
                    nv.l(fragmentActivity, u11Var.C, ngVar.d, ruVar, String.valueOf(j), null, null, 224);
                    u11Var.D = u11Var.C;
                    fcgVar2.getLayoutParams().height = fcgVar2.getHeight();
                    fcgVar2.setLayoutParams(fcgVar2.getLayoutParams());
                    lf lfVar = u11Var.p;
                    if (lfVar != null) {
                        lfVar.invoke();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
