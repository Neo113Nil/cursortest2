package org.spongycastle.crypto.params;

/* loaded from: classes5.dex */
public abstract class p extends AbstractC5975b {

    /* renamed from: b, reason: collision with root package name */
    public q f62671b;

    public p(boolean z10, q qVar) {
        super(z10);
        this.f62671b = qVar;
    }

    public q b() {
        return this.f62671b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        q qVar = this.f62671b;
        return qVar == null ? pVar.b() == null : qVar.equals(pVar.b());
    }

    public int hashCode() {
        q qVar = this.f62671b;
        if (qVar != null) {
            return qVar.hashCode();
        }
        return 0;
    }
}
