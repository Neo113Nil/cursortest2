package I5;

import Zh.B;
import Zh.InterfaceC1901b;
import di.C4084d0;
import di.F0;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002\u001c\u0012B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B1\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR,\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"LI5/n;", "", "", "", "attributes", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/util/Map;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", com.google.crypto.tink.integration.android.b.f37029b, "(LI5/n;Lci/d;Lbi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "getAttributes", "()Ljava/util/Map;", "getAttributes$annotations", "()V", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: I5.n, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class OpenTelemetryResource {

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map attributes;

    /* renamed from: I5.n$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5453a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f5453a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.model.OpenTelemetryResource", aVar, 1);
            j02.n("attributes", false);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OpenTelemetryResource deserialize(ci.e decoder) {
            Map map;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            InterfaceC1901b[] interfaceC1901bArr = OpenTelemetryResource.$childSerializers;
            int i10 = 1;
            U0 u02 = null;
            if (c10.q()) {
                map = (Map) c10.i(fVar, 0, interfaceC1901bArr[0], null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                Map map2 = null;
                while (z10) {
                    int e10 = c10.e(fVar);
                    if (e10 == -1) {
                        z10 = false;
                    } else {
                        if (e10 != 0) {
                            throw new B(e10);
                        }
                        map2 = (Map) c10.i(fVar, 0, interfaceC1901bArr[0], map2);
                        i11 = 1;
                    }
                }
                map = map2;
                i10 = i11;
            }
            c10.b(fVar);
            return new OpenTelemetryResource(i10, map, u02);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, OpenTelemetryResource value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            OpenTelemetryResource.b(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{OpenTelemetryResource.$childSerializers[0]};
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

    /* renamed from: I5.n$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f5453a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Z0 z02 = Z0.f45341a;
        $childSerializers = new InterfaceC1901b[]{new C4084d0(z02, z02)};
    }

    public /* synthetic */ OpenTelemetryResource(int i10, Map map, U0 u02) {
        if (1 != (i10 & 1)) {
            F0.a(i10, 1, a.f5453a.getDescriptor());
        }
        this.attributes = map;
    }

    public static final /* synthetic */ void b(OpenTelemetryResource self, ci.d output, bi.f serialDesc) {
        output.B(serialDesc, 0, $childSerializers[0], self.attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OpenTelemetryResource) && Intrinsics.areEqual(this.attributes, ((OpenTelemetryResource) other).attributes);
    }

    public int hashCode() {
        return this.attributes.hashCode();
    }

    public String toString() {
        return "OpenTelemetryResource(attributes=" + this.attributes + ")";
    }

    public OpenTelemetryResource(Map attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.attributes = attributes;
    }
}
