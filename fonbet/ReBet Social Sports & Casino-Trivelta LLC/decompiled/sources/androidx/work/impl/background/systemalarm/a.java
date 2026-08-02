package androidx.work.impl.background.systemalarm;

import Q2.AbstractC1508t;
import Q2.InterfaceC1491b;
import R2.A;
import R2.C1549z;
import R2.InterfaceC1530f;
import X2.h;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements InterfaceC1530f {

    /* renamed from: f, reason: collision with root package name */
    public static final String f23796f = AbstractC1508t.i("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f23797a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f23798b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f23799c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1491b f23800d;

    /* renamed from: e, reason: collision with root package name */
    public final A f23801e;

    public a(Context context, InterfaceC1491b interfaceC1491b, A a10) {
        this.f23797a = context;
        this.f23800d = interfaceC1491b;
        this.f23801e = a10;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, hVar);
    }

    public static Intent d(Context context, h hVar, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return q(intent, hVar);
    }

    public static Intent e(Context context, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, hVar);
    }

    public static Intent f(Context context, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, hVar);
    }

    public static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public static h p(Intent intent) {
        return new h(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static Intent q(Intent intent, h hVar) {
        intent.putExtra("KEY_WORKSPEC_ID", hVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", hVar.a());
        return intent;
    }

    @Override // R2.InterfaceC1530f
    public void c(h hVar, boolean z10) {
        synchronized (this.f23799c) {
            try {
                c cVar = (c) this.f23798b.remove(hVar);
                this.f23801e.b(hVar);
                if (cVar != null) {
                    cVar.g(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(Intent intent, int i10, d dVar) {
        AbstractC1508t.e().a(f23796f, "Handling constraints changed " + intent);
        new b(this.f23797a, this.f23800d, i10, dVar).a();
    }

    public final void h(Intent intent, int i10, d dVar) {
        synchronized (this.f23799c) {
            try {
                h p10 = p(intent);
                AbstractC1508t e10 = AbstractC1508t.e();
                String str = f23796f;
                e10.a(str, "Handing delay met for " + p10);
                if (this.f23798b.containsKey(p10)) {
                    AbstractC1508t.e().a(str, "WorkSpec " + p10 + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    c cVar = new c(this.f23797a, i10, dVar, this.f23801e.e(p10));
                    this.f23798b.put(p10, cVar);
                    cVar.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(Intent intent, int i10) {
        h p10 = p(intent);
        boolean z10 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        AbstractC1508t.e().a(f23796f, "Handling onExecutionCompleted " + intent + ", " + i10);
        c(p10, z10);
    }

    public final void j(Intent intent, int i10, d dVar) {
        AbstractC1508t.e().a(f23796f, "Handling reschedule " + intent + ", " + i10);
        dVar.g().v();
    }

    public final void k(Intent intent, int i10, d dVar) {
        h p10 = p(intent);
        AbstractC1508t e10 = AbstractC1508t.e();
        String str = f23796f;
        e10.a(str, "Handling schedule work for " + p10);
        WorkDatabase s10 = dVar.g().s();
        s10.beginTransaction();
        try {
            WorkSpec i11 = s10.l().i(p10.b());
            if (i11 == null) {
                AbstractC1508t.e().k(str, "Skipping scheduling " + p10 + " because it's no longer in the DB");
                return;
            }
            if (i11.state.b()) {
                AbstractC1508t.e().k(str, "Skipping scheduling " + p10 + "because it is finished.");
                return;
            }
            long c10 = i11.c();
            if (i11.l()) {
                AbstractC1508t.e().a(str, "Opportunistically setting an alarm for " + p10 + "at " + c10);
                T2.a.c(this.f23797a, s10, p10, c10);
                dVar.f().a().execute(new d.b(dVar, a(this.f23797a), i10));
            } else {
                AbstractC1508t.e().a(str, "Setting up Alarms for " + p10 + "at " + c10);
                T2.a.c(this.f23797a, s10, p10, c10);
            }
            s10.setTransactionSuccessful();
        } finally {
            s10.endTransaction();
        }
    }

    public final void l(Intent intent, d dVar) {
        List<C1549z> remove;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            remove = new ArrayList(1);
            C1549z b10 = this.f23801e.b(new h(string, i10));
            if (b10 != null) {
                remove.add(b10);
            }
        } else {
            remove = this.f23801e.remove(string);
        }
        for (C1549z c1549z : remove) {
            AbstractC1508t.e().a(f23796f, "Handing stopWork work for " + string);
            dVar.i().e(c1549z);
            T2.a.a(this.f23797a, dVar.g().s(), c1549z.a());
            dVar.c(c1549z.a(), false);
        }
    }

    public boolean n() {
        boolean z10;
        synchronized (this.f23799c) {
            z10 = !this.f23798b.isEmpty();
        }
        return z10;
    }

    public void o(Intent intent, int i10, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, dVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, dVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC1508t.e().c(f23796f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, dVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, dVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, dVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
            return;
        }
        AbstractC1508t.e().k(f23796f, "Ignoring intent " + intent);
    }
}
