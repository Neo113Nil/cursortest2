package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.CancellationSignal;
import android.os.Trace;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.media3.common.b;
import com.facebook.internal.u;
import com.facebook.k0;
import com.facebook.w;
import com.google.android.gms.cloudmessaging.RegisterRequest;
import com.google.android.gms.cloudmessaging.zzi;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.cloudmessaging.zzm;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.service.InfoWorker;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3 implements dpi, kpd, ya, ec3, SuccessContinuation, Continuation, OnFailureListener, pdb, sdb, rdb, qdb, bu4, OnCompleteListener, FirebaseInAppMessagingDisplay, bt8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o3(ms0 ms0Var, k8f k8fVar) {
        this.a = 23;
        nxf[] nxfVarArr = nxf.a;
        this.b = ms0Var;
        this.c = k8fVar;
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        BaseActivity.s((BaseActivity) this.b, (View) this.c, x9lVar);
        return x9lVar;
    }

    @Override // defpackage.sdb
    public void a(Object obj, j78 j78Var) {
        s6c s6cVar = (s6c) ((sv) obj);
        s6cVar.k((ale) this.c, new f4a(j78Var, ((cn4) this.b).e));
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        int i = this.a;
        int i2 = 6;
        Object obj2 = this.c;
        Object obj3 = this.b;
        final int i3 = 0;
        final int i4 = 1;
        switch (i) {
            case 26:
                final kw9 kw9Var = (kw9) obj3;
                kw9Var.getClass();
                qi2 l = ri2.l((ri2) obj);
                l.d((oi2) obj2);
                final ri2 ri2Var = (ri2) l.build();
                eff effVar = kw9Var.a;
                effVar.getClass();
                return new sa3(new c00(i2, effVar, ri2Var), i4).a(new ya() { // from class: jw9
                    @Override // defpackage.ya
                    public final void run() {
                        int i5 = i3;
                        ri2 ri2Var2 = ri2Var;
                        kw9 kw9Var2 = kw9Var;
                        switch (i5) {
                            case 0:
                                kw9Var2.getClass();
                                kw9Var2.b = g0c.a(ri2Var2);
                                break;
                            default:
                                kw9Var2.getClass();
                                kw9Var2.b = g0c.a(ri2Var2);
                                break;
                        }
                    }
                });
            case 27:
                final kw9 kw9Var2 = (kw9) obj3;
                HashSet hashSet = (HashSet) obj2;
                ri2 ri2Var2 = (ri2) obj;
                kw9Var2.getClass();
                ri2Var2.toString();
                qi2 k = ri2.k();
                for (oi2 oi2Var : ri2Var2.i()) {
                    if (!hashSet.contains(oi2Var.h())) {
                        k.d(oi2Var);
                    }
                }
                final ri2 ri2Var3 = (ri2) k.build();
                ri2Var3.toString();
                eff effVar2 = kw9Var2.a;
                effVar2.getClass();
                return new sa3(new c00(i2, effVar2, ri2Var3), i4).a(new ya() { // from class: jw9
                    @Override // defpackage.ya
                    public final void run() {
                        int i5 = i4;
                        ri2 ri2Var22 = ri2Var3;
                        kw9 kw9Var22 = kw9Var2;
                        switch (i5) {
                            case 0:
                                kw9Var22.getClass();
                                kw9Var22.b = g0c.a(ri2Var22);
                                break;
                            default:
                                kw9Var22.getClass();
                                kw9Var22.b = g0c.a(ri2Var22);
                                break;
                        }
                    }
                });
            default:
                tw9 tw9Var = (tw9) obj3;
                l0c l0cVar = (l0c) obj2;
                ri2 ri2Var4 = (ri2) obj;
                if (!tw9Var.n.s()) {
                    vy7 k2 = wy7.k();
                    k2.d(1L);
                    return g0c.a((wy7) k2.build());
                }
                p0c p0cVar = new p0c(new l0c(l0cVar, new is8(22), i3), new ow9(i3, tw9Var, ri2Var4), i4);
                vy7 k3 = wy7.k();
                k3.d(1L);
                int i5 = 2;
                l0c l0cVar2 = new l0c(p0cVar, g0c.a((wy7) k3.build()), i5);
                is8 is8Var = new is8(23);
                p4h p4hVar = un0.m;
                x0c x0cVar = new x0c(new x0c(l0cVar2, is8Var, p4hVar), new pw9(tw9Var, i3), p4hVar);
                ou ouVar = tw9Var.j;
                Objects.requireNonNull(ouVar);
                x0c x0cVar2 = new x0c(x0cVar, new kr9(ouVar, i4), p4hVar);
                ekg ekgVar = tw9Var.k;
                Objects.requireNonNull(ekgVar);
                return new p0c(new x0c(new x0c(x0cVar2, new kr9(ekgVar, i5), p4hVar), p4hVar, new is8(24)), new v35(j0c.a, i4), i5);
        }
    }

    @Override // defpackage.rdb
    public void b(Object obj, i78 i78Var) {
        r6c r6cVar = (r6c) ((rv) obj);
        r6cVar.d((zke) this.c, new f4a(i78Var, ((bn4) this.b).e));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    @Override // defpackage.bu4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vvf c(int i, nsj nsjVar, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        Point point;
        int i6;
        int i7;
        nsj nsjVar2 = nsjVar;
        int i8 = this.a;
        Object obj = this.c;
        vt4 vt4Var = (vt4) this.b;
        switch (i8) {
            case 15:
                int i9 = ((int[]) obj)[i];
                int i10 = vt4Var.i;
                int i11 = vt4Var.j;
                boolean z = vt4Var.k;
                if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    int i12 = Integer.MAX_VALUE;
                    for (int i13 = 0; i13 < nsjVar2.a; i13++) {
                        sm8 sm8Var = nsjVar2.d[i13];
                        int i14 = sm8Var.q;
                        int i15 = sm8Var.r;
                        if (i14 > 0 && i15 > 0) {
                            if (z) {
                                if ((i14 > i15) != (i10 > i11)) {
                                    i5 = i10;
                                    i4 = i11;
                                    int i16 = i14 * i5;
                                    int i17 = i15 * i4;
                                    point = i16 < i17 ? new Point(i4, lik.f(i17, i14)) : new Point(lik.f(i16, i15), i5);
                                    i6 = sm8Var.q;
                                    i7 = i6 * i15;
                                    if (i6 >= ((int) (point.x * 0.98f)) && i15 >= ((int) (point.y * 0.98f)) && i7 < i12) {
                                        i12 = i7;
                                    }
                                }
                            }
                            i4 = i10;
                            i5 = i11;
                            int i162 = i14 * i5;
                            int i172 = i15 * i4;
                            if (i162 < i172) {
                            }
                            i6 = sm8Var.q;
                            i7 = i6 * i15;
                            if (i6 >= ((int) (point.x * 0.98f))) {
                                i12 = i7;
                            }
                        }
                    }
                    i2 = i12;
                }
                zu9 s = hv9.s();
                int i18 = 0;
                while (i18 < nsjVar2.a) {
                    sm8 sm8Var2 = nsjVar2.d[i18];
                    int i19 = sm8Var2.q;
                    int i20 = (i19 == -1 || (i3 = sm8Var2.r) == -1) ? -1 : i19 * i3;
                    s.c(new fu4(i, nsjVar2, i18, vt4Var, iArr[i18], i9, i2 == Integer.MAX_VALUE || (i20 != -1 && i20 <= i2)));
                    i18++;
                    nsjVar2 = nsjVar;
                }
                return s.g();
            default:
                String str = (String) obj;
                zu9 s2 = hv9.s();
                for (int i21 = 0; i21 < nsjVar2.a; i21++) {
                    s2.c(new zt4(i, nsjVar2, i21, vt4Var, iArr[i21], str));
                }
                return s2.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        boolean z;
        boolean a;
        u uVar = (u) this.b;
        String str = (String) this.c;
        Set set = cw3.a;
        if (set.contains(m03.class)) {
            return;
        }
        int i = 0;
        if (uVar != null) {
            try {
                if (uVar.g) {
                    z = true;
                    w wVar = w.a;
                    k0 k0Var = k0.a;
                    if (!set.contains(k0.class)) {
                        try {
                            k0.a.e();
                            a = k0.g.a();
                        } catch (Throwable th) {
                            cw3.a(k0.class, th);
                        }
                        if (z && a) {
                            m03 m03Var = m03.a;
                            if (cw3.a.contains(m03Var)) {
                                return;
                            }
                            try {
                                if (m03.h) {
                                    return;
                                }
                                m03.h = true;
                                w.c().execute(new l03(str, i));
                                return;
                            } catch (Throwable th2) {
                                cw3.a(m03Var, th2);
                                return;
                            }
                        }
                        return;
                    }
                    a = false;
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                }
            } catch (Throwable th3) {
                cw3.a(m03.class, th3);
                return;
            }
        }
        z = false;
        w wVar2 = w.a;
        k0 k0Var2 = k0.a;
        if (!set.contains(k0.class)) {
        }
        a = false;
        if (z) {
        }
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public void displayMessage(lw9 lw9Var, e48 e48Var) {
        b48 b48Var = (b48) this.b;
        Activity activity = (Activity) this.c;
        if (b48Var.j != null || b48Var.a.d) {
            return;
        }
        b48Var.j = lw9Var;
        b48Var.k = e48Var;
        b48Var.b(activity);
    }

    @Override // defpackage.dpi
    public void g() {
        AbstractFragment abstractFragment = (AbstractFragment) this.b;
        Function0 function0 = (Function0) this.c;
        yda ydaVar = abstractFragment.c;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        if (function0 != null) {
            function0.invoke();
        }
        abstractFragment.b.e(null);
        abstractFragment.b = abstractFragment.r();
    }

    @Override // defpackage.pdb
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 11:
                pv pvVar = (pv) obj3;
                l6c l6cVar = (l6c) obj2;
                r6c r6cVar = (r6c) ((rv) obj);
                rcc rccVar = pvVar.d;
                if (rccVar != null) {
                    sm8 sm8Var = l6cVar.c;
                    sm8Var.getClass();
                    wr4 wr4Var = r6cVar.b;
                    lij lijVar = pvVar.b;
                    rccVar.getClass();
                    wj9 wj9Var = new wj9(sm8Var, wr4Var.b(lijVar, rccVar), false, 19);
                    int i2 = l6cVar.b;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            r6cVar.p = wj9Var;
                            break;
                        } else if (i2 != 2) {
                            if (i2 == 3) {
                                r6cVar.q = wj9Var;
                                break;
                            }
                        }
                    }
                    r6cVar.o = wj9Var;
                    break;
                }
                break;
            default:
                qv qvVar = (qv) obj3;
                m6c m6cVar = (m6c) obj2;
                s6c s6cVar = (s6c) ((sv) obj);
                s6cVar.getClass();
                scc sccVar = qvVar.d;
                if (sccVar != null) {
                    b bVar = m6cVar.c;
                    bVar.getClass();
                    int i3 = m6cVar.d;
                    xr4 xr4Var = s6cVar.c;
                    mij mijVar = qvVar.b;
                    sccVar.getClass();
                    b10 b10Var = new b10((Object) bVar, xr4Var.c(mijVar, sccVar), i3, 8);
                    int i4 = m6cVar.b;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            s6cVar.q = b10Var;
                            break;
                        } else if (i4 != 2) {
                            if (i4 == 3) {
                                s6cVar.r = b10Var;
                                break;
                            }
                        }
                    }
                    s6cVar.p = b10Var;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        String str = (String) this.b;
        kb3 kb3Var = (kb3) this.c;
        try {
            Trace.beginSection(str);
            return kb3Var.f.l(vngVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.a;
        Object obj = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 20:
                ((mo5) obj3).a((Intent) obj2);
                break;
            case 21:
            default:
                nxf[] nxfVarArr = nxf.a;
                k8f k8fVar = (k8f) obj2;
                task.getClass();
                Iterator it = ((ms0) obj3).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (Intrinsics.c((String) next, "fantasy_announcements")) {
                            obj = next;
                        }
                    }
                }
                String str = (String) obj;
                if (str != null) {
                    ((j8f) k8fVar).d(str);
                    break;
                }
                break;
            case 22:
                Context context = (Context) obj3;
                v38 v38Var = (v38) obj2;
                task.getClass();
                if (task.isSuccessful()) {
                    if (((Boolean) task.getResult()).booleanValue() && w3a.o(context)) {
                        ktd A = mha.A(new ktd(InfoWorker.class));
                        mha.y(A);
                        vxd.h(context).b("InfoWorker-".concat(""), nf6.a, (ltd) A.a());
                    }
                    c5n.x(context);
                    ad2 ad2Var = qv5.a;
                    qv5.a(y42.a);
                    FirebaseBundle firebaseBundle = new FirebaseBundle();
                    ia0 ia0Var = ia0.q;
                    me4.d((f5d) me4.e(), "remote_config_init", firebaseBundle, context).a.e(n9e.K(firebaseBundle), null, "remote_config_init", false);
                }
                yea yeaVar = j58.a;
                v38Var.d = !fn0.B("in_app_message");
                ad2 ad2Var2 = qv5.a;
                qv5.a(g42.a);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ex8 bx8Var;
        ex8 bx8Var2;
        int i = this.a;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 9:
                ty3 ty3Var = (ty3) obj2;
                CancellationSignal cancellationSignal = (CancellationSignal) obj;
                exc.getClass();
                String str = ((exc instanceof ApiException) && uy3.d.contains(Integer.valueOf(((ApiException) exc).a.a))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String j = bf3.j(exc, new StringBuilder("During begin sign in, failure response from one tap: "));
                int hashCode = str.hashCode();
                if (hashCode == -1567968963) {
                    if (str.equals("GET_CANCELED_TAG")) {
                        bx8Var = new bx8(j);
                    }
                    bx8Var = new dx8(j, 3);
                } else if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        bx8Var = new cdd(j);
                    }
                    bx8Var = new dx8(j, 3);
                } else {
                    if (str.equals("GET_INTERRUPTED")) {
                        bx8Var = new dx8(j, 1);
                    }
                    bx8Var = new dx8(j, 3);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!fz3.a(cancellationSignal)) {
                    ty3Var.e().execute(new sy3(ty3Var, bx8Var, i2));
                    Unit unit = Unit.a;
                    break;
                }
                break;
            default:
                yy3 yy3Var = (yy3) obj2;
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj;
                exc.getClass();
                String str2 = ((exc instanceof ApiException) && uy3.d.contains(Integer.valueOf(((ApiException) exc).a.a))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String j2 = bf3.j(exc, new StringBuilder("During get sign-in intent, failure response from one tap: "));
                int hashCode2 = str2.hashCode();
                if (hashCode2 == -1567968963) {
                    if (str2.equals("GET_CANCELED_TAG")) {
                        bx8Var2 = new bx8(j2);
                    }
                    bx8Var2 = new dx8(j2, 3);
                } else if (hashCode2 != -154594663) {
                    if (hashCode2 == 1996705159 && str2.equals("GET_NO_CREDENTIALS")) {
                        bx8Var2 = new cdd(j2);
                    }
                    bx8Var2 = new dx8(j2, 3);
                } else {
                    if (str2.equals("GET_INTERRUPTED")) {
                        bx8Var2 = new dx8(j2, 1);
                    }
                    bx8Var2 = new dx8(j2, 3);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!fz3.a(cancellationSignal2)) {
                    yy3Var.f().execute(new xy3(yy3Var, bx8Var2, i2));
                    Unit unit2 = Unit.a;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ya
    public void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                ((li2) obj2).d = (wy7) obj;
                return;
            case 17:
                d55 d55Var = (d55) obj2;
                d48 d48Var = (d48) obj;
                mjc mjcVar = (mjc) d55Var.g;
                lw9 lw9Var = (lw9) d55Var.i;
                mjcVar.getClass();
                if (!lw9Var.b.b) {
                    ((k48) mjcVar.c).c().addOnSuccessListener(mjcVar.g, new li3(10, mjcVar, lw9Var, d48Var));
                }
                Iterator it = mjcVar.f.d.values().iterator();
                if (it.hasNext()) {
                    throw lnb.i(it);
                }
                return;
            case 18:
                d55 d55Var2 = (d55) obj2;
                c48 c48Var = (c48) obj;
                mjc mjcVar2 = (mjc) d55Var2.g;
                lw9 lw9Var2 = (lw9) d55Var2.i;
                mjcVar2.getClass();
                if (!lw9Var2.b.b) {
                    ((k48) mjcVar2.c).c().addOnSuccessListener(mjcVar2.g, new li3(11, mjcVar2, lw9Var2, c48Var));
                    mjcVar2.c(lw9Var2, "fiam_dismiss", false);
                }
                Iterator it2 = mjcVar2.f.c.values().iterator();
                if (it2.hasNext()) {
                    throw lnb.i(it2);
                }
                return;
            default:
                d55 d55Var3 = (d55) obj2;
                wa waVar = (wa) obj;
                mjc mjcVar3 = (mjc) d55Var3.g;
                lw9 lw9Var3 = (lw9) d55Var3.i;
                mjcVar3.getClass();
                if (!lw9Var3.b.b) {
                    ((k48) mjcVar3.c).c().addOnSuccessListener(mjcVar3.g, new kjc(mjcVar3, lw9Var3, 1));
                    mjcVar3.c(lw9Var3, "fiam_action", true);
                }
                qy4 qy4Var = mjcVar3.f;
                for (oy4 oy4Var : qy4Var.b.values()) {
                    Executor executor = qy4Var.a;
                    oy4Var.getClass();
                    executor.execute(new p3(16, oy4Var, lw9Var3, waVar));
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:
    
        if (r12 != null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013d, code lost:
    
        if (r12 == null) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ba A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #2 {all -> 0x0143, blocks: (B:62:0x010d, B:65:0x0110, B:66:0x0111, B:74:0x012e, B:84:0x0138, B:82:0x013b, B:94:0x0147, B:96:0x01b6, B:98:0x01ba, B:101:0x01bd, B:105:0x01c1, B:100:0x01bb), top: B:25:0x00e9, inners: #20 }] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v53, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v83 */
    /* JADX WARN: Type inference failed for: r3v3, types: [ni3] */
    @Override // com.google.android.gms.tasks.Continuation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object then(Task task) {
        InputStream inputStream;
        Integer num;
        ?? r10;
        l58 l58Var;
        int responseCode;
        InputStream inputStream2;
        switch (this.a) {
            case 6:
                ji3 ji3Var = (ji3) this.b;
                Date date = (Date) this.c;
                if (task.isSuccessful()) {
                    qi3 qi3Var = (qi3) ji3Var.h;
                    synchronized (qi3Var.b) {
                        qi3Var.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                    }
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        boolean z = exception instanceof h58;
                        qi3 qi3Var2 = (qi3) ji3Var.h;
                        Object obj = qi3Var2.b;
                        if (z) {
                            synchronized (obj) {
                                qi3Var2.a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        } else {
                            synchronized (obj) {
                                qi3Var2.a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        }
                    }
                }
                return task;
            case 7:
                return ((ji3) this.b).d(task, 0L, (HashMap) this.c);
            case 8:
                ?? r3 = (ni3) this.b;
                ?? r13 = (Task) this.c;
                DefaultClock defaultClock = r3.o;
                InputStream inputStream3 = null;
                try {
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException unused) {
                    r13 = 0;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                    num = null;
                    r3.b(inputStream3, inputStream);
                    synchronized (r3) {
                        r3.b = false;
                        if (r3.e || (num != null && !ni3.d(num.intValue()))) {
                            r2 = 0;
                        }
                        if (r2 != 0) {
                            defaultClock.getClass();
                            r3.k(new Date(System.currentTimeMillis()));
                        }
                        if (r2 != 0 || num.intValue() == 200) {
                            r3.h();
                        } else {
                            String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                            if (num.intValue() == 403) {
                                format = ni3.f(r3.f.getErrorStream());
                            }
                            r3.g(new l58(num.intValue(), format, 0));
                        }
                        throw th;
                    }
                }
                if (!r13.isSuccessful()) {
                    throw new IOException(r13.getException());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) r13.getResult();
                r3.f = httpURLConnection;
                r13 = httpURLConnection.getInputStream();
                try {
                    inputStream = r3.f.getErrorStream();
                    try {
                        responseCode = r3.f.getResponseCode();
                        r10 = Integer.valueOf(responseCode);
                        if (responseCode == 200) {
                            try {
                                synchronized (r3) {
                                    r3.c = 8;
                                }
                                r3.p.e(0, qi3.f);
                                ji3 j = r3.j(r3.f);
                                HttpURLConnection httpURLConnection2 = (HttpURLConnection) j.b;
                                if (httpURLConnection2 != null) {
                                    try {
                                        inputStream2 = httpURLConnection2.getInputStream();
                                        try {
                                            j.g(inputStream2);
                                            break;
                                        } catch (IOException unused2) {
                                            break;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (inputStream2 != null) {
                                                try {
                                                    inputStream2.close();
                                                } catch (IOException unused3) {
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (IOException unused4) {
                                        inputStream2 = null;
                                        break;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        inputStream2 = null;
                                    }
                                }
                            } catch (IOException unused5) {
                                if (r3.e) {
                                    synchronized (r3) {
                                        r3.c = 8;
                                    }
                                }
                                r3.b(r13, inputStream);
                                synchronized (r3) {
                                    r3.b = false;
                                }
                                if (r3.e || (r10 != 0 && !ni3.d(r10.intValue()))) {
                                    r2 = 0;
                                }
                                if (r2 != 0) {
                                    defaultClock.getClass();
                                    r3.k(new Date(System.currentTimeMillis()));
                                }
                                if (r2 == 0 && r10.intValue() != 200) {
                                    String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r10);
                                    if (r10.intValue() == 403) {
                                        format2 = ni3.f(r3.f.getErrorStream());
                                    }
                                    l58Var = new l58(r10.intValue(), format2, 0);
                                    r3.g(l58Var);
                                    r3.f = null;
                                    return Tasks.forResult(null);
                                }
                                r3.h();
                                r3.f = null;
                                return Tasks.forResult(null);
                            }
                        }
                        r3.b(r13, inputStream);
                        synchronized (r3) {
                            r3.b = false;
                        }
                        r2 = (r3.e || !ni3.d(responseCode)) ? 0 : 1;
                        if (r2 != 0) {
                            defaultClock.getClass();
                            r3.k(new Date(System.currentTimeMillis()));
                        }
                    } catch (IOException unused6) {
                        r10 = 0;
                    } catch (Throwable th5) {
                        th = th5;
                        r10 = 0;
                        inputStream3 = r13;
                        num = r10;
                        r3.b(inputStream3, inputStream);
                        synchronized (r3) {
                        }
                    }
                } catch (IOException unused7) {
                    inputStream = null;
                    r13 = r13;
                    r10 = inputStream;
                    if (r3.e) {
                    }
                    r3.b(r13, inputStream);
                    synchronized (r3) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    inputStream = null;
                    r10 = 0;
                }
                if (r2 == 0 && responseCode != 200) {
                    String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r10);
                    if (responseCode == 403) {
                        format3 = ni3.f(r3.f.getErrorStream());
                    }
                    l58Var = new l58(responseCode, format3, 0);
                    r3.g(l58Var);
                    r3.f = null;
                    return Tasks.forResult(null);
                }
                r3.h();
                r3.f = null;
                return Tasks.forResult(null);
            case 24:
                p03 p03Var = (p03) this.b;
                ExecutorService executorService = (ExecutorService) this.c;
                p03Var.getClass();
                if (!task.isSuccessful()) {
                    return Tasks.forException(task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error")));
                }
                String str = (String) task.getResult();
                return ((k48) ((l48) p03Var.d)).d().continueWithTask(Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")), new o3(25, p03Var, str)).continueWith(executorService, new k09(str));
            default:
                p03 p03Var2 = (p03) this.b;
                String str2 = (String) this.c;
                r38 r38Var = (r38) p03Var2.c;
                if (!task.isSuccessful()) {
                    return Tasks.forException(task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error")));
                }
                String str3 = ((mu0) task.getResult()).a;
                r38Var.a();
                s48 s48Var = r38Var.c;
                String str4 = s48Var.a;
                r38Var.a();
                RegisterRequest registerRequest = new RegisterRequest(pic.c(r38Var), s48Var.b, str4, str2, str3);
                zzm zzmVar = (zzm) p03Var2.b;
                TaskApiCall.Builder a = TaskApiCall.a();
                a.c = new Feature[]{zzi.a};
                a.a = new gvo(r2, zzmVar, registerRequest);
                a.d = 39001;
                return zzmVar.h(0, a.a());
        }
    }

    public /* synthetic */ o3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        di3 di3Var = (di3) this.b;
        fi3 fi3Var = (fi3) this.c;
        synchronized (di3Var) {
            di3Var.c = Tasks.forResult(fi3Var);
        }
        return Tasks.forResult(fi3Var);
    }
}
