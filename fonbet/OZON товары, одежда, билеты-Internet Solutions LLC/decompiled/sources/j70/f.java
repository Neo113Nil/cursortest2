package j70;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final long f69488a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f69489b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f69490c;

    /* renamed from: d, reason: collision with root package name */
    private final String f69491d;

    /* renamed from: e, reason: collision with root package name */
    private final long f69492e;

    /* renamed from: f, reason: collision with root package name */
    private final long f69493f;

    /* renamed from: g, reason: collision with root package name */
    private final long f69494g;

    /* renamed from: h, reason: collision with root package name */
    private final long f69495h;

    public f(long j11, @NotNull String accountBalanceRelevanceDate, @NotNull String phoneNumber, String str, long j12, long j13, long j14, long j15) {
        Intrinsics.checkNotNullParameter(accountBalanceRelevanceDate, "accountBalanceRelevanceDate");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f69488a = j11;
        this.f69489b = accountBalanceRelevanceDate;
        this.f69490c = phoneNumber;
        this.f69491d = str;
        this.f69492e = j12;
        this.f69493f = j13;
        this.f69494g = j14;
        this.f69495h = j15;
    }

    public final long a() {
        return this.f69488a;
    }

    @NotNull
    public final String b() {
        return this.f69489b;
    }

    public final String c() {
        return this.f69491d;
    }

    public final long d() {
        return this.f69495h;
    }

    public final long e() {
        return this.f69494g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f69488a == fVar.f69488a && Intrinsics.d(this.f69489b, fVar.f69489b) && Intrinsics.d(this.f69490c, fVar.f69490c) && Intrinsics.d(this.f69491d, fVar.f69491d) && this.f69492e == fVar.f69492e && this.f69493f == fVar.f69493f && this.f69494g == fVar.f69494g && this.f69495h == fVar.f69495h;
    }

    @NotNull
    public final String f() {
        return this.f69490c;
    }

    public final long g() {
        return this.f69492e;
    }

    public final long h() {
        return this.f69493f;
    }

    public final int hashCode() {
        int a11 = G.g.a(G.g.a(Long.hashCode(this.f69488a) * 31, 31, this.f69489b), 31, this.f69490c);
        String str = this.f69491d;
        return Long.hashCode(this.f69495h) + Pk0.c.a(Pk0.c.a(Pk0.c.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f69492e), 31, this.f69493f), 31, this.f69494g);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OfflinePayStaticDataState(accountBalanceCents=");
        sb2.append(this.f69488a);
        sb2.append(", accountBalanceRelevanceDate=");
        sb2.append(this.f69489b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f69490c);
        sb2.append(", bankImage=");
        sb2.append(this.f69491d);
        sb2.append(", receiverCommissionAmountCents=");
        sb2.append(this.f69492e);
        sb2.append(", senderCommissionAmountCents=");
        sb2.append(this.f69493f);
        sb2.append(", minTransferAmountCents=");
        sb2.append(this.f69494g);
        sb2.append(", maxTransferAmountCents=");
        return P4.f.a(this.f69495h, ")", sb2);
    }
}
