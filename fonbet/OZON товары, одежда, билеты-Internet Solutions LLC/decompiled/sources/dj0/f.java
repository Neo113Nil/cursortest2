package dj0;

import dj0.InterfaceC6209a;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f61658a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<InterfaceC6209a> f61659b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f61660a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private Set<? extends InterfaceC6209a> f61661b;

        public a() {
            InterfaceC6209a[] elements = {InterfaceC6209a.d.f61651a, InterfaceC6209a.c.f61650a, InterfaceC6209a.C0961a.f61648a, InterfaceC6209a.b.f61649a};
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f61661b = C7705l.j0(elements);
        }

        @NotNull
        public final f a() {
            return new f(this.f61660a, this.f61661b);
        }

        @NotNull
        public final void b(@NotNull Function0 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.f61660a = (String) block.invoke();
        }
    }

    public f(String str, Set set) {
        this.f61658a = str;
        this.f61659b = set;
    }

    @NotNull
    public final Set<InterfaceC6209a> a() {
        return this.f61659b;
    }

    public final String b() {
        return this.f61658a;
    }
}
