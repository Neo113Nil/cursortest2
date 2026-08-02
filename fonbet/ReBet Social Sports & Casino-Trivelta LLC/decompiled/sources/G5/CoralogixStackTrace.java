package G5;

import G5.CoralogixAndroidStackFrame;
import G5.CoralogixDartObfuscatedStackFrame;
import G5.CoralogixJsStackFrame;
import Zh.B;
import Zh.InterfaceC1901b;
import Zh.l;
import Zh.n;
import di.C4087f;
import di.F0;
import di.J0;
import di.N;
import di.U0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@n
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u001d\u001fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LG5/e;", "", "", "LG5/d;", "frames", "<init>", "(Ljava/util/List;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/util/List;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "c", "(LG5/e;Lci/d;Lbi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", com.google.crypto.tink.integration.android.b.f37029b, "()Ljava/util/List;", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: G5.e, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class CoralogixStackTrace {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final List frames;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {new C4087f(new l("com.coralogix.android.sdk.internal.infrastructure.threaddump.CoralogixStackFrame", Reflection.getOrCreateKotlinClass(d.class), new KClass[]{Reflection.getOrCreateKotlinClass(CoralogixAndroidStackFrame.class), Reflection.getOrCreateKotlinClass(CoralogixDartObfuscatedStackFrame.class), Reflection.getOrCreateKotlinClass(CoralogixJsStackFrame.class)}, new InterfaceC1901b[]{CoralogixAndroidStackFrame.C0083a.f3886a, CoralogixDartObfuscatedStackFrame.a.f3888a, CoralogixJsStackFrame.a.f3893a}, new Annotation[0]))};

    /* renamed from: G5.e$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3896a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f3896a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.infrastructure.threaddump.CoralogixStackTrace", aVar, 1);
            j02.n("frames", false);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoralogixStackTrace deserialize(ci.e decoder) {
            List list;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            InterfaceC1901b[] interfaceC1901bArr = CoralogixStackTrace.$childSerializers;
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
            return new CoralogixStackTrace(i10, list, u02);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, CoralogixStackTrace value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            CoralogixStackTrace.c(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{CoralogixStackTrace.$childSerializers[0]};
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

    /* renamed from: G5.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f3896a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CoralogixStackTrace(int i10, List list, U0 u02) {
        if (1 != (i10 & 1)) {
            F0.a(i10, 1, a.f3896a.getDescriptor());
        }
        this.frames = list;
    }

    public static final /* synthetic */ void c(CoralogixStackTrace self, ci.d output, bi.f serialDesc) {
        output.B(serialDesc, 0, $childSerializers[0], self.frames);
    }

    /* renamed from: b, reason: from getter */
    public final List getFrames() {
        return this.frames;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CoralogixStackTrace) && Intrinsics.areEqual(this.frames, ((CoralogixStackTrace) other).frames);
    }

    public int hashCode() {
        return this.frames.hashCode();
    }

    public String toString() {
        return "CoralogixStackTrace(frames=" + this.frames + ")";
    }

    public CoralogixStackTrace(List frames) {
        Intrinsics.checkNotNullParameter(frames, "frames");
        this.frames = frames;
    }
}
