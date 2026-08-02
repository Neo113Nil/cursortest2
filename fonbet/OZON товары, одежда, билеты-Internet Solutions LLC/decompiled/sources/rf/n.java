package rf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rf.j;

/* loaded from: classes10.dex */
public interface n<T> {

    public static final class a {

        /* renamed from: rf.n$a$a, reason: collision with other inner class name */
        public static final class C1423a implements j.a<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f83446a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Boolean f83447b;

            C1423a(n nVar, Boolean bool) {
                this.f83446a = nVar;
                this.f83447b = bool;
            }

            @Override // rf.j.a
            public final T a(@NotNull q reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return (T) this.f83446a.d(reader);
            }

            @Override // rf.j.a
            public final void b(@NotNull r writer, T t2) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                this.f83446a.b(writer, t2);
                Boolean bool = this.f83447b;
                if (bool != null) {
                    writer.b(bool.booleanValue());
                }
            }
        }

        @NotNull
        public static j a(@NotNull n nVar, @NotNull String name, long j11) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new j(name, 0, j11, new o(nVar), false, null, false);
        }

        @NotNull
        public static <T> j<T> c(@NotNull n<T> nVar, int i11, long j11, Boolean bool) {
            return new j<>("EXPLICIT", i11, j11, new C1423a(nVar, bool), false, null, false);
        }
    }

    @NotNull
    j a(long j11, @NotNull String str);

    void b(@NotNull r rVar, T t2);

    boolean c(@NotNull p pVar);

    T d(@NotNull q qVar);
}
