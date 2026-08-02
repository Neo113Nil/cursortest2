package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.appevents.k;
import com.facebook.appevents.l;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.k0;
import com.facebook.w;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ kd(int i, long j, String str) {
        this.a = i;
        this.b = j;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                if (md.f == null) {
                    md.f = new jy0(Long.valueOf(j), null);
                }
                jy0 jy0Var = md.f;
                if (jy0Var != null) {
                    jy0Var.c = Long.valueOf(j);
                }
                int i2 = 1;
                if (md.e.get() <= 0) {
                    kd kdVar = new kd(i2, j, str);
                    synchronized (md.d) {
                        md.c = md.a.schedule(kdVar, x.b(w.b()) == null ? 60 : r7.b, TimeUnit.SECONDS);
                        Unit unit = Unit.a;
                    }
                }
                long j2 = md.i;
                long j3 = j2 > 0 ? (j - j2) / 1000 : 0L;
                k kVar = qv0.a;
                Context a = w.a();
                u k = x.k(w.b(), false);
                if (k != null && k.d && j3 > 0) {
                    l lVar = new l(a, (String) null);
                    Bundle bundle = new Bundle(1);
                    bundle.putCharSequence("fb_aa_time_spent_view_name", str);
                    double d = j3;
                    if (k0.c() && !cw3.a.contains(lVar)) {
                        try {
                            l.f(lVar, "fb_aa_time_spent_on_view", Double.valueOf(d), bundle, false, md.b());
                        } catch (Throwable th) {
                            cw3.a(lVar, th);
                        }
                    }
                }
                jy0 jy0Var2 = md.f;
                if (jy0Var2 != null) {
                    jy0Var2.i();
                    return;
                }
                return;
            default:
                if (md.f == null) {
                    md.f = new jy0(Long.valueOf(j), null);
                }
                if (md.e.get() <= 0) {
                    f8h.w(str, md.f, md.h);
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(w.a()).edit();
                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    edit.apply();
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(w.a()).edit();
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    edit2.apply();
                    md.f = null;
                }
                synchronized (md.d) {
                    md.c = null;
                    Unit unit2 = Unit.a;
                }
                return;
        }
    }
}
