package I5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r5.C6208b;
import r5.InterfaceC6207a;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6207a f5464a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5465b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5466c;

    /* renamed from: d, reason: collision with root package name */
    public final Q5.c f5467d;

    public p(InterfaceC6207a clock, String sessionId, long j10, Q5.c coralogixOptions) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(coralogixOptions, "coralogixOptions");
        this.f5464a = clock;
        this.f5465b = sessionId;
        this.f5466c = j10;
        this.f5467d = coralogixOptions;
    }

    public static /* synthetic */ p b(p pVar, InterfaceC6207a interfaceC6207a, String str, long j10, Q5.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6207a = pVar.f5464a;
        }
        if ((i10 & 2) != 0) {
            str = pVar.f5465b;
        }
        if ((i10 & 4) != 0) {
            j10 = pVar.f5466c;
        }
        if ((i10 & 8) != 0) {
            cVar = pVar.f5467d;
        }
        Q5.c cVar2 = cVar;
        return pVar.a(interfaceC6207a, str, j10, cVar2);
    }

    public final p a(InterfaceC6207a clock, String sessionId, long j10, Q5.c coralogixOptions) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(coralogixOptions, "coralogixOptions");
        return new p(clock, sessionId, j10, coralogixOptions);
    }

    public final Q5.c c() {
        return this.f5467d;
    }

    public final long d() {
        return this.f5466c;
    }

    public final String e() {
        return this.f5465b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f5464a, pVar.f5464a) && Intrinsics.areEqual(this.f5465b, pVar.f5465b) && this.f5466c == pVar.f5466c && Intrinsics.areEqual(this.f5467d, pVar.f5467d);
    }

    public int hashCode() {
        return (((((this.f5464a.hashCode() * 31) + this.f5465b.hashCode()) * 31) + Long.hashCode(this.f5466c)) * 31) + this.f5467d.hashCode();
    }

    public String toString() {
        return "SessionConfiguration(clock=" + this.f5464a + ", sessionId=" + this.f5465b + ", sessionCreationTimeMillis=" + this.f5466c + ", coralogixOptions=" + this.f5467d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ p(InterfaceC6207a interfaceC6207a, String str, long j10, Q5.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6207a, str, (i10 & 4) != 0 ? interfaceC6207a.a() : j10, cVar);
        interfaceC6207a = (i10 & 1) != 0 ? new C6208b() : interfaceC6207a;
    }
}
