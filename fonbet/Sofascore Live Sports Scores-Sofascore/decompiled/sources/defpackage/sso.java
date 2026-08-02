package defpackage;

import com.google.android.gms.internal.pal.zzjn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sso extends haa {
    @Override // defpackage.haa
    public final qso O(zzjn zzjnVar) {
        qso qsoVar;
        qso qsoVar2 = qso.b;
        synchronized (zzjnVar) {
            try {
                qsoVar = zzjnVar.b;
                if (qsoVar != qsoVar2) {
                    zzjnVar.b = qsoVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qsoVar;
    }

    @Override // defpackage.haa
    public final uso Q(zzjn zzjnVar) {
        uso usoVar;
        uso usoVar2 = uso.c;
        synchronized (zzjnVar) {
            try {
                usoVar = zzjnVar.c;
                if (usoVar != usoVar2) {
                    zzjnVar.c = usoVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return usoVar;
    }

    @Override // defpackage.haa
    public final void S(uso usoVar, uso usoVar2) {
        usoVar.b = usoVar2;
    }

    @Override // defpackage.haa
    public final void V(uso usoVar, Thread thread) {
        usoVar.a = thread;
    }

    @Override // defpackage.haa
    public final boolean X(zzjn zzjnVar, Object obj, Object obj2) {
        synchronized (zzjnVar) {
            try {
                if (zzjnVar.a != obj) {
                    return false;
                }
                zzjnVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.haa
    public final boolean Y(zzjn zzjnVar, uso usoVar, uso usoVar2) {
        synchronized (zzjnVar) {
            try {
                if (zzjnVar.c != usoVar) {
                    return false;
                }
                zzjnVar.c = usoVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
