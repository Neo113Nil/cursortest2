package Q5;

import Q5.TraceParentInHeaderConfigOptions;
import Zh.B;
import Zh.InterfaceC1901b;
import com.facebook.react.uimanager.ViewProps;
import di.C4093i;
import di.J0;
import di.N;
import di.U0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u001d B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006$"}, d2 = {"LQ5/u;", "", "", ViewProps.ENABLED, "LQ5/v;", "options", "<init>", "(ZLQ5/v;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(IZLQ5/v;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "c", "(LQ5/u;Lci/d;Lbi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", com.google.crypto.tink.integration.android.b.f37029b, "LQ5/v;", "()LQ5/v;", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Q5.u, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class TraceParentInHeaderConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean enabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final TraceParentInHeaderConfigOptions options;

    /* renamed from: Q5.u$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9496a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f9496a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.model.TraceParentInHeaderConfig", aVar, 2);
            j02.n(ViewProps.ENABLED, true);
            j02.n("options", true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TraceParentInHeaderConfig deserialize(ci.e decoder) {
            boolean z10;
            TraceParentInHeaderConfigOptions traceParentInHeaderConfigOptions;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            U0 u02 = null;
            if (c10.q()) {
                z10 = c10.t(fVar, 0);
                traceParentInHeaderConfigOptions = (TraceParentInHeaderConfigOptions) c10.i(fVar, 1, TraceParentInHeaderConfigOptions.a.f9498a, null);
                i10 = 3;
            } else {
                boolean z11 = true;
                z10 = false;
                int i11 = 0;
                TraceParentInHeaderConfigOptions traceParentInHeaderConfigOptions2 = null;
                while (z11) {
                    int e10 = c10.e(fVar);
                    if (e10 == -1) {
                        z11 = false;
                    } else if (e10 == 0) {
                        z10 = c10.t(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (e10 != 1) {
                            throw new B(e10);
                        }
                        traceParentInHeaderConfigOptions2 = (TraceParentInHeaderConfigOptions) c10.i(fVar, 1, TraceParentInHeaderConfigOptions.a.f9498a, traceParentInHeaderConfigOptions2);
                        i11 |= 2;
                    }
                }
                traceParentInHeaderConfigOptions = traceParentInHeaderConfigOptions2;
                i10 = i11;
            }
            c10.b(fVar);
            return new TraceParentInHeaderConfig(i10, z10, traceParentInHeaderConfigOptions, u02);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, TraceParentInHeaderConfig value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            TraceParentInHeaderConfig.c(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{C4093i.f45370a, TraceParentInHeaderConfigOptions.a.f9498a};
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        public final bi.f getDescriptor() {
            return descriptor;
        }

        @Override // di.N
        public InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    /* renamed from: Q5.u$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f9496a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TraceParentInHeaderConfig(int i10, boolean z10, TraceParentInHeaderConfigOptions traceParentInHeaderConfigOptions, U0 u02) {
        this.enabled = (i10 & 1) == 0 ? false : z10;
        if ((i10 & 2) == 0) {
            this.options = new TraceParentInHeaderConfigOptions((List) null, 1, (DefaultConstructorMarker) null);
        } else {
            this.options = traceParentInHeaderConfigOptions;
        }
    }

    public static final /* synthetic */ void c(TraceParentInHeaderConfig self, ci.d output, bi.f serialDesc) {
        if (output.m(serialDesc, 0) || self.enabled) {
            output.F(serialDesc, 0, self.enabled);
        }
        if (!output.m(serialDesc, 1) && Intrinsics.areEqual(self.options, new TraceParentInHeaderConfigOptions((List) null, 1, (DefaultConstructorMarker) null))) {
            return;
        }
        output.B(serialDesc, 1, TraceParentInHeaderConfigOptions.a.f9498a, self.options);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: b, reason: from getter */
    public final TraceParentInHeaderConfigOptions getOptions() {
        return this.options;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraceParentInHeaderConfig)) {
            return false;
        }
        TraceParentInHeaderConfig traceParentInHeaderConfig = (TraceParentInHeaderConfig) other;
        return this.enabled == traceParentInHeaderConfig.enabled && Intrinsics.areEqual(this.options, traceParentInHeaderConfig.options);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enabled) * 31) + this.options.hashCode();
    }

    public String toString() {
        return "TraceParentInHeaderConfig(enabled=" + this.enabled + ", options=" + this.options + ")";
    }

    public TraceParentInHeaderConfig(boolean z10, TraceParentInHeaderConfigOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.enabled = z10;
        this.options = options;
    }

    public /* synthetic */ TraceParentInHeaderConfig(boolean z10, TraceParentInHeaderConfigOptions traceParentInHeaderConfigOptions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? new TraceParentInHeaderConfigOptions((List) null, 1, (DefaultConstructorMarker) null) : traceParentInHeaderConfigOptions);
    }
}
