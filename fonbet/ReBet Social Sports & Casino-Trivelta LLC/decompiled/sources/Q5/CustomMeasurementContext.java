package Q5;

import Zh.B;
import Zh.InterfaceC1901b;
import com.twilio.voice.EventKeys;
import di.C4096j0;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002!\u0013B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010 \u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"LQ5/d;", "", "", "name", "", EventKeys.VALUE_KEY, "<init>", "(Ljava/lang/String;J)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;JLdi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "a", "(LQ5/d;Lci/d;Lbi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", com.google.crypto.tink.integration.android.b.f37029b, "J", "getValue", "()J", "getValue$annotations", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Q5.d, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class CustomMeasurementContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final long value;

    /* renamed from: Q5.d$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9403a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f9403a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.model.CustomMeasurementContext", aVar, 2);
            j02.n("name", true);
            j02.n(EventKeys.VALUE_KEY, true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CustomMeasurementContext deserialize(ci.e decoder) {
            String str;
            long j10;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            if (c10.q()) {
                str = c10.s(fVar, 0);
                j10 = c10.g(fVar, 1);
                i10 = 3;
            } else {
                str = null;
                long j11 = 0;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int e10 = c10.e(fVar);
                    if (e10 == -1) {
                        z10 = false;
                    } else if (e10 == 0) {
                        str = c10.s(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (e10 != 1) {
                            throw new B(e10);
                        }
                        j11 = c10.g(fVar, 1);
                        i11 |= 2;
                    }
                }
                j10 = j11;
                i10 = i11;
            }
            String str2 = str;
            c10.b(fVar);
            return new CustomMeasurementContext(i10, str2, j10, null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, CustomMeasurementContext value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            CustomMeasurementContext.a(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{Z0.f45341a, C4096j0.f45375a};
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

    /* renamed from: Q5.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CustomMeasurementContext a(oh.g attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            if (!R4.a.d(attributes)) {
                return null;
            }
            String c10 = R4.a.c(attributes, "measurement");
            if (c10 == null) {
                c10 = "";
            }
            Long b10 = R4.a.b(attributes, "measurement-value");
            return new CustomMeasurementContext(c10, b10 != null ? b10.longValue() : 0L);
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f9403a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ CustomMeasurementContext(int i10, String str, long j10, U0 u02) {
        this.name = (i10 & 1) == 0 ? "" : str;
        if ((i10 & 2) == 0) {
            this.value = 0L;
        } else {
            this.value = j10;
        }
    }

    public static final /* synthetic */ void a(CustomMeasurementContext self, ci.d output, bi.f serialDesc) {
        if (output.m(serialDesc, 0) || !Intrinsics.areEqual(self.name, "")) {
            output.G(serialDesc, 0, self.name);
        }
        if (!output.m(serialDesc, 1) && self.value == 0) {
            return;
        }
        output.e(serialDesc, 1, self.value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomMeasurementContext)) {
            return false;
        }
        CustomMeasurementContext customMeasurementContext = (CustomMeasurementContext) other;
        return Intrinsics.areEqual(this.name, customMeasurementContext.name) && this.value == customMeasurementContext.value;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Long.hashCode(this.value);
    }

    public String toString() {
        return "CustomMeasurementContext(name=" + this.name + ", value=" + this.value + ")";
    }

    public CustomMeasurementContext(String name, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = j10;
    }
}
