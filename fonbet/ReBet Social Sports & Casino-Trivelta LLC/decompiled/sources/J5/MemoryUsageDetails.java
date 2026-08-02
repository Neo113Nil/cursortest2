package J5;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import com.bumptech.glide.gifdecoder.e;
import di.U0;
import f5.MobileVitalsSnapshot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@n
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u0000 92\u00020\u0001:\u0002\u0017'B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\"\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\"\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\"\u0012\u0004\b/\u0010&\u001a\u0004\b.\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\"\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010$R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\"\u0012\u0004\b5\u0010&\u001a\u0004\b4\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010\"\u0012\u0004\b8\u0010&\u001a\u0004\b7\u0010$¨\u0006:"}, d2 = {"LJ5/b;", "", "Lf5/j;", "residentMemory", "memoryUtilization", "heapMax", "heapUsed", "heapUtilization", "javaMemory", "nativeMemory", "<init>", "(Lf5/j;Lf5/j;Lf5/j;Lf5/j;Lf5/j;Lf5/j;Lf5/j;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILf5/j;Lf5/j;Lf5/j;Lf5/j;Lf5/j;Lf5/j;Lf5/j;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "a", "(LJ5/b;Lci/d;Lbi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lf5/j;", "getResidentMemory", "()Lf5/j;", "getResidentMemory$annotations", "()V", com.google.crypto.tink.integration.android.b.f37029b, "getMemoryUtilization", "getMemoryUtilization$annotations", "c", "getHeapMax", "getHeapMax$annotations", W9.d.f13160a, "getHeapUsed", "getHeapUsed$annotations", e.f29601m, "getHeapUtilization", "getHeapUtilization$annotations", "f", "getJavaMemory", "getJavaMemory$annotations", "g", "getNativeMemory", "getNativeMemory$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: J5.b, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class MemoryUsageDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot residentMemory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot memoryUtilization;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot heapMax;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot heapUsed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot heapUtilization;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot javaMemory;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot nativeMemory;

    /* renamed from: J5.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5936a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MemoryUsageDetails(int i10, MobileVitalsSnapshot mobileVitalsSnapshot, MobileVitalsSnapshot mobileVitalsSnapshot2, MobileVitalsSnapshot mobileVitalsSnapshot3, MobileVitalsSnapshot mobileVitalsSnapshot4, MobileVitalsSnapshot mobileVitalsSnapshot5, MobileVitalsSnapshot mobileVitalsSnapshot6, MobileVitalsSnapshot mobileVitalsSnapshot7, U0 u02) {
        if ((i10 & 1) == 0) {
            this.residentMemory = null;
        } else {
            this.residentMemory = mobileVitalsSnapshot;
        }
        if ((i10 & 2) == 0) {
            this.memoryUtilization = null;
        } else {
            this.memoryUtilization = mobileVitalsSnapshot2;
        }
        if ((i10 & 4) == 0) {
            this.heapMax = null;
        } else {
            this.heapMax = mobileVitalsSnapshot3;
        }
        if ((i10 & 8) == 0) {
            this.heapUsed = null;
        } else {
            this.heapUsed = mobileVitalsSnapshot4;
        }
        if ((i10 & 16) == 0) {
            this.heapUtilization = null;
        } else {
            this.heapUtilization = mobileVitalsSnapshot5;
        }
        if ((i10 & 32) == 0) {
            this.javaMemory = null;
        } else {
            this.javaMemory = mobileVitalsSnapshot6;
        }
        if ((i10 & 64) == 0) {
            this.nativeMemory = null;
        } else {
            this.nativeMemory = mobileVitalsSnapshot7;
        }
    }

    public static final /* synthetic */ void a(MemoryUsageDetails self, ci.d output, f serialDesc) {
        if (output.m(serialDesc, 0) || self.residentMemory != null) {
            output.C(serialDesc, 0, MobileVitalsSnapshot.a.f46422a, self.residentMemory);
        }
        if (output.m(serialDesc, 1) || self.memoryUtilization != null) {
            output.C(serialDesc, 1, MobileVitalsSnapshot.a.f46422a, self.memoryUtilization);
        }
        if (output.m(serialDesc, 2) || self.heapMax != null) {
            output.C(serialDesc, 2, MobileVitalsSnapshot.a.f46422a, self.heapMax);
        }
        if (output.m(serialDesc, 3) || self.heapUsed != null) {
            output.C(serialDesc, 3, MobileVitalsSnapshot.a.f46422a, self.heapUsed);
        }
        if (output.m(serialDesc, 4) || self.heapUtilization != null) {
            output.C(serialDesc, 4, MobileVitalsSnapshot.a.f46422a, self.heapUtilization);
        }
        if (output.m(serialDesc, 5) || self.javaMemory != null) {
            output.C(serialDesc, 5, MobileVitalsSnapshot.a.f46422a, self.javaMemory);
        }
        if (!output.m(serialDesc, 6) && self.nativeMemory == null) {
            return;
        }
        output.C(serialDesc, 6, MobileVitalsSnapshot.a.f46422a, self.nativeMemory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemoryUsageDetails)) {
            return false;
        }
        MemoryUsageDetails memoryUsageDetails = (MemoryUsageDetails) other;
        return Intrinsics.areEqual(this.residentMemory, memoryUsageDetails.residentMemory) && Intrinsics.areEqual(this.memoryUtilization, memoryUsageDetails.memoryUtilization) && Intrinsics.areEqual(this.heapMax, memoryUsageDetails.heapMax) && Intrinsics.areEqual(this.heapUsed, memoryUsageDetails.heapUsed) && Intrinsics.areEqual(this.heapUtilization, memoryUsageDetails.heapUtilization) && Intrinsics.areEqual(this.javaMemory, memoryUsageDetails.javaMemory) && Intrinsics.areEqual(this.nativeMemory, memoryUsageDetails.nativeMemory);
    }

    public int hashCode() {
        MobileVitalsSnapshot mobileVitalsSnapshot = this.residentMemory;
        int hashCode = (mobileVitalsSnapshot == null ? 0 : mobileVitalsSnapshot.hashCode()) * 31;
        MobileVitalsSnapshot mobileVitalsSnapshot2 = this.memoryUtilization;
        int hashCode2 = (hashCode + (mobileVitalsSnapshot2 == null ? 0 : mobileVitalsSnapshot2.hashCode())) * 31;
        MobileVitalsSnapshot mobileVitalsSnapshot3 = this.heapMax;
        int hashCode3 = (hashCode2 + (mobileVitalsSnapshot3 == null ? 0 : mobileVitalsSnapshot3.hashCode())) * 31;
        MobileVitalsSnapshot mobileVitalsSnapshot4 = this.heapUsed;
        int hashCode4 = (hashCode3 + (mobileVitalsSnapshot4 == null ? 0 : mobileVitalsSnapshot4.hashCode())) * 31;
        MobileVitalsSnapshot mobileVitalsSnapshot5 = this.heapUtilization;
        int hashCode5 = (hashCode4 + (mobileVitalsSnapshot5 == null ? 0 : mobileVitalsSnapshot5.hashCode())) * 31;
        MobileVitalsSnapshot mobileVitalsSnapshot6 = this.javaMemory;
        int hashCode6 = (hashCode5 + (mobileVitalsSnapshot6 == null ? 0 : mobileVitalsSnapshot6.hashCode())) * 31;
        MobileVitalsSnapshot mobileVitalsSnapshot7 = this.nativeMemory;
        return hashCode6 + (mobileVitalsSnapshot7 != null ? mobileVitalsSnapshot7.hashCode() : 0);
    }

    public String toString() {
        return "MemoryUsageDetails(residentMemory=" + this.residentMemory + ", memoryUtilization=" + this.memoryUtilization + ", heapMax=" + this.heapMax + ", heapUsed=" + this.heapUsed + ", heapUtilization=" + this.heapUtilization + ", javaMemory=" + this.javaMemory + ", nativeMemory=" + this.nativeMemory + ")";
    }

    public MemoryUsageDetails(MobileVitalsSnapshot mobileVitalsSnapshot, MobileVitalsSnapshot mobileVitalsSnapshot2, MobileVitalsSnapshot mobileVitalsSnapshot3, MobileVitalsSnapshot mobileVitalsSnapshot4, MobileVitalsSnapshot mobileVitalsSnapshot5, MobileVitalsSnapshot mobileVitalsSnapshot6, MobileVitalsSnapshot mobileVitalsSnapshot7) {
        this.residentMemory = mobileVitalsSnapshot;
        this.memoryUtilization = mobileVitalsSnapshot2;
        this.heapMax = mobileVitalsSnapshot3;
        this.heapUsed = mobileVitalsSnapshot4;
        this.heapUtilization = mobileVitalsSnapshot5;
        this.javaMemory = mobileVitalsSnapshot6;
        this.nativeMemory = mobileVitalsSnapshot7;
    }
}
