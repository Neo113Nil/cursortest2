package td;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface g0 {

    public static final class a implements g0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f99394a = new a();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // td.g0
        @NotNull
        public final Collection<je.N> a(@NotNull je.s0 currentTypeConstructor, @NotNull Collection<? extends je.N> superTypes, @NotNull Function1<? super je.s0, ? extends Iterable<? extends je.N>> neighbors, @NotNull Function1<? super je.N, Unit> reportLoop) {
            Intrinsics.checkNotNullParameter(currentTypeConstructor, "currentTypeConstructor");
            Intrinsics.checkNotNullParameter(superTypes, "superTypes");
            Intrinsics.checkNotNullParameter(neighbors, "neighbors");
            Intrinsics.checkNotNullParameter(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    @NotNull
    Collection<je.N> a(@NotNull je.s0 s0Var, @NotNull Collection<? extends je.N> collection, @NotNull Function1<? super je.s0, ? extends Iterable<? extends je.N>> function1, @NotNull Function1<? super je.N, Unit> function12);
}
