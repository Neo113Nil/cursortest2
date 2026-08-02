package l3;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import com.android.billingclient.api.m;
import com.google.firebase.messaging.u;
import e3.p;
import e3.x;
import eg.e1;
import f3.c;
import f3.k;
import f3.v;
import i3.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k2.a0;
import m3.j;
import m3.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements g, c {
    public static final String j = x.g("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final v f19340a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.x f19341b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19342c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public j f19343d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f19344e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f19345f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f19346g;

    /* renamed from: h, reason: collision with root package name */
    public final m f19347h;

    /* renamed from: i, reason: collision with root package name */
    public SystemForegroundService f19348i;

    public b(Context context) {
        v e7 = v.e(context);
        this.f19340a = e7;
        this.f19341b = e7.f9429d;
        this.f19343d = null;
        this.f19344e = new LinkedHashMap();
        this.f19346g = new HashMap();
        this.f19345f = new HashMap();
        this.f19347h = new m(e7.j);
        e7.f9431f.a(this);
    }

    public static Intent c(Context context, j jVar, p pVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f20321a);
        intent.putExtra("KEY_GENERATION", jVar.f20322b);
        intent.putExtra("KEY_NOTIFICATION_ID", pVar.f8557a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", pVar.f8558b);
        intent.putExtra("KEY_NOTIFICATION", pVar.f8559c);
        return intent;
    }

    @Override // f3.c
    public final void a(j jVar, boolean z5) {
        Map.Entry entry;
        synchronized (this.f19342c) {
            try {
                e1 e1Var = ((o) this.f19345f.remove(jVar)) != null ? (e1) this.f19346g.remove(jVar) : null;
                if (e1Var != null) {
                    e1Var.k(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        p pVar = (p) this.f19344e.remove(jVar);
        if (jVar.equals(this.f19343d)) {
            if (this.f19344e.size() > 0) {
                Iterator it = this.f19344e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f19343d = (j) entry.getKey();
                if (this.f19348i != null) {
                    p pVar2 = (p) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f19348i;
                    int i5 = pVar2.f8557a;
                    int i10 = pVar2.f8558b;
                    Notification notification = pVar2.f8559c;
                    systemForegroundService.getClass();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 31) {
                        u.l(systemForegroundService, i5, notification, i10);
                    } else if (i11 >= 29) {
                        u.k(systemForegroundService, i5, notification, i10);
                    } else {
                        systemForegroundService.startForeground(i5, notification);
                    }
                    this.f19348i.f2940d.cancel(pVar2.f8557a);
                }
            } else {
                this.f19343d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f19348i;
        if (pVar == null || systemForegroundService2 == null) {
            return;
        }
        x.e().a(j, "Removing Notification (id: " + pVar.f8557a + ", workSpecId: " + jVar + ", notificationType: " + pVar.f8558b);
        systemForegroundService2.f2940d.cancel(pVar.f8557a);
    }

    @Override // i3.g
    public final void b(o oVar, i3.c cVar) {
        if (cVar instanceof i3.b) {
            String str = oVar.f20331a;
            x.e().a(j, "Constraints unmet for WorkSpec " + str);
            j j6 = m4.g.j(oVar);
            int i5 = ((i3.b) cVar).f10903a;
            v vVar = this.f19340a;
            ((a0) vVar.f9429d.f6182a).execute(new n3.m(vVar.f9431f, new k(j6), true, i5));
        }
    }

    public final void d(Intent intent) {
        if (this.f19348i == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i5 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        x.e().a(j, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        p pVar = new p(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f19344e;
        linkedHashMap.put(jVar, pVar);
        p pVar2 = (p) linkedHashMap.get(this.f19343d);
        if (pVar2 == null) {
            this.f19343d = jVar;
        } else {
            this.f19348i.f2940d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i5 |= ((p) ((Map.Entry) it.next()).getValue()).f8558b;
                }
                pVar = new p(pVar2.f8557a, pVar2.f8559c, i5);
            } else {
                pVar = pVar2;
            }
        }
        SystemForegroundService systemForegroundService = this.f19348i;
        int i10 = pVar.f8557a;
        int i11 = pVar.f8558b;
        Notification notification2 = pVar.f8559c;
        systemForegroundService.getClass();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            u.l(systemForegroundService, i10, notification2, i11);
        } else if (i12 >= 29) {
            u.k(systemForegroundService, i10, notification2, i11);
        } else {
            systemForegroundService.startForeground(i10, notification2);
        }
    }

    public final void e() {
        this.f19348i = null;
        synchronized (this.f19342c) {
            try {
                Iterator it = this.f19346g.values().iterator();
                while (it.hasNext()) {
                    ((e1) it.next()).k(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f19340a.f9431f.g(this);
    }

    public final void f(int i5, int i10) {
        x.e().f(j, "Foreground service timed out, FGS type: " + i10);
        for (Map.Entry entry : this.f19344e.entrySet()) {
            if (((p) entry.getValue()).f8558b == i10) {
                j jVar = (j) entry.getKey();
                v vVar = this.f19340a;
                ((a0) vVar.f9429d.f6182a).execute(new n3.m(vVar.f9431f, new k(jVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f19348i;
        if (systemForegroundService != null) {
            systemForegroundService.f2938b = true;
            x.e().a(SystemForegroundService.f2937e, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i5);
        }
    }
}
