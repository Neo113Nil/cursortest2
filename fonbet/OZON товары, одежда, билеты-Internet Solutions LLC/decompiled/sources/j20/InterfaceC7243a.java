package j20;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: j20.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC7243a<S> {

    /* renamed from: j20.a$a, reason: collision with other inner class name */
    public static final class C1128a {
        public static void a(@NotNull C7244b state) {
            Intrinsics.checkNotNullParameter(state, "state");
        }
    }

    boolean canParse(@NotNull C7244b c7244b);

    @NotNull
    Set<String> getSupportedPlaceholders();

    @NotNull
    long[] getSupportedVersions();

    S parse(@NotNull C7244b c7244b);
}
