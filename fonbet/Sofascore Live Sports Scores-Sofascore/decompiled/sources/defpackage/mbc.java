package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mbc {
    public final ebc a;
    public final int b;
    public final boolean c;
    public final obc d;
    public final obc e;
    public final obc f;
    public final ArrayList g;
    public final WeakReference h;
    public boolean i = false;
    public boolean j = false;

    public mbc(yz8 yz8Var, obc obcVar, ebc ebcVar, int i, boolean z, obc obcVar2, Collection collection) {
        this.h = new WeakReference(yz8Var);
        this.e = obcVar;
        this.a = ebcVar;
        this.b = i;
        this.c = z;
        this.d = yz8Var.d;
        this.f = obcVar2;
        this.g = collection == null ? null : new ArrayList(collection);
        yz8Var.a.postDelayed(new yp8(this, 15), 15000L);
    }

    public final void a() {
        lbc a;
        pbc.b();
        if (this.i || this.j) {
            return;
        }
        WeakReference weakReference = this.h;
        yz8 yz8Var = (yz8) weakReference.get();
        ebc ebcVar = this.a;
        if (yz8Var == null || yz8Var.f != this) {
            if (this.i || this.j) {
                return;
            }
            this.j = true;
            if (ebcVar != null) {
                ebcVar.h(0);
                ebcVar.d();
                return;
            }
            return;
        }
        this.i = true;
        yz8Var.f = null;
        yz8 yz8Var2 = (yz8) weakReference.get();
        obc obcVar = this.d;
        int i = this.b;
        if (yz8Var2 != null) {
            HashMap hashMap = yz8Var2.b;
            if (yz8Var2.d == obcVar) {
                Message obtainMessage = yz8Var2.a.obtainMessage(263, obcVar);
                obtainMessage.arg1 = i;
                obtainMessage.sendToTarget();
                ebc ebcVar2 = yz8Var2.e;
                if (ebcVar2 != null) {
                    ebcVar2.h(i);
                    yz8Var2.e.d();
                }
                if (!hashMap.isEmpty()) {
                    for (ebc ebcVar3 : hashMap.values()) {
                        ebcVar3.h(i);
                        ebcVar3.d();
                    }
                    hashMap.clear();
                }
                yz8Var2.e = null;
            }
        }
        yz8 yz8Var3 = (yz8) weakReference.get();
        if (yz8Var3 == null) {
            return;
        }
        obc obcVar2 = this.e;
        yz8Var3.d = obcVar2;
        yz8Var3.e = ebcVar;
        vz8 vz8Var = yz8Var3.a;
        boolean z = this.c;
        obc obcVar3 = this.f;
        if (obcVar3 == null) {
            vz8Var.getClass();
            Message obtainMessage2 = vz8Var.obtainMessage(262, new xz8(obcVar, obcVar2, z));
            obtainMessage2.arg1 = i;
            obtainMessage2.sendToTarget();
        } else {
            vz8Var.getClass();
            Message obtainMessage3 = vz8Var.obtainMessage(264, new xz8(obcVar3, obcVar2, z));
            obtainMessage3.arg1 = i;
            obtainMessage3.sendToTarget();
        }
        yz8Var3.b.clear();
        yz8Var3.j();
        yz8Var3.n();
        ArrayList arrayList = this.g;
        if (arrayList == null || (a = yz8Var3.d.a()) == null) {
            return;
        }
        a.p(arrayList);
    }
}
