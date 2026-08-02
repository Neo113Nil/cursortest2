package W5;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f13012a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13013b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13014c;

    @NotNull
    private final byte[] luma;

    public c(int i10, int i11, long j10, byte[] luma) {
        Intrinsics.checkNotNullParameter(luma, "luma");
        this.f13012a = i10;
        this.f13013b = i11;
        this.f13014c = j10;
        this.luma = luma;
    }

    public final long a() {
        return this.f13014c;
    }

    public final int b() {
        return this.f13013b;
    }

    public final byte[] c() {
        return this.luma;
    }

    public final int d() {
        return this.f13012a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.coralogix.android.sdk.session_replay.internal.frame_capturer.FrameFingerprint");
        c cVar = (c) obj;
        return this.f13012a == cVar.f13012a && this.f13013b == cVar.f13013b && this.f13014c == cVar.f13014c && Arrays.equals(this.luma, cVar.luma);
    }

    public int hashCode() {
        return (((((this.f13012a * 31) + this.f13013b) * 31) + Long.hashCode(this.f13014c)) * 31) + Arrays.hashCode(this.luma);
    }

    public String toString() {
        return "FrameFingerprint(w=" + this.f13012a + ", h=" + this.f13013b + ", dHash=" + this.f13014c + ", luma=" + Arrays.toString(this.luma) + ")";
    }
}
