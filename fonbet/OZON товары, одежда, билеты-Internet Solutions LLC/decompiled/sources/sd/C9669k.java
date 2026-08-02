package sd;

import ie.C7056e;
import ie.InterfaceC7061j;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;
import vd.InterfaceC10304a;
import vd.InterfaceC10305b;
import vd.InterfaceC10306c;
import wd.L;

/* renamed from: sd.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9669k extends qd.m {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f98594h = {N.h(new E(N.b(C9669k.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: f, reason: collision with root package name */
    private Function0<b> f98595f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f98596g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: sd.k$a */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FALLBACK;
        public static final a FROM_CLASS_LOADER;
        public static final a FROM_DEPENDENCIES;

        static {
            a aVar = new a("FROM_DEPENDENCIES", 0);
            FROM_DEPENDENCIES = aVar;
            a aVar2 = new a("FROM_CLASS_LOADER", 1);
            FROM_CLASS_LOADER = aVar2;
            a aVar3 = new a("FALLBACK", 2);
            FALLBACK = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: sd.k$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final L f98597a;

        public b(@NotNull L ownerModuleDescriptor) {
            Intrinsics.checkNotNullParameter(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f98597a = ownerModuleDescriptor;
        }

        @NotNull
        public final InterfaceC9815F a() {
            return this.f98597a;
        }
    }

    /* renamed from: sd.k$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98598a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f98598a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9669k(@NotNull C7056e storageManager, @NotNull a kind) {
        super(storageManager);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f98596g = storageManager.a(new C9666h(this, storageManager));
        int i11 = c.f98598a[kind.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                f(false);
            } else {
                if (i11 != 3) {
                    throw new Sc.o();
                }
                f(true);
            }
        }
    }

    static b o0(C9669k c9669k) {
        Function0<b> function0 = c9669k.f98595f;
        if (function0 == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        b invoke = function0.invoke();
        c9669k.f98595f = null;
        return invoke;
    }

    @Override // qd.m
    @NotNull
    protected final InterfaceC10306c G() {
        return p0();
    }

    @Override // qd.m
    @NotNull
    protected final InterfaceC10304a g() {
        return p0();
    }

    @NotNull
    public final u p0() {
        return (u) ie.n.a(this.f98596g, f98594h[0]);
    }

    public final void q0(@NotNull L moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        C9667i computation = new C9667i(moduleDescriptor);
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f98595f = computation;
    }

    @Override // qd.m
    public final Iterable u() {
        Iterable<InterfaceC10305b> u11 = super.u();
        Intrinsics.checkNotNullExpressionValue(u11, "getClassDescriptorFactories(...)");
        ie.o M11 = M();
        Intrinsics.checkNotNullExpressionValue(M11, "getStorageManager(...)");
        L q11 = q();
        Intrinsics.checkNotNullExpressionValue(q11, "getBuiltInsModule(...)");
        return C7714v.o0(u11, new C9665g(M11, q11));
    }
}
