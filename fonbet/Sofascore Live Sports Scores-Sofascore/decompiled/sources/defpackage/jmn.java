package defpackage;

import com.google.android.gms.cast.b;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.cast.zzp;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class jmn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ int c;

    public /* synthetic */ jmn(b bVar, int i, int i2) {
        this.a = i2;
        this.b = bVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = this.c;
                b bVar = this.b;
                zzbm zzbmVar = bVar.a;
                if (i != 0) {
                    zzbmVar.G = 1;
                    synchronized (zzbmVar.F) {
                        try {
                            Iterator it = zzbmVar.F.iterator();
                            while (it.hasNext()) {
                                ((zzp) it.next()).b(i);
                            }
                        } finally {
                        }
                    }
                    bVar.a.l();
                    return;
                }
                zzbmVar.G = 3;
                zzbmVar.n = true;
                zzbmVar.o = true;
                synchronized (zzbmVar.F) {
                    try {
                        Iterator it2 = zzbmVar.F.iterator();
                        while (it2.hasNext()) {
                            ((zzp) it2.next()).a();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                zzbm zzbmVar2 = this.b.a;
                zzbmVar2.G = 4;
                List list = zzbmVar2.F;
                int i2 = this.c;
                synchronized (list) {
                    try {
                        Iterator it3 = zzbmVar2.F.iterator();
                        while (it3.hasNext()) {
                            ((zzp) it3.next()).c(i2);
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                this.b.a.E.b(this.c);
                return;
            default:
                b bVar2 = this.b;
                zzbm zzbmVar3 = bVar2.a;
                zzbmVar3.y = -1;
                zzbmVar3.z = -1;
                zzbmVar3.u = null;
                zzbmVar3.v = null;
                zzbmVar3.w = 0.0d;
                zzbmVar3.q();
                zzbmVar3.x = false;
                zzbmVar3.A = null;
                zzbmVar3.G = 1;
                List list2 = zzbmVar3.F;
                int i3 = this.c;
                synchronized (list2) {
                    try {
                        Iterator it4 = zzbmVar3.F.iterator();
                        while (it4.hasNext()) {
                            ((zzp) it4.next()).d(i3);
                        }
                    } finally {
                    }
                }
                zzbm zzbmVar4 = bVar2.a;
                zzbmVar4.l();
                ListenerHolder.ListenerKey listenerKey = ListenerHolders.a(zzbmVar4.g, zzbmVar4.l, "castDeviceControllerListenerKey").b;
                Preconditions.j(listenerKey, "Key must not be null");
                zzbmVar4.f(listenerKey, 8415);
                return;
        }
    }
}
