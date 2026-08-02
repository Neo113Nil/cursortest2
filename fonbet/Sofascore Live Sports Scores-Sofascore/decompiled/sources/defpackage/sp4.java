package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sp4 {
    public final kd9 a;
    public final HashMap b;
    public final /* synthetic */ tp4 c;

    public sp4(tp4 tp4Var, kd9 kd9Var) {
        this.c = tp4Var;
        this.a = kd9Var;
        HashMap hashMap = new HashMap();
        cck it = vv9.t(kd9Var.b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) kd9Var.b.get(str);
            uri.getClass();
            hashMap.put(uri, new rp4(this.c, uri, str));
        }
        this.b = hashMap;
    }

    public final boolean a(Uri uri, long j) {
        boolean z;
        HashMap hashMap = this.b;
        rp4 rp4Var = (rp4) wv8.g(hashMap, uri, uri);
        rp4Var.getClass();
        rp4Var.i = SystemClock.elapsedRealtime() + j;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = hashMap.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            tp4 tp4Var = this.c;
            if (!hasNext) {
                Uri uri2 = tp4Var.p;
                if (uri2 == null || uri.equals(uri2)) {
                    hv9 hv9Var = tp4Var.l;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    int i = 0;
                    while (true) {
                        if (i >= hv9Var.size()) {
                            z = false;
                            break;
                        }
                        Uri c = ((kd9) hv9Var.get(i)).c();
                        sp4 sp4Var = (sp4) tp4Var.d.get(c);
                        sp4Var.getClass();
                        if (!sp4Var.c(c, elapsedRealtime2)) {
                            tp4Var.p = c;
                            Uri f = tp4Var.f(c);
                            rp4 rp4Var2 = (rp4) wv8.g(sp4Var.b, c, c);
                            rp4Var2.getClass();
                            rp4Var2.e(f);
                            z = true;
                            break;
                        }
                        i++;
                    }
                    if (!z) {
                        return false;
                    }
                }
                return true;
            }
            rp4 rp4Var3 = (rp4) it.next();
            String str = rp4Var3.b;
            kd9 kd9Var = this.a;
            if (!str.equals(kd9Var.d) && elapsedRealtime > rp4Var3.i) {
                Uri c2 = kd9Var.c();
                String str2 = rp4Var3.b;
                z1a.E(kd9Var.b.containsKey(str2));
                kd9Var.d = str2;
                if (c2.equals(tp4Var.p)) {
                    tp4Var.i(rp4Var3.a);
                }
                rp4 rp4Var4 = (rp4) hashMap.get(c2);
                rp4Var4.getClass();
                rp4Var3.l = rp4Var4.l;
                rp4Var4.l = false;
                return true;
            }
        }
    }

    public final zc9 b(Uri uri) {
        rp4 rp4Var = (rp4) wv8.g(this.b, uri, uri);
        rp4Var.getClass();
        return rp4Var.e;
    }

    public final boolean c(Uri uri, long j) {
        rp4 rp4Var = (rp4) wv8.g(this.b, uri, uri);
        rp4Var.getClass();
        return j <= rp4Var.i;
    }

    public final void d(boolean z, Uri uri) {
        rp4 rp4Var = (rp4) wv8.g(this.b, uri, uri);
        rp4Var.getClass();
        rp4Var.e(z ? rp4Var.a() : rp4Var.a);
    }
}
