package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class odb implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ odb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                vdb vdbVar = (vdb) obj;
                sdb sdbVar = (sdb) vdbVar.e;
                sdbVar.getClass();
                Iterator it = ((CopyOnWriteArraySet) vdbVar.f).iterator();
                while (it.hasNext()) {
                    udb udbVar = (udb) it.next();
                    if (!udbVar.d && udbVar.c) {
                        j78 d = udbVar.b.d();
                        udbVar.b = new h78(1);
                        udbVar.c = false;
                        sdbVar.a(udbVar.a, d);
                    }
                    zqi zqiVar = (zqi) vdbVar.d;
                    zqiVar.getClass();
                    if (zqiVar.a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            case 1:
                rd4 rd4Var = (rd4) obj;
                Iterator it2 = ((CopyOnWriteArraySet) rd4Var.e).iterator();
                while (it2.hasNext()) {
                    tdb tdbVar = (tdb) it2.next();
                    rdb rdbVar = (rdb) rd4Var.d;
                    if (!tdbVar.d && tdbVar.c) {
                        i78 c = tdbVar.b.c();
                        tdbVar.b = new h78(0);
                        tdbVar.c = false;
                        rdbVar.b(tdbVar.a, c);
                    }
                    if (((yqi) rd4Var.c).a.hasMessages(0)) {
                        break;
                    }
                }
                break;
            default:
                c40 c40Var = (c40) obj;
                int i2 = message.what;
                if (i2 == 1) {
                    ((pii) c40Var.h).a();
                } else if (i2 == 2) {
                    ((qii) c40Var.i).a();
                } else if (i2 == 3) {
                    ((rii) c40Var.j).a();
                } else if (i2 == 4) {
                    ((nc9) c40Var.k).a();
                }
                break;
        }
        return true;
    }
}
