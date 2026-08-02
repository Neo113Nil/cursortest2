package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pw3 {
    public final r18 a;

    public pw3(r18 r18Var) {
        this.a = r18Var;
    }

    public final void a(av0 av0Var) {
        r18 r18Var = this.a;
        HashSet<x5g> hashSet = av0Var.a;
        ArrayList arrayList = new ArrayList(k13.r(hashSet, 10));
        for (x5g x5gVar : hashSet) {
            String str = ((yu0) x5gVar).b;
            yu0 yu0Var = (yu0) x5gVar;
            String str2 = yu0Var.d;
            String str3 = yu0Var.e;
            String str4 = yu0Var.c;
            long j = yu0Var.f;
            d4a d4aVar = y5g.a;
            if (str3.length() > 256) {
                str3 = str3.substring(0, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            arrayList.add(new zu0(str, str2, str3, str4, j));
        }
        synchronized (((k89) r18Var.f)) {
            try {
                if (((k89) r18Var.f).d(arrayList)) {
                    ((xx3) ((hcc) r18Var.c).c).g(new ecg(14, r18Var, ((k89) r18Var.f).c()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
