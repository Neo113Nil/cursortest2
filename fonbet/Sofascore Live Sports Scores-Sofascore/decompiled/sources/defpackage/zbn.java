package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zbn implements pcn {
    public final k7n a;
    public final edn b;
    public final boolean c;
    public final b9n d;

    public zbn(edn ednVar, b9n b9nVar, k7n k7nVar) {
        this.b = ednVar;
        this.c = k7nVar instanceof w9n;
        this.d = b9nVar;
        this.a = k7nVar;
    }

    @Override // defpackage.pcn
    public final void a(Object obj, Object obj2) {
        tcn.b(obj, obj2);
        if (!this.c || ((w9n) obj2).zzb.a.isEmpty()) {
            return;
        }
        throw null;
    }

    @Override // defpackage.pcn
    public final boolean b(Object obj) {
        ((w9n) obj).zzb.c();
        return true;
    }

    @Override // defpackage.pcn
    public final void c(Object obj) {
        this.b.j(obj);
        this.d.a(obj);
    }

    @Override // defpackage.pcn
    public final void d(Object obj, b1l b1lVar) {
        Iterator b = ((w9n) obj).zzb.b();
        if (b.hasNext()) {
            throw fc6.d((Map.Entry) b.next());
        }
        fdn fdnVar = ((y9n) obj).zzc;
        for (int i = 0; i < fdnVar.a; i++) {
            int i2 = fdnVar.b[i] >>> 3;
            Object obj2 = fdnVar.c[i];
            boolean z = obj2 instanceof g8n;
            r8n r8nVar = (r8n) b1lVar.b;
            if (z) {
                r8nVar.k(i2, (g8n) obj2);
            } else {
                r8nVar.j(i2, (k7n) obj2);
            }
        }
    }

    @Override // defpackage.pcn
    public final int e(y9n y9nVar) {
        fdn fdnVar = y9nVar.zzc;
        int i = fdnVar.d;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < fdnVar.a; i2++) {
                int i3 = fdnVar.b[i2] >>> 3;
                g8n g8nVar = (g8n) fdnVar.c[i2];
                int r = r8n.r(8);
                int r2 = r8n.r(i3) + r8n.r(16);
                int r3 = r8n.r(24);
                int d = g8nVar.d();
                i = wt3.B(r + r, r2, x5n.x(d, d, r3), i);
            }
            fdnVar.d = i;
        }
        if (this.c) {
            zcn zcnVar = ((w9n) y9nVar).zzb.a;
            if (zcnVar.b > 0) {
                zcnVar.c(0).getKey().getClass();
                pvd.j();
                return 0;
            }
            Iterator it = zcnVar.d().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null) {
                    pvd.j();
                    return 0;
                }
                entry.getValue();
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.pcn
    public final void f(Object obj, byte[] bArr, int i, int i2, p7n p7nVar) {
        y9n y9nVar = (y9n) obj;
        if (y9nVar.zzc == fdn.f) {
            y9nVar.zzc = fdn.a();
        }
        throw null;
    }

    @Override // defpackage.pcn
    public final int g(y9n y9nVar) {
        int hashCode = y9nVar.zzc.hashCode();
        if (!this.c) {
            return hashCode;
        }
        return ((w9n) y9nVar).zzb.a.hashCode() + (hashCode * 53);
    }

    @Override // defpackage.pcn
    public final boolean h(y9n y9nVar, y9n y9nVar2) {
        if (!y9nVar.zzc.equals(y9nVar2.zzc)) {
            return false;
        }
        if (this.c) {
            return ((w9n) y9nVar).zzb.equals(((w9n) y9nVar2).zzb);
        }
        return true;
    }

    @Override // defpackage.pcn
    public final void i(Object obj, zz0 zz0Var, z8n z8nVar) {
        this.b.h(obj);
        throw null;
    }

    @Override // defpackage.pcn
    public final y9n zza() {
        k7n k7nVar = this.a;
        if (k7nVar instanceof y9n) {
            return ((y9n) k7nVar).m();
        }
        r9n r9nVar = (r9n) ((y9n) k7nVar).r(5);
        boolean k = r9nVar.b.k();
        y9n y9nVar = r9nVar.b;
        if (!k) {
            return y9nVar;
        }
        y9nVar.getClass();
        gcn.c.a(y9nVar.getClass()).c(y9nVar);
        y9nVar.l();
        return r9nVar.b;
    }
}
