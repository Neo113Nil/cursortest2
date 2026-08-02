package J5;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import di.U0;
import f5.MobileVitalsSnapshot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@n
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002\u0013#B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001e\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001e\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010 ¨\u0006*"}, d2 = {"LJ5/a;", "", "Lf5/j;", "cpuUsage", "totalProcessCpuTime", "mainThreadCpuTime", "<init>", "(Lf5/j;Lf5/j;Lf5/j;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILf5/j;Lf5/j;Lf5/j;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "a", "(LJ5/a;Lci/d;Lbi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lf5/j;", "getCpuUsage", "()Lf5/j;", "getCpuUsage$annotations", "()V", com.google.crypto.tink.integration.android.b.f37029b, "getTotalProcessCpuTime", "getTotalProcessCpuTime$annotations", "c", "getMainThreadCpuTime", "getMainThreadCpuTime$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: J5.a, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class CpuUsageDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot cpuUsage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot totalProcessCpuTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot mainThreadCpuTime;

    /* renamed from: J5.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return C0128a.f5928a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CpuUsageDetails(int i10, MobileVitalsSnapshot mobileVitalsSnapshot, MobileVitalsSnapshot mobileVitalsSnapshot2, MobileVitalsSnapshot mobileVitalsSnapshot3, U0 u02) {
        if ((i10 & 1) == 0) {
            this.cpuUsage = null;
        } else {
            this.cpuUsage = mobileVitalsSnapshot;
        }
        if ((i10 & 2) == 0) {
            this.totalProcessCpuTime = null;
        } else {
            this.totalProcessCpuTime = mobileVitalsSnapshot2;
        }
        if ((i10 & 4) == 0) {
            this.mainThreadCpuTime = null;
        } else {
            this.mainThreadCpuTime = mobileVitalsSnapshot3;
        }
    }

    public static final /* synthetic */ void a(CpuUsageDetails self, ci.d output, f serialDesc) {
        if (output.m(serialDesc, 0) || self.cpuUsage != null) {
            output.C(serialDesc, 0, MobileVitalsSnapshot.a.f46422a, self.cpuUsage);
        }
        if (output.m(serialDesc, 1) || self.totalProcessCpuTime != null) {
            output.C(serialDesc, 1, MobileVitalsSnapshot.a.f46422a, self.totalProcessCpuTime);
        }
        if (!output.m(serialDesc, 2) && self.mainThreadCpuTime == null) {
            return;
        }
        output.C(serialDesc, 2, MobileVitalsSnapshot.a.f46422a, self.mainThreadCpuTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CpuUsageDetails)) {
            return false;
        }
        CpuUsageDetails cpuUsageDetails = (CpuUsageDetails) other;
        return Intrinsics.areEqual(this.cpuUsage, cpuUsageDetails.cpuUsage) && Intrinsics.areEqual(this.totalProcessCpuTime, cpuUsageDetails.totalProcessCpuTime) && Intrinsics.areEqual(this.mainThreadCpuTime, cpuUsageDetails.mainThreadCpuTime);
    }

    public int hashCode() {
        MobileVitalsSnapshot mobileVitalsSnapshot = this.cpuUsage;
        int hashCode = (mobileVitalsSnapshot == null ? 0 : mobileVitalsSnapshot.hashCode()) * 31;
        MobileVitalsSnapshot mobileVitalsSnapshot2 = this.totalProcessCpuTime;
        int hashCode2 = (hashCode + (mobileVitalsSnapshot2 == null ? 0 : mobileVitalsSnapshot2.hashCode())) * 31;
        MobileVitalsSnapshot mobileVitalsSnapshot3 = this.mainThreadCpuTime;
        return hashCode2 + (mobileVitalsSnapshot3 != null ? mobileVitalsSnapshot3.hashCode() : 0);
    }

    public String toString() {
        return "CpuUsageDetails(cpuUsage=" + this.cpuUsage + ", totalProcessCpuTime=" + this.totalProcessCpuTime + ", mainThreadCpuTime=" + this.mainThreadCpuTime + ")";
    }

    public CpuUsageDetails(MobileVitalsSnapshot mobileVitalsSnapshot, MobileVitalsSnapshot mobileVitalsSnapshot2, MobileVitalsSnapshot mobileVitalsSnapshot3) {
        this.cpuUsage = mobileVitalsSnapshot;
        this.totalProcessCpuTime = mobileVitalsSnapshot2;
        this.mainThreadCpuTime = mobileVitalsSnapshot3;
    }
}
