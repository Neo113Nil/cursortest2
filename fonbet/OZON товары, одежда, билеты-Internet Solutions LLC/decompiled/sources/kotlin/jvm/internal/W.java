package kotlin.jvm.internal;

import C.o0;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/jvm/internal/W;", "Lkotlin/reflect/q;", "c", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class W implements kotlin.reflect.q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d f71796a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<KTypeProjection> f71797b;

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71798a;

        static {
            int[] iArr = new int[kotlin.reflect.s.values().length];
            try {
                iArr[kotlin.reflect.s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71798a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "it", "", "a", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class c extends AbstractC7737t implements Function1<KTypeProjection, CharSequence> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(KTypeProjection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return W.b(W.this, it);
        }
    }

    public W() {
        throw null;
    }

    public W(@NotNull kotlin.reflect.d classifier, @NotNull List arguments) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f71796a = classifier;
        this.f71797b = arguments;
    }

    public static final String b(W w11, KTypeProjection kTypeProjection) {
        String valueOf;
        w11.getClass();
        if (kTypeProjection.d() == null) {
            return "*";
        }
        kotlin.reflect.q c11 = kTypeProjection.c();
        W w12 = c11 instanceof W ? (W) c11 : null;
        if (w12 == null || (valueOf = w12.c(true)) == null) {
            valueOf = String.valueOf(kTypeProjection.c());
        }
        int i11 = b.f71798a[kTypeProjection.d().ordinal()];
        if (i11 == 1) {
            return valueOf;
        }
        if (i11 == 2) {
            return "in ".concat(valueOf);
        }
        if (i11 == 3) {
            return "out ".concat(valueOf);
        }
        throw new Sc.o();
    }

    private final String c(boolean z11) {
        String name;
        kotlin.reflect.d dVar = this.f71796a;
        kotlin.reflect.d dVar2 = dVar != null ? dVar : null;
        Class b11 = dVar2 != null ? C6345a.b(dVar2) : null;
        if (b11 == null) {
            name = dVar.toString();
        } else if (b11.isArray()) {
            name = b11.equals(boolean[].class) ? "kotlin.BooleanArray" : b11.equals(char[].class) ? "kotlin.CharArray" : b11.equals(byte[].class) ? "kotlin.ByteArray" : b11.equals(short[].class) ? "kotlin.ShortArray" : b11.equals(int[].class) ? "kotlin.IntArray" : b11.equals(float[].class) ? "kotlin.FloatArray" : b11.equals(long[].class) ? "kotlin.LongArray" : b11.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else if (z11 && b11.isPrimitive()) {
            Intrinsics.g(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = C6345a.c(dVar).getName();
        } else {
            name = b11.getName();
        }
        List<KTypeProjection> list = this.f71797b;
        return G.g.c(name, list.isEmpty() ? "" : C7714v.V(list, ", ", "<", ">", new c(), 24), "");
    }

    @Override // kotlin.reflect.q
    @NotNull
    public final kotlin.reflect.f d() {
        return this.f71796a;
    }

    @Override // kotlin.reflect.q
    @NotNull
    public final List<KTypeProjection> e() {
        return this.f71797b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof W)) {
            return false;
        }
        W w11 = (W) obj;
        return Intrinsics.d(this.f71796a, w11.f71796a) && Intrinsics.d(this.f71797b, w11.f71797b);
    }

    @Override // kotlin.reflect.b
    @NotNull
    public final List<Annotation> getAnnotations() {
        return kotlin.collections.K.f71697a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + G.g.b(this.f71796a.hashCode() * 31, 31, this.f71797b);
    }

    @Override // kotlin.reflect.q
    public final boolean l() {
        return false;
    }

    @NotNull
    public final String toString() {
        return o0.c(new StringBuilder(), c(false), " (Kotlin reflection is not available)");
    }
}
