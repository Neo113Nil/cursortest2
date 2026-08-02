package je;

import java.util.ArrayDeque;
import ke.InterfaceC7670b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f69915a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f69916b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7670b f69917c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ke.f f69918d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ke.h f69919e;

    /* renamed from: f, reason: collision with root package name */
    private int f69920f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayDeque<ne.h> f69921g;

    /* renamed from: h, reason: collision with root package name */
    private te.i f69922h;

    /* loaded from: classes10.dex */
    public interface a {

        /* renamed from: je.r0$a$a, reason: collision with other inner class name */
        public static final class C1144a implements a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f69923a;

            @Override // je.r0.a
            public final void a(@NotNull Function0<Boolean> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                if (this.f69923a) {
                    return;
                }
                this.f69923a = ((Boolean) ((C7380g) block).invoke()).booleanValue();
            }

            public final boolean b() {
                return this.f69923a;
            }
        }

        void a(@NotNull Function0<Boolean> function0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes10.dex */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b CHECK_ONLY_LOWER;
        public static final b CHECK_SUBTYPE_AND_LOWER;
        public static final b SKIP_LOWER;

        static {
            b bVar = new b("CHECK_ONLY_LOWER", 0);
            CHECK_ONLY_LOWER = bVar;
            b bVar2 = new b("CHECK_SUBTYPE_AND_LOWER", 1);
            CHECK_SUBTYPE_AND_LOWER = bVar2;
            b bVar3 = new b("SKIP_LOWER", 2);
            SKIP_LOWER = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* loaded from: classes10.dex */
    public static abstract class c {

        public static abstract class a extends c {
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f69924a = new b(0);

            @Override // je.r0.c
            @NotNull
            public final ne.h a(@NotNull r0 state, @NotNull ne.g type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.f().I(type);
            }
        }

        /* renamed from: je.r0$c$c, reason: collision with other inner class name */
        public static final class C1145c extends c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1145c f69925a = new C1145c(0);

            @Override // je.r0.c
            public final ne.h a(r0 state, ne.g type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f69926a = new d(0);

            @Override // je.r0.c
            @NotNull
            public final ne.h a(@NotNull r0 state, @NotNull ne.g type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                return state.f().m(type);
            }
        }

        public c(int i11) {
        }

        @NotNull
        public abstract ne.h a(@NotNull r0 r0Var, @NotNull ne.g gVar);
    }

    public r0(boolean z11, boolean z12, @NotNull InterfaceC7670b typeSystemContext, @NotNull ke.f kotlinTypePreparator, @NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f69915a = z11;
        this.f69916b = z12;
        this.f69917c = typeSystemContext;
        this.f69918d = kotlinTypePreparator;
        this.f69919e = kotlinTypeRefiner;
    }

    public final void c() {
        ArrayDeque<ne.h> arrayDeque = this.f69921g;
        Intrinsics.f(arrayDeque);
        arrayDeque.clear();
        te.i iVar = this.f69922h;
        Intrinsics.f(iVar);
        iVar.clear();
    }

    public final ArrayDeque<ne.h> d() {
        return this.f69921g;
    }

    public final te.i e() {
        return this.f69922h;
    }

    @NotNull
    public final ne.m f() {
        return this.f69917c;
    }

    public final void g() {
        if (this.f69921g == null) {
            this.f69921g = new ArrayDeque<>(4);
        }
        if (this.f69922h == null) {
            this.f69922h = new te.i();
        }
    }

    public final boolean h() {
        return this.f69915a;
    }

    public final boolean i() {
        return this.f69916b;
    }

    @NotNull
    public final ne.g j(@NotNull ne.g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f69918d.c(type);
    }

    @NotNull
    public final ne.g k(@NotNull ne.g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f69919e.a(type);
    }
}
