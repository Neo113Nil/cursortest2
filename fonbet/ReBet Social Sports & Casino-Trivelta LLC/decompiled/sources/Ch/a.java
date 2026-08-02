package Ch;

import rh.EnumC6296n;

/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: d, reason: collision with root package name */
    public final EnumC6296n f2291d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2292e;

    public a(EnumC6296n enumC6296n, String str) {
        if (enumC6296n == null) {
            throw new NullPointerException("Null statusCode");
        }
        this.f2291d = enumC6296n;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f2292e = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f2291d.equals(bVar.getStatusCode()) && this.f2292e.equals(bVar.getDescription())) {
                return true;
            }
        }
        return false;
    }

    @Override // Ch.d
    public String getDescription() {
        return this.f2292e;
    }

    @Override // Ch.d
    public EnumC6296n getStatusCode() {
        return this.f2291d;
    }

    public int hashCode() {
        return ((this.f2291d.hashCode() ^ 1000003) * 1000003) ^ this.f2292e.hashCode();
    }

    public String toString() {
        return "ImmutableStatusData{statusCode=" + this.f2291d + ", description=" + this.f2292e + "}";
    }
}
