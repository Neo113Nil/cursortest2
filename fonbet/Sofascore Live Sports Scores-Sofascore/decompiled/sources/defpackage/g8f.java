package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g8f {
    public final Context b;
    public final ti3 c;
    public final zbl d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    static {
        rik.x("Processor");
    }

    public g8f(Context context, ti3 ti3Var, zbl zblVar, WorkDatabase workDatabase) {
        this.b = context;
        this.c = ti3Var;
        this.d = zblVar;
        this.e = workDatabase;
    }

    public static boolean d(gdl gdlVar, int i) {
        if (gdlVar == null) {
            rik.o().getClass();
            return false;
        }
        gdlVar.l.y(new wcl(i));
        rik.o().getClass();
        return true;
    }

    public final void a(qe6 qe6Var) {
        synchronized (this.k) {
            this.j.add(qe6Var);
        }
    }

    public final gdl b(String str) {
        gdl gdlVar = (gdl) this.f.remove(str);
        boolean z = gdlVar != null;
        if (!z) {
            gdlVar = (gdl) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        int i = vqi.k;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable unused) {
                            rik.o().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return gdlVar;
    }

    public final gdl c(String str) {
        gdl gdlVar = (gdl) this.f.get(str);
        return gdlVar == null ? (gdl) this.g.get(str) : gdlVar;
    }

    public final void e(qbl qblVar) {
        this.d.d.execute(new gjc(18, this, qblVar));
    }
}
