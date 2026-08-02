package ce;

import Bd.InterfaceC2627a;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.M;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import td.c0;

/* loaded from: classes.dex */
public interface l extends o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57043a = a.f57044a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f57044a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final Function1<Sd.f, Boolean> f57045b = null;

        @NotNull
        public static Function1 a() {
            return k.f57042a;
        }
    }

    public static final class b extends m {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f57046b = new b();

        @Override // ce.m, ce.l
        @NotNull
        public final Set<Sd.f> a() {
            return M.f71699a;
        }

        @Override // ce.m, ce.l
        @NotNull
        public final Set<Sd.f> c() {
            return M.f71699a;
        }

        @Override // ce.m, ce.l
        @NotNull
        public final Set<Sd.f> f() {
            return M.f71699a;
        }
    }

    @NotNull
    Set<Sd.f> a();

    @NotNull
    Collection b(@NotNull Sd.f fVar, @NotNull Bd.c cVar);

    @NotNull
    Set<Sd.f> c();

    Set<Sd.f> f();

    @NotNull
    Collection<? extends c0> g(@NotNull Sd.f fVar, @NotNull InterfaceC2627a interfaceC2627a);
}
