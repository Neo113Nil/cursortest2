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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002\u0012\"B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001f¨\u0006&"}, d2 = {"LJ5/d;", "", "Lf5/j;", "slowFrames", "frozenFrames", "<init>", "(Lf5/j;Lf5/j;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILf5/j;Lf5/j;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "a", "(LJ5/d;Lci/d;Lbi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lf5/j;", "getSlowFrames", "()Lf5/j;", "getSlowFrames$annotations", "()V", com.google.crypto.tink.integration.android.b.f37029b, "getFrozenFrames", "getFrozenFrames$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: J5.d, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class SlowFrozenFramesDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot slowFrames;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final MobileVitalsSnapshot frozenFrames;

    /* renamed from: J5.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5946a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SlowFrozenFramesDetails(int i10, MobileVitalsSnapshot mobileVitalsSnapshot, MobileVitalsSnapshot mobileVitalsSnapshot2, U0 u02) {
        if ((i10 & 1) == 0) {
            this.slowFrames = null;
        } else {
            this.slowFrames = mobileVitalsSnapshot;
        }
        if ((i10 & 2) == 0) {
            this.frozenFrames = null;
        } else {
            this.frozenFrames = mobileVitalsSnapshot2;
        }
    }

    public static final /* synthetic */ void a(SlowFrozenFramesDetails self, ci.d output, f serialDesc) {
        if (output.m(serialDesc, 0) || self.slowFrames != null) {
            output.C(serialDesc, 0, MobileVitalsSnapshot.a.f46422a, self.slowFrames);
        }
        if (!output.m(serialDesc, 1) && self.frozenFrames == null) {
            return;
        }
        output.C(serialDesc, 1, MobileVitalsSnapshot.a.f46422a, self.frozenFrames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlowFrozenFramesDetails)) {
            return false;
        }
        SlowFrozenFramesDetails slowFrozenFramesDetails = (SlowFrozenFramesDetails) other;
        return Intrinsics.areEqual(this.slowFrames, slowFrozenFramesDetails.slowFrames) && Intrinsics.areEqual(this.frozenFrames, slowFrozenFramesDetails.frozenFrames);
    }

    public int hashCode() {
        MobileVitalsSnapshot mobileVitalsSnapshot = this.slowFrames;
        int hashCode = (mobileVitalsSnapshot == null ? 0 : mobileVitalsSnapshot.hashCode()) * 31;
        MobileVitalsSnapshot mobileVitalsSnapshot2 = this.frozenFrames;
        return hashCode + (mobileVitalsSnapshot2 != null ? mobileVitalsSnapshot2.hashCode() : 0);
    }

    public String toString() {
        return "SlowFrozenFramesDetails(slowFrames=" + this.slowFrames + ", frozenFrames=" + this.frozenFrames + ")";
    }

    public SlowFrozenFramesDetails(MobileVitalsSnapshot mobileVitalsSnapshot, MobileVitalsSnapshot mobileVitalsSnapshot2) {
        this.slowFrames = mobileVitalsSnapshot;
        this.frozenFrames = mobileVitalsSnapshot2;
    }
}
