package G5;

import Zh.B;
import Zh.InterfaceC1901b;
import Zh.n;
import di.F0;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@n
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0010 B%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0013¨\u0006!"}, d2 = {"LG5/b;", "LG5/d;", "", "seen0", "", "virtAddress", "Ldi/U0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "a", "(LG5/b;Lci/d;Lbi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVirtAddress", "getVirtAddress$annotations", "()V", "Companion", com.google.crypto.tink.integration.android.b.f37029b, "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: G5.b, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class CoralogixDartObfuscatedStackFrame implements d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String virtAddress;

    /* renamed from: G5.b$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3888a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f3888a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.infrastructure.threaddump.CoralogixDartObfuscatedStackFrame", aVar, 1);
            j02.n("virt", false);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoralogixDartObfuscatedStackFrame deserialize(ci.e decoder) {
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            int i10 = 1;
            U0 u02 = null;
            if (c10.q()) {
                str = c10.s(fVar, 0);
            } else {
                boolean z10 = true;
                int i11 = 0;
                str = null;
                while (z10) {
                    int e10 = c10.e(fVar);
                    if (e10 == -1) {
                        z10 = false;
                    } else {
                        if (e10 != 0) {
                            throw new B(e10);
                        }
                        str = c10.s(fVar, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            c10.b(fVar);
            return new CoralogixDartObfuscatedStackFrame(i10, str, u02);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, CoralogixDartObfuscatedStackFrame value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            CoralogixDartObfuscatedStackFrame.a(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{Z0.f45341a};
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

    /* renamed from: G5.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f3888a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CoralogixDartObfuscatedStackFrame(int i10, String str, U0 u02) {
        if (1 != (i10 & 1)) {
            F0.a(i10, 1, a.f3888a.getDescriptor());
        }
        this.virtAddress = str;
    }

    public static final /* synthetic */ void a(CoralogixDartObfuscatedStackFrame self, ci.d output, bi.f serialDesc) {
        output.G(serialDesc, 0, self.virtAddress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CoralogixDartObfuscatedStackFrame) && Intrinsics.areEqual(this.virtAddress, ((CoralogixDartObfuscatedStackFrame) other).virtAddress);
    }

    public int hashCode() {
        return this.virtAddress.hashCode();
    }

    public String toString() {
        return "CoralogixDartObfuscatedStackFrame(virtAddress=" + this.virtAddress + ")";
    }
}
