package androidx.work.impl.foreground;

import Ph.C0;
import Q2.AbstractC1508t;
import Q2.C1498i;
import R2.InterfaceC1530f;
import R2.Y;
import X2.h;
import X2.p;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.constraints.b;
import androidx.work.impl.constraints.f;
import androidx.work.impl.constraints.i;
import androidx.work.impl.constraints.j;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public class a implements f, InterfaceC1530f {

    /* renamed from: k, reason: collision with root package name */
    public static final String f23907k = AbstractC1508t.i("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public Context f23908a;

    /* renamed from: b, reason: collision with root package name */
    public Y f23909b;

    /* renamed from: c, reason: collision with root package name */
    public final Z2.b f23910c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23911d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public h f23912e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f23913f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f23914g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f23915h;

    /* renamed from: i, reason: collision with root package name */
    public final i f23916i;

    /* renamed from: j, reason: collision with root package name */
    public b f23917j;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public class RunnableC0425a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23918a;

        public RunnableC0425a(String str) {
            this.f23918a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WorkSpec g10 = a.this.f23909b.p().g(this.f23918a);
            if (g10 == null || !g10.l()) {
                return;
            }
            synchronized (a.this.f23911d) {
                a.this.f23914g.put(p.a(g10), g10);
                a aVar = a.this;
                a.this.f23915h.put(p.a(g10), j.c(aVar.f23916i, g10, aVar.f23910c.b(), a.this));
            }
        }
    }

    public interface b {
        void a(int i10, Notification notification);

        void c(int i10);

        void d(int i10, int i11, Notification notification);

        void e(int i10);
    }

    public a(Context context) {
        this.f23908a = context;
        Y n10 = Y.n(context);
        this.f23909b = n10;
        this.f23910c = n10.t();
        this.f23912e = null;
        this.f23913f = new LinkedHashMap();
        this.f23915h = new HashMap();
        this.f23914g = new HashMap();
        this.f23916i = new i(this.f23909b.r());
        this.f23909b.p().e(this);
    }

    public static Intent d(Context context, h hVar, C1498i c1498i) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c1498i.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1498i.a());
        intent.putExtra("KEY_NOTIFICATION", c1498i.b());
        intent.putExtra("KEY_WORKSPEC_ID", hVar.b());
        intent.putExtra("KEY_GENERATION", hVar.a());
        return intent;
    }

    public static Intent f(Context context, h hVar, C1498i c1498i) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", hVar.b());
        intent.putExtra("KEY_GENERATION", hVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", c1498i.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1498i.a());
        intent.putExtra("KEY_NOTIFICATION", c1498i.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // R2.InterfaceC1530f
    public void c(h hVar, boolean z10) {
        Map.Entry entry;
        synchronized (this.f23911d) {
            try {
                C0 c02 = ((WorkSpec) this.f23914g.remove(hVar)) != null ? (C0) this.f23915h.remove(hVar) : null;
                if (c02 != null) {
                    c02.cancel((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C1498i c1498i = (C1498i) this.f23913f.remove(hVar);
        if (hVar.equals(this.f23912e)) {
            if (this.f23913f.size() > 0) {
                Iterator it = this.f23913f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f23912e = (h) entry.getKey();
                if (this.f23917j != null) {
                    C1498i c1498i2 = (C1498i) entry.getValue();
                    this.f23917j.d(c1498i2.c(), c1498i2.a(), c1498i2.b());
                    this.f23917j.e(c1498i2.c());
                }
            } else {
                this.f23912e = null;
            }
        }
        b bVar = this.f23917j;
        if (c1498i == null || bVar == null) {
            return;
        }
        AbstractC1508t.e().a(f23907k, "Removing Notification (id: " + c1498i.c() + ", workSpecId: " + hVar + ", notificationType: " + c1498i.a());
        bVar.e(c1498i.c());
    }

    @Override // androidx.work.impl.constraints.f
    public void e(WorkSpec workSpec, androidx.work.impl.constraints.b bVar) {
        if (bVar instanceof b.C0420b) {
            String str = workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String;
            AbstractC1508t.e().a(f23907k, "Constraints unmet for WorkSpec " + str);
            this.f23909b.x(p.a(workSpec), ((b.C0420b) bVar).a());
        }
    }

    public final void h(Intent intent) {
        AbstractC1508t.e().f(f23907k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f23909b.a(UUID.fromString(stringExtra));
    }

    public final void i(Intent intent) {
        if (this.f23917j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        h hVar = new h(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC1508t.e().a(f23907k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        C1498i c1498i = new C1498i(intExtra, notification, intExtra2);
        this.f23913f.put(hVar, c1498i);
        C1498i c1498i2 = (C1498i) this.f23913f.get(this.f23912e);
        if (c1498i2 == null) {
            this.f23912e = hVar;
        } else {
            this.f23917j.a(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = this.f23913f.entrySet().iterator();
                while (it.hasNext()) {
                    i10 |= ((C1498i) ((Map.Entry) it.next()).getValue()).a();
                }
                c1498i = new C1498i(c1498i2.c(), c1498i2.b(), i10);
            } else {
                c1498i = c1498i2;
            }
        }
        this.f23917j.d(c1498i.c(), c1498i.a(), c1498i.b());
    }

    public final void j(Intent intent) {
        AbstractC1508t.e().f(f23907k, "Started foreground service " + intent);
        this.f23910c.d(new RunnableC0425a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void k(Intent intent, int i10) {
        AbstractC1508t.e().f(f23907k, "Stopping foreground service");
        b bVar = this.f23917j;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    public void l() {
        this.f23917j = null;
        synchronized (this.f23911d) {
            try {
                Iterator it = this.f23915h.values().iterator();
                while (it.hasNext()) {
                    ((C0) it.next()).cancel((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f23909b.p().m(this);
    }

    public void m(Intent intent, int i10) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent, i10);
        }
    }

    public void n(int i10, int i11) {
        AbstractC1508t.e().f(f23907k, "Foreground service timed out, FGS type: " + i11);
        for (Map.Entry entry : this.f23913f.entrySet()) {
            if (((C1498i) entry.getValue()).a() == i11) {
                this.f23909b.x((h) entry.getKey(), -128);
            }
        }
        b bVar = this.f23917j;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    public void o(b bVar) {
        if (this.f23917j != null) {
            AbstractC1508t.e().c(f23907k, "A callback already exists.");
        } else {
            this.f23917j = bVar;
        }
    }
}
