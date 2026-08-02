package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzaue;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zjn {
    public static final boolean c = zzaue.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(long j, String str) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new yjn(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j;
        this.b = true;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            j = 0;
        } else {
            j = ((yjn) arrayList.get(arrayList.size() - 1)).c - ((yjn) arrayList.get(0)).c;
        }
        if (j > 0) {
            long j2 = ((yjn) arrayList.get(0)).c;
            zzaue.b("(%-4d ms) %s", Long.valueOf(j), str);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yjn yjnVar = (yjn) it.next();
                long j3 = yjnVar.c;
                zzaue.b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(yjnVar.b), yjnVar.a);
                j2 = j3;
            }
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        zzaue.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
