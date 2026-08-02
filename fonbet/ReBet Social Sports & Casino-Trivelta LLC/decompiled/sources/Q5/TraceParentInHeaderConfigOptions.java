package Q5;

import Zh.B;
import Zh.InterfaceC1901b;
import di.C4087f;
import di.J0;
import di.N;
import di.U0;
import di.Z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Zh.n
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001c\u001eB\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LQ5/v;", "", "", "", "allowedTracingUrls", "<init>", "(Ljava/util/List;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/util/List;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "c", "(LQ5/v;Lci/d;Lbi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", com.google.crypto.tink.integration.android.b.f37029b, "()Ljava/util/List;", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Q5.v, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class TraceParentInHeaderConfigOptions {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final List allowedTracingUrls;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {new C4087f(Z0.f45341a)};

    /* renamed from: Q5.v$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9498a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f9498a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.model.TraceParentInHeaderConfigOptions", aVar, 1);
            j02.n("allowedTracingUrls", true);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TraceParentInHeaderConfigOptions deserialize(ci.e decoder) {
            List list;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            InterfaceC1901b[] interfaceC1901bArr = TraceParentInHeaderConfigOptions.$childSerializers;
            int i10 = 1;
            U0 u02 = null;
            if (c10.q()) {
                list = (List) c10.i(fVar, 0, interfaceC1901bArr[0], null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                while (z10) {
                    int e10 = c10.e(fVar);
                    if (e10 == -1) {
                        z10 = false;
                    } else {
                        if (e10 != 0) {
                            throw new B(e10);
                        }
                        list2 = (List) c10.i(fVar, 0, interfaceC1901bArr[0], list2);
                        i11 = 1;
                    }
                }
                list = list2;
                i10 = i11;
            }
            c10.b(fVar);
            return new TraceParentInHeaderConfigOptions(i10, list, u02);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, TraceParentInHeaderConfigOptions value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            TraceParentInHeaderConfigOptions.c(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{TraceParentInHeaderConfigOptions.$childSerializers[0]};
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

    /* renamed from: Q5.v$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f9498a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TraceParentInHeaderConfigOptions(int i10, List list, U0 u02) {
        if ((i10 & 1) == 0) {
            this.allowedTracingUrls = CollectionsKt.emptyList();
        } else {
            this.allowedTracingUrls = list;
        }
    }

    public static final /* synthetic */ void c(TraceParentInHeaderConfigOptions self, ci.d output, bi.f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        if (!output.m(serialDesc, 0) && Intrinsics.areEqual(self.allowedTracingUrls, CollectionsKt.emptyList())) {
            return;
        }
        output.B(serialDesc, 0, interfaceC1901bArr[0], self.allowedTracingUrls);
    }

    /* renamed from: b, reason: from getter */
    public final List getAllowedTracingUrls() {
        return this.allowedTracingUrls;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TraceParentInHeaderConfigOptions) && Intrinsics.areEqual(this.allowedTracingUrls, ((TraceParentInHeaderConfigOptions) other).allowedTracingUrls);
    }

    public int hashCode() {
        return this.allowedTracingUrls.hashCode();
    }

    public String toString() {
        return "TraceParentInHeaderConfigOptions(allowedTracingUrls=" + this.allowedTracingUrls + ")";
    }

    public TraceParentInHeaderConfigOptions(List allowedTracingUrls) {
        Intrinsics.checkNotNullParameter(allowedTracingUrls, "allowedTracingUrls");
        this.allowedTracingUrls = allowedTracingUrls;
    }

    public /* synthetic */ TraceParentInHeaderConfigOptions(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
