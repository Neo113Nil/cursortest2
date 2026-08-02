package org.spongycastle.crypto.params;

/* renamed from: org.spongycastle.crypto.params.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5979f extends AbstractC5975b {

    /* renamed from: b, reason: collision with root package name */
    public C5980g f62650b;

    public AbstractC5979f(boolean z10, C5980g c5980g) {
        super(z10);
        this.f62650b = c5980g;
    }

    public C5980g b() {
        return this.f62650b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC5979f)) {
            return false;
        }
        AbstractC5979f abstractC5979f = (AbstractC5979f) obj;
        C5980g c5980g = this.f62650b;
        return c5980g == null ? abstractC5979f.b() == null : c5980g.equals(abstractC5979f.b());
    }

    public int hashCode() {
        int i10 = !a() ? 1 : 0;
        C5980g c5980g = this.f62650b;
        return c5980g != null ? i10 ^ c5980g.hashCode() : i10;
    }
}
