package Ah;

import oh.g;

/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: j, reason: collision with root package name */
    public final String f458j;

    /* renamed from: k, reason: collision with root package name */
    public final g f459k;

    public a(String str, g gVar) {
        this.f458j = str;
        if (gVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f459k = gVar;
    }

    @Override // Ah.c
    public g e() {
        return this.f459k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f458j;
            if (str != null ? str.equals(cVar.g()) : cVar.g() == null) {
                if (this.f459k.equals(cVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Ah.c
    public String g() {
        return this.f458j;
    }

    public int hashCode() {
        String str = this.f458j;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f459k.hashCode();
    }

    public String toString() {
        return "Resource{schemaUrl=" + this.f458j + ", attributes=" + this.f459k + "}";
    }
}
