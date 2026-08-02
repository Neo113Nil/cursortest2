package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.internal.d;
import com.inmobi.media.core.config.models.CrashConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yz8 {
    public oac A;
    public int B;
    public ejg C;
    public hcc D;
    public final dad E;
    public final vdb c;
    public obc d;
    public ebc e;
    public mbc f;
    public final Context g;
    public final xl0 n;
    public final hpo o;
    public final boolean p;
    public final boolean q;
    public z9c r;
    public final vie s;
    public final qbc t;
    public sbc u;
    public obc v;
    public obc w;
    public obc x;
    public dbc y;
    public oac z;
    public final vz8 a = new vz8(this);
    public final HashMap b = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final HashMap j = new HashMap();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:12:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yz8(Context context) {
        boolean z;
        gbc gbcVar;
        vdb vdbVar;
        xl0 xl0Var = new xl0(6);
        xl0Var.d = 0;
        xl0Var.e = 3;
        this.n = xl0Var;
        this.o = new hpo(this);
        this.E = new dad(this, 25);
        this.g = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i = Build.VERSION.SDK_INT;
        int i2 = 1;
        if (i >= 30) {
            int i3 = xdc.b;
            Intent intent = new Intent(context, (Class<?>) xdc.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z = true;
                this.q = z;
                int i4 = jri.a;
                Intent intent2 = new Intent(context, (Class<?>) jri.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i >= 30 || !z) ? null : new z9c(context, new j0l(this, 27));
                vie vieVar = new vie(context, this);
                this.s = vieVar;
                this.t = new qbc(new yp8(this, i2));
                a(vieVar, true);
                gbcVar = this.r;
                if (gbcVar != null) {
                    a(gbcVar, true);
                }
                vdbVar = new vdb(context, this);
                this.c = vdbVar;
                Handler handler = (Handler) vdbVar.e;
                if (vdbVar.b) {
                    vdbVar.b = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    ((Context) vdbVar.c).registerReceiver((d) vdbVar.h, intentFilter, null, handler);
                    handler.post((kac) vdbVar.i);
                    return;
                }
                return;
            }
        }
        z = false;
        this.q = z;
        int i42 = jri.a;
        Intent intent22 = new Intent(context, (Class<?>) jri.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i >= 30 || !z) ? null : new z9c(context, new j0l(this, 27));
        vie vieVar2 = new vie(context, this);
        this.s = vieVar2;
        this.t = new qbc(new yp8(this, i2));
        a(vieVar2, true);
        gbcVar = this.r;
        if (gbcVar != null) {
        }
        vdbVar = new vdb(context, this);
        this.c = vdbVar;
        Handler handler2 = (Handler) vdbVar.e;
        if (vdbVar.b) {
        }
    }

    public final void a(gbc gbcVar, boolean z) {
        if (d(gbcVar) == null) {
            nbc nbcVar = new nbc(gbcVar, z);
            this.l.add(nbcVar);
            this.a.b(513, nbcVar);
            o(nbcVar, gbcVar.g);
            pbc.b();
            gbcVar.d = this.o;
            gbcVar.j(this.z);
        }
    }

    public final String b(nbc nbcVar, String str) {
        String flattenToShortString = ((ComponentName) nbcVar.d.b).flattenToShortString();
        boolean z = nbcVar.c;
        String i = z ? str : wv8.i(flattenToShortString, ":", str);
        HashMap hashMap = this.k;
        if (!z) {
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (((obc) arrayList.get(i2)).c.equals(i)) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                int i3 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = i + "_" + i3;
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            i4 = -1;
                            break;
                        }
                        if (((obc) arrayList.get(i4)).c.equals(str2)) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 < 0) {
                        hashMap.put(new g7e(flattenToShortString, str), str2);
                        return str2;
                    }
                    i3++;
                }
            }
        }
        hashMap.put(new g7e(flattenToShortString, str), i);
        return i;
    }

    public final obc c() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            obc obcVar = (obc) it.next();
            if (obcVar != this.v && obcVar.c() == this.s && obcVar.m("android.media.intent.category.LIVE_AUDIO") && !obcVar.m("android.media.intent.category.LIVE_VIDEO") && obcVar.f()) {
                return obcVar;
            }
        }
        return this.v;
    }

    public final nbc d(gbc gbcVar) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            nbc nbcVar = (nbc) it.next();
            if (nbcVar.a == gbcVar) {
                return nbcVar;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.j.values().iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
        return arrayList;
    }

    public final void f() {
        Iterator it = this.j.values().iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
    }

    public final ebc g(obc obcVar) {
        ebc ebcVar;
        if (obcVar == this.d && (ebcVar = this.e) != null) {
            return ebcVar;
        }
        if ((obcVar instanceof lbc) && ((lbc) obcVar).n()) {
            f();
            return null;
        }
        ebc ebcVar2 = (ebc) this.b.get(obcVar.c);
        if (ebcVar2 != null) {
            return ebcVar2;
        }
        Iterator it = this.j.values().iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
        return ebcVar2;
    }

    public final obc h() {
        obc obcVar = this.d;
        if (obcVar != null) {
            return obcVar;
        }
        a70.r("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final boolean i() {
        if (!this.q) {
            return false;
        }
        sbc sbcVar = this.u;
        return sbcVar == null || sbcVar.a;
    }

    public final void j() {
        ebc g;
        if (this.d.e()) {
            List<obc> unmodifiableList = Collections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((obc) it.next()).c);
            }
            HashMap hashMap = this.b;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    ebc ebcVar = (ebc) entry.getValue();
                    ebcVar.h(0);
                    ebcVar.d();
                    it2.remove();
                }
            }
            for (obc obcVar : unmodifiableList) {
                if (!hashMap.containsKey(obcVar.c) && (g = obcVar.c().g(obcVar.b, this.d.b)) != null) {
                    g.e();
                    hashMap.put(obcVar.c, g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r0 != 2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(obc obcVar, int i, boolean z) {
        if (!this.i.contains(obcVar)) {
            Objects.toString(obcVar);
            return;
        }
        if (!obcVar.g) {
            obcVar.toString();
            return;
        }
        obc obcVar2 = this.d;
        if (obcVar2 != obcVar) {
            lbc a = obcVar2 != null ? obcVar2.a() : null;
            if (a != null && Collections.unmodifiableList(a.v).size() == 1) {
                cbc cbcVar = (cbc) a.x.get(obcVar.c);
                int i2 = cbcVar != null ? cbcVar.b : 4;
                if (i2 != 3) {
                }
            }
            if (Build.VERSION.SDK_INT >= 30) {
                gbc c = obcVar.c();
                z9c z9cVar = this.r;
                if (c == z9cVar && this.d != obcVar) {
                    z9cVar.p(obcVar.b);
                    return;
                }
            }
            l(obcVar, i, z);
            return;
        }
        obcVar.toString();
    }

    public final void l(obc obcVar, int i, boolean z) {
        hbc hbcVar;
        if (this.d == obcVar) {
            return;
        }
        boolean z2 = obcVar == this.v;
        if (this.w != null && z2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i2 = 3; i2 < stackTrace.length; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                stackTraceElement.getClassName();
                stackTraceElement.getMethodName();
                stackTraceElement.getLineNumber();
            }
            if (this.d != null) {
                Locale locale = Locale.US;
                pbc.b();
                obc obcVar2 = pbc.c().w;
            }
            this.g.getPackageName();
        }
        if (this.x != null) {
            this.x = null;
            dbc dbcVar = this.y;
            if (dbcVar != null) {
                dbcVar.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (i() && (hbcVar = obcVar.a.e) != null && hbcVar.c) {
            gbc c = obcVar.c();
            String str = obcVar.b;
            Bundle bundle = new Bundle();
            bundle.putString("clientPackageName", this.g.getPackageName());
            dbc a = c.a(str, new fbc(bundle));
            if (a != null) {
                Context context = this.g;
                Executor r = Build.VERSION.SDK_INT >= 28 ? c90.r(context) : new m10(new Handler(context.getMainLooper()), 2);
                dad dadVar = this.E;
                synchronized (a.a) {
                    try {
                        if (r == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (dadVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        a.b = r;
                        a.c = dadVar;
                        ArrayList arrayList = a.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            mac macVar = a.d;
                            ArrayList arrayList2 = a.e;
                            a.d = null;
                            a.e = null;
                            a.b.execute(new kx0(a, dadVar, macVar, arrayList2, 10));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.x = obcVar;
                this.y = a;
                a.e();
                return;
            }
            obcVar.toString();
        }
        gbc c2 = obcVar.c();
        String str2 = obcVar.b;
        Bundle bundle2 = new Bundle();
        bundle2.putString("clientPackageName", this.g.getPackageName());
        ebc f = c2.f(str2, new fbc(bundle2));
        if (f != null) {
            f.e();
        }
        if (this.d == null) {
            this.d = obcVar;
            this.e = f;
            vz8 vz8Var = this.a;
            vz8Var.getClass();
            Message obtainMessage = vz8Var.obtainMessage(262, new xz8(null, obcVar, z));
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
            return;
        }
        mbc mbcVar = this.f;
        if (mbcVar != null) {
            ebc ebcVar = mbcVar.a;
            if (!mbcVar.i && !mbcVar.j) {
                mbcVar.j = true;
                if (ebcVar != null) {
                    ebcVar.h(0);
                    ebcVar.d();
                }
            }
            this.f = null;
        }
        mbc mbcVar2 = new mbc(this, obcVar, f, i, z, null, null);
        this.f = mbcVar2;
        mbcVar2.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0138, code lost:
    
        if (r25.A.b() == r2) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        oac oacVar;
        long j;
        ArrayList arrayList;
        ef0 ef0Var = new ef0();
        qbc qbcVar = this.t;
        long j2 = 0;
        qbcVar.b = 0L;
        int i = 0;
        qbcVar.a = false;
        qbcVar.c = SystemClock.elapsedRealtime();
        ((Handler) qbcVar.d).removeCallbacks((yp8) qbcVar.e);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i2 = 0;
        boolean z = false;
        while (true) {
            size--;
            if (size < 0) {
                long j3 = j2;
                if (qbcVar.a) {
                    long j4 = qbcVar.b;
                    if (j4 > j3) {
                        ((Handler) qbcVar.d).postDelayed((yp8) qbcVar.e, j4);
                    }
                }
                boolean z2 = qbcVar.a;
                this.B = i2;
                ibc e = z ? ef0Var.e() : ibc.c;
                ibc e2 = ef0Var.e();
                if (i()) {
                    oac oacVar2 = this.A;
                    if (oacVar2 != null) {
                        oacVar2.a();
                        if (oacVar2.b.equals(e2)) {
                        }
                    }
                    if (!e2.d() || z2) {
                        oacVar = new oac(e2, z2);
                        this.A = oacVar;
                    } else if (this.A != null) {
                        this.A = null;
                        oacVar = null;
                    }
                    this.r.j(oacVar);
                }
                oac oacVar3 = this.z;
                if (oacVar3 != null) {
                    oacVar3.a();
                    if (oacVar3.b.equals(e) && this.z.b() == z2) {
                        return;
                    }
                }
                if (!e.d() || z2) {
                    this.z = new oac(e, z2);
                } else if (this.z == null) {
                    return;
                } else {
                    this.z = null;
                }
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    gbc gbcVar = ((nbc) it.next()).a;
                    if (gbcVar != this.r) {
                        gbcVar.j(this.z);
                    }
                }
                return;
            }
            pbc pbcVar = (pbc) ((WeakReference) arrayList2.get(size)).get();
            if (pbcVar == null) {
                arrayList2.remove(size);
            } else {
                ArrayList arrayList3 = pbcVar.b;
                int size2 = arrayList3.size();
                i2 += size2;
                int i3 = i;
                while (i3 < size2) {
                    kbc kbcVar = (kbc) arrayList3.get(i3);
                    ibc ibcVar = kbcVar.c;
                    if (ibcVar == null) {
                        a70.p("selector must not be null");
                        return;
                    }
                    ArrayList c = ibcVar.c();
                    if (!c.isEmpty()) {
                        Iterator it2 = c.iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (str == null) {
                                j = j2;
                                a70.p("category must not be null");
                                break;
                            }
                            long j5 = j2;
                            ArrayList arrayList4 = ef0Var.a;
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                ef0Var.a = arrayList4;
                            }
                            if (!arrayList4.contains(str)) {
                                ef0Var.a.add(str);
                            }
                            j2 = j5;
                        }
                    }
                    j = j2;
                    boolean z3 = true;
                    int i4 = (kbcVar.d & 1) != 0 ? 1 : i;
                    long j6 = kbcVar.e;
                    if (i4 == 0) {
                        qbcVar.getClass();
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                        long j7 = qbcVar.c;
                        if (j7 - j6 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                            qbcVar.b = Math.max(qbcVar.b, (j6 + CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) - j7);
                            z3 = true;
                            qbcVar.a = true;
                        }
                    }
                    if (i4 != 0) {
                        z = z3;
                    }
                    int i5 = kbcVar.d;
                    if ((i5 & 4) != 0 && !this.p) {
                        z = z3;
                    }
                    if ((i5 & 8) != 0) {
                        z = z3;
                    }
                    i3++;
                    j2 = j;
                    arrayList2 = arrayList;
                    i = 0;
                }
            }
            j2 = j2;
            arrayList2 = arrayList2;
            i = 0;
        }
    }

    public final void n() {
        obc obcVar = this.d;
        if (obcVar == null) {
            ejg ejgVar = this.C;
            if (ejgVar != null) {
                ejgVar.d();
                return;
            }
            return;
        }
        int i = obcVar.p;
        xl0 xl0Var = this.n;
        xl0Var.b = i;
        xl0Var.c = obcVar.q;
        xl0Var.d = (!obcVar.e() || pbc.g()) ? obcVar.o : 0;
        xl0Var.e = this.d.m;
        if (i() && this.d.c() == this.r) {
            xl0Var.f = z9c.m(this.e);
        } else {
            xl0Var.f = null;
        }
        Iterator it = this.m.iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
        ejg ejgVar2 = this.C;
        if (ejgVar2 != null) {
            obc obcVar2 = this.d;
            obc obcVar3 = this.v;
            if (obcVar3 == null) {
                a70.r("There is no default route.  The media router has not yet been fully initialized.");
                return;
            }
            if (obcVar2 == obcVar3 || obcVar2 == this.w) {
                ejgVar2.d();
                return;
            }
            int i2 = xl0Var.d == 1 ? 2 : 0;
            int i3 = xl0Var.c;
            int i4 = xl0Var.b;
            String str = (String) xl0Var.f;
            hcc hccVar = (hcc) ejgVar2.c;
            if (hccVar != null) {
                ql5 ql5Var = (ql5) ejgVar2.b;
                if (ql5Var != null && i2 == 0 && i3 == 0) {
                    ql5Var.d = i4;
                    sxk.a(ql5Var.a(), i4);
                } else {
                    ql5 ql5Var2 = new ql5(ejgVar2, i2, i3, i4, str);
                    ejgVar2.b = ql5Var2;
                    ((dcc) hccVar.b).a.setPlaybackToRemote(ql5Var2.a());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r20 == r18.s.g) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162 A[LOOP:5: B:79:0x0160->B:80:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017d A[LOOP:6: B:83:0x017b->B:84:0x017d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(nbc nbcVar, hbc hbcVar) {
        boolean z;
        int size;
        int size2;
        Iterator it;
        hbc hbcVar2 = nbcVar.e;
        ArrayList arrayList = nbcVar.b;
        if (hbcVar2 != hbcVar) {
            nbcVar.e = hbcVar;
            ArrayList arrayList2 = this.i;
            int i = 0;
            vz8 vz8Var = this.a;
            if (hbcVar != null) {
                List list = hbcVar.b;
                int size3 = list.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    mac macVar = (mac) list.get(i2);
                    if (macVar != null && macVar.e()) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = list.iterator();
                int i3 = 0;
                boolean z2 = false;
                while (it2.hasNext()) {
                    mac macVar2 = (mac) it2.next();
                    if (macVar2 == null || !macVar2.e()) {
                        it = it2;
                        Objects.toString(macVar2);
                    } else {
                        String d = macVar2.d();
                        int size4 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size4) {
                                i4 = -1;
                                break;
                            } else if (((obc) arrayList.get(i4)).b.equals(d)) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i4 < 0) {
                            it = it2;
                            obc obcVar = new obc(nbcVar, d, b(nbcVar, d), macVar2.a.getBoolean("isSystemRoute", false));
                            int i5 = i3 + 1;
                            arrayList.add(i3, obcVar);
                            arrayList2.add(obcVar);
                            if (macVar2.c().isEmpty()) {
                                obcVar.i(macVar2);
                                vz8Var.b(257, obcVar);
                            } else {
                                arrayList3.add(new g7e(obcVar, macVar2));
                            }
                            i3 = i5;
                        } else {
                            it = it2;
                            if (i4 < i3) {
                                macVar2.toString();
                            } else {
                                obc obcVar2 = (obc) arrayList.get(i4);
                                int i6 = i3 + 1;
                                Collections.swap(arrayList, i4, i3);
                                if (!macVar2.c().isEmpty()) {
                                    arrayList4.add(new g7e(obcVar2, macVar2));
                                } else if (p(obcVar2, macVar2) != 0 && obcVar2 == this.d) {
                                    i3 = i6;
                                    z2 = true;
                                }
                                i3 = i6;
                            }
                        }
                    }
                    it2 = it;
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    g7e g7eVar = (g7e) it3.next();
                    obc obcVar3 = (obc) g7eVar.a;
                    obcVar3.i((mac) g7eVar.b);
                    vz8Var.b(257, obcVar3);
                }
                Iterator it4 = arrayList4.iterator();
                boolean z3 = z2;
                while (it4.hasNext()) {
                    g7e g7eVar2 = (g7e) it4.next();
                    obc obcVar4 = (obc) g7eVar2.a;
                    if (p(obcVar4, (mac) g7eVar2.b) != 0 && obcVar4 == this.d) {
                        z3 = true;
                    }
                }
                z = z3;
                i = i3;
                for (size = arrayList.size() - 1; size >= i; size--) {
                    obc obcVar5 = (obc) arrayList.get(size);
                    obcVar5.i(null);
                    arrayList2.remove(obcVar5);
                }
                q(z);
                for (size2 = arrayList.size() - 1; size2 >= i; size2--) {
                    vz8Var.b(258, (obc) arrayList.remove(size2));
                }
                vz8Var.b(515, nbcVar);
            }
            if (hbcVar != null) {
                hbcVar.toString();
            } else {
                Objects.toString((ComponentName) nbcVar.d.b);
            }
            z = false;
            while (size >= i) {
            }
            q(z);
            while (size2 >= i) {
            }
            vz8Var.b(515, nbcVar);
        }
    }

    public final int p(obc obcVar, mac macVar) {
        int i = obcVar.i(macVar);
        if (i != 0) {
            int i2 = i & 1;
            vz8 vz8Var = this.a;
            if (i2 != 0) {
                vz8Var.b(259, obcVar);
            }
            if ((i & 2) != 0) {
                vz8Var.b(260, obcVar);
            }
            if ((i & 4) != 0) {
                vz8Var.b(261, obcVar);
            }
        }
        return i;
    }

    public final void q(boolean z) {
        obc obcVar = this.v;
        if (obcVar != null && !obcVar.f()) {
            Objects.toString(this.v);
            this.v = null;
        }
        obc obcVar2 = this.v;
        vie vieVar = this.s;
        ArrayList arrayList = this.i;
        if (obcVar2 == null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                obc obcVar3 = (obc) it.next();
                if (obcVar3.c() == vieVar && obcVar3.b.equals("DEFAULT_ROUTE") && obcVar3.f()) {
                    this.v = obcVar3;
                    Objects.toString(obcVar3);
                    break;
                }
            }
        }
        obc obcVar4 = this.w;
        if (obcVar4 != null && !obcVar4.f()) {
            Objects.toString(this.w);
            this.w = null;
        }
        if (this.w == null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                obc obcVar5 = (obc) it2.next();
                if (obcVar5.c() == vieVar && obcVar5.m("android.media.intent.category.LIVE_AUDIO") && !obcVar5.m("android.media.intent.category.LIVE_VIDEO") && obcVar5.f()) {
                    this.w = obcVar5;
                    Objects.toString(obcVar5);
                    break;
                }
            }
        }
        obc obcVar6 = this.d;
        if (obcVar6 == null || !obcVar6.g) {
            Objects.toString(obcVar6);
            l(c(), 0, true);
        } else if (z) {
            j();
            n();
        }
    }
}
