package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class td {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26084a;

    /* renamed from: b, reason: collision with root package name */
    public Long f26085b;

    /* renamed from: c, reason: collision with root package name */
    public String f26086c;

    /* renamed from: d, reason: collision with root package name */
    public long f26087d;

    /* renamed from: e, reason: collision with root package name */
    public long f26088e;

    /* renamed from: f, reason: collision with root package name */
    public long f26089f;

    public td(boolean z10, Long l10, String str, long j10, long j11, long j12) {
        this.f26084a = z10;
        this.f26085b = l10;
        this.f26086c = str;
        this.f26087d = j10;
        this.f26088e = j11;
        this.f26089f = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return this.f26084a == tdVar.f26084a && Intrinsics.areEqual(this.f26085b, tdVar.f26085b) && Intrinsics.areEqual(this.f26086c, tdVar.f26086c) && this.f26087d == tdVar.f26087d && this.f26088e == tdVar.f26088e && this.f26089f == tdVar.f26089f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f26084a) * 31;
        Long l10 = this.f26085b;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.f26086c;
        return Long.hashCode(this.f26089f) + ((Long.hashCode(this.f26088e) + ((Long.hashCode(this.f26087d) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Config(isEnabled=" + this.f26084a + ", sdkDebuggerExpirationTime=" + this.f26085b + ", sdkDebuggerAuthCode=" + this.f26086c + ", sdkDebuggerFlushIntervalBytes=" + this.f26087d + ", sdkDebuggerFlushIntervalSeconds=" + this.f26088e + ", sdkDebuggerMaxPayloadBytes=" + this.f26089f + ")";
    }

    public /* synthetic */ td() {
        this(false, null, null, 0L, 0L, 0L);
    }
}
