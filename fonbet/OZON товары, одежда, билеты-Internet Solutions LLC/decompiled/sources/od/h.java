package od;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface h<M extends Member> {

    public static final class a {
        public static <M extends Member> void a(@NotNull h<? extends M> hVar, @NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            if (j.a(hVar) == args.length) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("Callable expects ");
            sb2.append(j.a(hVar));
            sb2.append(" arguments, but ");
            throw new IllegalArgumentException(K00.b.e(args.length, " were provided.", sb2));
        }
    }

    @NotNull
    List<Type> a();

    M b();

    Object call(@NotNull Object[] objArr);

    @NotNull
    Type getReturnType();
}
