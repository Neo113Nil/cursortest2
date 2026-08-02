package defpackage;

import com.google.android.gms.internal.ads.zzeqb;
import com.google.android.gms.internal.ads.zzeqc;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzeqi;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzhdr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n5o {
    public final zzhdr c;
    public zzeqc f;
    public final String h;
    public final int i;
    public final zzeqb j;
    public zzfld k;
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public int g = Integer.MAX_VALUE;
    public boolean l = false;

    public n5o(zzflo zzfloVar, zzeqb zzeqbVar, zzhdr zzhdrVar) {
        zzfln zzflnVar = zzfloVar.b;
        this.i = zzflnVar.b.r;
        this.j = zzeqbVar;
        this.c = zzhdrVar;
        this.h = zzeqi.a(zzfloVar);
        List list = zzflnVar.a;
        for (int i = 0; i < list.size(); i++) {
            this.a.put((zzfld) list.get(i), Integer.valueOf(i));
        }
        this.b.addAll(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2.v0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6.l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r6.d.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return (com.google.android.gms.internal.ads.zzfld) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzfld a() {
        try {
            if (d()) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    zzfld zzfldVar = (zzfld) arrayList.get(i);
                    String str = zzfldVar.t0;
                    HashSet hashSet = this.e;
                    if (!hashSet.contains(str)) {
                        break;
                    }
                    i++;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005f A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:5:0x0009, B:8:0x0010, B:10:0x0013, B:14:0x001a, B:16:0x0024, B:17:0x002c, B:19:0x0030, B:22:0x0037, B:24:0x003b, B:25:0x0042, B:26:0x0048, B:33:0x0057, B:36:0x005f, B:42:0x005b, B:47:0x0067, B:52:0x006a, B:7:0x000a, B:29:0x004a, B:31:0x0050), top: B:3:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(zzeqc zzeqcVar, zzfld zzfldVar) {
        boolean z;
        z = false;
        this.l = false;
        this.d.remove(zzfldVar);
        synchronized (this) {
        }
        if (this.c.isDone()) {
            zzeqcVar.zzm();
            return;
        }
        Integer num = (Integer) this.a.get(zzfldVar);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (intValue > this.g) {
            this.j.c(zzfldVar);
            return;
        }
        if (this.f != null) {
            this.j.c(this.k);
        }
        this.g = intValue;
        this.f = zzeqcVar;
        this.k = zzfldVar;
        synchronized (this) {
            try {
                if (!e(true)) {
                    if (!f()) {
                        if (z) {
                            g();
                            return;
                        }
                        return;
                    }
                }
                z = true;
                if (z) {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:5:0x0010, B:8:0x0017, B:10:0x001a, B:17:0x0029, B:20:0x0031, B:25:0x002d, B:30:0x0039, B:36:0x003e, B:13:0x001c, B:15:0x0022, B:7:0x0011), top: B:3:0x0002, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(zzfld zzfldVar) {
        boolean z;
        z = false;
        this.l = false;
        this.d.remove(zzfldVar);
        this.e.remove(zzfldVar.t0);
        synchronized (this) {
        }
        if (!this.c.isDone()) {
            synchronized (this) {
                try {
                    if (!e(true)) {
                        if (!f()) {
                            if (!z) {
                                g();
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized boolean d() {
        if (this.l) {
            return false;
        }
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty() && ((zzfld) arrayList.get(0)).v0 && !this.d.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.c.isDone()) {
                ArrayList arrayList2 = this.d;
                if (arrayList2.size() < this.i && e(false)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized boolean e(boolean z) {
        try {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                zzfld zzfldVar = (zzfld) it.next();
                Integer num = (Integer) this.a.get(zzfldVar);
                int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z || !this.e.contains(zzfldVar.t0)) {
                    int i = this.g;
                    if (intValue < i) {
                        return true;
                    }
                    if (intValue > i) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean f() {
        try {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.a.get((zzfld) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        zzeqb zzeqbVar = this.j;
        zzfld zzfldVar = this.k;
        synchronized (zzeqbVar) {
            try {
                zzeqbVar.h = zzeqbVar.a.elapsedRealtime() - zzeqbVar.i;
                if (zzfldVar != null) {
                    zzeqbVar.f.a(zzfldVar);
                }
                zzeqbVar.g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzeqc zzeqcVar = this.f;
        zzhdr zzhdrVar = this.c;
        if (zzeqcVar != null) {
            zzhdrVar.d(zzeqcVar);
        } else {
            zzhdrVar.e(new zzeqf(3, this.h));
        }
    }
}
