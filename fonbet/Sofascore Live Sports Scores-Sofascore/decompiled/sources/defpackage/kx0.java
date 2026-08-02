package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.work.impl.WorkDatabase;
import com.facebook.internal.k0;
import com.facebook.w;
import com.inmobi.media.Ha;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.ironsource.AbstractC4031d3;
import com.ironsource.Ba;
import com.ironsource.J2;
import com.ironsource.Sc;
import com.ironsource.V0;
import com.ironsource.Va;
import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.downloader.b;
import com.vungle.ads.internal.downloader.k;
import com.vungle.ads.internal.load.c;
import com.vungle.ads.internal.load.g;
import com.vungle.ads.internal.w2;
import java.io.File;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class kx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kx0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] f;
        int i = this.a;
        int i2 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Ba.a((Ba) obj4, (J2) obj3, (AbstractC4031d3) obj2, (Long) obj);
                break;
            case 1:
                View view = (View) obj3;
                ed edVar = (ed) obj2;
                View view2 = (View) obj;
                int i3 = ((Context) obj4).getResources().getDisplayMetrics().widthPixels;
                float x = view.getX() + (view.getWidth() / 2);
                dsf dsfVar = new dsf();
                dsfVar.a = (view.getWidth() - ((FrameLayout) edVar.b).getMeasuredWidth()) / 2;
                float measuredWidth = (x + (r8.getMeasuredWidth() / 2)) - (i3 - ao2.s(4, r10));
                if (measuredWidth > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    dsfVar.a -= wzb.b(measuredWidth);
                }
                view2.setOnClickListener(new qh(13, edVar, view, dsfVar));
                break;
            case 2:
                is4 is4Var = (is4) obj4;
                jv0 jv0Var = (jv0) obj3;
                String str = jv0Var.a;
                hyj hyjVar = (hyj) obj2;
                du0 du0Var = (du0) obj;
                is4Var.getClass();
                Logger logger = is4.f;
                try {
                    uxj a = is4Var.c.a(str);
                    if (a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        hyjVar.a(new IllegalArgumentException(str2));
                    } else {
                        is4Var.e.n(new li3(3, is4Var, jv0Var, ((cm2) a).a(du0Var)));
                        hyjVar.a(null);
                    }
                    break;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    hyjVar.a(e);
                    return;
                }
            case 3:
                Ha.a((Ha) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 4:
                gx9 gx9Var = (gx9) obj4;
                Runnable runnable = (Runnable) obj3;
                px9 px9Var = (px9) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (!cw3.a.contains(gx9.class)) {
                    try {
                        Class cls = gx9Var.e;
                        qx9.B(gx9Var.b, gx9Var.g(), gx9Var.i, gx9Var.k.k(px9Var, arrayList), Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new fx9(gx9Var, runnable, i2)));
                        break;
                    } catch (Throwable th) {
                        cw3.a(gx9.class, th);
                        return;
                    }
                }
                break;
            case 5:
                hx9 hx9Var = (hx9) obj4;
                Runnable runnable2 = (Runnable) obj3;
                px9 px9Var2 = (px9) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                if (!cw3.a.contains(hx9.class)) {
                    try {
                        Class cls2 = hx9Var.n;
                        Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new fx9(hx9Var, new Object[]{runnable2}, 1));
                        Object f2 = hx9Var.f(px9Var2, arrayList2);
                        if (f2 != null) {
                            qx9.B(hx9Var.b, hx9Var.d(), hx9Var.v, f2, newProxyInstance);
                            break;
                        }
                    } catch (Throwable th2) {
                        cw3.a(hx9.class, th2);
                        return;
                    }
                }
                break;
            case 6:
                InMobiSdk.a((Context) obj4, (SdkInitializationListener) obj3, (String) obj2, (JSONObject) obj);
                break;
            case 7:
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0((IronSourceNativeAdAdapter) obj4, (JSONObject) obj3, (NativeAdSmashListener) obj2, (String) obj);
                break;
            case 8:
                LevelPlayNativeAd.a((LevelPlayNativeAd) obj4, (AdapterNativeAdData) obj3, (AdapterNativeAdViewBinder) obj2, (AdInfo) obj);
                break;
            case 9:
                ((dad) obj3).x((dbc) obj4, (mac) obj2, (ArrayList) obj);
                break;
            case 10:
                ((dad) obj3).x((dbc) obj4, (mac) obj2, (Collection) obj);
                break;
            case 11:
                List list = (List) obj4;
                qbl qblVar = (qbl) obj3;
                ti3 ti3Var = (ti3) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((hsg) it.next()).b(qblVar.a);
                }
                ssg.b(ti3Var, workDatabase, list);
                break;
            case 12:
                r18 r18Var = (r18) obj4;
                String str3 = (String) obj3;
                Map map = (Map) obj2;
                List list2 = (List) obj;
                hic hicVar = (hic) r18Var.b;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) r18Var.g;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    hicVar.j(str3, (String) atomicMarkableReference.getReference());
                }
                if (!map.isEmpty()) {
                    hicVar.h(str3, map, false);
                }
                if (!list2.isEmpty()) {
                    hicVar.i(str3, list2);
                    break;
                }
                break;
            case 13:
                Va.a((Sc) obj4, (LevelPlayReward) obj3, (String) obj2, (V0.a) obj);
                break;
            case 14:
                JSONObject jSONObject = (JSONObject) obj4;
                String str4 = (String) obj3;
                auk aukVar = (auk) obj2;
                String str5 = (String) obj;
                if (!cw3.a.contains(auk.class)) {
                    try {
                        str4.getClass();
                        try {
                            String lowerCase = k0.l(w.a()).toLowerCase();
                            lowerCase.getClass();
                            float[] g = it7.g(lowerCase, jSONObject);
                            String p = it7.p(str4, aukVar.d, lowerCase);
                            if (g != null && (f = stc.f(2, new float[][]{g}, new String[]{p})) != null) {
                                String str6 = f[0];
                                v3f.a(str5, str6);
                                if (!Intrinsics.c(str6, "other")) {
                                    HashSet hashSet = auk.e;
                                    cga.K(str6, str4, g);
                                    break;
                                }
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th3) {
                        cw3.a(auk.class, th3);
                        return;
                    }
                }
                break;
            case 15:
                c.a((k) obj4, (g) obj3, (c) obj2, (b) obj);
                break;
            case 16:
                c.a((File) obj4, (c) obj3, (k) obj2, (g) obj);
                break;
            default:
                w2.a((w2) obj4, (Context) obj3, (String) obj2, (joa) obj);
                break;
        }
    }
}
