package defpackage;

import android.content.Context;
import android.os.IInterface;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class fmn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1k b;

    public /* synthetic */ fmn(i1k i1kVar, int i) {
        this.a = i;
        this.b = i1kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        i1k i1kVar = this.b;
        switch (i) {
            case 0:
                if (((IInterface) i1kVar.k) != null) {
                    Context context = (Context) i1kVar.c;
                    zxc zxcVar = (zxc) i1kVar.j;
                    zxcVar.getClass();
                    context.unbindService(zxcVar);
                    i1kVar.a = false;
                    i1kVar.k = null;
                    i1kVar.j = null;
                    ArrayList arrayList = (ArrayList) i1kVar.e;
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                    i1kVar.l();
                    return;
                }
                return;
            default:
                if (((IInterface) i1kVar.k) != null) {
                    i1kVar.k = null;
                    i1kVar.l();
                    return;
                }
                return;
        }
    }
}
