package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.fragment.app.s;
import com.inmobi.media.E2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.results.event.graphs.view.CricketBowlerView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wb3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wb3(ih6 ih6Var, int i) {
        this.a = 21;
        this.b = ih6Var;
    }

    private final void a() {
        eg8 eg8Var = (eg8) this.b;
        synchronized (eg8Var.c) {
            try {
                if (eg8Var.g == null) {
                    return;
                }
                try {
                    yg8 c = eg8Var.c();
                    int i = c.f;
                    if (i == 2) {
                        synchronized (eg8Var.c) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        Method method = asj.b;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Context context = eg8Var.a;
                        yg8[] yg8VarArr = {c};
                        h5a h5aVar = x5k.a;
                        Trace.beginSection(h5a.U("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface H = x5k.a.H(context, yg8VarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer J = q5a.J(eg8Var.a, c.a);
                            if (J == null || H == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                g7h g7hVar = new g7h(H, sea.x(J));
                                Trace.endSection();
                                synchronized (eg8Var.c) {
                                    try {
                                        dy0 dy0Var = eg8Var.g;
                                        if (dy0Var != null) {
                                            dy0Var.A(g7hVar);
                                        }
                                    } finally {
                                    }
                                }
                                eg8Var.b();
                            } finally {
                                Method method2 = asj.b;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (eg8Var.c) {
                        try {
                            dy0 dy0Var2 = eg8Var.g;
                            if (dy0Var2 != null) {
                                dy0Var2.z(th2);
                            }
                            eg8Var.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = 2;
        boolean z = false;
        z = false;
        switch (this.a) {
            case 0:
                xb3 xb3Var = (xb3) this.b;
                Runnable runnable = xb3Var.b;
                if (runnable != null) {
                    runnable.run();
                    xb3Var.b = null;
                    return;
                }
                return;
            case 1:
                cc3.c((cc3) this.b);
                return;
            case 2:
                ((ty3) this.b).d().c(new dx8("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 3));
                return;
            case 3:
                ((yy3) this.b).e().c(new dx8("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 3));
                return;
            case 4:
                CricketBowlerView cricketBowlerView = (CricketBowlerView) this.b;
                int i2 = CricketBowlerView.n;
                cricketBowlerView.s(true);
                return;
            case 5:
                bn4 bn4Var = (bn4) this.b;
                bn4Var.z(bn4Var.t(), IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new eg4(i));
                rd4 rd4Var = bn4Var.f;
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) rd4Var.e;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    tdb tdbVar = (tdb) it.next();
                    rdb rdbVar = (rdb) rd4Var.d;
                    tdbVar.d = true;
                    if (tdbVar.c) {
                        tdbVar.c = false;
                        rdbVar.b(tdbVar.a, tdbVar.b.c());
                    }
                }
                copyOnWriteArraySet.clear();
                rd4Var.a = true;
                return;
            case 6:
                cn4 cn4Var = (cn4) this.b;
                cn4Var.q(cn4Var.l(), IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new eg4(26));
                cn4Var.f.d();
                return;
            case 7:
                pn4 pn4Var = (pn4) this.b;
                if (pn4Var.a0 >= 300000) {
                    ((u2c) pn4Var.n.b).R0 = true;
                    pn4Var.a0 = 0L;
                    return;
                }
                return;
            case 8:
                ro4 ro4Var = (ro4) this.b;
                if (ro4Var.c) {
                    return;
                }
                xb5 xb5Var = ro4Var.b;
                if (xb5Var != null) {
                    xb5Var.d(ro4Var.a);
                }
                ro4Var.d.m.remove(ro4Var);
                ro4Var.c = true;
                return;
            case 9:
                ((oo4) this.b).d(null);
                return;
            case 10:
                Function0 function0 = (Function0) ((fsf) this.b).a;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 11:
                gq8.a((ArrayList) this.b, 4);
                return;
            case 12:
                g gVar = (g) this.b;
                Iterator it2 = gVar.c.iterator();
                while (it2.hasNext()) {
                    ((at4) it2.next()).a.c(gVar);
                }
                return;
            case 13:
                ((ht4) this.b).d(false);
                return;
            case 14:
                ((it4) this.b).f(false);
                return;
            case 15:
                ((iu4) this.b).i();
                return;
            case 16:
                ((ru4) this.b).h.c();
                return;
            case 17:
                ed5 ed5Var = (ed5) this.b;
                boolean isPopupShowing = ed5Var.h.isPopupShowing();
                ed5Var.s(isPopupShowing);
                ed5Var.m = isPopupShowing;
                return;
            case 18:
                E2.a((E2) this.b);
                return;
            case 19:
                d66.setTime$lambda$0((d66) this.b);
                return;
            case 20:
                vg6 vg6Var = (vg6) this.b;
                int i3 = vg6.r0;
                jy0 jy0Var = vg6Var.C;
                Context context = vg6Var.e;
                String str = nik.a;
                int generateAudioSessionId = un0.y(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                jy0Var.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((zqi) jy0Var.c).a.getLooper()) {
                    obj = jy0Var.e;
                } else {
                    z1a.E(myLooper == ((zqi) jy0Var.b).a.getLooper());
                    obj = jy0Var.f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    jy0Var.f = valueOf;
                    iy0 iy0Var = new iy0(jy0Var, valueOf, z ? 1 : 0);
                    zqi zqiVar = (zqi) jy0Var.c;
                    if (zqiVar.a.getLooper().getThread().isAlive()) {
                        zqiVar.e(iy0Var);
                    }
                    vg6Var.Z(1, 10, Integer.valueOf(generateAudioSessionId));
                    vg6Var.Z(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 21:
                cn4 cn4Var2 = ((ih6) this.b).v;
                cn4Var2.q(cn4Var2.l(), IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new eg4(16));
                return;
            case 22:
                kte kteVar = (kte) this.b;
                try {
                    synchronized (kteVar) {
                    }
                    try {
                        kteVar.a.handleMessage(kteVar.d, kteVar.e);
                        kteVar.b(true);
                        return;
                    } catch (Throwable th) {
                        kteVar.b(true);
                        throw th;
                    }
                } catch (sf6 e) {
                    m6k.C("Unexpected error delivering message on external thread.", e);
                    is8.h(e);
                    return;
                }
            case 23:
                lte lteVar = (lte) this.b;
                try {
                    synchronized (lteVar) {
                    }
                    try {
                        lteVar.a.handleMessage(lteVar.c, lteVar.d);
                        lteVar.a(true);
                        return;
                    } catch (Throwable th2) {
                        lteVar.a(true);
                        throw th2;
                    }
                } catch (tf6 e2) {
                    tgj.A("Unexpected error delivering message on external thread.", e2);
                    is8.h(e2);
                    return;
                }
            case 24:
                ((yn3) this.b).accept(new hal(km5.a));
                return;
            case 25:
                ((hn6) this.b).k(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            case 26:
                a();
                return;
            case 27:
                im8 im8Var = (im8) this.b;
                boolean z2 = im8Var.b;
                if ((!z2 || !im8Var.c) && z2) {
                    z = true;
                }
                im8Var.b = z;
                return;
            case 28:
                ((Fragment) this.b).lambda$performCreateView$0();
                return;
            default:
                Iterator it3 = ((s) this.b).o.iterator();
                while (it3.hasNext()) {
                    ((cp8) it3.next()).getClass();
                }
                return;
        }
    }

    public /* synthetic */ wb3(Handler.Callback callback, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ wb3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
