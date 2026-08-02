package h9;

import android.content.Context;
import q9.InterfaceC6129a;

/* renamed from: h9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4491c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47831a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6129a f47832b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC6129a f47833c;

    /* renamed from: d, reason: collision with root package name */
    public final String f47834d;

    public C4491c(Context context, InterfaceC6129a interfaceC6129a, InterfaceC6129a interfaceC6129a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f47831a = context;
        if (interfaceC6129a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f47832b = interfaceC6129a;
        if (interfaceC6129a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f47833c = interfaceC6129a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f47834d = str;
    }

    @Override // h9.h
    public Context b() {
        return this.f47831a;
    }

    @Override // h9.h
    public String c() {
        return this.f47834d;
    }

    @Override // h9.h
    public InterfaceC6129a d() {
        return this.f47833c;
    }

    @Override // h9.h
    public InterfaceC6129a e() {
        return this.f47832b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f47831a.equals(hVar.b()) && this.f47832b.equals(hVar.e()) && this.f47833c.equals(hVar.d()) && this.f47834d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f47831a.hashCode() ^ 1000003) * 1000003) ^ this.f47832b.hashCode()) * 1000003) ^ this.f47833c.hashCode()) * 1000003) ^ this.f47834d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f47831a + ", wallClock=" + this.f47832b + ", monotonicClock=" + this.f47833c + ", backendName=" + this.f47834d + "}";
    }
}
