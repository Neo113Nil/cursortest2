package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    protected volatile S f59307a;

    /* renamed from: b, reason: collision with root package name */
    private volatile AbstractC5903i f59308b;

    public final int a() {
        if (this.f59308b != null) {
            return this.f59308b.size();
        }
        if (this.f59307a != null) {
            return this.f59307a.getSerializedSize();
        }
        return 0;
    }

    public final S b(S s11) {
        if (this.f59307a == null) {
            synchronized (this) {
                if (this.f59307a == null) {
                    try {
                        this.f59307a = s11;
                        this.f59308b = AbstractC5903i.f59377b;
                    } catch (A unused) {
                        this.f59307a = s11;
                        this.f59308b = AbstractC5903i.f59377b;
                    }
                }
            }
        }
        return this.f59307a;
    }

    public final S c(S s11) {
        S s12 = this.f59307a;
        this.f59308b = null;
        this.f59307a = s11;
        return s12;
    }

    public final AbstractC5903i d() {
        if (this.f59308b != null) {
            return this.f59308b;
        }
        synchronized (this) {
            try {
                if (this.f59308b != null) {
                    return this.f59308b;
                }
                if (this.f59307a == null) {
                    this.f59308b = AbstractC5903i.f59377b;
                } else {
                    this.f59308b = this.f59307a.toByteString();
                }
                return this.f59308b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d11 = (D) obj;
        S s11 = this.f59307a;
        S s12 = d11.f59307a;
        return (s11 == null && s12 == null) ? d().equals(d11.d()) : (s11 == null || s12 == null) ? s11 != null ? s11.equals(d11.b(s11.getDefaultInstanceForType())) : b(s12.getDefaultInstanceForType()).equals(s12) : s11.equals(s12);
    }

    public int hashCode() {
        return 1;
    }
}
