package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vz8 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ yz8 c;

    public vz8(yz8 yz8Var) {
        this.c = yz8Var;
    }

    public static void a(kbc kbcVar, int i, Object obj, int i2) {
        obc obcVar;
        obc obcVar2;
        pbc pbcVar = kbcVar.a;
        jbc jbcVar = kbcVar.b;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    jbcVar.n((sbc) obj);
                    return;
                }
                return;
            }
            switch (i) {
                case 513:
                    jbcVar.a();
                    return;
                case 514:
                    jbcVar.c();
                    return;
                case 515:
                    jbcVar.b();
                    return;
                default:
                    return;
            }
        }
        if (i == 264 || i == 262) {
            xz8 xz8Var = (xz8) obj;
            obc obcVar3 = xz8Var.b;
            obcVar = xz8Var.a;
            obcVar2 = obcVar3;
        } else {
            if (i == 265 || i == 266) {
                throw fn0.h(obj);
            }
            obcVar2 = (obc) obj;
            obcVar = null;
        }
        if (obcVar2 != null) {
            boolean z = true;
            if ((kbcVar.d & 2) == 0 && !obcVar2.h(kbcVar.c)) {
                sbc sbcVar = pbc.c().u;
                z = ((sbcVar == null ? false : sbcVar.c) && obcVar2.d() && i == 262 && i2 == 3 && obcVar != null) ? true ^ obcVar.d() : false;
            }
            if (z) {
                switch (i) {
                    case 257:
                        jbcVar.d(pbcVar, obcVar2);
                        return;
                    case 258:
                        jbcVar.h(pbcVar, obcVar2);
                        return;
                    case 259:
                        jbcVar.e(pbcVar, obcVar2);
                        return;
                    case 260:
                        jbcVar.m(obcVar2);
                        return;
                    case 261:
                        jbcVar.getClass();
                        return;
                    case 262:
                        jbcVar.j(pbcVar, obcVar2, i2, obcVar2);
                        return;
                    case 263:
                        jbcVar.l(pbcVar, obcVar2, i2);
                        return;
                    case 264:
                        jbcVar.j(pbcVar, obcVar2, i2, obcVar);
                        return;
                    case 265:
                        jbcVar.f(obcVar, obcVar2);
                        return;
                    case 266:
                        jbcVar.g(obcVar, obcVar2, i2);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int n;
        ArrayList arrayList = this.a;
        yz8 yz8Var = this.c;
        ArrayList arrayList2 = yz8Var.h;
        vie vieVar = yz8Var.s;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && yz8Var.h().c.equals(((obc) obj).c)) {
            yz8Var.q(true);
        }
        ArrayList arrayList3 = this.b;
        if (i == 262) {
            xz8 xz8Var = (xz8) obj;
            obc obcVar = xz8Var.b;
            if (xz8Var.c) {
                vieVar.s(obcVar);
            }
            if (yz8Var.v != null && obcVar.d()) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    vieVar.r((obc) it.next());
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    vieVar.q((obc) obj);
                    break;
                case 258:
                    vieVar.r((obc) obj);
                    break;
                case 259:
                    obc obcVar2 = (obc) obj;
                    vieVar.getClass();
                    if (obcVar2.c() != vieVar && (n = vieVar.n(obcVar2)) >= 0) {
                        vie.w((yie) vieVar.r.get(n));
                        break;
                    }
                    break;
            }
        } else {
            xz8 xz8Var2 = (xz8) obj;
            obc obcVar3 = xz8Var2.b;
            arrayList3.add(obcVar3);
            vieVar.q(obcVar3);
            if (xz8Var2.c) {
                vieVar.s(obcVar3);
            }
        }
        try {
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a((kbc) it2.next(), i, obj, i2);
                    }
                    arrayList.clear();
                    return;
                }
                pbc pbcVar = (pbc) ((WeakReference) arrayList2.get(size)).get();
                if (pbcVar == null) {
                    arrayList2.remove(size);
                } else {
                    arrayList.addAll(pbcVar.b);
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
