package defpackage;

import android.graphics.SurfaceTexture;
import android.os.PowerManager;
import android.view.Surface;
import com.facebook.AccessToken;
import com.facebook.appevents.g;
import com.facebook.w;
import com.ironsource.C4243p0;
import com.ironsource.InterfaceC4153k0;
import com.ironsource.Va;
import com.ironsource.Vd;
import com.ironsource.W8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.InitializationListener;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.properties.SdkProperties;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ecg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ecg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        String str = null;
        switch (this.a) {
            case 0:
                hdg hdgVar = (hdg) this.b;
                fcg fcgVar = (fcg) this.c;
                jeg jegVar = jeg.d;
                hdgVar.toString();
                jegVar.f(4);
                bcg bannerListener = fcgVar.getBannerListener();
                if (bannerListener != null) {
                    ((k11) bannerListener).a(hdgVar);
                    return;
                }
                return;
            case 1:
                Exception exc = (Exception) this.b;
                beg begVar = (beg) this.c;
                jeg jegVar2 = jeg.d;
                exc.toString();
                jegVar2.f(4);
                hdg hdgVar2 = exc instanceof hdg ? (hdg) exc : new hdg(gdg.i, exc.getMessage());
                rz8 rz8Var = begVar.i;
                if (rz8Var != null) {
                    rz8Var.N(hdgVar2);
                    return;
                }
                return;
            case 2:
                hdg hdgVar3 = (hdg) this.b;
                beg begVar2 = (beg) this.c;
                jeg jegVar3 = jeg.d;
                hdgVar3.toString();
                jegVar3.f(4);
                rz8 rz8Var2 = begVar2.i;
                if (rz8Var2 != null) {
                    rz8Var2.M(hdgVar3);
                    return;
                }
                return;
            case 3:
                SdkProperties.lambda$notifyInitializationFailed$1((InitializationListener) this.b, (String) this.c);
                return;
            case 4:
                SdkProperties.lambda$notifyInitializationFailed$2((IUnityAdsInitializationListener) this.b, (String) this.c);
                return;
            case 5:
                ((mgh) this.b).c.accept((hal) this.c);
                return;
            case 6:
                mxh mxhVar = (mxh) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                int i = mxh.l;
                SurfaceTexture surfaceTexture2 = mxhVar.g;
                Surface surface = mxhVar.h;
                Surface surface2 = new Surface(surfaceTexture);
                mxhVar.g = surfaceTexture;
                mxhVar.h = surface2;
                Iterator it = mxhVar.a.iterator();
                while (it.hasNext()) {
                    ((lg6) it.next()).a.M(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 7:
                nxh nxhVar = (nxh) this.b;
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) this.c;
                int i2 = nxh.l;
                SurfaceTexture surfaceTexture4 = nxhVar.g;
                Surface surface3 = nxhVar.h;
                Surface surface4 = new Surface(surfaceTexture3);
                nxhVar.g = surfaceTexture3;
                nxhVar.h = surface4;
                Iterator it2 = nxhVar.a.iterator();
                while (it2.hasNext()) {
                    vg6 vg6Var = ((mg6) it2.next()).a;
                    int i3 = vg6.r0;
                    vg6Var.c0(surface4);
                }
                if (surfaceTexture4 != null) {
                    surfaceTexture4.release();
                }
                if (surface3 != null) {
                    surface3.release();
                    return;
                }
                return;
            case 8:
                u7i u7iVar = (u7i) this.b;
                Integer c = ((a8i) this.c).z.c();
                u7iVar.e(c != null ? c.intValue() : 0);
                return;
            case 9:
                v82 v82Var = (v82) this.b;
                km1 km1Var = (km1) this.c;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) v82Var.d;
                Integer c2 = ((tug) km1Var.e).c();
                if (c2 != null) {
                    r4 = c2.intValue();
                } else if (hkg.c0(km1Var.b)) {
                    r4 = scrollInterceptorHorizontalScrollView.getChildAt(0).getWidth();
                }
                scrollInterceptorHorizontalScrollView.setScrollX(r4);
                return;
            case 10:
                ((c0l) ((g7h) this.b).c).m((cci) this.c, 3);
                return;
            case 11:
                Runnable runnable = (Runnable) this.b;
                n5h n5hVar = (n5h) this.c;
                try {
                    runnable.run();
                    return;
                } finally {
                    n5hVar.a();
                }
            case 12:
                fyj fyjVar = (fyj) this.b;
                gde gdeVar = (gde) this.c;
                fyjVar.d(gdeVar.a, gdeVar.b);
                return;
            case 13:
                UnityAdsImplementation.lambda$load$1((IUnityAdsLoadListener) this.b, (String) this.c);
                return;
            case 14:
                r18 r18Var = (r18) this.b;
                ((hic) r18Var.b).i((String) r18Var.a, (List) this.c);
                return;
            case 15:
                Va.a((Va) this.b, (LevelPlayImpressionDataListener) this.c);
                return;
            case 16:
                Va.a((Va) this.b, (LevelPlayAdInfo) this.c);
                return;
            case 17:
                Va.a((InterfaceC4153k0) this.b, (Va) this.c);
                return;
            case 18:
                Va.a.a((C4243p0) this.b, (String) this.c);
                return;
            case 19:
                Vd.a((Vd) this.b, (IronSourceError) this.c);
                return;
            case 20:
                qo0 qo0Var = (qo0) this.b;
                yqk yqkVar = (yqk) this.c;
                lg6 lg6Var = qo0Var.b;
                int i4 = lik.a;
                ug6 ug6Var = lg6Var.a;
                ug6Var.g0 = yqkVar;
                ug6Var.l.k(25, new an4(yqkVar));
                return;
            case 21:
                ro0 ro0Var = (ro0) this.b;
                vz2 vz2Var = (vz2) this.c;
                mg6 mg6Var = ro0Var.b;
                String str2 = nik.a;
                mg6Var.a.G.F(vz2Var);
                return;
            case 22:
                ro0 ro0Var2 = (ro0) this.b;
                zqk zqkVar = (zqk) this.c;
                mg6 mg6Var2 = ro0Var2.b;
                String str3 = nik.a;
                vg6 vg6Var2 = mg6Var2.a;
                vg6Var2.j0 = zqkVar;
                vg6Var2.m.g(25, new zm4(zqkVar));
                return;
            case 23:
                qo0 qo0Var2 = (qo0) this.b;
                dm4 dm4Var = (dm4) this.c;
                synchronized (dm4Var) {
                }
                lg6 lg6Var2 = qo0Var2.b;
                int i5 = lik.a;
                bn4 bn4Var = lg6Var2.a.r;
                pv u = bn4Var.u((rcc) bn4Var.d.f);
                bn4Var.z(u, 1020, new l1(24, u, dm4Var));
                return;
            case 24:
                ro0 ro0Var3 = (ro0) this.b;
                dm4 dm4Var2 = (dm4) this.c;
                synchronized (dm4Var2) {
                }
                mg6 mg6Var3 = ro0Var3.b;
                String str4 = nik.a;
                cn4 cn4Var = mg6Var3.a.s;
                qv m = cn4Var.m((scc) cn4Var.d.e);
                cn4Var.q(m, 1020, new l1(27, m, dm4Var2));
                return;
            case 25:
                atk atkVar = (atk) this.b;
                scg scgVar = (scg) this.c;
                if (cw3.a.contains(atk.class)) {
                    return;
                }
                try {
                    Timer timer = atkVar.c;
                    if (timer != null) {
                        timer.cancel();
                    }
                    atkVar.d = null;
                    Timer timer2 = new Timer();
                    timer2.scheduleAtFixedRate(scgVar, 0L, 1000L);
                    atkVar.c = timer2;
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th) {
                    cw3.a(atk.class, th);
                    return;
                }
            case 26:
                String str5 = (String) this.b;
                atk atkVar2 = (atk) this.c;
                if (cw3.a.contains(atk.class)) {
                    return;
                }
                try {
                    str5.getClass();
                    byte[] bytes = str5.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                        messageDigest.getClass();
                        messageDigest.update(bytes);
                        byte[] digest = messageDigest.digest();
                        StringBuilder sb = new StringBuilder();
                        digest.getClass();
                        int length = digest.length;
                        while (r4 < length) {
                            byte b = digest[r4];
                            sb.append(Integer.toHexString((b >> 4) & 15));
                            sb.append(Integer.toHexString(b & 15));
                            r4++;
                        }
                        str = sb.toString();
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                    Date date = AccessToken.l;
                    AccessToken p = g.p();
                    if (str == null || !str.equals(atkVar2.d)) {
                        String str6 = atk.e;
                        atkVar2.b(oea.g(str5, p, w.b()), str);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    cw3.a(atk.class, th2);
                    return;
                }
            case 27:
                W8.a((W8) this.b, (LevelPlayImpressionData) this.c);
                return;
            case 28:
                ge6 ge6Var = (ge6) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                nzk nzkVar = (nzk) ge6Var.c;
                if (atomicBoolean.get()) {
                    new Thread(new ecg(29, nzkVar, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            default:
                nzk nzkVar2 = (nzk) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (nzkVar2) {
                    if (atomicBoolean2.get() && (wakeLock = nzkVar2.b) != null) {
                        wakeLock.release();
                    }
                }
                return;
        }
    }
}
