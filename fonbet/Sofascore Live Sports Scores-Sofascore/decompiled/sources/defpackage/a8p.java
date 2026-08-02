package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.bytedance.sdk.component.utils.tsz;
import com.google.android.gms.auth.api.signin.internal.zbc;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.ads.zzaex;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.WearableListenerService;
import com.google.android.gms.wearable.internal.zzao;
import com.google.android.gms.wearable.internal.zzia;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.unity3d.services.UnityAdsConstants;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a8p implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public a8p(pk0 pk0Var) {
        this.a = 2;
        this.c = pk0Var;
        this.b = new AtomicReference(null);
    }

    private final void a() {
        lcl lclVar;
        g8f g8fVar = ((vqi) this.c).b.f;
        String str = (String) this.b;
        synchronized (g8fVar.k) {
            try {
                gdl c = g8fVar.c(str);
                lclVar = c != null ? c.a : null;
            } finally {
            }
        }
        if (lclVar == null || Intrinsics.c(zm3.j, lclVar.j)) {
            return;
        }
        synchronized (((vqi) this.c).d) {
            ((vqi) this.c).g.put(rha.p(lclVar), lclVar);
            vqi vqiVar = (vqi) this.c;
            ((vqi) this.c).h.put(rha.p(lclVar), kbl.a(vqiVar.i, lclVar, ((zbl) vqiVar.c).b, vqiVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ce, code lost:
    
        if (r1 != false) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable b;
        p8a p8aVar;
        u4a i;
        pyn pynVar;
        tsz tszVar;
        tsz tszVar2;
        IAccountAccessor zztVar;
        boolean z = true;
        ?? r2 = 0;
        r2 = 0;
        int i2 = 0;
        yih yihVar = null;
        switch (this.a) {
            case 0:
                z7p z7pVar = (z7p) this.c;
                ?? r15 = (Future) this.b;
                if ((r15 instanceof z8p) && (b = ((z8p) r15).b()) != null) {
                    z7pVar.zza(b);
                    return;
                }
                try {
                    z7pVar.zzb(mha.J(r15));
                    return;
                } catch (ExecutionException e) {
                    z7pVar.zza(e.getCause());
                    return;
                } catch (Throwable th) {
                    z7pVar.zza(th);
                    return;
                }
            case 1:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((ud) this.c);
                return;
            case 2:
                p33 p33Var = (p33) ((AtomicReference) this.b).get();
                if (p33Var != null) {
                    Iterator it = ((pk0) this.c).l.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(p33Var);
                    }
                    return;
                }
                return;
            case 3:
                ChatMessageInputView chatMessageInputView = (ChatMessageInputView) this.b;
                js2 js2Var = chatMessageInputView.d;
                ShapeableImageView shapeableImageView = (ShapeableImageView) js2Var.n;
                nr9 nr9Var = (nr9) this.c;
                Resources resources = chatMessageInputView.getContext().getResources();
                resources.getClass();
                shapeableImageView.setImageDrawable(rfo.t(nr9Var, resources));
                ((CircularProgressIndicator) js2Var.o).setVisibility(8);
                ((ImageView) js2Var.c).setVisibility(0);
                ((ImageView) js2Var.c).setEnabled(true);
                ((ImageView) js2Var.c).setOnClickListener(chatMessageInputView);
                chatMessageInputView.i = true;
                ((FrameLayout) js2Var.k).setVisibility(0);
                ((ImageView) js2Var.h).setVisibility(8);
                chatMessageInputView.j((ImageView) js2Var.h);
                return;
            case 4:
                ((aa4) this.c).b.onWarmupCompleted((Bundle) this.b);
                return;
            case 5:
                nq4 nq4Var = (nq4) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    lq4 lq4Var = (lq4) it2.next();
                    ArrayList arrayList2 = nq4Var.r;
                    long j = nq4Var.f;
                    u uVar = lq4Var.a;
                    View view = uVar == null ? null : uVar.itemView;
                    u uVar2 = lq4Var.b;
                    View view2 = uVar2 != null ? uVar2.itemView : null;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j);
                        arrayList2.add(lq4Var.a);
                        duration.translationX(lq4Var.e - lq4Var.c);
                        duration.translationY(lq4Var.f - lq4Var.d);
                        duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new kq4(nq4Var, lq4Var, duration, view, 0)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList2.add(lq4Var.b);
                        animate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j).alpha(1.0f).setListener(new kq4(nq4Var, lq4Var, animate, view2, 1)).start();
                    }
                }
                arrayList.clear();
                nq4Var.n.remove(arrayList);
                return;
            case 6:
                wkn wknVar = ((mrb) this.c).u;
                xei xeiVar = (xei) this.b;
                wknVar.q(xeiVar.b, xeiVar.c);
                return;
            case 7:
                ((pv4) this.c).h.L(this.b);
                return;
            case 8:
                ((rv4) this.c).c.r((om4) this.b);
                return;
            case 9:
                ((rv4) this.c).c.l((xei) this.b);
                return;
            case 10:
                rik o = rik.o();
                int i3 = wv4.d;
                lcl lclVar = (lcl) this.b;
                o.getClass();
                ((wv4) this.c).a.c(lclVar);
                return;
            case 11:
                hih hihVar = (hih) this.b;
                hihVar.a.a();
                synchronized (hihVar.b) {
                    synchronized (((jo5) this.c)) {
                        if (((jo5) this.c).a.a.contains(new ho5((hih) this.b, o1j.f))) {
                            jo5 jo5Var = (jo5) this.c;
                            hih hihVar2 = (hih) this.b;
                            jo5Var.getClass();
                            try {
                                hihVar2.g(jo5Var.p, 5);
                            } catch (Throwable th2) {
                                throw new rh2(th2);
                            }
                        }
                        ((jo5) this.c).c();
                    }
                }
                return;
            case 12:
                long currentTimeMillis = System.currentTimeMillis();
                ou4 ou4Var = (ou4) this.b;
                long j2 = currentTimeMillis - ou4Var.a;
                long j3 = 45000 - j2;
                if (j3 <= 0) {
                    j3 = 45000;
                }
                if (j2 >= 45000) {
                    ((Function0) this.c).invoke();
                    ou4Var.a = currentTimeMillis;
                }
                ((Handler) ou4Var.b).postDelayed(this, j3);
                return;
            case 13:
                q8a q8aVar = ((t8a) this.c).l;
                SocketAddress socketAddress = (SocketAddress) ((sp5) q8aVar.a.get(q8aVar.b)).a.get(q8aVar.c);
                q8a q8aVar2 = ((t8a) this.c).l;
                q8aVar2.a = (List) this.b;
                q8aVar2.d();
                ((t8a) this.c).m = (List) this.b;
                rk3 rk3Var = ((t8a) this.c).w.a;
                rk3 rk3Var2 = rk3.b;
                if (rk3Var == rk3Var2 || ((t8a) this.c).w.a == rk3.a) {
                    q8a q8aVar3 = ((t8a) this.c).l;
                    while (true) {
                        if (r2 < q8aVar3.a.size()) {
                            int indexOf = ((sp5) q8aVar3.a.get(r2)).a.indexOf(socketAddress);
                            if (indexOf == -1) {
                                r2++;
                            } else {
                                q8aVar3.b = r2;
                                q8aVar3.c = indexOf;
                            }
                        } else {
                            rk3 rk3Var3 = ((t8a) this.c).w.a;
                            t8a t8aVar = (t8a) this.c;
                            if (rk3Var3 == rk3Var2) {
                                p8aVar = t8aVar.v;
                                ((t8a) this.c).v = null;
                                ((t8a) this.c).l.d();
                                ((t8a) this.c).e(rk3.d);
                            } else {
                                t8aVar.u.a(xei.m.h("InternalSubchannel closed pending transport due to address change"));
                                t8a t8aVar2 = (t8a) this.c;
                                t8aVar2.u = null;
                                t8aVar2.l.d();
                                ((t8a) this.c).h();
                            }
                        }
                    }
                }
                p8aVar = null;
                if (p8aVar != null) {
                    t8a t8aVar3 = (t8a) this.c;
                    if (t8aVar3.q != null) {
                        t8aVar3.r.a(xei.m.h("InternalSubchannel closed transport early due to address change"));
                        ((t8a) this.c).q.e();
                        t8aVar3 = (t8a) this.c;
                        t8aVar3.q = null;
                        t8aVar3.r = null;
                    }
                    t8aVar3.r = p8aVar;
                    t8aVar3.q = t8aVar3.k.f(t8aVar3.f, new b8(this, 19), 5L, TimeUnit.SECONDS);
                    return;
                }
                return;
            case 14:
                rq3 b2 = z9a.b((dka) this.b);
                p2g p2gVar = w2g.b;
                b2.resumeWith(y6a.x((Throwable) this.c));
                return;
            case 15:
                RecyclerView recyclerView = (RecyclerView) this.c;
                View view3 = (View) this.b;
                WeakHashMap weakHashMap = bsk.a;
                x9l a = trk.a(view3);
                if (a != null && (i = a.a.i(2)) != null) {
                    i2 = i.d;
                }
                int i4 = kik.s ? 84 : 56;
                Context context = recyclerView.getContext();
                context.getClass();
                int s = ao2.s(i4, context);
                Context context2 = recyclerView.getContext();
                context2.getClass();
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), i2 + s + ao2.s(96, context2));
                return;
            case 16:
                mrb mrbVar = (mrb) this.b;
                nrb nrbVar = (nrb) this.c;
                qrb qrbVar = nrbVar.d;
                if (nrbVar.a.get() != qrb.h0) {
                    mrbVar.X();
                    return;
                }
                if (qrbVar.B == null) {
                    qrbVar.B = new LinkedHashSet();
                    qrbVar.Y.N(qrbVar.C, true);
                }
                qrbVar.B.add(mrbVar);
                return;
            case 17:
                uk0 uk0Var = (uk0) this.c;
                Object obj = this.b;
                boolean z2 = uk0Var.c.get();
                zbc zbcVar = uk0Var.e;
                if (z2) {
                    if (zbcVar.i == uk0Var) {
                        SystemClock.uptimeMillis();
                        zbcVar.i = null;
                        zbcVar.a();
                    }
                } else if (zbcVar.h != uk0Var) {
                    if (zbcVar.i == uk0Var) {
                        SystemClock.uptimeMillis();
                        zbcVar.i = null;
                        zbcVar.a();
                    }
                } else if (!zbcVar.d) {
                    SystemClock.uptimeMillis();
                    zbcVar.h = null;
                    fgb fgbVar = zbcVar.a;
                    if (fgbVar != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            fgbVar.j(obj);
                        } else {
                            fgbVar.k(obj);
                        }
                    }
                }
                uk0Var.b = 3;
                return;
            case 18:
                synchronized (((grb) ((pyn) this.c).c).i) {
                    try {
                        pynVar = (pyn) this.c;
                        if (!((yih) pynVar.b).b) {
                            grb grbVar = (grb) pynVar.c;
                            grbVar.o = grbVar.o.a((r3g) this.b);
                            grb grbVar2 = (grb) ((pyn) this.c).c;
                            if (grbVar2.h(grbVar2.o)) {
                                s3g s3gVar = ((grb) ((pyn) this.c).c).m;
                                if (s3gVar != null) {
                                    if (s3gVar.d.get() <= s3gVar.b) {
                                        z = false;
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                pynVar = (pyn) this.c;
                                grb grbVar3 = (grb) pynVar.c;
                                yihVar = new yih(grbVar3.i);
                                grbVar3.w = yihVar;
                                z = false;
                            }
                            grb grbVar4 = (grb) ((pyn) this.c).c;
                            p3g p3gVar = grbVar4.o;
                            if (!p3gVar.h) {
                                p3gVar = new p3g(p3gVar.b, p3gVar.c, p3gVar.d, p3gVar.f, p3gVar.g, p3gVar.a, true, p3gVar.e);
                            }
                            grbVar4.o = p3gVar;
                            pynVar = (pyn) this.c;
                            ((grb) pynVar.c).w = null;
                            z = false;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (z) {
                    r3g r3gVar = (r3g) this.b;
                    r3gVar.a.w(new k1d((grb) pynVar.c, r3gVar, r2, 29));
                    ((r3g) this.b).a.l(xei.f.h("Unneeded hedging"));
                    return;
                } else {
                    if (yihVar != null) {
                        grb grbVar5 = (grb) pynVar.c;
                        yihVar.n(grbVar5.d.schedule(new pyn(grbVar5, yihVar, r2, 17), grbVar5.g.b, TimeUnit.NANOSECONDS));
                    }
                    ((grb) ((pyn) this.c).c).f((r3g) this.b);
                    return;
                }
            case 19:
                ((grb) ((k1d) this.c).c).b.execute(new kac(this, 14));
                return;
            case 20:
                new Thread(new ajg(this)).start();
                return;
            case 21:
                z82 z82Var = (z82) this.c;
                int max = Math.max(((TextView) z82Var.d).getWidth(), ((TextView) z82Var.g).getWidth());
                ((Guideline) z82Var.c).setGuidelineBegin(max);
                ((Guideline) z82Var.f).setGuidelineEnd(max);
                return;
            case 22:
                a();
                return;
            case 23:
                ddb ddbVar = (ddb) this.b;
                boolean isCancelled = ddbVar.isCancelled();
                lj2 lj2Var = (lj2) this.c;
                if (isCancelled) {
                    lj2Var.a(null);
                    return;
                }
                try {
                    p2g p2gVar2 = w2g.b;
                    lj2Var.resumeWith(p7.g(ddbVar));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause == null) {
                        Intrinsics.g();
                    }
                    p2g p2gVar3 = w2g.b;
                    lj2Var.resumeWith(y6a.x(cause));
                    return;
                }
            case 24:
                ((g6b) this.b).d((yo8) this.c);
                return;
            case 25:
                csm csmVar = (csm) this.c;
                csm.ork(csmVar);
                tszVar = csmVar.dax;
                if (tszVar != null) {
                    tszVar2 = csmVar.dax;
                    tszVar2.obtainMessage(110, (SurfaceHolder) this.b).sendToTarget();
                    return;
                }
                return;
            case 26:
                zacm zacmVar = (zacm) this.c;
                zak zakVar = (zak) this.b;
                ConnectionResult connectionResult = zakVar.b;
                if (connectionResult.Z0()) {
                    zay zayVar = zakVar.c;
                    Preconditions.i(zayVar);
                    ConnectionResult connectionResult2 = zayVar.c;
                    if (!connectionResult2.Z0()) {
                        String valueOf = String.valueOf(connectionResult2);
                        new Exception();
                        "Sign-in succeeded with resolve account failure: ".concat(valueOf);
                        zacmVar.g.b(connectionResult2);
                        zacmVar.f.disconnect();
                        return;
                    }
                    k2n k2nVar = zacmVar.g;
                    IBinder iBinder = zayVar.b;
                    if (iBinder == null) {
                        zztVar = null;
                    } else {
                        int i5 = IAccountAccessor.Stub.a;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        zztVar = queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    Set set = zacmVar.d;
                    k2nVar.getClass();
                    if (zztVar == null || set == null) {
                        new Exception();
                        k2nVar.b(new ConnectionResult(4, null, null));
                    } else {
                        k2nVar.c = zztVar;
                        k2nVar.d = set;
                        if (k2nVar.e) {
                            k2nVar.a.getRemoteService(zztVar, set);
                        }
                    }
                } else {
                    zacmVar.g.b(connectionResult);
                }
                zacmVar.f.disconnect();
                return;
            case 27:
                WearableListenerService S1 = ((qfn) this.c).S1("onConnectedCapabilityChanged");
                if (S1 == null) {
                    return;
                }
                S1.b((zzao) this.b);
                return;
            case 28:
                zzaex zzaexVar = (zzaex) this.b;
                zzbv zzbvVar = (zzbv) this.c;
                String str = zzfm.a;
                zzaexVar.b.f(zzbvVar);
                return;
            default:
                qfn qfnVar = (qfn) this.b;
                DataItemBuffer dataItemBuffer = new DataItemBuffer(((zzia) this.c).b);
                try {
                    qfnVar.S1("onNodeMigrated");
                    dataItemBuffer.release();
                    return;
                } finally {
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                j5o j5oVar = new j5o(a8p.class.getSimpleName());
                z7p z7pVar = (z7p) this.c;
                a2p a2pVar = new a2p();
                ((a2p) j5oVar.d).b = a2pVar;
                j5oVar.d = a2pVar;
                a2pVar.a = z7pVar;
                return j5oVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a8p(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public a8p(ddb ddbVar, lj2 lj2Var) {
        this.a = 23;
        ddbVar.getClass();
        this.b = ddbVar;
        this.c = lj2Var;
    }

    public /* synthetic */ a8p(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
