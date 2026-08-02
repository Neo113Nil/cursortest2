package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class san {
    public volatile k7n a;
    public volatile e8n b;

    public final g8n a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = g8n.b;
                } else {
                    this.b = this.a.a();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(y9n y9nVar) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a != null) {
                return;
            }
            try {
                this.a = y9nVar;
                this.b = g8n.b;
            } catch (lan unused) {
                this.a = y9nVar;
                this.b = g8n.b;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof san)) {
            return false;
        }
        san sanVar = (san) obj;
        k7n k7nVar = this.a;
        k7n k7nVar2 = sanVar.a;
        if (k7nVar == null && k7nVar2 == null) {
            return a().equals(sanVar.a());
        }
        if (k7nVar != null && k7nVar2 != null) {
            return k7nVar.equals(k7nVar2);
        }
        if (k7nVar != null) {
            sanVar.b((y9n) ((y9n) k7nVar).r(6));
            return k7nVar.equals(sanVar.a);
        }
        y9n y9nVar = (y9n) k7nVar2;
        b((y9n) y9nVar.r(6));
        return this.a.equals(y9nVar);
    }

    public final int hashCode() {
        return 1;
    }
}
