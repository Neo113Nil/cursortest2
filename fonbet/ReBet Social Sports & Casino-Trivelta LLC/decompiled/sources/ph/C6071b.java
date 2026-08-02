package ph;

import rh.InterfaceC6297o;
import rh.InterfaceC6299q;

/* renamed from: ph.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6071b extends AbstractC6073d {

    /* renamed from: b, reason: collision with root package name */
    public final String f63205b;

    /* renamed from: c, reason: collision with root package name */
    public final String f63206c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6297o f63207d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC6299q f63208e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f63209f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f63210g;

    public C6071b(String str, String str2, InterfaceC6297o interfaceC6297o, InterfaceC6299q interfaceC6299q, boolean z10, boolean z11) {
        if (str == null) {
            throw new NullPointerException("Null traceId");
        }
        this.f63205b = str;
        if (str2 == null) {
            throw new NullPointerException("Null spanId");
        }
        this.f63206c = str2;
        if (interfaceC6297o == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.f63207d = interfaceC6297o;
        if (interfaceC6299q == null) {
            throw new NullPointerException("Null traceState");
        }
        this.f63208e = interfaceC6299q;
        this.f63209f = z10;
        this.f63210g = z11;
    }

    @Override // rh.InterfaceC6292j
    public boolean a() {
        return this.f63209f;
    }

    @Override // rh.InterfaceC6292j
    public String c() {
        return this.f63206c;
    }

    @Override // rh.InterfaceC6292j
    public String d() {
        return this.f63205b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6073d) {
            AbstractC6073d abstractC6073d = (AbstractC6073d) obj;
            if (this.f63205b.equals(abstractC6073d.d()) && this.f63206c.equals(abstractC6073d.c()) && this.f63207d.equals(abstractC6073d.g()) && this.f63208e.equals(abstractC6073d.f()) && this.f63209f == abstractC6073d.a() && this.f63210g == abstractC6073d.isValid()) {
                return true;
            }
        }
        return false;
    }

    @Override // rh.InterfaceC6292j
    public InterfaceC6299q f() {
        return this.f63208e;
    }

    @Override // rh.InterfaceC6292j
    public InterfaceC6297o g() {
        return this.f63207d;
    }

    public int hashCode() {
        return ((((((((((this.f63205b.hashCode() ^ 1000003) * 1000003) ^ this.f63206c.hashCode()) * 1000003) ^ this.f63207d.hashCode()) * 1000003) ^ this.f63208e.hashCode()) * 1000003) ^ (this.f63209f ? 1231 : 1237)) * 1000003) ^ (this.f63210g ? 1231 : 1237);
    }

    @Override // ph.AbstractC6073d, rh.InterfaceC6292j
    public boolean isValid() {
        return this.f63210g;
    }

    public String toString() {
        return "ImmutableSpanContext{traceId=" + this.f63205b + ", spanId=" + this.f63206c + ", traceFlags=" + this.f63207d + ", traceState=" + this.f63208e + ", remote=" + this.f63209f + ", valid=" + this.f63210g + "}";
    }
}
