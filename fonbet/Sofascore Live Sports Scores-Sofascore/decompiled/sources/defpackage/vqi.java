package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vqi implements ypd, qe6 {
    public static final /* synthetic */ int k = 0;
    public final Context a;
    public final xbl b;
    public final zti c;
    public final Object d = new Object();
    public qbl e;
    public final LinkedHashMap f;
    public final HashMap g;
    public final HashMap h;
    public final zl1 i;
    public SystemForegroundService j;

    static {
        rik.x("SystemFgDispatcher");
    }

    public vqi(Context context) {
        this.a = context;
        xbl d = xbl.d(context);
        this.b = d;
        this.c = d.d;
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashMap();
        this.g = new HashMap();
        this.i = new zl1(d.j);
        d.f.a(this);
    }

    public static Intent b(Context context, qbl qblVar, gm8 gm8Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", qblVar.a);
        intent.putExtra("KEY_GENERATION", qblVar.b);
        intent.putExtra("KEY_NOTIFICATION_ID", gm8Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gm8Var.b);
        intent.putExtra("KEY_NOTIFICATION", gm8Var.c);
        return intent;
    }

    @Override // defpackage.qe6
    public final void a(qbl qblVar, boolean z) {
        Map.Entry entry;
        synchronized (this.d) {
            try {
                yda ydaVar = ((lcl) this.g.remove(qblVar)) != null ? (yda) this.h.remove(qblVar) : null;
                if (ydaVar != null) {
                    ydaVar.e(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gm8 gm8Var = (gm8) this.f.remove(qblVar);
        if (qblVar.equals(this.e)) {
            if (this.f.size() > 0) {
                Iterator it = this.f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.e = (qbl) entry.getKey();
                if (this.j != null) {
                    gm8 gm8Var2 = (gm8) entry.getValue();
                    SystemForegroundService systemForegroundService = this.j;
                    int i = gm8Var2.a;
                    int i2 = gm8Var2.b;
                    Notification notification = gm8Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        eq3.V(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        eq3.T(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.j.d.cancel(gm8Var2.a);
                }
            } else {
                this.e = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.j;
        if (gm8Var == null || systemForegroundService2 == null) {
            return;
        }
        rik o = rik.o();
        qblVar.toString();
        o.getClass();
        systemForegroundService2.d.cancel(gm8Var.a);
    }

    public final void c(Intent intent) {
        if (this.j == null) {
            a70.r("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        qbl qblVar = new qbl(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        rik.o().getClass();
        if (notification == null) {
            a70.p("Notification passed in the intent was null.");
            return;
        }
        gm8 gm8Var = new gm8(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f;
        linkedHashMap.put(qblVar, gm8Var);
        gm8 gm8Var2 = (gm8) linkedHashMap.get(this.e);
        if (gm8Var2 == null) {
            this.e = qblVar;
        } else {
            this.j.d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((gm8) ((Map.Entry) it.next()).getValue()).b;
                }
                gm8Var = new gm8(gm8Var2.a, gm8Var2.c, i);
            } else {
                gm8Var = gm8Var2;
            }
        }
        SystemForegroundService systemForegroundService = this.j;
        int i2 = gm8Var.a;
        int i3 = gm8Var.b;
        Notification notification2 = gm8Var.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            eq3.V(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            eq3.T(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    @Override // defpackage.ypd
    public final void d(lcl lclVar, jn3 jn3Var) {
        if (jn3Var instanceof in3) {
            rik.o().getClass();
            qbl p = rha.p(lclVar);
            int i = ((in3) jn3Var).a;
            xbl xblVar = this.b;
            zti ztiVar = xblVar.d;
            hfi hfiVar = new hfi(xblVar.f, new cci(p), true, i);
            ztiVar.getClass();
            ((zbl) ztiVar).a.execute(hfiVar);
        }
    }

    public final void e() {
        this.j = null;
        synchronized (this.d) {
            try {
                Iterator it = this.h.values().iterator();
                while (it.hasNext()) {
                    ((yda) it.next()).e(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g8f g8fVar = this.b.f;
        synchronized (g8fVar.k) {
            g8fVar.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        rik.o().getClass();
        for (Map.Entry entry : this.f.entrySet()) {
            if (((gm8) entry.getValue()).b == i2) {
                qbl qblVar = (qbl) entry.getKey();
                xbl xblVar = this.b;
                zti ztiVar = xblVar.d;
                hfi hfiVar = new hfi(xblVar.f, new cci(qblVar), true, -128);
                ztiVar.getClass();
                ((zbl) ztiVar).a.execute(hfiVar);
            }
        }
        SystemForegroundService systemForegroundService = this.j;
        if (systemForegroundService != null) {
            systemForegroundService.b = true;
            rik.o().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i);
        }
    }
}
