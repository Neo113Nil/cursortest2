package I5;

import Zh.B;
import Zh.InterfaceC1901b;
import com.twilio.voice.EventKeys;
import di.J0;
import di.N;
import di.U0;
import di.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0010 B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0016¨\u0006!"}, d2 = {"LI5/r;", "", "", EventKeys.ERROR_CODE, "<init>", "(I)V", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(IILdi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "a", "(LI5/r;Lci/d;Lbi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "getCode$annotations", "()V", "Companion", com.google.crypto.tink.integration.android.b.f37029b, "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: I5.r, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class SpanDataStatus {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final int code;

    /* renamed from: I5.r$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5477a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f5477a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.model.SpanDataStatus", aVar, 1);
            j02.n(EventKeys.ERROR_CODE, true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SpanDataStatus deserialize(ci.e decoder) {
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            int i11 = 1;
            if (c10.q()) {
                i10 = c10.F(fVar, 0);
            } else {
                boolean z10 = true;
                i10 = 0;
                int i12 = 0;
                while (z10) {
                    int e10 = c10.e(fVar);
                    if (e10 == -1) {
                        z10 = false;
                    } else {
                        if (e10 != 0) {
                            throw new B(e10);
                        }
                        i10 = c10.F(fVar, 0);
                        i12 = 1;
                    }
                }
                i11 = i12;
            }
            c10.b(fVar);
            return new SpanDataStatus(i11, i10, (U0) null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, SpanDataStatus value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            SpanDataStatus.a(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{Y.f45337a};
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

    /* renamed from: I5.r$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5477a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SpanDataStatus(int i10, int i11, U0 u02) {
        if ((i10 & 1) == 0) {
            this.code = 0;
        } else {
            this.code = i11;
        }
    }

    public static final /* synthetic */ void a(SpanDataStatus self, ci.d output, bi.f serialDesc) {
        if (!output.m(serialDesc, 0) && self.code == 0) {
            return;
        }
        output.f(serialDesc, 0, self.code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SpanDataStatus) && this.code == ((SpanDataStatus) other).code;
    }

    public int hashCode() {
        return Integer.hashCode(this.code);
    }

    public String toString() {
        return "SpanDataStatus(code=" + this.code + ")";
    }

    public SpanDataStatus(int i10) {
        this.code = i10;
    }

    public /* synthetic */ SpanDataStatus(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
