package Ph;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8993a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1463m f8994b;

    /* renamed from: c, reason: collision with root package name */
    public final Function3 f8995c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8996d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f8997e;

    public B(Object obj, InterfaceC1463m interfaceC1463m, Function3 function3, Object obj2, Throwable th2) {
        this.f8993a = obj;
        this.f8994b = interfaceC1463m;
        this.f8995c = function3;
        this.f8996d = obj2;
        this.f8997e = th2;
    }

    public static /* synthetic */ B b(B b10, Object obj, InterfaceC1463m interfaceC1463m, Function3 function3, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = b10.f8993a;
        }
        if ((i10 & 2) != 0) {
            interfaceC1463m = b10.f8994b;
        }
        if ((i10 & 4) != 0) {
            function3 = b10.f8995c;
        }
        if ((i10 & 8) != 0) {
            obj2 = b10.f8996d;
        }
        if ((i10 & 16) != 0) {
            th2 = b10.f8997e;
        }
        Throwable th3 = th2;
        Function3 function32 = function3;
        return b10.a(obj, interfaceC1463m, function32, obj2, th3);
    }

    public final B a(Object obj, InterfaceC1463m interfaceC1463m, Function3 function3, Object obj2, Throwable th2) {
        return new B(obj, interfaceC1463m, function3, obj2, th2);
    }

    public final boolean c() {
        return this.f8997e != null;
    }

    public final void d(C1469p c1469p, Throwable th2) {
        InterfaceC1463m interfaceC1463m = this.f8994b;
        if (interfaceC1463m != null) {
            c1469p.p(interfaceC1463m, th2);
        }
        Function3 function3 = this.f8995c;
        if (function3 != null) {
            c1469p.r(function3, th2, this.f8993a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return Intrinsics.areEqual(this.f8993a, b10.f8993a) && Intrinsics.areEqual(this.f8994b, b10.f8994b) && Intrinsics.areEqual(this.f8995c, b10.f8995c) && Intrinsics.areEqual(this.f8996d, b10.f8996d) && Intrinsics.areEqual(this.f8997e, b10.f8997e);
    }

    public int hashCode() {
        Object obj = this.f8993a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC1463m interfaceC1463m = this.f8994b;
        int hashCode2 = (hashCode + (interfaceC1463m == null ? 0 : interfaceC1463m.hashCode())) * 31;
        Function3 function3 = this.f8995c;
        int hashCode3 = (hashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.f8996d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f8997e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f8993a + ", cancelHandler=" + this.f8994b + ", onCancellation=" + this.f8995c + ", idempotentResume=" + this.f8996d + ", cancelCause=" + this.f8997e + ')';
    }

    public /* synthetic */ B(Object obj, InterfaceC1463m interfaceC1463m, Function3 function3, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC1463m, (i10 & 4) != 0 ? null : function3, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
