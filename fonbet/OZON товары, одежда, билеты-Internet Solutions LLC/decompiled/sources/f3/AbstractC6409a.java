package f3;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6409a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f62495a = new LinkedHashMap();

    /* renamed from: f3.a$a, reason: collision with other inner class name */
    public static final class C0988a extends AbstractC6409a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0988a f62496b = new C0988a();

        @Override // f3.AbstractC6409a
        public final <T> T a(@NotNull b<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    /* renamed from: f3.a$b */
    public interface b<T> {
    }

    public abstract <T> T a(@NotNull b<T> bVar);

    @NotNull
    public final LinkedHashMap b() {
        return this.f62495a;
    }
}
